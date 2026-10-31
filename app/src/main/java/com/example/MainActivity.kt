package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.ui.BottomNavTab
import com.example.ui.OverlayScreen
import com.example.ui.SmartPrepViewModel
import com.example.ui.components.SmartPrepBottomNavigation
import com.example.ui.screens.ChapterReaderOverlay
import com.example.ui.screens.HomeScreen
import com.example.ui.screens.LearnTabScreen
import com.example.ui.screens.MockTestRunnerOverlay
import com.example.ui.screens.PracticeTabScreen
import com.example.ui.screens.ProfileTabScreen
import com.example.ui.screens.PyqsTabScreen
import com.example.ui.screens.QuestionSessionOverlay
import com.example.ui.screens.SnapSolveOverlay
import com.example.ui.theme.IISERSmartPrepTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IISERSmartPrepApp()
        }
    }
}

@Composable
fun IISERSmartPrepApp() {
    val context = LocalContext.current
    val viewModel: SmartPrepViewModel = viewModel(
        factory = SmartPrepViewModel.provideFactory(context),
    )

    val uiState by viewModel.uiState.collectAsStateWithLifecycle()
    val currentTab by viewModel.currentTab.collectAsStateWithLifecycle()
    val activeOverlay by viewModel.activeOverlay.collectAsStateWithLifecycle()
    val isSnapSolving by viewModel.isSnapSolving.collectAsStateWithLifecycle()
    val snapSolveOutput by viewModel.snapSolveOutput.collectAsStateWithLifecycle()
    val notesFocusedSubject by viewModel.notesFocusedSubject.collectAsStateWithLifecycle()

    LaunchedEffect(Unit) {
        viewModel.refreshConnectivity(context)
    }

    // Handle Android back button when on non-Home bottom navigation tabs
    BackHandler(enabled = (activeOverlay == null) && (currentTab != BottomNavTab.HOME)) {
        if ((currentTab == BottomNavTab.LEARN) && (notesFocusedSubject != "All")) {
            viewModel.setNotesFocusedSubject("All")
        } else {
            viewModel.navigateToTab(BottomNavTab.HOME)
        }
    }

    IISERSmartPrepTheme(darkTheme = uiState.profile.darkModeEnabled) {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            contentWindowInsets = WindowInsets(0, 0, 0, 0),
            bottomBar = {
                if (activeOverlay == null) {
                    SmartPrepBottomNavigation(
                        currentTab = currentTab,
                        onSelectTab = { viewModel.navigateToTab(it) },
                    )
                }
            },
        ) { innerPadding ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding),
            ) {
                val overlay = activeOverlay
                if (overlay != null) {
                    when (overlay) {
                        is OverlayScreen.ChapterReader -> {
                            val (chapterId, startWithVideo) = overlay
                            val chapter = uiState.allChapters.find { it.id == chapterId }
                                ?: uiState.allChapters.firstOrNull()
                            if (chapter != null) {
                                val siblingChapters = uiState.allChapters
                                    .asSequence()
                                    .filter { it.subject.equals(chapter.subject, ignoreCase = true) }
                                    .sortedBy { it.chapterNumber }
                                    .toList()
                                val chapterQs = uiState.allQuestions
                                    .filter { it.chapterId == chapter.id }
                                    .ifEmpty {
                                        uiState.allQuestions.filter {
                                            it.subject.equals(chapter.subject, ignoreCase = true)
                                        }
                                    }
                                ChapterReaderOverlay(
                                    chapter = chapter,
                                    startWithVideo = startWithVideo,
                                    onBack = { viewModel.closeOverlay() },
                                    onMarkCompleted = { videoDone ->
                                        viewModel.markChapterCompleted(chapter, videoDone)
                                    },
                                    onPracticeChapterQuestions = {
                                        viewModel.startImportantQuestionSet(chapter)
                                    },
                                    siblingChapters = siblingChapters,
                                    onSelectSiblingChapter = { nextChapter ->
                                        viewModel.openChapter(nextChapter, startWithVideo = false)
                                    },
                                    chapterQuestions = chapterQs,
                                    onOpenAiTutor = {
                                        viewModel.openSnapSolve(chapter.subject)
                                    },
                                    onUpdateVideoUrl = { newUrl ->
                                        viewModel.updateChapterVideoUrl(chapter.id, newUrl)
                                    },
                                )
                            }
                        }

                        is OverlayScreen.QuestionSession -> {
                            val (title, subtitle, questionIds, isTimed) = overlay
                            val sessionQs = uiState.allQuestions.filter { it.id in questionIds }
                                .ifEmpty { uiState.subjectQuestions }
                            QuestionSessionOverlay(
                                title = title,
                                subtitle = subtitle,
                                questions = sessionQs,
                                isTimed = isTimed,
                                onBack = { viewModel.closeOverlay() },
                                onSubmitAnswer = { q, opt -> viewModel.submitQuestionAnswer(q, opt) },
                                onToggleBookmark = { q -> viewModel.toggleQuestionBookmark(q) },
                            )
                        }

                        is OverlayScreen.MockTestSession -> {
                            val (mockTestId) = overlay
                            val mock = uiState.mockTests.find { it.id == mockTestId }
                                ?: uiState.mockTests.firstOrNull()
                            if (mock != null) {
                                val ids = mock.questionIdsCsv.split(",").map { it.trim() }
                                val mockQs = uiState.allQuestions.filter { it.id in ids }
                                    .ifEmpty { uiState.allQuestions }
                                MockTestRunnerOverlay(
                                    mockTest = mock,
                                    questions = mockQs,
                                    onBack = { viewModel.closeOverlay() },
                                    onSubmitMockTest = { score, acc, mins ->
                                        viewModel.submitMockTest(mock.id, score, acc, mins)
                                    },
                                )
                            }
                        }

                        is OverlayScreen.SnapSolveSheet -> {
                            val (initialSubject) = overlay
                            SnapSolveOverlay(
                                initialSubject = initialSubject,
                                isSolving = isSnapSolving,
                                solutionOutput = snapSolveOutput,
                                onBack = { viewModel.closeOverlay() },
                                onSolveRequest = { text, subj, bmp ->
                                    viewModel.runSnapAndSolve(text, subj, bmp)
                                },
                            )
                        }
                    }
                } else {
                    Crossfade(targetState = currentTab, label = "tabCrossfade") { tab ->
                        when (tab) {
                            BottomNavTab.HOME -> HomeScreen(
                                state = uiState,
                                onSelectSubject = { viewModel.selectSubject(it) },
                                onSelectExamFilter = { viewModel.selectExamFilter(it) },
                                onOpenChapter = { ch, vid -> viewModel.openChapter(ch, vid) },
                                onResumePrimaryLearning = { viewModel.resumePrimaryLearning() },
                                onStartSubjectPractice = { subj, timed ->
                                    viewModel.startSubjectPractice(subj, timed)
                                },
                                onStartImportantSet = { ch -> viewModel.startImportantQuestionSet(ch) },
                                onStartPyqSession = { exam, subj ->
                                    viewModel.startPyqSession(exam, subj)
                                },
                                onOpenQuestionSession = { title, subtitle, ids, timed ->
                                    viewModel.openOverlay(
                                        OverlayScreen.QuestionSession(title, subtitle, ids, timed),
                                    )
                                },
                                onStartMockTest = { mock -> viewModel.startMockTest(mock) },
                                onOpenSnapSolve = { viewModel.openSnapSolve() },
                                onToggleStudyTask = { task -> viewModel.toggleStudyTask(task) },
                                onAddStudyTask = { t, s, type, m ->
                                    viewModel.addStudyTask(t, s, type, m)
                                },
                                onDeleteStudyTask = { id -> viewModel.deleteStudyTask(id) },
                                onNavigateToTab = { dest -> viewModel.navigateToTab(dest) },
                                onRetryNetworkCheck = { viewModel.refreshConnectivity(context) },
                                onOpenSubjectNotes = { subj -> viewModel.openSubjectNotes(subj) },
                            )

                            BottomNavTab.LEARN -> LearnTabScreen(
                                state = uiState,
                                focusedSubject = notesFocusedSubject,
                                onChangeFocusedSubject = { viewModel.setNotesFocusedSubject(it) },
                                onSelectSubject = { viewModel.selectSubject(it) },
                                onSelectExamFilter = { viewModel.selectExamFilter(it) },
                                onOpenChapter = { ch, vid -> viewModel.openChapter(ch, vid) },
                                onStartImportantSet = { ch -> viewModel.startImportantQuestionSet(ch) },
                            )

                            BottomNavTab.PRACTICE -> PracticeTabScreen(
                                state = uiState,
                                onSelectSubject = { viewModel.selectSubject(it) },
                                onSelectExamFilter = { viewModel.selectExamFilter(it) },
                                onStartSubjectPractice = { subj, timed ->
                                    viewModel.startSubjectPractice(subj, timed)
                                },
                                onOpenQuestionSession = { title, subtitle, ids, timed ->
                                    viewModel.openOverlay(
                                        OverlayScreen.QuestionSession(title, subtitle, ids, timed),
                                    )
                                },
                                onStartMockTest = { mock -> viewModel.startMockTest(mock) },
                                onToggleBookmark = { q -> viewModel.toggleQuestionBookmark(q) },
                                onResetSubjectAttempts = { subj -> viewModel.resetSubjectPractice(subj) },
                                onOpenSnapSolve = { viewModel.openSnapSolve() },
                            )

                            BottomNavTab.PYQS -> PyqsTabScreen(
                                state = uiState,
                                onOpenQuestionSession = { title, subtitle, ids, timed ->
                                    viewModel.openOverlay(
                                        OverlayScreen.QuestionSession(title, subtitle, ids, timed),
                                    )
                                },
                                onToggleBookmark = { q -> viewModel.toggleQuestionBookmark(q) },
                            )

                            BottomNavTab.PROFILE -> ProfileTabScreen(
                                state = uiState,
                                onToggleDarkMode = { viewModel.toggleDarkMode(it) },
                                onUpdateSession = { loggedIn, name, email, exam ->
                                    viewModel.updateProfileSession(loggedIn, name, email, exam)
                                },
                                onUpdateSubscription = { tier -> viewModel.updateSubscriptionTier(tier) },
                            )
                        }
                    }
                }
            }
        }
    }
}
