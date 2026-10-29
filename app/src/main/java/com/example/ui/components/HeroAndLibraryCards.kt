package com.example.ui.components

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.keyframes
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.DeleteOutline
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.RadioButtonUnchecked
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.material.icons.filled.Timer
import androidx.compose.material.icons.filled.Verified
import androidx.compose.material.icons.automirrored.outlined.Assignment
import androidx.compose.material.icons.outlined.Description
import androidx.compose.material.icons.outlined.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.local.ChapterEntity
import com.example.data.local.MockTestEntity
import com.example.data.local.StudyPlanTaskEntity
import com.example.ui.theme.AcademicSerifFamily
import com.example.ui.theme.CardBackground
import com.example.ui.theme.CharcoalSelected
import com.example.ui.theme.DeepIndigo
import com.example.ui.theme.DividerGray
import com.example.ui.theme.ElectricPurple
import com.example.ui.theme.InterFontFamily
import com.example.ui.theme.JetBrainsMonoFamily
import com.example.ui.theme.MutedIconGray
import com.example.ui.theme.OutfitDisplayFamily
import com.example.ui.theme.PlusJakartaSansFamily
import com.example.ui.theme.PrimaryBlue
import com.example.ui.theme.PrimaryText
import com.example.ui.theme.SecondaryText
import com.example.ui.theme.SnapAiPillBlue
import com.example.ui.theme.SnapAiPillLightBlue
import com.example.ui.theme.SoftLavender
import com.example.ui.theme.SuccessGreen
import com.example.ui.theme.TextbookRibbonRed
import com.example.ui.theme.TextbookYellowBottom
import com.example.ui.theme.TextbookYellowTop
import kotlin.math.cos
import kotlin.math.sin

/**
 * Exact Reference Screenshot Hero Section:
 * 1. 3D Layered Translucent Document Fan with left geometry page, right organic chemistry hexagon page,
 *    and central white math proof page ("In ΔABC, AB = AC, ∠B = ∠C...") framed by 4 white scanner
 *    corner brackets and top-right sparkle rays.
 * 2. Prominent white pill button below: "SNAP & SOLVE" + blue inner pill "AI |||||".
 */
@Composable
fun HeroSection(
    hasProgress: Boolean,
    overallMasteryPercent: Int,
    nextChapterTitle: String,
    onPrimaryCtaClick: () -> Unit,
    onPracticeCtaClick: () -> Unit,
    onSnapSolveClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 2.dp, bottom = 4.dp)
            .testTag("hero_section"),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // 1. Compact Perspective-Fanned Document Scanner Illustration (152.dp height)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(152.dp)
                .clickable { onSnapSolveClick() },
            contentAlignment = Alignment.Center
        ) {
            // 3D Rotated Rounded Side Cards + Scanner Corner Brackets + Top-Right Sparkle Rays
            Canvas(
                modifier = Modifier
                    .width(324.dp)
                    .height(148.dp)
            ) {
                val cx = size.width / 2f
                val cy = size.height / 2f

                // Subtle soft radial glow behind the scanner fan
                drawCircle(
                    brush = Brush.radialGradient(
                        colors = listOf(
                            Color.White.copy(alpha = 0.20f),
                            Color.Transparent
                        ),
                        center = Offset(cx, cy),
                        radius = 128.dp.toPx()
                    ),
                    radius = 128.dp.toPx(),
                    center = Offset(cx, cy)
                )

                val cardW = 84.dp.toPx()
                val cardH = 96.dp.toPx()
                val cardCorner = CornerRadius(12.dp.toPx(), 12.dp.toPx())

                // Outer-Left Fanned Card (Tier 3)
                rotate(degrees = -16f, pivot = Offset(cx - 58.dp.toPx(), cy + 30.dp.toPx())) {
                    val topLeft = Offset(cx - 126.dp.toPx(), cy - 42.dp.toPx())
                    drawRoundRect(
                        color = Color.White.copy(alpha = 0.20f),
                        topLeft = topLeft,
                        size = Size(cardW, cardH * 0.88f),
                        cornerRadius = cardCorner
                    )
                    drawRoundRect(
                        color = Color.White.copy(alpha = 0.32f),
                        topLeft = topLeft,
                        size = Size(cardW, cardH * 0.88f),
                        cornerRadius = cardCorner,
                        style = Stroke(width = 1.dp.toPx())
                    )
                }

                // Outer-Right Fanned Card (Tier 3)
                rotate(degrees = 16f, pivot = Offset(cx + 58.dp.toPx(), cy + 30.dp.toPx())) {
                    val topLeft = Offset(cx + 42.dp.toPx(), cy - 42.dp.toPx())
                    drawRoundRect(
                        color = Color.White.copy(alpha = 0.20f),
                        topLeft = topLeft,
                        size = Size(cardW, cardH * 0.88f),
                        cornerRadius = cardCorner
                    )
                    drawRoundRect(
                        color = Color.White.copy(alpha = 0.32f),
                        topLeft = topLeft,
                        size = Size(cardW, cardH * 0.88f),
                        cornerRadius = cardCorner,
                        style = Stroke(width = 1.dp.toPx())
                    )
                }

                // Mid-Left Fanned Card (Tier 2)
                rotate(degrees = -10f, pivot = Offset(cx - 44.dp.toPx(), cy + 32.dp.toPx())) {
                    val topLeft = Offset(cx - 106.dp.toPx(), cy - 46.dp.toPx())
                    drawRoundRect(
                        color = Color.White.copy(alpha = 0.42f),
                        topLeft = topLeft,
                        size = Size(cardW, cardH * 0.94f),
                        cornerRadius = cardCorner
                    )
                    drawRoundRect(
                        color = Color.White.copy(alpha = 0.55f),
                        topLeft = topLeft,
                        size = Size(cardW, cardH * 0.94f),
                        cornerRadius = cardCorner,
                        style = Stroke(width = 1.dp.toPx())
                    )
                }

                // Mid-Right Fanned Card (Tier 2)
                rotate(degrees = 10f, pivot = Offset(cx + 44.dp.toPx(), cy + 32.dp.toPx())) {
                    val topLeft = Offset(cx + 22.dp.toPx(), cy - 46.dp.toPx())
                    drawRoundRect(
                        color = Color.White.copy(alpha = 0.42f),
                        topLeft = topLeft,
                        size = Size(cardW, cardH * 0.94f),
                        cornerRadius = cardCorner
                    )
                    drawRoundRect(
                        color = Color.White.copy(alpha = 0.55f),
                        topLeft = topLeft,
                        size = Size(cardW, cardH * 0.94f),
                        cornerRadius = cardCorner,
                        style = Stroke(width = 1.dp.toPx())
                    )
                }

                val lineTint = Color(0xFF7B99EC)

                // Inner-Left Fanned Card (Tier 1) — Physics Wave & Optics Diagram
                rotate(degrees = -5f, pivot = Offset(cx - 30.dp.toPx(), cy + 36.dp.toPx())) {
                    val leftX = cx - 86.dp.toPx()
                    val topY = cy - 50.dp.toPx()
                    drawRoundRect(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color.White.copy(alpha = 0.88f),
                                Color(0xFFE4EEFF).copy(alpha = 0.82f)
                            ),
                            startY = topY,
                            endY = topY + cardH
                        ),
                        topLeft = Offset(leftX, topY),
                        size = Size(cardW, cardH),
                        cornerRadius = cardCorner
                    )
                    drawRoundRect(
                        color = Color.White.copy(alpha = 0.85f),
                        topLeft = Offset(leftX, topY),
                        size = Size(cardW, cardH),
                        cornerRadius = cardCorner,
                        style = Stroke(width = 1.1.dp.toPx())
                    )

                    // Note lines on Inner-Left Card
                    for (row in 0..2) {
                        val ly = topY + 14.dp.toPx() + row * 6.dp.toPx()
                        drawLine(
                            color = lineTint.copy(alpha = 0.6f),
                            start = Offset(leftX + 10.dp.toPx(), ly),
                            end = Offset(leftX + 34.dp.toPx(), ly),
                            strokeWidth = 1.8.dp.toPx(),
                            cap = StrokeCap.Round
                        )
                    }

                    // Crisp Standing Wave / Orbital diagram on Inner-Left Card
                    val waveCenterY = topY + 58.dp.toPx()
                    val waveStartX = leftX + 9.dp.toPx()
                    val waveWidth = 24.dp.toPx()
                    drawLine(
                        color = lineTint.copy(alpha = 0.45f),
                        start = Offset(waveStartX, waveCenterY),
                        end = Offset(waveStartX + waveWidth, waveCenterY),
                        strokeWidth = 1.dp.toPx()
                    )
                    val wavePath = Path().apply {
                        moveTo(waveStartX, waveCenterY)
                        cubicTo(
                            waveStartX + waveWidth * 0.25f, waveCenterY - 12.dp.toPx(),
                            waveStartX + waveWidth * 0.25f, waveCenterY - 12.dp.toPx(),
                            waveStartX + waveWidth * 0.5f, waveCenterY
                        )
                        cubicTo(
                            waveStartX + waveWidth * 0.75f, waveCenterY + 12.dp.toPx(),
                            waveStartX + waveWidth * 0.75f, waveCenterY + 12.dp.toPx(),
                            waveStartX + waveWidth, waveCenterY
                        )
                    }
                    drawPath(wavePath, color = lineTint, style = Stroke(width = 1.5.dp.toPx(), cap = StrokeCap.Round))
                }

                // Inner-Right Fanned Card (Tier 1) — Organic Chemistry Aromatic Ring
                rotate(degrees = 5f, pivot = Offset(cx + 30.dp.toPx(), cy + 36.dp.toPx())) {
                    val rightX = cx + 2.dp.toPx()
                    val topY = cy - 50.dp.toPx()
                    drawRoundRect(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color.White.copy(alpha = 0.88f),
                                Color(0xFFE4EEFF).copy(alpha = 0.82f)
                            ),
                            startY = topY,
                            endY = topY + cardH
                        ),
                        topLeft = Offset(rightX, topY),
                        size = Size(cardW, cardH),
                        cornerRadius = cardCorner
                    )
                    drawRoundRect(
                        color = Color.White.copy(alpha = 0.85f),
                        topLeft = Offset(rightX, topY),
                        size = Size(cardW, cardH),
                        cornerRadius = cardCorner,
                        style = Stroke(width = 1.1.dp.toPx())
                    )

                    // Note lines on Inner-Right Card
                    for (row in 0..2) {
                        val ry = topY + 14.dp.toPx() + row * 6.dp.toPx()
                        drawLine(
                            color = lineTint.copy(alpha = 0.6f),
                            start = Offset(rightX + cardW - 34.dp.toPx(), ry),
                            end = Offset(rightX + cardW - 10.dp.toPx(), ry),
                            strokeWidth = 1.8.dp.toPx(),
                            cap = StrokeCap.Round
                        )
                    }

                    // Benzene Hexagon on Inner-Right Card
                    val hexCenter = Offset(rightX + cardW - 21.dp.toPx(), topY + 58.dp.toPx())
                    val hexR = 11.dp.toPx()
                    val hexPath = Path()
                    for (i in 0..5) {
                        val angle = Math.toRadians((60 * i - 30).toDouble())
                        val px = hexCenter.x + (hexR * cos(angle)).toFloat()
                        val py = hexCenter.y + (hexR * sin(angle)).toFloat()
                        if (i == 0) hexPath.moveTo(px, py) else hexPath.lineTo(px, py)
                    }
                    hexPath.close()
                    drawPath(hexPath, color = lineTint, style = Stroke(width = 1.4.dp.toPx()))
                    drawCircle(
                        color = lineTint.copy(alpha = 0.65f),
                        radius = hexR * 0.52f,
                        center = hexCenter,
                        style = Stroke(width = 1.1.dp.toPx())
                    )
                }

                // 4 Crisp White Scanner Corner Brackets with generous breathing room around Center Card
                val frameLeft = cx - 63.dp.toPx()
                val frameRight = cx + 63.dp.toPx()
                val frameTop = cy - 67.dp.toPx()
                val frameBottom = cy + 67.dp.toPx()
                val bracketLen = 20.dp.toPx()
                val cornerR = 13.dp.toPx()
                val strokeW = 3.dp.toPx()

                // Top-Left Bracket
                val tlPath = Path().apply {
                    moveTo(frameLeft, frameTop + bracketLen)
                    lineTo(frameLeft, frameTop + cornerR)
                    quadraticTo(frameLeft, frameTop, frameLeft + cornerR, frameTop)
                    lineTo(frameLeft + bracketLen, frameTop)
                }
                drawPath(tlPath, Color.White, style = Stroke(width = strokeW, cap = StrokeCap.Round))

                // Top-Right Bracket
                val trPath = Path().apply {
                    moveTo(frameRight - bracketLen, frameTop)
                    lineTo(frameRight - cornerR, frameTop)
                    quadraticTo(frameRight, frameTop, frameRight, frameTop + cornerR)
                    lineTo(frameRight, frameTop + bracketLen)
                }
                drawPath(trPath, Color.White, style = Stroke(width = strokeW, cap = StrokeCap.Round))

                // Bottom-Left Bracket
                val blPath = Path().apply {
                    moveTo(frameLeft, frameBottom - bracketLen)
                    lineTo(frameLeft, frameBottom - cornerR)
                    quadraticTo(frameLeft, frameBottom, frameLeft + cornerR, frameBottom)
                    lineTo(frameLeft + bracketLen, frameBottom)
                }
                drawPath(blPath, Color.White, style = Stroke(width = strokeW, cap = StrokeCap.Round))

                // Bottom-Right Bracket
                val brPath = Path().apply {
                    moveTo(frameRight - bracketLen, frameBottom)
                    lineTo(frameRight - cornerR, frameBottom)
                    quadraticTo(frameRight, frameBottom, frameRight, frameBottom - cornerR)
                    lineTo(frameRight, frameBottom - bracketLen)
                }
                drawPath(brPath, Color.White, style = Stroke(width = strokeW, cap = StrokeCap.Round))

                // Top-Right Sparkle Rays
                drawLine(
                    color = Color.White,
                    start = Offset(frameRight + 6.dp.toPx(), frameTop - 1.dp.toPx()),
                    end = Offset(frameRight + 12.dp.toPx(), frameTop - 10.dp.toPx()),
                    strokeWidth = 2.8.dp.toPx(),
                    cap = StrokeCap.Round
                )
                drawLine(
                    color = Color.White,
                    start = Offset(frameRight + 13.dp.toPx(), frameTop + 6.dp.toPx()),
                    end = Offset(frameRight + 22.dp.toPx(), frameTop + 2.dp.toPx()),
                    strokeWidth = 2.8.dp.toPx(),
                    cap = StrokeCap.Round
                )
            }

            // Center Foreground Crisp White IISER Question Sheet (112.dp x 120.dp)
            Surface(
                shape = RoundedCornerShape(14.dp),
                color = Color.White,
                shadowElevation = 8.dp,
                modifier = Modifier
                    .width(112.dp)
                    .height(120.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 9.dp, vertical = 8.dp),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    // 1. Header Pill Row: IAT Tag + Verified Dot
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(4.dp))
                                .background(Color(0xFFEAF1FF))
                                .padding(horizontal = 5.dp, vertical = 1.5.dp)
                        ) {
                            Text(
                                text = "IAT • CALCULUS",
                                fontFamily = JetBrainsMonoFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 5.6.sp,
                                letterSpacing = 0.2.sp,
                                color = SnapAiPillBlue
                            )
                        }
                        Box(
                            modifier = Modifier
                                .size(6.dp)
                                .clip(CircleShape)
                                .background(SuccessGreen)
                        )
                    }

                    // 2. Problem Statement + Shaded Integral Curve Mini-Graph
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column(verticalArrangement = Arrangement.spacedBy(1.dp)) {
                            Text(
                                text = "Evaluate:",
                                fontFamily = InterFontFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 6.5.sp,
                                lineHeight = 7.5.sp,
                                color = SecondaryText
                            )
                            Text(
                                text = "∫₀^∞ x·e⁻ˣ dx",
                                fontFamily = AcademicSerifFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 8.6.sp,
                                lineHeight = 9.8.sp,
                                color = PrimaryText
                            )
                            Text(
                                text = "Γ(2) Wave Integral",
                                fontFamily = InterFontFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 5.8.sp,
                                lineHeight = 7.sp,
                                color = SnapAiPillBlue
                            )
                        }

                        // Mini Shaded Graph Box (y = x * e^-x)
                        Box(
                            modifier = Modifier
                                .width(36.dp)
                                .height(32.dp)
                                .clip(RoundedCornerShape(6.dp))
                                .background(Color(0xFFF3F7FF))
                                .padding(3.dp)
                        ) {
                            Canvas(modifier = Modifier.fillMaxSize()) {
                                val w = size.width
                                val h = size.height
                                val axisColor = Color(0xFF94A3B8)

                                // Axes
                                drawLine(
                                    color = axisColor,
                                    start = Offset(2f, h - 2f),
                                    end = Offset(w - 1f, h - 2f),
                                    strokeWidth = 1.dp.toPx()
                                )
                                drawLine(
                                    color = axisColor,
                                    start = Offset(2f, 2f),
                                    end = Offset(2f, h - 2f),
                                    strokeWidth = 1.dp.toPx()
                                )

                                // Shaded area under curve y = x * e^-x
                                val areaPath = Path().apply {
                                    moveTo(2f, h - 2f)
                                    cubicTo(
                                        w * 0.22f, h * 0.08f,
                                        w * 0.55f, h * 0.45f,
                                        w - 2f, h - 3f
                                    )
                                    lineTo(w - 2f, h - 2f)
                                    close()
                                }
                                drawPath(
                                    path = areaPath,
                                    color = SnapAiPillBlue.copy(alpha = 0.22f)
                                )

                                // Curve stroke
                                val curvePath = Path().apply {
                                    moveTo(2f, h - 2f)
                                    cubicTo(
                                        w * 0.22f, h * 0.08f,
                                        w * 0.55f, h * 0.45f,
                                        w - 2f, h - 3f
                                    )
                                }
                                drawPath(
                                    path = curvePath,
                                    color = SnapAiPillBlue,
                                    style = Stroke(width = 1.3.dp.toPx(), cap = StrokeCap.Round)
                                )
                            }
                        }
                    }

                    // 3. Highlighted Step-by-Step Solution Box at Bottom
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(6.dp))
                            .background(Color(0xFFF3F6FC))
                            .padding(horizontal = 6.dp, vertical = 4.dp),
                        verticalArrangement = Arrangement.spacedBy(1.5.dp)
                    ) {
                        Text(
                            text = "I = [-x·e⁻ˣ]₀^∞ + ∫₀^∞ e⁻ˣdx",
                            fontFamily = AcademicSerifFamily,
                            fontStyle = FontStyle.Italic,
                            fontSize = 6.4.sp,
                            lineHeight = 7.5.sp,
                            color = PrimaryText,
                            maxLines = 1
                        )
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "∴ I = 0 + 1 = 1",
                                fontFamily = JetBrainsMonoFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 6.6.sp,
                                color = SnapAiPillBlue
                            )
                            Text(
                                text = "✓ Solved",
                                fontFamily = InterFontFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 6.sp,
                                color = SuccessGreen
                            )
                        }
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        // 2. Refined, High-Contrast "ASK & SOLVE | AI" Pill Button with Scanner Icon & Concentric Capsule
        Surface(
            onClick = onSnapSolveClick,
            shape = RoundedCornerShape(50),
            color = Color.White,
            shadowElevation = 10.dp,
            border = BorderStroke(1.dp, Color.White.copy(alpha = 0.95f)),
            modifier = Modifier
                .height(46.dp)
                .testTag("snap_solve_ai_button")
        ) {
            Row(
                modifier = Modifier.padding(start = 15.dp, end = 5.dp, top = 5.dp, bottom = 5.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                // Left: Mini Scanner Viewfinder Icon + Bold "ASK & SOLVE" Label
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(7.dp)
                ) {
                    // Custom crisp scanner-lens icon
                    Canvas(modifier = Modifier.size(16.dp)) {
                        val w = size.width
                        val h = size.height
                        val s = 1.7.dp.toPx()
                        val len = w * 0.30f
                        val r = w * 0.18f
                        val tint = Color(0xFF2B50D8)

                        // 4 corner brackets
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
                        drawPath(brackets, color = tint, style = Stroke(width = s, cap = StrokeCap.Round))
                        // Center focus dot
                        drawCircle(
                            color = tint,
                            radius = 2.1.dp.toPx(),
                            center = Offset(w / 2f, h / 2f)
                        )
                    }

                    Text(
                        text = "ASK & SOLVE",
                        fontFamily = OutfitDisplayFamily,
                        fontWeight = FontWeight.Normal,
                        fontSize = 13.5.sp,
                        letterSpacing = 0.6.sp,
                        color = Color(0xFF2B50D8)
                    )
                }

                // Right: Concentric Inner Gradient Capsule with Mini AI Visor Mascot + "AI"
                Box(
                    modifier = Modifier
                        .height(36.dp)
                        .clip(RoundedCornerShape(50))
                        .background(
                            Brush.horizontalGradient(
                                colors = listOf(Color(0xFF385EEB), Color(0xFF7B61FF))
                            )
                        )
                        .padding(horizontal = 13.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        // Mini AI Mascot Visor Badge with Smoothly Blinking Eyes
                        val miniBlinkTransition = rememberInfiniteTransition(label = "mini_ai_blink")
                        val miniEyeOpenScale by miniBlinkTransition.animateFloat(
                            initialValue = 1f,
                            targetValue = 1f,
                            animationSpec = infiniteRepeatable(
                                animation = keyframes {
                                    durationMillis = 3400
                                    1.0f at 0 using FastOutSlowInEasing
                                    1.0f at 1800 using FastOutSlowInEasing
                                    0.12f at 1950 using FastOutSlowInEasing
                                    1.0f at 2120 using FastOutSlowInEasing
                                    1.0f at 3400
                                },
                                repeatMode = RepeatMode.Restart
                            ),
                            label = "mini_eye_scale"
                        )
                        Canvas(modifier = Modifier.size(width = 18.dp, height = 13.dp)) {
                            val w = size.width
                            val h = size.height
                            drawRoundRect(
                                color = Color.White,
                                topLeft = Offset.Zero,
                                size = Size(w, h),
                                cornerRadius = CornerRadius(h / 2f, h / 2f)
                            )
                            val eyeW = 2.2.dp.toPx() * (1f + (1f - miniEyeOpenScale) * 0.18f)
                            val eyeH = (5.4.dp.toPx() * miniEyeOpenScale).coerceAtLeast(1.1.dp.toPx())
                            val eyeY = (h - eyeH) / 2f
                            val cornerR = minOf(eyeW, eyeH) / 2f
                            drawRoundRect(
                                color = Color(0xFF1E2235),
                                topLeft = Offset(w * 0.31f - eyeW / 2f, eyeY),
                                size = Size(eyeW, eyeH),
                                cornerRadius = CornerRadius(cornerR, cornerR)
                            )
                            drawRoundRect(
                                color = Color(0xFF1E2235),
                                topLeft = Offset(w * 0.69f - eyeW / 2f, eyeY),
                                size = Size(eyeW, eyeH),
                                cornerRadius = CornerRadius(cornerR, cornerR)
                            )
                        }

                        Text(
                            text = "AI",
                            fontFamily = OutfitDisplayFamily,
                            fontWeight = FontWeight.Normal,
                            fontSize = 13.5.sp,
                            letterSpacing = 0.5.sp,
                            color = Color.White
                        )
                    }
                }
            }
        }
    }
}

/**
 * IISER IAT Master Module Card:
 * Purpose-built replacement for the generic textbook card. Features:
 * - Crisp elevated card surface (#F6F8FD) with a 1.2.dp structured border (#DFE6F5) so it stands out
 *   with high clarity on the white sheet.
 * - Left: Rich scientific module visual badge with subject-specific gradient, custom vector formula/graph
 *   illustration (Calculus integral curve, Quantum wave packet, Benzene ring, or DNA double helix),
 *   Module number pill, and IISER IAT badge.
 * - Right: Exam weightage tag, mastery percentage pill, full chapter title, key formula preview,
 *   and 3 non-truncating horizontal resource pills ("12 Lectures", "4 Notes", "40 IMP Qs").
 */
@Composable
fun BookCard(
    chapter: ChapterEntity,
    onOpenChapter: () -> Unit,
    subjectBadgeCode: String? = null,
    cardTitleOverride: String? = null,
    subtitleOverride: String? = null,
    masteryPercentOverride: Int? = null,
    totalNotesOverride: Int? = null,
    totalVideosOverride: Int? = null,
    totalQuestionsOverride: Int? = null,
    modifier: Modifier = Modifier
) {
    val subjectLower = chapter.subject.lowercase()
    val (coverTop, coverBottom, badgeAccent) = when (subjectLower) {
        "physics" -> Triple(Color(0xFF311B78), Color(0xFF6C47FF), Color(0xFF6339F9))
        "chemistry" -> Triple(Color(0xFF064E3B), Color(0xFF0D9488), Color(0xFF059669))
        "mathematics" -> Triple(Color(0xFF1D3587), Color(0xFF335EEA), Color(0xFF2855D8))
        "biology" -> Triple(Color(0xFF701A46), Color(0xFFDB2777), Color(0xFFC02678))
        else -> Triple(Color(0xFF1D3587), Color(0xFF335EEA), Color(0xFF2855D8))
    }
    val masteryPercent = masteryPercentOverride ?: (chapter.progressFraction * 100).toInt()
    val displayTitle = cardTitleOverride ?: chapter.title
    val formulaSnippet = subtitleOverride ?: chapter.formulaHighlight.ifBlank { chapter.subtitle }
    val topCoverTag = subjectBadgeCode ?: when (subjectLower) {
        "physics" -> "PHY"
        "chemistry" -> "CHEM"
        "mathematics" -> "MATH"
        "biology" -> "BIO"
        else -> "MOD ${toRoman(chapter.chapterNumber)}"
    }
    val notesCount = totalNotesOverride ?: chapter.studyNotesCount
    val vidsCount = totalVideosOverride ?: chapter.totalLessons
    val qsCount = totalQuestionsOverride ?: chapter.practiceQuestionCount

    Card(
        onClick = onOpenChapter,
        shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF6F8FD)),
        border = BorderStroke(1.dp, Color(0xFFDFE6F5)),
        elevation = CardDefaults.cardElevation(defaultElevation = 1.dp),
        modifier = modifier
            .width(340.dp)
            .testTag("book_card_${chapter.id}")
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            // Left: Rich Scientific Smart Notes Cover Thumbnail
            Box(
                modifier = Modifier
                    .width(96.dp)
                    .height(136.dp)
                    .shadow(3.dp, RoundedCornerShape(16.dp))
                    .clip(RoundedCornerShape(16.dp))
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(coverTop, coverBottom)
                        )
                    )
            ) {
                // Scientific Vector Art on Canvas
                Canvas(modifier = Modifier.fillMaxSize()) {
                    val w = size.width
                    val h = size.height

                    // Subtle glowing radial aura in center
                    drawCircle(
                        color = Color.White.copy(alpha = 0.10f),
                        radius = w * 0.48f,
                        center = Offset(w * 0.55f, h * 0.52f)
                    )

                    // Coordinate grid hairlines
                    val gridColor = Color.White.copy(alpha = 0.14f)
                    drawLine(
                        color = gridColor,
                        start = Offset(w * 0.14f, h * 0.36f),
                        end = Offset(w * 0.14f, h * 0.78f),
                        strokeWidth = 1.dp.toPx()
                    )
                    drawLine(
                        color = gridColor,
                        start = Offset(w * 0.10f, h * 0.68f),
                        end = Offset(w * 0.88f, h * 0.68f),
                        strokeWidth = 1.dp.toPx()
                    )

                    // Subject-specific vector curve in the middle of the cover
                    val curvePath = Path().apply {
                        when (subjectLower) {
                            "physics" -> {
                                // Damped quantum wave packet
                                moveTo(w * 0.14f, h * 0.58f)
                                cubicTo(w * 0.30f, h * 0.32f, w * 0.44f, h * 0.82f, w * 0.58f, h * 0.42f)
                                cubicTo(w * 0.70f, h * 0.25f, w * 0.80f, h * 0.72f, w * 0.88f, h * 0.54f)
                            }
                            "chemistry" -> {
                                // Hexagonal molecular ring outline
                                val cx = w * 0.52f
                                val cy = h * 0.54f
                                val r = w * 0.22f
                                moveTo(cx, cy - r)
                                lineTo(cx + r * 0.86f, cy - r * 0.5f)
                                lineTo(cx + r * 0.86f, cy + r * 0.5f)
                                lineTo(cx, cy + r)
                                lineTo(cx - r * 0.86f, cy + r * 0.5f)
                                lineTo(cx - r * 0.86f, cy - r * 0.5f)
                                close()
                            }
                            "biology" -> {
                                // Double-helix wave strand
                                moveTo(w * 0.14f, h * 0.64f)
                                cubicTo(w * 0.36f, h * 0.32f, w * 0.62f, h * 0.76f, w * 0.88f, h * 0.44f)
                                moveTo(w * 0.14f, h * 0.44f)
                                cubicTo(w * 0.36f, h * 0.76f, w * 0.62f, h * 0.32f, w * 0.88f, h * 0.64f)
                            }
                            else -> {
                                // Smooth integral / exponential distribution curve
                                moveTo(w * 0.14f, h * 0.68f)
                                cubicTo(
                                    w * 0.34f, h * 0.30f,
                                    w * 0.60f, h * 0.44f,
                                    w * 0.88f, h * 0.65f
                                )
                            }
                        }
                    }
                    drawPath(
                        path = curvePath,
                        color = Color(0xFFFFD54F).copy(alpha = 0.90f),
                        style = Stroke(width = 1.6.dp.toPx(), cap = StrokeCap.Round)
                    )
                }

                // Overlay text & badges inside the cover
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 8.dp, vertical = 9.dp),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    // Top Subject Code Pill ("PHY", "CHEM", "MATH", "BIO")
                    Surface(
                        color = Color.White.copy(alpha = 0.18f),
                        shape = RoundedCornerShape(6.dp)
                    ) {
                        Text(
                            text = topCoverTag,
                            fontFamily = JetBrainsMonoFamily,
                            fontWeight = FontWeight.Normal,
                            fontSize = 8.2.sp,
                            letterSpacing = 0.5.sp,
                            color = Color.White,
                            modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.5.dp)
                        )
                    }

                    // Center Formula Symbol
                    Text(
                        text = when (subjectLower) {
                            "physics" -> "ĤΨ = EΨ"
                            "chemistry" -> "ΔG° = -RT"
                            "mathematics" -> "∫ f(x)dx"
                            "biology" -> "p² + 2pq"
                            else -> "∫ f(x)dx"
                        },
                        fontFamily = AcademicSerifFamily,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Normal,
                        fontSize = 13.sp,
                        color = Color.White.copy(alpha = 0.95f)
                    )

                    // Bottom Subject + Smart Notes Label
                    Column {
                        Text(
                            text = chapter.subject.uppercase(),
                            fontFamily = OutfitDisplayFamily,
                            fontWeight = FontWeight.Normal,
                            fontSize = 8.5.sp,
                            letterSpacing = 0.4.sp,
                            color = Color.White,
                            maxLines = 1
                        )
                        Text(
                            text = "Smart Notes",
                            fontFamily = InterFontFamily,
                            fontWeight = FontWeight.Normal,
                            fontSize = 7.5.sp,
                            color = Color(0xFFFFE082),
                            maxLines = 1
                        )
                    }
                }
            }

            // Right: Structured Smart Notes Metadata, Formula Preview & Non-Truncating Resource Chips
            val equationPreview = when (subjectLower) {
                "physics" -> "ĤΨ = EΨ  •  ∮B·dl = μ₀I"
                "chemistry" -> "ΔG° = -RT ln K  •  k = Ae⁻ᴱᵃ/ᴿᵀ"
                "mathematics" -> "∫₀^∞ e⁻ˣdx = 1  •  e^(iπ) + 1 = 0"
                "biology" -> "p² + 2pq + q² = 1  •  v = Vmax[S]/(Km+[S])"
                else -> chapter.formulaHighlight
            }

            Column(
                modifier = Modifier
                    .weight(1f)
                    .height(136.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                // 1. Top Row: Compact Edition Pill + Single-Line Mastery Pill (never wraps)
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Surface(
                        color = badgeAccent.copy(alpha = 0.11f),
                        shape = RoundedCornerShape(50)
                    ) {
                        Text(
                            text = "IISER IAT VAULT",
                            fontFamily = JetBrainsMonoFamily,
                            fontWeight = FontWeight.Normal,
                            fontSize = 8.2.sp,
                            letterSpacing = 0.3.sp,
                            color = badgeAccent,
                            maxLines = 1,
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
                        )
                    }

                    Surface(
                        color = Color.White,
                        shape = RoundedCornerShape(50),
                        border = BorderStroke(1.dp, Color(0xFFE2E8F5))
                    ) {
                        Text(
                            text = "$masteryPercent% Mastery",
                            fontFamily = JetBrainsMonoFamily,
                            fontWeight = FontWeight.Normal,
                            fontSize = 9.sp,
                            color = if (masteryPercent >= 50) SuccessGreen else Color(0xFF52658F),
                            maxLines = 1,
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 2.5.dp)
                        )
                    }
                }

                // 2. Clean Subject Title + Attractive Handbook Tagline + Formula Preview
                Column(verticalArrangement = Arrangement.spacedBy(2.dp)) {
                    Text(
                        text = displayTitle,
                        fontFamily = OutfitDisplayFamily,
                        fontWeight = FontWeight.Normal,
                        fontSize = 16.5.sp,
                        letterSpacing = (-0.15).sp,
                        lineHeight = 20.sp,
                        color = PrimaryText,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        text = formulaSnippet,
                        fontFamily = InterFontFamily,
                        fontWeight = FontWeight.Normal,
                        fontSize = 11.sp,
                        color = Color(0xFF475569),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        text = equationPreview,
                        fontFamily = AcademicSerifFamily,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Normal,
                        fontSize = 10.8.sp,
                        color = badgeAccent,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }

                // 3. Three Crisp Non-Truncating Resource Chips (Notes | Videos | Qs)
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(5.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    ModuleStatChip(
                        icon = Icons.Outlined.Description,
                        label = "$notesCount Notes",
                        tint = badgeAccent
                    )
                    ModuleStatChip(
                        icon = Icons.Outlined.PlayArrow,
                        label = "$vidsCount Vids",
                        tint = PrimaryText
                    )
                    ModuleStatChip(
                        icon = Icons.AutoMirrored.Outlined.Assignment,
                        label = "$qsCount Qs",
                        tint = PrimaryText
                    )
                }
            }
        }
    }
}

@Composable
private fun ModuleStatChip(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    label: String,
    tint: Color
) {
    Surface(
        color = Color.White,
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(1.dp, Color(0xFFE2E8F5))
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 6.dp, vertical = 4.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(3.dp)
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = tint,
                modifier = Modifier.size(12.dp)
            )
            Text(
                text = label,
                fontFamily = InterFontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 10.sp,
                color = PrimaryText,
                maxLines = 1
            )
        }
    }
}

private fun toRoman(num: Int): String = when (num) {
    1 -> "I"
    2 -> "II"
    3 -> "III"
    4 -> "IV"
    else -> num.toString()
}

/**
 * Carousel Pagination Indicator:
 * Elongated dark charcoal pill (`28.dp` x `7.dp`) next to light-gray dots (`7.dp`).
 */
@Composable
fun CarouselPagerIndicator(
    totalCount: Int,
    activeIndex: Int = 0,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        val count = totalCount.coerceIn(2, 5)
        for (i in 0 until count) {
            val isActive = i == activeIndex
            Box(
                modifier = Modifier
                    .padding(horizontal = 3.dp)
                    .width(if (isActive) 28.dp else 7.dp)
                    .height(7.dp)
                    .clip(RoundedCornerShape(50))
                    .background(if (isActive) Color(0xFF2B2D35) else Color(0xFFD5D8E2))
            )
        }
    }
}

@Composable
fun ContinueLearningCard(
    chapter: ChapterEntity,
    onContinueClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val accent = subjectAccentColor(chapter.subject)
    val percent = (chapter.progressFraction * 100).toInt()

    Card(
        onClick = onContinueClick,
        shape = RoundedCornerShape(22.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF6F8FD)),
        border = BorderStroke(1.2.dp, Color(0xFFDFE6F5)),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        modifier = modifier
            .width(292.dp)
            .testTag("continue_card_${chapter.id}")
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    Surface(
                        color = accent.copy(alpha = 0.12f),
                        shape = RoundedCornerShape(7.dp)
                    ) {
                        Text(
                            text = chapter.subject,
                            fontFamily = PlusJakartaSansFamily,
                            fontWeight = FontWeight.Bold,
                            fontSize = 11.sp,
                            color = accent,
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.5.dp)
                        )
                    }
                    Surface(
                        color = Color.White,
                        shape = RoundedCornerShape(7.dp),
                        border = BorderStroke(1.dp, Color(0xFFE2E8F5))
                    ) {
                        Text(
                            text = chapter.examTag,
                            fontFamily = PlusJakartaSansFamily,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 10.sp,
                            color = SecondaryText,
                            modifier = Modifier.padding(horizontal = 7.dp, vertical = 3.dp)
                        )
                    }
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.Schedule,
                        contentDescription = null,
                        tint = SecondaryText,
                        modifier = Modifier.size(13.dp)
                    )
                    Spacer(modifier = Modifier.width(3.dp))
                    Text(
                        text = "${chapter.durationMinutes}m",
                        style = MaterialTheme.typography.labelSmall,
                        color = SecondaryText
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = chapter.title,
                fontFamily = PlusJakartaSansFamily,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 16.sp,
                color = PrimaryText,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = "Lecture ${chapter.completedLessons} of ${chapter.totalLessons} • $percent% mastered",
                style = MaterialTheme.typography.bodySmall,
                color = SecondaryText
            )

            Spacer(modifier = Modifier.height(11.dp))

            LinearProgressIndicator(
                progress = { chapter.progressFraction },
                color = accent,
                trackColor = Color(0xFFE2E8F5),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(7.dp)
                    .clip(RoundedCornerShape(50))
            )

            Spacer(modifier = Modifier.height(14.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "${chapter.practiceQuestionCount} Practice Qs ready",
                    fontFamily = InterFontFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 11.5.sp,
                    color = SecondaryText
                )

                Surface(
                    color = CharcoalSelected,
                    shape = RoundedCornerShape(50)
                ) {
                    Row(
                        modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        Text(
                            text = "Resume",
                            fontFamily = PlusJakartaSansFamily,
                            fontWeight = FontWeight.Bold,
                            fontSize = 11.5.sp,
                            color = Color.White
                        )
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                            contentDescription = "Continue",
                            tint = Color.White,
                            modifier = Modifier.size(13.dp)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun VideoLessonCard(
    chapter: ChapterEntity,
    onPlayClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val accent = subjectAccentColor(chapter.subject)

    Card(
        onClick = onPlayClick,
        shape = RoundedCornerShape(22.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF6F8FD)),
        border = BorderStroke(1.2.dp, Color(0xFFDFE6F5)),
        elevation = CardDefaults.cardElevation(defaultElevation = 1.dp),
        modifier = modifier
            .width(256.dp)
            .testTag("video_card_${chapter.id}")
    ) {
        Column {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(116.dp)
                    .padding(10.dp)
                    .clip(RoundedCornerShape(14.dp))
                    .background(
                        Brush.linearGradient(
                            colors = listOf(DeepIndigo, accent)
                        )
                    )
                    .padding(10.dp)
            ) {
                Surface(
                    color = Color.Black.copy(alpha = 0.38f),
                    shape = RoundedCornerShape(6.dp),
                    modifier = Modifier.align(Alignment.TopStart)
                ) {
                    Text(
                        text = chapter.subject,
                        style = MaterialTheme.typography.labelSmall.copy(
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        ),
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
                    )
                }

                Surface(
                    shape = CircleShape,
                    color = Color.White,
                    shadowElevation = 4.dp,
                    modifier = Modifier
                        .size(40.dp)
                        .align(Alignment.Center)
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        Icon(
                            imageVector = Icons.Default.PlayArrow,
                            contentDescription = "Play Video",
                            tint = CharcoalSelected,
                            modifier = Modifier.size(22.dp)
                        )
                    }
                }

                Surface(
                    color = Color.Black.copy(alpha = 0.65f),
                    shape = RoundedCornerShape(6.dp),
                    modifier = Modifier.align(Alignment.BottomEnd)
                ) {
                    Text(
                        text = chapter.videoDurationLabel,
                        style = MaterialTheme.typography.labelSmall.copy(
                            color = Color.White,
                            fontWeight = FontWeight.SemiBold
                        ),
                        modifier = Modifier.padding(horizontal = 7.dp, vertical = 2.dp)
                    )
                }
            }

            Column(modifier = Modifier.padding(horizontal = 14.dp, vertical = 10.dp)) {
                Text(
                    text = chapter.videoTitle,
                    style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Bold),
                    color = PrimaryText,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = chapter.videoInstructor,
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
fun MockTestCard(
    mockTest: MockTestEntity,
    onStartMock: () -> Unit,
    modifier: Modifier = Modifier
) {
    val isCompleted = mockTest.status.equals("Completed", ignoreCase = true)
    val isSectional = mockTest.title.contains("Sectional", ignoreCase = true)
    val badgeAccent = when {
        mockTest.title.contains("Physics", ignoreCase = true) -> subjectAccentColor("Physics")
        mockTest.title.contains("Chemistry", ignoreCase = true) -> subjectAccentColor("Chemistry")
        mockTest.title.contains("Mathematics", ignoreCase = true) -> subjectAccentColor("Mathematics")
        mockTest.title.contains("Biology", ignoreCase = true) -> subjectAccentColor("Biology")
        isSectional -> ElectricPurple
        else -> PrimaryBlue
    }
    val badgeText = when {
        mockTest.title.contains("Physics", ignoreCase = true) -> "PHYSICS SECTIONAL"
        mockTest.title.contains("Chemistry", ignoreCase = true) -> "CHEMISTRY SECTIONAL"
        mockTest.title.contains("Mathematics", ignoreCase = true) -> "MATHS SECTIONAL"
        mockTest.title.contains("Biology", ignoreCase = true) -> "BIOLOGY SECTIONAL"
        mockTest.title.contains("PYQ", ignoreCase = true) -> "OFFICIAL PYQ PAPER"
        else -> "FULL PCMB MOCK"
    }

    Card(
        onClick = onStartMock,
        shape = RoundedCornerShape(22.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        border = BorderStroke(1.dp, Color(0xFFDCDFE4)),
        elevation = CardDefaults.cardElevation(defaultElevation = 1.dp),
        modifier = modifier
            .fillMaxWidth()
            .testTag("mock_test_card_${mockTest.id}")
    ) {
        Column(modifier = Modifier.padding(18.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Surface(
                        color = badgeAccent.copy(alpha = 0.11f),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Text(
                            text = badgeText,
                            fontFamily = JetBrainsMonoFamily,
                            fontWeight = FontWeight.Medium,
                            fontSize = 10.sp,
                            color = badgeAccent,
                            modifier = Modifier.padding(horizontal = 9.dp, vertical = 4.dp)
                        )
                    }
                    Surface(
                        color = Color(0xFFF3F4F6),
                        shape = RoundedCornerShape(6.dp)
                    ) {
                        Text(
                            text = "+${mockTest.positiveMarks} / -${mockTest.negativeMarks}",
                            fontFamily = JetBrainsMonoFamily,
                            fontWeight = FontWeight.Medium,
                            fontSize = 10.sp,
                            color = Color(0xFF475569),
                            modifier = Modifier.padding(horizontal = 7.dp, vertical = 3.5.dp)
                        )
                    }
                }

                if (isCompleted && mockTest.latestScore != null) {
                    Surface(
                        color = SuccessGreen.copy(alpha = 0.12f),
                        shape = RoundedCornerShape(50)
                    ) {
                        Row(
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Default.Verified,
                                contentDescription = null,
                                tint = SuccessGreen,
                                modifier = Modifier.size(13.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = "${mockTest.latestScore}/${mockTest.maxMarks}" +
                                    (mockTest.accuracyPercent?.let { " • $it%" } ?: ""),
                                fontFamily = InterFontFamily,
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 11.sp,
                                color = SuccessGreen
                            )
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(11.dp))

            Text(
                text = mockTest.title,
                fontFamily = OutfitDisplayFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 17.sp,
                letterSpacing = (-0.2).sp,
                color = Color(0xFF0F172A)
            )
            Spacer(modifier = Modifier.height(3.dp))
            Text(
                text = mockTest.subjectCoverage,
                fontFamily = InterFontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 12.5.sp,
                color = Color(0xFF64748B)
            )

            Spacer(modifier = Modifier.height(14.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(6.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.Timer,
                        contentDescription = null,
                        tint = Color(0xFF64748B),
                        modifier = Modifier.size(15.dp)
                    )
                    Text(
                        text = "${mockTest.durationMinutes}m • ${mockTest.questionCount} Qs • ${mockTest.maxMarks} Marks",
                        fontFamily = InterFontFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 12.sp,
                        color = Color(0xFF475569)
                    )
                }

                Button(
                    onClick = onStartMock,
                    shape = RoundedCornerShape(50),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (isCompleted) Color(0xFFF3F4F6) else Color(0xFF0F172A),
                        contentColor = if (isCompleted) Color(0xFF0F172A) else Color.White
                    ),
                    contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
                    modifier = Modifier.testTag("mock_test_cta_${mockTest.id}")
                ) {
                    Text(
                        text = if (isCompleted) "Retake" else "Start Test",
                        fontFamily = InterFontFamily,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 12.5.sp
                    )
                }
            }
        }
    }
}


@Composable
fun StudyPlanItemRow(
    task: StudyPlanTaskEntity,
    onToggleComplete: () -> Unit,
    onDeleteTask: () -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        onClick = onToggleComplete,
        shape = RoundedCornerShape(18.dp),
        color = Color(0xFFF6F8FD),
        border = BorderStroke(1.dp, Color(0xFFDFE6F5)),
        modifier = modifier
            .fillMaxWidth()
            .testTag("study_plan_task_${task.id}")
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 14.dp, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = if (task.isCompleted) Icons.Default.CheckCircle else Icons.Default.RadioButtonUnchecked,
                contentDescription = if (task.isCompleted) "Completed" else "Mark complete",
                tint = if (task.isCompleted) SuccessGreen else MutedIconGray,
                modifier = Modifier.size(22.dp)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = task.title,
                    style = MaterialTheme.typography.titleSmall.copy(
                        fontWeight = FontWeight.SemiBold,
                        color = if (task.isCompleted) SecondaryText else PrimaryText
                    )
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = "${task.subject} • ${task.activityType} • ${task.durationMinutes} min",
                    style = MaterialTheme.typography.labelSmall,
                    color = SecondaryText
                )
            }
            IconButton(
                onClick = onDeleteTask,
                modifier = Modifier.size(38.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.DeleteOutline,
                    contentDescription = "Remove task",
                    tint = SecondaryText,
                    modifier = Modifier.size(18.dp)
                )
            }
        }
    }
}
