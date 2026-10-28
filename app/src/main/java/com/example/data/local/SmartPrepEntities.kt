package com.example.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable

@Serializable
@Entity(tableName = "user_profile")
data class UserProfileEntity(
    @PrimaryKey val id: Int = 1,
    val fullName: String = "Aarav Sharma",
    val email: String = "aarav.iat2027@iiserprep.edu.in",
    val targetExam: String = "IISER IAT",
    val targetYear: Int = 2027,
    val selectedSubject: String = "Mathematics",
    val selectedExamFilter: String = "All",
    val subscriptionTier: String = "SmartPrep Pro",
    val streakDays: Int = 6,
    val xpPoints: Int = 1420,
    val darkModeEnabled: Boolean = false,
    val isLoggedIn: Boolean = true
)

@Serializable
@Entity(tableName = "chapters")
data class ChapterEntity(
    @PrimaryKey val id: String,
    val subject: String, // "Mathematics", "Physics", "Chemistry", "Biology"
    val examTag: String, // "IISER IAT"
    val chapterNumber: Int,
    val title: String,
    val subtitle: String,
    val totalLessons: Int,
    val completedLessons: Int,
    val studyNotesCount: Int,
    val practiceQuestionCount: Int,
    val durationMinutes: Int,
    val formulaHighlight: String,
    val keyConceptsSummary: String,
    val detailedStudyNotes: String,
    val videoTitle: String,
    val videoDurationLabel: String,
    val videoInstructor: String,
    val videoKeyTakeaways: String,
    val isVideoCompleted: Boolean = false,
    val lastAccessedTimestamp: Long = 0L
) {
    val progressFraction: Float
        get() = if (totalLessons > 0) (completedLessons.toFloat() / totalLessons.toFloat()).coerceIn(0f, 1f) else 0f

    val isCompleted: Boolean
        get() = completedLessons >= totalLessons && totalLessons > 0
}

@Serializable
@Entity(tableName = "questions")
data class QuestionEntity(
    @PrimaryKey val id: String,
    val chapterId: String,
    val subject: String,
    val topic: String,
    val examSource: String, // "IISER IAT"
    val examYear: Int?, // non-null for PYQs (e.g., 2025, 2024, 2023, 2022), null for Important/Practice
    val isImportantQuestion: Boolean,
    val isPyq: Boolean,
    val difficulty: String, // "Conceptual", "Analytical", "Research-Level"
    val estimatedSeconds: Int,
    val prompt: String,
    val optionA: String,
    val optionB: String,
    val optionC: String,
    val optionD: String,
    val correctOptionIndex: Int, // 0..3
    val stepByStepExplanation: String,
    val userSelectedOption: Int? = null,
    val isBookmarked: Boolean = false,
    val attemptedAtTimestamp: Long = 0L
) {
    val options: List<String>
        get() = listOf(optionA, optionB, optionC, optionD)

    val isAttempted: Boolean
        get() = userSelectedOption != null

    val isCorrect: Boolean
        get() = userSelectedOption != null && userSelectedOption == correctOptionIndex
}

@Serializable
@Entity(tableName = "mock_tests")
data class MockTestEntity(
    @PrimaryKey val id: String,
    val title: String,
    val examType: String, // "IISER IAT"
    val subjectCoverage: String,
    val questionCount: Int,
    val durationMinutes: Int,
    val maxMarks: Int,
    val positiveMarks: Int,
    val negativeMarks: Int,
    val status: String, // "Not Started", "Completed"
    val latestScore: Int? = null,
    val accuracyPercent: Int? = null,
    val timeTakenMinutes: Int? = null,
    val questionIdsCsv: String,
    val lastAttemptTimestamp: Long = 0L
)

@Serializable
@Entity(tableName = "study_plan_tasks")
data class StudyPlanTaskEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val title: String,
    val subject: String,
    val activityType: String, // "Concept Lesson", "Important Set", "PYQ Drill", "Video Lecture", "Mock Review"
    val durationMinutes: Int,
    val isCompleted: Boolean = false,
    val linkedChapterId: String? = null
)
