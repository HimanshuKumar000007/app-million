package com.example.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.R

/**
 * Curated Multi-Font Typography System for IISER SmartPrep:
 * 1. OutfitDisplayFamily (Outfit) — Refined geometric display & section titles with crisp proportions
 * 2. PlusJakartaSansFamily (Outfit + Plus Jakarta Sans) — Clean editorial headings & card titles
 * 3. InterFontFamily (Inter) — High-legibility body copy, study notes, and compact UI pills
 * 4. AcademicSerifFamily (Lora) — Authentic textbook serif for physics/chemistry/math equations & derivations
 * 5. JetBrainsMonoFamily (JetBrains Mono) — Tabular monospace for CBT timers, chapter codes & score metrics
 *
 * All weights are explicitly mapped to the bundled TTF resources so Android never falls back to
 * system fonts or applies synthetic faux-bold smearing.
 */
val OutfitDisplayFamily = FontFamily(
    Font(R.font.outfit, FontWeight.Light),
    Font(R.font.outfit, FontWeight.Normal),
    Font(R.font.outfit, FontWeight.Medium),
    Font(R.font.outfit, FontWeight.SemiBold),
    Font(R.font.outfit, FontWeight.Bold),
    Font(R.font.outfit, FontWeight.ExtraBold)
)

val PlusJakartaSansFamily = FontFamily(
    Font(R.font.outfit, FontWeight.Light),
    Font(R.font.outfit, FontWeight.Normal),
    Font(R.font.plus_jakarta_sans, FontWeight.Medium),
    Font(R.font.outfit, FontWeight.SemiBold),
    Font(R.font.outfit, FontWeight.Bold),
    Font(R.font.outfit, FontWeight.ExtraBold)
)

val InterFontFamily = FontFamily(
    Font(R.font.inter, FontWeight.Light),
    Font(R.font.inter, FontWeight.Normal),
    Font(R.font.inter, FontWeight.Medium),
    Font(R.font.inter, FontWeight.SemiBold),
    Font(R.font.inter, FontWeight.Bold),
    Font(R.font.inter, FontWeight.ExtraBold)
)

val AcademicSerifFamily = FontFamily(
    Font(R.font.lora, FontWeight.Normal),
    Font(R.font.lora, FontWeight.Medium),
    Font(R.font.lora, FontWeight.SemiBold),
    Font(R.font.lora, FontWeight.Bold),
    Font(R.font.lora, FontWeight.Normal, FontStyle.Italic),
    Font(R.font.lora, FontWeight.Medium, FontStyle.Italic)
)

val JetBrainsMonoFamily = FontFamily(
    Font(R.font.jetbrains_mono, FontWeight.Light),
    Font(R.font.jetbrains_mono, FontWeight.Normal),
    Font(R.font.jetbrains_mono, FontWeight.Medium),
    Font(R.font.jetbrains_mono, FontWeight.SemiBold),
    Font(R.font.jetbrains_mono, FontWeight.Bold)
)

val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = OutfitDisplayFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 30.sp,
        lineHeight = 37.sp,
        letterSpacing = (-0.5).sp
    ),
    displayMedium = TextStyle(
        fontFamily = OutfitDisplayFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 25.sp,
        lineHeight = 32.sp,
        letterSpacing = (-0.35).sp
    ),
    displaySmall = TextStyle(
        fontFamily = OutfitDisplayFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = (-0.25).sp
    ),
    headlineLarge = TextStyle(
        fontFamily = OutfitDisplayFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = (-0.3).sp
    ),
    headlineMedium = TextStyle(
        fontFamily = OutfitDisplayFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 19.5.sp,
        lineHeight = 25.sp,
        letterSpacing = (-0.2).sp
    ),
    headlineSmall = TextStyle(
        fontFamily = OutfitDisplayFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 17.5.sp,
        lineHeight = 23.sp,
        letterSpacing = (-0.15).sp
    ),
    titleLarge = TextStyle(
        fontFamily = OutfitDisplayFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp,
        lineHeight = 24.sp,
        letterSpacing = (-0.15).sp
    ),
    titleMedium = TextStyle(
        fontFamily = PlusJakartaSansFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 15.5.sp,
        lineHeight = 21.sp,
        letterSpacing = (-0.1).sp
    ),
    titleSmall = TextStyle(
        fontFamily = PlusJakartaSansFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 19.sp,
        letterSpacing = (-0.05).sp
    ),
    bodyLarge = TextStyle(
        fontFamily = InterFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp,
        lineHeight = 22.sp,
        letterSpacing = 0.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = InterFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 13.5.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.05.sp
    ),
    bodySmall = TextStyle(
        fontFamily = InterFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 17.5.sp,
        letterSpacing = 0.1.sp
    ),
    labelLarge = TextStyle(
        fontFamily = InterFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 13.sp,
        lineHeight = 18.sp,
        letterSpacing = 0.1.sp
    ),
    labelMedium = TextStyle(
        fontFamily = InterFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 11.5.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.15.sp
    ),
    labelSmall = TextStyle(
        fontFamily = InterFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 10.5.sp,
        lineHeight = 14.sp,
        letterSpacing = 0.2.sp
    )
)
