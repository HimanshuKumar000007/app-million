# Read-tab rich display — APPLIED (no longer a pending patch)

Status: **implemented directly in the codebase** (user chose "fix the app display
first" on 2026-10-28). This file is kept only as a record of what changed and why.

## What the Read tab does now

All changes are in `app/src/main/java/com/example/ui/screens/InteractiveOverlays.kt`,
plus one new data file `app/src/main/java/com/example/ui/screens/ChapterFigureData.kt`:

1. **Rich body lines** — a `NoteBodyLine` composable styles each note line by marker:
   - `✔ KEY FORMULA` lines → lavender formula card, serif font, deep indigo text.
   - `★ HIGHLIGHT` lines → pale yellow highlight card, semi-bold.
   - `⚠ EXAM TRAP` lines → pale red warning card.
   - All other lines → normal body text, with `**bold**` spans now rendered bold
     (a minimal inline parser, `noteAnnotated`). Existing notes need no changes;
     future notes may use `**...**` for emphasis.
2. **Heading hierarchy** — blocks whose title starts with `▸` now render as
   sub-headings (smaller, deep indigo) under the main section headings.
3. **Images inside the Read tab** — a `chapterSectionFigures()` map places embedded
   figures at the right sections of Physics Ch 01:
   - section index 1 (SI base units) → the 7 SI constants chart
   - section index 7 (Vernier calipers) → Vernier diagram + zero-error diagram
   - section index 8 (Screw gauge) → screw gauge diagram
   The Thomson e/m section needs none — the app already draws that apparatus.

## Why the figures are embedded as base64

The Muse GitHub connector can only push text files, so PNG drawables could not be
added under `res/drawable/`. Instead, the four figures were compressed to JPEG
(47–82 KB each) and embedded as chunked base64 strings in `ChapterFigureData.kt`,
decoded at runtime with `BitmapFactory`. If the project later moves to normal git
pushes from a PC, these can be replaced by ordinary drawable resources and
`painterResource` — the section map above is the only other piece.

## Honest limits

- This patch was written and statically checked (imports, braces, string limits),
  but **not compiled** — there is no Android SDK on Muse's machine. Build once in
  Android Studio before shipping; any error will be local to the two files above.
- The zero-error figure's captions are correct, but its drawn scale numerals are
  stylised (one duplicated digit). Replace the artwork any time — its key is
  `fig_1_4_zero_errors` in `ChapterFigureData.kt`.
