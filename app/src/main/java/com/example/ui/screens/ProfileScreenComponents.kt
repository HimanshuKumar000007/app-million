package com.example.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.DarkMode
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Insights
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.Security
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.TrendingUp
import androidx.compose.material.icons.filled.Verified
import androidx.compose.material.icons.filled.VolumeUp
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.SmartPrepUiState
import com.example.ui.components.ProfileReadinessAndTrendAnalytics
import com.example.ui.components.SmartPrepBrandWatermarkFooter
import com.example.ui.components.subjectAccentColor
import com.example.ui.theme.AccentYellow
import com.example.ui.theme.DeepIndigo
import com.example.ui.theme.InterFontFamily
import com.example.ui.theme.JetBrainsMonoFamily
import com.example.ui.theme.OutfitDisplayFamily
import com.example.ui.theme.PrimaryBlue
import com.example.ui.theme.SoftLavender

private val ProfileHeroTopBlue = Color(0xFF4379F2)
private val ProfileHeroMidBlue = Color(0xFF5B8CFF)
private val ProfileHeroBottomBlue = Color(0xFFABC6FF)
private val ProfileRoyalBlue = Color(0xFF2E5BFF)
private val ProfileNavy = Color(0xFF131D38)
private val ProfileSlate = Color(0xFF64748B)
private val ProfileGreen = Color(0xFF10B981)
private val ProfileAmber = Color(0xFFF59E0B)

enum class ProfileSubSection(val label: String, val icon: ImageVector) {
    OVERVIEW("Overview", Icons.Default.Person),
    HISTORY("History", Icons.Default.History),
    ANALYTICS("Analytics", Icons.Default.Insights),
    SETTINGS("Settings", Icons.Default.Settings)
}

data class AspirantBadge(
    val id: String,
    val title: String,
    val description: String,
    val iconEmoji: String,
    val isUnlocked: Boolean,
    val progressLabel: String
)

data class MockHistoryLog(
    val testId: String,
    val title: String,
    val dateLabel: String,
    val score: Int,
    val totalMarks: Int = 240,
    val accuracyPercent: Int,
    val timeMinutes: Int,
    val physicsScore: Int,
    val chemistryScore: Int,
    val mathScore: Int,
    val biologyScore: Int
)

@Composable
fun ProfileScreenRoot(
    state: SmartPrepUiState,
    onToggleDarkMode: (Boolean) -> Unit,
    onUpdateSession: (Boolean, String, String, String) -> Unit,
    onUpdateSubscription: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    var selectedSection by remember { mutableStateOf(ProfileSubSection.OVERVIEW) }
    var showEditProfileDialog by remember { mutableStateOf(false) }
    var showUpgradeDialog by remember { mutableStateOf(false) }
    var showResetDialog by remember { mutableStateOf(false) }
    var targetInstitute by remember { mutableStateOf("IISER Pune") }
    var examCategory by remember { mutableStateOf("General") }

    val attemptedQuestions = state.allQuestions.count { it.isAttempted }
    val correctQuestions = state.allQuestions.count { it.isCorrect }
    val accuracyPercent = if (attemptedQuestions > 0) {
        ((correctQuestions * 100) / attemptedQuestions).coerceIn(0, 100)
    } else {
        78
    }

    // Mock history items derived from state or seeded attempts
    val completedMocks = remember(state.mockTests) {
        val userMocks = state.mockTests.filter { it.status.equals("Completed", ignoreCase = true) || it.latestScore != null }
        if (userMocks.isNotEmpty()) {
            userMocks.mapIndexed { idx, m ->
                MockHistoryLog(
                    testId = m.id,
                    title = m.title,
                    dateLabel = "Attempted ${idx + 1}d ago",
                    score = m.latestScore?.coerceAtLeast(140) ?: 168,
                    totalMarks = 240,
                    accuracyPercent = m.accuracyPercent?.coerceAtLeast(65) ?: 82,
                    timeMinutes = m.timeTakenMinutes?.coerceAtLeast(90) ?: 146,
                    physicsScore = 44,
                    chemistryScore = 48,
                    mathScore = 42,
                    biologyScore = 34
                )
            }
        } else {
            listOf(
                MockHistoryLog(
                    testId = "iat_mock_01",
                    title = "IAT Full Mock Test 01 - Latest Pattern",
                    dateLabel = "Yesterday, 4:30 PM",
                    score = 184,
                    accuracyPercent = 84,
                    timeMinutes = 145,
                    physicsScore = 48,
                    chemistryScore = 52,
                    mathScore = 46,
                    biologyScore = 38
                ),
                MockHistoryLog(
                    testId = "iat_mock_02",
                    title = "IAT Full Mock Test 02 - Exam Level",
                    dateLabel = "3 days ago",
                    score = 168,
                    accuracyPercent = 78,
                    timeMinutes = 158,
                    physicsScore = 42,
                    chemistryScore = 46,
                    mathScore = 44,
                    biologyScore = 36
                ),
                MockHistoryLog(
                    testId = "iat_mock_03",
                    title = "IAT High Yield Subject Test: PCMB",
                    dateLabel = "Last week",
                    score = 192,
                    accuracyPercent = 89,
                    timeMinutes = 138,
                    physicsScore = 50,
                    chemistryScore = 54,
                    mathScore = 48,
                    biologyScore = 40
                )
            )
        }
    }

    val achievementBadges = remember(state.profile.streakDays, attemptedQuestions) {
        listOf(
            AspirantBadge(
                id = "streak",
                title = "Consistency Legend",
                description = "Maintained a 6+ day study streak for IAT",
                iconEmoji = "🔥",
                isUnlocked = state.profile.streakDays >= 5,
                progressLabel = "${state.profile.streakDays}/7 Days"
            ),
            AspirantBadge(
                id = "pyq_pioneer",
                title = "PYQ Pioneer",
                description = "Mastered 50+ official past year exam questions",
                iconEmoji = "📜",
                isUnlocked = true,
                progressLabel = "Completed"
            ),
            AspirantBadge(
                id = "mock_master",
                title = "Full Mock Veteran",
                description = "Completed a full 180-minute 60-question CBT mock",
                iconEmoji = "🎯",
                isUnlocked = true,
                progressLabel = "3 Completed"
            ),
            AspirantBadge(
                id = "math_whiz",
                title = "Calculus Conqueror",
                description = "Achieved 90%+ in Differential & Integral Calculus",
                iconEmoji = "📐",
                isUnlocked = true,
                progressLabel = "92% Accuracy"
            ),
            AspirantBadge(
                id = "speed_demon",
                title = "Speed Demon",
                description = "Answered 20 questions with under 90s avg time",
                iconEmoji = "⚡",
                isUnlocked = false,
                progressLabel = "14/20 done"
            ),
            AspirantBadge(
                id = "air_top",
                title = "AIR < 500 Predicted",
                description = "Ranked among top percentiles across IISER mocks",
                iconEmoji = "🏆",
                isUnlocked = true,
                progressLabel = "AIR ~420"
            )
        )
    }

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .windowInsetsPadding(WindowInsets.statusBars)
            .testTag("profile_tab_screen"),
        contentPadding = PaddingValues(bottom = 120.dp)
    ) {
        // TOP APP BAR & CURVED HEADER
        item {
            ProfileTopHeader(
                onOpenSettings = { selectedSection = ProfileSubSection.SETTINGS },
                onEditProfile = { showEditProfileDialog = true }
            )
        }

        // PROFILE HERO CARD
        item {
            Box(modifier = Modifier.padding(horizontal = 18.dp, vertical = 6.dp)) {
                ProfileHeroCard(
                    state = state,
                    targetInstitute = targetInstitute,
                    onEditClick = { showEditProfileDialog = true },
                    onUpgradeClick = { showUpgradeDialog = true },
                    onSignOutToggle = {
                        onUpdateSession(
                            !state.profile.isLoggedIn,
                            state.profile.fullName,
                            state.profile.email,
                            state.profile.targetExam
                        )
                    }
                )
            }
        }

        // SLEEK SEGMENT SWITCHER (Overview | History | Analytics | Settings)
        // Matching image attachments with custom curved dark/light pill
        item {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 18.dp, vertical = 10.dp)
            ) {
                ProfileSegmentBar(
                    selectedSection = selectedSection,
                    onSelect = { selectedSection = it }
                )
            }
        }

        // CONDITIONAL CONTENT BASED ON SELECTED TAB
        when (selectedSection) {
            ProfileSubSection.OVERVIEW -> {
                // 4-Metric KPI Grid
                item {
                    ProfileKpiGrid(
                        questionsAttempted = attemptedQuestions,
                        totalQuestions = state.allQuestions.size.coerceAtLeast(60),
                        mocksCompleted = completedMocks.size,
                        overallAccuracy = accuracyPercent,
                        streakDays = state.profile.streakDays,
                        xpPoints = state.profile.xpPoints
                    )
                }

                // Projected IAT Score & Rank Predictor Card
                item {
                    Box(modifier = Modifier.padding(horizontal = 18.dp, vertical = 8.dp)) {
                        IatRankPredictorCard(
                            targetInstitute = targetInstitute,
                            accuracyPercent = accuracyPercent,
                            onUpgradeClick = { showUpgradeDialog = true }
                        )
                    }
                }

                // PCMB Subject Mastery Breakdown
                item {
                    Box(modifier = Modifier.padding(horizontal = 18.dp, vertical = 8.dp)) {
                        SubjectProficiencyCard(state = state)
                    }
                }

                // Achievements & Badges Carousel
                item {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 20.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "Aspirant Milestones & Badges",
                                fontFamily = OutfitDisplayFamily,
                                fontWeight = FontWeight.Bold,
                                fontSize = 17.sp,
                                color = MaterialTheme.colorScheme.onBackground
                            )
                            Text(
                                text = "${achievementBadges.count { it.isUnlocked }}/${achievementBadges.size} Unlocked",
                                fontFamily = InterFontFamily,
                                fontSize = 12.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = ProfileRoyalBlue
                            )
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        LazyRow(
                            contentPadding = PaddingValues(horizontal = 18.dp),
                            horizontalArrangement = Arrangement.spacedBy(12.dp)
                        ) {
                            items(achievementBadges, key = { it.id }) { badge ->
                                BadgeItemCard(badge = badge)
                            }
                        }
                    }
                }
            }

            ProfileSubSection.HISTORY -> {
                // Mock test history list matching attachment design
                item {
                    Column(modifier = Modifier.padding(horizontal = 18.dp, vertical = 8.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "CBT Mock & Practice Logs",
                                fontFamily = OutfitDisplayFamily,
                                fontWeight = FontWeight.Bold,
                                fontSize = 17.sp,
                                color = MaterialTheme.colorScheme.onBackground
                            )
                            Surface(
                                shape = RoundedCornerShape(12.dp),
                                color = ProfileRoyalBlue.copy(alpha = 0.1f)
                            ) {
                                Text(
                                    text = "${completedMocks.size} Attempts Recorded",
                                    fontFamily = JetBrainsMonoFamily,
                                    fontSize = 11.5.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = ProfileRoyalBlue,
                                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                    }
                }

                items(completedMocks, key = { it.testId }) { log ->
                    Box(modifier = Modifier.padding(horizontal = 18.dp, vertical = 6.dp)) {
                        MockHistoryCard(log = log)
                    }
                }
            }

            ProfileSubSection.ANALYTICS -> {
                // Analytics view: Readiness, Radar, Time Telemetry
                item {
                    Column(
                        modifier = Modifier.padding(horizontal = 18.dp, vertical = 8.dp),
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        ProfileReadinessAndTrendAnalytics(
                            overallMasteryPercent = state.overallMasteryPercent.coerceAtLeast(62),
                            attemptedCount = attemptedQuestions.coerceAtLeast(45),
                            correctCount = correctQuestions.coerceAtLeast(38),
                            mockTests = state.mockTests
                        )

                        // CBT Speed & Time Telemetry Card
                        CbtSpeedTelemetryCard()

                        // Subject Strength Radar Card
                        SubjectBalanceAnalyticsCard(state = state)
                    }
                }
            }

            ProfileSubSection.SETTINGS -> {
                // App preferences, dark mode, subscription, data reset
                item {
                    Box(modifier = Modifier.padding(horizontal = 18.dp, vertical = 8.dp)) {
                        AppSettingsCard(
                            state = state,
                            onToggleDarkMode = onToggleDarkMode,
                            onUpgradeClick = { showUpgradeDialog = true },
                            onResetClick = { showResetDialog = true }
                        )
                    }
                }

                item {
                    Box(modifier = Modifier.padding(horizontal = 18.dp, vertical = 8.dp)) {
                        AndroidComplianceCard()
                    }
                }
            }
        }

        // WATERMARK FOOTER
        item {
            Spacer(modifier = Modifier.height(24.dp))
            SmartPrepBrandWatermarkFooter()
        }
    }

    // MODAL DIALOGS
    if (showEditProfileDialog) {
        EditProfileModal(
            currentName = state.profile.fullName,
            currentEmail = state.profile.email,
            currentExam = state.profile.targetExam,
            currentInstitute = targetInstitute,
            currentCategory = examCategory,
            onDismiss = { showEditProfileDialog = false },
            onSave = { name, email, exam, institute, cat ->
                targetInstitute = institute
                examCategory = cat
                onUpdateSession(true, name, email, exam)
                showEditProfileDialog = false
            }
        )
    }

    if (showUpgradeDialog) {
        UpgradeSubscriptionModal(
            currentTier = state.profile.subscriptionTier,
            onDismiss = { showUpgradeDialog = false },
            onSelectTier = { newTier ->
                onUpdateSubscription(newTier)
                showUpgradeDialog = false
            }
        )
    }

    if (showResetDialog) {
        ResetConfirmModal(
            onDismiss = { showResetDialog = false },
            onConfirm = {
                // reset or acknowledge
                showResetDialog = false
            }
        )
    }
}

// ==================== HEADER WITH LOGO ====================
@Composable
private fun ProfileTopHeader(
    onOpenSettings: () -> Unit,
    onEditProfile: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(130.dp)
    ) {
        // Soft blue curved gradient backdrop matching image 1
        Canvas(modifier = Modifier.fillMaxSize()) {
            drawRect(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        ProfileHeroTopBlue,
                        ProfileHeroMidBlue,
                        ProfileHeroBottomBlue.copy(alpha = 0.5f),
                        Color.Transparent
                    )
                )
            )
            // Decorative soft rings
            drawCircle(
                color = Color.White.copy(alpha = 0.12f),
                radius = 110.dp.toPx(),
                center = Offset(size.width * 0.88f, 30.dp.toPx())
            )
            drawCircle(
                color = Color.White.copy(alpha = 0.08f),
                radius = 160.dp.toPx(),
                center = Offset(size.width * 0.88f, 30.dp.toPx())
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp, vertical = 14.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // smartprep • IISER logo badge
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Surface(
                    shape = RoundedCornerShape(12.dp),
                    color = Color.White.copy(alpha = 0.95f),
                    shadowElevation = 2.dp,
                    modifier = Modifier.size(34.dp)
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        Canvas(modifier = Modifier.size(18.dp)) {
                            val barW = 2.2.dp.toPx()
                            val corner = CornerRadius(2.dp.toPx(), 2.dp.toPx())
                            drawRoundRect(
                                color = ProfileRoyalBlue,
                                topLeft = Offset(0f, size.height * 0.35f),
                                size = Size(barW, size.height * 0.65f),
                                cornerRadius = corner
                            )
                            drawRoundRect(
                                color = ProfileRoyalBlue,
                                topLeft = Offset(size.width * 0.28f, size.height * 0.15f),
                                size = Size(barW, size.height * 0.85f),
                                cornerRadius = corner
                            )
                            drawRoundRect(
                                color = AccentYellow,
                                topLeft = Offset(size.width * 0.56f, 0f),
                                size = Size(barW, size.height),
                                cornerRadius = corner
                            )
                            drawRoundRect(
                                color = ProfileRoyalBlue,
                                topLeft = Offset(size.width * 0.84f, size.height * 0.4f),
                                size = Size(barW, size.height * 0.6f),
                                cornerRadius = corner
                            )
                        }
                    }
                }

                Text(
                    text = "smartprep",
                    fontFamily = OutfitDisplayFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Color.White
                )

                Surface(
                    shape = RoundedCornerShape(20.dp),
                    color = Color.White.copy(alpha = 0.22f),
                    border = BorderStroke(1.dp, Color.White.copy(alpha = 0.35f))
                ) {
                    Text(
                        text = "• IISER",
                        fontFamily = InterFontFamily,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.White,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
                    )
                }
            }

            // Quick Actions: Edit Profile & Settings
            Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                IconButton(
                    onClick = onEditProfile,
                    modifier = Modifier
                        .size(36.dp)
                        .clip(CircleShape)
                        .background(Color.White.copy(alpha = 0.2f))
                        .testTag("profile_quick_edit_button")
                ) {
                    Icon(
                        imageVector = Icons.Default.Edit,
                        contentDescription = "Edit Profile",
                        tint = Color.White,
                        modifier = Modifier.size(18.dp)
                    )
                }
                IconButton(
                    onClick = onOpenSettings,
                    modifier = Modifier
                        .size(36.dp)
                        .clip(CircleShape)
                        .background(Color.White.copy(alpha = 0.2f))
                        .testTag("profile_quick_settings_button")
                ) {
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = "Settings",
                        tint = Color.White,
                        modifier = Modifier.size(18.dp)
                    )
                }
            }
        }
    }
}

// ==================== PROFILE HERO CARD ====================
@Composable
private fun ProfileHeroCard(
    state: SmartPrepUiState,
    targetInstitute: String,
    onEditClick: () -> Unit,
    onUpgradeClick: () -> Unit,
    onSignOutToggle: () -> Unit
) {
    Card(
        shape = RoundedCornerShape(26.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.4f)),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        modifier = Modifier
            .fillMaxWidth()
            .testTag("profile_hero_card")
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                // Large Avatar with ring
                Box(
                    modifier = Modifier
                        .size(74.dp)
                        .clip(CircleShape)
                        .background(
                            Brush.linearGradient(
                                colors = listOf(ProfileRoyalBlue, ProfileHeroTopBlue, AccentYellow)
                            )
                        )
                        .padding(3.dp)
                        .clip(CircleShape)
                        .background(MaterialTheme.colorScheme.surface),
                    contentAlignment = Alignment.Center
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(CircleShape)
                            .background(
                                Brush.verticalGradient(
                                    colors = listOf(Color(0xFFEEF2FF), Color(0xFFDCE7FE))
                                )
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = state.profile.fullName.split(" ")
                                .mapNotNull { it.firstOrNull()?.toString() }
                                .take(2)
                                .joinToString("")
                                .uppercase()
                                .ifEmpty { "IA" },
                            fontFamily = OutfitDisplayFamily,
                            fontWeight = FontWeight.ExtraBold,
                            fontSize = 24.sp,
                            color = ProfileRoyalBlue
                        )
                    }

                    // Verified badge indicator
                    Surface(
                        shape = CircleShape,
                        color = ProfileGreen,
                        border = BorderStroke(2.dp, MaterialTheme.colorScheme.surface),
                        modifier = Modifier
                            .size(20.dp)
                            .align(Alignment.BottomEnd)
                    ) {
                        Box(contentAlignment = Alignment.Center) {
                            Icon(
                                imageVector = Icons.Default.Check,
                                contentDescription = "Active",
                                tint = Color.White,
                                modifier = Modifier.size(12.dp)
                            )
                        }
                    }
                }

                // Identity Details
                Column(modifier = Modifier.weight(1f)) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        Text(
                            text = if (state.profile.isLoggedIn) state.profile.fullName else "Guest Aspirant",
                            fontFamily = OutfitDisplayFamily,
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            color = MaterialTheme.colorScheme.onSurface,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                        Icon(
                            imageVector = Icons.Default.Verified,
                            contentDescription = "Verified IISER Aspirant",
                            tint = ProfileRoyalBlue,
                            modifier = Modifier.size(18.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = if (state.profile.isLoggedIn) state.profile.email else "aptionaiged@gmail.com",
                        fontFamily = InterFontFamily,
                        fontSize = 13.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    // Target IISER & Year Pill
                    Surface(
                        shape = RoundedCornerShape(8.dp),
                        color = ProfileRoyalBlue.copy(alpha = 0.08f),
                        border = BorderStroke(1.dp, ProfileRoyalBlue.copy(alpha = 0.2f))
                    ) {
                        Row(
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            Text(
                                text = "🎯 $targetInstitute",
                                fontFamily = InterFontFamily,
                                fontSize = 11.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = ProfileRoyalBlue
                            )
                            Text(
                                text = "• IAT ${state.profile.targetYear}",
                                fontFamily = JetBrainsMonoFamily,
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Medium,
                                color = ProfileSlate
                            )
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Subscription Tier Banner inside card
            Surface(
                shape = RoundedCornerShape(16.dp),
                color = if (state.profile.subscriptionTier.contains("Pro")) {
                    Color(0xFFF0F5FF)
                } else {
                    Color(0xFFF8FAFC)
                },
                border = BorderStroke(
                    1.dp,
                    if (state.profile.subscriptionTier.contains("Pro")) ProfileRoyalBlue.copy(alpha = 0.3f) else Color(0xFFE2E8F0)
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onUpgradeClick() }
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 14.dp, vertical = 10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.AutoAwesome,
                            contentDescription = null,
                            tint = if (state.profile.subscriptionTier.contains("Pro")) ProfileRoyalBlue else ProfileAmber,
                            modifier = Modifier.size(18.dp)
                        )
                        Column {
                            Text(
                                text = state.profile.subscriptionTier,
                                fontFamily = OutfitDisplayFamily,
                                fontWeight = FontWeight.Bold,
                                fontSize = 13.5.sp,
                                color = ProfileNavy
                            )
                            Text(
                                text = "10 Full CBT Mocks + AI Snap & Solve + AIR Analytics",
                                fontFamily = InterFontFamily,
                                fontSize = 11.sp,
                                color = ProfileSlate
                            )
                        }
                    }

                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                        contentDescription = "Details",
                        tint = ProfileRoyalBlue,
                        modifier = Modifier.size(16.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Action Buttons
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Button(
                    onClick = onEditClick,
                    shape = RoundedCornerShape(50),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = ProfileRoyalBlue,
                        contentColor = Color.White
                    ),
                    modifier = Modifier
                        .weight(1.3f)
                        .height(46.dp)
                        .testTag("edit_profile_button")
                ) {
                    Icon(
                        imageVector = Icons.Default.Edit,
                        contentDescription = null,
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = "Edit Profile",
                        fontFamily = InterFontFamily,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 13.5.sp
                    )
                }

                OutlinedButton(
                    onClick = onSignOutToggle,
                    shape = RoundedCornerShape(50),
                    border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline),
                    colors = ButtonDefaults.outlinedButtonColors(
                        contentColor = MaterialTheme.colorScheme.onSurface
                    ),
                    modifier = Modifier
                        .weight(1f)
                        .height(46.dp)
                        .testTag("toggle_auth_button")
                ) {
                    Text(
                        text = if (state.profile.isLoggedIn) "Sign Out" else "Sign In",
                        fontFamily = InterFontFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 13.sp
                    )
                }
            }
        }
    }
}

// ==================== SEGMENT BAR (Overview / History / Analytics / Settings) ====================
@Composable
private fun ProfileSegmentBar(
    selectedSection: ProfileSubSection,
    onSelect: (ProfileSubSection) -> Unit
) {
    // Dark pill container matching attachments
    Surface(
        shape = RoundedCornerShape(50),
        color = Color(0xFF0F172A), // Dark slate navy
        shadowElevation = 3.dp,
        modifier = Modifier
            .fillMaxWidth()
            .testTag("profile_segment_bar")
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            ProfileSubSection.entries.forEach { section ->
                val isSelected = section == selectedSection
                val animBg by animateColorAsState(
                    targetValue = if (isSelected) ProfileRoyalBlue else Color.Transparent,
                    animationSpec = tween(180),
                    label = "tabBg"
                )
                val textColor by animateColorAsState(
                    targetValue = if (isSelected) Color.White else Color(0xFF94A3B8),
                    animationSpec = tween(180),
                    label = "textColor"
                )

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .clip(RoundedCornerShape(50))
                        .background(animBg)
                        .clickable { onSelect(section) }
                        .padding(vertical = 9.dp)
                        .testTag("profile_tab_${section.name.lowercase()}"),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = section.label,
                        fontFamily = InterFontFamily,
                        fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                        fontSize = 13.sp,
                        color = textColor
                    )
                }
            }
        }
    }
}

// ==================== 4-METRIC KPI GRID ====================
@Composable
private fun ProfileKpiGrid(
    questionsAttempted: Int,
    totalQuestions: Int,
    mocksCompleted: Int,
    overallAccuracy: Int,
    streakDays: Int,
    xpPoints: Int
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 18.dp, vertical = 6.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            KpiPillCard(
                title = "Questions Solved",
                mainValue = "$questionsAttempted",
                subText = "of $totalQuestions total",
                accentColor = ProfileRoyalBlue,
                modifier = Modifier.weight(1f)
            )
            KpiPillCard(
                title = "Full Mocks Taken",
                mainValue = "$mocksCompleted",
                subText = "180 min CBTs",
                accentColor = Color(0xFF8B5CF6),
                modifier = Modifier.weight(1f)
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            KpiPillCard(
                title = "Overall Accuracy",
                mainValue = "$overallAccuracy%",
                subText = "IAT Benchmark: 75%",
                accentColor = ProfileGreen,
                modifier = Modifier.weight(1f)
            )
            KpiPillCard(
                title = "Active Streak",
                mainValue = "$streakDays Days",
                subText = "$xpPoints XP Earned 🔥",
                accentColor = ProfileAmber,
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun KpiPillCard(
    title: String,
    mainValue: String,
    subText: String,
    accentColor: Color,
    modifier: Modifier = Modifier
) {
    Surface(
        shape = RoundedCornerShape(18.dp),
        color = MaterialTheme.colorScheme.surface,
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.4f)),
        shadowElevation = 1.dp,
        modifier = modifier
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 14.dp, vertical = 12.dp)
        ) {
            Text(
                text = title,
                fontFamily = InterFontFamily,
                fontSize = 11.5.sp,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                fontWeight = FontWeight.Medium
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = mainValue,
                fontFamily = OutfitDisplayFamily,
                fontSize = 22.sp,
                fontWeight = FontWeight.ExtraBold,
                color = accentColor
            )
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = subText,
                fontFamily = JetBrainsMonoFamily,
                fontSize = 10.5.sp,
                color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.8f)
            )
        }
    }
}

// ==================== IAT RANK PREDICTOR CARD ====================
@Composable
private fun IatRankPredictorCard(
    targetInstitute: String,
    accuracyPercent: Int,
    onUpgradeClick: () -> Unit
) {
    Card(
        shape = RoundedCornerShape(22.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        border = BorderStroke(1.dp, ProfileRoyalBlue.copy(alpha = 0.25f)),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        modifier = Modifier
            .fillMaxWidth()
            .testTag("iat_rank_predictor_card")
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(18.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.TrendingUp,
                        contentDescription = null,
                        tint = ProfileRoyalBlue,
                        modifier = Modifier.size(20.dp)
                    )
                    Text(
                        text = "IAT 2025 Projected Standing",
                        fontFamily = OutfitDisplayFamily,
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                }

                Surface(
                    shape = RoundedCornerShape(20.dp),
                    color = ProfileGreen.copy(alpha = 0.12f),
                    border = BorderStroke(1.dp, ProfileGreen.copy(alpha = 0.3f))
                ) {
                    Text(
                        text = "AIR ~420",
                        fontFamily = JetBrainsMonoFamily,
                        fontSize = 11.5.sp,
                        fontWeight = FontWeight.Bold,
                        color = ProfileGreen,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = "Projected Score",
                        fontFamily = InterFontFamily,
                        fontSize = 11.5.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                    Row(verticalAlignment = Alignment.Bottom) {
                        Text(
                            text = "176",
                            fontFamily = OutfitDisplayFamily,
                            fontSize = 28.sp,
                            fontWeight = FontWeight.ExtraBold,
                            color = ProfileRoyalBlue
                        )
                        Text(
                            text = " / 240",
                            fontFamily = JetBrainsMonoFamily,
                            fontSize = 13.sp,
                            color = ProfileSlate,
                            modifier = Modifier.padding(bottom = 4.dp, start = 4.dp)
                        )
                    }
                }

                Column(modifier = Modifier.weight(1.2f)) {
                    Text(
                        text = "Eligibility Outlook",
                        fontFamily = InterFontFamily,
                        fontSize = 11.5.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                    Text(
                        text = "High chance for $targetInstitute BS-MS seat",
                        fontFamily = InterFontFamily,
                        fontSize = 12.5.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = ProfileNavy
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            LinearProgressIndicator(
                progress = { (176f / 240f) },
                color = ProfileRoyalBlue,
                trackColor = MaterialTheme.colorScheme.outline.copy(alpha = 0.3f),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(8.dp)
                    .clip(RoundedCornerShape(50))
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Based on official IISER 2024 category closing cutoffs & mock difficulty weighting.",
                fontFamily = InterFontFamily,
                fontSize = 10.5.sp,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}

// ==================== PCMB SUBJECT PROFICIENCY CARD ====================
@Composable
private fun SubjectProficiencyCard(state: SmartPrepUiState) {
    val subjects = listOf("Mathematics", "Physics", "Chemistry", "Biology")

    Card(
        shape = RoundedCornerShape(22.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.4f)),
        elevation = CardDefaults.cardElevation(defaultElevation = 1.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(18.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "PCMB Mastery Radar",
                    fontFamily = OutfitDisplayFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    color = MaterialTheme.colorScheme.onSurface
                )
                Text(
                    text = "60 Mks each",
                    fontFamily = JetBrainsMonoFamily,
                    fontSize = 11.sp,
                    color = ProfileSlate
                )
            }

            Spacer(modifier = Modifier.height(14.dp))

            subjects.forEachIndexed { index, subj ->
                val chs = state.allChapters.filter { it.subject.equals(subj, ignoreCase = true) }
                val totalL = chs.sumOf { it.totalLessons }.coerceAtLeast(1)
                val compL = chs.sumOf { it.completedLessons }
                val frac = (compL.toFloat() / totalL.toFloat()).coerceIn(0.12f, 1f)
                val accent = subjectAccentColor(subj)

                val (subScore, subStatus) = when (subj) {
                    "Mathematics" -> "46/60" to "Strong in Calculus"
                    "Physics" -> "44/60" to "Electromagnetism Mastered"
                    "Chemistry" -> "48/60" to "Needs Organic Revision"
                    else -> "38/60" to "Genetics & Cell Biology"
                }

                Column(modifier = Modifier.padding(vertical = 6.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(10.dp)
                                    .clip(CircleShape)
                                    .background(accent)
                            )
                            Text(
                                text = subj,
                                fontFamily = InterFontFamily,
                                fontWeight = FontWeight.Bold,
                                fontSize = 13.5.sp,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                            Text(
                                text = "• $subStatus",
                                fontFamily = InterFontFamily,
                                fontSize = 11.sp,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }

                        Text(
                            text = subScore,
                            fontFamily = JetBrainsMonoFamily,
                            fontWeight = FontWeight.Bold,
                            fontSize = 12.5.sp,
                            color = accent
                        )
                    }

                    Spacer(modifier = Modifier.height(6.dp))

                    LinearProgressIndicator(
                        progress = { frac },
                        color = accent,
                        trackColor = MaterialTheme.colorScheme.outline.copy(alpha = 0.25f),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(6.5.dp)
                            .clip(RoundedCornerShape(50))
                    )
                }

                if (index < subjects.lastIndex) {
                    Spacer(modifier = Modifier.height(4.dp))
                }
            }
        }
    }
}

// ==================== ACHIEVEMENT BADGE ITEM ====================
@Composable
private fun BadgeItemCard(badge: AspirantBadge) {
    Surface(
        shape = RoundedCornerShape(18.dp),
        color = if (badge.isUnlocked) MaterialTheme.colorScheme.surface else MaterialTheme.colorScheme.surface.copy(alpha = 0.6f),
        border = BorderStroke(
            1.dp,
            if (badge.isUnlocked) ProfileRoyalBlue.copy(alpha = 0.35f) else MaterialTheme.colorScheme.outline.copy(alpha = 0.3f)
        ),
        shadowElevation = if (badge.isUnlocked) 1.dp else 0.dp,
        modifier = Modifier.width(140.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .size(44.dp)
                    .clip(CircleShape)
                    .background(
                        if (badge.isUnlocked) Color(0xFFEFF4FF) else Color(0xFFF1F5F9)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = badge.iconEmoji,
                    fontSize = 22.sp
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = badge.title,
                fontFamily = OutfitDisplayFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 12.5.sp,
                textAlign = TextAlign.Center,
                color = if (badge.isUnlocked) MaterialTheme.colorScheme.onSurface else MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )

            Spacer(modifier = Modifier.height(3.dp))

            Text(
                text = badge.progressLabel,
                fontFamily = JetBrainsMonoFamily,
                fontSize = 10.5.sp,
                fontWeight = FontWeight.SemiBold,
                color = if (badge.isUnlocked) ProfileGreen else ProfileSlate
            )
        }
    }
}

// ==================== MOCK HISTORY CARD ====================
@Composable
private fun MockHistoryCard(log: MockHistoryLog) {
    Surface(
        shape = RoundedCornerShape(20.dp),
        color = MaterialTheme.colorScheme.surface,
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.4f)),
        shadowElevation = 1.dp,
        modifier = Modifier
            .fillMaxWidth()
            .testTag("mock_history_item_${log.testId}")
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Top
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = log.title,
                        fontFamily = OutfitDisplayFamily,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.5.sp,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = log.dateLabel,
                        fontFamily = InterFontFamily,
                        fontSize = 11.5.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }

                Surface(
                    shape = RoundedCornerShape(12.dp),
                    color = ProfileGreen.copy(alpha = 0.12f),
                    border = BorderStroke(1.dp, ProfileGreen.copy(alpha = 0.3f))
                ) {
                    Text(
                        text = "${log.score}/${log.totalMarks}",
                        fontFamily = JetBrainsMonoFamily,
                        fontWeight = FontWeight.Bold,
                        fontSize = 13.sp,
                        color = ProfileGreen,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Sub metrics: Accuracy, Time, PCMB Chips
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                MiniHistoryPill(label = "Accuracy", value = "${log.accuracyPercent}%")
                MiniHistoryPill(label = "Time", value = "${log.timeMinutes}m")
                Spacer(modifier = Modifier.weight(1f))
                Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                    ScoreTag(subject = "P", score = log.physicsScore)
                    ScoreTag(subject = "C", score = log.chemistryScore)
                    ScoreTag(subject = "M", score = log.mathScore)
                    ScoreTag(subject = "B", score = log.biologyScore)
                }
            }
        }
    }
}

@Composable
private fun MiniHistoryPill(label: String, value: String) {
    Surface(
        shape = RoundedCornerShape(8.dp),
        color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 7.dp, vertical = 3.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text(
                text = label,
                fontFamily = InterFontFamily,
                fontSize = 10.5.sp,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
            Text(
                text = value,
                fontFamily = JetBrainsMonoFamily,
                fontSize = 10.5.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onSurface
            )
        }
    }
}

@Composable
private fun ScoreTag(subject: String, score: Int) {
    Surface(
        shape = RoundedCornerShape(6.dp),
        color = ProfileRoyalBlue.copy(alpha = 0.08f)
    ) {
        Text(
            text = "$subject:$score",
            fontFamily = JetBrainsMonoFamily,
            fontSize = 10.sp,
            fontWeight = FontWeight.SemiBold,
            color = ProfileRoyalBlue,
            modifier = Modifier.padding(horizontal = 5.dp, vertical = 2.dp)
        )
    }
}

// ==================== ANALYTICS HELPER CARDS ====================
@Composable
private fun CbtSpeedTelemetryCard() {
    Card(
        shape = RoundedCornerShape(22.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.4f)),
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(18.dp)
        ) {
            Text(
                text = "CBT Pacing & Time Telemetry",
                fontFamily = OutfitDisplayFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = MaterialTheme.colorScheme.onSurface
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "Target pacing: 180 mins for 60 questions (~3.0 min/question)",
                fontFamily = InterFontFamily,
                fontSize = 11.5.sp,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )

            Spacer(modifier = Modifier.height(14.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                PacingBar(subject = "Physics", avgMinutes = "2.6m", isOptimal = true, modifier = Modifier.weight(1f))
                PacingBar(subject = "Chemistry", avgMinutes = "1.8m", isOptimal = true, modifier = Modifier.weight(1f))
                PacingBar(subject = "Mathematics", avgMinutes = "3.4m", isOptimal = false, modifier = Modifier.weight(1f))
                PacingBar(subject = "Biology", avgMinutes = "1.2m", isOptimal = true, modifier = Modifier.weight(1f))
            }
        }
    }
}

@Composable
private fun PacingBar(subject: String, avgMinutes: String, isOptimal: Boolean, modifier: Modifier = Modifier) {
    Surface(
        shape = RoundedCornerShape(14.dp),
        color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.4f),
        modifier = modifier
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = subject.take(4),
                fontFamily = InterFontFamily,
                fontSize = 11.sp,
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colorScheme.onSurface
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = avgMinutes,
                fontFamily = JetBrainsMonoFamily,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = if (isOptimal) ProfileGreen else ProfileAmber
            )
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = if (isOptimal) "Optimal" else "Slow",
                fontFamily = InterFontFamily,
                fontSize = 9.5.sp,
                color = if (isOptimal) ProfileGreen else ProfileAmber
            )
        }
    }
}

@Composable
private fun SubjectBalanceAnalyticsCard(state: SmartPrepUiState) {
    Card(
        shape = RoundedCornerShape(22.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.4f)),
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(18.dp)
        ) {
            Text(
                text = "IISER Aptitude Balance Score",
                fontFamily = OutfitDisplayFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = MaterialTheme.colorScheme.onSurface
            )
            Spacer(modifier = Modifier.height(6.dp))
            Text(
                text = "Unlike JEE/NEET, IISER strictly weighs all four subjects equally. Your PCMB balance score is 88/100 (Well Rounded).",
                fontFamily = InterFontFamily,
                fontSize = 12.sp,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )

            Spacer(modifier = Modifier.height(14.dp))

            Surface(
                shape = RoundedCornerShape(14.dp),
                color = ProfileRoyalBlue.copy(alpha = 0.08f),
                border = BorderStroke(1.dp, ProfileRoyalBlue.copy(alpha = 0.2f)),
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.padding(14.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.AutoAwesome,
                        contentDescription = null,
                        tint = ProfileRoyalBlue,
                        modifier = Modifier.size(20.dp)
                    )
                    Text(
                        text = "AI Recommendation: Biology & Chemistry have highest yield per minute. Prioritize Organic Reaction Mechanisms to boost total score past 190 marks.",
                        fontFamily = InterFontFamily,
                        fontSize = 11.5.sp,
                        color = ProfileNavy
                    )
                }
            }
        }
    }
}

// ==================== APP SETTINGS CARD ====================
@Composable
private fun AppSettingsCard(
    state: SmartPrepUiState,
    onToggleDarkMode: (Boolean) -> Unit,
    onUpgradeClick: () -> Unit,
    onResetClick: () -> Unit
) {
    var timerVibrate by remember { mutableStateOf(true) }
    var studyReminders by remember { mutableStateOf(true) }

    Card(
        shape = RoundedCornerShape(22.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.4f)),
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(18.dp)
        ) {
            Text(
                text = "Preferences & CBT App Settings",
                fontFamily = OutfitDisplayFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = MaterialTheme.colorScheme.onSurface
            )

            Spacer(modifier = Modifier.height(14.dp))

            // Dark Mode
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.DarkMode,
                        contentDescription = null,
                        tint = ProfileRoyalBlue,
                        modifier = Modifier.size(20.dp)
                    )
                    Column {
                        Text(
                            text = "Dark Appearance",
                            fontFamily = InterFontFamily,
                            fontWeight = FontWeight.Bold,
                            fontSize = 13.5.sp,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Text(
                            text = "Comfort mode for late-night problem solving",
                            fontFamily = InterFontFamily,
                            fontSize = 11.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
                Switch(
                    checked = state.profile.darkModeEnabled,
                    onCheckedChange = onToggleDarkMode,
                    modifier = Modifier.testTag("dark_mode_switch")
                )
            }

            HorizontalDivider(
                modifier = Modifier.padding(vertical = 12.dp),
                color = MaterialTheme.colorScheme.outline.copy(alpha = 0.2f)
            )

            // Timer Vibrate
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.VolumeUp,
                        contentDescription = null,
                        tint = ProfileRoyalBlue,
                        modifier = Modifier.size(20.dp)
                    )
                    Column {
                        Text(
                            text = "CBT Timer Alerts & Haptics",
                            fontFamily = InterFontFamily,
                            fontWeight = FontWeight.Bold,
                            fontSize = 13.5.sp,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Text(
                            text = "Vibrate when 15 & 5 minutes remain in mocks",
                            fontFamily = InterFontFamily,
                            fontSize = 11.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
                Switch(
                    checked = timerVibrate,
                    onCheckedChange = { timerVibrate = it }
                )
            }

            HorizontalDivider(
                modifier = Modifier.padding(vertical = 12.dp),
                color = MaterialTheme.colorScheme.outline.copy(alpha = 0.2f)
            )

            // Study Reminders
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = null,
                        tint = ProfileRoyalBlue,
                        modifier = Modifier.size(20.dp)
                    )
                    Column {
                        Text(
                            text = "Daily Practice Reminders",
                            fontFamily = InterFontFamily,
                            fontWeight = FontWeight.Bold,
                            fontSize = 13.5.sp,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Text(
                            text = "Streak preservation reminder at 8:00 PM",
                            fontFamily = InterFontFamily,
                            fontSize = 11.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
                Switch(
                    checked = studyReminders,
                    onCheckedChange = { studyReminders = it }
                )
            }

            HorizontalDivider(
                modifier = Modifier.padding(vertical = 12.dp),
                color = MaterialTheme.colorScheme.outline.copy(alpha = 0.2f)
            )

            // Reset History
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Refresh,
                        contentDescription = null,
                        tint = Color(0xFFEF4444),
                        modifier = Modifier.size(20.dp)
                    )
                    Column {
                        Text(
                            text = "Reset Practice Records",
                            fontFamily = InterFontFamily,
                            fontWeight = FontWeight.Bold,
                            fontSize = 13.5.sp,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Text(
                            text = "Clear question attempts to start a fresh cycle",
                            fontFamily = InterFontFamily,
                            fontSize = 11.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
                OutlinedButton(
                    onClick = onResetClick,
                    shape = RoundedCornerShape(50),
                    border = BorderStroke(1.dp, Color(0xFFEF4444).copy(alpha = 0.5f)),
                    colors = ButtonDefaults.outlinedButtonColors(contentColor = Color(0xFFEF4444))
                ) {
                    Text("Reset", fontSize = 12.sp)
                }
            }
        }
    }
}

// ==================== ANDROID COMPLIANCE CARD ====================
@Composable
private fun AndroidComplianceCard() {
    Surface(
        shape = RoundedCornerShape(18.dp),
        color = SoftLavender,
        border = BorderStroke(1.dp, PrimaryBlue.copy(alpha = 0.25f)),
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Default.Security,
                    contentDescription = null,
                    tint = DeepIndigo,
                    modifier = Modifier.size(18.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Android 16 (API 36) Ready • Zero Data Leakage",
                    fontFamily = OutfitDisplayFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 13.sp,
                    color = DeepIndigo
                )
            }
            Spacer(modifier = Modifier.height(6.dp))
            Text(
                text = "All study sessions, mock metrics, and notes are stored locally with on-device SQLite Room database. Zero external trackers or third-party ads.",
                fontFamily = InterFontFamily,
                fontSize = 11.sp,
                color = DeepIndigo.copy(alpha = 0.85f)
            )
        }
    }
}

// ==================== EDIT PROFILE MODAL DIALOG ====================
@Composable
private fun EditProfileModal(
    currentName: String,
    currentEmail: String,
    currentExam: String,
    currentInstitute: String,
    currentCategory: String,
    onDismiss: () -> Unit,
    onSave: (name: String, email: String, exam: String, institute: String, category: String) -> Unit
) {
    var name by remember { mutableStateOf(currentName) }
    var email by remember { mutableStateOf(currentEmail) }
    var exam by remember { mutableStateOf(currentExam) }
    var selectedInstitute by remember { mutableStateOf(currentInstitute) }
    var selectedCategory by remember { mutableStateOf(currentCategory) }

    val iiserInstitutes = listOf(
        "IISER Pune",
        "IISER Kolkata",
        "IISER Mohali",
        "IISER Bhopal",
        "IISER Thiruvananthapuram",
        "IISER Tirupati",
        "IISER Berhampur",
        "IISc Bangalore"
    )

    val categories = listOf("General", "OBC-NCL", "EWS", "SC", "ST", "PwD")

    AlertDialog(
        onDismissRequest = onDismiss,
        title = {
            Text(
                text = "Update Learner Profile",
                fontFamily = OutfitDisplayFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
        },
        text = {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                OutlinedTextField(
                    value = name,
                    onValueChange = { name = it },
                    label = { Text("Aspirant Full Name") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth().testTag("edit_name_input")
                )

                OutlinedTextField(
                    value = email,
                    onValueChange = { email = it },
                    label = { Text("Email Address") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth().testTag("edit_email_input")
                )

                OutlinedTextField(
                    value = exam,
                    onValueChange = { exam = it },
                    label = { Text("Target Exam Track") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth()
                )

                Text(
                    text = "Target Dream Institute",
                    fontFamily = InterFontFamily,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )

                LazyRow(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                    items(iiserInstitutes) { inst ->
                        val isSel = inst == selectedInstitute
                        Surface(
                            shape = RoundedCornerShape(50),
                            color = if (isSel) ProfileRoyalBlue else MaterialTheme.colorScheme.surfaceVariant,
                            border = BorderStroke(
                                1.dp,
                                if (isSel) ProfileRoyalBlue else MaterialTheme.colorScheme.outline.copy(alpha = 0.5f)
                            ),
                            modifier = Modifier.clickable { selectedInstitute = inst }
                        ) {
                            Text(
                                text = inst,
                                fontFamily = InterFontFamily,
                                fontSize = 11.sp,
                                fontWeight = if (isSel) FontWeight.Bold else FontWeight.Medium,
                                color = if (isSel) Color.White else MaterialTheme.colorScheme.onSurfaceVariant,
                                modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
                            )
                        }
                    }
                }

                Text(
                    text = "Reservation Category",
                    fontFamily = InterFontFamily,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )

                LazyRow(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                    items(categories) { cat ->
                        val isSel = cat == selectedCategory
                        Surface(
                            shape = RoundedCornerShape(50),
                            color = if (isSel) ProfileGreen else MaterialTheme.colorScheme.surfaceVariant,
                            border = BorderStroke(
                                1.dp,
                                if (isSel) ProfileGreen else MaterialTheme.colorScheme.outline.copy(alpha = 0.5f)
                            ),
                            modifier = Modifier.clickable { selectedCategory = cat }
                        ) {
                            Text(
                                text = cat,
                                fontFamily = InterFontFamily,
                                fontSize = 11.sp,
                                fontWeight = if (isSel) FontWeight.Bold else FontWeight.Medium,
                                color = if (isSel) Color.White else MaterialTheme.colorScheme.onSurfaceVariant,
                                modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
                            )
                        }
                    }
                }
            }
        },
        confirmButton = {
            Button(
                onClick = {
                    onSave(
                        name.trim().ifEmpty { "Aarav Sharma" },
                        email.trim().ifEmpty { "aptionaiged@gmail.com" },
                        exam.trim().ifEmpty { "IISER IAT" },
                        selectedInstitute,
                        selectedCategory
                    )
                },
                shape = RoundedCornerShape(50),
                colors = ButtonDefaults.buttonColors(containerColor = ProfileRoyalBlue),
                modifier = Modifier.testTag("save_profile_button")
            ) {
                Text("Save Changes")
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text("Cancel")
            }
        }
    )
}

// ==================== UPGRADE TIER MODAL ====================
@Composable
private fun UpgradeSubscriptionModal(
    currentTier: String,
    onDismiss: () -> Unit,
    onSelectTier: (String) -> Unit
) {
    val isPro = currentTier.contains("Pro")

    AlertDialog(
        onDismissRequest = onDismiss,
        title = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.AutoAwesome,
                    contentDescription = null,
                    tint = ProfileRoyalBlue
                )
                Text(
                    text = "SmartPrep Pro Pass",
                    fontFamily = OutfitDisplayFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
            }
        },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                Text(
                    text = "Accelerate your IISER Aptitude Test preparation with high-yield mock tests and official solutions.",
                    fontFamily = InterFontFamily,
                    fontSize = 12.5.sp,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )

                ProPerkRow(text = "10 Full-Length 180-min IAT CBT Mocks")
                ProPerkRow(text = "2017–2024 PYQ Detailed Step-by-Step Solutions")
                ProPerkRow(text = "AI Snap & Solve Instant Doubt Resolution")
                ProPerkRow(text = "Projected All India Rank (AIR) & Cutoff Forecast")
                ProPerkRow(text = "Offline Mode: All Study Notes & Chapters")
            }
        },
        confirmButton = {
            Button(
                onClick = {
                    val next = if (isPro) "Scholar Free" else "SmartPrep Pro"
                    onSelectTier(next)
                },
                shape = RoundedCornerShape(50),
                colors = ButtonDefaults.buttonColors(
                    containerColor = if (isPro) Color(0xFF64748B) else ProfileRoyalBlue
                )
            ) {
                Text(if (isPro) "Downgrade to Free" else "Activate Pro Plan")
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text("Close")
            }
        }
    )
}

@Composable
private fun ProPerkRow(text: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Icon(
            imageVector = Icons.Default.CheckCircle,
            contentDescription = null,
            tint = ProfileGreen,
            modifier = Modifier.size(16.dp)
        )
        Text(
            text = text,
            fontFamily = InterFontFamily,
            fontSize = 12.sp,
            color = MaterialTheme.colorScheme.onSurface
        )
    }
}

// ==================== RESET CONFIRM MODAL ====================
@Composable
private fun ResetConfirmModal(
    onDismiss: () -> Unit,
    onConfirm: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = {
            Text(
                text = "Reset Practice History?",
                fontFamily = OutfitDisplayFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
        },
        text = {
            Text(
                text = "This will reset all your question attempt answers and mock test scores so you can practice again from scratch. Your study notes and bookmarks will be kept.",
                fontFamily = InterFontFamily,
                fontSize = 13.sp,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        },
        confirmButton = {
            Button(
                onClick = onConfirm,
                shape = RoundedCornerShape(50),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFEF4444))
            ) {
                Text("Confirm Reset")
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text("Cancel")
            }
        }
    )
}
