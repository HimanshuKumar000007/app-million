package com.example.ui.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
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
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.automirrored.filled.MenuBook
import androidx.compose.material.icons.automirrored.outlined.MenuBook
import androidx.compose.material.icons.filled.Biotech
import androidx.compose.material.icons.filled.Bolt
import androidx.compose.material.icons.filled.Calculate
import androidx.compose.material.icons.filled.CloudOff
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.HistoryEdu
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Quiz
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.Science
import androidx.compose.material.icons.outlined.AssignmentTurnedIn
import androidx.compose.material.icons.outlined.HistoryEdu
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.BottomNavTab
import com.example.ui.theme.BiologyEmerald
import com.example.ui.theme.BorderColor
import com.example.ui.theme.CardBackground
import com.example.ui.theme.CharcoalSelected
import com.example.ui.theme.ChemistryTeal
import com.example.ui.theme.DeepIndigo
import com.example.ui.theme.InterFontFamily
import com.example.ui.theme.JetBrainsMonoFamily
import com.example.ui.theme.MathBlue
import com.example.ui.theme.MutedIconGray
import com.example.ui.theme.OutfitDisplayFamily
import com.example.ui.theme.PhysicsPurple
import com.example.ui.theme.PlusJakartaSansFamily
import com.example.ui.theme.PrimaryBlue
import com.example.ui.theme.PrimaryText
import com.example.ui.theme.SecondaryText
import com.example.ui.theme.SoftLavender

fun subjectAccentColor(subject: String): Color = when (subject.lowercase()) {
    "mathematics" -> MathBlue
    "physics" -> PhysicsPurple
    "chemistry" -> ChemistryTeal
    "biology" -> BiologyEmerald
    else -> PrimaryBlue
}

fun subjectIcon(subject: String): ImageVector = when (subject.lowercase()) {
    "mathematics" -> Icons.Default.Calculate
    "physics" -> Icons.Default.Bolt
    "chemistry" -> Icons.Default.Science
    "biology" -> Icons.Default.Biotech
    else -> Icons.Default.School
}

/**
 * Exact Reference Screenshot Top Header:
 * Left: Vertical 5-bar cylindrical book-spine logo + clean lowercase/geometric wordmark "smartprep"
 * Right: Large translucent dark-periwinkle circular profile button with white outline person icon
 */
@Composable
fun AppHeader(
    userName: String,
    streakDays: Int,
    xpPoints: Int,
    onProfileClick: () -> Unit,
    onNotificationClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        // Left: Glassmorphic Science Prism Emblem + dual-weight "smartprep" wordmark + sleek "IISER" pill
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .clickable { onNotificationClick() }
                .testTag("header_brand_logo")
        ) {
            // Frosted Glass Squircle with Custom Science Book-Prism & Orbital Spark Emblem
            Surface(
                shape = RoundedCornerShape(10.dp),
                color = Color.White.copy(alpha = 0.18f),
                border = BorderStroke(1.dp, Color.White.copy(alpha = 0.42f)),
                modifier = Modifier.size(34.dp)
            ) {
                Canvas(modifier = Modifier.fillMaxSize()) {
                    val cx = size.width / 2f
                    val cy = size.height / 2f

                    // Ascending geometric prism / book-spine bars with crisp rounded caps
                    val barW = 3.2.dp.toPx()
                    val gap = 2.4.dp.toPx()
                    val heights = listOf(11.dp.toPx(), 16.dp.toPx(), 20.dp.toPx(), 15.dp.toPx())
                    val totalW = heights.size * barW + (heights.size - 1) * gap
                    var startX = cx - totalW / 2f

                    for (i in heights.indices) {
                        val h = heights[i]
                        val topY = cy - h / 2f + 1.dp.toPx()
                        drawRoundRect(
                            color = if (i == 2) Color(0xFFFFE082) else Color.White,
                            topLeft = Offset(startX, topY),
                            size = Size(barW, h),
                            cornerRadius = CornerRadius(barW / 2f, barW / 2f)
                        )
                        startX += barW + gap
                    }

                    // Top glowing science spark dot above the 3rd bar
                    drawCircle(
                        color = Color.White,
                        radius = 1.7.dp.toPx(),
                        center = Offset(cx + (barW + gap) * 0.5f, cy - 11.5.dp.toPx())
                    )
                }
            }

            Spacer(modifier = Modifier.width(10.dp))

            // Refined geometric wordmark: "smartprep" in OutfitDisplayFamily
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = "smart",
                    fontFamily = OutfitDisplayFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 22.sp,
                    letterSpacing = (-0.25).sp,
                    color = Color.White.copy(alpha = 0.92f)
                )
                Text(
                    text = "prep",
                    fontFamily = OutfitDisplayFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 22.sp,
                    letterSpacing = (-0.3).sp,
                    color = Color.White
                )
            }

            Spacer(modifier = Modifier.width(8.dp))

            // Sleek horizontal capsule badge for "IISER" in JetBrainsMonoFamily
            Surface(
                color = Color.White.copy(alpha = 0.20f),
                shape = RoundedCornerShape(50),
                border = BorderStroke(1.dp, Color.White.copy(alpha = 0.42f))
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .size(4.5.dp)
                            .clip(CircleShape)
                            .background(Color(0xFFFFE082))
                    )
                    Text(
                        text = "IISER",
                        fontFamily = JetBrainsMonoFamily,
                        fontWeight = FontWeight.Normal,
                        fontSize = 9.5.sp,
                        lineHeight = 10.sp,
                        letterSpacing = 0.8.sp,
                        color = Color.White
                    )
                }
            }
        }

        // Right: Translucent periwinkle circle button with minimalist outline Person icon
        Surface(
            onClick = onProfileClick,
            shape = CircleShape,
            color = Color(0xFF4965BA).copy(alpha = 0.55f),
            border = BorderStroke(1.dp, Color.White.copy(alpha = 0.22f)),
            modifier = Modifier
                .size(42.dp)
                .testTag("header_profile_button")
        ) {
            Box(contentAlignment = Alignment.Center) {
                Icon(
                    imageVector = Icons.Outlined.Person,
                    contentDescription = "Profile ($userName, $xpPoints XP, $streakDays day streak)",
                    tint = Color.White,
                    modifier = Modifier.size(21.dp)
                )
            }
        }
    }
}

data class FeaturedCircleItem(
    val id: String,
    val label: String,
    val badgeInitials: String,
    val topGrad: Color,
    val bottomGrad: Color,
    val accentColor: Color,
    val icon: ImageVector
)

/**
 * Exact Reference Screenshot Horizontal Circle Row:
 * Large 74dp circular avatars with crisp white outer ring + inner portrait/science badge + 1-line white caption underneath
 */
@Composable
fun FeaturedScienceStrip(
    selectedSubject: String,
    selectedExamFilter: String,
    onSelectSubject: (String) -> Unit,
    onSelectExam: (String) -> Unit,
    onOpenSnapSolve: () -> Unit,
    modifier: Modifier = Modifier
) {
    val items = listOf(
        FeaturedCircleItem(
            id = "Mathematics",
            label = "Maths, IISER-P",
            badgeInitials = "∫dx",
            topGrad = Color(0xFF2B4C7E),
            bottomGrad = Color(0xFF1A3158),
            accentColor = Color(0xFFFFD84D),
            icon = Icons.Default.Calculate
        ),
        FeaturedCircleItem(
            id = "Physics",
            label = "Physics, IISER-K",
            badgeInitials = "ℏω",
            topGrad = Color(0xFF3A6B88),
            bottomGrad = Color(0xFF1E3F54),
            accentColor = Color(0xFF7DD3FC),
            icon = Icons.Default.Bolt
        ),
        FeaturedCircleItem(
            id = "Chemistry",
            label = "Chem, IISc-B",
            badgeInitials = "ΔG°",
            topGrad = Color(0xFF2E5A44),
            bottomGrad = Color(0xFF193829),
            accentColor = Color(0xFF6EE7B7),
            icon = Icons.Default.Science
        ),
        FeaturedCircleItem(
            id = "Biology",
            label = "Bio, IISER-M",
            badgeInitials = "DNA",
            topGrad = Color(0xFF4E4376),
            bottomGrad = Color(0xFF2B2347),
            accentColor = Color(0xFFFDA4AF),
            icon = Icons.Default.Biotech
        ),
        FeaturedCircleItem(
            id = "IISER IAT",
            label = "IAT, IISER-T",
            badgeInitials = "AIR",
            topGrad = Color(0xFF5C4B28),
            bottomGrad = Color(0xFF362B14),
            accentColor = Color(0xFFFDE68A),
            icon = Icons.Default.EmojiEvents
        )
    )

    LazyRow(
        modifier = modifier
            .fillMaxWidth()
            .testTag("featured_science_strip"),
        contentPadding = PaddingValues(horizontal = 18.dp, vertical = 6.dp),
        horizontalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        items(items, key = { it.id }) { item ->
            val isSelected = item.id.equals(selectedSubject, ignoreCase = true) ||
                item.id.equals(selectedExamFilter, ignoreCase = true)

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .width(82.dp)
                    .clickable {
                        when (item.id) {
                            "Mathematics", "Physics", "Chemistry", "Biology" -> onSelectSubject(item.id)
                            "IISER IAT" -> onSelectExam(if (selectedExamFilter == "IISER IAT") "All" else "IISER IAT")
                        }
                    }
                    .testTag("featured_strip_${item.id.lowercase().replace(" ", "_")}")
            ) {
                // White outer ring + inner circular avatar
                Box(
                    modifier = Modifier
                        .size(76.dp)
                        .clip(CircleShape)
                        .background(Color.White)
                        .padding(3.dp)
                        .clip(CircleShape)
                        .background(Color(0xFF5C7CE6))
                        .padding(2.dp)
                        .clip(CircleShape)
                        .background(
                            Brush.verticalGradient(
                                colors = listOf(item.topGrad, item.bottomGrad)
                            )
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    // Stylised Mentor / Science Portrait Silhouette + Formula Badge
                    Canvas(modifier = Modifier.fillMaxSize()) {
                        // Subtle sunlit backdrop glow
                        drawCircle(
                            color = item.accentColor.copy(alpha = 0.22f),
                            radius = size.minDimension * 0.36f,
                            center = Offset(size.width * 0.7f, size.height * 0.3f)
                        )
                        // Shoulders silhouette
                        drawOval(
                            color = Color.White.copy(alpha = 0.16f),
                            topLeft = Offset(size.width * 0.15f, size.height * 0.62f),
                            size = Size(size.width * 0.70f, size.height * 0.55f)
                        )
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(
                            imageVector = item.icon,
                            contentDescription = item.label,
                            tint = item.accentColor,
                            modifier = Modifier.size(24.dp)
                        )
                        Text(
                            text = item.badgeInitials,
                            fontFamily = PlusJakartaSansFamily,
                            fontWeight = FontWeight.Bold,
                            fontSize = 11.sp,
                            color = Color.White
                        )
                    }
                }

                Spacer(modifier = Modifier.height(7.dp))

                Text(
                    text = item.label,
                    fontFamily = InterFontFamily,
                    fontWeight = if (isSelected) FontWeight.SemiBold else FontWeight.Normal,
                    fontSize = 13.sp,
                    color = Color.White,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

/**
 * Exact Reference Screenshot Subject Selector:
 * Horizontally scrollable pills where the selected subject ("Mathematics") is solid charcoal-black (#14171F)
 * with white text, and unselected subjects ("Physics", "Chemistry", "Biology", "IISER IAT") have a white
 * background with a subtle light border (#E2E5EE) and dark text (#14171F).
 */
@Composable
fun SubjectSelector(
    selectedSubject: String,
    selectedExamFilter: String,
    onSelectSubject: (String) -> Unit,
    onSelectExamFilter: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val subjects = listOf("Mathematics", "Physics", "Chemistry", "Biology")

    Row(
        modifier = modifier
            .fillMaxWidth()
            .horizontalScroll(rememberScrollState())
            .padding(horizontal = 20.dp)
            .testTag("subject_selector_row"),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        subjects.forEach { subject ->
            val isSelected = subject.equals(selectedSubject, ignoreCase = true)
            val accent = subjectAccentColor(subject)
            val bgColor by animateColorAsState(
                targetValue = if (isSelected) CharcoalSelected else Color(0xFFF6F8FD),
                label = "pillBg"
            )
            val textColor by animateColorAsState(
                targetValue = if (isSelected) Color.White else PrimaryText,
                label = "pillText"
            )

            Surface(
                onClick = { onSelectSubject(subject) },
                shape = RoundedCornerShape(50),
                color = bgColor,
                shadowElevation = if (isSelected) 3.dp else 0.dp,
                border = if (isSelected) null else BorderStroke(1.dp, Color(0xFFE0E6F4)),
                modifier = Modifier
                    .height(40.dp)
                    .testTag("subject_pill_${subject.lowercase()}")
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(7.dp),
                    modifier = Modifier.padding(horizontal = 15.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .size(7.dp)
                            .clip(CircleShape)
                            .background(if (isSelected) accent else accent.copy(alpha = 0.75f))
                    )
                    Text(
                        text = subject,
                        fontFamily = OutfitDisplayFamily,
                        fontWeight = FontWeight.Normal,
                        fontSize = 13.5.sp,
                        color = textColor
                    )
                }
            }
        }

        // Trailing Exam Filter Pill ("Track: IISER IAT" / "Track: All PCMB")
        val examLabel = when (selectedExamFilter) {
            "IISER IAT" -> "Track: IAT Core"
            else -> "Track: IISER IAT"
        }
        Surface(
            onClick = {
                val next = if (selectedExamFilter == "All") "IISER IAT" else "All"
                onSelectExamFilter(next)
            },
            shape = RoundedCornerShape(50),
            color = if (selectedExamFilter != "All") SoftLavender else Color(0xFFF6F8FD),
            border = BorderStroke(
                1.dp,
                if (selectedExamFilter != "All") PrimaryBlue else Color(0xFFE0E6F4)
            ),
            modifier = Modifier
                .height(40.dp)
                .testTag("exam_filter_cycle_pill")
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.padding(horizontal = 15.dp)
            ) {
                Text(
                    text = examLabel,
                    fontFamily = InterFontFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.5.sp,
                    color = if (selectedExamFilter != "All") DeepIndigo else SecondaryText
                )
            }
        }
    }
}

@Composable
fun SectionHeader(
    title: String,
    subtitle: String? = null,
    actionLabel: String? = null,
    onActionClick: (() -> Unit)? = null,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = title,
                fontFamily = OutfitDisplayFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 19.sp,
                letterSpacing = (-0.25).sp,
                color = Color(0xFF1E293B)
            )
            if (!subtitle.isNullOrBlank()) {
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = subtitle,
                    fontFamily = InterFontFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 11.5.sp,
                    lineHeight = 15.sp,
                    color = Color(0xFF64748B),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
        if (actionLabel != null && onActionClick != null) {
            Spacer(modifier = Modifier.width(12.dp))
            Surface(
                onClick = onActionClick,
                shape = RoundedCornerShape(50),
                color = Color(0xFFF2F6FF),
                border = BorderStroke(1.dp, Color(0xFFD8E5FF)),
                modifier = Modifier.testTag("section_action_${title.lowercase().replace(" ", "_")}")
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 11.dp, vertical = 5.5.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Text(
                        text = actionLabel,
                        fontFamily = InterFontFamily,
                        fontWeight = FontWeight.Normal,
                        fontSize = 11.sp,
                        color = Color(0xFF2554D8)
                    )
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                        contentDescription = null,
                        tint = Color(0xFF2554D8),
                        modifier = Modifier.size(12.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun OfflineBanner(
    isOffline: Boolean,
    onRetryClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    if (!isOffline) return
    Surface(
        color = Color(0xFFFFFBEB),
        border = BorderStroke(1.dp, Color(0xFFF59E0B)),
        shape = RoundedCornerShape(14.dp),
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 8.dp)
            .testTag("offline_banner")
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 14.dp, vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.weight(1f)
            ) {
                Icon(
                    imageVector = Icons.Default.CloudOff,
                    contentDescription = "Offline Mode",
                    tint = Color(0xFFD97706),
                    modifier = Modifier.size(20.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Offline mode active — Study notes, PYQs & local progress are available.",
                    style = MaterialTheme.typography.bodySmall.copy(color = Color(0xFF92400E))
                )
            }
            TextButton(onClick = onRetryClick) {
                Icon(
                    imageVector = Icons.Default.Refresh,
                    contentDescription = "Retry network check",
                    tint = Color(0xFFB45309),
                    modifier = Modifier.size(16.dp)
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text("Check", style = MaterialTheme.typography.labelMedium, color = Color(0xFFB45309))
            }
        }
    }
}

@Composable
fun LoadingSkeleton(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        repeat(3) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(140.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .background(CardBackground)
            )
        }
    }
}

@Composable
fun EmptyStateCard(
    title: String,
    description: String,
    actionLabel: String,
    onActionClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = CardBackground),
        elevation = CardDefaults.cardElevation(defaultElevation = 0.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = description,
                style = MaterialTheme.typography.bodySmall,
                color = SecondaryText,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(14.dp))
            Button(
                onClick = onActionClick,
                shape = RoundedCornerShape(50),
                colors = ButtonDefaults.buttonColors(containerColor = CharcoalSelected)
            ) {
                Text(actionLabel)
            }
        }
    }
}

/**
 * Clean Minimalist Bottom Navigation Bar with Bespoke Rounded Vector Icons:
 * Inspired by the reference aesthetic (airy full-width white surface, subtle top hairline,
 * solid dark-ink filled icon with white cutout detail when active, and crisp 1.8.dp rounded
 * line-art icons when inactive), tailored to Home, Notes, Mocks, PYQs, and Profile.
 */
@Composable
fun SmartPrepBottomNavigation(
    currentTab: BottomNavTab,
    onSelectTab: (BottomNavTab) -> Unit,
    modifier: Modifier = Modifier
) {
    val items = listOf(
        BottomNavTab.HOME to "Home",
        BottomNavTab.LEARN to "Notes",
        BottomNavTab.PRACTICE to "Mocks",
        BottomNavTab.PYQS to "PYQs",
        BottomNavTab.PROFILE to "Profile"
    )

    Surface(
        color = Color.White,
        tonalElevation = 0.dp,
        shadowElevation = 0.dp,
        modifier = modifier
            .fillMaxWidth()
            .testTag("bottom_navigation_bar")
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            HorizontalDivider(thickness = 1.dp, color = Color(0xFFECEFF5))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .windowInsetsPadding(WindowInsets.navigationBars)
                    .padding(horizontal = 8.dp, vertical = 9.dp),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                items.forEach { (tab, displayLabel) ->
                    val isSelected = tab == currentTab
                    val activeInk = Color(0xFF191D26)
                    val inactiveStroke = Color(0xFF5C626E)

                    val tintColor by animateColorAsState(
                        targetValue = if (isSelected) activeInk else inactiveStroke,
                        label = "nav_tint"
                    )
                    val itemScale by animateFloatAsState(
                        targetValue = if (isSelected) 1.04f else 1f,
                        animationSpec = spring(
                            dampingRatio = Spring.DampingRatioMediumBouncy,
                            stiffness = Spring.StiffnessMediumLow
                        ),
                        label = "nav_scale"
                    )

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .weight(1f)
                            .clip(RoundedCornerShape(14.dp))
                            .clickable { onSelectTab(tab) }
                            .padding(vertical = 3.dp)
                            .graphicsLayer {
                                scaleX = itemScale
                                scaleY = itemScale
                            }
                            .testTag("bottom_nav_${tab.route}")
                    ) {
                        BespokeNavIcon(
                            tab = tab,
                            isSelected = isSelected,
                            color = tintColor,
                            modifier = Modifier.size(24.dp)
                        )

                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = displayLabel,
                            fontFamily = OutfitDisplayFamily,
                            fontWeight = FontWeight.Normal,
                            fontSize = 11.8.sp,
                            letterSpacing = 0.1.sp,
                            color = tintColor,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun BespokeNavIcon(
    tab: BottomNavTab,
    isSelected: Boolean,
    color: Color,
    modifier: Modifier = Modifier
) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height
        val strokeW = 1.75.dp.toPx()
        val strokeStyle = androidx.compose.ui.graphics.drawscope.Stroke(
            width = strokeW,
            cap = androidx.compose.ui.graphics.StrokeCap.Round,
            join = androidx.compose.ui.graphics.StrokeJoin.Round
        )

        when (tab) {
            BottomNavTab.HOME -> {
                // Rounded pentagon house with a horizontal bottom dash cutout
                val housePath = androidx.compose.ui.graphics.Path().apply {
                    moveTo(w * 0.50f, h * 0.12f)
                    lineTo(w * 0.86f, h * 0.42f)
                    lineTo(w * 0.86f, h * 0.80f)
                    quadraticTo(w * 0.86f, h * 0.88f, w * 0.76f, h * 0.88f)
                    lineTo(w * 0.24f, h * 0.88f)
                    quadraticTo(w * 0.14f, h * 0.88f, w * 0.14f, h * 0.80f)
                    lineTo(w * 0.14f, h * 0.42f)
                    close()
                }
                if (isSelected) {
                    drawPath(path = housePath, color = color)
                    // Crisp white horizontal slot near the base (like the reference Home icon)
                    drawLine(
                        color = Color.White,
                        start = Offset(w * 0.34f, h * 0.72f),
                        end = Offset(w * 0.66f, h * 0.72f),
                        strokeWidth = 2.dp.toPx(),
                        cap = androidx.compose.ui.graphics.StrokeCap.Round
                    )
                } else {
                    drawPath(path = housePath, color = color, style = strokeStyle)
                    drawLine(
                        color = color,
                        start = Offset(w * 0.36f, h * 0.70f),
                        end = Offset(w * 0.64f, h * 0.70f),
                        strokeWidth = strokeW,
                        cap = androidx.compose.ui.graphics.StrokeCap.Round
                    )
                }
            }

            BottomNavTab.LEARN -> {
                // Rounded book/notebook icon with spine fold at bottom and 2 inner lines
                val r = 4.dp.toPx()
                if (isSelected) {
                    drawRoundRect(
                        color = color,
                        topLeft = Offset(w * 0.18f, h * 0.10f),
                        size = Size(w * 0.64f, h * 0.80f),
                        cornerRadius = CornerRadius(r, r)
                    )
                    drawLine(
                        color = Color.White,
                        start = Offset(w * 0.34f, h * 0.34f),
                        end = Offset(w * 0.66f, h * 0.34f),
                        strokeWidth = 1.7.dp.toPx(),
                        cap = androidx.compose.ui.graphics.StrokeCap.Round
                    )
                    drawLine(
                        color = Color.White,
                        start = Offset(w * 0.34f, h * 0.50f),
                        end = Offset(w * 0.56f, h * 0.50f),
                        strokeWidth = 1.7.dp.toPx(),
                        cap = androidx.compose.ui.graphics.StrokeCap.Round
                    )
                    drawLine(
                        color = Color.White,
                        start = Offset(w * 0.28f, h * 0.74f),
                        end = Offset(w * 0.72f, h * 0.74f),
                        strokeWidth = 1.6.dp.toPx(),
                        cap = androidx.compose.ui.graphics.StrokeCap.Round
                    )
                } else {
                    drawRoundRect(
                        color = color,
                        topLeft = Offset(w * 0.18f, h * 0.10f),
                        size = Size(w * 0.64f, h * 0.80f),
                        cornerRadius = CornerRadius(r, r),
                        style = strokeStyle
                    )
                    // Book bottom page crease line
                    drawLine(
                        color = color,
                        start = Offset(w * 0.22f, h * 0.74f),
                        end = Offset(w * 0.80f, h * 0.74f),
                        strokeWidth = strokeW,
                        cap = androidx.compose.ui.graphics.StrokeCap.Round
                    )
                    // 2 neat title dashes inside book cover
                    drawLine(
                        color = color,
                        start = Offset(w * 0.35f, h * 0.34f),
                        end = Offset(w * 0.65f, h * 0.34f),
                        strokeWidth = strokeW,
                        cap = androidx.compose.ui.graphics.StrokeCap.Round
                    )
                    drawLine(
                        color = color,
                        start = Offset(w * 0.35f, h * 0.48f),
                        end = Offset(w * 0.55f, h * 0.48f),
                        strokeWidth = strokeW,
                        cap = androidx.compose.ui.graphics.StrokeCap.Round
                    )
                }
            }

            BottomNavTab.PRACTICE -> {
                // Rounded Play/Arena triangle with soft corners (inspired by the center tab in reference)
                val triPath = androidx.compose.ui.graphics.Path().apply {
                    moveTo(w * 0.24f, h * 0.20f)
                    lineTo(w * 0.82f, h * 0.50f)
                    lineTo(w * 0.24f, h * 0.80f)
                    close()
                }
                if (isSelected) {
                    drawPath(path = triPath, color = color)
                    drawPath(path = triPath, color = color, style = strokeStyle)
                } else {
                    drawPath(path = triPath, color = color, style = strokeStyle)
                }
            }

            BottomNavTab.PYQS -> {
                // Rounded Clipboard / Exam Sheet with top clip and 2 checkmark rows
                val r = 4.5.dp.toPx()
                if (isSelected) {
                    drawRoundRect(
                        color = color,
                        topLeft = Offset(w * 0.17f, h * 0.14f),
                        size = Size(w * 0.66f, h * 0.76f),
                        cornerRadius = CornerRadius(r, r)
                    )
                    // Top clip pill
                    drawRoundRect(
                        color = Color.White,
                        topLeft = Offset(w * 0.36f, h * 0.18f),
                        size = Size(w * 0.28f, h * 0.10f),
                        cornerRadius = CornerRadius(2.dp.toPx(), 2.dp.toPx())
                    )
                    // Checkmark 1 + line
                    drawLine(
                        color = Color.White,
                        start = Offset(w * 0.30f, h * 0.46f),
                        end = Offset(w * 0.36f, h * 0.52f),
                        strokeWidth = 1.6.dp.toPx(),
                        cap = androidx.compose.ui.graphics.StrokeCap.Round
                    )
                    drawLine(
                        color = Color.White,
                        start = Offset(w * 0.36f, h * 0.52f),
                        end = Offset(w * 0.46f, h * 0.40f),
                        strokeWidth = 1.6.dp.toPx(),
                        cap = androidx.compose.ui.graphics.StrokeCap.Round
                    )
                    drawLine(
                        color = Color.White,
                        start = Offset(w * 0.54f, h * 0.46f),
                        end = Offset(w * 0.70f, h * 0.46f),
                        strokeWidth = 1.6.dp.toPx(),
                        cap = androidx.compose.ui.graphics.StrokeCap.Round
                    )
                    // Checkmark 2 + line
                    drawLine(
                        color = Color.White,
                        start = Offset(w * 0.30f, h * 0.68f),
                        end = Offset(w * 0.36f, h * 0.74f),
                        strokeWidth = 1.6.dp.toPx(),
                        cap = androidx.compose.ui.graphics.StrokeCap.Round
                    )
                    drawLine(
                        color = Color.White,
                        start = Offset(w * 0.36f, h * 0.74f),
                        end = Offset(w * 0.46f, h * 0.62f),
                        strokeWidth = 1.6.dp.toPx(),
                        cap = androidx.compose.ui.graphics.StrokeCap.Round
                    )
                    drawLine(
                        color = Color.White,
                        start = Offset(w * 0.54f, h * 0.68f),
                        end = Offset(w * 0.70f, h * 0.68f),
                        strokeWidth = 1.6.dp.toPx(),
                        cap = androidx.compose.ui.graphics.StrokeCap.Round
                    )
                } else {
                    drawRoundRect(
                        color = color,
                        topLeft = Offset(w * 0.17f, h * 0.14f),
                        size = Size(w * 0.66f, h * 0.76f),
                        cornerRadius = CornerRadius(r, r),
                        style = strokeStyle
                    )
                    // Top clip notch
                    drawRoundRect(
                        color = color,
                        topLeft = Offset(w * 0.36f, h * 0.10f),
                        size = Size(w * 0.28f, h * 0.12f),
                        cornerRadius = CornerRadius(2.dp.toPx(), 2.dp.toPx()),
                        style = strokeStyle
                    )
                    // Checkmark 1 + dash
                    drawLine(
                        color = color,
                        start = Offset(w * 0.30f, h * 0.46f),
                        end = Offset(w * 0.36f, h * 0.52f),
                        strokeWidth = strokeW,
                        cap = androidx.compose.ui.graphics.StrokeCap.Round
                    )
                    drawLine(
                        color = color,
                        start = Offset(w * 0.36f, h * 0.52f),
                        end = Offset(w * 0.46f, h * 0.40f),
                        strokeWidth = strokeW,
                        cap = androidx.compose.ui.graphics.StrokeCap.Round
                    )
                    drawLine(
                        color = color,
                        start = Offset(w * 0.55f, h * 0.46f),
                        end = Offset(w * 0.69f, h * 0.46f),
                        strokeWidth = strokeW,
                        cap = androidx.compose.ui.graphics.StrokeCap.Round
                    )
                    // Checkmark 2 + dash
                    drawLine(
                        color = color,
                        start = Offset(w * 0.30f, h * 0.68f),
                        end = Offset(w * 0.36f, h * 0.74f),
                        strokeWidth = strokeW,
                        cap = androidx.compose.ui.graphics.StrokeCap.Round
                    )
                    drawLine(
                        color = color,
                        start = Offset(w * 0.36f, h * 0.74f),
                        end = Offset(w * 0.46f, h * 0.62f),
                        strokeWidth = strokeW,
                        cap = androidx.compose.ui.graphics.StrokeCap.Round
                    )
                    drawLine(
                        color = color,
                        start = Offset(w * 0.55f, h * 0.68f),
                        end = Offset(w * 0.69f, h * 0.68f),
                        strokeWidth = strokeW,
                        cap = androidx.compose.ui.graphics.StrokeCap.Round
                    )
                }
            }

            BottomNavTab.PROFILE -> {
                // Minimalist rounded avatar head + shoulders arc
                if (isSelected) {
                    drawCircle(
                        color = color,
                        radius = w * 0.19f,
                        center = Offset(w * 0.50f, h * 0.32f)
                    )
                    val bodyPath = androidx.compose.ui.graphics.Path().apply {
                        moveTo(w * 0.18f, h * 0.86f)
                        quadraticTo(w * 0.18f, h * 0.58f, w * 0.50f, h * 0.58f)
                        quadraticTo(w * 0.82f, h * 0.58f, w * 0.82f, h * 0.86f)
                        close()
                    }
                    drawPath(path = bodyPath, color = color)
                } else {
                    drawCircle(
                        color = color,
                        radius = w * 0.18f,
                        center = Offset(w * 0.50f, h * 0.32f),
                        style = strokeStyle
                    )
                    val bodyArc = androidx.compose.ui.graphics.Path().apply {
                        moveTo(w * 0.20f, h * 0.84f)
                        quadraticTo(w * 0.20f, h * 0.58f, w * 0.50f, h * 0.58f)
                        quadraticTo(w * 0.80f, h * 0.58f, w * 0.80f, h * 0.84f)
                    }
                    drawPath(path = bodyArc, color = color, style = strokeStyle)
                }
            }
        }
    }
}


