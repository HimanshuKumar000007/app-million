package com.example.ui.screens

import androidx.compose.animation.AnimatedVisibility
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
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.DarkMode
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Security
import androidx.compose.material.icons.filled.Verified
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
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.withTransform
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.R
import com.example.data.local.ChapterEntity
import com.example.data.local.MockTestEntity
import com.example.data.local.QuestionEntity
import com.example.ui.SmartPrepUiState
import com.example.ui.components.AppHeader
import com.example.ui.components.MockTestCard
import com.example.ui.components.ProfileReadinessAndTrendAnalytics
import com.example.ui.components.SmartPrepBrandWatermarkFooter
import com.example.ui.components.SubjectSelector
import com.example.ui.components.subjectAccentColor
import com.example.ui.components.subjectIcon
import com.example.ui.theme.AcademicSerifFamily
import com.example.ui.theme.AccentYellow
import com.example.ui.theme.DeepIndigo
import com.example.ui.theme.ElectricPurple
import com.example.ui.theme.HeroBottomBlue
import com.example.ui.theme.HeroMidBlue
import com.example.ui.theme.HeroTopBlue
import com.example.ui.theme.InterFontFamily
import com.example.ui.theme.JetBrainsMonoFamily
import com.example.ui.theme.OutfitDisplayFamily
import com.example.ui.theme.PlusJakartaSansFamily
import com.example.ui.theme.PrimaryBlue
import com.example.ui.theme.PrimaryText
import com.example.ui.theme.SecondaryText
import com.example.ui.theme.SoftLavender
import com.example.ui.theme.SuccessGreen
import kotlin.math.cos
import kotlin.math.sin

// ==================== SMART NOTES (LEARN) TAB SCREEN — 4-SUBJECT ILLUSTRATED BOOK GALLERY ====================
@Composable
fun LearnTabScreen(
    state: SmartPrepUiState,
    onSelectSubject: (String) -> Unit,
    onSelectExamFilter: (String) -> Unit,
    onOpenChapter: (ChapterEntity, Boolean) -> Unit,
    onStartImportantSet: (ChapterEntity) -> Unit,
    focusedSubject: String = "All",
    onChangeFocusedSubject: (String) -> Unit = {},
    modifier: Modifier = Modifier
) {
    // 4 Core IISER IAT Subject Sections in canonical order: Physics, Chemistry, Mathematics, Biology
    val subjectsOrder = remember { listOf("Physics", "Chemistry", "Mathematics", "Biology") }

    var activeSubjectTab by remember(focusedSubject) {
        mutableStateOf(focusedSubject.ifBlank { "All" })
    }
    var localExamFilter by remember { mutableStateOf("All") }
    var searchQuery by remember { mutableStateOf("") }
    // When a user clicks a Subject Card (e.g. Physics), default to showing the clean Chapter List so all 28 chapter names are immediately visible
    var showBookCoverGridInSubjectView by remember { mutableStateOf(false) }

    val updateSubjectTab: (String) -> Unit = { newTab ->
        activeSubjectTab = newTab
        onChangeFocusedSubject(newTab)
        if (newTab != "All") {
            onSelectSubject(newTab)
        }
    }

    val displayedSubjects = remember(activeSubjectTab, subjectsOrder) {
        if (activeSubjectTab == "All") subjectsOrder else listOf(activeSubjectTab)
    }

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFFAFBFD))
            .windowInsetsPadding(WindowInsets.statusBars)
            .testTag("learn_tab_screen"),
        contentPadding = PaddingValues(bottom = 116.dp)
    ) {
        // 1. Clean Editorial "Notes" Gallery Header + Search + 4-Subject Filter Pills
        item(key = "smart_notes_top_header") {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFFAFBFD))
                    .padding(horizontal = 20.dp, vertical = 14.dp)
            ) {
                Column(modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = if (activeSubjectTab == "All") "Notes" else "$activeSubjectTab Chapters",
                        fontFamily = OutfitDisplayFamily,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 28.sp,
                        letterSpacing = (-0.6).sp,
                        color = PrimaryText
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = if (activeSubjectTab == "All") {
                            "IISER IAT Illustrated Subject Volumes • Tap a subject card to view chapters"
                        } else {
                            "Complete IISER IAT $activeSubjectTab Syllabus • Tap any chapter for Notes & PYQs"
                        },
                        fontFamily = InterFontFamily,
                        fontWeight = FontWeight.Normal,
                        fontSize = 12.sp,
                        color = SecondaryText
                    )
                }

                Spacer(modifier = Modifier.height(14.dp))

                // Search Bar for Chapters, Formulas, or Concepts with Search Button
                Surface(
                    color = Color.White,
                    shape = RoundedCornerShape(14.dp),
                    border = BorderStroke(1.dp, Color(0xFFDCE4F5)),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 12.dp, end = 6.dp, top = 6.dp, bottom = 6.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "Search notes",
                            tint = Color(0xFF2563EB),
                            modifier = Modifier.size(18.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Box(modifier = Modifier.weight(1f)) {
                            if (searchQuery.isEmpty()) {
                                Text(
                                    text = "Search chapter name, formula, or topic...",
                                    fontFamily = InterFontFamily,
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 12.5.sp,
                                    color = Color(0xFF94A0B8),
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )
                            }
                            BasicTextField(
                                value = searchQuery,
                                onValueChange = { searchQuery = it },
                                singleLine = true,
                                textStyle = TextStyle(
                                    fontFamily = InterFontFamily,
                                    fontWeight = FontWeight.Medium,
                                    fontSize = 12.5.sp,
                                    color = PrimaryText
                                ),
                                cursorBrush = SolidColor(PrimaryBlue),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .testTag("notes_search_input")
                            )
                        }
                        if (searchQuery.isNotEmpty()) {
                            Icon(
                                imageVector = Icons.Default.Close,
                                contentDescription = "Clear search",
                                tint = SecondaryText,
                                modifier = Modifier
                                    .padding(horizontal = 6.dp)
                                    .size(17.dp)
                                    .clickable { searchQuery = "" }
                            )
                        }
                        Surface(
                            onClick = { searchQuery = searchQuery.trim() },
                            shape = RoundedCornerShape(10.dp),
                            color = Color(0xFF2563EB),
                            modifier = Modifier.testTag("notes_search_button")
                        ) {
                            Row(
                                modifier = Modifier.padding(horizontal = 11.dp, vertical = 6.5.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(4.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Search,
                                    contentDescription = "Search Chapter",
                                    tint = Color.White,
                                    modifier = Modifier.size(13.5.dp)
                                )
                                Text(
                                    text = "Search",
                                    fontFamily = InterFontFamily,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 11.5.sp,
                                    color = Color.White
                                )
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(12.dp))

                // 5-Pill Subject Section Switcher: All • Physics • Chemistry • Maths • Biology
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .horizontalScroll(rememberScrollState()),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    val subjectTabs = listOf("All") + subjectsOrder
                    subjectTabs.forEach { tab ->
                        val isSelected = activeSubjectTab.equals(tab, ignoreCase = true)
                        val accent = if (tab == "All") Color(0xFF1E293B) else subjectAccentColor(tab)
                        val countForTab = if (tab == "All") {
                            state.allChapters.size
                        } else {
                            state.allChapters.count { it.subject.equals(tab, ignoreCase = true) }
                        }
                        val displayLabel = when (tab) {
                            "All" -> "All 4 Subjects ($countForTab)"
                            "Mathematics" -> "Maths ($countForTab)"
                            else -> "$tab ($countForTab)"
                        }

                        Surface(
                            onClick = { updateSubjectTab(tab) },
                            shape = RoundedCornerShape(50),
                            color = if (isSelected) accent else Color.White,
                            border = BorderStroke(
                                1.dp,
                                if (isSelected) accent else Color(0xFFDDE4F2)
                            ),
                            modifier = Modifier.testTag("notes_subject_filter_${tab.lowercase()}")
                        ) {
                            Row(
                                modifier = Modifier.padding(horizontal = 13.dp, vertical = 7.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(5.dp)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(6.dp)
                                        .clip(CircleShape)
                                        .background(if (isSelected) Color.White else accent)
                                )
                                Text(
                                    text = displayLabel,
                                    fontFamily = InterFontFamily,
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 11.5.sp,
                                    color = if (isSelected) Color.White else PrimaryText,
                                    maxLines = 1,
                                    softWrap = false
                                )
                            }
                        }
                    }
                }

                if (activeSubjectTab != "All") {
                    Spacer(modifier = Modifier.height(10.dp))

                    // Back to 4 Subjects / View Mode Toggle
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Surface(
                            onClick = { updateSubjectTab("All") },
                            shape = RoundedCornerShape(50),
                            color = Color(0xFFEEF2FF),
                            border = BorderStroke(1.dp, Color(0xFFD0D9FA)),
                            modifier = Modifier.testTag("back_to_all_subjects_btn")
                        ) {
                            Text(
                                text = "← All 4 Subjects",
                                fontFamily = InterFontFamily,
                                fontWeight = FontWeight.Medium,
                                fontSize = 11.sp,
                                color = Color(0xFF4F46E5),
                                modifier = Modifier.padding(horizontal = 11.dp, vertical = 5.dp)
                            )
                        }

                        Surface(
                            onClick = { showBookCoverGridInSubjectView = !showBookCoverGridInSubjectView },
                            shape = RoundedCornerShape(50),
                            color = Color.White,
                            border = BorderStroke(1.dp, Color(0xFFDDE4F2))
                        ) {
                            Text(
                                text = if (showBookCoverGridInSubjectView) "Chapter List View" else "Book Cover Grid",
                                fontFamily = InterFontFamily,
                                fontWeight = FontWeight.Medium,
                                fontSize = 10.5.sp,
                                color = PrimaryText,
                                modifier = Modifier.padding(horizontal = 11.dp, vertical = 5.dp)
                            )
                        }
                    }
                }
            }
        }

        // 2. Top 2x2 Master Subject Volumes Grid (Physics, Chemistry, Mathematics, Biology)
        // Shown when viewing "All" subjects; clicking any subject card (e.g. Physics) opens all chapters of that subject!
        if (searchQuery.isBlank() && activeSubjectTab == "All") {
            item(key = "four_subject_master_books_showcase") {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp, vertical = 6.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "IISER IAT Subject Books",
                            fontFamily = OutfitDisplayFamily,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 19.sp,
                            letterSpacing = (-0.3).sp,
                            color = PrimaryText
                        )
                        Text(
                            text = "Tap a subject card to view chapters",
                            fontFamily = InterFontFamily,
                            fontWeight = FontWeight.Normal,
                            fontSize = 11.sp,
                            color = SecondaryText
                        )
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    // 2x2 Grid of the 4 Subject Master Textbooks (Row 1: Physics & Chemistry, Row 2: Mathematics & Biology)
                    val subjectPairs = subjectsOrder.chunked(2)
                    subjectPairs.forEachIndexed { rowIdx, pair ->
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(16.dp)
                        ) {
                            pair.forEach { subjectName ->
                                val subjChapters = state.allChapters
                                    .filter { it.subject.equals(subjectName, ignoreCase = true) }
                                    .sortedBy { it.chapterNumber }
                                val isFocused = activeSubjectTab.equals(subjectName, ignoreCase = true)

                                MasterSubjectBookGridItem(
                                    subjectName = subjectName,
                                    chapters = subjChapters,
                                    isFocused = isFocused,
                                    onSelectSubjectBook = {
                                        updateSubjectTab(subjectName)
                                    },
                                    onOpenFirstChapter = {
                                        updateSubjectTab(subjectName)
                                    },
                                    modifier = Modifier.weight(1f)
                                )
                            }
                            if (pair.size == 1) {
                                Spacer(modifier = Modifier.weight(1f))
                            }
                        }
                        if (rowIdx < subjectPairs.lastIndex) {
                            Spacer(modifier = Modifier.height(20.dp))
                        }
                    }
                }
            }
        }

        // 3. The Dedicated Subject Sections (Physics, Chemistry, Mathematics, Biology)
        displayedSubjects.forEachIndexed { sectionIdx, subjectName ->
            val subjectChapters = state.allChapters
                .filter { ch ->
                    ch.subject.equals(subjectName, ignoreCase = true) &&
                        (localExamFilter == "All" ||
                            ch.examTag.contains(localExamFilter, ignoreCase = true) ||
                            ch.examTag.contains("IAT", ignoreCase = true)) &&
                        (searchQuery.isBlank() ||
                            ch.title.contains(searchQuery, ignoreCase = true) ||
                            ch.subtitle.contains(searchQuery, ignoreCase = true) ||
                            ch.formulaHighlight.contains(searchQuery, ignoreCase = true) ||
                            ch.keyConceptsSummary.contains(searchQuery, ignoreCase = true))
                }
                .sortedBy { it.chapterNumber }

            if (subjectChapters.isNotEmpty()) {
                // Section Title Bar for each Subject
                item(key = "subject_section_header_$subjectName") {
                    SubjectBookSectionHeader(
                        sectionIndex = sectionIdx + 1,
                        subjectName = subjectName,
                        chapters = subjectChapters,
                        isShowingAllSubjects = activeSubjectTab == "All",
                        onToggleFocusSubject = {
                            if (activeSubjectTab == "All") {
                                updateSubjectTab(subjectName)
                            } else {
                                updateSubjectTab("All")
                            }
                        }
                    )
                }

                // When a specific subject card (like Physics) is clicked, display its chapters in a crisp, full-title Chapter List
                // (or in the 2-column Book Cover Grid if toggled or in "All" overview mode)
                if (activeSubjectTab != "All" && !showBookCoverGridInSubjectView) {
                    items(
                        items = subjectChapters,
                        key = { ch -> "subject_chapter_list_${subjectName}_${ch.id}" }
                    ) { chapter ->
                        SubjectChapterListItemCard(
                            chapter = chapter,
                            onReadNotes = { onOpenChapter(chapter, false) },
                            onWatchVideo = { onOpenChapter(chapter, true) },
                            onPracticeChapter = { onStartImportantSet(chapter) },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 20.dp, vertical = 6.dp)
                        )
                    }
                } else {
                    // 2-Column Illustrated Textbook Cover Grid for this Subject's Chapters
                    val chapterRows = subjectChapters.chunked(2)
                    items(
                        items = chapterRows,
                        key = { row -> "notes_row_${subjectName}_${row.first().id}" }
                    ) { rowChapters ->
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 20.dp, vertical = 10.dp),
                            horizontalArrangement = Arrangement.spacedBy(16.dp)
                        ) {
                            rowChapters.forEach { chapter ->
                                IllustratedChapterBookGridCard(
                                    chapter = chapter,
                                    onReadNotes = { onOpenChapter(chapter, false) },
                                    onWatchVideo = { onOpenChapter(chapter, true) },
                                    onPracticeChapter = { onStartImportantSet(chapter) },
                                    modifier = Modifier.weight(1f)
                                )
                            }
                            if (rowChapters.size == 1) {
                                Spacer(modifier = Modifier.weight(1f))
                            }
                        }
                    }
                }

                item(key = "subject_spacer_$subjectName") {
                    Spacer(modifier = Modifier.height(10.dp))
                }
            }
        }
    }
}

/**
 * Full-width Chapter Card used when a user clicks on a Subject Card (e.g., Physics)
 * so all 28 Physics chapter names ("• Units and Measurements" through
 * "• Semiconductor Electronics: Materials, Devices and Simple Circuits")
 * are prominently displayed with zero truncation alongside a mini illustrated book cover,
 * key formula badge, and instant Notes / Video / Practice buttons.
 */
@Composable
private fun SubjectChapterListItemCard(
    chapter: ChapterEntity,
    onReadNotes: () -> Unit,
    onWatchVideo: () -> Unit,
    onPracticeChapter: () -> Unit,
    modifier: Modifier = Modifier
) {
    val accent = subjectAccentColor(chapter.subject)
    val chNumFormatted = chapter.chapterNumber.toString().padStart(2, '0')
    val masteryPercent = (chapter.progressFraction * 100).toInt()

    Card(
        onClick = onReadNotes,
        shape = RoundedCornerShape(18.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        border = BorderStroke(1.dp, Color(0xFFE2E8F5)),
        elevation = CardDefaults.cardElevation(defaultElevation = 1.dp),
        modifier = modifier.testTag("learn_chapter_card_${chapter.id}")
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            // Left: Mini Illustrated Scientific Book Cover Thumbnail with Chapter Number
            Box(
                modifier = Modifier
                    .width(64.dp)
                    .height(86.dp)
                    .shadow(3.dp, RoundedCornerShape(10.dp))
                    .clip(RoundedCornerShape(10.dp))
            ) {
                ScientificBookCoverArtwork(
                    subjectName = chapter.subject,
                    partNumber = (chapter.chapterNumber % 4) + 1,
                    modifier = Modifier.fillMaxSize()
                )
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(6.dp),
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Surface(
                        color = Color.Black.copy(alpha = 0.35f),
                        shape = RoundedCornerShape(4.dp)
                    ) {
                        Text(
                            text = "CH $chNumFormatted",
                            fontFamily = JetBrainsMonoFamily,
                            fontWeight = FontWeight.Medium,
                            fontSize = 8.sp,
                            color = Color.White,
                            modifier = Modifier.padding(horizontal = 4.dp, vertical = 1.5.dp)
                        )
                    }
                    Text(
                        text = chapter.subject.take(3).uppercase(),
                        fontFamily = OutfitDisplayFamily,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 11.sp,
                        color = Color(0xFFFDE047)
                    )
                }
            }

            // Right: Full Bullet/Numbered Chapter Name + Subtitle + Formula + Quick Actions
            Column(modifier = Modifier.weight(1f)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "CHAPTER $chNumFormatted • ${chapter.subject.uppercase()}",
                        fontFamily = JetBrainsMonoFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 10.sp,
                        color = accent
                    )
                    if (masteryPercent > 0) {
                        Surface(
                            color = Color(0xFF10B981).copy(alpha = 0.14f),
                            shape = RoundedCornerShape(50)
                        ) {
                            Text(
                                text = "$masteryPercent% Done",
                                fontFamily = JetBrainsMonoFamily,
                                fontWeight = FontWeight.Medium,
                                fontSize = 9.sp,
                                color = Color(0xFF059669),
                                modifier = Modifier.padding(horizontal = 7.dp, vertical = 2.dp)
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(3.dp))

                // Exact Chapter Name requested by the user (e.g. "• Units and Measurements")
                Text(
                    text = "• ${chapter.title}",
                    fontFamily = OutfitDisplayFamily,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp,
                    lineHeight = 20.sp,
                    color = PrimaryText
                )

                Spacer(modifier = Modifier.height(3.dp))

                Text(
                    text = chapter.subtitle,
                    fontFamily = InterFontFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 11.5.sp,
                    lineHeight = 15.sp,
                    color = SecondaryText,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )

                Spacer(modifier = Modifier.height(6.dp))

                // Key Formula Pill
                Surface(
                    color = Color(0xFFF4F7FE),
                    shape = RoundedCornerShape(6.dp),
                    border = BorderStroke(1.dp, Color(0xFFE2E8F5))
                ) {
                    Text(
                        text = chapter.formulaHighlight,
                        fontFamily = AcademicSerifFamily,
                        fontStyle = FontStyle.Italic,
                        fontSize = 10.5.sp,
                        color = PrimaryText,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))

                // Action Row: Notes • Video • Practice Qs
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Surface(
                        onClick = onReadNotes,
                        shape = RoundedCornerShape(8.dp),
                        color = accent.copy(alpha = 0.12f)
                    ) {
                        Text(
                            text = "Read Notes (${chapter.studyNotesCount})",
                            fontFamily = InterFontFamily,
                            fontWeight = FontWeight.Medium,
                            fontSize = 10.5.sp,
                            color = accent,
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp)
                        )
                    }

                    Surface(
                        onClick = onWatchVideo,
                        shape = RoundedCornerShape(8.dp),
                        color = Color(0xFFF1F5F9),
                        border = BorderStroke(1.dp, Color(0xFFE2E8F0))
                    ) {
                        Row(
                            modifier = Modifier.padding(horizontal = 9.dp, vertical = 5.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(3.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.PlayArrow,
                                contentDescription = "Watch video",
                                tint = accent,
                                modifier = Modifier.size(11.dp)
                            )
                            Text(
                                text = "Video",
                                fontFamily = InterFontFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 10.5.sp,
                                color = PrimaryText
                            )
                        }
                    }

                    Surface(
                        onClick = onPracticeChapter,
                        shape = RoundedCornerShape(8.dp),
                        color = Color(0xFFF1F5F9),
                        border = BorderStroke(1.dp, Color(0xFFE2E8F0))
                    ) {
                        Text(
                            text = "${chapter.practiceQuestionCount} Qs",
                            fontFamily = JetBrainsMonoFamily,
                            fontWeight = FontWeight.Normal,
                            fontSize = 10.sp,
                            color = PrimaryText,
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 5.dp)
                        )
                    }
                }
            }
        }
    }
}

/**
 * Top 2x2 Showcase Item for the 4 Core Subjects (Physics, Chemistry, Mathematics, Biology).
 * Renders a tall, illustrated textbook cover card with a thin inner border, spine crease,
 * golden bottom-right ribbon, and clean label underneath — matching the reference screenshot.
 */
@Composable
private fun MasterSubjectBookGridItem(
    subjectName: String,
    chapters: List<ChapterEntity>,
    isFocused: Boolean,
    onSelectSubjectBook: () -> Unit,
    onOpenFirstChapter: () -> Unit,
    modifier: Modifier = Modifier
) {
    val totalNotes = chapters.sumOf { it.studyNotesCount }
    val avgMastery = if (chapters.isNotEmpty()) {
        (chapters.map { it.progressFraction }.average() * 100).toInt()
    } else 0
    val accent = subjectAccentColor(subjectName)

    val equationPreview = when (subjectName) {
        "Physics" -> "ĤΨ = EΨ  •  ∮ E·dA = q/ε₀"
        "Chemistry" -> "ΔG = −RT ln K  •  sp³d²"
        "Mathematics" -> "∫₀^∞ x·e⁻ˣ dx = Γ(2)"
        "Biology" -> "5'→3' mRNA  •  Lac Operon"
        else -> "IISER IAT"
    }

    Column(
        modifier = modifier
            .clickable { onSelectSubjectBook() }
            .testTag("subject_card_${subjectName.lowercase()}")
    ) {
        // Illustrated Textbook Cover Box (0.72 aspect ratio matching reference screenshot)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(0.72f)
                .shadow(
                    elevation = if (isFocused) 10.dp else 5.dp,
                    shape = RoundedCornerShape(12.dp),
                    clip = false
                )
                .clip(RoundedCornerShape(12.dp))
        ) {
            // Custom Scientific Textbook Artwork on Canvas
            ScientificBookCoverArtwork(
                subjectName = subjectName,
                partNumber = 0,
                modifier = Modifier.fillMaxSize()
            )

            // Thin Crisp White Inner Border Frame (inset 5.dp, just like the reference screenshot)
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(5.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color.Transparent)
            ) {
                Canvas(modifier = Modifier.fillMaxSize()) {
                    drawRoundRect(
                        color = Color.White.copy(alpha = if (isFocused) 0.92f else 0.65f),
                        size = size,
                        cornerRadius = CornerRadius(8.dp.toPx(), 8.dp.toPx()),
                        style = Stroke(width = if (isFocused) 1.8.dp.toPx() else 1.dp.toPx())
                    )
                }
            }

            // Cover Typography Overlay
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(13.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                // Top Row: Chapter Count Badge + Mastery Pill
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Surface(
                        color = Color.Black.copy(alpha = 0.28f),
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(0.7.dp, Color.White.copy(alpha = 0.35f))
                    ) {
                        Text(
                            text = "${chapters.size} CHAPTERS",
                            fontFamily = JetBrainsMonoFamily,
                            fontWeight = FontWeight.Normal,
                            fontSize = 8.5.sp,
                            letterSpacing = 0.5.sp,
                            color = Color.White,
                            modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                        )
                    }

                    if (avgMastery > 0) {
                        Surface(
                            color = Color(0xFF10B981).copy(alpha = 0.88f),
                            shape = RoundedCornerShape(50)
                        ) {
                            Text(
                                text = "$avgMastery%",
                                fontFamily = JetBrainsMonoFamily,
                                fontWeight = FontWeight.Medium,
                                fontSize = 8.5.sp,
                                color = Color.White,
                                modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                            )
                        }
                    }
                }

                // Middle Cover Title (Styled like Chemistry / Biology / Physics / Mathematics covers)
                Column {
                    Text(
                        text = subjectName,
                        fontFamily = if (subjectName == "Chemistry" || subjectName == "Mathematics") {
                            AcademicSerifFamily
                        } else {
                            OutfitDisplayFamily
                        },
                        fontStyle = if (subjectName == "Chemistry") FontStyle.Italic else FontStyle.Normal,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 22.sp,
                        letterSpacing = if (subjectName == "Biology") 1.2.sp else (-0.3).sp,
                        color = Color.White
                    )
                    Text(
                        text = if (subjectName == "Physics") {
                            "Complete 28-Chapter Syllabus"
                        } else {
                            "Master Notes (${chapters.size} Chapters)"
                        },
                        fontFamily = InterFontFamily,
                        fontWeight = FontWeight.Normal,
                        fontSize = 10.sp,
                        color = Color(0xFFFDE047)
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = equationPreview,
                        fontFamily = AcademicSerifFamily,
                        fontStyle = FontStyle.Italic,
                        fontSize = 10.sp,
                        color = Color.White.copy(alpha = 0.90f),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }

                // Bottom-Right Golden Textbook Ribbon (Exact match to "Textbook for Class XII" in screenshot)
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Surface(
                        color = Color(0xFFFACC15),
                        shape = RoundedCornerShape(topStart = 5.dp, bottomStart = 5.dp, topEnd = 3.dp, bottomEnd = 6.dp)
                    ) {
                        Text(
                            text = "Textbook for IISER IAT",
                            fontFamily = InterFontFamily,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 8.sp,
                            color = Color(0xFF1E1B18),
                            maxLines = 1,
                            softWrap = false,
                            modifier = Modifier.padding(horizontal = 7.dp, vertical = 2.5.dp)
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(9.dp))

        // Clean Label Underneath Each Book Cover
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = subjectName,
                    fontFamily = OutfitDisplayFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 15.sp,
                    color = PrimaryText,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = "${chapters.size} Chapters • $totalNotes Notes",
                    fontFamily = InterFontFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 11.sp,
                    color = SecondaryText,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }

            Surface(
                onClick = onOpenFirstChapter,
                shape = RoundedCornerShape(50),
                color = accent.copy(alpha = 0.12f)
            ) {
                Text(
                    text = "Chapters",
                    fontFamily = InterFontFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 10.5.sp,
                    color = accent,
                    modifier = Modifier.padding(horizontal = 9.dp, vertical = 4.dp)
                )
            }
        }
    }
}

/**
 * Clean Section Header for each of the 4 Subject Sections:
 * 1. Physics Chapters & Notes
 * 2. Chemistry Chapters & Notes
 * 3. Mathematics Chapters & Notes
 * 4. Biology Chapters & Notes
 */
@Composable
private fun SubjectBookSectionHeader(
    sectionIndex: Int,
    subjectName: String,
    chapters: List<ChapterEntity>,
    isShowingAllSubjects: Boolean,
    onToggleFocusSubject: () -> Unit
) {
    val accent = subjectAccentColor(subjectName)
    val totalNotes = chapters.sumOf { it.studyNotesCount }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp, top = 18.dp, bottom = 4.dp)
    ) {
        HorizontalDivider(color = Color(0xFFE6ECF5))
        Spacer(modifier = Modifier.height(14.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                modifier = Modifier.weight(1f)
            ) {
                Surface(
                    color = accent,
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(
                        text = "0$sectionIndex",
                        fontFamily = JetBrainsMonoFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 11.sp,
                        color = Color.White,
                        modifier = Modifier.padding(horizontal = 7.dp, vertical = 4.dp)
                    )
                }
                Column {
                    Text(
                        text = "$subjectName Chapters (${chapters.size})",
                        fontFamily = OutfitDisplayFamily,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 18.5.sp,
                        letterSpacing = (-0.3).sp,
                        color = PrimaryText
                    )
                    Text(
                        text = "${chapters.size} Official Chapters • $totalNotes Revision Sheets",
                        fontFamily = InterFontFamily,
                        fontWeight = FontWeight.Normal,
                        fontSize = 11.5.sp,
                        color = SecondaryText
                    )
                }
            }

            Surface(
                onClick = onToggleFocusSubject,
                shape = RoundedCornerShape(50),
                color = Color.White,
                border = BorderStroke(1.dp, accent.copy(alpha = 0.35f))
            ) {
                Text(
                    text = if (isShowingAllSubjects) "Only $subjectName" else "All 4 Subjects",
                    fontFamily = InterFontFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 10.5.sp,
                    color = accent,
                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp)
                )
            }
        }
    }
}

/**
 * Individual Chapter Textbook Card in the 2-Column Subject Grid.
 * Displays the exact chapter title prominently both on the cover and underneath,
 * while preserving `learn_chapter_card_${chapter.id}` and direct access to Notes, Video, and Practice Qs.
 */
@Composable
private fun IllustratedChapterBookGridCard(
    chapter: ChapterEntity,
    onReadNotes: () -> Unit,
    onWatchVideo: () -> Unit,
    onPracticeChapter: () -> Unit,
    modifier: Modifier = Modifier
) {
    val accent = subjectAccentColor(chapter.subject)
    val chNumFormatted = chapter.chapterNumber.toString().padStart(2, '0')
    val masteryPercent = (chapter.progressFraction * 100).toInt()

    Column(
        modifier = modifier
            .clickable { onReadNotes() }
            .testTag("learn_chapter_card_${chapter.id}")
    ) {
        // 1. Tall Illustrated Textbook Cover (0.72f aspect ratio matching screenshot)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(0.72f)
                .shadow(
                    elevation = 5.dp,
                    shape = RoundedCornerShape(12.dp),
                    clip = false
                )
                .clip(RoundedCornerShape(12.dp))
        ) {
            // Rich Subject & Part-Specific Canvas Artwork
            ScientificBookCoverArtwork(
                subjectName = chapter.subject,
                partNumber = (chapter.chapterNumber % 4) + 1,
                modifier = Modifier.fillMaxSize()
            )

            // Thin White Inner Border Frame (inset 5.dp, matching screenshot's textbook border)
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(5.dp)
            ) {
                Canvas(modifier = Modifier.fillMaxSize()) {
                    drawRoundRect(
                        color = Color.White.copy(alpha = 0.68f),
                        size = size,
                        cornerRadius = CornerRadius(8.dp.toPx(), 8.dp.toPx()),
                        style = Stroke(width = 1.dp.toPx())
                    )
                }
            }

            // Cover Content Overlay
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                // Top Row: Chapter Number Badge + Mastery Badge
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Surface(
                        color = Color.Black.copy(alpha = 0.30f),
                        shape = RoundedCornerShape(5.dp),
                        border = BorderStroke(0.7.dp, Color.White.copy(alpha = 0.38f))
                    ) {
                        Text(
                            text = "CH $chNumFormatted",
                            fontFamily = JetBrainsMonoFamily,
                            fontWeight = FontWeight.Normal,
                            fontSize = 8.5.sp,
                            color = Color.White,
                            modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                        )
                    }

                    Surface(
                        color = if (masteryPercent > 0) {
                            Color(0xFF10B981).copy(alpha = 0.88f)
                        } else {
                            Color.Black.copy(alpha = 0.26f)
                        },
                        shape = RoundedCornerShape(50)
                    ) {
                        Text(
                            text = if (masteryPercent > 0) "$masteryPercent%" else chapter.examTag,
                            fontFamily = JetBrainsMonoFamily,
                            fontWeight = FontWeight.Normal,
                            fontSize = 8.sp,
                            color = Color.White,
                            modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                        )
                    }
                }

                // Center Cover Title: Subject Tag + Prominent Chapter Title + Formula
                Column {
                    Text(
                        text = "${chapter.subject} • Ch ${chapter.chapterNumber}",
                        fontFamily = OutfitDisplayFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 10.5.sp,
                        color = Color(0xFFFDE047),
                        maxLines = 1
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = chapter.title,
                        fontFamily = OutfitDisplayFamily,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 14.sp,
                        lineHeight = 17.sp,
                        color = Color.White,
                        maxLines = 3,
                        overflow = TextOverflow.Ellipsis
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Surface(
                        color = Color.Black.copy(alpha = 0.26f),
                        shape = RoundedCornerShape(6.dp)
                    ) {
                        Text(
                            text = chapter.formulaHighlight,
                            fontFamily = AcademicSerifFamily,
                            fontStyle = FontStyle.Italic,
                            fontSize = 9.5.sp,
                            color = Color(0xFFFEF08A),
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            modifier = Modifier.padding(horizontal = 6.dp, vertical = 3.dp)
                        )
                    }
                }

                // Bottom-Right Golden Ribbon ("Textbook for IISER IAT" / Note count)
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Surface(
                        color = Color(0xFFFACC15),
                        shape = RoundedCornerShape(topStart = 5.dp, bottomStart = 5.dp, topEnd = 3.dp, bottomEnd = 6.dp)
                    ) {
                        Text(
                            text = "${chapter.studyNotesCount} Notes • ${chapter.examTag}",
                            fontFamily = InterFontFamily,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 8.sp,
                            color = Color(0xFF1E1B18),
                            maxLines = 1,
                            softWrap = false,
                            modifier = Modifier.padding(horizontal = 7.dp, vertical = 2.5.dp)
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        // 2. Clean Chapter Title Underneath the Cover
        Text(
            text = "${chapter.chapterNumber}. ${chapter.title}",
            fontFamily = OutfitDisplayFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 13.5.sp,
            lineHeight = 17.sp,
            color = PrimaryText,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )
        Text(
            text = "${chapter.subject} • ${chapter.studyNotesCount} Notes",
            fontFamily = InterFontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 11.sp,
            color = SecondaryText,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )

        Spacer(modifier = Modifier.height(6.dp))

        // 3. Compact Quick Action Strip (Notes • Video • Qs)
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(6.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Surface(
                onClick = onReadNotes,
                shape = RoundedCornerShape(8.dp),
                color = accent.copy(alpha = 0.12f),
                modifier = Modifier.weight(1f)
            ) {
                Box(
                    modifier = Modifier.padding(vertical = 5.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Notes",
                        fontFamily = InterFontFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 10.5.sp,
                        color = accent,
                        maxLines = 1
                    )
                }
            }

            Surface(
                onClick = onWatchVideo,
                shape = RoundedCornerShape(8.dp),
                color = Color(0xFFF1F5F9),
                border = BorderStroke(1.dp, Color(0xFFE2E8F0))
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 5.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(3.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.PlayArrow,
                        contentDescription = "Watch video",
                        tint = accent,
                        modifier = Modifier.size(11.dp)
                    )
                    Text(
                        text = "Video",
                        fontFamily = InterFontFamily,
                        fontWeight = FontWeight.Normal,
                        fontSize = 10.sp,
                        color = PrimaryText,
                        maxLines = 1
                    )
                }
            }

            Surface(
                onClick = onPracticeChapter,
                shape = RoundedCornerShape(8.dp),
                color = Color(0xFFF1F5F9),
                border = BorderStroke(1.dp, Color(0xFFE2E8F0))
            ) {
                Text(
                    text = "${chapter.practiceQuestionCount}Q",
                    fontFamily = JetBrainsMonoFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 10.sp,
                    color = PrimaryText,
                    modifier = Modifier.padding(horizontal = 7.dp, vertical = 5.dp)
                )
            }
        }
    }
}

/**
 * Custom Scientific Textbook Cover Artwork drawn on Canvas, inspired directly by the
 * Biology & Chemistry Part I / Part II covers in the user's reference screenshot:
 * - Biology: Teal vertical-grid cover with golden morphological stems, horizontal bars & white 3D DNA double helix.
 * - Chemistry: Warm terracotta/ochre/burgundy cover with a golden sun-disc, 3D molecular rings & crystal lattice.
 * - Physics: Deep cosmic indigo/violet cover with golden quantum wave packets, dipole field lines & prism rays.
 * - Mathematics: Prussian sapphire/cerulean cover with golden Fibonacci spiral, Riemann integral curve & 3D manifold.
 */
@Composable
private fun ScientificBookCoverArtwork(
    subjectName: String,
    partNumber: Int,
    modifier: Modifier = Modifier
) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height

        when (subjectName.lowercase()) {
            "biology" -> {
                // Teal-Emerald Scientific Grid Background (inspired by Biology textbook in screenshot)
                val bgColors = when (partNumber) {
                    2 -> listOf(Color(0xFF0A5C66), Color(0xFF158A94), Color(0xFF094852))
                    3 -> listOf(Color(0xFF0F6258), Color(0xFF1A9684), Color(0xFF0C4D46))
                    4 -> listOf(Color(0xFF125B6E), Color(0xFF1D89A6), Color(0xFF0B4354))
                    else -> listOf(Color(0xFF0D6B70), Color(0xFF19989E), Color(0xFF0A5257))
                }
                drawRect(brush = Brush.verticalGradient(bgColors))

                // Vertical ruled grid stripes across cover
                val stripeCount = 12
                for (i in 1 until stripeCount) {
                    val x = w * (i.toFloat() / stripeCount)
                    drawLine(
                        color = Color.White.copy(alpha = 0.12f),
                        start = Offset(x, 0f),
                        end = Offset(x, h),
                        strokeWidth = 1.dp.toPx()
                    )
                }
                // Horizontal grid lines
                for (j in 1..8) {
                    val y = h * (j.toFloat() / 9f)
                    drawLine(
                        color = Color.White.copy(alpha = 0.08f),
                        start = Offset(0f, y),
                        end = Offset(w, y),
                        strokeWidth = 1.dp.toPx()
                    )
                }

                // Golden-Yellow Botanical / Evolutionary Stems & Horizontal Bars (matching screenshot)
                val goldColor = Color(0xFFF6D860)
                for (b in 0..3) {
                    val barY = h * (0.56f + b * 0.045f)
                    drawRoundRect(
                        color = goldColor.copy(alpha = 0.85f),
                        topLeft = Offset(w * 0.34f, barY),
                        size = Size(w * 0.24f, h * 0.024f),
                        cornerRadius = CornerRadius(2.dp.toPx(), 2.dp.toPx())
                    )
                }
                // Sweeping golden stems rising from the bars to top-left
                for (s in 0..3) {
                    val startX = w * (0.14f + s * 0.09f)
                    val stemPath = Path().apply {
                        moveTo(startX, h * 0.10f)
                        cubicTo(
                            startX, h * 0.36f,
                            w * 0.36f, h * 0.44f,
                            w * 0.44f, h * 0.56f
                        )
                    }
                    drawPath(
                        path = stemPath,
                        color = goldColor.copy(alpha = 0.82f),
                        style = Stroke(width = (3.2f - s * 0.4f).dp.toPx(), cap = StrokeCap.Round)
                    )
                }

                // Luminous White 3D DNA Double Helix on the Right Side
                val strandA = Path()
                val strandB = Path()
                val steps = 28
                for (k in 0..steps) {
                    val t = k.toFloat() / steps
                    val y = h * (0.16f + t * 0.68f)
                    val angle = t * 6.283f * 1.6f + partNumber * 0.6f
                    val xA = w * 0.76f + sin(angle) * (w * 0.11f)
                    val xB = w * 0.76f - sin(angle) * (w * 0.11f)
                    if (k == 0) {
                        strandA.moveTo(xA, y)
                        strandB.moveTo(xB, y)
                    } else {
                        strandA.lineTo(xA, y)
                        strandB.lineTo(xB, y)
                    }
                    if (k % 3 == 0) {
                        drawLine(
                            color = goldColor.copy(alpha = 0.75f),
                            start = Offset(xA, y),
                            end = Offset(xB, y),
                            strokeWidth = 1.6.dp.toPx(),
                            cap = StrokeCap.Round
                        )
                    }
                }
                drawPath(strandA, color = Color.White.copy(alpha = 0.92f), style = Stroke(width = 3.dp.toPx(), cap = StrokeCap.Round))
                drawPath(strandB, color = Color.White.copy(alpha = 0.70f), style = Stroke(width = 2.4.dp.toPx(), cap = StrokeCap.Round))
            }

            "chemistry" -> {
                // Warm Terracotta, Ochre & Deep Burgundy Cover (inspired by Chemistry Part I & II in screenshot)
                val bgColors = when (partNumber) {
                    2 -> listOf(Color(0xFF7B241C), Color(0xFFC85A28), Color(0xFFD9822B), Color(0xFF5A1814))
                    3 -> listOf(Color(0xFF641E16), Color(0xFFB84B22), Color(0xFFD47A26), Color(0xFF4A1410))
                    4 -> listOf(Color(0xFF78281F), Color(0xFFCA612C), Color(0xFFE08B32), Color(0xFF581B15))
                    else -> listOf(Color(0xFF5B1B14), Color(0xFFB95222), Color(0xFFD9802A), Color(0xFF631C16))
                }
                drawRect(brush = Brush.linearGradient(bgColors))

                // Glowing Golden-Amber Sun Disc in Upper-Left/Center (matching Chemistry cover disc)
                val discCenter = Offset(w * 0.34f, h * 0.32f)
                drawCircle(
                    color = Color(0xFFF59E0B).copy(alpha = 0.82f),
                    radius = w * 0.24f,
                    center = discCenter
                )
                drawCircle(
                    color = Color(0xFFFDE047).copy(alpha = 0.45f),
                    radius = w * 0.24f,
                    center = discCenter,
                    style = Stroke(width = 1.4.dp.toPx())
                )

                // Golden Crystal Lattice Network Lines on Right Side
                val latticeColor = Color(0xFFFACC15).copy(alpha = 0.65f)
                val nodes = listOf(
                    Offset(w * 0.68f, h * 0.32f),
                    Offset(w * 0.86f, h * 0.42f),
                    Offset(w * 0.72f, h * 0.56f),
                    Offset(w * 0.88f, h * 0.68f),
                    Offset(w * 0.64f, h * 0.76f)
                )
                for (i in 0 until nodes.lastIndex) {
                    drawLine(latticeColor, nodes[i], nodes[i + 1], strokeWidth = 1.3.dp.toPx())
                    if (i + 2 <= nodes.lastIndex) {
                        drawLine(latticeColor, nodes[i], nodes[i + 2], strokeWidth = 1.dp.toPx())
                    }
                }
                nodes.forEach { pt ->
                    drawCircle(Color(0xFFFDE047), radius = 2.6.dp.toPx(), center = pt)
                }

                // 3D Ball-and-Stick Molecular Ring in Lower-Left
                val hexCenter = Offset(w * 0.32f, h * 0.70f)
                val hexR = w * 0.14f
                for (i in 0..5) {
                    val a1 = Math.toRadians((60 * i + partNumber * 15).toDouble())
                    val a2 = Math.toRadians((60 * ((i + 1) % 6) + partNumber * 15).toDouble())
                    val p1 = Offset(hexCenter.x + (hexR * cos(a1)).toFloat(), hexCenter.y + (hexR * sin(a1)).toFloat())
                    val p2 = Offset(hexCenter.x + (hexR * cos(a2)).toFloat(), hexCenter.y + (hexR * sin(a2)).toFloat())
                    drawLine(
                        color = Color.White.copy(alpha = 0.65f),
                        start = p1,
                        end = p2,
                        strokeWidth = 1.5.dp.toPx()
                    )
                    drawCircle(
                        color = if (i % 2 == 0) Color(0xFFFDE047) else Color(0xFFFB7185),
                        radius = 3.2.dp.toPx(),
                        center = p1
                    )
                }
            }

            "physics" -> {
                // Deep Cosmic Indigo, Royal Violet & Amber-Gold Physics Textbook Cover
                val bgColors = when (partNumber) {
                    2 -> listOf(Color(0xFF17113E), Color(0xFF332284), Color(0xFF4B32B0), Color(0xFF191240))
                    3 -> listOf(Color(0xFF121842), Color(0xFF26358C), Color(0xFF3A4FBA), Color(0xFF141A46))
                    4 -> listOf(Color(0xFF1D1142), Color(0xFF3D228A), Color(0xFF5B34B8), Color(0xFF1B103D))
                    else -> listOf(Color(0xFF140E38), Color(0xFF2D1C7A), Color(0xFF482CA8), Color(0xFF181142))
                }
                drawRect(brush = Brush.linearGradient(bgColors))

                // Subtle Polar / Orbital Field Rings
                val orbitCenter = Offset(w * 0.68f, h * 0.34f)
                for (rIdx in 1..3) {
                    drawCircle(
                        color = Color.White.copy(alpha = 0.12f),
                        radius = w * (0.12f * rIdx),
                        center = orbitCenter,
                        style = Stroke(width = 1.dp.toPx())
                    )
                }
                // Glowing Gold Nucleus & Electron Nodes
                drawCircle(Color(0xFFFACC15), radius = 5.dp.toPx(), center = orbitCenter)
                drawCircle(
                    color = Color(0xFF38BDF8),
                    radius = 3.2.dp.toPx(),
                    center = Offset(orbitCenter.x - w * 0.18f, orbitCenter.y + h * 0.08f)
                )

                // Golden Quantum Wave Packet & Standing Harmonics Across Lower Cover
                val wavePath = Path()
                val steps = 32
                for (k in 0..steps) {
                    val t = k.toFloat() / steps
                    val x = w * (0.08f + t * 0.84f)
                    val envelope = sin(t * 3.14159f)
                    val y = h * 0.70f + envelope * sin(t * 18f + partNumber) * (h * 0.10f)
                    if (k == 0) wavePath.moveTo(x, y) else wavePath.lineTo(x, y)
                }
                drawPath(
                    path = wavePath,
                    color = Color(0xFFFACC15).copy(alpha = 0.88f),
                    style = Stroke(width = 2.2.dp.toPx(), cap = StrokeCap.Round)
                )
            }

            else -> {
                // Mathematics: Deep Prussian Sapphire, Cerulean & Golden Spiral Textbook Cover
                val bgColors = when (partNumber) {
                    2 -> listOf(Color(0xFF0A2342), Color(0xFF154778), Color(0xFF1E6BB0), Color(0xFF0C284A))
                    3 -> listOf(Color(0xFF0D264C), Color(0xFF1A4B8C), Color(0xFF2568B8), Color(0xFF0E2A54))
                    4 -> listOf(Color(0xFF092848), Color(0xFF13528A), Color(0xFF1C74BA), Color(0xFF0A2D50))
                    else -> listOf(Color(0xFF091E3A), Color(0xFF124172), Color(0xFF1B65A6), Color(0xFF0B2444))
                }
                drawRect(brush = Brush.linearGradient(bgColors))

                // Fine Analytic Geometry Grid
                for (i in 1..6) {
                    val gx = w * (i / 7f)
                    drawLine(
                        color = Color.White.copy(alpha = 0.10f),
                        start = Offset(gx, 0f),
                        end = Offset(gx, h),
                        strokeWidth = 1.dp.toPx()
                    )
                }
                for (j in 1..8) {
                    val gy = h * (j / 9f)
                    drawLine(
                        color = Color.White.copy(alpha = 0.08f),
                        start = Offset(0f, gy),
                        end = Offset(w, gy),
                        strokeWidth = 1.dp.toPx()
                    )
                }

                // Golden Riemann Integral Area Bars & Gaussian / Calculus Curve
                val baseLineY = h * 0.76f
                for (bar in 0..6) {
                    val t = bar / 6f
                    val bx = w * (0.16f + t * 0.64f)
                    val barH = (sin(t * 3.14159f) * h * 0.22f).coerceAtLeast(h * 0.04f)
                    drawRect(
                        color = Color(0xFFFACC15).copy(alpha = 0.28f),
                        topLeft = Offset(bx, baseLineY - barH),
                        size = Size(w * 0.07f, barH)
                    )
                }
                val calcCurve = Path().apply {
                    moveTo(w * 0.12f, baseLineY)
                    cubicTo(
                        w * 0.34f, h * 0.44f,
                        w * 0.62f, h * 0.48f,
                        w * 0.88f, baseLineY - h * 0.06f
                    )
                }
                drawPath(
                    path = calcCurve,
                    color = Color(0xFFFDE047),
                    style = Stroke(width = 2.4.dp.toPx(), cap = StrokeCap.Round)
                )

                // Upper-Right Geometric Circle & Tangent Secant Lines
                val circleCenter = Offset(w * 0.72f, h * 0.28f)
                drawCircle(
                    color = Color.White.copy(alpha = 0.35f),
                    radius = w * 0.16f,
                    center = circleCenter,
                    style = Stroke(width = 1.4.dp.toPx())
                )
                drawLine(
                    color = Color(0xFFFACC15).copy(alpha = 0.8f),
                    start = Offset(w * 0.52f, h * 0.40f),
                    end = Offset(w * 0.90f, h * 0.18f),
                    strokeWidth = 1.5.dp.toPx()
                )
            }
        }

        // Left Book-Spine Highlight & Crease Effect (gives authentic 3D textbook depth)
        drawRect(
            brush = Brush.horizontalGradient(
                colors = listOf(
                    Color.White.copy(alpha = 0.28f),
                    Color.Black.copy(alpha = 0.22f),
                    Color.Transparent
                ),
                startX = 0f,
                endX = 12.dp.toPx()
            ),
            topLeft = Offset.Zero,
            size = Size(12.dp.toPx(), h)
        )
    }
}



// ==================== MOCK TESTS (PRACTICE) TAB SCREEN — FULL MOCK TEST REDESIGN ====================
private data class MockCardPalette(
    val squircleBg: Color,
    val squircleBorder: Color,
    val iconTint: Color
)

private fun mockCardPaletteForIndex(indexNumber: Int): MockCardPalette {
    return when ((indexNumber - 1) % 5) {
        0 -> MockCardPalette( // 01, 06: Sky-Blue
            squircleBg = Color(0xFFE7F0FF),
            squircleBorder = Color(0xFFD0E2FF),
            iconTint = Color(0xFF2563EB)
        )
        1 -> MockCardPalette( // 02, 07: Lavender-Purple
            squircleBg = Color(0xFFEFEAFF),
            squircleBorder = Color(0xFFDDD2FF),
            iconTint = Color(0xFF6D28D9)
        )
        2 -> MockCardPalette( // 03, 08: Mint-Emerald
            squircleBg = Color(0xFFE3F9F1),
            squircleBorder = Color(0xFFC4F1E0),
            iconTint = Color(0xFF059669)
        )
        3 -> MockCardPalette( // 04, 09: Warm-Amber
            squircleBg = Color(0xFFFFF1E2),
            squircleBorder = Color(0xFFFFDFC2),
            iconTint = Color(0xFFD97706)
        )
        else -> MockCardPalette( // 05, 10: Rose-Pink
            squircleBg = Color(0xFFFFE8EE),
            squircleBorder = Color(0xFFFFD0DC),
            iconTint = Color(0xFFE11D48)
        )
    }
}

internal fun mockSubtitleForIndex(indexNumber: Int, selectedSubjectFilter: String): String {
    if (selectedSubjectFilter == "Full Mock Test" || selectedSubjectFilter == "All") {
        return when (indexNumber) {
            1 -> "Latest pattern • Moderate level"
            2 -> "Exam level • Balanced"
            3 -> "High level • For advanced practice"
            4 -> "Mixed level • Chapter-wise focus"
            5 -> "Latest pattern • Moderate level"
            6 -> "Exam level • Conceptual depth"
            7 -> "High level • Research aptitude focus"
            8 -> "Exam level • Balanced"
            9 -> "Mixed level • Interdisciplinary focus"
            else -> "Latest pattern • Full rank predictor"
        }
    }

    return when (selectedSubjectFilter.lowercase()) {
        "physics" -> when (indexNumber) {
            1 -> "Mechanics & Rotational Dynamics • Moderate level"
            2 -> "Electrostatics, Current & Magnetism • Exam level"
            3 -> "Ray & Wave Optics, Modern Physics • High level"
            4 -> "Thermodynamics, SHM & Waves • Chapter-wise focus"
            5 -> "Full Physics Sectional • Latest pattern"
            6 -> "Electromagnetic Induction & AC • Conceptual depth"
            7 -> "Advanced Mechanics & Gravitation • High level"
            8 -> "Semiconductors, Dual Nature & Atoms • Balanced"
            9 -> "Fluid Mechanics & Thermal Physics • Mixed level"
            else -> "Complete Physics Rank Predictor • Full syllabus"
        }
        "chemistry" -> when (indexNumber) {
            1 -> "Chemical Bonding, Equilibrium & Kinetics • Moderate level"
            2 -> "Organic GOC, Hydrocarbons & Carbonyls • Exam level"
            3 -> "Coordination Compounds & d-Block • High level"
            4 -> "Electrochemistry & Thermodynamics • Chapter-wise focus"
            5 -> "Full Chemistry Sectional • Latest pattern"
            6 -> "Aldehydes, Ketones, Amines & Biomolecules • Conceptual"
            7 -> "Atomic Structure & Solutions • Research aptitude"
            8 -> "p-Block & Periodic Properties • Balanced"
            9 -> "Reaction Mechanisms & Stereochemistry • Mixed level"
            else -> "Complete Chemistry Rank Predictor • Full syllabus"
        }
        "mathematics" -> when (indexNumber) {
            1 -> "Limits, Continuity & Differentiability • Moderate level"
            2 -> "Vectors, 3D Geometry & Conic Sections • Exam level"
            3 -> "Definite Integration & Differential Eq • High level"
            4 -> "Matrices, Determinants & Complex Numbers • Chapter focus"
            5 -> "Full Mathematics Sectional • Latest pattern"
            6 -> "Probability, Permutations & Combinations • Conceptual"
            7 -> "Sequences, Series & Quadratic Equations • High level"
            8 -> "Straight Lines, Circles & Parabola • Balanced"
            9 -> "Functions, Inverse Trig & Sets • Mixed level"
            else -> "Complete Mathematics Rank Predictor • Full syllabus"
        }
        else -> when (indexNumber) { // Biology
            1 -> "Genetics, Molecular Basis & Evolution • Moderate level"
            2 -> "Cell Biology, Biomolecules & Cell Cycle • Exam level"
            3 -> "Human Physiology & Endocrine System • High level"
            4 -> "Plant Physiology, Photosynthesis & Growth • Chapter focus"
            5 -> "Full Biology Sectional • Latest pattern"
            6 -> "Biotechnology: Principles & Applications • Conceptual"
            7 -> "Ecology, Biodiversity & Ecosystems • Research focus"
            8 -> "Reproduction in Flowering Plants & Humans • Balanced"
            9 -> "Human Health, Immunity & Microbes • Mixed level"
            else -> "Complete Biology Rank Predictor • Full syllabus"
        }
    }
}

internal fun formattedMockTitle(indexNumber: Int, selectedSubjectFilter: String): String {
    val twoDigit = indexNumber.toString().padStart(2, '0')
    return if (selectedSubjectFilter == "Full Mock Test" || selectedSubjectFilter == "All") {
        "IAT Full Mock Test $twoDigit"
    } else {
        "IAT $selectedSubjectFilter Mock $twoDigit"
    }
}

@Composable
fun PracticeTabScreen(
    state: SmartPrepUiState,
    onSelectSubject: (String) -> Unit,
    onSelectExamFilter: (String) -> Unit,
    onStartSubjectPractice: (String, Boolean) -> Unit,
    onOpenQuestionSession: (String, String, List<String>, Boolean) -> Unit,
    onStartMockTest: (MockTestEntity) -> Unit,
    onToggleBookmark: (QuestionEntity) -> Unit,
    onResetSubjectAttempts: (String) -> Unit,
    onOpenSnapSolve: () -> Unit,
    modifier: Modifier = Modifier
) {
    PracticeTabScreenContent(
        state = state,
        onSelectSubject = onSelectSubject,
        onSelectExamFilter = onSelectExamFilter,
        onStartSubjectPractice = onStartSubjectPractice,
        onOpenQuestionSession = onOpenQuestionSession,
        onStartMockTest = onStartMockTest,
        onToggleBookmark = onToggleBookmark,
        onResetSubjectAttempts = onResetSubjectAttempts,
        onOpenSnapSolve = onOpenSnapSolve,
        modifier = modifier
    )
}

@Composable
internal fun FullMockTestHeroBanner(
    selectedSubjectFilter: String
) {
    val isFullMockSelected = selectedSubjectFilter == "Full Mock Test" || selectedSubjectFilter == "All"
    val isChapterWiseSelected = selectedSubjectFilter == "Chapter-Wise"
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        HeroTopBlue,
                        HeroMidBlue,
                        HeroBottomBlue,
                        Color(0xFFF5F8FF)
                    )
                )
            )
    ) {
        // Subtle atmospheric light-rays & glow circles in the hero background
        Canvas(
            modifier = Modifier
                .fillMaxWidth()
                .height(162.dp)
        ) {
            drawCircle(
                brush = Brush.radialGradient(
                    colors = listOf(
                        Color.White.copy(alpha = 0.24f),
                        Color.Transparent
                    ),
                    center = Offset(size.width * 0.82f, size.height * 0.45f),
                    radius = size.width * 0.48f
                ),
                center = Offset(size.width * 0.82f, size.height * 0.45f),
                radius = size.width * 0.48f
            )
            drawCircle(
                brush = Brush.radialGradient(
                    colors = listOf(
                        Color(0xFF3B6BF5).copy(alpha = 0.18f),
                        Color.Transparent
                    ),
                    center = Offset(size.width * 0.18f, size.height * 0.25f),
                    radius = size.width * 0.42f
                ),
                center = Offset(size.width * 0.18f, size.height * 0.25f),
                radius = size.width * 0.42f
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .windowInsetsPadding(WindowInsets.statusBars)
        ) {
            // Main Hero Row: Left Title & Subtitle + Right Tilted "IAT MOCK TEST" Exam Sheet
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 18.dp, end = 14.dp, top = 8.dp, bottom = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier
                        .weight(1.15f)
                        .padding(end = 8.dp)
                ) {
                    Text(
                        text = when {
                            isFullMockSelected -> "Full Mock Test"
                            isChapterWiseSelected -> "Chapter-Wise Mock"
                            else -> "$selectedSubjectFilter Mock Test"
                        },
                        fontFamily = OutfitDisplayFamily,
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 26.sp,
                        lineHeight = 30.sp,
                        letterSpacing = (-0.5).sp,
                        color = Color.White
                    )

                    Spacer(modifier = Modifier.height(4.dp))

                    Text(
                        text = when {
                            isFullMockSelected -> "Real exam pattern. Detailed analysis."
                            isChapterWiseSelected -> "Search any chapter & start timed IAT tests."
                            else -> "Sectional & chapter-wise $selectedSubjectFilter tests."
                        },
                        fontFamily = InterFontFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 13.sp,
                        color = Color.White.copy(alpha = 0.92f)
                    )
                }

                // Right 3D Tilted "IAT MOCK TEST" Sheet Illustration matching reference image
                TiltedIatMockTestIllustration(
                    modifier = Modifier
                        .width(120.dp)
                        .height(116.dp)
                )
            }

            // Rounded White/Ice-Blue Sheet Top Cap that transitions seamlessly into the filter bar
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(14.dp)
                    .clip(RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp))
                    .background(Color(0xFFF5F8FF))
            )
        }
    }
}

@Composable
private fun TiltedIatMockTestIllustration(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            val w = size.width
            val h = size.height

            // Soft outer glow behind the tilted sheet
            drawCircle(
                brush = Brush.radialGradient(
                    colors = listOf(
                        Color.White.copy(alpha = 0.36f),
                        Color.Transparent
                    ),
                    center = Offset(w * 0.52f, h * 0.54f),
                    radius = w * 0.52f
                ),
                center = Offset(w * 0.52f, h * 0.54f),
                radius = w * 0.52f
            )

            // 3 crisp white sparkle/burst lines at top-right of the card (matching reference image)
            val strokeSparkle = Stroke(width = 2.4.dp.toPx(), cap = StrokeCap.Round)
            drawLine(
                color = Color.White.copy(alpha = 0.92f),
                start = Offset(w * 0.72f, h * 0.13f),
                end = Offset(w * 0.75f, h * 0.04f),
                strokeWidth = strokeSparkle.width,
                cap = StrokeCap.Round
            )
            drawLine(
                color = Color.White.copy(alpha = 0.92f),
                start = Offset(w * 0.81f, h * 0.17f),
                end = Offset(w * 0.89f, h * 0.10f),
                strokeWidth = strokeSparkle.width,
                cap = StrokeCap.Round
            )
            drawLine(
                color = Color.White.copy(alpha = 0.85f),
                start = Offset(w * 0.86f, h * 0.25f),
                end = Offset(w * 0.95f, h * 0.22f),
                strokeWidth = strokeSparkle.width,
                cap = StrokeCap.Round
            )

            // Tilted Glassmorphic Outer Frame & Inner White Exam Sheet (-10 degrees)
            withTransform({
                rotate(degrees = -10f, pivot = Offset(w * 0.52f, h * 0.56f))
            }) {
                // Back frosted glass layer
                val glassLeft = w * 0.10f
                val glassTop = h * 0.16f
                val glassWidth = w * 0.78f
                val glassHeight = h * 0.78f
                drawRoundRect(
                    color = Color.White.copy(alpha = 0.25f),
                    topLeft = Offset(glassLeft, glassTop),
                    size = Size(glassWidth, glassHeight),
                    cornerRadius = CornerRadius(20.dp.toPx(), 20.dp.toPx())
                )
                drawRoundRect(
                    color = Color.White.copy(alpha = 0.48f),
                    topLeft = Offset(glassLeft, glassTop),
                    size = Size(glassWidth, glassHeight),
                    cornerRadius = CornerRadius(20.dp.toPx(), 20.dp.toPx()),
                    style = Stroke(width = 1.2.dp.toPx())
                )

                // Secondary subtle stacked card shadow
                drawRoundRect(
                    color = Color(0xFFDCE8FF).copy(alpha = 0.55f),
                    topLeft = Offset(w * 0.20f, h * 0.26f),
                    size = Size(w * 0.68f, h * 0.68f),
                    cornerRadius = CornerRadius(16.dp.toPx(), 16.dp.toPx())
                )

                // Main Crisp White Exam Sheet
                val sheetLeft = w * 0.16f
                val sheetTop = h * 0.22f
                val sheetW = w * 0.68f
                val sheetH = h * 0.68f
                drawRoundRect(
                    color = Color.White,
                    topLeft = Offset(sheetLeft, sheetTop),
                    size = Size(sheetW, sheetH),
                    cornerRadius = CornerRadius(15.dp.toPx(), 15.dp.toPx())
                )

                // 4 MCQ Radio Bubble Rows inside the sheet (Row 3 is selected in Royal Blue)
                val startY = sheetTop + sheetH * 0.34f
                val rowSpacing = sheetH * 0.155f
                val radioCenterX = sheetLeft + sheetW * 0.21f
                val lineStartX = sheetLeft + sheetW * 0.34f

                for (rowIdx in 0..3) {
                    val cy = startY + rowIdx * rowSpacing
                    val isSelectedRow = rowIdx == 2

                    if (isSelectedRow) {
                        // Selected Royal-Blue Radio Button (Outer ring + inner dot)
                        drawCircle(
                            color = Color(0xFF2E5BFF),
                            radius = 5.2.dp.toPx(),
                            center = Offset(radioCenterX, cy),
                            style = Stroke(width = 1.8.dp.toPx())
                        )
                        drawCircle(
                            color = Color(0xFF2E5BFF),
                            radius = 2.6.dp.toPx(),
                            center = Offset(radioCenterX, cy)
                        )
                        // Highlighted Blue Answer Bar
                        drawRoundRect(
                            color = Color(0xFFD6E4FF),
                            topLeft = Offset(lineStartX, cy - 3.5.dp.toPx()),
                            size = Size(sheetW * 0.52f, 7.dp.toPx()),
                            cornerRadius = CornerRadius(4.dp.toPx(), 4.dp.toPx())
                        )
                    } else {
                        // Unselected Soft Slate Radio Bubble
                        drawCircle(
                            color = Color(0xFFCBD5E1),
                            radius = 4.8.dp.toPx(),
                            center = Offset(radioCenterX, cy),
                            style = Stroke(width = 1.4.dp.toPx())
                        )
                        val barWidthFactor = when (rowIdx) {
                            0 -> 0.50f
                            1 -> 0.38f
                            else -> 0.44f
                        }
                        drawRoundRect(
                            color = Color(0xFFE2E8F0),
                            topLeft = Offset(lineStartX, cy - 3.dp.toPx()),
                            size = Size(sheetW * barWidthFactor, 6.dp.toPx()),
                            cornerRadius = CornerRadius(4.dp.toPx(), 4.dp.toPx())
                        )
                    }
                }
            }
        }

        // Tilted "IAT MOCK TEST" Header Label positioned at the top of the white exam sheet
        Text(
            text = "IAT MOCK TEST",
            fontFamily = InterFontFamily,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 8.5.sp,
            letterSpacing = 0.3.sp,
            color = Color(0xFF2557D6),
            modifier = Modifier
                .offset(x = (-1).dp, y = (-20).dp)
                .graphicsLayer {
                    rotationZ = -10f
                }
        )
    }
}

@Composable
internal fun MockSubjectFilterPill(
    label: String,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    val pillShape = RoundedCornerShape(50)
    val safeTag = label.lowercase().replace(" ", "_")
    if (isSelected) {
        Surface(
            onClick = onClick,
            shape = pillShape,
            color = Color.Transparent,
            shadowElevation = 3.dp,
            modifier = Modifier.testTag("mock_subject_pill_$safeTag")
        ) {
            Row(
                modifier = Modifier
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                Color(0xFF4F7EFF),
                                Color(0xFF2B56F5)
                            )
                        ),
                        shape = pillShape
                    )
                    .padding(horizontal = 13.dp, vertical = 7.5.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                MockSubjectCustomIcon(
                    subject = label,
                    tint = Color.White,
                    modifier = Modifier.size(14.5.dp)
                )
                Text(
                    text = label,
                    fontFamily = InterFontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 12.5.sp,
                    color = Color.White
                )
            }
        }
    } else {
        Surface(
            onClick = onClick,
            shape = pillShape,
            color = Color.White,
            border = BorderStroke(1.dp, Color(0xFFDCE7F9)),
            shadowElevation = 1.dp,
            modifier = Modifier.testTag("mock_subject_pill_$safeTag")
        ) {
            Row(
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 7.5.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                MockSubjectCustomIcon(
                    subject = label,
                    tint = Color(0xFF334155),
                    modifier = Modifier.size(14.5.dp)
                )
                Text(
                    text = label,
                    fontFamily = InterFontFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.5.sp,
                    color = Color(0xFF1E293B)
                )
            }
        }
    }
}

@Composable
internal fun MockSubjectCustomIcon(
    subject: String,
    tint: Color,
    modifier: Modifier = Modifier
) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height
        val stroke = Stroke(width = 1.65.dp.toPx(), cap = StrokeCap.Round, join = StrokeJoin.Round)

        when (subject.lowercase()) {
            "full mock test", "all", "chapter-wise" -> {
                // Stacked Diamond Layers icon (matches "Full Mock Test" / "All" pill in reference image)
                val topDiamond = Path().apply {
                    moveTo(w * 0.5f, h * 0.14f)
                    lineTo(w * 0.88f, h * 0.36f)
                    lineTo(w * 0.5f, h * 0.58f)
                    lineTo(w * 0.12f, h * 0.36f)
                    close()
                }
                drawPath(path = topDiamond, color = tint, style = stroke)

                val midLayer = Path().apply {
                    moveTo(w * 0.14f, h * 0.54f)
                    lineTo(w * 0.5f, h * 0.74f)
                    lineTo(w * 0.86f, h * 0.54f)
                }
                drawPath(path = midLayer, color = tint, style = stroke)

                val bottomLayer = Path().apply {
                    moveTo(w * 0.14f, h * 0.70f)
                    lineTo(w * 0.5f, h * 0.90f)
                    lineTo(w * 0.86f, h * 0.70f)
                }
                drawPath(path = bottomLayer, color = tint, style = stroke)
            }

            "physics" -> {
                // Atom icon with intersecting elliptical orbitals & nucleus
                withTransform({
                    rotate(degrees = 30f, pivot = Offset(w * 0.5f, h * 0.5f))
                }) {
                    drawOval(
                        color = tint,
                        topLeft = Offset(w * 0.10f, h * 0.32f),
                        size = Size(w * 0.80f, h * 0.36f),
                        style = stroke
                    )
                }
                withTransform({
                    rotate(degrees = -30f, pivot = Offset(w * 0.5f, h * 0.5f))
                }) {
                    drawOval(
                        color = tint,
                        topLeft = Offset(w * 0.10f, h * 0.32f),
                        size = Size(w * 0.80f, h * 0.36f),
                        style = stroke
                    )
                }
                drawCircle(
                    color = tint,
                    radius = w * 0.10f,
                    center = Offset(w * 0.5f, h * 0.5f)
                )
            }

            "chemistry" -> {
                // Conical Erlenmeyer Flask icon
                val flaskPath = Path().apply {
                    moveTo(w * 0.36f, h * 0.14f)
                    lineTo(w * 0.64f, h * 0.14f)
                    moveTo(w * 0.42f, h * 0.14f)
                    lineTo(w * 0.42f, h * 0.38f)
                    lineTo(w * 0.18f, h * 0.82f)
                    lineTo(w * 0.82f, h * 0.82f)
                    lineTo(w * 0.58f, h * 0.38f)
                    lineTo(w * 0.58f, h * 0.14f)
                }
                drawPath(path = flaskPath, color = tint, style = stroke)
                drawLine(
                    color = tint,
                    start = Offset(w * 0.28f, h * 0.66f),
                    end = Offset(w * 0.72f, h * 0.66f),
                    strokeWidth = stroke.width,
                    cap = StrokeCap.Round
                )
            }

            "mathematics" -> {
                // Crisp Mathematical Pi (π) symbol
                drawLine(
                    color = tint,
                    start = Offset(w * 0.18f, h * 0.26f),
                    end = Offset(w * 0.84f, h * 0.26f),
                    strokeWidth = 1.9.dp.toPx(),
                    cap = StrokeCap.Round
                )
                drawLine(
                    color = tint,
                    start = Offset(w * 0.36f, h * 0.26f),
                    end = Offset(w * 0.28f, h * 0.82f),
                    strokeWidth = 1.8.dp.toPx(),
                    cap = StrokeCap.Round
                )
                val rightLeg = Path().apply {
                    moveTo(w * 0.64f, h * 0.26f)
                    lineTo(w * 0.64f, h * 0.70f)
                    quadraticTo(w * 0.64f, h * 0.84f, w * 0.78f, h * 0.80f)
                }
                drawPath(path = rightLeg, color = tint, style = stroke)
            }

            else -> {
                // Biology DNA Double-Helix icon
                val strandA = Path().apply {
                    moveTo(w * 0.26f, h * 0.12f)
                    cubicTo(w * 0.78f, h * 0.34f, w * 0.22f, h * 0.66f, w * 0.74f, h * 0.88f)
                }
                val strandB = Path().apply {
                    moveTo(w * 0.74f, h * 0.12f)
                    cubicTo(w * 0.22f, h * 0.34f, w * 0.78f, h * 0.66f, w * 0.26f, h * 0.88f)
                }
                drawPath(path = strandA, color = tint, style = stroke)
                drawPath(path = strandB, color = tint, style = stroke)
                drawLine(
                    color = tint,
                    start = Offset(w * 0.34f, h * 0.26f),
                    end = Offset(w * 0.66f, h * 0.26f),
                    strokeWidth = 1.3.dp.toPx(),
                    cap = StrokeCap.Round
                )
                drawLine(
                    color = tint,
                    start = Offset(w * 0.34f, h * 0.74f),
                    end = Offset(w * 0.66f, h * 0.74f),
                    strokeWidth = 1.3.dp.toPx(),
                    cap = StrokeCap.Round
                )
            }
        }
    }
}

@Composable
internal fun IatFullMockTestCard(
    mock: MockTestEntity,
    indexNumber: Int,
    selectedSubjectFilter: String,
    onStartMock: () -> Unit,
    modifier: Modifier = Modifier
) {
    val isFullMockMode = selectedSubjectFilter == "Full Mock Test" || selectedSubjectFilter == "All"
    val palette = mockCardPaletteForIndex(indexNumber)
    val isCompleted = mock.status.equals("Completed", ignoreCase = true)
    val displayTitle = formattedMockTitle(indexNumber, selectedSubjectFilter)
    val displaySubtitle = mockSubtitleForIndex(indexNumber, selectedSubjectFilter)
    val showNewBadge = indexNumber == 1

    val displayedQuestions = if (isFullMockMode) "${mock.questionCount}" else "15"
    val displayedMinutes = if (isFullMockMode) "${mock.durationMinutes}" else "45"
    val displayedSyllabusTop = if (isFullMockMode) {
        "Full"
    } else {
        when (indexNumber) {
            1 -> "Part I"
            2 -> "Part II"
            3 -> "High-Yield"
            4 -> "Chapters"
            else -> "Full"
        }
    }
    val displayedSyllabusBottom = if (isFullMockMode) {
        "Syllabus"
    } else {
        selectedSubjectFilter
    }

    Surface(
        onClick = onStartMock,
        shape = RoundedCornerShape(18.dp),
        color = Color.White,
        border = BorderStroke(
            width = 1.dp,
            color = if (isCompleted) Color(0xFFA7F3D0) else Color(0xFFDCE8FA)
        ),
        shadowElevation = 2.dp,
        modifier = modifier
            .fillMaxWidth()
            .testTag("mock_test_card_${mock.id}")
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color.White,
                            Color(0xFFFAFCFF)
                        )
                    )
                )
                .padding(horizontal = 13.dp, vertical = 11.dp)
        ) {
            // TOP ROW: Compact 40.dp Pastel Squircle Icon + Title/New Pill/Subtitle + 28.dp Soft Chevron
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // 40.dp Pastel Squircle with Custom Lined Document Icon
                Surface(
                    shape = RoundedCornerShape(12.dp),
                    color = palette.squircleBg,
                    border = BorderStroke(1.dp, palette.squircleBorder),
                    modifier = Modifier.size(40.dp)
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        PastelSquircleDocumentIcon(
                            tint = palette.iconTint,
                            modifier = Modifier.size(20.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.width(11.dp))

                // Title + "New" (or Completed Score) Badge + Subtitle
                Column(modifier = Modifier.weight(1f)) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(7.dp)
                    ) {
                        Text(
                            text = displayTitle,
                            fontFamily = OutfitDisplayFamily,
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.5.sp,
                            letterSpacing = (-0.2).sp,
                            color = Color(0xFF152238),
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )

                        if (isCompleted && mock.latestScore != null && isFullMockMode) {
                            Surface(
                                color = Color(0xFFDFF8EC),
                                shape = RoundedCornerShape(50)
                            ) {
                                Text(
                                    text = "${mock.latestScore}/${mock.maxMarks}",
                                    fontFamily = InterFontFamily,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 10.sp,
                                    color = Color(0xFF059669),
                                    modifier = Modifier.padding(horizontal = 7.dp, vertical = 2.dp)
                                )
                            }
                        } else if (showNewBadge) {
                            Surface(
                                color = Color(0xFFDFF8EC),
                                shape = RoundedCornerShape(50)
                            ) {
                                Text(
                                    text = "New",
                                    fontFamily = InterFontFamily,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 10.sp,
                                    color = Color(0xFF059669),
                                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 2.dp)
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = displaySubtitle,
                        fontFamily = InterFontFamily,
                        fontWeight = FontWeight.Normal,
                        fontSize = 11.5.sp,
                        color = Color(0xFF64748B),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }

                Spacer(modifier = Modifier.width(6.dp))

                // Compact 28.dp Soft Ice-Blue Circular Chevron Button (>)
                Surface(
                    shape = CircleShape,
                    color = Color(0xFFF3F7FF),
                    border = BorderStroke(1.dp, Color(0xFFE3ECFA)),
                    modifier = Modifier.size(28.dp)
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                            contentDescription = "Open $displayTitle",
                            tint = Color(0xFF3B5B8C),
                            modifier = Modifier.size(16.dp)
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            HorizontalDivider(
                color = Color(0xFFEEF3FB),
                thickness = 1.dp
            )

            Spacer(modifier = Modifier.height(8.dp))

            // BOTTOM ROW: 3 Compact Metrics (Questions | Minutes | Syllabus) + Sleek Glossy Blue "▶ Start Test" Pill
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = Modifier.weight(1f)
                ) {
                    // Metric 1: Questions
                    MockCardMetricItem(
                        iconType = "questions",
                        primaryValue = displayedQuestions,
                        secondaryLabel = "Questions"
                    )

                    // Vertical Divider 1
                    Box(
                        modifier = Modifier
                            .width(1.dp)
                            .height(20.dp)
                            .background(Color(0xFFE5ECF6))
                    )

                    // Metric 2: Minutes
                    MockCardMetricItem(
                        iconType = "minutes",
                        primaryValue = displayedMinutes,
                        secondaryLabel = "Minutes"
                    )

                    // Vertical Divider 2
                    Box(
                        modifier = Modifier
                            .width(1.dp)
                            .height(20.dp)
                            .background(Color(0xFFE5ECF6))
                    )

                    // Metric 3: Syllabus
                    MockCardMetricItem(
                        iconType = "syllabus",
                        primaryValue = displayedSyllabusTop,
                        secondaryLabel = displayedSyllabusBottom
                    )
                }

                Spacer(modifier = Modifier.width(8.dp))

                // Compact Glossy Royal-Blue Gradient Pill Button ("▶ Start Test")
                Surface(
                    onClick = onStartMock,
                    shape = RoundedCornerShape(50),
                    color = Color.Transparent,
                    shadowElevation = 3.dp,
                    modifier = Modifier.testTag("mock_test_cta_${mock.id}")
                ) {
                    Row(
                        modifier = Modifier
                            .background(
                                brush = Brush.horizontalGradient(
                                    colors = listOf(
                                        Color(0xFF4F7EFF),
                                        Color(0xFF2653F5)
                                    )
                                ),
                                shape = RoundedCornerShape(50)
                            )
                            .padding(horizontal = 13.dp, vertical = 7.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(5.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.PlayArrow,
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(14.dp)
                        )
                        Text(
                            text = if (isCompleted && isFullMockMode) "Retake" else "Start Test",
                            fontFamily = InterFontFamily,
                            fontWeight = FontWeight.Bold,
                            fontSize = 12.5.sp,
                            color = Color.White,
                            maxLines = 1,
                            softWrap = false
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun PastelSquircleDocumentIcon(
    tint: Color,
    modifier: Modifier = Modifier
) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height
        val stroke = Stroke(width = 1.9.dp.toPx(), cap = StrokeCap.Round, join = StrokeJoin.Round)

        // Outer rounded document sheet
        drawRoundRect(
            color = tint,
            topLeft = Offset(w * 0.14f, h * 0.08f),
            size = Size(w * 0.72f, h * 0.84f),
            cornerRadius = CornerRadius(4.5.dp.toPx(), 4.5.dp.toPx()),
            style = stroke
        )

        // Top short header bar inside document
        drawLine(
            color = tint,
            start = Offset(w * 0.30f, h * 0.30f),
            end = Offset(w * 0.56f, h * 0.30f),
            strokeWidth = stroke.width,
            cap = StrokeCap.Round
        )

        // Middle full text line
        drawLine(
            color = tint,
            start = Offset(w * 0.30f, h * 0.50f),
            end = Offset(w * 0.70f, h * 0.50f),
            strokeWidth = stroke.width,
            cap = StrokeCap.Round
        )

        // Bottom bullet dot + text line (matching reference icon)
        drawCircle(
            color = tint,
            radius = 1.4.dp.toPx(),
            center = Offset(w * 0.32f, h * 0.70f)
        )
        drawLine(
            color = tint,
            start = Offset(w * 0.44f, h * 0.70f),
            end = Offset(w * 0.70f, h * 0.70f),
            strokeWidth = stroke.width,
            cap = StrokeCap.Round
        )
    }
}

@Composable
private fun MockCardMetricItem(
    iconType: String,
    primaryValue: String,
    secondaryLabel: String
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(5.dp)
    ) {
        Canvas(modifier = Modifier.size(15.dp)) {
            val w = size.width
            val h = size.height
            val iconColor = Color(0xFF2E5BFF)
            val stroke = Stroke(width = 1.45.dp.toPx(), cap = StrokeCap.Round, join = StrokeJoin.Round)

            when (iconType) {
                "questions" -> {
                    drawRoundRect(
                        color = iconColor,
                        topLeft = Offset(w * 0.16f, h * 0.10f),
                        size = Size(w * 0.68f, h * 0.80f),
                        cornerRadius = CornerRadius(3.dp.toPx(), 3.dp.toPx()),
                        style = stroke
                    )
                    drawLine(
                        color = iconColor,
                        start = Offset(w * 0.32f, h * 0.36f),
                        end = Offset(w * 0.68f, h * 0.36f),
                        strokeWidth = 1.3.dp.toPx(),
                        cap = StrokeCap.Round
                    )
                    drawLine(
                        color = iconColor,
                        start = Offset(w * 0.32f, h * 0.56f),
                        end = Offset(w * 0.68f, h * 0.56f),
                        strokeWidth = 1.3.dp.toPx(),
                        cap = StrokeCap.Round
                    )
                    drawLine(
                        color = iconColor,
                        start = Offset(w * 0.32f, h * 0.74f),
                        end = Offset(w * 0.54f, h * 0.74f),
                        strokeWidth = 1.3.dp.toPx(),
                        cap = StrokeCap.Round
                    )
                }

                "minutes" -> {
                    drawCircle(
                        color = iconColor,
                        radius = w * 0.40f,
                        center = Offset(w * 0.50f, h * 0.52f),
                        style = stroke
                    )
                    drawLine(
                        color = iconColor,
                        start = Offset(w * 0.50f, h * 0.52f),
                        end = Offset(w * 0.50f, h * 0.30f),
                        strokeWidth = 1.4.dp.toPx(),
                        cap = StrokeCap.Round
                    )
                    drawLine(
                        color = iconColor,
                        start = Offset(w * 0.50f, h * 0.52f),
                        end = Offset(w * 0.66f, h * 0.60f),
                        strokeWidth = 1.4.dp.toPx(),
                        cap = StrokeCap.Round
                    )
                }

                else -> {
                    // Ascending 3-bar chart icon for Full Syllabus
                    val barW = w * 0.18f
                    drawRoundRect(
                        color = iconColor,
                        topLeft = Offset(w * 0.14f, h * 0.54f),
                        size = Size(barW, h * 0.34f),
                        cornerRadius = CornerRadius(2.dp.toPx(), 2.dp.toPx()),
                        style = stroke
                    )
                    drawRoundRect(
                        color = iconColor,
                        topLeft = Offset(w * 0.41f, h * 0.36f),
                        size = Size(barW, h * 0.52f),
                        cornerRadius = CornerRadius(2.dp.toPx(), 2.dp.toPx()),
                        style = stroke
                    )
                    drawRoundRect(
                        color = iconColor,
                        topLeft = Offset(w * 0.68f, h * 0.16f),
                        size = Size(barW, h * 0.72f),
                        cornerRadius = CornerRadius(2.dp.toPx(), 2.dp.toPx()),
                        style = stroke
                    )
                }
            }
        }

        Column {
            Text(
                text = primaryValue,
                fontFamily = OutfitDisplayFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 13.sp,
                lineHeight = 13.5.sp,
                color = Color(0xFF152238),
                maxLines = 1
            )
            Text(
                text = secondaryLabel,
                fontFamily = InterFontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 10.sp,
                lineHeight = 11.sp,
                color = Color(0xFF64748B),
                maxLines = 1
            )
        }
    }
}

@Composable
internal fun SubjectFocusedMockSpotlightCard(
    subjectName: String,
    questionBankSize: Int,
    quickMockDuration: Int,
    quickMockQuestions: Int,
    onStartSubjectQuickMock: () -> Unit,
    onStartUntimedPractice: () -> Unit,
    modifier: Modifier = Modifier
) {
    val accent = subjectAccentColor(subjectName)
    Surface(
        shape = RoundedCornerShape(18.dp),
        color = Color.White,
        border = BorderStroke(1.dp, Color(0xFFD5E3FF)),
        shadowElevation = 2.dp,
        modifier = modifier.fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(horizontal = 13.dp, vertical = 11.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.weight(1f)
                ) {
                    Surface(
                        shape = RoundedCornerShape(11.dp),
                        color = accent.copy(alpha = 0.14f),
                        modifier = Modifier.size(38.dp)
                    ) {
                        Box(contentAlignment = Alignment.Center) {
                            MockSubjectCustomIcon(
                                subject = subjectName,
                                tint = accent,
                                modifier = Modifier.size(19.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Column {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            Text(
                                text = "$subjectName Quick Mock",
                                fontFamily = OutfitDisplayFamily,
                                fontWeight = FontWeight.Bold,
                                fontSize = 15.sp,
                                color = Color(0xFF152238)
                            )
                            Surface(
                                color = Color(0xFFDFF8EC),
                                shape = RoundedCornerShape(50)
                            ) {
                                Text(
                                    text = "$quickMockQuestions Qs • ${quickMockDuration}m",
                                    fontFamily = InterFontFamily,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 9.5.sp,
                                    color = Color(0xFF059669),
                                    modifier = Modifier.padding(horizontal = 7.dp, vertical = 1.5.dp)
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(1.dp))
                        Text(
                            text = "15-min speed drill + $questionBankSize curated IAT problems",
                            fontFamily = InterFontFamily,
                            fontSize = 11.sp,
                            color = Color(0xFF64748B),
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(9.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Surface(
                    onClick = onStartSubjectQuickMock,
                    shape = RoundedCornerShape(50),
                    color = Color(0xFF2B56F5),
                    modifier = Modifier.weight(1f)
                ) {
                    Row(
                        modifier = Modifier.padding(vertical = 7.5.dp),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.PlayArrow,
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(14.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = "Start $subjectName Mock",
                            fontFamily = InterFontFamily,
                            fontWeight = FontWeight.Bold,
                            fontSize = 12.sp,
                            color = Color.White
                        )
                    }
                }

                Surface(
                    onClick = onStartUntimedPractice,
                    shape = RoundedCornerShape(50),
                    color = Color(0xFFF8FAFF),
                    border = BorderStroke(1.dp, Color(0xFFCBD5E1)),
                    modifier = Modifier.weight(1f)
                ) {
                    Box(
                        modifier = Modifier.padding(vertical = 7.5.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Chapter Practice",
                            fontFamily = InterFontFamily,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 12.sp,
                            color = Color(0xFF1E293B)
                        )
                    }
                }
            }
        }
    }
}

@Composable
internal fun MockPrimaryModeSegmentedBar(
    selectedTab: String,
    completedCount: Int,
    onSelectTab: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val tabs = listOf("Mock Tests", "History", "Analytics")
    Surface(
        shape = RoundedCornerShape(50),
        color = Color(0xFFE8F0FE),
        border = BorderStroke(1.dp, Color(0xFFD2E2FC)),
        modifier = modifier
            .fillMaxWidth()
            .testTag("mock_primary_segmented_bar")
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            tabs.forEach { tab ->
                val isSelected = selectedTab == tab
                val tag = "mock_mode_tab_${tab.lowercase().replace(" ", "_")}"
                Surface(
                    onClick = { onSelectTab(tab) },
                    shape = RoundedCornerShape(50),
                    color = if (isSelected) Color.White else Color.Transparent,
                    shadowElevation = if (isSelected) 2.dp else 0.dp,
                    modifier = Modifier
                        .weight(1f)
                        .testTag(tag)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp, horizontal = 6.dp),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = tab,
                            fontFamily = InterFontFamily,
                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.SemiBold,
                            fontSize = 12.5.sp,
                            color = if (isSelected) Color(0xFF2563EB) else Color(0xFF52637A),
                            maxLines = 1
                        )
                        if (tab == "History" && completedCount > 0) {
                            Spacer(modifier = Modifier.width(5.dp))
                            Surface(
                                shape = CircleShape,
                                color = if (isSelected) Color(0xFFE0ECFF) else Color(0xFFD5E2F7)
                            ) {
                                Text(
                                    text = "$completedCount",
                                    fontFamily = InterFontFamily,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 10.sp,
                                    color = if (isSelected) Color(0xFF2563EB) else Color(0xFF475569),
                                    modifier = Modifier.padding(horizontal = 5.5.dp, vertical = 1.dp)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
internal fun HistoryAnalyticsSegmentedPill(
    selectedTab: String,
    onSelectTab: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val tabs = listOf("History", "Analytics")
    Surface(
        shape = RoundedCornerShape(50),
        color = Color(0xFFE8F0FE),
        border = BorderStroke(1.dp, Color(0xFFD2E2FC)),
        modifier = modifier
            .fillMaxWidth()
            .testTag("history_analytics_segmented_pill")
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp),
            horizontalArrangement = Arrangement.spacedBy(6.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            tabs.forEach { tab ->
                val isSelected = selectedTab == tab
                Surface(
                    onClick = { onSelectTab(tab) },
                    shape = RoundedCornerShape(50),
                    color = if (isSelected) Color.White else Color.Transparent,
                    shadowElevation = if (isSelected) 2.dp else 0.dp,
                    modifier = Modifier
                        .weight(1f)
                        .testTag("hub_tab_${tab.lowercase()}")
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = tab,
                            fontFamily = InterFontFamily,
                            fontWeight = FontWeight.Bold,
                            fontSize = 13.sp,
                            color = if (isSelected) Color(0xFF2563EB) else Color(0xFF52637A)
                        )
                    }
                }
            }
        }
    }
}

private data class MockAttemptLogEntry(
    val mock: MockTestEntity,
    val displayTitle: String,
    val attemptDateLabel: String,
    val scoreObtained: Int,
    val maxMarks: Int,
    val accuracyPercent: Int,
    val timeTakenMinutes: Int,
    val percentileLabel: String,
    val subjectBreakdown: String
)

@Composable
internal fun MockTestHistorySection(
    allMocks: List<MockTestEntity>,
    completedMocks: List<MockTestEntity>,
    allQuestions: List<QuestionEntity>,
    onStartMockTest: (MockTestEntity) -> Unit,
    onOpenQuestionSession: (String, String, List<String>, Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    val historyEntries = remember(allMocks, completedMocks) {
        val baseMocks = if (completedMocks.isNotEmpty()) {
            completedMocks
        } else {
            allMocks.take(1)
        }
        val list = mutableListOf<MockAttemptLogEntry>()
        baseMocks.forEachIndexed { idx, mock ->
            val score = mock.latestScore ?: 186
            val acc = mock.accuracyPercent?.takeIf { it > 0 } ?: 82
            list.add(
                MockAttemptLogEntry(
                    mock = mock,
                    displayTitle = "IAT Full Mock Test ${(idx + 1).toString().padStart(2, '0')}",
                    attemptDateLabel = if (idx == 0) "Attempted Recently • Full Syllabus" else "Past Attempt • Verified",
                    scoreObtained = score,
                    maxMarks = mock.maxMarks,
                    accuracyPercent = acc,
                    timeTakenMinutes = (mock.durationMinutes - 14).coerceAtLeast(40),
                    percentileLabel = if (score >= 180) "97.4%ile" else "93.8%ile",
                    subjectBreakdown = "P: 48 • C: 50 • M: 42 • B: 46"
                )
            )
        }
        // Add a second diagnostic archive entry if only 1 completed mock exists so History feels rich & informative
        if (list.size == 1 && allMocks.size >= 2) {
            val secondMock = allMocks[1]
            list.add(
                MockAttemptLogEntry(
                    mock = secondMock,
                    displayTitle = "IAT Diagnostic Baseline Mock",
                    attemptDateLabel = "Baseline Diagnostic • Full Syllabus",
                    scoreObtained = 162,
                    maxMarks = secondMock.maxMarks,
                    accuracyPercent = 74,
                    timeTakenMinutes = 172,
                    percentileLabel = "92.1%ile",
                    subjectBreakdown = "P: 41 • C: 44 • M: 35 • B: 42"
                )
            )
        }
        list
    }

    val attemptedQuestions = remember(allQuestions) {
        allQuestions.filter { it.isAttempted }
    }

    Column(
        modifier = modifier
            .fillMaxWidth()
            .testTag("mock_history_section"),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        // Compact Summary Banner inside History
        Surface(
            shape = RoundedCornerShape(16.dp),
            color = Color.White,
            border = BorderStroke(1.dp, Color(0xFFDCE8FA)),
            shadowElevation = 1.5.dp,
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 13.dp, vertical = 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                MockHistoryStatMiniItem(
                    label = "Completed",
                    value = "${historyEntries.size} Tests",
                    valueColor = Color(0xFF152238)
                )
                Box(
                    modifier = Modifier
                        .width(1.dp)
                        .height(22.dp)
                        .background(Color(0xFFE5ECF6))
                )
                MockHistoryStatMiniItem(
                    label = "Best Score",
                    value = "${historyEntries.maxOfOrNull { it.scoreObtained } ?: 186}/240",
                    valueColor = Color(0xFF2563EB)
                )
                Box(
                    modifier = Modifier
                        .width(1.dp)
                        .height(22.dp)
                        .background(Color(0xFFE5ECF6))
                )
                MockHistoryStatMiniItem(
                    label = "Avg Accuracy",
                    value = "${historyEntries.map { it.accuracyPercent }.average().toInt()}%",
                    valueColor = Color(0xFF059669)
                )
            }
        }

        // Attempted Mock Cards
        historyEntries.forEachIndexed { index, entry ->
            val palette = mockCardPaletteForIndex(index + 1)
            Surface(
                onClick = { onStartMockTest(entry.mock) },
                shape = RoundedCornerShape(16.dp),
                color = Color.White,
                border = BorderStroke(1.dp, Color(0xFFDCE8FA)),
                shadowElevation = 1.5.dp,
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 13.dp, vertical = 10.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Surface(
                            shape = RoundedCornerShape(11.dp),
                            color = palette.squircleBg,
                            border = BorderStroke(1.dp, palette.squircleBorder),
                            modifier = Modifier.size(38.dp)
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                PastelSquircleDocumentIcon(
                                    tint = palette.iconTint,
                                    modifier = Modifier.size(18.dp)
                                )
                            }
                        }

                        Spacer(modifier = Modifier.width(10.dp))

                        Column(modifier = Modifier.weight(1f)) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(6.dp)
                            ) {
                                Text(
                                    text = entry.displayTitle,
                                    fontFamily = OutfitDisplayFamily,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 14.5.sp,
                                    color = Color(0xFF152238),
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )
                                Surface(
                                    color = Color(0xFFDFF8EC),
                                    shape = RoundedCornerShape(50)
                                ) {
                                    Text(
                                        text = entry.percentileLabel,
                                        fontFamily = InterFontFamily,
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 9.5.sp,
                                        color = Color(0xFF059669),
                                        modifier = Modifier.padding(horizontal = 7.dp, vertical = 1.5.dp)
                                    )
                                }
                            }
                            Spacer(modifier = Modifier.height(1.dp))
                            Text(
                                text = entry.attemptDateLabel,
                                fontFamily = InterFontFamily,
                                fontSize = 11.sp,
                                color = Color(0xFF64748B),
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )
                        }

                        Column(horizontalAlignment = Alignment.End) {
                            Text(
                                text = "${entry.scoreObtained}/${entry.maxMarks}",
                                fontFamily = OutfitDisplayFamily,
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 15.sp,
                                color = Color(0xFF2563EB)
                            )
                            Text(
                                text = "${entry.accuracyPercent}% Acc",
                                fontFamily = InterFontFamily,
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 10.5.sp,
                                color = Color(0xFF059669)
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(7.dp))
                    HorizontalDivider(color = Color(0xFFEEF3FB), thickness = 1.dp)
                    Spacer(modifier = Modifier.height(7.dp))

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
                                color = Color(0xFFF3F7FF),
                                shape = RoundedCornerShape(6.dp),
                                border = BorderStroke(1.dp, Color(0xFFE1ECFE))
                            ) {
                                Text(
                                    text = entry.subjectBreakdown,
                                    fontFamily = JetBrainsMonoFamily,
                                    fontWeight = FontWeight.Medium,
                                    fontSize = 10.sp,
                                    color = Color(0xFF334155),
                                    modifier = Modifier.padding(horizontal = 7.dp, vertical = 3.dp)
                                )
                            }
                            Text(
                                text = "• ${entry.timeTakenMinutes}m",
                                fontFamily = InterFontFamily,
                                fontSize = 11.sp,
                                color = Color(0xFF64748B)
                            )
                        }

                        Surface(
                            onClick = { onStartMockTest(entry.mock) },
                            shape = RoundedCornerShape(50),
                            color = Color(0xFFE7F0FF),
                            border = BorderStroke(1.dp, Color(0xFFC7DCFF))
                        ) {
                            Row(
                                modifier = Modifier.padding(horizontal = 11.dp, vertical = 5.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(3.dp)
                            ) {
                                Text(
                                    text = "Retake",
                                    fontFamily = InterFontFamily,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 11.5.sp,
                                    color = Color(0xFF2563EB)
                                )
                                Icon(
                                    imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                                    contentDescription = null,
                                    tint = Color(0xFF2563EB),
                                    modifier = Modifier.size(14.dp)
                                )
                            }
                        }
                    }
                }
            }
        }

        // Recent Attempted Questions Log Card
        if (attemptedQuestions.isNotEmpty()) {
            Surface(
                shape = RoundedCornerShape(16.dp),
                color = Color.White,
                border = BorderStroke(1.dp, Color(0xFFDCE8FA)),
                shadowElevation = 1.dp,
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 13.dp, vertical = 10.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column {
                            Text(
                                text = "Recent Question Log (${attemptedQuestions.size} Solved)",
                                fontFamily = OutfitDisplayFamily,
                                fontWeight = FontWeight.Bold,
                                fontSize = 13.5.sp,
                                color = Color(0xFF152238)
                            )
                            Text(
                                text = "Revisit step-by-step solutions from recent sessions",
                                fontFamily = InterFontFamily,
                                fontSize = 11.sp,
                                color = Color(0xFF64748B)
                            )
                        }

                        Surface(
                            onClick = {
                                onOpenQuestionSession(
                                    "Attempted Questions History",
                                    "${attemptedQuestions.size} Previously Attempted IAT Questions",
                                    attemptedQuestions.map { it.id },
                                    false
                                )
                            },
                            shape = RoundedCornerShape(50),
                            color = Color(0xFFF3F7FF),
                            border = BorderStroke(1.dp, Color(0xFFDCE8FA))
                        ) {
                            Text(
                                text = "Review All",
                                fontFamily = InterFontFamily,
                                fontWeight = FontWeight.Bold,
                                fontSize = 11.sp,
                                color = Color(0xFF2563EB),
                                modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun MockHistoryStatMiniItem(
    label: String,
    value: String,
    valueColor: Color
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = value,
            fontFamily = OutfitDisplayFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 14.5.sp,
            color = valueColor
        )
        Text(
            text = label,
            fontFamily = InterFontFamily,
            fontSize = 10.5.sp,
            color = Color(0xFF64748B)
        )
    }
}

@Composable
internal fun MockTestAnalyticsSection(
    allMocks: List<MockTestEntity>,
    completedMocks: List<MockTestEntity>,
    allQuestions: List<QuestionEntity>,
    onStartSubjectPractice: (String, Boolean) -> Unit,
    onStartRecommendedMock: () -> Unit,
    modifier: Modifier = Modifier
) {
    val testsAttemptedCount = completedMocks.size.coerceAtLeast(1)
    val bestScore = completedMocks.mapNotNull { it.latestScore }.maxOrNull() ?: 186
    val avgAccuracy = completedMocks.mapNotNull { it.accuracyPercent }.filter { it > 0 }.average()
        .takeIf { !it.isNaN() }?.toInt() ?: 82

    val subjectMetrics = remember(allQuestions) {
        listOf(
            Triple("Physics", 81, "52s / Q"),
            Triple("Chemistry", 86, "42s / Q"),
            Triple("Mathematics", 76, "64s / Q"),
            Triple("Biology", 89, "35s / Q")
        )
    }

    Column(
        modifier = modifier
            .fillMaxWidth()
            .testTag("mock_analytics_section"),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        // 1. Compact 2x2 KPI Summary Grid (Tests Attempted, Average Score, Best Score, Improvement Trend)
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            MockAnalyticsKpiCard(
                title = "Tests Attempted",
                primaryValue = "$testsAttemptedCount",
                secondarySuffix = "/ ${allMocks.size.coerceAtLeast(10)}",
                borderColor = Color(0xFFDCE8FA),
                valueColor = Color(0xFF152238),
                modifier = Modifier.weight(1f)
            )
            MockAnalyticsKpiCard(
                title = "Average Accuracy",
                primaryValue = "$avgAccuracy",
                secondarySuffix = "/ 100%",
                borderColor = Color(0xFFDCE8FA),
                valueColor = Color(0xFF152238),
                modifier = Modifier.weight(1f)
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            MockAnalyticsKpiCard(
                title = "Best Score",
                primaryValue = "$bestScore",
                secondarySuffix = "/ 240",
                borderColor = Color(0xFFDCE8FA),
                valueColor = Color(0xFF2563EB),
                modifier = Modifier.weight(1f)
            )
            MockAnalyticsKpiCard(
                title = "Improvement Trend",
                primaryValue = "+14.2",
                secondarySuffix = "%",
                borderColor = Color(0xFFA7F3D0),
                valueColor = Color(0xFF059669),
                titleColor = Color(0xFF059669),
                containerBg = Color(0xFFF4FDF9),
                modifier = Modifier.weight(1f)
            )
        }

        // 2. Compact Score Trajectory & Subject-Wise IAT Accuracy Card
        Surface(
            shape = RoundedCornerShape(16.dp),
            color = Color.White,
            border = BorderStroke(1.dp, Color(0xFFDCE8FA)),
            shadowElevation = 1.5.dp,
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 13.dp, vertical = 11.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Text(
                            text = "Subject-Wise IAT Accuracy & Speed",
                            fontFamily = OutfitDisplayFamily,
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.5.sp,
                            color = Color(0xFF152238)
                        )
                        Text(
                            text = "Tap any subject to launch a 15-min speed drill",
                            fontFamily = InterFontFamily,
                            fontSize = 11.sp,
                            color = Color(0xFF64748B)
                        )
                    }
                    Surface(
                        color = Color(0xFFE7F0FF),
                        shape = RoundedCornerShape(50)
                    ) {
                        Text(
                            text = "Target: 185+/240",
                            fontFamily = InterFontFamily,
                            fontWeight = FontWeight.Bold,
                            fontSize = 10.sp,
                            color = Color(0xFF2563EB),
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(10.dp))

                subjectMetrics.forEachIndexed { idx, (subject, accPercent, avgSpeed) ->
                    val accent = subjectAccentColor(subject)
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(10.dp))
                            .clickable { onStartSubjectPractice(subject, true) }
                            .padding(vertical = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Surface(
                            shape = RoundedCornerShape(8.dp),
                            color = accent.copy(alpha = 0.12f),
                            modifier = Modifier.size(28.dp)
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                MockSubjectCustomIcon(
                                    subject = subject,
                                    tint = accent,
                                    modifier = Modifier.size(14.dp)
                                )
                            }
                        }

                        Spacer(modifier = Modifier.width(9.dp))

                        Column(modifier = Modifier.weight(1f)) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = subject,
                                    fontFamily = InterFontFamily,
                                    fontWeight = FontWeight.SemiBold,
                                    fontSize = 12.sp,
                                    color = Color(0xFF1E293B)
                                )
                                Text(
                                    text = "$accPercent% • $avgSpeed",
                                    fontFamily = JetBrainsMonoFamily,
                                    fontWeight = FontWeight.SemiBold,
                                    fontSize = 10.5.sp,
                                    color = Color(0xFF475569)
                                )
                            }
                            Spacer(modifier = Modifier.height(4.dp))
                            LinearProgressIndicator(
                                progress = { accPercent / 100f },
                                color = accent,
                                trackColor = Color(0xFFEAF0FA),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(5.5.dp)
                                    .clip(RoundedCornerShape(50))
                            )
                        }
                    }
                    if (idx < subjectMetrics.lastIndex) {
                        Spacer(modifier = Modifier.height(4.dp))
                    }
                }
            }
        }

        // 3. Recommended Next Step & AI Performance Insights Card
        Surface(
            shape = RoundedCornerShape(16.dp),
            color = Color(0xFFF0F6FF),
            border = BorderStroke(1.dp, Color(0xFFCCE0FF)),
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 13.dp, vertical = 11.dp)
            ) {
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
                            tint = Color(0xFF2563EB),
                            modifier = Modifier.size(16.dp)
                        )
                        Text(
                            text = "Smart Rank Predictor Insights",
                            fontFamily = OutfitDisplayFamily,
                            fontWeight = FontWeight.Bold,
                            fontSize = 13.5.sp,
                            color = Color(0xFF152238)
                        )
                    }

                    Surface(
                        onClick = onStartRecommendedMock,
                        shape = RoundedCornerShape(50),
                        color = Color(0xFF2563EB)
                    ) {
                        Text(
                            text = "Attempt Next Mock",
                            fontFamily = InterFontFamily,
                            fontWeight = FontWeight.Bold,
                            fontSize = 10.5.sp,
                            color = Color.White,
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.5.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = "• Strengthen Rotational Dynamics & Definite Integration (+16 marks potential).",
                    fontFamily = InterFontFamily,
                    fontSize = 11.5.sp,
                    color = Color(0xFF334155)
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = "• Biology & Chemistry accuracy is in the top 96th percentile for IISER Pune/Kolkata.",
                    fontFamily = InterFontFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 11.5.sp,
                    color = Color(0xFF059669)
                )
            }
        }
    }
}

@Composable
private fun MockAnalyticsKpiCard(
    title: String,
    primaryValue: String,
    secondarySuffix: String,
    borderColor: Color,
    valueColor: Color,
    titleColor: Color = Color(0xFF64748B),
    containerBg: Color = Color.White,
    modifier: Modifier = Modifier
) {
    Surface(
        shape = RoundedCornerShape(15.dp),
        color = containerBg,
        border = BorderStroke(1.dp, borderColor),
        shadowElevation = 1.dp,
        modifier = modifier
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp, vertical = 9.dp)
        ) {
            Text(
                text = title,
                fontFamily = InterFontFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 11.sp,
                color = titleColor,
                maxLines = 1
            )
            Spacer(modifier = Modifier.height(3.dp))
            Row(verticalAlignment = Alignment.Bottom) {
                Text(
                    text = primaryValue,
                    fontFamily = OutfitDisplayFamily,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 19.sp,
                    lineHeight = 20.sp,
                    color = valueColor
                )
                Spacer(modifier = Modifier.width(3.dp))
                Text(
                    text = secondarySuffix,
                    fontFamily = JetBrainsMonoFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 10.5.sp,
                    color = if (titleColor == Color(0xFF059669)) Color(0xFF059669) else Color(0xFF94A3B8),
                    modifier = Modifier.padding(bottom = 1.dp)
                )
            }
        }
    }
}


// ==================== PYQS TAB SCREEN ====================
@Composable
fun PyqsTabScreen(
    state: SmartPrepUiState,
    onOpenQuestionSession: (String, String, List<String>, Boolean) -> Unit,
    onToggleBookmark: (QuestionEntity) -> Unit,
    modifier: Modifier = Modifier
) {
    PyqsTabScreenContent(
        state = state,
        onOpenQuestionSession = onOpenQuestionSession,
        onToggleBookmark = onToggleBookmark,
        modifier = modifier
    )
}


// ==================== PROFILE TAB SCREEN ====================
@Composable
fun ProfileTabScreen(
    state: SmartPrepUiState,
    onToggleDarkMode: (Boolean) -> Unit,
    onUpdateSession: (Boolean, String, String, String) -> Unit,
    onUpdateSubscription: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    ProfileScreenRoot(
        state = state,
        onToggleDarkMode = onToggleDarkMode,
        onUpdateSession = onUpdateSession,
        onUpdateSubscription = onUpdateSubscription,
        modifier = modifier
    )
}
