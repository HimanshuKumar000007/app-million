package com.example.ui

import android.content.Context
import android.graphics.Bitmap
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.data.local.ChapterEntity
import com.example.data.local.MockTestEntity
import com.example.data.local.QuestionEntity
import com.example.data.local.SmartPrepDatabase
import com.example.data.local.StudyPlanTaskEntity
import com.example.data.local.UserProfileEntity
import com.example.data.repository.SmartPrepRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

enum class BottomNavTab(val route: String, val label: String) {
    HOME("home", "Home"),
    LEARN("learn", "Notes"),
    PRACTICE("practice", "Mocks"),
    PYQS("pyqs", "PYQs"),
    PROFILE("profile", "Profile")
}

sealed interface OverlayScreen {
    data class ChapterReader(val chapterId: String, val startWithVideo: Boolean = false) : OverlayScreen
    data class QuestionSession(
        val title: String,
        val subtitle: String,
        val questionIds: List<String>,
        val isTimed: Boolean = false
    ) : OverlayScreen
    data class MockTestSession(val mockTestId: String) : OverlayScreen
    data class SnapSolveSheet(val initialSubject: String) : OverlayScreen
}

data class SmartPrepUiState(
    val isInitialLoading: Boolean = true,
    val isOffline: Boolean = false,
    val profile: UserProfileEntity = UserProfileEntity(),
    val selectedSubject: String = "All",
    val selectedExamFilter: String = "All",
    val allChapters: List<ChapterEntity> = emptyList(),
    val subjectChapters: List<ChapterEntity> = emptyList(),
    val continueLearningChapters: List<ChapterEntity> = emptyList(),
    val allQuestions: List<QuestionEntity> = emptyList(),
    val subjectQuestions: List<QuestionEntity> = emptyList(),
    val importantQuestions: List<QuestionEntity> = emptyList(),
    val pyqQuestions: List<QuestionEntity> = emptyList(),
    val mockTests: List<MockTestEntity> = emptyList(),
    val studyPlanTasks: List<StudyPlanTaskEntity> = emptyList(),
    val errorMessage: String? = null
) {
    val hasAnyLearningProgress: Boolean
        get() = allChapters.any { it.completedLessons > 0 } || allQuestions.any { it.isAttempted }

    val overallMasteryPercent: Int
        get() {
            if (allChapters.isEmpty()) return 0
            val totalL = allChapters.sumOf { it.totalLessons }.coerceAtLeast(1)
            val compL = allChapters.sumOf { it.completedLessons }
            return ((compL * 100f) / totalL).toInt().coerceIn(0, 100)
        }
}

class SmartPrepViewModel(
    private val repository: SmartPrepRepository
) : ViewModel() {

    private val _currentTab = MutableStateFlow(BottomNavTab.HOME)
    val currentTab: StateFlow<BottomNavTab> = _currentTab.asStateFlow()

    private val _activeOverlay = MutableStateFlow<OverlayScreen?>(null)
    val activeOverlay: StateFlow<OverlayScreen?> = _activeOverlay.asStateFlow()

    private val _isOffline = MutableStateFlow(false)
    private val _errorMessage = MutableStateFlow<String?>(null)

    // Snap & Solve AI state
    private val _isSnapSolving = MutableStateFlow(false)
    val isSnapSolving: StateFlow<Boolean> = _isSnapSolving.asStateFlow()

    private val _snapSolveOutput = MutableStateFlow<String?>(null)
    val snapSolveOutput: StateFlow<String?> = _snapSolveOutput.asStateFlow()

    // Focused subject in the Notes (Learn) tab ("All", "Physics", "Chemistry", "Mathematics", "Biology")
    private val _notesFocusedSubject = MutableStateFlow("All")
    val notesFocusedSubject: StateFlow<String> = _notesFocusedSubject.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                repository.ensureSeeded()
            } catch (e: Exception) {
                _errorMessage.value = e.localizedMessage ?: "Failed to initialize local study database."
            }
        }
    }

    val uiState: StateFlow<SmartPrepUiState> = combine(
        repository.userProfile,
        repository.allChapters,
        repository.allQuestions,
        repository.allMockTests,
        repository.studyPlanTasks
    ) { profile, chapters, questions, mocks, tasks ->
        val safeProfile = profile ?: UserProfileEntity()
        val subject = safeProfile.selectedSubject
        val examFilter = safeProfile.selectedExamFilter

        val filteredChapters = chapters.filter { ch ->
            (subject.equals("All", ignoreCase = true) || ch.subject.equals(subject, ignoreCase = true)) &&
                (examFilter == "All" || ch.examTag.contains(examFilter, ignoreCase = true) || ch.examTag.contains("IAT", ignoreCase = true))
        }

        val unfinishedChapters = chapters
            .filter { it.completedLessons in 1 until it.totalLessons }
            .sortedByDescending { it.lastAccessedTimestamp }

        val subjectQs = questions.filter { q ->
            (subject.equals("All", ignoreCase = true) || q.subject.equals(subject, ignoreCase = true)) &&
                (examFilter == "All" || q.examSource.contains(examFilter, ignoreCase = true))
        }

        val importantQs = subjectQs.filter { it.isImportantQuestion }
        val pyqQs = questions.filter { q ->
            q.isPyq &&
                (examFilter == "All" || q.examSource.contains(examFilter, ignoreCase = true))
        }.sortedByDescending { it.examYear ?: 0 }

        SmartPrepUiState(
            isInitialLoading = chapters.isEmpty(),
            isOffline = _isOffline.value,
            profile = safeProfile,
            selectedSubject = subject,
            selectedExamFilter = examFilter,
            allChapters = chapters,
            subjectChapters = filteredChapters,
            continueLearningChapters = unfinishedChapters,
            allQuestions = questions,
            subjectQuestions = subjectQs,
            importantQuestions = importantQs,
            pyqQuestions = pyqQs,
            mockTests = mocks,
            studyPlanTasks = tasks,
            errorMessage = _errorMessage.value
        )
    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5_000),
        initialValue = SmartPrepUiState(isInitialLoading = true)
    )

    fun refreshConnectivity(context: Context) {
        val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as? ConnectivityManager
        val net = cm?.activeNetwork
        val caps = cm?.getNetworkCapabilities(net)
        val connected = caps?.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET) == true
        _isOffline.value = !connected
    }

    fun navigateToTab(tab: BottomNavTab) {
        _activeOverlay.value = null
        _currentTab.value = tab
    }

    fun setNotesFocusedSubject(subject: String) {
        _notesFocusedSubject.value = subject
    }

    fun openSubjectNotes(subject: String) {
        _notesFocusedSubject.value = subject
        _activeOverlay.value = null
        _currentTab.value = BottomNavTab.LEARN
    }

    fun openOverlay(overlay: OverlayScreen) {
        _activeOverlay.value = overlay
    }

    fun closeOverlay() {
        _activeOverlay.value = null
    }

    fun selectSubject(subject: String) {
        viewModelScope.launch {
            repository.selectSubject(subject)
        }
    }

    fun selectExamFilter(examFilter: String) {
        viewModelScope.launch {
            repository.selectExamFilter(examFilter)
        }
    }

    fun openChapter(chapter: ChapterEntity, startWithVideo: Boolean = false) {
        viewModelScope.launch {
            repository.touchChapterAccess(chapter)
            _activeOverlay.value = OverlayScreen.ChapterReader(
                chapterId = chapter.id,
                startWithVideo = startWithVideo
            )
        }
    }

    fun resumePrimaryLearning() {
        val state = uiState.value
        val targetChapter = state.continueLearningChapters.firstOrNull()
            ?: state.subjectChapters.firstOrNull()
            ?: state.allChapters.firstOrNull()
        if (targetChapter != null) {
            openChapter(targetChapter, startWithVideo = false)
        }
    }

    fun startSubjectPractice(subject: String = uiState.value.selectedSubject, isTimed: Boolean = false) {
        val questions = uiState.value.allQuestions.filter {
            it.subject.equals(subject, ignoreCase = true)
        }
        if (questions.isNotEmpty()) {
            _activeOverlay.value = OverlayScreen.QuestionSession(
                title = "$subject Practice Set",
                subtitle = "${questions.size} Analytical & PYQ Problems",
                questionIds = questions.map { it.id },
                isTimed = isTimed
            )
        }
    }

    fun startImportantQuestionSet(chapter: ChapterEntity) {
        val chapterQuestions = uiState.value.allQuestions.filter { it.chapterId == chapter.id }
        val pool = if (chapterQuestions.isNotEmpty()) chapterQuestions else uiState.value.subjectQuestions
        if (pool.isNotEmpty()) {
            _activeOverlay.value = OverlayScreen.QuestionSession(
                title = "Important Questions: ${chapter.title}",
                subtitle = "${chapter.subject} • High-Yield IISER IAT Problems",
                questionIds = pool.map { it.id },
                isTimed = false
            )
        }
    }

    fun startPyqSession(examFilter: String = "All", subjectFilter: String = "All") {
        val pool = uiState.value.allQuestions.filter { q ->
            q.isPyq &&
                (examFilter == "All" || q.examSource.contains(examFilter, ignoreCase = true)) &&
                (subjectFilter == "All" || q.subject.equals(subjectFilter, ignoreCase = true))
        }
        if (pool.isNotEmpty()) {
            _activeOverlay.value = OverlayScreen.QuestionSession(
                title = "Previous-Year Questions ($examFilter)",
                subtitle = "${pool.size} Authentic IISER IAT Archive Questions",
                questionIds = pool.map { it.id },
                isTimed = true
            )
        }
    }

    fun startMockTest(mockTest: MockTestEntity) {
        _activeOverlay.value = OverlayScreen.MockTestSession(mockTest.id)
    }

    fun openSnapSolve(initialSubject: String = uiState.value.selectedSubject) {
        _snapSolveOutput.value = null
        _activeOverlay.value = OverlayScreen.SnapSolveSheet(initialSubject)
    }

    fun markChapterCompleted(chapter: ChapterEntity, markVideoDone: Boolean = false) {
        viewModelScope.launch {
            repository.markChapterLessonCompleted(chapter, markVideoDone)
        }
    }

    fun updateChapterVideoUrl(chapterId: String, newUrl: String) {
        viewModelScope.launch {
            val chapter = uiState.value.allChapters.find { it.id == chapterId } ?: return@launch
            repository.updateChapterVideo(
                id = chapterId,
                videoTitle = chapter.videoTitle,
                videoDurationLabel = chapter.videoDurationLabel,
                videoInstructor = chapter.videoInstructor,
                videoKeyTakeaways = chapter.videoKeyTakeaways,
                videoUrl = newUrl.trim()
            )
        }
    }

    fun submitQuestionAnswer(question: QuestionEntity, optionIndex: Int) {
        viewModelScope.launch {
            repository.submitQuestionAttempt(question, optionIndex)
        }
    }

    fun toggleQuestionBookmark(question: QuestionEntity) {
        viewModelScope.launch {
            repository.toggleBookmark(question)
        }
    }

    fun resetSubjectPractice(subject: String) {
        viewModelScope.launch {
            repository.resetSubjectAttempts(subject)
        }
    }

    fun submitMockTest(testId: String, score: Int, accuracyPercent: Int, timeTakenMinutes: Int) {
        viewModelScope.launch {
            repository.recordMockTestSubmission(testId, score, accuracyPercent, timeTakenMinutes)
        }
    }

    fun toggleStudyTask(task: StudyPlanTaskEntity) {
        viewModelScope.launch {
            repository.toggleStudyPlanTask(task)
        }
    }

    fun addStudyTask(title: String, subject: String, activityType: String, durationMinutes: Int) {
        viewModelScope.launch {
            repository.addStudyPlanTask(title, subject, activityType, durationMinutes)
        }
    }

    fun deleteStudyTask(taskId: Int) {
        viewModelScope.launch {
            repository.deleteStudyPlanTask(taskId)
        }
    }

    fun toggleDarkMode(enabled: Boolean) {
        viewModelScope.launch {
            repository.toggleDarkMode(enabled)
        }
    }

    fun updateProfileSession(isLoggedIn: Boolean, name: String, email: String, targetExam: String) {
        viewModelScope.launch {
            repository.updateAuthSession(isLoggedIn, name, email, targetExam)
        }
    }

    fun updateSubscriptionTier(tier: String) {
        viewModelScope.launch {
            repository.updateSubscriptionTier(tier)
        }
    }

    fun runSnapAndSolve(questionText: String, subjectHint: String, bitmap: Bitmap?) {
        viewModelScope.launch {
            _isSnapSolving.value = true
            _snapSolveOutput.value = null
            val res = repository.solveWithSnapAi(questionText, subjectHint, bitmap)
            _snapSolveOutput.value = res.getOrDefault("Unable to analyze the problem right now. Please try again.")
            _isSnapSolving.value = false
        }
    }

    companion object {
        fun provideFactory(context: Context): ViewModelProvider.Factory {
            return object : ViewModelProvider.Factory {
                @Suppress("UNCHECKED_CAST")
                override fun <T : ViewModel> create(modelClass: Class<T>): T {
                    val db = SmartPrepDatabase.getInstance(context)
                    val repo = SmartPrepRepository(db.smartPrepDao())
                    return SmartPrepViewModel(repo) as T
                }
            }
        }
    }
}
