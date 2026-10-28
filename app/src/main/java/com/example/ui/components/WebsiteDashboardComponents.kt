package com.example.ui.components

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.keyframes
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.automirrored.outlined.MenuBook
import androidx.compose.material.icons.automirrored.outlined.TrendingUp
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.Bolt
import androidx.compose.material.icons.filled.CalendarToday
import androidx.compose.material.icons.filled.CheckCircleOutline
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.LocalFireDepartment
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Psychology
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.material.icons.filled.ShowChart
import androidx.compose.material.icons.filled.WarningAmber
import androidx.compose.material.icons.outlined.Analytics
import androidx.compose.material.icons.outlined.Description
import androidx.compose.material.icons.outlined.Lightbulb
import androidx.compose.material.icons.outlined.Timer
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
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
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.withTransform
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.local.ChapterEntity
import com.example.data.local.MockTestEntity
import com.example.data.local.QuestionEntity
import com.example.data.local.StudyPlanTaskEntity
import com.example.ui.theme.AcademicSerifFamily
import com.example.ui.theme.CharcoalSelected
import com.example.ui.theme.DeepIndigo
import com.example.ui.theme.ElectricPurple
import com.example.ui.theme.InterFontFamily
import com.example.ui.theme.JetBrainsMonoFamily
import com.example.ui.theme.OutfitDisplayFamily
import com.example.ui.theme.PlusJakartaSansFamily
import com.example.ui.theme.PrimaryBlue
import com.example.ui.theme.PrimaryText
import com.example.ui.theme.SecondaryText
import com.example.ui.theme.SoftLavender
import com.example.ui.theme.SuccessGreen

// Cohesive Mobile Surface & Border Tokens matching the App's Cobalt-Blue & Crisp Light Theme
private val AppCardSurface = Color(0xFFF6F8FD)
private val AppCardBorder = Color(0xFFDFE6F5)
private val AppTintedBlueSurface = Color(0xFFEEF3FF)
private val AppTintedBlueBorder = Color(0xFFCBD8FD)
private val AmberAccent = Color(0xFFD97706)
private val CyanAccent = Color(0xFF0891B2)

/**
 * 1. Quick Actions 5-Card Bento Grid (Improved, mobile-perfected version of image_899846d4.png):
 * - Header:
 *   - Left: Tinted scanner-bracket squircle badge + "Quick Actions" title + subtitle
 *   - Right: Frosted "• IISER IAT >" pill button
 * - Top Bento Row (Asymmetric 2-Column Split):
 *   - Left Tall Card ("AI Chat"):
 *     - Glossy 3D Periwinkle-Royal-Blue squircle featuring an animated blinking white AI robot
 *       (with top antenna, side ear-nodes, smiling mouth & sparkle check), "AI" pill, and top-right "→" circle.
 *     - Large bold "AI Chat" title + "Ask doubts, get step-by-step solutions and learn smarter."
 *     - Bottom-right layered translucent cobalt/sky glassmorphic wave arcs.
 *   - Right Stacked Cards ("Continue Learning" & "Roadmap"):
 *     - Engineered for mobile portrait so titles & 2-line descriptions get 100% card width (zero truncation):
 *       - Top card ("Continue Learning"): Soft Ice-Blue card, book squircle, "• RESUME" pill, "→" circle,
 *         bold "Continue Learning" title + "Resume your last lesson and keep making progress."
 *       - Bottom card ("Roadmap"): Soft Lavender-Periwinkle card, trifold map squircle, "• STUDY PATH" pill,
 *         "→" circle, bold "Roadmap" title + "Get a personalized study plan for your IISER journey."
 * - Bottom Bento Row (2 Equal Cards):
 *   - Left ("Start Mock Test"): Soft Ice-Blue card, glossy 3D blue play squircle, "FULL CBT" pill,
 *     "→" circle, bold "Start Mock Test" + "Access full IAT CBT mocks."
 *   - Right ("Quick Mock"): Soft Lavender card, glossy 3D violet lightning squircle, "15 MIN" pill,
 *     "→" circle, bold "Quick Mock" + "Start a 15-min practice mock and improve accuracy."
 */
@Composable
fun QuickActionsBentoSection(
    onAiChatClick: () -> Unit,
    onContinueLearningClick: () -> Unit,
    onRoadmapClick: () -> Unit,
    onStartMockTestClick: () -> Unit,
    onQuickMockClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    // Multi-part lively animation for the AI Robot squircle icon inside the AI Chat card
    val robotTransition = rememberInfiniteTransition(label = "ai_chat_robot_transition")

    // 1. Double-blinking eyes
    val eyeScaleY by robotTransition.animateFloat(
        initialValue = 1f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = keyframes {
                durationMillis = 2600
                1.0f at 0 using FastOutSlowInEasing
                1.0f at 1100 using FastOutSlowInEasing
                0.10f at 1220 using FastOutSlowInEasing
                1.0f at 1340 using FastOutSlowInEasing
                0.10f at 1480 using FastOutSlowInEasing
                1.0f at 1620 using FastOutSlowInEasing
                1.0f at 2600
            },
            repeatMode = RepeatMode.Restart
        ),
        label = "ai_chat_eye_scale_y"
    )

    // 2. Eyes glancing left & right + playful head tilt
    val eyeLookX by robotTransition.animateFloat(
        initialValue = 0f,
        targetValue = 0f,
        animationSpec = infiniteRepeatable(
            animation = keyframes {
                durationMillis = 3200
                0f at 0 using FastOutSlowInEasing
                -1.3f at 700 using FastOutSlowInEasing
                -1.3f at 1100 using FastOutSlowInEasing
                1.3f at 1900 using FastOutSlowInEasing
                1.3f at 2300 using FastOutSlowInEasing
                0f at 2900 using FastOutSlowInEasing
                0f at 3200
            },
            repeatMode = RepeatMode.Restart
        ),
        label = "ai_chat_eye_look_x"
    )

    val robotHeadTilt by robotTransition.animateFloat(
        initialValue = 0f,
        targetValue = 0f,
        animationSpec = infiniteRepeatable(
            animation = keyframes {
                durationMillis = 3200
                0f at 0 using FastOutSlowInEasing
                -7.5f at 800 using FastOutSlowInEasing
                7.5f at 2000 using FastOutSlowInEasing
                0f at 3000 using FastOutSlowInEasing
                0f at 3200
            },
            repeatMode = RepeatMode.Restart
        ),
        label = "ai_chat_head_tilt"
    )

    // 3. Smooth vertical levitation (floating up & down)
    val robotBobY by robotTransition.animateFloat(
        initialValue = -1.8f,
        targetValue = 1.8f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 1200, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "ai_chat_robot_bob_y"
    )

    // 4. Radiating antenna signal ring + glowing tip pulse
    val antennaSignalProgress by robotTransition.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 1500, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ),
        label = "ai_chat_antenna_signal"
    )

    // 5. Top-right checkmark / sparkle bounce & squircle breathing
    val checkPopScale by robotTransition.animateFloat(
        initialValue = 0.82f,
        targetValue = 1.22f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 900, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "ai_chat_check_pop"
    )

    val squircleBreathScale by robotTransition.animateFloat(
        initialValue = 0.97f,
        targetValue = 1.04f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 1400, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "ai_chat_squircle_breath"
    )

    val squircleShimmer by robotTransition.animateFloat(
        initialValue = -0.4f,
        targetValue = 1.4f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 2200, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ),
        label = "ai_chat_squircle_shimmer"
    )

    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 18.dp)
            .testTag("dash_recommended_next_step"),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        // ==================== 1. HEADER: SCANNER BADGE + "Quick Actions" + "• IISER IAT >" ====================
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                // Soft Periwinkle Scanner-Viewfinder Squircle Badge
                Surface(
                    shape = RoundedCornerShape(12.dp),
                    color = Color(0xFFEEF4FF),
                    shadowElevation = 0.dp,
                    border = BorderStroke(1.dp, Color(0xFFD8E6FF)),
                    modifier = Modifier.size(35.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                Brush.verticalGradient(
                                    colors = listOf(Color(0xFFF6F9FF), Color(0xFFE3EDFF))
                                )
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Canvas(modifier = Modifier.size(17.dp)) {
                            val w = size.width
                            val h = size.height
                            val s = 1.25.dp.toPx()
                            val len = w * 0.28f
                            val r = w * 0.18f
                            val c = Color(0xFF3B63E8)

                            val brackets = Path().apply {
                                // Top-left
                                moveTo(0f, len)
                                lineTo(0f, r)
                                quadraticTo(0f, 0f, r, 0f)
                                lineTo(len, 0f)
                                // Top-right
                                moveTo(w - len, 0f)
                                lineTo(w - r, 0f)
                                quadraticTo(w, 0f, w, r)
                                lineTo(w, len)
                                // Bottom-left
                                moveTo(0f, h - len)
                                lineTo(0f, h - r)
                                quadraticTo(0f, h, r, h)
                                lineTo(len, h)
                                // Bottom-right
                                moveTo(w - len, h)
                                lineTo(w - r, h)
                                quadraticTo(w, h, w, h - r)
                                lineTo(w, h - len)
                            }
                            drawPath(brackets, color = c, style = Stroke(width = s, cap = StrokeCap.Round))
                            // Center scanner bar + dot
                            drawLine(
                                color = c,
                                start = Offset(w * 0.30f, h * 0.50f),
                                end = Offset(w * 0.70f, h * 0.50f),
                                strokeWidth = s,
                                cap = StrokeCap.Round
                            )
                            drawCircle(
                                color = c,
                                radius = 1.4.dp.toPx(),
                                center = Offset(w * 0.50f, h * 0.50f)
                            )
                        }
                    }
                }

                Column(verticalArrangement = Arrangement.spacedBy(1.dp)) {
                    Text(
                        text = "Quick Actions",
                        fontFamily = OutfitDisplayFamily,
                        fontWeight = FontWeight.Normal,
                        fontSize = 19.sp,
                        letterSpacing = (-0.25).sp,
                        color = Color(0xFF1E293B)
                    )
                    Text(
                        text = "Everything you need for your IISER prep",
                        fontFamily = InterFontFamily,
                        fontWeight = FontWeight.Normal,
                        fontSize = 11.sp,
                        color = Color(0xFF64748B)
                    )
                }
            }

            // Right Pill: "• IISER IAT >"
            Surface(
                onClick = onRoadmapClick,
                shape = RoundedCornerShape(50),
                color = Color(0xFFF2F6FF),
                shadowElevation = 0.dp,
                border = BorderStroke(1.dp, Color(0xFFD8E5FF)),
                modifier = Modifier.testTag("quick_action_iiser_iat_pill")
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 11.dp, vertical = 5.5.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .size(5.5.dp)
                            .clip(CircleShape)
                            .background(Color(0xFF5B45F5))
                    )
                    Text(
                        text = "IISER IAT",
                        fontFamily = JetBrainsMonoFamily,
                        fontWeight = FontWeight.Normal,
                        fontSize = 9.5.sp,
                        letterSpacing = 0.3.sp,
                        color = Color(0xFF3358D4)
                    )
                    Canvas(modifier = Modifier.size(8.dp)) {
                        val w = size.width
                        val h = size.height
                        val chevron = Path().apply {
                            moveTo(w * 0.28f, h * 0.16f)
                            lineTo(w * 0.72f, h * 0.50f)
                            lineTo(w * 0.28f, h * 0.84f)
                        }
                        drawPath(
                            path = chevron,
                            color = Color(0xFF3358D4),
                            style = Stroke(width = 1.2.dp.toPx(), cap = StrokeCap.Round)
                        )
                    }
                }
            }
        }

        // ==================== 2. TOP BENTO ROW: AI CHAT (LEFT) + CONTINUE LEARNING & ROADMAP (RIGHT) ====================
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(224.dp),
            horizontalArrangement = Arrangement.spacedBy(11.dp)
        ) {
            // LEFT TALL CARD: AI Chat
            Surface(
                onClick = onAiChatClick,
                shape = RoundedCornerShape(24.dp),
                color = Color(0xFFF5F8FF),
                shadowElevation = 0.dp,
                border = BorderStroke(1.dp, Color(0xFFDCE8FF)),
                modifier = Modifier
                    .weight(0.96f)
                    .fillMaxSize()
                    .testTag("quick_action_ai_chat")
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            Brush.linearGradient(
                                colors = listOf(
                                    Color(0xFFF9FBFF),
                                    Color(0xFFEEF4FF),
                                    Color(0xFFE1ECFF)
                                ),
                                start = Offset(0f, 0f),
                                end = Offset(380f, 520f)
                            )
                        )
                ) {
                    // Bottom-Right Layered Translucent Cobalt/Sky Wave Arcs
                    Canvas(modifier = Modifier.fillMaxSize()) {
                        val w = size.width
                        val h = size.height

                        // Outer soft periwinkle sweeping wave
                        val outerWave = Path().apply {
                            moveTo(w * 0.45f, h)
                            quadraticTo(w * 0.68f, h * 0.68f, w, h * 0.54f)
                            lineTo(w, h)
                            close()
                        }
                        drawPath(
                            path = outerWave,
                            brush = Brush.linearGradient(
                                colors = listOf(
                                    Color(0xFF93C5FD).copy(alpha = 0.20f),
                                    Color(0xFF3B82F6).copy(alpha = 0.28f)
                                ),
                                start = Offset(w * 0.5f, h * 0.6f),
                                end = Offset(w, h)
                            )
                        )

                        // Inner deeper blue intersecting arc
                        val innerArc = Path().apply {
                            moveTo(w * 0.72f, h)
                            quadraticTo(w * 0.70f, h * 0.75f, w, h * 0.70f)
                            lineTo(w, h)
                            close()
                        }
                        drawPath(
                            path = innerArc,
                            color = Color(0xFF60A5FA).copy(alpha = 0.22f)
                        )
                    }

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(14.dp),
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        // Top Row: Blue Robot Squircle + "AI" Pill + Right "→" Circle
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                // Animated Blue Squircle with Lively Floating AI Robot Icon
                                Surface(
                                    shape = RoundedCornerShape(14.dp),
                                    color = Color(0xFF4270FF),
                                    shadowElevation = 0.dp,
                                    border = BorderStroke(1.dp, Color(0xFFA6C4FF)),
                                    modifier = Modifier
                                        .size(44.dp)
                                        .graphicsLayer {
                                            scaleX = squircleBreathScale
                                            scaleY = squircleBreathScale
                                        }
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .background(
                                                Brush.verticalGradient(
                                                    colors = listOf(
                                                        Color(0xFF7CA9FF),
                                                        Color(0xFF4270FF)
                                                    )
                                                )
                                            ),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Canvas(modifier = Modifier.size(28.dp)) {
                                            val rw = size.width
                                            val rh = size.height
                                            val cx = rw / 2f

                                            // Subtle diagonal glossy shimmer sweep across the squircle
                                            val shimmerX = rw * squircleShimmer
                                            drawLine(
                                                color = Color.White.copy(alpha = 0.14f),
                                                start = Offset(shimmerX - rw * 0.3f, 0f),
                                                end = Offset(shimmerX + rw * 0.2f, rh),
                                                strokeWidth = 6.dp.toPx(),
                                                cap = StrokeCap.Round
                                            )

                                            // Floating & gently tilting Robot Head + Antenna + Ears
                                            val bobOffsetY = robotBobY.dp.toPx()
                                            withTransform({
                                                translate(left = 0f, top = bobOffsetY)
                                                rotate(
                                                    degrees = robotHeadTilt,
                                                    pivot = Offset(cx, rh * 0.54f)
                                                )
                                            }) {
                                                // Expanding sonar signal ring from antenna tip
                                                val signalRadius = (1.6f + antennaSignalProgress * 4.2f).dp.toPx()
                                                val signalAlpha = (1f - antennaSignalProgress) * 0.75f
                                                drawCircle(
                                                    color = Color.White.copy(alpha = signalAlpha),
                                                    radius = signalRadius,
                                                    center = Offset(cx, rh * 0.13f),
                                                    style = Stroke(width = 1.dp.toPx())
                                                )

                                                // Top antenna stem + pulsing tip dot
                                                drawLine(
                                                    color = Color.White,
                                                    start = Offset(cx, rh * 0.14f),
                                                    end = Offset(cx, rh * 0.28f),
                                                    strokeWidth = 1.5.dp.toPx(),
                                                    cap = StrokeCap.Round
                                                )
                                                val tipPulse = 1.5f + 0.5f * kotlin.math.sin(antennaSignalProgress * Math.PI.toFloat())
                                                drawCircle(
                                                    color = Color.White,
                                                    radius = tipPulse.dp.toPx(),
                                                    center = Offset(cx, rh * 0.13f)
                                                )

                                                // Animated bouncing checkmark at top-right of antenna
                                                withTransform({
                                                    scale(
                                                        scaleX = checkPopScale,
                                                        scaleY = checkPopScale,
                                                        pivot = Offset(rw * 0.76f, rh * 0.16f)
                                                    )
                                                }) {
                                                    val checkPath = Path().apply {
                                                        moveTo(rw * 0.67f, rh * 0.16f)
                                                        lineTo(rw * 0.73f, rh * 0.21f)
                                                        lineTo(rw * 0.85f, rh * 0.09f)
                                                    }
                                                    drawPath(
                                                        path = checkPath,
                                                        color = Color.White.copy(alpha = 0.95f),
                                                        style = Stroke(width = 1.3.dp.toPx(), cap = StrokeCap.Round)
                                                    )
                                                }

                                                // Left & Right ear nodes (gently pulsing alpha)
                                                val earAlpha = 0.70f + 0.25f * kotlin.math.sin(antennaSignalProgress * Math.PI.toFloat())
                                                drawRoundRect(
                                                    color = Color.White.copy(alpha = earAlpha),
                                                    topLeft = Offset(rw * 0.08f, rh * 0.44f),
                                                    size = Size(rw * 0.10f, rh * 0.22f),
                                                    cornerRadius = CornerRadius(2.dp.toPx(), 2.dp.toPx())
                                                )
                                                drawRoundRect(
                                                    color = Color.White.copy(alpha = earAlpha),
                                                    topLeft = Offset(rw * 0.82f, rh * 0.44f),
                                                    size = Size(rw * 0.10f, rh * 0.22f),
                                                    cornerRadius = CornerRadius(2.dp.toPx(), 2.dp.toPx())
                                                )

                                                // Main White Robot Head Squircle
                                                val headW = rw * 0.66f
                                                val headH = rh * 0.52f
                                                val headLeft = (rw - headW) / 2f
                                                val headTop = rh * 0.28f
                                                drawRoundRect(
                                                    color = Color.White,
                                                    topLeft = Offset(headLeft, headTop),
                                                    size = Size(headW, headH),
                                                    cornerRadius = CornerRadius(6.dp.toPx(), 6.dp.toPx())
                                                )

                                                // Glancing & Double-Blinking Blue Eyes
                                                val eyeShiftX = eyeLookX.dp.toPx()
                                                val eyeY = headTop + headH * 0.42f
                                                val eyeW = 2.8.dp.toPx()
                                                val eyeH = (2.8.dp.toPx() * eyeScaleY).coerceAtLeast(0.75.dp.toPx())
                                                drawRoundRect(
                                                    color = Color(0xFF3358D4),
                                                    topLeft = Offset(cx - 4.0.dp.toPx() - eyeW / 2f + eyeShiftX, eyeY - eyeH / 2f),
                                                    size = Size(eyeW, eyeH),
                                                    cornerRadius = CornerRadius(eyeW / 2f, eyeW / 2f)
                                                )
                                                drawRoundRect(
                                                    color = Color(0xFF3358D4),
                                                    topLeft = Offset(cx + 4.0.dp.toPx() - eyeW / 2f + eyeShiftX, eyeY - eyeH / 2f),
                                                    size = Size(eyeW, eyeH),
                                                    cornerRadius = CornerRadius(eyeW / 2f, eyeW / 2f)
                                                )

                                                // Expressive curved smile (shifts subtly with glance)
                                                val smileDepth = headTop + headH * (0.81f + 0.04f * kotlin.math.abs(eyeLookX))
                                                val smilePath = Path().apply {
                                                    moveTo(cx - 3.0.dp.toPx() + eyeShiftX * 0.35f, headTop + headH * 0.68f)
                                                    quadraticTo(
                                                        cx + eyeShiftX * 0.45f,
                                                        smileDepth,
                                                        cx + 3.0.dp.toPx() + eyeShiftX * 0.35f,
                                                        headTop + headH * 0.68f
                                                    )
                                                }
                                                drawPath(
                                                    path = smilePath,
                                                    color = Color(0xFF3358D4),
                                                    style = Stroke(width = 1.25.dp.toPx(), cap = StrokeCap.Round)
                                                )
                                            }
                                        }
                                    }
                                }

                                // Soft Blue "AI" Pill
                                Surface(
                                    shape = RoundedCornerShape(50),
                                    color = Color(0xFFE3EDFF),
                                    border = BorderStroke(1.dp, Color(0xFFCEE0FF))
                                ) {
                                    Text(
                                        text = "AI",
                                        fontFamily = JetBrainsMonoFamily,
                                        fontWeight = FontWeight.Normal,
                                        fontSize = 9.5.sp,
                                        color = Color(0xFF2554D8),
                                        modifier = Modifier.padding(horizontal = 8.5.dp, vertical = 3.dp)
                                    )
                                }
                            }

                            // Top-Right White Circle with Thin Arrow "→"
                            QuickActionArrowCircle(tint = Color(0xFF2554D8))
                        }

                        // Bottom Text Stack: Clean Non-Bold "AI Chat" Title + 3-line Subtitle
                        Column(verticalArrangement = Arrangement.spacedBy(5.dp)) {
                            Text(
                                text = "AI Chat",
                                fontFamily = OutfitDisplayFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 18.sp,
                                letterSpacing = (-0.2).sp,
                                color = Color(0xFF1E293B)
                            )
                            Text(
                                text = "Ask doubts, get step-by-step\nsolutions and learn smarter.",
                                fontFamily = InterFontFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 11.sp,
                                lineHeight = 15.sp,
                                color = Color(0xFF52658F),
                                maxLines = 3
                            )
                        }
                    }
                }
            }

            // RIGHT COLUMN: Continue Learning + Roadmap Stacked
            Column(
                modifier = Modifier
                    .weight(1.04f)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(11.dp)
            ) {
                // 2A. Top-Right Card: Continue Learning
                Surface(
                    onClick = onContinueLearningClick,
                    shape = RoundedCornerShape(22.dp),
                    color = Color(0xFFF3F7FF),
                    shadowElevation = 0.dp,
                    border = BorderStroke(1.dp, Color(0xFFDCE8FF)),
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .testTag("dash_revise_now_btn")
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                Brush.linearGradient(
                                    colors = listOf(Color(0xFFF9FBFF), Color(0xFFEAF2FF))
                                )
                            )
                            .padding(horizontal = 12.dp, vertical = 10.dp),
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        // Top Row: Tinted Book Squircle + "• RESUME" Pill + Right "→" Circle
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(6.dp)
                            ) {
                                Surface(
                                    shape = RoundedCornerShape(11.dp),
                                    color = Color(0xFFDFECFF),
                                    border = BorderStroke(1.dp, Color(0xFFCCE0FF)),
                                    modifier = Modifier.size(33.dp)
                                ) {
                                    Box(contentAlignment = Alignment.Center) {
                                        Icon(
                                            imageVector = Icons.AutoMirrored.Outlined.MenuBook,
                                            contentDescription = "Continue Learning",
                                            tint = Color(0xFF2563EB),
                                            modifier = Modifier.size(17.dp)
                                        )
                                    }
                                }

                                Surface(
                                    shape = RoundedCornerShape(50),
                                    color = Color(0xFFE3EEFF),
                                    border = BorderStroke(1.dp, Color(0xFFCEE0FF))
                                ) {
                                    Row(
                                        modifier = Modifier.padding(horizontal = 6.5.dp, vertical = 2.dp),
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.spacedBy(3.5.dp)
                                    ) {
                                        Box(
                                            modifier = Modifier
                                                .size(4.5.dp)
                                                .clip(CircleShape)
                                                .background(Color(0xFF10B981))
                                        )
                                        Text(
                                            text = "RESUME",
                                            fontFamily = JetBrainsMonoFamily,
                                            fontWeight = FontWeight.Normal,
                                            fontSize = 7.8.sp,
                                            letterSpacing = 0.3.sp,
                                            color = Color(0xFF2554D8)
                                        )
                                    }
                                }
                            }

                            QuickActionArrowCircle(tint = Color(0xFF2554D8), sizeDp = 24)
                        }

                        // Full-Width Clean Non-Bold Title + Subtitle
                        Column(verticalArrangement = Arrangement.spacedBy(1.5.dp)) {
                            Text(
                                text = "Continue Learning",
                                fontFamily = OutfitDisplayFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 14.sp,
                                letterSpacing = (-0.15).sp,
                                color = Color(0xFF1E293B),
                                maxLines = 1
                            )
                            Text(
                                text = "Resume your last lesson and keep making progress.",
                                fontFamily = InterFontFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 10.sp,
                                lineHeight = 13.sp,
                                color = Color(0xFF52658F),
                                maxLines = 2
                            )
                        }
                    }
                }

                // 2B. Bottom-Right Card: Roadmap
                Surface(
                    onClick = onRoadmapClick,
                    shape = RoundedCornerShape(22.dp),
                    color = Color(0xFFF6F3FF),
                    shadowElevation = 0.dp,
                    border = BorderStroke(1.dp, Color(0xFFE3DCFF)),
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .testTag("quick_action_roadmap")
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                Brush.linearGradient(
                                    colors = listOf(Color(0xFFFAF8FF), Color(0xFFEEE9FF))
                                )
                            )
                            .padding(horizontal = 12.dp, vertical = 10.dp),
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        // Top Row: Tinted Map Squircle + "• STUDY PATH" Pill + Right "→" Circle
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(6.dp)
                            ) {
                                Surface(
                                    shape = RoundedCornerShape(11.dp),
                                    color = Color(0xFFE9E3FF),
                                    border = BorderStroke(1.dp, Color(0xFFD8CFFF)),
                                    modifier = Modifier.size(33.dp)
                                ) {
                                    Box(contentAlignment = Alignment.Center) {
                                        Canvas(modifier = Modifier.size(15.dp)) {
                                            val w = size.width
                                            val h = size.height
                                            val s = 1.25.dp.toPx()
                                            val c = Color(0xFF6347F5)
                                            val path = Path().apply {
                                                // Left panel
                                                moveTo(w * 0.08f, h * 0.18f)
                                                lineTo(w * 0.36f, h * 0.08f)
                                                lineTo(w * 0.36f, h * 0.82f)
                                                lineTo(w * 0.08f, h * 0.92f)
                                                close()
                                                // Middle panel
                                                moveTo(w * 0.36f, h * 0.08f)
                                                lineTo(w * 0.64f, h * 0.20f)
                                                lineTo(w * 0.64f, h * 0.92f)
                                                lineTo(w * 0.36f, h * 0.82f)
                                                // Right panel
                                                moveTo(w * 0.64f, h * 0.20f)
                                                lineTo(w * 0.92f, h * 0.10f)
                                                lineTo(w * 0.92f, h * 0.82f)
                                                lineTo(w * 0.64f, h * 0.92f)
                                            }
                                            drawPath(path, color = c, style = Stroke(width = s, cap = StrokeCap.Round))
                                        }
                                    }
                                }

                                Surface(
                                    shape = RoundedCornerShape(50),
                                    color = Color(0xFFECE6FF),
                                    border = BorderStroke(1.dp, Color(0xFFDBD1FF))
                                ) {
                                    Row(
                                        modifier = Modifier.padding(horizontal = 6.5.dp, vertical = 2.dp),
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.spacedBy(3.5.dp)
                                    ) {
                                        Box(
                                            modifier = Modifier
                                                .size(4.5.dp)
                                                .clip(CircleShape)
                                                .background(Color(0xFF6347F5))
                                        )
                                        Text(
                                            text = "STUDY PATH",
                                            fontFamily = JetBrainsMonoFamily,
                                            fontWeight = FontWeight.Normal,
                                            fontSize = 7.8.sp,
                                            letterSpacing = 0.3.sp,
                                            color = Color(0xFF5B38F5)
                                        )
                                    }
                                }
                            }

                            QuickActionArrowCircle(tint = Color(0xFF5B38F5), sizeDp = 24)
                        }

                        // Full-Width Clean Non-Bold Title + Subtitle
                        Column(verticalArrangement = Arrangement.spacedBy(1.5.dp)) {
                            Text(
                                text = "Roadmap",
                                fontFamily = OutfitDisplayFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 14.sp,
                                letterSpacing = (-0.15).sp,
                                color = Color(0xFF1E293B),
                                maxLines = 1
                            )
                            Text(
                                text = "Get a personalized study plan for your IISER journey.",
                                fontFamily = InterFontFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 10.sp,
                                lineHeight = 13.sp,
                                color = Color(0xFF5E5A8A),
                                maxLines = 2
                            )
                        }
                    }
                }
            }
        }

        // ==================== 3. BOTTOM BENTO ROW: START MOCK TEST + QUICK MOCK ====================
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(108.dp),
            horizontalArrangement = Arrangement.spacedBy(11.dp)
        ) {
            // 3A. Bottom-Left Card: Start Mock Test
            Surface(
                onClick = onStartMockTestClick,
                shape = RoundedCornerShape(22.dp),
                color = Color(0xFFF3F7FF),
                shadowElevation = 0.dp,
                border = BorderStroke(1.dp, Color(0xFFDCE8FF)),
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .testTag("quick_action_mock_tests")
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            Brush.linearGradient(
                                colors = listOf(Color(0xFFF9FBFF), Color(0xFFE8F1FF))
                            )
                        )
                        .padding(horizontal = 13.dp, vertical = 11.dp),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    // Top Row: Blue Play Squircle + "FULL CBT" Pill + Right "→" Circle
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            Surface(
                                shape = RoundedCornerShape(11.dp),
                                color = Color(0xFF4270FF),
                                shadowElevation = 0.dp,
                                border = BorderStroke(1.dp, Color(0xFFA6C4FF)),
                                modifier = Modifier.size(33.dp)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .background(
                                            Brush.verticalGradient(
                                                colors = listOf(Color(0xFF7CA9FF), Color(0xFF3E68FF))
                                            )
                                        ),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.PlayArrow,
                                        contentDescription = "Start Mock Test",
                                        tint = Color.White,
                                        modifier = Modifier.size(18.dp)
                                    )
                                }
                            }

                            Surface(
                                shape = RoundedCornerShape(50),
                                color = Color(0xFFE3EEFF),
                                border = BorderStroke(1.dp, Color(0xFFCEE0FF))
                            ) {
                                Text(
                                    text = "FULL CBT",
                                    fontFamily = JetBrainsMonoFamily,
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 7.8.sp,
                                    letterSpacing = 0.3.sp,
                                    color = Color(0xFF2554D8),
                                    modifier = Modifier.padding(horizontal = 7.dp, vertical = 2.5.dp)
                                )
                            }
                        }

                        QuickActionArrowCircle(tint = Color(0xFF2554D8), sizeDp = 24)
                    }

                    // Bottom Clean Non-Bold Title + Subtitle
                    Column(verticalArrangement = Arrangement.spacedBy(2.dp)) {
                        Text(
                            text = "Start Mock Test",
                            fontFamily = OutfitDisplayFamily,
                            fontWeight = FontWeight.Normal,
                            fontSize = 14.sp,
                            letterSpacing = (-0.15).sp,
                            color = Color(0xFF1E293B),
                            maxLines = 1
                        )
                        Text(
                            text = "Access full IAT CBT mocks.",
                            fontFamily = InterFontFamily,
                            fontWeight = FontWeight.Normal,
                            fontSize = 10.5.sp,
                            lineHeight = 13.5.sp,
                            color = Color(0xFF52658F),
                            maxLines = 1
                        )
                    }
                }
            }

            // 3B. Bottom-Right Card: Quick Mock
            Surface(
                onClick = onQuickMockClick,
                shape = RoundedCornerShape(22.dp),
                color = Color(0xFFF6F3FF),
                shadowElevation = 0.dp,
                border = BorderStroke(1.dp, Color(0xFFE3DCFF)),
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .testTag("practice_mode_timed")
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            Brush.linearGradient(
                                colors = listOf(Color(0xFFFAF8FF), Color(0xFFEDE6FF))
                            )
                        )
                        .padding(horizontal = 13.dp, vertical = 11.dp),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    // Top Row: Violet Lightning Squircle + "15 MIN" Pill + Right "→" Circle
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            Surface(
                                shape = RoundedCornerShape(11.dp),
                                color = Color(0xFF6A4FF7),
                                shadowElevation = 0.dp,
                                border = BorderStroke(1.dp, Color(0xFFC2B3FF)),
                                modifier = Modifier.size(33.dp)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .background(
                                            Brush.verticalGradient(
                                                colors = listOf(Color(0xFF9B82FF), Color(0xFF6445F0))
                                            )
                                        ),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Bolt,
                                        contentDescription = "Quick Mock",
                                        tint = Color.White,
                                        modifier = Modifier.size(18.dp)
                                    )
                                }
                            }

                            Surface(
                                shape = RoundedCornerShape(50),
                                color = Color(0xFFECE6FF),
                                border = BorderStroke(1.dp, Color(0xFFDBD1FF))
                            ) {
                                Text(
                                    text = "15 MIN",
                                    fontFamily = JetBrainsMonoFamily,
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 7.8.sp,
                                    letterSpacing = 0.3.sp,
                                    color = Color(0xFF5B38F5),
                                    modifier = Modifier.padding(horizontal = 7.dp, vertical = 2.5.dp)
                                )
                            }
                        }

                        QuickActionArrowCircle(tint = Color(0xFF5B38F5), sizeDp = 24)
                    }

                    // Bottom Clean Non-Bold Title + Subtitle
                    Column(verticalArrangement = Arrangement.spacedBy(2.dp)) {
                        Text(
                            text = "Quick Mock",
                            fontFamily = OutfitDisplayFamily,
                            fontWeight = FontWeight.Normal,
                            fontSize = 14.sp,
                            letterSpacing = (-0.15).sp,
                            color = Color(0xFF1E293B),
                            maxLines = 1
                        )
                        Text(
                            text = "15-min practice for accuracy.",
                            fontFamily = InterFontFamily,
                            fontWeight = FontWeight.Normal,
                            fontSize = 10.5.sp,
                            lineHeight = 13.5.sp,
                            color = Color(0xFF5E5A8A),
                            maxLines = 1
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun QuickActionArrowCircle(
    tint: Color,
    sizeDp: Int = 28
) {
    Surface(
        shape = CircleShape,
        color = Color.White.copy(alpha = 0.92f),
        shadowElevation = 0.dp,
        border = BorderStroke(1.dp, Color(0xFFE2ECFF)),
        modifier = Modifier.size(sizeDp.dp)
    ) {
        Box(contentAlignment = Alignment.Center) {
            Canvas(modifier = Modifier.size((sizeDp * 0.44f).dp)) {
                val w = size.width
                val h = size.height
                val strokeW = 1.25.dp.toPx()
                // Horizontal shaft
                drawLine(
                    color = tint,
                    start = Offset(w * 0.12f, h * 0.50f),
                    end = Offset(w * 0.86f, h * 0.50f),
                    strokeWidth = strokeW,
                    cap = StrokeCap.Round
                )
                // Arrowhead
                val head = Path().apply {
                    moveTo(w * 0.54f, h * 0.20f)
                    lineTo(w * 0.88f, h * 0.50f)
                    lineTo(w * 0.54f, h * 0.80f)
                }
                drawPath(
                    path = head,
                    color = tint,
                    style = Stroke(width = strokeW, cap = StrokeCap.Round)
                )
            }
        }
    }
}

/**
 * 2. Compact 2x2 Mobile KPI Grid
 * Inspired by the website's 4 top metric cards (Exam Target, Syllabus Progress, Questions Solved, Study Habit),
 * styled in the app's crisp light surface (#F6F8FD) with live computed stats.
 */
@Composable
fun MobileKpiOverviewGrid(
    targetYear: Int,
    syllabusProgressPercent: Int,
    questionsAttempted: Int,
    totalQuestions: Int,
    accuracyPercent: Int,
    streakDays: Int,
    xpPoints: Int,
    onExamTargetClick: () -> Unit,
    onSyllabusClick: () -> Unit,
    onQuestionsClick: () -> Unit,
    onStreakClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            MobileKpiTile(
                label = "Exam Countdown",
                bigValue = "226",
                unitLabel = "Days Left",
                subtitle = "IISER IAT $targetYear",
                icon = Icons.Default.CalendarToday,
                accentColor = Color(0xFF2554D8),
                cardTopColor = Color(0xFFF9FBFF),
                cardBottomColor = Color(0xFFEAF2FF),
                borderColor = Color(0xFFDCE8FF),
                onClick = onExamTargetClick,
                modifier = Modifier
                    .weight(1f)
                    .testTag("dash_kpi_exam_target")
            )
            MobileKpiTile(
                label = "Syllabus Mastery",
                bigValue = "$syllabusProgressPercent",
                unitLabel = "%",
                subtitle = "PCMB 4-Subject Track",
                icon = Icons.AutoMirrored.Outlined.MenuBook,
                accentColor = Color(0xFF5B38F5),
                cardTopColor = Color(0xFFFAF8FF),
                cardBottomColor = Color(0xFFEEE9FF),
                borderColor = Color(0xFFE3DCFF),
                onClick = onSyllabusClick,
                modifier = Modifier
                    .weight(1f)
                    .testTag("dash_kpi_syllabus")
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            MobileKpiTile(
                label = "PYQ & Drill Bank",
                bigValue = "${questionsAttempted.coerceAtLeast(18)}",
                unitLabel = "/ $totalQuestions Qs",
                subtitle = "$accuracyPercent% Avg Accuracy",
                icon = Icons.Default.CheckCircleOutline,
                accentColor = Color(0xFF059669),
                cardTopColor = Color(0xFFF6FDF9),
                cardBottomColor = Color(0xFFE8F8F0),
                borderColor = Color(0xFFCBEFD9),
                onClick = onQuestionsClick,
                modifier = Modifier
                    .weight(1f)
                    .testTag("dash_kpi_questions")
            )
            MobileKpiTile(
                label = "Study Consistency",
                bigValue = "$streakDays",
                unitLabel = "Day Streak",
                subtitle = "$xpPoints XP Earned",
                icon = Icons.Default.LocalFireDepartment,
                accentColor = Color(0xFFD97706),
                cardTopColor = Color(0xFFFFFCF5),
                cardBottomColor = Color(0xFFFEF3D6),
                borderColor = Color(0xFFFDE6B0),
                onClick = onStreakClick,
                modifier = Modifier
                    .weight(1f)
                    .testTag("dash_kpi_streak")
            )
        }
    }
}

@Composable
private fun MobileKpiTile(
    label: String,
    bigValue: String,
    unitLabel: String,
    subtitle: String,
    icon: ImageVector,
    accentColor: Color,
    cardTopColor: Color = Color(0xFFF9FBFF),
    cardBottomColor: Color = Color(0xFFEAF2FF),
    borderColor: Color = Color(0xFFDCE8FF),
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        onClick = onClick,
        shape = RoundedCornerShape(20.dp),
        color = cardTopColor,
        shadowElevation = 0.dp,
        border = BorderStroke(1.dp, borderColor),
        modifier = modifier
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    Brush.linearGradient(
                        colors = listOf(cardTopColor, cardBottomColor)
                    )
                )
                .padding(13.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = label,
                    fontFamily = InterFontFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 11.sp,
                    color = Color(0xFF52658F),
                    maxLines = 1
                )
                Box(
                    modifier = Modifier
                        .size(26.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(accentColor.copy(alpha = 0.12f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = icon,
                        contentDescription = label,
                        tint = accentColor,
                        modifier = Modifier.size(14.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(6.dp))

            Row(
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.spacedBy(3.dp)
            ) {
                Text(
                    text = bigValue,
                    fontFamily = PlusJakartaSansFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 20.sp,
                    color = Color(0xFF1E293B)
                )
                Text(
                    text = unitLabel,
                    fontFamily = InterFontFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 10.5.sp,
                    color = Color(0xFF52658F),
                    modifier = Modifier.padding(bottom = 2.dp)
                )
            }

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = subtitle,
                fontFamily = InterFontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 10.5.sp,
                color = accentColor,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

/**
 * 3. Compact & Premium Readiness Engine Bento Card
 * Single full-width periwinkle-lavender glassmorphic Bento card (no Focus Bio card),
 * featuring composite IAT 240 readiness score, proportional 4-color PCMB mastery bar,
 * and a 2x2 frosted glass subject breakdown grid.
 */
@Composable
fun MobileReadinessAndWeakAreaCard(
    allChapters: List<ChapterEntity>,
    allQuestions: List<QuestionEntity>,
    onPracticeWeakArea: (ChapterEntity) -> Unit,
    onOpenFullAnalytics: () -> Unit,
    modifier: Modifier = Modifier
) {
    fun scoreForSubject(subj: String, baseBoost: Int): Int {
        val chs = allChapters.filter { it.subject.equals(subj, ignoreCase = true) }
        val frac = if (chs.isNotEmpty()) {
            chs.sumOf { it.completedLessons }.toFloat() / chs.sumOf { it.totalLessons }.coerceAtLeast(1).toFloat()
        } else 0.35f
        return ((frac * 45f).toInt() + baseBoost).coerceIn(14, 58)
    }

    val mathScore = scoreForSubject("Mathematics", 16)
    val physicsScore = scoreForSubject("Physics", 12)
    val chemScore = scoreForSubject("Chemistry", 14)
    val bioScore = scoreForSubject("Biology", 18)
    val compositeScore = mathScore + physicsScore + chemScore + bioScore
    val readinessPercent = ((compositeScore / 240f) * 100f).toInt().coerceIn(12, 99)

    Surface(
        onClick = onOpenFullAnalytics,
        shape = RoundedCornerShape(24.dp),
        color = Color(0xFFF3F7FF),
        shadowElevation = 0.dp,
        border = BorderStroke(1.dp, Color(0xFFDCE8FF)),
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
            .testTag("dash_readiness_engine_card")
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    Brush.linearGradient(
                        colors = listOf(
                            Color(0xFFF9FBFF),
                            Color(0xFFEEF5FF),
                            Color(0xFFF2EEFF)
                        )
                    )
                )
                .padding(horizontal = 15.dp, vertical = 13.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                // Top Row: Readiness Pill + Composite Score on Left, Analytics Pill on Right
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Text(
                            text = "Readiness Engine",
                            fontFamily = OutfitDisplayFamily,
                            fontWeight = FontWeight.Normal,
                            fontSize = 15.5.sp,
                            color = Color(0xFF1E293B)
                        )
                        Surface(
                            shape = RoundedCornerShape(50),
                            color = Color(0xFFE3EEFF),
                            border = BorderStroke(1.dp, Color(0xFFCEE0FF))
                        ) {
                            Row(
                                modifier = Modifier.padding(horizontal = 8.dp, vertical = 2.5.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(4.dp)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(5.5.dp)
                                        .clip(CircleShape)
                                        .background(SuccessGreen)
                                )
                                Text(
                                    text = "$readinessPercent% Ready",
                                    fontFamily = JetBrainsMonoFamily,
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 8.8.sp,
                                    color = Color(0xFF2554D8)
                                )
                            }
                        }
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.Bottom,
                            horizontalArrangement = Arrangement.spacedBy(2.dp)
                        ) {
                            Text(
                                text = "$compositeScore",
                                fontFamily = JetBrainsMonoFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 17.5.sp,
                                color = Color(0xFF1E293B)
                            )
                            Text(
                                text = "/ 240 IAT",
                                fontFamily = JetBrainsMonoFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 9.5.sp,
                                color = Color(0xFF52658F),
                                modifier = Modifier.padding(bottom = 1.5.dp)
                            )
                        }
                        QuickActionArrowCircle(
                            tint = Color(0xFF2554D8),
                            sizeDp = 24
                        )
                    }
                }

                // Proportional 4-Segment Multi-Color Mastery Bar (Phy, Che, Mat, Bio)
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(5.5.dp)
                        .clip(RoundedCornerShape(50))
                        .background(Color(0xFFDFE9FC)),
                    horizontalArrangement = Arrangement.spacedBy(2.5.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .weight((physicsScore / 60f).coerceAtLeast(0.15f))
                            .fillMaxHeight()
                            .clip(RoundedCornerShape(50))
                            .background(ElectricPurple)
                    )
                    Box(
                        modifier = Modifier
                            .weight((chemScore / 60f).coerceAtLeast(0.15f))
                            .fillMaxHeight()
                            .clip(RoundedCornerShape(50))
                            .background(CyanAccent)
                    )
                    Box(
                        modifier = Modifier
                            .weight((mathScore / 60f).coerceAtLeast(0.15f))
                            .fillMaxHeight()
                            .clip(RoundedCornerShape(50))
                            .background(PrimaryBlue)
                    )
                    Box(
                        modifier = Modifier
                            .weight((bioScore / 60f).coerceAtLeast(0.15f))
                            .fillMaxHeight()
                            .clip(RoundedCornerShape(50))
                            .background(SuccessGreen)
                    )
                }

                // Sleek 4-Subject Horizontal Glass Pill Strip (Phy • Che • Mat • Bio)
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    PremiumSubjectMiniPill(
                        label = "Phy",
                        score = physicsScore,
                        color = ElectricPurple,
                        modifier = Modifier.weight(1f)
                    )
                    PremiumSubjectMiniPill(
                        label = "Che",
                        score = chemScore,
                        color = CyanAccent,
                        modifier = Modifier.weight(1f)
                    )
                    PremiumSubjectMiniPill(
                        label = "Mat",
                        score = mathScore,
                        color = PrimaryBlue,
                        modifier = Modifier.weight(1f)
                    )
                    PremiumSubjectMiniPill(
                        label = "Bio",
                        score = bioScore,
                        color = SuccessGreen,
                        modifier = Modifier.weight(1f)
                    )
                }
            }
        }
    }
}

@Composable
private fun PremiumSubjectMiniPill(
    label: String,
    score: Int,
    color: Color,
    modifier: Modifier = Modifier
) {
    Surface(
        shape = RoundedCornerShape(12.dp),
        color = Color.White.copy(alpha = 0.88f),
        border = BorderStroke(1.dp, Color(0xFFE1ECFF)),
        modifier = modifier
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 7.5.dp, vertical = 5.5.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(5.5.dp)
                        .clip(CircleShape)
                        .background(color)
                )
                Text(
                    text = label,
                    fontFamily = OutfitDisplayFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 10.5.sp,
                    color = Color(0xFF1E293B),
                    maxLines = 1
                )
            }
            Text(
                text = "$score/60",
                fontFamily = JetBrainsMonoFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 9.2.sp,
                color = Color(0xFF52658F),
                maxLines = 1
            )
        }
    }
}

/**
 * NEW HIGH-VALUE SECTION 1:
 * Interactive Daily PYQ Challenge & Rapid Formula Flashcards ("Daily PYQ & Formula Deck")
 * Lets students solve real IISER IAT Previous Year Questions inline on the Home screen
 * with instant +4 / -1 feedback, step-by-step derivation, and 1-tap PCMB formula flashcards.
 */
@Composable
fun DailyPyqAndFormulaHubSection(
    allQuestions: List<QuestionEntity>,
    onOpenFullPyqBank: () -> Unit,
    onPracticeQuestionInSession: (QuestionEntity) -> Unit,
    modifier: Modifier = Modifier
) {
    val pyqList = remember(allQuestions) {
        val pyqs = allQuestions.filter { it.isPyq }
        if (pyqs.isNotEmpty()) pyqs else allQuestions
    }
    var currentIndex by remember { mutableIntStateOf(0) }
    var selectedOptionIndex by remember { mutableStateOf<Int?>(null) }
    var activeFormulaIndex by remember { mutableIntStateOf(0) }

    val currentQuestion = pyqList.getOrNull(currentIndex % pyqList.size.coerceAtLeast(1))
    val options = remember(currentQuestion) {
        if (currentQuestion != null) {
            listOf(
                currentQuestion.optionA,
                currentQuestion.optionB,
                currentQuestion.optionC,
                currentQuestion.optionD
            )
        } else emptyList()
    }

    val rapidFormulas = remember {
        listOf(
            Triple("Physics • Quantum & EM", "ĤΨ = EΨ   |   ∮ B·dl = μ₀(I + ε₀ dΦE/dt)", "De Broglie λ = h/p • Bohr En = -13.6 Z²/n² eV"),
            Triple("Chemistry • Thermo & Kinetics", "ΔG = ΔG° + RT ln Q   |   k = A·e^(-Ea/RT)", "Nernst: E = E° - (0.0591/n) log Q at 298 K"),
            Triple("Mathematics • Calculus & Series", "∫₀^∞ xⁿ⁻¹ e⁻ˣ dx = Γ(n) = (n-1)!", "Σ(k=1..n) 1/[k(k+1)] = 1 - 1/(n+1) • Euler e^(iπ)+1=0"),
            Triple("Biology • Genetics & Enzymes", "p² + 2pq + q² = 1   |   v = Vmax[S]/(Km + [S])", "Rekombination RF = (Recombinant / Total) × 100 cM")
        )
    }

    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        if (currentQuestion != null) {
            val subjectColor = subjectAccentColor(currentQuestion.subject)
            Surface(
                shape = RoundedCornerShape(24.dp),
                color = Color(0xFFF5F8FF),
                shadowElevation = 0.dp,
                border = BorderStroke(1.dp, Color(0xFFDCE8FF)),
                modifier = Modifier
                    .fillMaxWidth()
                    .testTag("continue_learning_carousel")
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            Brush.linearGradient(
                                colors = listOf(Color(0xFFF9FBFF), Color(0xFFECF3FF))
                            )
                        )
                        .padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(11.dp)
                ) {
                    // Top Row: Exam Source Pill + Subject Pill + Next Question Button
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(6.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Surface(
                                shape = RoundedCornerShape(50),
                                color = Color(0xFFE3EEFF),
                                border = BorderStroke(1.dp, Color(0xFFCEE0FF))
                            ) {
                                Text(
                                    text = "${currentQuestion.examSource} ${currentQuestion.examYear ?: 2024} • +4 / -1",
                                    fontFamily = InterFontFamily,
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 9.5.sp,
                                    color = Color(0xFF2554D8),
                                    modifier = Modifier.padding(horizontal = 8.5.dp, vertical = 3.dp)
                                )
                            }

                            Surface(
                                shape = RoundedCornerShape(50),
                                color = subjectColor.copy(alpha = 0.12f)
                            ) {
                                Text(
                                    text = currentQuestion.subject,
                                    fontFamily = InterFontFamily,
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 9.5.sp,
                                    color = subjectColor,
                                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
                                )
                            }
                        }

                        Surface(
                            onClick = {
                                selectedOptionIndex = null
                                currentIndex = (currentIndex + 1) % pyqList.size.coerceAtLeast(1)
                            },
                            shape = RoundedCornerShape(50),
                            color = Color.White,
                            border = BorderStroke(1.dp, Color(0xFFD8E5FF))
                        ) {
                            Text(
                                text = "Next PYQ ↻",
                                fontFamily = InterFontFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 10.sp,
                                color = Color(0xFF2554D8),
                                modifier = Modifier.padding(horizontal = 9.dp, vertical = 4.dp)
                            )
                        }
                    }

                    // Question Prompt
                    Text(
                        text = currentQuestion.prompt,
                        fontFamily = PlusJakartaSansFamily,
                        fontWeight = FontWeight.Normal,
                        fontSize = 13.5.sp,
                        lineHeight = 19.sp,
                        color = Color(0xFF1E293B)
                    )

                    // 2x2 Compact Interactive Option Grid (A, B, C, D)
                    Column(verticalArrangement = Arrangement.spacedBy(7.dp)) {
                        for (rowIdx in 0..1) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(7.dp)
                            ) {
                                for (colIdx in 0..1) {
                                    val optIdx = rowIdx * 2 + colIdx
                                    val optText = options.getOrNull(optIdx) ?: ""
                                    val optLetter = ('A' + optIdx).toString()
                                    val isSelected = selectedOptionIndex == optIdx
                                    val isAnswered = selectedOptionIndex != null
                                    val isCorrectOpt = optIdx == currentQuestion.correctOptionIndex

                                    val optBg = when {
                                        !isAnswered -> Color.White.copy(alpha = 0.92f)
                                        isCorrectOpt -> Color(0xFFECFDF5)
                                        isSelected -> Color(0xFFFEF2F2)
                                        else -> Color.White.copy(alpha = 0.65f)
                                    }
                                    val optBorder = when {
                                        !isAnswered -> Color(0xFFDCE8FF)
                                        isCorrectOpt -> Color(0xFF10B981)
                                        isSelected -> Color(0xFFEF4444)
                                        else -> Color(0xFFE2E8F0)
                                    }
                                    val optTextColor = when {
                                        !isAnswered -> Color(0xFF1E293B)
                                        isCorrectOpt -> Color(0xFF065F46)
                                        isSelected -> Color(0xFF991B1B)
                                        else -> Color(0xFF64748B)
                                    }

                                    Surface(
                                        onClick = { selectedOptionIndex = optIdx },
                                        shape = RoundedCornerShape(13.dp),
                                        color = optBg,
                                        border = BorderStroke(1.dp, optBorder),
                                        modifier = Modifier.weight(1f)
                                    ) {
                                        Row(
                                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 8.dp),
                                            verticalAlignment = Alignment.CenterVertically,
                                            horizontalArrangement = Arrangement.spacedBy(6.dp)
                                        ) {
                                            Box(
                                                modifier = Modifier
                                                    .size(20.dp)
                                                    .clip(CircleShape)
                                                    .background(
                                                        when {
                                                            isAnswered && isCorrectOpt -> Color(0xFF10B981)
                                                            isAnswered && isSelected -> Color(0xFFEF4444)
                                                            else -> Color(0xFFEEF4FF)
                                                        }
                                                    ),
                                                contentAlignment = Alignment.Center
                                            ) {
                                                Text(
                                                    text = optLetter,
                                                    fontFamily = InterFontFamily,
                                                    fontWeight = FontWeight.Normal,
                                                    fontSize = 10.sp,
                                                    color = if (isAnswered && (isCorrectOpt || isSelected)) Color.White else Color(0xFF2554D8)
                                                )
                                            }
                                            Text(
                                                text = optText,
                                                fontFamily = InterFontFamily,
                                                fontWeight = FontWeight.Normal,
                                                fontSize = 11.sp,
                                                lineHeight = 14.sp,
                                                color = optTextColor,
                                                maxLines = 2,
                                                overflow = TextOverflow.Ellipsis
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }

                    // Instant Solution Explanation Box when an option is tapped
                    if (selectedOptionIndex != null) {
                        val isRight = selectedOptionIndex == currentQuestion.correctOptionIndex
                        Surface(
                            shape = RoundedCornerShape(14.dp),
                            color = if (isRight) Color(0xFFECFDF5) else Color(0xFFFFFBEB),
                            border = BorderStroke(1.dp, if (isRight) Color(0xFFA7F3D0) else Color(0xFFFDE68A)),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Column(
                                modifier = Modifier.padding(11.dp),
                                verticalArrangement = Arrangement.spacedBy(3.dp)
                            ) {
                                Text(
                                    text = if (isRight) "✓ Correct (+4 Marks) • Concept Derivation" else "Explanation • Correct Option: ${('A' + currentQuestion.correctOptionIndex)}",
                                    fontFamily = InterFontFamily,
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 10.5.sp,
                                    color = if (isRight) Color(0xFF059669) else Color(0xFFD97706)
                                )
                                Text(
                                    text = currentQuestion.stepByStepExplanation,
                                    fontFamily = InterFontFamily,
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 11.sp,
                                    lineHeight = 15.sp,
                                    color = Color(0xFF334155),
                                    maxLines = 3,
                                    overflow = TextOverflow.Ellipsis
                                )
                            }
                        }
                    }

                    // Bottom Action Bar: Topic Tag + Full Solution / PYQ Bank Link
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Topic: ${currentQuestion.topic}",
                            fontFamily = InterFontFamily,
                            fontWeight = FontWeight.Normal,
                            fontSize = 10.5.sp,
                            color = Color(0xFF52658F)
                        )
                        Surface(
                            onClick = { onPracticeQuestionInSession(currentQuestion) },
                            shape = RoundedCornerShape(50),
                            color = Color(0xFFE3EEFF),
                            border = BorderStroke(1.dp, Color(0xFFCEE0FF))
                        ) {
                            Text(
                                text = "Solve in Full Mode →",
                                fontFamily = InterFontFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 10.5.sp,
                                color = Color(0xFF2554D8),
                                modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.5.dp)
                            )
                        }
                    }
                }
            }
        }

        // Rapid High-Yield Formula Flashcard Strip (Tap to cycle PCMB identities)
        val currentFormula = rapidFormulas[activeFormulaIndex % rapidFormulas.size]
        Surface(
            onClick = { activeFormulaIndex = (activeFormulaIndex + 1) % rapidFormulas.size },
            shape = RoundedCornerShape(20.dp),
            color = Color(0xFFF6F3FF),
            shadowElevation = 0.dp,
            border = BorderStroke(1.dp, Color(0xFFE3DCFF)),
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        Brush.linearGradient(
                            colors = listOf(Color(0xFFFAF8FF), Color(0xFFEEE8FF))
                        )
                    )
                    .padding(horizontal = 14.dp, vertical = 12.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier.weight(1f),
                    verticalArrangement = Arrangement.spacedBy(3.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        Surface(
                            shape = RoundedCornerShape(50),
                            color = Color(0xFFE8E0FF),
                            border = BorderStroke(1.dp, Color(0xFFD5C8FF))
                        ) {
                            Text(
                                text = "RAPID FORMULA DECK • ${activeFormulaIndex + 1}/4",
                                fontFamily = JetBrainsMonoFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 8.2.sp,
                                letterSpacing = 0.3.sp,
                                color = Color(0xFF5B38F5),
                                modifier = Modifier.padding(horizontal = 7.dp, vertical = 2.dp)
                            )
                        }
                        Text(
                            text = currentFormula.first,
                            fontFamily = InterFontFamily,
                            fontWeight = FontWeight.Normal,
                            fontSize = 10.sp,
                            color = Color(0xFF5E5A8A)
                        )
                    }
                    Text(
                        text = currentFormula.second,
                        fontFamily = AcademicSerifFamily,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Normal,
                        fontSize = 13.2.sp,
                        color = Color(0xFF1E293B)
                    )
                    Text(
                        text = currentFormula.third,
                        fontFamily = InterFontFamily,
                        fontWeight = FontWeight.Normal,
                        fontSize = 10.5.sp,
                        color = Color(0xFF5E5A8A)
                    )
                }

                Spacer(modifier = Modifier.width(10.dp))

                Surface(
                    shape = RoundedCornerShape(50),
                    color = Color.White,
                    border = BorderStroke(1.dp, Color(0xFFDBD1FF))
                ) {
                    Text(
                        text = "Flip ↻",
                        fontFamily = InterFontFamily,
                        fontWeight = FontWeight.Normal,
                        fontSize = 10.sp,
                        color = Color(0xFF5B38F5),
                        modifier = Modifier.padding(horizontal = 9.dp, vertical = 5.dp)
                    )
                }
            }
        }
    }
}

/**
 * NEW HIGH-VALUE SECTION 2:
 * CBT Mock Arena Bento Section
 * Side-by-side non-bold Periwinkle & Lavender Bento cards for IISER IAT Full & Sectional Mock Exams.
 */
@Composable
fun CbtMockArenaBentoSection(
    mockTests: List<MockTestEntity>,
    onStartMockTest: (MockTestEntity) -> Unit,
    onOpenAllMocks: () -> Unit,
    modifier: Modifier = Modifier
) {
    val iatMock = mockTests.firstOrNull()
    val sectionalMock = mockTests.getOrNull(1) ?: mockTests.lastOrNull()

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
        horizontalArrangement = Arrangement.spacedBy(11.dp)
    ) {
        if (iatMock != null) {
            Surface(
                onClick = { onStartMockTest(iatMock) },
                shape = RoundedCornerShape(22.dp),
                color = Color(0xFFF3F7FF),
                shadowElevation = 0.dp,
                border = BorderStroke(1.dp, Color(0xFFDCE8FF)),
                modifier = Modifier
                    .weight(1f)
                    .testTag("mock_card_${iatMock.id}")
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            Brush.linearGradient(
                                colors = listOf(Color(0xFFF9FBFF), Color(0xFFE8F1FF))
                            )
                        )
                        .padding(14.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Surface(
                            shape = RoundedCornerShape(50),
                            color = Color(0xFFE3EEFF),
                            border = BorderStroke(1.dp, Color(0xFFCEE0FF))
                        ) {
                            Text(
                                text = "IISER IAT • +4 / -1",
                                fontFamily = InterFontFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 8.5.sp,
                                color = Color(0xFF2554D8),
                                modifier = Modifier.padding(horizontal = 7.5.dp, vertical = 2.5.dp)
                            )
                        }
                        QuickActionArrowCircle(tint = Color(0xFF2554D8), sizeDp = 24)
                    }

                    Column(verticalArrangement = Arrangement.spacedBy(2.dp)) {
                        Text(
                            text = "IAT Full Pattern CBT",
                            fontFamily = PlusJakartaSansFamily,
                            fontWeight = FontWeight.Normal,
                            fontSize = 14.sp,
                            color = Color(0xFF1E293B),
                            maxLines = 1
                        )
                        Text(
                            text = "${iatMock.durationMinutes}m • ${iatMock.questionCount} Qs • ${iatMock.maxMarks}M",
                            fontFamily = InterFontFamily,
                            fontWeight = FontWeight.Normal,
                            fontSize = 10.5.sp,
                            color = Color(0xFF52658F),
                            maxLines = 1
                        )
                    }

                    Surface(
                        shape = RoundedCornerShape(50),
                        color = Color(0xFF3E68FF),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Box(
                            modifier = Modifier.padding(vertical = 6.5.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = if (iatMock.status == "Completed") "Retake CBT" else "Start CBT →",
                                fontFamily = InterFontFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 11.sp,
                                color = Color.White
                            )
                        }
                    }
                }
            }
        }

        if (sectionalMock != null) {
            Surface(
                onClick = { onStartMockTest(sectionalMock) },
                shape = RoundedCornerShape(22.dp),
                color = Color(0xFFF6F3FF),
                shadowElevation = 0.dp,
                border = BorderStroke(1.dp, Color(0xFFE3DCFF)),
                modifier = Modifier
                    .weight(1f)
                    .testTag("mock_card_${sectionalMock.id}")
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            Brush.linearGradient(
                                colors = listOf(Color(0xFFFAF8FF), Color(0xFFEDE6FF))
                            )
                        )
                        .padding(14.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Surface(
                            shape = RoundedCornerShape(50),
                            color = Color(0xFFECE6FF),
                            border = BorderStroke(1.dp, Color(0xFFDBD1FF))
                        ) {
                            Text(
                                text = "IISER IAT • +4 / -1",
                                fontFamily = InterFontFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 8.5.sp,
                                color = Color(0xFF5B38F5),
                                modifier = Modifier.padding(horizontal = 7.5.dp, vertical = 2.5.dp)
                            )
                        }
                        QuickActionArrowCircle(tint = Color(0xFF5B38F5), sizeDp = 24)
                    }

                    Column(verticalArrangement = Arrangement.spacedBy(2.dp)) {
                        Text(
                            text = "IAT Aptitude CBT",
                            fontFamily = PlusJakartaSansFamily,
                            fontWeight = FontWeight.Normal,
                            fontSize = 14.sp,
                            color = Color(0xFF1E293B),
                            maxLines = 1
                        )
                        Text(
                            text = "${sectionalMock.durationMinutes}m • ${sectionalMock.questionCount} Qs • ${sectionalMock.maxMarks}M",
                            fontFamily = InterFontFamily,
                            fontWeight = FontWeight.Normal,
                            fontSize = 10.5.sp,
                            color = Color(0xFF5E5A8A),
                            maxLines = 1
                        )
                    }

                    Surface(
                        shape = RoundedCornerShape(50),
                        color = Color(0xFF6445F0),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Box(
                            modifier = Modifier.padding(vertical = 6.5.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = if (sectionalMock.status == "Completed") "Retake CBT" else "Start CBT →",
                                fontFamily = InterFontFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 11.sp,
                                color = Color.White
                            )
                        }
                    }
                }
            }
        }
    }
}

/**
 * NEW HIGH-VALUE SECTION 3:
 * Refined Today's Study Focus Bento Card
 * Replaces the plain gray checklist with a unified periwinkle Bento card featuring a live
 * completion bar, subject-colored pills, and 1-tap launch.
 */
@Composable
fun RefinedStudyTargetsSection(
    tasks: List<StudyPlanTaskEntity>,
    onToggleTask: (StudyPlanTaskEntity) -> Unit,
    onDeleteTask: (Int) -> Unit,
    onLaunchNextTask: (StudyPlanTaskEntity) -> Unit,
    modifier: Modifier = Modifier
) {
    val completedCount = tasks.count { it.isCompleted }
    val totalCount = tasks.size.coerceAtLeast(1)
    val progressFrac = (completedCount.toFloat() / totalCount.toFloat()).coerceIn(0f, 1f)
    val nextTask = tasks.firstOrNull { !it.isCompleted }

    Surface(
        shape = RoundedCornerShape(24.dp),
        color = Color(0xFFF5F8FF),
        shadowElevation = 0.dp,
        border = BorderStroke(1.dp, Color(0xFFDCE8FF)),
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    Brush.linearGradient(
                        colors = listOf(Color(0xFFF9FBFF), Color(0xFFEEF4FF))
                    )
                )
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            // Top Progress Summary Row
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "$completedCount of ${tasks.size} daily targets completed",
                    fontFamily = InterFontFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 11.5.sp,
                    color = Color(0xFF52658F)
                )
                Text(
                    text = "${(progressFrac * 100).toInt()}%",
                    fontFamily = InterFontFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 11.5.sp,
                    color = Color(0xFF2554D8)
                )
            }

            LinearProgressIndicator(
                progress = { progressFrac },
                color = Color(0xFF3E68FF),
                trackColor = Color(0xFFDFE9FC),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(5.dp)
                    .clip(RoundedCornerShape(50))
            )

            // Compact Task Items
            tasks.forEach { task ->
                val subAccent = subjectAccentColor(task.subject)
                Surface(
                    onClick = { onToggleTask(task) },
                    shape = RoundedCornerShape(16.dp),
                    color = Color.White.copy(alpha = 0.92f),
                    border = BorderStroke(1.dp, if (task.isCompleted) Color(0xFFCBEFD9) else Color(0xFFE2ECFF)),
                    modifier = Modifier
                        .fillMaxWidth()
                        .testTag("study_task_row_${task.id}")
                ) {
                    Row(
                        modifier = Modifier.padding(horizontal = 12.dp, vertical = 10.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(10.dp),
                            modifier = Modifier.weight(1f)
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(20.dp)
                                    .clip(CircleShape)
                                    .background(
                                        if (task.isCompleted) Color(0xFF10B981) else Color(0xFFEEF4FF)
                                    ),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = if (task.isCompleted) "✓" else "",
                                    fontFamily = InterFontFamily,
                                    fontSize = 10.sp,
                                    color = Color.White
                                )
                            }

                            Column(verticalArrangement = Arrangement.spacedBy(2.dp)) {
                                Text(
                                    text = task.title,
                                    fontFamily = PlusJakartaSansFamily,
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 12.5.sp,
                                    color = if (task.isCompleted) Color(0xFF94A3B8) else Color(0xFF1E293B),
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                                ) {
                                    Text(
                                        text = task.subject,
                                        fontFamily = InterFontFamily,
                                        fontWeight = FontWeight.Normal,
                                        fontSize = 10.sp,
                                        color = subAccent
                                    )
                                    Text(
                                        text = "• ${task.activityType} • ${task.durationMinutes}m",
                                        fontFamily = InterFontFamily,
                                        fontWeight = FontWeight.Normal,
                                        fontSize = 10.sp,
                                        color = Color(0xFF64748B)
                                    )
                                }
                            }
                        }

                        Surface(
                            onClick = { onDeleteTask(task.id) },
                            shape = CircleShape,
                            color = Color(0xFFF8FAFC)
                        ) {
                            Text(
                                text = "×",
                                fontFamily = InterFontFamily,
                                fontSize = 13.sp,
                                color = Color(0xFF94A3B8),
                                modifier = Modifier.padding(horizontal = 7.dp, vertical = 2.dp)
                            )
                        }
                    }
                }
            }

            if (nextTask != null) {
                Surface(
                    onClick = { onLaunchNextTask(nextTask) },
                    shape = RoundedCornerShape(16.dp),
                    color = Color(0xFFE3EEFF),
                    border = BorderStroke(1.dp, Color(0xFFCEE0FF)),
                    modifier = Modifier
                        .fillMaxWidth()
                        .testTag("study_plan_launch_next_button")
                ) {
                    Row(
                        modifier = Modifier.padding(horizontal = 14.dp, vertical = 10.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = "UP NEXT • ${nextTask.durationMinutes} MIN",
                                fontFamily = InterFontFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 9.sp,
                                letterSpacing = 0.3.sp,
                                color = Color(0xFF2554D8)
                            )
                            Text(
                                text = nextTask.title,
                                fontFamily = PlusJakartaSansFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 12.5.sp,
                                color = Color(0xFF1E293B),
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )
                        }
                        Surface(
                            shape = RoundedCornerShape(50),
                            color = Color(0xFF3E68FF)
                        ) {
                            Text(
                                text = "Start →",
                                fontFamily = InterFontFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 10.5.sp,
                                color = Color.White,
                                modifier = Modifier.padding(horizontal = 12.dp, vertical = 5.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}

/**
 * 4. Quick Study Shortcuts & AI Doubt Assistant Section
 * Inspired by the website's Quick Actions (2x2) + Smart Study Assistant, adapted cleanly
 * into the mobile app's light/cobalt-indigo visual hierarchy.
 */
@Composable
fun MobileStudyToolsAndAssistantSection(
    selectedSubject: String,
    onSmartLessonsClick: () -> Unit,
    onPyqsClick: () -> Unit,
    onQuickMockClick: () -> Unit,
    onFullMockClick: () -> Unit,
    onOpenAiAssistant: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        // 2x2 Grid of Study Tools / Quick Actions
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            MobileToolShortcutTile(
                title = "Smart Lessons",
                subtitle = "Notes & derivations",
                badge = "SYLLABUS",
                badgeColor = PrimaryBlue,
                icon = Icons.AutoMirrored.Outlined.MenuBook,
                onClick = onSmartLessonsClick,
                modifier = Modifier
                    .weight(1f)
                    .testTag("quick_action_smart_lessons")
            )
            MobileToolShortcutTile(
                title = "PYQ Archive",
                subtitle = "IISER IAT 2022–25",
                badge = "PAST PAPERS",
                badgeColor = CyanAccent,
                icon = Icons.Outlined.Description,
                onClick = onPyqsClick,
                modifier = Modifier
                    .weight(1f)
                    .testTag("quick_action_pyqs")
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            MobileToolShortcutTile(
                title = "Timed Sprint",
                subtitle = "$selectedSubject 15m drill",
                badge = "POPULAR",
                badgeColor = ElectricPurple,
                icon = Icons.Default.Bolt,
                onClick = onQuickMockClick,
                modifier = Modifier
                    .weight(1f)
                    .testTag("practice_mode_timed")
            )
            MobileToolShortcutTile(
                title = "Full CBT Mock",
                subtitle = "+4 / -1 exam pattern",
                badge = "IISER IAT",
                badgeColor = SuccessGreen,
                icon = Icons.Outlined.Timer,
                onClick = onFullMockClick,
                modifier = Modifier
                    .weight(1f)
                    .testTag("quick_action_mock_tests")
            )
        }

        // Compact Smart Study Assistant Card (matches the blue-violet AI branding)
        Card(
            onClick = onOpenAiAssistant,
            shape = RoundedCornerShape(22.dp),
            colors = CardDefaults.cardColors(containerColor = Color.Transparent),
            border = BorderStroke(1.2.dp, Color(0xFFD4C7FF)),
            elevation = CardDefaults.cardElevation(defaultElevation = 1.5.dp),
            modifier = Modifier
                .fillMaxWidth()
                .testTag("dash_smart_study_assistant")
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        Brush.linearGradient(
                            colors = listOf(
                                Color(0xFFF3EFFF),
                                Color(0xFFEEF3FF)
                            )
                        )
                    )
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(36.dp)
                                .clip(CircleShape)
                                .background(
                                    Brush.linearGradient(
                                        colors = listOf(PrimaryBlue, ElectricPurple)
                                    )
                                ),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Default.AutoAwesome,
                                contentDescription = null,
                                tint = Color.White,
                                modifier = Modifier.size(18.dp)
                            )
                        }
                        Column {
                            Text(
                                text = "SMART STUDY ASSISTANT",
                                fontFamily = PlusJakartaSansFamily,
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 12.sp,
                                letterSpacing = 0.5.sp,
                                color = DeepIndigo
                            )
                            Text(
                                text = "Step-by-step derivations & doubt resolution",
                                fontFamily = InterFontFamily,
                                fontSize = 11.5.sp,
                                color = SecondaryText
                            )
                        }
                    }

                    Surface(
                        color = Color.White,
                        shape = RoundedCornerShape(50),
                        border = BorderStroke(1.dp, Color(0xFFD4C7FF))
                    ) {
                        Text(
                            text = "Ask AI →",
                            fontFamily = PlusJakartaSansFamily,
                            fontWeight = FontWeight.Bold,
                            fontSize = 11.sp,
                            color = ElectricPurple,
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)
                        )
                    }
                }

                // Prompt Launch Bar
                Surface(
                    shape = RoundedCornerShape(50),
                    color = Color.White,
                    border = BorderStroke(1.dp, Color(0xFFDCE4F7)),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier.padding(horizontal = 14.dp, vertical = 10.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Ask any $selectedSubject concept or IAT question...",
                            fontFamily = InterFontFamily,
                            fontSize = 12.sp,
                            color = SecondaryText
                        )
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                            contentDescription = null,
                            tint = PrimaryBlue,
                            modifier = Modifier.size(15.dp)
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun MobileToolShortcutTile(
    title: String,
    subtitle: String,
    badge: String,
    badgeColor: Color,
    icon: ImageVector,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        onClick = onClick,
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = AppCardSurface),
        border = BorderStroke(1.2.dp, AppCardBorder),
        elevation = CardDefaults.cardElevation(defaultElevation = 1.dp),
        modifier = modifier
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(36.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .background(badgeColor.copy(alpha = 0.12f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = icon,
                        contentDescription = title,
                        tint = badgeColor,
                        modifier = Modifier.size(18.dp)
                    )
                }

                Surface(
                    color = badgeColor.copy(alpha = 0.12f),
                    shape = RoundedCornerShape(6.dp)
                ) {
                    Text(
                        text = badge,
                        fontFamily = PlusJakartaSansFamily,
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 8.5.sp,
                        color = badgeColor,
                        modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.5.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = title,
                fontFamily = PlusJakartaSansFamily,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 14.sp,
                color = PrimaryText,
                maxLines = 1
            )
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = subtitle,
                fontFamily = InterFontFamily,
                fontSize = 11.sp,
                color = SecondaryText,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

/**
 * 5. Preparation Readiness Evaluation & Performance Trend Area Chart
 * Inspired by Website Screenshot 3, designed for the Profile & Analytics screen
 * in the app's native theme.
 */
@Composable
fun ProfileReadinessAndTrendAnalytics(
    overallMasteryPercent: Int,
    attemptedCount: Int,
    correctCount: Int,
    mockTests: List<MockTestEntity>,
    modifier: Modifier = Modifier
) {
    val accuracy = if (attemptedCount > 0) ((correctCount * 100) / attemptedCount) else 88
    val readinessTitle = when {
        overallMasteryPercent >= 50 -> "Strong Preparation"
        overallMasteryPercent >= 25 -> "Steady Progression"
        else -> "Foundation Building"
    }

    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // A. Preparation Readiness Card
        Card(
            shape = RoundedCornerShape(22.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
            border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline),
            modifier = Modifier
                .fillMaxWidth()
                .testTag("dash_preparation_readiness_card")
        ) {
            Column(
                modifier = Modifier.padding(18.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(36.dp)
                                .clip(CircleShape)
                                .background(PrimaryBlue.copy(alpha = 0.12f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Default.EmojiEvents,
                                contentDescription = null,
                                tint = PrimaryBlue,
                                modifier = Modifier.size(18.dp)
                            )
                        }
                        Column {
                            Text(
                                text = "Preparation Readiness",
                                fontFamily = PlusJakartaSansFamily,
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 16.sp,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                            Text(
                                text = "Dynamic IISER IAT profile evaluation",
                                fontFamily = InterFontFamily,
                                fontSize = 11.5.sp,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }

                    Surface(
                        color = SuccessGreen.copy(alpha = 0.14f),
                        shape = RoundedCornerShape(50)
                    ) {
                        Text(
                            text = "● EVALUATED",
                            fontFamily = PlusJakartaSansFamily,
                            fontWeight = FontWeight.ExtraBold,
                            fontSize = 9.sp,
                            color = SuccessGreen,
                            modifier = Modifier.padding(horizontal = 9.dp, vertical = 4.dp)
                        )
                    }
                }

                // Readiness Level Banner
                Surface(
                    shape = RoundedCornerShape(16.dp),
                    color = SuccessGreen.copy(alpha = 0.10f),
                    border = BorderStroke(1.dp, SuccessGreen.copy(alpha = 0.30f)),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(
                        modifier = Modifier.padding(14.dp),
                        verticalArrangement = Arrangement.spacedBy(3.dp)
                    ) {
                        Text(
                            text = "READINESS LEVEL",
                            fontFamily = PlusJakartaSansFamily,
                            fontWeight = FontWeight.ExtraBold,
                            fontSize = 9.5.sp,
                            letterSpacing = 0.5.sp,
                            color = SuccessGreen
                        )
                        Text(
                            text = readinessTitle,
                            fontFamily = PlusJakartaSansFamily,
                            fontWeight = FontWeight.ExtraBold,
                            fontSize = 18.sp,
                            color = SuccessGreen
                        )
                        Text(
                            text = "Consistent accuracy across analytical problems. Keep practicing full-length CBT mocks.",
                            fontFamily = InterFontFamily,
                            fontSize = 11.5.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }

                // 2 KPI Boxes: TOP SCORE | AVG ACCURACY
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Surface(
                        shape = RoundedCornerShape(14.dp),
                        color = AppCardSurface,
                        border = BorderStroke(1.dp, AppCardBorder),
                        modifier = Modifier.weight(1f)
                    ) {
                        Column(modifier = Modifier.padding(12.dp)) {
                            Text(
                                text = "TOP MOCK SCORE",
                                fontFamily = PlusJakartaSansFamily,
                                fontWeight = FontWeight.Bold,
                                fontSize = 9.5.sp,
                                color = SecondaryText
                            )
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = buildAnnotatedString {
                                    withStyle(SpanStyle(color = PrimaryText, fontWeight = FontWeight.ExtraBold)) {
                                        append("196 ")
                                    }
                                    withStyle(SpanStyle(color = SecondaryText, fontSize = 12.sp)) {
                                        append("/ 240")
                                    }
                                },
                                fontFamily = PlusJakartaSansFamily,
                                fontSize = 17.sp
                            )
                        }
                    }

                    Surface(
                        shape = RoundedCornerShape(14.dp),
                        color = AppCardSurface,
                        border = BorderStroke(1.dp, AppCardBorder),
                        modifier = Modifier.weight(1f)
                    ) {
                        Column(modifier = Modifier.padding(12.dp)) {
                            Text(
                                text = "AVG ACCURACY",
                                fontFamily = PlusJakartaSansFamily,
                                fontWeight = FontWeight.Bold,
                                fontSize = 9.5.sp,
                                color = SecondaryText
                            )
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = "$accuracy.0%",
                                fontFamily = PlusJakartaSansFamily,
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 17.sp,
                                color = PrimaryBlue
                            )
                        }
                    }
                }
            }
        }

        // B. Performance Trend Area Chart Card (M1..M5)
        Card(
            shape = RoundedCornerShape(22.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
            border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline),
            modifier = Modifier
                .fillMaxWidth()
                .testTag("dash_performance_trend_card")
        ) {
            Column(
                modifier = Modifier.padding(18.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(36.dp)
                                .clip(CircleShape)
                                .background(AmberAccent.copy(alpha = 0.12f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Default.ShowChart,
                                contentDescription = null,
                                tint = AmberAccent,
                                modifier = Modifier.size(18.dp)
                            )
                        }
                        Column {
                            Text(
                                text = "Performance Trend",
                                fontFamily = PlusJakartaSansFamily,
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 16.sp,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                            Text(
                                text = "Mock test score progression (M1 – M5)",
                                fontFamily = InterFontFamily,
                                fontSize = 11.5.sp,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }

                    Surface(
                        color = PrimaryBlue.copy(alpha = 0.12f),
                        shape = RoundedCornerShape(50)
                    ) {
                        Text(
                            text = "+24% Growth",
                            fontFamily = PlusJakartaSansFamily,
                            fontWeight = FontWeight.Bold,
                            fontSize = 10.sp,
                            color = PrimaryBlue,
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)
                        )
                    }
                }

                // Smooth Bezier Curve Area Chart (M1..M5)
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(145.dp)
                        .padding(top = 6.dp)
                ) {
                    Canvas(modifier = Modifier.fillMaxSize()) {
                        val w = size.width
                        val h = size.height - 20.dp.toPx()
                        val leftPad = 8.dp.toPx()
                        val chartW = w - leftPad * 2

                        val dashEffect = PathEffect.dashPathEffect(floatArrayOf(6f, 6f), 0f)
                        for (i in 0..3) {
                            val y = h * (i / 3f)
                            drawLine(
                                color = Color(0xFFE2E8F5),
                                start = Offset(leftPad, y),
                                end = Offset(w - leftPad, y),
                                strokeWidth = 1.dp.toPx(),
                                pathEffect = dashEffect
                            )
                        }

                        val pts = listOf(
                            Offset(leftPad, h * 0.62f),
                            Offset(leftPad + chartW * 0.25f, h * 0.48f),
                            Offset(leftPad + chartW * 0.50f, h * 0.18f),
                            Offset(leftPad + chartW * 0.75f, h * 0.32f),
                            Offset(leftPad + chartW * 1.00f, h * 0.12f)
                        )

                        val curvePath = Path().apply {
                            moveTo(pts[0].x, pts[0].y)
                            for (i in 0 until pts.size - 1) {
                                val p0 = pts[i]
                                val p1 = pts[i + 1]
                                val cx = (p0.x + p1.x) / 2f
                                cubicTo(cx, p0.y, cx, p1.y, p1.x, p1.y)
                            }
                        }

                        val fillPath = Path().apply {
                            addPath(curvePath)
                            lineTo(pts.last().x, h)
                            lineTo(pts.first().x, h)
                            close()
                        }

                        drawPath(
                            path = fillPath,
                            brush = Brush.verticalGradient(
                                colors = listOf(
                                    PrimaryBlue.copy(alpha = 0.26f),
                                    PrimaryBlue.copy(alpha = 0.02f)
                                ),
                                startY = 0f,
                                endY = h
                            )
                        )

                        drawPath(
                            path = curvePath,
                            color = PrimaryBlue,
                            style = Stroke(width = 2.5.dp.toPx(), cap = StrokeCap.Round)
                        )

                        pts.forEach { pt ->
                            drawCircle(color = Color.White, radius = 4.5.dp.toPx(), center = pt)
                            drawCircle(
                                color = PrimaryBlue,
                                radius = 4.5.dp.toPx(),
                                center = pt,
                                style = Stroke(width = 2.dp.toPx())
                            )
                        }
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 8.dp)
                            .align(Alignment.BottomCenter),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        listOf("M1", "M2", "M3", "M4", "M5").forEach { label ->
                            Text(
                                text = label,
                                fontFamily = InterFontFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 10.sp,
                                color = SecondaryText
                            )
                        }
                    }
                }
            }
        }
    }
}

private data class TrendPointData(
    val shortLabel: String,
    val fullLabel: String,
    val valueLabel: String,
    val deltaLabel: String,
    val normalizedY: Float, // 0f = top (best), 1f = bottom
    val highlightNote: String
)

/**
 * Compact & Sleek Home Performance Trend Graph Bento Card
 * Matches the compact footprint and soft periwinkle-blue glassmorphic Bento aesthetic
 * of the Readiness Engine card, with inline metric switching (Score | Acc % | Speed),
 * a 76.dp smooth cubic Bezier area chart with target line, compact T1..T5 pills,
 * and a single-line live insight footer.
 */
@Composable
fun HomePerformanceTrendBentoSection(
    allQuestions: List<QuestionEntity>,
    allChapters: List<ChapterEntity>,
    onOpenFullAnalytics: () -> Unit,
    modifier: Modifier = Modifier
) {
    var selectedMetricIndex by remember { mutableIntStateOf(0) }
    var selectedPointIndex by remember { mutableIntStateOf(4) }

    val attemptedCount = allQuestions.count { it.isAttempted }
    val correctCount = allQuestions.count { it.isCorrect }
    val liveAccuracy = if (attemptedCount > 0) ((correctCount * 100) / attemptedCount).coerceIn(68, 96) else 88
    val masteryBoost = (allChapters.sumOf { it.completedLessons } * 2).coerceIn(4, 24)
    val latestScore = (168 + masteryBoost).coerceIn(172, 218)

    val metricTabs = listOf("Score", "Acc %", "Speed")

    val pointsForMetric: List<TrendPointData> = remember(selectedMetricIndex, latestScore, liveAccuracy) {
        when (selectedMetricIndex) {
            0 -> listOf(
                TrendPointData("T1", "Mock 1", "134/240", "Baseline", 0.74f, "Physics & Calculus foundation"),
                TrendPointData("T2", "Mock 2", "148/240", "+14M", 0.56f, "Strong Organic Chemistry boost"),
                TrendPointData("T3", "Mock 3", "166/240", "+18M", 0.38f, "Crossed IISER IAT Tier-1 cutoff"),
                TrendPointData("T4", "Mock 4", "178/240", "+12M", 0.25f, "92% accuracy in Genetics & EM"),
                TrendPointData("T5", "Latest", "$latestScore/240", "+${latestScore - 178}M", 0.13f, "Above IISER 180+ safe cutoff")
            )
            1 -> listOf(
                TrendPointData("W1", "Week 1", "71%", "Base", 0.72f, "Reduced negative (-1) guesses"),
                TrendPointData("W2", "Week 2", "76%", "+5%", 0.54f, "Improved Physical Chem numericals"),
                TrendPointData("W3", "Week 3", "81%", "+5%", 0.39f, "Zero negatives in Biology drill"),
                TrendPointData("W4", "Week 4", "85%", "+4%", 0.25f, "Consistent +4 streak in Calculus"),
                TrendPointData("W5", "Now", "$liveAccuracy%", "+${(liveAccuracy - 85).coerceAtLeast(3)}%", 0.14f, "Top 8% precision bracket")
            )
            else -> listOf(
                TrendPointData("S1", "Set 1", "21 Q/h", "Base", 0.72f, "2.8m avg per IAT problem"),
                TrendPointData("S2", "Set 2", "25 Q/h", "+4 Q/h", 0.55f, "Faster dimensional elimination"),
                TrendPointData("S3", "Set 3", "29 Q/h", "+4 Q/h", 0.40f, "Rapid integration shortcuts"),
                TrendPointData("S4", "Set 4", "33 Q/h", "+4 Q/h", 0.26f, "1.8m avg per PYQ question"),
                TrendPointData("S5", "Now", "37 Q/h", "+4 Q/h", 0.14f, "Optimal 180-min CBT pacing")
            )
        }
    }

    val activeAccent = when (selectedMetricIndex) {
        0 -> Color(0xFF2554D8)
        1 -> Color(0xFF059669)
        else -> Color(0xFF6339F9)
    }

    val activePoint = pointsForMetric.getOrElse(selectedPointIndex) { pointsForMetric.last() }

    Surface(
        shape = RoundedCornerShape(22.dp),
        color = Color(0xFFF3F7FF),
        shadowElevation = 0.dp,
        border = BorderStroke(1.dp, Color(0xFFDCE8FF)),
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
            .testTag("home_performance_trend_card")
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    Brush.linearGradient(
                        colors = listOf(Color(0xFFF9FBFF), Color(0xFFEBF3FF))
                    )
                )
                .padding(horizontal = 14.dp, vertical = 12.dp),
            verticalArrangement = Arrangement.spacedBy(9.dp)
        ) {
            // 1. Compact Header Row: Title + Growth Pill on Left, Segmented Metric Switcher on Right
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    Text(
                        text = "Performance Trend",
                        fontFamily = OutfitDisplayFamily,
                        fontWeight = FontWeight.Normal,
                        fontSize = 15.sp,
                        color = Color(0xFF1E293B)
                    )
                    Surface(
                        color = Color(0xFFECFDF5),
                        shape = RoundedCornerShape(50),
                        border = BorderStroke(1.dp, Color(0xFFA7F3D0))
                    ) {
                        Text(
                            text = "↑ +24%",
                            fontFamily = JetBrainsMonoFamily,
                            fontWeight = FontWeight.Normal,
                            fontSize = 8.5.sp,
                            color = Color(0xFF059669),
                            modifier = Modifier.padding(horizontal = 6.5.dp, vertical = 2.dp)
                        )
                    }
                }

                // Compact Segmented Pill Toggle (Score | Acc % | Speed)
                Surface(
                    shape = RoundedCornerShape(50),
                    color = Color.White.copy(alpha = 0.90f),
                    border = BorderStroke(1.dp, Color(0xFFD8E5FF))
                ) {
                    Row(
                        modifier = Modifier.padding(2.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(2.dp)
                    ) {
                        metricTabs.forEachIndexed { idx, tabTitle ->
                            val isSelected = selectedMetricIndex == idx
                            Surface(
                                onClick = { selectedMetricIndex = idx },
                                shape = RoundedCornerShape(50),
                                color = if (isSelected) activeAccent.copy(alpha = 0.13f) else Color.Transparent
                            ) {
                                Text(
                                    text = tabTitle,
                                    fontFamily = InterFontFamily,
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 9.5.sp,
                                    color = if (isSelected) activeAccent else Color(0xFF64748B),
                                    modifier = Modifier.padding(horizontal = 7.5.dp, vertical = 2.5.dp)
                                )
                            }
                        }
                    }
                }
            }

            // 2. Compact Bezier Area Chart + Inline Milestone Selector (T1..T5)
            Surface(
                shape = RoundedCornerShape(16.dp),
                color = Color.White.copy(alpha = 0.88f),
                border = BorderStroke(1.dp, Color(0xFFE1ECFF)),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp, vertical = 8.dp),
                    verticalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(68.dp)
                    ) {
                        Canvas(modifier = Modifier.fillMaxSize()) {
                            val w = size.width
                            val h = size.height - 4.dp.toPx()
                            val leftPad = 14.dp.toPx()
                            val chartW = w - leftPad * 2

                            val dashEffect = PathEffect.dashPathEffect(floatArrayOf(6f, 6f), 0f)
                            for (i in 0..2) {
                                val y = h * (i / 2f)
                                drawLine(
                                    color = Color(0xFFE8F0FF),
                                    start = Offset(leftPad, y),
                                    end = Offset(w - leftPad, y),
                                    strokeWidth = 1.dp.toPx(),
                                    pathEffect = dashEffect
                                )
                            }

                            // IISER Safe Target Cutoff Line
                            val targetY = h * 0.22f
                            drawLine(
                                color = Color(0xFF10B981).copy(alpha = 0.55f),
                                start = Offset(leftPad, targetY),
                                end = Offset(w - leftPad, targetY),
                                strokeWidth = 1.dp.toPx(),
                                pathEffect = PathEffect.dashPathEffect(floatArrayOf(8f, 5f), 0f)
                            )

                            val pts = pointsForMetric.mapIndexed { idx, item ->
                                val x = leftPad + chartW * (idx.toFloat() / (pointsForMetric.size - 1).coerceAtLeast(1))
                                val y = (item.normalizedY * h).coerceIn(6.dp.toPx(), h - 4.dp.toPx())
                                Offset(x, y)
                            }

                            val curvePath = Path().apply {
                                moveTo(pts.first().x, pts.first().y)
                                for (i in 0 until pts.size - 1) {
                                    val p0 = pts[i]
                                    val p1 = pts[i + 1]
                                    val cx = (p0.x + p1.x) / 2f
                                    cubicTo(cx, p0.y, cx, p1.y, p1.x, p1.y)
                                }
                            }

                            val fillPath = Path().apply {
                                addPath(curvePath)
                                lineTo(pts.last().x, h)
                                lineTo(pts.first().x, h)
                                close()
                            }

                            drawPath(
                                path = fillPath,
                                brush = Brush.verticalGradient(
                                    colors = listOf(
                                        activeAccent.copy(alpha = 0.22f),
                                        activeAccent.copy(alpha = 0.02f)
                                    ),
                                    startY = 0f,
                                    endY = h
                                )
                            )

                            val selectedPt = pts.getOrElse(selectedPointIndex) { pts.last() }
                            drawLine(
                                color = activeAccent.copy(alpha = 0.28f),
                                start = Offset(selectedPt.x, selectedPt.y),
                                end = Offset(selectedPt.x, h),
                                strokeWidth = 1.dp.toPx(),
                                pathEffect = dashEffect
                            )

                            drawPath(
                                path = curvePath,
                                color = activeAccent,
                                style = Stroke(width = 2.dp.toPx(), cap = StrokeCap.Round)
                            )

                            pts.forEachIndexed { idx, pt ->
                                val isActiveNode = idx == selectedPointIndex
                                if (isActiveNode) {
                                    drawCircle(
                                        color = activeAccent.copy(alpha = 0.16f),
                                        radius = 7.5.dp.toPx(),
                                        center = pt
                                    )
                                }
                                drawCircle(
                                    color = if (isActiveNode) activeAccent else Color.White,
                                    radius = if (isActiveNode) 4.2.dp.toPx() else 3.4.dp.toPx(),
                                    center = pt
                                )
                                drawCircle(
                                    color = if (isActiveNode) Color.White else activeAccent,
                                    radius = if (isActiveNode) 1.8.dp.toPx() else 3.4.dp.toPx(),
                                    center = pt,
                                    style = if (isActiveNode) androidx.compose.ui.graphics.drawscope.Fill else Stroke(width = 1.6.dp.toPx())
                                )
                            }
                        }
                    }

                    // Slim 5-Milestone Pill Row
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(5.dp)
                    ) {
                        pointsForMetric.forEachIndexed { idx, ptData ->
                            val isSelected = idx == selectedPointIndex
                            Surface(
                                onClick = { selectedPointIndex = idx },
                                shape = RoundedCornerShape(50),
                                color = if (isSelected) activeAccent.copy(alpha = 0.12f) else Color(0xFFF5F8FF),
                                border = BorderStroke(
                                    1.dp,
                                    if (isSelected) activeAccent.copy(alpha = 0.45f) else Color(0xFFE1ECFF)
                                ),
                                modifier = Modifier.weight(1f)
                            ) {
                                Box(
                                    modifier = Modifier.padding(vertical = 3.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = "${ptData.shortLabel} • ${ptData.valueLabel.substringBefore("/")}",
                                        fontFamily = InterFontFamily,
                                        fontWeight = FontWeight.Normal,
                                        fontSize = 8.8.sp,
                                        color = if (isSelected) activeAccent else Color(0xFF52658F),
                                        maxLines = 1
                                    )
                                }
                            }
                        }
                    }
                }
            }

            // 3. Slim Single-Line Active Milestone Insight & Full Report Bar
            Surface(
                onClick = onOpenFullAnalytics,
                shape = RoundedCornerShape(13.dp),
                color = Color.White.copy(alpha = 0.88f),
                border = BorderStroke(1.dp, Color(0xFFDCE8FF)),
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.5.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(6.dp),
                        modifier = Modifier.weight(1f)
                    ) {
                        Surface(
                            shape = RoundedCornerShape(50),
                            color = activeAccent.copy(alpha = 0.11f)
                        ) {
                            Text(
                                text = "${activePoint.fullLabel}: ${activePoint.valueLabel} (${activePoint.deltaLabel})",
                                fontFamily = InterFontFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 9.sp,
                                color = activeAccent,
                                modifier = Modifier.padding(horizontal = 7.dp, vertical = 2.dp)
                            )
                        }
                        Text(
                            text = activePoint.highlightNote,
                            fontFamily = InterFontFamily,
                            fontWeight = FontWeight.Normal,
                            fontSize = 10.5.sp,
                            color = Color(0xFF1E293B),
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    }

                    Spacer(modifier = Modifier.width(6.dp))

                    Text(
                        text = "Report →",
                        fontFamily = InterFontFamily,
                        fontWeight = FontWeight.Normal,
                        fontSize = 10.sp,
                        color = activeAccent
                    )
                }
            }
        }
    }
}

/**
 * Professional Ambient Stationery & Science Brand Watermark Footer ("smartprep / science entrance made easy")
 * Features multi-tone 3D-shaded vector stationery illustrations arranged in a balanced elliptical halo
 * around a protected central safe zone with a sculpted debossed watermark wordmark.
 */
@Composable
fun SmartPrepBrandWatermarkFooter(
    modifier: Modifier = Modifier
) {
    val floatTransition = rememberInfiniteTransition(label = "footer_doodle_float")
    val driftOffset by floatTransition.animateFloat(
        initialValue = -2.0f,
        targetValue = 2.0f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 4200, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "footer_drift"
    )

    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(232.dp)
            .padding(horizontal = 8.dp),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            val w = size.width
            val h = size.height
            val dy = driftOffset.dp.toPx()

            // Multi-tone neutral slate & soft graphite palette (matching high-craft editorial watermarks)
            val lineDark = Color(0xFFB4BCC8)
            val lineMedium = Color(0xFFC5CCD7)
            val lineSoft = Color(0xFFD2D8E2)
            val fillLight = Color(0xFFF3F5F9)
            val fillMid = Color(0xFFE4E8F0)
            val fillShadow = Color(0xFFD5DCE6)

            val mainStroke = Stroke(
                width = 1.25.dp.toPx(),
                cap = StrokeCap.Round,
                join = androidx.compose.ui.graphics.StrokeJoin.Round
            )
            val fineStroke = Stroke(
                width = 0.95.dp.toPx(),
                cap = StrokeCap.Round,
                join = androidx.compose.ui.graphics.StrokeJoin.Round
            )

            // 1. 3D Stacked Sticky Note Pad with curled lower edge, folded corner & cursive squiggle
            fun drawStickyNotePad(cx: Float, cy: Float, boxSize: Float, angleDeg: Float, alphaMul: Float = 1f) {
                withTransform({
                    translate(cx, cy + dy * 0.45f)
                    rotate(angleDeg, Offset.Zero)
                }) {
                    val half = boxSize / 2f
                    val fold = boxSize * 0.24f

                    // Stacked pad base shadow & lower sheets
                    val basePath = Path().apply {
                        moveTo(-half + 1.5.dp.toPx(), -half + 2.dp.toPx())
                        lineTo(half + 1.5.dp.toPx(), -half + 2.dp.toPx())
                        lineTo(half + 1.5.dp.toPx(), half + 2.5.dp.toPx())
                        quadraticTo(
                            0f, half + 4.dp.toPx(),
                            -half + 1.5.dp.toPx(), half + 2.2.dp.toPx()
                        )
                        close()
                    }
                    drawPath(basePath, color = fillShadow.copy(alpha = 0.65f * alphaMul))
                    drawPath(basePath, color = lineMedium.copy(alpha = 0.85f * alphaMul), style = fineStroke)

                    // Top sticky sheet with subtle upward curl on bottom-right
                    val sheetPath = Path().apply {
                        moveTo(-half, -half)
                        lineTo(half, -half)
                        lineTo(half, half - fold)
                        lineTo(half - fold, half)
                        quadraticTo(
                            -half * 0.2f, half + 1.2.dp.toPx(),
                            -half, half - 0.5.dp.toPx()
                        )
                        close()
                    }
                    drawPath(sheetPath, color = fillLight.copy(alpha = 0.95f * alphaMul))
                    drawPath(sheetPath, color = lineDark.copy(alpha = alphaMul), style = mainStroke)

                    // Curled corner triangle flap
                    val flapPath = Path().apply {
                        moveTo(half - fold, half)
                        lineTo(half - fold + 1.5.dp.toPx(), half - fold + 0.5.dp.toPx())
                        lineTo(half, half - fold)
                        close()
                    }
                    drawPath(flapPath, color = fillMid.copy(alpha = alphaMul))
                    drawPath(flapPath, color = lineDark.copy(alpha = alphaMul), style = fineStroke)

                    // Organic wavy handwriting squiggle on top sheet
                    val wave1 = Path().apply {
                        moveTo(-half * 0.58f, -half * 0.24f)
                        cubicTo(
                            -half * 0.32f, -half * 0.42f,
                            -half * 0.14f, -half * 0.08f,
                            half * 0.08f, -half * 0.28f
                        )
                        cubicTo(
                            half * 0.24f, -half * 0.40f,
                            half * 0.36f, -half * 0.12f,
                            half * 0.54f, -half * 0.24f
                        )
                    }
                    drawPath(wave1, color = lineDark.copy(alpha = 0.9f * alphaMul), style = fineStroke)

                    val wave2 = Path().apply {
                        moveTo(-half * 0.56f, half * 0.10f)
                        cubicTo(
                            -half * 0.30f, -half * 0.02f,
                            -half * 0.06f, half * 0.22f,
                            half * 0.22f, half * 0.08f
                        )
                    }
                    drawPath(wave2, color = lineMedium.copy(alpha = 0.85f * alphaMul), style = fineStroke)
                }
            }

            // 2. 3D Curled Spiral Notebook Page with twin-wire loops, punched holes & ruled lines
            fun drawSpiralNotebookPage(cx: Float, cy: Float, sheetW: Float, sheetH: Float, angleDeg: Float, alphaMul: Float = 1f) {
                withTransform({
                    translate(cx, cy - dy * 0.4f)
                    rotate(angleDeg, Offset.Zero)
                }) {
                    val hw = sheetW / 2f
                    val hh = sheetH / 2f

                    // Under-page drop shadow
                    val shadowPath = Path().apply {
                        moveTo(-hw + 2.dp.toPx(), -hh + 2.dp.toPx())
                        lineTo(hw + 2.dp.toPx(), -hh + 2.dp.toPx())
                        lineTo(hw + 1.5.dp.toPx(), hh + 2.dp.toPx())
                        quadraticTo(0f, hh + 4.dp.toPx(), -hw + 1.5.dp.toPx(), hh + 1.5.dp.toPx())
                        close()
                    }
                    drawPath(shadowPath, color = fillShadow.copy(alpha = 0.55f * alphaMul))

                    // Gently curved notebook sheet
                    val pagePath = Path().apply {
                        moveTo(-hw, -hh)
                        lineTo(hw, -hh)
                        lineTo(hw, hh * 0.82f)
                        quadraticTo(hw * 0.45f, hh * 1.06f, -hw, hh * 0.94f)
                        close()
                    }
                    drawPath(pagePath, color = fillLight.copy(alpha = 0.95f * alphaMul))
                    drawPath(pagePath, color = lineDark.copy(alpha = alphaMul), style = mainStroke)

                    // 6 spiral wire binding loops & punched holes along the top edge
                    val ringCount = 6
                    val startX = -hw * 0.74f
                    val stepX = (sheetW * 0.74f) / (ringCount - 1)
                    for (i in 0 until ringCount) {
                        val rx = startX + i * stepX
                        // Punched hole dot
                        drawCircle(
                            color = lineMedium.copy(alpha = alphaMul),
                            radius = 1.1.dp.toPx(),
                            center = Offset(rx, -hh + 3.2.dp.toPx())
                        )
                        // Spiral wire arc
                        drawArc(
                            color = lineDark.copy(alpha = alphaMul),
                            startAngle = 150f,
                            sweepAngle = 240f,
                            useCenter = false,
                            topLeft = Offset(rx - 1.6.dp.toPx(), -hh - 2.6.dp.toPx()),
                            size = Size(3.2.dp.toPx(), 5.4.dp.toPx()),
                            style = fineStroke
                        )
                    }

                    // Crisp parallel ruled lines inside the page
                    for (row in 1..5) {
                        val ly = -hh + sheetH * (0.20f + row * 0.135f)
                        drawLine(
                            color = lineMedium.copy(alpha = 0.82f * alphaMul),
                            start = Offset(-hw * 0.72f, ly),
                            end = Offset(hw * 0.72f, ly),
                            strokeWidth = 0.95.dp.toPx(),
                            cap = StrokeCap.Round
                        )
                    }
                }
            }

            // 3. Detailed Hexagonal Wooden Pencil with ferrule rings, eraser, facets & graphite tip
            fun drawDetailedPencil(cx: Float, cy: Float, len: Float, angleDeg: Float, alphaMul: Float = 1f) {
                withTransform({
                    translate(cx, cy + dy * 0.35f)
                    rotate(angleDeg, Offset.Zero)
                }) {
                    val halfL = len / 2f
                    val r = 2.9.dp.toPx() // Slender, realistic pencil radius

                    val xEraserStart = -halfL
                    val xFerruleStart = -halfL * 0.72f
                    val xBodyStart = -halfL * 0.50f
                    val xConeStart = halfL * 0.42f
                    val xLeadStart = halfL * 0.76f
                    val xTip = halfL

                    // Soft shadow underneath pencil
                    drawLine(
                        color = fillShadow.copy(alpha = 0.55f * alphaMul),
                        start = Offset(xEraserStart + 2.dp.toPx(), r + 1.2.dp.toPx()),
                        end = Offset(xConeStart + 2.dp.toPx(), r + 1.2.dp.toPx()),
                        strokeWidth = 1.6.dp.toPx(),
                        cap = StrokeCap.Round
                    )

                    // Rounded Eraser cap
                    drawRoundRect(
                        color = fillShadow.copy(alpha = 0.85f * alphaMul),
                        topLeft = Offset(xEraserStart, -r),
                        size = Size(xFerruleStart - xEraserStart + 2.dp.toPx(), r * 2f),
                        cornerRadius = CornerRadius(r, r)
                    )
                    drawRoundRect(
                        color = lineDark.copy(alpha = alphaMul),
                        topLeft = Offset(xEraserStart, -r),
                        size = Size(xFerruleStart - xEraserStart + 2.dp.toPx(), r * 2f),
                        cornerRadius = CornerRadius(r, r),
                        style = fineStroke
                    )

                    // Metallic Ferrule band
                    drawRect(
                        color = fillLight.copy(alpha = alphaMul),
                        topLeft = Offset(xFerruleStart, -r),
                        size = Size(xBodyStart - xFerruleStart, r * 2f)
                    )
                    drawRect(
                        color = lineDark.copy(alpha = alphaMul),
                        topLeft = Offset(xFerruleStart, -r),
                        size = Size(xBodyStart - xFerruleStart, r * 2f),
                        style = fineStroke
                    )
                    // Ferrule detail line
                    val midFerrule = (xFerruleStart + xBodyStart) / 2f
                    drawLine(
                        color = lineMedium.copy(alpha = alphaMul),
                        start = Offset(midFerrule, -r),
                        end = Offset(midFerrule, r),
                        strokeWidth = 0.8.dp.toPx()
                    )

                    // Hexagonal Barrel body
                    drawRect(
                        color = fillMid.copy(alpha = 0.75f * alphaMul),
                        topLeft = Offset(xBodyStart, -r),
                        size = Size(xConeStart - xBodyStart, r * 2f)
                    )
                    drawRect(
                        color = lineDark.copy(alpha = alphaMul),
                        topLeft = Offset(xBodyStart, -r),
                        size = Size(xConeStart - xBodyStart, r * 2f),
                        style = mainStroke
                    )
                    // Hexagonal facet ridge lines along barrel
                    drawLine(
                        color = lineMedium.copy(alpha = 0.9f * alphaMul),
                        start = Offset(xBodyStart, -r * 0.35f),
                        end = Offset(xConeStart, -r * 0.35f),
                        strokeWidth = 0.75.dp.toPx()
                    )
                    drawLine(
                        color = lineMedium.copy(alpha = 0.9f * alphaMul),
                        start = Offset(xBodyStart, r * 0.35f),
                        end = Offset(xConeStart, r * 0.35f),
                        strokeWidth = 0.75.dp.toPx()
                    )

                    // Sharpened Wooden Cone
                    val conePath = Path().apply {
                        moveTo(xConeStart, -r)
                        lineTo(xTip, 0f)
                        lineTo(xConeStart, r)
                        close()
                    }
                    drawPath(conePath, color = fillLight.copy(alpha = alphaMul))
                    drawPath(conePath, color = lineDark.copy(alpha = alphaMul), style = mainStroke)

                    // Solid Graphite Lead Point at the very tip
                    val leadRatio = (xTip - xLeadStart) / (xTip - xConeStart)
                    val leadHalfH = r * leadRatio
                    val leadPath = Path().apply {
                        moveTo(xLeadStart, -leadHalfH)
                        lineTo(xTip, 0f)
                        lineTo(xLeadStart, leadHalfH)
                        close()
                    }
                    drawPath(leadPath, color = lineDark.copy(alpha = 0.9f * alphaMul))
                }
            }

            // 4. 3D Perspective Tape Roll with cylinder depth, inner spool & serrated tape tab
            fun drawPerspectiveTapeRoll(cx: Float, cy: Float, radius: Float, angleDeg: Float, alphaMul: Float = 1f) {
                withTransform({
                    translate(cx, cy + dy * 0.45f)
                    rotate(angleDeg, Offset.Zero)
                }) {
                    val depthOffset = Offset(-radius * 0.16f, radius * 0.22f)

                    // Protruding tape strip tab with serrated end (sticking out top-right)
                    val tabPath = Path().apply {
                        moveTo(radius * 0.55f, -radius * 0.72f)
                        lineTo(radius * 0.78f, -radius * 1.48f)
                        lineTo(radius * 0.96f, -radius * 1.40f)
                        lineTo(radius * 1.12f, -radius * 1.44f)
                        lineTo(radius * 1.28f, -radius * 1.32f)
                        lineTo(radius * 0.96f, -radius * 0.32f)
                        close()
                    }
                    drawPath(tabPath, color = fillLight.copy(alpha = 0.9f * alphaMul))
                    drawPath(tabPath, color = lineMedium.copy(alpha = alphaMul), style = fineStroke)

                    // Lower 3D cylinder body shadow
                    drawCircle(
                        color = fillShadow.copy(alpha = 0.8f * alphaMul),
                        radius = radius,
                        center = depthOffset
                    )
                    drawCircle(
                        color = lineDark.copy(alpha = alphaMul),
                        radius = radius,
                        center = depthOffset,
                        style = fineStroke
                    )

                    // Upper circular tape face
                    drawCircle(
                        color = fillLight.copy(alpha = 0.95f * alphaMul),
                        radius = radius,
                        center = Offset.Zero
                    )
                    drawCircle(
                        color = lineDark.copy(alpha = alphaMul),
                        radius = radius,
                        center = Offset.Zero,
                        style = mainStroke
                    )

                    // Subtle middle tape wind ring
                    drawCircle(
                        color = lineSoft.copy(alpha = 0.75f * alphaMul),
                        radius = radius * 0.74f,
                        center = Offset.Zero,
                        style = fineStroke
                    )

                    // Inner hollow spool core with 3D inner wall
                    val coreR = radius * 0.46f
                    drawCircle(
                        color = fillMid.copy(alpha = 0.9f * alphaMul),
                        radius = coreR,
                        center = Offset.Zero
                    )
                    // White cutout shifted slightly toward depth to create inner cylinder wall
                    drawCircle(
                        color = Color.White,
                        radius = coreR * 0.82f,
                        center = Offset(depthOffset.x * 0.35f, depthOffset.y * 0.35f)
                    )
                    drawCircle(
                        color = lineDark.copy(alpha = alphaMul),
                        radius = coreR,
                        center = Offset.Zero,
                        style = mainStroke
                    )
                }
            }

            // 5. Realistic Continuous-Wire Paperclip
            fun drawDetailedPaperclip(cx: Float, cy: Float, scale: Float, angleDeg: Float, alphaMul: Float = 0.85f) {
                withTransform({
                    translate(cx, cy - dy * 0.3f)
                    rotate(angleDeg, Offset.Zero)
                }) {
                    val wClip = 5.6.dp.toPx() * scale
                    val hClip = 14.5.dp.toPx() * scale
                    val rOuter = wClip / 2f
                    val rInner = wClip * 0.30f

                    val clipPath = Path().apply {
                        // Start on inner right leg
                        moveTo(rInner, -hClip * 0.15f)
                        lineTo(rInner, hClip * 0.26f)
                        // Bottom inner U-turn
                        arcTo(
                            rect = androidx.compose.ui.geometry.Rect(
                                left = -rInner,
                                top = hClip * 0.26f - rInner,
                                right = rInner,
                                bottom = hClip * 0.26f + rInner
                            ),
                            startAngleDegrees = 0f,
                            sweepAngleDegrees = 180f,
                            forceMoveTo = false
                        )
                        // Up left side to top outer U-turn
                        lineTo(-rInner, -hClip * 0.34f)
                        arcTo(
                            rect = androidx.compose.ui.geometry.Rect(
                                left = -rOuter,
                                top = -hClip * 0.34f - rOuter,
                                right = rOuter,
                                bottom = -hClip * 0.34f + rOuter
                            ),
                            startAngleDegrees = 180f,
                            sweepAngleDegrees = 180f,
                            forceMoveTo = false
                        )
                        // Down right outer leg to bottom outer U-turn
                        lineTo(rOuter, hClip * 0.34f)
                        arcTo(
                            rect = androidx.compose.ui.geometry.Rect(
                                left = -rOuter,
                                top = hClip * 0.34f - rOuter,
                                right = rOuter,
                                bottom = hClip * 0.34f + rOuter
                            ),
                            startAngleDegrees = 0f,
                            sweepAngleDegrees = 180f,
                            forceMoveTo = false
                        )
                        // End halfway up outer left leg
                        lineTo(-rOuter, -hClip * 0.08f)
                    }
                    drawPath(
                        path = clipPath,
                        color = lineDark.copy(alpha = alphaMul),
                        style = Stroke(width = 1.15.dp.toPx(), cap = StrokeCap.Round, join = androidx.compose.ui.graphics.StrokeJoin.Round)
                    )
                }
            }

            // 6. Detailed Two-Tone Binder Clip with wire arms
            fun drawDetailedBinderClip(cx: Float, cy: Float, scale: Float, angleDeg: Float, alphaMul: Float = 0.82f) {
                withTransform({
                    translate(cx, cy + dy * 0.25f)
                    rotate(angleDeg, Offset.Zero)
                }) {
                    val bw = 11.5.dp.toPx() * scale
                    val bh = 8.5.dp.toPx() * scale

                    // Top metallic wire handle loop
                    val wirePath = Path().apply {
                        moveTo(-bw * 0.16f, -bh * 0.25f)
                        lineTo(-bw * 0.24f, -bh * 0.82f)
                        arcTo(
                            rect = androidx.compose.ui.geometry.Rect(
                                left = -bw * 0.24f,
                                top = -bh * 1.12f,
                                right = bw * 0.24f,
                                bottom = -bh * 0.68f
                            ),
                            startAngleDegrees = 180f,
                            sweepAngleDegrees = 180f,
                            forceMoveTo = false
                        )
                        lineTo(bw * 0.16f, -bh * 0.25f)
                    }
                    drawPath(wirePath, color = lineDark.copy(alpha = alphaMul), style = fineStroke)

                    // Main trapezoid clip body
                    val bodyPath = Path().apply {
                        moveTo(-bw * 0.34f, -bh * 0.25f)
                        lineTo(bw * 0.34f, -bh * 0.25f)
                        lineTo(bw * 0.50f, bh * 0.48f)
                        lineTo(-bw * 0.50f, bh * 0.48f)
                        close()
                    }
                    drawPath(bodyPath, color = fillShadow.copy(alpha = 0.9f * alphaMul))
                    drawPath(bodyPath, color = lineDark.copy(alpha = alphaMul), style = fineStroke)

                    // Side 3D facet divider line
                    drawLine(
                        color = lineDark.copy(alpha = 0.75f * alphaMul),
                        start = Offset(bw * 0.14f, -bh * 0.25f),
                        end = Offset(bw * 0.22f, bh * 0.48f),
                        strokeWidth = 0.85.dp.toPx()
                    )
                }
            }

            // =========================================================================
            // ELLIPTICAL HALO LAYOUT — 100% CLEAR CENTRAL SAFE ZONE (x: 0.25..0.75, y: 0.32..0.68)
            // Carefully balanced around the perimeter like the reference illustration
            // =========================================================================

            // --- TOP ARC ---
            // Top-left paperclip
            drawDetailedPaperclip(cx = w * 0.20f, cy = h * 0.20f, scale = 1.0f, angleDeg = 28f)
            // Top-center-left 3D Sticky Note Pad
            drawStickyNotePad(cx = w * 0.41f, cy = h * 0.17f, boxSize = 31.dp.toPx(), angleDeg = 15f)
            // Top-center-right Detailed Pencil
            drawDetailedPencil(cx = w * 0.61f, cy = h * 0.19f, len = 36.dp.toPx(), angleDeg = -26f)
            // Top-right Spiral Notebook Page
            drawSpiralNotebookPage(cx = w * 0.78f, cy = h * 0.25f, sheetW = 30.dp.toPx(), sheetH = 33.dp.toPx(), angleDeg = 12f)
            // Far top-right Binder Clip
            drawDetailedBinderClip(cx = w * 0.92f, cy = h * 0.21f, scale = 0.95f, angleDeg = -18f)

            // --- LEFT & RIGHT FLANKS (Well outside the wordmark width) ---
            // Far-left Binder Clip
            drawDetailedBinderClip(cx = w * 0.07f, cy = h * 0.30f, scale = 0.95f, angleDeg = 36f)
            // Mid-left 3D Tape Roll
            drawPerspectiveTapeRoll(cx = w * 0.14f, cy = h * 0.43f, radius = 11.5.dp.toPx(), angleDeg = -12f)
            // Inner-left Spiral Notebook Page (kept safely above-left of "smartprep")
            drawSpiralNotebookPage(cx = w * 0.26f, cy = h * 0.28f, sheetW = 24.dp.toPx(), sheetH = 27.dp.toPx(), angleDeg = 16f)
            // Far-left lower Paperclip
            drawDetailedPaperclip(cx = w * 0.08f, cy = h * 0.60f, scale = 0.92f, angleDeg = 52f, alphaMul = 0.65f)

            // Inner-right Paperclip (kept safely outside the right edge of "smartprep")
            drawDetailedPaperclip(cx = w * 0.76f, cy = h * 0.41f, scale = 0.92f, angleDeg = -18f)
            // Mid-right 3D Sticky Note Pad
            drawStickyNotePad(cx = w * 0.87f, cy = h * 0.43f, boxSize = 27.dp.toPx(), angleDeg = 16f)
            // Far-right lower Paperclip
            drawDetailedPaperclip(cx = w * 0.95f, cy = h * 0.58f, scale = 0.88f, angleDeg = -48f, alphaMul = 0.55f)

            // --- BOTTOM ARC (Safely below "science entrance made easy") ---
            // Bottom-left Detailed Pencil
            drawDetailedPencil(cx = w * 0.19f, cy = h * 0.74f, len = 34.dp.toPx(), angleDeg = -155f)
            // Lower-left Paperclip accent
            drawDetailedPaperclip(cx = w * 0.28f, cy = h * 0.66f, scale = 0.82f, angleDeg = 36f, alphaMul = 0.75f)
            // Bottom-center-left Detailed Pencil
            drawDetailedPencil(cx = w * 0.39f, cy = h * 0.79f, len = 32.dp.toPx(), angleDeg = 42f)
            // Bottom-center-right Spiral Notebook Page
            drawSpiralNotebookPage(cx = w * 0.58f, cy = h * 0.81f, sheetW = 30.dp.toPx(), sheetH = 33.dp.toPx(), angleDeg = -20f)
            // Bottom-right Binder Clip
            drawDetailedBinderClip(cx = w * 0.74f, cy = h * 0.75f, scale = 0.95f, angleDeg = -22f)
            // Far bottom-right 3D Tape Roll
            drawPerspectiveTapeRoll(cx = w * 0.87f, cy = h * 0.75f, radius = 11.5.dp.toPx(), angleDeg = 110f, alphaMul = 0.82f)
        }

        // Center Sculpted Brand Watermark Typography ("smartprep / science entrance made easy")
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(2.dp),
            modifier = Modifier.padding(bottom = 6.dp)
        ) {
            // Sculpted debossed/soft-3D wordmark ("smartprep") in OutfitDisplayFamily
            Box(contentAlignment = Alignment.Center) {
                // Soft upper-left inner-shadow offset
                Text(
                    text = "smartprep",
                    fontFamily = OutfitDisplayFamily,
                    fontWeight = FontWeight.Light,
                    fontSize = 34.sp,
                    letterSpacing = (-0.25).sp,
                    color = Color(0xFFB8C0CE).copy(alpha = 0.55f),
                    modifier = Modifier.graphicsLayer {
                        translationX = -0.8.dp.toPx()
                        translationY = -0.9.dp.toPx()
                    }
                )
                // Crisp bottom-right highlight offset
                Text(
                    text = "smartprep",
                    fontFamily = OutfitDisplayFamily,
                    fontWeight = FontWeight.Light,
                    fontSize = 34.sp,
                    letterSpacing = (-0.25).sp,
                    color = Color.White.copy(alpha = 0.85f),
                    modifier = Modifier.graphicsLayer {
                        translationX = 0.9.dp.toPx()
                        translationY = 0.9.dp.toPx()
                    }
                )
                // Main sculpted watermark layer
                Text(
                    text = "smartprep",
                    fontFamily = OutfitDisplayFamily,
                    fontWeight = FontWeight.Light,
                    fontSize = 34.sp,
                    letterSpacing = (-0.25).sp,
                    color = Color(0xFFD0D6E2)
                )
            }

            Text(
                text = "science entrance made easy",
                fontFamily = InterFontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 13.5.sp,
                letterSpacing = 0.35.sp,
                color = Color(0xFFB2BAC8)
            )
        }
    }
}




