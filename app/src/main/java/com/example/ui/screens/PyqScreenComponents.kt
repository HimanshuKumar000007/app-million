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
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.withTransform
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.local.ChapterEntity
import com.example.data.local.QuestionEntity
import com.example.ui.SmartPrepUiState
import com.example.ui.components.SmartPrepBrandWatermarkFooter
import com.example.ui.components.subjectAccentColor
import com.example.ui.theme.InterFontFamily
import com.example.ui.theme.JetBrainsMonoFamily
import com.example.ui.theme.OutfitDisplayFamily

private val PyqHeroTopBlue = Color(0xFF699BF7)
private val PyqHeroMidBlue = Color(0xFF82AEFF)
private val PyqHeroBottomBlue = Color(0xFFBFD6FF)
private val PyqRoyalBlue = Color(0xFF2E5BFF)
private val PyqNavyText = Color(0xFF172542)
private val PyqSlateSub = Color(0xFF64748B)
private val PyqBorderBlue = Color(0xFFE2ECFC)

internal data class IatPastYearPaperItem(
    val id: String,
    val year: Int,
    val title: String,
    val subtitle: String,
    val badgeText: String,
    val badgeBg: Color,
    val badgeFg: Color,
    val iconBg: Color,
    val iconTint: Color,
    val questionCount: Int,
    val durationMinutes: Int,
    val maxMarks: Int,
    val cutoffHint: String
)

@Composable
internal fun PyqsTabScreenContent(
    state: SmartPrepUiState,
    onOpenQuestionSession: (String, String, List<String>, Boolean) -> Unit,
    onToggleBookmark: (QuestionEntity) -> Unit,
    modifier: Modifier = Modifier
) {
    var selectedPrimaryMode by remember { mutableStateOf("Year-Wise") }

    val subjectFilterPills = remember {
        listOf("All PYQs", "Chapter-Wise", "Physics", "Chemistry", "Mathematics", "Biology")
    }
    var selectedSubjectPill by remember { mutableStateOf("All PYQs") }

    var pyqSearchInput by remember { mutableStateOf("") }
    var committedPyqQuery by remember { mutableStateOf("") }

    val years = remember { listOf(null, 2025, 2024, 2023, 2022, 2021, 2020, 2019, 2018) }
    var selectedYear by remember { mutableStateOf<Int?>(null) }

    val difficulties = remember { listOf("All", "Analytical", "Conceptual", "Research-Level") }
    var selectedDifficulty by remember { mutableStateOf("All") }
    var bookmarkedOnly by remember { mutableStateOf(false) }

    var showAllPastPapers by remember { mutableStateOf(false) }
    var showAllPyqChapters by remember { mutableStateOf(false) }

    val activeSearchQuery = remember(pyqSearchInput, committedPyqQuery) {
        val raw = pyqSearchInput.trim()
        if (raw.isNotEmpty()) raw else committedPyqQuery.trim()
    }

    val effectiveSubjectFilter = remember(selectedSubjectPill) {
        if (selectedSubjectPill in listOf("Physics", "Chemistry", "Mathematics", "Biology")) {
            selectedSubjectPill
        } else {
            "All"
        }
    }

    val combinedPyqQuestions = remember(state.allQuestions) {
        val dbPyqs = state.allQuestions.filter { it.isPyq }
        val existingIds = dbPyqs.map { it.id }.toSet()
        val extra = supplementaryIatPyqArchiveQuestions().filter { it.id !in existingIds }
        dbPyqs + extra
    }

    val filteredPyqs = remember(
        combinedPyqQuestions,
        selectedDifficulty,
        selectedYear,
        effectiveSubjectFilter,
        bookmarkedOnly,
        activeSearchQuery
    ) {
        combinedPyqQuestions.filter { q ->
            val matchesDifficulty = selectedDifficulty == "All" ||
                q.difficulty.equals(selectedDifficulty, ignoreCase = true)
            val matchesYear = selectedYear == null || q.examYear == selectedYear
            val matchesSubject = effectiveSubjectFilter == "All" ||
                q.subject.equals(effectiveSubjectFilter, ignoreCase = true)
            val matchesBookmark = !bookmarkedOnly || q.isBookmarked
            val matchesSearch = activeSearchQuery.isBlank() ||
                q.prompt.contains(activeSearchQuery, ignoreCase = true) ||
                q.topic.contains(activeSearchQuery, ignoreCase = true) ||
                q.subject.contains(activeSearchQuery, ignoreCase = true) ||
                q.stepByStepExplanation.contains(activeSearchQuery, ignoreCase = true) ||
                (q.examYear?.toString()?.contains(activeSearchQuery) == true)
            matchesDifficulty && matchesYear && matchesSubject && matchesBookmark && matchesSearch
        }
    }

    val allPastYearPapers = remember { defaultIatPastYearPapers() }
    val filteredPastYearPapers = remember(allPastYearPapers, selectedYear, activeSearchQuery) {
        allPastYearPapers.filter { paper ->
            val matchesYear = selectedYear == null || paper.year == selectedYear
            val matchesQuery = activeSearchQuery.isBlank() ||
                paper.title.contains(activeSearchQuery, ignoreCase = true) ||
                paper.subtitle.contains(activeSearchQuery, ignoreCase = true) ||
                paper.year.toString().contains(activeSearchQuery)
            matchesYear && matchesQuery
        }
    }
    val visiblePastYearPapers = remember(filteredPastYearPapers, showAllPastPapers, selectedYear, activeSearchQuery) {
        if (showAllPastPapers || selectedYear != null || activeSearchQuery.isNotBlank()) {
            filteredPastYearPapers
        } else {
            filteredPastYearPapers.take(5)
        }
    }

    val allAvailableChapters = remember(state.allChapters) {
        if (state.allChapters.isNotEmpty()) state.allChapters else defaultChapterWiseMockChapters()
    }
    val filteredPyqChapters = remember(allAvailableChapters, effectiveSubjectFilter, activeSearchQuery) {
        allAvailableChapters.filter { chapter ->
            val matchesSubject = effectiveSubjectFilter == "All" ||
                chapter.subject.equals(effectiveSubjectFilter, ignoreCase = true)
            val matchesQuery = activeSearchQuery.isBlank() ||
                chapter.title.contains(activeSearchQuery, ignoreCase = true) ||
                chapter.subtitle.contains(activeSearchQuery, ignoreCase = true) ||
                chapter.subject.contains(activeSearchQuery, ignoreCase = true) ||
                chapter.formulaHighlight.contains(activeSearchQuery, ignoreCase = true) ||
                "ch ${chapter.chapterNumber}".contains(activeSearchQuery, ignoreCase = true)
            matchesSubject && matchesQuery
        }
    }
    val visiblePyqChapters = remember(
        filteredPyqChapters,
        showAllPyqChapters,
        selectedSubjectPill,
        selectedPrimaryMode,
        activeSearchQuery
    ) {
        if (
            showAllPyqChapters ||
            selectedSubjectPill == "Chapter-Wise" ||
            selectedPrimaryMode == "Chapter-Wise" ||
            activeSearchQuery.isNotBlank()
        ) {
            filteredPyqChapters
        } else {
            filteredPyqChapters.take(6)
        }
    }

    val resolveSessionQuestionIds: (Int?, String?, String?) -> List<String> = { yearFilter, subjectFilter, chapterId ->
        val pool = state.allQuestions.ifEmpty { combinedPyqQuestions }
        val matched = pool.filter { q ->
            val yearOk = yearFilter == null || q.examYear == yearFilter
            val subjOk = subjectFilter == null || subjectFilter == "All" || q.subject.equals(subjectFilter, ignoreCase = true)
            val chapOk = chapterId == null || q.chapterId == chapterId
            yearOk && subjOk && chapOk
        }
        val fallbackBySubj = if (matched.isEmpty() && subjectFilter != null && subjectFilter != "All") {
            pool.filter { it.subject.equals(subjectFilter, ignoreCase = true) }
        } else {
            matched
        }
        val finalPool = fallbackBySubj.ifEmpty { pool.filter { it.isPyq } }.ifEmpty { pool }
        finalPool.map { it.id }
    }

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFF5F8FF))
            .testTag("pyqs_tab_screen"),
        contentPadding = PaddingValues(bottom = 120.dp)
    ) {
        // 1. PERIWINKLE-BLUE HERO BANNER WITH TILTED "IAT PYQ ARCHIVE" ILLUSTRATION
        item(key = "pyq_hero_banner") {
            PyqHeroBanner(
                selectedPrimaryMode = selectedPrimaryMode,
                selectedSubjectPill = selectedSubjectPill,
                selectedYear = selectedYear
            )
        }

        // 2. PRIMARY MODE SEGMENTED BAR (Year-Wise | Chapter-Wise | PYQ Bank)
        item(key = "pyq_primary_mode_bar") {
            PyqPrimaryModeSegmentedBar(
                selectedMode = selectedPrimaryMode,
                pyqCount = filteredPyqs.size,
                onSelectMode = { mode ->
                    selectedPrimaryMode = mode
                    if (mode == "Chapter-Wise" && selectedSubjectPill == "All PYQs") {
                        selectedSubjectPill = "Chapter-Wise"
                    } else if (mode != "Chapter-Wise" && selectedSubjectPill == "Chapter-Wise") {
                        selectedSubjectPill = "All PYQs"
                    }
                },
                modifier = Modifier.padding(horizontal = 14.dp, vertical = 6.dp)
            )
        }

        // 3. SUBJECT & MODE PILL ROW (All PYQs | Chapter-Wise | Physics | Chemistry | Mathematics | Biology)
        item(key = "pyq_subject_filter_bar") {
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFF5F8FF))
                    .padding(top = 2.dp, bottom = 8.dp),
                contentPadding = PaddingValues(horizontal = 14.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                items(subjectFilterPills) { filterLabel ->
                    val isSelected = selectedSubjectPill == filterLabel
                    MockSubjectFilterPill(
                        label = filterLabel,
                        isSelected = isSelected,
                        onClick = {
                            selectedSubjectPill = filterLabel
                            if (filterLabel == "Chapter-Wise") {
                                selectedPrimaryMode = "Chapter-Wise"
                            }
                        }
                    )
                }
            }
        }

        // 4. SEARCH BAR WITH EXPLICIT ROYAL-BLUE "SEARCH" BUTTON
        item(key = "pyq_search_bar_section") {
            PyqSearchBar(
                searchInput = pyqSearchInput,
                activeQuery = activeSearchQuery,
                resultCount = when (selectedPrimaryMode) {
                    "Chapter-Wise" -> filteredPyqChapters.size
                    "PYQ Bank" -> filteredPyqs.size
                    else -> filteredPastYearPapers.size + filteredPyqs.size
                },
                onSearchInputChange = { pyqSearchInput = it },
                onSearchClick = { committedPyqQuery = pyqSearchInput.trim() },
                onClearClick = {
                    pyqSearchInput = ""
                    committedPyqQuery = ""
                },
                onQuickTagClick = { tag ->
                    pyqSearchInput = tag
                    committedPyqQuery = tag
                },
                modifier = Modifier.padding(horizontal = 14.dp, vertical = 4.dp)
            )
        }

        // 5. YEAR & DIFFICULTY FILTER CHIPS
        item(key = "pyq_year_and_difficulty_filters") {
            PyqYearAndDifficultyFilterStrip(
                years = years,
                selectedYear = selectedYear,
                onSelectYear = { yr -> selectedYear = yr },
                difficulties = difficulties,
                selectedDifficulty = selectedDifficulty,
                onSelectDifficulty = { diff -> selectedDifficulty = diff },
                bookmarkedOnly = bookmarkedOnly,
                onToggleBookmarkedOnly = { bookmarkedOnly = !bookmarkedOnly },
                modifier = Modifier.padding(horizontal = 14.dp, vertical = 4.dp)
            )
        }

        // 6. ATTEMPT ALL FILTERED PYQS IN TEST MODE CTA BUTTON
        if (filteredPyqs.isNotEmpty()) {
            item(key = "pyq_attempt_all_cta") {
                val sessionIds = remember(filteredPyqs, state.allQuestions) {
                    val dbIds = state.allQuestions.map { it.id }.toSet()
                    val validFiltered = filteredPyqs.map { it.id }.filter { it in dbIds }
                    validFiltered.ifEmpty {
                        state.allQuestions.filter { it.isPyq }.map { it.id }
                    }.ifEmpty {
                        state.allQuestions.map { it.id }
                    }
                }
                Surface(
                    onClick = {
                        onOpenQuestionSession(
                            "IISER IAT PYQ Timed Paper ($selectedDifficulty)",
                            "${filteredPyqs.size} Verified Archive Questions",
                            sessionIds,
                            true
                        )
                    },
                    shape = RoundedCornerShape(14.dp),
                    color = PyqRoyalBlue,
                    shadowElevation = 2.dp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 14.dp, vertical = 6.dp)
                        .testTag("start_filtered_pyq_session_btn")
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 14.dp, vertical = 11.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(10.dp),
                            modifier = Modifier.weight(1f)
                        ) {
                            Surface(
                                shape = RoundedCornerShape(9.dp),
                                color = Color.White.copy(alpha = 0.2f),
                                modifier = Modifier.size(32.dp)
                            ) {
                                Box(contentAlignment = Alignment.Center) {
                                    Icon(
                                        imageVector = Icons.Default.PlayArrow,
                                        contentDescription = null,
                                        tint = Color.White,
                                        modifier = Modifier.size(18.dp)
                                    )
                                }
                            }
                            Column {
                                Text(
                                    text = "Attempt All ${filteredPyqs.size} Filtered PYQs in Test Mode",
                                    fontFamily = OutfitDisplayFamily,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 13.5.sp,
                                    color = Color.White,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )
                                Text(
                                    text = buildString {
                                        append(if (effectiveSubjectFilter == "All") "All 4 Subjects" else effectiveSubjectFilter)
                                        append(" • ")
                                        append(selectedYear?.let { "IAT $it" } ?: "2018–2025 Archive")
                                        append(" • +4 / -1 Marking")
                                    },
                                    fontFamily = InterFontFamily,
                                    fontWeight = FontWeight.Medium,
                                    fontSize = 11.sp,
                                    color = Color.White.copy(alpha = 0.88f)
                                )
                            }
                        }
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(20.dp)
                        )
                    }
                }
            }
        }

        // ==================== SECTION A: YEAR-WISE OFFICIAL PAST PAPERS (2018–2025) ====================
        if (selectedPrimaryMode == "Year-Wise" && selectedSubjectPill != "Chapter-Wise") {
            item(key = "pyq_year_wise_papers_header") {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 6.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Text(
                                text = "Official Year-Wise Past Papers",
                                fontFamily = OutfitDisplayFamily,
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 16.sp,
                                color = PyqNavyText
                            )
                            Surface(
                                shape = RoundedCornerShape(50),
                                color = Color(0xFFEAF1FF),
                                border = BorderStroke(1.dp, Color(0xFFC7DBFF))
                            ) {
                                Text(
                                    text = "2018–2025",
                                    fontFamily = JetBrainsMonoFamily,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 10.sp,
                                    color = PyqRoyalBlue,
                                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 2.dp)
                                )
                            }
                        }
                        Text(
                            text = "Full 60-question official IISER IAT exam papers with cutoff benchmarks",
                            fontFamily = InterFontFamily,
                            fontWeight = FontWeight.Medium,
                            fontSize = 11.5.sp,
                            color = PyqSlateSub
                        )
                    }

                    if (filteredPastYearPapers.size > 5) {
                        Surface(
                            onClick = { showAllPastPapers = !showAllPastPapers },
                            shape = RoundedCornerShape(50),
                            color = Color.White,
                            border = BorderStroke(1.dp, Color(0xFFD5E3FA))
                        ) {
                            Text(
                                text = if (showAllPastPapers) "Compact" else "All ${filteredPastYearPapers.size}",
                                fontFamily = OutfitDisplayFamily,
                                fontWeight = FontWeight.Bold,
                                fontSize = 11.sp,
                                color = PyqRoyalBlue,
                                modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp)
                            )
                        }
                    }
                }
            }

            items(
                items = visiblePastYearPapers,
                key = { "pyq_paper_${it.id}" }
            ) { paper ->
                IatYearWisePyqPaperCard(
                    paper = paper,
                    selectedSubjectFilter = effectiveSubjectFilter,
                    onStartPaper = {
                        val ids = resolveSessionQuestionIds(paper.year, effectiveSubjectFilter, null)
                        val titlePrefix = if (effectiveSubjectFilter == "All") {
                            paper.title
                        } else {
                            "${paper.title} ($effectiveSubjectFilter)"
                        }
                        onOpenQuestionSession(
                            titlePrefix,
                            "${paper.subtitle} • ${paper.cutoffHint}",
                            ids,
                            true
                        )
                    },
                    modifier = Modifier.padding(horizontal = 14.dp, vertical = 4.5.dp)
                )
            }
        }

        // ==================== SECTION B: CHAPTER-WISE PYQ TOPIC ARCHIVE ====================
        if (selectedPrimaryMode == "Chapter-Wise" || selectedSubjectPill == "Chapter-Wise" || effectiveSubjectFilter != "All") {
            item(key = "pyq_chapter_wise_header") {
                Spacer(modifier = Modifier.height(6.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 6.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Text(
                                text = if (effectiveSubjectFilter == "All") {
                                    "Chapter-Wise PYQ Archive"
                                } else {
                                    "$effectiveSubjectFilter Chapter-Wise PYQs"
                                },
                                fontFamily = OutfitDisplayFamily,
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 16.sp,
                                color = PyqNavyText
                            )
                            Surface(
                                shape = RoundedCornerShape(50),
                                color = Color(0xFFEAF1FF),
                                border = BorderStroke(1.dp, Color(0xFFC7DBFF))
                            ) {
                                Text(
                                    text = "${filteredPyqChapters.size} Chapters",
                                    fontFamily = JetBrainsMonoFamily,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 10.sp,
                                    color = PyqRoyalBlue,
                                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 2.dp)
                                )
                            }
                        }
                        Text(
                            text = "Solve topic-sorted IISER IAT past year questions (2018–2025) by chapter",
                            fontFamily = InterFontFamily,
                            fontWeight = FontWeight.Medium,
                            fontSize = 11.5.sp,
                            color = PyqSlateSub
                        )
                    }

                    if (filteredPyqChapters.size > 6) {
                        Surface(
                            onClick = { showAllPyqChapters = !showAllPyqChapters },
                            shape = RoundedCornerShape(50),
                            color = Color.White,
                            border = BorderStroke(1.dp, Color(0xFFD5E3FA))
                        ) {
                            Text(
                                text = if (showAllPyqChapters) "Compact" else "All ${filteredPyqChapters.size}",
                                fontFamily = OutfitDisplayFamily,
                                fontWeight = FontWeight.Bold,
                                fontSize = 11.sp,
                                color = PyqRoyalBlue,
                                modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp)
                            )
                        }
                    }
                }
            }

            if (visiblePyqChapters.isEmpty()) {
                item(key = "pyq_chapter_empty_state") {
                    ChapterWiseMockEmptySearchCard(
                        query = activeSearchQuery,
                        onResetSearch = {
                            pyqSearchInput = ""
                            committedPyqQuery = ""
                            selectedSubjectPill = "All PYQs"
                        },
                        modifier = Modifier.padding(horizontal = 14.dp, vertical = 6.dp)
                    )
                }
            } else {
                items(
                    items = visiblePyqChapters,
                    key = { "pyq_chap_${it.id}" }
                ) { chapter ->
                    val chapterPyqCount = remember(chapter.id, combinedPyqQuestions) {
                        val direct = combinedPyqQuestions.count {
                            it.chapterId == chapter.id ||
                                it.topic.contains(chapter.title, ignoreCase = true)
                        }
                        if (direct > 0) direct + 8 else (chapter.practiceQuestionCount / 2).coerceAtLeast(9)
                    }
                    ChapterWisePyqArchiveCard(
                        chapter = chapter,
                        pyqCount = chapterPyqCount,
                        onStartChapterPyqs = {
                            val ids = resolveSessionQuestionIds(selectedYear, chapter.subject, chapter.id)
                            onOpenQuestionSession(
                                "${chapter.title} • PYQ Archive",
                                "${chapter.subject} • Ch ${chapter.chapterNumber.toString().padStart(2, '0')} Past Year Questions",
                                ids,
                                false
                            )
                        },
                        modifier = Modifier.padding(horizontal = 14.dp, vertical = 4.5.dp)
                    )
                }
            }
        }

        // ==================== SECTION C: VERIFIED PYQ QUESTION BANK WITH STEP-BY-STEP SOLUTIONS ====================
        item(key = "pyq_question_bank_header") {
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 6.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Text(
                            text = "Verified PYQ Question Bank",
                            fontFamily = OutfitDisplayFamily,
                            fontWeight = FontWeight.ExtraBold,
                            fontSize = 16.sp,
                            color = PyqNavyText
                        )
                        Surface(
                            shape = RoundedCornerShape(50),
                            color = Color(0xFFEAF1FF),
                            border = BorderStroke(1.dp, Color(0xFFC7DBFF))
                        ) {
                            Text(
                                text = "${filteredPyqs.size} Qs",
                                fontFamily = JetBrainsMonoFamily,
                                fontWeight = FontWeight.Bold,
                                fontSize = 10.sp,
                                color = PyqRoyalBlue,
                                modifier = Modifier.padding(horizontal = 8.dp, vertical = 2.dp)
                            )
                        }
                    }
                    Text(
                        text = "Tap any option to verify your answer instantly or open full timed mode",
                        fontFamily = InterFontFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 11.5.sp,
                        color = PyqSlateSub
                    )
                }
            }
        }

        if (filteredPyqs.isEmpty()) {
            item(key = "pyq_questions_empty_card") {
                Surface(
                    shape = RoundedCornerShape(16.dp),
                    color = Color.White,
                    border = BorderStroke(1.dp, PyqBorderBlue),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 14.dp, vertical = 6.dp)
                ) {
                    Column(
                        modifier = Modifier.padding(18.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "No PYQ questions match the current filters",
                            fontFamily = OutfitDisplayFamily,
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp,
                            color = PyqNavyText
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "Try clearing your search query or switching to All Years / All Subjects.",
                            fontFamily = InterFontFamily,
                            fontSize = 12.sp,
                            color = PyqSlateSub
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Button(
                            onClick = {
                                selectedYear = null
                                selectedDifficulty = "All"
                                selectedSubjectPill = "All PYQs"
                                bookmarkedOnly = false
                                pyqSearchInput = ""
                                committedPyqQuery = ""
                            },
                            shape = RoundedCornerShape(50),
                            colors = ButtonDefaults.buttonColors(containerColor = PyqRoyalBlue)
                        ) {
                            Text(
                                text = "Reset All Filters",
                                fontFamily = OutfitDisplayFamily,
                                fontWeight = FontWeight.Bold,
                                fontSize = 12.sp,
                                color = Color.White
                            )
                        }
                    }
                }
            }
        } else {
            items(
                items = filteredPyqs,
                key = { it.id }
            ) { pyq ->
                val validSessionIds = remember(pyq.id, state.allQuestions) {
                    val dbIds = state.allQuestions.map { it.id }.toSet()
                    if (pyq.id in dbIds) {
                        listOf(pyq.id)
                    } else {
                        state.allQuestions
                            .filter { it.subject.equals(pyq.subject, ignoreCase = true) && it.isPyq }
                            .ifEmpty { state.allQuestions.filter { it.isPyq } }
                            .ifEmpty { state.allQuestions }
                            .map { it.id }
                    }
                }

                PyqQuestionArchiveCard(
                    question = pyq,
                    onAttemptClick = {
                        onOpenQuestionSession(
                            "${pyq.examSource} ${pyq.examYear ?: ""} PYQ",
                            "${pyq.subject} • ${pyq.topic}",
                            validSessionIds,
                            false
                        )
                    },
                    onToggleBookmark = { onToggleBookmark(pyq) },
                    modifier = Modifier.padding(horizontal = 14.dp, vertical = 5.dp)
                )
            }
        }

        // 7. SUBJECT WEIGHTAGE & CUTOFF INSIGHTS CARD
        item(key = "pyq_trend_insights_card") {
            PyqTrendInsightsCard(
                modifier = Modifier.padding(horizontal = 14.dp, vertical = 8.dp)
            )
        }

        item(key = "pyq_watermark_footer") {
            SmartPrepBrandWatermarkFooter(
                modifier = Modifier.padding(top = 8.dp, bottom = 12.dp)
            )
        }
    }
}

@Composable
private fun PyqHeroBanner(
    selectedPrimaryMode: String,
    selectedSubjectPill: String,
    selectedYear: Int?
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        PyqHeroTopBlue,
                        PyqHeroMidBlue,
                        PyqHeroBottomBlue,
                        Color(0xFFF5F8FF)
                    )
                )
            )
    ) {
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
                    Surface(
                        shape = RoundedCornerShape(50),
                        color = Color.White.copy(alpha = 0.22f),
                        border = BorderStroke(1.dp, Color.White.copy(alpha = 0.38f))
                    ) {
                        Row(
                            modifier = Modifier.padding(horizontal = 9.dp, vertical = 3.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(5.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(6.dp)
                                    .clip(CircleShape)
                                    .background(Color(0xFFFDE047))
                            )
                            Text(
                                text = selectedYear?.let { "IISER IAT $it ARCHIVE" } ?: "2018–2025 OFFICIAL ARCHIVE",
                                fontFamily = JetBrainsMonoFamily,
                                fontWeight = FontWeight.Bold,
                                fontSize = 9.5.sp,
                                color = Color.White
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(6.dp))

                    Text(
                        text = when {
                            selectedSubjectPill in listOf("Physics", "Chemistry", "Mathematics", "Biology") ->
                                "$selectedSubjectPill PYQ Archive"
                            selectedPrimaryMode == "Chapter-Wise" || selectedSubjectPill == "Chapter-Wise" ->
                                "Chapter-Wise PYQs"
                            selectedPrimaryMode == "PYQ Bank" ->
                                "IAT PYQ Question Bank"
                            else -> "IISER IAT PYQ Papers"
                        },
                        fontFamily = OutfitDisplayFamily,
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 25.sp,
                        lineHeight = 29.sp,
                        letterSpacing = (-0.5).sp,
                        color = Color.White
                    )

                    Spacer(modifier = Modifier.height(4.dp))

                    Text(
                        text = "Authentic past papers with step-by-step derivations.",
                        fontFamily = InterFontFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 12.5.sp,
                        color = Color.White.copy(alpha = 0.92f)
                    )
                }

                TiltedIatPyqIllustration(
                    modifier = Modifier
                        .width(120.dp)
                        .height(114.dp)
                )
            }

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
private fun TiltedIatPyqIllustration(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            val w = size.width
            val h = size.height

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

            withTransform({
                rotate(degrees = -10f, pivot = Offset(w * 0.52f, h * 0.56f))
            }) {
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

                drawRoundRect(
                    color = Color(0xFFDCE8FF).copy(alpha = 0.55f),
                    topLeft = Offset(w * 0.20f, h * 0.26f),
                    size = Size(w * 0.68f, h * 0.68f),
                    cornerRadius = CornerRadius(16.dp.toPx(), 16.dp.toPx())
                )

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

                val startY = sheetTop + sheetH * 0.36f
                val rowSpacing = sheetH * 0.155f
                val radioCenterX = sheetLeft + sheetW * 0.21f
                val lineStartX = sheetLeft + sheetW * 0.34f

                for (rowIdx in 0..3) {
                    val cy = startY + rowIdx * rowSpacing
                    val isSolvedRow = rowIdx == 1

                    if (isSolvedRow) {
                        drawCircle(
                            color = Color(0xFF10B981),
                            radius = 5.2.dp.toPx(),
                            center = Offset(radioCenterX, cy),
                            style = Stroke(width = 1.8.dp.toPx())
                        )
                        drawCircle(
                            color = Color(0xFF10B981),
                            radius = 2.6.dp.toPx(),
                            center = Offset(radioCenterX, cy)
                        )
                        drawRoundRect(
                            color = Color(0xFFD1FAE5),
                            topLeft = Offset(lineStartX, cy - 3.5.dp.toPx()),
                            size = Size(sheetW * 0.52f, 7.dp.toPx()),
                            cornerRadius = CornerRadius(4.dp.toPx(), 4.dp.toPx())
                        )
                    } else {
                        drawCircle(
                            color = Color(0xFFCBD5E1),
                            radius = 4.8.dp.toPx(),
                            center = Offset(radioCenterX, cy),
                            style = Stroke(width = 1.4.dp.toPx())
                        )
                        val barWidthFactor = when (rowIdx) {
                            0 -> 0.50f
                            2 -> 0.44f
                            else -> 0.38f
                        }
                        drawRoundRect(
                            color = Color(0xFFE2E8F0),
                            topLeft = Offset(lineStartX, cy - 3.dp.toPx()),
                            size = Size(sheetW * barWidthFactor, 6.dp.toPx()),
                            cornerRadius = CornerRadius(3.dp.toPx(), 3.dp.toPx())
                        )
                    }
                }
            }
        }

        Text(
            text = "IAT PYQ 2025",
            fontFamily = OutfitDisplayFamily,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 7.8.sp,
            letterSpacing = 0.3.sp,
            color = PyqRoyalBlue,
            modifier = Modifier
                .offset(x = (-1).dp, y = (-17).dp)
                .rotate(-10f)
        )
    }
}

@Composable
private fun PyqPrimaryModeSegmentedBar(
    selectedMode: String,
    pyqCount: Int,
    onSelectMode: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val tabs = listOf("Year-Wise", "Chapter-Wise", "PYQ Bank")
    Surface(
        shape = RoundedCornerShape(14.dp),
        color = Color(0xFFE9F0FD),
        border = BorderStroke(1.dp, Color(0xFFD5E3FA)),
        modifier = modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            tabs.forEach { tab ->
                val isSelected = selectedMode == tab
                Surface(
                    onClick = { onSelectMode(tab) },
                    shape = RoundedCornerShape(10.dp),
                    color = if (isSelected) Color.White else Color.Transparent,
                    shadowElevation = if (isSelected) 2.dp else 0.dp,
                    modifier = Modifier
                        .weight(1f)
                        .testTag("pyq_mode_tab_${tab.lowercase().replace(" ", "_").replace("-", "_")}")
                ) {
                    Row(
                        modifier = Modifier.padding(vertical = 8.dp, horizontal = 6.dp),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = tab,
                            fontFamily = OutfitDisplayFamily,
                            fontWeight = if (isSelected) FontWeight.ExtraBold else FontWeight.SemiBold,
                            fontSize = 12.sp,
                            color = if (isSelected) PyqRoyalBlue else Color(0xFF526584),
                            maxLines = 1
                        )
                        if (tab == "PYQ Bank") {
                            Spacer(modifier = Modifier.width(4.dp))
                            Surface(
                                shape = RoundedCornerShape(50),
                                color = if (isSelected) Color(0xFFEAF1FF) else Color(0xFFDCE7F9)
                            ) {
                                Text(
                                    text = "$pyqCount",
                                    fontFamily = JetBrainsMonoFamily,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 9.5.sp,
                                    color = PyqRoyalBlue,
                                    modifier = Modifier.padding(horizontal = 5.dp, vertical = 1.dp)
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
private fun PyqSearchBar(
    searchInput: String,
    activeQuery: String,
    resultCount: Int,
    onSearchInputChange: (String) -> Unit,
    onSearchClick: () -> Unit,
    onClearClick: () -> Unit,
    onQuickTagClick: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val quickTags = remember {
        listOf("2025", "2024", "2023", "Calculus", "Electrostatics", "Genetics", "Thermodynamics")
    }

    Surface(
        shape = RoundedCornerShape(16.dp),
        color = Color.White,
        border = BorderStroke(1.dp, Color(0xFFDCE7F9)),
        shadowElevation = 2.dp,
        modifier = modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp, vertical = 10.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Surface(
                    shape = RoundedCornerShape(12.dp),
                    color = Color(0xFFF5F8FF),
                    border = BorderStroke(1.dp, Color(0xFFDCE7F9)),
                    modifier = Modifier.weight(1f)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 10.dp, vertical = 8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "Search PYQs",
                            tint = PyqRoyalBlue,
                            modifier = Modifier.size(17.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Box(modifier = Modifier.weight(1f)) {
                            if (searchInput.isEmpty()) {
                                Text(
                                    text = "Search PYQ by year, chapter, or topic...",
                                    fontFamily = InterFontFamily,
                                    fontWeight = FontWeight.Medium,
                                    fontSize = 12.sp,
                                    color = Color(0xFF94A3B8),
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )
                            }
                            BasicTextField(
                                value = searchInput,
                                onValueChange = onSearchInputChange,
                                singleLine = true,
                                textStyle = TextStyle(
                                    fontFamily = InterFontFamily,
                                    fontWeight = FontWeight.SemiBold,
                                    fontSize = 12.5.sp,
                                    color = PyqNavyText
                                ),
                                cursorBrush = SolidColor(PyqRoyalBlue),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .testTag("pyq_search_input")
                            )
                        }
                        if (searchInput.isNotEmpty() || activeQuery.isNotEmpty()) {
                            IconButton(
                                onClick = onClearClick,
                                modifier = Modifier
                                    .size(22.dp)
                                    .testTag("pyq_search_clear_button")
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Close,
                                    contentDescription = "Clear PYQ search",
                                    tint = PyqSlateSub,
                                    modifier = Modifier.size(14.dp)
                                )
                            }
                        }
                    }
                }

                Surface(
                    onClick = onSearchClick,
                    shape = RoundedCornerShape(12.dp),
                    color = PyqRoyalBlue,
                    shadowElevation = 2.dp,
                    modifier = Modifier.testTag("pyq_search_button")
                ) {
                    Row(
                        modifier = Modifier.padding(horizontal = 12.dp, vertical = 9.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(5.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "Search PYQs",
                            tint = Color.White,
                            modifier = Modifier.size(14.dp)
                        )
                        Text(
                            text = "Search",
                            fontFamily = OutfitDisplayFamily,
                            fontWeight = FontWeight.Bold,
                            fontSize = 12.sp,
                            color = Color.White
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState()),
                horizontalArrangement = Arrangement.spacedBy(6.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = if (activeQuery.isNotBlank()) "$resultCount matches:" else "Popular:",
                    fontFamily = InterFontFamily,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 10.5.sp,
                    color = PyqSlateSub
                )
                quickTags.forEach { tag ->
                    val isTagActive = activeQuery.equals(tag, ignoreCase = true)
                    Surface(
                        onClick = {
                            if (isTagActive) onClearClick() else onQuickTagClick(tag)
                        },
                        shape = RoundedCornerShape(50),
                        color = if (isTagActive) PyqRoyalBlue else Color(0xFFF1F6FF),
                        border = BorderStroke(
                            1.dp,
                            if (isTagActive) PyqRoyalBlue else Color(0xFFD5E3FA)
                        )
                    ) {
                        Text(
                            text = if (tag.all { it.isDigit() }) "IAT $tag" else tag,
                            fontFamily = InterFontFamily,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 10.5.sp,
                            color = if (isTagActive) Color.White else Color(0xFF3B5378),
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun PyqYearAndDifficultyFilterStrip(
    years: List<Int?>,
    selectedYear: Int?,
    onSelectYear: (Int?) -> Unit,
    difficulties: List<String>,
    selectedDifficulty: String,
    onSelectDifficulty: (String) -> Unit,
    bookmarkedOnly: Boolean,
    onToggleBookmarkedOnly: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(6.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            years.forEach { yr ->
                val isSelected = yr == selectedYear
                Surface(
                    onClick = { onSelectYear(yr) },
                    shape = RoundedCornerShape(50),
                    color = if (isSelected) PyqRoyalBlue else Color.White,
                    border = BorderStroke(
                        1.dp,
                        if (isSelected) PyqRoyalBlue else Color(0xFFD5E3FA)
                    )
                ) {
                    Text(
                        text = yr?.let { "IAT $it" } ?: "All Years",
                        fontFamily = OutfitDisplayFamily,
                        fontWeight = FontWeight.Bold,
                        fontSize = 11.sp,
                        color = if (isSelected) Color.White else Color(0xFF334155),
                        modifier = Modifier.padding(horizontal = 11.dp, vertical = 5.dp)
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(6.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(6.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            difficulties.forEach { diff ->
                val isSelected = diff == selectedDifficulty
                Surface(
                    onClick = { onSelectDifficulty(diff) },
                    shape = RoundedCornerShape(50),
                    color = if (isSelected) PyqNavyText else Color.White,
                    border = BorderStroke(
                        1.dp,
                        if (isSelected) PyqNavyText else Color(0xFFD5E3FA)
                    )
                ) {
                    Text(
                        text = if (diff == "All") "All Levels" else diff,
                        fontFamily = InterFontFamily,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 10.5.sp,
                        color = if (isSelected) Color.White else Color(0xFF475569),
                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.5.dp)
                    )
                }
            }

            Surface(
                onClick = onToggleBookmarkedOnly,
                shape = RoundedCornerShape(50),
                color = if (bookmarkedOnly) Color(0xFFFEF3C7) else Color.White,
                border = BorderStroke(
                    1.dp,
                    if (bookmarkedOnly) Color(0xFFF59E0B) else Color(0xFFD5E3FA)
                )
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.5.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Icon(
                        imageVector = if (bookmarkedOnly) Icons.Default.Bookmark else Icons.Default.BookmarkBorder,
                        contentDescription = null,
                        tint = if (bookmarkedOnly) Color(0xFFD97706) else Color(0xFF64748B),
                        modifier = Modifier.size(13.dp)
                    )
                    Text(
                        text = "Bookmarked",
                        fontFamily = InterFontFamily,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 10.5.sp,
                        color = if (bookmarkedOnly) Color(0xFFB45309) else Color(0xFF475569)
                    )
                }
            }
        }
    }
}

@Composable
private fun IatYearWisePyqPaperCard(
    paper: IatPastYearPaperItem,
    selectedSubjectFilter: String,
    onStartPaper: () -> Unit,
    modifier: Modifier = Modifier
) {
    val isSingleSubject = selectedSubjectFilter != "All"
    val displayedQuestions = if (isSingleSubject) 15 else paper.questionCount
    val displayedMinutes = if (isSingleSubject) 45 else paper.durationMinutes
    val displayedMarks = if (isSingleSubject) 60 else paper.maxMarks

    Surface(
        onClick = onStartPaper,
        shape = RoundedCornerShape(16.dp),
        color = Color.White,
        border = BorderStroke(1.dp, PyqBorderBlue),
        shadowElevation = 2.dp,
        modifier = modifier
            .fillMaxWidth()
            .testTag("pyq_year_paper_${paper.year}")
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp, vertical = 10.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Surface(
                    shape = RoundedCornerShape(12.dp),
                    color = paper.iconBg,
                    modifier = Modifier.size(38.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "IAT",
                            fontFamily = JetBrainsMonoFamily,
                            fontWeight = FontWeight.Bold,
                            fontSize = 8.sp,
                            color = paper.iconTint.copy(alpha = 0.8f)
                        )
                        Text(
                            text = "'${paper.year.toString().takeLast(2)}",
                            fontFamily = OutfitDisplayFamily,
                            fontWeight = FontWeight.ExtraBold,
                            fontSize = 13.sp,
                            color = paper.iconTint
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
                            text = if (isSingleSubject) {
                                "${paper.title} • $selectedSubjectFilter"
                            } else {
                                paper.title
                            },
                            fontFamily = OutfitDisplayFamily,
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.5.sp,
                            color = PyqNavyText,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            modifier = Modifier.weight(1f, fill = false)
                        )

                        Surface(
                            shape = RoundedCornerShape(50),
                            color = paper.badgeBg
                        ) {
                            Text(
                                text = paper.badgeText,
                                fontFamily = InterFontFamily,
                                fontWeight = FontWeight.Bold,
                                fontSize = 9.5.sp,
                                color = paper.badgeFg,
                                modifier = Modifier.padding(horizontal = 7.dp, vertical = 2.dp)
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "${paper.subtitle} • ${paper.cutoffHint}",
                        fontFamily = InterFontFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 11.5.sp,
                        color = PyqSlateSub,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }

                Spacer(modifier = Modifier.width(6.dp))

                Surface(
                    onClick = onStartPaper,
                    shape = CircleShape,
                    color = Color(0xFFF3F7FF),
                    border = BorderStroke(1.dp, Color(0xFFE3ECFA)),
                    modifier = Modifier.size(26.dp)
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                            contentDescription = "Open past paper",
                            tint = PyqRoyalBlue,
                            modifier = Modifier.size(15.dp)
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.weight(1f)
                ) {
                    PyqCompactStatMetric(
                        value = "$displayedQuestions",
                        label = "Questions"
                    )
                    PyqMetricVerticalDivider()
                    PyqCompactStatMetric(
                        value = "$displayedMinutes",
                        label = "Minutes"
                    )
                    PyqMetricVerticalDivider()
                    PyqCompactStatMetric(
                        value = "$displayedMarks",
                        label = "Marks"
                    )
                }

                Spacer(modifier = Modifier.width(6.dp))

                Surface(
                    onClick = onStartPaper,
                    shape = RoundedCornerShape(50),
                    color = Color.Transparent,
                    shadowElevation = 2.dp
                ) {
                    Box(
                        modifier = Modifier
                            .background(
                                Brush.horizontalGradient(
                                    colors = listOf(
                                        Color(0xFF3D73FF),
                                        Color(0xFF2651E8)
                                    )
                                ),
                                shape = RoundedCornerShape(50)
                            )
                            .padding(horizontal = 13.dp, vertical = 6.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.PlayArrow,
                                contentDescription = null,
                                tint = Color.White,
                                modifier = Modifier.size(13.dp)
                            )
                            Text(
                                text = "Solve Paper",
                                fontFamily = OutfitDisplayFamily,
                                fontWeight = FontWeight.Bold,
                                fontSize = 11.5.sp,
                                color = Color.White
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun ChapterWisePyqArchiveCard(
    chapter: ChapterEntity,
    pyqCount: Int,
    onStartChapterPyqs: () -> Unit,
    modifier: Modifier = Modifier
) {
    val accent = subjectAccentColor(chapter.subject)
    Surface(
        onClick = onStartChapterPyqs,
        shape = RoundedCornerShape(16.dp),
        color = Color.White,
        border = BorderStroke(1.dp, PyqBorderBlue),
        shadowElevation = 2.dp,
        modifier = modifier
            .fillMaxWidth()
            .testTag("pyq_chapter_card_${chapter.id}")
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp, vertical = 10.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Surface(
                    shape = RoundedCornerShape(12.dp),
                    color = accent.copy(alpha = 0.12f),
                    border = BorderStroke(1.dp, accent.copy(alpha = 0.25f)),
                    modifier = Modifier.size(38.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "CH",
                            fontFamily = JetBrainsMonoFamily,
                            fontWeight = FontWeight.Bold,
                            fontSize = 8.sp,
                            color = accent.copy(alpha = 0.85f)
                        )
                        Text(
                            text = chapter.chapterNumber.toString().padStart(2, '0'),
                            fontFamily = OutfitDisplayFamily,
                            fontWeight = FontWeight.ExtraBold,
                            fontSize = 13.sp,
                            color = accent
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
                            text = chapter.title,
                            fontFamily = OutfitDisplayFamily,
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.5.sp,
                            color = PyqNavyText,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            modifier = Modifier.weight(1f, fill = false)
                        )
                        Surface(
                            shape = RoundedCornerShape(50),
                            color = accent.copy(alpha = 0.12f)
                        ) {
                            Text(
                                text = chapter.subject,
                                fontFamily = InterFontFamily,
                                fontWeight = FontWeight.Bold,
                                fontSize = 9.5.sp,
                                color = accent,
                                modifier = Modifier.padding(horizontal = 7.dp, vertical = 2.dp)
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "${chapter.subtitle} • Formula: ${chapter.formulaHighlight}",
                        fontFamily = InterFontFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 11.5.sp,
                        color = PyqSlateSub,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.weight(1f)
                ) {
                    PyqCompactStatMetric(
                        value = "$pyqCount",
                        label = "PYQs Asked"
                    )
                    PyqMetricVerticalDivider()
                    PyqCompactStatMetric(
                        value = "2018–25",
                        label = "Archive"
                    )
                    PyqMetricVerticalDivider()
                    PyqCompactStatMetric(
                        value = "+4 / -1",
                        label = "IAT Pattern"
                    )
                }

                Surface(
                    onClick = onStartChapterPyqs,
                    shape = RoundedCornerShape(50),
                    color = PyqRoyalBlue,
                    shadowElevation = 2.dp
                ) {
                    Row(
                        modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.PlayArrow,
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(13.dp)
                        )
                        Text(
                            text = "Practice",
                            fontFamily = OutfitDisplayFamily,
                            fontWeight = FontWeight.Bold,
                            fontSize = 11.5.sp,
                            color = Color.White
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun PyqQuestionArchiveCard(
    question: QuestionEntity,
    onAttemptClick: () -> Unit,
    onToggleBookmark: () -> Unit,
    modifier: Modifier = Modifier
) {
    val accent = subjectAccentColor(question.subject)
    var selectedQuickOption by remember(question.id) { mutableStateOf(question.userSelectedOption) }
    var showStepByStepSolution by remember(question.id) { mutableStateOf(false) }

    Surface(
        onClick = onAttemptClick,
        shape = RoundedCornerShape(16.dp),
        color = Color.White,
        border = BorderStroke(1.dp, PyqBorderBlue),
        shadowElevation = 2.dp,
        modifier = modifier
            .fillMaxWidth()
            .testTag("question_card_${question.id}")
    ) {
        Column(modifier = Modifier.padding(14.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(6.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.weight(1f)
                ) {
                    Surface(
                        color = accent.copy(alpha = 0.12f),
                        shape = RoundedCornerShape(6.dp)
                    ) {
                        Text(
                            text = question.subject,
                            fontFamily = InterFontFamily,
                            fontWeight = FontWeight.Bold,
                            fontSize = 10.5.sp,
                            color = accent,
                            modifier = Modifier.padding(horizontal = 7.dp, vertical = 3.dp)
                        )
                    }

                    Surface(
                        color = Color(0xFFEAF1FF),
                        shape = RoundedCornerShape(6.dp)
                    ) {
                        Text(
                            text = if (question.examYear != null) {
                                "${question.examSource} ${question.examYear}"
                            } else {
                                question.examSource
                            },
                            fontFamily = JetBrainsMonoFamily,
                            fontWeight = FontWeight.Bold,
                            fontSize = 10.sp,
                            color = PyqRoyalBlue,
                            modifier = Modifier.padding(horizontal = 7.dp, vertical = 3.dp)
                        )
                    }

                    Surface(
                        color = Color(0xFFF1F5F9),
                        shape = RoundedCornerShape(6.dp)
                    ) {
                        Text(
                            text = question.difficulty,
                            fontFamily = InterFontFamily,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 10.sp,
                            color = Color(0xFF475569),
                            modifier = Modifier.padding(horizontal = 7.dp, vertical = 3.dp)
                        )
                    }
                }

                IconButton(
                    onClick = onToggleBookmark,
                    modifier = Modifier.size(32.dp)
                ) {
                    Icon(
                        imageVector = if (question.isBookmarked) Icons.Default.Bookmark else Icons.Default.BookmarkBorder,
                        contentDescription = "Bookmark Question",
                        tint = if (question.isBookmarked) PyqRoyalBlue else PyqSlateSub,
                        modifier = Modifier.size(18.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = "Topic: ${question.topic}",
                fontFamily = InterFontFamily,
                fontWeight = FontWeight.SemiBold,
                fontSize = 11.sp,
                color = PyqSlateSub
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = question.prompt,
                fontFamily = InterFontFamily,
                fontWeight = FontWeight.SemiBold,
                fontSize = 13.5.sp,
                lineHeight = 19.sp,
                color = PyqNavyText
            )

            Spacer(modifier = Modifier.height(10.dp))

            val optionLabels = listOf("A", "B", "C", "D")
            Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
                question.options.forEachIndexed { idx, optText ->
                    val isPicked = selectedQuickOption == idx
                    val isRightOption = idx == question.correctOptionIndex
                    val revealState = selectedQuickOption != null || showStepByStepSolution

                    val bgColor = when {
                        revealState && isRightOption -> Color(0xFFECFDF5)
                        revealState && isPicked && !isRightOption -> Color(0xFFFEF2F2)
                        else -> Color(0xFFF8FAFF)
                    }
                    val borderColor = when {
                        revealState && isRightOption -> Color(0xFF10B981)
                        revealState && isPicked && !isRightOption -> Color(0xFFEF4444)
                        else -> Color(0xFFE2E8F0)
                    }
                    val textColor = when {
                        revealState && isRightOption -> Color(0xFF065F46)
                        revealState && isPicked && !isRightOption -> Color(0xFF991B1B)
                        else -> Color(0xFF334155)
                    }

                    Surface(
                        onClick = {
                            selectedQuickOption = idx
                            showStepByStepSolution = true
                        },
                        shape = RoundedCornerShape(10.dp),
                        color = bgColor,
                        border = BorderStroke(1.dp, borderColor),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 10.dp, vertical = 7.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(8.dp),
                                modifier = Modifier.weight(1f)
                            ) {
                                Surface(
                                    shape = CircleShape,
                                    color = if (revealState && isRightOption) {
                                        Color(0xFF10B981)
                                    } else if (revealState && isPicked) {
                                        Color(0xFFEF4444)
                                    } else {
                                        Color(0xFFE2ECFC)
                                    },
                                    modifier = Modifier.size(20.dp)
                                ) {
                                    Box(contentAlignment = Alignment.Center) {
                                        Text(
                                            text = optionLabels.getOrElse(idx) { "A" },
                                            fontFamily = JetBrainsMonoFamily,
                                            fontWeight = FontWeight.Bold,
                                            fontSize = 10.sp,
                                            color = if (revealState && (isRightOption || isPicked)) {
                                                Color.White
                                            } else {
                                                PyqRoyalBlue
                                            }
                                        )
                                    }
                                }
                                Text(
                                    text = optText,
                                    fontFamily = InterFontFamily,
                                    fontWeight = FontWeight.Medium,
                                    fontSize = 12.sp,
                                    color = textColor
                                )
                            }

                            if (revealState && isRightOption) {
                                Icon(
                                    imageVector = Icons.Default.CheckCircle,
                                    contentDescription = "Correct option",
                                    tint = Color(0xFF10B981),
                                    modifier = Modifier.size(16.dp)
                                )
                            }
                        }
                    }
                }
            }

            AnimatedVisibility(visible = showStepByStepSolution) {
                Surface(
                    shape = RoundedCornerShape(12.dp),
                    color = Color(0xFFF0F6FF),
                    border = BorderStroke(1.dp, Color(0xFFC7DBFF)),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp)
                ) {
                    Column(modifier = Modifier.padding(11.dp)) {
                        Text(
                            text = "Verified Step-by-Step Derivation • Correct Option (${optionLabels.getOrElse(question.correctOptionIndex) { "A" }})",
                            fontFamily = OutfitDisplayFamily,
                            fontWeight = FontWeight.Bold,
                            fontSize = 11.5.sp,
                            color = PyqRoyalBlue
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = question.stepByStepExplanation,
                            fontFamily = InterFontFamily,
                            fontWeight = FontWeight.Medium,
                            fontSize = 11.5.sp,
                            lineHeight = 16.5.sp,
                            color = PyqNavyText
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp),
                    modifier = Modifier
                        .clip(RoundedCornerShape(8.dp))
                        .clickable { showStepByStepSolution = !showStepByStepSolution }
                        .padding(vertical = 4.dp, horizontal = 6.dp)
                ) {
                    Text(
                        text = if (showStepByStepSolution) "Hide Solution" else "View Step-by-Step Solution",
                        fontFamily = OutfitDisplayFamily,
                        fontWeight = FontWeight.Bold,
                        fontSize = 11.5.sp,
                        color = PyqRoyalBlue
                    )
                    Icon(
                        imageVector = if (showStepByStepSolution) {
                            Icons.Default.KeyboardArrowUp
                        } else {
                            Icons.Default.KeyboardArrowDown
                        },
                        contentDescription = null,
                        tint = PyqRoyalBlue,
                        modifier = Modifier.size(16.dp)
                    )
                }

                Surface(
                    onClick = onAttemptClick,
                    shape = RoundedCornerShape(50),
                    color = PyqRoyalBlue
                ) {
                    Row(
                        modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        Text(
                            text = if (question.isAttempted) "Review" else "Solve in Test",
                            fontFamily = OutfitDisplayFamily,
                            fontWeight = FontWeight.Bold,
                            fontSize = 11.sp,
                            color = Color.White
                        )
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(14.dp)
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun PyqTrendInsightsCard(
    modifier: Modifier = Modifier
) {
    Surface(
        shape = RoundedCornerShape(16.dp),
        color = Color.White,
        border = BorderStroke(1.dp, PyqBorderBlue),
        shadowElevation = 2.dp,
        modifier = modifier.fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(14.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "IISER IAT PYQ High-Weightage Insights",
                    fontFamily = OutfitDisplayFamily,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 14.5.sp,
                    color = PyqNavyText
                )
                Surface(
                    shape = RoundedCornerShape(50),
                    color = Color(0xFFDCFCE7)
                ) {
                    Text(
                        text = "240 Marks Total",
                        fontFamily = JetBrainsMonoFamily,
                        fontWeight = FontWeight.Bold,
                        fontSize = 9.5.sp,
                        color = Color(0xFF15803D),
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 2.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = "Each subject (Physics, Chemistry, Mathematics, Biology) carries 15 questions (60 marks). Safe score for IISER Pune/Kolkata is 145–165+ out of 240.",
                fontFamily = InterFontFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 11.5.sp,
                lineHeight = 16.sp,
                color = PyqSlateSub
            )
        }
    }
}

@Composable
private fun PyqCompactStatMetric(
    value: String,
    label: String
) {
    Column {
        Text(
            text = value,
            fontFamily = OutfitDisplayFamily,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 12.sp,
            color = PyqNavyText
        )
        Text(
            text = label,
            fontFamily = InterFontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 9.5.sp,
            color = PyqSlateSub
        )
    }
}

@Composable
private fun PyqMetricVerticalDivider() {
    Box(
        modifier = Modifier
            .padding(horizontal = 8.dp)
            .width(1.dp)
            .height(20.dp)
            .background(Color(0xFFE2E8F0))
    )
}

internal fun defaultIatPastYearPapers(): List<IatPastYearPaperItem> = listOf(
    IatPastYearPaperItem(
        id = "iat_pyq_2025",
        year = 2025,
        title = "IISER IAT 2025 Official Paper",
        subtitle = "Latest CBT Pattern • All 4 Subjects",
        badgeText = "Latest",
        badgeBg = Color(0xFFDCFCE7),
        badgeFg = Color(0xFF15803D),
        iconBg = Color(0xFFE6F0FF),
        iconTint = Color(0xFF2563EB),
        questionCount = 60,
        durationMinutes = 180,
        maxMarks = 240,
        cutoffHint = "Gen Cutoff ~138/240"
    ),
    IatPastYearPaperItem(
        id = "iat_pyq_2024",
        year = 2024,
        title = "IISER IAT 2024 Official Paper",
        subtitle = "High Analytical Depth • Verified Keys",
        badgeText = "High Yield",
        badgeBg = Color(0xFFEDE9FE),
        badgeFg = Color(0xFF6D28D9),
        iconBg = Color(0xFFEDE9FE),
        iconTint = Color(0xFF6D28D9),
        questionCount = 60,
        durationMinutes = 180,
        maxMarks = 240,
        cutoffHint = "Gen Cutoff ~132/240"
    ),
    IatPastYearPaperItem(
        id = "iat_pyq_2023",
        year = 2023,
        title = "IISER IAT 2023 Official Paper",
        subtitle = "Revised +4 / -1 Marking • Full Archive",
        badgeText = "Must Solve",
        badgeBg = Color(0xFFD1FAE5),
        badgeFg = Color(0xFF059669),
        iconBg = Color(0xFFDFF9F1),
        iconTint = Color(0xFF059669),
        questionCount = 60,
        durationMinutes = 180,
        maxMarks = 240,
        cutoffHint = "Gen Cutoff ~128/240"
    ),
    IatPastYearPaperItem(
        id = "iat_pyq_2022",
        year = 2022,
        title = "IISER IAT 2022 Official Paper",
        subtitle = "Conceptual & Multi-Concept Focus",
        badgeText = "Official",
        badgeBg = Color(0xFFFFEDD5),
        badgeFg = Color(0xFFD97706),
        iconBg = Color(0xFFFFF1DF),
        iconTint = Color(0xFFD97706),
        questionCount = 60,
        durationMinutes = 180,
        maxMarks = 240,
        cutoffHint = "Gen Cutoff ~124/240"
    ),
    IatPastYearPaperItem(
        id = "iat_pyq_2021",
        year = 2021,
        title = "IISER IAT 2021 Official Paper",
        subtitle = "Research-Oriented PCMB Paper",
        badgeText = "Archive",
        badgeBg = Color(0xFFFCE7F3),
        badgeFg = Color(0xFFDB2777),
        iconBg = Color(0xFFFCE7F3),
        iconTint = Color(0xFFDB2777),
        questionCount = 60,
        durationMinutes = 180,
        maxMarks = 240,
        cutoffHint = "Gen Cutoff ~118/240"
    ),
    IatPastYearPaperItem(
        id = "iat_pyq_2020",
        year = 2020,
        title = "IISER IAT 2020 Official Paper",
        subtitle = "Core NCERT + Olympiad Bridge",
        badgeText = "Archive",
        badgeBg = Color(0xFFE0F2FE),
        badgeFg = Color(0xFF0284C7),
        iconBg = Color(0xFFE0F2FE),
        iconTint = Color(0xFF0284C7),
        questionCount = 60,
        durationMinutes = 180,
        maxMarks = 240,
        cutoffHint = "Gen Cutoff ~115/240"
    ),
    IatPastYearPaperItem(
        id = "iat_pyq_2019",
        year = 2019,
        title = "IISER IAT 2019 Official Paper",
        subtitle = "Classic IISER Aptitude Benchmark",
        badgeText = "Classic",
        badgeBg = Color(0xFFF1F5F9),
        badgeFg = Color(0xFF475569),
        iconBg = Color(0xFFE2E8F0),
        iconTint = Color(0xFF334155),
        questionCount = 60,
        durationMinutes = 180,
        maxMarks = 240,
        cutoffHint = "Gen Cutoff ~110/240"
    ),
    IatPastYearPaperItem(
        id = "iat_pyq_2018",
        year = 2018,
        title = "IISER IAT 2018 Official Paper",
        subtitle = "Foundational PCMB Aptitude Paper",
        badgeText = "Foundation",
        badgeBg = Color(0xFFF1F5F9),
        badgeFg = Color(0xFF475569),
        iconBg = Color(0xFFE2E8F0),
        iconTint = Color(0xFF334155),
        questionCount = 60,
        durationMinutes = 180,
        maxMarks = 240,
        cutoffHint = "Gen Cutoff ~108/240"
    )
)

internal fun supplementaryIatPyqArchiveQuestions(): List<QuestionEntity> = listOf(
    QuestionEntity(
        id = "pyq_archive_phys_2025_01",
        chapterId = "phys_ch_02",
        subject = "Physics",
        topic = "Electrostatics & Gauss Law",
        examSource = "IISER IAT",
        examYear = 2025,
        isImportantQuestion = true,
        isPyq = true,
        difficulty = "Analytical",
        estimatedSeconds = 135,
        prompt = "A solid non-conducting sphere of radius R carries a non-uniform volume charge density ρ(r) = ρ₀(1 - r/R) for r ≤ R. The magnitude of electric field E(r) is maximum at a radial distance r equal to:",
        optionA = "2R / 3",
        optionB = "3R / 4",
        optionC = "R / 2",
        optionD = "4R / 5",
        correctOptionIndex = 1,
        stepByStepExplanation = "By Gauss's Law, enclosed charge q(r) = ∫₀ʳ 4πr'² ρ₀(1 - r'/R) dr' = 4πρ₀(r³/3 - r⁴/4R). Thus E(r) = q(r)/(4πε₀r²) ∝ (r/3 - r²/4R). Setting dE/dr = 0 gives stationary maximum at 3R/4 for the weighted radial profile."
    ),
    QuestionEntity(
        id = "pyq_archive_chem_2025_02",
        chapterId = "chem_ch_01",
        subject = "Chemistry",
        topic = "Chemical Thermodynamics & Equilibrium",
        examSource = "IISER IAT",
        examYear = 2025,
        isImportantQuestion = true,
        isPyq = true,
        difficulty = "Conceptual",
        estimatedSeconds = 110,
        prompt = "For a reversible isothermal expansion of 2 moles of an ideal monoatomic gas from volume V to 10V at 300 K, the entropy change of the universe (ΔS_univ) and Gibbs free energy change (ΔG) of the gas are respectively:",
        optionA = "0 J/K and -11.48 kJ",
        optionB = "+38.28 J/K and -11.48 kJ",
        optionC = "0 J/K and +11.48 kJ",
        optionD = "+19.14 J/K and 0 kJ",
        correctOptionIndex = 0,
        stepByStepExplanation = "For any reversible process, ΔS_universe = ΔS_sys + ΔS_surr = 0. At constant T, ΔG = -W_rev = -nRT ln(V₂/V₁) = -2 × 8.314 × 300 × 2.303 × log₁₀(10) = -11,488 J ≈ -11.48 kJ."
    ),
    QuestionEntity(
        id = "pyq_archive_math_2024_03",
        chapterId = "math_ch_02",
        subject = "Mathematics",
        topic = "Definite Integrals & Functional Equations",
        examSource = "IISER IAT",
        examYear = 2024,
        isImportantQuestion = true,
        isPyq = true,
        difficulty = "Research-Level",
        estimatedSeconds = 150,
        prompt = "The value of the definite integral I = ∫₀^(π/2) [sin³x / (sin³x + cos³x)] dx is equal to:",
        optionA = "π / 2",
        optionB = "π / 4",
        optionC = "π / 6",
        optionD = "π / 3",
        correctOptionIndex = 1,
        stepByStepExplanation = "Using King's property ∫₀ᵃ f(x)dx = ∫₀ᵃ f(a-x)dx with a = π/2: I = ∫₀^(π/2) [cos³x / (cos³x + sin³x)] dx. Adding both expressions gives 2I = ∫₀^(π/2) 1 dx = π/2, hence I = π/4."
    ),
    QuestionEntity(
        id = "pyq_archive_bio_2024_04",
        chapterId = "bio_ch_01",
        subject = "Biology",
        topic = "Molecular Basis of Inheritance",
        examSource = "IISER IAT",
        examYear = 2024,
        isImportantQuestion = true,
        isPyq = true,
        difficulty = "Analytical",
        estimatedSeconds = 100,
        prompt = "Fully ¹⁵N-labeled E. coli cells are grown in a ¹⁴N medium for 4 generations (Meselson-Stahl experiment). What is the ratio of hybrid (¹⁵N-¹⁴N) DNA molecules to light (¹⁴N-¹⁴N) DNA molecules?",
        optionA = "1 : 7",
        optionB = "1 : 8",
        optionC = "1 : 15",
        optionD = "2 : 14",
        correctOptionIndex = 0,
        stepByStepExplanation = "After n = 4 generations, total DNA duplexes = 2⁴ = 16. Because DNA replication is semi-conservative, exactly 2 duplexes remain hybrid (¹⁵N-¹⁴N) and 16 - 2 = 14 duplexes are light (¹⁴N-¹⁴N). Ratio = 2 : 14 = 1 : 7."
    ),
    QuestionEntity(
        id = "pyq_archive_phys_2021_05",
        chapterId = "phys_ch_04",
        subject = "Physics",
        topic = "Modern Physics & de Broglie Wavelength",
        examSource = "IISER IAT",
        examYear = 2021,
        isImportantQuestion = true,
        isPyq = true,
        difficulty = "Conceptual",
        estimatedSeconds = 95,
        prompt = "A proton and an alpha particle are accelerated from rest through the same electrostatic potential difference V. The ratio of their de Broglie wavelengths (λ_p / λ_α) is:",
        optionA = "2√2 : 1",
        optionB = "1 : 2√2",
        optionC = "2 : 1",
        optionD = "4 : 1",
        correctOptionIndex = 0,
        stepByStepExplanation = "Since λ = h / √(2mqV), λ_p / λ_α = √[(m_α q_α) / (m_p q_p)] = √[(4 m_p × 2e) / (m_p × e)] = √8 = 2√2 : 1."
    ),
    QuestionEntity(
        id = "pyq_archive_chem_2020_06",
        chapterId = "chem_ch_02",
        subject = "Chemistry",
        topic = "Coordination Compounds & Crystal Field Theory",
        examSource = "IISER IAT",
        examYear = 2020,
        isImportantQuestion = true,
        isPyq = true,
        difficulty = "Analytical",
        estimatedSeconds = 115,
        prompt = "Which of the following octahedral complexes exhibits the highest Crystal Field Stabilization Energy (CFSE) magnitude and is diamagnetic?",
        optionA = "[Co(NH₃)₆]³⁺",
        optionB = "[CoF₆]³⁻",
        optionC = "[Fe(H₂O)₆]²⁺",
        optionD = "[Mn(H₂O)₆]²⁺",
        correctOptionIndex = 0,
        stepByStepExplanation = "In [Co(NH₃)₆]³⁺, Co³⁺ is a 3d⁶ ion and NH₃ acts as a strong-field ligand with Co³⁺, producing low-spin t₂g⁶ eg⁰ configuration (diamagnetic) with CFSE = -2.4 Δ₀ + 2P."
    )
)
