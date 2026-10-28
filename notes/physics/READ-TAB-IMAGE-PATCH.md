# Optional patch — show chapter figures inside the Read tab

**Why this exists:** `ChapterEntity` has no image field, and `ChapterReaderOverlay`
(InteractiveOverlays.kt) renders `detailedStudyNotes` as text only. So today the
notes can *reference* figures ("[Fig. 1.1]") but cannot display them. The only picture
in the Read tab is the hardcoded Fig. 2.2 drawing in the UI code itself.

This small, optional patch displays the chapter's PNG figures at the right sections.
It changes only `InteractiveOverlays.kt` and adds 5 drawable files. Nothing else.

## Step 1 — add the images as drawables

Copy these PNGs (delivered with the notes, folder
`physics/ch01-units-and-measurements/images/`) into `app/src/main/res/drawable/`,
renamed to Android resource names (lowercase, underscores):

| File | Drawable name |
|---|---|
| fig-1.1-vernier-calipers.png | `fig_1_1_vernier.png` |
| fig-1.2-screw-gauge.png | `fig_1_2_screw_gauge.png` |
| fig-1.3-em-apparatus.png | `fig_1_3_em_apparatus.png` |
| fig-1.4-zero-errors.png | `fig_1_4_zero_errors.png` |
| fig-1.5-si-constants.png | `fig_1_5_si_constants.png` |

## Step 2 — map sections to figures (in InteractiveOverlays.kt)

The Read tab already loops over the parsed sections with an index:

```kotlin
parsedNoteSections.forEachIndexed { idx, (sectionHeading, sectionLines) -> ... }
```

Section indexes for `phys_ch_1` (0-based, matching the current seed notes):

- idx 1 («The Seven SI Base Units») → `fig_1_5_si_constants`
- idx 7 («Vernier Calipers») → `fig_1_1_vernier` and `fig_1_4_zero_errors`
- idx 8 («Screw Gauge») → `fig_1_2_screw_gauge`
- idx 21 («Thomson's e/m») → `fig_1_3_em_apparatus`

Add, just above that loop:

```kotlin
val sectionFigures: Map<Int, List<Int>> = when (chapter.id) {
    "phys_ch_1" -> mapOf(
        1 to listOf(R.drawable.fig_1_5_si_constants),
        7 to listOf(R.drawable.fig_1_1_vernier, R.drawable.fig_1_4_zero_errors),
        8 to listOf(R.drawable.fig_1_2_screw_gauge),
        21 to listOf(R.drawable.fig_1_3_em_apparatus)
    )
    else -> emptyMap()
}
```

And inside the loop, after the heading `Text(...)` and before the body lines:

```kotlin
sectionFigures[idx]?.forEach { resId ->
    Image(
        painter = painterResource(id = resId),
        contentDescription = null,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .clip(RoundedCornerShape(12.dp))
    )
}
```

Add imports if missing: `androidx.compose.foundation.Image`,
`androidx.compose.ui.res.painterResource`, `com.example.R`
(adjust the R import to the app's actual package).

## Step 3 — build and check

Run the app, open Physics → Ch 01 → Read: the SI-constants chart appears under
section 1.2, the Vernier and zero-error figures under 1.8, the screw gauge under
1.9, and the e/m apparatus under 1.22. If a section index ever shifts (notes
edited), update the map — the heading titles above are the anchor.

*Note: this patch was prepared by Muse from the current code but not compiled
here — let your coding agent build it once before shipping.*
