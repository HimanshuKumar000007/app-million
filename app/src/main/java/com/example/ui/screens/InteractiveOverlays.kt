package com.example.ui.screens



import android.graphics.Bitmap

import android.graphics.ImageDecoder

import android.os.Build

import android.provider.MediaStore

import androidx.activity.compose.BackHandler

import androidx.activity.compose.rememberLauncherForActivityResult

import androidx.activity.result.PickVisualMediaRequest

import androidx.activity.result.contract.ActivityResultContracts

import androidx.compose.animation.core.FastOutSlowInEasing

import androidx.compose.animation.core.RepeatMode

import androidx.compose.animation.core.animateFloat

import androidx.compose.animation.core.infiniteRepeatable

import androidx.compose.animation.core.keyframes

import androidx.compose.animation.core.rememberInfiniteTransition

import androidx.compose.animation.core.tween

import androidx.compose.foundation.BorderStroke

import androidx.compose.foundation.Canvas

import androidx.compose.foundation.Image

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

import androidx.compose.foundation.layout.fillMaxHeight

import androidx.compose.foundation.layout.height

import androidx.compose.foundation.layout.imePadding

import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.offset

import androidx.compose.foundation.layout.padding

import androidx.compose.foundation.layout.size

import androidx.compose.foundation.layout.statusBars

import androidx.compose.foundation.layout.width

import androidx.compose.foundation.layout.windowInsetsPadding

import androidx.compose.foundation.lazy.LazyColumn

import androidx.compose.foundation.lazy.LazyRow

import androidx.compose.foundation.lazy.itemsIndexed

import androidx.compose.foundation.shape.CircleShape

import androidx.compose.foundation.shape.RoundedCornerShape

import androidx.compose.foundation.text.BasicTextField

import androidx.compose.material.icons.Icons

import androidx.compose.material.icons.automirrored.filled.ArrowBack

import androidx.compose.material.icons.automirrored.filled.ArrowForward

import androidx.compose.material.icons.filled.AddPhotoAlternate

import androidx.compose.material.icons.filled.AutoAwesome

import androidx.compose.material.icons.filled.Bookmark

import androidx.compose.material.icons.filled.BookmarkBorder

import androidx.compose.material.icons.filled.CheckCircle

import androidx.compose.material.icons.filled.Cancel

import androidx.compose.material.icons.filled.Edit

import androidx.compose.material.icons.filled.Pause

import androidx.compose.material.icons.filled.PlayArrow

import androidx.compose.material.icons.filled.Timer

import androidx.compose.material.icons.filled.Tune

import androidx.compose.material3.Button

import androidx.compose.material3.ButtonDefaults

import androidx.compose.material3.Card

import androidx.compose.material3.CardDefaults

import androidx.compose.material3.CircularProgressIndicator

import androidx.compose.material3.Icon

import androidx.compose.material3.IconButton

import androidx.compose.material3.LinearProgressIndicator

import androidx.compose.material3.MaterialTheme

import androidx.compose.material3.OutlinedButton

import androidx.compose.material3.OutlinedTextField

import androidx.compose.material3.Slider

import androidx.compose.material3.Surface

import androidx.compose.material3.Text

import androidx.compose.runtime.Composable

import androidx.compose.runtime.LaunchedEffect

import androidx.compose.runtime.getValue

import androidx.compose.runtime.mutableFloatStateOf

import androidx.compose.runtime.mutableIntStateOf

import androidx.compose.runtime.mutableStateMapOf

import androidx.compose.runtime.mutableStateOf

import androidx.compose.runtime.remember

import androidx.compose.runtime.setValue

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

import androidx.compose.ui.graphics.PathEffect

import androidx.compose.ui.graphics.SolidColor

import androidx.compose.ui.graphics.StrokeCap

import androidx.compose.ui.graphics.asImageBitmap

import androidx.compose.ui.graphics.drawscope.Stroke

import androidx.compose.ui.graphics.nativeCanvas

import androidx.compose.ui.layout.ContentScale

import androidx.compose.ui.platform.LocalContext

import androidx.compose.ui.platform.testTag

import androidx.compose.ui.text.AnnotatedString

import androidx.compose.ui.text.SpanStyle

import androidx.compose.ui.text.TextStyle

import androidx.compose.ui.text.buildAnnotatedString

import androidx.compose.ui.text.font.FontStyle

import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.text.style.TextOverflow

import androidx.compose.ui.text.withStyle

import androidx.compose.ui.unit.Dp

import androidx.compose.ui.unit.dp

import androidx.compose.ui.unit.sp

import coil.compose.AsyncImage

import com.example.data.local.ChapterEntity

import com.example.data.local.MockTestEntity

import com.example.data.local.QuestionEntity

import com.example.ui.components.subjectAccentColor

import com.example.ui.theme.AcademicSerifFamily

import com.example.ui.theme.AccentYellow

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

import com.example.ui.theme.WarningCoral

import kotlinx.coroutines.delay

import kotlin.math.sin

import android.widget.Toast

import androidx.compose.foundation.border

import androidx.compose.foundation.clickable

import androidx.compose.foundation.lazy.rememberLazyListState

import androidx.compose.foundation.text.selection.SelectionContainer

import androidx.compose.material.icons.filled.Close

import androidx.compose.material.icons.filled.KeyboardArrowUp

import androidx.compose.animation.AnimatedVisibility

import androidx.compose.animation.fadeIn

import androidx.compose.animation.fadeOut

import androidx.compose.animation.scaleIn

import androidx.compose.animation.scaleOut

import androidx.compose.material.icons.filled.ContentCopy

import androidx.compose.material.icons.filled.ExpandLess

import androidx.compose.material.icons.filled.ExpandMore

import androidx.compose.material.icons.filled.MenuBook

import androidx.compose.material.icons.filled.Warning

import androidx.compose.material.icons.filled.ZoomIn

import androidx.compose.runtime.derivedStateOf

import androidx.compose.runtime.rememberCoroutineScope

import androidx.compose.ui.platform.LocalClipboardManager

import androidx.compose.ui.zIndex

import kotlinx.coroutines.launch

import androidx.compose.material.icons.filled.ChevronLeft

import androidx.compose.material.icons.filled.ChevronRight

import androidx.compose.material.icons.filled.Check

import androidx.compose.runtime.snapshotFlow





// ==================== 1. CHAPTER READER & TEXTBOOK CONCEPT VIEWER OVERLAY ====================



/** Figure keys to display inside a parsed note section, by chapter + section index. */

private fun chapterSectionFigures(chapterId: String, sectionIndex: Int): List<String> =

    when (chapterId) {

        "phys_ch_1" -> when (sectionIndex) {

            1 -> listOf("fig_1_5_si_constants") // Section 1: The Seven SI Base Units

            7 -> listOf("fig_1_1_vernier", "fig_1_4_zero_errors") // Section 7: Vernier Calipers & Zero Error

            8 -> listOf("fig_1_2_screw_gauge") // Section 8: Screw Gauge

            22 -> listOf("fig_1_3_em") // Section 22: Thomson e/m Experiment

            else -> emptyList()

        }

        "phys_ch_2" -> when (sectionIndex) {

            3 -> listOf("fig_2_1_xt_graphs")

            5 -> listOf("fig_2_2_vt_graph")

            9 -> listOf("fig_2_3_free_fall")

            else -> emptyList()

        }

        "phys_ch_3" -> when (sectionIndex) {

            2 -> listOf("fig_3_1_vector_addition")

            4 -> listOf("fig_3_2_resolution")

            8 -> listOf("fig_3_3_projectile")

            11 -> listOf("fig_3_4_circular")

            else -> emptyList()

        }

        else -> emptyList()

    }



private fun figureMetadata(figKey: String): Pair<String, String> =

    when (figKey) {

        "fig_1_1_vernier" -> Pair(

            "Fig. 1.1 — Vernier Calipers",

            "Main scale (1 mm), vernier scale (0.1 mm), internal/external jaws, and depth probe."

        )

        "fig_1_2_screw_gauge" -> Pair(

            "Fig. 1.2 — Micrometer Screw Gauge",

            "Linear pitch scale (0.5 mm), circular thimble (50 or 100 divisions), and safety ratchet."

        )

        "fig_1_3_em" -> Pair(

            "Fig. 1.3 — J. J. Thomson's e/m Cathode Ray Apparatus",

            "Crossed electric (E) and magnetic (B) fields for electron velocity selection and e/m measurement."

        )

        "fig_1_4_zero_errors" -> Pair(

            "Fig. 1.4 — Systematic Zero Errors",

            "Positive zero error (vernier zero right / circular zero below) vs Negative zero error (vernier left / circular above)."

        )

        "fig_1_5_si_constants" -> Pair(

            "Fig. 1.5 — The 2019 SI System Architecture",

            "All 7 base units (m, kg, s, A, K, mol, cd) anchored to 7 fundamental invariant constants of nature."

        )

        else -> Pair("Scientific Diagram", "Textbook precision illustration.")

    }



/** Rich inline textbook typography: supports **bold**, *italic*, _italic_, and ***bold-italic***. */

private fun noteAnnotated(text: String): AnnotatedString {

    if (!text.contains("*") && !text.contains("_")) return AnnotatedString(text)

    return buildAnnotatedString {

        var i = 0

        while (i < text.length) {

            // ***bold-italic***

            if (text.startsWith("***", i)) {

                val end = text.indexOf("***", i + 3)

                if (end > i) {

                    withStyle(SpanStyle(fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)) {

                        append(text.substring(i + 3, end))

                    }

                    i = end + 3

                    continue

                }

            }

            // **bold**

            if (text.startsWith("**", i)) {

                val end = text.indexOf("**", i + 2)

                if (end > i) {

                    withStyle(SpanStyle(fontWeight = FontWeight.Bold)) {

                        append(text.substring(i + 2, end))

                    }

                    i = end + 2

                    continue

                }

            }

            // *italic*

            if (text[i] == '*' && i + 1 < text.length && text[i + 1] != '*') {

                val end = text.indexOf('*', i + 1)

                if (end > i) {

                    withStyle(SpanStyle(fontStyle = FontStyle.Italic)) {

                        append(text.substring(i + 1, end))

                    }

                    i = end + 1

                    continue

                }

            }

            // _italic_

            if (text[i] == '_' && i + 1 < text.length && text[i + 1] != '_') {

                val end = text.indexOf('_', i + 1)

                if (end > i) {

                    withStyle(SpanStyle(fontStyle = FontStyle.Italic)) {

                        append(text.substring(i + 1, end))

                    }

                    i = end + 1

                    continue

                }

            }

            append(text[i])

            i++

        }

    }

}



/** High-resolution Diagram Inspection modal with close button. */

@Composable

private fun DiagramZoomDialog(

    figKey: String,

    onDismiss: () -> Unit

) {

    val (title, caption) = figureMetadata(figKey)

    val remoteUrl = ChapterFigureData.urls[figKey]

    var remoteFailed by remember(figKey) { mutableStateOf(false) }

    val bitmap = remember(figKey) { ChapterFigureData.decode(figKey) }



    Surface(

        color = Color.Black.copy(alpha = 0.82f),

        modifier = Modifier

            .fillMaxSize()

            .zIndex(100f)

            .clickable { onDismiss() }

    ) {

        Box(

            modifier = Modifier

                .fillMaxSize()

                .padding(18.dp),

            contentAlignment = Alignment.Center

        ) {

            Surface(

                shape = RoundedCornerShape(22.dp),

                color = Color.White,

                shadowElevation = 20.dp,

                modifier = Modifier

                    .fillMaxWidth()

                    .clickable(enabled = false) {}

            ) {

                Column(modifier = Modifier.padding(18.dp)) {

                    Row(

                        modifier = Modifier.fillMaxWidth(),

                        verticalAlignment = Alignment.CenterVertically,

                        horizontalArrangement = Arrangement.SpaceBetween

                    ) {

                        Column(modifier = Modifier.weight(1f)) {

                            Surface(

                                shape = RoundedCornerShape(6.dp),

                                color = Color(0xFFEEF2FF)

                            ) {

                                Text(

                                    text = "HIGH-RESOLUTION SCHEMATIC",

                                    fontFamily = InterFontFamily,

                                    fontWeight = FontWeight.Bold,

                                    fontSize = 9.5.sp,

                                    letterSpacing = 0.5.sp,

                                    color = Color(0xFF3569F6),

                                    modifier = Modifier.padding(horizontal = 7.dp, vertical = 3.dp)

                                )

                            }

                            Spacer(modifier = Modifier.height(4.dp))

                            Text(

                                text = title,

                                fontFamily = OutfitDisplayFamily,

                                fontWeight = FontWeight.Bold,

                                fontSize = 16.sp,

                                color = Color(0xFF0F172A)

                            )

                        }



                        IconButton(

                            onClick = onDismiss,

                            modifier = Modifier.size(36.dp)

                        ) {

                            Icon(

                                imageVector = Icons.Default.Close,

                                contentDescription = "Close",

                                tint = Color(0xFF475569)

                            )

                        }

                    }



                    Spacer(modifier = Modifier.height(14.dp))



                    Box(

                        modifier = Modifier

                            .fillMaxWidth()

                            .clip(RoundedCornerShape(14.dp))

                            .background(Color(0xFFF8FAFC)),

                        contentAlignment = Alignment.Center

                    ) {

                        if (remoteUrl != null && !remoteFailed) {

                            AsyncImage(

                                model = remoteUrl,

                                contentDescription = title,

                                contentScale = ContentScale.Fit,

                                onError = { remoteFailed = true },

                                modifier = Modifier

                                    .fillMaxWidth()

                                    .height(290.dp)

                            )

                        } else if (bitmap != null) {

                            Image(

                                bitmap = bitmap.asImageBitmap(),

                                contentDescription = title,

                                contentScale = ContentScale.Fit,

                                modifier = Modifier

                                    .fillMaxWidth()

                                    .height(290.dp)

                            )

                        }

                    }



                    Spacer(modifier = Modifier.height(14.dp))



                    Text(

                        text = caption,

                        fontFamily = InterFontFamily,

                        fontSize = 12.5.sp,

                        lineHeight = 18.sp,

                        color = Color(0xFF475569)

                    )

                }

            }

        }

    }

}



/** A chapter scientific diagram inside a clean white card with title and tap-to-zoom badge. */

@Composable

private fun ScientificDiagramCard(

    figKey: String,

    onZoom: (String) -> Unit

) {

    val (title, caption) = figureMetadata(figKey)

    val remoteUrl = ChapterFigureData.urls[figKey]

    var remoteFailed by remember(figKey) { mutableStateOf(false) }

    val bitmap = remember(figKey) { ChapterFigureData.decode(figKey) }



    if ((remoteUrl != null && !remoteFailed) || bitmap != null) {

        Surface(

            shape = RoundedCornerShape(16.dp),

            color = Color.White,

            border = BorderStroke(1.dp, Color(0xFFE2E8F0)),

            shadowElevation = 1.dp,

            modifier = Modifier

                .fillMaxWidth()

                .padding(vertical = 8.dp)

        ) {

            Column(modifier = Modifier.padding(12.dp)) {

                Box(

                    modifier = Modifier

                        .fillMaxWidth()

                        .clip(RoundedCornerShape(12.dp))

                        .background(Color(0xFFF8FAFC))

                        .clickable { onZoom(figKey) }

                ) {

                    if (remoteUrl != null && !remoteFailed) {

                        AsyncImage(

                            model = remoteUrl,

                            contentDescription = title,

                            contentScale = ContentScale.FillWidth,

                            onError = { remoteFailed = true },

                            modifier = Modifier.fillMaxWidth()

                        )

                    } else if (bitmap != null) {

                        Image(

                            bitmap = bitmap.asImageBitmap(),

                            contentDescription = title,

                            contentScale = ContentScale.FillWidth,

                            modifier = Modifier.fillMaxWidth()

                        )

                    }



                    Surface(

                        shape = RoundedCornerShape(50),

                        color = Color(0xCC0F172A),

                        modifier = Modifier

                            .align(Alignment.BottomEnd)

                            .padding(8.dp)

                    ) {

                        Row(

                            verticalAlignment = Alignment.CenterVertically,

                            horizontalArrangement = Arrangement.spacedBy(4.dp),

                            modifier = Modifier.padding(horizontal = 9.dp, vertical = 4.dp)

                        ) {

                            Icon(

                                imageVector = Icons.Default.ZoomIn,

                                contentDescription = "Zoom",

                                tint = Color.White,

                                modifier = Modifier.size(14.dp)

                            )

                            Text(

                                text = "Inspect",

                                fontFamily = InterFontFamily,

                                fontWeight = FontWeight.Medium,

                                fontSize = 11.sp,

                                color = Color.White

                            )

                        }

                    }

                }



                Spacer(modifier = Modifier.height(10.dp))



                Text(

                    text = title,

                    fontFamily = OutfitDisplayFamily,

                    fontWeight = FontWeight.Bold,

                    fontSize = 13.5.sp,

                    color = Color(0xFF0F172A)

                )

                Spacer(modifier = Modifier.height(2.dp))

                Text(

                    text = caption,

                    fontFamily = InterFontFamily,

                    fontWeight = FontWeight.Normal,

                    fontSize = 12.sp,

                    lineHeight = 17.sp,

                    color = Color(0xFF64748B)

                )

            }

        }

    }

}



/** Key Takeaway card: pale amber background, amber border, star badge, Ask AI action. */

@Composable

private fun KeyTakeawayCard(

    text: String,

    textSizeScale: Float,

    onAskAi: (String) -> Unit

) {

    val cleanText = text.removePrefix("★ HIGHLIGHT —").removePrefix("★ HIGHLIGHT -").removePrefix("★ HIGHLIGHT").removePrefix("★").trim()

    Surface(

        shape = RoundedCornerShape(14.dp),

        color = Color(0xFFFFFBEB),

        border = BorderStroke(1.dp, Color(0xFFFDE68A)),

        shadowElevation = 0.dp,

        modifier = Modifier

            .fillMaxWidth()

            .padding(vertical = 5.dp)

    ) {

        Column(modifier = Modifier.padding(14.dp)) {

            Row(

                modifier = Modifier.fillMaxWidth(),

                verticalAlignment = Alignment.CenterVertically,

                horizontalArrangement = Arrangement.SpaceBetween

            ) {

                Surface(

                    shape = RoundedCornerShape(6.dp),

                    color = Color(0xFFFEF3C7)

                ) {

                    Row(

                        verticalAlignment = Alignment.CenterVertically,

                        horizontalArrangement = Arrangement.spacedBy(4.dp),

                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)

                    ) {

                        Text(

                            text = "★",

                            color = Color(0xFFD97706),

                            fontSize = 11.sp,

                            fontWeight = FontWeight.Bold

                        )

                        Text(

                            text = "KEY TAKEAWAY",

                            fontFamily = InterFontFamily,

                            fontWeight = FontWeight.Bold,

                            fontSize = 10.sp,

                            letterSpacing = 0.6.sp,

                            color = Color(0xFF92400E)

                        )

                    }

                }



                Surface(

                    onClick = { onAskAi("Explain this textbook takeaway: $cleanText") },

                    shape = RoundedCornerShape(50),

                    color = Color.White.copy(alpha = 0.8f),

                    border = BorderStroke(1.dp, Color(0xFFFDE68A))

                ) {

                    Row(

                        verticalAlignment = Alignment.CenterVertically,

                        horizontalArrangement = Arrangement.spacedBy(4.dp),

                        modifier = Modifier.padding(horizontal = 9.dp, vertical = 3.dp)

                    ) {

                        Icon(

                            imageVector = Icons.Default.AutoAwesome,

                            contentDescription = "Ask AI",

                            tint = Color(0xFFD97706),

                            modifier = Modifier.size(12.dp)

                        )

                        Text(

                            text = "Ask AI",

                            fontFamily = InterFontFamily,

                            fontWeight = FontWeight.Medium,

                            fontSize = 10.5.sp,

                            color = Color(0xFF92400E)

                        )

                    }

                }

            }



            Spacer(modifier = Modifier.height(8.dp))



            Text(

                text = noteAnnotated(cleanText),

                fontFamily = AcademicSerifFamily,

                fontWeight = FontWeight.Normal,

                fontSize = (15.5.sp * textSizeScale),

                lineHeight = (24.sp * textSizeScale),

                color = Color(0xFF78350F)

            )

        }

    }

}



/** Exam Trap card: pale coral background, coral border, warning badge, Ask AI action. */

@Composable

private fun ExamTrapCard(

    text: String,

    textSizeScale: Float,

    onAskAi: (String) -> Unit

) {

    val cleanText = text.removePrefix("⚠ EXAM TRAP —").removePrefix("⚠ EXAM TRAP -").removePrefix("⚠ EXAM TRAP").removePrefix("⚠").trim()

    Surface(

        shape = RoundedCornerShape(14.dp),

        color = Color(0xFFFEF2F2),

        border = BorderStroke(1.dp, Color(0xFFFECACA)),

        shadowElevation = 0.dp,

        modifier = Modifier

            .fillMaxWidth()

            .padding(vertical = 5.dp)

    ) {

        Column(modifier = Modifier.padding(14.dp)) {

            Row(

                modifier = Modifier.fillMaxWidth(),

                verticalAlignment = Alignment.CenterVertically,

                horizontalArrangement = Arrangement.SpaceBetween

            ) {

                Surface(

                    shape = RoundedCornerShape(6.dp),

                    color = Color(0xFFFEE2E2)

                ) {

                    Row(

                        verticalAlignment = Alignment.CenterVertically,

                        horizontalArrangement = Arrangement.spacedBy(4.dp),

                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)

                    ) {

                        Icon(

                            imageVector = Icons.Default.Warning,

                            contentDescription = "Warning",

                            tint = Color(0xFFDC2626),

                            modifier = Modifier.size(13.dp)

                        )

                        Text(

                            text = "EXAM TRAP",

                            fontFamily = InterFontFamily,

                            fontWeight = FontWeight.Bold,

                            fontSize = 10.sp,

                            letterSpacing = 0.6.sp,

                            color = Color(0xFF991B1B)

                        )

                    }

                }



                Surface(

                    onClick = { onAskAi("Clarify why this is an IISER IAT / NEST exam trap: $cleanText") },

                    shape = RoundedCornerShape(50),

                    color = Color.White.copy(alpha = 0.85f),

                    border = BorderStroke(1.dp, Color(0xFFFECACA))

                ) {

                    Row(

                        verticalAlignment = Alignment.CenterVertically,

                        horizontalArrangement = Arrangement.spacedBy(4.dp),

                        modifier = Modifier.padding(horizontal = 9.dp, vertical = 3.dp)

                    ) {

                        Icon(

                            imageVector = Icons.Default.AutoAwesome,

                            contentDescription = "Clarify",

                            tint = Color(0xFFDC2626),

                            modifier = Modifier.size(12.dp)

                        )

                        Text(

                            text = "Clarify",

                            fontFamily = InterFontFamily,

                            fontWeight = FontWeight.Medium,

                            fontSize = 10.5.sp,

                            color = Color(0xFF991B1B)

                        )

                    }

                }

            }



            Spacer(modifier = Modifier.height(8.dp))



            Text(

                text = noteAnnotated(cleanText),

                fontFamily = AcademicSerifFamily,

                fontWeight = FontWeight.Normal,

                fontSize = (15.5.sp * textSizeScale),

                lineHeight = (24.sp * textSizeScale),

                color = Color(0xFF7F1D1D)

            )

        }

    }

}



/** Formula card: clean academic mathematical presentation with serif font, formula copy & AI explanation. */

@Composable

private fun FormulaBlock(

    line: String,

    textSizeScale: Float,

    onCopy: (String) -> Unit,

    onAskAi: (String) -> Unit

) {

    val formulaText = line.removePrefix("✔ KEY FORMULA —").removePrefix("✔ KEY FORMULA -").removePrefix("✔ KEY FORMULA").removePrefix("✔").trim()

    Surface(

        shape = RoundedCornerShape(14.dp),

        color = Color.White,

        border = BorderStroke(1.dp, Color(0xFFE2E8F0)),

        shadowElevation = 1.dp,

        modifier = Modifier

            .fillMaxWidth()

            .padding(vertical = 6.dp)

    ) {

        Column(modifier = Modifier.padding(14.dp)) {

            Row(

                modifier = Modifier.fillMaxWidth(),

                verticalAlignment = Alignment.CenterVertically,

                horizontalArrangement = Arrangement.SpaceBetween

            ) {

                Surface(

                    shape = RoundedCornerShape(6.dp),

                    color = Color(0xFFEEF2FF)

                ) {

                    Row(

                        verticalAlignment = Alignment.CenterVertically,

                        horizontalArrangement = Arrangement.spacedBy(4.dp),

                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)

                    ) {

                        Text(

                            text = "∑",

                            fontFamily = AcademicSerifFamily,

                            fontWeight = FontWeight.Bold,

                            color = Color(0xFF3569F6),

                            fontSize = 12.sp

                        )

                        Text(

                            text = "KEY FORMULA",

                            fontFamily = InterFontFamily,

                            fontWeight = FontWeight.Bold,

                            fontSize = 10.sp,

                            letterSpacing = 0.6.sp,

                            color = Color(0xFF2563EB)

                        )

                    }

                }



                Row(

                    verticalAlignment = Alignment.CenterVertically,

                    horizontalArrangement = Arrangement.spacedBy(6.dp)

                ) {

                    Surface(

                        onClick = { onCopy(formulaText) },

                        shape = RoundedCornerShape(50),

                        color = Color(0xFFF8FAFC),

                        border = BorderStroke(1.dp, Color(0xFFE2E8F0))

                    ) {

                        Row(

                            verticalAlignment = Alignment.CenterVertically,

                            horizontalArrangement = Arrangement.spacedBy(4.dp),

                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)

                        ) {

                            Icon(

                                imageVector = Icons.Default.ContentCopy,

                                contentDescription = "Copy formula",

                                tint = Color(0xFF64748B),

                                modifier = Modifier.size(12.dp)

                            )

                            Text(

                                text = "Copy",

                                fontFamily = InterFontFamily,

                                fontWeight = FontWeight.Medium,

                                fontSize = 10.5.sp,

                                color = Color(0xFF475569)

                            )

                        }

                    }



                    Surface(

                        onClick = { onAskAi("Break down this formula and show IISER IAT application: $formulaText") },

                        shape = RoundedCornerShape(50),

                        color = Color(0xFFF0FDF4),

                        border = BorderStroke(1.dp, Color(0xFFBBF7D0))

                    ) {

                        Row(

                            verticalAlignment = Alignment.CenterVertically,

                            horizontalArrangement = Arrangement.spacedBy(3.dp),

                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)

                        ) {

                            Icon(

                                imageVector = Icons.Default.AutoAwesome,

                                contentDescription = "Derive",

                                tint = Color(0xFF16A34A),

                                modifier = Modifier.size(12.dp)

                            )

                            Text(

                                text = "Derive",

                                fontFamily = InterFontFamily,

                                fontWeight = FontWeight.Medium,

                                fontSize = 10.5.sp,

                                color = Color(0xFF15803D)

                            )

                        }

                    }

                }

            }



            Spacer(modifier = Modifier.height(10.dp))



            Surface(

                shape = RoundedCornerShape(10.dp),

                color = Color(0xFFF8FAFC),

                border = BorderStroke(1.dp, Color(0xFFF1F5F9)),

                modifier = Modifier.fillMaxWidth()

            ) {

                Box(

                    modifier = Modifier

                        .fillMaxWidth()

                        .padding(horizontal = 14.dp, vertical = 10.dp),

                    contentAlignment = Alignment.Center

                ) {

                    Text(

                        text = formulaText,

                        fontFamily = AcademicSerifFamily,

                        fontWeight = FontWeight.SemiBold,

                        fontSize = (15.5.sp * textSizeScale),

                        lineHeight = (23.sp * textSizeScale),

                        color = Color(0xFF1E3A8A),

                        textAlign = TextAlign.Center

                    )

                }

            }

        }

    }

}



/** Worked Example / Solved Numerical card. */

@Composable

private fun WorkedExampleCard(

    line: String,

    textSizeScale: Float

) {

    val cleanLine = line.removePrefix("•").trim()

    val badgeLabel = when {

        cleanLine.startsWith("Numerical", ignoreCase = true) -> "SOLVED NUMERICAL"

        cleanLine.startsWith("Example", ignoreCase = true) -> "EXAM EXAMPLE"

        cleanLine.startsWith("Worked example", ignoreCase = true) -> "WORKED CALCULATION"

        cleanLine.startsWith("Derivation", ignoreCase = true) -> "DERIVATION"

        cleanLine.startsWith("Check", ignoreCase = true) -> "HOMOGENEITY CHECK"

        else -> "WORKED PATTERN"

    }



    Surface(

        shape = RoundedCornerShape(14.dp),

        color = Color(0xFFF8FAFC),

        border = BorderStroke(1.dp, Color(0xFFE2E8F0)),

        modifier = Modifier

            .fillMaxWidth()

            .padding(vertical = 5.dp)

    ) {

        Column(modifier = Modifier.padding(14.dp)) {

            Surface(

                shape = RoundedCornerShape(6.dp),

                color = Color(0xFFE0E7FF)

            ) {

                Text(

                    text = badgeLabel,

                    fontFamily = InterFontFamily,

                    fontWeight = FontWeight.Bold,

                    fontSize = 9.5.sp,

                    letterSpacing = 0.5.sp,

                    color = Color(0xFF4338CA),

                    modifier = Modifier.padding(horizontal = 7.dp, vertical = 3.dp)

                )

            }



            Spacer(modifier = Modifier.height(8.dp))



            Text(

                text = noteAnnotated(cleanLine),

                fontFamily = InterFontFamily,

                fontWeight = FontWeight.Normal,

                fontSize = (13.5.sp * textSizeScale),

                lineHeight = (20.5.sp * textSizeScale),

                color = Color(0xFF1E293B)

            )

        }

    }

}



/** Rule block for counting significant figures or arithmetic rules. */

@Composable

private fun RuleCard(

    line: String,

    textSizeScale: Float

) {

    val cleanLine = line.removePrefix("•").trim()

    val rulePrefix = cleanLine.substringBefore(":").trim()

    val ruleContent = cleanLine.substringAfter(":").trim()



    Surface(

        shape = RoundedCornerShape(12.dp),

        color = Color.White,

        border = BorderStroke(1.dp, Color(0xFFE5E7EB)),

        modifier = Modifier

            .fillMaxWidth()

            .padding(vertical = 4.dp)

    ) {

        Row(

            modifier = Modifier.padding(12.dp),

            verticalAlignment = Alignment.Top,

            horizontalArrangement = Arrangement.spacedBy(10.dp)

        ) {

            Surface(

                shape = CircleShape,

                color = Color(0xFFEEF2FF),

                border = BorderStroke(1.dp, Color(0xFFC7D2FE)),

                modifier = Modifier.size(24.dp)

            ) {

                Box(contentAlignment = Alignment.Center) {

                    Text(

                        text = rulePrefix.replace("Rule", "").trim(),

                        fontFamily = InterFontFamily,

                        fontWeight = FontWeight.Bold,

                        fontSize = 11.sp,

                        color = Color(0xFF3569F6)

                    )

                }

            }



            Column(modifier = Modifier.weight(1f)) {

                Text(

                    text = rulePrefix,

                    fontFamily = InterFontFamily,

                    fontWeight = FontWeight.SemiBold,

                    fontSize = 12.sp,

                    color = Color(0xFF3569F6)

                )

                Spacer(modifier = Modifier.height(2.dp))

                Text(

                    text = noteAnnotated(ruleContent),

                    fontFamily = InterFontFamily,

                    fontWeight = FontWeight.Normal,

                    fontSize = (13.5.sp * textSizeScale),

                    lineHeight = (20.sp * textSizeScale),

                    color = Color(0xFF17213A)

                )

            }

        }

    }

}



/** 2-column reference grid of the 7 SI Base Units & their defining constants. */

@Composable

private fun SiBaseUnitsGrid() {

    val units = listOf(

        Triple("Length", "metre (m)", "Speed of light c = 299,792,458 m/s"),

        Triple("Mass", "kilogram (kg)", "Planck constant h = 6.62607 × 10⁻³⁴ J s"),

        Triple("Time", "second (s)", "Caesium freq Δν_Cs = 9,192,631,770 Hz"),

        Triple("Current", "ampere (A)", "Elementary charge e = 1.60217 × 10⁻¹⁹ C"),

        Triple("Temperature", "kelvin (K)", "Boltzmann const k_B = 1.380649 × 10⁻²³ J/K"),

        Triple("Amount", "mole (mol)", "Avogadro const N_A = 6.02214 × 10²³"),

        Triple("Luminous Int.", "candela (cd)", "Luminous efficacy K_cd = 683 lm/W")

    )



    Surface(

        shape = RoundedCornerShape(16.dp),

        color = Color(0xFFF8FAFC),

        border = BorderStroke(1.dp, Color(0xFFE2E8F0)),

        modifier = Modifier

            .fillMaxWidth()

            .padding(vertical = 8.dp)

    ) {

        Column(modifier = Modifier.padding(14.dp)) {

            Row(

                modifier = Modifier.fillMaxWidth(),

                verticalAlignment = Alignment.CenterVertically,

                horizontalArrangement = Arrangement.SpaceBetween

            ) {

                Text(

                    text = "THE 7 SI BASE UNITS & DEFINING CONSTANTS",

                    fontFamily = InterFontFamily,

                    fontWeight = FontWeight.Bold,

                    fontSize = 10.5.sp,

                    letterSpacing = 0.5.sp,

                    color = Color(0xFF3569F6)

                )

                Surface(

                    shape = RoundedCornerShape(6.dp),

                    color = Color(0xFFEEF2FF)

                ) {

                    Text(

                        text = "2019 SI Re-definition",

                        fontFamily = InterFontFamily,

                        fontWeight = FontWeight.Medium,

                        fontSize = 9.5.sp,

                        color = Color(0xFF4F46E5),

                        modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)

                    )

                }

            }



            Spacer(modifier = Modifier.height(10.dp))



            Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {

                units.forEach { (qty, unitSymbol, constant) ->

                    Surface(

                        shape = RoundedCornerShape(10.dp),

                        color = Color.White,

                        border = BorderStroke(1.dp, Color(0xFFECEFF4)),

                        modifier = Modifier.fillMaxWidth()

                    ) {

                        Row(

                            modifier = Modifier

                                .fillMaxWidth()

                                .padding(horizontal = 12.dp, vertical = 8.dp),

                            verticalAlignment = Alignment.CenterVertically,

                            horizontalArrangement = Arrangement.SpaceBetween

                        ) {

                            Column(modifier = Modifier.weight(0.45f)) {

                                Text(

                                    text = qty,

                                    fontFamily = InterFontFamily,

                                    fontWeight = FontWeight.SemiBold,

                                    fontSize = 12.5.sp,

                                    color = Color(0xFF0F172A)

                                )

                                Text(

                                    text = unitSymbol,

                                    fontFamily = AcademicSerifFamily,

                                    fontWeight = FontWeight.Normal,

                                    fontSize = 11.5.sp,

                                    color = Color(0xFF3569F6)

                                )

                            }

                            Text(

                                text = constant,

                                fontFamily = JetBrainsMonoFamily,

                                fontWeight = FontWeight.Normal,

                                fontSize = 10.sp,

                                color = Color(0xFF475569),

                                textAlign = TextAlign.End,

                                modifier = Modifier.weight(0.55f)

                            )

                        }

                    }

                }

            }

        }

    }

}



/** Multi-column reference chips for SI decimal prefixes. */

@Composable

private fun PrefixReferenceTable() {

    val prefixes = listOf(

        Pair("tera (T)", "10¹²"),

        Pair("giga (G)", "10⁹"),

        Pair("mega (M)", "10⁶"),

        Pair("kilo (k)", "10³"),

        Pair("centi (c)", "10⁻²"),

        Pair("milli (m)", "10⁻³"),

        Pair("micro (μ)", "10⁻⁶"),

        Pair("nano (n)", "10⁻⁹"),

        Pair("pico (p)", "10⁻¹²"),

        Pair("femto (f)", "10⁻¹⁵")

    )



    Surface(

        shape = RoundedCornerShape(14.dp),

        color = Color(0xFFF8FAFC),

        border = BorderStroke(1.dp, Color(0xFFE2E8F0)),

        modifier = Modifier

            .fillMaxWidth()

            .padding(vertical = 6.dp)

    ) {

        Column(modifier = Modifier.padding(12.dp)) {

            Text(

                text = "SI DECIMAL PREFIXES REFERENCE",

                fontFamily = InterFontFamily,

                fontWeight = FontWeight.Bold,

                fontSize = 10.sp,

                letterSpacing = 0.5.sp,

                color = Color(0xFF475569)

            )

            Spacer(modifier = Modifier.height(8.dp))

            Row(

                modifier = Modifier.fillMaxWidth(),

                horizontalArrangement = Arrangement.spacedBy(6.dp)

            ) {

                // Column 1

                Column(modifier = Modifier.weight(1f), verticalArrangement = Arrangement.spacedBy(4.dp)) {

                    prefixes.take(5).forEach { (name, pwr) ->

                        Row(

                            modifier = Modifier

                                .fillMaxWidth()

                                .background(Color.White, RoundedCornerShape(6.dp))

                                .border(BorderStroke(1.dp, Color(0xFFECEFF4)), RoundedCornerShape(6.dp))

                                .padding(horizontal = 8.dp, vertical = 4.dp),

                            horizontalArrangement = Arrangement.SpaceBetween,

                            verticalAlignment = Alignment.CenterVertically

                        ) {

                            Text(name, fontSize = 11.sp, fontFamily = InterFontFamily, color = Color(0xFF1E293B))

                            Text(pwr, fontSize = 10.5.sp, fontFamily = JetBrainsMonoFamily, fontWeight = FontWeight.Bold, color = Color(0xFF3569F6))

                        }

                    }

                }

                // Column 2

                Column(modifier = Modifier.weight(1f), verticalArrangement = Arrangement.spacedBy(4.dp)) {

                    prefixes.drop(5).forEach { (name, pwr) ->

                        Row(

                            modifier = Modifier

                                .fillMaxWidth()

                                .background(Color.White, RoundedCornerShape(6.dp))

                                .border(BorderStroke(1.dp, Color(0xFFECEFF4)), RoundedCornerShape(6.dp))

                                .padding(horizontal = 8.dp, vertical = 4.dp),

                            horizontalArrangement = Arrangement.SpaceBetween,

                            verticalAlignment = Alignment.CenterVertically

                        ) {

                            Text(name, fontSize = 11.sp, fontFamily = InterFontFamily, color = Color(0xFF1E293B))

                            Text(pwr, fontSize = 10.5.sp, fontFamily = JetBrainsMonoFamily, fontWeight = FontWeight.Bold, color = Color(0xFF3569F6))

                        }

                    }

                }

            }

        }

    }

}



/** One body line of the Read tab, styled by its marker prefix. */

@Composable

private fun NoteBodyLine(

    line: String,

    textSizeScale: Float,

    onCopy: (String) -> Unit,

    onAskAi: (String) -> Unit

) {

    when {

        line.startsWith("✔") -> {

            FormulaBlock(line = line, textSizeScale = textSizeScale, onCopy = onCopy, onAskAi = onAskAi)

        }

        line.startsWith("★") -> {

            KeyTakeawayCard(text = line, textSizeScale = textSizeScale, onAskAi = onAskAi)

        }

        line.startsWith("⚠") -> {

            ExamTrapCard(text = line, textSizeScale = textSizeScale, onAskAi = onAskAi)

        }

        line.startsWith("• Prefixes scale a unit") -> {

            Column {

                PrefixReferenceTable()

                Text(

                    text = noteAnnotated(line.removePrefix("•").trim()),

                    fontFamily = InterFontFamily,

                    fontWeight = FontWeight.Normal,

                    fontSize = (14.sp * textSizeScale),

                    lineHeight = (22.sp * textSizeScale),

                    color = Color(0xFF17213A),

                    modifier = Modifier.padding(vertical = 4.dp)

                )

            }

        }

        line.startsWith("• Rule ") -> {

            RuleCard(line = line, textSizeScale = textSizeScale)

        }

        line.startsWith("• Worked example") ||

        line.startsWith("• Example") ||

        line.startsWith("• Numerical") ||

        line.startsWith("• Derivation") ||

        line.startsWith("• Check ") -> {

            WorkedExampleCard(line = line, textSizeScale = textSizeScale)

        }

        line.startsWith("•") -> {

            val prose = line.removePrefix("•").trim()

            Text(

                text = noteAnnotated(prose),

                fontFamily = AcademicSerifFamily,

                fontWeight = FontWeight.Normal,

                fontSize = (17.5.sp * textSizeScale),

                lineHeight = (28.sp * textSizeScale),

                color = Color(0xFF171A23),

                modifier = Modifier

                    .fillMaxWidth()

                    .padding(vertical = 6.dp)

            )

        }

        else -> {

            Text(

                text = noteAnnotated(line),

                fontFamily = AcademicSerifFamily,

                fontWeight = FontWeight.Normal,

                fontSize = (17.5.sp * textSizeScale),

                lineHeight = (28.sp * textSizeScale),

                color = Color(0xFF171A23),

                modifier = Modifier

                    .fillMaxWidth()

                    .padding(vertical = 6.dp)

            )

        }

    }

}



/** Chapter Overview Card displayed at the top of the "Read" tab. */

@Composable

private fun ChapterOverviewCard(

    chapter: ChapterEntity,

    sectionCount: Int,

    keyTakeaways: List<String>,

    onContinueReading: () -> Unit

) {

    var expandedOverview by remember { mutableStateOf(false) }



    Surface(

        shape = RoundedCornerShape(18.dp),

        color = Color.White,

        border = BorderStroke(1.dp, Color(0xFFE2E8F0)),

        shadowElevation = 1.dp,

        modifier = Modifier

            .fillMaxWidth()

            .padding(bottom = 18.dp)

    ) {

        Column(modifier = Modifier.padding(18.dp)) {

            Row(

                verticalAlignment = Alignment.CenterVertically,

                horizontalArrangement = Arrangement.spacedBy(8.dp)

            ) {

                Surface(

                    shape = RoundedCornerShape(6.dp),

                    color = Color(0xFFEFF6FF)

                ) {

                    Text(

                        text = "${chapter.subject.uppercase()} • CH ${chapter.chapterNumber.toString().padStart(2, '0')}",

                        fontFamily = InterFontFamily,

                        fontWeight = FontWeight.Bold,

                        fontSize = 10.5.sp,

                        letterSpacing = 0.5.sp,

                        color = Color(0xFF3569F6),

                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)

                    )

                }



                Surface(

                    shape = RoundedCornerShape(6.dp),

                    color = Color(0xFFF0FDF4)

                ) {

                    Text(

                        text = chapter.examTag,

                        fontFamily = InterFontFamily,

                        fontWeight = FontWeight.SemiBold,

                        fontSize = 10.sp,

                        color = Color(0xFF15803D),

                        modifier = Modifier.padding(horizontal = 6.dp, vertical = 3.dp)

                    )

                }

            }



            Spacer(modifier = Modifier.height(10.dp))



            Text(

                text = chapter.title,

                fontFamily = OutfitDisplayFamily,

                fontWeight = FontWeight.Bold,

                fontSize = 21.sp,

                letterSpacing = (-0.4).sp,

                color = Color(0xFF0F172A)

            )



            if (chapter.subtitle.isNotBlank()) {

                Spacer(modifier = Modifier.height(4.dp))

                Text(

                    text = chapter.subtitle,

                    fontFamily = InterFontFamily,

                    fontWeight = FontWeight.Normal,

                    fontSize = 13.sp,

                    lineHeight = 18.sp,

                    color = Color(0xFF64748B)

                )

            }



            Spacer(modifier = Modifier.height(14.dp))



            Row(

                modifier = Modifier.fillMaxWidth(),

                horizontalArrangement = Arrangement.spacedBy(10.dp)

            ) {

                Surface(

                    shape = RoundedCornerShape(8.dp),

                    color = Color(0xFFF8FAFC),

                    border = BorderStroke(1.dp, Color(0xFFE2E8F0)),

                    modifier = Modifier.weight(1f)

                ) {

                    Row(

                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 8.dp),

                        verticalAlignment = Alignment.CenterVertically,

                        horizontalArrangement = Arrangement.spacedBy(6.dp)

                    ) {

                        Icon(

                            imageVector = Icons.Default.Timer,

                            contentDescription = null,

                            tint = Color(0xFF3569F6),

                            modifier = Modifier.size(15.dp)

                        )

                        Text(

                            text = "${chapter.durationMinutes} Min Read",

                            fontFamily = InterFontFamily,

                            fontWeight = FontWeight.Medium,

                            fontSize = 11.5.sp,

                            color = Color(0xFF1E293B)

                        )

                    }

                }



                Surface(

                    shape = RoundedCornerShape(8.dp),

                    color = Color(0xFFF8FAFC),

                    border = BorderStroke(1.dp, Color(0xFFE2E8F0)),

                    modifier = Modifier.weight(1f)

                ) {

                    Row(

                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 8.dp),

                        verticalAlignment = Alignment.CenterVertically,

                        horizontalArrangement = Arrangement.spacedBy(6.dp)

                    ) {

                        Icon(

                            imageVector = Icons.Default.MenuBook,

                            contentDescription = null,

                            tint = Color(0xFF7862EA),

                            modifier = Modifier.size(15.dp)

                        )

                        Text(

                            text = "$sectionCount Sections",

                            fontFamily = InterFontFamily,

                            fontWeight = FontWeight.Medium,

                            fontSize = 11.5.sp,

                            color = Color(0xFF1E293B)

                        )

                    }

                }

            }



            Spacer(modifier = Modifier.height(12.dp))



            if (keyTakeaways.isNotEmpty()) {

                Surface(

                    shape = RoundedCornerShape(10.dp),

                    color = Color(0xFFF8FAFC),

                    modifier = Modifier.fillMaxWidth()

                ) {

                    Column(modifier = Modifier.padding(12.dp)) {

                        Row(

                            modifier = Modifier.fillMaxWidth(),

                            verticalAlignment = Alignment.CenterVertically,

                            horizontalArrangement = Arrangement.SpaceBetween

                        ) {

                            Text(

                                text = "CORE CONCEPT HIGHLIGHTS",

                                fontFamily = InterFontFamily,

                                fontWeight = FontWeight.Bold,

                                fontSize = 10.sp,

                                letterSpacing = 0.5.sp,

                                color = Color(0xFF475569)

                            )

                            IconButton(

                                onClick = { expandedOverview = !expandedOverview },

                                modifier = Modifier.size(20.dp)

                            ) {

                                Icon(

                                    imageVector = if (expandedOverview) Icons.Default.ExpandLess else Icons.Default.ExpandMore,

                                    contentDescription = "Expand",

                                    tint = Color(0xFF64748B),

                                    modifier = Modifier.size(16.dp)

                                )

                            }

                        }



                        val visibleTakeaways = if (expandedOverview) keyTakeaways else keyTakeaways.take(2)

                        visibleTakeaways.forEach { bullet ->

                            Spacer(modifier = Modifier.height(4.dp))

                            Row(

                                verticalAlignment = Alignment.Top,

                                horizontalArrangement = Arrangement.spacedBy(6.dp)

                            ) {

                                Text("•", color = Color(0xFF3569F6), fontWeight = FontWeight.Bold, fontSize = 12.sp)

                                Text(

                                    text = bullet,

                                    fontFamily = InterFontFamily,

                                    fontSize = 12.sp,

                                    lineHeight = 17.sp,

                                    color = Color(0xFF334155)

                                )

                            }

                        }

                    }

                }

            }



            Spacer(modifier = Modifier.height(14.dp))



            Button(

                onClick = onContinueReading,

                shape = RoundedCornerShape(12.dp),

                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF3569F6)),

                modifier = Modifier

                    .fillMaxWidth()

                    .height(44.dp)

            ) {

                Text(

                    text = "Start / Continue Reading",

                    fontFamily = InterFontFamily,

                    fontWeight = FontWeight.SemiBold,

                    fontSize = 13.5.sp,

                    color = Color.White

                )

                Spacer(modifier = Modifier.width(6.dp))

                Icon(

                    imageVector = Icons.AutoMirrored.Filled.ArrowForward,

                    contentDescription = null,

                    tint = Color.White,

                    modifier = Modifier.size(15.dp)

                )

            }

        }

    }

}



/** Blue waveform audio/AI icon matching the reference screenshot. */
@Composable
private fun WaveformIcon(color: Color, modifier: Modifier = Modifier) {
    Canvas(modifier = modifier) {
        val strokeWidth = 2.2.dp.toPx()
        val heights = listOf(0.42f, 0.95f, 0.65f, 1.0f, 0.5f)
        val centerY = size.height / 2f
        val step = if (heights.size > 1) size.width / (heights.size - 1) else 0f
        heights.forEachIndexed { i, hRatio ->
            val x = i * step
            val barH = size.height * hRatio
            drawLine(
                color = color,
                start = Offset(x, centerY - barH / 2f),
                end = Offset(x, centerY + barH / 2f),
                strokeWidth = strokeWidth,
                cap = StrokeCap.Round
            )
        }
    }
}

/** Precise outline/crop icon matching the bottom-right Topics button in the reference screenshot. */
@Composable
private fun TopicsOutlineIcon(color: Color, modifier: Modifier = Modifier) {
    Canvas(modifier = modifier) {
        val strokeW = 1.6.dp.toPx()
        val pad = size.width * 0.22f
        val rectSize = Size(size.width - 2 * pad, size.height - 2 * pad)
        // Center rounded rectangle outline
        drawRoundRect(
            color = color,
            topLeft = Offset(pad, pad),
            size = rectSize,
            cornerRadius = CornerRadius(2.5.dp.toPx(), 2.5.dp.toPx()),
            style = Stroke(width = strokeW)
        )
        // Corner extension ticks
        val tick = size.width * 0.12f
        // Top-left corner tick
        drawLine(color, Offset(pad, pad - tick), Offset(pad, pad), strokeWidth = strokeW, cap = StrokeCap.Round)
        // Bottom-right corner tick
        drawLine(color, Offset(size.width - pad, size.height - pad), Offset(size.width - pad, size.height - pad + tick), strokeWidth = strokeW, cap = StrokeCap.Round)
    }
}


private fun parseNoteSections(notes: String): List<Pair<String, List<String>>> {
    if (notes.isBlank()) return emptyList()
    val lines = notes.lines().map { it.trim() }.filter { it.isNotEmpty() }
    if (lines.isEmpty()) return emptyList()

    val sections = mutableListOf<Pair<String, MutableList<String>>>()
    var currentHeading = ""
    var currentBody = mutableListOf<String>()

    fun isHeadingLine(line: String): Boolean {
        if (line.isEmpty()) return false
        if (line.startsWith("•") || line.startsWith("★") || line.startsWith("⚠") ||
            line.startsWith("✔") || line.startsWith("http") || line.startsWith("[diagram") ||
            line.startsWith("(") || line.startsWith("where ") || line.startsWith("- ")) {
            return false
        }
        if (line.startsWith("▸") || line.startsWith("#")) {
            return true
        }
        val isNumbered = Regex("""^\[?\d+(?:\.\d+)*\]?[\.\s\-—:]""").containsMatchIn(line)
        if (isNumbered) return true

        val endsWithPunct = line.endsWith(".") || line.endsWith(":") || line.endsWith(";") || line.endsWith("?")
        return !endsWithPunct && line.length <= 85
    }

    for (line in lines) {
        if (isHeadingLine(line)) {
            if (currentHeading.isNotBlank() || currentBody.isNotEmpty()) {
                val headingToSave = if (currentHeading.isNotBlank()) currentHeading else "Introduction"
                sections.add(headingToSave to currentBody)
                currentBody = mutableListOf()
            }
            currentHeading = line
        } else {
            currentBody.add(line)
        }
    }

    if (currentHeading.isNotBlank() || currentBody.isNotEmpty()) {
        val headingToSave = if (currentHeading.isNotBlank()) currentHeading else "Introduction"
        sections.add(headingToSave to currentBody)
    }

    if (sections.size <= 1 && sections.firstOrNull()?.second?.isEmpty() == true) {
        val rawBlocks = notes.trim().split(Regex("\n\\s*\n"))
        return rawBlocks.mapNotNull { block ->
            val bLines = block.lines().map { it.trim() }.filter { it.isNotEmpty() }
            if (bLines.isEmpty()) null
            else bLines.first() to bLines.drop(1)
        }
    }

    return sections
}

private fun isIntroductionHeading(rawHeading: String): Boolean {
    val clean = rawHeading.trim().removePrefix("#").removePrefix("##").trim()
    return clean.equals("Introduction", ignoreCase = true) || clean.startsWith("Introduction", ignoreCase = true)
}

private fun formatSectionBadge(chapterNum: Int, idx: Int, rawHeading: String): String? {
    if (isIntroductionHeading(rawHeading)) return null
    val clean = rawHeading.trim().removePrefix("▸").trim()
    // Match explicit [1.1], 1.1, 1.2.1, 1.2, etc.
    val dotMatch = Regex("""^\[?(\d+(?:\.\d+)+)\]?""").find(clean)
    if (dotMatch != null) {
        return dotMatch.groupValues[1]
    }
    // Match single-digit numbered sections like 1. Title, 2. Title
    val numMatch = Regex("""^\[?(\d+)\]?[\.\s\-—:]""").find(clean)
    if (numMatch != null) {
        return "$chapterNum.${numMatch.groupValues[1]}"
    }
    // If subsection or unnumbered section:
    return "$chapterNum.${idx + 1}"
}

private fun cleanSectionTitle(rawHeading: String): String {
    if (isIntroductionHeading(rawHeading)) return "Introduction"
    return rawHeading
        .trim()
        .removePrefix("▸")
        .trim()
        .replace(Regex("""^\[?\d+(?:\.\d+)*\]?[\.\s\-—:]*"""), "")
        .replace(Regex("""\[Fig\.[^\]]*\]"""), "")
        .trim()
}

private fun sectionTopicsSheetTitle(chapterNum: Int, idx: Int, rawHeading: String): String {
    if (isIntroductionHeading(rawHeading)) return "Introduction"
    val badge = formatSectionBadge(chapterNum, idx, rawHeading)
    val title = cleanSectionTitle(rawHeading)
    val isSub = badge != null && badge.count { it == '.' } > 1
    val formattedTitle = if (isSub) title else title.uppercase()
    return if (badge != null) "$badge $formattedTitle" else formattedTitle
}

private fun sectionTopBarLabel(chapterNum: Int, idx: Int, rawHeading: String): String {
    if (isIntroductionHeading(rawHeading)) return "Introduction"
    val badge = formatSectionBadge(chapterNum, idx, rawHeading)
    val title = cleanSectionTitle(rawHeading)
    val isSub = badge != null && badge.count { it == '.' } > 1
    val formattedTitle = if (isSub) title else title.uppercase()
    return if (badge != null) "$badge $formattedTitle" else formattedTitle
}

@Composable
fun ChapterReaderOverlay(
    chapter: ChapterEntity,
    startWithVideo: Boolean,
    onBack: () -> Unit,
    onMarkCompleted: (Boolean) -> Unit,
    onPracticeChapterQuestions: () -> Unit,
    siblingChapters: List<ChapterEntity> = emptyList(),
    onSelectSiblingChapter: (ChapterEntity) -> Unit = {},
    chapterQuestions: List<QuestionEntity> = emptyList(),
    onOpenAiTutor: () -> Unit = {}
) {
    BackHandler(onBack = onBack)

    val context = LocalContext.current
    val clipboardManager = LocalClipboardManager.current
    val coroutineScope = rememberCoroutineScope()
    val listState = rememberLazyListState()

    // 4-Tab Segmented Pill Bar: "Read" | "Video" | "Notes" | "IMP Qs"
    val readerTabs = remember { listOf("Read", "Video", "Notes", "IMP Qs") }
    var selectedTab by remember(chapter.id, startWithVideo) {
        mutableStateOf(if (startWithVideo) "Video" else "Read")
    }
    var currentSectionIndex by remember(chapter.id) { mutableIntStateOf(0) }
    var showTopicsSheet by remember { mutableStateOf(false) }



    var isPlaying by remember(chapter.id, startWithVideo) { mutableStateOf(startWithVideo) }
    var playbackProgress by remember(chapter.id) { mutableFloatStateOf(0.25f) }
    var playbackSpeed by remember { mutableStateOf("1.0x") }
    var completionBannerShown by remember(chapter.id) { mutableStateOf(false) }

    // Reading Controls State
    var textSizeScale by remember { mutableFloatStateOf(1.0f) }
    var isBookmarked by remember(chapter.id) { mutableStateOf(false) }
    var zoomFigureKey by remember { mutableStateOf<String?>(null) }

    // Interactive Talk to AI Concept Sheet State
    var showTalkToAiSheet by remember { mutableStateOf(false) }
    var aiPromptMode by remember { mutableStateOf("explain") }
    var customAiQuestion by remember { mutableStateOf("") }
    var activeAiExplanation by remember(chapter.id) {
        mutableStateOf(
            if (chapter.keyConceptsSummary.isNotBlank()) {
                "Key Concepts • ${chapter.title}:\n\n${chapter.keyConceptsSummary}"
            } else {
                "Key Relations • ${chapter.title}:\n\n${chapter.formulaHighlight}"
            }
        )
    }

    LaunchedEffect(isPlaying, selectedTab, chapter.id) {
        while (isPlaying && selectedTab == "Video" && playbackProgress < 1f) {
            delay(500L)
            playbackProgress = (playbackProgress + 0.02f).coerceAtMost(1f)
            if (playbackProgress >= 1f) {
                isPlaying = false
                onMarkCompleted(true)
                completionBannerShown = true
            }
        }
    }

    val accent = subjectAccentColor(chapter.subject)

    // Parse key concepts bullets cleanly
    val keyConceptBullets = remember(chapter.keyConceptsSummary) {
        chapter.keyConceptsSummary
            .split("\n")
            .map { it.trim().removePrefix("•").trim() }
            .filter { it.isNotEmpty() }
    }

    // Parse detailed study notes into structured numbered sections
    val parsedNoteSections = remember(chapter.detailedStudyNotes) {
        parseNoteSections(chapter.detailedStudyNotes)
    }

    // Scroll to top when section changes
    LaunchedEffect(currentSectionIndex) {
        listState.scrollToItem(0)
    }

    // Section index is driven by prev/next navigation only

    // Section-based reading progress (driven by currentSectionIndex)
    val readingProgress by remember {
        derivedStateOf {
            if (parsedNoteSections.size <= 1) 0f
            else currentSectionIndex.toFloat() / (parsedNoteSections.size - 1).toFloat()
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFAFAF8))
            .windowInsetsPadding(WindowInsets.statusBars)
            .windowInsetsPadding(WindowInsets.navigationBars)
    ) {
        // ==================== STICKY HEADER & SEGMENTED CONTROLS ====================
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFFAFAF8))
                .zIndex(10f)
        ) {
            // 1. Top Navigation Row: Circular ✕ Close Button + Rounded Center Section Pill: < Section Title >
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 6.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Circular ✕ Close Button
                Surface(
                    onClick = onBack,
                    shape = CircleShape,
                    color = Color.White,
                    border = BorderStroke(1.dp, Color(0xFFE5E7EB)),
                    shadowElevation = 0.5.dp,
                    modifier = Modifier
                        .size(40.dp)
                        .testTag("chapter_overlay_back_button")
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        Icon(
                            imageVector = Icons.Default.Close,
                            contentDescription = "Close",
                            tint = Color(0xFF171A23),
                            modifier = Modifier.size(19.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.width(10.dp))

                // Wide Rounded Navigation Pill: < [Section Title] >
                Surface(
                    shape = RoundedCornerShape(50),
                    color = Color.White,
                    border = BorderStroke(1.dp, Color(0xFFE5E7EB)),
                    shadowElevation = 0.5.dp,
                    modifier = Modifier
                        .weight(1f)
                        .height(40.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        val canGoPrev = currentSectionIndex > 0
                        IconButton(
                            onClick = {
                                if (canGoPrev) {
                                    currentSectionIndex = currentSectionIndex - 1
                                }
                            },
                            enabled = canGoPrev,
                            modifier = Modifier.size(36.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.ChevronLeft,
                                contentDescription = "Previous Section",
                                tint = if (canGoPrev) Color(0xFF171A23) else Color(0xFFCBD5E1),
                                modifier = Modifier.size(22.dp)
                            )
                        }

                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxHeight()
                                .clickable { showTopicsSheet = true }
                                .padding(horizontal = 6.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            val activeTitle = if (parsedNoteSections.isNotEmpty() && currentSectionIndex in parsedNoteSections.indices) {
                                val rawHeading = parsedNoteSections[currentSectionIndex].first
                                sectionTopBarLabel(chapter.chapterNumber, currentSectionIndex, rawHeading)
                            } else {
                                chapter.title
                            }
                            Text(
                                text = activeTitle,
                                fontFamily = InterFontFamily,
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 12.5.sp,
                                color = Color(0xFF171A23),
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                                textAlign = TextAlign.Center
                            )
                        }

                        val canGoNext = currentSectionIndex < parsedNoteSections.size - 1
                        IconButton(
                            onClick = {
                                if (canGoNext) {
                                    val target = currentSectionIndex + 1
                                    currentSectionIndex = target
                                    coroutineScope.launch {
                                        listState.animateScrollToItem(target + 1)
                                    }
                                }
                            },
                            enabled = canGoNext,
                            modifier = Modifier.size(36.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.ChevronRight,
                                contentDescription = "Next Section",
                                tint = if (canGoNext) Color(0xFF171A23) else Color(0xFFCBD5E1),
                                modifier = Modifier.size(22.dp)
                            )
                        }
                    }
                }
            }

            // 2. 4 Reading Mode Tabs: Read | Video | Notes | IMP Qs
            Surface(
                shape = RoundedCornerShape(50),
                color = Color(0xFFF1F3F5),
                border = BorderStroke(1.dp, Color(0xFFE5E7EB)),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 3.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(3.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    readerTabs.forEach { tabLabel ->
                        val isSelected = selectedTab == tabLabel
                        Surface(
                            onClick = { selectedTab = tabLabel },
                            shape = RoundedCornerShape(50),
                            color = if (isSelected) Color.White else Color.Transparent,
                            shadowElevation = if (isSelected) 1.dp else 0.dp,
                            border = if (isSelected) BorderStroke(0.5.dp, Color(0xFFE5E7EB)) else null,
                            modifier = Modifier
                                .weight(1f)
                                .testTag("reader_tab_${tabLabel.lowercase().replace(" ", "_")}")
                        ) {
                            Box(
                                modifier = Modifier.padding(vertical = 7.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = tabLabel,
                                    fontFamily = InterFontFamily,
                                    fontWeight = if (isSelected) FontWeight.SemiBold else FontWeight.Medium,
                                    fontSize = 13.sp,
                                    color = if (isSelected) Color(0xFF171A23) else Color(0xFF747982)
                                )
                            }
                        }
                    }
                }
            }

            // 3. Thin reading progress indicator across width
            if (selectedTab == "Read") {
                LinearProgressIndicator(
                    progress = { readingProgress },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(2.dp),
                    color = Color(0xFF4269E8),
                    trackColor = Color(0xFFE5E7EB)
                )
            } else {
                Spacer(modifier = Modifier.height(2.dp))
            }
        }

        // ==================== SCROLLING CONTENT ====================
        SelectionContainer(
            modifier = Modifier.fillMaxSize()
        ) {
            LazyColumn(
                state = listState,
                modifier = Modifier
                    .fillMaxSize()
                    .testTag("chapter_reader_overlay"),
                contentPadding = PaddingValues(top = 114.dp, bottom = 100.dp)
            ) {
                // ==================== TAB 1: "Read" — INTERACTIVE SCIENCE TEXTBOOK ====================
                if (selectedTab == "Read") {
                    // Item 0: Chapter Introduction Header (Matching Screenshots 1, 2, 3)
                    item(key = "chapter_intro") {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 22.dp, vertical = 14.dp)
                        ) {
                            Text(
                                text = "CHAPTER ${chapter.chapterNumber}".uppercase(),
                                fontFamily = InterFontFamily,
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 11.5.sp,
                                letterSpacing = 1.2.sp,
                                color = Color(0xFF747982)
                            )

                            Spacer(modifier = Modifier.height(4.dp))

                            Text(
                                text = chapter.title,
                                fontFamily = OutfitDisplayFamily,
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 26.5.sp,
                                lineHeight = 34.sp,
                                letterSpacing = (-0.4).sp,
                                color = Color(0xFF171A23)
                            )

                            if (chapter.subtitle.isNotBlank() && !chapter.subtitle.startsWith("Flower Morphology")) {
                                Spacer(modifier = Modifier.height(6.dp))
                                Text(
                                    text = chapter.subtitle,
                                    fontFamily = AcademicSerifFamily,
                                    fontWeight = FontWeight.Normal,
                                    fontStyle = FontStyle.Italic,
                                    fontSize = (16.sp * textSizeScale),
                                    lineHeight = (25.sp * textSizeScale),
                                    color = Color(0xFF4B5563)
                                )
                            }
                        }
                    }

                    // Single-Section View: Only render the current section (prev/next arrows switch sections)
                    item(key = "sec_${chapter.id}_${currentSectionIndex}") {
                        val idx = currentSectionIndex
                        if (parsedNoteSections.isNotEmpty() && idx in parsedNoteSections.indices) {
                            val (sectionHeading, sectionLines) = parsedNoteSections[idx]
                            val isIntro = isIntroductionHeading(sectionHeading)
                            val badgeText = formatSectionBadge(chapter.chapterNumber, idx, sectionHeading)
                            val titleText = cleanSectionTitle(sectionHeading)
                            val isSubSection = !isIntro && (sectionHeading.trim().startsWith("▸") || (badgeText != null && badgeText.count { it == '.' } > 1))

                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 22.dp)
                            ) {
                                if (isIntro) {
                                    Spacer(modifier = Modifier.height(4.dp))
                                } else if (isSubSection) {
                                    Spacer(modifier = Modifier.height(18.dp))
                                    Text(
                                        text = if (badgeText != null) "$badgeText $titleText" else titleText,
                                        fontFamily = OutfitDisplayFamily,
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 16.sp,
                                        letterSpacing = (-0.2).sp,
                                        color = Color(0xFF171A23),
                                        modifier = Modifier.padding(vertical = 4.dp)
                                    )
                                    Spacer(modifier = Modifier.height(6.dp))
                                } else {
                                    // Primary section heading: [1.1] SECTION TITLE (teal badge + teal all-caps title)
                                    Spacer(modifier = Modifier.height(20.dp))
                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                                    ) {
                                        if (badgeText != null) {
                                            Surface(
                                                shape = RoundedCornerShape(6.dp),
                                                color = Color(0xFF168A9B)
                                            ) {
                                                Text(
                                                    text = badgeText,
                                                    fontFamily = InterFontFamily,
                                                    fontWeight = FontWeight.Bold,
                                                    fontSize = 12.sp,
                                                    color = Color.White,
                                                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.5.dp)
                                                )
                                            }
                                        }

                                        Text(
                                            text = titleText.uppercase(),
                                            fontFamily = OutfitDisplayFamily,
                                            fontWeight = FontWeight.SemiBold,
                                            fontSize = 15.5.sp,
                                            lineHeight = 22.sp,
                                            letterSpacing = 0.2.sp,
                                            color = Color(0xFF168A9B),
                                            modifier = Modifier.weight(1f)
                                        )
                                    }

                                    Spacer(modifier = Modifier.height(10.dp))
                                    Box(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .height(1.dp)
                                            .background(Color(0xFFE5E7EB))
                                    )
                                    Spacer(modifier = Modifier.height(12.dp))
                                }

                                // Scientific Diagrams for this section
                                chapterSectionFigures(chapter.id, idx).forEach { figKey ->
                                    ScientificDiagramCard(figKey = figKey, onZoom = { zoomFigureKey = it })
                                }

                                // Interactive Grid for SI Base Units in Section 1 (if physics chapter 1)
                                if (chapter.chapterNumber == 1 && chapter.subject.equals("Physics", ignoreCase = true) && idx == 1) {
                                    SiBaseUnitsGrid()
                                }

                                // Body Lines — plain textbook reading
                                sectionLines.forEach { line ->
                                    NoteBodyLine(
                                        line = line,
                                        textSizeScale = textSizeScale,
                                        onCopy = { formula ->
                                            clipboardManager.setText(AnnotatedString(formula))
                                            Toast.makeText(context, "Formula copied to clipboard", Toast.LENGTH_SHORT).show()
                                        },
                                        onAskAi = { prompt ->
                                            activeAiExplanation = prompt
                                            showTalkToAiSheet = true
                                        }
                                    )
                                }

                                Spacer(modifier = Modifier.height(14.dp))
                            }
                        }
                    }

                    // Item N+1: Section Navigation Footer or Final Chapter Completion
                    item(key = "chapter_section_footer_${currentSectionIndex}") {
                        val isLastSection = parsedNoteSections.isEmpty() || currentSectionIndex >= parsedNoteSections.size - 1
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 22.dp, vertical = 12.dp)
                        ) {
                            if (!isLastSection) {
                                val nextIdx = currentSectionIndex + 1
                                val nextHeading = parsedNoteSections[nextIdx].first
                                val nextTitle = sectionTopBarLabel(chapter.chapterNumber, nextIdx, nextHeading)

                                Surface(
                                    onClick = { currentSectionIndex = nextIdx },
                                    shape = RoundedCornerShape(16.dp),
                                    color = Color.White,
                                    border = BorderStroke(1.dp, Color(0xFFE2E8F0)),
                                    shadowElevation = 1.dp,
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    Row(
                                        modifier = Modifier.padding(horizontal = 18.dp, vertical = 14.dp),
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.SpaceBetween
                                    ) {
                                        Column(modifier = Modifier.weight(1f)) {
                                            Text(
                                                text = "NEXT TOPIC",
                                                fontFamily = InterFontFamily,
                                                fontWeight = FontWeight.Bold,
                                                fontSize = 10.sp,
                                                letterSpacing = 0.8.sp,
                                                color = Color(0xFF168A9B)
                                            )
                                            Spacer(modifier = Modifier.height(3.dp))
                                            Text(
                                                text = nextTitle,
                                                fontFamily = OutfitDisplayFamily,
                                                fontWeight = FontWeight.SemiBold,
                                                fontSize = 14.5.sp,
                                                color = Color(0xFF171A23),
                                                maxLines = 1,
                                                overflow = TextOverflow.Ellipsis
                                            )
                                        }
                                        Spacer(modifier = Modifier.width(12.dp))
                                        Surface(
                                            shape = CircleShape,
                                            color = Color(0xFF168A9B),
                                            modifier = Modifier.size(34.dp)
                                        ) {
                                            Box(contentAlignment = Alignment.Center) {
                                                Icon(
                                                    imageVector = Icons.Default.ChevronRight,
                                                    contentDescription = "Next Topic",
                                                    tint = Color.White,
                                                    modifier = Modifier.size(20.dp)
                                                )
                                            }
                                        }
                                    }
                                }
                                Spacer(modifier = Modifier.height(20.dp))
                            } else {
                            Surface(
                                shape = RoundedCornerShape(16.dp),
                                color = Color.White,
                                border = BorderStroke(1.dp, Color(0xFFE2E8F0)),
                                shadowElevation = 1.dp,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Column(modifier = Modifier.padding(16.dp)) {
                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                                    ) {
                                        Surface(
                                            shape = RoundedCornerShape(6.dp),
                                            color = Color(0xFFEEF2FF)
                                        ) {
                                            Text(
                                                text = "EXAM SUMMARY",
                                                fontFamily = InterFontFamily,
                                                fontWeight = FontWeight.Bold,
                                                fontSize = 9.5.sp,
                                                letterSpacing = 0.5.sp,
                                                color = Color(0xFF3569F6),
                                                modifier = Modifier.padding(horizontal = 7.dp, vertical = 3.dp)
                                            )
                                        }
                                        Text(
                                            text = "Core Formulas • ${chapter.title}",
                                            fontFamily = InterFontFamily,
                                            fontWeight = FontWeight.SemiBold,
                                            fontSize = 13.sp,
                                            color = Color(0xFF111827)
                                        )
                                    }
                                    Spacer(modifier = Modifier.height(10.dp))
                                    Text(
                                        text = chapter.formulaHighlight,
                                        fontFamily = AcademicSerifFamily,
                                        fontWeight = FontWeight.Normal,
                                        fontSize = (15.sp * textSizeScale),
                                        lineHeight = (22.sp * textSizeScale),
                                        color = DeepIndigo
                                    )
                                }
                            }

                            Spacer(modifier = Modifier.height(16.dp))

                            if (completionBannerShown) {
                                Surface(
                                    color = SuccessGreen.copy(alpha = 0.12f),
                                    shape = RoundedCornerShape(14.dp),
                                    border = BorderStroke(1.dp, SuccessGreen.copy(alpha = 0.5f)),
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(vertical = 6.dp)
                                ) {
                                    Row(
                                        modifier = Modifier.padding(14.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.CheckCircle,
                                            contentDescription = null,
                                            tint = SuccessGreen
                                        )
                                        Spacer(modifier = Modifier.width(10.dp))
                                        Text(
                                            text = "Chapter progress saved! +25 XP added to ${chapter.subject} mastery.",
                                            fontFamily = InterFontFamily,
                                            fontWeight = FontWeight.Normal,
                                            fontSize = 12.sp,
                                            color = Color(0xFF047857)
                                        )
                                    }
                                }
                            }

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(12.dp)
                            ) {
                                Button(
                                    onClick = {
                                        onMarkCompleted(false)
                                        completionBannerShown = true
                                    },
                                    shape = RoundedCornerShape(14.dp),
                                    colors = ButtonDefaults.buttonColors(containerColor = SuccessGreen),
                                    modifier = Modifier
                                        .weight(1f)
                                        .height(48.dp)
                                        .testTag("complete_lesson_button")
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.CheckCircle,
                                        contentDescription = null,
                                        modifier = Modifier.size(16.dp)
                                    )
                                    Spacer(modifier = Modifier.width(6.dp))
                                    Text(
                                        text = "Mark Revised",
                                        fontFamily = InterFontFamily,
                                        fontWeight = FontWeight.Normal,
                                        fontSize = 12.5.sp,
                                        maxLines = 1,
                                        softWrap = false
                                    )
                                }

                                Button(
                                    onClick = onPracticeChapterQuestions,
                                    shape = RoundedCornerShape(14.dp),
                                    colors = ButtonDefaults.buttonColors(containerColor = accent),
                                    modifier = Modifier
                                        .weight(1f)
                                        .height(48.dp)
                                        .testTag("practice_chapter_questions_button")
                                ) {
                                    Text(
                                        text = "Practice (${chapter.practiceQuestionCount} Qs)",
                                        fontFamily = InterFontFamily,
                                        fontWeight = FontWeight.Normal,
                                        fontSize = 12.5.sp,
                                        maxLines = 1,
                                        softWrap = false
                                    )
                                    Spacer(modifier = Modifier.width(6.dp))
                                    Icon(
                                        imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                                        contentDescription = null,
                                        modifier = Modifier.size(15.dp)
                                    )
                                }
                            }
                            }
                        }
                    }
                }

                // ==================== TAB 2: "Video" — INTERACTIVE LECTURE PLAYER ====================
                if (selectedTab == "Video") {
                    item {
                        Card(
                            shape = RoundedCornerShape(22.dp),
                            colors = CardDefaults.cardColors(containerColor = DeepIndigo),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 18.dp)
                        ) {
                            Column(modifier = Modifier.padding(16.dp)) {
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(196.dp)
                                        .clip(RoundedCornerShape(16.dp))
                                        .background(
                                            Brush.linearGradient(
                                                colors = listOf(Color(0xFF0F172A), DeepIndigo, accent)
                                            )
                                        )
                                ) {
                                    Canvas(modifier = Modifier.fillMaxSize()) {
                                        val path = Path()
                                        val midY = size.height * 0.55f
                                        val amp = size.height * 0.22f
                                        val phase = playbackProgress * 18f
                                        path.moveTo(0f, midY)
                                        var x = 0f
                                        while (x <= size.width) {
                                            val y = midY + amp * sin((x / size.width) * 10f + phase)
                                            path.lineTo(x, y)
                                            x += 8f
                                        }
                                        drawPath(
                                            path = path,
                                            color = AccentYellow.copy(alpha = 0.75f),
                                            style = Stroke(width = 4f)
                                        )
                                    }

                                    Column(
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .padding(16.dp),
                                        verticalArrangement = Arrangement.SpaceBetween
                                    ) {
                                        Row(
                                            modifier = Modifier.fillMaxWidth(),
                                            horizontalArrangement = Arrangement.SpaceBetween
                                        ) {
                                            Surface(
                                                color = Color.White.copy(alpha = 0.2f),
                                                shape = RoundedCornerShape(6.dp)
                                            ) {
                                                Text(
                                                    text = "HD LECTURE • ${chapter.videoInstructor}",
                                                    fontFamily = InterFontFamily,
                                                    fontWeight = FontWeight.Normal,
                                                    fontSize = 10.sp,
                                                    color = Color.White,
                                                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                                                )
                                            }
                                            Surface(
                                                onClick = {
                                                    playbackSpeed = when (playbackSpeed) {
                                                        "1.0x" -> "1.25x"
                                                        "1.25x" -> "1.5x"
                                                        "1.5x" -> "2.0x"
                                                        else -> "1.0x"
                                                    }
                                                },
                                                color = AccentYellow,
                                                shape = RoundedCornerShape(6.dp)
                                            ) {
                                                Text(
                                                    text = playbackSpeed,
                                                    fontFamily = InterFontFamily,
                                                    fontWeight = FontWeight.Normal,
                                                    fontSize = 10.5.sp,
                                                    color = PrimaryText,
                                                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                                                )
                                            }
                                        }

                                        Text(
                                            text = chapter.formulaHighlight,
                                            fontFamily = AcademicSerifFamily,
                                            fontWeight = FontWeight.Normal,
                                            fontSize = 15.sp,
                                            color = Color.White
                                        )
                                    }
                                }

                                Spacer(modifier = Modifier.height(12.dp))

                                Text(
                                    text = chapter.videoTitle,
                                    fontFamily = OutfitDisplayFamily,
                                    fontWeight = FontWeight.Medium,
                                    fontSize = 15.5.sp,
                                    color = Color.White
                                )
                                Spacer(modifier = Modifier.height(4.dp))
                                Text(
                                    text = chapter.videoKeyTakeaways,
                                    fontFamily = InterFontFamily,
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 12.sp,
                                    color = Color.White.copy(alpha = 0.82f)
                                )

                                Spacer(modifier = Modifier.height(8.dp))

                                Slider(
                                    value = playbackProgress,
                                    onValueChange = { playbackProgress = it },
                                    modifier = Modifier.fillMaxWidth()
                                )

                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Button(
                                        onClick = { isPlaying = !isPlaying },
                                        shape = RoundedCornerShape(50),
                                        colors = ButtonDefaults.buttonColors(
                                            containerColor = Color.White,
                                            contentColor = DeepIndigo
                                        )
                                    ) {
                                        Icon(
                                            imageVector = if (isPlaying) Icons.Default.Pause else Icons.Default.PlayArrow,
                                            contentDescription = null
                                        )
                                        Spacer(modifier = Modifier.width(6.dp))
                                        Text(if (isPlaying) "Pause Lecture" else "Play Lecture")
                                    }

                                    OutlinedButton(
                                        onClick = {
                                            playbackProgress = 1f
                                            isPlaying = false
                                            onMarkCompleted(true)
                                            completionBannerShown = true
                                        },
                                        shape = RoundedCornerShape(50),
                                        border = BorderStroke(1.dp, AccentYellow),
                                        colors = ButtonDefaults.outlinedButtonColors(contentColor = AccentYellow)
                                    ) {
                                        Text("Mark Watched ✓")
                                    }
                                }
                            }
                        }
                        Spacer(modifier = Modifier.height(18.dp))
                    }
                }

                // ==================== TAB 3: "Notes" — MASTER FORMULA & REVISION SHEET ====================
                if (selectedTab == "Notes") {
                    item {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 20.dp, vertical = 8.dp),
                            verticalArrangement = Arrangement.spacedBy(14.dp)
                        ) {
                            // Master Formula Sheet Header Card
                            Surface(
                                shape = RoundedCornerShape(16.dp),
                                color = Color.White,
                                border = BorderStroke(1.dp, Color(0xFFE5E7EB)),
                                shadowElevation = 1.dp,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Column(modifier = Modifier.padding(18.dp)) {
                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                                    ) {
                                        Surface(
                                            shape = RoundedCornerShape(6.dp),
                                            color = Color(0xFFEEF2FF)
                                        ) {
                                            Text(
                                                text = "MASTER FORMULA SHEET",
                                                fontFamily = InterFontFamily,
                                                fontWeight = FontWeight.Bold,
                                                fontSize = 10.sp,
                                                letterSpacing = 0.5.sp,
                                                color = Color(0xFF3569F6),
                                                modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
                                            )
                                        }
                                    }

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Text(
                                        text = "Core Exam Relations • ${chapter.title}",
                                        fontFamily = OutfitDisplayFamily,
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 18.sp,
                                        color = Color(0xFF171A23)
                                    )

                                    Spacer(modifier = Modifier.height(10.dp))

                                    Surface(
                                        shape = RoundedCornerShape(12.dp),
                                        color = Color(0xFFF8FAFC),
                                        border = BorderStroke(1.dp, Color(0xFFE2E8F0)),
                                        modifier = Modifier.fillMaxWidth()
                                    ) {
                                        Column(modifier = Modifier.padding(14.dp)) {
                                            Text(
                                                text = chapter.formulaHighlight,
                                                fontFamily = AcademicSerifFamily,
                                                fontWeight = FontWeight.SemiBold,
                                                fontSize = 16.sp,
                                                lineHeight = 25.sp,
                                                color = Color(0xFF1E3A8A)
                                            )

                                            Spacer(modifier = Modifier.height(12.dp))

                                            Row(
                                                modifier = Modifier.fillMaxWidth(),
                                                horizontalArrangement = Arrangement.End
                                            ) {
                                                Surface(
                                                    onClick = {
                                                        clipboardManager.setText(AnnotatedString(chapter.formulaHighlight))
                                                        Toast.makeText(context, "Formulas copied to clipboard", Toast.LENGTH_SHORT).show()
                                                    },
                                                    shape = RoundedCornerShape(50),
                                                    color = Color.White,
                                                    border = BorderStroke(1.dp, Color(0xFFCBD5E1))
                                                ) {
                                                    Row(
                                                        modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp),
                                                        verticalAlignment = Alignment.CenterVertically,
                                                        horizontalArrangement = Arrangement.spacedBy(5.dp)
                                                    ) {
                                                        Icon(
                                                            imageVector = Icons.Default.ContentCopy,
                                                            contentDescription = "Copy all formulas",
                                                            tint = Color(0xFF475569),
                                                            modifier = Modifier.size(14.dp)
                                                        )
                                                        Text(
                                                            text = "Copy Formulas",
                                                            fontFamily = InterFontFamily,
                                                            fontWeight = FontWeight.Medium,
                                                            fontSize = 12.sp,
                                                            color = Color(0xFF334155)
                                                        )
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }

                            // Key Concepts Revision Points
                            Surface(
                                shape = RoundedCornerShape(16.dp),
                                color = Color.White,
                                border = BorderStroke(1.dp, Color(0xFFE5E7EB)),
                                shadowElevation = 1.dp,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Column(modifier = Modifier.padding(18.dp)) {
                                    Text(
                                        text = "Key Conceptual Takeaways",
                                        fontFamily = OutfitDisplayFamily,
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 16.5.sp,
                                        color = Color(0xFF171A23)
                                    )

                                    Spacer(modifier = Modifier.height(12.dp))

                                    keyConceptBullets.forEachIndexed { bulletIdx, bulletText ->
                                        Row(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(vertical = 5.dp),
                                            verticalAlignment = Alignment.Top,
                                            horizontalArrangement = Arrangement.spacedBy(10.dp)
                                        ) {
                                            Surface(
                                                shape = CircleShape,
                                                color = Color(0xFFEEF2FF),
                                                modifier = Modifier.size(20.dp).padding(top = 2.dp)
                                            ) {
                                                Box(contentAlignment = Alignment.Center) {
                                                    Text(
                                                        text = "${bulletIdx + 1}",
                                                        fontFamily = InterFontFamily,
                                                        fontWeight = FontWeight.Bold,
                                                        fontSize = 10.sp,
                                                        color = Color(0xFF3569F6)
                                                    )
                                                }
                                            }

                                            Text(
                                                text = noteAnnotated(bulletText),
                                                fontFamily = AcademicSerifFamily,
                                                fontWeight = FontWeight.Normal,
                                                fontSize = 15.sp,
                                                lineHeight = 23.sp,
                                                color = Color(0xFF1E293B),
                                                modifier = Modifier.weight(1f)
                                            )
                                        }
                                    }
                                }
                            }

                            // Section-by-Section Quick Reference Cards
                            parsedNoteSections.forEachIndexed { sIdx, (rawHeading, lines) ->
                                val badge = formatSectionBadge(chapter.chapterNumber, sIdx, rawHeading)
                                val sTitle = cleanSectionTitle(rawHeading)
                                val formulasInSec = lines.filter { it.startsWith("✔") }
                                val takeawaysInSec = lines.filter { it.startsWith("★") }

                                if (formulasInSec.isNotEmpty() || takeawaysInSec.isNotEmpty()) {
                                    Surface(
                                        shape = RoundedCornerShape(14.dp),
                                        color = Color.White,
                                        border = BorderStroke(1.dp, Color(0xFFE5E7EB)),
                                        modifier = Modifier.fillMaxWidth()
                                    ) {
                                        Column(modifier = Modifier.padding(14.dp)) {
                                            Row(
                                                verticalAlignment = Alignment.CenterVertically,
                                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                                            ) {
                                                if (badge != null) {
                                                    Surface(
                                                        shape = RoundedCornerShape(4.dp),
                                                        color = Color(0xFF168A9B)
                                                    ) {
                                                        Text(
                                                            text = badge,
                                                            fontFamily = InterFontFamily,
                                                            fontWeight = FontWeight.Bold,
                                                            fontSize = 11.sp,
                                                            color = Color.White,
                                                            modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                                                        )
                                                    }
                                                }
                                                Text(
                                                    text = sTitle,
                                                    fontFamily = OutfitDisplayFamily,
                                                    fontWeight = FontWeight.SemiBold,
                                                    fontSize = 14.5.sp,
                                                    color = Color(0xFF171A23)
                                                )
                                            }

                                            Spacer(modifier = Modifier.height(8.dp))

                                            formulasInSec.forEach { fLine ->
                                                val cleanF = fLine.removePrefix("✔ KEY FORMULA —").removePrefix("✔ KEY FORMULA -").removePrefix("✔ KEY FORMULA").removePrefix("✔").trim()
                                                Surface(
                                                    shape = RoundedCornerShape(8.dp),
                                                    color = Color(0xFFF8FAFC),
                                                    border = BorderStroke(1.dp, Color(0xFFEEF2F6)),
                                                    modifier = Modifier.fillMaxWidth().padding(vertical = 3.dp)
                                                ) {
                                                    Text(
                                                        text = cleanF,
                                                        fontFamily = AcademicSerifFamily,
                                                        fontWeight = FontWeight.SemiBold,
                                                        fontSize = 14.sp,
                                                        color = Color(0xFF1E3A8A),
                                                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
                                                    )
                                                }
                                            }

                                            takeawaysInSec.forEach { tLine ->
                                                val cleanT = tLine.removePrefix("★ HIGHLIGHT —").removePrefix("★ HIGHLIGHT -").removePrefix("★ HIGHLIGHT").removePrefix("★").trim()
                                                Text(
                                                    text = "• $cleanT",
                                                    fontFamily = AcademicSerifFamily,
                                                    fontSize = 13.5.sp,
                                                    lineHeight = 20.sp,
                                                    color = Color(0xFF475569),
                                                    modifier = Modifier.padding(vertical = 2.dp)
                                                )
                                            }
                                        }
                                    }
                                }
                            }

                            Spacer(modifier = Modifier.height(18.dp))
                        }
                    }
                }

                // ==================== TAB 4: "IMP Qs" — IMPORTANT IISER IAT QUESTIONS ====================
                if (selectedTab == "IMP Qs") {
                    item {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 18.dp),
                            verticalArrangement = Arrangement.spacedBy(12.dp)
                        ) {
                            Surface(
                                shape = RoundedCornerShape(16.dp),
                                color = Color.White,
                                border = BorderStroke(1.dp, Color(0xFFE5E7EB)),
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Column(modifier = Modifier.padding(16.dp)) {
                                    Text(
                                        text = "High-Yield IISER IAT Questions • ${chapter.title}",
                                        fontFamily = OutfitDisplayFamily,
                                        fontWeight = FontWeight.SemiBold,
                                        fontSize = 16.sp,
                                        color = Color(0xFF111827)
                                    )
                                    Spacer(modifier = Modifier.height(4.dp))
                                    Text(
                                        text = "Curated conceptual & analytical problems (+4 / -1 marking) directly mapped to this chapter.",
                                        fontFamily = InterFontFamily,
                                        fontWeight = FontWeight.Normal,
                                        fontSize = 12.5.sp,
                                        color = Color(0xFF6B7280)
                                    )
                                }
                            }

                            if (chapterQuestions.isNotEmpty()) {
                                chapterQuestions.take(6).forEachIndexed { idx, q ->
                                    var revealed by remember(q.id) { mutableStateOf(false) }
                                    var chosenOpt by remember(q.id) { mutableStateOf<Int?>(null) }

                                    Surface(
                                        shape = RoundedCornerShape(16.dp),
                                        color = Color.White,
                                        border = BorderStroke(1.dp, Color(0xFFE5E7EB)),
                                        modifier = Modifier.fillMaxWidth()
                                    ) {
                                        Column(modifier = Modifier.padding(16.dp)) {
                                            Row(
                                                modifier = Modifier.fillMaxWidth(),
                                                horizontalArrangement = Arrangement.SpaceBetween
                                            ) {
                                                Text(
                                                    text = "IMP Q${idx + 1} • ${q.examSource} ${q.examYear ?: ""}",
                                                    fontFamily = JetBrainsMonoFamily,
                                                    fontWeight = FontWeight.Medium,
                                                    fontSize = 11.sp,
                                                    color = accent
                                                )
                                                Text(
                                                    text = q.difficulty,
                                                    fontFamily = InterFontFamily,
                                                    fontWeight = FontWeight.Medium,
                                                    fontSize = 11.sp,
                                                    color = Color(0xFF6B7280)
                                                )
                                            }
                                            Spacer(modifier = Modifier.height(8.dp))
                                            Text(
                                                text = q.prompt,
                                                fontFamily = InterFontFamily,
                                                fontWeight = FontWeight.Medium,
                                                fontSize = 14.sp,
                                                lineHeight = 20.5.sp,
                                                color = Color(0xFF111827)
                                            )
                                            Spacer(modifier = Modifier.height(10.dp))
                                            val optLetters = listOf("A", "B", "C", "D")
                                            q.options.forEachIndexed { optIdx, optText ->
                                                val isPicked = chosenOpt == optIdx
                                                val isRight = optIdx == q.correctOptionIndex
                                                val rowBg = when {
                                                    revealed && isRight -> SuccessGreen.copy(alpha = 0.12f)
                                                    revealed && isPicked && !isRight -> WarningCoral.copy(alpha = 0.12f)
                                                    isPicked -> Color(0xFFEEF2FF)
                                                    else -> Color(0xFFF9FAFB)
                                                }
                                                val rowBorder = when {
                                                    revealed && isRight -> SuccessGreen
                                                    revealed && isPicked && !isRight -> WarningCoral
                                                    isPicked -> PrimaryBlue
                                                    else -> Color(0xFFE5E7EB)
                                                }
                                                Surface(
                                                    onClick = {
                                                        chosenOpt = optIdx
                                                        revealed = true
                                                    },
                                                    shape = RoundedCornerShape(10.dp),
                                                    color = rowBg,
                                                    border = BorderStroke(1.dp, rowBorder),
                                                    modifier = Modifier
                                                        .fillMaxWidth()
                                                        .padding(vertical = 3.dp)
                                                ) {
                                                    Text(
                                                        text = "${optLetters.getOrElse(optIdx) { "" }}. $optText",
                                                        fontFamily = InterFontFamily,
                                                        fontWeight = FontWeight.Normal,
                                                        fontSize = 13.sp,
                                                        color = Color(0xFF1F2937),
                                                        modifier = Modifier.padding(horizontal = 12.dp, vertical = 9.dp)
                                                    )
                                                }
                                            }
                                            if (revealed) {
                                                Spacer(modifier = Modifier.height(8.dp))
                                                Surface(
                                                    shape = RoundedCornerShape(10.dp),
                                                    color = Color(0xFFF3F6FF),
                                                    modifier = Modifier.fillMaxWidth()
                                                ) {
                                                    Text(
                                                        text = "Solution: ${q.stepByStepExplanation}",
                                                        fontFamily = InterFontFamily,
                                                        fontWeight = FontWeight.Normal,
                                                        fontSize = 12.5.sp,
                                                        lineHeight = 18.5.sp,
                                                        color = Color(0xFF1E293B),
                                                        modifier = Modifier.padding(12.dp)
                                                    )
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            Spacer(modifier = Modifier.height(12.dp))
                        }
                    }
                }
            }
        }

        // ==================== FLOATING READING CONTROLS (Screenshots 1, 2, 3) ====================
        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .padding(start = 22.dp, end = 22.dp, bottom = 22.dp)
                .imePadding()
        ) {
            // Ambient blue glow behind Ask AI pill matching reference screenshot
            Box(
                modifier = Modifier
                    .align(Alignment.Center)
                    .padding(top = 18.dp)
                    .size(width = 110.dp, height = 30.dp)
                    .background(
                        Brush.radialGradient(
                            colors = listOf(Color(0x554269E8), Color.Transparent)
                        ),
                        shape = CircleShape
                    )
            )

            // Centered "Ask AI" Pill Control with blue waveform icon
            Surface(
                onClick = {
                    aiPromptMode = "explain"
                    showTalkToAiSheet = true
                },
                shape = RoundedCornerShape(50),
                color = Color.White,
                shadowElevation = 5.dp,
                border = BorderStroke(1.dp, Color(0xFFE5E7EB)),
                modifier = Modifier
                    .align(Alignment.Center)
                    .height(46.dp)
                    .testTag("reader_talk_to_ai_button")
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 20.dp, vertical = 11.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(9.dp)
                ) {
                    WaveformIcon(color = Color(0xFF4269E8), modifier = Modifier.size(17.dp))
                    Text(
                        text = "Ask AI",
                        fontFamily = InterFontFamily,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                        color = Color(0xFF171A23)
                    )
                }
            }

            // Bottom-right Circular Topics / Outline Button
            Surface(
                onClick = { showTopicsSheet = true },
                shape = CircleShape,
                color = Color.White,
                shadowElevation = 5.dp,
                border = BorderStroke(1.dp, Color(0xFFE5E7EB)),
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .size(46.dp)
                    .testTag("reader_topics_button")
            ) {
                Box(contentAlignment = Alignment.Center) {
                    TopicsOutlineIcon(color = Color(0xFF171A23), modifier = Modifier.size(20.dp))
                }
            }
        }

        // Diagram Zoom Lightbox Modal
        if (zoomFigureKey != null) {
            DiagramZoomDialog(
                figKey = zoomFigureKey!!,
                onDismiss = { zoomFigureKey = null }
            )
        }

        // ==================== TOPICS BOTTOM SHEET MODAL (Screenshot 4) ====================
        if (showTopicsSheet) {
            Surface(
                color = Color.Black.copy(alpha = 0.45f),
                modifier = Modifier
                    .fillMaxSize()
                    .zIndex(100f)
                    .testTag("topics_bottom_sheet_modal")
                    .clickable { showTopicsSheet = false }
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 90.dp),
                    contentAlignment = Alignment.BottomCenter
                ) {
                    Surface(
                        shape = RoundedCornerShape(topStart = 26.dp, topEnd = 26.dp),
                        color = Color.White,
                        shadowElevation = 20.dp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable(enabled = false) {}
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 20.dp, vertical = 20.dp)
                        ) {
                            // Header: "Topics" title + Circular ✕ Close Button
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text(
                                    text = "Topics",
                                    fontFamily = OutfitDisplayFamily,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 20.sp,
                                    color = Color(0xFF171A23)
                                )

                                Surface(
                                    onClick = { showTopicsSheet = false },
                                    shape = CircleShape,
                                    color = Color(0xFFF1F5F9),
                                    border = BorderStroke(1.dp, Color(0xFFE5E7EB)),
                                    modifier = Modifier.size(36.dp)
                                ) {
                                    Box(contentAlignment = Alignment.Center) {
                                        Icon(
                                            imageVector = Icons.Default.Close,
                                            contentDescription = "Close",
                                            tint = Color(0xFF171A23),
                                            modifier = Modifier.size(18.dp)
                                        )
                                    }
                                }
                            }

                            Spacer(modifier = Modifier.height(16.dp))

                            // Scrollable list of topics exactly matching Screenshot 4
                            LazyColumn(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .weight(1f, fill = false),
                                verticalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                itemsIndexed(parsedNoteSections) { topicIdx, (rawHeading, _) ->
                                    val isSelected = topicIdx == currentSectionIndex
                                    val fullTopicTitle = sectionTopicsSheetTitle(chapter.chapterNumber, topicIdx, rawHeading)

                                    Surface(
                                        onClick = {
                                            currentSectionIndex = topicIdx
                                            selectedTab = "Read"
                                            showTopicsSheet = false
                                        },
                                        shape = RoundedCornerShape(16.dp),
                                        color = if (isSelected) Color(0xFFEEF5FF) else Color(0xFFF3F4F6),
                                        border = if (isSelected) BorderStroke(1.5.dp, Color(0xFF4269E8)) else null,
                                        modifier = Modifier.fillMaxWidth()
                                    ) {
                                        Row(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(horizontal = 16.dp, vertical = 14.dp),
                                            verticalAlignment = Alignment.CenterVertically,
                                            horizontalArrangement = Arrangement.spacedBy(14.dp)
                                        ) {
                                            // Sequence index on left: 1, 2, 3, 4, 5
                                            Text(
                                                text = "${topicIdx + 1}",
                                                fontFamily = InterFontFamily,
                                                fontWeight = FontWeight.Normal,
                                                fontSize = 13.sp,
                                                color = if (isSelected) Color(0xFF4269E8) else Color(0xFF747982),
                                                modifier = Modifier.width(22.dp)
                                            )

                                            // Full Section Title
                                            Text(
                                                text = fullTopicTitle,
                                                fontFamily = InterFontFamily,
                                                fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                                                fontSize = 14.sp,
                                                lineHeight = 20.sp,
                                                color = Color(0xFF171A23),
                                                modifier = Modifier.weight(1f)
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        // Interactive "Talk to AI" Concept Tutor Sheet
        if (showTalkToAiSheet) {
            Surface(
                color = Color.Black.copy(alpha = 0.5f),
                modifier = Modifier
                    .fillMaxSize()
                    .zIndex(100f)
                    .testTag("talk_to_ai_modal")
                    .clickable { showTalkToAiSheet = false }
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    contentAlignment = Alignment.BottomCenter
                ) {
                    Surface(
                        shape = RoundedCornerShape(26.dp),
                        color = Color.White,
                        shadowElevation = 18.dp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable(enabled = false) {}
                    ) {
                        Column(modifier = Modifier.padding(20.dp)) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                                ) {
                                    Surface(
                                        shape = CircleShape,
                                        color = Color(0xFFEEF2FF),
                                        modifier = Modifier.size(34.dp)
                                    ) {
                                        Box(contentAlignment = Alignment.Center) {
                                            Icon(
                                                imageVector = Icons.Default.AutoAwesome,
                                                contentDescription = null,
                                                tint = Color(0xFF4269E8),
                                                modifier = Modifier.size(17.dp)
                                            )
                                        }
                                    }
                                    Column {
                                        Text(
                                            text = "IISER SmartPrep AI Tutor",
                                            fontFamily = OutfitDisplayFamily,
                                            fontWeight = FontWeight.Bold,
                                            fontSize = 15.sp,
                                            color = Color(0xFF0F172A)
                                        )
                                        Text(
                                            text = "Exam-focused intuition & derivations for ${chapter.title}",
                                            fontFamily = InterFontFamily,
                                            fontWeight = FontWeight.Normal,
                                            fontSize = 11.5.sp,
                                            color = Color(0xFF64748B)
                                        )
                                    }
                                }
                                IconButton(onClick = { showTalkToAiSheet = false }) {
                                    Icon(
                                        imageVector = Icons.Default.Cancel,
                                        contentDescription = "Close AI Tutor",
                                        tint = Color(0xFF94A3B8)
                                    )
                                }
                            }

                            Spacer(modifier = Modifier.height(14.dp))

                            // Quick Concept Prompts Row
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                val quickPrompts = listOf(
                                    "Explain Simply",
                                    "Exam Traps",
                                    "Derive Relations"
                                )
                                quickPrompts.forEach { label ->
                                    Surface(
                                        onClick = {
                                            activeAiExplanation = when (label) {
                                                "Explain Simply" ->
                                                    "In ${chapter.title}:\n${chapter.keyConceptsSummary}"
                                                "Exam Traps" ->
                                                    "Common traps in ${chapter.title}:\nAlways check units, signs, and conditions of applicability in equations.\nFormula: ${chapter.formulaHighlight.lines().firstOrNull() ?: ""}"
                                                else ->
                                                    "Core Derivations & Relations in ${chapter.title}:\n${chapter.formulaHighlight}"
                                            }
                                        },
                                        shape = RoundedCornerShape(50),
                                        color = Color(0xFFF1F5F9),
                                        border = BorderStroke(1.dp, Color(0xFFE2E8F0))
                                    ) {
                                        Text(
                                            text = label,
                                            fontFamily = InterFontFamily,
                                            fontWeight = FontWeight.Medium,
                                            fontSize = 11.5.sp,
                                            color = Color(0xFF334155),
                                            modifier = Modifier.padding(horizontal = 11.dp, vertical = 6.dp)
                                        )
                                    }
                                }
                            }

                            Spacer(modifier = Modifier.height(12.dp))

                            Surface(
                                shape = RoundedCornerShape(14.dp),
                                color = Color(0xFFF8FAFC),
                                border = BorderStroke(1.dp, Color(0xFFE2E8F0)),
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Text(
                                    text = activeAiExplanation,
                                    fontFamily = InterFontFamily,
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 13.sp,
                                    lineHeight = 20.sp,
                                    color = Color(0xFF1E293B),
                                    modifier = Modifier.padding(14.dp)
                                )
                            }

                            Spacer(modifier = Modifier.height(12.dp))

                            OutlinedTextField(
                                value = customAiQuestion,
                                onValueChange = { customAiQuestion = it },
                                placeholder = {
                                    Text(
                                        "Ask a specific question on this chapter...",
                                        fontSize = 12.5.sp,
                                        color = Color(0xFF94A3B8)
                                    )
                                },
                                singleLine = true,
                                shape = RoundedCornerShape(14.dp),
                                modifier = Modifier.fillMaxWidth()
                            )

                            Spacer(modifier = Modifier.height(12.dp))

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(10.dp)
                            ) {
                                Button(
                                    onClick = {
                                        if (customAiQuestion.isNotBlank()) {
                                            activeAiExplanation =
                                                "Concept Clarification for \"${customAiQuestion.trim()}\":\n\n" +
                                                    "In ${chapter.title}, remember that ${keyConceptBullets.firstOrNull() ?: "the core principles determine the formulas"}. " +
                                                    "Master relation: ${chapter.formulaHighlight.lines().firstOrNull() ?: ""}"
                                            customAiQuestion = ""
                                        } else {
                                            showTalkToAiSheet = false
                                        }
                                    },
                                    shape = RoundedCornerShape(50),
                                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4269E8)),
                                    modifier = Modifier.weight(1f)
                                ) {
                                    Text(
                                        text = if (customAiQuestion.isNotBlank()) "Ask AI Tutor" else "Got It",
                                        fontFamily = InterFontFamily,
                                        fontWeight = FontWeight.SemiBold
                                    )
                                }

                                OutlinedButton(
                                    onClick = {
                                        showTalkToAiSheet = false
                                        onOpenAiTutor()
                                    },
                                    shape = RoundedCornerShape(50),
                                    border = BorderStroke(1.dp, Color(0xFFCBD5E1)),
                                    modifier = Modifier.weight(1f)
                                ) {
                                    Text(
                                        text = "Full Snap & Solve",
                                        fontFamily = InterFontFamily,
                                        fontWeight = FontWeight.Medium,
                                        color = Color(0xFF334155)
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}


// ==================== 2. INTERACTIVE QUESTION & PYQ SESSION OVERLAY ====================

@Composable

fun QuestionSessionOverlay(

    title: String,

    subtitle: String,

    questions: List<QuestionEntity>,

    isTimed: Boolean,

    onBack: () -> Unit,

    onSubmitAnswer: (QuestionEntity, Int) -> Unit,

    onToggleBookmark: (QuestionEntity) -> Unit

) {

    BackHandler(onBack = onBack)



    var currentIndex by remember { mutableIntStateOf(0) }

    var selectedOption by remember(currentIndex) {

        mutableStateOf(questions.getOrNull(currentIndex)?.userSelectedOption)

    }

    var isAnswerSubmitted by remember(currentIndex) {

        mutableStateOf(questions.getOrNull(currentIndex)?.isAttempted == true)

    }

    var remainingSeconds by remember { mutableIntStateOf(questions.size * 120) }



    LaunchedEffect(isTimed) {

        while (isTimed && remainingSeconds > 0) {

            delay(1_000L)

            remainingSeconds--

        }

    }



    val currentQuestion = questions.getOrNull(currentIndex)

    if (currentQuestion == null) {

        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

            Button(onClick = onBack) { Text("Return to Dashboard") }

        }

        return

    }



    LazyColumn(

        modifier = Modifier

            .fillMaxSize()

            .background(MaterialTheme.colorScheme.background)

            .windowInsetsPadding(WindowInsets.statusBars)

            .windowInsetsPadding(WindowInsets.navigationBars)

            .testTag("question_session_overlay"),

        contentPadding = PaddingValues(bottom = 36.dp)

    ) {

        item {

            // Header

            Row(

                modifier = Modifier

                    .fillMaxWidth()

                    .padding(horizontal = 12.dp, vertical = 10.dp),

                verticalAlignment = Alignment.CenterVertically,

                horizontalArrangement = Arrangement.SpaceBetween

            ) {

                Row(

                    verticalAlignment = Alignment.CenterVertically,

                    modifier = Modifier.weight(1f)

                ) {

                    IconButton(

                        onClick = onBack,

                        modifier = Modifier.testTag("question_session_back_button")

                    ) {

                        Icon(

                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,

                            contentDescription = "Back"

                        )

                    }

                    Column {

                        Text(

                            text = title,

                            style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold),

                            maxLines = 1

                        )

                        Text(

                            text = subtitle,

                            style = MaterialTheme.typography.labelSmall,

                            color = MaterialTheme.colorScheme.onSurfaceVariant

                        )

                    }

                }



                if (isTimed) {

                    Surface(

                        color = SoftLavender,

                        shape = RoundedCornerShape(50)

                    ) {

                        Row(

                            modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp),

                            verticalAlignment = Alignment.CenterVertically

                        ) {

                            Icon(

                                imageVector = Icons.Default.Timer,

                                contentDescription = null,

                                tint = DeepIndigo,

                                modifier = Modifier.size(16.dp)

                            )

                            Spacer(modifier = Modifier.width(4.dp))

                            val mins = remainingSeconds / 60

                            val secs = remainingSeconds % 60

                            Text(

                                text = "%02d:%02d".format(mins, secs),

                                fontFamily = JetBrainsMonoFamily,

                                fontWeight = FontWeight.SemiBold,

                                fontSize = 12.5.sp,

                                color = DeepIndigo

                            )

                        }

                    }

                }



                IconButton(onClick = { onToggleBookmark(currentQuestion) }) {

                    Icon(

                        imageVector = if (currentQuestion.isBookmarked) Icons.Default.Bookmark else Icons.Default.BookmarkBorder,

                        contentDescription = "Bookmark",

                        tint = if (currentQuestion.isBookmarked) PrimaryBlue else MaterialTheme.colorScheme.onSurfaceVariant

                    )

                }

            }



            // Question Number Pill Row

            LazyRow(

                contentPadding = PaddingValues(horizontal = 20.dp, vertical = 8.dp),

                horizontalArrangement = Arrangement.spacedBy(8.dp)

            ) {

                itemsIndexed(questions) { idx, q ->

                    val isCurrent = idx == currentIndex

                    Surface(

                        onClick = { currentIndex = idx },

                        shape = CircleShape,

                        color = when {

                            isCurrent -> PrimaryText

                            q.isCorrect -> SuccessGreen

                            q.isAttempted -> WarningCoral

                            else -> MaterialTheme.colorScheme.surface

                        },

                        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline),

                        modifier = Modifier.size(38.dp)

                    ) {

                        Box(contentAlignment = Alignment.Center) {

                            Text(

                                text = "${idx + 1}",

                                style = MaterialTheme.typography.labelMedium.copy(

                                    color = if (isCurrent || q.isAttempted) Color.White else MaterialTheme.colorScheme.onSurface,

                                    fontWeight = FontWeight.Bold

                                )

                            )

                        }

                    }

                }

            }



            // Question Card

            Card(

                shape = RoundedCornerShape(22.dp),

                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),

                border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline),

                modifier = Modifier

                    .fillMaxWidth()

                    .padding(horizontal = 20.dp, vertical = 8.dp)

            ) {

                Column(modifier = Modifier.padding(18.dp)) {

                    Row(

                        modifier = Modifier.fillMaxWidth(),

                        horizontalArrangement = Arrangement.SpaceBetween

                    ) {

                        Surface(

                            color = SoftLavender,

                            shape = RoundedCornerShape(6.dp)

                        ) {

                            Text(

                                text = if (currentQuestion.examYear != null) {

                                    "${currentQuestion.examSource} ${currentQuestion.examYear} PYQ"

                                } else {

                                    "${currentQuestion.examSource} • ${currentQuestion.difficulty}"

                                },

                                style = MaterialTheme.typography.labelSmall.copy(

                                    color = DeepIndigo,

                                    fontWeight = FontWeight.Bold

                                ),

                                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)

                            )

                        }

                        Text(

                            text = "+4 / -1 Marks",

                            style = MaterialTheme.typography.labelSmall.copy(

                                color = SuccessGreen,

                                fontWeight = FontWeight.Bold

                            )

                        )

                    }



                    Spacer(modifier = Modifier.height(12.dp))



                    Text(

                        text = currentQuestion.prompt,

                        style = MaterialTheme.typography.titleMedium.copy(

                            fontWeight = FontWeight.SemiBold,

                            lineHeight = 24.sp

                        )

                    )



                    Spacer(modifier = Modifier.height(16.dp))



                    // Options A, B, C, D

                    val optionLabels = listOf("A", "B", "C", "D")

                    currentQuestion.options.forEachIndexed { optIdx, optText ->

                        val isSelected = selectedOption == optIdx

                        val isCorrectOption = optIdx == currentQuestion.correctOptionIndex



                        val borderColor = when {

                            isAnswerSubmitted && isCorrectOption -> SuccessGreen

                            isAnswerSubmitted && isSelected && !isCorrectOption -> WarningCoral

                            isSelected -> PrimaryBlue

                            else -> MaterialTheme.colorScheme.outline

                        }

                        val bgColor = when {

                            isAnswerSubmitted && isCorrectOption -> SuccessGreen.copy(alpha = 0.12f)

                            isAnswerSubmitted && isSelected && !isCorrectOption -> WarningCoral.copy(alpha = 0.12f)

                            isSelected -> SoftLavender

                            else -> MaterialTheme.colorScheme.surface

                        }



                        Surface(

                            onClick = {

                                if (!isAnswerSubmitted) {

                                    selectedOption = optIdx

                                }

                            },

                            shape = RoundedCornerShape(14.dp),

                            color = bgColor,

                            border = BorderStroke(1.5.dp, borderColor),

                            modifier = Modifier

                                .fillMaxWidth()

                                .padding(vertical = 5.dp)

                                .testTag("question_option_$optIdx")

                        ) {

                            Row(

                                modifier = Modifier.padding(14.dp),

                                verticalAlignment = Alignment.CenterVertically

                            ) {

                                Box(

                                    modifier = Modifier

                                        .size(30.dp)

                                        .clip(CircleShape)

                                        .background(

                                            when {

                                                isAnswerSubmitted && isCorrectOption -> SuccessGreen

                                                isAnswerSubmitted && isSelected -> WarningCoral

                                                isSelected -> PrimaryBlue

                                                else -> MaterialTheme.colorScheme.surfaceVariant

                                            }

                                        ),

                                    contentAlignment = Alignment.Center

                                ) {

                                    Text(

                                        text = optionLabels[optIdx],

                                        style = MaterialTheme.typography.labelLarge.copy(

                                            color = if (isSelected || (isAnswerSubmitted && isCorrectOption)) {

                                                Color.White

                                            } else {

                                                MaterialTheme.colorScheme.onSurface

                                            },

                                            fontWeight = FontWeight.Bold

                                        )

                                    )

                                }

                                Spacer(modifier = Modifier.width(12.dp))

                                Text(

                                    text = optText,

                                    style = MaterialTheme.typography.bodyLarge,

                                    modifier = Modifier.weight(1f)

                                )

                            }

                        }

                    }



                    Spacer(modifier = Modifier.height(14.dp))



                    if (!isAnswerSubmitted) {

                        Button(

                            onClick = {

                                val chosen = selectedOption ?: return@Button

                                isAnswerSubmitted = true

                                onSubmitAnswer(currentQuestion, chosen)

                            },

                            enabled = selectedOption != null,

                            shape = RoundedCornerShape(14.dp),

                            colors = ButtonDefaults.buttonColors(containerColor = PrimaryBlue),

                            modifier = Modifier

                                .fillMaxWidth()

                                .height(48.dp)

                                .testTag("submit_answer_button")

                        ) {

                            Text("Submit & Verify Answer", fontWeight = FontWeight.Bold)

                        }

                    }

                }

            }



            // Step-by-Step Explanation Card (Shown after submission)

            if (isAnswerSubmitted) {

                val userGotItRight = selectedOption == currentQuestion.correctOptionIndex

                Card(

                    shape = RoundedCornerShape(20.dp),

                    colors = CardDefaults.cardColors(containerColor = SoftLavender),

                    border = BorderStroke(

                        1.5.dp,

                        if (userGotItRight) SuccessGreen else PrimaryBlue

                    ),

                    modifier = Modifier

                        .fillMaxWidth()

                        .padding(horizontal = 20.dp, vertical = 10.dp)

                        .testTag("answer_explanation_card")

                ) {

                    Column(modifier = Modifier.padding(18.dp)) {

                        Row(verticalAlignment = Alignment.CenterVertically) {

                            Icon(

                                imageVector = if (userGotItRight) Icons.Default.CheckCircle else Icons.Default.Cancel,

                                contentDescription = null,

                                tint = if (userGotItRight) SuccessGreen else WarningCoral

                            )

                            Spacer(modifier = Modifier.width(8.dp))

                            Text(

                                text = if (userGotItRight) {

                                    "Correct! (+15 XP Earned)"

                                } else {

                                    "Correct Option: ${listOf("A", "B", "C", "D")[currentQuestion.correctOptionIndex]}"

                                },

                                style = MaterialTheme.typography.titleMedium.copy(

                                    color = DeepIndigo,

                                    fontWeight = FontWeight.SemiBold

                                )

                            )

                        }

                        Spacer(modifier = Modifier.height(8.dp))

                        Text(

                            text = "STEP-BY-STEP ANALYTICAL SOLUTION",

                            fontFamily = JetBrainsMonoFamily,

                            fontWeight = FontWeight.Medium,

                            fontSize = 10.5.sp,

                            color = PrimaryBlue

                        )

                        Spacer(modifier = Modifier.height(4.dp))

                        Text(

                            text = currentQuestion.stepByStepExplanation,

                            style = MaterialTheme.typography.bodyMedium.copy(color = PrimaryText)

                        )

                    }

                }

            }



            // Previous / Next Question Navigation

            Row(

                modifier = Modifier

                    .fillMaxWidth()

                    .padding(horizontal = 20.dp, vertical = 8.dp),

                horizontalArrangement = Arrangement.spacedBy(12.dp)

            ) {

                OutlinedButton(

                    onClick = { if (currentIndex > 0) currentIndex-- },

                    enabled = currentIndex > 0,

                    shape = RoundedCornerShape(14.dp),

                    modifier = Modifier.weight(1f)

                ) {

                    Text("Previous")

                }

                Button(

                    onClick = {

                        if (currentIndex < questions.lastIndex) {

                            currentIndex++

                        } else {

                            onBack()

                        }

                    },

                    shape = RoundedCornerShape(14.dp),

                    colors = ButtonDefaults.buttonColors(containerColor = PrimaryText),

                    modifier = Modifier.weight(1f)

                ) {

                    Text(if (currentIndex < questions.lastIndex) "Next Question" else "Finish Session")

                }

            }

        }

    }

}



// ==================== 3. MOCK TEST RUNNER OVERLAY (OFFICIAL IISER IAT CBT SIMULATOR) ====================

@Composable

fun MockTestRunnerOverlay(

    mockTest: MockTestEntity,

    questions: List<QuestionEntity>,

    onBack: () -> Unit,

    onSubmitMockTest: (Int, Int, Int) -> Unit

) {

    BackHandler(onBack = onBack)



    var currentIndex by remember { mutableIntStateOf(0) }

    val selectedAnswers = remember { mutableStateMapOf<String, Int>() }

    val markedForReview = remember { mutableStateMapOf<String, Boolean>() }

    var isTestSubmitted by remember { mutableStateOf(false) }

    var elapsedSeconds by remember { mutableIntStateOf(0) }

    val totalSeconds = (mockTest.durationMinutes * 60).coerceAtLeast(60)



    LaunchedEffect(isTestSubmitted) {

        while (!isTestSubmitted && elapsedSeconds < totalSeconds) {

            delay(1_000L)

            elapsedSeconds++

        }

    }



    val currentQ = questions.getOrNull(currentIndex)

    val distinctSubjects = remember(questions) {

        questions.map { it.subject }.distinct()

    }



    val remaining = (totalSeconds - elapsedSeconds).coerceAtLeast(0)

    val isLowTime = remaining < 180 && !isTestSubmitted



    LazyColumn(

        modifier = Modifier

            .fillMaxSize()

            .background(Color(0xFFF7F7F5))

            .windowInsetsPadding(WindowInsets.statusBars)

            .windowInsetsPadding(WindowInsets.navigationBars)

            .testTag("mock_test_runner_overlay"),

        contentPadding = PaddingValues(bottom = 44.dp)

    ) {

        item {

            // 1. Unified 20.dp Top Bar: Circular Back Button + Title/Timer + Submit CTA

            Column(

                modifier = Modifier

                    .fillMaxWidth()

                    .padding(start = 20.dp, end = 20.dp, top = 10.dp, bottom = 10.dp)

            ) {

                Row(

                    modifier = Modifier.fillMaxWidth(),

                    verticalAlignment = Alignment.CenterVertically,

                    horizontalArrangement = Arrangement.SpaceBetween

                ) {

                    Row(

                        verticalAlignment = Alignment.CenterVertically,

                        modifier = Modifier.weight(1f)

                    ) {

                        Surface(

                            onClick = onBack,

                            shape = CircleShape,

                            color = Color(0xFFF3F4F6),

                            border = BorderStroke(1.dp, Color(0xFFDCDFE4)),

                            shadowElevation = 0.dp,

                            modifier = Modifier

                                .size(40.dp)

                                .testTag("mock_runner_back_button")

                        ) {

                            Box(contentAlignment = Alignment.Center) {

                                Icon(

                                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,

                                    contentDescription = "Exit Test",

                                    tint = Color(0xFF0F172A),

                                    modifier = Modifier.size(19.dp)

                                )

                            }

                        }



                        Spacer(modifier = Modifier.width(12.dp))



                        Column(modifier = Modifier.weight(1f)) {

                            Row(

                                verticalAlignment = Alignment.CenterVertically,

                                horizontalArrangement = Arrangement.spacedBy(6.dp)

                            ) {

                                Icon(

                                    imageVector = Icons.Default.Timer,

                                    contentDescription = null,

                                    tint = if (isLowTime) Color(0xFFDC2626) else PrimaryBlue,

                                    modifier = Modifier.size(13.dp)

                                )

                                Text(

                                    text = if (isTestSubmitted) {

                                        "COMPLETED • ${selectedAnswers.size}/${questions.size} ATTEMPTED"

                                    } else {

                                        "%02d:%02d LEFT • ${selectedAnswers.size}/${questions.size} ANSWERED".format(

                                            remaining / 60,

                                            remaining % 60

                                        )

                                    },

                                    fontFamily = JetBrainsMonoFamily,

                                    fontWeight = FontWeight.Medium,

                                    fontSize = 10.5.sp,

                                    color = if (isLowTime) Color(0xFFDC2626) else PrimaryBlue

                                )

                            }

                            Spacer(modifier = Modifier.height(2.dp))

                            Text(

                                text = mockTest.title,

                                fontFamily = OutfitDisplayFamily,

                                fontWeight = FontWeight.Bold,

                                fontSize = 16.5.sp,

                                letterSpacing = (-0.2).sp,

                                color = Color(0xFF0F172A),

                                maxLines = 1,

                                overflow = TextOverflow.Ellipsis

                            )

                        }

                    }



                    Spacer(modifier = Modifier.width(10.dp))



                    if (!isTestSubmitted) {

                        Button(

                            onClick = {

                                var score = 0

                                var correct = 0

                                questions.forEach { q ->

                                    val ans = selectedAnswers[q.id]

                                    if (ans != null) {

                                        if (ans == q.correctOptionIndex) {

                                            score += mockTest.positiveMarks

                                            correct++

                                        } else {

                                            score -= mockTest.negativeMarks

                                        }

                                    }

                                }

                                val accuracy = if (selectedAnswers.isNotEmpty()) {

                                    ((correct * 100f) / selectedAnswers.size).toInt()

                                } else 0

                                val minsTaken = (elapsedSeconds / 60).coerceAtLeast(1)

                                isTestSubmitted = true

                                onSubmitMockTest(score, accuracy, minsTaken)

                            },

                            shape = RoundedCornerShape(50),

                            colors = ButtonDefaults.buttonColors(

                                containerColor = Color(0xFF0F172A),

                                contentColor = Color.White

                            ),

                            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 9.dp),

                            modifier = Modifier.testTag("submit_mock_test_button")

                        ) {

                            Text(

                                text = "Submit Test",

                                fontFamily = InterFontFamily,

                                fontWeight = FontWeight.SemiBold,

                                fontSize = 13.sp

                            )

                        }

                    }

                }



                // 2. Subject Jump Pill Bar (when Mock Test covers multiple subjects)

                if (distinctSubjects.size > 1) {

                    Spacer(modifier = Modifier.height(12.dp))

                    Surface(

                        shape = RoundedCornerShape(50),

                        color = Color(0xFFF3F4F6),

                        border = BorderStroke(1.dp, Color(0xFFDCDFE4)),

                        modifier = Modifier.fillMaxWidth()

                    ) {

                        Row(

                            modifier = Modifier

                                .fillMaxWidth()

                                .padding(4.dp),

                            verticalAlignment = Alignment.CenterVertically

                        ) {

                            distinctSubjects.forEach { subj ->

                                val isCurrentSubj = currentQ?.subject.equals(subj, ignoreCase = true)

                                val shortLabel = when (subj.lowercase()) {

                                    "mathematics" -> "Maths"

                                    "chemistry" -> "Chem"

                                    else -> subj

                                }

                                Surface(

                                    onClick = {

                                        val firstIdx = questions.indexOfFirst {

                                            it.subject.equals(subj, ignoreCase = true)

                                        }

                                        if (firstIdx >= 0) currentIndex = firstIdx

                                    },

                                    shape = RoundedCornerShape(50),

                                    color = if (isCurrentSubj) Color(0xFFE2E5E9) else Color.Transparent,

                                    modifier = Modifier.weight(1f)

                                ) {

                                    Box(

                                        modifier = Modifier.padding(vertical = 8.dp),

                                        contentAlignment = Alignment.Center

                                    ) {

                                        Text(

                                            text = shortLabel,

                                            fontFamily = InterFontFamily,

                                            fontWeight = if (isCurrentSubj) FontWeight.SemiBold else FontWeight.Medium,

                                            fontSize = 13.sp,

                                            color = if (isCurrentSubj) Color(0xFF0F172A) else Color(0xFF525866),

                                            maxLines = 1

                                        )

                                    }

                                }

                            }

                        }

                    }

                }

            }



            // 3. Official Post-Submission Scorecard

            if (isTestSubmitted) {

                var totalScore = 0

                var correctCount = 0

                var wrongCount = 0

                questions.forEach { q ->

                    val ans = selectedAnswers[q.id]

                    if (ans != null) {

                        if (ans == q.correctOptionIndex) {

                            totalScore += mockTest.positiveMarks

                            correctCount++

                        } else {

                            totalScore -= mockTest.negativeMarks

                            wrongCount++

                        }

                    }

                }

                val skippedCount = questions.size - selectedAnswers.size

                val accuracyPct = if (selectedAnswers.isNotEmpty()) {

                    ((correctCount * 100f) / selectedAnswers.size).toInt()

                } else 0



                Card(

                    shape = RoundedCornerShape(24.dp),

                    colors = CardDefaults.cardColors(containerColor = Color(0xFF0F172A)),

                    modifier = Modifier

                        .fillMaxWidth()

                        .padding(horizontal = 20.dp, vertical = 10.dp)

                        .testTag("mock_test_result_card")

                ) {

                    Column(modifier = Modifier.padding(20.dp)) {

                        Row(

                            modifier = Modifier.fillMaxWidth(),

                            horizontalArrangement = Arrangement.SpaceBetween,

                            verticalAlignment = Alignment.CenterVertically

                        ) {

                            Text(

                                text = "OFFICIAL MOCK TEST SCORECARD",

                                fontFamily = JetBrainsMonoFamily,

                                fontWeight = FontWeight.Medium,

                                fontSize = 10.5.sp,

                                color = AccentYellow

                            )

                            Surface(

                                color = Color.White.copy(alpha = 0.12f),

                                shape = RoundedCornerShape(50)

                            ) {

                                Text(

                                    text = "$accuracyPct% Accuracy",

                                    fontFamily = InterFontFamily,

                                    fontWeight = FontWeight.SemiBold,

                                    fontSize = 11.5.sp,

                                    color = Color.White,

                                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)

                                )

                            }

                        }

                        Spacer(modifier = Modifier.height(8.dp))

                        Text(

                            text = "Final Score: $totalScore / ${mockTest.maxMarks}",

                            fontFamily = OutfitDisplayFamily,

                            fontWeight = FontWeight.Bold,

                            fontSize = 26.sp,

                            color = Color.White

                        )

                        Spacer(modifier = Modifier.height(6.dp))

                        Text(

                            text = "Correct: $correctCount (+${correctCount * mockTest.positiveMarks}) • Incorrect: $wrongCount (-${wrongCount * mockTest.negativeMarks}) • Skipped: $skippedCount",

                            fontFamily = InterFontFamily,

                            fontSize = 12.5.sp,

                            color = Color.White.copy(alpha = 0.85f)

                        )

                        Spacer(modifier = Modifier.height(16.dp))

                        Button(

                            onClick = onBack,

                            shape = RoundedCornerShape(50),

                            colors = ButtonDefaults.buttonColors(

                                containerColor = Color.White,

                                contentColor = Color(0xFF0F172A)

                            ),

                            modifier = Modifier.fillMaxWidth()

                        ) {

                            Text("Save & Return to Mock Tests", fontWeight = FontWeight.Bold)

                        }

                    }

                }

            }



            // 4. CBT Question Number Palette

            LazyRow(

                contentPadding = PaddingValues(horizontal = 20.dp, vertical = 6.dp),

                horizontalArrangement = Arrangement.spacedBy(8.dp)

            ) {

                itemsIndexed(questions) { idx, q ->

                    val hasAns = selectedAnswers.containsKey(q.id)

                    val isReviewed = markedForReview[q.id] == true

                    val isCurr = idx == currentIndex

                    val bgColor = when {

                        isCurr -> Color(0xFF0F172A)

                        isReviewed -> Color(0xFFF59E0B)

                        hasAns -> PrimaryBlue

                        else -> Color.White

                    }

                    val txtColor = if (isCurr || isReviewed || hasAns) Color.White else Color(0xFF334155)



                    Surface(

                        onClick = { currentIndex = idx },

                        shape = CircleShape,

                        color = bgColor,

                        border = BorderStroke(

                            1.dp,

                            if (isCurr || isReviewed || hasAns) bgColor else Color(0xFFDCDFE4)

                        ),

                        modifier = Modifier.size(38.dp)

                    ) {

                        Box(contentAlignment = Alignment.Center) {

                            Text(

                                text = "${idx + 1}",

                                fontFamily = InterFontFamily,

                                fontWeight = FontWeight.SemiBold,

                                fontSize = 13.sp,

                                color = txtColor

                            )

                        }

                    }

                }

            }



            // 5. Active CBT Question Card

            if (currentQ != null) {

                val subjAccent = subjectAccentColor(currentQ.subject)

                val isMarkedReview = markedForReview[currentQ.id] == true



                Card(

                    shape = RoundedCornerShape(22.dp),

                    colors = CardDefaults.cardColors(containerColor = Color.White),

                    border = BorderStroke(1.dp, Color(0xFFDCDFE4)),

                    elevation = CardDefaults.cardElevation(defaultElevation = 1.dp),

                    modifier = Modifier

                        .fillMaxWidth()

                        .padding(horizontal = 20.dp, vertical = 8.dp)

                ) {

                    Column(modifier = Modifier.padding(18.dp)) {

                        // Question Metadata Row + Marking Badge

                        Row(

                            modifier = Modifier.fillMaxWidth(),

                            horizontalArrangement = Arrangement.SpaceBetween,

                            verticalAlignment = Alignment.CenterVertically

                        ) {

                            Row(

                                verticalAlignment = Alignment.CenterVertically,

                                horizontalArrangement = Arrangement.spacedBy(8.dp)

                            ) {

                                Surface(

                                    color = subjAccent.copy(alpha = 0.12f),

                                    shape = RoundedCornerShape(8.dp)

                                ) {

                                    Text(

                                        text = "Q${currentIndex + 1} • ${currentQ.subject}",

                                        fontFamily = InterFontFamily,

                                        fontWeight = FontWeight.SemiBold,

                                        fontSize = 12.sp,

                                        color = subjAccent,

                                        modifier = Modifier.padding(horizontal = 9.dp, vertical = 4.dp)

                                    )

                                }

                                Text(

                                    text = currentQ.topic,

                                    fontFamily = InterFontFamily,

                                    fontSize = 12.sp,

                                    color = Color(0xFF64748B),

                                    maxLines = 1,

                                    overflow = TextOverflow.Ellipsis

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

                                    fontSize = 10.5.sp,

                                    color = Color(0xFF334155),

                                    modifier = Modifier.padding(horizontal = 7.dp, vertical = 3.dp)

                                )

                            }

                        }



                        Spacer(modifier = Modifier.height(12.dp))



                        Text(

                            text = currentQ.prompt,

                            fontFamily = InterFontFamily,

                            fontWeight = FontWeight.Medium,

                            fontSize = 15.5.sp,

                            lineHeight = 23.sp,

                            color = Color(0xFF0F172A)

                        )



                        Spacer(modifier = Modifier.height(16.dp))



                        val chosenOpt = selectedAnswers[currentQ.id]

                        currentQ.options.forEachIndexed { optIdx, optText ->

                            val isSelected = chosenOpt == optIdx

                            val isCorrectOpt = isTestSubmitted && optIdx == currentQ.correctOptionIndex

                            val isWrongSelected = isTestSubmitted && isSelected && optIdx != currentQ.correctOptionIndex



                            val optBg = when {

                                isCorrectOpt -> Color(0xFFECFDF5)

                                isWrongSelected -> Color(0xFFFEF2F2)

                                isSelected -> Color(0xFFEEF2FF)

                                else -> Color(0xFFF9FAFB)

                            }

                            val optBorder = when {

                                isCorrectOpt -> SuccessGreen

                                isWrongSelected -> Color(0xFFEF4444)

                                isSelected -> PrimaryBlue

                                else -> Color(0xFFE2E8F0)

                            }



                            Surface(

                                onClick = {

                                    if (!isTestSubmitted) {

                                        selectedAnswers[currentQ.id] = optIdx

                                    }

                                },

                                shape = RoundedCornerShape(14.dp),

                                color = optBg,

                                border = BorderStroke(if (isSelected || isCorrectOpt) 1.5.dp else 1.dp, optBorder),

                                modifier = Modifier

                                    .fillMaxWidth()

                                    .padding(vertical = 4.dp)

                            ) {

                                Row(

                                    modifier = Modifier.padding(14.dp),

                                    verticalAlignment = Alignment.CenterVertically,

                                    horizontalArrangement = Arrangement.spacedBy(12.dp)

                                ) {

                                    Surface(

                                        shape = CircleShape,

                                        color = if (isSelected) PrimaryBlue else Color.White,

                                        border = BorderStroke(

                                            1.dp,

                                            if (isSelected) PrimaryBlue else Color(0xFFCBD5E1)

                                        ),

                                        modifier = Modifier.size(28.dp)

                                    ) {

                                        Box(contentAlignment = Alignment.Center) {

                                            Text(

                                                text = listOf("A", "B", "C", "D")[optIdx],

                                                fontFamily = InterFontFamily,

                                                fontWeight = FontWeight.SemiBold,

                                                fontSize = 12.5.sp,

                                                color = if (isSelected) Color.White else Color(0xFF334155)

                                            )

                                        }

                                    }

                                    Text(

                                        text = optText,

                                        fontFamily = InterFontFamily,

                                        fontWeight = if (isSelected) FontWeight.SemiBold else FontWeight.Normal,

                                        fontSize = 14.5.sp,

                                        lineHeight = 20.sp,

                                        color = Color(0xFF0F172A),

                                        modifier = Modifier.weight(1f)

                                    )

                                }

                            }

                        }



                        // CBT Secondary Actions: Mark for Review & Clear Response

                        if (!isTestSubmitted) {

                            Spacer(modifier = Modifier.height(10.dp))

                            Row(

                                modifier = Modifier.fillMaxWidth(),

                                horizontalArrangement = Arrangement.SpaceBetween,

                                verticalAlignment = Alignment.CenterVertically

                            ) {

                                Surface(

                                    onClick = {

                                        markedForReview[currentQ.id] = !isMarkedReview

                                    },

                                    shape = RoundedCornerShape(50),

                                    color = if (isMarkedReview) Color(0xFFFEF3C7) else Color(0xFFF3F4F6),

                                    border = BorderStroke(

                                        1.dp,

                                        if (isMarkedReview) Color(0xFFF59E0B) else Color(0xFFDCDFE4)

                                    )

                                ) {

                                    Row(

                                        modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp),

                                        verticalAlignment = Alignment.CenterVertically,

                                        horizontalArrangement = Arrangement.spacedBy(5.dp)

                                    ) {

                                        Icon(

                                            imageVector = if (isMarkedReview) Icons.Default.Bookmark else Icons.Default.BookmarkBorder,

                                            contentDescription = null,

                                            tint = if (isMarkedReview) Color(0xFFD97706) else Color(0xFF475569),

                                            modifier = Modifier.size(14.dp)

                                        )

                                        Text(

                                            text = if (isMarkedReview) "Marked for Review" else "Mark for Review",

                                            fontFamily = InterFontFamily,

                                            fontWeight = FontWeight.Medium,

                                            fontSize = 11.5.sp,

                                            color = if (isMarkedReview) Color(0xFFB45309) else Color(0xFF475569)

                                        )

                                    }

                                }



                                if (chosenOpt != null) {

                                    Surface(

                                        onClick = { selectedAnswers.remove(currentQ.id) },

                                        shape = RoundedCornerShape(50),

                                        color = Color(0xFFF3F4F6),

                                        border = BorderStroke(1.dp, Color(0xFFDCDFE4))

                                    ) {

                                        Text(

                                            text = "Clear Response",

                                            fontFamily = InterFontFamily,

                                            fontWeight = FontWeight.Medium,

                                            fontSize = 11.5.sp,

                                            color = Color(0xFF475569),

                                            modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)

                                        )

                                    }

                                }

                            }

                        }



                        if (isTestSubmitted) {

                            Spacer(modifier = Modifier.height(14.dp))

                            Surface(

                                color = Color(0xFFF0FDF4),

                                shape = RoundedCornerShape(14.dp),

                                border = BorderStroke(1.dp, Color(0xFFBBF7D0)),

                                modifier = Modifier.fillMaxWidth()

                            ) {

                                Column(modifier = Modifier.padding(14.dp)) {

                                    Text(

                                        text = "Correct Answer: Option ${listOf("A", "B", "C", "D")[currentQ.correctOptionIndex]}",

                                        fontFamily = InterFontFamily,

                                        fontWeight = FontWeight.Bold,

                                        fontSize = 13.sp,

                                        color = SuccessGreen

                                    )

                                    Spacer(modifier = Modifier.height(6.dp))

                                    Text(

                                        text = currentQ.stepByStepExplanation,

                                        fontFamily = InterFontFamily,

                                        fontSize = 13.sp,

                                        lineHeight = 19.sp,

                                        color = Color(0xFF1E293B)

                                    )

                                }

                            }

                        }

                    }

                }



                // 6. Bottom Navigation Row: Previous | Save & Next

                Row(

                    modifier = Modifier

                        .fillMaxWidth()

                        .padding(horizontal = 20.dp, vertical = 8.dp),

                    horizontalArrangement = Arrangement.spacedBy(12.dp)

                ) {

                    OutlinedButton(

                        onClick = { if (currentIndex > 0) currentIndex-- },

                        enabled = currentIndex > 0,

                        shape = RoundedCornerShape(50),

                        border = BorderStroke(1.dp, Color(0xFFDCDFE4)),

                        modifier = Modifier.weight(1f)

                    ) {

                        Text(

                            text = "Previous",

                            fontFamily = InterFontFamily,

                            fontWeight = FontWeight.SemiBold

                        )

                    }

                    Button(

                        onClick = {

                            if (currentIndex < questions.lastIndex) currentIndex++

                        },

                        enabled = currentIndex < questions.lastIndex,

                        shape = RoundedCornerShape(50),

                        colors = ButtonDefaults.buttonColors(

                            containerColor = Color(0xFF0F172A),

                            contentColor = Color.White

                        ),

                        modifier = Modifier.weight(1f)

                    ) {

                        Text(

                            text = if (isTestSubmitted) "Next Question" else "Save & Next",

                            fontFamily = InterFontFamily,

                            fontWeight = FontWeight.SemiBold

                        )

                    }

                }

            }

        }

    }

}



// ==================== 4. ASK & SOLVE AI OVERLAY (3D AI MASCOT ORB + BOTTOM WRITE BAR) ====================

@Composable

fun SnapSolveOverlay(

    initialSubject: String,

    isSolving: Boolean,

    solutionOutput: String?,

    onBack: () -> Unit,

    onSolveRequest: (String, String, Bitmap?) -> Unit

) {

    BackHandler(onBack = onBack)



    val context = LocalContext.current

    val subjects = listOf("Mathematics", "Physics", "Chemistry", "Biology")

    var selectedSubject by remember { mutableStateOf(initialSubject.ifBlank { "Mathematics" }) }

    var showSubjectTray by remember { mutableStateOf(false) }

    val defaultFeaturedPrompt = "Evaluate ∫(0 to ∞) x · e^(-x) dx using integration by parts and verify that Γ(2) = 1."

    var problemText by remember { mutableStateOf("") }

    var attachedBitmap by remember { mutableStateOf<Bitmap?>(null) }



    val photoPickerLauncher = rememberLauncherForActivityResult(

        contract = ActivityResultContracts.PickVisualMedia()

    ) { uri ->

        if (uri != null) {

            try {

                val bmp = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {

                    val src = ImageDecoder.createSource(context.contentResolver, uri)

                    ImageDecoder.decodeBitmap(src)

                } else {

                    @Suppress("DEPRECATION")

                    MediaStore.Images.Media.getBitmap(context.contentResolver, uri)

                }

                attachedBitmap = bmp

            } catch (_: Exception) {

            }

        }

    }



    Box(

        modifier = Modifier

            .fillMaxSize()

            .background(

                Brush.verticalGradient(

                    colors = listOf(

                        Color(0xFFECEEF5),

                        Color(0xFFF4F5FA),

                        Color(0xFFECEFF7)

                    )

                )

            )

            .windowInsetsPadding(WindowInsets.statusBars)

            .windowInsetsPadding(WindowInsets.navigationBars)

            .imePadding()

            .testTag("snap_solve_overlay")

    ) {

        Column(

            modifier = Modifier.fillMaxSize(),

            verticalArrangement = Arrangement.SpaceBetween

        ) {

            // 1. Refined Top Floating Action Bar (matching reference screenshot proportions & stroke weights)

            Column(modifier = Modifier.fillMaxWidth()) {

                Row(

                    modifier = Modifier

                        .fillMaxWidth()

                        .padding(horizontal = 20.dp, vertical = 12.dp),

                    horizontalArrangement = Arrangement.SpaceBetween,

                    verticalAlignment = Alignment.CenterVertically

                ) {

                    // Left: Crisp White Circular `<` Chevron Button

                    Surface(

                        onClick = onBack,

                        shape = CircleShape,

                        color = Color.White,

                        shadowElevation = 1.dp,

                        border = BorderStroke(1.dp, Color(0xFFDCE1F0)),

                        modifier = Modifier

                            .size(42.dp)

                            .testTag("snap_solve_back_button")

                    ) {

                        Box(contentAlignment = Alignment.Center) {

                            Canvas(modifier = Modifier.size(16.dp)) {

                                val w = size.width

                                val h = size.height

                                val chevron = Path().apply {

                                    moveTo(w * 0.64f, h * 0.18f)

                                    lineTo(w * 0.30f, h * 0.50f)

                                    lineTo(w * 0.64f, h * 0.82f)

                                }

                                drawPath(

                                    path = chevron,

                                    color = Color(0xFF1E2235),

                                    style = Stroke(width = 2.dp.toPx(), cap = StrokeCap.Round)

                                )

                            }

                        }

                    }



                    // Right Cluster: Compact Subject Pill + Sliders Filter Circle + Photo Scan Circle

                    Row(

                        verticalAlignment = Alignment.CenterVertically,

                        horizontalArrangement = Arrangement.spacedBy(8.dp)

                    ) {

                        // Compact Subject Pill (`▷ IAT • Math` — cycles subjects on tap)

                        val shortSubject = when (selectedSubject.lowercase()) {

                            "mathematics" -> "Math"

                            "chemistry" -> "Chem"

                            else -> selectedSubject

                        }

                        Surface(

                            onClick = {

                                val nextIdx = (subjects.indexOfFirst {

                                    it.equals(selectedSubject, ignoreCase = true)

                                } + 1) % subjects.size

                                selectedSubject = subjects[nextIdx]

                            },

                            shape = RoundedCornerShape(50),

                            color = Color.White,

                            shadowElevation = 1.dp,

                            border = BorderStroke(1.dp, Color(0xFFDCE1F0)),

                            modifier = Modifier.height(42.dp)

                        ) {

                            Row(

                                modifier = Modifier.padding(horizontal = 14.dp),

                                verticalAlignment = Alignment.CenterVertically,

                                horizontalArrangement = Arrangement.spacedBy(7.dp)

                            ) {

                                // Stylized hollow play-spark triangle matching reference screenshot

                                Canvas(modifier = Modifier.size(13.dp)) {

                                    val w = size.width

                                    val h = size.height

                                    val tri = Path().apply {

                                        moveTo(w * 0.18f, h * 0.14f)

                                        lineTo(w * 0.88f, h * 0.50f)

                                        lineTo(w * 0.18f, h * 0.86f)

                                        close()

                                    }

                                    drawPath(

                                        path = tri,

                                        color = Color(0xFF1E2235),

                                        style = Stroke(width = 1.8.dp.toPx(), cap = StrokeCap.Round)

                                    )

                                }

                                Text(

                                    text = "IAT • $shortSubject",

                                    fontFamily = PlusJakartaSansFamily,

                                    fontWeight = FontWeight.Bold,

                                    fontSize = 13.sp,

                                    color = Color(0xFF1E2235)

                                )

                            }

                        }



                        // Circular Sliders / Subject-Filter Button (matching reference screenshot)

                        Surface(

                            onClick = { showSubjectTray = !showSubjectTray },

                            shape = CircleShape,

                            color = if (showSubjectTray) Color(0xFF1E2235) else Color.White,

                            shadowElevation = 1.dp,

                            border = BorderStroke(1.dp, Color(0xFFDCE1F0)),

                            modifier = Modifier.size(42.dp)

                        ) {

                            Box(contentAlignment = Alignment.Center) {

                                val iconTint = if (showSubjectTray) Color.White else Color(0xFF1E2235)

                                Canvas(modifier = Modifier.size(16.dp)) {

                                    val w = size.width

                                    val h = size.height

                                    val sw = 1.7.dp.toPx()

                                    // Top slider line + knob

                                    drawLine(

                                        color = iconTint,

                                        start = Offset(w * 0.12f, h * 0.30f),

                                        end = Offset(w * 0.88f, h * 0.30f),

                                        strokeWidth = sw,

                                        cap = StrokeCap.Round

                                    )

                                    drawCircle(

                                        color = iconTint,

                                        radius = 2.2.dp.toPx(),

                                        center = Offset(w * 0.64f, h * 0.30f)

                                    )

                                    // Bottom slider line + knob

                                    drawLine(

                                        color = iconTint,

                                        start = Offset(w * 0.12f, h * 0.70f),

                                        end = Offset(w * 0.88f, h * 0.70f),

                                        strokeWidth = sw,

                                        cap = StrokeCap.Round

                                    )

                                    drawCircle(

                                        color = iconTint,

                                        radius = 2.2.dp.toPx(),

                                        center = Offset(w * 0.36f, h * 0.70f)

                                    )

                                }

                            }

                        }



                        // Circular Photo-Scan Button (matching stroke weight & clean style)

                        Surface(

                            onClick = {

                                photoPickerLauncher.launch(

                                    PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.ImageOnly)

                                )

                            },

                            shape = CircleShape,

                            color = if (attachedBitmap != null) Color(0xFF385EEB) else Color.White,

                            shadowElevation = 1.dp,

                            border = BorderStroke(1.dp, Color(0xFFDCE1F0)),

                            modifier = Modifier

                                .size(42.dp)

                                .testTag("pick_question_photo_button")

                        ) {

                            Box(contentAlignment = Alignment.Center) {

                                val iconTint = if (attachedBitmap != null) Color.White else Color(0xFF1E2235)

                                Canvas(modifier = Modifier.size(17.dp)) {

                                    val w = size.width

                                    val h = size.height

                                    val sw = 1.7.dp.toPx()

                                    // Rounded camera/image frame

                                    drawRoundRect(

                                        color = iconTint,

                                        topLeft = Offset(w * 0.10f, h * 0.16f),

                                        size = Size(w * 0.80f, h * 0.68f),

                                        cornerRadius = CornerRadius(3.5.dp.toPx(), 3.5.dp.toPx()),

                                        style = Stroke(width = sw)

                                    )

                                    // Center lens circle

                                    drawCircle(

                                        color = iconTint,

                                        radius = 2.4.dp.toPx(),

                                        center = Offset(w * 0.50f, h * 0.50f),

                                        style = Stroke(width = sw)

                                    )

                                    // Top-right flash dot

                                    drawCircle(

                                        color = iconTint,

                                        radius = 1.1.dp.toPx(),

                                        center = Offset(w * 0.72f, h * 0.32f)

                                    )

                                }

                            }

                        }

                    }

                }



                // Optional Subject Switcher Row when filter icon is tapped

                if (showSubjectTray) {

                    Row(

                        modifier = Modifier

                            .fillMaxWidth()

                            .padding(horizontal = 20.dp, vertical = 4.dp),

                        horizontalArrangement = Arrangement.spacedBy(8.dp)

                    ) {

                        subjects.forEach { subj ->

                            val active = subj.equals(selectedSubject, ignoreCase = true)

                            Surface(

                                onClick = { selectedSubject = subj },

                                shape = RoundedCornerShape(50),

                                color = if (active) Color(0xFF385EEB) else Color.White,

                                border = BorderStroke(1.dp, if (active) Color(0xFF385EEB) else Color(0xFFDCE1EE))

                            ) {

                                Text(

                                    text = subj,

                                    fontFamily = InterFontFamily,

                                    fontWeight = FontWeight.Bold,

                                    fontSize = 12.sp,

                                    color = if (active) Color.White else PrimaryText,

                                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)

                                )

                            }

                        }

                    }

                }

            }



            // 2. Scrollable Center Stage: Status Text + 3D Iridescent AI Mascot Orb + Greeting / Solution Output

            LazyColumn(

                modifier = Modifier

                    .weight(1f)

                    .fillMaxWidth(),

                horizontalAlignment = Alignment.CenterHorizontally,

                contentPadding = PaddingValues(horizontal = 24.dp, vertical = 8.dp),

                verticalArrangement = Arrangement.Center

            ) {

                item {

                    // Status Label above the 3D Orb ("I'm Ready To Help...")

                    Text(

                        text = when {

                            isSolving -> "Solving Step-by-Step..."

                            !solutionOutput.isNullOrBlank() -> "Step-by-Step Solution Ready"

                            else -> "I'm Ready To Help..."

                        },

                        fontFamily = InterFontFamily,

                        fontWeight = FontWeight.SemiBold,

                        fontSize = 14.sp,

                        color = Color(0xFF5A78F0),

                        textAlign = TextAlign.Center

                    )



                    Spacer(modifier = Modifier.height(if (solutionOutput.isNullOrBlank()) 14.dp else 8.dp))



                    // 3D Iridescent Liquid/Flame AI Mascot Orb with Smoothly Blinking Eyes

                    AiMascotOrbIllustration(

                        orbSize = if (solutionOutput.isNullOrBlank()) 196.dp else 124.dp,

                        isSolving = isSolving

                    )



                    Spacer(modifier = Modifier.height(if (solutionOutput.isNullOrBlank()) 22.dp else 12.dp))



                    // Attached Image Preview (if user picked a photo)

                    if (attachedBitmap != null) {

                        Card(

                            shape = RoundedCornerShape(16.dp),

                            colors = CardDefaults.cardColors(containerColor = Color.White),

                            border = BorderStroke(1.dp, Color(0xFFD8E0F5)),

                            modifier = Modifier

                                .fillMaxWidth()

                                .padding(bottom = 12.dp)

                        ) {

                            Row(

                                modifier = Modifier.padding(10.dp),

                                verticalAlignment = Alignment.CenterVertically,

                                horizontalArrangement = Arrangement.spacedBy(12.dp)

                            ) {

                                Image(

                                    bitmap = attachedBitmap!!.asImageBitmap(),

                                    contentDescription = "Attached question photo",

                                    modifier = Modifier

                                        .size(56.dp)

                                        .clip(RoundedCornerShape(10.dp)),

                                    contentScale = ContentScale.Crop

                                )

                                Column(modifier = Modifier.weight(1f)) {

                                    Text(

                                        text = "Question Photo Attached",

                                        fontFamily = PlusJakartaSansFamily,

                                        fontWeight = FontWeight.Bold,

                                        fontSize = 13.5.sp,

                                        color = PrimaryText

                                    )

                                    Text(

                                        text = "Tap Send in the write bar below to solve",

                                        fontFamily = InterFontFamily,

                                        fontSize = 12.sp,

                                        color = SecondaryText

                                    )

                                }

                                OutlinedButton(

                                    onClick = { attachedBitmap = null },

                                    shape = RoundedCornerShape(50),

                                    contentPadding = PaddingValues(horizontal = 10.dp, vertical = 4.dp)

                                ) {

                                    Text("Remove", fontSize = 11.sp)

                                }

                            }

                        }

                    }



                    // Center Greeting Typography OR Step-by-Step Solution Card

                    if (solutionOutput.isNullOrBlank()) {

                        Text(

                            text = "Hi! I'm ready to practice",

                            fontFamily = OutfitDisplayFamily,

                            fontWeight = FontWeight.Medium,

                            fontSize = 22.sp,

                            letterSpacing = (-0.3).sp,

                            color = Color(0xFF222634),

                            textAlign = TextAlign.Center

                        )

                        Spacer(modifier = Modifier.height(4.dp))

                        Text(

                            text = "$selectedSubject with you. Write your\nIISER question or equation below.",

                            fontFamily = InterFontFamily,

                            fontWeight = FontWeight.Normal,

                            fontSize = 16.5.sp,

                            lineHeight = 23.5.sp,

                            color = Color(0xFF6E7485),

                            textAlign = TextAlign.Center

                        )



                        Spacer(modifier = Modifier.height(20.dp))



                        // Quick-Fill Sample Problem Pills

                        Text(

                            text = "TRY AN IISER SAMPLE DOUBT",

                            fontFamily = JetBrainsMonoFamily,

                            fontWeight = FontWeight.Medium,

                            fontSize = 10.sp,

                            letterSpacing = 0.8.sp,

                            color = Color(0xFF8C93A8)

                        )

                        Spacer(modifier = Modifier.height(10.dp))

                        Row(

                            modifier = Modifier.fillMaxWidth(),

                            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally)

                        ) {

                            SamplePromptPill(

                                label = "∫₀^∞ x·e⁻ˣ dx",

                                onClick = {

                                    selectedSubject = "Mathematics"

                                    val q = "Evaluate ∫(0 to ∞) x · e^(-x) dx using integration by parts and verify that Γ(2) = 1."

                                    problemText = q

                                    onSolveRequest(q, "Mathematics", attachedBitmap)

                                }

                            )

                            SamplePromptPill(

                                label = "Spherical Cavity E-Field",

                                onClick = {

                                    selectedSubject = "Physics"

                                    val q = "Find the electric field inside a spherical cavity carved inside a uniformly charged sphere of charge density ρ."

                                    problemText = q

                                    onSolveRequest(q, "Physics", attachedBitmap)

                                }

                            )

                            SamplePromptPill(

                                label = "Lac Operon",

                                onClick = {

                                    selectedSubject = "Biology"

                                    val q = "Predict lacZ and lacY expression in an E. coli merodiploid Iˢ P⁺ O⁺ Z⁺ Y⁻ / F' I⁺ P⁺ Oᶜ Z⁻ Y⁺."

                                    problemText = q

                                    onSolveRequest(q, "Biology", attachedBitmap)

                                }

                            )

                        }

                    } else {

                        // Step-by-Step AI Solution Card

                        Card(

                            shape = RoundedCornerShape(22.dp),

                            colors = CardDefaults.cardColors(containerColor = Color.White),

                            border = BorderStroke(1.2.dp, Color(0xFFD6E0FF)),

                            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),

                            modifier = Modifier

                                .fillMaxWidth()

                                .testTag("snap_solve_result_card")

                        ) {

                            Column(modifier = Modifier.padding(18.dp)) {

                                Row(

                                    modifier = Modifier.fillMaxWidth(),

                                    horizontalArrangement = Arrangement.SpaceBetween,

                                    verticalAlignment = Alignment.CenterVertically

                                ) {

                                    Row(

                                        verticalAlignment = Alignment.CenterVertically,

                                        horizontalArrangement = Arrangement.spacedBy(6.dp)

                                    ) {

                                        Icon(

                                            imageVector = Icons.Default.AutoAwesome,

                                            contentDescription = null,

                                            tint = Color(0xFF385EEB),

                                            modifier = Modifier.size(16.dp)

                                        )

                                        Text(

                                            text = "STEP-BY-STEP AI DERIVATION (+10 XP)",

                                            fontFamily = JetBrainsMonoFamily,

                                            fontWeight = FontWeight.Medium,

                                            fontSize = 11.sp,

                                            color = Color(0xFF385EEB)

                                        )

                                    }

                                    Surface(

                                        color = Color(0xFFEEFBF4),

                                        shape = RoundedCornerShape(50)

                                    ) {

                                        Text(

                                            text = "✓ Verified",

                                            fontFamily = InterFontFamily,

                                            fontWeight = FontWeight.Bold,

                                            fontSize = 10.5.sp,

                                            color = SuccessGreen,

                                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)

                                        )

                                    }

                                }

                                Spacer(modifier = Modifier.height(10.dp))

                                Text(

                                    text = solutionOutput,

                                    style = MaterialTheme.typography.bodyMedium,

                                    color = PrimaryText

                                )

                            }

                        }

                    }

                }

            }



            // 3. Sleek Single-Line Bottom Write Dock (No heavy dark shadow, clean outer glow & upward send button)

            Box(

                modifier = Modifier

                    .fillMaxWidth()

                    .padding(horizontal = 18.dp, vertical = 12.dp)

            ) {

                // Soft periwinkle outer halo container instead of heavy gray drop shadow

                Box(

                    modifier = Modifier

                        .fillMaxWidth()

                        .clip(RoundedCornerShape(50))

                        .background(Color(0xFFE1E6F5).copy(alpha = 0.65f))

                        .padding(2.dp)

                ) {

                    Surface(

                        shape = RoundedCornerShape(50),

                        color = Color.White,

                        shadowElevation = 1.dp,

                        border = BorderStroke(1.dp, Color(0xFFD5DDF2)),

                        modifier = Modifier.fillMaxWidth()

                    ) {

                        Row(

                            modifier = Modifier

                                .fillMaxWidth()

                                .padding(start = 7.dp, end = 6.dp, top = 6.dp, bottom = 6.dp),

                            verticalAlignment = Alignment.CenterVertically,

                            horizontalArrangement = Arrangement.spacedBy(10.dp)

                        ) {

                            // Left: Sleek Circular Keyboard/Write Prompt Badge

                            Surface(

                                shape = CircleShape,

                                color = Color(0xFFF2F5FC),

                                border = BorderStroke(1.dp, Color(0xFFE2E8F8)),

                                modifier = Modifier.size(40.dp)

                            ) {

                                Box(contentAlignment = Alignment.Center) {

                                    Canvas(modifier = Modifier.size(17.dp)) {

                                        val w = size.width

                                        val h = size.height

                                        // Minimalist keyboard / write-bar glyph

                                        drawRoundRect(

                                            color = Color(0xFF365AF0),

                                            topLeft = Offset(w * 0.08f, h * 0.22f),

                                            size = Size(w * 0.84f, h * 0.56f),

                                            cornerRadius = CornerRadius(3.dp.toPx(), 3.dp.toPx()),

                                            style = Stroke(width = 1.6.dp.toPx())

                                        )

                                        // Top row keys

                                        for (k in 0..2) {

                                            drawCircle(

                                                color = Color(0xFF365AF0),

                                                radius = 1.1.dp.toPx(),

                                                center = Offset(w * (0.30f + k * 0.20f), h * 0.42f)

                                            )

                                        }

                                        // Bottom spacebar line

                                        drawLine(

                                            color = Color(0xFF365AF0),

                                            start = Offset(w * 0.30f, h * 0.62f),

                                            end = Offset(w * 0.70f, h * 0.62f),

                                            strokeWidth = 1.5.dp.toPx(),

                                            cap = StrokeCap.Round

                                        )

                                    }

                                }

                            }



                            // Center: Clean Write Input Field (Starts empty with crisp single-line placeholder)

                            Box(

                                modifier = Modifier

                                    .weight(1f)

                                    .padding(vertical = 4.dp),

                                contentAlignment = Alignment.CenterStart

                            ) {

                                if (problemText.isEmpty()) {

                                    Text(

                                        text = "Ask any IISER $selectedSubject question...",

                                        fontFamily = InterFontFamily,

                                        fontWeight = FontWeight.Medium,

                                        fontSize = 14.sp,

                                        color = Color(0xFF8C95AA),

                                        maxLines = 1

                                    )

                                }

                                BasicTextField(

                                    value = problemText,

                                    onValueChange = { problemText = it },

                                    textStyle = TextStyle(

                                        fontFamily = InterFontFamily,

                                        fontWeight = FontWeight.Medium,

                                        fontSize = 14.sp,

                                        lineHeight = 19.sp,

                                        color = PrimaryText

                                    ),

                                    maxLines = 2,

                                    cursorBrush = SolidColor(Color(0xFF385EEB)),

                                    modifier = Modifier

                                        .fillMaxWidth()

                                        .testTag("snap_solve_input_field")

                                )

                            }



                            // Clear text button when user has typed something

                            if (problemText.isNotEmpty()) {

                                Surface(

                                    onClick = { problemText = "" },

                                    shape = CircleShape,

                                    color = Color(0xFFF0F3FA),

                                    modifier = Modifier.size(26.dp)

                                ) {

                                    Box(contentAlignment = Alignment.Center) {

                                        Icon(

                                            imageVector = Icons.Default.Cancel,

                                            contentDescription = "Clear text",

                                            tint = Color(0xFF7D859B),

                                            modifier = Modifier.size(15.dp)

                                        )

                                    }

                                }

                            }



                            // Right: Glowing Blue-Violet Circular Upward-Send / Solve Button

                            Surface(

                                onClick = {

                                    if (!isSolving) {

                                        val queryToSolve = problemText.ifBlank { defaultFeaturedPrompt }

                                        if (problemText.isBlank()) {

                                            problemText = queryToSolve

                                        }

                                        onSolveRequest(queryToSolve, selectedSubject, attachedBitmap)

                                    }

                                },

                                enabled = !isSolving,

                                shape = CircleShape,

                                color = Color.Transparent,

                                modifier = Modifier

                                    .size(42.dp)

                                    .clip(CircleShape)

                                    .background(

                                        Brush.linearGradient(

                                            colors = listOf(

                                                Color(0xFF355CE8),

                                                Color(0xFF7B61FF)

                                            )

                                        )

                                    )

                                    .testTag("snap_solve_submit_button")

                            ) {

                                Box(contentAlignment = Alignment.Center) {

                                    if (isSolving) {

                                        CircularProgressIndicator(

                                            color = Color.White,

                                            strokeWidth = 2.dp,

                                            modifier = Modifier.size(18.dp)

                                        )

                                    } else {

                                        // Crisp upward send arrow (`↑`) drawn on Canvas

                                        Canvas(modifier = Modifier.size(16.dp)) {

                                            val w = size.width

                                            val h = size.height

                                            val sw = 2.1.dp.toPx()

                                            drawLine(

                                                color = Color.White,

                                                start = Offset(w * 0.50f, h * 0.84f),

                                                end = Offset(w * 0.50f, h * 0.18f),

                                                strokeWidth = sw,

                                                cap = StrokeCap.Round

                                            )

                                            val arrowHead = Path().apply {

                                                moveTo(w * 0.22f, h * 0.44f)

                                                lineTo(w * 0.50f, h * 0.16f)

                                                lineTo(w * 0.78f, h * 0.44f)

                                            }

                                            drawPath(

                                                path = arrowHead,

                                                color = Color.White,

                                                style = Stroke(width = sw, cap = StrokeCap.Round)

                                            )

                                        }

                                    }

                                }

                            }

                        }

                    }

                }

            }

        }

    }

}



@Composable

private fun SamplePromptPill(

    label: String,

    onClick: () -> Unit

) {

    Surface(

        onClick = onClick,

        shape = RoundedCornerShape(50),

        color = Color.White,

        shadowElevation = 1.dp,

        border = BorderStroke(1.dp, Color(0xFFE2E7F4))

    ) {

        Text(

            text = label,

            fontFamily = InterFontFamily,

            fontWeight = FontWeight.SemiBold,

            fontSize = 11.5.sp,

            color = Color(0xFF3B4866),

            modifier = Modifier.padding(horizontal = 11.dp, vertical = 6.dp)

        )

    }

}



/**

 * 3D Iridescent Liquid/Flame AI Mascot Orb inspired by the user's reference screenshot:

 * - Smooth natural eye-blinking (closing and opening smoothly with squash-and-stretch)

 * - Subtle attentive horizontal eye-glance and gentle 3D floating hover motion

 * - Soft ambient indigo floor shadow underneath that breathes with the float height

 * - Plump 3D sphere with twin wave/flame crests at the top-right

 * - Multi-layered cobalt blue, cyan-aqua, electric violet, and iridescent pink-lilac 3D shading

 * - Frosted white contoured 3D visor faceplate with two vertical rounded-pill eyes

 */

@Composable

fun AiMascotOrbIllustration(

    orbSize: Dp = 196.dp,

    isSolving: Boolean = false,

    modifier: Modifier = Modifier

) {

    val infiniteTransition = rememberInfiniteTransition(label = "ai_mascot_orb_transition")



    // Smooth natural eye blink: stays open, closes smoothly in 150ms, opens smoothly in 170ms

    val eyeBlinkScale by infiniteTransition.animateFloat(

        initialValue = 1f,

        targetValue = 1f,

        animationSpec = infiniteRepeatable(

            animation = keyframes {

                durationMillis = 3600

                1.0f at 0 using FastOutSlowInEasing

                1.0f at 1750 using FastOutSlowInEasing

                0.08f at 1900 using FastOutSlowInEasing

                1.0f at 2070 using FastOutSlowInEasing

                1.0f at 2950 using FastOutSlowInEasing

                0.08f at 3090 using FastOutSlowInEasing

                1.0f at 3250 using FastOutSlowInEasing

                1.0f at 3600

            },

            repeatMode = RepeatMode.Restart

        ),

        label = "eye_blink_scale"

    )



    // Subtle horizontal eye glance (-1f to +1f)

    val eyeGlanceX by infiniteTransition.animateFloat(

        initialValue = 0f,

        targetValue = 0f,

        animationSpec = infiniteRepeatable(

            animation = keyframes {

                durationMillis = 5400

                0f at 0 using FastOutSlowInEasing

                0f at 1200 using FastOutSlowInEasing

                -1f at 1650 using FastOutSlowInEasing

                -1f at 2400 using FastOutSlowInEasing

                0f at 2800 using FastOutSlowInEasing

                1f at 3600 using FastOutSlowInEasing

                1f at 4300 using FastOutSlowInEasing

                0f at 4750 using FastOutSlowInEasing

                0f at 5400

            },

            repeatMode = RepeatMode.Restart

        ),

        label = "eye_glance_x"

    )



    // Gentle 3D floating hover (-1f to +1f)

    val floatOffsetFraction by infiniteTransition.animateFloat(

        initialValue = -1f,

        targetValue = 1f,

        animationSpec = infiniteRepeatable(

            animation = tween(durationMillis = 2100, easing = FastOutSlowInEasing),

            repeatMode = RepeatMode.Reverse

        ),

        label = "orb_float_offset"

    )



    Canvas(modifier = modifier.size(orbSize)) {

        val w = size.width

        val h = size.height

        val cx = w * 0.5f

        val floatDy = floatOffsetFraction * (h * 0.018f)

        val cy = h * 0.5f + floatDy



        // 1. Soft Ambient Indigo Floor Glow underneath the 3D Orb (scales slightly with hover)

        val shadowScale = 1f - (floatOffsetFraction * 0.06f)

        drawOval(

            brush = Brush.radialGradient(

                colors = listOf(

                    Color(0xFF6B7BFF).copy(alpha = 0.28f * shadowScale),

                    Color(0xFF8F9BFF).copy(alpha = 0.10f * shadowScale),

                    Color.Transparent

                ),

                center = Offset(cx, h * 0.88f),

                radius = w * 0.38f * shadowScale

            ),

            topLeft = Offset(cx - w * 0.36f * shadowScale, h * 0.77f),

            size = Size(w * 0.72f * shadowScale, h * 0.19f)

        )



        // 2. Main 3D Organic Droplet/Flame Orb Path with twin top-right wave crests

        val orbPath = Path().apply {

            // Start at bottom center

            moveTo(cx, h * 0.84f + floatDy)

            // Bottom-left curve up to left flank

            cubicTo(

                w * 0.22f, h * 0.84f + floatDy,

                w * 0.12f, h * 0.65f + floatDy,

                w * 0.14f, h * 0.46f + floatDy

            )

            // Left flank sweeping up toward the top-right primary crest

            cubicTo(

                w * 0.16f, h * 0.25f + floatDy,

                w * 0.35f, h * 0.11f + floatDy,

                w * 0.55f, h * 0.10f + floatDy

            )

            // First top-right crest tip and scoop notch

            cubicTo(

                w * 0.63f, h * 0.10f + floatDy,

                w * 0.64f, h * 0.18f + floatDy,

                w * 0.60f, h * 0.21f + floatDy

            )

            // Second outer-right wave crest

            cubicTo(

                w * 0.66f, h * 0.18f + floatDy,

                w * 0.76f, h * 0.21f + floatDy,

                w * 0.81f, h * 0.31f + floatDy

            )

            // Right flank down to bottom-center

            cubicTo(

                w * 0.89f, h * 0.47f + floatDy,

                w * 0.80f, h * 0.84f + floatDy,

                cx, h * 0.84f + floatDy

            )

            close()

        }



        // Base multi-stop diagonal 3D gradient (Pink/Lilac top -> Violet mid -> Cobalt Blue left -> Cyan bottom-right)

        drawPath(

            path = orbPath,

            brush = Brush.linearGradient(

                colors = listOf(

                    Color(0xFFF3A9FF),

                    Color(0xFF9E7BFF),

                    Color(0xFF2855F6),

                    Color(0xFF4CE0FF)

                ),

                start = Offset(w * 0.68f, h * 0.12f + floatDy),

                end = Offset(w * 0.30f, h * 0.82f + floatDy)

            )

        )



        // Deep royal-cobalt 3D shading on lower-left hemisphere

        drawPath(

            path = orbPath,

            brush = Brush.radialGradient(

                colors = listOf(

                    Color(0xFF1941E6).copy(alpha = 0.85f),

                    Color.Transparent

                ),

                center = Offset(w * 0.26f, h * 0.58f + floatDy),

                radius = w * 0.42f

            )

        )



        // Luminous aqua-cyan 3D rim glow on lower-right hemisphere

        drawPath(

            path = orbPath,

            brush = Brush.radialGradient(

                colors = listOf(

                    Color(0xFF66EDFF).copy(alpha = 0.82f),

                    Color.Transparent

                ),

                center = Offset(w * 0.74f, h * 0.68f + floatDy),

                radius = w * 0.40f

            )

        )



        // Iridescent pink-white specular highlight on the top crest

        drawPath(

            path = orbPath,

            brush = Brush.radialGradient(

                colors = listOf(

                    Color(0xFFFFF4FC).copy(alpha = 0.92f),

                    Color(0xFFF39BFF).copy(alpha = 0.55f),

                    Color.Transparent

                ),

                center = Offset(w * 0.58f, h * 0.22f + floatDy),

                radius = w * 0.30f

            )

        )



        // 3. Subtle Shadow under the Visor on the Orb Surface

        val visorShadowPath = Path().apply {

            moveTo(w * 0.25f, h * 0.37f + floatDy)

            lineTo(w * 0.75f, h * 0.37f + floatDy)

            cubicTo(w * 0.83f, h * 0.37f + floatDy, w * 0.84f, h * 0.57f + floatDy, w * 0.75f, h * 0.58f + floatDy)

            cubicTo(w * 0.66f, h * 0.59f + floatDy, w * 0.62f, h * 0.64f + floatDy, cx, h * 0.64f + floatDy)

            cubicTo(w * 0.38f, h * 0.64f + floatDy, w * 0.34f, h * 0.59f + floatDy, w * 0.25f, h * 0.58f + floatDy)

            cubicTo(w * 0.16f, h * 0.57f + floatDy, w * 0.17f, h * 0.37f + floatDy, w * 0.25f, h * 0.37f + floatDy)

            close()

        }

        drawPath(

            path = visorShadowPath,

            color = Color(0xFF102BB3).copy(alpha = 0.32f)

        )



        // 4. 3D Contoured White Visor Faceplate (with dipped lower chin bridge matching screenshot)

        val visorOuterPath = Path().apply {

            moveTo(w * 0.26f, h * 0.35f + floatDy)

            lineTo(w * 0.74f, h * 0.35f + floatDy)

            cubicTo(w * 0.82f, h * 0.35f + floatDy, w * 0.83f, h * 0.54f + floatDy, w * 0.74f, h * 0.55f + floatDy)

            cubicTo(w * 0.65f, h * 0.56f + floatDy, w * 0.61f, h * 0.61f + floatDy, cx, h * 0.61f + floatDy)

            cubicTo(w * 0.39f, h * 0.61f + floatDy, w * 0.35f, h * 0.56f + floatDy, w * 0.26f, h * 0.55f + floatDy)

            cubicTo(w * 0.17f, h * 0.54f + floatDy, w * 0.18f, h * 0.35f + floatDy, w * 0.26f, h * 0.35f + floatDy)

            close()

        }



        // Outer 3D bezel fill

        drawPath(

            path = visorOuterPath,

            brush = Brush.verticalGradient(

                colors = listOf(

                    Color(0xFFE7EBFF),

                    Color(0xFFC9D4FF)

                ),

                startY = h * 0.35f + floatDy,

                endY = h * 0.61f + floatDy

            )

        )



        // Inner frosted white visor face

        val visorInnerPath = Path().apply {

            moveTo(w * 0.275f, h * 0.368f + floatDy)

            lineTo(w * 0.725f, h * 0.368f + floatDy)

            cubicTo(w * 0.795f, h * 0.368f + floatDy, w * 0.805f, h * 0.525f + floatDy, w * 0.725f, h * 0.535f + floatDy)

            cubicTo(w * 0.64f, h * 0.545f + floatDy, w * 0.60f, h * 0.59f + floatDy, cx, h * 0.59f + floatDy)

            cubicTo(w * 0.40f, h * 0.59f + floatDy, w * 0.36f, h * 0.545f + floatDy, w * 0.275f, h * 0.535f + floatDy)

            cubicTo(w * 0.195f, h * 0.525f + floatDy, w * 0.205f, h * 0.368f + floatDy, w * 0.275f, h * 0.368f + floatDy)

            close()

        }

        drawPath(

            path = visorInnerPath,

            brush = Brush.verticalGradient(

                colors = listOf(

                    Color.White,

                    Color(0xFFEDF1FF)

                ),

                startY = h * 0.368f + floatDy,

                endY = h * 0.59f + floatDy

            )

        )



        // 5. Two Smoothly Blinking Vertical Capsule Eyes inside the Visor

        val baseEyeW = w * 0.056f

        val maxEyeH = if (isSolving) h * 0.085f else h * 0.116f

        // Subtle eyelid squash-and-stretch: slightly wider as the eye closes

        val currentEyeW = baseEyeW * (1f + (1f - eyeBlinkScale) * 0.20f)

        val currentEyeH = (maxEyeH * eyeBlinkScale).coerceAtLeast(h * 0.014f)

        val eyeCenterY = cy - maxEyeH * 0.12f

        val eyeTopY = eyeCenterY - currentEyeH / 2f

        val glanceShiftX = eyeGlanceX * (w * 0.014f)



        val leftEyeX = cx - w * 0.088f - currentEyeW / 2f + glanceShiftX

        val rightEyeX = cx + w * 0.088f - currentEyeW / 2f + glanceShiftX

        val eyeCorner = minOf(currentEyeW, currentEyeH) / 2f



        drawRoundRect(

            color = Color(0xFF1A1D2A),

            topLeft = Offset(leftEyeX, eyeTopY),

            size = Size(currentEyeW, currentEyeH),

            cornerRadius = CornerRadius(eyeCorner, eyeCorner)

        )

        drawRoundRect(

            color = Color(0xFF1A1D2A),

            topLeft = Offset(rightEyeX, eyeTopY),

            size = Size(currentEyeW, currentEyeH),

            cornerRadius = CornerRadius(eyeCorner, eyeCorner)

        )

    }

}

