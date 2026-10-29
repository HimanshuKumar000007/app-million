package com.example.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface SmartPrepDao {
    // --- User Profile ---
    @Query("SELECT * FROM user_profile WHERE id = 1")
    fun observeUserProfile(): Flow<UserProfileEntity?>

    @Query("SELECT * FROM user_profile WHERE id = 1")
    suspend fun getUserProfileOnce(): UserProfileEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsertUserProfile(profile: UserProfileEntity)

    @Query("UPDATE user_profile SET selectedSubject = :subject WHERE id = 1")
    suspend fun updateSelectedSubject(subject: String)

    @Query("UPDATE user_profile SET selectedExamFilter = :examFilter WHERE id = 1")
    suspend fun updateSelectedExamFilter(examFilter: String)

    @Query("UPDATE user_profile SET darkModeEnabled = :enabled WHERE id = 1")
    suspend fun updateDarkMode(enabled: Boolean)

    @Query("UPDATE user_profile SET isLoggedIn = :isLoggedIn, fullName = :name, email = :email, targetExam = :targetExam WHERE id = 1")
    suspend fun updateAuthSession(isLoggedIn: Boolean, name: String, email: String, targetExam: String)

    @Query("UPDATE user_profile SET subscriptionTier = :tier WHERE id = 1")
    suspend fun updateSubscriptionTier(tier: String)

    @Query("UPDATE user_profile SET xpPoints = xpPoints + :deltaXp WHERE id = 1")
    suspend fun addXpPoints(deltaXp: Int)

    // --- Chapters ---
    @Query("SELECT * FROM chapters ORDER BY subject ASC, chapterNumber ASC")
    fun observeAllChapters(): Flow<List<ChapterEntity>>

    @Query("SELECT COUNT(*) FROM chapters")
    suspend fun getChapterCount(): Int

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertChapters(chapters: List<ChapterEntity>)

    @Update
    suspend fun updateChapter(chapter: ChapterEntity)

    @Query("UPDATE chapters SET subtitle = :subtitle, studyNotesCount = :studyNotesCount, practiceQuestionCount = :practiceQuestionCount, durationMinutes = :durationMinutes, formulaHighlight = :formulaHighlight, keyConceptsSummary = :keyConceptsSummary, detailedStudyNotes = :detailedStudyNotes WHERE id = :id")
    suspend fun updateChapterContent(id: String, subtitle: String, studyNotesCount: Int, practiceQuestionCount: Int, durationMinutes: Int, formulaHighlight: String, keyConceptsSummary: String, detailedStudyNotes: String)

    @Query("UPDATE questions SET topic = :topic, difficulty = :difficulty, estimatedSeconds = :estimatedSeconds, prompt = :prompt, optionA = :optionA, optionB = :optionB, optionC = :optionC, optionD = :optionD, correctOptionIndex = :correctOptionIndex, stepByStepExplanation = :stepByStepExplanation WHERE id = :id")
    suspend fun updateQuestionContent(id: String, topic: String, difficulty: String, estimatedSeconds: Int, prompt: String, optionA: String, optionB: String, optionC: String, optionD: String, correctOptionIndex: Int, stepByStepExplanation: String)

    @Query("SELECT id FROM questions")
    suspend fun getAllQuestionIds(): List<String>

    @Query("UPDATE chapters SET completedLessons = :completedLessons, isVideoCompleted = :videoCompleted, lastAccessedTimestamp = :timestamp WHERE id = :chapterId")
    suspend fun updateChapterProgress(
        chapterId: String,
        completedLessons: Int,
        videoCompleted: Boolean,
        timestamp: Long
    )

    // --- Questions (Important Sets, Practice, PYQs) ---
    @Query("SELECT * FROM questions ORDER BY id ASC")
    fun observeAllQuestions(): Flow<List<QuestionEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertQuestions(questions: List<QuestionEntity>)

    @Query("UPDATE questions SET userSelectedOption = :selectedOption, attemptedAtTimestamp = :timestamp WHERE id = :questionId")
    suspend fun recordQuestionAttempt(questionId: String, selectedOption: Int?, timestamp: Long)

    @Query("UPDATE questions SET isBookmarked = :bookmarked WHERE id = :questionId")
    suspend fun updateQuestionBookmark(questionId: String, bookmarked: Boolean)

    @Query("UPDATE questions SET userSelectedOption = NULL, attemptedAtTimestamp = 0 WHERE subject = :subject")
    suspend fun resetSubjectQuestionAttempts(subject: String)

    // --- Mock Tests ---
    @Query("SELECT * FROM mock_tests ORDER BY id ASC")
    fun observeAllMockTests(): Flow<List<MockTestEntity>>

    @Query("SELECT COUNT(*) FROM mock_tests")
    suspend fun getMockTestCount(): Int

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMockTests(mockTests: List<MockTestEntity>)

    @Query("UPDATE mock_tests SET status = 'Completed', latestScore = :score, accuracyPercent = :accuracy, timeTakenMinutes = :timeTaken, lastAttemptTimestamp = :timestamp WHERE id = :testId")
    suspend fun completeMockTest(
        testId: String,
        score: Int,
        accuracy: Int,
        timeTaken: Int,
        timestamp: Long
    )

    // --- Daily Study Plan ---
    @Query("SELECT * FROM study_plan_tasks ORDER BY isCompleted ASC, id ASC")
    fun observeStudyPlanTasks(): Flow<List<StudyPlanTaskEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStudyPlanTasks(tasks: List<StudyPlanTaskEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStudyPlanTask(task: StudyPlanTaskEntity)

    @Query("UPDATE study_plan_tasks SET isCompleted = :completed WHERE id = :taskId")
    suspend fun setStudyPlanTaskCompleted(taskId: Int, completed: Boolean)

    @Query("DELETE FROM study_plan_tasks WHERE id = :taskId")
    suspend fun deleteStudyPlanTask(taskId: Int)
}
