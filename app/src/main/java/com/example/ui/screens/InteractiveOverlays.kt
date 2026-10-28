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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.navigationBars
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


// ==================== RICH NOTE RENDERING (headings, highlights, figures) ====================

/** Figure keys to display inside a parsed note section, by chapter + section index. */
private fun chapterSectionFigures(chapterId: String, sectionIndex: Int): List<String> =
    when (chapterId) {
        "phys_ch_1" -> when (sectionIndex) {
            1 -> listOf("fig_1_5_si_constants")
            7 -> listOf("fig_1_1_vernier", "fig_1_4_zero_errors")
            8 -> listOf("fig_1_2_screw_gauge")
            else -> emptyList()
        }
        else -> emptyList()
    }

/** Minimal inline rich text: **bold** spans; everything else passes through unchanged. */
private fun noteAnnotated(text: String): AnnotatedString {
    if (!text.contains("**")) return AnnotatedString(text)
    return buildAnnotatedString {
        var i = 0
        while (i < text.length) {
            val start = text.indexOf("**", i)
            if (start < 0) {
                append(text.substring(i))
                break
            }
            append(text.substring(i, start))
            val end = text.indexOf("**", start + 2)
            if (end < 0) {
                append(text.substring(start))
                break
            }
            withStyle(SpanStyle(fontWeight = FontWeight.Bold)) {
                append(text.substring(start + 2, end))
            }
            i = end + 2
        }
    }
}

/** One body line of the Read tab, styled by its marker prefix. */
@Composable
private fun NoteBodyLine(line: String) {
    when {
        line.startsWith("✔") -> {
            Surface(
                shape = RoundedCornerShape(10.dp),
                color = SoftLavender,
                border = BorderStroke(1.dp, DeepIndigo.copy(alpha = 0.25f)),
                modifier = Modifier.fillMaxWidth().padding(vertical = 3.dp)
            ) {
                Text(
                    text = noteAnnotated(line),
                    fontFamily = AcademicSerifFamily,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 14.5.sp,
                    lineHeight = 22.sp,
                    color = DeepIndigo,
                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
                )
            }
        }
        line.startsWith("★") -> {
            Surface(
                shape = RoundedCornerShape(10.dp),
                color = Color(0xFFFFF6D6),
                border = BorderStroke(1.dp, AccentYellow.copy(alpha = 0.7f)),
                modifier = Modifier.fillMaxWidth().padding(vertical = 3.dp)
            ) {
                Text(
                    text = noteAnnotated(line),
                    fontFamily = InterFontFamily,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 14.5.sp,
                    lineHeight = 22.sp,
                    color = Color(0xFF594400),
                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
                )
            }
        }
        line.startsWith("⚠") -> {
            Surface(
                shape = RoundedCornerShape(10.dp),
                color = Color(0xFFFDECEC),
                border = BorderStroke(1.dp, WarningCoral.copy(alpha = 0.45f)),
                modifier = Modifier.fillMaxWidth().padding(vertical = 3.dp)
            ) {
                Text(
                    text = noteAnnotated(line),
                    fontFamily = InterFontFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 14.5.sp,
                    lineHeight = 22.sp,
                    color = Color(0xFF7F1D1D),
                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
                )
            }
        }
        else -> {
            Text(
                text = noteAnnotated(line),
                fontFamily = InterFontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 14.5.sp,
                lineHeight = 22.5.sp,
                color = Color(0xFF374151),
                modifier = Modifier.padding(vertical = 3.dp)
            )
        }
    }
}

/** A chapter figure inside a white card: Cloudinary URL first (Coil, cached),
 *  embedded copy from ChapterFigureData as fallback when offline or on error. */
@Composable
private fun ChapterFigure(figKey: String) {
    val remoteUrl = ChapterFigureData.urls[figKey]
    var remoteFailed by remember(figKey) { mutableStateOf(false) }
    val bitmap = remember(figKey) { ChapterFigureData.decode(figKey) }
    if ((remoteUrl != null && !remoteFailed) || bitmap != null) {
        Surface(
            shape = RoundedCornerShape(12.dp),
            color = Color.White,
            border = BorderStroke(1.dp, Color(0xFFE5E7EB)),
            modifier = Modifier.fillMaxWidth().padding(vertical = 6.dp)
        ) {
            if (remoteUrl != null && !remoteFailed) {
                AsyncImage(
                    model = remoteUrl,
                    contentDescription = null,
                    contentScale = ContentScale.FillWidth,
                    onError = { remoteFailed = true },
                    modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(12.dp))
                )
            } else if (bitmap != null) {
                Image(
                    bitmap = bitmap.asImageBitmap(),
                    contentDescription = null,
                    contentScale = ContentScale.FillWidth,
                    modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(12.dp))
                )
            }
        }
    }
}

// ==================== 1. CHAPTER READER & TEXTBOOK CONCEPT VIEWER OVERLAY ====================
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

    // 3-Tab Pill Bar matching reference screenshot: "Read" | "Video" | "IMP Qs"
    val readerTabs = remember { listOf("Read", "Video", "IMP Qs") }
    var selectedTab by remember(chapter.id, startWithVideo) {
        mutableStateOf(if (startWithVideo) "Video" else "Read")
    }
    var isPlaying by remember(chapter.id, startWithVideo) { mutableStateOf(startWithVideo) }
    var playbackProgress by remember(chapter.id) { mutableFloatStateOf(0.25f) }
    var playbackSpeed by remember { mutableStateOf("1.0x") }
    var completionBannerShown by remember(chapter.id) { mutableStateOf(false) }

    // Interactive Talk to AI & Crop/Snip Concept Sheet State
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
    val chNumFormatted = chapter.chapterNumber.toString().padStart(2, '0')

    // Parse key concepts bullets cleanly
    val keyConceptBullets = remember(chapter.keyConceptsSummary) {
        chapter.keyConceptsSummary
            .split("\n")
            .map { it.trim().removePrefix("•").trim() }
            .filter { it.isNotEmpty() }
    }

    // Parse detailed study notes into structured numbered sections (1. ..., 2. ..., 3. ...)
    val parsedNoteSections = remember(chapter.detailedStudyNotes) {
        val rawBlocks = chapter.detailedStudyNotes.trim().split(Regex("\n\\s*\n"))
        rawBlocks.mapNotNull { block ->
            val lines = block.lines().map { it.trim() }.filter { it.isNotEmpty() }
            if (lines.isEmpty()) null
            else {
                val heading = lines.first()
                val bodyLines = lines.drop(1)
                heading to bodyLines
            }
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF7F7F5))
            .windowInsetsPadding(WindowInsets.statusBars)
            .windowInsetsPadding(WindowInsets.navigationBars)
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF7F7F5))
                .testTag("chapter_reader_overlay"),
            contentPadding = PaddingValues(bottom = 128.dp)
        ) {
            item {
                // Unified Top Header & 3-Segment Pill Bar (Cohesive 20.dp Grid & Matching Surface Tokens)
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp, end = 20.dp, top = 10.dp, bottom = 12.dp)
                ) {
                    // 1. Aligned Top Bar: Tactile Circular Back Button + Chapter Metadata & Title
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Surface(
                            onClick = onBack,
                            shape = CircleShape,
                            color = Color(0xFFF3F4F6),
                            border = BorderStroke(1.dp, Color(0xFFDCDFE4)),
                            shadowElevation = 0.dp,
                            modifier = Modifier
                                .size(40.dp)
                                .testTag("chapter_overlay_back_button")
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                    contentDescription = "Back",
                                    tint = Color(0xFF0F172A),
                                    modifier = Modifier.size(19.dp)
                                )
                            }
                        }

                        Spacer(modifier = Modifier.width(14.dp))

                        Column(
                            modifier = Modifier.weight(1f),
                            verticalArrangement = Arrangement.spacedBy(2.dp)
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(6.dp)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(6.dp)
                                        .clip(CircleShape)
                                        .background(accent)
                                )
                                Text(
                                    text = "${chapter.subject} • Ch $chNumFormatted",
                                    fontFamily = InterFontFamily,
                                    fontWeight = FontWeight.SemiBold,
                                    fontSize = 12.sp,
                                    letterSpacing = 0.15.sp,
                                    color = Color(0xFF64748B)
                                )
                            }
                            Text(
                                text = chapter.title,
                                fontFamily = OutfitDisplayFamily,
                                fontWeight = FontWeight.Bold,
                                fontSize = 18.5.sp,
                                letterSpacing = (-0.3).sp,
                                color = Color(0xFF0F172A),
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    // 2. Harmonized 3-Segment Pill Bar: Read | Video | IMP Qs
                    Surface(
                        shape = RoundedCornerShape(50),
                        color = Color(0xFFF3F4F6),
                        shadowElevation = 0.dp,
                        border = BorderStroke(1.dp, Color(0xFFDCDFE4)),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(4.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            readerTabs.forEach { tabLabel ->
                                val isSelected = selectedTab == tabLabel
                                Surface(
                                    onClick = { selectedTab = tabLabel },
                                    shape = RoundedCornerShape(50),
                                    color = if (isSelected) Color(0xFFE2E5E9) else Color.Transparent,
                                    shadowElevation = 0.dp,
                                    modifier = Modifier
                                        .weight(1f)
                                        .testTag("reader_tab_${tabLabel.lowercase().replace(" ", "_")}")
                                ) {
                                    Box(
                                        modifier = Modifier.padding(vertical = 9.dp),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Text(
                                            text = tabLabel,
                                            fontFamily = InterFontFamily,
                                            fontWeight = if (isSelected) FontWeight.SemiBold else FontWeight.Medium,
                                            fontSize = 14.5.sp,
                                            letterSpacing = (-0.1).sp,
                                            color = if (isSelected) Color(0xFF0F172A) else Color(0xFF525866),
                                            maxLines = 1,
                                            softWrap = false
                                        )
                                    }
                                }
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(4.dp))

                // ==================== TAB 1: "Read" — TEXTBOOK CONCEPT PAGE (Matching Screenshot) ====================
                if (selectedTab == "Read") {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 22.dp)
                    ) {
                        // Top Bullet Takeaways from Chapter Key Concepts
                        keyConceptBullets.take(2).forEach { bullet ->
                            Text(
                                text = "• $bullet",
                                fontFamily = InterFontFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 13.5.sp,
                                lineHeight = 19.5.sp,
                                color = Color(0xFF374151),
                                modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                            )
                        }

                        if (keyConceptBullets.isNotEmpty()) {
                            Spacer(modifier = Modifier.height(14.dp))

                            // Subtle Dotted Divider Line
                            Canvas(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(2.dp)
                            ) {
                                drawLine(
                                    color = Color(0xFFD5D9E0),
                                    start = Offset(0f, 0f),
                                    end = Offset(size.width, 0f),
                                    strokeWidth = 1.2.dp.toPx(),
                                    pathEffect = PathEffect.dashPathEffect(floatArrayOf(5f, 6f), 0f)
                                )
                            }

                            Spacer(modifier = Modifier.height(18.dp))
                        }

                        // Chapter-Specific Textbook Sections & Derivations
                        parsedNoteSections.forEachIndexed { idx, (sectionHeading, sectionLines) ->
                            val cleanTitle = sectionHeading.removePrefix("${idx + 1}.").trim()
                            val isSubHeading = cleanTitle.startsWith("▸")
                            val displayTitle = cleanTitle.removePrefix("▸").trim()
                            Text(
                                text = "${chapter.chapterNumber}.${idx + 1} $displayTitle",
                                fontFamily = InterFontFamily,
                                fontWeight = FontWeight.Bold,
                                fontSize = if (isSubHeading) 15.sp else 16.sp,
                                letterSpacing = (-0.2).sp,
                                color = if (isSubHeading) DeepIndigo else Color(0xFF111827)
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                            chapterSectionFigures(chapter.id, idx).forEach { figKey ->
                                ChapterFigure(figKey)
                            }
                            sectionLines.forEach { line ->
                                NoteBodyLine(line)
                            }
                            Spacer(modifier = Modifier.height(18.dp))
                        }

                        // Textbook Key Formula Box inside Read flow
                        Surface(
                            shape = RoundedCornerShape(14.dp),
                            color = Color.White,
                            border = BorderStroke(1.dp, Color(0xFFE5E7EB)),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Column(modifier = Modifier.padding(16.dp)) {
                                Text(
                                    text = "Summary of Key Relations • ${chapter.title}",
                                    fontFamily = InterFontFamily,
                                    fontWeight = FontWeight.SemiBold,
                                    fontSize = 13.sp,
                                    color = Color(0xFF111827)
                                )
                                Spacer(modifier = Modifier.height(8.dp))
                                Text(
                                    text = chapter.formulaHighlight,
                                    fontFamily = AcademicSerifFamily,
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 15.sp,
                                    lineHeight = 22.sp,
                                    color = DeepIndigo
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(20.dp))
                    }
                }

                // ==================== TAB 2: "Video" — INTERACTIVE LECTURE PLAYER ====================
                if (selectedTab == "Video") {
                    Card(
                        shape = RoundedCornerShape(22.dp),
                        colors = CardDefaults.cardColors(containerColor = DeepIndigo),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp)
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

                // ==================== TAB 3: "Notes" — STRUCTURED REVISION SHEETS & FORMULAS ====================
                if (selectedTab == "Notes") {
                    // Master Formula Sheet Card
                    Surface(
                        shape = RoundedCornerShape(20.dp),
                        color = Color(0xFFF3F6FF),
                        border = BorderStroke(1.dp, Color(0xFFDCE5FF)),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp)
                    ) {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Surface(
                                    color = Color(0xFFE4EBFF),
                                    shape = RoundedCornerShape(6.dp)
                                ) {
                                    Text(
                                        text = "MASTER FORMULA SHEET",
                                        fontFamily = JetBrainsMonoFamily,
                                        fontWeight = FontWeight.Normal,
                                        fontSize = 9.5.sp,
                                        letterSpacing = 0.6.sp,
                                        color = Color(0xFF4F46E5),
                                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
                                    )
                                }
                                Text(
                                    text = "${chapter.subject} • Ch $chNumFormatted",
                                    fontFamily = JetBrainsMonoFamily,
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 10.sp,
                                    color = SecondaryText
                                )
                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            Surface(
                                color = Color.White,
                                shape = RoundedCornerShape(14.dp),
                                border = BorderStroke(1.dp, Color(0xFFE4ECFF)),
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Text(
                                    text = chapter.formulaHighlight,
                                    fontFamily = AcademicSerifFamily,
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 15.sp,
                                    color = DeepIndigo,
                                    lineHeight = 22.sp,
                                    modifier = Modifier.padding(14.dp)
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    // High-Yield Key Concepts Card
                    Surface(
                        shape = RoundedCornerShape(20.dp),
                        color = Color.White,
                        border = BorderStroke(1.dp, Color(0xFFE4E9F5)),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp)
                    ) {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Text(
                                text = "CORE CONCEPTS & EXAM TAKEAWAYS",
                                fontFamily = InterFontFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 10.sp,
                                letterSpacing = 0.6.sp,
                                color = accent
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            keyConceptBullets.forEachIndexed { idx, bullet ->
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(vertical = 5.dp),
                                    verticalAlignment = Alignment.Top,
                                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                                ) {
                                    Surface(
                                        color = accent.copy(alpha = 0.12f),
                                        shape = CircleShape,
                                        modifier = Modifier.size(20.dp)
                                    ) {
                                        Box(contentAlignment = Alignment.Center) {
                                            Text(
                                                text = "${idx + 1}",
                                                fontFamily = InterFontFamily,
                                                fontWeight = FontWeight.Normal,
                                                fontSize = 10.sp,
                                                color = accent
                                            )
                                        }
                                    }
                                    Text(
                                        text = bullet,
                                        fontFamily = InterFontFamily,
                                        fontWeight = FontWeight.Normal,
                                        fontSize = 12.5.sp,
                                        color = PrimaryText,
                                        lineHeight = 18.5.sp,
                                        modifier = Modifier.weight(1f)
                                    )
                                }
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    // Topic-by-Topic Revision Notes Cards
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp),
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        parsedNoteSections.forEach { (sectionHeading, sectionLines) ->
                            Surface(
                                shape = RoundedCornerShape(18.dp),
                                color = Color.White,
                                border = BorderStroke(1.dp, Color(0xFFE4E9F5)),
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Column(modifier = Modifier.padding(16.dp)) {
                                    Surface(
                                        color = Color(0xFFF4F7FE),
                                        shape = RoundedCornerShape(8.dp)
                                    ) {
                                        Text(
                                            text = sectionHeading,
                                            fontFamily = InterFontFamily,
                                            fontWeight = FontWeight.Normal,
                                            fontSize = 11.sp,
                                            letterSpacing = 0.3.sp,
                                            color = DeepIndigo,
                                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp)
                                        )
                                    }
                                    Spacer(modifier = Modifier.height(10.dp))
                                    sectionLines.forEach { line ->
                                        Text(
                                            text = line,
                                            fontFamily = InterFontFamily,
                                            fontWeight = FontWeight.Normal,
                                            fontSize = 13.sp,
                                            color = PrimaryText,
                                            lineHeight = 19.5.sp,
                                            modifier = Modifier.padding(vertical = 2.5.dp)
                                        )
                                    }
                                }
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(18.dp))
                }

                // ==================== TAB 4: "IMP Qs" — IMPORTANT IISER IAT QUESTIONS ====================
                if (selectedTab == "IMP Qs") {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp),
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

                if (completionBannerShown) {
                    Surface(
                        color = SuccessGreen.copy(alpha = 0.12f),
                        shape = RoundedCornerShape(14.dp),
                        border = BorderStroke(1.dp, SuccessGreen.copy(alpha = 0.5f)),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp, vertical = 6.dp)
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

                // Bottom Actions inside Scroll: Complete Lesson + Practice Chapter Questions
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    Button(
                        onClick = {
                            onMarkCompleted(selectedTab == "Video")
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

        // ==================== FLOATING BOTTOM OVERLAY: "Talk to AI" PILL + CROP/SNIP BUTTON ====================
        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color(0xD9F8F9FA),
                            Color(0xFFF8F9FA)
                        )
                    )
                )
                .padding(top = 28.dp, bottom = 18.dp, start = 24.dp, end = 24.dp)
        ) {
            // Centered "Talk to AI" Pill Button with Blue Vertical Waveform Bars Icon
            Surface(
                onClick = {
                    aiPromptMode = "explain"
                    showTalkToAiSheet = true
                },
                shape = RoundedCornerShape(50),
                color = Color.White,
                shadowElevation = 8.dp,
                border = BorderStroke(1.dp, Color(0xFFE6E8EC)),
                modifier = Modifier
                    .align(Alignment.Center)
                    .height(48.dp)
                    .testTag("reader_talk_to_ai_button")
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 20.dp, vertical = 10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    // Blue Vertical Waveform Bars Icon matching reference screenshot
                    Canvas(modifier = Modifier.size(22.dp)) {
                        val barCount = 7
                        val spacing = size.width / (barCount + 1)
                        val barHeights = floatArrayOf(0.36f, 0.64f, 0.88f, 0.96f, 0.86f, 0.62f, 0.36f)
                        for (i in 0 until barCount) {
                            val x = spacing * (i + 1)
                            val h = size.height * barHeights[i]
                            val topY = (size.height - h) / 2f
                            drawLine(
                                color = if (i in 2..4) Color(0xFF3B66D6) else Color(0xFF7B9CEB),
                                start = Offset(x, topY),
                                end = Offset(x, topY + h),
                                strokeWidth = 2.2.dp.toPx(),
                                cap = StrokeCap.Round
                            )
                        }
                    }
                    Text(
                        text = "Talk to AI",
                        fontFamily = InterFontFamily,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 14.5.sp,
                        color = Color(0xFF1F2937)
                    )
                }
            }

            // Right-Aligned Circular Crop / Snip Icon Button (Matching Reference Screenshot)
            Surface(
                onClick = {
                    aiPromptMode = "crop"
                    activeAiExplanation =
                        "Diagram Snip Analysis — Fig. 2.2 (${chapter.title}):\n" +
                            "• Point A: Deflection when only Electric Field E is active (upward towards + plate).\n" +
                            "• Point C: Deflection when only Magnetic Field B is active (downward via right-hand rule).\n" +
                            "• Point B: Undeflected spot on the fluorescent ZnS screen when eE = evB, giving Thomson's specific charge ratio e / mₑ = E / (B² r)."
                    showTalkToAiSheet = true
                },
                shape = CircleShape,
                color = Color.White,
                shadowElevation = 8.dp,
                border = BorderStroke(1.dp, Color(0xFFE6E8EC)),
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .size(48.dp)
                    .testTag("reader_crop_snip_button")
            ) {
                Box(contentAlignment = Alignment.Center) {
                    // Crisp Crop Frame Icon drawn on Canvas matching the screenshot's crop icon
                    Canvas(modifier = Modifier.size(20.dp)) {
                        val s = size.width
                        val strokeW = 1.8.dp.toPx()
                        val col = Color(0xFF1F2937)
                        // Top-left L bracket extending left & top
                        drawLine(col, Offset(s * 0.26f, s * 0.08f), Offset(s * 0.26f, s * 0.74f), strokeW, StrokeCap.Round)
                        drawLine(col, Offset(s * 0.26f, s * 0.74f), Offset(s * 0.92f, s * 0.74f), strokeW, StrokeCap.Round)
                        // Top-right & bottom-right crop bracket
                        drawLine(col, Offset(s * 0.08f, s * 0.26f), Offset(s * 0.74f, s * 0.26f), strokeW, StrokeCap.Round)
                        drawLine(col, Offset(s * 0.74f, s * 0.26f), Offset(s * 0.74f, s * 0.92f), strokeW, StrokeCap.Round)
                    }
                }
            }
        }

        // Interactive "Talk to AI" Concept Tutor Sheet
        if (showTalkToAiSheet) {
            Surface(
                color = Color.Black.copy(alpha = 0.45f),
                modifier = Modifier
                    .fillMaxSize()
                    .testTag("talk_to_ai_modal")
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(18.dp),
                    contentAlignment = Alignment.BottomCenter
                ) {
                    Surface(
                        shape = RoundedCornerShape(26.dp),
                        color = Color.White,
                        shadowElevation = 16.dp,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(modifier = Modifier.padding(20.dp)) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                                ) {
                                    Surface(
                                        shape = CircleShape,
                                        color = Color(0xFFEEF2FF),
                                        modifier = Modifier.size(36.dp)
                                    ) {
                                        Box(contentAlignment = Alignment.Center) {
                                            Icon(
                                                imageVector = Icons.Default.AutoAwesome,
                                                contentDescription = null,
                                                tint = Color(0xFF3B66D6),
                                                modifier = Modifier.size(18.dp)
                                            )
                                        }
                                    }
                                    Column {
                                        Text(
                                            text = if (aiPromptMode == "crop") "Diagram Snip AI Breakdown" else "Talk to AI • Concept Tutor",
                                            fontFamily = OutfitDisplayFamily,
                                            fontWeight = FontWeight.SemiBold,
                                            fontSize = 16.sp,
                                            color = Color(0xFF111827)
                                        )
                                        Text(
                                            text = "Understand any textbook concept as many times as you want",
                                            fontFamily = InterFontFamily,
                                            fontWeight = FontWeight.Normal,
                                            fontSize = 11.5.sp,
                                            color = Color(0xFF6B7280)
                                        )
                                    }
                                }
                                IconButton(onClick = { showTalkToAiSheet = false }) {
                                    Icon(
                                        imageVector = Icons.Default.Cancel,
                                        contentDescription = "Close AI Tutor",
                                        tint = Color(0xFF9CA3AF)
                                    )
                                }
                            }

                            Spacer(modifier = Modifier.height(12.dp))

                            // Quick Concept Prompts Row
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                val quickPrompts = listOf(
                                    "Explain Fig. 2.2",
                                    "Intuition & Trick",
                                    "Chapter Formula"
                                )
                                quickPrompts.forEach { label ->
                                    Surface(
                                        onClick = {
                                            activeAiExplanation = when (label) {
                                                "Explain Fig. 2.2" ->
                                                    "In Fig. 2.2, electrons travel from Cathode to Anode. Electric field alone deflects them to A; Magnetic field alone deflects them to C; balanced fields (v = E/B) send them straight to B."
                                                "Intuition & Trick" ->
                                                    "IISER IAT Shortcut for ${chapter.title}: Always check dimensional consistency and limiting cases first. When electric and magnetic forces balance, particle velocity v = E/B is independent of charge-to-mass ratio!"
                                                else ->
                                                    "Core Formula Breakdown (${chapter.title}):\n${chapter.formulaHighlight}"
                                            }
                                        },
                                        shape = RoundedCornerShape(50),
                                        color = Color(0xFFF3F4F6),
                                        border = BorderStroke(1.dp, Color(0xFFE5E7EB))
                                    ) {
                                        Text(
                                            text = label,
                                            fontFamily = InterFontFamily,
                                            fontWeight = FontWeight.Medium,
                                            fontSize = 11.5.sp,
                                            color = Color(0xFF1F2937),
                                            modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
                                        )
                                    }
                                }
                            }

                            Spacer(modifier = Modifier.height(12.dp))

                            Surface(
                                shape = RoundedCornerShape(16.dp),
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
                                        "Ask a follow-up question on this concept...",
                                        fontSize = 12.5.sp
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
                                                "Concept Clarification for \"${customAiQuestion.trim()}\":\n" +
                                                    "In ${chapter.title}, remember that ${keyConceptBullets.firstOrNull() ?: "the fundamental conservation laws govern deflection and equilibrium"}. " +
                                                    "Key relation: ${chapter.formulaHighlight.lines().firstOrNull() ?: ""}"
                                            customAiQuestion = ""
                                        } else {
                                            showTalkToAiSheet = false
                                        }
                                    },
                                    shape = RoundedCornerShape(50),
                                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1F2937)),
                                    modifier = Modifier.weight(1f)
                                ) {
                                    Text(if (customAiQuestion.isNotBlank()) "Ask AI Tutor" else "Got It")
                                }

                                OutlinedButton(
                                    onClick = {
                                        showTalkToAiSheet = false
                                        onOpenAiTutor()
                                    },
                                    shape = RoundedCornerShape(50),
                                    modifier = Modifier.weight(1f)
                                ) {
                                    Text("Full Snap & Solve")
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

/**
 * Full-color labeled textbook diagram of Fig. 2.2 (J.J. Thomson's Cathode Ray Tube apparatus
 * to determine the charge-to-mass ratio of electron), matching the reference screenshot.
 */
@Composable
private fun TextbookCathodeRayApparatusDiagramCard() {
    Surface(
        shape = RoundedCornerShape(6.dp),
        color = Color.White,
        border = BorderStroke(1.dp, Color(0xFFECEFF4)),
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 10.dp)
        ) {
            Canvas(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(210.dp)
            ) {
                val w = size.width
                val h = size.height

                val labelPaint = android.graphics.Paint().apply {
                    isAntiAlias = true
                    color = android.graphics.Color.parseColor("#1F2937")
                    textSize = 10.5.sp.toPx()
                    typeface = android.graphics.Typeface.create(android.graphics.Typeface.SERIF, android.graphics.Typeface.NORMAL)
                }
                val boldLabelPaint = android.graphics.Paint().apply {
                    isAntiAlias = true
                    color = android.graphics.Color.parseColor("#111827")
                    textSize = 11.sp.toPx()
                    typeface = android.graphics.Typeface.create(android.graphics.Typeface.SANS_SERIF, android.graphics.Typeface.BOLD)
                }
                val polePaint = android.graphics.Paint().apply {
                    isAntiAlias = true
                    color = android.graphics.Color.WHITE
                    textSize = 10.sp.toPx()
                    typeface = android.graphics.Typeface.create(android.graphics.Typeface.SANS_SERIF, android.graphics.Typeface.BOLD)
                }

                // 1. Glass Cathode Ray Tube Outline (Left cylinder + expanding cone to right fluorescent screen)
                val tubeTopY = h * 0.25f
                val tubeBotY = h * 0.55f
                val neckX = w * 0.43f
                val screenCenterX = w * 0.80f
                val screenTopY = h * 0.08f
                val screenBotY = h * 0.74f

                val glassOutline = Path().apply {
                    moveTo(w * 0.09f, tubeTopY)
                    lineTo(neckX, tubeTopY)
                    lineTo(screenCenterX, screenTopY)
                    lineTo(screenCenterX, screenBotY)
                    lineTo(neckX, tubeBotY)
                    lineTo(w * 0.09f, tubeBotY)
                    close()
                }
                drawPath(
                    path = glassOutline,
                    color = Color(0xFFF8FAFC)
                )
                drawPath(
                    path = glassOutline,
                    color = Color(0xFF4B5563),
                    style = Stroke(width = 1.2.dp.toPx())
                )
                // Left rounded glass cap
                drawOval(
                    color = Color(0xFF4B5563),
                    topLeft = Offset(w * 0.06f, tubeTopY),
                    size = Size(w * 0.06f, tubeBotY - tubeTopY),
                    style = Stroke(width = 1.2.dp.toPx())
                )

                // 2. Right Fluorescent Screen (Amber-Gold Oval matching screenshot)
                val screenOvalTopLeft = Offset(w * 0.72f, screenTopY)
                val screenOvalSize = Size(w * 0.17f, screenBotY - screenTopY)
                drawOval(
                    brush = Brush.radialGradient(
                        colors = listOf(Color(0xFFFDE68A), Color(0xFFF59E0B)),
                        center = Offset(w * 0.80f, h * 0.41f),
                        radius = h * 0.36f
                    ),
                    topLeft = screenOvalTopLeft,
                    size = screenOvalSize
                )
                drawOval(
                    color = Color(0xFF6B7280),
                    topLeft = screenOvalTopLeft,
                    size = screenOvalSize,
                    style = Stroke(width = 1.2.dp.toPx())
                )

                // 3. Cathode & Anode Metal Discs inside Left Neck
                val cathodeX = w * 0.14f
                val anodeX = w * 0.27f
                // Cathode cylinder
                drawOval(
                    color = Color(0xFFD1D5DB),
                    topLeft = Offset(cathodeX - w * 0.025f, h * 0.31f),
                    size = Size(w * 0.05f, h * 0.18f)
                )
                drawOval(
                    color = Color(0xFF4B5563),
                    topLeft = Offset(cathodeX - w * 0.025f, h * 0.31f),
                    size = Size(w * 0.05f, h * 0.18f),
                    style = Stroke(width = 1.dp.toPx())
                )
                // Anode cylinder with central slit
                drawOval(
                    color = Color(0xFF9CA3AF),
                    topLeft = Offset(anodeX - w * 0.03f, h * 0.28f),
                    size = Size(w * 0.06f, h * 0.24f)
                )
                drawOval(
                    color = Color(0xFF374151),
                    topLeft = Offset(anodeX - w * 0.03f, h * 0.28f),
                    size = Size(w * 0.06f, h * 0.24f),
                    style = Stroke(width = 1.dp.toPx())
                )

                // High-Voltage Battery Circuit below Cathode & Anode
                val wireY = h * 0.64f
                drawLine(Color(0xFF1F2937), Offset(cathodeX, h * 0.40f), Offset(w * 0.05f, h * 0.40f), 1.2.dp.toPx())
                drawLine(Color(0xFF1F2937), Offset(w * 0.05f, h * 0.40f), Offset(w * 0.05f, wireY), 1.2.dp.toPx())
                drawLine(Color(0xFF1F2937), Offset(w * 0.05f, wireY), Offset(w * 0.16f, wireY), 1.2.dp.toPx())
                // Battery plates symbol ─|│|─
                for (b in 0..2) {
                    val bx = w * (0.165f + b * 0.018f)
                    drawLine(Color(0xFF1F2937), Offset(bx, wireY - 6.dp.toPx()), Offset(bx, wireY + 6.dp.toPx()), 1.4.dp.toPx())
                    drawLine(Color(0xFF1F2937), Offset(bx + w * 0.008f, wireY - 3.dp.toPx()), Offset(bx + w * 0.008f, wireY + 3.dp.toPx()), 2.dp.toPx())
                }
                drawLine(Color(0xFF1F2937), Offset(w * 0.22f, wireY), Offset(anodeX, wireY), 1.2.dp.toPx())
                drawLine(Color(0xFF1F2937), Offset(anodeX, wireY), Offset(anodeX, h * 0.52f), 1.2.dp.toPx())

                // 4. Electric Field Deflecting Plates: Upper Blue (+) Plate & Lower Amber (-) Plate
                val upperPlatePath = Path().apply {
                    moveTo(w * 0.43f, h * 0.27f)
                    lineTo(w * 0.54f, h * 0.27f)
                    lineTo(w * 0.58f, h * 0.32f)
                    lineTo(w * 0.47f, h * 0.32f)
                    close()
                }
                drawPath(upperPlatePath, Color(0xFF38BDF8))
                drawPath(upperPlatePath, Color(0xFF0284C7), style = Stroke(width = 1.dp.toPx()))
                // Blue vertical lead for + plate
                drawLine(Color(0xFF0284C7), Offset(w * 0.50f, h * 0.09f), Offset(w * 0.50f, h * 0.29f), 2.2.dp.toPx())

                val lowerPlatePath = Path().apply {
                    moveTo(w * 0.43f, h * 0.51f)
                    lineTo(w * 0.54f, h * 0.51f)
                    lineTo(w * 0.58f, h * 0.57f)
                    lineTo(w * 0.47f, h * 0.57f)
                    close()
                }
                drawPath(lowerPlatePath, Color(0xFFFBBF24))
                drawPath(lowerPlatePath, Color(0xFFD97706), style = Stroke(width = 1.dp.toPx()))
                // Red vertical lead for - plate
                drawLine(Color(0xFFDC2626), Offset(w * 0.50f, h * 0.55f), Offset(w * 0.50f, h * 0.85f), 2.2.dp.toPx())

                // 5. 3D Grey Horseshoe Magnet with N and S Poles
                val magnetPath = Path().apply {
                    moveTo(w * 0.40f, h * 0.29f)
                    lineTo(w * 0.46f, h * 0.35f)
                    lineTo(w * 0.42f, h * 0.42f)
                    lineTo(w * 0.42f, h * 0.63f)
                    lineTo(w * 0.57f, h * 0.77f)
                    lineTo(w * 0.57f, h * 0.60f)
                    lineTo(w * 0.52f, h * 0.54f)
                    lineTo(w * 0.58f, h * 0.49f)
                    lineTo(w * 0.64f, h * 0.56f)
                    lineTo(w * 0.64f, h * 0.87f)
                    lineTo(w * 0.56f, h * 0.91f)
                    lineTo(w * 0.35f, h * 0.69f)
                    lineTo(w * 0.35f, h * 0.36f)
                    close()
                }
                drawPath(magnetPath, Color(0xFF6B7280))
                drawPath(magnetPath, Color(0xFF374151), style = Stroke(width = 1.dp.toPx()))

                // 6. Red Cathode Ray Beam & 3 Trajectories to Points A, B, C on Fluorescent Screen
                val beamY = h * 0.40f
                val branchX = w * 0.48f
                val pointA = Offset(w * 0.79f, h * 0.21f)
                val pointB = Offset(w * 0.80f, h * 0.40f)
                val pointC = Offset(w * 0.79f, h * 0.60f)

                // Main horizontal beam from Cathode to deflection region
                drawLine(
                    color = Color(0xFFEF4444),
                    start = Offset(cathodeX, beamY),
                    end = Offset(branchX, beamY),
                    strokeWidth = 3.dp.toPx(),
                    cap = StrokeCap.Round
                )
                // Deflected Ray A (Electric Field only)
                drawLine(Color(0xFFDC2626), Offset(branchX, beamY), pointA, 1.6.dp.toPx())
                // Undeflected Ray B (Balanced E and B Fields)
                drawLine(Color(0xFFDC2626), Offset(branchX, beamY), pointB, 1.8.dp.toPx())
                // Deflected Ray C (Magnetic Field only)
                drawLine(Color(0xFFDC2626), Offset(branchX, beamY), pointC, 1.6.dp.toPx())

                // Red impact dots at A, B, C
                listOf(pointA, pointB, pointC).forEach { pt ->
                    drawCircle(Color(0xFFB91C1C), radius = 3.dp.toPx(), center = pt)
                }

                // 7. Labels & Pointer Lines (Cathode, Anode, +, -, N, S, A, B, C, Fluorescent screen, Magnet)
                val nc = drawContext.canvas.nativeCanvas
                // Cathode & Anode labels + pointer lines
                nc.drawText("Cathode", w * 0.04f, h * 0.19f, labelPaint)
                drawLine(Color(0xFF6B7280), Offset(w * 0.11f, h * 0.21f), Offset(cathodeX, h * 0.31f), 0.9.dp.toPx())

                nc.drawText("Anode", w * 0.19f, h * 0.19f, labelPaint)
                drawLine(Color(0xFF6B7280), Offset(w * 0.23f, h * 0.21f), Offset(anodeX, h * 0.28f), 0.9.dp.toPx())

                // + and - signs
                nc.drawText("+", w * 0.47f, h * 0.11f, boldLabelPaint)
                nc.drawText("–", w * 0.47f, h * 0.85f, boldLabelPaint)

                // N and S on Magnet poles
                nc.drawText("N", w * 0.405f, h * 0.36f, polePaint)
                nc.drawText("S", w * 0.555f, h * 0.56f, polePaint)

                // Points A, B, C on Fluorescent screen
                nc.drawText("A", pointA.x + 8.dp.toPx(), pointA.y + 4.dp.toPx(), boldLabelPaint)
                nc.drawText("B", pointB.x + 8.dp.toPx(), pointB.y + 4.dp.toPx(), boldLabelPaint)
                nc.drawText("C", pointC.x + 8.dp.toPx(), pointC.y + 4.dp.toPx(), boldLabelPaint)

                // Fluorescent screen & Magnet labels
                nc.drawText("Fluorescent screen", w * 0.67f, h * 0.83f, labelPaint)
                drawLine(Color(0xFF6B7280), Offset(w * 0.78f, h * 0.71f), Offset(w * 0.76f, h * 0.78f), 0.9.dp.toPx())

                nc.drawText("Magnet", w * 0.64f, h * 0.93f, labelPaint)
            }

            Spacer(modifier = Modifier.height(4.dp))

            // Italic Serif Caption Inside the Bottom of the Diagram Card (Matching Screenshot)
            Text(
                text = buildAnnotatedString {
                    withStyle(
                        SpanStyle(
                            fontFamily = AcademicSerifFamily,
                            fontWeight = FontWeight.Bold,
                            fontStyle = FontStyle.Italic,
                            color = Color(0xFF111827)
                        )
                    ) {
                        append("Fig. 2.2  ")
                    }
                    withStyle(
                        SpanStyle(
                            fontFamily = AcademicSerifFamily,
                            fontWeight = FontWeight.Normal,
                            fontStyle = FontStyle.Italic,
                            color = Color(0xFF1F2937)
                        )
                    ) {
                        append("The apparatus to determine the charge to mass ratio of electron")
                    }
                },
                fontSize = 11.5.sp,
                lineHeight = 16.sp,
                modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
            )
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
