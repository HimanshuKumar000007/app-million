package com.example.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.Quiz
import androidx.compose.material.icons.filled.Shuffle
import androidx.compose.material.icons.filled.Timer
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.R
import com.example.ui.theme.InterFontFamily
import kotlinx.coroutines.launch
import com.example.data.local.ChapterEntity
import com.example.data.local.MockTestEntity
import com.example.data.local.QuestionEntity
import com.example.ui.BottomNavTab
import com.example.ui.SmartPrepUiState
import com.example.ui.components.AppHeader
import com.example.ui.components.BookCard
import com.example.ui.components.CarouselPagerIndicator
import com.example.ui.components.ContinueLearningCard
import com.example.ui.components.EmptyStateCard
import com.example.ui.components.HeroSection
import com.example.ui.components.LoadingSkeleton
import com.example.ui.components.MockTestCard
import com.example.ui.components.OfflineBanner
import com.example.ui.components.SectionHeader
import com.example.ui.components.StudyPlanItemRow
import com.example.ui.components.SubjectSelector
import com.example.ui.components.VideoLessonCard
import com.example.ui.components.MobileKpiOverviewGrid
import com.example.ui.components.MobileReadinessAndWeakAreaCard
import com.example.ui.components.QuickActionsBentoSection
import com.example.ui.components.DailyPyqAndFormulaHubSection
import com.example.ui.components.CbtMockArenaBentoSection
import com.example.ui.components.RefinedStudyTargetsSection
import com.example.ui.components.HomePerformanceTrendBentoSection
import com.example.ui.components.SmartPrepBrandWatermarkFooter
import com.example.ui.components.subjectAccentColor
import com.example.ui.theme.AccentYellow
import com.example.ui.theme.CardBackground
import com.example.ui.theme.CharcoalSelected
import com.example.ui.theme.DeepIndigo
import com.example.ui.theme.ElectricPurple
import com.example.ui.theme.HeroBottomBlue
import com.example.ui.theme.HeroMidBlue
import com.example.ui.theme.HeroTopBlue
import com.example.ui.theme.PrimaryBlue
import com.example.ui.theme.PrimaryText
import com.example.ui.theme.SecondaryText
import com.example.ui.theme.SoftLavender
import com.example.ui.theme.SuccessGreen

@Composable
fun HomeScreen(
    state: SmartPrepUiState,
    onSelectSubject: (String) -> Unit,
    onSelectExamFilter: (String) -> Unit,
    onOpenChapter: (ChapterEntity, Boolean) -> Unit,
    onResumePrimaryLearning: () -> Unit,
    onStartSubjectPractice: (String, Boolean) -> Unit,
    onStartImportantSet: (ChapterEntity) -> Unit,
    onStartPyqSession: (String, String) -> Unit,
    onOpenQuestionSession: (String, String, List<String>, Boolean) -> Unit,
    onStartMockTest: (MockTestEntity) -> Unit,
    onOpenSnapSolve: () -> Unit,
    onToggleStudyTask: (com.example.data.local.StudyPlanTaskEntity) -> Unit,
    onAddStudyTask: (String, String, String, Int) -> Unit,
    onDeleteStudyTask: (Int) -> Unit,
    onNavigateToTab: (BottomNavTab) -> Unit,
    onRetryNetworkCheck: () -> Unit,
    onOpenSubjectNotes: (String) -> Unit = { subj ->
        onSelectSubject(subj)
        onNavigateToTab(BottomNavTab.LEARN)
    },
    modifier: Modifier = Modifier
) {
    var showNotificationsDialog by remember { mutableStateOf(false) }
    var showAddStudyTaskDialog by remember { mutableStateOf(false) }

    val nextChapter = state.continueLearningChapters.firstOrNull()
        ?: state.subjectChapters.firstOrNull()
        ?: state.allChapters.firstOrNull()

    val bookCarouselState = rememberLazyListState()
    val activeBookIndex by remember {
        derivedStateOf { bookCarouselState.firstVisibleItemIndex }
    }

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .testTag("home_lazy_column"),
        contentPadding = PaddingValues(bottom = 104.dp)
    ) {
        // ==================== 1. PERIWINKLE-BLUE HERO & HEADER (Reference Screenshot Top Half) ====================
        item(key = "hero_header_block") {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                HeroTopBlue,
                                HeroMidBlue,
                                HeroBottomBlue
                            )
                        )
                    )
                    .windowInsetsPadding(WindowInsets.statusBars)
            ) {
                Column(modifier = Modifier.fillMaxWidth()) {
                    // A. Top Header: 5-bar prism logo + "smartprep" on left, circular profile icon on right
                    AppHeader(
                        userName = state.profile.fullName,
                        streakDays = state.profile.streakDays,
                        xpPoints = state.profile.xpPoints,
                        onProfileClick = { onNavigateToTab(BottomNavTab.PROFILE) },
                        onNotificationClick = { showNotificationsDialog = true }
                    )

                    // B. Centerpiece 3D Fanned Document Scanner + "ASK & SOLVE | AI |||||" Pill
                    HeroSection(
                        hasProgress = state.hasAnyLearningProgress,
                        overallMasteryPercent = state.overallMasteryPercent,
                        nextChapterTitle = nextChapter?.title ?: "Sequences, Series & Convergence",
                        onPrimaryCtaClick = onResumePrimaryLearning,
                        onPracticeCtaClick = {
                            onStartSubjectPractice(state.selectedSubject, false)
                        },
                        onSnapSolveClick = onOpenSnapSolve
                    )

                    Spacer(modifier = Modifier.height(14.dp))

                    // C. Seamless 28.dp Rounded White Sheet Top Cap
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(18.dp)
                            .clip(RoundedCornerShape(topStart = 28.dp, topEnd = 28.dp))
                            .background(MaterialTheme.colorScheme.background)
                    )
                }
            }
        }

        // ==================== 2. QUICK ACTIONS BENTO SHEET ====================
        item(key = "white_panel_top_transition") {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.background)
                    .padding(top = 2.dp, bottom = 22.dp)
            ) {
                OfflineBanner(
                    isOffline = state.isOffline,
                    onRetryClick = onRetryNetworkCheck
                )

                if (state.isInitialLoading) {
                    LoadingSkeleton()
                } else {
                    val priorityChapter = state.subjectChapters.firstOrNull() ?: nextChapter
                    QuickActionsBentoSection(
                        onAiChatClick = onOpenSnapSolve,
                        onContinueLearningClick = {
                            if (priorityChapter != null) {
                                onOpenChapter(priorityChapter, false)
                            } else {
                                onResumePrimaryLearning()
                            }
                        },
                        onRoadmapClick = { onNavigateToTab(BottomNavTab.LEARN) },
                        onStartMockTestClick = {
                            onNavigateToTab(BottomNavTab.PRACTICE)
                        },
                        onQuickMockClick = { onStartSubjectPractice(state.selectedSubject, true) }
                    )
                }
            }
        }

        if (!state.isInitialLoading) {

            // ==================== 4. SMART NOTES — 4 SUBJECT SECTIONS (PHYSICS, CHEMISTRY, MATHEMATICS, BIOLOGY) ====================
            item(key = "smart_learning_library") {
                val coroutineScope = rememberCoroutineScope()
                val pcmbSubjects = listOf("Physics", "Chemistry", "Mathematics", "Biology")

                Column(modifier = Modifier.fillMaxWidth()) {
                    SectionHeader(
                        title = "Smart Notes",
                        subtitle = "Formula sheets, derivations & revision vault",
                        actionLabel = "All Notes",
                        onActionClick = {
                            onOpenSubjectNotes("All")
                        }
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    // Compact 4-Subject Pill Bar (Phy • Che • Math • Bio) synced with the 4-Card Carousel
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        pcmbSubjects.forEachIndexed { index, subject ->
                            val isActive = activeBookIndex == index || state.selectedSubject.equals(subject, ignoreCase = true)
                            val accent = subjectAccentColor(subject)
                            val shortLabel = when (subject) {
                                "Physics" -> "Physics"
                                "Chemistry" -> "Chemistry"
                                "Mathematics" -> "Maths"
                                "Biology" -> "Biology"
                                else -> subject
                            }
                            Surface(
                                onClick = {
                                    onSelectSubject(subject)
                                    coroutineScope.launch {
                                        bookCarouselState.animateScrollToItem(index)
                                    }
                                },
                                shape = RoundedCornerShape(50),
                                color = if (activeBookIndex == index) accent.copy(alpha = 0.12f) else Color(0xFFF3F6FC),
                                border = BorderStroke(
                                    1.dp,
                                    if (activeBookIndex == index) accent.copy(alpha = 0.38f) else Color(0xFFE2E8F5)
                                ),
                                modifier = Modifier
                                    .weight(1f)
                                    .testTag("smart_notes_tab_${subject.lowercase()}")
                            ) {
                                Box(
                                    modifier = Modifier.padding(vertical = 6.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = shortLabel,
                                        fontFamily = InterFontFamily,
                                        fontWeight = FontWeight.Normal,
                                        fontSize = 11.sp,
                                        color = if (activeBookIndex == index || isActive) accent else SecondaryText,
                                        maxLines = 1
                                    )
                                }
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    val subjectSmartNotesList = pcmbSubjects.mapNotNull { subjectName ->
                        val chaptersForSub = state.allChapters.filter {
                            it.subject.equals(subjectName, ignoreCase = true)
                        }
                        val representative = chaptersForSub.firstOrNull() ?: return@mapNotNull null
                        val avgMastery = if (chaptersForSub.isNotEmpty()) {
                            (chaptersForSub.map { it.progressFraction }.average() * 100).toInt()
                        } else 50
                        val totalNotes = chaptersForSub.sumOf { it.studyNotesCount }.coerceAtLeast(8)
                        val totalVids = chaptersForSub.sumOf { it.totalLessons }.coerceAtLeast(12)
                        val totalQs = chaptersForSub.sumOf { it.practiceQuestionCount }.coerceAtLeast(40)

                        val badgeCode = when (subjectName) {
                            "Physics" -> "PHY"
                            "Chemistry" -> "CHEM"
                            "Mathematics" -> "MATH"
                            "Biology" -> "BIO"
                            else -> "NOTES"
                        }
                        val subjectTitle = when (subjectName) {
                            "Physics" -> "Physics Smart Notes"
                            "Chemistry" -> "Chemistry Smart Notes"
                            "Mathematics" -> "Mathematics Smart Notes"
                            "Biology" -> "Biology Smart Notes"
                            else -> "$subjectName Smart Notes"
                        }
                        val subjectTagline = when (subjectName) {
                            "Physics" -> "28 Chapters • Units & Measurements to Semiconductors"
                            "Chemistry" -> "Core Mechanisms, Equations & Trends"
                            "Mathematics" -> "Essential Theorems, Identities & Shortcuts"
                            "Biology" -> "High-Yield Concepts & Visual Revision"
                            else -> "Complete IISER IAT Revision Handbook"
                        }

                        Triple(
                            representative,
                            Triple(badgeCode, subjectTitle, subjectTagline),
                            listOf(avgMastery, totalNotes, totalVids, totalQs)
                        )
                    }

                    LazyRow(
                        state = bookCarouselState,
                        contentPadding = PaddingValues(horizontal = 20.dp),
                        horizontalArrangement = Arrangement.spacedBy(14.dp),
                        modifier = Modifier.testTag("smart_library_carousel")
                    ) {
                        items(subjectSmartNotesList, key = { it.first.subject }) { (repChapter, meta, stats) ->
                            BookCard(
                                chapter = repChapter,
                                subjectBadgeCode = meta.first,
                                cardTitleOverride = meta.second,
                                subtitleOverride = meta.third,
                                masteryPercentOverride = stats[0],
                                totalNotesOverride = stats[1],
                                totalVideosOverride = stats[2],
                                totalQuestionsOverride = stats[3],
                                onOpenChapter = {
                                    onOpenSubjectNotes(repChapter.subject)
                                }
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(14.dp))
                    CarouselPagerIndicator(
                        totalCount = subjectSmartNotesList.size.coerceAtLeast(4),
                        activeIndex = activeBookIndex
                    )
                    Spacer(modifier = Modifier.height(24.dp))
                }
            }

            // ==================== 5. READINESS ENGINE & WEAK AREA SPOTLIGHT ====================
            item(key = "readiness_engine_and_weak_area") {
                Column(modifier = Modifier.fillMaxWidth()) {
                    MobileReadinessAndWeakAreaCard(
                        allChapters = state.allChapters,
                        allQuestions = state.allQuestions,
                        onPracticeWeakArea = { weakCh -> onOpenChapter(weakCh, false) },
                        onOpenFullAnalytics = { onNavigateToTab(BottomNavTab.PROFILE) }
                    )
                    Spacer(modifier = Modifier.height(24.dp))
                }
            }

            // ==================== 6. INTERACTIVE DAILY PYQ CHALLENGE & RAPID FORMULA DECK ====================
            item(key = "continue_learning_section") {
                Column(modifier = Modifier.fillMaxWidth()) {
                    SectionHeader(
                        title = "Daily PYQ & Formula Deck",
                        subtitle = "Solve authentic IISER IAT questions & revise high-yield formulas",
                        actionLabel = "PYQ Vault",
                        onActionClick = { onNavigateToTab(BottomNavTab.PYQS) }
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    DailyPyqAndFormulaHubSection(
                        allQuestions = state.allQuestions,
                        onOpenFullPyqBank = { onNavigateToTab(BottomNavTab.PYQS) },
                        onPracticeQuestionInSession = { q ->
                            onOpenQuestionSession(
                                "${q.examSource} ${q.examYear ?: 2024} • ${q.subject} Drill",
                                "${q.topic} (+4 / -1 Marking)",
                                listOf(q.id),
                                false
                            )
                        }
                    )
                    Spacer(modifier = Modifier.height(24.dp))
                }
            }

            // ==================== 7. PERFORMANCE TREND GRAPH BENTO ====================
            item(key = "home_performance_trend_section") {
                Column(modifier = Modifier.fillMaxWidth()) {
                    HomePerformanceTrendBentoSection(
                        allQuestions = state.allQuestions,
                        allChapters = state.allChapters,
                        onOpenFullAnalytics = { onNavigateToTab(BottomNavTab.PROFILE) }
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                }
            }

            // ==================== 8. AMBIENT BRAND DOODLE WATERMARK FOOTER ====================
            item(key = "home_brand_watermark_footer") {
                SmartPrepBrandWatermarkFooter()
            }
        }
    }

    if (showNotificationsDialog) {
        AlertDialog(
            onDismissRequest = { showNotificationsDialog = false },
            title = { Text("IISER SmartPrep") },
            text = {
                Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    Text("• Active Streak: ${state.profile.streakDays} days (${state.profile.xpPoints} XP)")
                    Text("• Tap SNAP & SOLVE AI on the home hero to scan or type any Physics, Chemistry, Maths, or Biology question.")
                    Text("• All 4 subjects and IISER IAT PYQs (2022–2025) are synced for offline study.")
                }
            },
            confirmButton = {
                TextButton(onClick = { showNotificationsDialog = false }) {
                    Text("Close")
                }
            }
        )
    }

    if (showAddStudyTaskDialog) {
        AddStudyPlanTaskDialog(
            defaultSubject = state.selectedSubject,
            onDismiss = { showAddStudyTaskDialog = false },
            onConfirm = { title, subject, type, mins ->
                onAddStudyTask(title, subject, type, mins)
                showAddStudyTaskDialog = false
            }
        )
    }
}

@Composable
private fun ImportantQuestionSetCard(
    chapter: ChapterEntity,
    questionCount: Int,
    attemptedCount: Int,
    estimatedMinutes: Int,
    onStartSet: () -> Unit
) {
    val accent = subjectAccentColor(chapter.subject)
    val isStarted = attemptedCount > 0

    Card(
        onClick = onStartSet,
        shape = RoundedCornerShape(22.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF6F8FD)),
        border = androidx.compose.foundation.BorderStroke(1.2.dp, Color(0xFFDFE6F5)),
        elevation = CardDefaults.cardElevation(defaultElevation = 1.dp),
        modifier = Modifier
            .fillMaxWidth()
            .testTag("important_set_${chapter.id}")
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Surface(
                        color = accent.copy(alpha = 0.12f),
                        shape = RoundedCornerShape(6.dp)
                    ) {
                        Text(
                            text = chapter.subject,
                            style = MaterialTheme.typography.labelSmall.copy(
                                color = accent,
                                fontWeight = FontWeight.Bold
                            ),
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
                        )
                    }
                    Text(
                        text = "$questionCount IMP Qs • ~$estimatedMinutes min",
                        style = MaterialTheme.typography.labelSmall,
                        color = SecondaryText
                    )
                }
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = chapter.title,
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold),
                    color = PrimaryText
                )
                Spacer(modifier = Modifier.height(3.dp))
                Text(
                    text = if (isStarted) {
                        "Attempted $attemptedCount/$questionCount questions"
                    } else {
                        "Read, practise & view step-by-step derivations"
                    },
                    style = MaterialTheme.typography.bodySmall,
                    color = if (isStarted) SuccessGreen else SecondaryText
                )
            }

            Spacer(modifier = Modifier.width(12.dp))

            Button(
                onClick = onStartSet,
                shape = RoundedCornerShape(50),
                colors = ButtonDefaults.buttonColors(
                    containerColor = CharcoalSelected,
                    contentColor = Color.White
                ),
                contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
            ) {
                Text(
                    text = if (isStarted) "Resume" else "Practise",
                    style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.SemiBold)
                )
            }
        }
    }
}

@Composable
private fun PyqPreviewCard(
    question: QuestionEntity,
    onAttemptClick: () -> Unit
) {
    val accent = subjectAccentColor(question.subject)

    Card(
        onClick = onAttemptClick,
        shape = RoundedCornerShape(22.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF6F8FD)),
        border = androidx.compose.foundation.BorderStroke(1.2.dp, Color(0xFFDFE6F5)),
        elevation = CardDefaults.cardElevation(defaultElevation = 1.dp),
        modifier = Modifier
            .width(284.dp)
            .testTag("pyq_preview_card_${question.id}")
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Surface(
                    color = CharcoalSelected,
                    shape = RoundedCornerShape(6.dp)
                ) {
                    Text(
                        text = "${question.examSource} ${question.examYear ?: ""}",
                        style = MaterialTheme.typography.labelSmall.copy(
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        ),
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                    )
                }

                Text(
                    text = question.topic,
                    style = MaterialTheme.typography.labelSmall.copy(
                        color = accent,
                        fontWeight = FontWeight.SemiBold
                    ),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = question.prompt,
                style = MaterialTheme.typography.bodyMedium,
                color = PrimaryText,
                maxLines = 3,
                overflow = TextOverflow.Ellipsis
            )

            Spacer(modifier = Modifier.height(12.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = if (question.isAttempted) {
                        if (question.isCorrect) "Solved Correctly ✓" else "Attempted • Review"
                    } else {
                        "Solve & view solution"
                    },
                    style = MaterialTheme.typography.labelSmall.copy(
                        color = if (question.isCorrect) SuccessGreen else PrimaryBlue,
                        fontWeight = FontWeight.SemiBold
                    )
                )
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                    contentDescription = null,
                    tint = PrimaryBlue,
                    modifier = Modifier.size(16.dp)
                )
            }
        }
    }
}

@Composable
private fun PracticeModesGrid(
    selectedSubject: String,
    bookmarkedCount: Int,
    onChapterWiseClick: () -> Unit,
    onTimedDrillClick: () -> Unit,
    onMixedQuizClick: () -> Unit,
    onBookmarkedRevisionClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            PracticeModeTile(
                title = "Chapter-Wise",
                subtitle = "$selectedSubject Focus",
                icon = Icons.Default.Quiz,
                accentColor = PrimaryBlue,
                onClick = onChapterWiseClick,
                modifier = Modifier
                    .weight(1f)
                    .testTag("practice_mode_chapter")
            )
            PracticeModeTile(
                title = "Timed Drill",
                subtitle = "Speed & Accuracy",
                icon = Icons.Default.Timer,
                accentColor = ElectricPurple,
                onClick = onTimedDrillClick,
                modifier = Modifier
                    .weight(1f)
                    .testTag("practice_mode_timed")
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            PracticeModeTile(
                title = "Mixed PCMB",
                subtitle = "Cross-Subject IAT",
                icon = Icons.Default.Shuffle,
                accentColor = SuccessGreen,
                onClick = onMixedQuizClick,
                modifier = Modifier
                    .weight(1f)
                    .testTag("practice_mode_mixed")
            )
            PracticeModeTile(
                title = "Revision Quiz",
                subtitle = if (bookmarkedCount > 0) "$bookmarkedCount Saved Qs" else "Core Formulas",
                icon = Icons.Default.Bookmark,
                accentColor = Color(0xFFD97706),
                onClick = onBookmarkedRevisionClick,
                modifier = Modifier
                    .weight(1f)
                    .testTag("practice_mode_revision")
            )
        }
    }
}

@Composable
private fun PracticeModeTile(
    title: String,
    subtitle: String,
    icon: ImageVector,
    accentColor: Color,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        onClick = onClick,
        shape = RoundedCornerShape(18.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF6F8FD)),
        border = androidx.compose.foundation.BorderStroke(1.2.dp, Color(0xFFDFE6F5)),
        elevation = CardDefaults.cardElevation(defaultElevation = 1.dp),
        modifier = modifier
    ) {
        Row(
            modifier = Modifier.padding(14.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(Color.White),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    tint = accentColor,
                    modifier = Modifier.size(20.dp)
                )
            }
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.SemiBold),
                    color = PrimaryText,
                    maxLines = 1
                )
                Text(
                    text = subtitle,
                    style = MaterialTheme.typography.labelSmall,
                    color = SecondaryText,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}

@Composable
private fun AddStudyPlanTaskDialog(
    defaultSubject: String,
    onDismiss: () -> Unit,
    onConfirm: (String, String, String, Int) -> Unit
) {
    var title by remember { mutableStateOf("") }
    var selectedSubject by remember { mutableStateOf(defaultSubject) }
    var durationText by remember { mutableStateOf("25") }
    val subjects = listOf("Mathematics", "Physics", "Chemistry", "Biology")

    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("Add Daily Study Activity") },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                OutlinedTextField(
                    value = title,
                    onValueChange = { title = it },
                    label = { Text("Study Goal Title") },
                    placeholder = { Text("e.g., Revise Definite Integrals King's Property") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth()
                )
                Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                    subjects.forEach { subj ->
                        val active = subj == selectedSubject
                        Surface(
                            onClick = { selectedSubject = subj },
                            shape = RoundedCornerShape(50),
                            color = if (active) CharcoalSelected else CardBackground
                        ) {
                            Text(
                                text = subj.take(4),
                                style = MaterialTheme.typography.labelSmall.copy(
                                    color = if (active) Color.White else PrimaryText,
                                    fontWeight = FontWeight.Bold
                                ),
                                modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
                            )
                        }
                    }
                }
                OutlinedTextField(
                    value = durationText,
                    onValueChange = { durationText = it.filter { ch -> ch.isDigit() } },
                    label = { Text("Duration (minutes)") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        },
        confirmButton = {
            Button(
                onClick = {
                    val cleanTitle = title.trim().ifEmpty { "Practice $selectedSubject Concept Set" }
                    val mins = durationText.toIntOrNull()?.coerceIn(5, 180) ?: 25
                    onConfirm(cleanTitle, selectedSubject, "Study Block", mins)
                }
            ) {
                Text("Add to Plan")
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text("Cancel")
            }
        }
    )
}
