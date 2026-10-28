package com.example.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Search
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.local.ChapterEntity
import com.example.data.local.SmartPrepSeedData
import com.example.data.local.MockTestEntity
import com.example.data.local.QuestionEntity
import com.example.ui.SmartPrepUiState
import com.example.ui.components.SmartPrepBrandWatermarkFooter
import com.example.ui.components.subjectAccentColor
import com.example.ui.theme.InterFontFamily
import com.example.ui.theme.JetBrainsMonoFamily
import com.example.ui.theme.OutfitDisplayFamily

@Composable
internal fun PracticeTabScreenContent(
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
    val subjectFilters = remember {
        listOf("Full Mock Test", "Chapter-Wise", "Physics", "Chemistry", "Mathematics", "Biology")
    }
    var selectedSubjectFilter by remember { mutableStateOf("Full Mock Test") }
    var showAllFullMocks by remember { mutableStateOf(true) }
    var selectedMockPrimaryTab by remember { mutableStateOf("Mock Tests") }
    var selectedHistoryOrAnalyticsTab by remember { mutableStateOf("History") }

    // Chapter-Wise Mock Test state: search input, committed query, subject filter, and expand toggle
    var chapterSearchInput by remember { mutableStateOf("") }
    var committedChapterQuery by remember { mutableStateOf("") }
    var chapterWiseSubjectSubFilter by remember { mutableStateOf("All") }
    var showAllChaptersInMock by remember { mutableStateOf(false) }

    val allMocks = state.mockTests
    val fullLengthMocks = remember(allMocks) {
        val list = allMocks.filter {
            !it.title.contains("Quick Mock", ignoreCase = true) &&
                !it.title.contains("Sectional", ignoreCase = true)
        }
        if (list.isNotEmpty()) list else allMocks
    }
    val quickMocks = remember(allMocks) {
        allMocks.filter {
            it.title.contains("Quick Mock", ignoreCase = true) ||
                it.title.contains("Sectional", ignoreCase = true)
        }
    }

    val completedMocks = remember(allMocks) {
        allMocks.filter { it.status.equals("Completed", ignoreCase = true) }
    }

    val nextRecommendedMock = remember(fullLengthMocks) {
        fullLengthMocks.firstOrNull { !it.status.equals("Completed", ignoreCase = true) }
            ?: fullLengthMocks.firstOrNull()
    }
    val visibleFullMocks = if (showAllFullMocks) fullLengthMocks else fullLengthMocks.take(5)

    val incorrectQuestions = remember(state.allQuestions) {
        state.allQuestions.filter { it.isAttempted && !it.isCorrect }
    }

    // Complete Chapter-Wise Mock Test list combining state.allChapters + fallback chapters if empty
    val allAvailableChapters = remember(state.allChapters) {
        if (state.allChapters.isNotEmpty()) {
            state.allChapters
        } else {
            defaultChapterWiseMockChapters()
        }
    }

    // Determine effective subject filter for Chapter-Wise Mock Tests
    val effectiveChapterSubject = when (selectedSubjectFilter) {
        "Physics", "Chemistry", "Mathematics", "Biology" -> selectedSubjectFilter
        else -> chapterWiseSubjectSubFilter
    }

    val activeSearchQuery = chapterSearchInput.trim().ifEmpty { committedChapterQuery.trim() }

    val filteredChapterMocks = remember(allAvailableChapters, effectiveChapterSubject, activeSearchQuery) {
        allAvailableChapters.filter { chapter ->
            val matchesSubject = effectiveChapterSubject == "All" ||
                chapter.subject.equals(effectiveChapterSubject, ignoreCase = true)
            val matchesQuery = activeSearchQuery.isBlank() ||
                chapter.title.contains(activeSearchQuery, ignoreCase = true) ||
                chapter.subtitle.contains(activeSearchQuery, ignoreCase = true) ||
                chapter.subject.contains(activeSearchQuery, ignoreCase = true) ||
                chapter.formulaHighlight.contains(activeSearchQuery, ignoreCase = true) ||
                chapter.keyConceptsSummary.contains(activeSearchQuery, ignoreCase = true) ||
                "ch ${chapter.chapterNumber}".contains(activeSearchQuery, ignoreCase = true) ||
                "chapter ${chapter.chapterNumber}".contains(activeSearchQuery, ignoreCase = true)
            matchesSubject && matchesQuery
        }
    }

    val isChapterWiseFocused = selectedSubjectFilter == "Chapter-Wise" ||
        selectedSubjectFilter in listOf("Physics", "Chemistry", "Mathematics", "Biology") ||
        activeSearchQuery.isNotBlank()

    val visibleChapterMocks = remember(
        filteredChapterMocks,
        showAllChaptersInMock,
        selectedSubjectFilter,
        activeSearchQuery
    ) {
        if (showAllChaptersInMock || selectedSubjectFilter == "Chapter-Wise" || activeSearchQuery.isNotBlank()) {
            filteredChapterMocks
        } else {
            filteredChapterMocks.take(8)
        }
    }

    val startChapterMockSession: (ChapterEntity) -> Unit = { chapter ->
        val chapterQuestions = state.allQuestions.filter {
            it.chapterId == chapter.id ||
                it.topic.contains(chapter.title, ignoreCase = true) ||
                chapter.title.contains(it.topic, ignoreCase = true)
        }.ifEmpty {
            state.allQuestions.filter { it.subject.equals(chapter.subject, ignoreCase = true) }
        }.ifEmpty {
            state.allQuestions
        }

        if (chapterQuestions.isNotEmpty()) {
            onOpenQuestionSession(
                "${chapter.title} • Chapter Mock",
                "${chapter.subject} • Ch ${chapter.chapterNumber.toString().padStart(2, '0')} Timed Mock Test",
                chapterQuestions.map { it.id },
                true
            )
        } else {
            onStartSubjectPractice(chapter.subject, true)
        }
    }

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFF5F8FF))
            .testTag("practice_tab_screen"),
        contentPadding = PaddingValues(bottom = 120.dp)
    ) {
        // 1. PERIWINKLE-BLUE HERO BANNER WITH TILTED "IAT MOCK TEST" ILLUSTRATION
        item(key = "full_mock_test_hero_banner") {
            FullMockTestHeroBanner(
                selectedSubjectFilter = selectedSubjectFilter
            )
        }

        // 2. TOP PRIMARY MODE SEGMENTED BAR (Mock Tests | History | Analytics)
        item(key = "mock_primary_mode_segmented_bar") {
            MockPrimaryModeSegmentedBar(
                selectedTab = selectedMockPrimaryTab,
                completedCount = completedMocks.size,
                onSelectTab = { tab ->
                    selectedMockPrimaryTab = tab
                    if (tab == "History" || tab == "Analytics") {
                        selectedHistoryOrAnalyticsTab = tab
                    }
                },
                modifier = Modifier.padding(horizontal = 14.dp, vertical = 6.dp)
            )
        }

        if (selectedMockPrimaryTab == "History") {
            item(key = "primary_mode_history_section") {
                MockTestHistorySection(
                    allMocks = fullLengthMocks,
                    completedMocks = completedMocks,
                    allQuestions = state.allQuestions,
                    onStartMockTest = onStartMockTest,
                    onOpenQuestionSession = onOpenQuestionSession,
                    modifier = Modifier.padding(horizontal = 14.dp, vertical = 4.dp)
                )
            }
        } else if (selectedMockPrimaryTab == "Analytics") {
            item(key = "primary_mode_analytics_section") {
                MockTestAnalyticsSection(
                    allMocks = fullLengthMocks,
                    completedMocks = completedMocks,
                    allQuestions = state.allQuestions,
                    onStartSubjectPractice = onStartSubjectPractice,
                    onStartRecommendedMock = {
                        val target = nextRecommendedMock ?: allMocks.firstOrNull()
                        if (target != null) onStartMockTest(target)
                    },
                    modifier = Modifier.padding(horizontal = 14.dp, vertical = 4.dp)
                )
            }
        } else {
            // 3. 6-PILL SUBJECT & CHAPTER-WISE FILTER BAR (Full Mock Test • Chapter-Wise • Physics • Chemistry • Mathematics • Biology)
            item(key = "full_mock_subject_filter_bar") {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color(0xFFF5F8FF))
                        .padding(top = 2.dp, bottom = 6.dp)
                ) {
                    LazyRow(
                        modifier = Modifier.fillMaxWidth(),
                        contentPadding = PaddingValues(horizontal = 14.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        items(subjectFilters, key = { it }) { filterName ->
                            val isSelected = selectedSubjectFilter == filterName
                            MockSubjectFilterPill(
                                label = filterName,
                                isSelected = isSelected,
                                onClick = {
                                    selectedSubjectFilter = filterName
                                    if (filterName in listOf("Physics", "Chemistry", "Mathematics", "Biology")) {
                                        chapterWiseSubjectSubFilter = filterName
                                        onSelectSubject(filterName)
                                    } else if (filterName == "Chapter-Wise") {
                                        showAllChaptersInMock = true
                                    }
                                }
                            )
                        }
                    }
                }
            }

            // 4. CHAPTER SEARCH BAR + SEARCH BUTTON (Search any chapter for Chapter-Wise Mock Test)
            item(key = "chapter_wise_mock_search_bar") {
                ChapterWiseMockSearchBar(
                    searchQuery = chapterSearchInput,
                    onQueryChange = { newText ->
                        chapterSearchInput = newText
                        committedChapterQuery = newText
                    },
                    onSearchClick = {
                        committedChapterQuery = chapterSearchInput.trim()
                        if (selectedSubjectFilter == "Full Mock Test" && chapterSearchInput.isNotBlank()) {
                            showAllChaptersInMock = true
                        } else if (selectedSubjectFilter == "Full Mock Test") {
                            selectedSubjectFilter = "Chapter-Wise"
                            showAllChaptersInMock = true
                        }
                    },
                    onClearClick = {
                        chapterSearchInput = ""
                        committedChapterQuery = ""
                    },
                    selectedSubjectFilter = selectedSubjectFilter,
                    matchingChapterCount = filteredChapterMocks.size,
                    modifier = Modifier.padding(horizontal = 14.dp, vertical = 4.dp)
                )
            }

            // 5. WHEN A SPECIFIC SUBJECT IS SELECTED: ELEVATED SUBJECT QUICK MOCK + CHAPTER PRACTICE BANNER
            if (selectedSubjectFilter in listOf("Physics", "Chemistry", "Mathematics", "Biology")) {
                item(key = "selected_subject_spotlight_card") {
                    val matchedQuickMock = quickMocks.find {
                        it.title.contains(selectedSubjectFilter, ignoreCase = true)
                    }
                    val subjectQs = state.allQuestions.filter {
                        it.subject.equals(selectedSubjectFilter, ignoreCase = true)
                    }
                    SubjectFocusedMockSpotlightCard(
                        subjectName = selectedSubjectFilter,
                        questionBankSize = subjectQs.size.coerceAtLeast(15),
                        quickMockDuration = matchedQuickMock?.durationMinutes ?: 15,
                        quickMockQuestions = matchedQuickMock?.questionCount ?: 10,
                        onStartSubjectQuickMock = {
                            if (matchedQuickMock != null) {
                                onStartMockTest(matchedQuickMock)
                            } else {
                                onStartSubjectPractice(selectedSubjectFilter, true)
                            }
                        },
                        onStartUntimedPractice = {
                            showAllChaptersInMock = true
                        },
                        modifier = Modifier.padding(horizontal = 14.dp, vertical = 4.dp)
                    )
                }
            }

            // 6. CHAPTER-WISE MOCK TESTS SECTION (Shown at top when Chapter-Wise / Subject / Search is active)
            if (isChapterWiseFocused) {
                item(key = "chapter_wise_mock_header") {
                    ChapterWiseMockSectionHeader(
                        selectedSubjectFilter = selectedSubjectFilter,
                        chapterWiseSubjectSubFilter = effectiveChapterSubject,
                        totalChaptersCount = filteredChapterMocks.size,
                        activeSearchQuery = activeSearchQuery,
                        onSelectSubFilter = { sub ->
                            chapterWiseSubjectSubFilter = sub
                            if (sub != "All" && selectedSubjectFilter != "Chapter-Wise") {
                                selectedSubjectFilter = sub
                            }
                        },
                        modifier = Modifier.padding(horizontal = 14.dp, vertical = 4.dp)
                    )
                }

                if (visibleChapterMocks.isEmpty()) {
                    item(key = "chapter_wise_mock_empty_state") {
                        ChapterWiseMockEmptySearchCard(
                            query = activeSearchQuery,
                            onResetSearch = {
                                chapterSearchInput = ""
                                committedChapterQuery = ""
                                chapterWiseSubjectSubFilter = "All"
                            },
                            modifier = Modifier.padding(horizontal = 14.dp, vertical = 4.dp)
                        )
                    }
                } else {
                    items(
                        items = visibleChapterMocks,
                        key = { ch -> "chapter_mock_${ch.id}" }
                    ) { chapter ->
                        ChapterWiseMockTestCard(
                            chapter = chapter,
                            onStartChapterMock = { startChapterMockSession(chapter) },
                            modifier = Modifier.padding(horizontal = 14.dp, vertical = 4.dp)
                        )
                    }

                    if (filteredChapterMocks.size > 8 && selectedSubjectFilter != "Chapter-Wise" && activeSearchQuery.isBlank()) {
                        item(key = "toggle_all_chapter_mocks_btn") {
                            Surface(
                                onClick = { showAllChaptersInMock = !showAllChaptersInMock },
                                color = Color.White,
                                shape = RoundedCornerShape(14.dp),
                                border = BorderStroke(1.dp, Color(0xFFDCE7F9)),
                                shadowElevation = 1.dp,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 14.dp, vertical = 4.dp)
                                    .testTag("toggle_all_chapters_mock_button")
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(vertical = 9.dp),
                                    horizontalArrangement = Arrangement.Center,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(
                                        text = if (showAllChaptersInMock) {
                                            "Show Top 8 $effectiveChapterSubject Chapters"
                                        } else {
                                            "View All ${filteredChapterMocks.size} $effectiveChapterSubject Chapters"
                                        },
                                        fontFamily = InterFontFamily,
                                        fontWeight = FontWeight.SemiBold,
                                        fontSize = 12.sp,
                                        color = Color(0xFF2563EB)
                                    )
                                    Spacer(modifier = Modifier.width(4.dp))
                                    Icon(
                                        imageVector = if (showAllChaptersInMock) {
                                            Icons.Default.KeyboardArrowUp
                                        } else {
                                            Icons.Default.KeyboardArrowDown
                                        },
                                        contentDescription = null,
                                        tint = Color(0xFF2563EB),
                                        modifier = Modifier.size(16.dp)
                                    )
                                }
                            }
                        }
                    }
                }
            }

            // 7. ELEVATED MOCK TEST CARDS (Full Mock Test 01..10 OR Subject Sectional Mock 01..10)
            if (selectedSubjectFilter != "Chapter-Wise") {
                if (selectedSubjectFilter != "Full Mock Test") {
                    item(key = "sectional_mocks_sub_header") {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 16.dp, vertical = 6.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "$selectedSubjectFilter Sectional Mock Tests",
                                fontFamily = OutfitDisplayFamily,
                                fontWeight = FontWeight.Bold,
                                fontSize = 15.5.sp,
                                color = Color(0xFF152238)
                            )
                            Text(
                                text = "${visibleFullMocks.size} Full Syllabus Mocks",
                                fontFamily = InterFontFamily,
                                fontWeight = FontWeight.Medium,
                                fontSize = 11.sp,
                                color = Color(0xFF64748B)
                            )
                        }
                    }
                }

                items(
                    items = visibleFullMocks,
                    key = { mock -> "full_mock_${mock.id}" }
                ) { mock ->
                    val mockIndex = (fullLengthMocks.indexOf(mock) + 1).coerceAtLeast(1)
                    IatFullMockTestCard(
                        mock = mock,
                        indexNumber = mockIndex,
                        selectedSubjectFilter = selectedSubjectFilter,
                        onStartMock = {
                            if (selectedSubjectFilter == "Full Mock Test") {
                                onStartMockTest(mock)
                            } else {
                                val subjectQs = state.allQuestions.filter {
                                    it.subject.equals(selectedSubjectFilter, ignoreCase = true)
                                }
                                if (subjectQs.isNotEmpty()) {
                                    onOpenQuestionSession(
                                        formattedMockTitle(mockIndex, selectedSubjectFilter),
                                        mockSubtitleForIndex(mockIndex, selectedSubjectFilter),
                                        subjectQs.map { it.id },
                                        true
                                    )
                                } else {
                                    onStartMockTest(mock)
                                }
                            }
                        },
                        modifier = Modifier.padding(horizontal = 14.dp, vertical = 4.5.dp)
                    )
                }

                // 8. TOGGLE ALL 10 / FEWER MOCKS BUTTON (Preserves load_more_mocks_button testTag)
                if (fullLengthMocks.size > 5) {
                    item(key = "load_more_mocks_button_row") {
                        Surface(
                            onClick = { showAllFullMocks = !showAllFullMocks },
                            color = Color.White,
                            shape = RoundedCornerShape(14.dp),
                            border = BorderStroke(1.dp, Color(0xFFDCE7F9)),
                            shadowElevation = 1.dp,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 14.dp, vertical = 5.dp)
                                .testTag("load_more_mocks_button")
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 10.dp),
                                horizontalArrangement = Arrangement.Center,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = if (showAllFullMocks) {
                                        "Show Top 5 Mock Tests"
                                    } else {
                                        "View All ${fullLengthMocks.size} Mock Tests"
                                    },
                                    fontFamily = InterFontFamily,
                                    fontWeight = FontWeight.SemiBold,
                                    fontSize = 12.5.sp,
                                    color = Color(0xFF2563EB)
                                )
                                Spacer(modifier = Modifier.width(5.dp))
                                Icon(
                                    imageVector = if (showAllFullMocks) {
                                        Icons.Default.KeyboardArrowUp
                                    } else {
                                        Icons.Default.KeyboardArrowDown
                                    },
                                    contentDescription = null,
                                    tint = Color(0xFF2563EB),
                                    modifier = Modifier.size(16.dp)
                                )
                            }
                        }
                    }
                }
            }

            // 9. WHEN ON "Full Mock Test" & NO SEARCH QUERY: DEDICATED CHAPTER-WISE MOCK TESTS HUB
            if (!isChapterWiseFocused) {
                item(key = "full_mock_chapter_wise_preview_header") {
                    ChapterWiseMockSectionHeader(
                        selectedSubjectFilter = "Chapter-Wise",
                        chapterWiseSubjectSubFilter = chapterWiseSubjectSubFilter,
                        totalChaptersCount = filteredChapterMocks.size,
                        activeSearchQuery = activeSearchQuery,
                        onSelectSubFilter = { sub -> chapterWiseSubjectSubFilter = sub },
                        modifier = Modifier.padding(start = 14.dp, end = 14.dp, top = 8.dp, bottom = 4.dp)
                    )
                }

                items(
                    items = filteredChapterMocks.take(if (showAllChaptersInMock) filteredChapterMocks.size else 6),
                    key = { ch -> "preview_chapter_mock_${ch.id}" }
                ) { chapter ->
                    ChapterWiseMockTestCard(
                        chapter = chapter,
                        onStartChapterMock = { startChapterMockSession(chapter) },
                        modifier = Modifier.padding(horizontal = 14.dp, vertical = 4.dp)
                    )
                }

                if (filteredChapterMocks.size > 6) {
                    item(key = "preview_view_all_chapters_button") {
                        Surface(
                            onClick = {
                                showAllChaptersInMock = !showAllChaptersInMock
                            },
                            color = Color.White,
                            shape = RoundedCornerShape(14.dp),
                            border = BorderStroke(1.dp, Color(0xFFDCE7F9)),
                            shadowElevation = 1.dp,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 14.dp, vertical = 4.dp)
                                .testTag("view_all_chapter_mocks_button")
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 9.5.dp),
                                horizontalArrangement = Arrangement.Center,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = if (showAllChaptersInMock) {
                                        "Show Top 6 Chapter-Wise Mock Tests"
                                    } else {
                                        "View All ${filteredChapterMocks.size} Chapter-Wise Mock Tests"
                                    },
                                    fontFamily = InterFontFamily,
                                    fontWeight = FontWeight.SemiBold,
                                    fontSize = 12.sp,
                                    color = Color(0xFF2563EB)
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                Icon(
                                    imageVector = if (showAllChaptersInMock) {
                                        Icons.Default.KeyboardArrowUp
                                    } else {
                                        Icons.Default.KeyboardArrowDown
                                    },
                                    contentDescription = null,
                                    tint = Color(0xFF2563EB),
                                    modifier = Modifier.size(16.dp)
                                )
                            }
                        }
                    }
                }
            }

            // 10. INLINE HISTORY | ANALYTICS HUB
            item(key = "inline_history_analytics_hub") {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 14.dp, vertical = 6.dp)
                ) {
                    HistoryAnalyticsSegmentedPill(
                        selectedTab = selectedHistoryOrAnalyticsTab,
                        onSelectTab = { selectedHistoryOrAnalyticsTab = it }
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    if (selectedHistoryOrAnalyticsTab == "History") {
                        MockTestHistorySection(
                            allMocks = fullLengthMocks,
                            completedMocks = completedMocks,
                            allQuestions = state.allQuestions,
                            onStartMockTest = onStartMockTest,
                            onOpenQuestionSession = onOpenQuestionSession
                        )
                    } else {
                        MockTestAnalyticsSection(
                            allMocks = fullLengthMocks,
                            completedMocks = completedMocks,
                            allQuestions = state.allQuestions,
                            onStartSubjectPractice = onStartSubjectPractice,
                            onStartRecommendedMock = {
                                val target = nextRecommendedMock ?: allMocks.firstOrNull()
                                if (target != null) onStartMockTest(target)
                            }
                        )
                    }
                }
            }
        }

        // 11. SMART MOCK RECOVERY & MISTAKE REVIEW BANNER (Preserves start_recovery_plan_button testTag)
        item(key = "subject_speed_drills_and_recovery_section") {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 14.dp, end = 14.dp, top = 6.dp, bottom = 6.dp)
            ) {
                Surface(
                    color = Color.White,
                    shape = RoundedCornerShape(18.dp),
                    border = BorderStroke(1.dp, Color(0xFFDCE7F9)),
                    shadowElevation = 1.5.dp,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 14.dp, vertical = 12.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.weight(1f)
                        ) {
                            Surface(
                                color = Color(0xFFEFF4FF),
                                shape = RoundedCornerShape(12.dp),
                                border = BorderStroke(1.dp, Color(0xFFD5E3FF)),
                                modifier = Modifier.size(38.dp)
                            ) {
                                Box(contentAlignment = Alignment.Center) {
                                    Icon(
                                        imageVector = Icons.Default.Refresh,
                                        contentDescription = null,
                                        tint = Color(0xFF2563EB),
                                        modifier = Modifier.size(18.dp)
                                    )
                                }
                            }
                            Spacer(modifier = Modifier.width(10.dp))
                            Column {
                                Text(
                                    text = "Smart Mock Recovery Plan",
                                    fontFamily = OutfitDisplayFamily,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 14.5.sp,
                                    color = Color(0xFF152238)
                                )
                                Text(
                                    text = if (incorrectQuestions.isNotEmpty()) {
                                        "Review ${incorrectQuestions.size} incorrect Qs with solutions"
                                    } else {
                                        "Analyze accuracy trends & high-weightage chapters"
                                    },
                                    fontFamily = InterFontFamily,
                                    fontSize = 11.5.sp,
                                    color = Color(0xFF64748B),
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )
                            }
                        }

                        Spacer(modifier = Modifier.width(8.dp))

                        Surface(
                            onClick = {
                                if (incorrectQuestions.isNotEmpty()) {
                                    onOpenQuestionSession(
                                        "Mock Recovery Plan",
                                        "Targeted Incorrect Questions Review",
                                        incorrectQuestions.map { it.id },
                                        false
                                    )
                                } else {
                                    val target = nextRecommendedMock ?: allMocks.firstOrNull()
                                    if (target != null) onStartMockTest(target)
                                }
                            },
                            shape = RoundedCornerShape(50),
                            color = Color(0xFFE7F0FF),
                            border = BorderStroke(1.dp, Color(0xFFC7DCFF)),
                            modifier = Modifier.testTag("start_recovery_plan_button")
                        ) {
                            Row(
                                modifier = Modifier.padding(horizontal = 12.dp, vertical = 7.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(3.dp)
                            ) {
                                Text(
                                    text = "Review",
                                    fontFamily = InterFontFamily,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 12.sp,
                                    color = Color(0xFF2563EB)
                                )
                                Icon(
                                    imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                                    contentDescription = null,
                                    tint = Color(0xFF2563EB),
                                    modifier = Modifier.size(15.dp)
                                )
                            }
                        }
                    }
                }
            }
        }

        // 12. SUBTLE BRAND WATERMARK FOOTER
        item(key = "full_mock_brand_footer") {
            SmartPrepBrandWatermarkFooter()
        }
    }
}

@Composable
internal fun ChapterWiseMockSearchBar(
    searchQuery: String,
    onQueryChange: (String) -> Unit,
    onSearchClick: () -> Unit,
    onClearClick: () -> Unit,
    selectedSubjectFilter: String,
    matchingChapterCount: Int,
    modifier: Modifier = Modifier
) {
    Surface(
        color = Color.White,
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(1.dp, Color(0xFFD5E3FF)),
        shadowElevation = 1.5.dp,
        modifier = modifier
            .fillMaxWidth()
            .testTag("chapter_wise_search_bar_container")
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 12.dp, end = 6.dp, top = 6.dp, bottom = 6.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search Chapter",
                tint = Color(0xFF2563EB),
                modifier = Modifier.size(18.dp)
            )

            Spacer(modifier = Modifier.width(8.dp))

            Box(
                modifier = Modifier.weight(1f),
                contentAlignment = Alignment.CenterStart
            ) {
                if (searchQuery.isEmpty()) {
                    val placeholder = when (selectedSubjectFilter) {
                        "Physics", "Chemistry", "Mathematics", "Biology" ->
                            "Search $selectedSubjectFilter chapter (e.g. Ch 01, topic)..."
                        else ->
                            "Search chapter for mock test (e.g. Optics, Vectors)..."
                    }
                    Text(
                        text = placeholder,
                        fontFamily = InterFontFamily,
                        fontWeight = FontWeight.Normal,
                        fontSize = 12.sp,
                        color = Color(0xFF8A99B2),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }

                BasicTextField(
                    value = searchQuery,
                    onValueChange = onQueryChange,
                    singleLine = true,
                    textStyle = TextStyle(
                        fontFamily = InterFontFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 12.5.sp,
                        color = Color(0xFF152238)
                    ),
                    cursorBrush = SolidColor(Color(0xFF2563EB)),
                    modifier = Modifier
                        .fillMaxWidth()
                        .testTag("chapter_search_input")
                )
            }

            if (searchQuery.isNotEmpty()) {
                IconButton(
                    onClick = onClearClick,
                    modifier = Modifier
                        .size(28.dp)
                        .testTag("chapter_search_clear_button")
                ) {
                    Icon(
                        imageVector = Icons.Default.Close,
                        contentDescription = "Clear chapter search",
                        tint = Color(0xFF64748B),
                        modifier = Modifier.size(16.dp)
                    )
                }
                Spacer(modifier = Modifier.width(2.dp))
            }

            // Dedicated Royal-Blue "Search" Button
            Surface(
                onClick = onSearchClick,
                shape = RoundedCornerShape(11.dp),
                color = Color(0xFF2563EB),
                shadowElevation = 1.dp,
                modifier = Modifier.testTag("chapter_search_button")
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 7.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Search Chapter Button",
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
}

@Composable
internal fun ChapterWiseMockSectionHeader(
    selectedSubjectFilter: String,
    chapterWiseSubjectSubFilter: String,
    totalChaptersCount: Int,
    activeSearchQuery: String,
    onSelectSubFilter: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val subFilters = remember { listOf("All", "Physics", "Chemistry", "Mathematics", "Biology") }
    Column(modifier = modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(7.dp)
                ) {
                    Text(
                        text = when {
                            activeSearchQuery.isNotBlank() ->
                                "Chapter Search Results"
                            selectedSubjectFilter in listOf("Physics", "Chemistry", "Mathematics", "Biology") ->
                                "$selectedSubjectFilter Chapter-Wise Mock Tests"
                            else ->
                                "Chapter-Wise Mock Tests"
                        },
                        fontFamily = OutfitDisplayFamily,
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                        color = Color(0xFF152238)
                    )

                    Surface(
                        color = Color(0xFFE0ECFF),
                        shape = RoundedCornerShape(50)
                    ) {
                        Text(
                            text = "$totalChaptersCount Chapters",
                            fontFamily = InterFontFamily,
                            fontWeight = FontWeight.Bold,
                            fontSize = 10.sp,
                            color = Color(0xFF2563EB),
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 2.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(1.dp))

                Text(
                    text = if (activeSearchQuery.isNotBlank()) {
                        "Showing chapters matching \"$activeSearchQuery\" • Tap Start to begin"
                    } else {
                        "15 Qs • 30 Mins • Timed chapter-level IAT practice"
                    },
                    fontFamily = InterFontFamily,
                    fontSize = 11.sp,
                    color = Color(0xFF64748B)
                )
            }
        }

        // Show Subject Quick Chips when in "Chapter-Wise" or "Full Mock Test" view
        if (selectedSubjectFilter == "Chapter-Wise" || selectedSubjectFilter == "Full Mock Test") {
            Spacer(modifier = Modifier.height(7.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState()),
                horizontalArrangement = Arrangement.spacedBy(6.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                subFilters.forEach { sub ->
                    val isSubSelected = chapterWiseSubjectSubFilter.equals(sub, ignoreCase = true)
                    val label = if (sub == "All") "All Subjects" else sub
                    Surface(
                        onClick = { onSelectSubFilter(sub) },
                        shape = RoundedCornerShape(50),
                        color = if (isSubSelected) Color(0xFF2563EB) else Color.White,
                        border = BorderStroke(
                            1.dp,
                            if (isSubSelected) Color(0xFF2563EB) else Color(0xFFD5E3FF)
                        ),
                        modifier = Modifier.testTag("chapter_mock_subfilter_${sub.lowercase()}")
                    ) {
                        Text(
                            text = label,
                            fontFamily = InterFontFamily,
                            fontWeight = if (isSubSelected) FontWeight.Bold else FontWeight.Medium,
                            fontSize = 11.sp,
                            color = if (isSubSelected) Color.White else Color(0xFF334155),
                            modifier = Modifier.padding(horizontal = 11.dp, vertical = 5.dp)
                        )
                    }
                }
            }
        }
    }
}

@Composable
internal fun ChapterWiseMockTestCard(
    chapter: ChapterEntity,
    onStartChapterMock: () -> Unit,
    modifier: Modifier = Modifier
) {
    val accent = subjectAccentColor(chapter.subject)
    val chNumFormatted = chapter.chapterNumber.toString().padStart(2, '0')
    val questionCount = chapter.practiceQuestionCount.coerceIn(10, 20)
    val durationMins = chapter.durationMinutes.coerceIn(20, 45)
    val maxMarks = questionCount * 4

    Surface(
        onClick = onStartChapterMock,
        shape = RoundedCornerShape(16.dp),
        color = Color.White,
        border = BorderStroke(1.dp, Color(0xFFDCE8FA)),
        shadowElevation = 1.5.dp,
        modifier = modifier
            .fillMaxWidth()
            .testTag("chapter_wise_mock_card_${chapter.id}")
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp, vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Left: Compact 42.dp Subject Squircle with Chapter Badge + Subject Icon
            Surface(
                shape = RoundedCornerShape(12.dp),
                color = accent.copy(alpha = 0.12f),
                border = BorderStroke(1.dp, accent.copy(alpha = 0.28f)),
                modifier = Modifier.size(42.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "CH $chNumFormatted",
                        fontFamily = JetBrainsMonoFamily,
                        fontWeight = FontWeight.Bold,
                        fontSize = 9.sp,
                        color = accent
                    )
                    Spacer(modifier = Modifier.height(1.dp))
                    MockSubjectCustomIcon(
                        subject = chapter.subject,
                        tint = accent,
                        modifier = Modifier.size(14.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.width(11.dp))

            // Center: Chapter Title + Subject/Formula Tag + Metadata
            Column(modifier = Modifier.weight(1f)) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    Surface(
                        color = accent.copy(alpha = 0.12f),
                        shape = RoundedCornerShape(50)
                    ) {
                        Text(
                            text = chapter.subject,
                            fontFamily = InterFontFamily,
                            fontWeight = FontWeight.Bold,
                            fontSize = 9.5.sp,
                            color = accent,
                            modifier = Modifier.padding(horizontal = 7.dp, vertical = 1.5.dp)
                        )
                    }

                    if (chapter.formulaHighlight.isNotBlank()) {
                        Text(
                            text = chapter.formulaHighlight,
                            fontFamily = JetBrainsMonoFamily,
                            fontWeight = FontWeight.Medium,
                            fontSize = 9.5.sp,
                            color = Color(0xFF64748B),
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                }

                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = chapter.title,
                    fontFamily = OutfitDisplayFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.5.sp,
                    lineHeight = 18.sp,
                    color = Color(0xFF152238),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )

                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "$questionCount Qs • $durationMins Mins • $maxMarks Marks • ${chapter.subtitle}",
                    fontFamily = InterFontFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 11.sp,
                    color = Color(0xFF64748B),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }

            Spacer(modifier = Modifier.width(8.dp))

            // Right: Compact Royal-Blue "Start" Button
            Surface(
                onClick = onStartChapterMock,
                shape = RoundedCornerShape(50),
                color = Color(0xFF2563EB),
                shadowElevation = 1.dp,
                modifier = Modifier.testTag("start_chapter_mock_${chapter.id}")
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 11.dp, vertical = 6.5.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(3.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.PlayArrow,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.size(13.dp)
                    )
                    Text(
                        text = "Start",
                        fontFamily = InterFontFamily,
                        fontWeight = FontWeight.Bold,
                        fontSize = 11.5.sp,
                        color = Color.White
                    )
                }
            }
        }
    }
}

@Composable
internal fun ChapterWiseMockEmptySearchCard(
    query: String,
    onResetSearch: () -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        shape = RoundedCornerShape(16.dp),
        color = Color.White,
        border = BorderStroke(1.dp, Color(0xFFDCE8FA)),
        modifier = modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 18.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "No chapters found for \"$query\"",
                fontFamily = OutfitDisplayFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,
                color = Color(0xFF152238)
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "Try searching another chapter name like Optics, Thermodynamics, Equilibrium, or Vectors.",
                fontFamily = InterFontFamily,
                fontSize = 11.5.sp,
                color = Color(0xFF64748B)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Surface(
                onClick = onResetSearch,
                shape = RoundedCornerShape(50),
                color = Color(0xFFE7F0FF),
                border = BorderStroke(1.dp, Color(0xFFC7DCFF))
            ) {
                Text(
                    text = "Show All Chapters",
                    fontFamily = InterFontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 12.sp,
                    color = Color(0xFF2563EB),
                    modifier = Modifier.padding(horizontal = 14.dp, vertical = 7.dp)
                )
            }
        }
    }
}

internal fun defaultChapterWiseMockChapters(): List<ChapterEntity> =
    // Real chapters only — this used to return 14 dummy chapters with empty notes
    // (fallback_phy_1 "Units and Measurements" etc.). Fall back to the same seed
    // data the database loads, so Chapter 1 always shows its real notes.
    SmartPrepSeedData.initialChapters
