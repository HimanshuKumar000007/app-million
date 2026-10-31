package com.example.data.repository

import android.graphics.Bitmap
import com.example.data.local.ChapterEntity
import com.example.data.local.MockTestEntity
import com.example.data.local.QuestionEntity
import com.example.data.local.SmartPrepDao
import com.example.data.local.SmartPrepSeedData
import com.example.data.local.StudyPlanTaskEntity
import com.example.data.local.UserProfileEntity
import com.example.data.remote.GeminiSnapSolveClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext

class SmartPrepRepository(private val dao: SmartPrepDao) {

    val userProfile: Flow<UserProfileEntity?> = dao.observeUserProfile()
    val allChapters: Flow<List<ChapterEntity>> = dao.observeAllChapters()
    val allQuestions: Flow<List<QuestionEntity>> = dao.observeAllQuestions()
    val allMockTests: Flow<List<MockTestEntity>> = dao.observeAllMockTests()
    val studyPlanTasks: Flow<List<StudyPlanTaskEntity>> = dao.observeStudyPlanTasks()

    suspend fun ensureSeeded() = withContext(Dispatchers.IO) {
        if (dao.getUserProfileOnce() == null) {
            dao.upsertUserProfile(SmartPrepSeedData.initialProfile)
        }
        if (dao.getChapterCount() < SmartPrepSeedData.initialChapters.size) {
            dao.insertChapters(SmartPrepSeedData.initialChapters)
            dao.insertQuestions(SmartPrepSeedData.initialQuestions)
            dao.insertMockTests(SmartPrepSeedData.initialMockTests)
            dao.insertStudyPlanTasks(SmartPrepSeedData.initialStudyPlanTasks)
        } else {
            // Refresh seed CONTENT on every launch so updated notes and questions
            // reach existing installs. Content-only updates: learner progress
            // (completedLessons, attempts, bookmarks) is never touched.
            SmartPrepSeedData.initialChapters.forEach { ch ->
                dao.updateChapterContent(ch.id, ch.subtitle, ch.studyNotesCount, ch.practiceQuestionCount, ch.durationMinutes, ch.formulaHighlight, ch.keyConceptsSummary, ch.detailedStudyNotes)
                if (ch.videoUrl.isNotBlank()) {
                    dao.updateChapterVideo(ch.id, ch.videoTitle, ch.videoDurationLabel, ch.videoInstructor, ch.videoKeyTakeaways, ch.videoUrl)
                }
            }
            SmartPrepSeedData.initialQuestions.forEach { q ->
                dao.updateQuestionContent(q.id, q.topic, q.difficulty, q.estimatedSeconds, q.prompt, q.optionA, q.optionB, q.optionC, q.optionD, q.correctOptionIndex, q.stepByStepExplanation)
            }
            val existingQuestionIds = dao.getAllQuestionIds().toSet()
            val newQuestions = SmartPrepSeedData.initialQuestions.filter { it.id !in existingQuestionIds }
            if (newQuestions.isNotEmpty()) {
                dao.insertQuestions(newQuestions)
            }
            if (dao.getMockTestCount() < SmartPrepSeedData.initialMockTests.size) {
                dao.insertMockTests(SmartPrepSeedData.initialMockTests)
            }
        }
    }

    suspend fun selectSubject(subject: String) {
        dao.updateSelectedSubject(subject)
    }

    suspend fun updateChapterVideo(id: String, videoTitle: String, videoDurationLabel: String, videoInstructor: String, videoKeyTakeaways: String, videoUrl: String) = withContext(Dispatchers.IO) {
        dao.updateChapterVideo(id, videoTitle, videoDurationLabel, videoInstructor, videoKeyTakeaways, videoUrl)
    }

    suspend fun selectExamFilter(examFilter: String) {
        dao.updateSelectedExamFilter(examFilter)
    }

    suspend fun toggleDarkMode(enabled: Boolean) {
        dao.updateDarkMode(enabled)
    }

    suspend fun updateAuthSession(isLoggedIn: Boolean, name: String, email: String, targetExam: String) {
        dao.updateAuthSession(isLoggedIn, name, email, targetExam)
    }

    suspend fun updateSubscriptionTier(tier: String) {
        dao.updateSubscriptionTier(tier)
    }

    suspend fun markChapterLessonCompleted(chapter: ChapterEntity, markVideoDone: Boolean = false) {
        val nextCompleted = (chapter.completedLessons + 1).coerceAtMost(chapter.totalLessons)
        val videoState = chapter.isVideoCompleted || markVideoDone
        dao.updateChapterProgress(
            chapterId = chapter.id,
            completedLessons = nextCompleted,
            videoCompleted = videoState,
            timestamp = System.currentTimeMillis()
        )
        dao.addXpPoints(25)
    }

    suspend fun touchChapterAccess(chapter: ChapterEntity) {
        dao.updateChapterProgress(
            chapterId = chapter.id,
            completedLessons = chapter.completedLessons,
            videoCompleted = chapter.isVideoCompleted,
            timestamp = System.currentTimeMillis()
        )
    }

    suspend fun submitQuestionAttempt(question: QuestionEntity, selectedOptionIndex: Int) {
        dao.recordQuestionAttempt(
            questionId = question.id,
            selectedOption = selectedOptionIndex,
            timestamp = System.currentTimeMillis()
        )
        if (selectedOptionIndex == question.correctOptionIndex) {
            dao.addXpPoints(15)
        } else {
            dao.addXpPoints(5)
        }
    }

    suspend fun toggleBookmark(question: QuestionEntity) {
        dao.updateQuestionBookmark(question.id, !question.isBookmarked)
    }

    suspend fun resetSubjectAttempts(subject: String) {
        dao.resetSubjectQuestionAttempts(subject)
    }

    suspend fun recordMockTestSubmission(
        testId: String,
        score: Int,
        accuracyPercent: Int,
        timeTakenMinutes: Int
    ) {
        dao.completeMockTest(
            testId = testId,
            score = score,
            accuracy = accuracyPercent,
            timeTaken = timeTakenMinutes,
            timestamp = System.currentTimeMillis()
        )
        dao.addXpPoints(100)
    }

    suspend fun toggleStudyPlanTask(task: StudyPlanTaskEntity) {
        val nextState = !task.isCompleted
        dao.setStudyPlanTaskCompleted(task.id, nextState)
        if (nextState) {
            dao.addXpPoints(20)
        }
    }

    suspend fun addStudyPlanTask(title: String, subject: String, activityType: String, durationMinutes: Int) {
        dao.insertStudyPlanTask(
            StudyPlanTaskEntity(
                title = title,
                subject = subject,
                activityType = activityType,
                durationMinutes = durationMinutes,
                isCompleted = false
            )
        )
    }

    suspend fun deleteStudyPlanTask(taskId: Int) {
        dao.deleteStudyPlanTask(taskId)
    }

    suspend fun solveWithSnapAi(
        questionText: String,
        subjectHint: String,
        bitmap: Bitmap?
    ): Result<String> {
        val result = GeminiSnapSolveClient.solveScienceProblem(questionText, subjectHint, bitmap)
        if (result.isSuccess) {
            dao.addXpPoints(10)
        }
        return result
    }
}
