package com.example.data.local



object SmartPrepSeedData {



    val initialProfile = UserProfileEntity(

        id = 1,

        fullName = "Aarav Sharma",

        email = "aarav.iat2027@iiserprep.edu.in",

        targetExam = "IISER IAT",

        targetYear = 2027,

        selectedSubject = "Mathematics",

        selectedExamFilter = "All",

        subscriptionTier = "SmartPrep Pro",

        streakDays = 6,

        xpPoints = 1420,

        darkModeEnabled = false,

        isLoggedIn = true

    )



    val initialChapters: List<ChapterEntity> = smartPrepChaptersPartA + smartPrepChaptersPartB



    val initialQuestions: List<QuestionEntity> = listOf(

        // ==================== MATHEMATICS QUESTIONS ====================

        QuestionEntity(

            id = "q_math_1",

            chapterId = "math_ch_9",

            subject = "Mathematics",

            topic = "Sequences & Series",

            examSource = "IISER IAT",

            examYear = 2024,

            isImportantQuestion = true,

            isPyq = true,

            difficulty = "Analytical",

            estimatedSeconds = 120,

            prompt = "Evaluate the infinite sum S = Σ (n = 1 to ∞) tan⁻¹( 2 / (n² + n + 4) ) where tan⁻¹ takes its principal value in (−π/2, π/2).",

            optionA = "π / 4",

            optionB = "π / 2 − tan⁻¹(1/2)",

            optionC = "π / 2 − tan⁻¹(1/3)",

            optionD = "tan⁻¹(2) + tan⁻¹(3)",

            correctOptionIndex = 1,

            stepByStepExplanation = """

                Step 1: Rewrite the argument inside tan⁻¹ in the standard telescoping form (xₙ − yₙ) / (1 + xₙyₙ).

                Divide numerator and denominator by 4 (or rewrite n² + n + 4 = 4 + n(n+1)):

                Better yet, express 2 / (n² + n + 4) = [(n + 2) − n] / [1 + (n² + n + 3)] — let's factor the denominator minus 1:

                Notice: n² + n + 4 = 1 + (n² + n + 3) does not factor over integers, so divide numerator and denominator by 2:

                2 / (n² + n + 4) = [ (n + 1)/2 − (n − 1)/2 ] / [ 1 + (n² − 1)/4 + 1 ] — instead, observe:

                Let aₙ = n / 2. Then aₙ₊₁ − aₙ = 1/2, which doesn't match.

                Instead, write n² + n + 4 = 4 + n(n+1):

                2 / [4 + n(n+1)] = (1/2) / [1 + (n/2)((n+1)/2)] = [ (n+1)/2 − (n/2) ] / [ 1 + ((n+1)/2)(n/2) ].

                Step 2: Apply tan⁻¹(x) − tan⁻¹(y) = tan⁻¹((x − y)/(1 + xy)):

                Tₙ = tan⁻¹((n + 1)/2) − tan⁻¹(n/2).

                Step 3: Telescoping partial sum S_N = Σ_{n=1}^N Tₙ = tan⁻¹((N + 1)/2) − tan⁻¹(1/2).

                Step 4: Take limit as N → ∞:

                S = lim (N→∞) tan⁻¹((N + 1)/2) − tan⁻¹(1/2) = π/2 − tan⁻¹(1/2).

            """.trimIndent(),

            isBookmarked = true

        ),

        QuestionEntity(

            id = "q_math_2",

            chapterId = "math_ch_12",

            subject = "Mathematics",

            topic = "Integration (includes Applications of Integration)",

            examSource = "IISER IAT",

            examYear = 2023,

            isImportantQuestion = true,

            isPyq = true,

            difficulty = "Research-Level",

            estimatedSeconds = 150,

            prompt = "Let f : (0, ∞) → ℝ be a differentiable function satisfying ∫₀^(x²) f(t) dt = x²(1 + x) for all x > 0. What is the value of f(4)?",

            optionA = "5 / 4",

            optionB = "7 / 2",

            optionC = "4",

            optionD = "9 / 2",

            correctOptionIndex = 2,

            stepByStepExplanation = """

                Step 1: Apply Leibniz Rule to differentiate both sides with respect to x:

                d/dx [ ∫₀^(x²) f(t) dt ] = d/dx [ x² + x³ ].

                Step 2: By Leibniz rule, LHS = f(x²) · (2x) and RHS = 2x + 3x².

                Step 3: Since x > 0, divide both sides by 2x:

                f(x²) = 1 + (3/2)x.

                Step 4: To find f(4), set x² = 4 with x > 0 ⇒ x = 2.

                Substitute x = 2:

                f(4) = 1 + (3/2)(2) = 1 + 3 = 4.

            """.trimIndent()

        ),

        QuestionEntity(

            id = "q_math_3",

            chapterId = "math_ch_3",

            subject = "Mathematics",

            topic = "Complex Numbers, Linear and Quadratic Equations",

            examSource = "IISER IAT",

            examYear = 2025,

            isImportantQuestion = true,

            isPyq = true,

            difficulty = "Analytical",

            estimatedSeconds = 120,

            prompt = "If z₁, z₂, z₃ are non-zero complex numbers on the circle |z| = 2 such that z₁ + z₂ + z₃ = 0, then the value of |z₁ − z₂|² + |z₂ − z₃|² + |z₃ − z₁|² is:",

            optionA = "12",

            optionB = "18",

            optionC = "24",

            optionD = "36",

            correctOptionIndex = 3,

            stepByStepExplanation = """

                Step 1: Expand the modulus squared sum using the identity:

                |z₁ − z₂|² + |z₂ − z₃|² + |z₃ − z₁|² = 3(|z₁|² + |z₂|² + |z₃|²) − |z₁ + z₂ + z₃|².

                Step 2: Given |z₁| = |z₂| = |z₃| = 2 ⇒ |zₖ|² = 4 for k = 1, 2, 3, and z₁ + z₂ + z₃ = 0.

                Step 3: Substitute into the identity:

                Value = 3(4 + 4 + 4) − 0 = 3 × 12 = 36.

            """.trimIndent()

        ),

        QuestionEntity(

            id = "q_math_4",

            chapterId = "math_ch_6",

            subject = "Mathematics",

            topic = "Matrices & Determinants",

            examSource = "IISER IAT",

            examYear = null,

            isImportantQuestion = true,

            isPyq = false,

            difficulty = "Conceptual",

            estimatedSeconds = 90,

            prompt = "Let A be a 3 × 3 matrix with det(A) = 2. What is the value of det( adj(adj(2A)) )?",

            optionA = "2¹⁶",

            optionB = "2²⁰",

            optionC = "2²⁴",

            optionD = "2²⁸",

            correctOptionIndex = 3,

            stepByStepExplanation = """

                Step 1: For any n × n matrix M, det(adj(adj(M))) = (det M)^((n−1)²).

                Here n = 3, so (n − 1)² = 2² = 4. Thus det(adj(adj(2A))) = [det(2A)]⁴.

                Step 2: Compute det(2A) for a 3 × 3 matrix:

                det(2A) = 2³ · det(A) = 8 × 2 = 16 = 2⁴.

                Wait — let's check: [det(2A)]⁴ = (2⁴)⁴ = 2¹⁶, or if det(3 adj(adj(2A)))?

                Let's verify: for M = 2A (n = 3), det(M) = 2³ · 2 = 2⁴, so (det M)^((3−1)²) = (2⁴)⁴ = 2¹⁶ (Option A).

                Actually let's check Option A vs D: if det(2 adj(adj(2A))) = 2³ · 2¹⁶ = 2¹⁹. For det(adj(adj(2A))), it is (2⁴)⁴ = 2¹⁶.

            """.trimIndent()

        ).copy(correctOptionIndex = 0),



        // ==================== PHYSICS QUESTIONS ====================

        QuestionEntity(

            id = "q_phys_5",

            chapterId = "phys_ch_1",

            subject = "Physics",

            topic = "Screw Gauge & Zero Error",

            examSource = "IISER IAT",

            examYear = null,

            isImportantQuestion = true,

            isPyq = false,

            difficulty = "Analytical",

            estimatedSeconds = 120,

            prompt = "A screw gauge has pitch 0.5 mm and 50 divisions on its circular scale. When the anvil and spindle are brought into contact, the instrument reads +0.05 mm (the 5th circular division coincides with the reference line — a positive zero error). A wire is then measured: the main scale reading is 4 mm and the 38th circular division coincides with the reference line. The correct diameter of the wire is:",

            optionA = "4.38 mm",

            optionB = "4.43 mm",

            optionC = "4.33 mm",

            optionD = "4.28 mm",

            correctOptionIndex = 2,

            stepByStepExplanation = """

                Step 1: Least count of the screw gauge:

                LC = Pitch / Number of circular divisions = 0.5 mm / 50 = 0.01 mm.

                Step 2: The observed reading of the wire:

                Observed = Main scale reading + (Coinciding division × LC) = 4 + 38 × 0.01 = 4.38 mm.

                Step 3: The instrument already reads +0.05 mm with the jaws closed, so every observed reading is 0.05 mm too large. Zero error = +5 × LC = +0.05 mm.

                Step 4: Corrected diameter = Observed reading − Zero error = 4.38 − 0.05 = 4.33 mm.

                Trap: adding the zero error instead of subtracting it gives 4.43 mm (option B); ignoring it gives 4.38 mm (option A).

            """.trimIndent()

        ),
QuestionEntity(
            id = "q_math_5",
            chapterId = "math_ch_1",
            subject = "Mathematics",
            topic = "Inclusion-Exclusion — Three Sets",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 75,
            prompt = "In a group of 120 students, 70 like Mathematics, 60 like Physics and 50 like Chemistry. Also, 30 like both Mathematics and Physics, 25 like both Physics and Chemistry, 20 like both Mathematics and Chemistry, and 10 like all three subjects. The number of students who like none of the three subjects is:",
            optionA = "5",
            optionB = "10",
            optionC = "15",
            optionD = "115",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Apply inclusion-exclusion for three sets: n(M union P union C) = (70 + 60 + 50) - (30 + 25 + 20) + 10 = 180 - 75 + 10 = 115.
                Step 2: The triple intersection is ADDED back at the end: the singles counted it 3 times, the pairs subtracted it 3 times, so without the +10 the centre would be counted zero times.
                Step 3: Students liking none = 120 - 115 = 5.
                Trap: 15 (option C) comes from forgetting the +10 add-back (180 - 75 - 10 = 95, then 120 - 95 = 25 is not even listed — but omitting the sign flip the other way gives union 105 and none = 15). The alternating signs +, -, + are the whole formula.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_6",
            chapterId = "math_ch_1",
            subject = "Mathematics",
            topic = "Counting Reflexive Relations",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 45,
            prompt = "The number of reflexive relations that can be defined on a set containing 4 elements is:",
            optionA = "256",
            optionB = "65536",
            optionC = "4096",
            optionD = "1024",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: A relation on a 4-element set is a subset of A x A, which has 4 x 4 = 16 ordered pairs.
                Step 2: Reflexivity forces the 4 diagonal pairs (a, a) to be IN — they make no choice. The remaining 16 - 4 = 12 pairs are free, each in or out.
                Step 3: Number of reflexive relations = 2^12 = 4096.
                Trap: 65536 (option B) is 2^16, the count of ALL relations with nothing forced; 1024 (option D) is 2^10, the count of SYMMETRIC relations on 4 elements — a different condition with a different exponent.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_7",
            chapterId = "math_ch_1",
            subject = "Mathematics",
            topic = "Counting Onto Functions",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "The number of onto (surjective) functions from a set A with 4 elements to a set B with 3 elements is:",
            optionA = "81",
            optionB = "36",
            optionC = "24",
            optionD = "64",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Count all functions, then remove those that miss part of B, using inclusion-exclusion: onto = 3^4 - C(3,1) x 2^4 + C(3,2) x 1^4.
                Step 2: 3^4 = 81 counts every map; C(3,1) x 2^4 = 3 x 16 = 48 removes maps missing a chosen element of B; C(3,2) x 1^4 = 3 adds back maps missing two chosen elements (subtracted twice).
                Step 3: 81 - 48 + 3 = 36.
                Trap: 81 (option A) forgets the onto condition entirely; 24 (option C) is 4! — the count of BIJECTIONS, which cannot exist here because the two sets have different sizes.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_8",
            chapterId = "math_ch_1",
            subject = "Mathematics",
            topic = "Contrapositive of an Implication",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "The contrapositive of the statement 'If a number is divisible by 6, then it is divisible by 3' is:",
            optionA = "If a number is divisible by 3, then it is divisible by 6",
            optionB = "If a number is not divisible by 6, then it is not divisible by 3",
            optionC = "A number is divisible by 6 and it is not divisible by 3",
            optionD = "If a number is not divisible by 3, then it is not divisible by 6",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: Identify p: 'a number is divisible by 6' (hypothesis) and q: 'it is divisible by 3' (conclusion). The contrapositive is (not q) implies (not p): negate both AND swap them.
                Step 2: Not q is 'not divisible by 3'; not p is 'not divisible by 6'. Assembled: 'If a number is not divisible by 3, then it is not divisible by 6' — option D. The contrapositive is always equivalent to the original, and indeed both are true.
                Step 3: Option A is the converse (swap only) — false, since 9 is divisible by 3 but not by 6. Option B is the inverse (negate only) — the same falsehood. Option C is the NEGATION of the original implication (p and not q), not a member of the implication family.
                Trap: swapping without negating, or negating without swapping — the contrapositive demands both operations, in one move.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_9",
            chapterId = "math_ch_1",
            subject = "Mathematics",
            topic = "Domain of a Real Function",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The domain of the function f(x) = sqrt(4 - x^2) / (x - 1) is:",
            optionA = "[-2, 2]",
            optionB = "(-2, 2)",
            optionC = "[-2, 1) union (1, 2]",
            optionD = "[-2, 1) union (1, 2)",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: The square root needs 4 - x^2 >= 0, i.e. x^2 <= 4, giving -2 <= x <= 2.
                Step 2: The denominator needs x - 1 not equal to 0, so x = 1 is removed from that interval.
                Step 3: Domain = [-2, 1) union (1, 2]. The endpoints -2 and 2 STAY: there the root is 0, and 0 divided by a non-zero denominator is a perfectly good value (f(-2) = 0, f(2) = 0).
                Trap: option D drops the endpoints by treating the root as if it were in a denominator (strict inequality); option A forgets the denominator hole at x = 1 entirely.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_math_10",
            chapterId = "math_ch_2",
            subject = "Mathematics",
            topic = "Gap Method — No Two Vowels Together",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 90,
            prompt = "The letters of the word ORANGE are arranged in a row. In how many of these arrangements are no two vowels adjacent to each other?",
            optionA = "720",
            optionB = "144",
            optionC = "288",
            optionD = "96",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Use the gap method. Arrange the consonants R, N, G first: 3! = 6 ways.
                Step 2: The 3 consonants create 4 gaps (before, between, after). Choose 3 of the 4 gaps for the vowels: C(4, 3) = 4.
                Step 3: Arrange the vowels O, A, E in the chosen gaps: 3! = 6. Total = 6 x 4 x 6 = 144.
                Trap: 720 (option A) is the total number of arrangements with the condition ignored. 288 (option C) comes from inventing extra gaps or double-counting placements — 3 consonants make exactly 4 gaps, never more.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_11",
            chapterId = "math_ch_2",
            subject = "Mathematics",
            topic = "Combinations — At-Least Condition in a Committee",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 90,
            prompt = "A committee of 5 is to be formed from 7 men and 5 women. In how many ways can this be done if the committee must contain at least 3 women?",
            optionA = "246",
            optionB = "210",
            optionC = "231",
            optionD = "792",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Split by exact composition. Exactly 3 women and 2 men: C(5, 3) x C(7, 2) = 10 x 21 = 210.
                Step 2: Exactly 4 women and 1 man: C(5, 4) x C(7, 1) = 5 x 7 = 35. Exactly 5 women: C(5, 5) = 1.
                Step 3: Add the cases: 210 + 35 + 1 = 246.
                Trap: 210 (option B) counts only the exactly-3-women case and forgets that "at least 3" includes 4 and 5. 792 (option D) is C(12, 5), the total with no condition at all.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_12",
            chapterId = "math_ch_2",
            subject = "Mathematics",
            topic = "Binomial Theorem — Coefficient in a Product of Expansions",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 120,
            prompt = "The coefficient of x^8 in the expansion of (1 + x)^6 (1 + x^2)^3 is:",
            optionA = "48",
            optionB = "45",
            optionC = "63",
            optionD = "78",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: x^8 must be split as x^a from (1 + x)^6 times x^(2b) from (1 + x^2)^3, with a + 2b = 8, a at most 6 and b at most 3.
                Step 2: The legal splits: b = 1, a = 6: C(6, 6) x C(3, 1) = 1 x 3 = 3. b = 2, a = 4: C(6, 4) x C(3, 2) = 15 x 3 = 45. b = 3, a = 2: C(6, 2) x C(3, 3) = 15 x 1 = 15.
                Step 3: Add the splits: 3 + 45 + 15 = 63.
                Trap: 45 (option B) is only the largest single split. Product questions are lost by stopping early — every legal split contributes, and missing one is the designed error.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_13",
            chapterId = "math_ch_2",
            subject = "Mathematics",
            topic = "Binomial Theorem — Middle Term",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "The coefficient of the middle term in the expansion of (1 + x)^10 is:",
            optionA = "120",
            optionB = "210",
            optionC = "462",
            optionD = "252",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: The expansion has 11 terms. With n = 10 even, there is one middle term, T(6), which means r = 5.
                Step 2: The middle term is C(10, 5) x^5, and C(10, 5) = 252.
                Trap: 210 (option B) is C(10, 4), the neighbour coefficient — the classic off-by-one from taking r = 4. The middle of 11 terms is the 6th term, and T(6) always carries r = 5.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_14",
            chapterId = "math_ch_2",
            subject = "Mathematics",
            topic = "Circular Permutations — Adjacent Pair",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "Eight people sit around a round table. In how many ways can they be seated if two particular people always sit next to each other?",
            optionA = "720",
            optionB = "1440",
            optionC = "5040",
            optionD = "10080",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Glue the two particular people into one block. Now 7 units (the block plus 6 others) sit around a circle: (7 - 1)! = 720 ways.
                Step 2: The two people inside the block can swap seats: multiply by 2! = 2. Total = 720 x 2 = 1440.
                Trap: 5040 (option C) is 7!, the answer for a straight row — around a table, rotations of the same seating are identical, so the count is (units - 1)!, not units!. 720 (option A) forgets the internal swap of the pair.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_math_15",
            chapterId = "math_ch_3",
            subject = "Mathematics",
            topic = "Cube Roots of Unity — Power Reduction",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "If omega is a non-real cube root of unity, then omega^99 + omega^100 equals:",
            optionA = "1",
            optionB = "-omega^2",
            optionC = "omega^2",
            optionD = "0",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Powers of omega repeat with period 3, because omega^3 = 1. Reduce each exponent modulo 3: 99 is divisible by 3, so omega^99 = (omega^3)^33 = 1.
                Step 2: omega^100 = omega^99 x omega = omega. So the sum is 1 + omega.
                Step 3: Use 1 + omega + omega^2 = 0, which gives 1 + omega = -omega^2.
                Trap: 0 (option D) is the value of omega^99 + omega^100 + omega^101 — the full triple. With only two terms, one piece of the cancelling triple is missing.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_16",
            chapterId = "math_ch_3",
            subject = "Mathematics",
            topic = "Principal Argument — Quadrant Trap",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The principal argument of z = -sqrt(3) - i is:",
            optionA = "5pi/6",
            optionB = "-pi/6",
            optionC = "-5pi/6",
            optionD = "2pi/3",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Locate the point: a = -sqrt(3) < 0 and b = -1 < 0, so z sits in the third quadrant.
                Step 2: The reference angle is alpha = arctan(|b/a|) = arctan(1/sqrt(3)) = pi/6.
                Step 3: Quadrant III rule: arg z = -(pi - alpha) = -(pi - pi/6) = -5pi/6, which lies inside the principal range -pi < arg z ≤ pi.
                Trap: 5pi/6 (option A) is the argument of -sqrt(3) + i — the mirror point above the axis. -pi/6 (option B) is the raw reference angle with a sign guessed on; arctan alone can never see the third quadrant.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_17",
            chapterId = "math_ch_3",
            subject = "Mathematics",
            topic = "Vieta's Relations — Symmetric Functions",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 75,
            prompt = "If alpha and beta are the roots of x^2 - 5x + 3 = 0, then alpha^3 + beta^3 equals:",
            optionA = "45",
            optionB = "65",
            optionC = "98",
            optionD = "80",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: Read off Vieta's data: alpha + beta = 5 and alpha beta = 3.
                Step 2: Use the identity alpha^3 + beta^3 = (alpha + beta)^3 - 3 alpha beta (alpha + beta).
                Step 3: Substitute: 5^3 - 3 x 3 x 5 = 125 - 45 = 80.
                Trap: 65 (option B) comes from 125 - 60, i.e. subtracting 3 x (alpha beta) x (something wrong); and solving for the roots first wastes minutes — their cubes involve surds that only cancel at the very end.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_18",
            chapterId = "math_ch_3",
            subject = "Mathematics",
            topic = "Wavy Curve — Rational Inequality",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "The solution set of (x - 1)(x - 3)/(x + 2) ≤ 0 is:",
            optionA = "x < -2, or 1 ≤ x ≤ 3",
            optionB = "-2 < x ≤ 1, or x ≥ 3",
            optionC = "x ≤ -2, or 1 ≤ x ≤ 3",
            optionD = "-2 ≤ x ≤ 1, or x ≥ 3",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Critical points: 1 and 3 from the numerator, -2 from the denominator. All have odd multiplicity, so the sign flips at each one.
                Step 2: For x > 3 all three factors are positive, sign +. Walking left: negative on (1, 3), positive on (-2, 1), negative for x < -2.
                Step 3: We need ≤ 0: the negative regions x < -2 and 1 ≤ x ≤ 3. The numerator zeros 1 and 3 are included; -2 is excluded absolutely because the expression is undefined there.
                Trap: option C includes x = -2, where the left side does not exist. Option B is the answer to the ≥ 0 version of the same inequality.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_19",
            chapterId = "math_ch_3",
            subject = "Mathematics",
            topic = "Discriminant — Equal Roots Condition",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "The values of k for which 2x^2 - kx + 8 = 0 has equal roots are:",
            optionA = "k = 8 only",
            optionB = "k = -8 only",
            optionC = "k = 8 or k = -8",
            optionD = "k = 4 or k = -4",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Equal roots means the discriminant is zero: D = b^2 - 4ac = 0.
                Step 2: Here b = -k, a = 2, c = 8, so D = k^2 - 4 x 2 x 8 = k^2 - 64.
                Step 3: k^2 - 64 = 0 gives k^2 = 64, hence k = 8 or k = -8.
                Trap: options A and B each drop one sign — D depends on k^2, so a parameter under a square always produces both values. Option D halves 64 incorrectly.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_math_20",
            chapterId = "math_ch_4",
            subject = "Mathematics",
            topic = "Inverse Tangents — the xy Correction",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "The value of tan^-1 2 + tan^-1 3 is:",
            optionA = "-pi/4",
            optionB = "3pi/4",
            optionC = "pi/4",
            optionD = "5pi/4",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Run the gatekeeper test first: xy = 2 x 3 = 6 > 1, with both x and y positive, so the raw addition formula needs a + pi correction.
                Step 2: Raw formula: (2 + 3)/(1 - 2 x 3) = 5/(-5) = -1, and tan^-1(-1) = -pi/4.
                Step 3: Correct it: -pi/4 + pi = 3pi/4.
                Audit: tan^-1 2 is about 63.4 degrees and tan^-1 3 is about 71.6 degrees; two positive acute angles sum to about 135 degrees = 3pi/4, never to a negative angle.
                Trap: -pi/4 (option A) is the uncorrected formula output — the single most common inverse-trig error. 5pi/4 (option D) exceeds pi, impossible for a sum of two angles each below pi/2.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_21",
            chapterId = "math_ch_4",
            subject = "Mathematics",
            topic = "Trigonometric Equations — Converting to One Function",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 90,
            prompt = "The solutions of 2 cos^2 x + 3 sin x = 0 in the interval [0, 2pi] are:",
            optionA = "pi/6 and 5pi/6",
            optionB = "7pi/6 only",
            optionC = "7pi/6 and 11pi/6",
            optionD = "5pi/6 and 7pi/6",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Convert everything to sine using cos^2 x = 1 - sin^2 x:
                2(1 - sin^2 x) + 3 sin x = 0, i.e. 2 sin^2 x - 3 sin x - 2 = 0.
                Step 2: Factorise: (2 sin x + 1)(sin x - 2) = 0, so sin x = -1/2 or sin x = 2.
                Step 3: Reject sin x = 2 outright — sine never exceeds 1. From sin x = -1/2, sine is negative in quadrants III and IV with reference angle pi/6.
                Step 4: x = pi + pi/6 = 7pi/6 and x = 2pi - pi/6 = 11pi/6.
                Trap: pi/6 and 5pi/6 (option A) solve sin x = +1/2 — the sign slip in the quadratic. 7pi/6 only (option B) forgets the second quadrant family member.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_22",
            chapterId = "math_ch_4",
            subject = "Mathematics",
            topic = "Compound Angles — sin(A + B)",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 60,
            prompt = "If A and B are acute angles with sin A = 3/5 and cos B = 5/13, then sin(A + B) equals:",
            optionA = "63/65",
            optionB = "56/65",
            optionC = "-16/65",
            optionD = "33/65",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Complete the two triangles. A is acute with sin A = 3/5, so cos A = 4/5 (3-4-5 triangle). B is acute with cos B = 5/13, so sin B = 12/13 (5-12-13 triangle).
                Step 2: Expand: sin(A + B) = sin A cos B + cos A sin B.
                Step 3: Substitute: (3/5)(5/13) + (4/5)(12/13) = 15/65 + 48/65 = 63/65.
                Trap: 56/65 (option B) is cos(A - B) = (4/5)(5/13) + (3/5)(12/13) — the cosine expansion with the wrong pairing. -16/65 (option C) is cos(A + B). 33/65 (option D) comes from subtracting the products instead of adding them.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_23",
            chapterId = "math_ch_4",
            subject = "Mathematics",
            topic = "Conditional Identities — Angles of a Triangle",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "If A, B and C are the angles of a triangle, none of them a right angle, then tan A + tan B + tan C equals:",
            optionA = "0",
            optionB = "tan(A + B + C)",
            optionC = "-(tan A tan B tan C)",
            optionD = "tan A tan B tan C",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: Use the condition: A + B = pi - C, so tan(A + B) = tan(pi - C) = -tan C.
                Step 2: Expand the left side: (tan A + tan B)/(1 - tan A tan B) = -tan C.
                Step 3: Cross-multiply: tan A + tan B = -tan C + tan A tan B tan C. Moving -tan C to the left gives tan A + tan B + tan C = tan A tan B tan C.
                Audit with A = 45, B = 60, C = 75 degrees: the sum is 1 + 1.732 + 3.732 = 6.464, and the product is 1 x 1.732 x 3.732 = 6.464.
                Trap: option B collapses to tan pi = 0, the same wrong value as option A. The identity is conditional — it holds only because A + B + C = pi, and it needs all three tangents to exist, hence no right angle.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_24",
            chapterId = "math_ch_4",
            subject = "Mathematics",
            topic = "Inverse Sine — Combining Two Angles",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 120,
            prompt = "The value of sin^-1(3/5) + sin^-1(8/17) is:",
            optionA = "sin^-1(13/85)",
            optionB = "pi/2",
            optionC = "sin^-1(77/85)",
            optionD = "sin^-1(84/85)",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Check the safe case: (3/5)^2 + (8/17)^2 = 0.36 + 0.22 = 0.58, which is at most 1, so sin^-1 x + sin^-1 y = sin^-1(x sqrt(1 - y^2) + y sqrt(1 - x^2)) applies directly.
                Step 2: Get the cosines from the Pythagorean triples: for 3/5 the partner is 4/5 (3-4-5); for 8/17 the partner is 15/17 (8-15-17).
                Step 3: Combine: (3/5)(15/17) + (8/17)(4/5) = 45/85 + 32/85 = 77/85. The sum is sin^-1(77/85).
                Trap: 13/85 (option A) is 45/85 - 32/85 — the sine of the DIFFERENCE of the two angles. pi/2 (option B) would need the angles to be complementary; they are about 36.9 and 28.1 degrees, summing to about 65 degrees, not 90.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_math_25",
            chapterId = "math_ch_5",
            subject = "Mathematics",
            topic = "Dot Product — Scalar Projection",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 90,
            prompt = "The scalar projection of a = i - 2j + 2k on b = 3i + 4k is:",
            optionA = "11/5",
            optionB = "11",
            optionC = "11/3",
            optionD = "5/11",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Compute the dot product from components: a.b = (1)(3) + (-2)(0) + (2)(4) = 3 + 0 + 8 = 11.
                Step 2: The magnitude of the vector projected onto is |b| = sqrt(9 + 0 + 16) = sqrt 25 = 5.
                Step 3: Scalar projection of a on b = (a.b) / |b| = 11 / 5.
                Trap: 11/3 (option C) divides by |a| = 3 instead — that computes the projection of b on a. The divisor is always the magnitude of the vector named after the word "on". 11 (option B) is the raw dot product, which is not yet a length.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_26",
            chapterId = "math_ch_5",
            subject = "Mathematics",
            topic = "Scalar Triple Product — Coplanarity Condition",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 120,
            prompt = "The vectors a = 2i + j, b = i - j + 2k and c = 3i + lambda k are coplanar when lambda equals:",
            optionA = "-2",
            optionB = "2",
            optionC = "0",
            optionD = "6",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Three vectors are coplanar exactly when their scalar triple product vanishes: [a b c] = 0.
                Step 2: Expand the determinant of the rows (2, 1, 0), (1, -1, 2), (3, 0, lambda): 2((-1)(lambda) - (2)(0)) - 1((1)(lambda) - (2)(3)) + 0 = -2 lambda - lambda + 6 = 6 - 3 lambda.
                Step 3: Set 6 - 3 lambda = 0, giving lambda = 2.
                Trap: 6 (option D) is only the constant term of the expansion — the equation still has to be solved. A sign slip in the middle cofactor produces -2 (option A); expand the determinant slowly, one cofactor at a time.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_27",
            chapterId = "math_ch_5",
            subject = "Mathematics",
            topic = "Cross Product — Area of a Triangle from Position Vectors",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 120,
            prompt = "The area of the triangle whose vertices have position vectors i + 2j + 3k, 2i - j + k and 3i + j - k is:",
            optionA = "10√5",
            optionB = "5√5",
            optionC = "(5√5)/2",
            optionD = "√5/2",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Build edge vectors from the first vertex: AB = (2i - j + k) - (i + 2j + 3k) = i - 3j - 2k, and AC = (3i + j - k) - (i + 2j + 3k) = 2i - j - 4k.
                Step 2: AB x AC = ((-3)(-4) - (-2)(-1)) i - ((1)(-4) - (-2)(2)) j + ((1)(-1) - (-3)(2)) k = 10i + 0j + 5k, whose magnitude is sqrt(100 + 0 + 25) = sqrt 125 = 5√5.
                Step 3: The triangle's area is half the parallelogram: (1/2)(5√5) = (5√5)/2.
                Trap: 5√5 (option B) forgets the half — it is the area of the parallelogram on AB and AC. Feeding the raw position vectors into the cross product instead of the edge vectors computes the area of a triangle involving the origin, a different triangle altogether.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_28",
            chapterId = "math_ch_5",
            subject = "Mathematics",
            topic = "Dot Product — Angle Between Two Vectors",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 60,
            prompt = "The angle between the vectors a = i + j and b = i + k is:",
            optionA = "30 degrees",
            optionB = "45 degrees",
            optionC = "60 degrees",
            optionD = "90 degrees",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: a.b = (1)(1) + (1)(0) + (0)(1) = 1.
                Step 2: |a| = sqrt(1 + 1) = sqrt 2 and |b| = sqrt(1 + 1) = sqrt 2.
                Step 3: cos theta = (a.b) / (|a| |b|) = 1 / 2, so theta = 60 degrees.
                Trap: 30 degrees (option A) comes from feeding 1/2 into the inverse sine; the dot product is built on the cosine. 90 degrees (option D) would need a.b = 0 — sharing one component is not perpendicularity.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_29",
            chapterId = "math_ch_5",
            subject = "Mathematics",
            topic = "Unit Vectors and Direction Cosines",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "The unit vector in the direction of a = 2i - j + 2k is:",
            optionA = "(2i - j + 2k)/9",
            optionB = "(2i + j + 2k)/3",
            optionC = "2i - j + 2k",
            optionD = "(2i - j + 2k)/3",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: |a| = sqrt(4 + 1 + 4) = sqrt 9 = 3.
                Step 2: The unit vector is a divided by its own magnitude: a-hat = a / |a| = (2i - j + 2k) / 3.
                Step 3: Audit: |(2i - j + 2k)/3| = 3/3 = 1, a genuine unit vector pointing the same way as a.
                Trap: dividing by 9 (option A) uses |a|^2 in place of |a| and shrinks the vector to magnitude 1/3. Option C never normalises at all, and option B flips the sign of the j component, changing the direction.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_math_30",
            chapterId = "math_ch_6",
            subject = "Mathematics",
            topic = "Determinants — the Vandermonde Pattern",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 90,
            prompt = "The value of the determinant with rows (1, 1, 1), (1, 2, 3), (1, 4, 9) is:",
            optionA = "-2",
            optionB = "2",
            optionC = "0",
            optionD = "6",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Expand along the first row: 1 x (2 x 9 - 3 x 4) - 1 x (1 x 9 - 3 x 1) + 1 x (1 x 4 - 2 x 1).
                Step 2: This is 1 x (18 - 12) - 1 x (9 - 3) + 1 x (4 - 2) = 6 - 6 + 2 = 2.
                Step 3: Pattern check: the columns are (1, x, x^2) for x = 1, 2, 3 — a Vandermonde determinant, worth (2 - 1)(3 - 1)(3 - 2) = 2. Same answer, one line.
                Trap: 0 (option C) is the reflex answer for any determinant whose rows "look patterned" — patterned rows vanish only when they are chained (proportional or AP-linked), and these are not. -2 (option A) is a sign slip on the middle cofactor, whose checkerboard sign is negative.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_31",
            chapterId = "math_ch_6",
            subject = "Mathematics",
            topic = "Determinants — the Scaling Law det(kA) = k^n det A",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 75,
            prompt = "If A is a 3 x 3 matrix with det A = 4, then det(3A) equals:",
            optionA = "12",
            optionB = "36",
            optionC = "108",
            optionD = "324",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: The scalar 3 multiplies EVERY entry of A, so it sits inside all 3 rows of the determinant.
                Step 2: A factor pulled out of one row counts once; pulling 3 out of each of the 3 rows gives det(3A) = 3^3 x det A.
                Step 3: det(3A) = 27 x 4 = 108.
                Trap: 12 (option A) = 3 x 4 applies the one-row rule to the whole matrix — the single most planted error in this chapter. 36 (option B) uses 3^2, the exponent for a 2 x 2 matrix; the exponent is always the order of the matrix.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_32",
            chapterId = "math_ch_6",
            subject = "Mathematics",
            topic = "Inverse of a Matrix — the 2 x 2 Shortcut",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 60,
            prompt = "The (1, 2) entry of the inverse of the matrix [1 2; 3 4] is:",
            optionA = "1",
            optionB = "-2",
            optionC = "3/2",
            optionD = "-1/2",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: det A = 1 x 4 - 2 x 3 = -2, which is nonzero, so the inverse exists.
                Step 2: The 2 x 2 shortcut swaps the diagonal entries and negates the off-diagonal ones: adj A = [4 -2; -3 1], and A^-1 = (1 / -2) x [4 -2; -3 1] = [-2 1; 3/2 -1/2].
                Step 3: The (1, 2) entry of A^-1 is 1.
                Trap: -2 (option B) is the (1, 2) entry of the adjugate BEFORE dividing by the determinant — the division by det A = -2 flips it to 1. 3/2 (option C) is the (2, 1) entry: right matrix, wrong cell.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_33",
            chapterId = "math_ch_6",
            subject = "Mathematics",
            topic = "Systems of Equations — Consistency with a Parameter",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 120,
            prompt = "The system x + y + z = 1, x + 2y + 3z = 2, x + 3y + lambda z = 4 has NO solution when lambda equals:",
            optionA = "3",
            optionB = "4",
            optionC = "6",
            optionD = "5",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: Expand the coefficient determinant along the first row: det A = 1 x (2 lambda - 9) - 1 x (lambda - 3) + 1 x (3 - 2) = lambda - 5.
                Step 2: det A = 0 exactly when lambda = 5, so uniqueness fails only there; every other lambda gives a unique solution. At lambda = 5 the verdict splits on the adjugate test.
                Step 3: At lambda = 5, (adj A) B = (1, -2, 1), which is not the zero vector — so the system is inconsistent: NO solution. (Subtracting equations exposes it: they demand y + 2z = 1 and 2y + 4z = 3 at once.)
                Trap: declaring "infinitely many solutions" at lambda = 5 from det A = 0 alone. A zero determinant means "not unique" — the (adj A) B test decides between none and infinite, and here it says none.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_34",
            chapterId = "math_ch_6",
            subject = "Mathematics",
            topic = "Symmetric and Skew-Symmetric Decomposition",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 90,
            prompt = "For A = [4 1; 3 2], the (1, 2) entry of the skew-symmetric part of A is:",
            optionA = "1",
            optionB = "2",
            optionC = "-1",
            optionD = "0",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Transpose: A^T = [4 3; 1 2]. The skew-symmetric part of A is (A - A^T) / 2.
                Step 2: A - A^T = [0 -2; 2 0], so the skew part is (1/2) x [0 -2; 2 0] = [0 -1; 1 0] — note the zero diagonal every skew-symmetric matrix must have.
                Step 3: The (1, 2) entry is -1.
                Trap: 2 (option B) is the (1, 2) entry of the SYMMETRIC part (A + A^T) / 2 = [4 2; 2 2] — the other half of the decomposition. 1 (option A) is the raw entry of A itself, before any splitting.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_math_35",
            chapterId = "math_ch_7",
            subject = "Mathematics",
            topic = "Distance Between Parallel Lines",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "The distance between the parallel lines 3x − 4y + 7 = 0 and 3x − 4y − 8 = 0 is:",
            optionA = "15",
            optionB = "1/5",
            optionC = "3",
            optionD = "3/5",
            correctOptionIndex = 2,
            stepByStepExplanation = "Step 1: Confirm the lines are parallel with matching coefficients: both are 3x − 4y + c = 0, with c1 = 7 and c2 = −8.\nStep 2: The distance between parallels ax + by + c1 = 0 and ax + by + c2 = 0 is |c1 − c2| / sqrt(a^2 + b^2).\nStep 3: Numerator: |7 − (−8)| = 15. Denominator: sqrt(3^2 + (−4)^2) = sqrt(25) = 5.\nStep 4: Distance = 15/5 = 3.\nTrap: Answering 15 forgets the division entirely; the 3-4-5 coefficient pair makes the denominator exactly 5."
        ),
        QuestionEntity(
            id = "q_math_36",
            chapterId = "math_ch_7",
            subject = "Mathematics",
            topic = "Circle Centre and Radius from the General Form",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "The centre and radius of the circle x^2 + y^2 + 6x − 4y − 12 = 0 are:",
            optionA = "Centre (−3, 2), radius 5",
            optionB = "Centre (3, −2), radius 5",
            optionC = "Centre (−3, 2), radius 25",
            optionD = "Centre (−6, 4), radius 5",
            correctOptionIndex = 0,
            stepByStepExplanation = "Step 1: Match the form x^2 + y^2 + 2gx + 2fy + c = 0: 2g = 6 gives g = 3; 2f = −4 gives f = −2; c = −12.\nStep 2: The centre is (−g, −f) = (−3, 2): halve the coefficients, then negate both.\nStep 3: Radius = sqrt(g^2 + f^2 − c) = sqrt(9 + 4 − (−12)) = sqrt(25) = 5.\nTrap: Centre (3, −2) skips the negation; radius 25 forgets the square root; centre (−6, 4) skips the halving. The centre is MINUS HALF of each printed coefficient."
        ),
        QuestionEntity(
            id = "q_math_37",
            chapterId = "math_ch_7",
            subject = "Mathematics",
            topic = "Parabola Focus and Latus Rectum",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 50,
            prompt = "For the parabola y^2 = −24x, the focus and the length of the latus rectum are:",
            optionA = "Focus (6, 0), latus rectum 24",
            optionB = "Focus (−6, 0), latus rectum 12",
            optionC = "Focus (−6, 0), latus rectum 6",
            optionD = "Focus (−6, 0), latus rectum 24",
            correctOptionIndex = 3,
            stepByStepExplanation = "Step 1: Orientation first: the coefficient of x is negative, so the parabola opens towards −x; in y^2 = 4ax form, 4a = −24 and a = −6.\nStep 2: Focus = (a, 0) = (−6, 0), on the side towards which the parabola opens.\nStep 3: Latus rectum = |4a| = |−24| = 24: a length, so always positive; it equals the magnitude of the printed coefficient.\nTrap: Focus (6, 0) drops the sign of a; latus rectum 12 halves the coefficient for no reason; latus rectum 6 confuses the length with |a| itself."
        ),
        QuestionEntity(
            id = "q_math_38",
            chapterId = "math_ch_7",
            subject = "Mathematics",
            topic = "Ellipse Eccentricity",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 55,
            prompt = "The eccentricity of the ellipse x^2/36 + y^2/20 = 1 is:",
            optionA = "√5/3",
            optionB = "2/3",
            optionC = "√14/3",
            optionD = "1/3",
            correctOptionIndex = 1,
            stepByStepExplanation = "Step 1: Read the denominators: a^2 = 36 (so a = 6, the semi-major axis since it is larger) and b^2 = 20.\nStep 2: For an ellipse, c^2 = a^2 − b^2 = 36 − 20 = 16, so c = 4 and the foci are (±4, 0).\nStep 3: e = c/a = 4/6 = 2/3. Audit: 2/3 < 1, as every ellipse eccentricity must be.\nTrap: √5/3 equals b/a (equivalently sqrt(1 − e^2), not e); √14/3 > 1 comes from the hyperbola relation c^2 = a^2 + b^2 and is impossible for an ellipse; 1/3 halves c once too often."
        ),
        QuestionEntity(
            id = "q_math_39",
            chapterId = "math_ch_7",
            subject = "Mathematics",
            topic = "Angle Between Two Lines",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The acute angle between the lines 3x − y + 2 = 0 and x − 2y + 3 = 0 is:",
            optionA = "30 degrees",
            optionB = "60 degrees",
            optionC = "45 degrees",
            optionD = "15 degrees",
            correctOptionIndex = 2,
            stepByStepExplanation = "Step 1: Slopes by minus-a-over-b: for 3x − y + 2 = 0, m1 = −3/(−1) = 3; for x − 2y + 3 = 0, m2 = −1/(−2) = 1/2.\nStep 2: tan(theta) = |(m2 − m1)/(1 + m1 m2)| = |(1/2 − 3)/(1 + 3/2)| = |(−5/2)/(5/2)| = 1.\nStep 3: tan(theta) = 1 with theta acute gives theta = 45 degrees.\nTrap: Forgetting the modulus can hand you the obtuse supplement's tangent and a wrong branch; the angle between two lines is by definition the acute one."
        ),
QuestionEntity(
            id = "q_math_40",
            chapterId = "math_ch_8",
            subject = "Mathematics",
            topic = "Shortest Distance Between Two Lines",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "The shortest distance between the lines (x - 1)/2 = (y - 2)/1 = (z - 3)/2 and (x - 4)/1 = (y - 1)/(-2) = (z - 2)/1 is:",
            optionA = "sqrt 2",
            optionB = "2",
            optionC = "2 sqrt 2",
            optionD = "4",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Read off the anchors and directions: a1 = (1, 2, 3), b1 = (2, 1, 2); a2 = (4, 1, 2), b2 = (1, -2, 1). The directions are not proportional, so check the triple product before assuming an intersection.
                Step 2: b1 x b2 = (1 x 1 - 2 x (-2), 2 x 1 - 2 x 1, 2 x (-2) - 1 x 1) = (5, 0, -5), with |b1 x b2| = 5 sqrt 2.
                Step 3: Connector a2 - a1 = (3, -1, -1); triple product = 3 x 5 + (-1) x 0 + (-1) x (-5) = 20, nonzero, so the lines are skew and the distance is 20 / (5 sqrt 2) = 2 sqrt 2.
                Trap: 4 (option D) comes from dividing 20 by 5 instead of 5 sqrt 2 — the denominator is the magnitude of the cross product, not its largest component. The nonzero triple product is also the proof the lines never meet, so a "they intersect" assumption collapses at Step 3.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_41",
            chapterId = "math_ch_8",
            subject = "Mathematics",
            topic = "Distance of a Point from a Plane",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "The distance of the point (2, 3, 4) from the plane 2x + y - 2z + 7 = 0 is:",
            optionA = "2",
            optionB = "6",
            optionC = "2/3",
            optionD = "3",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Substitute the point into the left side: 2(2) + 3 - 2(4) + 7 = 4 + 3 - 8 + 7 = 6.
                Step 2: The normal is (2, 1, -2) with length sqrt(4 + 1 + 4) = 3.
                Step 3: Distance = |6| / 3 = 2.
                Trap: 6 (option B) is the raw substitution before dividing by the normal's length — the substitution measures along a stretched normal, not in true units. The division by sqrt(a^2 + b^2 + c^2) is never optional.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_42",
            chapterId = "math_ch_8",
            subject = "Mathematics",
            topic = "Angle Between a Line and a Plane",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 75,
            prompt = "The angle between the line with direction ratios 2, 3, 6 and the plane x + 2y + 2z = 5 is:",
            optionA = "cos^-1(20/21)",
            optionB = "sin^-1(9/21)",
            optionC = "60 degrees",
            optionD = "sin^-1(20/21)",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: The line's direction is b = (2, 3, 6) with |b| = 7; the plane's normal is n = (1, 2, 2) with |n| = 3.
                Step 2: The angle phi between a line and a plane is the complement of the angle between the line and the normal, so it takes SIN: sin phi = |b . n| / (|b| |n|).
                Step 3: b . n = 2 + 6 + 12 = 20, so sin phi = 20/21 and phi = sin^-1(20/21).
                Trap: cos^-1(20/21) (option A) is the angle between the line and the NORMAL — the two answers sum to 90 degrees and only one of them is the angle with the plane. Line-line and plane-plane angles take cos; the line-plane angle is the odd one out.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_43",
            chapterId = "math_ch_8",
            subject = "Mathematics",
            topic = "Direction Angles — Finding the Third",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A line makes angles of 90 degrees and 60 degrees with the positive x-axis and the positive y-axis respectively. The angle it makes with the positive z-axis is:",
            optionA = "60 degrees",
            optionB = "45 degrees",
            optionC = "30 degrees or 150 degrees",
            optionD = "90 degrees",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Direction cosines satisfy l^2 + m^2 + n^2 = 1, i.e. cos^2 alpha + cos^2 beta + cos^2 gamma = 1.
                Step 2: cos^2 90 degrees = 0 and cos^2 60 degrees = 1/4, so cos^2 gamma = 1 - 0 - 1/4 = 3/4.
                Step 3: cos gamma = sqrt 3 / 2 or -sqrt 3 / 2, giving gamma = 30 degrees or 150 degrees.
                Trap: 30 degrees alone (and 60 degrees, option A) ignore the sign ambiguity — the squared data cannot tell which side of the xy-plane the line leans to, so both mirror values are correct. Whenever cos^2 is the given, expect a pair of answers.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_44",
            chapterId = "math_ch_8",
            subject = "Mathematics",
            topic = "Image of a Point in a Plane",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 75,
            prompt = "The image of the point (2, 1, 4) in the plane x + y + z = 4 is:",
            optionA = "(1, 0, 3)",
            optionB = "(0, -1, 2)",
            optionC = "(0, 1, 2)",
            optionD = "(3, 2, 5)",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: The image lies along the normal (1, 1, 1) from P = (2, 1, 4): running point (2 + k, 1 + k, 4 + k). Substituting into the plane: (2 + k) + (1 + k) + (4 + k) = 4 gives 7 + 3k = 4, so k = -1.
                Step 2: The FOOT of the perpendicular is at k = -1: (1, 0, 3) — it lies on the plane (1 + 0 + 3 = 4, check).
                Step 3: The image is the foot step taken twice: image = 2 x foot - P = (2 - 2, 0 - 1, 6 - 4) = (0, -1, 2). Audit: the midpoint of P and its image is (1, 0, 3), the foot, as it must be.
                Trap: (1, 0, 3) (option A) is the foot, not the image — the most common way this question is lost. Reflection means going the same distance again on the far side; stopping at the plane answers a different question.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_math_45",
            chapterId = "math_ch_9",
            subject = "Mathematics",
            topic = "AGP — Sum to Infinity",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 90,
            prompt = "The sum to infinity of the series 1 + 2/3 + 3/9 + 4/27 + ... is:",
            optionA = "2",
            optionB = "3",
            optionC = "9/4",
            optionD = "5/2",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Term k is k x (1/3)^(k - 1): an AGP with ratio r = 1/3. Since |r| < 1, the sum to infinity exists.
                Step 2: Let S be the sum. S - (1/3) S leaves the plain GP 1 + 1/3 + 1/9 + ... = 1 / (1 - 1/3) = 3/2.
                Step 3: So (2/3) S = 3/2, giving S = 9/4. (Equivalently, the jewel: sum of k r^(k - 1) = 1 / (1 - r)^2 = 1 / (2/3)^2 = 9/4.)
                Trap: 3 (option B) comes from the jewel with 1 - r misread as 1/3; partial sums 1, 5/3, 2, 58/27 already pass 2 and creep toward 2.25, so 2 (option A) is too small.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_46",
            chapterId = "math_ch_9",
            subject = "Mathematics",
            topic = "Telescoping Series — Method of Differences",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 60,
            prompt = "The sum of the first 19 terms of the series 1/(1 x 2) + 1/(2 x 3) + 1/(3 x 4) + ... is:",
            optionA = "19/20",
            optionB = "9/10",
            optionC = "20/21",
            optionD = "39/40",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Each term splits as a difference: 1/(k(k + 1)) = 1/k - 1/(k + 1).
                Step 2: Writing out the 19 terms, every interior fraction cancels with its neighbour. The survivors are the first head 1 and the last tail -1/20.
                Step 3: Sum = 1 - 1/20 = 19/20. In general the sum to n terms is n/(n + 1).
                Trap: 20/21 (option C) is the value for n = 20 terms — the tail is 1/(n + 1), not 1/n. Always check how many terms were actually summed.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_47",
            chapterId = "math_ch_9",
            subject = "Mathematics",
            topic = "AM-GM Inequality — Minimum Value",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 75,
            prompt = "For x > 0, the minimum value of 9x + 4/x is:",
            optionA = "6",
            optionB = "12",
            optionC = "10",
            optionD = "13",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Both terms are positive for x > 0 and their product is constant: 9x x (4/x) = 36. AM-GM applies.
                Step 2: 9x + 4/x >= 2 sqrt(36) = 12.
                Step 3: Equality holds when 9x = 4/x, i.e. x^2 = 4/9, x = 2/3, which is positive and therefore reachable — so 12 is attained, not just a bound.
                Trap: 6 (option A) is sqrt(36), the geometric mean itself, before doubling. The sum is at least TWICE the geometric mean, never the geometric mean.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_48",
            chapterId = "math_ch_9",
            subject = "Mathematics",
            topic = "GP — Three Terms from Product and Sum",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 90,
            prompt = "Three numbers in geometric progression have product 1000 and sum 35. The largest of the three numbers is:",
            optionA = "25",
            optionB = "15",
            optionC = "40",
            optionD = "20",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: Write the terms as a/r, a, ar. Their product is a^3 = 1000, so a = 10.
                Step 2: Their sum is 10 (1/r + 1 + r) = 35, so r + 1/r = 5/2. Multiplying by 2r: 2r^2 - 5r + 2 = 0, giving r = 2 or r = 1/2.
                Step 3: With r = 2 the terms are 5, 10, 20 (with r = 1/2 the same set reversed). The largest is 20. Audit: 5 x 10 x 20 = 1000 and 5 + 10 + 20 = 35.
                Trap: 25 (option A) satisfies neither condition; it comes from guessing a symmetric split of the sum. The product condition must be used first — it fixes the middle term exactly.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_49",
            chapterId = "math_ch_9",
            subject = "Mathematics",
            topic = "Sequences — First Term from S_n",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 75,
            prompt = "The sum of the first n terms of a sequence is S_n = n^2 + 4n + 2. The first term of the sequence is:",
            optionA = "5",
            optionB = "9",
            optionC = "7",
            optionD = "2",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: The first term is the sum of the first one term: a_1 = S_1.
                Step 2: S_1 = 1 + 4 + 2 = 7. So a_1 = 7.
                Step 3: The difference formula a_n = S_n - S_(n - 1) = 2n + 3 is valid only for n >= 2 (check: a_2 = S_2 - S_1 = 14 - 7 = 7 = 2 x 2 + 3). The constant +2 in S_n is a bookkeeping ghost that the formula wrongly sweeps into a_1.
                Trap: 5 (option A) is the difference formula evaluated at n = 1 — the single most planted trap in this topic. a_1 always comes from S_1 directly.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_math_50",
            chapterId = "math_ch_10",
            subject = "Mathematics",
            topic = "Standard Limits — Sine over Tangent",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 75,
            prompt = "The value of the limit as x tends to 0 of sin 5x / tan 3x is:",
            optionA = "3/5",
            optionB = "5/3",
            optionC = "1",
            optionD = "8/3",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Substitution gives 0/0, so reduce to standard forms. Write tan 3x = sin 3x / cos 3x, turning the expression into sin 5x x cos 3x / sin 3x.
                Step 2: Rescale each sine over its own angle: (sin 5x / (5x)) x ((3x) / sin 3x) x cos 3x x (5/3).
                Step 3: As x tends to 0, the first bracket tends to 1, the second tends to 1, and cos 3x tends to 1. What survives is 5/3.
                Trap: 3/5 (option A) inverts the angle ratio — sin(mx) / tan(nx) tends to m/n, here 5/3, not n/m. 1 (option C) forgets both rescaling factors.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_51",
            chapterId = "math_ch_10",
            subject = "Mathematics",
            topic = "Standard Limits — the Power-Difference Form",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 60,
            prompt = "The value of the limit as x tends to 2 of (x^4 - 16) / (x - 2) is:",
            optionA = "16",
            optionB = "24",
            optionC = "32",
            optionD = "64",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Recognise the bank shape: (x^n - a^n) / (x - a) with n = 4 and a = 2, noting 16 = 2^4.
                Step 2: The standard result gives n x a^(n - 1) = 4 x 2^3 = 4 x 8 = 32.
                Audit: factorising manually, (x^4 - 16) / (x - 2) = x^3 + 2x^2 + 4x + 8, which at x = 2 gives 8 + 8 + 8 + 8 = 32. Agreement confirmed.
                Trap: 16 (option A) is just 2^4 — the numerator's constant, with no limit taken. 64 (option D) comes from 4 x 2^4, using a^n where the formula needs a^(n - 1).
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_52",
            chapterId = "math_ch_10",
            subject = "Mathematics",
            topic = "Indeterminate Forms — the 1^infinity Master Key",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "The value of the limit as x tends to 0 of (1 + 4x)^(3/x) is:",
            optionA = "e^3",
            optionB = "e^4",
            optionC = "12",
            optionD = "e^12",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: Identify the form: the base 1 + 4x tends to 1 and the exponent 3/x tends to infinity — this is 1^infinity, which is indeterminate, not 1.
                Step 2: Apply the master key: for (1 + f)^g with f tending to 0 and g tending to infinity, the limit is e raised to the limit of f x g.
                Step 3: Here f = 4x and g = 3/x, so f x g = 4x x (3/x) = 12 for every x not equal to 0. The limit is e^12.
                Trap: e^4 (option B) uses only the base's rate and e^3 (option A) only the exponent's — both rates enter, through their product. 12 (option C) is the exponent of e with the e itself dropped.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_53",
            chapterId = "math_ch_10",
            subject = "Mathematics",
            topic = "Continuity — Repairing a Removable Point",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 75,
            prompt = "Let f(x) = (x^2 - 1) / (x - 1) for x not equal to 1, and f(1) = k. The value of k that makes f continuous at x = 1 is:",
            optionA = "2",
            optionB = "1",
            optionC = "0",
            optionD = "no value of k can make f continuous at 1",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Compute the limit at 1: (x^2 - 1) / (x - 1) = (x - 1)(x + 1) / (x - 1) = x + 1 for x not equal to 1, so the limit as x tends to 1 is 2.
                Step 2: Continuity's third clause demands f(1) = limit, so k = 2.
                Step 3: The discontinuity at any other k is removable — the two-sided limit exists and only the point value is wrong, which a single definition repairs.
                Trap: option D is the classic misread — a hole in the graph is exactly the repairable case; it is jumps and blow-ups that no choice of k can fix.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_54",
            chapterId = "math_ch_10",
            subject = "Mathematics",
            topic = "One-Sided Limits — the e^(1/x) Verdict",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The limit of e^(1/x) as x tends to 0:",
            optionA = "equals 0",
            optionB = "equals 1",
            optionC = "does not exist, because the left-hand limit is 0 while the right-hand limit is +infinity",
            optionD = "equals +infinity",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Split into sides — the exponent 1/x changes sign across 0, so a two-sided guess is unsafe.
                Step 2: From the right, 1/x tends to +infinity, so e^(1/x) tends to +infinity.
                Step 3: From the left, 1/x tends to -infinity, so e^(1/x) tends to e^(-infinity) = 0.
                Step 4: The two sides approach completely different values, so the two-sided limit does not exist.
                Trap: +infinity (option D) grades only the right half of the graph, and 0 (option A) only the left half. This asymmetry is precisely why the question is asked.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_math_55",
            chapterId = "math_ch_11",
            subject = "Mathematics",
            topic = "Chain Rule — Derivative Value of a Composite",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "If f(x) = (x^2 + 2x)^3, then f'(1) equals:",
            optionA = "27",
            optionB = "54",
            optionC = "108",
            optionD = "36",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Identify the composition: an outer cube wrapped around the inside x^2 + 2x. The chain rule gives f'(x) = 3 (x^2 + 2x)^2 x (2x + 2).
                Step 2: Evaluate the inside at x = 1: 1 + 2 = 3, so (x^2 + 2x)^2 = 9. The inside's derivative at x = 1 is 2 + 2 = 4.
                Step 3: Multiply the layers: 3 x 9 x 4 = 108.
                Trap: 27 (option A) is f(1) = 3^3, the function's value, not its derivative. 54 (option B) uses 2x instead of 2x + 2 for the inside derivative. Count the layers: outer factor 3, squared inside 9, inner derivative 4 — all three must appear.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_56",
            chapterId = "math_ch_11",
            subject = "Mathematics",
            topic = "Implicit Differentiation — Slope at a Point",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 75,
            prompt = "For the curve x^2 + xy + y^2 = 7, the value of dy/dx at the point (1, 2) is:",
            optionA = "-4/5",
            optionB = "-5/4",
            optionC = "4/5",
            optionD = "-1/5",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Confirm the point lies on the curve: 1 + 2 + 4 = 7. It does.
                Step 2: Differentiate implicitly with respect to x, attaching dy/dx to every y-term: 2x + y + x (dy/dx) + 2y (dy/dx) = 0. The xy term needs the product rule.
                Step 3: Collect the dy/dx terms: (dy/dx)(x + 2y) = -(2x + y), so dy/dx = -(2x + y) / (x + 2y).
                Step 4: Substitute (1, 2): -(2 + 2) / (1 + 4) = -4/5.
                Trap: -5/4 (option B) inverts the final fraction. 4/5 (option C) drops the minus sign that the collection step produces. Skipping the product rule on xy loses the standalone y term and corrupts everything downstream.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_57",
            chapterId = "math_ch_11",
            subject = "Mathematics",
            topic = "Increasing and Decreasing — the Sign of f'",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The function f(x) = x^3 - 3x is (strictly) increasing on the interval:",
            optionA = "(-1, 1)",
            optionB = "(0, 1)",
            optionC = "(-2, 2)",
            optionD = "(1, infinity)",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: Differentiate: f'(x) = 3x^2 - 3 = 3(x - 1)(x + 1). The critical points are x = -1 and x = 1.
                Step 2: Run the sign chart: f'(-2) = 9, positive; f'(0) = -3, negative; f'(2) = 9, positive. So f' is positive outside [-1, 1] and negative inside it.
                Step 3: f is increasing exactly where f' is positive: on (-infinity, -1) and on (1, infinity). Of the options offered, only (1, infinity) qualifies.
                Trap: (-1, 1) (option A) is the DECREASING interval — the peak-to-valley stretch. (-2, 2) (option C) mixes both behaviours. Monotonicity is read off the sign chart, never guessed from the graph's endpoints.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_58",
            chapterId = "math_ch_11",
            subject = "Mathematics",
            topic = "Maxima and Minima — Local Extremum Value",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "The local minimum value of the function f(x) = 2x^3 - 3x^2 - 12x + 5 is:",
            optionA = "12",
            optionB = "-15",
            optionC = "-10",
            optionD = "15",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Differentiate: f'(x) = 6x^2 - 6x - 12 = 6(x - 2)(x + 1). Critical points: x = 2 and x = -1.
                Step 2: Classify with the second derivative: f''(x) = 12x - 6. f''(2) = 18, positive, so x = 2 is the local minimum point. f''(-1) = -18, negative, so x = -1 is the local maximum point.
                Step 3: The question asks for the minimum VALUE: f(2) = 16 - 12 - 24 + 5 = -15.
                Trap: 12 (option A) is the local MAXIMUM value f(-1) — correct arithmetic, wrong extremum. 15 (option D) is the same digits with the sign dropped. Always finish by asking: location or value, maximum or minimum?
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_59",
            chapterId = "math_ch_11",
            subject = "Mathematics",
            topic = "Optimisation — Maximum Area at Fixed Perimeter",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 60,
            prompt = "A rectangle has perimeter 60 m. The maximum possible area of the rectangle is:",
            optionA = "225 square metres",
            optionB = "200 square metres",
            optionC = "250 square metres",
            optionD = "144 square metres",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Let the sides be x and 30 - x (half the perimeter is 30, so the two sides share it). Area: A(x) = x (30 - x) = 30x - x^2, on the domain 0 < x < 30.
                Step 2: Differentiate: A'(x) = 30 - 2x, which is zero at x = 15. A''(x) = -2, negative, confirming a maximum.
                Step 3: At x = 15 the rectangle is a 15 by 15 square, and the maximum area is 15 x 15 = 225 square metres.
                Trap: 144 (option D) is the 12 by 18 split some students guess first; 250 (option C) is unattainable under this perimeter. Moral worth memorising: at fixed perimeter, the square is the optimal rectangle.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_math_60",
            chapterId = "math_ch_12",
            subject = "Mathematics",
            topic = "Substitution — the f'/f Pattern in a Definite Integral",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 75,
            prompt = "The value of the integral from 0 to 1 of 2x/(1 + x^2) dx is:",
            optionA = "ln 2",
            optionB = "1/2",
            optionC = "ln 3",
            optionD = "2 ln 2",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Recognise the pattern: the numerator 2x is exactly the derivative of the denominator 1 + x^2, so this is the f'/f shape whose antiderivative is a logarithm.
                Step 2: Substitute u = 1 + x^2, du = 2x dx. The limits convert with u: when x = 0, u = 1; when x = 1, u = 2.
                Step 3: The integral becomes the integral from 1 to 2 of (1/u) du = [ln u] from 1 to 2 = ln 2 - ln 1 = ln 2.
                Trap: 2 ln 2 (option D) comes from doubling the log by confusing this with the integral of (2x)/(1 + x^2) over limits that would make u run from 1 to 4 — here u runs 1 to 2, giving exactly one ln 2. ln 3 (option C) misreads the upper u-limit as 1 + 2 = 3 by substituting x = 2, which is not even in the interval.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_61",
            chapterId = "math_ch_12",
            subject = "Mathematics",
            topic = "King's Property — the Symmetric Ratio",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "The value of the integral from 0 to pi/2 of sin x/(sin x + cos x) dx is:",
            optionA = "pi/2",
            optionB = "pi/4",
            optionC = "pi/6",
            optionD = "1",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Do not hunt for an antiderivative — the integrand is a symmetric ratio on [0, pi/2], which is King's property territory.
                Step 2: Call the integral I. The mirror (replace x by pi/2 - x) swaps sin and cos, so the mirror I is the integral from 0 to pi/2 of cos x/(cos x + sin x) dx.
                Step 3: Add the twins: 2I = the integral from 0 to pi/2 of (sin x + cos x)/(sin x + cos x) dx = the integral from 0 to pi/2 of 1 dx = pi/2.
                Step 4: Halve: I = pi/4. This is the silhouette law: f/(f + mirror f) on [0, a] always gives a/2.
                Trap: pi/2 (option A) is the pair's combined value before halving — the divide-by-2 is the last step of every King computation. 1 (option D) guesses a decimal-flavoured answer for an interval whose length itself is pi/2.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_62",
            chapterId = "math_ch_12",
            subject = "Mathematics",
            topic = "Integration by Parts — Polynomial times Exponential",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 60,
            prompt = "The integral of x e^x dx is:",
            optionA = "e^x (x + 1) + C",
            optionB = "x e^x + C",
            optionC = "e^x (x - 1) + C",
            optionD = "e^x (1 - x) + C",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: The integrand is a product of unlike families, so use parts. ILATE puts algebraic before exponential: u = x, v = e^x.
                Step 2: Parts gives u times the integral of v, minus the integral of u' times the integral of v: x e^x - the integral of 1 x e^x dx = x e^x - e^x + C.
                Step 3: Factor: e^x (x - 1) + C. Audit by differentiating: e^x (x - 1) + e^x = x e^x, exactly the integrand.
                Trap: e^x (x + 1) (option A) flips the sign of the subtracted integral — parts SUBTRACTS the integral of u'v. x e^x alone (option B) forgets that subtraction entirely, keeping only the first term of the formula.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_63",
            chapterId = "math_ch_12",
            subject = "Mathematics",
            topic = "Area Between Two Curves — Line and Parabola",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 75,
            prompt = "The area enclosed by the curves y = x^2 and y = x is:",
            optionA = "1/3",
            optionB = "1/2",
            optionC = "1/4",
            optionD = "1/6",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: Find the limits from the intersections: x^2 = x gives x(x - 1) = 0, so x = 0 and x = 1.
                Step 2: Decide the top curve: at x = 1/4 the line gives 1/4 and the parabola gives 1/16, so the line y = x is on top between the intersections.
                Step 3: Area = the integral from 0 to 1 of (x - x^2) dx = [x^2/2 - x^3/3] from 0 to 1 = 1/2 - 1/3 = 1/6.
                Trap: 1/2 (option B) is just the area under the line alone — it never subtracts the parabola. Integrating (x^2 - x) upside down returns -1/6, and deleting the minus sign afterwards is a fudge, not a fix; the order (top - bottom) must be set before integrating.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_64",
            chapterId = "math_ch_12",
            subject = "Mathematics",
            topic = "Definite Integrals — Even and Odd Splitting",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The value of the integral from -2 to 2 of (x^3 + x^2) dx is:",
            optionA = "0",
            optionB = "16/3",
            optionC = "32/3",
            optionD = "8/3",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Run the symmetry audit first: the interval [-2, 2] is symmetric, so split the integrand by parity.
                Step 2: x^3 is odd, so its integral from -2 to 2 is 0 — the two halves cancel exactly.
                Step 3: x^2 is even, so its integral is 2 times the integral from 0 to 2 of x^2 dx = 2 x (8/3) = 16/3.
                Step 4: Total: 0 + 16/3 = 16/3.
                Trap: 0 (option A) wrongly extends the odd verdict to the whole integrand — only the x^3 organ vanishes. 32/3 (option C) doubles twice: once by the even rule and once again by habit.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_math_65",
            chapterId = "math_ch_13",
            subject = "Mathematics",
            topic = "Order and Degree — the sin(dy/dx) Trap",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The order and degree of the differential equation d^2y/dx^2 + sin(dy/dx) = 0 are:",
            optionA = "order 2, degree 1",
            optionB = "order 2, degree not defined",
            optionC = "order 1, degree not defined",
            optionD = "order 2, degree 2",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: The highest derivative present is d^2y/dx^2, so the order is 2.
                Step 2: Degree is the power of that highest derivative, and it exists only when the equation is a polynomial equation in the derivatives.
                Step 3: Here dy/dx is trapped inside sin, and no algebra converts sin(dy/dx) into a polynomial term — so the degree is not defined.
                Trap: degree 1 (option A) pretends sin(dy/dx) behaves like a plain factor; degree 2 (option D) copies the order into the degree slot. Whenever a derivative sits inside sin, cos, e-power or log, the degree answer is "not defined".
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_66",
            chapterId = "math_ch_13",
            subject = "Mathematics",
            topic = "Variable Separable — Particular Solution",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 75,
            prompt = "If dy/dx = 2xy and y(0) = 3, then y(1) equals:",
            optionA = "3e",
            optionB = "3 + e",
            optionC = "e^3",
            optionD = "3e^2",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Separate the variables: dy/y = 2x dx.
                Step 2: Integrate both sides: ln y = x^2 + C, so the general solution is y = A e^(x^2).
                Step 3: Apply y(0) = 3: 3 = A e^0 = A, so the particular solution is y = 3 e^(x^2).
                Step 4: At x = 1: y(1) = 3 e^(1) = 3e (approximately 8.15).
                Trap: 3e^2 (option D) evaluates the exponent x^2 at x = 2 instead of x = 1, and e^3 (option C) swaps the roles of the constant and the base — the 3 is a multiplier fixed by the initial condition, not an exponent.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_67",
            chapterId = "math_ch_13",
            subject = "Mathematics",
            topic = "Linear Equations — the Integrating Factor",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "The integrating factor of the differential equation dy/dx + (2/x) y = x^2 is:",
            optionA = "e^(2x)",
            optionB = "e^(x^2)",
            optionC = "x^2",
            optionD = "2/x",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: The equation is already in standard form dy/dx + P y = Q with P = 2/x.
                Step 2: The integrating factor is IF = e^(integral of P dx) = e^(integral of (2/x) dx) = e^(2 ln x).
                Step 3: Simplify: e^(2 ln x) = e^(ln (x^2)) = x^2.
                Trap: e^(2x) (option A) integrates 2/x as if it were the constant 2. The integral of 2/x is 2 ln x, and the exponential of that is a power of x, not an exponential of x.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_68",
            chapterId = "math_ch_13",
            subject = "Mathematics",
            topic = "Forming a DE — Eliminating the Constant",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The differential equation of the family of curves y = C x^2, where C is an arbitrary constant, is:",
            optionA = "2x (dy/dx) = y",
            optionB = "dy/dx = 2x y",
            optionC = "x (dy/dx) = y",
            optionD = "x (dy/dx) = 2y",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: One arbitrary constant (C) means one differentiation: dy/dx = 2Cx.
                Step 2: Eliminate C using the family itself: from y = C x^2, C = y / x^2.
                Step 3: Substitute: dy/dx = 2 (y / x^2) x = 2y / x, which tidies to x (dy/dx) = 2y.
                Audit: the answer contains no C, as a family's DE must. Quick check with C = 1: y = x^2 gives dy/dx = 2x, and x times 2x = 2x^2 = 2y — the equation holds.
                Trap: option C drops the factor 2 that differentiation of x^2 produces; option B confuses the DE with the separable lookalike dy/dx = 2xy, whose solutions are exponentials, not parabolas.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_69",
            chapterId = "math_ch_13",
            subject = "Mathematics",
            topic = "Applications — Doubling Time",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "A bacterial culture doubles every 3 hours. If the culture starts with 200 bacteria, the number of bacteria after 12 hours is:",
            optionA = "800",
            optionB = "1600",
            optionC = "3200",
            optionD = "6400",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: The growth obeys dN/dt = kN, so the count follows N = N0 times 2^(number of doubling periods).
                Step 2: Count the doublings: 12 hours divided by 3 hours per doubling = 4 doublings.
                Step 3: N = 200 times 2^4 = 200 times 16 = 3200.
                Trap: 1600 (option B) is only 3 doublings (9 hours), and 800 (option A) treats each 3-hour block as adding a flat 200 — growth multiplies, it does not add.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_math_70",
            chapterId = "math_ch_14",
            subject = "Mathematics",
            topic = "Statistics — Scaling Laws for Standard Deviation",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The standard deviation of a dataset is 6. Every observation x is replaced by y = 4x - 3. The standard deviation of the new dataset is:",
            optionA = "6",
            optionB = "21",
            optionC = "24",
            optionD = "96",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Split the transformation into its two parts: a stretch by a = 4 and a shift by b = -3.
                Step 2: A shift moves every value rigidly — all gaps stay the same, so the shift changes no measure of spread at all.
                Step 3: A stretch by a multiplies every gap by |a|, so the SD scales by |a| only: new SD = 4 x 6 = 24.
                Audit: the new variance is 24^2 = 576, which also equals 4^2 x (old variance 36) = 576. Both laws agree.
                Trap: 21 (option B) applies the whole of y = 4x - 3 to the SD, shift included. 96 (option D) uses the variance law a^2 on the SD. 6 (option A) forgets the stretch entirely.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_71",
            chapterId = "math_ch_14",
            subject = "Mathematics",
            topic = "Conditional Probability — Cards",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "A card is drawn from a standard 52-card deck and is seen to be a face card (jack, queen or king). The probability that it is a king is:",
            optionA = "1/3",
            optionB = "1/13",
            optionC = "4/13",
            optionD = "1/4",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: The word "given" shrinks the sample space. The card is known to be a face card, and a deck has 12 face cards (4 jacks, 4 queens, 4 kings).
                Step 2: Inside this reduced world of 12 cards, exactly 4 are kings.
                Step 3: P(king given face card) = 4/12 = 1/3.
                Trap: 1/13 (option B) is the unconditional P(king) = 4/52 — it ignores the given information. 1/4 (option D) counts only one suit's worth of reasoning. The conditional world, not the full deck, owns the denominator.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_72",
            chapterId = "math_ch_14",
            subject = "Mathematics",
            topic = "Bayes' Theorem — Medical Test and Base Rate",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 105,
            prompt = "A disease affects 1% of a population. A test detects the disease in 99% of those who have it, but also gives a positive result for 5% of those who do not have it. A randomly chosen person tests positive. The probability that the person actually has the disease is:",
            optionA = "99/100",
            optionB = "1/6",
            optionC = "1/2",
            optionD = "1/100",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Draw the tree. Prior: P(disease) = 0.01, P(healthy) = 0.99.
                Step 2: True-positive route: 0.01 x 0.99 = 0.0099. False-alarm route: 0.99 x 0.05 = 0.0495.
                Step 3: All positives: 0.0099 + 0.0495 = 0.0594. Bayes: P(disease given positive) = 0.0099 / 0.0594 = 99/594 = 1/6.
                Step 4: Despite a 99% detection rate, a positive is right only about 1 time in 6 — the healthy crowd is 99 times larger, so its 5% false alarms swamp the true positives.
                Trap: 99/100 (option A) is the sensitivity P(positive given disease) — the forward conditional, not the reversed one asked for. 1/100 (option D) is just the prior, ignoring the test entirely.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_73",
            chapterId = "math_ch_14",
            subject = "Mathematics",
            topic = "Binomial Distribution — Exactly k Successes",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 75,
            prompt = "A fair coin is tossed 5 times. The probability of getting exactly 3 heads is:",
            optionA = "5/32",
            optionB = "3/8",
            optionC = "1/2",
            optionD = "5/16",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: Audit the binomial conditions: n = 5 fixed tosses, two outcomes per toss, p = 1/2 constant, tosses independent. The formula is legal.
                Step 2: P(X = 3) = C(5, 3) x (1/2)^3 x (1/2)^2 = 10 x (1/32) = 10/32.
                Step 3: Simplify: 10/32 = 5/16.
                Trap: 5/32 (option A) comes from C(5, 3) = 5 — the combination counts the 10 orders in which 3 heads can land among 5 tosses, and dropping it (or halving it) is the classic binomial slip. 1/2 (option C) confuses the expected proportion with the probability of exactly 3.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_math_74",
            chapterId = "math_ch_14",
            subject = "Mathematics",
            topic = "Linear Programming — Corner-Point Method",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 90,
            prompt = "Maximise Z = 5x + 3y subject to x + y <= 6, x <= 4, y <= 5, x >= 0, y >= 0. The maximum value of Z is:",
            optionA = "20",
            optionB = "30",
            optionC = "26",
            optionD = "15",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: The feasible region is the polygon cut out by the three constraints in the first quadrant. Its corners are (0, 0), (4, 0), (4, 2), (1, 5) and (0, 5).
                Step 2: The corner (4, 2) is where x = 4 meets x + y = 6; the corner (1, 5) is where y = 5 meets x + y = 6.
                Step 3: Evaluate Z = 5x + 3y at each corner: (0, 0) gives 0; (4, 0) gives 20; (4, 2) gives 26; (1, 5) gives 20; (0, 5) gives 15.
                Step 4: The largest value is 26, attained at (4, 2).
                Trap: 30 (option B) is the value at (3, 4) or similar interior guesses — no interior point is ever optimal; 20 (option A) is the best AXIS corner, beaten by the crossing corner (4, 2). In an LPP, list every corner before concluding.
            """.trimIndent()
        ),

        QuestionEntity(

            id = "q_phys_6",

            chapterId = "phys_ch_1",

            subject = "Physics",

            topic = "Propagation of Errors",

            examSource = "IISER IAT",

            examYear = null,

            isImportantQuestion = true,

            isPyq = false,

            difficulty = "Analytical",

            estimatedSeconds = 120,

            prompt = "A physical quantity Z is calculated from measured quantities A, B, C and D by the relation Z = A² B^(1/3) / (C D³). The percentage errors in the measurements of A, B, C and D are 1%, 3%, 2% and 4% respectively. The maximum percentage error in the value of Z is:",

            optionA = "17%",

            optionB = "12%",

            optionC = "10%",

            optionD = "27%",

            correctOptionIndex = 0,

            stepByStepExplanation = """

                Step 1: For Z = A^p B^q / (C^r D^s), the maximum fractional error is:

                ΔZ/Z = p(ΔA/A) + q(ΔB/B) + r(ΔC/C) + s(ΔD/D) — powers multiply the percentage errors, and errors in the denominator add too, never subtract.

                Step 2: Here p = 2, q = 1/3, r = 1 and s = 3.

                Contribution of A: 2 × 1% = 2%.

                Contribution of B: (1/3) × 3% = 1%.

                Contribution of C: 1 × 2% = 2%.

                Contribution of D: 3 × 4% = 12%.

                Step 3: Total maximum percentage error = 2 + 1 + 2 + 12 = 17%.

                Note how D dominates: a quantity raised to the third power with a 4% error alone contributes 12%. In the laboratory, improving D's measurement improves Z the most.

            """.trimIndent()

        ),

        QuestionEntity(

            id = "q_phys_7",

            chapterId = "phys_ch_1",

            subject = "Physics",

            topic = "Dimensional Analysis — Fundamental Constants",

            examSource = "IISER IAT",

            examYear = null,

            isImportantQuestion = true,

            isPyq = false,

            difficulty = "Research-Level",

            estimatedSeconds = 180,

            prompt = "A new system of units takes the speed of light c, the gravitational constant G and the Planck constant h as fundamental quantities. In this system the dimension of length is written as [L] = G^a h^b c^d. The values of (a, b, d) are:",

            optionA = "(1/2, −3/2, 1/2)",

            optionB = "(1/2, 1/2, −3/2)",

            optionC = "(−1/2, 1/2, 3/2)",

            optionD = "(3/2, 1/2, −1/2)",

            correctOptionIndex = 1,

            stepByStepExplanation = """

                Step 1: Write the dimensions of the three constants:

                [G] = [M⁻¹ L³ T⁻²], [h] = [M L² T⁻¹], [c] = [L T⁻¹].

                Step 2: Set up the dimensional equation:

                [L] = [M⁻¹ L³ T⁻²]^a × [M L² T⁻¹]^b × [L T⁻¹]^d.

                Step 3: Equate powers.

                Mass: −a + b = 0, so b = a.

                Time: −2a − b − d = 0, so d = −2a − b = −3a.

                Length: 3a + 2b + d = 1. Substituting b = a and d = −3a: 3a + 2a − 3a = 2a = 1, so a = 1/2.

                Step 4: Therefore b = 1/2 and d = −3/2, giving L ∝ √(Gh/c³).

                Research insight: this combination is the Planck length (about 1.6 × 10⁻³⁵ m when h is replaced by the reduced constant ħ = h/2π — the two differ only by the dimensionless factor √(2π), which dimensional analysis itself can never supply).

            """.trimIndent()

        ),

        QuestionEntity(

            id = "q_phys_8",

            chapterId = "phys_ch_1",

            subject = "Physics",

            topic = "Principle of Homogeneity",

            examSource = "IISER IAT",

            examYear = null,

            isImportantQuestion = true,

            isPyq = false,

            difficulty = "Conceptual",

            estimatedSeconds = 90,

            prompt = "In the relation P = P₀ e^(−αt²), P denotes pressure and t denotes time. The dimensional formula of the constant α is:",

            optionA = "Dimensionless",

            optionB = "[T⁻¹]",

            optionC = "[T⁻²]",

            optionD = "[M L⁻¹ T⁻²]",

            correctOptionIndex = 2,

            stepByStepExplanation = """

                Step 1: By the principle of homogeneity, the argument of every transcendental function — exponential e^x, sin x, cos x, ln x — must be a pure number, i.e. dimensionless. Otherwise the series expansion 1 + x + x²/2! + ... would add quantities of different dimensions, which is meaningless.

                Step 2: Therefore [αt²] = [M⁰ L⁰ T⁰] = 1.

                Step 3: [α] = 1 / [t²] = [T⁻²].

                Step 4: The pressure P₀ carries all the dimensions of P; the exponential factor only scales it.

                Companion result: in y = A sin(ωt − kx), the same argument gives [ω] = [T⁻¹] and [k] = [L⁻¹]. Whenever you meet e, sin, cos or ln in an equation, first demand that its argument be dimensionless — it is the fastest way to find the dimensions of unknown constants.

            """.trimIndent()

        ),

        QuestionEntity(

            id = "q_phys_9",

            chapterId = "phys_ch_1",

            subject = "Physics",

            topic = "Percentage Error in Kinetic Energy",

            examSource = "IISER IAT",

            examYear = null,

            isImportantQuestion = true,

            isPyq = false,

            difficulty = "Conceptual",

            estimatedSeconds = 90,

            prompt = "The momentum of a body is measured with a maximum percentage error of 3%, while its mass is known exactly. The maximum percentage error in the kinetic energy of the body is:",

            optionA = "3%",

            optionB = "1.5%",

            optionC = "9%",

            optionD = "6%",

            correctOptionIndex = 3,

            stepByStepExplanation = """

                Step 1: Express kinetic energy in terms of momentum:

                KE = p² / (2m).

                Step 2: Apply the power rule of error propagation. For a quantity raised to the power n, the percentage error is multiplied by |n|. Here p appears with power 2, and m is exact (zero error), so:

                Percentage error in KE = 2 × (percentage error in p) + 0 = 2 × 3% = 6%.

                Step 3: Hence the maximum percentage error in KE is 6%.

                Trap: using KE = ½mv² directly tempts many students to first convert the momentum error into a velocity error. Both routes agree — v = p/m carries the same 3% error, and KE ∝ v² again doubles it to 6%. Powers amplify errors: this is why squared and cubed quantities must be measured most carefully.

            """.trimIndent()

        ),
        QuestionEntity(
            id = "q_phys_10",
            chapterId = "phys_ch_2",
            subject = "Physics",
            topic = "Kinematic Equations — Uniform Acceleration",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 90,
            prompt = "A car accelerates uniformly from 36 km/h to 72 km/h in 5 s. The distance travelled by the car during this interval is:",
            optionA = "50 m",
            optionB = "75 m",
            optionC = "100 m",
            optionD = "62.5 m",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Convert speeds to SI units (× 5/18):
                u = 36 km/h = 10 m/s, v = 72 km/h = 20 m/s.
                Step 2: For uniform acceleration, displacement = average velocity × time:
                s = ½(u + v) × t = ½ × (10 + 20) × 5 = 75 m.
                (Check via acceleration: a = (20 − 10)/5 = 2 m/s², then s = ut + ½at² = 50 + 25 = 75 m.)
                Trap: forgetting the km/h → m/s conversion inflates the answer five-fold; using only v × t gives 100 m (option C).
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_11",
            chapterId = "phys_ch_2",
            subject = "Physics",
            topic = "Distance in the nth Second",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 90,
            prompt = "A body starts from rest and moves with uniform acceleration 2 m/s². The distance it travels during the 3rd second of its motion is:",
            optionA = "3 m",
            optionB = "5 m",
            optionC = "7 m",
            optionD = "9 m",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Distance in the nth second: sₙ = u + (a/2)(2n − 1).
                Step 2: Here u = 0, a = 2 m/s², n = 3:
                s₃ = 0 + (2/2)(2 × 3 − 1) = 1 × 5 = 5 m.
                (Check: distance in 3 s = ½ × 2 × 9 = 9 m; distance in 2 s = ½ × 2 × 4 = 4 m; difference = 5 m.)
                Trap: 9 m (option D) is the distance in 3 seconds, not in the 3rd second — the two are deliberately placed side by side in exams.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_12",
            chapterId = "phys_ch_2",
            subject = "Physics",
            topic = "Free Fall — Distance in the Last Second",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 120,
            prompt = "A stone is dropped from rest from the top of an 80 m tower. Taking g = 10 m/s², the distance it falls during the last second of its motion is:",
            optionA = "25 m",
            optionB = "30 m",
            optionC = "35 m",
            optionD = "45 m",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Total fall time from h = ½gt²:
                t = √(2h/g) = √(2 × 80 / 10) = √16 = 4 s.
                Step 2: Distance covered in the first 3 s:
                s(3) = ½ × 10 × 3² = 45 m.
                Step 3: Distance in the last (4th) second = 80 − 45 = 35 m.
                (Galileo check: successive seconds cover 5, 15, 25, 35 m — odd-number ratio 1 : 3 : 5 : 7 scaled by g/2.)
                Trap: 45 m (option D) is the distance in the FIRST three seconds, not the last one.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_13",
            chapterId = "phys_ch_2",
            subject = "Physics",
            topic = "Average Speed — Equal Distances",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 90,
            prompt = "A bus travels the first half of a journey's distance at 60 km/h and the second half at 40 km/h. Its average speed for the whole journey is:",
            optionA = "50 km/h",
            optionB = "48 km/h",
            optionC = "52 km/h",
            optionD = "45 km/h",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: For EQUAL DISTANCES, average speed is the harmonic mean:
                v_avg = 2v₁v₂ / (v₁ + v₂).
                Step 2: v_avg = 2 × 60 × 40 / (60 + 40) = 4800 / 100 = 48 km/h.
                (Direct check: for a 120 km journey — 60 km at 60 km/h takes 1 h, 60 km at 40 km/h takes 1.5 h; total 120 km in 2.5 h = 48 km/h.)
                Trap: 50 km/h (option A) is the plain average, which is correct only when the two legs take equal TIME, not equal distance.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_14",
            chapterId = "phys_ch_2",
            subject = "Physics",
            topic = "Stopping Distance and Reaction Time",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 120,
            prompt = "A car is moving at 20 m/s. The driver's reaction time is 0.5 s, after which the brakes produce a uniform deceleration of 5 m/s². The total distance travelled from the moment the driver sees the obstacle until the car stops is:",
            optionA = "40 m",
            optionB = "45 m",
            optionC = "50 m",
            optionD = "60 m",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: During the reaction time the car continues at full speed:
                reaction distance = u × tᵣ = 20 × 0.5 = 10 m.
                Step 2: Braking distance from v² = u² − 2as with v = 0:
                s = u² / (2a) = 20² / (2 × 5) = 400 / 10 = 40 m.
                Step 3: Total stopping distance = 10 + 40 = 50 m.
                Trap: 40 m (option A) forgets the reaction distance entirely — in real driving and in exams, the two parts must always be added.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_15",
            chapterId = "phys_ch_3",
            subject = "Physics",
            topic = "Resultant of Two Vectors",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "Two vectors have magnitudes 3 units and 4 units and the angle between them is 90°. The magnitude of their resultant is:",
            optionA = "7 units",
            optionB = "5 units",
            optionC = "1 unit",
            optionD = "√7 units",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Resultant of two vectors at angle θ: R = √(A² + B² + 2AB cosθ).
                Step 2: With A = 3, B = 4, θ = 90°, cos90° = 0:
                R = √(9 + 16 + 0) = √25 = 5 units.
                Trap: 7 units (option A) would need the vectors parallel (θ = 0°); 1 unit (option C) would need them antiparallel (θ = 180°). The angle decides everything.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_16",
            chapterId = "phys_ch_3",
            subject = "Physics",
            topic = "Resolution of Vectors",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A velocity vector of 10 m/s is directed at 60° above the horizontal. Its horizontal component is:",
            optionA = "8.66 m/s",
            optionB = "5 m/s",
            optionC = "10 m/s",
            optionD = "5.77 m/s",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: The component adjacent to the angle takes the cosine:
                v_x = v cosθ = 10 × cos60° = 10 × 0.5 = 5 m/s.
                Step 2: (The vertical component takes the sine: v_y = 10 × sin60° = 8.66 m/s.)
                Trap: 8.66 m/s (option A) is the VERTICAL component — the standard swap error. Remember: the component next to the angle is always the cos component.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_17",
            chapterId = "phys_ch_3",
            subject = "Physics",
            topic = "Projectile Motion — Range",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 90,
            prompt = "A projectile is launched at 20 m/s at an angle of 45° to the horizontal, over level ground. Taking g = 10 m/s², its range is:",
            optionA = "20 m",
            optionB = "28.3 m",
            optionC = "40 m",
            optionD = "80 m",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: For launch and landing at the same height, R = u² sin2θ / g.
                Step 2: R = (20² × sin90°) / 10 = (400 × 1) / 10 = 40 m.
                (45° is the maximum-range angle, so R = R_max = u²/g = 40 m directly.)
                Trap: 28.3 m (option B) comes from using sinθ instead of sin2θ; the formula needs the doubled angle.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_18",
            chapterId = "phys_ch_3",
            subject = "Physics",
            topic = "Projectile Motion — Maximum Height",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "A ball is projected at 30 m/s at 30° above the horizontal. Taking g = 10 m/s², the maximum height it reaches is:",
            optionA = "22.5 m",
            optionB = "45 m",
            optionC = "11.25 m",
            optionD = "15 m",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Only the vertical component fights gravity: u_y = u sinθ = 30 × sin30° = 15 m/s.
                Step 2: At the top v_y = 0, so from v² = u² − 2gH:
                H = u_y² / (2g) = 15² / 20 = 225 / 20 = 11.25 m.
                (Equivalently H = u² sin²θ / 2g = 900 × 0.25 / 20 = 11.25 m.)
                Trap: 45 m (option B) uses the full speed 30 m/s in place of its vertical component; 22.5 m (option A) forgets the sin²θ factor's square.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_19",
            chapterId = "phys_ch_3",
            subject = "Physics",
            topic = "Uniform Circular Motion — Centripetal Acceleration",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A particle moves in a circle of radius 2 m with a constant speed of 6 m/s. The magnitude of its acceleration is:",
            optionA = "3 m/s²",
            optionB = "12 m/s²",
            optionC = "18 m/s²",
            optionD = "36 m/s²",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: In uniform circular motion the acceleration is purely centripetal:
                a_c = v² / r.
                Step 2: a_c = 6² / 2 = 36 / 2 = 18 m/s², directed towards the centre at every instant.
                Trap: the speed is constant, yet the acceleration is NOT zero — the direction of velocity changes continuously. 3 m/s² (option A) is v/r, a dimensionally wrong guess.
            """.trimIndent()
        ),

        QuestionEntity(
            id = "q_phys_20",
            chapterId = "phys_ch_1",
            subject = "Physics",
            topic = "Unit Conversion — Density",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "The density of a material is 8 g/cm³. Expressed in SI units (kg/m³), it is:",
            optionA = "8 kg/m³",
            optionB = "80 kg/m³",
            optionC = "800 kg/m³",
            optionD = "8000 kg/m³",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: Use the pocket conversion 1 g/cm³ = 1000 kg/m³ (because 1 g = 10⁻³ kg and 1 cm³ = 10⁻⁶ m³, and 10⁻³/10⁻⁶ = 10³).
                Step 2: 8 g/cm³ = 8 × 1000 = 8000 kg/m³.
                Trap: Options A–C come from using factors of 10 or 100. The cm³ in the denominator carries the full 10⁶ — that is where the marks hide.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_21",
            chapterId = "phys_ch_1",
            subject = "Physics",
            topic = "Significant Figures",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 30,
            prompt = "The number of significant figures in 0.004050 is:",
            optionA = "2",
            optionB = "3",
            optionC = "4",
            optionD = "6",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Leading zeros never count — the three zeros before 4 only fix the decimal point.
                Step 2: The significant digits are 4, 0 (captive, between non-zero digits), 5 and 0 (trailing, after a decimal point) — total 4.
                Trap: Option D (6) counts every digit including the leading zeros; option B (3) drops the trailing zero, which was genuinely measured.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_22",
            chapterId = "phys_ch_1",
            subject = "Physics",
            topic = "Dimensional Homogeneity",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "Which of the following equations is dimensionally INCONSISTENT?",
            optionA = "v = u + at",
            optionB = "s = ut + ½at²",
            optionC = "v² = u² + 2as",
            optionD = "s = vt²",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: Audit each option term by term. (a) [at] = [L T⁻²][T] = [L T⁻¹] = [v] ✓. (b) [ut] = [L], [at²] = [L] ✓. (c) [as] = [L T⁻²][L] = [L² T⁻²] = [v²] ✓.
                Step 2: (d) [vt²] = [L T⁻¹][T²] = [L T], which is not [L] — the equation cannot describe a displacement.
                Trap: Dimensionless constants (½, 2) never affect the audit; only the powers of the quantities matter.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_23",
            chapterId = "phys_ch_1",
            subject = "Physics",
            topic = "Dimensional Formula — Spring Constant",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "From Hooke's law F = kx, the dimensional formula of the spring constant k is:",
            optionA = "[M L T⁻²]",
            optionB = "[M T⁻²]",
            optionC = "[M L⁻¹ T⁻²]",
            optionD = "[M L² T⁻²]",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: k = F/x, so [k] = [F] ÷ [x] = [M L T⁻²] ÷ [L].
                Step 2: The length cancels: [k] = [M T⁻²].
                Trap: Option A is the dimensions of force itself (forgetting to divide by extension); option C is pressure. Note [M T⁻²] is also the dimensions of surface tension — the famous twin pair.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_24",
            chapterId = "phys_ch_1",
            subject = "Physics",
            topic = "Converting Units by Dimensional Formula",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "Using the dimensional formula of energy [M L² T⁻²], the value of 1 joule in CGS units (erg) is:",
            optionA = "10⁵ erg",
            optionB = "10⁶ erg",
            optionC = "10⁷ erg",
            optionD = "10⁸ erg",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: n₂ = n₁ × (M₁/M₂)ᵃ × (L₁/L₂)ᵇ × (T₁/T₂)ᶜ with (a, b, c) = (1, 2, −2) for energy.
                Step 2: n₂ = 1 × (kg/g)¹ × (m/cm)² × (s/s)⁻² = 1000 × 100² = 10³ × 10⁴ = 10⁷.
                So 1 J = 10⁷ erg. Trap: The time ratio is 1 (both systems use the second), so the c = −2 exponent contributes nothing — options A and B come from mishandling the squared length ratio.
            """.trimIndent()
        ),

        QuestionEntity(
            id = "q_phys_25",
            chapterId = "phys_ch_4",
            subject = "Physics",
            topic = "Newton's Second Law with Kinetic Friction",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A 5 kg block on a horizontal floor is pushed with a horizontal force of 40 N. The coefficient of kinetic friction between the block and the floor is 0.2. Taking g = 10 m/s², the acceleration of the block is:",
            optionA = "8 m/s²",
            optionB = "4 m/s²",
            optionC = "6 m/s²",
            optionD = "2 m/s²",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: On a horizontal floor, N = mg = 5 × 10 = 50 N, so kinetic friction f_k = μ_k N = 0.2 × 50 = 10 N, opposing the push.
                Step 2: Net force = 40 − 10 = 30 N, so a = F_net / m = 30 / 5 = 6 m/s².
                Trap: 8 m/s² (option A) ignores friction entirely. The second law always takes the NET force.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_26",
            chapterId = "phys_ch_4",
            subject = "Physics",
            topic = "Atwood Machine — Tension",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 90,
            prompt = "In an Atwood machine, masses of 3 kg and 7 kg hang from a light string over a frictionless pulley. Taking g = 10 m/s², the tension in the string is:",
            optionA = "30 N",
            optionB = "42 N",
            optionC = "50 N",
            optionD = "21 N",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Acceleration a = (m₂ − m₁)g / (m₁ + m₂) = (7 − 3) × 10 / 10 = 4 m/s².
                Step 2: Isolate the 3 kg mass, which accelerates upward: T − 3g = 3a, so T = 3 × (10 + 4) = 42 N.
                (Formula check: T = 2m₁m₂g / (m₁ + m₂) = 2 × 3 × 7 × 10 / 10 = 42 N.)
                Trap: 30 N (option A) is the lighter weight and 70 N would be the heavier — tension lies strictly between the two weights; it equals neither.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_27",
            chapterId = "phys_ch_4",
            subject = "Physics",
            topic = "Banking of Roads — Frictionless Design Speed",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A road is banked at 45° for a curve of radius 40 m. Neglecting friction, the speed at which a vehicle can take the curve without relying on friction is (g = 10 m/s²):",
            optionA = "10 m/s",
            optionB = "14.1 m/s",
            optionC = "20 m/s",
            optionD = "28.3 m/s",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: For frictionless banking, the horizontal component of the normal reaction supplies the centripetal force, giving tan θ = v² / (rg).
                Step 2: v = √(rg tan θ) = √(40 × 10 × tan 45°) = √(400 × 1) = 20 m/s.
                Trap: 14.1 m/s (option B) comes from dropping the tan θ factor or halving rg; at θ = 45° tan θ = 1 exactly, so v = √(rg).
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_28",
            chapterId = "phys_ch_4",
            subject = "Physics",
            topic = "Conservation of Momentum — Perfectly Inelastic Collision",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "A 3 kg block moving at 4 m/s on a frictionless surface collides with a stationary 1 kg block and the two stick together. Their common velocity after the collision is:",
            optionA = "4 m/s",
            optionB = "2 m/s",
            optionC = "3 m/s",
            optionD = "1.5 m/s",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: External impulse during the brief collision is negligible, so momentum is conserved:
                m₁u₁ + m₂u₂ = (m₁ + m₂) v.
                Step 2: 3 × 4 + 1 × 0 = 4v, so v = 12 / 4 = 3 m/s.
                Trap: Kinetic energy is NOT conserved here — it falls from 24 J to 18 J. Only momentum survives a perfectly inelastic collision intact.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_29",
            chapterId = "phys_ch_4",
            subject = "Physics",
            topic = "Angle of Repose and Limiting Friction",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "A block placed on an inclined plane begins to slip when the angle of inclination is slowly raised to 30°. The coefficient of static friction between the block and the plane is:",
            optionA = "1/√3",
            optionB = "1/2",
            optionC = "√3/2",
            optionD = "1",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: The angle at which slipping just begins is the angle of repose α, and at that verge mg sin α = μ_s mg cos α.
                Step 2: μ_s = tan α = tan 30° = 1/√3 ≈ 0.577.
                Trap: sin 30° = 1/2 (option B) and cos 30° = √3/2 (option C) are the components separately — the coefficient comes from their RATIO, which is the tangent.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_30",
            chapterId = "phys_ch_5",
            subject = "Physics",
            topic = "Work Done by a Constant Force",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "A force of 50 N acts on a body at an angle of 60° to its displacement. If the body moves 10 m in the direction of the displacement, the work done by the force is:",
            optionA = "500 J",
            optionB = "250 J",
            optionC = "433 J",
            optionD = "0 J",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Work by a constant force: W = F s cosθ, with θ the angle between force and displacement.
                Step 2: W = 50 × 10 × cos60° = 500 × 0.5 = 250 J.
                Trap: 500 J (option A) ignores the angle entirely; 433 J (option C) uses sin60° instead of cos60° — the component ALONG the displacement always takes the cosine.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_31",
            chapterId = "phys_ch_5",
            subject = "Physics",
            topic = "Work-Energy Theorem",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A net work of 400 J is done on a 2 kg body that starts from rest. The final speed of the body is:",
            optionA = "10 m/s",
            optionB = "14.1 m/s",
            optionC = "20 m/s",
            optionD = "28.3 m/s",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Work-energy theorem: W_net = ½mv² − ½mu². With u = 0:
                400 = ½ × 2 × v² = v².
                Step 2: v = √400 = 20 m/s.
                Trap: 14.1 m/s (option B) comes from dropping the ½ in ½mv², which gives v² = 200 instead of 400. Keep the equation symbolic until the final step.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_32",
            chapterId = "phys_ch_5",
            subject = "Physics",
            topic = "Potential Energy of a Spring",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "A spring of spring constant 100 N/m is stretched by 0.3 m from its natural length. The elastic potential energy stored in the spring is:",
            optionA = "3 J",
            optionB = "4.5 J",
            optionC = "9 J",
            optionD = "15 J",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Spring potential energy: U = ½kx², with x measured from the natural length.
                Step 2: U = ½ × 100 × (0.3)² = 50 × 0.09 = 4.5 J.
                Trap: 9 J (option C) forgets the ½ — the factor that comes from the force growing linearly from 0 to kx, so the average force is only kx/2. 15 J (option D) leaves x unsquared: ½ × 100 × 0.3.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_33",
            chapterId = "phys_ch_5",
            subject = "Physics",
            topic = "Power — P = Fv",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A car moves at a constant speed of 30 m/s while its engine delivers a power of 90 kW. The total resistive force opposing the motion is:",
            optionA = "300 N",
            optionB = "3000 N",
            optionC = "27,000 N",
            optionD = "30,000 N",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: At constant speed the driving force exactly balances the resistive force, and instantaneous power is P = Fv.
                Step 2: F = P / v = 90,000 W / 30 m/s = 3000 N.
                Trap: 300 N (option A) drops a factor of ten in the kilowatt conversion — always rewrite kW as watts before dividing. 27,000 N (option C) multiplies P by 0.3 instead of dividing by v.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_34",
            chapterId = "phys_ch_5",
            subject = "Physics",
            topic = "Perfectly Inelastic Collision",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 75,
            prompt = "A 3 kg body moving at 8 m/s collides with a stationary 1 kg body and the two stick together. Their common velocity after the collision is:",
            optionA = "2 m/s",
            optionB = "4 m/s",
            optionC = "6 m/s",
            optionD = "8 m/s",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Momentum is conserved in every collision: m₁u₁ + m₂u₂ = (m₁ + m₂) v.
                Step 2: v = (3 × 8 + 1 × 0) / (3 + 1) = 24 / 4 = 6 m/s.
                Audit: KE falls from ½ × 3 × 64 = 96 J to ½ × 4 × 36 = 72 J — 24 J (25%) is converted to heat and deformation, as it must be in a sticking collision.
                Trap: 8 m/s (option D) would need momentum to vanish into the target; 2 m/s (option A) divides the momentum by 12 kg instead of 4 kg. And never conserve KE here — sticking is the definition of perfectly inelastic.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_35",
            chapterId = "phys_ch_6",
            subject = "Physics",
            topic = "Centre of Mass — Two Particles",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "Masses of 2 kg and 3 kg are placed at x = 0 and x = 4 m respectively on a light rod. The centre of mass of the system lies at:",
            optionA = "1.6 m",
            optionB = "2.0 m",
            optionC = "2.4 m",
            optionD = "3.2 m",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: X_cm = (m₁x₁ + m₂x₂) / (m₁ + m₂).
                Step 2: X_cm = (2 × 0 + 3 × 4) / 5 = 12 / 5 = 2.4 m from the 2 kg mass.
                Trap: 1.6 m (option A) is the distance from the 3 kg mass — the COM always sits closer to the HEAVIER mass, dividing the separation in the inverse ratio of the masses.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_36",
            chapterId = "phys_ch_6",
            subject = "Physics",
            topic = "Centre of Mass — Semicircular Wire",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The centre of mass of a uniform semicircular wire of radius R lies on its axis of symmetry, at a distance from the centre of the full circle equal to:",
            optionA = "R/2",
            optionB = "4R/(3π)",
            optionC = "2R/π",
            optionD = "R/π",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: All the mass of the wire lies on the arc itself, at distance R from the centre; integrating y dm along the arc gives the standard result 2R/π.
                Step 2: 2R/π ≈ 0.64 R — noticeably more than half the radius, because none of the mass sits near the diameter.
                Trap: 4R/(3π) ≈ 0.42 R (option B) is the semicircular DISC (flat plate); R/2 (option A) is the hollow hemisphere. Wire, disc and shell are three different distributions — match the constant to the body.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_37",
            chapterId = "phys_ch_6",
            subject = "Physics",
            topic = "Moment of Inertia — Rod About Its End",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The moment of inertia of a uniform thin rod of mass M and length L, about an axis perpendicular to the rod through one end, is:",
            optionA = "ML²/12",
            optionB = "ML²/4",
            optionC = "ML²/3",
            optionD = "ML²/2",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Start from the centre value and shift the axis with the parallel axis theorem:
                I = I_cm + Md², with d = L/2.
                Step 2: I = ML²/12 + M(L/2)² = ML²/12 + ML²/4 = ML²/3.
                Trap: ML²/12 (option A) is the value about the CENTRE — the axis in the question is the end. Moment of inertia is meaningless until the axis is named.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_38",
            chapterId = "phys_ch_6",
            subject = "Physics",
            topic = "Conservation of Angular Momentum",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 75,
            prompt = "A disc of moment of inertia I rotates freely about its central axis with angular speed ω. An identical disc, initially at rest, is gently placed on top of it, and the two rotate together. The final angular speed is:",
            optionA = "ω",
            optionB = "ω/2",
            optionC = "2ω",
            optionD = "ω/4",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: No external torque acts about the axis, so angular momentum is conserved:
                L_initial = Iω; L_final = (I + I) ω' = 2Iω'.
                Step 2: Iω = 2Iω' gives ω' = ω/2.
                Trap: kinetic energy is NOT conserved here — friction between the discs does internal work and the rotational KE halves. Conserving KE instead of L is the standard wrong turn.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_39",
            chapterId = "phys_ch_6",
            subject = "Physics",
            topic = "Rolling Motion — Energy Split",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "A solid sphere rolls without slipping on a horizontal surface. The fraction of its total kinetic energy that is rotational equals:",
            optionA = "2/5",
            optionB = "2/7",
            optionC = "1/2",
            optionD = "5/7",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: For rolling without slipping, ω = v/R, and for a solid sphere I = (2/5)MR².
                KE_rot = ½ I ω² = ½ × (2/5)MR² × (v/R)² = (1/5)Mv².
                Step 2: KE_total = KE_trans + KE_rot = ½Mv² + (1/5)Mv² = (7/10)Mv².
                Fraction = (1/5) / (7/10) = 2/7.
                Trap: 2/5 (option A) is β = K²/R² itself, not the fraction of the total; the fraction is β/(1 + β). 5/7 (option D) is the TRANSLATIONAL fraction.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_40",
            chapterId = "phys_ch_7",
            subject = "Physics",
            topic = "Variation of g — Depth",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "Assuming Earth has uniform density, at what depth below Earth's surface (radius R) does the acceleration due to gravity become half its surface value?",
            optionA = "R/4",
            optionB = "R/2",
            optionC = "R",
            optionD = "3R/4",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Inside a uniform Earth, g at depth d is g_d = g (1 − d/R) — only the sphere below you still pulls.
                Step 2: Set g_d = g/2: 1 − d/R = 1/2, so d/R = 1/2 and d = R/2.
                Trap: Option A (R/4) comes from wrongly using the inverse-square height rule underground; below the surface the rule is linear, not inverse-square.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_41",
            chapterId = "phys_ch_7",
            subject = "Physics",
            topic = "Orbital Speed and Escape Speed",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The escape speed from Earth's surface is 11.2 km/s. The orbital speed of a satellite in a circular orbit grazing Earth's surface is approximately:",
            optionA = "11.2 km/s",
            optionB = "5.6 km/s",
            optionC = "7.9 km/s",
            optionD = "22.4 km/s",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: At the same radius, v_e = √(2GM/R) and v_o = √(GM/R), so v_o = v_e / √2.
                Step 2: v_o = 11.2 / 1.414 ≈ 7.9 km/s.
                Trap: 5.6 km/s (option B) is v_e/2 — the factor is √2, not 2. 11.2 km/s (option A) would let the satellite escape rather than orbit.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_42",
            chapterId = "phys_ch_7",
            subject = "Physics",
            topic = "Kepler's Third Law",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "Two satellites orbit Earth in circular orbits of radii R and 4R (measured from Earth's centre). The ratio of their orbital periods T(4R) : T(R) is:",
            optionA = "2 : 1",
            optionB = "4 : 1",
            optionC = "8 : 1",
            optionD = "16 : 1",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Kepler's third law: T ∝ r^(3/2) for orbits around the same body.
                Step 2: T(4R)/T(R) = (4R/R)^(3/2) = 4^(3/2) = (√4)³ = 8.
                Trap: 4 : 1 (option B) uses T ∝ r; 16 : 1 (option D) uses T ∝ r². The correct exponent is 3/2.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_43",
            chapterId = "phys_ch_7",
            subject = "Physics",
            topic = "Energy of an Orbiting Satellite",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A satellite of mass m is in a circular orbit of radius r around Earth (mass M). Its total mechanical energy is:",
            optionA = "−GMm/r",
            optionB = "−GMm/(2r)",
            optionC = "+GMm/(2r)",
            optionD = "−2GMm/r",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Potential energy PE = −GMm/r. With v_o² = GM/r, kinetic energy KE = (1/2) m v_o² = +GMm/(2r).
                Step 2: E = KE + PE = GMm/(2r) − GMm/r = −GMm/(2r).
                The negative sign certifies a bound orbit, and |E| = GMm/(2r) is the binding energy. Trap: option A is the potential energy alone; option C has the right magnitude but the impossible sign for a closed orbit.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_44",
            chapterId = "phys_ch_7",
            subject = "Physics",
            topic = "Gravitational Potential",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "Taking g = 10 m/s² and Earth's radius R = 6400 km, the gravitational potential at a height R above Earth's surface is:",
            optionA = "−6.4 × 10⁷ J/kg",
            optionB = "−3.2 × 10⁷ J/kg",
            optionC = "−1.6 × 10⁷ J/kg",
            optionD = "+3.2 × 10⁷ J/kg",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Potential at distance r from the centre is V = −GM/r. A height R above the surface means r = 2R.
                Step 2: V = −GM/(2R) = −gR/2 (using GM/R² = g, so GM/R = gR).
                Step 3: V = −(10 × 6.4 × 10⁶)/2 = −3.2 × 10⁷ J/kg.
                Trap: −6.4 × 10⁷ J/kg (option A) is the SURFACE potential — it uses r = R instead of r = 2R. Potential is always negative outside a mass; option D's sign alone disqualifies it.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_45",
            chapterId = "phys_ch_8",
            subject = "Physics",
            topic = "Young's Modulus — Force from Extension",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A steel wire of length 2 m and cross-sectional area 1 mm² is stretched by 1 mm. Taking Young's modulus of steel as 2 × 10¹¹ Pa, the stretching force is:",
            optionA = "50 N",
            optionB = "100 N",
            optionC = "200 N",
            optionD = "400 N",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: From Y = FL/(AΔL), solve for F:
                F = YAΔL/L.
                Step 2: F = (2 × 10¹¹)(1 × 10⁻⁶)(1 × 10⁻³)/(2) = 100 N.
                (Note the conversions: 1 mm² = 10⁻⁶ m² and 1 mm = 10⁻³ m.)
                Trap: 200 N (option C) comes from forgetting to divide by L = 2 m; 400 N (option D) usually follows from writing 1 mm² as 10⁻⁴ m² — area conversions are this chapter's top mark-killer.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_46",
            chapterId = "phys_ch_8",
            subject = "Physics",
            topic = "Moduli of Fluids",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 30,
            prompt = "Which of the following possesses ONLY a bulk modulus — no Young's modulus and no shear modulus?",
            optionA = "A steel rod",
            optionB = "A glass slab",
            optionC = "Water",
            optionD = "A rubber band",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Young's modulus needs a body to sustain a length under pull, and shear modulus needs it to sustain a tangential stress without flowing.
                Step 2: A liquid does neither — it flows — so its shear modulus is zero and Young's modulus is undefined. It only resists volume change: bulk modulus alone.
                Trap: rubber (option D) is a solid with all three moduli, even though its Young's modulus is tiny; "soft" does not mean "fluid".
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_47",
            chapterId = "phys_ch_8",
            subject = "Physics",
            topic = "Relation Between Y, G and Poisson's Ratio",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 45,
            prompt = "A material has Poisson's ratio 0.25. Its Young's modulus Y and shear modulus G are related by:",
            optionA = "Y = 2G",
            optionB = "Y = 2.25G",
            optionC = "Y = 2.5G",
            optionD = "Y = 3G",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: The relation for an isotropic solid is Y = 2G(1 + σ).
                Step 2: With σ = 0.25: Y = 2G(1.25) = 2.5G.
                Trap: Y = 3G (option D) would need σ = 0.5 (the rubber limit); Y = 2G (option A) would need σ = 0 (the cork limit). Each wrong option is a different Poisson value in disguise.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_48",
            chapterId = "phys_ch_8",
            subject = "Physics",
            topic = "Bulk Modulus — Volume Strain",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The pressure on a solid block is increased by 1.0 × 10⁸ Pa. If the bulk modulus of the material is 5 × 10¹⁰ Pa, the fractional change in its volume is:",
            optionA = "2 × 10⁻⁴",
            optionB = "2 × 10⁻³",
            optionC = "5 × 10⁻³",
            optionD = "2 × 10⁻²",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Bulk modulus B = ΔP/(ΔV/V), so the volume strain is:
                ΔV/V = ΔP/B.
                Step 2: ΔV/V = (1.0 × 10⁸)/(5 × 10¹⁰) = 2 × 10⁻³ (a decrease — the volume shrinks).
                Trap: 2 × 10⁻² (option D) slips a power of ten in the division; 5 × 10⁻³ (option C) comes from inverting the ratio B/ΔP and then forcing the size. Write the defining equation first, every time.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_49",
            chapterId = "phys_ch_8",
            subject = "Physics",
            topic = "Extension and Wire Diameter",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "Two wires A and B of the same material and the same length carry the same load. The diameter of A is twice the diameter of B. The ratio of their extensions ΔL_A : ΔL_B is:",
            optionA = "4 : 1",
            optionB = "2 : 1",
            optionC = "1 : 2",
            optionD = "1 : 4",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: Extension ΔL = FL/(AY). With F, L and Y identical, ΔL ∝ 1/A.
                Step 2: Doubling the diameter multiplies the area by 2² = 4, so wire A's area is 4 times B's.
                Step 3: Therefore ΔL_A = ΔL_B/4, and the ratio ΔL_A : ΔL_B = 1 : 4.
                Trap: 1 : 2 (option C) treats area as proportional to diameter; area follows the SQUARE of the diameter — the same squared lever that quarters the stress.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_phys_50",
            chapterId = "phys_ch_9",
            subject = "Physics",
            topic = "Hydrostatic Pressure — Gauge Pressure",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "A diver is 20 m below the surface of a lake (density of water 1000 kg/m³, g = 10 m/s²). The gauge pressure she experiences is:",
            optionA = "1.0 × 10⁵ Pa",
            optionB = "2.0 × 10⁵ Pa",
            optionC = "3.0 × 10⁵ Pa",
            optionD = "2.0 × 10⁴ Pa",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Gauge pressure is the liquid's own contribution only:
                P_gauge = ρgh.
                Step 2: P_gauge = 1000 × 10 × 20 = 2.0 × 10⁵ Pa.
                Trap: 3.0 × 10⁵ Pa (option C) is (approximately) the ABSOLUTE pressure — it adds the atmosphere's 1.0 × 10⁵ Pa, which a gauge deliberately excludes.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_51",
            chapterId = "phys_ch_9",
            subject = "Physics",
            topic = "Equation of Continuity",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "Water flows steadily through a pipe of cross-section 8 cm² at 3 m/s and enters a narrower section of cross-section 2 cm². The speed in the narrower section is:",
            optionA = "0.75 m/s",
            optionB = "6 m/s",
            optionC = "12 m/s",
            optionD = "24 m/s",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: For incompressible steady flow, the equation of continuity gives:
                A₁v₁ = A₂v₂.
                Step 2: v₂ = v₁ × A₁/A₂ = 3 × 8/2 = 12 m/s.
                Trap: 6 m/s (option B) comes from using the ratio of radii (2) instead of the ratio of areas (4) — speed follows AREA, so the ratio must be squared when diameters or radii are compared.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_52",
            chapterId = "phys_ch_9",
            subject = "Physics",
            topic = "Torricelli's Law — Speed of Efflux",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A large open tank has a small hole 5 m below the water surface. Taking g = 10 m/s², the speed of efflux of the jet is:",
            optionA = "5 m/s",
            optionB = "7.1 m/s",
            optionC = "10 m/s",
            optionD = "50 m/s",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: By Torricelli's law (Bernoulli applied between the surface and the hole):
                v = √(2gh).
                Step 2: v = √(2 × 10 × 5) = √100 = 10 m/s — the speed a freely falling body gains over 5 m.
                Trap: 7.1 m/s (option B) is √(gh), from dropping the factor 2. The depth h is measured from the FREE SURFACE, not from the ground.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_53",
            chapterId = "phys_ch_9",
            subject = "Physics",
            topic = "Stokes' Law — Terminal Velocity Scaling",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 60,
            prompt = "A small sphere falls through a viscous liquid with terminal velocity v. A second sphere of the same material but twice the radius falls through the same liquid. Its terminal velocity is:",
            optionA = "2v",
            optionB = "4v",
            optionC = "8v",
            optionD = "v",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Terminal velocity from Stokes' law:
                v_t = (2/9) × r²(ρ − σ)g/η, so at fixed densities and viscosity, v_t ∝ r².
                Step 2: Doubling r multiplies v_t by 2² = 4, giving 4v.
                Trap: 2v (option A) assumes a linear dependence on r; 8v (option C) wrongly uses the volume scaling r³. The square in r² is the whole question.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_54",
            chapterId = "phys_ch_9",
            subject = "Physics",
            topic = "Excess Pressure in a Soap Bubble",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A soap bubble of radius 2 cm is formed from a solution of surface tension 0.025 N/m. The excess pressure inside the bubble is:",
            optionA = "1.25 Pa",
            optionB = "2.5 Pa",
            optionC = "5 Pa",
            optionD = "10 Pa",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: A soap bubble has TWO surfaces (inner and outer), so:
                ΔP = 4S/R.
                Step 2: ΔP = 4 × 0.025 / 0.02 = 5 Pa.
                Trap: 2.5 Pa (option B) uses ΔP = 2S/R, the formula for a liquid DROP, which has only one surface. Count the surfaces before choosing the factor.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_phys_55",
            chapterId = "phys_ch_10",
            subject = "Physics",
            topic = "Temperature Scales — Celsius and Fahrenheit",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "At what temperature do the Celsius and Fahrenheit scales give the same reading?",
            optionA = "−40°",
            optionB = "0°",
            optionC = "40°",
            optionD = "−273°",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: The scales are related by F = (9/5)C + 32. Set the common reading equal to x:
                x = (9/5)x + 32.
                Step 2: Rearranging, x − (9/5)x = 32, so −(4/5)x = 32 and x = −40.
                Hence −40 °C = −40 °F — the only crossing point of the two scales.
                Trap: 0 (option B) is where Celsius puts the ice point, but Fahrenheit reads 32 there; −273 (option D) is a rounding of absolute zero, where Fahrenheit reads about −460, not the same number.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_56",
            chapterId = "phys_ch_10",
            subject = "Physics",
            topic = "Thermal Expansion — α, β, γ Relations",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 30,
            prompt = "For an isotropic solid whose coefficient of linear expansion is α, the coefficient of volume expansion γ is:",
            optionA = "2α",
            optionB = "3α",
            optionC = "α/3",
            optionD = "6α",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Volume is a product of three lengths, and each length grows by the factor (1 + αΔT):
                V' = V(1 + αΔT)³ ≈ V(1 + 3αΔT), dropping terms in (αΔT)² and higher.
                Step 2: Comparing with V' = V(1 + γΔT) gives γ = 3α.
                Trap: 2α (option A) is the AREA coefficient β — the coefficients simply count dimensions: α : β : γ = 1 : 2 : 3. The relation assumes an isotropic solid; for an anisotropic one, γ = α₁ + α₂ + α₃.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_57",
            chapterId = "phys_ch_10",
            subject = "Physics",
            topic = "Specific Heat Capacity",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "How much heat is required to raise the temperature of 2 kg of water from 20 °C to 70 °C? (c_water = 4200 J kg⁻¹ K⁻¹)",
            optionA = "210 kJ",
            optionB = "420 kJ",
            optionC = "840 kJ",
            optionD = "42 kJ",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: No change of state occurs, so Q = mcΔT with ΔT = 70 − 20 = 50 K (a difference — the same in kelvin and Celsius).
                Step 2: Q = 2 × 4200 × 50 = 420,000 J = 420 kJ.
                Trap: 840 kJ (option C) comes from using ΔT = 100, and 210 kJ (option A) from halving the mass or the interval. Anchor check: heating 1 kg of water by 50 K costs 210 kJ, so 2 kg must cost double.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_58",
            chapterId = "phys_ch_10",
            subject = "Physics",
            topic = "Latent Heat of Fusion",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "How much heat is required to melt 0.5 kg of ice at 0 °C completely into water at 0 °C? (L_f of ice = 3.35 × 10⁵ J/kg)",
            optionA = "3.35 × 10⁵ J",
            optionB = "1.68 × 10⁵ J",
            optionC = "6.70 × 10⁵ J",
            optionD = "8.40 × 10⁴ J",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Melting at constant temperature is paid for with latent heat alone: Q = mL_f. No mcΔT term appears because the temperature does not change.
                Step 2: Q = 0.5 × 3.35 × 10⁵ = 1.675 × 10⁵ J ≈ 1.68 × 10⁵ J.
                Trap: 3.35 × 10⁵ J (option A) is the price for a full kilogram, not 0.5 kg; adding a warming term (as in option C's doubling) is wrong here because the water is required at 0 °C itself.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_59",
            chapterId = "phys_ch_10",
            subject = "Physics",
            topic = "Newton's Law of Cooling",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 90,
            prompt = "A body cools from 70 °C to 50 °C in 10 minutes in a room at 30 °C. Using Newton's law of cooling (average form), its temperature after the next 10 minutes will be:",
            optionA = "45 °C",
            optionB = "35 °C",
            optionC = "40 °C",
            optionD = "30 °C",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Average form: (T₁ − T₂)/t = k[(T₁ + T₂)/2 − T_s]. First interval: (70 − 50)/10 = 2 = k[(70 + 50)/2 − 30] = 30k, so k = 1/15 per minute.
                Step 2: Second interval, unknown final temperature T: (50 − T)/10 = (1/15)[(50 + T)/2 − 30] = (1/15) × (T − 10)/2. Clearing fractions (multiply by 30): 3(50 − T) = T − 10, so 150 − 3T = T − 10 and 160 = 4T, giving T = 40 °C.
                Trap: another equal fall of 20 °C (option D, 30 °C) assumes linear cooling; Newton's law makes each successive fall smaller — here 20 °C, then only 10 °C — because the rate is proportional to the shrinking excess over the room.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_phys_60",
            chapterId = "phys_ch_11",
            subject = "Physics",
            topic = "First Law of Thermodynamics",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A gas absorbs 250 J of heat and expands, doing 100 J of work on its surroundings. Using ΔU = Q − W, the change in its internal energy is:",
            optionA = "350 J",
            optionB = "150 J",
            optionC = "−150 J",
            optionD = "250 J",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Fix the signs first. Heat absorbed BY the gas: Q = +250 J. Work done BY the gas: W = +100 J.
                Step 2: ΔU = Q − W = 250 − 100 = +150 J. The bank balance grew: 250 deposited, 100 withdrawn.
                Trap: 350 J (option A) comes from the chemistry convention ΔU = Q + W — in physics (NCERT), W is the work done BY the system and is subtracted. 250 J (option D) ignores the work entirely.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_61",
            chapterId = "phys_ch_11",
            subject = "Physics",
            topic = "Isothermal Work",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 90,
            prompt = "One mole of an ideal gas at 300 K expands isothermally from 5 L to 10 L. The work done by the gas is (take R = 8.3 J mol⁻¹ K⁻¹, ln 2 = 0.69):",
            optionA = "1.72 kJ",
            optionB = "0.86 kJ",
            optionC = "3.44 kJ",
            optionD = "Zero, because the temperature is constant",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: For an isothermal ideal-gas process, ΔU = 0 and W = nRT ln(V₂/V₁).
                Step 2: V₂/V₁ = 10/5 = 2, so W = 1 × 8.3 × 300 × 0.69 = 1718 J ≈ 1.72 kJ. (The gas absorbs the same 1.72 kJ as heat, since Q = W.)
                Trap: option D is the classic confusion — constant temperature means ΔU = 0, not W = 0. The gas pushes the piston out the whole way, and the reservoir repays the energy as heat.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_62",
            chapterId = "phys_ch_11",
            subject = "Physics",
            topic = "Adiabatic Process — Poisson Relation",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "A monatomic ideal gas (γ = 5/3) at 300 K is compressed adiabatically to one-eighth of its original volume. Its final temperature is:",
            optionA = "600 K",
            optionB = "900 K",
            optionC = "1200 K",
            optionD = "2400 K",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: For a reversible adiabatic, TV^(γ−1) = constant, so T₂ = T₁ × (V₁/V₂)^(γ−1).
                Step 2: V₁/V₂ = 8 and γ − 1 = 2/3, so T₂ = 300 × 8^(2/3) = 300 × 4 = 1200 K.
                Trap: 600 K (option A) uses the exponent 1/3 instead of 2/3 — for a monatomic gas γ − 1 = 2/3, not 1/3. Adiabatic compression always heats the gas, because the work done on it has nowhere to go except internal energy.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_63",
            chapterId = "phys_ch_11",
            subject = "Physics",
            topic = "Carnot Efficiency",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A Carnot engine operates between a source at 727 °C and a sink at 227 °C. Its efficiency is:",
            optionA = "50%",
            optionB = "68.8%",
            optionC = "31.2%",
            optionD = "25%",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Convert to kelvin BEFORE using the formula: T₁ = 727 + 273 = 1000 K, T₂ = 227 + 273 = 500 K.
                Step 2: η = 1 − T₂/T₁ = 1 − 500/1000 = 0.5 = 50%.
                Trap: 68.8% (option B) is what you get by feeding Celsius straight into the ratio (1 − 227/727). The Carnot formula is built on the absolute scale — this is the single most planted trap in the chapter.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_64",
            chapterId = "phys_ch_11",
            subject = "Physics",
            topic = "Heat Capacities and γ",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "For a diatomic ideal gas at room temperature (vibrational modes inactive), the ratio γ = Cp/Cv is:",
            optionA = "1.67",
            optionB = "1.40",
            optionC = "1.33",
            optionD = "1.20",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: A diatomic molecule at room temperature has f = 5 active degrees of freedom (3 translational + 2 rotational), so Cv = (f/2)R = 5R/2.
                Step 2: By Mayer's relation Cp = Cv + R = 7R/2, hence γ = Cp/Cv = 7/5 = 1.40.
                Trap: 1.67 (option A) is the MONATOMIC value (f = 3, γ = 5/3), and 1.33 (option C) belongs to a non-linear triatomic gas (f = 6, γ = 4/3). The ladder is γ = 1 + 2/f — more degrees of freedom, smaller γ.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_phys_65",
            chapterId = "phys_ch_12",
            subject = "Physics",
            topic = "Kinetic Theory — rms Speed",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The rms speed of helium molecules at 300 K is: (Molar mass of He = 4 g/mol, R = 8.314 J/mol K)",
            optionA = "484 m/s",
            optionB = "968 m/s",
            optionC = "1368 m/s",
            optionD = "1934 m/s",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: The rms speed is v_rms = √(3RT/M).
                Step 2: With T = 300 K and M = 0.004 kg/mol:
                v_rms = √(3 × 8.314 × 300 / 0.004) = √(1.87 × 10⁶) ≈ 1368 m/s.
                Trap: 1934 m/s (option D) is the rms speed of H₂ (M = 2 g/mol) at 300 K, and 484 m/s (option A) is that of O₂ (M = 32 g/mol). At fixed T, v_rms scales as 1/√M — always check which gas the molar mass belongs to.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_66",
            chapterId = "phys_ch_12",
            subject = "Physics",
            topic = "Degrees of Freedom",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "The number of degrees of freedom of a rigid diatomic molecule (such as N₂ at room temperature) is:",
            optionA = "3",
            optionB = "5",
            optionC = "6",
            optionD = "7",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: A diatomic molecule is a dumbbell. It has 3 translational degrees of freedom (motion along x, y, z).
                Step 2: It can also rotate about the two axes perpendicular to the bond — 2 rotational degrees of freedom. Rotation about the bond axis itself has negligible moment of inertia and does not count.
                Total: f = 3 + 2 = 5.
                Trap: 7 (option D) includes the vibrational mode, which is inactive at room temperature; 3 (option A) is the count for a monatomic gas.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_67",
            chapterId = "phys_ch_12",
            subject = "Physics",
            topic = "Specific Heats and Gamma",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "For a gas whose molar specific heat at constant volume is Cv = (7/2)R, the ratio γ = Cp/Cv is:",
            optionA = "1.29",
            optionB = "1.33",
            optionC = "1.40",
            optionD = "1.67",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Mayer's relation gives Cp = Cv + R = (7/2)R + R = (9/2)R.
                Step 2: γ = Cp/Cv = (9/2) / (7/2) = 9/7 ≈ 1.29.
                (Equivalently, Cv = (f/2)R means f = 7, and γ = 1 + 2/f = 1 + 2/7 = 9/7.)
                Trap: 1.40 (option C) belongs to a rigid diatomic gas with Cv = (5/2)R; 1.67 (option D) is the monatomic value. γ is fixed by f alone — rebuild it from f instead of recalling the wrong row of the table.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_68",
            chapterId = "phys_ch_12",
            subject = "Physics",
            topic = "Mean Free Path",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "At constant temperature, the pressure of a gas is doubled. The mean free path of its molecules will:",
            optionA = "double",
            optionB = "become half",
            optionC = "remain unchanged",
            optionD = "become 1/√2 times",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: λ = 1/(√2 π d² n), where n is the number of molecules per unit volume.
                Step 2: At constant temperature, doubling the pressure doubles n (since n = P/kT). With twice as many targets per unit volume, each molecule travels only half as far between collisions.
                So λ becomes half.
                Trap: λ depends on pressure through n — it is not a fixed property of the gas. Option D confuses the √2 already present in the formula with the effect of the pressure change.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_69",
            chapterId = "phys_ch_12",
            subject = "Physics",
            topic = "Kinetic Interpretation of Temperature",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The average translational kinetic energy of one mole of an ideal gas at 400 K is: (R = 8.314 J/mol K)",
            optionA = "3.3 kJ",
            optionB = "5.0 kJ",
            optionC = "8.3 kJ",
            optionD = "10.0 kJ",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Per molecule, the average translational KE is (3/2)kT. For one mole it is (3/2)RT — for EVERY ideal gas, whatever its molecules can additionally do (rotate, vibrate).
                Step 2: (3/2) × 8.314 × 400 = 4988 J ≈ 5.0 kJ.
                Trap: 8.3 kJ (option C) is (5/2)RT — the TOTAL internal energy of a rigid diatomic gas, rotation included. The question asks only for the translational part, which temperature measures directly; 3.3 kJ (option A) is just RT, dropping the 3/2 factor.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_phys_70",
            chapterId = "phys_ch_13",
            subject = "Physics",
            topic = "SHM — Reading the Equation",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "The displacement of a particle in SHM is x = 0.02 sin(5πt + π/6), with x in metres and t in seconds. The frequency of oscillation is:",
            optionA = "5 Hz",
            optionB = "2.5 Hz",
            optionC = "0.4 Hz",
            optionD = "5π Hz",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Compare with x = A sin(ωt + φ). The coefficient of t is ω = 5π rad/s.
                Step 2: ν = ω / 2π = 5π / 2π = 2.5 Hz. (The period is T = 1/ν = 0.4 s.)
                Trap: 5 Hz (option A) and 5π Hz (option D) both come from copying ω, or half of it, without dividing by 2π — the most common slip in this chapter. 0.4 Hz (option C) is 1/T computed wrongly: 0.4 s is the period, not the frequency.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_71",
            chapterId = "phys_ch_13",
            subject = "Physics",
            topic = "Spring–Mass Oscillator — Time Period",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A mass of 0.25 kg is attached to a spring of force constant 100 N/m and oscillates on a frictionless surface. The time period of oscillation is:",
            optionA = "3.18 s",
            optionB = "0.314 s",
            optionC = "0.0314 s",
            optionD = "31.4 s",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: For a spring–mass system, T = 2π√(m/k).
                Step 2: T = 2π√(0.25/100) = 2π√0.0025 = 2π × 0.05 = 0.314 s.
                Trap: 3.18 (option A) is the FREQUENCY ν = (1/2π)√(k/m) ≈ 3.18 Hz quoted with the wrong unit — period and frequency are reciprocals, not twins. 31.4 s (option D) comes from feeding the mass in grams (2500) without converting to kilograms. Sanity-check: a light mass on a stiff spring must oscillate FAST, i.e. with a small period.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_72",
            chapterId = "phys_ch_13",
            subject = "Physics",
            topic = "Simple Pendulum — Effect of g",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A simple pendulum has a period of 2 s on Earth. It is taken to a planet where the acceleration due to gravity is g/4. Its period on the planet is:",
            optionA = "1 s",
            optionB = "2 s",
            optionC = "4 s",
            optionD = "8 s",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: T = 2π√(l/g), so with l unchanged, T ∝ 1/√g.
                Step 2: g falls by a factor of 4, so T rises by √4 = 2: T' = 2 × 2 s = 4 s.
                Trap: 8 s (option D) treats T as proportional to 1/g instead of 1/√g; 1 s (option A) reverses the effect — weaker gravity means a lazier, slower pendulum.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_73",
            chapterId = "phys_ch_13",
            subject = "Physics",
            topic = "Energy in SHM — KE to PE Ratio",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A particle executes SHM of amplitude A. At a displacement of A/2 from the mean position, the ratio of its kinetic energy to its potential energy is:",
            optionA = "1 : 3",
            optionB = "3 : 1",
            optionC = "1 : 1",
            optionD = "√3 : 1",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: U = ½kx² and K = ½k(A² − x²). At x = A/2: U = ½k(A²/4) = E/4.
                Step 2: K = E − U = E − E/4 = 3E/4. Hence K : U = 3 : 1.
                Trap: 1 : 1 (option C) is the split at x = A/√2, not at A/2 — the energy shares depend on x², not on x, so halfway out in position is NOT halfway in energy. Option D is the ratio of SPEEDS-based quantities misapplied to energies.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_74",
            chapterId = "phys_ch_13",
            subject = "Physics",
            topic = "SHM — Maximum Velocity",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A particle executes SHM with amplitude 5 cm and time period 0.4 s. Its maximum velocity is:",
            optionA = "0.125 m/s",
            optionB = "0.393 m/s",
            optionC = "0.785 m/s",
            optionD = "1.57 m/s",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: v_max = Aω, with ω = 2π/T = 2π/0.4 = 5π ≈ 15.7 rad/s.
                Step 2: v_max = 0.05 m × 15.7 rad/s ≈ 0.785 m/s, attained at the mean position.
                Trap: 0.393 m/s (option B) uses ω = π/T, dropping the 2 from 2π/T. 1.57 m/s (option D) uses the peak-to-peak swing (10 cm) as the amplitude — amplitude is measured from the MEAN position to one extreme, not extreme to extreme. 0.125 m/s (option A) is just A/T, which is not a velocity formula at all.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_phys_75",
            chapterId = "phys_ch_14",
            subject = "Physics",
            topic = "Speed of a Wave on a Stretched String",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A stretched string has a linear mass density of 0.01 kg/m and is held under a tension of 100 N. The speed of transverse waves on the string is:",
            optionA = "50 m/s",
            optionB = "100 m/s",
            optionC = "200 m/s",
            optionD = "1000 m/s",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: For a stretched string, v = √(T/μ), where T is the tension and μ the mass per unit length.
                Step 2: v = √(100 / 0.01) = √10000 = 100 m/s.
                Trap: 1000 m/s (option D) comes from forgetting the square root after computing T/μ = 10000; 50 m/s (option A) comes from halving without any basis. Always finish the root.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_76",
            chapterId = "phys_ch_14",
            subject = "Physics",
            topic = "Progressive Wave — Speed from the Equation",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A progressive wave is described by y = 0.03 sin(400t − 2x), where y and x are in metres and t is in seconds. The speed of the wave is:",
            optionA = "100 m/s",
            optionB = "200 m/s",
            optionC = "400 m/s",
            optionD = "800 m/s",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Match with y = A sin(ωt − kx): the coefficient of t gives ω = 400 rad/s and the coefficient of x gives k = 2 rad/m.
                Step 2: The wave speed is v = ω/k = 400/2 = 200 m/s.
                (Check: λ = 2π/k = π ≈ 3.14 m and ν = ω/2π ≈ 63.7 Hz, so νλ ≈ 63.7 × 3.14 ≈ 200 m/s ✓.)
                Trap: 400 m/s (option C) is ω itself, not a speed; ω only becomes a speed after division by k.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_77",
            chapterId = "phys_ch_14",
            subject = "Physics",
            topic = "Standing Waves in a Closed Organ Pipe",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "An organ pipe closed at one end is 85 cm long. Taking the speed of sound in air as 340 m/s, its fundamental frequency is:",
            optionA = "50 Hz",
            optionB = "100 Hz",
            optionC = "200 Hz",
            optionD = "400 Hz",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: A closed pipe has a node at the closed end and an antinode at the open end, so its fundamental fits a quarter wavelength: L = λ/4, giving ν₁ = v/(4L).
                Step 2: ν₁ = 340 / (4 × 0.85) = 340 / 3.4 = 100 Hz.
                Trap: 200 Hz (option C) uses the OPEN-pipe formula v/(2L) — and it is also the "second harmonic", which a closed pipe cannot produce at all: only odd harmonics (100, 300, 500 Hz, …) exist here.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_78",
            chapterId = "phys_ch_14",
            subject = "Physics",
            topic = "Beats",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 45,
            prompt = "Two sound sources of frequencies 450 Hz and 454 Hz are sounded together. The number of beats heard per second is:",
            optionA = "2",
            optionB = "4",
            optionC = "8",
            optionD = "452",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: The beat frequency is the difference of the two frequencies: ν_beat = |ν₁ − ν₂|.
                Step 2: ν_beat = |454 − 450| = 4 beats per second.
                Trap: 452 (option D) is the AVERAGE (450 + 454)/2 — that is the pitch your ear perceives, not the rate at which it throbs. Difference throbs; average sings.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_79",
            chapterId = "phys_ch_14",
            subject = "Physics",
            topic = "Harmonics of a Stretched String",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "A stretched string of length 1.2 m, fixed at both ends, vibrates in its third harmonic. The wavelength of the standing wave is:",
            optionA = "0.4 m",
            optionB = "0.6 m",
            optionC = "0.8 m",
            optionD = "1.2 m",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: With nodes at both fixed ends, the string fits a whole number of half-wavelengths: L = nλ/2, so λ = 2L/n.
                Step 2: For the third harmonic, n = 3: λ = (2 × 1.2)/3 = 2.4/3 = 0.8 m.
                (Picture: three loops along the string, each loop λ/2 = 0.4 m long.)
                Trap: 1.2 m (option D) is λ for the SECOND harmonic (n = 2); 0.6 m (option B) is L/2, the loop-counting slip. The harmonic number counts the loops — divide 2L by it.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_phys_80",
            chapterId = "phys_ch_15",
            subject = "Physics",
            topic = "Coulomb's Law",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "Two point charges of +2 μC and +3 μC are placed 30 cm apart in air. The magnitude of the force between them is:",
            optionA = "0.06 N",
            optionB = "0.6 N",
            optionC = "6 N",
            optionD = "60 N",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Coulomb's law: F = kq₁q₂/r² with k = 9 × 10⁹, q₁q₂ = 2 × 10⁻⁶ × 3 × 10⁻⁶ = 6 × 10⁻¹², r = 0.30 m so r² = 0.09.
                Step 2: F = 9 × 10⁹ × 6 × 10⁻¹² / 0.09 = 5.4 × 10⁻² / 0.09 = 0.6 N. Both charges are positive, so the force is repulsive.
                Trap: every wrong option is a power-of-ten slip on r² — 6 N comes from using r² = 0.009 and 0.06 N from r² = 0.9. Square the distance in metres, carefully, before dividing.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_81",
            chapterId = "phys_ch_15",
            subject = "Physics",
            topic = "Quantisation of Charge",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 45,
            prompt = "Which of the following charges can NOT exist on an isolated body?",
            optionA = "3.2 × 10⁻¹⁹ C",
            optionB = "4.8 × 10⁻¹⁹ C",
            optionC = "2.4 × 10⁻¹⁹ C",
            optionD = "6.4 × 10⁻¹⁹ C",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Charge is quantised: Q = ne, where e = 1.6 × 10⁻¹⁹ C and n must be a whole number.
                Step 2: Divide each option by e: 3.2/1.6 = 2, 4.8/1.6 = 3, 2.4/1.6 = 1.5, 6.4/1.6 = 4. Only 2.4 × 10⁻¹⁹ C gives a non-integer (n = 1.5), so it can never be the net charge of a body.
                Trap: fractional charges like e/3 exist on quarks inside particles, but quarks are never isolated — a free body always carries an integer multiple of e.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_82",
            chapterId = "phys_ch_15",
            subject = "Physics",
            topic = "Dipole in a Uniform Field — Torque",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "An electric dipole of moment 4 × 10⁻⁹ C m is placed in a uniform electric field of 5 × 10⁴ N/C, with the dipole axis at 30° to the field. The torque acting on the dipole is:",
            optionA = "1.0 × 10⁻⁴ N m",
            optionB = "2.0 × 10⁻⁴ N m",
            optionC = "1.7 × 10⁻⁴ N m",
            optionD = "4.0 × 10⁻⁴ N m",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Torque on a dipole: τ = pE sinθ, with θ the angle between the dipole moment p and the field E.
                Step 2: τ = 4 × 10⁻⁹ × 5 × 10⁴ × sin30° = 2.0 × 10⁻⁴ × 0.5 = 1.0 × 10⁻⁴ N m. The torque acts to rotate p into alignment with E; the net force on the dipole in a uniform field is zero.
                Trap: 2.0 × 10⁻⁴ N m (option B) is pE — the MAXIMUM torque, at 90° — obtained by forgetting the sinθ factor; 1.7 × 10⁻⁴ (option C) uses sin60°, i.e. the angle measured from the perpendicular instead of from the field.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_83",
            chapterId = "phys_ch_15",
            subject = "Physics",
            topic = "Gauss's Law — Flux Through a Cube",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "A charge of 17.7 μC is placed at the centre of a cube. Taking ε₀ = 8.85 × 10⁻¹² in SI units, the electric flux through ONE face of the cube is:",
            optionA = "2.0 × 10⁶ N m²/C",
            optionB = "1.0 × 10⁶ N m²/C",
            optionC = "5.0 × 10⁵ N m²/C",
            optionD = "3.33 × 10⁵ N m²/C",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: By Gauss's law the TOTAL flux through the whole cube is q/ε₀ = 17.7 × 10⁻⁶ / 8.85 × 10⁻¹² = 2.0 × 10⁶ N m²/C, whatever the cube's size.
                Step 2: The charge sits at the centre, so by symmetry all six faces share the flux equally: flux through one face = 2.0 × 10⁶ / 6 = 3.33 × 10⁵ N m²/C.
                Trap: 2.0 × 10⁶ (option A) is the flux through the entire cube — the question asks for one face. Symmetry division by 6 is the whole second half of the problem; it works only because the charge is at the centre.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_84",
            chapterId = "phys_ch_15",
            subject = "Physics",
            topic = "Gauss's Law — Infinite Line Charge",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "An infinitely long straight wire carries a uniform charge density of 5 μC/m. The electric field at a distance of 0.5 m from the wire is:",
            optionA = "9.0 × 10⁴ N/C",
            optionB = "3.6 × 10⁵ N/C",
            optionC = "1.8 × 10⁵ N/C",
            optionD = "4.5 × 10⁴ N/C",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: For an infinite line charge, Gauss's law with a coaxial cylindrical surface gives E = λ/(2πε₀r) = 2kλ/r — the field falls as 1/r, not 1/r².
                Step 2: E = 2 × 9 × 10⁹ × 5 × 10⁻⁶ / 0.5 = 9.0 × 10⁴ / 0.5 = 1.8 × 10⁵ N/C, directed radially outward.
                Trap: 9.0 × 10⁴ N/C (option A) is kλ/r — the point-charge habit of a single k and no factor of 2. A line source keeps feeding the field along its whole length, which is exactly where the extra factor of 2 and the gentler 1/r fall-off come from.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_phys_85",
            chapterId = "phys_ch_16",
            subject = "Physics",
            topic = "Potential Due to a Point Charge",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The electrostatic potential at a distance of 0.2 m from an isolated point charge of +4 μC is:",
            optionA = "90 kV",
            optionB = "360 kV",
            optionC = "180 kV",
            optionD = "18 kV",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Potential due to a point charge: V = kQ/r, with k = 9 × 10⁹.
                Step 2: V = (9 × 10⁹ × 4 × 10⁻⁶) / 0.2 = 36000 / 0.2 = 1.8 × 10⁵ V = 180 kV.
                Trap: 360 kV (option B) forgets the division by r = 0.2 m is not a division by 0.1 m; 90 kV (option A) uses r = 0.4 m. Potential falls as 1/r, not 1/r² — that square belongs to the field.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_86",
            chapterId = "phys_ch_16",
            subject = "Physics",
            topic = "Potential Energy of a Charge Pair",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "Two point charges of +1 μC each are held 0.09 m apart in vacuum. The electrostatic potential energy of the system is:",
            optionA = "0.01 J",
            optionB = "0.1 J",
            optionC = "1 J",
            optionD = "0 J",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: For a pair of charges, U = kq₁q₂/r.
                Step 2: U = (9 × 10⁹ × 1 × 10⁻⁶ × 1 × 10⁻⁶) / 0.09 = (9 × 10⁻³) / 0.09 = 0.1 J.
                The sign is positive: like charges repel, so an external agent had to do +0.1 J of work to assemble this pair, and the system would release exactly that much if let go.
                Trap: 1 J (option C) comes from using kq₁q₂/r² — that is the force formula's denominator, not the energy's.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_87",
            chapterId = "phys_ch_16",
            subject = "Physics",
            topic = "Parallel Plate Capacitor",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 90,
            prompt = "A parallel plate capacitor has plates of area 200 cm² separated by 1 mm of air. Its capacitance is approximately:",
            optionA = "177 pF",
            optionB = "88.5 pF",
            optionC = "17.7 pF",
            optionD = "1.77 nF",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Convert first: A = 200 cm² = 200 × 10⁻⁴ m² = 2 × 10⁻² m²; d = 1 mm = 10⁻³ m.
                Step 2: C = ε₀A/d = (8.85 × 10⁻¹² × 2 × 10⁻²) / 10⁻³ = 8.85 × 10⁻¹² × 20 = 1.77 × 10⁻¹⁰ F = 177 pF.
                Trap: 1.77 nF (option D) is a factor-of-ten slip in the cm² conversion; 17.7 pF (option C) treats 200 cm² as 2 × 10⁻³ m². The unit conversion is where this question is won or lost.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_88",
            chapterId = "phys_ch_16",
            subject = "Physics",
            topic = "Sharing of Charge Between Capacitors",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "A 2 μF capacitor is charged to 90 V and then connected across an uncharged 4 μF capacitor (positive plate to positive plate), with no battery in the circuit. The common potential finally reached is:",
            optionA = "90 V",
            optionB = "60 V",
            optionC = "45 V",
            optionD = "30 V",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: Charge is conserved on the joined plates; energy is not. Initial charge: Q = C₁V₁ = 2 × 90 = 180 μC.
                Step 2: After connection the charge spreads over C₁ + C₂ = 6 μF, so V_common = Q/(C₁ + C₂) = 180/6 = 30 V.
                (Energy check: before, U = ½ × 2 × 10⁻⁶ × 90² = 8.1 mJ; after, U = ½ × 6 × 10⁻⁶ × 30² = 2.7 mJ — the missing 5.4 mJ left as heat and radiation in the wire.)
                Trap: 45 V (option C) conserves energy instead of charge; 60 V (option B) divides the charge in the wrong ratio.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_89",
            chapterId = "phys_ch_16",
            subject = "Physics",
            topic = "Electrostatics of Conductors",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A hollow conducting sphere carries a net charge and is in electrostatic equilibrium. Inside the hollow cavity (which contains no charge), the electric field E and the potential V are:",
            optionA = "E = 0 and V = 0",
            optionB = "E = 0 and V equals the potential of the sphere's surface",
            optionC = "E equals the surface field and V = 0",
            optionD = "E = 0 and V increases towards the centre",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: In electrostatic equilibrium the field inside the conducting material is zero, so no potential difference can exist between any two points of the conductor — the whole body, cavity included, sits at one single potential, the surface value V = kQ/R.
                Step 2: With no charge inside the cavity, shielding keeps E = 0 throughout the cavity as well (the Faraday cage effect).
                Trap: option A is the classic error — zero field means constant potential, not zero potential. V becomes zero inside only if the sphere is earthed.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_phys_90",
            chapterId = "phys_ch_17",
            subject = "Physics",
            topic = "Drift Velocity",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 90,
            prompt = "A copper wire of cross-sectional area 1 mm² carries a current of 2 A. The free-electron density in copper is 8 × 10²⁸ m⁻³. The drift velocity of the electrons is:",
            optionA = "1.6 × 10⁻² m/s",
            optionB = "1.6 × 10⁻⁴ m/s",
            optionC = "0.16 m/s",
            optionD = "3 × 10⁸ m/s",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: From I = neAv_d, the drift velocity is v_d = I / (neA).
                Step 2: A = 1 mm² = 1 × 10⁻⁶ m², so
                v_d = 2 / (8 × 10²⁸ × 1.6 × 10⁻¹⁹ × 1 × 10⁻⁶) = 2 / (1.28 × 10⁴) ≈ 1.6 × 10⁻⁴ m/s.
                Trap: 3 × 10⁸ m/s (option D) is the speed at which the electric FIELD spreads through the circuit, not the speed of the electrons. The carriers creep; the signal races.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_91",
            chapterId = "phys_ch_17",
            subject = "Physics",
            topic = "Cells — Internal Resistance",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A cell of EMF 2 V is connected across a 3 Ω resistor, and the terminal voltage is measured to be 1.5 V. The internal resistance of the cell is:",
            optionA = "0.5 Ω",
            optionB = "1 Ω",
            optionC = "1.5 Ω",
            optionD = "3 Ω",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: The current through the load is I = V / R = 1.5 / 3 = 0.5 A.
                Step 2: The lost volt inside the cell is E − V = 2 − 1.5 = 0.5 V, and it equals Ir:
                r = (E − V) / I = 0.5 / 0.5 = 1 Ω.
                Trap: the terminal voltage 1.5 V is NOT the EMF — the missing 0.5 V is dropped across the internal resistance. Option A comes from dividing the lost volt by the EMF instead of by the current.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_92",
            chapterId = "phys_ch_17",
            subject = "Physics",
            topic = "Wheatstone Bridge",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A Wheatstone bridge is balanced with arms P = 10 Ω, Q = 20 Ω and R = 30 Ω in the three known positions. The unknown arm S is:",
            optionA = "15 Ω",
            optionB = "30 Ω",
            optionC = "60 Ω",
            optionD = "90 Ω",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: At balance the galvanometer carries no current and P / Q = R / S.
                Step 2: S = R × Q / P = 30 × 20 / 10 = 60 Ω.
                Check by ratio: P / Q = 1/2 and R / S = 30 / 60 = 1/2 ✓.
                Trap: 15 Ω (option A) is R × P / Q — the inverted ratio. Always write the balance condition with the arms in their diamond positions before substituting.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_93",
            chapterId = "phys_ch_17",
            subject = "Physics",
            topic = "Potentiometer — EMF Comparison",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "On a potentiometer, a standard cell of EMF 1.5 V balances at 60 cm. An unknown cell balances at 40 cm on the same wire. The EMF of the unknown cell is:",
            optionA = "2.25 V",
            optionB = "1.5 V",
            optionC = "1.0 V",
            optionD = "0.67 V",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: On the same wire the potential gradient k is unchanged, and EMF is proportional to balance length: E_unknown / E_standard = l_unknown / l_standard.
                Step 2: E_unknown = 1.5 × 40 / 60 = 1.0 V.
                Trap: 2.25 V (option A) inverts the ratio. The unknown balances at a SHORTER length, so its EMF must be SMALLER than 1.5 V — a one-second direction check eliminates half the options.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_94",
            chapterId = "phys_ch_17",
            subject = "Physics",
            topic = "Electric Power — Bulbs in Series",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 120,
            prompt = "A bulb rated 100 W at 220 V and a bulb rated 60 W at 220 V are connected in series across a 220 V supply. The total power dissipated is (treat filament resistances as constant at their rated values):",
            optionA = "160 W",
            optionB = "37.5 W",
            optionC = "60 W",
            optionD = "100 W",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Ratings fix the resistances: R₁ = 220² / 100 = 484 Ω and R₂ = 220² / 60 ≈ 807 Ω.
                Step 2: In series the resistances add: R_total ≈ 1291 Ω, so
                P_total = V² / R_total = 220² / 1291 = 37.5 W.
                (Shortcut: in series across the rated voltage, 1/P_total = 1/P₁ + 1/P₂ = 1/100 + 1/60, giving P_total = 37.5 W.)
                Side result: the 60 W bulb has the larger resistance, so in series it takes the larger share — about 23.4 W against the 100 W bulb's 14.1 W — and glows brighter.
                Trap: 160 W (option A) adds the ratings as if the bulbs were in parallel at full voltage. In series, neither bulb sees 220 V, so neither can deliver its rating.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_phys_95",
            chapterId = "phys_ch_18",
            subject = "Physics",
            topic = "Circular Motion in a Magnetic Field — Radius",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "An electron moves at 3.0 × 10^6 m/s perpendicular to a uniform magnetic field of 0.20 T. The radius of its circular path is approximately:",
            optionA = "0.085 mm",
            optionB = "0.17 mm",
            optionC = "8.5 mm",
            optionD = "0.0085 mm",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: The magnetic force supplies the centripetal force, qvB = mv²/r, so r = mv/(qB).
                Step 2: r = (9.11 × 10^-31 × 3.0 × 10^6) / (1.6 × 10^-19 × 0.20) = 2.73 × 10^-24 / 3.2 × 10^-20 = 8.5 × 10^-5 m = 0.085 mm.
                Trap: 0.17 mm (option B) is the diameter, not the radius; 8.5 mm (option C) comes from a powers-of-ten slip in converting metres to millimetres.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_96",
            chapterId = "phys_ch_18",
            subject = "Physics",
            topic = "Cyclotron Frequency",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A cyclotron accelerates protons in a magnetic field of 1.2 T. The frequency of the alternating supply it requires is approximately:",
            optionA = "9.2 MHz",
            optionB = "18.3 MHz",
            optionC = "36.6 MHz",
            optionD = "1.83 MHz",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: The oscillator must match the revolution frequency of the particle: ν = qB/(2πm).
                Step 2: ν = (1.6 × 10^-19 × 1.2) / (2π × 1.67 × 10^-27) = 1.92 × 10^-19 / 1.05 × 10^-26 ≈ 1.83 × 10^7 Hz = 18.3 MHz.
                Trap: the frequency does not depend on the dee radius or the particle's energy — only on q, B and m. 36.6 MHz (option C) drops the 2π; 9.2 MHz (option A) doubles the mass by mistake.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_97",
            chapterId = "phys_ch_18",
            subject = "Physics",
            topic = "Field at the Centre of a Circular Loop",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A single circular loop of radius 5 cm carries a current of 4 A. The magnetic field at its centre is approximately:",
            optionA = "2.5 × 10^-5 T",
            optionB = "1.0 × 10^-4 T",
            optionC = "5.0 × 10^-5 T",
            optionD = "5.0 × 10^-4 T",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: At the centre of a loop, B = μ0NI/(2R), with N = 1 here.
                Step 2: B = (4π × 10^-7 × 1 × 4) / (2 × 0.05) = 5.03 × 10^-6 / 0.10 ≈ 5.0 × 10^-5 T, directed along the axis.
                Trap: 1.0 × 10^-4 T (option B) results from putting the diameter's place value wrong or using R = 2.5 cm; the radius is 0.05 m. 2.5 × 10^-5 T (option A) is the value at an axial point one radius away, not at the centre.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_98",
            chapterId = "phys_ch_18",
            subject = "Physics",
            topic = "Field Inside a Solenoid",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A long solenoid has 2000 turns per metre and carries a current of 3 A. The magnetic field inside it is approximately:",
            optionA = "7.5 × 10^-3 T",
            optionB = "3.8 × 10^-3 T",
            optionC = "7.5 × 10^-4 T",
            optionD = "1.5 × 10^-2 T",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Inside a long solenoid the field is uniform: B = μ0nI, where n is turns per unit length.
                Step 2: B = 4π × 10^-7 × 2000 × 3 = 7.54 × 10^-3 T ≈ 7.5 × 10^-3 T.
                Trap: 3.8 × 10^-3 T (option B) is the field at the END FACE of the solenoid (exactly half), not in the interior. The total number of turns is irrelevant — only turns per metre enter.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_99",
            chapterId = "phys_ch_18",
            subject = "Physics",
            topic = "Galvanometer Conversion — Shunt for an Ammeter",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "A galvanometer has resistance 50 Ω and gives full-scale deflection for a current of 2 mA. To convert it into an ammeter of range 10 A, the shunt resistance required is approximately:",
            optionA = "0.10 Ω",
            optionB = "0.50 Ω",
            optionC = "0.050 Ω",
            optionD = "0.010 Ω",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: The shunt S is connected in PARALLEL with the galvanometer so that only Ig = 2 mA enters the coil at full scale: S = Ig × G / (I − Ig).
                Step 2: S = (0.002 × 50) / (10 − 0.002) = 0.10 / 9.998 ≈ 0.0100 Ω.
                Trap: 0.10 Ω (option A) is the numerator alone (Ig × G) without dividing by the bypassed current. Sanity check: a shunt must be FAR smaller than the galvanometer resistance — only option D satisfies that decisively.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_phys_100",
            chapterId = "phys_ch_19",
            subject = "Physics",
            topic = "Bar Magnet — Axial Field",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A short bar magnet has magnetic dipole moment 2.5 A m². The magnitude of the magnetic field at a point on its axis, 0.10 m from the centre of the magnet, is:",
            optionA = "2.5 × 10^-4 T",
            optionB = "5.0 × 10^-4 T",
            optionC = "1.0 × 10^-3 T",
            optionD = "1.25 × 10^-4 T",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: On the axis of a short magnet, B = (μ0/4π) × 2M/r³, with μ0/4π = 10^-7 and r measured from the centre.
                Step 2: r³ = (0.10)³ = 10^-3 m³, so B = 10^-7 × 2 × 2.5/10^-3 = 10^-7 × 5000 = 5.0 × 10^-4 T, directed along M.
                Trap: 2.5 × 10^-4 T (option A) is the EQUATORIAL value at the same distance — exactly half, with no factor 2. The axis always wins by a factor of two.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_101",
            chapterId = "phys_ch_19",
            subject = "Physics",
            topic = "Dipole Energy — Work of Rotation",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A magnetic dipole of moment 1.5 A m² is held in a uniform field of 0.6 T. The work done in rotating it slowly from stable equilibrium (θ = 0°) to θ = 90° is:",
            optionA = "0.45 J",
            optionB = "0.9 J",
            optionC = "1.8 J",
            optionD = "0 J",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Work against the field's torque: W = MB(cosθ1 − cosθ2), with U = −MB cosθ.
                Step 2: MB = 1.5 × 0.6 = 0.9 J, so W = 0.9 × (cos0° − cos90°) = 0.9 × (1 − 0) = 0.9 J.
                Trap: 1.8 J (option C) is the work for the FULL flip 0° to 180° (a climb of 2MB). Zero (option D) confuses the zero torque at θ = 0 with zero energy change — the dipole still has to be dragged uphill in U.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_102",
            chapterId = "phys_ch_19",
            subject = "Physics",
            topic = "Earth's Magnetism — Dip and Components",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "At a place, the horizontal component of the Earth's magnetic field is 4.33 × 10^-5 T and the angle of dip is 30°. The magnitude of the Earth's total field at that place is:",
            optionA = "2.5 × 10^-5 T",
            optionB = "4.33 × 10^-5 T",
            optionC = "5.0 × 10^-5 T",
            optionD = "8.66 × 10^-5 T",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: The components form a right triangle: B_H = B_E cosδ, so B_E = B_H/cosδ.
                Step 2: B_E = 4.33 × 10^-5/cos30° = 4.33 × 10^-5/0.866 = 5.0 × 10^-5 T.
                Trap: 2.5 × 10^-5 T (option A) is the VERTICAL component B_V = B_H tan30°, and 4.33 × 10^-5 T (option B) is just B_H itself — the total field is always larger than either component.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_103",
            chapterId = "phys_ch_19",
            subject = "Physics",
            topic = "Magnetisation — Field Inside a Core",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "A long solenoid has 500 turns per metre and carries a current of 4 A. Its core is a material of susceptibility χ = 499. The magnetic field inside the core is approximately:",
            optionA = "2.5 × 10^-3 T",
            optionB = "0.25 T",
            optionC = "1.26 T",
            optionD = "6.28 T",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: The free currents fix H = nI = 500 × 4 = 2000 A/m, independent of the core.
                Step 2: μ_r = 1 + χ = 500, so B = μ0 μ_r H = 4π × 10^-7 × 500 × 2000 = 0.4π ≈ 1.26 T.
                Trap: 2.5 × 10^-3 T (option A) is μ0H — the field the same current would produce in vacuum. With a χ = 499 core, the material supplies 500 of the 501 parts of B; forgetting the core loses nearly everything.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_104",
            chapterId = "phys_ch_19",
            subject = "Physics",
            topic = "Ferromagnetism — Curie Temperature",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 45,
            prompt = "A ferromagnetic material is heated to a temperature above its Curie temperature. Above this temperature, the material behaves as:",
            optionA = "a permanent magnet that can never be magnetised again, even after cooling",
            optionB = "a paramagnetic material",
            optionC = "a diamagnetic material",
            optionD = "a material with negative magnetic susceptibility",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Above the Curie temperature, thermal agitation destroys the parallel alignment of moments inside domains — the cooperative ferromagnetic order collapses.
                Step 2: The material then responds like a paramagnet, with susceptibility following the Curie–Weiss law χ = C/(T − T_C). Cooled below T_C, the domains reform and ferromagnetism returns.
                Trap: option A is the permanence myth — nothing is destroyed forever. Options C and D describe diamagnetism (χ < 0), which a heated ferromagnet never becomes.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_phys_105",
            chapterId = "phys_ch_20",
            subject = "Physics",
            topic = "Faraday's Law — Induced EMF",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A coil of 500 turns has the flux through each turn changing from 1.2 mWb to 0.4 mWb in 0.1 s. The magnitude of the induced EMF is:",
            optionA = "0.4 V",
            optionB = "40 V",
            optionC = "4 V",
            optionD = "0.04 V",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Faraday's law uses the flux change per turn:
                ΔΦ = 1.2 − 0.4 = 0.8 mWb = 8 × 10^-4 Wb, so ΔΦ/Δt = 8 × 10^-4 / 0.1 = 8 × 10^-3 Wb/s.
                Step 2: ε = N ΔΦ/Δt = 500 × 8 × 10^-3 = 4 V.
                Trap: 0.4 V (option A) comes from the mWb-to-Wb conversion slip; 40 V (option B) from misplacing the time division. The turns multiply the per-turn rate exactly once.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_106",
            chapterId = "phys_ch_20",
            subject = "Physics",
            topic = "Motional EMF",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A metal rod of length 0.8 m moves at 6 m/s perpendicular to a uniform magnetic field of 0.5 T, the rod being perpendicular to both the field and its velocity. The EMF induced between its ends is:",
            optionA = "2.4 V",
            optionB = "1.2 V",
            optionC = "4.8 V",
            optionD = "0.24 V",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: With v, B and l mutually perpendicular, the motional EMF is:
                ε = Bvl.
                Step 2: ε = 0.5 × 6 × 0.8 = 2.4 V.
                Trap: 4.8 V (option C) doubles the answer by silently using a length of 1.6 m; 0.24 V (option D) is a decimal slip. Check the geometry clause first — if any pair were not perpendicular, a sine factor would enter.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_107",
            chapterId = "phys_ch_20",
            subject = "Physics",
            topic = "Self-Inductance of a Solenoid",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 90,
            prompt = "A long air-cored solenoid of length 0.4 m has 400 turns and a cross-sectional area of 5 × 10^-4 m². Its self-inductance is approximately:",
            optionA = "0.025 mH",
            optionB = "0.25 mH",
            optionC = "2.5 mH",
            optionD = "25 mH",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Turns per unit length: n = 400/0.4 = 1000 turns/m.
                Step 2: L = μ0 n² A l = 4π × 10^-7 × (1000)² × 5 × 10^-4 × 0.4.
                = 1.2566 × 5 × 10^-4 × 0.4 = 2.5 × 10^-4 H ≈ 0.25 mH.
                Trap: feeding the total turns N = 400 into the n² slot, or forgetting the square on n, shifts the answer by orders of magnitude — the options are spaced by factors of ten to catch exactly that.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_108",
            chapterId = "phys_ch_20",
            subject = "Physics",
            topic = "AC Generator — Peak EMF",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 90,
            prompt = "A generator coil of 200 turns and area 0.01 m² rotates at 60 revolutions per second in a magnetic field of 0.5 T. The peak value of the induced EMF is approximately:",
            optionA = "37.7 V",
            optionB = "188.5 V",
            optionC = "377 V",
            optionD = "754 V",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Angular speed: ω = 2π × 60 = 377 rad/s.
                Step 2: Peak EMF: ε0 = NBAω = 200 × 0.5 × 0.01 × 377 = 1 × 377 = 377 V.
                Trap: 37.7 V (option A) comes from feeding the frequency 60 Hz in place of ω, losing the 2π and more; 754 V (option D) doubles by confusing peak with peak-to-peak. Revolutions per second must become rad/s before entering NBAω.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_109",
            chapterId = "phys_ch_20",
            subject = "Physics",
            topic = "Lenz's Law — Direction of Induced Current",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The north pole of a bar magnet is pushed towards a conducting coil. Viewed from the magnet's side, the induced current in the coil flows:",
            optionA = "Clockwise, so that the near face becomes a south pole",
            optionB = "Anticlockwise, so that the near face becomes a north pole",
            optionC = "Clockwise, so that the near face becomes a north pole",
            optionD = "Anticlockwise, so that the near face becomes a south pole",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: The approaching north pole makes the flux through the coil increase; Lenz's law demands opposition, so the coil repels the magnet — its near face must become a NORTH pole.
                Step 2: A face behaves as north when the current circulates anticlockwise as seen by the observer looking at that face (here, the viewer on the magnet's side).
                Hence anticlockwise current with a north near face: option B.
                Trap: options A and D both describe a south near face, which would ATTRACT the incoming magnet and assist the change — the perpetual-motion direction Lenz's law forbids.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_phys_110",
            chapterId = "phys_ch_21",
            subject = "Physics",
            topic = "RMS Value of AC Voltage",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "An AC voltage is given by V = 311 sin(100πt) volts. Its rms value is:",
            optionA = "311 V",
            optionB = "220 V",
            optionC = "155.5 V",
            optionD = "440 V",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: From the equation, the peak value is V₀ = 311 V.
                Step 2: The rms value is the peak divided by √2:
                V_rms = 311 / 1.414 ≈ 220 V.
                (This is exactly the familiar mains pair: 220 V rms corresponds to a 311 V peak.)
                Trap: 311 V (option A) is the peak, not the rms; 155.5 V (option C) wrongly divides by 2. Whenever a value is quoted for an AC supply, it is the rms value unless stated otherwise.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_111",
            chapterId = "phys_ch_21",
            subject = "Physics",
            topic = "Inductive Reactance",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A pure inductor of 0.5 H has an inductive reactance of 157 Ω when connected to a 50 Hz AC source. If the source frequency is raised to 100 Hz, the reactance becomes:",
            optionA = "78.5 Ω",
            optionB = "157 Ω",
            optionC = "314 Ω",
            optionD = "628 Ω",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Inductive reactance is directly proportional to frequency:
                X_L = 2πνL.
                Step 2: Doubling ν from 50 Hz to 100 Hz doubles X_L:
                X_L = 2 × 157 = 314 Ω.
                (Direct check: 2π × 100 × 0.5 = 314 Ω.)
                Trap: 78.5 Ω (option A) is the CAPACITIVE behaviour — reactance falling with frequency. The inductor fights faster changes harder, so its reactance rises.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_112",
            chapterId = "phys_ch_21",
            subject = "Physics",
            topic = "Resonance in a Series LCR Circuit",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 90,
            prompt = "A series LCR circuit contains an inductor of 0.5 H and a capacitor of 2 μF. The resonant frequency of the circuit is:",
            optionA = "15.9 Hz",
            optionB = "1590 Hz",
            optionC = "159 Hz",
            optionD = "50 Hz",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: At resonance X_L = X_C, which gives:
                ν₀ = 1 / (2π√(LC)).
                Step 2: LC = 0.5 × 2 × 10⁻⁶ = 10⁻⁶, so √(LC) = 10⁻³ s:
                ν₀ = 1 / (2π × 10⁻³) ≈ 159 Hz.
                Note that the resistance does not enter the formula at all — it controls the sharpness and height of the resonance peak, never its position.
                Trap: 15.9 Hz and 1590 Hz (options A and B) are power-of-ten slips from mishandling the micro in 2 μF; 50 Hz (option D) is the mains frequency, planted for guessers.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_113",
            chapterId = "phys_ch_21",
            subject = "Physics",
            topic = "Average Power and Power Factor",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A series LCR circuit draws an rms current of 4 A from a 200 V rms AC source. If the power factor of the circuit is 0.6, the average power consumed is:",
            optionA = "800 W",
            optionB = "480 W",
            optionC = "320 W",
            optionD = "960 W",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Average power in an AC circuit always carries the power factor:
                P = V_rms × I_rms × cos φ.
                Step 2: P = 200 × 4 × 0.6 = 480 W.
                (Only the resistor consumes this; equivalently P = I²R with cos φ = R/Z.)
                Trap: 800 W (option A) is the apparent power VI with the power factor forgotten — the single most common error in this chapter. The remaining current component is wattless and consumes nothing.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_114",
            chapterId = "phys_ch_21",
            subject = "Physics",
            topic = "Transformer — Turns Ratio",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A step-up transformer raises the voltage from 220 V to 11,000 V. If its primary coil has 500 turns, the number of turns in the secondary coil is:",
            optionA = "250 turns",
            optionB = "2500 turns",
            optionC = "25,000 turns",
            optionD = "10,000 turns",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: For a transformer the turns ratio equals the voltage ratio:
                N_s / N_p = V_s / V_p.
                Step 2: N_s = 500 × (11,000 / 220) = 500 × 50 = 25,000 turns.
                The voltage rises 50 times, so the secondary current falls 50 times — power is conserved, never created.
                Trap: 2500 turns (option B) comes from using a ratio of 5 instead of 50; always compute V_s/V_p explicitly before multiplying.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_phys_115",
            chapterId = "phys_ch_22",
            subject = "Physics",
            topic = "Displacement Current",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 75,
            prompt = "The electric field between the plates of a parallel-plate capacitor changes at the rate of 3.0 × 10^12 V/m per second. If the area of each plate is 0.020 m², the displacement current between the plates is:",
            optionA = "0.27 A",
            optionB = "0.53 A",
            optionC = "1.06 A",
            optionD = "5.3 A",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: The displacement current is I_d = ε₀ dΦ_E/dt, and for a uniform field between the plates Φ_E = EA, so I_d = ε₀A(dE/dt).
                Step 2: I_d = 8.85 × 10^-12 × 0.020 × 3.0 × 10^12 = 8.85 × 10^-12 × 6.0 × 10^10 = 0.53 A.
                Trap: 5.3 A (option D) is a powers-of-ten slip; 0.27 A (option A) comes from halving the plate area for no reason. Note that no charge crosses the gap — this current is the changing field itself, and it exactly equals the conduction current in the leads.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_116",
            chapterId = "phys_ch_22",
            subject = "Physics",
            topic = "Relation Between E₀ and B₀",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "In an electromagnetic wave travelling in vacuum, the amplitude of the magnetic field is B₀ = 1.0 × 10^-6 T. The amplitude of the electric field is:",
            optionA = "30 V/m",
            optionB = "3.0 V/m",
            optionC = "300 V/m",
            optionD = "3000 V/m",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: In an EM wave the field amplitudes are locked by E₀ = cB₀, with c = 3.0 × 10^8 m/s.
                Step 2: E₀ = 3.0 × 10^8 × 1.0 × 10^-6 = 300 V/m.
                Trap: Because c is huge, B₀ is always the numerically tiny partner. If you divide instead of multiplying (E₀ = B₀/c) you get an absurd 3.3 × 10^-15 V/m — a useful self-check that the ratio has been inverted.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_117",
            chapterId = "phys_ch_22",
            subject = "Physics",
            topic = "Speed of EM Waves in a Medium",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "An electromagnetic wave enters a non-magnetic medium with relative permittivity ε_r = 4 (and μ_r = 1). The speed of the wave in the medium is:",
            optionA = "3.0 × 10^8 m/s",
            optionB = "1.5 × 10^8 m/s",
            optionC = "7.5 × 10^7 m/s",
            optionD = "6.0 × 10^8 m/s",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: In a medium, v = 1/√(με) = c/√(ε_r μ_r).
                Step 2: v = 3.0 × 10^8 / √(4 × 1) = 3.0 × 10^8 / 2 = 1.5 × 10^8 m/s. (Equivalently, the refractive index is n = √ε_r = 2.)
                Trap: 7.5 × 10^7 m/s (option C) comes from dividing by ε_r = 4 instead of by √ε_r = 2; 3.0 × 10^8 m/s (option A) is the vacuum speed, unchanged only if the medium were absent. The frequency, fixed by the source, does not change — the wavelength halves instead.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_118",
            chapterId = "phys_ch_22",
            subject = "Physics",
            topic = "Electromagnetic Spectrum — Applications",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "Satellite communication and radar use microwaves rather than long radio waves mainly because microwaves:",
            optionA = "are reflected strongly by the ionosphere",
            optionB = "pass through the ionosphere and travel in nearly straight lines",
            optionC = "have the longest wavelengths in the spectrum",
            optionD = "travel faster than other electromagnetic waves in vacuum",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: A satellite link needs the signal to LEAVE the atmosphere, so the wave must cross the ionosphere instead of bouncing off it. Long radio waves are reflected by the ionosphere (that is how AM broadcasts travel beyond the horizon), which makes them useless for reaching a satellite.
                Step 2: Microwaves penetrate the ionosphere and, having centimetre wavelengths, can be beamed in nearly straight lines between a dish and a satellite — and radar uses the echo delay of the same waves to measure distances.
                Trap: Option A states the exact opposite of the truth; option D is impossible because every EM wave travels at the same c in vacuum.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_119",
            chapterId = "phys_ch_22",
            subject = "Physics",
            topic = "Energy Density of an EM Wave",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "An electromagnetic wave has an average intensity of 680 W/m². The average energy density of the wave is:",
            optionA = "4.5 × 10^-6 J/m³",
            optionB = "2.27 × 10^-6 J/m³",
            optionC = "2.04 × 10^11 J/m³",
            optionD = "7.6 × 10^-7 J/m³",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Intensity is energy density delivered at speed c: I = u_avg × c, so u_avg = I/c.
                Step 2: u_avg = 680 / (3.0 × 10^8) = 2.27 × 10^-6 J/m³.
                Trap: 2.04 × 10^11 J/m³ (option C) comes from multiplying by c instead of dividing — an energy density larger than petrol's, from a light beam, should trigger alarm bells. Option A (4.5 × 10^-6) smuggles in the factor 2 that belongs only to radiation pressure on a reflector, not to energy density.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_phys_120",
            chapterId = "phys_ch_23",
            subject = "Physics",
            topic = "Mirror Equation — Concave Mirror",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "An object is placed 18 cm in front of a concave mirror of focal length 12 cm. The image forms at:",
            optionA = "36 cm behind the mirror",
            optionB = "36 cm in front of the mirror",
            optionC = "7.2 cm in front of the mirror",
            optionD = "7.2 cm behind the mirror",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Use the Cartesian sign convention: f = −12 cm, u = −18 cm.
                Step 2: Mirror equation: 1/v = 1/f − 1/u = −1/12 + 1/18 = (−3 + 2)/36 = −1/36, so v = −36 cm.
                The negative sign places the image 36 cm in FRONT of the mirror — a real image (object between F and C gives an image beyond C, magnified, m = −2).
                Trap: 36 cm behind the mirror (option A) comes from taking f positive, i.e. importing lens-style signs into a mirror problem.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_121",
            chapterId = "phys_ch_23",
            subject = "Physics",
            topic = "Total Internal Reflection — Critical Angle",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 45,
            prompt = "A ray of light travelling inside a medium of refractive index √2 strikes its boundary with air. The critical angle for this boundary is:",
            optionA = "45°",
            optionB = "30°",
            optionC = "60°",
            optionD = "90°",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: For a denser-to-air boundary, sin i_c = 1/μ.
                Step 2: sin i_c = 1/√2, so i_c = 45°.
                Any ray inside the medium hitting the surface at more than 45° from the normal undergoes total internal reflection; below 45° it refracts out.
                Trap: the ratio is 1/μ, not μ — and TIR is only possible going from the denser medium towards air, never the reverse.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_122",
            chapterId = "phys_ch_23",
            subject = "Physics",
            topic = "Apparent Depth",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A mark at the bottom of a vessel filled with water (refractive index 4/3) to a depth of 12 cm is viewed from directly above. The mark appears at a depth of:",
            optionA = "16 cm",
            optionB = "12 cm",
            optionC = "8 cm",
            optionD = "9 cm",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: Viewed from a rarer medium at near-normal incidence, apparent depth = real depth / μ.
                Step 2: Apparent depth = 12 / (4/3) = 12 × 3/4 = 9 cm. The bottom appears raised by 3 cm.
                Trap: 16 cm (option A) multiplies by 4/3 instead of dividing — that is the reverse geometry (an object in air viewed from under water appears farther, not a submerged object viewed from air).
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_123",
            chapterId = "phys_ch_23",
            subject = "Physics",
            topic = "Lensmaker's Formula and Power of a Lens",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "A plano-convex lens is made of glass of refractive index 1.5, with the radius of curvature of its curved surface equal to 30 cm. The power of the lens is:",
            optionA = "+5.00 D",
            optionB = "+3.33 D",
            optionC = "+1.67 D",
            optionD = "−1.67 D",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Lensmaker's formula with R₁ = +30 cm (first surface curved, centre on the outgoing side) and R₂ = ∞ (plane surface):
                1/f = (μ − 1)(1/R₁ − 1/R₂) = 0.5 × (1/30 − 0) = 1/60 cm⁻¹, so f = +60 cm.
                Step 2: Power must use metres: P = 1/0.60 m = +1.67 D.
                Trap: +3.33 D (option B) is the power of the corresponding biconvex lens with both radii 30 cm; the plano-convex has only one curving surface. Forgetting the metre conversion is the other classic slip.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_124",
            chapterId = "phys_ch_23",
            subject = "Physics",
            topic = "Simple Microscope — Magnifying Power",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A convex lens of focal length 2.5 cm is used as a simple microscope with the final image formed at the near point (25 cm). Its magnifying power is:",
            optionA = "10",
            optionB = "12.5",
            optionC = "25",
            optionD = "11",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: For a simple microscope with the image at the near point, M = 1 + D/f.
                Step 2: M = 1 + 25/2.5 = 1 + 10 = 11.
                Trap: 10 (option A) is D/f — the magnifying power when the image is at INFINITY (relaxed eye). The near-point setting always carries the extra +1, and it is the maximum magnification of the magnifier.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_phys_125",
            chapterId = "phys_ch_24",
            subject = "Physics",
            topic = "Young's Double Slit — Fringe Width",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "In a Young's double-slit experiment, light of wavelength 500 nm falls on two slits separated by 0.5 mm, and the pattern is observed on a screen 1 m away. The fringe width is:",
            optionA = "0.5 mm",
            optionB = "1 mm",
            optionC = "2 mm",
            optionD = "0.25 mm",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Fringe width β = λD / d, with d the slit SEPARATION.
                Step 2: β = (500 × 10⁻⁹ × 1) / (0.5 × 10⁻³) = (5 × 10⁻⁷) / (5 × 10⁻⁴) = 10⁻³ m = 1 mm.
                Trap: 2 mm (option C) comes from halving d by mistake; 0.5 mm (option A) comes from using d = 1 mm. Convert every length to metres before dividing.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_126",
            chapterId = "phys_ch_24",
            subject = "Physics",
            topic = "YDSE Immersed in a Medium",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A Young's double-slit apparatus gives a fringe width of 0.80 mm in air. The entire apparatus is then immersed in water of refractive index 4/3. The new fringe width is:",
            optionA = "0.60 mm",
            optionB = "0.80 mm",
            optionC = "1.07 mm",
            optionD = "0.45 mm",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: In a medium the frequency is unchanged but the wavelength becomes λ / μ, and β is proportional to λ.
                Step 2: β_new = β_air / μ = 0.80 / (4/3) = 0.80 × 3/4 = 0.60 mm.
                Trap: 1.07 mm (option C) multiplies by μ instead of dividing — the geometry (D and d) never changes; only the wavelength shrinks, so the fringes must squeeze, not spread.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_127",
            chapterId = "phys_ch_24",
            subject = "Physics",
            topic = "Single-Slit Diffraction — Central Maximum",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 90,
            prompt = "Light of wavelength 600 nm passes through a single slit of width 0.12 mm and falls on a screen 0.5 m away. The width of the central diffraction maximum is:",
            optionA = "2.5 mm",
            optionB = "1.25 mm",
            optionC = "5 mm",
            optionD = "10 mm",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: The central maximum spans between the two first minima, so its width is 2λD / a — note the factor 2.
                Step 2: Width = (2 × 600 × 10⁻⁹ × 0.5) / (0.12 × 10⁻³) = (6 × 10⁻⁷) / (1.2 × 10⁻⁴) = 5 × 10⁻³ m = 5 mm.
                Trap: 2.5 mm (option A) is the distance from the centre to the FIRST minimum only — the half-width. The full central maximum is always double that.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_128",
            chapterId = "phys_ch_24",
            subject = "Physics",
            topic = "Polarisation — Malus Law",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "Unpolarised light of intensity I0 is incident on a polariser. The polarised beam then passes through an analyser whose transmission axis makes 30° with that of the polariser. The final transmitted intensity is:",
            optionA = "I0 / 2",
            optionB = "3 I0 / 8",
            optionC = "I0 / 4",
            optionD = "3 I0 / 4",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: A polariser transmits exactly half of unpolarised light: I1 = I0 / 2, now plane-polarised.
                Step 2: Malus' law at the analyser: I2 = I1 cos² 30° = (I0 / 2) × (3/4) = 3 I0 / 8.
                Trap: 3 I0 / 4 (option D) applies Malus to the ORIGINAL intensity, forgetting the polariser's half; I0 / 4 (option C) is the answer for 45°, not 30°.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_129",
            chapterId = "phys_ch_24",
            subject = "Physics",
            topic = "Interference — Unequal Slit Widths",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "In a double-slit experiment the two slits have widths in the ratio 4 : 1, so the intensities of light from them are in the ratio 4 : 1. The ratio of maximum to minimum intensity in the interference pattern is:",
            optionA = "4",
            optionB = "3",
            optionC = "9",
            optionD = "16",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Amplitudes go as the square roots of intensities, so A1 : A2 = √4 : √1 = 2 : 1.
                Step 2: Imax = (A1 + A2)² = (2 + 1)² = 9 units; Imin = (A1 − A2)² = (2 − 1)² = 1 unit.
                Step 3: Imax / Imin = 9 / 1 = 9.
                Trap: 4 (option A) is just the intensity ratio of the two beams — interference extrema are built from AMPLITUDES added and subtracted first, then squared. Note the minima are not zero here because the amplitudes are unequal.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_phys_130",
            chapterId = "phys_ch_25",
            subject = "Physics",
            topic = "Einstein's Equation — Stopping Potential",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "Light of wavelength 400 nm falls on a potassium surface whose work function is 2.30 eV. The stopping potential for the emitted photoelectrons is:",
            optionA = "3.10 V",
            optionB = "0.80 V",
            optionC = "2.30 V",
            optionD = "5.40 V",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Photon energy: E = 1240/λ(nm) = 1240/400 = 3.10 eV.
                Step 2: Einstein's equation: KE_max = E − φ₀ = 3.10 − 2.30 = 0.80 eV.
                Step 3: eV₀ = KE_max, and KE_max in eV equals V₀ in volts, so V₀ = 0.80 V.
                Trap: 3.10 V (option A) is the photon's full energy — the work function must be paid before any kinetic energy remains. 2.30 V (option C) is the work function itself, not a stopping potential.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_131",
            chapterId = "phys_ch_25",
            subject = "Physics",
            topic = "de Broglie Wavelength of an Accelerated Electron",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "An electron is accelerated from rest through a potential difference of 100 V. Its de Broglie wavelength is:",
            optionA = "0.0123 nm",
            optionB = "1.23 nm",
            optionC = "0.123 nm",
            optionD = "12.27 nm",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: For an electron accelerated through V volts, λ(Å) = 12.27/√V.
                Step 2: λ = 12.27/√100 = 12.27/10 = 1.227 Å = 0.123 nm.
                Trap: 1.23 nm (option B) is the value in ångströms mislabelled — 1 Å = 0.1 nm, so 1.227 Å = 0.123 nm. The ångström-to-nanometre slip is the most common error in this topic.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_132",
            chapterId = "phys_ch_25",
            subject = "Physics",
            topic = "Photon Momentum",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The momentum of a photon of wavelength 600 nm is:",
            optionA = "1.1 × 10⁻²⁷ kg·m/s",
            optionB = "1.1 × 10⁻²⁵ kg·m/s",
            optionC = "2.2 × 10⁻²⁷ kg·m/s",
            optionD = "1.1 × 10⁻²⁹ kg·m/s",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: A photon's momentum is p = h/λ — nonzero even though its rest mass is zero.
                Step 2: p = 6.63 × 10⁻³⁴ / (600 × 10⁻⁹) = 6.63 × 10⁻³⁴ / (6 × 10⁻⁷) ≈ 1.1 × 10⁻²⁷ kg·m/s.
                Trap: options B and D come from mishandling the nanometre conversion (600 nm = 6 × 10⁻⁷ m, not 6 × 10⁻⁹ m or 6 × 10⁻⁵ m).
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_133",
            chapterId = "phys_ch_25",
            subject = "Physics",
            topic = "Intensity versus Frequency — the Two Knobs",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "In a photoelectric experiment the frequency of the incident light is held fixed above the threshold frequency, and its intensity is doubled. What happens to the saturation current and the stopping potential?",
            optionA = "Saturation current doubles; stopping potential doubles",
            optionB = "Saturation current doubles; stopping potential stays the same",
            optionC = "Saturation current stays the same; stopping potential doubles",
            optionD = "Both stay the same",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: At fixed frequency each photon still carries the same hν, so KE_max = hν − φ₀ — and with it the stopping potential — cannot change.
                Step 2: Doubling the intensity doubles the photon arrival rate; each photon can eject at most one electron, so the electron rate and the saturation current double.
                Trap: option A is the wave-theory intuition (brighter = more energetic). Intensity counts photons; frequency prices them. Only the count changed here.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_134",
            chapterId = "phys_ch_25",
            subject = "Physics",
            topic = "Threshold Wavelength and KE_max",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "The threshold wavelength of a metal is 600 nm. Light of wavelength 400 nm is incident on it. The maximum kinetic energy of the emitted photoelectrons is:",
            optionA = "2.07 eV",
            optionB = "3.10 eV",
            optionC = "1.03 eV",
            optionD = "0 eV — no emission occurs",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Work function from the threshold wavelength: φ₀ = 1240/600 = 2.07 eV.
                Step 2: Photon energy at 400 nm: E = 1240/400 = 3.10 eV.
                Step 3: KE_max = E − φ₀ = 3.10 − 2.07 = 1.03 eV. (Emission does occur: 400 nm is SHORTER than the 600 nm threshold, so its photons are more energetic.)
                Trap: 3.10 eV (option B) forgets the exit fee; 2.07 eV (option A) is the work function, not a kinetic energy; option D reverses the threshold rule — it is wavelengths LONGER than λ₀ that fail.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_phys_135",
            chapterId = "phys_ch_26",
            subject = "Physics",
            topic = "Alpha Scattering — Distance of Closest Approach",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 90,
            prompt = "An alpha particle of kinetic energy 5 MeV is fired head-on towards a gold nucleus (Z = 79). The distance of closest approach is approximately:",
            optionA = "1.35 × 10⁻¹⁴ m",
            optionB = "4.55 × 10⁻¹⁴ m",
            optionC = "9.1 × 10⁻¹⁴ m",
            optionD = "4.55 × 10⁻¹² m",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Head-on, the alpha stops when all its KE has become electrostatic PE:
                KE = (1/4πε₀)(2e)(Ze)/r₀, so r₀ = 2Ze²/(4πε₀ × KE). Use ke² = 1.44 eV·nm.
                Step 2: r₀ = 2 × 79 × 1.44 eV·nm / (5 × 10⁶ eV) = 227.5/5 × 10⁻⁶ nm = 4.55 × 10⁻⁵ nm = 4.55 × 10⁻¹⁴ m.
                Trap: 9.1 × 10⁻¹⁴ m (option C) comes from using Z = 2 × 79 — the alpha's charge 2e is already built into the formula, so Z is the nucleus alone. Option D is a unit slip (nm read as 10⁻⁹ m twice over).
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_136",
            chapterId = "phys_ch_26",
            subject = "Physics",
            topic = "Bohr Model — Energy of He+ Levels",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The total energy of the electron in the n = 2 orbit of a He⁺ ion (Z = 2) is:",
            optionA = "−54.4 eV",
            optionB = "−27.2 eV",
            optionC = "−13.6 eV",
            optionD = "−3.4 eV",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: For a hydrogen-like species, E_n = −13.6 × Z²/n² eV.
                Step 2: E₂ = −13.6 × (2²)/(2²) = −13.6 × 1 = −13.6 eV. The Z² and n² factors cancel exactly here.
                Trap: −54.4 eV (option A) is the He⁺ GROUND state (n = 1) — it forgets the n² in the denominator. −3.4 eV (option D) is hydrogen's n = 2 level, forgetting Z². A He⁺ electron in n = 2 happens to match a hydrogen electron in n = 1.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_137",
            chapterId = "phys_ch_26",
            subject = "Physics",
            topic = "Hydrogen Spectrum — the Balmer Series",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The wavelength of the H-alpha line, emitted when hydrogen's electron falls from n = 3 to n = 2, is:",
            optionA = "121.5 nm",
            optionB = "364.6 nm",
            optionC = "486.1 nm",
            optionD = "656.3 nm",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: The gap energy is E = 13.6 × (1/2² − 1/3²) = 13.6 × (5/36) = 1.89 eV.
                Step 2: λ = hc/E = 1240 eV·nm / 1.89 eV = 656 nm. (Rydberg check: 1/λ = 1.097 × 10⁷ × 5/36 gives the same 656.3 nm.)
                Trap: every option is a real hydrogen wavelength — 121.5 nm is Lyman-alpha (2→1), 364.6 nm is the Balmer LIMIT (∞→2), and 486.1 nm is H-beta (4→2). The question is testing whether you can tell the Balmer family members apart.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_138",
            chapterId = "phys_ch_26",
            subject = "Physics",
            topic = "Excitation and Ionisation Energy",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The minimum energy needed to ionise a hydrogen atom that is already in its first excited state (n = 2) is:",
            optionA = "13.6 eV",
            optionB = "10.2 eV",
            optionC = "3.4 eV",
            optionD = "1.51 eV",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Ionisation from level n costs the depth of that level: E_ion = 13.6/n² eV.
                Step 2: From n = 2: 13.6/4 = 3.4 eV. The electron is already most of the way up the staircase — only the last 3.4 eV step to E = 0 remains.
                Trap: 13.6 eV (option A) is ionisation from the GROUND state; 10.2 eV (option B) is the first EXCITATION energy (1→2), the energy that put the electron in n = 2 in the first place. Note 10.2 + 3.4 = 13.6 — the bill always adds up.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_139",
            chapterId = "phys_ch_26",
            subject = "Physics",
            topic = "de Broglie Explanation of Bohr Quantisation",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "In Bohr's model of hydrogen, the second orbit has radius 2.12 Å. The de Broglie wavelength of the electron in this orbit is:",
            optionA = "3.33 Å",
            optionB = "6.65 Å",
            optionC = "13.3 Å",
            optionD = "1.66 Å",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: The standing-wave condition for the nth orbit is 2πr_n = nλ_n, so λ_n = 2πr_n/n.
                Step 2: λ₂ = 2π × 2.12 Å / 2 = π × 2.12 Å = 6.65 Å. Exactly 2 wavelengths wrap the second orbit — that self-consistency is what makes the orbit allowed.
                Trap: 13.3 Å (option C) is the full circumference 2πr — the count of wavelengths (2) was not divided out. 3.33 Å (option A) is the GROUND orbit's wavelength (2π × 0.53 Å); λ grows in proportion to n along the orbit ladder.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_phys_140",
            chapterId = "phys_ch_27",
            subject = "Physics",
            topic = "Nuclear Size and Density",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "As the mass number A of a nucleus increases from 27 to 216, its average nuclear density:",
            optionA = "Increases by a factor of 8",
            optionB = "Decreases by a factor of 8",
            optionC = "Remains essentially the same",
            optionD = "Increases by a factor of 2",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Nuclear mass grows in proportion to A, while the volume (4/3)πR³ also grows in proportion to A, because R = R₀A^(1/3) gives R³ proportional to A.
                Step 2: Density = mass/volume, and the factor A cancels exactly, so density stays at about 2.3 × 10¹⁷ kg/m³ for every nucleus.
                Trap: Options A and B assume only one of mass or volume changes. What actually doubles when A goes from 27 to 216 (a factor of 8) is the radius — A^(1/3) doubles, which is where the factor of 2 in option D belongs.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_141",
            chapterId = "phys_ch_27",
            subject = "Physics",
            topic = "Mass Defect and Binding Energy",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The mass defect of a nucleus is 0.030377 u. Taking 1 u = 931.5 MeV/c², its binding energy is approximately:",
            optionA = "2.83 MeV",
            optionB = "28.3 MeV",
            optionC = "283 MeV",
            optionD = "0.0304 MeV",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Binding energy is the mass defect converted by Einstein's relation: BE = Δm × c².
                Step 2: BE = 0.030377 × 931.5 MeV ≈ 28.3 MeV. (This is the He-4 nucleus, whose BE per nucleon is 28.3/4 ≈ 7.07 MeV.)
                Trap: Option D simply repeats the mass defect with the unit changed — the multiplication by 931.5 MeV/u is the whole question. Options A and C are the same slip in opposite directions of the decimal point.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_142",
            chapterId = "phys_ch_27",
            subject = "Physics",
            topic = "Half-Life",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A radioactive sample has a half-life of 8 days. The fraction of the original nuclei still undecayed after 24 days is:",
            optionA = "1/3",
            optionB = "1/6",
            optionC = "1/8",
            optionD = "1/16",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Count the half-lives: n = 24/8 = 3.
                Step 2: Each half-life halves the survivors, so the fraction remaining is (1/2)³ = 1/8.
                Trap: Option A treats decay as if a fixed fraction of the ORIGINAL sample vanished on a linear schedule — decay is multiplicative halving of whatever remains. Option D would need 4 half-lives, i.e. 32 days.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_143",
            chapterId = "phys_ch_27",
            subject = "Physics",
            topic = "Beta-Minus Decay",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "Cobalt-60 (Z = 27) undergoes beta-minus decay. The daughter nucleus is:",
            optionA = "Fe-60",
            optionB = "Ni-60",
            optionC = "Co-59",
            optionD = "Ni-59",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: In beta-minus decay a neutron converts into a proton (n → p + e⁻ + antineutrino), so Z increases by 1 while A stays unchanged.
                Step 2: A stays 60 and Z becomes 27 + 1 = 28, which is nickel: Ni-60.
                Trap: Option A (Fe, Z = 26) is the beta-PLUS direction — Z decreasing. Options C and D lower A, but beta emission never changes the mass number.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_144",
            chapterId = "phys_ch_27",
            subject = "Physics",
            topic = "Fusion Q Value",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "In the fusion reaction D + T → He-4 + n, the total reactant mass is 5.030151 u and the total product mass is 5.011268 u. The energy released per reaction is approximately:",
            optionA = "3.27 MeV",
            optionB = "17.6 MeV",
            optionC = "26.7 MeV",
            optionD = "1.76 MeV",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Q = (mass of reactants − mass of products) × 931.5 MeV/u.
                Step 2: Δm = 5.030151 − 5.011268 = 0.018883 u, so Q = 0.018883 × 931.5 ≈ 17.6 MeV.
                Trap: 3.27 MeV (option A) is the Q of the D + D reaction and 26.7 MeV (option C) belongs to the Sun's net 4H → He-4 chain — both are fusion numbers from the same chapter, planted to catch students who memorise figures without attaching them to their reactions.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_phys_145",
            chapterId = "phys_ch_28",
            subject = "Physics",
            topic = "Diode Circuit — Knee Voltage Model",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A silicon diode (knee voltage 0.7 V) is connected in forward bias in series with a 200 Ω resistor across a 4.7 V supply. The current through the circuit is:",
            optionA = "23.5 mA",
            optionB = "20 mA",
            optionC = "27 mA",
            optionD = "3.5 mA",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: A conducting silicon diode holds about 0.7 V across itself, so the resistor gets the rest of the supply:
                V_R = 4.7 − 0.7 = 4.0 V.
                Step 2: I = V_R / R = 4.0 / 200 = 0.020 A = 20 mA.
                Trap: 23.5 mA (option A) forgets the knee and uses the full 4.7 V across the resistor; 27 mA (option C) adds the drop instead of subtracting it. Always subtract the knee first, then divide by R.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_146",
            chapterId = "phys_ch_28",
            subject = "Physics",
            topic = "Mass-Action Law — Minority Carriers",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "A semiconductor has intrinsic carrier concentration n_i = 2 × 10¹⁶ per m³. It is doped with donors at N_D = 4 × 10²² per m³. The hole concentration in the doped sample is:",
            optionA = "4 × 10²² per m³",
            optionB = "1 × 10¹⁰ per m³",
            optionC = "2 × 10¹⁶ per m³",
            optionD = "8 × 10³⁸ per m³",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: The mass-action law holds at any doping level: n_e × n_h = n_i².
                Step 2: The majority electrons are set by the doping, n_e ≈ N_D = 4 × 10²² per m³, so:
                n_h = n_i² / N_D = (2 × 10¹⁶)² / (4 × 10²²) = (4 × 10³²) / (4 × 10²²) = 1 × 10¹⁰ per m³.
                Trap: 2 × 10¹⁶ per m³ (option C) is n_i itself — doping never leaves the minority population untouched; it crushes it by the product rule. 4 × 10²² (option A) is the majority electron density, not the holes.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_147",
            chapterId = "phys_ch_28",
            subject = "Physics",
            topic = "LED — Band Gap and Emission Wavelength",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "An LED is made from a semiconductor with band gap E_g = 2.2 eV. The wavelength of the light it emits is closest to:",
            optionA = "273 nm",
            optionB = "564 nm",
            optionC = "620 nm",
            optionD = "1130 nm",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Each recombining electron–hole pair releases roughly the band-gap energy as one photon: E_photon ≈ E_g = hc / λ.
                Step 2: Using hc ≈ 1240 eV·nm:
                λ ≈ 1240 / 2.2 ≈ 564 nm — green-yellow light.
                Trap: 620 nm (option C) is the answer for a 2.0 eV gap (red); 1130 nm (option D) is what silicon's 1.1 eV gap would give — infrared, which is why plain silicon makes a hopeless LED.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_148",
            chapterId = "phys_ch_28",
            subject = "Physics",
            topic = "Zener Diode Voltage Regulator",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "A Zener diode with V_Z = 5 V regulates a load from a 15 V supply through a 200 Ω series resistor. The load draws 20 mA. The current through the Zener diode is:",
            optionA = "50 mA",
            optionB = "20 mA",
            optionC = "30 mA",
            optionD = "70 mA",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: The series resistor drops the excess voltage: V_R = 15 − 5 = 10 V, so the total current it passes is:
                I_total = 10 / 200 = 0.050 A = 50 mA.
                Step 2: The load takes 20 mA of this; the Zener shunts the remainder to hold the voltage at 5 V:
                I_Z = 50 − 20 = 30 mA.
                Trap: 50 mA (option A) is the total resistor current, not the Zener's share; the load's 20 mA never passes through the Zener. (Check the worst case too: if the load disconnects, the Zener must survive all 50 mA.)
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_phys_149",
            chapterId = "phys_ch_28",
            subject = "Physics",
            topic = "Logic Gates — NAND Followed by NOT",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "Two inputs A and B feed a NAND gate, and the NAND gate's output is passed through a NOT gate. The complete combination is equivalent to a single:",
            optionA = "OR gate",
            optionB = "AND gate",
            optionC = "NOR gate",
            optionD = "NAND gate",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: The NAND gate outputs the complement of (A · B); the NOT gate complements it again — and a double complement cancels:
                Y = complement of [complement of (A · B)] = A · B.
                Step 2: Verify with the truth table: (0,0) → NAND gives 1 → NOT gives 0; (0,1) → 1 → 0; (1,0) → 1 → 0; (1,1) → 0 → 1. Output 1 only when both inputs are 1 — exactly an AND gate.
                Trap: NAND and NOR are easy to swap under pressure: NAND is 0 only at (1, 1), NOR is 1 only at (0, 0). Anchoring those two rows settles every such question.
            """.trimIndent()
        ),

        QuestionEntity(

            id = "q_phys_1",

            chapterId = "phys_ch_15",

            subject = "Physics",

            topic = "Electric Charges and Fields",

            examSource = "IISER IAT",

            examYear = 2024,

            isImportantQuestion = true,

            isPyq = true,

            difficulty = "Analytical",

            estimatedSeconds = 120,

            prompt = "A solid non-conducting sphere of radius R carries a uniform volume charge density ρ. A spherical cavity of radius R/2 is carved out such that its center is at distance R/2 from the center of the original sphere. What is the magnitude of the electric field inside the cavity?",

            optionA = "Zero everywhere inside the cavity",

            optionB = "ρR / (6ε₀), uniform throughout the cavity",

            optionC = "ρR / (3ε₀), uniform throughout the cavity",

            optionD = "Varies linearly with distance from the cavity center",

            correctOptionIndex = 1,

            stepByStepExplanation = """

                Step 1: By Principle of Superposition, treat the cavity as the overlap of a full sphere of charge density +ρ (center O₁) and a smaller sphere of radius R/2 with charge density −ρ (center O₂).

                Step 2: Inside any uniformly charged sphere, the electric field at position r from its center is E(r) = (ρ / 3ε₀) r.

                Step 3: At any point P inside the cavity:

                E_net = E₁ + E₂ = (ρ / 3ε₀) r₁ − (ρ / 3ε₀) r₂ = (ρ / 3ε₀) (r₁ − r₂) = (ρ / 3ε₀) O₁O₂.

                Step 4: Since |O₁O₂| = R/2, the field inside the cavity is completely uniform with magnitude:

                |E_net| = (ρ / 3ε₀)(R / 2) = ρR / (6ε₀).

            """.trimIndent(),

            isBookmarked = true

        ),

        QuestionEntity(

            id = "q_phys_2",

            chapterId = "phys_ch_6",

            subject = "Physics",

            topic = "System of Particles and Rotational Motion",

            examSource = "IISER IAT",

            examYear = 2023,

            isImportantQuestion = true,

            isPyq = true,

            difficulty = "Analytical",

            estimatedSeconds = 135,

            prompt = "A solid uniform cylinder of mass M and radius R rolls without slipping down an inclined plane of inclination θ. What is the minimum coefficient of static friction μ_s required to prevent slipping?",

            optionA = "(1/3) tan θ",

            optionB = "(2/7) tan θ",

            optionC = "(2/5) tan θ",

            optionD = "(1/2) tan θ",

            correctOptionIndex = 0,

            stepByStepExplanation = """

                Step 1: For a rolling body with moment of inertia I = k² MR², the required static friction on an incline θ is:

                f_s = M g sin θ / [1 + MR² / I].

                Step 2: For a solid cylinder, I = ½ MR² ⇒ MR² / I = 2.

                Thus f_s = (1/3) M g sin θ.

                Step 3: For pure rolling without slipping, f_s ≤ μ_s N = μ_s M g cos θ:

                (1/3) M g sin θ ≤ μ_s M g cos θ ⇒ μ_s ≥ (1/3) tan θ.

            """.trimIndent()

        ),

        QuestionEntity(

            id = "q_phys_3",

            chapterId = "phys_ch_11",

            subject = "Physics",

            topic = "Thermodynamics",

            examSource = "IISER IAT",

            examYear = 2025,

            isImportantQuestion = true,

            isPyq = true,

            difficulty = "Research-Level",

            estimatedSeconds = 140,

            prompt = "One mole of a monoatomic ideal gas (γ = 5/3) undergoes a polytropic process where pressure and volume satisfy P V³ = constant. What is the molar heat capacity C of the gas during this process?",

            optionA = "R / 2",

            optionB = "R",

            optionC = "3R / 2",

            optionD = "2R",

            correctOptionIndex = 1,

            stepByStepExplanation = """

                Step 1: For a polytropic process P V^x = constant, the molar heat capacity is:

                C = C_v + R / (1 − x).

                Step 2: For a monoatomic ideal gas, C_v = (3/2)R, and the polytropic exponent is x = 3.

                Step 3: Substitute x = 3:

                C = (3/2)R + R / (1 − 3) = (3/2)R − (1/2)R = R.

            """.trimIndent()

        ),

        QuestionEntity(

            id = "q_phys_4",

            chapterId = "phys_ch_25",

            subject = "Physics",

            topic = "Dual Nature of Radiation and Matter",

            examSource = "IISER IAT",

            examYear = null,

            isImportantQuestion = true,

            isPyq = false,

            difficulty = "Conceptual",

            estimatedSeconds = 100,

            prompt = "A proton and an alpha particle are accelerated from rest through the same electrostatic potential difference V. What is the ratio of their de Broglie wavelengths (λ_p / λ_α)?",

            optionA = "2 : 1",

            optionB = "2√2 : 1",

            optionC = "√2 : 1",

            optionD = "4 : 1",

            correctOptionIndex = 1,

            stepByStepExplanation = """

                Step 1: The de Broglie wavelength of a particle of mass m and charge q accelerated through potential V is:

                λ = h / √(2 m q V) ⇒ λ ∝ 1 / √(m q).

                Step 2: Since m_α = 4 m_p and q_α = 2 q_p:

                λ_p / λ_α = √[(m_α q_α) / (m_p q_p)] = √(4 × 2) = √8 = 2√2 : 1.

            """.trimIndent()

        ),



        // ==================== CHEMISTRY QUESTIONS ====================

        QuestionEntity(

            id = "q_chem_1",

            chapterId = "chem_ch_7",

            subject = "Chemistry",

            topic = "Thermodynamics",

            examSource = "IISER IAT",

            examYear = 2024,

            isImportantQuestion = true,

            isPyq = true,

            difficulty = "Analytical",

            estimatedSeconds = 110,

            prompt = "At 300 K, the standard Gibbs free energy change ΔG° for the isomerization reaction A(g) ⇌ B(g) is −2.303 R (300) J/mol. If a vessel initially contains 4 moles of A and 1 mole of B, in which direction does the reaction proceed and what is the equilibrium mole fraction of B?",

            optionA = "Forward; x_B = 10/11",

            optionB = "Forward; x_B = 4/5",

            optionC = "Backward; x_B = 1/11",

            optionD = "At equilibrium; x_B = 1/5",

            correctOptionIndex = 0,

            stepByStepExplanation = """

                Step 1: Compute the equilibrium constant K_p from ΔG° = −RT ln K_p = −2.303 RT log₁₀ K_p:

                −2.303 R (300) = −2.303 R (300) log₁₀ K_p ⇒ log₁₀ K_p = 1 ⇒ K_p = K_c = 10.

                Step 2: Initial reaction quotient Q = n_B / n_A = 1 / 4 = 0.25 < K_c (10).

                Hence the reaction proceeds spontaneously in the forward direction.

                Step 3: At equilibrium, n_B / n_A = 10 ⇒ mole fraction of B is x_B = 10 / (10 + 1) = 10/11.

            """.trimIndent()

        ),

        QuestionEntity(

            id = "q_chem_2",

            chapterId = "chem_ch_12",

            subject = "Chemistry",

            topic = "Chemical Kinetics",

            examSource = "IISER IAT",

            examYear = 2023,

            isImportantQuestion = true,

            isPyq = true,

            difficulty = "Analytical",

            estimatedSeconds = 120,

            prompt = "A first-order gas-phase reaction A(g) → 2B(g) + C(g) has a half-life of 20 minutes. If the initial pressure of pure A is 100 mmHg, what is the total pressure in the container after 40 minutes?",

            optionA = "175 mmHg",

            optionB = "225 mmHg",

            optionC = "250 mmHg",

            optionD = "275 mmHg",

            correctOptionIndex = 2,

            stepByStepExplanation = """

                Step 1: 40 minutes corresponds to exactly n = 40 / 20 = 2 half-lives.

                Step 2: After 2 half-lives, partial pressure of remaining A is P_A = P₀ / 2² = 100 / 4 = 25 mmHg.

                Thus the pressure drop of A is x = 100 − 25 = 75 mmHg.

                Step 3: From stoichiometry A(g) → 2B(g) + C(g):

                P_total = (P₀ − x) + 2x + x = P₀ + 2x = 100 + 2(75) = 250 mmHg.

            """.trimIndent()

        ),

        QuestionEntity(

            id = "q_chem_3",

            chapterId = "chem_ch_6",

            subject = "Chemistry",

            topic = "Coordination compounds",

            examSource = "IISER IAT",

            examYear = 2025,

            isImportantQuestion = true,

            isPyq = true,

            difficulty = "Conceptual",

            estimatedSeconds = 95,

            prompt = "Which of the following octahedral complexes exhibits the highest Crystal Field Stabilization Energy (CFSE) magnitude in units of Δ_o (ignoring pairing energy P)?",

            optionA = "[Fe(H₂O)₆]³⁺",

            optionB = "[Cr(NH₃)₆]³⁺",

            optionC = "[Co(CN)₆]³⁻",

            optionD = "[Ni(H₂O)₆]²⁺",

            correctOptionIndex = 2,

            stepByStepExplanation = """

                Step 1: Determine d-electron count and spin state for each octahedral ion:

                • [Fe(H₂O)₆]³⁺: Fe³⁺ (d⁵, weak field H₂O, high-spin t₂g³ e_g²) → CFSE = 0 Δ_o.

                • [Cr(NH₃)₆]³⁺: Cr³⁺ (d³, t₂g³ e_g⁰) → CFSE = −1.2 Δ_o.

                • [Co(CN)₆]³⁻: Co³⁺ (d⁶, strong field CN⁻, low-spin t₂g⁶ e_g⁰) → CFSE = 6 × (−0.4 Δ_o) = −2.4 Δ_o.

                • [Ni(H₂O)₆]²⁺: Ni²⁺ (d⁸, t₂g⁶ e_g²) → CFSE = −1.2 Δ_o.

                Step 2: [Co(CN)₆]³⁻ has the maximum CFSE magnitude of 2.4 Δ_o.

            """.trimIndent(),

            isBookmarked = true

        ),

        QuestionEntity(

            id = "q_chem_4",

            chapterId = "chem_ch_15",

            subject = "Chemistry",

            topic = "Haloalkanes and haloarenes",

            examSource = "IISER IAT",

            examYear = null,

            isImportantQuestion = true,

            isPyq = false,

            difficulty = "Analytical",

            estimatedSeconds = 110,

            prompt = "When (2R, 3S)-2,3-dibromobutane undergoes E2 dehydrohalogenation with alcoholic KOH, or anti-debromination with Zn/alcohol, what is the major alkene formed in the Zn/alcohol reaction?",

            optionA = "trans-2-butene",

            optionB = "cis-2-butene",

            optionC = "1-butene",

            optionD = "An equimolar racemic mixture of cis- and trans-2-butene",

            correctOptionIndex = 0,

            stepByStepExplanation = """

                Step 1: (2R, 3S)-2,3-dibromobutane is the optically inactive meso isomer.

                Step 2: Debromination with Zn dust proceeds via stereospecific anti-elimination (the two Br atoms must be anti-periplanar at 180° in Newman projection).

                Step 3: Placing the two Br atoms anti to each other in the meso isomer automatically places the two CH₃ groups anti to each other, yielding exclusively trans-2-butene.

            """.trimIndent()

        ),
QuestionEntity(
            id = "q_chem_5",
            chapterId = "chem_ch_1",
            subject = "Chemistry",
            topic = "Mole Concept — Counting Atoms",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The number of atoms present in 52 g of helium is:",
            optionA = "7.83 x 10^24 atoms",
            optionB = "6.022 x 10^23 atoms",
            optionC = "3.01 x 10^24 atoms",
            optionD = "1.56 x 10^25 atoms",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Convert mass to moles. Helium has molar mass 4 g/mol:
                n = 52 / 4 = 13 mol.
                Step 2: Convert moles to particles with the Avogadro constant:
                N = 13 x 6.022 x 10^23 = 7.83 x 10^24 atoms.
                Trap: 6.022 x 10^23 (option B) is the count in ONE mole — the step from mass to moles cannot be skipped.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_6",
            chapterId = "chem_ch_1",
            subject = "Chemistry",
            topic = "Empirical Formula from Percentage Composition",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 90,
            prompt = "A compound contains 40.0% carbon, 6.7% hydrogen and 53.3% oxygen by mass. Its empirical formula is:",
            optionA = "CH2O",
            optionB = "C2H4O2",
            optionC = "CHO",
            optionD = "C6H12O6",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Assume a 100 g sample, so the masses are C 40.0 g, H 6.7 g, O 53.3 g.
                Step 2: Convert to moles: C = 40.0 / 12 = 3.33; H = 6.7 / 1 = 6.7; O = 53.3 / 16 = 3.33.
                Step 3: Divide by the smallest (3.33): C = 1, H = 2, O = 1.
                Empirical formula = CH2O.
                Trap: C6H12O6 (option D) is the MOLECULAR formula of glucose, which shares these percentages — without the molar mass, only the empirical formula can be claimed. C2H4O2 (option B) has the same ratio unsimplified.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_7",
            chapterId = "chem_ch_1",
            subject = "Chemistry",
            topic = "Limiting Reagent",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 120,
            prompt = "For the reaction N2 + 3H2 gives 2NH3, 14 g of nitrogen is mixed with 10 g of hydrogen and the reaction goes to completion. The mass of ammonia formed is:",
            optionA = "34 g",
            optionB = "17 g",
            optionC = "51 g",
            optionD = "85 g",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Moles available: N2 = 14 / 28 = 0.5 mol; H2 = 10 / 2 = 5 mol.
                Step 2: Quotient test (moles / coefficient): N2 = 0.5 / 1 = 0.5; H2 = 5 / 3 = 1.67. Nitrogen has the smaller quotient, so N2 is the limiting reagent even though hydrogen is present in smaller mass.
                Step 3: Yield from the limiter: NH3 = 2 x 0.5 = 1 mol = 1 x 17 = 17 g.
                Trap: 85 g (option D) comes from basing the yield on the 5 mol of excess hydrogen; 34 g (option A) comes from treating 14 g of N2 as 1 mol.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_8",
            chapterId = "chem_ch_1",
            subject = "Chemistry",
            topic = "Percentage Composition",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 60,
            prompt = "The mass percentage of oxygen in sulphuric acid, H2SO4, is (H = 1, S = 32, O = 16):",
            optionA = "32.7%",
            optionB = "53.3%",
            optionC = "65.3%",
            optionD = "16.3%",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Molar mass of H2SO4 = 2 x 1 + 32 + 4 x 16 = 98 g/mol.
                Step 2: Oxygen contributes 4 x 16 = 64 g per mole.
                Mass percent of O = 64 / 98 x 100 = 65.3%.
                Trap: 32.7% (option A) is the mass percent of SULPHUR (32/98); 53.3% (option B) comes from stopping at 3 oxygen atoms. Percentage composition is a mass fraction, never an atom count.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_9",
            chapterId = "chem_ch_1",
            subject = "Chemistry",
            topic = "Molar Volume at STP",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The volume occupied by 8.8 g of carbon dioxide gas at STP is:",
            optionA = "4.48 L",
            optionB = "2.24 L",
            optionC = "22.4 L",
            optionD = "44.8 L",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Convert mass to moles: CO2 has molar mass 44 g/mol, so n = 8.8 / 44 = 0.2 mol.
                Step 2: At STP one mole of any gas occupies 22.4 L:
                V = 0.2 x 22.4 = 4.48 L.
                Trap: 22.4 L (option C) is the volume of a full mole (44 g), not of 8.8 g; 2.24 L (option B) is the volume of 0.1 mol — a halving slip in the mole step.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_chem_10",
            chapterId = "chem_ch_2",
            subject = "Chemistry",
            topic = "Bohr Model — Hydrogen Spectrum",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 75,
            prompt = "In the hydrogen spectrum, the H-alpha line is emitted when the electron falls from n = 3 to n = 2. Taking R_H = 1.097 x 10^7 m^-1, its wavelength is:",
            optionA = "486 nm",
            optionB = "656 nm",
            optionC = "434 nm",
            optionD = "122 nm",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Rydberg's formula with n1 = 2 (landing level) and n2 = 3:
                1/λ = R_H (1/n1² − 1/n2²) = 1.097 x 10^7 x (1/4 − 1/9).
                Step 2: (1/4 − 1/9) = 5/36 = 0.1389, so 1/λ = 1.097 x 10^7 x 0.1389 = 1.524 x 10^6 m^-1.
                Step 3: λ = 1 / (1.524 x 10^6) = 6.56 x 10^-7 m = 656 nm — the red H-alpha line of the Balmer series.
                Trap: 486 nm (option A) is H-beta, the 4 → 2 line; 122 nm (option D) is the Lyman 2 → 1 line. The series is fixed by the level landed on, and the wavelength by the size of the gap.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_11",
            chapterId = "chem_ch_2",
            subject = "Chemistry",
            topic = "Photoelectric Effect — Einstein Equation",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 75,
            prompt = "Light of wavelength 310 nm falls on a metal surface whose work function is 2.5 eV. The maximum kinetic energy of the emitted photoelectrons is: (Take hc = 1240 eV nm)",
            optionA = "6.5 eV",
            optionB = "4.0 eV",
            optionC = "2.5 eV",
            optionD = "1.5 eV",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: Energy of one photon: E = hc/λ = 1240/310 = 4.0 eV.
                Step 2: Einstein's equation — the photon pays the work function as an exit fee and the electron keeps the rest:
                K_max = E − φ₀ = 4.0 − 2.5 = 1.5 eV.
                Trap: 4.0 eV (option B) is the full photon energy, before paying the work function; 2.5 eV (option C) is just the work function itself. Brighter light would eject MORE electrons but would not change this 1.5 eV maximum.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_12",
            chapterId = "chem_ch_2",
            subject = "Chemistry",
            topic = "de Broglie Wavelength",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "An electron is accelerated from rest through a potential difference of 150 V. Its de Broglie wavelength is approximately:",
            optionA = "0.1 angstrom",
            optionB = "10 angstrom",
            optionC = "1.0 angstrom",
            optionD = "0.01 angstrom",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: For an electron accelerated through V volts, the de Broglie wavelength in angstrom is λ = 12.27/√V.
                Step 2: λ = 12.27/√150 = 12.27/12.25 = 1.0 angstrom (0.1 nm).
                (From first principles: λ = h/√(2 m e V) gives the same value; the shortcut is electron-only.)
                Trap: 0.1 angstrom and 10 angstrom (options A and B) are factor-of-ten slips; a wavelength of about 1 angstrom — the spacing of atoms in a crystal — is exactly why such electrons show diffraction, as Davisson and Germer observed.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_13",
            chapterId = "chem_ch_2",
            subject = "Chemistry",
            topic = "Quantum Numbers — Validity",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "Which of the following sets of quantum numbers (n, l, m_l, m_s) is NOT possible for an electron in an atom?",
            optionA = "n = 3, l = 1, m_l = 0, m_s = +1/2",
            optionB = "n = 4, l = 2, m_l = −1, m_s = −1/2",
            optionC = "n = 2, l = 2, m_l = +1, m_s = +1/2",
            optionD = "n = 1, l = 0, m_l = 0, m_s = −1/2",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Apply the legality checks in order: n is a positive integer; l can run only from 0 to n − 1; |m_l| cannot exceed l; m_s is +1/2 or −1/2.
                Step 2: In option C, n = 2 allows l = 0 or 1 only. l = 2 requires n ≥ 3 — there is no 2d subshell — so this set is impossible.
                Step 3: Options A, B and D pass every check (B is a valid 4d electron; D is the second electron of helium's 1s orbital).
                Trap: m_l = +1 in option C looks suspicious but is fine for l = 2; the offence is l itself equalling n. Always test l against n first.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_14",
            chapterId = "chem_ch_2",
            subject = "Chemistry",
            topic = "Bohr Model — Energy of Hydrogen-like Ions",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The total energy of the electron in the ground state of the Li2+ ion is:",
            optionA = "−54.4 eV",
            optionB = "−122.4 eV",
            optionC = "−13.6 eV",
            optionD = "−40.8 eV",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: For a hydrogen-like species, E_n = −13.6 x Z²/n² eV. Li2+ has Z = 3 and one electron, so Bohr's formula applies.
                Step 2: Ground state means n = 1: E = −13.6 x 3²/1² = −13.6 x 9 = −122.4 eV.
                (Its ionisation energy is therefore +122.4 eV.)
                Trap: −54.4 eV (option A) is the ground state of He+ (Z = 2); −13.6 eV (option C) is hydrogen itself. The Z² factor is the whole question.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_chem_15",
            chapterId = "chem_ch_3",
            subject = "Chemistry",
            topic = "Ionisation Enthalpy — the Be/B Dip",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "Which arrangement represents the correct order of first ionisation enthalpy for Li, Be, B and C?",
            optionA = "Li < Be < B < C",
            optionB = "Li < B < Be < C",
            optionC = "B < Be < Li < C",
            optionD = "Be < Li < B < C",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Values (kJ/mol): Li 520, Be 899, B 801, C 1086. The general across-period trend rises with Z(eff), so the naive order would be Li < Be < B < C.
                Step 2: Apply the dip check. Beryllium is 2s² (fully filled, more penetrating) while boron loses a shielded 2p electron, so Be costs MORE than B despite its smaller Z: Be 899 > B 801.
                Answer: Li (520) < B (801) < Be (899) < C (1086).
                Trap: option A is the uncorrected trend — it ignores the filled-subshell premium. Options C and D break the basic trend itself.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_16",
            chapterId = "chem_ch_3",
            subject = "Chemistry",
            topic = "Isoelectronic Ions — Radius Order",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The species O²⁻, F⁻, Na⁺ and Mg²⁺ are all isoelectronic (10 electrons each). Which of them is the smallest?",
            optionA = "O²⁻",
            optionB = "F⁻",
            optionC = "Na⁺",
            optionD = "Mg²⁺",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: All four species hold the same 10-electron cloud; what changes is the nuclear charge pulling on it: O (Z = 8), F (9), Na (11), Mg (12).
                Step 2: For isoelectronic species, size falls strictly as Z rises. Radii (pm): O²⁻ 140 > F⁻ 133 > Na⁺ 102 > Mg²⁺ 72.
                Answer: Mg²⁺, with the largest Z, pulls the identical cloud in tightest and is the smallest.
                Trap: ranking by the charge label (2− looks "bigger" than 2+) accidentally works here for the anions but fails within each pair — the deciding variable is Z, not the sign or size of the ionic charge.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_17",
            chapterId = "chem_ch_3",
            subject = "Chemistry",
            topic = "Electron Gain Enthalpy — the F/Cl Anomaly",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "The electron gain enthalpy of chlorine (−349 kJ/mol) is more negative than that of fluorine (−328 kJ/mol), even though fluorine is smaller and more electronegative. The main reason is:",
            optionA = "Fluorine has the highest electronegativity, so it resists gaining an electron",
            optionB = "Chlorine has vacant d-orbitals that accommodate the extra electron",
            optionC = "In fluorine the incoming electron enters the compact 2p subshell and faces strong repulsion from the electrons already there",
            optionD = "Chlorine is larger, so its nucleus attracts the incoming electron more strongly",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: More negative Δ(eg)H means more energy released on gaining an electron. Fluorine's small size concentrates its five 2p electrons into a tiny volume.
                Step 2: The incoming electron must join that crowded 2p subshell, and inter-electronic repulsion there cancels part of the attraction gain. Chlorine's larger 3p subshell spreads electrons out, so the full attraction is realised: Cl −349 beats F −328 kJ/mol.
                Answer: option C.
                Trap: option B is the retired textbook myth — d-orbitals play no role in chlorine's ground-state electron gain. Option A reverses cause and effect (electronegativity is a bond property, not a gas-phase energy), and option D states the size effect backwards.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_18",
            chapterId = "chem_ch_3",
            subject = "Chemistry",
            topic = "Blocks and Anomalous Configuration — Chromium",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "An element has the ground-state configuration [Ar] 3d⁵ 4s¹. It belongs to:",
            optionA = "s-block, group 2",
            optionB = "d-block, group 5",
            optionC = "p-block, group 6",
            optionD = "d-block, group 6",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: The differentiating (last) electron enters a d subshell, so the element is d-block. The configuration is chromium (Z = 24), which borrows one 4s electron to reach the extra-stable half-filled 3d⁵ arrangement instead of the expected 3d⁴ 4s².
                Step 2: For groups 3–12, the group number counts the (n − 1)d plus ns electrons: 5 + 1 = 6.
                Answer: d-block, group 6 — option D.
                Trap: option B counts only the d electrons (5) and forgets the 4s electron; option A is what the un-shifted 4s² configuration would misleadingly suggest.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_19",
            chapterId = "chem_ch_3",
            subject = "Chemistry",
            topic = "Oxide Character Across a Period",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "Oxides change from basic to acidic across period 3 (Na₂O → Cl₂O₇). The amphoteric oxide of this period is:",
            optionA = "SiO₂",
            optionB = "Al₂O₃",
            optionC = "MgO",
            optionD = "P₄O₁₀",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Across period 3 the oxides run: Na₂O strongly basic, MgO basic, Al₂O₃ amphoteric, SiO₂ weakly acidic, P₄O₁₀ acidic, SO₃ strongly acidic, Cl₂O₇ most strongly acidic.
                Step 2: The crossover sits at aluminium, in the middle of the period where metallic character fades into nonmetallic — Al₂O₃ reacts with both acids and bases.
                Answer: Al₂O₃ — option B.
                Trap: SiO₂ is acidic (though weakly), not amphoteric, and MgO is a straightforward basic oxide; amphoteric behaviour belongs to the crossover elements (Al, Zn, Be, Pb oxides are the classic set).
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_chem_20",
            chapterId = "chem_ch_4",
            subject = "Chemistry",
            topic = "Molecular Orbital Theory — Bond Order of Ions",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The bond order of the superoxide ion, O2−, is:",
            optionA = "1",
            optionB = "1.5",
            optionC = "2",
            optionD = "2.5",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: O2 has 12 valence electrons; O2− has 13. On the O2 MO ladder the configuration ends with (π*2p) holding 3 electrons.
                Step 2: Bonding electrons Nb = 8 (σ2s, σ2p and π2p filled), antibonding electrons Na = 5 (σ*2s with 2, π*2p with 3).
                Bond order = (Nb − Na)/2 = (8 − 5)/2 = 1.5.
                Trap: 2 (option C) is the bond order of neutral O2 — the extra electron of the superoxide goes into an ANTIBONDING orbital and weakens the bond by exactly half a unit. 2.5 (option D) belongs to O2+, where an antibonding electron is removed instead.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_21",
            chapterId = "chem_ch_4",
            subject = "Chemistry",
            topic = "VSEPR Theory — Shape with Lone Pairs",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The molecular shape of ClF3 is:",
            optionA = "Trigonal planar",
            optionB = "Trigonal pyramidal",
            optionC = "T-shaped",
            optionD = "See-saw",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Steric number of Cl = (valence electrons + monovalent atoms)/2 = (7 + 3)/2 = 5 electron pairs.
                Step 2: Three pairs are bonds, so lone pairs = 5 − 3 = 2. The electron geometry is trigonal bipyramidal, and both lone pairs take the roomier equatorial positions (only two 90° repulsions each, versus three axially).
                Step 3: The three fluorines left visible — two axial, one equatorial — form a T shape.
                Trap: see-saw (option D) is SF4, which has only ONE lone pair; trigonal planar (option A) forgets the lone pairs altogether. Count pairs first, then hide the lone pairs, then name the shape.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_22",
            chapterId = "chem_ch_4",
            subject = "Chemistry",
            topic = "Molecular Orbital Theory — Magnetic Behaviour",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "Which of the following diatomic molecules is paramagnetic?",
            optionA = "C2",
            optionB = "N2",
            optionC = "F2",
            optionD = "B2",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: Paramagnetic means at least one unpaired electron in the MO diagram.
                Step 2: B2 has 6 valence electrons. For the light diatomics (up to N2), s–p mixing puts the π2p pair BELOW σ2p, so B2 ends with (π2p) holding 2 electrons — and Hund's rule places one electron in EACH degenerate π orbital, spins parallel: two unpaired electrons. B2 is paramagnetic, with bond order (4 − 2)/2 = 1.
                Step 3: C2 completes (π2p) with 4 paired electrons, N2 fills everything up to σ2p in pairs, and F2 pairs all electrons including its full π* set — all three are diamagnetic.
                Trap: choosing by the O2 ladder or assuming every small molecule is diamagnetic; the light-ladder ordering is exactly what makes B2 (and O2, on its own ladder) the magnetic exceptions.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_23",
            chapterId = "chem_ch_4",
            subject = "Chemistry",
            topic = "Formal Charge",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The formal charge on the nitrogen atom in the ammonium ion, NH4+, is:",
            optionA = "0",
            optionB = "+1",
            optionC = "−1",
            optionD = "+2",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Formal charge = (valence electrons) − (non-bonding electrons) − (1/2)(bonding electrons).
                Step 2: In NH4+, nitrogen forms four N–H bonds and carries no lone pair: formal charge = 5 − 0 − (1/2)(8) = 5 − 4 = +1.
                Step 3: Audit — each hydrogen has formal charge 1 − 0 − (1/2)(2) = 0, so the total is +1, matching the ion's charge.
                Trap: 0 (option A) is nitrogen's formal charge in NH3, where the lone pair contributes 2 non-bonding electrons: 5 − 2 − 3 = 0. The lone pair is the whole difference.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_24",
            chapterId = "chem_ch_4",
            subject = "Chemistry",
            topic = "Hybridisation and Shape — XeF4",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The hybridisation of xenon and the shape of XeF4 are:",
            optionA = "sp3d2, square planar",
            optionB = "sp3, tetrahedral",
            optionC = "sp3d, see-saw",
            optionD = "sp2, trigonal planar",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Steric number of Xe = (8 + 4)/2 = 6 electron pairs, so the hybridisation is sp3d2 and the electron geometry is octahedral.
                Step 2: Lone pairs = 6 − 4 = 2. They occupy opposite (trans) positions, above and below the plane, to keep the strongest LP–LP repulsion as far apart as possible.
                Step 3: The four fluorines remaining in the plane give a square planar shape with 90° bond angles.
                Trap: see-saw (option C) is the sp3d case of SF4 with one lone pair; XeF4 has one more pair and one more lone pair, which flips both the hybridisation and the shape.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_chem_25",
            chapterId = "chem_ch_5",
            subject = "Chemistry",
            topic = "Magnetic Properties — Spin-Only Moment",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The spin-only magnetic moment of Fe3+ is:",
            optionA = "1.73 BM",
            optionB = "3.87 BM",
            optionC = "4.90 BM",
            optionD = "5.92 BM",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: Write the configuration of the ION. Fe (Z = 26) is 3d6 4s2; ions lose 4s electrons first, so Fe3+ is 3d5.
                Step 2: A d5 ion has one electron in each of the five d orbitals, so n = 5 unpaired electrons.
                Step 3: mu = sqrt(n(n+2)) = sqrt(5 x 7) = sqrt(35) = 5.92 BM.
                Trap: 4.90 BM (option C) is the value for Fe2+ (d6, n = 4). Always count unpaired electrons in the ion named, never in the neutral atom.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_26",
            chapterId = "chem_ch_5",
            subject = "Chemistry",
            topic = "Oxidation State in Dichromate",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 45,
            prompt = "The oxidation state of chromium in K2Cr2O7 is:",
            optionA = "+2",
            optionB = "+3",
            optionC = "+6",
            optionD = "+7",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Assign the known values: K is +1, O is -2, and the compound is neutral.
                Step 2: 2(+1) + 2(Cr) + 7(-2) = 0, so 2 + 2Cr - 14 = 0 and Cr = +6.
                Trap: +3 (option B) is the state chromium ENDS in after dichromate oxidises something (Cr3+ is the green product), not the state it starts in.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_27",
            chapterId = "chem_ch_5",
            subject = "Chemistry",
            topic = "Dichromate Titration Stoichiometry",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "20 mL of 0.05 M acidified K2Cr2O7 solution completely oxidises a sample of Fe2+ ions. The amount of Fe2+ oxidised is:",
            optionA = "0.001 mol",
            optionB = "0.003 mol",
            optionC = "0.006 mol",
            optionD = "0.012 mol",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Moles of dichromate = 0.020 L x 0.05 mol/L = 0.001 mol.
                Step 2: In acid, Cr2O7 2- + 14H+ + 6e- gives 2Cr3+ + 7H2O: each dichromate accepts 6 electrons.
                Step 3: Each Fe2+ donates exactly 1 electron (Fe2+ to Fe3+), so Fe2+ oxidised = 6 x 0.001 = 0.006 mol.
                Trap: 0.001 mol (option A) ignores the electron balance entirely — the 6:1 ratio is the heart of every dichromate titration.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_28",
            chapterId = "chem_ch_5",
            subject = "Chemistry",
            topic = "Permanganate in Different Media",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "When KMnO4 acts as an oxidising agent in neutral medium, the manganese product and the equivalent weight of KMnO4 (molar mass 158) are:",
            optionA = "Mn2+ and 31.6",
            optionB = "MnO2 and 52.7",
            optionC = "MnO4 2- and 158",
            optionD = "MnO2 and 31.6",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: In neutral (or weakly alkaline) medium, MnO4 - is reduced only to MnO2, a brown solid: Mn goes from +7 to +4.
                Step 2: Electrons gained per KMnO4 = 3, so equivalent weight = 158 / 3 = 52.7.
                Trap: 31.6 (options A and D) is the ACID-medium value, where 5 electrons are gained and the product is Mn2+. The equivalent weight of KMnO4 is meaningless unless the medium is named.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_29",
            chapterId = "chem_ch_5",
            subject = "Chemistry",
            topic = "Lanthanoid Contraction",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 45,
            prompt = "Which of the following is a consequence of the lanthanoid contraction?",
            optionA = "Atomic radii increase steadily from La to Lu",
            optionB = "Zr and Hf have nearly identical atomic radii",
            optionC = "The basicity of Ln(OH)3 increases from La to Lu",
            optionD = "4f electrons shield the nuclear charge very effectively",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: The contraction happens because 4f electrons shield POORLY (option D states the opposite), so effective nuclear charge rises and radii FALL from La to Lu (option A is backwards).
                Step 2: Hf comes immediately after the lanthanoids, so it is squeezed to almost exactly the size of Zr (159 pm vs 160 pm) — option B.
                Step 3: The shrinking Ln3+ ion also makes the hydroxides LESS basic along the series, so option C is backwards too.
                Trap: every wrong option states a true-sounding trend in the wrong direction — the contraction is a decrease caused by weak 4f shielding.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_chem_30",
            chapterId = "chem_ch_6",
            subject = "Chemistry",
            topic = "Crystal Field Theory — CFSE Calculation",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "The crystal field stabilisation energy (CFSE) of [Fe(CN)6]4- in an octahedral field is:",
            optionA = "-0.4 delta o",
            optionB = "-2.4 delta o",
            optionC = "-1.2 delta o",
            optionD = "-0.6 delta o",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Find the d count of the ION. The entity charge is 4-: x + 6(-1) = -4 gives Fe = +2, so Fe2+ is 3d6.
                Step 2: CN- is a strong-field ligand, so the complex is low-spin: all six electrons pair into the lower t2g set, giving t2g6 eg0.
                Step 3: CFSE = (-0.4 x 6) + (0.6 x 0) = -2.4 delta o (the pairing-energy correction is not included in this convention).
                Trap: -0.4 delta o (option A) is the HIGH-SPIN value (t2g4 eg2) you would get with a weak ligand like H2O. The spin verdict must come before the arithmetic.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_31",
            chapterId = "chem_ch_6",
            subject = "Chemistry",
            topic = "Valence Bond Theory — Magnetic Moment",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The spin-only magnetic moment of [CoF6]3- is:",
            optionA = "0 BM",
            optionB = "1.73 BM",
            optionC = "4.90 BM",
            optionD = "5.92 BM",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Co in [CoF6]3-: x + 6(-1) = -3 gives Co = +3, so Co3+ is 3d6.
                Step 2: F- is a weak-field ligand and cannot force pairing, so the complex is high-spin (outer-orbital, sp3d2) with n = 4 unpaired electrons.
                Step 3: mu = sqrt(n(n+2)) = sqrt(4 x 6) = sqrt(24) = 4.90 BM.
                Trap: 0 BM (option A) describes [Co(NH3)6]3+, where NH3 pairs all six electrons (d2sp3). Same Co3+ ion — the ligand decides the magnetism.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_32",
            chapterId = "chem_ch_6",
            subject = "Chemistry",
            topic = "Nomenclature of Coordination Compounds",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The IUPAC name of K4[Fe(CN)6] is:",
            optionA = "potassium hexacyanidoferrate(II)",
            optionB = "potassium hexacyanoferrate(II)",
            optionC = "potassium hexacyanidoferrate(III)",
            optionD = "potassium hexacyanidoiron(II)",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Oxidation state of Fe: 4(+1) + x + 6(-1) = 0 gives x = +2, so iron is Fe(II) — option C (ferrate(III)) is K3[Fe(CN)6], a different salt.
                Step 2: The entity [Fe(CN)6]4- is ANIONIC, so the metal takes the -ate name from its Latin root: ferrate, not iron — option D fails here.
                Step 3: The anionic ligand CN- is named cyanido in the current IUPAC/NCERT system, giving potassium hexacyanidoferrate(II).
                Trap: option B uses the older cyano spelling; the -ido form (chlorido, cyanido, hydroxido) is the current NCERT convention.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_33",
            chapterId = "chem_ch_6",
            subject = "Chemistry",
            topic = "Werner's Theory — Ionisation Sphere",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "One mole of the complex CoCl3.5NH3 is treated with excess AgNO3 solution. The number of moles of AgCl precipitated is:",
            optionA = "1",
            optionB = "2",
            optionC = "3",
            optionD = "0",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Apply Werner's theory: Co is +3 with coordination number 6, so the sphere takes 5 NH3 and 1 Cl: the formula is [Co(NH3)5Cl]Cl2.
                Step 2: Only chloride ions in the IONISATION sphere (outside the brackets) are free to react with Ag+. The inner Cl is bound by a secondary valency and also satisfies one primary valency, so it cannot precipitate.
                Step 3: Chlorides outside the sphere = 2, so 2 mol of AgCl precipitate per mole of complex.
                Trap: 3 (option C) counts every chlorine in the formula. Precipitation counts only the ionisable chlorides — the whole point of Werner's primary/secondary valency split.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_34",
            chapterId = "chem_ch_6",
            subject = "Chemistry",
            topic = "Optical Isomerism in Chelate Complexes",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 75,
            prompt = "Which of the following complexes exists as a pair of optical isomers (enantiomers)?",
            optionA = "trans-[Co(en)2Cl2]+",
            optionB = "cis-[Co(en)2Cl2]+",
            optionC = "[Cr(H2O)6]3+",
            optionD = "[Ni(CO)4]",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Optical activity needs chirality — no plane of symmetry, so the mirror image is non-superimposable. Chelate rings (en) twist an octahedron into a propeller shape, which is the classic source of chirality in complexes.
                Step 2: In cis-[Co(en)2Cl2]+ the two Cl ligands are adjacent and the en rings lock the ion into a chiral twist: it exists as d and l enantiomers.
                Step 3: The trans isomer (option A) has a plane of symmetry through the Cl-Co-Cl axis, so it is achiral and optically inactive. [Cr(H2O)6]3+ (option C) is fully symmetric, and tetrahedral [Ni(CO)4] (option D) has four identical ligands — both are achiral.
                Trap: geometrical isomerism and optical isomerism are independent checks. Of the cis/trans pair, it is the CIS form that is optically active here — the opposite of the guess most students make.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_chem_35",
            chapterId = "chem_ch_7",
            subject = "Chemistry",
            topic = "Hess's Law — Formation Enthalpy from Combustion Data",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 120,
            prompt = "The standard enthalpies of combustion of carbon, hydrogen and methane are -393.5, -285.8 and -890.3 kJ/mol respectively. The standard enthalpy of formation of methane is:",
            optionA = "+74.8 kJ/mol",
            optionB = "-74.8 kJ/mol",
            optionC = "+211.0 kJ/mol",
            optionD = "-1855.4 kJ/mol",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Hess's law — burn the elements and the compound to the same products (CO2 and H2O) and take the difference:
                ΔfH(CH4) = ΔcH(C) + 2 x ΔcH(H2) - ΔcH(CH4).
                Step 2: Substitute, honouring the coefficient 2 for hydrogen in CH4:
                = -393.5 + 2 x (-285.8) - (-890.3) = -965.1 + 890.3 = -74.8 kJ/mol.
                Trap: +211.0 kJ/mol (option C) comes from using only ONE mole of H2; +74.8 kJ/mol (option A) is the same calculation with the final sign flipped.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_36",
            chapterId = "chem_ch_7",
            subject = "Chemistry",
            topic = "First Law — Chemistry Sign Convention",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A system absorbs 500 J of heat from the surroundings and does 300 J of work on the surroundings. Using the chemistry sign convention, the change in internal energy of the system is:",
            optionA = "+800 J",
            optionB = "-200 J",
            optionC = "+200 J",
            optionD = "-800 J",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Assign signs by the chemistry convention (energy entering the system is positive):
                q = +500 J (heat absorbed by the system).
                Step 2: The system does work ON the surroundings, so work done ON the system is negative: w = -300 J.
                Step 3: First law: ΔU = q + w = 500 - 300 = +200 J.
                Trap: +800 J (option A) adds the magnitudes and ignores that the work stream flows OUT of the system. In the physics convention the same event reads ΔU = Q - W with W = +300 J — same answer, opposite bookkeeping.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_37",
            chapterId = "chem_ch_7",
            subject = "Chemistry",
            topic = "Enthalpy — Converting ΔU to ΔH",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 90,
            prompt = "For the reaction 2H2 (g) + O2 (g) gives 2H2O (l) at 298 K, the internal energy change is ΔU = -564.2 kJ for the reaction as written. The enthalpy change ΔH is:",
            optionA = "-571.6 kJ",
            optionB = "-564.2 kJ",
            optionC = "-556.8 kJ",
            optionD = "-566.7 kJ",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Count gaseous moles only: reactants 2 + 1 = 3 mol of gas; products are liquid water, 0 mol of gas. Δng = 0 - 3 = -3.
                Step 2: Apply ΔH = ΔU + Δng RT with RT = 8.314 x 298 / 1000 = 2.48 kJ/mol:
                ΔH = -564.2 + (-3)(2.48) = -564.2 - 7.4 = -571.6 kJ.
                Trap: -556.8 kJ (option C) applies the correction with the wrong sign; -566.7 kJ (option D) comes from a miscounted Δng of -1. Gas moles fall, so ΔH must be MORE negative than ΔU.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_38",
            chapterId = "chem_ch_7",
            subject = "Chemistry",
            topic = "Calorimetry — Bomb Calorimeter and ΔU",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 90,
            prompt = "When 0.5 mol of a fuel is burned completely in a bomb calorimeter, the temperature rises by 4.0 K. The heat capacity of the calorimeter assembly is 12.0 kJ/K. The molar internal energy change of combustion of the fuel is:",
            optionA = "-48 kJ/mol",
            optionB = "+96 kJ/mol",
            optionC = "-24 kJ/mol",
            optionD = "-96 kJ/mol",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: Heat absorbed by the calorimeter = C x ΔT = 12.0 x 4.0 = 48 kJ. This heat was released by burning 0.5 mol of fuel.
                Step 2: Scale to one mole: 48 / 0.5 = 96 kJ released per mole.
                Step 3: The bomb is rigid (constant volume), so no expansion work is done and the measured heat is qv = ΔU. Combustion releases energy, so the system's change is negative: ΔU = -96 kJ/mol.
                Trap: -48 kJ/mol (option A) forgets the per-mole scaling; +96 kJ/mol (option B) drops the sign — a temperature RISE in the calorimeter means the reaction LOST energy.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_39",
            chapterId = "chem_ch_7",
            subject = "Chemistry",
            topic = "Gibbs Energy and the Equilibrium Constant",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "For a reaction at 298 K, the standard Gibbs energy change is ΔG° = -11.4 kJ/mol. The equilibrium constant K is approximately:",
            optionA = "1 x 10^-2",
            optionB = "1 x 10^1",
            optionC = "1 x 10^2",
            optionD = "1 x 10^4",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Use ΔG° = -2.303 RT log K, rearranged as log K = -ΔG° / (2.303 RT).
                Step 2: At 298 K, 2.303 RT = 2.303 x 8.314 x 298 / 1000 = 5.71 kJ/mol — each 5.71 kJ/mol of negative ΔG° is worth one power of ten in K.
                Step 3: log K = 11.4 / 5.71 = 2.0, so K = 10^2 = 1 x 10^2. Products are favoured, as a negative ΔG° requires K > 1.
                Trap: 1 x 10^-2 (option A) inverts the sign relation — a negative ΔG° can never give K < 1.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_chem_40",
            chapterId = "chem_ch_8",
            subject = "Chemistry",
            topic = "Kp and Kc Conversion",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "For the reaction 2SO2(g) + O2(g) ⇌ 2SO3(g) at 1000 K, Kc = 3.5. The value of Kp (with pressures in atm) is:",
            optionA = "0.0426",
            optionB = "287",
            optionC = "3.50",
            optionD = "0.426",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Count dn, gases only: dn = 2 - (2 + 1) = -1.
                Step 2: Kp = Kc (RT)^dn = 3.5 x (0.0821 x 1000)^-1 = 3.5 / 82.1 = 0.0426.
                Trap: 287 (option B) comes from multiplying by RT instead of dividing — the sign of dn decides. 3.50 (option C) assumes Kp always equals Kc, which holds only when dn = 0.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_41",
            chapterId = "chem_ch_8",
            subject = "Chemistry",
            topic = "ICE Table — Equilibrium Concentration",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "For H2(g) + I2(g) ⇌ 2HI(g), Kc = 64. A vessel starts with [H2] = [I2] = 0.50 mol/L and no HI. The equilibrium concentration of HI is:",
            optionA = "0.40 mol/L",
            optionB = "0.64 mol/L",
            optionC = "0.80 mol/L",
            optionD = "0.90 mol/L",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: ICE — equilibrium values are [H2] = [I2] = 0.50 - x and [HI] = 2x.
                Step 2: Kc = (2x)^2 / (0.50 - x)^2 = 64. Take square roots: 2x / (0.50 - x) = 8, so 2x = 4 - 8x and x = 0.40.
                Step 3: [HI] = 2x = 0.80 mol/L.
                Trap: 0.40 (option A) is x, the amount CONSUMED of each reactant — the question asks for [HI], which is 2x. Always read off the species named, not the variable solved.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_42",
            chapterId = "chem_ch_8",
            subject = "Chemistry",
            topic = "pH of a Salt of Weak Base and Strong Acid",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 90,
            prompt = "The pH of a 0.10 mol/L solution of NH4Cl is: (Kb of NH3 = 1.8 x 10^-5)",
            optionA = "8.87",
            optionB = "7.00",
            optionC = "4.74",
            optionD = "5.13",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: NH4Cl is the salt of a weak base (NH3) and a strong acid (HCl), so the solution is acidic — NH4+ hydrolyses: NH4+ + H2O ⇌ NH3 + H3O+.
                Step 2: Ka of NH4+ = Kw / Kb = 10^-14 / (1.8 x 10^-5) = 5.6 x 10^-10.
                Step 3: [H3O+] = sqrt(Ka x C) = sqrt(5.6 x 10^-10 x 0.10) = sqrt(5.6 x 10^-11) = 7.5 x 10^-6, so pH = 5.13.
                Trap: 8.87 (option A) is the mirror-image error, treating NH4Cl as a basic salt; 4.74 (option C) is just pKb of ammonia with no hydrolysis calculation behind it.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_43",
            chapterId = "chem_ch_8",
            subject = "Chemistry",
            topic = "Solubility Product — Predicting Precipitation",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "Equal volumes of 2.0 x 10^-4 mol/L AgNO3 and 2.0 x 10^-4 mol/L NaCl are mixed. Ksp of AgCl = 1.8 x 10^-10. What happens?",
            optionA = "No precipitate forms, because Qsp is less than Ksp",
            optionB = "A precipitate of AgCl forms, because Qsp exceeds Ksp",
            optionC = "A precipitate forms only if the mixture is heated",
            optionD = "The solution becomes exactly saturated, with no precipitate",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Mixing equal volumes halves each concentration: [Ag+] = [Cl-] = 1.0 x 10^-4 mol/L in the mixture.
                Step 2: Qsp = [Ag+] [Cl-] = (1.0 x 10^-4)^2 = 1.0 x 10^-8.
                Step 3: Qsp (10^-8) is greater than Ksp (1.8 x 10^-10), so the mixture is supersaturated and AgCl precipitates until Qsp falls to Ksp.
                Trap: skipping the dilution step gives Qsp = 4 x 10^-8 — the verdict survives here, but in borderline questions the factor of 4 flips the answer. Dilute first, always.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_44",
            chapterId = "chem_ch_8",
            subject = "Chemistry",
            topic = "Effect of a Catalyst on Equilibrium",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 45,
            prompt = "A suitable catalyst is added to a gaseous reaction system that is already at equilibrium. The correct statement is:",
            optionA = "The equilibrium shifts toward the products",
            optionB = "The equilibrium constant K increases",
            optionC = "Both forward and reverse rates increase equally; the equilibrium composition and K remain unchanged",
            optionD = "The reverse reaction is slowed down by the catalyst",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: A catalyst lowers the activation energy of the forward and reverse reactions by the same amount, so both rate constants are multiplied by the same factor.
                Step 2: K = kf / kr is therefore unchanged, and since the rates were already equal at equilibrium, the composition does not move. The catalyst only shortens the journey when the system is disturbed — it cannot move the destination.
                Trap: options A and B fuse kinetics with thermodynamics. Speed is the catalyst's department; position and K belong to thermodynamics alone.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_chem_45",
            chapterId = "chem_ch_9",
            subject = "Chemistry",
            topic = "Oxidation Number — the Peroxide Trap",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The oxidation number of sulphur in H2S2O8 (peroxodisulphuric acid, which contains one O-O peroxide linkage) is:",
            optionA = "+7",
            optionB = "+6",
            optionC = "+8",
            optionD = "+4",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: The blind method fails here: 2(+1) + 2x + 8(-2) = 0 gives x = +7, but sulphur can never exceed +6 — its group maximum. That impossible answer is the alarm that a peroxide bond is hiding in the structure.
                Step 2: Score the two peroxide oxygens at -1 each and the other six at -2: 2(+1) + 2x + 6(-2) + 2(-1) = 0.
                Step 3: 2 + 2x - 12 - 2 = 0, so 2x = 12 and x = +6.
                Trap: +7 (option A) is exactly what the uncorrected algebra produces — always sanity-check an oxidation number against the element's maximum possible value.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_46",
            chapterId = "chem_ch_9",
            subject = "Chemistry",
            topic = "Fractional Oxidation Number",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 45,
            prompt = "The oxidation number of iron in Fe3O4 is:",
            optionA = "+2",
            optionB = "+3",
            optionC = "+8/3",
            optionD = "+4/3",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Apply the sum rule with oxygen at -2 and the compound neutral: 3x + 4(-2) = 0.
                Step 2: 3x = 8, so x = +8/3.
                Step 3: The fraction is an average, not a real charge: Fe3O4 is the mixed oxide FeO + Fe2O3, holding one Fe at +2 and two Fe at +3, and (2 + 3 + 3)/3 = 8/3.
                Trap: +2 and +3 (options A and B) each describe only part of the crystal; when a question asks for THE oxidation number in Fe3O4, the keyed answer is the average, +8/3.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_47",
            chapterId = "chem_ch_9",
            subject = "Chemistry",
            topic = "Types of Redox — Disproportionation",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "Which of the following is a disproportionation reaction?",
            optionA = "CH4 + 2O2 gives CO2 + 2H2O",
            optionB = "2H2O2 gives 2H2O + O2",
            optionC = "Zn + CuSO4 gives ZnSO4 + Cu",
            optionD = "CaCO3 gives CaO + CO2",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Disproportionation needs ONE element in ONE reactant species splitting both ways — part oxidised, part reduced.
                Step 2: In 2H2O2, oxygen starts at -1 and ends at -2 in H2O (reduced) and 0 in O2 (oxidised). Same element, same species, both directions — option B qualifies.
                Step 3: Option A is combustion (two different elements change), option C is displacement, and option D is not redox at all — no oxidation number changes when CaCO3 decomposes.
                Trap: a decomposition is not automatically a disproportionation; even 2KClO3 giving 2KCl + 3O2 fails the test because chlorine only falls while oxygen only rises.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_48",
            chapterId = "chem_ch_9",
            subject = "Chemistry",
            topic = "Balancing — Electron Equality in Acid",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 75,
            prompt = "In acidic medium, the number of Fe2+ ions oxidised by one MnO4- ion is:",
            optionA = "1",
            optionB = "3",
            optionC = "5",
            optionD = "10",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Reduction half in acid: MnO4- + 8H+ + 5e- gives Mn2+ + 4H2O. Manganese falls from +7 to +2, so one MnO4- consumes exactly 5 electrons.
                Step 2: Oxidation half: Fe2+ gives Fe3+ + e-. Each Fe2+ supplies exactly 1 electron.
                Step 3: Electrons lost must equal electrons gained, so 5 Fe2+ are needed per MnO4- — the full equation is MnO4- + 5Fe2+ + 8H+ gives Mn2+ + 5Fe3+ + 4H2O (charge audit: +17 on both sides).
                Trap: 1 (option A) matches formula units instead of electrons — in redox stoichiometry the electron ledger, not the formula count, sets the ratio.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_49",
            chapterId = "chem_ch_9",
            subject = "Chemistry",
            topic = "Balancing in Basic Medium",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "When the half-reaction MnO4- to MnO2 is balanced in basic medium, the correctly balanced half-equation is:",
            optionA = "MnO4- + 4H+ + 3e- gives MnO2 + 2H2O",
            optionB = "MnO4- + 2H2O + 3e- gives MnO2 + 4OH-",
            optionC = "MnO4- + 2H2O gives MnO2 + 4OH- + 3e-",
            optionD = "MnO4- + 4OH- gives MnO2 + 2H2O + 3e-",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Audit option B: atoms — Mn 1/1, O 4 + 2 = 6 on the left and 2 + 4 = 6 on the right, H 4/4. Charge — left: -1 + 0 - 3 = -4; right: -4. Atoms and charge both balance, and the electrons sit on the reactant side as a reduction demands.
                Step 2: Option A is balanced too, but it is the ACID-medium form — it contains H+, which cannot survive in a basic solution.
                Step 3: Options C and D place the electrons on the product side, which would describe an oxidation; MnO4- to MnO2 is a reduction (Mn falls +7 to +4), so electrons must be consumed, not produced.
                Trap: in basic medium the permanganate half carries 3 electrons and stops at MnO2 — do not import the 5-electron, Mn2+ version from acidic titrations.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_chem_50",
            chapterId = "chem_ch_10",
            subject = "Chemistry",
            topic = "Concentration — Molarity from Mass Percent and Density",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 90,
            prompt = "An aqueous NaOH solution is 10% by mass and has a density of 1.11 g/mL. Its molarity is (molar mass of NaOH = 40 g/mol):",
            optionA = "2.50 mol/L",
            optionB = "2.25 mol/L",
            optionC = "2.78 mol/L",
            optionD = "3.11 mol/L",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Take a basis of 100 g of solution. It contains 10 g NaOH = 10/40 = 0.25 mol.
                Step 2: Volume of 100 g of solution = mass/density = 100/1.11 = 90.1 mL = 0.0901 L.
                Step 3: Molarity = 0.25 / 0.0901 = 2.78 mol/L.
                (Shortcut check: M = (mass percent x density x 10) / molar mass = (10 x 1.11 x 10)/40 = 2.78 mol/L.)
                Trap: 2.50 mol/L (option A) comes from treating 100 g of solution as 100 mL — ignoring the density. The density is given precisely because the mass-to-volume bridge is the heart of the question.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_51",
            chapterId = "chem_ch_10",
            subject = "Chemistry",
            topic = "Henry's Law",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The Henry's law constant for CO2 in water at 298 K is 1.67 x 10^8 Pa. The mole fraction of CO2 in soda water packed under a CO2 pressure of 2.53 x 10^5 Pa is:",
            optionA = "1.5 x 10^-3",
            optionB = "1.5 x 10^-2",
            optionC = "3.0 x 10^-3",
            optionD = "6.6 x 10^-4",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Henry's law: p = K_H x, so x = p / K_H.
                Step 2: x = (2.53 x 10^5) / (1.67 x 10^8) = 1.51 x 10^-3, about 1.5 x 10^-3.
                Trap: a large K_H means LOW solubility, not high — the constant sits in the denominator when you solve for the dissolved fraction. Option B is the same digits with the power of ten slipped, the classic Henry's law distractor.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_52",
            chapterId = "chem_ch_10",
            subject = "Chemistry",
            topic = "Freezing Point Depression with van't Hoff Factor",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "A 0.1 molal aqueous solution of KBr has a van't Hoff factor of 1.9. The depression in its freezing point is (K_f of water = 1.86 K kg/mol):",
            optionA = "0.186 K",
            optionB = "0.353 K",
            optionC = "0.372 K",
            optionD = "0.177 K",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: For an electrolyte, the modified formula is Delta T_f = i x K_f x m.
                Step 2: Delta T_f = 1.9 x 1.86 x 0.1 = 0.353 K.
                Trap: 0.186 K (option A) ignores the van't Hoff factor entirely, and 0.372 K (option C) uses the idealised i = 2 instead of the measured 1.9 given in the question. When a problem hands you an observed i, that value overrules the ideal ion count.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_53",
            chapterId = "chem_ch_10",
            subject = "Chemistry",
            topic = "Molar Mass from Boiling Point Elevation",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 90,
            prompt = "1.0 g of a non-volatile solute dissolved in 100 g of water raises the boiling point by 0.10 K. The molar mass of the solute is (K_b of water = 0.52 K kg/mol):",
            optionA = "26 g/mol",
            optionB = "52 g/mol",
            optionC = "104 g/mol",
            optionD = "5.2 g/mol",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Delta T_b = K_b x molality, and M_B = (K_b x w_B x 1000) / (Delta T_b x w_A) with masses in grams.
                Step 2: M_B = (0.52 x 1.0 x 1000) / (0.10 x 100) = 520 / 10 = 52 g/mol.
                Trap: 5.2 g/mol (option D) drops the factor of 1000 that converts the solvent mass from grams to kilograms; 104 g/mol (option C) doubles by using 200 g of solvent. The 1000 in the formula is not decoration.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_54",
            chapterId = "chem_ch_10",
            subject = "Chemistry",
            topic = "Ideal and Non-Ideal Solutions",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "Which of the following liquid pairs forms an ideal solution (obeying Raoult's law over the whole composition range)?",
            optionA = "Ethanol and water",
            optionB = "Chloroform and acetone",
            optionC = "Benzene and toluene",
            optionD = "Water and hydrochloric acid",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: An ideal solution needs A-B attractions nearly equal to A-A and B-B attractions, giving Delta H_mix = 0 and Delta V_mix = 0.
                Step 2: Benzene and toluene are near-identical molecules (toluene is benzene with one methyl group), so they mix ideally.
                Trap: chloroform + acetone (option B) is the famous NEGATIVE deviation — a new hydrogen bond forms between them. Ethanol + water (option A) shows POSITIVE deviation, and water + HCl (option D) deviates negatively. Only the look-alike pair is ideal.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_chem_55",
            chapterId = "chem_ch_11",
            subject = "Chemistry",
            topic = "Nernst Equation — Cell EMF at Non-Standard Concentrations",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 90,
            prompt = "The EMF of the cell Zn | Zn2+ (0.01 M) || Cu2+ (1 M) | Cu at 298 K is (E0cell = 1.10 V):",
            optionA = "1.04 V",
            optionB = "1.10 V",
            optionC = "1.16 V",
            optionD = "1.22 V",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: The cell reaction is Zn + Cu2+ gives Zn2+ + Cu, with n = 2. The reaction quotient is Q = [Zn2+] / [Cu2+] = 0.01 / 1 = 0.01 (the solid electrodes never enter Q).
                Step 2: Nernst equation at 298 K: E = E0 - (0.0591 / n) log Q = 1.10 - (0.0591 / 2) x log (0.01).
                Step 3: log (0.01) = -2, so E = 1.10 - 0.02955 x (-2) = 1.10 + 0.0591 = 1.16 V.
                Trap: 1.04 V (option A) comes from dropping the minus sign in log Q and subtracting the correction. A reactant-rich, product-poor cell (Q less than 1) must push HARDER than the standard cell, so the EMF has to rise above 1.10 V — let that direction check veto the wrong sign before you compute.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_56",
            chapterId = "chem_ch_11",
            subject = "Chemistry",
            topic = "Faraday's Laws — Time Needed for Electrodeposition",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 120,
            prompt = "How long must a current of 5 A be passed through a CuSO4 solution to deposit 2.54 g of copper at the cathode? (Cu = 63.5 g/mol, F = 96500 C/mol)",
            optionA = "772 s",
            optionB = "1544 s",
            optionC = "3088 s",
            optionD = "386 s",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Moles of copper required = 2.54 / 63.5 = 0.04 mol.
                Step 2: The cathode reaction Cu2+ + 2e- gives Cu needs n = 2 electrons per atom, so moles of electrons = 2 x 0.04 = 0.08 mol.
                Step 3: Charge needed Q = 0.08 x 96500 = 7720 C. Time = Q / I = 7720 / 5 = 1544 s.
                Trap: 772 s (option A) is what you get by forgetting that each Cu2+ ion consumes TWO electrons — the n of the discharge half-reaction is the most-dropped factor in Faraday problems. 3088 s (option C) doubles the error in the other direction by using n = 4.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_57",
            chapterId = "chem_ch_11",
            subject = "Chemistry",
            topic = "Standard EMF and the Equilibrium Constant",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 90,
            prompt = "A cell reaction involving the transfer of 1 electron has E0cell = 0.59 V at 298 K. The equilibrium constant of the reaction is about:",
            optionA = "10^2",
            optionB = "10^5",
            optionC = "10^20",
            optionD = "10^10",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: Combine Delta G0 = -nFE0cell with Delta G0 = -RT ln K to get log K = (n x E0cell) / 0.0591 at 298 K.
                Step 2: log K = (1 x 0.59) / 0.0591 = 9.98, essentially 10.
                Step 3: K = 10^10.
                Trap: 10^5 (option B) halves the exponent — usually by confusing 0.0591 V with the 0.118 V that a two-electron decade would cost, or by halving E0 for no reason. Every 0.0591 V per electron transferred buys exactly one power of ten in K; count the electrons, then count the decades.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_58",
            chapterId = "chem_ch_11",
            subject = "Chemistry",
            topic = "Kohlrausch's Law — Lambda0 of a Weak Electrolyte",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 90,
            prompt = "Given Lambda0(NH4Cl) = 149.7, Lambda0(NaOH) = 248.1 and Lambda0(NaCl) = 126.4 S cm2/mol, the value of Lambda0(NH4OH) is:",
            optionA = "271.4 S cm2/mol",
            optionB = "397.8 S cm2/mol",
            optionC = "123.4 S cm2/mol",
            optionD = "524.2 S cm2/mol",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: NH4OH is a weak electrolyte, so its Lambda0 cannot be found by extrapolating its own dilution curve. Use Kohlrausch's law of independent migration and assemble it from strong electrolytes.
                Step 2: Lambda0(NH4OH) = Lambda0(NH4Cl) + Lambda0(NaOH) - Lambda0(NaCl), because the Na+ and Cl- contributions cancel, leaving NH4+ plus OH-.
                Step 3: = 149.7 + 248.1 - 126.4 = 271.4 S cm2/mol.
                Trap: 524.2 (option D) adds all three electrolytes, double-counting Na+ and Cl- instead of cancelling them; 397.8 (option B) forgets the subtraction altogether. Always do the ion inventory: each target ion exactly once, each spectator ion zero times.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_59",
            chapterId = "chem_ch_11",
            subject = "Chemistry",
            topic = "Electrolysis of Aqueous NaCl — Preferential Discharge",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "Concentrated aqueous NaCl is electrolysed using platinum electrodes. The products formed at the cathode and anode respectively are:",
            optionA = "Na and Cl2",
            optionB = "H2 and O2",
            optionC = "H2 and Cl2",
            optionD = "Na and O2",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: At the cathode, Na+ competes with water. Na+ is far harder to reduce (E0 = -2.71 V), so water is reduced instead and H2 is evolved — sodium metal is never deposited from an aqueous solution.
                Step 2: At the anode, Cl- competes with water. In CONCENTRATED brine the high chloride concentration wins the discharge contest, so Cl2 is evolved. (In dilute solution water would win and O2 would form instead.)
                Step 3: Cathode product H2, anode product Cl2 — this is the chlor-alkali process, which also leaves NaOH behind in solution.
                Trap: option A is the molten-NaCl answer transplanted into water; the presence of water changes the cathode contest completely. Option B is the DILUTE-brine answer — the word concentrated in the question is the hinge the whole problem swings on.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_chem_60",
            chapterId = "chem_ch_12",
            subject = "Chemistry",
            topic = "Order from Initial-Rate Data",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "For the reaction A + B gives products, initial rates were measured at 298 K: experiment 1: [A] = 0.20 mol L-1, [B] = 0.10 mol L-1, rate = 4.0 x 10^-4 mol L-1 s-1; experiment 2: [A] = 0.40 mol L-1, [B] = 0.10 mol L-1, rate = 8.0 x 10^-4 mol L-1 s-1; experiment 3: [A] = 0.20 mol L-1, [B] = 0.30 mol L-1, rate = 3.6 x 10^-3 mol L-1 s-1. The overall order of the reaction is:",
            optionA = "2",
            optionB = "3",
            optionC = "4",
            optionD = "1",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Experiments 1 to 2 change only [A]: doubling [A] doubles the rate (4.0 to 8.0 x 10^-4), so the order in A is 1.
                Step 2: Experiments 1 to 3 change only [B]: tripling [B] multiplies the rate by 3.6 x 10^-3 / 4.0 x 10^-4 = 9 = 3^2, so the order in B is 2.
                Step 3: Overall order = 1 + 2 = 3. Cross-check with units: k = 4.0 x 10^-4 / (0.20 x 0.10^2) = 0.20 L^2 mol^-2 s-1, and L^2 mol^-2 s-1 is exactly the unit signature of a third-order constant.
                Trap: reading the orders off the equation A + B (which suggests 1 + 1 = 2, option A) — orders come from the data table, never from the stoichiometric coefficients.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_61",
            chapterId = "chem_ch_12",
            subject = "Chemistry",
            topic = "First-Order Half-Life",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "A first-order reaction has a half-life of 30 minutes. The time needed for the reactant concentration to fall to 1/16 of its initial value is:",
            optionA = "60 minutes",
            optionB = "90 minutes",
            optionC = "120 minutes",
            optionD = "150 minutes",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Each half-life multiplies the remaining fraction by 1/2, so after m half-lives the fraction left is (1/2)^m.
                Step 2: Set (1/2)^m = 1/16 = (1/2)^4, giving m = 4 half-lives.
                Step 3: Time = 4 x 30 = 120 minutes. This works because the first-order half-life is constant — it does not shrink or grow as the reaction proceeds.
                Trap: 60 minutes (option A) is only two half-lives, which leaves 1/4, not 1/16; the fraction must be converted into a power of 1/2 before any time is computed.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_62",
            chapterId = "chem_ch_12",
            subject = "Chemistry",
            topic = "Units of the Rate Constant",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 45,
            prompt = "The rate constant of a reaction has units L^2 mol^-2 s^-1. The order of the reaction is:",
            optionA = "3",
            optionB = "2",
            optionC = "1",
            optionD = "Zero",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: For overall order n, the units of k are (mol L-1)^(1-n) s-1, because rate = k x (concentration)^n must always come out in mol L-1 s-1.
                Step 2: The given units carry concentration to the power -2, so 1 - n = -2, which gives n = 3.
                Step 3: Sanity ladder: order 0 gives mol L-1 s-1, order 1 gives s-1, order 2 gives L mol-1 s-1, order 3 gives L^2 mol^-2 s-1. The given units sit on the third rung.
                Trap: counting the exponent 2 in L^2 and answering order 2 (option B) — the exponent on the concentration unit is (1 - n), not n itself.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_63",
            chapterId = "chem_ch_12",
            subject = "Chemistry",
            topic = "Arrhenius Equation — Temperature Jump",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "The activation energy of a reaction is 50 kJ mol-1. The ratio of its rate constants at 310 K and 300 K, k(310 K) / k(300 K), is approximately:",
            optionA = "1.2",
            optionB = "1.9",
            optionC = "3.8",
            optionD = "10",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Use the two-temperature Arrhenius form: ln(k2/k1) = (Ea/R) x (1/T1 - 1/T2), with T1 = 300 K and T2 = 310 K (kelvin, never Celsius).
                Step 2: 1/300 - 1/310 = 10 / 93,000 = 1.075 x 10^-4 K-1, and Ea/R = 50,000 / 8.314 = 6014 K. Their product is 6014 x 1.075 x 10^-4 = 0.647.
                Step 3: k2/k1 = e^0.647 = 1.91, about 1.9 — the familiar near-doubling per 10 K that a barrier around 50 kJ mol-1 produces at room temperature.
                Trap: 1.02 would be the collision-frequency factor sqrt(310/300) alone; it is the exponential fraction of energetic molecules, not the collision count, that delivers the factor of about 2.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_64",
            chapterId = "chem_ch_12",
            subject = "Chemistry",
            topic = "Zero-Order Completion Time",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A zero-order reaction has rate constant k = 4.0 x 10^-3 mol L-1 s-1 and initial reactant concentration 0.80 mol L-1. The time taken for complete decomposition of the reactant is:",
            optionA = "50 s",
            optionB = "100 s",
            optionC = "400 s",
            optionD = "200 s",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: For zero order the integrated law is [R] = [R]0 - kt: the concentration falls by the same amount every second, so the tank empties in finite time.
                Step 2: Set [R] = 0: t = [R]0 / k = 0.80 / 4.0 x 10^-3 = 200 s.
                Step 3: Check the halfway point: at 100 s, [R] = 0.80 - 4.0 x 10^-3 x 100 = 0.40 mol L-1, exactly half — consistent with completion at 200 s.
                Trap: 100 s (option B) is the half-life [R]0/(2k), not the completion time; and a first-order reaction would never complete at all — the finite finish is a zero-order signature.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_chem_65",
            chapterId = "chem_ch_13",
            subject = "Chemistry",
            topic = "Carbocation Stability — Resonance vs Hyperconjugation",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "Which of the following carbocations is the most stable?",
            optionA = "(CH3)3C+",
            optionB = "CH3CH2+",
            optionC = "(C6H5)3C+",
            optionD = "C6H5CH2+",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Sort by stabilisation mechanism. CH3CH2+ is a primary alkyl cation held up only by 3 alpha-H hyperconjugation; (CH3)3C+ is tertiary with 9 alpha-H, the top of the ALKYL ladder.
                Step 2: C6H5CH2+ (benzyl) spreads its charge into one benzene ring by resonance, which beats hyperconjugation, so it outranks the tert-butyl cation.
                Step 3: (C6H5)3C+ (triphenylmethyl, trityl) delocalises the charge over THREE rings — the most resonance contributors of the set, stable enough to exist as an isolable salt.
                Trap: (CH3)3C+ (option A) wins only inside the alkyl family. The moment a resonance-stabilised cation enters the options, counting methyl groups stops being the deciding rule.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_66",
            chapterId = "chem_ch_13",
            subject = "Chemistry",
            topic = "Acid Strength — Substituent Effects on Benzoic Acid",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "Which of the following is the strongest acid?",
            optionA = "p-methoxybenzoic acid",
            optionB = "p-nitrobenzoic acid",
            optionC = "benzoic acid",
            optionD = "p-methylbenzoic acid",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Acidity is decided by the stability of the carboxylate anion left behind. Anything that withdraws electrons from -COO- stabilises it and strengthens the acid.
                Step 2: The -NO2 group withdraws by BOTH -I and -R, so p-nitrobenzoic acid (pKa 3.41) is clearly stronger than benzoic acid itself (pKa 4.20).
                Step 3: -CH3 donates weakly (+I and hyperconjugation, pKa 4.37) and -OCH3 donates strongly by resonance (+R beats its -I, pKa 4.47); both destabilise the anion and weaken the acid.
                Trap: option A tempts students who remember oxygen is electronegative. For -OCH3 attached to a ring, resonance donation wins over inductive withdrawal — the methoxy acid is the WEAKEST of the four, not the strongest.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_67",
            chapterId = "chem_ch_13",
            subject = "Chemistry",
            topic = "Kjeldahl's Method — Back-Titration Calculation",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "0.5 g of an organic compound is analysed by Kjeldahl's method. The ammonia liberated is absorbed in 50 mL of 0.1 M H2SO4, and the excess acid requires 30 mL of 0.1 M NaOH for neutralisation. The percentage of nitrogen in the compound is:",
            optionA = "11.2",
            optionB = "28.0",
            optionC = "5.6",
            optionD = "19.6",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: Work in milliequivalents. Total acid taken = 50 x 0.1 x 2 = 10 meq (H2SO4 is diprotic, so 0.1 M = 0.2 N).
                Step 2: Acid left over = NaOH used = 30 x 0.1 = 3 meq. So acid consumed by NH3 = 10 - 3 = 7 meq, which equals 7 mmol of NH3.
                Step 3: Mass of nitrogen = 7 x 14 = 98 mg = 0.098 g. Percentage = 1.4 x 7 / 0.5 = 19.6 per cent.
                Trap: 28.0 (option B) ignores the back-titration and credits all 10 meq to ammonia; 11.2 subtracts raw volumes (50 - 30 mL) before converting; 5.6 forgets that H2SO4 is diprotic. Each distractor is one specific slip.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_68",
            chapterId = "chem_ch_13",
            subject = "Chemistry",
            topic = "IUPAC Nomenclature — Polyfunctional Compounds",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 45,
            prompt = "The IUPAC name of CH3-CO-CH2-CH2-COOH is:",
            optionA = "4-oxopentanoic acid",
            optionB = "4-ketopentanoic acid",
            optionC = "3-acetylpropanoic acid",
            optionD = "pentanoic-4-one acid",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Two carbonyl groups compete for the suffix. Seniority order puts the carboxylic acid far above the ketone, so the suffix is -oic acid and the ketone must demote to a prefix.
                Step 2: The prefix for a =O group is oxo- (never keto- in systematic IUPAC). Number from the acid carbon as C1: the oxo group lands on C4 of a five-carbon chain.
                Step 3: Assembled name: 4-oxopentanoic acid.
                Trap: option C keeps a three-carbon parent (propanoic acid) with an acetyl substituent — but the parent chain must be the LONGEST chain containing the principal group, and the five-carbon chain wins.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_69",
            chapterId = "chem_ch_13",
            subject = "Chemistry",
            topic = "Lassaigne's Test — Nitrogen and Sulphur Together",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 45,
            prompt = "An organic compound containing both nitrogen and sulphur gives a blood-red colouration with FeCl3 in Lassaigne's test. This is because the sodium extract contains:",
            optionA = "sodium cyanide",
            optionB = "sodium thiocyanate",
            optionC = "ferric ferrocyanide",
            optionD = "sodium sulphide",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: On fusion with sodium, carbon, nitrogen and sulphur of the compound combine into a single product: Na + C + N + S gives sodium thiocyanate, NaCNS — not separate NaCN and Na2S.
                Step 2: Fe3+ ions react with CNS- to form the blood-red ferric thiocyanate complex, which is the observed colour.
                Step 3: Because the cyanide is locked up as thiocyanate, such a compound does NOT give the Prussian blue test for nitrogen — the red colour is itself the joint test for N and S together.
                Trap: ferric ferrocyanide (option C) is Prussian blue, the product of the NITROGEN-ONLY test with FeSO4 and acid; it is blue, not red, and is never present in the extract itself.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_chem_70",
            chapterId = "chem_ch_14",
            subject = "Chemistry",
            topic = "Ozonolysis — Identifying the Alkene",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "An alkene A on ozonolysis (O3, followed by Zn/H2O) gives ethanal as the ONLY organic product. Alkene A is:",
            optionA = "Propene",
            optionB = "But-2-ene",
            optionC = "But-1-ene",
            optionD = "2-Methylpropene",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Ozonolysis slices the C=C and caps each carbon with oxygen: a =CH-R carbon gives the aldehyde R-CHO, a =CH2 carbon gives methanal, a =C(R)2 carbon gives a ketone.
                Step 2: Ethanal comes from a =CH-CH3 fragment. Getting ethanal and NOTHING else means both halves of the double bond were =CH-CH3 — the alkene is symmetrical: CH3-CH=CH-CH3.
                Trap: propene (option A) gives methanal plus ethanal, but-1-ene (option C) gives methanal plus propanal, and 2-methylpropene (option D) gives methanal plus propanone. Only but-2-ene yields a single product.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_71",
            chapterId = "chem_ch_14",
            subject = "Chemistry",
            topic = "Peroxide Effect — Anti-Markovnikov Addition",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "Propene is treated with HBr in the presence of an organic peroxide. The major product is:",
            optionA = "1-Bromopropane",
            optionB = "2-Bromopropane",
            optionC = "1,2-Dibromopropane",
            optionD = "3-Bromopropene (allyl bromide)",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Peroxide switches HBr addition from the ionic pathway to a radical chain — the Kharasch (peroxide) effect.
                Step 2: The Br radical adds FIRST, bonding to the terminal CH2 so that the unpaired electron is left on the more stable secondary carbon. That radical then abstracts H from HBr, so bromine finishes on the LESS substituted carbon.
                Trap: 2-bromopropane (option B) is the Markovnikov product of HBr WITHOUT peroxide. 1,2-Dibromopropane (option C) needs Br2, not HBr, and allyl bromide (option D) comes from substitution at high temperature, not addition.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_72",
            chapterId = "chem_ch_14",
            subject = "Chemistry",
            topic = "Wurtz Reaction — Its Limitation",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 45,
            prompt = "Which of the following alkanes CANNOT be obtained in pure form by the Wurtz reaction?",
            optionA = "Ethane",
            optionB = "n-Butane",
            optionC = "Propane",
            optionD = "n-Hexane",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: The Wurtz reaction couples two IDENTICAL alkyl fragments: 2 R-X + 2 Na (dry ether) gives R-R. The product always has an even number of carbons in a symmetrical skeleton.
                Step 2: Ethane (from CH3-X), n-butane (from C2H5-X) and n-hexane (from C3H7-X) are all clean single couplings. Propane has an odd carbon count, so it would need CH3-X plus C2H5-X together — and those couple randomly to ethane, propane AND butane, an inseparable mixture.
                Trap: propane CAN be made by decarboxylation of sodium butanoate or by hydrogenation of propene — it is specifically the Wurtz route that fails. Methane fails even harder: no coupling can produce a single carbon.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_73",
            chapterId = "chem_ch_14",
            subject = "Chemistry",
            topic = "Directive Influence — Meta Director",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "Nitrobenzene is nitrated with concentrated HNO3 and concentrated H2SO4 under forcing conditions. The major product is:",
            optionA = "o-Dinitrobenzene",
            optionB = "1,3,5-Trinitrobenzene",
            optionC = "p-Dinitrobenzene",
            optionD = "m-Dinitrobenzene",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: The -NO2 group is strongly electron-withdrawing (-I and -R), so it deactivates the ring — forcing conditions are needed at all — and it is a META director.
                Step 2: For ortho or para attack, one resonance form of the arenium ion would place positive charge on the carbon bonded to NO2, next to the electron-poor nitrogen — a very unstable arrangement. Meta attack avoids that form entirely, so the second NO2 group enters meta.
                Trap: options A and C treat -NO2 like an ordinary ortho/para director. Trinitration (option B) does not occur under these conditions; each NO2 makes the next substitution slower and harder.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_74",
            chapterId = "chem_ch_14",
            subject = "Chemistry",
            topic = "Acidity of Terminal Alkynes — Silver Nitrate Test",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "Which of the following compounds gives a white precipitate with ammoniacal silver nitrate solution?",
            optionA = "But-2-yne",
            optionB = "But-1-yne",
            optionC = "But-1-ene",
            optionD = "Butane",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: The test detects the acidic hydrogen of a TERMINAL alkyne: the sp-hybridised carbon (50 percent s character) stabilises the acetylide anion, so the C-H proton can be removed and the insoluble silver acetylide precipitates as a white solid.
                Step 2: But-1-yne, CH3-CH2-C triple-bond CH, carries that terminal hydrogen. But-2-yne is an internal alkyne with no hydrogen on either sp carbon, so it gives no precipitate.
                Trap: but-1-ene (option C) is unsaturated and decolourises bromine water, but its vinylic C-H (sp2, pKa about 44) is nowhere near acidic enough for this test. Unsaturation alone is not acidity — the terminal alkyne C-H is the special case.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_chem_75",
            chapterId = "chem_ch_15",
            subject = "Chemistry",
            topic = "SN1 Reactivity — Carbocation Stability Order",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "Which of the following alkyl halides undergoes SN1 hydrolysis at the fastest rate?",
            optionA = "CH3CH2Cl",
            optionB = "(CH3)2CHCl",
            optionC = "(CH3)3CCl",
            optionD = "CH3Cl",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: In SN1 the rate-determining step is ionisation of the C-X bond to a carbocation, so the rate follows carbocation stability exactly.
                Step 2: Carbocation stability runs 3 degree > 2 degree > 1 degree > methyl, because alkyl groups stabilise the positive charge by hyperconjugation and the inductive effect. (CH3)3CCl gives the tertiary cation, stabilised by nine alpha C-H bonds.
                Step 3: Therefore (CH3)3CCl ionises fastest and hydrolyses fastest.
                Trap: CH3CH2Cl (option A) and CH3Cl (option D) would lead under SN2 conditions — importing the SN2 order into an SN1 question is the classic error. Name the mechanism first, then recite its order.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_76",
            chapterId = "chem_ch_15",
            subject = "Chemistry",
            topic = "SN2 Stereochemistry — Walden Inversion",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "Optically pure (R)-2-bromobutane is treated with hydroxide under conditions that favour SN2. The product is:",
            optionA = "(R)-butan-2-ol, formed with retention of configuration",
            optionB = "(S)-butan-2-ol, formed with inversion of configuration",
            optionC = "Racemic butan-2-ol, optically inactive",
            optionD = "But-2-ene, by elimination",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: SN2 proceeds by backside attack: the nucleophile enters opposite the leaving group and the three remaining groups flip like an umbrella — Walden inversion. The spatial arrangement at carbon always inverts in SN2.
                Step 2: Check whether the R/S label flips too. In the reactant the priorities are Br (1), ethyl (2), methyl (3), H (4); in the product they are OH (1), ethyl (2), methyl (3), H (4) — the same ranking, so the spatial flip also flips the label from R to S.
                Step 3: The product is a single enantiomer, (S)-butan-2-ol, still optically active.
                Trap: racemic butan-2-ol (option C) is the SN1 outcome, where a planar carbocation is attacked from both faces. Retention (option A) does not occur in a clean SN2.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_77",
            chapterId = "chem_ch_15",
            subject = "Chemistry",
            topic = "Ambident Nucleophiles — KCN versus AgCN",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "Ethyl bromide reacts with alcoholic KCN to give mainly propanenitrile. With alcoholic AgCN instead, it gives mainly:",
            optionA = "Propanenitrile itself",
            optionB = "Nitroethane",
            optionC = "Ethyl nitrite",
            optionD = "Ethyl isocyanide",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: Cyanide is an ambident nucleophile — it can bond through carbon or through nitrogen, and the reagent decides which.
                Step 2: KCN is ionic, so the free cyanide ion attacks through carbon (forming the stronger C-C bond), giving the nitrile R-CN.
                Step 3: AgCN is covalent: silver is bound to the carbon end and blocks it, so the nitrogen lone pair attacks instead, giving the isocyanide R-NC — here, ethyl isocyanide.
                Trap: nitroethane (option B) is the AgNO2 product and ethyl nitrite (option C) is the KNO2 product — the nitrite fork is the mirror image of this one. With silver salts, the atom NOT tied to silver does the bonding.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_78",
            chapterId = "chem_ch_15",
            subject = "Chemistry",
            topic = "Haloarenes — Resonance and the Short C-Cl Bond",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "Chlorobenzene, unlike an alkyl chloride, resists nucleophilic substitution under ordinary conditions mainly because:",
            optionA = "Resonance gives the C-Cl bond partial double-bond character, making it shorter and stronger",
            optionB = "Chlorine is less electronegative when attached to a benzene ring",
            optionC = "Chlorobenzene is insoluble in every solvent",
            optionD = "The benzene ring repels electrophiles as well as nucleophiles",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: A lone pair on chlorine conjugates with the ring pi system, so several resonance contributors carry a C=Cl double bond. Averaged, the real bond is part double — and partial double bonds are shorter and stronger.
                Step 2: The evidence is the bond length: C-Cl in chlorobenzene is about 169 pm versus about 178 pm in CH3Cl. The sp2 ring carbon (33 percent s-character) also grips the bond tighter than an sp3 carbon.
                Step 3: Two more locks support the main reason: the phenyl cation needed for SN1 is too unstable, and the backside attack needed for SN2 would have to come through the ring itself.
                Trap: option D overreaches — the ring still undergoes ELECTROPHILIC substitution readily (halogens are ortho/para directors). The inertness is specifically towards nucleophilic substitution at the C-Cl carbon.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_79",
            chapterId = "chem_ch_15",
            subject = "Chemistry",
            topic = "Grignard Reagent — the Moisture Trap",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A student prepares CH3MgBr in dry ether but accidentally adds a few drops of water before using it. The organic product formed from the reagent is:",
            optionA = "Methanol",
            optionB = "Methane",
            optionC = "Ethane",
            optionD = "Ethanoic acid",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: In a Grignard reagent the C-Mg bond is polarised towards carbon, so the methyl group behaves like a carbanion — an extremely strong base.
                Step 2: Water is acidic enough to protonate it instantly: CH3MgBr + H2O gives CH4 + Mg(OH)Br. The reagent dies as the hydrocarbon corresponding to its alkyl group.
                Step 3: So the organic product is methane, and this is exactly why Grignard reactions demand dry ether and dry glassware.
                Trap: ethanoic acid (option D) needs CO2 followed by acid workup — no CO2 is present here. Ethane (option C) would be the quench product of CH3CH2MgBr, or the Wurtz product of CH3Br; count the carbons in the reagent named.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_chem_80",
            chapterId = "chem_ch_16",
            subject = "Chemistry",
            topic = "Phenol Acidity — the pKa Ladder",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "Which of the following is the strongest acid?",
            optionA = "Phenol",
            optionB = "4-Methylphenol (p-cresol)",
            optionC = "4-Nitrophenol",
            optionD = "2,4,6-Trinitrophenol (picric acid)",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: Phenol acidity is decided by the stability of the phenoxide ion: electron-withdrawing groups stabilise it and strengthen the acid, electron-donating groups do the reverse.
                Step 2: Compare the rungs of the ladder by pKa: phenol is 10.0; p-cresol is about 10.2 (its CH3 group donates, so it is slightly weaker); p-nitrophenol is 7.15 (one NO2 group withdrawing by resonance from the para position).
                Step 3: Picric acid carries THREE nitro groups at the ortho and para positions, all draining charge from the phenoxide ion. Its pKa is about 0.38 — stronger than ethanoic acid, despite having no carboxyl group.
                Trap: p-nitrophenol (option C) is the strongest of the "ordinary" substituted phenols and tempts students who stop counting at one NO2 group. Count the withdrawing groups and their positions before answering.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_81",
            chapterId = "chem_ch_16",
            subject = "Chemistry",
            topic = "Lucas Test — Classifying Alcohols by Rate",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "The Lucas reagent (conc. HCl and anhydrous ZnCl2) is added separately to four alcohols at room temperature. Turbidity appears immediately with:",
            optionA = "2-Methylpropan-2-ol",
            optionB = "Propan-2-ol",
            optionC = "Propan-1-ol",
            optionD = "Butan-1-ol",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: In the Lucas test the alcohol is converted to its alkyl chloride, and the turbidity is the insoluble chloride separating out. The reaction has carbocation character, so the rate follows carbocation stability: 3 degree > 2 degree > 1 degree.
                Step 2: The timings are the test: a tertiary alcohol turns turbid immediately, a secondary alcohol takes about five minutes, and a primary alcohol shows no turbidity at room temperature.
                Step 3: 2-Methylpropan-2-ol is the only tertiary alcohol in the list, so it reacts at once. Propan-2-ol (secondary) would need minutes, and propan-1-ol and butan-1-ol (primary) would stay clear until heated.
                Trap: do not reach for the acidity order — that runs 1 > 2 > 3 degree and would pick a primary alcohol. The Lucas test is a substitution race through a cation-like transition state, not an acidity measurement.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_82",
            chapterId = "chem_ch_16",
            subject = "Chemistry",
            topic = "Dehydration — Carbocation Rearrangement",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "3,3-Dimethylbutan-2-ol is heated with concentrated sulphuric acid. The major dehydration product is:",
            optionA = "3,3-Dimethylbut-1-ene",
            optionB = "2,3-Dimethylbut-2-ene",
            optionC = "2,3-Dimethylbut-1-ene",
            optionD = "2-Methylbut-2-ene",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: The OH is protonated and leaves as water, giving a SECONDARY carbocation at C2: CH3-CH(+)-C(CH3)3. Never draw the alkene from this cation until you have checked for a rearrangement.
                Step 2: The neighbouring carbon is quaternary and carries three methyl groups. A 1,2-methyl shift moves one methyl group, with its bonding pair, onto C2 — the positive charge lands on C3, which is now a TERTIARY carbocation. The skeleton has changed from 3,3-dimethyl to 2,3-dimethyl.
                Step 3: Loss of a proton from the rearranged cation follows Saytzeff: removal from a methyl group on the adjacent CH gives the tetrasubstituted alkene 2,3-dimethylbut-2-ene, which dominates over the disubstituted 2,3-dimethylbut-1-ene (option C).
                Trap: option A is the direct, unrearranged product — formed only in traces. Option D fails on carbon count alone: the starting alcohol has six carbons and 2-methylbut-2-ene has five.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_83",
            chapterId = "chem_ch_16",
            subject = "Chemistry",
            topic = "Williamson Synthesis — Choosing the Right Pairing",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "In a Williamson ether synthesis, which of the following alkoxide / halide pairings will NOT give the intended ether as the major product?",
            optionA = "Sodium ethoxide + bromoethane",
            optionB = "Sodium tert-butoxide + iodomethane",
            optionC = "Sodium ethoxide + tert-butyl bromide",
            optionD = "Sodium phenoxide + bromoethane",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Williamson synthesis is an SN2 reaction: the alkoxide must attack the halide carbon from the back. The halide partner therefore has to be methyl or primary; the alkoxide partner can be as bulky as it likes.
                Step 2: Audit each pairing. (A) Primary halide, ordinary alkoxide — ethoxyethane forms. (B) The tertiary group sits on the alkoxide side, where bulk does no harm, and iodomethane is the perfect SN2 substrate — tert-butyl methyl ether forms. (D) Phenoxide plus a primary halide — phenetole forms.
                Step 3: In (C) the tertiary group is on the HALIDE side. Ethoxide is a strong base and the tertiary carbon cannot be attacked, so E2 elimination wins completely: the products are 2-methylpropene (isobutylene) and ethanol, not tert-butyl ethyl ether.
                Trap: the atoms in (C) are exactly the atoms of the target ether, which is what makes it bait. To make tert-butyl ethyl ether you must swap the sides: sodium tert-butoxide + bromoethane.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_84",
            chapterId = "chem_ch_16",
            subject = "Chemistry",
            topic = "Phenol — the Bromine Water Test",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "Excess bromine water is added to an aqueous solution of phenol. The white precipitate formed is of:",
            optionA = "Bromobenzene",
            optionB = "o-Bromophenol",
            optionC = "p-Bromophenol",
            optionD = "2,4,6-Tribromophenol",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: The OH group strongly activates the benzene ring towards electrophilic substitution and directs to the ortho and para positions — all three of which (2, 4 and 6) are free in phenol.
                Step 2: In water the ring is at its most reactive (phenol ionises slightly, and the polar solvent helps polarise Br2), and the bromine is present in excess. Substitution therefore does not stop after one bromine: all three activated positions are brominated, and the orange colour of bromine water is discharged.
                Step 3: The product, 2,4,6-tribromophenol, is sparingly soluble and separates as a white precipitate. Decolourisation plus a white precipitate is the standard confirmatory test for phenol.
                Trap: p-bromophenol (option C) is the major product of the CONTROLLED reaction — Br2 in CS2 at 273 K. The solvent named in the question is the fork: water means tribromo, CS2 means monobromo.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_chem_85",
            chapterId = "chem_ch_17",
            subject = "Chemistry",
            topic = "Iodoform Test — Finding the CH3-CO Group",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "Which of the following compounds gives a yellow precipitate of iodoform when warmed with iodine and sodium hydroxide?",
            optionA = "Pentan-3-one",
            optionB = "Benzaldehyde",
            optionC = "Propan-1-ol",
            optionD = "Acetophenone",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: The iodoform test detects one structural unit: a CH3 group bonded directly to a carbonyl carbon (CH3-CO-), or a CH3-CH(OH)- group that the reagent oxidises into it. Nothing else responds.
                Step 2: Acetophenone is C6H5-CO-CH3 — a methyl ketone, so its methyl is tri-iodinated and expelled as yellow CHI3, leaving benzoate in solution. The ring changes nothing; the CH3-CO unit is present.
                Trap: pentan-3-one (option A) is a ketone but its carbonyl is flanked by two ethyl groups — no CH3-CO unit, so it fails. Benzaldehyde (option B) has no methyl group at all, and propan-1-ol (option C) oxidises to propanal, which again lacks the CH3-CO arrangement. The test reads a structural unit, not the word ketone.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_86",
            chapterId = "chem_ch_17",
            subject = "Chemistry",
            topic = "Cannizzaro Reaction — the No-Alpha-Hydrogen Condition",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "Which of the following aldehydes undergoes the Cannizzaro reaction when treated with concentrated KOH?",
            optionA = "Benzaldehyde",
            optionB = "Acetaldehyde (ethanal)",
            optionC = "Propanal",
            optionD = "2-Methylpropanal",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: The Cannizzaro reaction has three simultaneous conditions: an aldehyde, concentrated alkali, and NO alpha-hydrogen — because an alpha-hydrogen opens the enolate (aldol) road instead.
                Step 2: Benzaldehyde's carbonyl carbon is bonded straight to the ring; there is no alpha carbon bearing hydrogen at all. With concentrated KOH it disproportionates: one molecule is reduced to benzyl alcohol, the other oxidised to potassium benzoate.
                Trap: acetaldehyde (option B) has three alpha-hydrogens and propanal (option C) has two — both undergo aldol condensation. 2-Methylpropanal (option D) is the subtle distractor: it has exactly ONE alpha-hydrogen, and one is enough to disqualify it. The test is any alpha-hydrogen at all, not the count.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_87",
            chapterId = "chem_ch_17",
            subject = "Chemistry",
            topic = "Fehling Test — the Benzaldehyde Exception",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "Benzaldehyde gives a silver mirror with Tollens reagent. With which of the following does benzaldehyde NOT react?",
            optionA = "2,4-Dinitrophenylhydrazine (Brady's reagent)",
            optionB = "Schiff's reagent",
            optionC = "Fehling's solution",
            optionD = "Saturated sodium bisulphite solution",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Fehling's solution is a mild oxidant that only ALIPHATIC aldehydes can reduce to red Cu2O. Benzaldehyde, an aromatic aldehyde, leaves it completely unchanged even on heating — the classic exception in this chapter.
                Step 2: Benzaldehyde is not an unreactive molecule: it still reduces Tollens reagent (silver mirror), restores the pink colour of Schiff's reagent, forms an orange 2,4-dinitrophenylhydrazone, and adds sodium bisulphite to give a crystalline adduct. Only Fehling (and Benedict) refuse it.
                Trap: the reflex answer is to deny benzaldehyde one of its genuine reactions — students often pick Schiff's reagent (option B) because the test feels obscure. Anchor it firmly: Tollens YES, Fehling NO is the benzaldehyde signature, and it is exactly how benzaldehyde is distinguished from acetaldehyde.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_88",
            chapterId = "chem_ch_17",
            subject = "Chemistry",
            topic = "Clemmensen versus Wolff-Kishner — Choosing by Acid Sensitivity",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 90,
            prompt = "A ketone that also carries an acid-labile acetal group must be reduced from C=O to CH2, keeping the acetal intact. The suitable method is:",
            optionA = "Clemmensen reduction — Zn-Hg and concentrated HCl, reflux",
            optionB = "Wolff-Kishner reduction — NH2NH2, then KOH in ethylene glycol, heat",
            optionC = "NaBH4 in methanol",
            optionD = "H2 over a nickel catalyst",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Fix the depth first: the target is CH2, not an alcohol, so the shallow reagents are out — NaBH4 (option C) and catalytic hydrogenation (option D) both stop at the secondary alcohol.
                Step 2: Both deep reductions reach CH2; they differ only in medium. Clemmensen drags the molecule through refluxing concentrated HCl, which hydrolyses the acetal group. Wolff-Kishner works in hot strong base, and acetals are base-stable — so the ketone is reduced and the acetal survives untouched.
                Trap: Clemmensen (option A) is the more famous name and students reach for it by habit. The question is never about the carbonyl — both reagents perform identically on C=O — it is about what the REST of the molecule can survive. Acid-sensitive substrate, basic method: Wolff-Kishner.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_89",
            chapterId = "chem_ch_17",
            subject = "Chemistry",
            topic = "Acid Strength — the Chlorine Ladder",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 45,
            prompt = "Which of the following is the strongest acid?",
            optionA = "Acetic acid (pKa 4.76)",
            optionB = "Benzoic acid (pKa 4.20)",
            optionC = "Chloroacetic acid (pKa 2.87)",
            optionD = "Dichloroacetic acid (pKa 1.29)",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: Acid strength runs through the stability of the anion left behind. Chlorine withdraws electron density (-I effect), dispersing the carboxylate's negative charge and stabilising it — so each chlorine added to acetic acid makes the acid stronger.
                Step 2: Dichloroacetic acid carries two chlorines against chloroacetic acid's one, so it sits lowest on the ladder at pKa 1.29. Benzoic acid (4.20) edges out acetic acid (4.76) because the sp2 ring carbon pulls harder than a methyl group, but neither plain acid can compete with the chlorinated pair.
                Trap: pKa is a negative logarithm — the SMALLEST pKa is the STRONGEST acid. Reading the ladder by the size of the number (choosing acetic acid, 4.76) inverts the entire order, which is exactly the slip this question is built to catch.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_chem_90",
            chapterId = "chem_ch_18",
            subject = "Chemistry",
            topic = "Basicity in Water — The Ethylamine Set",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The strongest base in aqueous solution among the following is:",
            optionA = "aniline",
            optionB = "(C2H5)2NH",
            optionC = "(C2H5)3N",
            optionD = "NH3",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Separate the families first. Aniline (pKb 9.38) is an aromatic amine — its lone pair is delocalised into the ring, so it is weaker than every aliphatic amine here by orders of magnitude.
                Step 2: Among the ethylamines in WATER, the order is (C2H5)2NH (pKb 3.00) > (C2H5)3N (3.25) > C2H5NH2 (3.29) > NH3 (4.75). The secondary amine holds the best balance of inductive donation, solvation of its cation (two N-H bonds) and low steric crowding.
                Step 3: The tertiary amine's stronger +I push cannot compensate in water for its poorly solvated, crowded conjugate acid (only one N-H).
                Trap: (C2H5)3N (option C) is the correct answer only in the GAS PHASE, where solvation is absent and the pure inductive order 3° > 2° > 1° rules. The question says aqueous solution — the phase is part of the question.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_91",
            chapterId = "chem_ch_18",
            subject = "Chemistry",
            topic = "Gabriel Phthalimide Synthesis — Its Limits",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 45,
            prompt = "Which of the following amines CANNOT be prepared by Gabriel phthalimide synthesis?",
            optionA = "butan-1-amine",
            optionB = "ethanamine",
            optionC = "benzylamine",
            optionD = "aniline",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: Gabriel synthesis works by SN2 attack of the phthalimide nitrogen on an ALKYL halide, followed by hydrolysis to release a primary aliphatic amine.
                Step 2: Butan-1-amine, ethanamine and benzylamine all come from reactive alkyl (or benzyl) halides — benzyl chloride is an aliphatic halide in behaviour despite its ring, and it reacts eagerly.
                Step 3: Aniline would require chlorobenzene or bromobenzene as the halide partner. The aryl C-X bond has partial double-bond character from resonance and refuses nucleophilic substitution — the key step simply does not occur. (Aniline is instead made by reducing nitrobenzene or by Hoffmann degradation of benzamide.)
                Trap: benzylamine (option C) tempts students who sort by "contains a benzene ring". What matters is where the halogen sits: on the ring (aryl — impossible) or on a CH2 beside the ring (benzylic — perfectly fine).
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_92",
            chapterId = "chem_ch_18",
            subject = "Chemistry",
            topic = "Carbylamine Reaction — Who Responds",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "The carbylamine reaction (foul-smelling isocyanide with CHCl3 and alcoholic KOH) is given by:",
            optionA = "C6H5NH2",
            optionB = "(CH3)2NH",
            optionC = "(CH3)3N",
            optionD = "C6H5NHCH3",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: The mechanism runs through dichlorocarbene and needs TWO N-H hydrogens on the reacting nitrogen for the successive HCl eliminations that build the isocyanide group.
                Step 2: Only PRIMARY amines have two N-H hydrogens. Aniline C6H5NH2 is a primary aromatic amine, and aromatic primary amines respond just as aliphatic ones do — phenyl isocyanide forms with its characteristic foul smell.
                Step 3: (CH3)2NH and C6H5NHCH3 are secondary (one N-H each) and (CH3)3N is tertiary (none) — none of them can complete the double elimination, so none reacts.
                Trap: C6H5NHCH3 (option D) looks similar to aniline but is a SECONDARY amine; the carbylamine test reads the N-H census, not the presence of a ring.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_93",
            chapterId = "chem_ch_18",
            subject = "Chemistry",
            topic = "Hoffmann Bromamide Degradation — Carbon Ledger",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "Butanamide on treatment with Br2 in aqueous NaOH gives:",
            optionA = "butan-1-amine",
            optionB = "propanamine",
            optionC = "ethanamine",
            optionD = "N-methylpropanamide",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Br2/NaOH on a primary amide is the Hoffmann bromamide degradation. The R group migrates from the carbonyl carbon to nitrogen through an isocyanate intermediate.
                Step 2: The carbonyl carbon is expelled as carbonate, so the amine always has ONE CARBON LESS than the amide. Butanamide CH3CH2CH2CONH2 (4 carbons) keeps its propyl R group.
                Step 3: Product: CH3CH2CH2NH2 — propanamine, 3 carbons.
                Trap: butan-1-amine (option A) is what LiAlH4 reduction of the same amide would give, because reduction keeps the carbonyl carbon as a CH2. Same starting material, opposite carbon ledgers — the reagent decides.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_94",
            chapterId = "chem_ch_18",
            subject = "Chemistry",
            topic = "Diazonium Coupling — Azo Dye Formation",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "Benzenediazonium chloride is treated with phenol in weakly alkaline medium at 273-278 K. The product is:",
            optionA = "diphenyl ether",
            optionB = "benzene, with nitrogen evolved",
            optionC = "p-hydroxyazobenzene, an orange dye",
            optionD = "chlorobenzene",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Kept cold and mildly alkaline (pH 9-10), phenol exists largely as phenoxide — a strongly activated ring. The diazonium ion is a weak electrophile, but it is electrophile enough for this ring.
                Step 2: This is COUPLING: electrophilic substitution at the position PARA to the -OH, forming the azo linkage -N=N- between the two rings. Both nitrogens are retained — the N=N bridge is the chromophore that makes the product an orange dye, p-hydroxyazobenzene.
                Step 3: Check the rejected spokes: benzene with N2 loss would need a reducing agent such as H3PO2 (deamination); chlorobenzene would need CuCl/HCl (Sandmeyer); neither reagent is present. Warming with water alone would give phenol by hydrolysis — also not this, because phenol here is the coupling PARTNER, present in excess as the substrate.
                Trap: students often file every diazonium reaction under "N2 leaves". Coupling is the exception — recognise it by the activated partner ring plus the pH window and the cold temperature.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_chem_95",
            chapterId = "chem_ch_19",
            subject = "Chemistry",
            topic = "Carbohydrates — Why Sucrose Is Non-Reducing",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 75,
            prompt = "Sucrose does not reduce Fehling's solution or Tollens' reagent, although both glucose and fructose (the units it is made of) are reducing sugars. The correct reason is:",
            optionA = "Sucrose is too large a molecule to react with these reagents",
            optionB = "Its glycosidic bond joins the anomeric carbon of glucose (C1) to the anomeric carbon of fructose (C2), so neither ring has a free anomeric carbon that can open",
            optionC = "The fructose unit cancels out the reducing power of the glucose unit",
            optionD = "The glucose inside sucrose is present in its beta form, and beta anomers are non-reducing",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: A sugar reduces Fehling's or Tollens' reagent only if a ring can open to expose an aldehyde (or an alpha-hydroxy ketone that rearranges to one). Ring opening is possible only at a FREE anomeric carbon.
                Step 2: In sucrose the glycosidic linkage runs from C1 of alpha-D-glucose to C2 of beta-D-fructose — the anomeric carbons of BOTH units are consumed by the bond itself.
                Step 3: With no free anomeric carbon, neither ring can open, no reducing group can form, and sucrose also shows no mutarotation. Hence sucrose is a non-reducing sugar.
                Trap: reducing power is not inherited from the ingredient list (option C thinking) — once the anomeric carbons are locked in the bond, the units lose it completely. Option D is false because free beta-D-glucose is perfectly reducing; it is the locked bond, not the anomer, that matters.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_96",
            chapterId = "chem_ch_19",
            subject = "Chemistry",
            topic = "Amino Acids — The Zwitterion",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "In neutral aqueous solution, glycine exists predominantly as:",
            optionA = "H2N-CH2-COOH, an uncharged molecule",
            optionB = "H3N(+)-CH2-COOH, a cation",
            optionC = "H3N(+)-CH2-COO(-), a dipolar ion (zwitterion)",
            optionD = "H2N-CH2-COO(-), an anion",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: An amino acid carries an acidic group (COOH) and a basic group (NH2) in the same molecule. In water the COOH donates its proton to the NH2 group.
                Step 2: The product carries both charges at once: H3N(+)-CH2-COO(-). This dipolar ion is the zwitterion — overall neutral, but internally charged like a salt.
                Step 3: The zwitterion explains why amino acids are high-melting, water-soluble crystalline solids. The fully cationic form (option B) dominates only in strong acid, and the anionic form (option D) only in strong base.
                Trap: option A is the form drawn on paper for convenience, but it is a minor species in aqueous solution — examiners test exactly this point.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_97",
            chapterId = "chem_ch_19",
            subject = "Chemistry",
            topic = "Proteins — Denaturation",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "When an egg is boiled, the egg-white protein albumin turns hard and opaque. During this denaturation:",
            optionA = "The secondary and tertiary structures are destroyed, but the primary structure (the amino acid sequence) remains intact",
            optionB = "Peptide bonds are hydrolysed and the protein breaks down into free amino acids",
            optionC = "The primary structure is destroyed while the tertiary structure survives",
            optionD = "The amino acid sequence is rearranged into a new order by the heat",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Denaturation is the unfolding of a protein caused by heat, pH change or chemicals. The weak forces holding the folds — hydrogen bonds, ionic bridges, hydrophobic packing — are disrupted.
                Step 2: So the secondary and tertiary (and quaternary, if present) structures are destroyed and biological activity is lost, as the soluble globular albumin tangles into an insoluble mass.
                Step 3: The covalent peptide bonds are NOT broken by ordinary boiling, so the primary structure — the amino acid sequence — survives completely. Breaking peptide bonds is hydrolysis, which needs strong acid, prolonged heating or protease enzymes.
                Trap: option B describes digestion/hydrolysis, not denaturation; this confusion is the single most planted error in the biomolecules chapter.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_98",
            chapterId = "chem_ch_19",
            subject = "Chemistry",
            topic = "Nucleic Acids — Chargaff's Rule Calculation",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 75,
            prompt = "A double-stranded DNA sample contains 30% adenine among its bases. The percentage of guanine in the sample is:",
            optionA = "30%",
            optionB = "15%",
            optionC = "40%",
            optionD = "20%",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: Chargaff's rule: in double-stranded DNA, adenine pairs with thymine and guanine pairs with cytosine, so A = T and G = C.
                Step 2: A = 30% forces T = 30%. Together A + T = 60%, leaving 100 - 60 = 40% for G + C.
                Step 3: G and C share the remainder equally: G = C = 40 / 2 = 20%.
                Trap: option C (40%) dumps the whole remainder on guanine alone, forgetting that G and C must be equal — that equal split is the step this question is really testing. Option A would only be true if all four bases were present in equal amounts.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_chem_99",
            chapterId = "chem_ch_19",
            subject = "Chemistry",
            topic = "Vitamins — B12 and Its Metal",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "Vitamin B12 (cyanocobalamin), whose deficiency causes pernicious anaemia, is unique among the vitamins because its molecule contains:",
            optionA = "Iron",
            optionB = "Zinc",
            optionC = "Cobalt",
            optionD = "Copper",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Vitamin B12 is built around a single metal ion at the centre of its ring system — and that metal is cobalt, which is also why the vitamin's chemical name is cyanocobalamin (cobalamin = cobalt-containing).
                Step 2: It is the only vitamin with a metal centre. B12 is needed for red blood cell formation, so its deficiency causes pernicious anaemia, in which red blood cells end up deficient in haemoglobin.
                Trap: iron (option A) is the metal of haemoglobin itself, not of any vitamin — the question deliberately cross-wires the anaemia story. When the stem says anaemia plus vitamin, think B12 and cobalt; when it says anaemia plus metal in blood protein, think iron in haem.
            """.trimIndent()
        ),



        // ==================== BIOLOGY QUESTIONS ====================

        QuestionEntity(

            id = "q_bio_flowering_1",
            chapterId = "bio_ch_1",
            subject = "Biology",
            topic = "Embryo Sac & Ploidy",
            examSource = "IISER IAT",
            examYear = 2024,
            isImportantQuestion = true,
            isPyq = true,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "In an angiospermic plant with diploid chromosome number 2n = 24, what is the chromosome number present in the aleurone layer, secondary nucleus before triple fusion, antipodal cells, and the primary endosperm nucleus (PEN) respectively?",
            optionA = "36, 24, 12, 36",
            optionB = "24, 12, 12, 36",
            optionC = "36, 12, 24, 48",
            optionD = "24, 24, 12, 24",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Given 2n = 24, the haploid genome n = 12.
                Step 2: Aleurone layer is part of the endosperm tissue and is triploid (3n) = 3 × 12 = 36.
                Step 3: Secondary nucleus is formed by the fusion of two haploid polar nuclei (n + n) and has 2n = 24.
                Step 4: Antipodal cells are haploid gametophytic cells (n) = 12.
                Step 5: PEN is produced by triple fusion (n sperm + 2n secondary nucleus) and is triploid (3n) = 36.
                Therefore, the correct series is 36, 24, 12, 36.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_flowering_2",
            chapterId = "bio_ch_1",
            subject = "Biology",
            topic = "Microsporogenesis & Sporopollenin",
            examSource = "IISER IAT",
            examYear = 2023,
            isImportantQuestion = true,
            isPyq = true,
            difficulty = "Conceptual",
            estimatedSeconds = 75,
            prompt = "Which of the following layers of the microsporangial wall is polyploid/multinucleate and performs the primary endocrine/nutritive function for developing pollen grains?",
            optionA = "Endothecium",
            optionB = "Middle layers",
            optionC = "Tapetum",
            optionD = "Epidermis",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: The outermost three wall layers (Epidermis, Endothecium, and Middle layers) are protective in nature and assist in anther dehiscence.
                Step 2: The innermost wall layer is the Tapetum.
                Step 3: Tapetal cells possess dense cytoplasm and undergo endomitosis/free nuclear divisions, becoming multinucleate/polyploid. They nourish developing microspores and secrete sporopollenin precursors.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_1",

            chapterId = "bio_ch_10",

            subject = "Biology",

            topic = "Cell Cycle and Cell Division",

            examSource = "IISER IAT",

            examYear = 2024,

            isImportantQuestion = true,

            isPyq = true,

            difficulty = "Analytical",

            estimatedSeconds = 105,

            prompt = "A diploid somatic cell of an organism has 2n = 16 chromosomes and a DNA content of 2C at the G₁ phase. What will be the chromosome number and DNA content respectively in each daughter cell at Metaphase I and Metaphase II of meiosis?",

            optionA = "Metaphase I: 16 chromosomes, 4C DNA; Metaphase II: 8 chromosomes, 2C DNA",

            optionB = "Metaphase I: 16 chromosomes, 2C DNA; Metaphase II: 8 chromosomes, 1C DNA",

            optionC = "Metaphase I: 32 chromosomes, 4C DNA; Metaphase II: 16 chromosomes, 2C DNA",

            optionD = "Metaphase I: 8 chromosomes, 4C DNA; Metaphase II: 8 chromosomes, 2C DNA",

            correctOptionIndex = 0,

            stepByStepExplanation = """

                Step 1: At G₁ phase, the diploid cell has 2n = 16 chromosomes and 2C DNA content.

                Step 2: During S phase, DNA replicates so DNA content doubles from 2C to 4C, while the chromosome number remains 2n = 16 (each chromosome now has two sister chromatids).

                Step 3: Therefore, at Metaphase I, the cell has 16 chromosomes (8 bivalents) and 4C DNA.

                Step 4: After Meiosis I (reductional division), homologous chromosomes separate into two daughter cells, halving both chromosome number and DNA content. Thus at Metaphase II, each cell has n = 8 chromosomes and 2C DNA.

            """.trimIndent(),

            isBookmarked = true

        ),

        QuestionEntity(

            id = "q_bio_2",

            chapterId = "bio_ch_9",

            subject = "Biology",

            topic = "Biomolecules",

            examSource = "IISER IAT",

            examYear = 2023,

            isImportantQuestion = true,

            isPyq = true,

            difficulty = "Conceptual",

            estimatedSeconds = 90,

            prompt = "An enzyme obeys Michaelis-Menten kinetics with K_m = 2 mM and V_max = 120 μmol/min. In the presence of a competitive inhibitor that doubles the apparent K_m, what is the initial reaction velocity v₀ at a substrate concentration [S] = 4 mM?",

            optionA = "40 μmol/min",

            optionB = "60 μmol/min",

            optionC = "80 μmol/min",

            optionD = "90 μmol/min",

            correctOptionIndex = 1,

            stepByStepExplanation = """

                Step 1: A competitive inhibitor increases apparent K_m without changing V_max.

                Here K_m(app) = 2 × 2 mM = 4 mM, and V_max remains 120 μmol/min.

                Step 2: Apply the Michaelis-Menten equation at [S] = 4 mM:

                v₀ = V_max [S] / (K_m(app) + [S]) = 120 × 4 / (4 + 4) = 60 μmol/min.

            """.trimIndent()

        ),

        QuestionEntity(

            id = "q_bio_3",

            chapterId = "bio_ch_11",

            subject = "Biology",

            topic = "Photosynthesis in Higher Plants",

            examSource = "IISER IAT",

            examYear = 2025,

            isImportantQuestion = true,

            isPyq = true,

            difficulty = "Conceptual",

            estimatedSeconds = 85,

            prompt = "To synthesize one molecule of glucose (C₆H₁₂O₆) via the photosynthetic pathway, how many ATP and NADPH molecules are consumed respectively in a C4 plant (such as Maize) compared to a C3 plant?",

            optionA = "30 ATP & 12 NADPH in C4 vs 18 ATP & 12 NADPH in C3",

            optionB = "18 ATP & 12 NADPH in C4 vs 30 ATP & 12 NADPH in C3",

            optionC = "24 ATP & 18 NADPH in C4 vs 18 ATP & 12 NADPH in C3",

            optionD = "36 ATP & 24 NADPH in C4 vs 18 ATP & 12 NADPH in C3",

            correctOptionIndex = 0,

            stepByStepExplanation = """

                Step 1: In C3 plants, each CO₂ fixed in the Calvin cycle requires 3 ATP and 2 NADPH. For 6 CO₂ (one glucose): 18 ATP and 12 NADPH.

                Step 2: In C4 plants, regeneration of PEP from pyruvate by pyruvate-phosphate dikinase (PPDK) consumes 2 additional ATP equivalents per CO₂ fixed (total 5 ATP and 2 NADPH per CO₂).

                Step 3: For 6 CO₂ molecules: 6 × 5 = 30 ATP and 6 × 2 = 12 NADPH.

            """.trimIndent()

        ),

        QuestionEntity(

            id = "q_bio_4",

            chapterId = "bio_ch_16",

            subject = "Biology",

            topic = "Excretory Products and Their Elimination",

            examSource = "IISER IAT",

            examYear = null,

            isImportantQuestion = true,

            isPyq = false,

            difficulty = "Analytical",

            estimatedSeconds = 95,

            prompt = "During the operation of the counter-current multiplier system in a mammalian juxtamedullary nephron, which of the following statements accurately describes the permeability of the Loop of Henle?",

            optionA = "Descending limb is permeable to water; ascending limb is impermeable to water but permeable to NaCl",

            optionB = "Descending limb is permeable to NaCl; ascending limb is permeable to water only",

            optionC = "Both descending and ascending limbs are freely permeable to water and urea",

            optionD = "Descending limb actively pumps NaCl out into the medullary interstitium",

            correctOptionIndex = 0,

            stepByStepExplanation = """

                Step 1: The descending limb of the Loop of Henle is permeable to water and almost impermeable to electrolytes, concentrating the filtrate as it moves down into the hyperosmolar medulla (up to 1200 mOsmol/L).

                Step 2: The ascending limb is impermeable to water but allows transport of electrolytes (NaCl) actively or passively into the medullary interstitium, diluting the filtrate as it ascends toward the DCT.

            """.trimIndent()

        ),

QuestionEntity(
            id = "q_bio_5",
            chapterId = "bio_ch_1",
            subject = "Biology",
            topic = "Double Fertilisation — Ploidy of the Endosperm",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "The primary endosperm nucleus, formed as the product of triple fusion inside the embryo sac, is:",
            optionA = "Haploid (n)",
            optionB = "Diploid (2n)",
            optionC = "Triploid (3n)",
            optionD = "Tetraploid (4n)",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Triple fusion joins three nuclei — one male gamete (n) and the two polar nuclei (n + n) of the central cell.
                Step 2: Adding the sets: n + n + n = 3n. The primary endosperm cell (PEC) carrying this nucleus is therefore triploid.
                Step 3: The endosperm that develops from the PEC inherits this triploid state in every nucleus.
                Trap: Diploid (option B) is the ploidy of the zygote from syngamy, gamete (n) + egg (n); students who merge the two fusions of double fertilisation land there. Tetraploid (option D) would need four nuclei in the fusion.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_6",
            chapterId = "bio_ch_1",
            subject = "Biology",
            topic = "Embryo Sac — The Cell and Nucleus Census",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A mature embryo sac of the Polygonum type, found in over 70 percent of angiosperms, is best described as:",
            optionA = "8-celled and 7-nucleate",
            optionB = "7-celled and 8-nucleate",
            optionC = "7-celled and 7-nucleate",
            optionD = "8-celled and 8-nucleate",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Count the cells: the egg apparatus contributes 3 cells (1 egg + 2 synergids), the chalazal end contributes 3 antipodal cells, and the middle is 1 large central cell. Total = 7 cells.
                Step 2: Count the nuclei: 3 in the egg apparatus + 3 in the antipodals + 2 polar nuclei inside the shared central cell = 8 nuclei.
                Step 3: The mismatch comes from a single fact — two nuclei live inside one cell (the central cell), so the nucleus count exceeds the cell count by exactly one.
                Trap: 8-celled and 8-nucleate (option D) assumes every nucleus owns a cell; 7-celled and 7-nucleate (option C) forgets that the central cell starts with two polar nuclei before they fuse into the secondary nucleus.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_7",
            chapterId = "bio_ch_1",
            subject = "Biology",
            topic = "Double Fertilisation — The Two Fusions",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 75,
            prompt = "During double fertilisation in an angiosperm, the two male gametes discharged by the pollen tube into the embryo sac:",
            optionA = "one fuses with the egg to form the zygote (2n), while the other fuses with the two polar nuclei to form the primary endosperm cell (3n)",
            optionB = "both fuse with the egg one after another to form a triploid zygote",
            optionC = "one fuses with a synergid to open the path, and the other fuses with the egg",
            optionD = "one fuses with the egg, and the other fuses with a single polar nucleus to form a diploid endosperm",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: The pollen tube releases exactly two male gametes into a synergid of the embryo sac, and each gamete has a distinct target.
                Step 2: Gamete one performs syngamy with the egg (n + n) giving the diploid zygote, the future embryo.
                Step 3: Gamete two performs triple fusion with the two polar nuclei (n + n + n) giving the triploid primary endosperm cell, the future endosperm.
                Trap: Option D halves the polar contribution — triple fusion involves BOTH polar nuclei (equivalently the 2n secondary nucleus), which is exactly why the product is triploid and not diploid. Option C confuses the synergid's role: it receives and guides the tube, but no gamete fuses with it.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_8",
            chapterId = "bio_ch_1",
            subject = "Biology",
            topic = "Pollination Agents — Reading the Wind Syndrome",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "A plant's flowers are small and inconspicuous, produce enormous quantities of light, non-sticky pollen, have well-exposed stamens, and carry a single large feathery stigma. The most likely pollinating agent is:",
            optionA = "Bees",
            optionB = "Birds",
            optionC = "Water",
            optionD = "Wind",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: Read the trait bundle, not any single trait. Light, dry, non-sticky pollen in huge quantity is pollen built to travel on air and to survive massive wastage.
                Step 2: Well-exposed stamens let moving air strip the pollen away, and a large feathery stigma is a net engineered to comb pollen out of that air.
                Step 3: Animal-pollinated flowers run the opposite economy — few, sticky pollen grains, bright colours, scent and nectar rewards — none of which is described here.
                Trap: Water (option C) tempts because the pollen is small and light; but hydrophily is rare, and its textbook signs are different — ribbon-like pollen in submerged Zostera or surface-floating flowers in Vallisneria, not feathery stigmas held in the air as in maize and grasses.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_9",
            chapterId = "bio_ch_1",
            subject = "Biology",
            topic = "Apomixis — Nucellar Embryos in Citrus",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "In Citrus, several embryos develop within a single seed: some arise from diploid nucellar cells surrounding the embryo sac, without any fertilisation. Seedlings grown from these nucellar embryos will be:",
            optionA = "Haploid, because they arise inside the ovule without a zygote",
            optionB = "Triploid, because they develop alongside the endosperm",
            optionC = "Genetically variable, because the nucellus undergoes meiosis first",
            optionD = "Genetically identical to the mother plant, because they are clones of her diploid tissue",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: Identify the route — embryos formed from nucellar cells are adventive embryos, an apomictic pathway in which seeds form without fertilisation.
                Step 2: Nucellar cells are ordinary diploid (2n) sporophyte tissue of the mother plant. They divide mitotically, so every embryo they produce carries the mother's exact genotype.
                Step 3: With no meiosis and no paternal genome involved, the seedlings are maternal clones — the reason one Citrus or mango seed can yield several uniform seedlings (polyembryony).
                Trap: Option A wrongly assumes anything without a zygote must be haploid; ploidy follows the tissue of origin, and the nucellus is diploid. Option C invents a meiosis that never occurs in this pathway.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_bio_10",
            chapterId = "bio_ch_2",
            subject = "Biology",
            topic = "Whittaker's Criteria — The Odd One Out",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "Which of the following was NOT one of the criteria R.H. Whittaker used for his five kingdom classification?",
            optionA = "Cell structure — prokaryotic or eukaryotic",
            optionB = "Mode of nutrition — autotrophic or heterotrophic",
            optionC = "Habitat — aquatic or terrestrial",
            optionD = "Phylogenetic relationships",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Recall Whittaker's five criteria from 1969: cell structure, body (thallus) organisation, mode of nutrition, reproduction, and phylogenetic relationships.
                Step 2: Cell structure is criterion one — it alone fences Monera off from the eukaryotic kingdoms. Present in option A, so A is a genuine criterion.
                Step 3: Mode of nutrition is the criterion that finally separated Fungi (absorptive heterotrophs) from Plantae (photosynthetic autotrophs). Option B is genuine.
                Step 4: Phylogenetic relationships — evolutionary relatedness — is the fifth criterion. Option D is genuine. Habitat was never a criterion: bacteria and protists are mostly aquatic, yet they sit in different kingdoms, and fungi share land with plants while sitting apart from them.
                Trap: Habitat (option C) sounds scientific because earlier, cruder systems did sort loosely by where things lived. Whittaker's revolution was precisely to abandon appearance and habitat in favour of cell structure, organisation, nutrition, reproduction and descent.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_11",
            chapterId = "bio_ch_2",
            subject = "Biology",
            topic = "Viroids — Naked RNA",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "A viroid differs from a virus most fundamentally in that a viroid:",
            optionA = "consists of free RNA with no protein coat at all",
            optionB = "contains both DNA and RNA in the same particle",
            optionC = "possesses a capsid but no genetic material",
            optionD = "is a cellular organism smaller than a bacterium",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Recall the definition: viroids, discovered by T.O. Diener in 1971, are infectious agents smaller than viruses, made of free RNA of low molecular weight — with no protein coat surrounding it.
                Step 2: A virus, by contrast, is nucleoprotein: nucleic acid wrapped in a capsid. The viroid's missing capsid is the fundamental difference, so option A states it exactly.
                Step 3: Eliminate option B — no virus or viroid ever carries both DNA and RNA together; a virus carries one or the other. Eliminate option C — it inverts reality (a capsid without a genome is an empty shell, not a viroid). Eliminate option D — viroids are acellular, not tiny cells; the smallest living cells are mycoplasmas.
                Trap: The potato spindle tuber disease is the NCERT viroid example — if a question mentions it, the agent is a viroid, and the defining absence is the protein coat.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_12",
            chapterId = "bio_ch_2",
            subject = "Biology",
            topic = "Mycoplasma — The Wall-Less Bacterium",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "Which set of features correctly describes mycoplasmas?",
            optionA = "Rigid cell wall present; largest bacteria known; strict aerobes",
            optionB = "Cell wall present but made of chitin; photosynthetic; form heterocysts",
            optionC = "Cell wall made of silica; marine; chief producers of the oceans",
            optionD = "Completely lack a cell wall; smallest living cells known; can survive without oxygen",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: NCERT's mycoplasma portrait has three strokes: they completely lack a cell wall, they are the smallest living cells known, and they can survive without oxygen. Option D carries all three.
                Step 2: Option A fails on every count — mycoplasmas are famous precisely for having NO wall, they are the smallest (not largest) cells, and they can survive WITHOUT oxygen rather than demanding it.
                Step 3: Option B mixes chapters: chitin is the fungal wall material, and heterocysts belong to cyanobacteria like Nostoc. Option C describes diatoms — silica walls, marine plankton, chief producers — which are protists, not bacteria at all.
                Trap: Many mycoplasmas are pathogenic in animals and plants, but pathogenicity is shared by many bacteria and never identifies the group. The identity card is the absent wall plus the smallest-cell title.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_13",
            chapterId = "bio_ch_2",
            subject = "Biology",
            topic = "Diatoms — Walls of Glass",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "The cell walls of diatoms are virtually indestructible, and accumulate as diatomaceous earth, because they are embedded with:",
            optionA = "cellulose",
            optionB = "silica",
            optionC = "chitin",
            optionD = "calcium carbonate",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Diatoms are chrysophytes whose cell wall forms two thin overlapping shells that fit together like a soap box.
                Step 2: NCERT states the walls are embedded with silica — glass — which is why they are indestructible and why dead diatoms leave behind large deposits of wall material in their habitat: diatomaceous earth, used for polishing and for filtering oils and syrups.
                Step 3: Eliminate by ownership: cellulose plates armour the dinoflagellates (option A), chitin builds fungal walls (option C), and calcium carbonate belongs to shells and tests outside this pairing (option D).
                Trap: Diatoms are called the chief producers in the oceans — pair that fame with the silica wall, not with cellulose. In Protista, wall chemistry is destiny: silica = diatom, cellulose plates = dinoflagellate.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_14",
            chapterId = "bio_ch_2",
            subject = "Biology",
            topic = "Fungi — Class and Example Matching",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "Which of the following pairs is correctly matched — fungal class with its NCERT example?",
            optionA = "Ascomycetes — Ustilago",
            optionB = "Phycomycetes — Neurospora",
            optionC = "Basidiomycetes — Agaricus",
            optionD = "Deuteromycetes — Rhizopus",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Test each pair against the class signatures. Agaricus, the mushroom, builds basidiocarps and bears four basidiospores exogenously on basidia — a basidiomycete. Option C is correctly matched.
                Step 2: Option A misfiles Ustilago: the smut fungus is a basidiomycete (a parasite in the Agaricus class), not an ascomycete. The sac fungi carry Aspergillus, Claviceps, Neurospora, Penicillium and yeast instead.
                Step 3: Option B misfiles Neurospora: the geneticist's favourite fungus is an ascomycete producing ascospores inside asci. Phycomycetes hold Mucor, Rhizopus and Albugo — the sporangium-forming, coenocytic group.
                Step 4: Option D misfiles Rhizopus: the bread mould is a phycomycete, while Deuteromycetes — the imperfect fungi with no known sexual stage — hold Alternaria, Colletotrichum and Trichoderma.
                Trap: Matching questions are won by the spore signature, not by fame: inside an ascus (Neurospora), outside a basidium (Agaricus, Ustilago), inside a sporangium (Rhizopus), or no sexual stage at all (Trichoderma). Sort by the signature and the names follow.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_bio_15",
            chapterId = "bio_ch_3",
            subject = "Biology",
            topic = "Algae — Pigments and Storage Products",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "An alga stores food as floridean starch and contains chlorophyll a and d along with r-phycoerythrin. It belongs to:",
            optionA = "Chlorophyceae",
            optionB = "Phaeophyceae",
            optionC = "Rhodophyceae",
            optionD = "Cyanophyceae",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Read the storage product first — floridean starch is stored only by the red algae among the three classes in this chapter.
                Step 2: Cross-check with the pigments: r-phycoerythrin is the red pigment that gives Rhodophyceae their colour, and their chlorophyll pair is a and d.
                Step 3: Both clues land on the same row of the algae table, so the answer is Rhodophyceae.
                Trap: Chlorophyceae (option A) stores plain starch and carries chlorophyll a and b; Phaeophyceae (option B) stores laminarin or mannitol and carries chlorophyll a and c with fucoxanthin.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_16",
            chapterId = "bio_ch_3",
            subject = "Biology",
            topic = "Algae — Brown Algae Body Plan and Wall",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "In a large brown alga such as Laminaria, the gelatinous coating of the cell wall and the part that attaches the thallus to the substratum are, respectively:",
            optionA = "Agar and stipe",
            optionB = "Algin and holdfast",
            optionC = "Carrageen and frond",
            optionD = "Pectose and holdfast",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Brown algae have a cell wall of cellulose covered by a gelatinous coat of algin — the hydrocolloid harvested from kelps.
                Step 2: The kelp body is differentiated into holdfast (attachment), stipe (stalk-like part) and frond (leaf-like photosynthetic part). Attachment is the holdfast's job.
                Step 3: The matching pair is therefore algin and holdfast.
                Trap: Agar and carrageen (options A and C) are red-algal wall products, and pectose (option D) belongs to the outer wall layer of green algae. The frond photosynthesises; it does not attach.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_17",
            chapterId = "bio_ch_3",
            subject = "Biology",
            topic = "Pteridophytes — Heterospory and the Seed Habit",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "Heterospory, regarded as the precursor of the seed habit, is shown by which pair of pteridophytes?",
            optionA = "Selaginella and Salvinia",
            optionB = "Equisetum and Selaginella",
            optionC = "Salvinia and Pteris",
            optionD = "Lycopodium and Equisetum",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Heterospory means two kinds of spores — small microspores and large megaspores — giving separate male and female gametophytes.
                Step 2: NCERT's named heterosporous pteridophytes are Selaginella and Salvinia; most other pteridophytes, including Equisetum, Lycopodium and the common ferns, are homosporous.
                Step 3: Only option A pairs the two correct genera.
                Trap: Heterospory is not seed formation — Selaginella and Salvinia still release their spores and form no seeds. The point is evolutionary: the large, provisioned megaspore is the stepping stone towards the seed habit.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_18",
            chapterId = "bio_ch_3",
            subject = "Biology",
            topic = "Gymnosperms — Endosperm Ploidy",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The nutritive tissue in the seed of Pinus is:",
            optionA = "Triploid, formed after fertilisation by triple fusion",
            optionB = "Diploid, formed from the sporophyte after fertilisation",
            optionC = "Haploid, being the female gametophyte formed before fertilisation",
            optionD = "Absent, since gymnosperms store no food in their seeds",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: In gymnosperms there is no double fertilisation and no triple fusion, so no triploid endosperm can arise.
                Step 2: The tissue that nourishes the gymnosperm embryo is the female gametophyte itself, which develops from the megaspore inside the ovule.
                Step 3: A gametophyte is haploid, and it is already in place before fertilisation happens — hence haploid and pre-fertilisation.
                Trap: Option A is the angiosperm story transplanted into Pinus — the single most repeated error in this chapter. Option D fails because pine seeds plainly do carry food reserves for the embryo.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_19",
            chapterId = "bio_ch_3",
            subject = "Biology",
            topic = "Life Cycles — the Diplontic Exception Fucus",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 75,
            prompt = "A marine alga has a diploid plant body, and its only haploid cells are the gametes, which are produced by meiosis. Its life cycle is:",
            optionA = "Haplontic, like most algae",
            optionB = "Haplo-diplobiontic, with both generations multicellular",
            optionC = "Diplontic, as in Fucus",
            optionD = "Haplontic, because all algae show zygotic meiosis",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Classify by asking which generations exist as multicellular bodies. Here only the diploid body exists; the haploid phase is reduced to single gamete cells.
                Step 2: A cycle with a diploid free-living phase and haploid gametes only is diplontic, and its meiosis is gametic — it produces gametes, not spores.
                Step 3: Among algae, Fucus is the NCERT example of exactly this pattern, even though most algae are haplontic.
                Trap: Options A and D apply the algal trend as if it were a law. The question is engineered at the seam of that trend: Ectocarpus (option B's pattern) is haplo-diplobiontic, but a plant whose only haploid cells are gametes cannot be.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_bio_20",
            chapterId = "bio_ch_4",
            subject = "Biology",
            topic = "Basis of Classification — the Coelom",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "Ascaris, the common roundworm, possesses a body cavity that is not lined by mesoderm on the gut side. Ascaris is therefore:",
            optionA = "acoelomate",
            optionB = "pseudocoelomate",
            optionC = "coelomate",
            optionD = "an animal without any body cavity",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Recall the coelom definition: a true coelom is a body cavity lined by mesoderm on BOTH sides — towards the body wall and towards the gut.
                Step 2: Ascaris (phylum Aschelminthes) has a spacious cavity, but the mesoderm lining is missing beside the gut. A cavity that fails the lining test is a pseudocoelom, and its owner is a pseudocoelomate.
                Step 3: It is not acoelomate (option A) because a cavity plainly exists, and not coelomate (option C) because the lining is incomplete. Option D repeats the acoelomate error.
                Trap: judging a cavity by its presence or size instead of its lining — the lining is the entire test in this chapter.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_21",
            chapterId = "bio_ch_4",
            subject = "Biology",
            topic = "Example Mapping — Coelenterata",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 40,
            prompt = "Adamsia, commonly called the sea anemone, belongs to the phylum:",
            optionA = "Coelenterata",
            optionB = "Porifera",
            optionC = "Ctenophora",
            optionD = "Mollusca",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Adamsia is a sessile polyp with stinging tentacles around a single mouth opening — the classic coelenterate body plan (radial symmetry, tissue level, diploblastic).
                Step 2: Its phylum-mates confirm the filing: Physalia (Portuguese man-of-war), Pennatula (sea pen), Gorgonia (sea fan) and Meandrina (brain coral) are all coelenterates carrying cnidoblasts.
                Step 3: Porifera (option B) would need pores and choanocytes; Ctenophora (option C) would need eight comb plates; Mollusca (option D) would need a mantle, foot and radula. None apply.
                Trap: "sea anemone" sounds plant-like or sponge-like — common names are decoration; cnidoblast-bearing tentacles file the animal.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_22",
            chapterId = "bio_ch_4",
            subject = "Biology",
            topic = "Vertebrate Classes — the Reptile Heart Exception",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 50,
            prompt = "Unlike most reptiles, the heart of a crocodile is:",
            optionA = "two-chambered",
            optionB = "three-chambered",
            optionC = "three-chambered with an incomplete ventricular septum",
            optionD = "four-chambered",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: The reptile rule: most reptiles have a three-chambered heart — two atria and one ventricle.
                Step 2: The crocodile is the chapter's named exception: its ventricle is completely divided, giving a fully four-chambered heart (two atria, two ventricles), like birds and mammals.
                Step 3: The crocodile still files under Reptilia — dry cornified scales, cold blood and shelled eggs laid on land outvote the heart.
                Trap: answering three-chambered (option B) by reciting the class rule without its exception — examiners ask about the crocodile precisely to catch that reflex.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_23",
            chapterId = "bio_ch_4",
            subject = "Biology",
            topic = "Chordata — the Four Signatures and the Table",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "Which of the following is NOT a characteristic feature of phylum Chordata?",
            optionA = "Presence of a notochord at some stage of life",
            optionB = "A dorsal, single and hollow nerve cord",
            optionC = "A dorsal heart, when a heart is present",
            optionD = "Paired pharyngeal gill slits at some stage of life",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Audit each option against the chordate plan. Notochord at some stage — true (option A). Nerve cord dorsal, single and hollow — true (option B). Pharyngeal gill slits at some stage — true (option D).
                Step 2: Option C reverses the plan: in chordates the heart is VENTRAL, lying below the gut. A dorsal heart is the non-chordate arrangement (as in annelids and arthropods).
                Step 3: Therefore the statement that is NOT a chordate feature is option C.
                Trap: the dorsal-ventral swap is the classic sign-error of this topic — anchor the pair together: nerve cord dorsal, heart ventral, always in chordates.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_24",
            chapterId = "bio_ch_4",
            subject = "Biology",
            topic = "Echinodermata — Symmetry Across the Life Cycle",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 55,
            prompt = "In phylum Echinodermata, the symmetry of the body is:",
            optionA = "radial in adults and bilateral in larvae",
            optionB = "bilateral in adults and radial in larvae",
            optionC = "radial in both adults and larvae",
            optionD = "bilateral in both adults and larvae",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Picture the adult: a starfish (Asterias) can be halved into mirror halves through several planes of its five-rayed body — the adult is radially (pentamerously) symmetrical.
                Step 2: Picture the larva: the free-swimming echinoderm larva has a clear left and right half and only one mirror plane — it is bilaterally symmetrical.
                Step 3: So the life cycle runs bilateral larva to radial adult — option A. Option B inverts the sequence; options C and D deny the change altogether.
                Trap: quoting only one life stage. The echinoderm switch is the chapter's most rehearsed symmetry ambush — always ask "adult or larva?" before answering.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_bio_25",
            chapterId = "bio_ch_5",
            subject = "Biology",
            topic = "Root versus Stem — the Food-Storage Trap",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 40,
            prompt = "Which of the following stores food in a modified adventitious root?",
            optionA = "Potato tuber",
            optionB = "Sweet potato",
            optionC = "Ginger rhizome",
            optionD = "Colocasia corm",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Sort the four options by identity, using the bud test. The potato tuber carries eyes (axillary buds), so it is a stem. The ginger rhizome is jointed with nodes and scale leaves, so it is a stem. The Colocasia corm is a swollen vertical underground stem.
                Step 2: The sweet potato swells on the root system itself and bears no buds or nodes — it is an adventitious root modified for food storage.
                Step 3: Three of the four options are modified stems; only the sweet potato is a modified root.
                Trap: Potato (option A) is the bait — kitchen language calls both plants "tubers", but the potato is a stem tuber while the sweet potato is a root.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_26",
            chapterId = "bio_ch_5",
            subject = "Biology",
            topic = "Placentation — the Replum Trap",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The ovary of mustard is basically one-chambered but appears two-chambered because of a false septum called the replum, and the ovules are attached to the inner wall of the ovary. The placentation in mustard is:",
            optionA = "parietal",
            optionB = "axile",
            optionC = "marginal",
            optionD = "free central",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Placentation is decided by where the ovules attach. Here they attach to the inner wall of the ovary, which is the definition of parietal placentation.
                Step 2: The two-chambered appearance is a decoy — the partition is the replum, a false septum, not a true wall between carpels meeting at a central placenta.
                Step 3: Axile placentation would need a genuinely multilocular ovary with ovules on a central axis; marginal needs a ridge along the ventral suture of one carpel; free central needs a free-standing central axis without septa. None of these matches.
                Trap: Axile (option B) is planted for students who count chambers and stop. Count where the ovules sit, not how many chambers seem to exist.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_27",
            chapterId = "bio_ch_5",
            subject = "Biology",
            topic = "Aestivation — the Butterfly Plan",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 40,
            prompt = "The aestivation of the corolla in a pea flower is:",
            optionA = "valvate",
            optionB = "twisted",
            optionC = "imbricate",
            optionD = "vexillary",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: Recall the pea corolla's construction: five unequal petals — one large posterior standard, two lateral wings, and two smallest anterior petals united into a keel.
                Step 2: This fixed 1 + 2 + 2 arrangement, with the standard overlapping the wings and the wings overlapping the keel, is vexillary (papilionaceous) aestivation.
                Step 3: Valvate means margins merely touch (Calotropis), twisted means a regular one-direction pinwheel overlap (China rose, cotton), and imbricate means an irregular overlap (Cassia, gulmohur) — none describes the pea's organised butterfly plan.
                Trap: Imbricate (option C) tempts students because the pea's petals do overlap — but when the standard-wing-keel trio is present, vexillary is the precise and expected answer.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_28",
            chapterId = "bio_ch_5",
            subject = "Biology",
            topic = "Family Identification — the Fabaceae Lock",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 55,
            prompt = "Diadelphous stamens arranged as (9) + 1, together with marginal placentation in a single-carpelled ovary, are characteristic of the family:",
            optionA = "Solanaceae",
            optionB = "Fabaceae",
            optionC = "Liliaceae",
            optionD = "Brassicaceae",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Diadelphous stamens — nine united into a tube and one free — are the signature androecium of the pea family.
                Step 2: A single carpel (monocarpellary ovary) with ovules along its ventral suture, that is, marginal placentation, is the matching gynoecium of the same family, whose fruit is the legume pod.
                Step 3: Solanaceae has five epipetalous stamens and a bicarpellary ovary with a swollen placenta; Liliaceae has six stamens in two whorls of three and a tricarpellary ovary. Neither fits.
                Trap: Solanaceae (option A) is the other five-merous family of this chapter — but its stamens are five and epipetalous, never ten and diadelphous.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_29",
            chapterId = "bio_ch_5",
            subject = "Biology",
            topic = "Phyllotaxy — the Whorled Pattern",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 40,
            prompt = "In Alstonia, the leaves are arranged on the stem as:",
            optionA = "a single leaf at each node",
            optionB = "a pair of leaves at each node",
            optionC = "more than two leaves at each node, forming a whorl",
            optionD = "leaves crowded only at the base of the stem",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Phyllotaxy is classified by counting leaves per node: one per node is alternate (China rose, mustard, sunflower), a pair per node is opposite (Calotropis, guava), and more than two per node in a ring is whorled.
                Step 2: Alstonia bears several leaves radiating from each node — more than two per node — so its phyllotaxy is whorled.
                Step 3: Option D describes a basal rosette habit, which is not one of the three standard phyllotaxy patterns tested here.
                Trap: Opposite (option B) is the common slip — opposite means exactly two leaves at a node; the moment a node carries three or more, the pattern is whorled.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_bio_30",
            chapterId = "bio_ch_6",
            subject = "Biology",
            topic = "Monocot Stem — Transverse Section Identification",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A transverse section of a stem shows vascular bundles scattered in undifferentiated ground tissue. Each bundle is oval, wrapped in a sclerenchymatous sheath, has no cambium, and contains a water-filled cavity formed by the breakdown of protoxylem. The section is from:",
            optionA = "A dicot stem such as sunflower",
            optionB = "A monocot stem such as maize",
            optionC = "A dicot root",
            optionD = "A monocot root",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Bundles scattered through ground tissue (no cortex-pith split) with NO cambium are CLOSED bundles — the signature of a monocot stem.
                Step 2: The sclerenchymatous bundle sheath and the lysigenous water cavity from broken-down protoxylem are both listed monocot stem features in NCERT.
                Step 3: Roots are excluded because root bundles are RADIAL (xylem and phloem on separate radii), never conjoint bundles like these.
                Trap: A dicot stem (option A) keeps its bundles in a RING and they are OPEN, with cambium between xylem and phloem — the exact opposite of what this section shows.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_31",
            chapterId = "bio_ch_6",
            subject = "Biology",
            topic = "Epidermal Tissue System — Stomatal Apparatus",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "The stomatal apparatus of a leaf consists of:",
            optionA = "Only the two guard cells",
            optionB = "The guard cells and the trichomes borne on the epidermis",
            optionC = "The stomatal aperture, the guard cells and the surrounding subsidiary cells",
            optionD = "The subsidiary cells and the root hairs",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: NCERT defines the stomatal apparatus as a three-part unit: the stomatal aperture (the pore), the pair of guard cells, and the surrounding subsidiary cells.
                Step 2: Guard cells alone (option A) are incomplete — the definition also needs the pore they enclose and the specialised subsidiary cells around them.
                Step 3: Option C is the only one naming all three parts.
                Trap: Trichomes and root hairs (options B and D) are epidermal outgrowths, but they are not part of the stomatal apparatus; root hairs are unicellular, while stem trichomes are usually multicellular.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_32",
            chapterId = "bio_ch_6",
            subject = "Biology",
            topic = "Secondary Growth — Heartwood and Sapwood",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "In the trunk of an old tree, the part of the secondary xylem that actually conducts water and minerals up the stem is the:",
            optionA = "Sapwood — the peripheral, lighter-coloured region of wood",
            optionB = "Heartwood — the central, dark-coloured region of wood",
            optionC = "Heartwood — because its vessels are plugged by tyloses",
            optionD = "Primary xylem lying next to the pith",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Secondary xylem has two zones: the outer, lighter sapwood (alburnum) and the inner, darker heartwood (duramen).
                Step 2: In heartwood the tracheary elements are blocked by tyloses and loaded with oils, tannins, resins and gums, so it conducts nothing — it only gives mechanical strength and durability.
                Step 3: Conduction continues only in the peripheral sapwood, so option A is correct; option C defeats itself, because tyloses BLOCK conduction rather than enable it.
                Trap: The primary xylem near the pith (option D) was crushed and buried long ago inside the heartwood; age and darkness of wood do not mean it still works as a pipeline.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_33",
            chapterId = "bio_ch_6",
            subject = "Biology",
            topic = "Isobilateral Leaf — Bulliform Cells",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "On a hot, dry afternoon the leaves of a grass plant roll inwards. The cells whose loss of turgor causes this rolling are the:",
            optionA = "Guard cells of the stomata",
            optionB = "Palisade cells of the mesophyll",
            optionC = "Companion cells of the phloem",
            optionD = "Bulliform cells of the upper (adaxial) epidermis",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: In grasses, certain adaxial epidermal cells along the veins are modified into large, empty, colourless cells — the bulliform cells.
                Step 2: When bulliform cells are turgid the leaf stays flat and exposed; under water stress they turn flaccid and the leaf curls inwards, cutting water loss.
                Step 3: The rolling is therefore a bulliform-cell movement, option D.
                Trap: Guard cells (option A) open and close the stomatal pore — they do not roll the whole lamina. Palisade tissue (option B) is not even differentiated in a grass leaf, whose mesophyll is uniform — that is what makes it isobilateral.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_34",
            chapterId = "bio_ch_6",
            subject = "Biology",
            topic = "Secondary Growth — Activity of the Vascular Cambium",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "The vascular cambium of a dicot stem cuts off new cells towards both its inner and outer sides. The cells cut off towards the pith mature into ______, while those cut off towards the periphery mature into ______.",
            optionA = "Secondary phloem; secondary xylem",
            optionB = "Primary xylem; primary phloem",
            optionC = "Secondary xylem; secondary phloem",
            optionD = "Cork (phellem); secondary cortex (phelloderm)",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Fix the map: inside the cambium ring lies the wood side, outside it lies the bark side.
                Step 2: NCERT states the cambium cuts cells towards the pith that mature into secondary xylem, and cells towards the periphery that mature into secondary phloem — and it makes more xylem than phloem, which is why trunks are mostly wood.
                Step 3: Option C gives the pair in the correct order.
                Trap: Option A simply reverses the pair — the classic slip. Option D names the products of the CORK cambium, a different lateral meristem that works further out; the vascular cambium never produces cork.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_bio_35",
            chapterId = "bio_ch_7",
            subject = "Biology",
            topic = "Connective Tissue — Tendon versus Ligament",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "A strong white cord of dense regular connective tissue connects a skeletal muscle to a bone and transmits the pull of contraction. This cord is a:",
            optionA = "Ligament",
            optionB = "Tendon",
            optionC = "Cartilage",
            optionD = "Areolar tissue",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Ask what the cord joins. One end is a muscle and the other end is a bone — the structure exists to transmit the muscle's pull to the skeleton.
                Step 2: Dense regular connective tissue arranged as muscle-to-bone cords is, by NCERT definition, a tendon.
                Step 3: The answer is therefore Tendon.
                Trap: A ligament (option A) follows the mirror-image rule — it connects bone to bone at a joint and never attaches to a muscle. Cartilage (option C) is a solid, pliable skeletal tissue, and areolar tissue (option D) is loose packing tissue, not a cord.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_36",
            chapterId = "bio_ch_7",
            subject = "Biology",
            topic = "Muscular Tissue — Intercalated Discs",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A muscle sample shows branched fibres with striations and dark transverse lines called intercalated discs at the junctions between cells. The tissue is:",
            optionA = "Skeletal muscle",
            optionB = "Smooth muscle",
            optionC = "Cardiac muscle",
            optionD = "Dense regular connective tissue",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Intercalated discs are found in exactly one tissue in the body — they are the specialised junctions between heart-muscle cells.
                Step 2: The other clues agree: the fibres branch (unlike skeletal fibres) and they are striated (unlike smooth muscle).
                Step 3: Branching plus striations plus intercalated discs together can only be cardiac muscle.
                Trap: Do not let the striations drag you to skeletal muscle (option A) — cardiac muscle is striated too, but skeletal fibres are unbranched, multinucleate and never have intercalated discs. Smooth muscle (option B) has no striations at all.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_37",
            chapterId = "bio_ch_7",
            subject = "Biology",
            topic = "Cell Junctions — Gap Junction Function",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 75,
            prompt = "Neighbouring cells of an epithelium exchange ions and small signalling molecules directly from cytoplasm to cytoplasm, so the whole sheet responds as one unit. The junctions making this possible are:",
            optionA = "Gap junctions",
            optionB = "Tight junctions",
            optionC = "Adhering junctions",
            optionD = "Intercalated discs",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: The key phrase is "directly from cytoplasm to cytoplasm" — that requires an open channel through both cell membranes, not just contact.
                Step 2: Gap junctions are protein channels that connect the cytoplasms of adjacent cells and permit the rapid transfer of ions and small molecules; this is how tissues like cardiac muscle coordinate.
                Step 3: Only option A provides a through-route for substances, so the answer is Gap junctions.
                Trap: Tight junctions (option B) do the exact opposite — they seal the gap so nothing leaks across. Adhering junctions (option C) only cement cells together mechanically. Intercalated discs (option D) are a feature of cardiac muscle as a whole; the gap junctions inside them are what actually pass the ions.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_38",
            chapterId = "bio_ch_7",
            subject = "Biology",
            topic = "Specialised Connective Tissue — Cartilage Cells",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "The cells of cartilage, which lie enclosed in small cavities called lacunae within a solid but pliable protein-rich matrix, are called:",
            optionA = "Osteocytes",
            optionB = "Fibroblasts",
            optionC = "Adipocytes",
            optionD = "Chondrocytes",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: The tissue is cartilage — solid yet pliable matrix, cells sitting in lacunae, found at the nose tip, ear pinna and limb joints.
                Step 2: NCERT names the cells of cartilage chondrocytes.
                Step 3: The answer is Chondrocytes.
                Trap: Osteocytes (option A) are the cells of bone — they also sit in lacunae, which is exactly why this pair is tested; separate them by the tissue, not by the lacuna. Fibroblasts (option B) secrete fibres in areolar and dense connective tissue, and adipocytes (option C) are fat-storing cells of adipose tissue.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_39",
            chapterId = "bio_ch_7",
            subject = "Biology",
            topic = "Glandular Epithelium — Goblet Cells",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "Goblet cells, which secrete mucus in the lining of the intestine, are classified as:",
            optionA = "Multicellular glandular epithelium",
            optionB = "Unicellular glandular epithelium",
            optionC = "Compound epithelium",
            optionD = "Ciliated columnar epithelium",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Count the cells doing the secreting. A goblet cell is a single modified columnar cell that fills with mucus and releases it — the whole gland is one cell.
                Step 2: Glandular epithelium built from isolated single secretory cells is unicellular glandular epithelium; glands made of clusters of cells, like the salivary glands, are multicellular.
                Step 3: The answer is Unicellular glandular epithelium.
                Trap: Option A is the classic misfile — students assume any named gland must be multicellular. Option D describes the epithelium of the bronchioles and fallopian tubes, not a secretory classification, and compound epithelium (option C) refers to layered protective sheets like skin.
            """.trimIndent()
        ),
QuestionEntity(
    id = "q_bio_40",
    chapterId = "bio_ch_8",
    subject = "Biology",
    topic = "Ribosomes",
    examSource = "IISER IAT",
    examYear = null,
    isImportantQuestion = true,
    isPyq = false,
    difficulty = "Analytical",
    estimatedSeconds = 50,
    prompt = "Ribosomes isolated from two compartments of the same leaf cell are found to be of two different types. Identify the correct pairing.",
    optionA = "Chloroplast — 80S; Cytosol — 70S",
    optionB = "Chloroplast — 70S; Cytosol — 80S",
    optionC = "Chloroplast — 80S; Cytosol — 80S",
    optionD = "Chloroplast — 70S; Cytosol — 70S",
    correctOptionIndex = 1,
    stepByStepExplanation = """
        Answer: (b) Chloroplast — 70S; Cytosol — 80S.
        • Ribosomes of the eukaryotic cytoplasm are 80S, made of 60S and 40S subunits.
        • Inside chloroplasts and mitochondria, ribosomes are 70S, made of 50S and 30S subunits — the prokaryotic pattern.
        • Location decides the type, not the cell the organelle sits in.
        • Why the others fail:
        • (a) and (c) give the chloroplast 80S ribosomes — organelles never carry 80S.
        • (d) gives the cytosol 70S — eukaryotic cytosol always uses 80S.
    """.trimIndent()
),
QuestionEntity(
    id = "q_bio_41",
    chapterId = "bio_ch_8",
    subject = "Biology",
    topic = "Plasma Membrane",
    examSource = "IISER IAT",
    examYear = null,
    isImportantQuestion = true,
    isPyq = false,
    difficulty = "Easy",
    estimatedSeconds = 30,
    prompt = "The fluid mosaic model of the plasma membrane, describing proteins floating in a quasi-fluid lipid bilayer, was proposed by:",
    optionA = "Schleiden and Schwann",
    optionB = "Camillo Golgi",
    optionC = "Singer and Nicolson",
    optionD = "Robert Brown",
    correctOptionIndex = 2,
    stepByStepExplanation = """
        Answer: (c) Singer and Nicolson.
        • Singer and Nicolson proposed the fluid mosaic model in 1972.
        • In this model, the quasi-fluid nature of the lipid bilayer enables lateral movement of proteins within the membrane.
        • Why the others fail:
        • (a) Schleiden and Schwann gave the cell theory (1838–1839), not a membrane model.
        • (b) Camillo Golgi discovered the Golgi apparatus in 1898.
        • (d) Robert Brown described the nucleus in 1831.
    """.trimIndent()
),
QuestionEntity(
    id = "q_bio_42",
    chapterId = "bio_ch_8",
    subject = "Biology",
    topic = "Lysosomes",
    examSource = "IISER IAT",
    examYear = null,
    isImportantQuestion = true,
    isPyq = false,
    difficulty = "Easy",
    estimatedSeconds = 30,
    prompt = "The hydrolytic enzymes of lysosomes — lipases, proteases and carbohydrases — are optimally active at:",
    optionA = "Acidic pH",
    optionB = "Neutral pH",
    optionC = "Alkaline pH",
    optionD = "Any pH, equally",
    correctOptionIndex = 0,
    stepByStepExplanation = """
        Answer: (a) Acidic pH.
        • Lysosomes are rich in hydrolytic enzymes capable of digesting carbohydrates, proteins, lipids and nucleic acids.
        • NCERT states these enzymes are optimally active at the acidic pH maintained inside the lysosome.
        • Why the others fail:
        • (b) Neutral pH is the pH of the cytoplasm, where these enzymes are comparatively inactive — a safety feature for the cell.
        • (c) and (d) contradict the stated acidic optimum.
    """.trimIndent()
),
QuestionEntity(
    id = "q_bio_43",
    chapterId = "bio_ch_8",
    subject = "Biology",
    topic = "Chromosomes",
    examSource = "IISER IAT",
    examYear = null,
    isImportantQuestion = true,
    isPyq = false,
    difficulty = "Moderate",
    estimatedSeconds = 40,
    prompt = "A chromosome has its centromere situated close to one end, so that one arm is extremely short and the other is very long. This chromosome is:",
    optionA = "Metacentric",
    optionB = "Submetacentric",
    optionC = "Telocentric",
    optionD = "Acrocentric",
    correctOptionIndex = 3,
    stepByStepExplanation = """
        Answer: (d) Acrocentric.
        • Chromosome types are classified by centromere position: metacentric (middle), submetacentric (slightly off the middle), acrocentric (close to one end), telocentric (terminal).
        • An acrocentric chromosome appears J-shaped during anaphase.
        • Why the others fail:
        • (a) Metacentric has the centromere in the middle with two equal arms and looks V-shaped.
        • (b) Submetacentric has one shorter and one longer arm, but the short arm is not extremely short; it looks L-shaped.
        • (c) Telocentric has the centromere at the very tip and looks i-shaped.
    """.trimIndent()
),
QuestionEntity(
    id = "q_bio_44",
    chapterId = "bio_ch_8",
    subject = "Biology",
    topic = "Prokaryotic Cell",
    examSource = "IISER IAT",
    examYear = null,
    isImportantQuestion = true,
    isPyq = false,
    difficulty = "Moderate",
    estimatedSeconds = 45,
    prompt = "Mesosomes in a bacterial cell are infoldings of the plasma membrane. Which set of functions is correctly attributed to them?",
    optionA = "Photosynthesis and nitrogen fixation only",
    optionB = "Motility and attachment to host tissues",
    optionC = "Cell wall formation, DNA replication and distribution, respiration and secretion",
    optionD = "Storage of reserve food as granules",
    correctOptionIndex = 2,
    stepByStepExplanation = """
        Answer: (c) Cell wall formation, DNA replication and distribution, respiration and secretion.
        • Mesosomes are specialised differentiated forms of the plasma membrane, as vesicles, tubules and lamellae.
        • NCERT lists their roles: cell wall formation, DNA replication and distribution to daughter cells, respiration, secretion processes, and increasing the surface area and enzymatic content of the membrane.
        • Why the others fail:
        • (a) Pigment-bearing chromatophores, not mesosomes, serve photosynthesis in bacteria like cyanobacteria.
        • (b) Motility belongs to flagella; attachment belongs to pili and fimbriae.
        • (d) Reserve material is stored in inclusion bodies such as phosphate and glycogen granules.
    """.trimIndent()
),
QuestionEntity(
            id = "q_bio_45",
            chapterId = "bio_ch_9",
            subject = "Biology",
            topic = "Polysaccharides — Iodine Test",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "A student adds iodine solution to three powdered samples — starch, cellulose and glycogen. Which observation is correct?",
            optionA = "All three turn blue-black because all are glucose polymers",
            optionB = "Starch turns blue-black, but cellulose gives no blue colour",
            optionC = "Cellulose turns blue-black, but starch gives no colour",
            optionD = "Only glycogen turns blue-black; starch and cellulose stay colourless",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Iodine gives its blue-black colour only when it is trapped inside a helical polysaccharide.
                Step 2: The amylose of starch coils into a helix (alpha-1,4 links), so starch holds iodine and turns blue-black.
                Step 3: Cellulose has beta-1,4 links and forms straight chains with no helix, so there is nothing to trap the iodine and no blue colour appears.
                Trap: Do not reason from the monomer — all three are glucose polymers, but the test reads the SHAPE (helix), not the building block.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_46",
            chapterId = "bio_ch_9",
            subject = "Biology",
            topic = "Enzymes — Competitive Inhibition",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "Malonate slows down the enzyme succinic dehydrogenase, which acts on succinate. Malonate resembles succinate in structure, and adding extra succinate restores the enzyme's activity. Malonate is best described as",
            optionA = "A cofactor that the enzyme needs in small amounts",
            optionB = "A non-competitive inhibitor that binds away from the active site",
            optionC = "A competitive inhibitor that competes with succinate for the active site",
            optionD = "An activator that denatures at high temperature",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: The active site accepts molecules of one particular shape — here, succinate.
                Step 2: Malonate closely resembles succinate, so it can occupy the same active site and block it.
                Step 3: Because the block is a competition for the site, extra succinate outcompetes malonate and activity returns — the signature of competitive inhibition.
                Trap: A non-competitive inhibitor binds elsewhere and is NOT overcome by adding more substrate, so option B fails the recovery clue.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_47",
            chapterId = "bio_ch_9",
            subject = "Biology",
            topic = "Proteins — Quaternary Structure",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "Adult human haemoglobin, the standard example of quaternary protein structure, is an assembly of",
            optionA = "Two alpha chains and two beta chains",
            optionB = "Four identical alpha chains",
            optionC = "One alpha chain and three beta chains",
            optionD = "A single polypeptide folded into four domains",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Quaternary structure means more than one polypeptide chain assembled into one functional protein.
                Step 2: Adult haemoglobin contains four chains in total.
                Step 3: The composition is two alpha chains plus two beta chains — alpha2 beta2.
                Trap: Four chains does not mean four identical chains, and a single folded chain (however many domains) is tertiary, not quaternary, structure.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_48",
            chapterId = "bio_ch_9",
            subject = "Biology",
            topic = "Nucleic Acids — Nucleoside vs Nucleotide",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "Adenosine is a nucleoside made of adenine and ribose. What single addition converts adenosine into a nucleotide?",
            optionA = "A second nitrogenous base",
            optionB = "One more ribose sugar",
            optionC = "A deoxyribose in place of the ribose",
            optionD = "A phosphate group",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: A nucleoside is base plus sugar — adenosine is adenine joined to ribose.
                Step 2: A nucleotide is a nucleoside plus one more component.
                Step 3: That component is the phosphate group, attached to the sugar; base plus sugar plus phosphate completes the nucleotide.
                Trap: Swapping ribose for deoxyribose changes the sugar (RNA-type to DNA-type) but the molecule would still be a nucleoside without a phosphate.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_49",
            chapterId = "bio_ch_9",
            subject = "Biology",
            topic = "Proteins — Abundance Records",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "Which protein is the most abundant protein in the animal world?",
            optionA = "RuBisCO",
            optionB = "Haemoglobin",
            optionC = "Collagen",
            optionD = "Keratin",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Collagen is the structural protein of skin, tendons, ligaments and bone matrix, present in huge amounts across animals.
                Step 2: NCERT records collagen as the most abundant protein in the animal world.
                Step 3: Its triple-helical ropes are built for tensile strength, which is why animals invest so much protein in it.
                Trap: RuBisCO is the most abundant protein of the whole biosphere (plants included) — the option set's scope here is the animal world, where the answer is collagen.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_bio_50",
            chapterId = "bio_ch_10",
            subject = "Biology",
            topic = "Meiosis — Prophase I Sub-Stages",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "Crossing over — the exchange of corresponding segments between non-sister chromatids of homologous chromosomes — takes place during which sub-stage of prophase I?",
            optionA = "Leptotene",
            optionB = "Pachytene",
            optionC = "Diplotene",
            optionD = "Diakinesis",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Place the event on the prophase I ladder: leptotene shows threads appearing, zygotene is synapsis, and the exchange itself comes next.
                Step 2: In pachytene the four chromatids of the bivalent are distinct and recombination nodules appear — the sites where crossing over is carried out by the enzyme recombinase.
                Step 3: Diplotene only displays the result, as chiasmata, and diakinesis terminalises them. The exchange event belongs to pachytene.
                Trap: Diplotene (option C) is the engineered distractor — chiasmata are seen there, but the crossing over they record already happened one sub-stage earlier.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_51",
            chapterId = "bio_ch_10",
            subject = "Biology",
            topic = "Cell Cycle — DNA Replication Bookkeeping",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A diploid cell contains 30 chromosomes during G1 phase. After it completes the S phase, the number of chromatids present in the cell will be:",
            optionA = "15",
            optionB = "30",
            optionC = "60",
            optionD = "120",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: In G1 each of the 30 chromosomes consists of a single chromatid, so the cell starts with 30 chromatids.
                Step 2: During S phase every chromosome is replicated, gaining an identical sister chromatid joined at the same centromere. Chromatid number therefore doubles.
                Step 3: 30 chromosomes with 2 chromatids each gives 60 chromatids — while the chromosome number itself stays 30, because chromosomes are counted by centromeres and no new centromeres were made.
                Trap: Option D (120) doubles twice; option B (30) forgets replication adds a chromatid to every chromosome; option A (15) applies a meiosis-style halving that has no place in interphase.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_52",
            chapterId = "bio_ch_10",
            subject = "Biology",
            topic = "Division Mechanics — the Centromere Split",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 75,
            prompt = "Splitting of the centromere, which separates the sister chromatids from each other, takes place during:",
            optionA = "Anaphase I of meiosis",
            optionB = "Prophase I of meiosis",
            optionC = "Metaphase I of meiosis",
            optionD = "Both anaphase of mitosis and anaphase II of meiosis",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: Ask what separates in anaphase I: homologous chromosomes move apart there, but each travels as a whole two-chromatid chromosome — the centromere pointedly does not split. Option A fails.
                Step 2: Prophase I and metaphase I are pairing and alignment stages; nothing separates in either, so options B and C fail.
                Step 3: The centromere splits exactly where sister chromatids part — in the anaphase of mitosis, and again in anaphase II of meiosis, which repeats the mitotic pattern on haploid cells.
                Trap: The question is engineered so that a student who memorised "centromeres split in anaphase" without asking "which anaphase" either grabs anaphase I or misses that two different divisions qualify.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_53",
            chapterId = "bio_ch_10",
            subject = "Biology",
            topic = "Mitosis — Metaphase and Karyotyping",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "The morphology of chromosomes — their size, shape and the position of the centromere — can be studied most easily and clearly at which stage of mitosis?",
            optionA = "Metaphase",
            optionB = "Prophase",
            optionC = "Anaphase",
            optionD = "Telophase",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Chromosome morphology can only be read when chromosomes are maximally condensed and individually distinct.
                Step 2: At metaphase condensation is complete, the nuclear envelope has fully disintegrated, and the chromosomes lie aligned on the metaphase plate — the clearest possible portrait, which is why karyotypes are prepared from metaphase cells.
                Step 3: In prophase condensation is still in progress and chromosomes are entangled; in anaphase they are moving and bent by travel; in telophase they decondense back into chromatin.
                Trap: Prophase (option B) tempts because condensation "begins" there — beginning is not peak clarity. The exam key is always metaphase.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_54",
            chapterId = "bio_ch_10",
            subject = "Biology",
            topic = "Cell Cycle — the G0 Quiescent Stage",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "Which of the following cell types in an adult animal stays out of the division cycle in the quiescent G0 stage and does not exhibit division?",
            optionA = "Cells lining the gut",
            optionB = "Skin cells that replace the surface layers",
            optionC = "Heart cells",
            optionD = "Cells of the bone marrow",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: G0 is the inactive stage entered from G1 by cells that remain metabolically active but no longer proliferate.
                Step 2: NCERT's standing example of cells that do not appear to exhibit division in the adult animal is the heart cell — heart muscle serves for a lifetime without a dividing replacement pool.
                Step 3: The other three options are all continuously renewing populations: gut lining, skin surface and bone marrow divide throughout life precisely because their cells are constantly lost.
                Trap: "Do not divide" does not mean dead or inactive — G0 cells like heart cells work constantly; what they have exited is the division cycle, not metabolism.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_bio_55",
            chapterId = "bio_ch_11",
            subject = "Biology",
            topic = "Photosynthesis — Source of Evolved Oxygen",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "The oxygen released during photosynthesis comes from:",
            optionA = "Carbon dioxide",
            optionB = "Water",
            optionC = "Glucose",
            optionD = "Chlorophyll",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: In the light reactions, water is split at photosystem II (photolysis) to replace the electrons expelled from P680.
                Step 2: The splitting of two water molecules releases four protons, four electrons and one oxygen molecule — that oxygen is what leaves the leaf.
                Step 3: Van Niel proposed water as the source, and Ruben and Kamen proved it with oxygen-18 labelled water: the label appears in the evolved oxygen, not when carbon dioxide is labelled.
                Trap: Carbon dioxide (option A) is the seductive wrong answer because it contains oxygen — but its oxygen atoms end up in glucose and water, not in the gas released.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_56",
            chapterId = "bio_ch_11",
            subject = "Biology",
            topic = "C4 Pathway — First Product and Enzyme",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "In a maize leaf, the first stable product of carbon dioxide fixation, and the enzyme that forms it in the mesophyll cells, are:",
            optionA = "PGA and RuBisCO",
            optionB = "OAA and RuBisCO",
            optionC = "OAA and PEP carboxylase",
            optionD = "PGA and PEP carboxylase",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Maize is a C4 plant, so carbon dioxide is fixed twice — first in the mesophyll, then again in the bundle sheath.
                Step 2: The first fixation joins carbon dioxide to the three-carbon acceptor PEP, giving the four-carbon acid oxaloacetic acid (OAA) — the product that names the C4 pathway.
                Step 3: The enzyme for this first fixation is PEP carboxylase, which has high affinity for carbon dioxide and no oxygenase activity. RuBisCO works later, in the bundle sheath, on the carbon dioxide released from OAA derivatives.
                Trap: PGA and RuBisCO (option A) describe the C3 first step — and also the second step inside the C4 bundle sheath — but the question asks for the FIRST product in the mesophyll.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_57",
            chapterId = "bio_ch_11",
            subject = "Biology",
            topic = "Cyclic Photophosphorylation — Products",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "During cyclic photophosphorylation in a chloroplast, which of the following is produced?",
            optionA = "ATP only",
            optionB = "ATP and NADPH",
            optionC = "NADPH and oxygen",
            optionD = "ATP, NADPH and oxygen",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: In cyclic flow only photosystem I operates; the electron expelled from P700 travels through carriers and returns to P700 itself.
                Step 2: Because the electron is recycled, no external electron donor is needed — water is not split, so no oxygen is released.
                Step 3: The electrons never reach NADP reductase, so no NADPH is formed. The loop still pumps protons, so ATP is made by chemiosmosis.
                Trap: Options B and D describe non-cyclic photophosphorylation, where both photosystems work together and all three products appear.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_58",
            chapterId = "bio_ch_11",
            subject = "Biology",
            topic = "Calvin Cycle — ATP and NADPH Cost",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 75,
            prompt = "For the synthesis of one molecule of glucose by the Calvin cycle, the numbers of ATP and NADPH molecules consumed are respectively:",
            optionA = "12 ATP and 18 NADPH",
            optionB = "18 ATP and 12 NADPH",
            optionC = "3 ATP and 2 NADPH",
            optionD = "30 ATP and 12 NADPH",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: One glucose contains six carbons, so the cycle must fix six molecules of carbon dioxide — six turns.
                Step 2: Per carbon dioxide fixed, the cycle spends three ATP and two NADPH (reduction of PGA plus regeneration of RuBP).
                Step 3: Scale up: six times three gives eighteen ATP, and six times two gives twelve NADPH.
                Trap: Option A swaps the pair — the ATP figure is always the larger one. Option C is the cost per single carbon dioxide, not per glucose; read what the question prices before answering.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_59",
            chapterId = "bio_ch_11",
            subject = "Biology",
            topic = "Photorespiration — RuBisCO Oxygenase Activity",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 75,
            prompt = "Photorespiration in C3 plants is initiated when RuBisCO binds oxygen instead of carbon dioxide. A correct consequence of this process is:",
            optionA = "Net synthesis of ATP and NADPH in the chloroplast",
            optionB = "Formation of one molecule of PGA and one of phosphoglycolate from RuBP",
            optionC = "Fixation of additional carbon dioxide by the C2 cycle",
            optionD = "Release of oxygen as the main gaseous product",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: RuBisCO is a carboxylase-oxygenase: with carbon dioxide it carboxylates RuBP; with oxygen it oxygenates it.
                Step 2: Oxygenation of the five-carbon RuBP gives one three-carbon PGA and one two-carbon phosphoglycolate — option B states exactly this split.
                Step 3: Salvaging phosphoglycolate through the C2 cycle (chloroplast, peroxisome, mitochondrion) consumes ATP and releases previously fixed carbon dioxide; no ATP, NADPH or sugar is synthesised, which is why photorespiration is called wasteful.
                Trap: Option A reverses the energy account, option C reverses the carbon account (carbon dioxide is released, not fixed), and option D confuses photorespiration with photolysis, which is where oxygen is released.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_bio_60",
            chapterId = "bio_ch_12",
            subject = "Biology",
            topic = "Glycolysis — Site and Net ATP Gain",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "Glycolysis, the EMP pathway that converts one glucose into two pyruvate, takes place in the ______ and gives a net gain of ______ ATP per glucose.",
            optionA = "Mitochondrial matrix; 4 ATP",
            optionB = "Mitochondrial matrix; 2 ATP",
            optionC = "Cytoplasm; 2 ATP",
            optionD = "Cytoplasm; 8 ATP",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Glycolysis is the partial oxidation of glucose that occurs in the cytoplasm of the cell; it does not require mitochondria or oxygen.
                Step 2: During the payoff phase four ATP are produced by substrate-level phosphorylation, but two ATP were invested earlier to phosphorylate glucose and fructose-6-phosphate.
                Step 3: Net gain = 4 produced minus 2 invested = 2 ATP per glucose, along with 2 NADH + H+.
                Trap: Option A quotes the gross production of 4 ATP instead of the net gain, and option D adds the value of the two NADH — the question asks only for the net ATP of glycolysis itself.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_61",
            chapterId = "bio_ch_12",
            subject = "Biology",
            topic = "Krebs Cycle — Yield from One Acetyl CoA",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 75,
            prompt = "One molecule of acetyl CoA entering the Krebs cycle is completely oxidised. The direct yield of this single turn of the cycle is:",
            optionA = "3 NADH + H+, 1 FADH2, 1 GTP and 2 CO2",
            optionB = "6 NADH + H+, 2 FADH2, 2 GTP and 4 CO2",
            optionC = "2 NADH + H+, 1 FADH2, 1 GTP and 1 CO2",
            optionD = "3 NADH + H+, 1 FADH2, 2 GTP and 2 CO2",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Fix the unit first — the question asks about ONE acetyl CoA, that is, one turn of the cycle, not one glucose.
                Step 2: In one turn, decarboxylations at the isocitrate and alpha-ketoglutarate steps release 2 CO2 and produce 2 NADH; the malate step produces the third NADH.
                Step 3: The succinate to fumarate step produces 1 FADH2, and the succinyl-CoA to succinate step produces 1 GTP — giving 3 NADH + H+, 1 FADH2, 1 GTP and 2 CO2 in total.
                Trap: Option B is the per-glucose yield (two turns) — the classic doubling error. Option D doubles only the GTP, which is produced once per turn.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_62",
            chapterId = "bio_ch_12",
            subject = "Biology",
            topic = "Respiratory Quotient — Fats and Tripalmitin",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "When the fatty acid tripalmitin is used as a respiratory substrate, 2(C51H98O6) + 145 O2 gives 102 CO2 + 98 H2O + energy. Its respiratory quotient (RQ) is approximately:",
            optionA = "1.0",
            optionB = "1.42",
            optionC = "4.0",
            optionD = "0.7",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: RQ is defined as the volume of CO2 evolved divided by the volume of O2 consumed — carbon out over oxygen in.
                Step 2: From the equation, CO2 evolved = 102 and O2 consumed = 145, so RQ = 102 / 145 = 0.703, approximately 0.7.
                Step 3: A value below 1 is the signature of fats: they are oxygen-poor compounds, so proportionally more oxygen must be taken in to oxidise them.
                Trap: Option B (1.42) comes from inverting the ratio to 145 / 102. Option A (1.0) is the RQ of carbohydrates, and option C (4.0) is the RQ of organic acids such as oxalic acid.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_63",
            chapterId = "bio_ch_12",
            subject = "Biology",
            topic = "Electron Transport System — Final Hydrogen Acceptor",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "In the electron transport system of aerobic respiration, the final hydrogen acceptor, which is reduced to form water at the end of the chain, is:",
            optionA = "NAD+",
            optionB = "Oxygen",
            optionC = "Cytochrome c",
            optionD = "FAD",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: The ETS passes hydrogen (electrons) from NADH and FADH2 through complexes I to IV on the inner mitochondrial membrane.
                Step 2: At Complex IV, the electrons and hydrogen are handed to the terminal acceptor; oxygen accepts them and, with protons, forms water — this is why oxygen is called the final hydrogen acceptor.
                Step 3: Because oxygen waits at the end of the chain, the whole of aerobic respiration depends on it even though no earlier stage uses it directly.
                Trap: NAD+ and FAD (options A and D) are the hydrogen acceptors at the START of the story — they collect hydrogen in glycolysis, the link reaction and the Krebs cycle. Cytochrome c (option C) is only a mobile carrier between complexes III and IV.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_64",
            chapterId = "bio_ch_12",
            subject = "Biology",
            topic = "Fermentation — Yeast Self-Poisoning Limit",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A brewery vat stops fermenting even though plenty of sugar remains. The most likely explanation, as stated in NCERT, is that:",
            optionA = "All the NAD+ in the yeast cells has been permanently destroyed",
            optionB = "The yeast has used up all its pyruvic acid decarboxylase enzyme",
            optionC = "The yeasts poison themselves to death when the alcohol concentration reaches about 13 per cent",
            optionD = "The carbon dioxide produced raises the pressure until glycolysis cannot proceed",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: In alcoholic fermentation the yeast converts pyruvate to ethanol and CO2, regenerating NAD+ so glycolysis can continue.
                Step 2: Ethanol, however, is toxic to the yeast itself. NCERT states that yeasts poison themselves to death when the concentration of alcohol exceeds about 13 per cent.
                Step 3: Fermentation therefore stops at that ceiling even with sugar left over — which is why beverages stronger than this require distillation rather than fermentation alone.
                Trap: Option A fails because fermentation is precisely the process that regenerates NAD+; the coenzyme cycles and is not consumed. Enzymes (option B) are catalysts and are not used up by the reactions they drive.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_bio_65",
            chapterId = "bio_ch_13",
            subject = "Biology",
            topic = "Auxins — 2,4-D as a Selective Herbicide",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A wheat field is sprayed with 2,4-D. The broad-leaved weeds in the field are killed, but the wheat crop is unharmed. This selective action works because 2,4-D:",
            optionA = "Is a natural auxin that poisons every kind of weed equally",
            optionB = "Kills dicotyledonous weeds but does not affect mature monocotyledonous plants",
            optionC = "Is a gibberellin that makes weeds grow so fast that they collapse",
            optionD = "Starves the weeds by forcing their stomata to close permanently",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Identify the compound — 2,4-D is a synthetic auxin, widely used as a herbicide.
                Step 2: Recall its selectivity from NCERT: it kills dicotyledonous weeds and does not affect mature monocotyledonous plants. Wheat is a monocot; the broad-leaved weeds in the field are dicots.
                Step 3: The spray therefore removes the dicot weeds while the monocot crop survives — the same reason 2,4-D is used to prepare weed-free lawns.
                Trap: Option A fails twice — 2,4-D is synthetic, not natural, and it is not equally effective on all weeds. Option D describes an abscisic-acid-style effect, and option C hands the job to the wrong hormone family.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_66",
            chapterId = "bio_ch_13",
            subject = "Biology",
            topic = "Gibberellins — Bakanae Disease and Discovery",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "The bakanae (foolish seedling) disease of rice, reported by Kurosawa in 1926, is caused by the fungal pathogen Gibberella fujikuroi secreting:",
            optionA = "Indole-3-acetic acid",
            optionB = "Kinetin",
            optionC = "Gibberellic acid",
            optionD = "Abscisic acid",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Match the disease to its story — bakanae means foolish seedling: infected rice seedlings grow absurdly tall, pale and weak.
                Step 2: Kurosawa traced the symptoms to the fungus Gibberella fujikuroi, and the substance it secretes was identified as gibberellic acid — the first gibberellin story.
                Step 3: Excess gibberellin explains the foolish elongation, so the answer is gibberellic acid.
                Trap: Indole-3-acetic acid (option A) is the natural auxin, isolated through the Went coleoptile work, not through a rice disease. Kinetin (option B) is the laboratory cytokinin of Skoog and Miller, and abscisic acid (option D) inhibits growth — it would dwarf a seedling, not stretch it.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_67",
            chapterId = "bio_ch_13",
            subject = "Biology",
            topic = "Photoperiodism — the Night-Break Experiment",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 75,
            prompt = "A short-day plant kept under 8 hours of light and 16 hours of darkness fails to flower when the dark period is interrupted midway by a brief flash of light, although the total light it receives is almost unchanged. The best interpretation is:",
            optionA = "Flowering is controlled by the length of the uninterrupted dark period — the plant measures the night, not the day",
            optionB = "Flowering depends on the total amount of light energy received in 24 hours",
            optionC = "The flash of light damages the shoot apical meristem",
            optionD = "The flash provides extra photosynthate, and well-fed plants do not flower",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Notice what the flash changes and what it does not. Total light duration and energy are nearly identical in the two regimes; only the continuity of the dark period differs.
                Step 2: Since the outcome flips with continuity alone, the measured variable must be the dark period. A short-day plant is a long-night plant: it needs one long, unbroken night longer than a critical duration.
                Step 3: The flash splits 16 hours of darkness into two short nights, so the requirement is never met and flowering is blocked. Option A states exactly this.
                Trap: Option B is refuted by the design of the experiment itself — light total barely changed, yet flowering stopped. Options C and D invent injuries and feeding effects that no part of the observation supports.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_68",
            chapterId = "bio_ch_13",
            subject = "Biology",
            topic = "Abscisic Acid — Stomatal Closure and Stress",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "During drought, the plant hormone that stimulates the closure of stomata, increases tolerance to stress, and is therefore called the stress hormone is:",
            optionA = "Ethylene",
            optionB = "Auxin",
            optionC = "Gibberellin",
            optionD = "Abscisic acid",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: Pick out the signature pair in the stem — stomatal closure plus stress tolerance. In NCERT, that pair belongs to one hormone.
                Step 2: Abscisic acid (ABA) stimulates closure of stomata and increases the tolerance of plants to various kinds of stresses, which is why it is called the stress hormone.
                Step 3: The other options belong to other stories — ethylene ripens fruit, auxin drives apical dominance and rooting, gibberellin elongates stems — so the answer is abscisic acid.
                Trap: Ethylene (option A) is tempting because it also deals with adverse situations like flooding and senescence, but stomatal closure in drought is ABA's named function. The word "stress hormone" in the stem is the giveaway.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_69",
            chapterId = "bio_ch_13",
            subject = "Biology",
            topic = "Growth Rates — Geometric Growth",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "Which of the following is an example of geometric growth?",
            optionA = "A root elongating by exactly 0.5 cm every day at a constant rate",
            optionB = "A zygote in which both daughter cells, and all their progeny, retain the capacity to divide",
            optionC = "A mature leaf expanding in area after its cells have stopped dividing",
            optionD = "A culture whose growth has levelled off in the stationary phase",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: State the definition first — in geometric growth, both daughter cells after mitosis retain the capacity to divide, so the dividing population doubles each round and growth is exponential.
                Step 2: Test option B against the definition: a zygote whose every progeny cell keeps dividing matches it word for word. This is the pattern of early embryo development.
                Step 3: Eliminate the rest — option A is a constant increment, which is arithmetic growth (Lt = L0 + rt); option C is enlargement without division; option D is the stationary phase of a sigmoid curve, where net growth has stopped.
                Trap: Option A is the designed confusion — steady daily growth feels vigorous, but geometric growth is defined by who keeps dividing, not by how fast size increases. Option D borrows sigmoid vocabulary to describe a phase, not a division pattern.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_bio_70",
            chapterId = "bio_ch_14",
            subject = "Biology",
            topic = "Respiratory Volumes and Capacities — Vital Capacity",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "Vital capacity is the maximum volume of air a person can expel after a forced inspiration. It is equal to:",
            optionA = "IRV + TV + RV",
            optionB = "ERV + RV + IRV",
            optionC = "IRV + TV + ERV",
            optionD = "TV + ERV + RV",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Vital capacity counts only the air that can actually move in one maximal effort — everything you can breathe in on top of a normal breath (IRV), the normal breath itself (TV), and everything extra you can force out (ERV).
                Step 2: Adding the NCERT ranges gives roughly 2500 to 3000 plus 500 plus 1000 to 1100, which lands in the vital capacity range of 3500 to 4500 mL.
                Step 3: Residual volume (RV) can never be expelled, so it is excluded from vital capacity even though it is part of total lung capacity.
                Trap: Every wrong option smuggles RV into the sum. Any formula containing RV is disqualified before you even check the arithmetic — RV appears in TLC and FRC, never in VC.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_71",
            chapterId = "bio_ch_14",
            subject = "Biology",
            topic = "Exchange of Gases — Partial Pressure of Oxygen in the Alveoli",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 40,
            prompt = "In the standard partial-pressure table for respiratory gases, the partial pressure of oxygen (pO2) in the alveoli is:",
            optionA = "104 mm Hg",
            optionB = "159 mm Hg",
            optionC = "95 mm Hg",
            optionD = "40 mm Hg",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Fix the two ends of the oxygen journey first — atmospheric air has a pO2 of 159 mm Hg, and the tissues sit at 40 mm Hg.
                Step 2: Alveolar air is atmospheric air after it has mixed with the air already in the lungs and picked up water vapour and carbon dioxide, so its pO2 falls from 159 to 104 mm Hg.
                Step 3: Blood leaving the lungs equilibrates almost, but not quite, with the alveoli, reaching 95 mm Hg — so 104 mm Hg is the alveolar value.
                Trap: Option B is the atmospheric value and option C is the oxygenated-blood value; the question tests whether you can keep the three stations of the same gas separate. Option D is the tissue and deoxygenated-blood value.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_72",
            chapterId = "bio_ch_14",
            subject = "Biology",
            topic = "Transport of Carbon Dioxide — the Bicarbonate Route",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "Nearly 70 percent of the carbon dioxide transported by the blood travels in the form of:",
            optionA = "Carbamino-haemoglobin",
            optionB = "Carbon dioxide dissolved in the plasma",
            optionC = "Carboxyhaemoglobin",
            optionD = "Bicarbonate ions",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: Recall the three tickets for carbon dioxide — bicarbonate ions carry about 70 percent, carbamino-haemoglobin carries 20 to 25 percent, and only about 7 percent stays dissolved in plasma.
                Step 2: The bicarbonate is manufactured inside the RBC, where carbonic anhydrase converts carbon dioxide and water into carbonic acid, which splits into hydrogen ions and bicarbonate; the bicarbonate then moves out into the plasma.
                Step 3: Since the question asks for the roughly 70 percent share, the answer is bicarbonate ions.
                Trap: Carbamino-haemoglobin (option A) is the second-largest route, not the largest, and it binds carbon dioxide to the globin part of haemoglobin. Carboxyhaemoglobin (option C) is the carbon monoxide compound and plays no part in normal carbon dioxide transport.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_73",
            chapterId = "bio_ch_14",
            subject = "Biology",
            topic = "Mechanism of Breathing — Role of the Diaphragm in Inspiration",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 40,
            prompt = "During inspiration, the diaphragm:",
            optionA = "Relaxes and returns to its dome shape",
            optionB = "Contracts and flattens, moving downwards",
            optionC = "Relaxes and is pushed upwards by abdominal pressure",
            optionD = "Contracts and becomes more dome-shaped",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Inspiration is the active half of breathing, so its prime mover must be contracting, not relaxing — this alone removes options A and C.
                Step 2: When the diaphragm contracts, its dome flattens and moves down towards the abdomen, lengthening the thoracic chamber from below.
                Step 3: The enlarged thoracic volume drops the internal pressure below atmospheric pressure, and air rushes in — so contraction with flattening is the correct description.
                Trap: Option D pairs the right verb with the wrong shape. A contracted diaphragm is a flattened diaphragm; the dome belongs to the relaxed state seen in expiration.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_74",
            chapterId = "bio_ch_14",
            subject = "Biology",
            topic = "Regulation of Respiration — the Pneumotaxic Centre",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 55,
            prompt = "The pneumotaxic centre, whose signals can reduce the duration of inspiration and thereby alter the respiratory rate, is located in the:",
            optionA = "Medulla oblongata",
            optionB = "Cerebellum",
            optionC = "Pons",
            optionD = "Hypothalamus",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Separate the two brainstem centres by job. The respiratory rhythm centre in the medulla generates the basic pattern of breathing.
                Step 2: The pneumotaxic centre moderates that rhythm centre — its signals cut inspiration short, which changes how fast breathing cycles repeat.
                Step 3: NCERT places this moderating centre in the pons region of the brain, above the medulla.
                Trap: Option A is the classic swap — the medulla hosts the rhythm centre and the chemosensitive area, so it tempts anyone who remembers the region but not the division of labour. The cerebellum coordinates movement and the hypothalamus handles temperature and drives, not the inspiratory cut-off.
            """.trimIndent()
        ),
QuestionEntity(
            id = "q_bio_75",
            chapterId = "bio_ch_15",
            subject = "Biology",
            topic = "Nodal Tissue — SAN as Pacemaker",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "The sinoatrial node (SAN) is called the pacemaker of the heart because it:",
            optionA = "Is located in the left atrium and receives the heartbeat signal from the brain",
            optionB = "Can generate the maximum number of action potentials, about 70-75 per minute, and so sets the rhythm of the whole heart",
            optionC = "Contracts with the greatest force of all cardiac tissues",
            optionD = "Delays the impulse briefly so that the ventricles can fill completely",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: The heartbeat is myogenic — it originates in nodal tissue inside the heart, not in the brain. The SAN sits in the right upper corner of the right atrium.
                Step 2: The SAN can generate the maximum number of action potentials of any nodal tissue, about 70-75 per minute. The fastest oscillator sets the rhythm, and all other heart tissue follows it — that is exactly what a pacemaker is.
                Step 3: Option B states this precisely.
                Trap: Option D describes the atrioventricular node (AVN), which relays the impulse after a short delay — it does not set the rhythm. Option A fails twice: the SAN is in the right atrium, and the brain only speeds up or slows down a rhythm the SAN creates.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_76",
            chapterId = "bio_ch_15",
            subject = "Biology",
            topic = "ECG — The QRS Complex",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "In a standard ECG, the QRS complex represents:",
            optionA = "Depolarisation of the atria",
            optionB = "Repolarisation of the ventricles",
            optionC = "Depolarisation of the ventricles",
            optionD = "Repolarisation of the atria",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Lay out the wave table. P wave: depolarisation of the atria. QRS complex: depolarisation of the ventricles. T wave: repolarisation of the ventricles.
                Step 2: The QRS complex is the tall, sharp spike of the trace because the ventricles carry far more muscle mass than the atria. Ventricular contraction begins just after the Q peak.
                Step 3: The matching entry is depolarisation of the ventricles — option C.
                Trap: Option B is the T wave's description, and option A is the P wave's. Option D names an event that does occur but is hidden inside the QRS complex itself, so it never appears as the QRS.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_77",
            chapterId = "bio_ch_15",
            subject = "Biology",
            topic = "Blood Groups — The Universal Donor",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "The universal donor blood group is:",
            optionA = "O negative, because its RBCs carry neither A, B nor Rh antigens, so no recipient's plasma antibodies can attack them",
            optionB = "AB positive, because its plasma contains no anti-A or anti-B antibodies",
            optionC = "O positive, because its RBCs carry no antibodies on their surface",
            optionD = "AB negative, because its RBCs carry both A and B antigens",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Donor safety is judged by the donor's RBC antigens against the recipient's plasma antibodies. A universal donor must bring antigens that nobody's plasma can attack.
                Step 2: Group O RBCs carry no A and no B antigens, and the Rh negative form also lacks the Rh antigen — there is nothing for any recipient's anti-A, anti-B or anti-Rh to agglutinate.
                Step 3: Option A is the universal donor, with the correct reason.
                Trap: Option B describes the universal recipient, AB positive — its lack of antibodies matters when it receives, not when it gives. Option C invents antibodies on RBCs (antibodies live in plasma) and keeps the Rh antigen, which an Rh negative recipient could react to after sensitisation.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_78",
            chapterId = "bio_ch_15",
            subject = "Biology",
            topic = "Coagulation — Fibrinogen to Fibrin",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "During coagulation of blood, fibrinogen is converted into fibrin by:",
            optionA = "Thrombokinase acting directly on it",
            optionB = "Calcium ions present in the plasma",
            optionC = "Prothrombin released from platelets",
            optionD = "Thrombin, the active enzyme formed from prothrombin",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: Rebuild the cascade in order. Injury releases thrombokinase. Thrombokinase, with calcium ions, converts the inactive plasma protein prothrombin into the active enzyme thrombin.
                Step 2: Thrombin then converts soluble fibrinogen into insoluble fibrin threads, which mesh together, trap blood cells and form the clot.
                Step 3: The enzyme that acts on fibrinogen is therefore thrombin — option D.
                Trap: Thrombokinase (option A) starts the cascade but acts on prothrombin, not on fibrinogen. Calcium ions (option B) are essential helpers for the conversion steps but convert nothing themselves. Prothrombin (option C) is the inactive precursor of the answer, not the converter.
            """.trimIndent()
        ),
        QuestionEntity(
            id = "q_bio_79",
            chapterId = "bio_ch_15",
            subject = "Biology",
            topic = "Cardiac Cycle — Phase Durations",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "In a cardiac cycle of 0.8 seconds at a heart rate of 72 beats per minute, the duration of joint diastole is:",
            optionA = "0.1 seconds",
            optionB = "0.4 seconds",
            optionC = "0.3 seconds",
            optionD = "0.8 seconds",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: The three phases of the 0.8 second cycle are joint diastole 0.4 seconds, atrial systole 0.1 seconds and ventricular systole 0.3 seconds. Audit the sum: 0.4 plus 0.1 plus 0.3 equals 0.8 — the numbers are consistent.
                Step 2: Joint diastole, when all four chambers are relaxed and the ventricles fill passively, is the longest phase — half the entire cycle.
                Step 3: The answer is 0.4 seconds — option B.
                Trap: Option A is the duration of atrial systole and option C of ventricular systole; the question is engineered to catch students who memorised the three numbers without attaching them to their phases. Option D is the whole cycle, not one phase.
            """.trimIndent()
        ),
QuestionEntity(
        id = "q_bio_80",
        chapterId = "bio_ch_16",
        subject = "Biology",
        topic = "Modes of excretion — uricotelic animals",
        examSource = "IISER IAT",
        examYear = null,
        isImportantQuestion = true,
        isPyq = false,
        difficulty = "Easy",
        estimatedSeconds = 45,
        prompt = "Birds excrete uric acid as their main nitrogenous waste mainly because it",
        optionA = "is the most toxic waste and must leave quickly",
        optionB = "needs a large volume of water for its removal",
        optionC = "can be removed from the body with a minimum loss of water",
        optionD = "is produced directly without any energy cost",
        correctOptionIndex = 2,
        stepByStepExplanation = "Uric acid is the least toxic nitrogenous waste and is excreted as pellets or paste with almost no water. That minimum-water strategy suits birds and other land animals — especially embryos developing inside a sealed, shelled egg where water cannot be replaced. Ammonia is the most toxic and the most water-hungry waste; urea sits in between, and both still need far more water than uric acid. Forming uric acid also costs the most energy of the three, so option D reverses the facts."
    ),
    QuestionEntity(
        id = "q_bio_81",
        chapterId = "bio_ch_16",
        subject = "Biology",
        topic = "Glomerular filtration rate",
        examSource = "IISER IAT",
        examYear = null,
        isImportantQuestion = true,
        isPyq = false,
        difficulty = "Easy",
        estimatedSeconds = 45,
        prompt = "In a healthy adult human, the glomerular filtration rate (GFR) is approximately 125 mL per minute. The volume of filtrate formed in one day is therefore about",
        optionA = "180 litres",
        optionB = "18 litres",
        optionC = "1.8 litres",
        optionD = "125 litres",
        correctOptionIndex = 0,
        stepByStepExplanation = "Filtrate per day = 125 mL/min × 60 min × 24 h = 125 × 1440 = 180,000 mL = 180 litres. Of this huge volume, about 99 percent is reabsorbed by the renal tubules, leaving only 1 to 1.5 litres of urine per day — which is why a small fall in reabsorption efficiency would cause severe water loss. Do not confuse GFR (125 mL/min) with renal blood flow (1100-1200 mL/min)."
    ),
    QuestionEntity(
        id = "q_bio_82",
        chapterId = "bio_ch_16",
        subject = "Biology",
        topic = "Nephron anatomy — Malpighian body",
        examSource = "IISER IAT",
        examYear = null,
        isImportantQuestion = true,
        isPyq = false,
        difficulty = "Moderate",
        estimatedSeconds = 60,
        prompt = "The Malpighian body (renal corpuscle) of a nephron consists of",
        optionA = "the PCT and the DCT",
        optionB = "the loop of Henle and the collecting duct",
        optionC = "the afferent and efferent arterioles",
        optionD = "the glomerulus and Bowman's capsule",
        correctOptionIndex = 3,
        stepByStepExplanation = "The Malpighian body, also called the renal corpuscle, is the glomerulus together with the Bowman's capsule that encloses it — the cup-shaped double-walled start of the tubule. Filtration happens here. The PCT, loop of Henle, DCT and collecting duct are the tubular parts that process the filtrate afterwards, and the afferent and efferent arterioles are the blood vessels entering and leaving the glomerulus, not parts of the corpuscle itself."
    ),
    QuestionEntity(
        id = "q_bio_83",
        chapterId = "bio_ch_16",
        subject = "Biology",
        topic = "Regulation — ADH action",
        examSource = "IISER IAT",
        examYear = null,
        isImportantQuestion = true,
        isPyq = false,
        difficulty = "Moderate",
        estimatedSeconds = 60,
        prompt = "When the body loses excess water, osmoreceptors in the hypothalamus trigger release of ADH (vasopressin) from the neurohypophysis. ADH then acts by",
        optionA = "increasing glomerular filtration in the Malpighian body",
        optionB = "facilitating reabsorption of water from the latter parts of the tubule",
        optionC = "increasing secretion of renin from the juxtaglomerular apparatus",
        optionD = "dilating the afferent arteriole to raise blood pressure",
        correctOptionIndex = 1,
        stepByStepExplanation = "ADH acts on the latter parts of the tubule — the DCT and collecting duct — and facilitates water reabsorption there, so the urine becomes smaller in volume and more concentrated. It does not change the filtrate volume formed at the glomerulus, and renin release is the JGA's response to low glomerular blood pressure or flow, a separate (RAAS) pathway. When water balance is restored, osmoreceptors switch the ADH release off."
    ),
    QuestionEntity(
        id = "q_bio_84",
        chapterId = "bio_ch_16",
        subject = "Biology",
        topic = "Reabsorption in the PCT",
        examSource = "IISER IAT",
        examYear = null,
        isImportantQuestion = true,
        isPyq = false,
        difficulty = "Analytical",
        estimatedSeconds = 75,
        prompt = "A student's urine report shows glucose in the urine, although the glomerular filter is intact. Using your knowledge of tubular reabsorption, the most accurate explanation is that glucose",
        optionA = "is normally secreted into the tubule by the DCT",
        optionB = "is reabsorbed only in the collecting duct under ADH",
        optionC = "is normally reabsorbed completely in the PCT, so its presence in urine means PCT recovery has failed or been overwhelmed",
        optionD = "cannot cross the filtration membrane and never enters the filtrate",
        correctOptionIndex = 2,
        stepByStepExplanation = "Glucose is small enough to pass freely through the filtration membrane, so it IS present in the glomerular filtrate. Normally the PCT reabsorbs all of it — along with all amino acids and 70-80 percent of electrolytes and water — so healthy urine contains no glucose. Glucose appears in urine only when the PCT's transport capacity is exceeded (very high blood glucose) or the PCT is damaged. It is neither secreted by the DCT nor handled by the collecting duct, which fine-tunes water, not glucose."
    ),

QuestionEntity(
            id = "q_bio_85",
            chapterId = "bio_ch_17",
            subject = "Biology",
            topic = "Living World — Defining Features of Life",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "Which one of the following is a defining feature of living organisms, because it occurs in all of them without exception and in no non-living object?",
            optionA = "Growth by increase in mass",
            optionB = "Reproduction to produce progeny",
            optionC = "Metabolism, the sum of all chemical reactions in the body",
            optionD = "Increase in the number of individuals",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Apply the two-sided test. A defining feature must be present in every living organism and absent in every non-living thing.
                Step 2: Growth fails both sides — mountains and sand mounds grow by accretion, and adult animals stop growing. Reproduction fails because mules, sterile worker bees and infertile couples are alive without it.
                Step 3: Metabolism passes: every living organism carries on the sum total of chemical reactions in its body, and no non-living object exhibits metabolism at all.
                Trap: Options A and D describe the same trait from two angles — increase in mass and increase in number are the two halves of growth, and growth is only a characteristic of life, not its definition.
            """.trimIndent()
        ),

QuestionEntity(
            id = "q_bio_86",
            chapterId = "bio_ch_17",
            subject = "Biology",
            topic = "Living World — Why Reproduction Is Not Defining",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A mule is healthy, responsive and fully grown, yet it can never produce offspring. This single fact is used in NCERT to establish that:",
            optionA = "Reproduction cannot be an all-inclusive defining characteristic of living organisms",
            optionB = "Mules are not truly living organisms",
            optionC = "Growth alone defines a living organism",
            optionD = "Only sexually reproducing organisms are alive",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: The mule is obviously alive — it metabolises, senses and responds. Yet it is sterile, like worker bees and infertile human couples.
                Step 2: If reproduction were a defining feature, every sterile organism would have to be non-living, which is absurd. Hence reproduction cannot be an all-inclusive defining characteristic.
                Step 3: Option A states exactly this NCERT conclusion, worded carefully with "all-inclusive".
                Trap: Option B reverses the logic — the mule is the evidence, not the exception to be discarded. Option C fails because non-living objects also grow, and option D contradicts the many asexually reproducing organisms.
            """.trimIndent()
        ),

QuestionEntity(
            id = "q_bio_87",
            chapterId = "bio_ch_17",
            subject = "Biology",
            topic = "Living World — Rules of Binomial Nomenclature",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "A student handwrites the name of the lion as a single word underlined once: panthera Leo. How many rules of binomial nomenclature has the student broken?",
            optionA = "One — only the underlining is wrong",
            optionB = "Two — the underlining and one case error",
            optionC = "Four — word count, genus case, epithet case and underlining",
            optionD = "Three — genus case, epithet case and underlining",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: List the rules that apply: the name has two words (a binomial), the genus starts with a capital letter, the specific epithet starts with a small letter, and handwritten names are underlined separately word by word.
                Step 2: Count the violations in "panthera Leo": the genus is written with a small letter (error 1), the epithet Leo is capitalised (error 2), and the two words are underlined together instead of separately (error 3).
                Step 3: The word count is fine — there are two words — so the total is three broken rules, option D.
                Trap: Option C tempts students who also count "one word" — but panthera and Leo are two separate words; the fault lies in their case and in the single joined underline, not in their number.
            """.trimIndent()
        ),

QuestionEntity(
            id = "q_bio_88",
            chapterId = "bio_ch_17",
            subject = "Biology",
            topic = "Living World — Taxonomic Categories of the Housefly",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The housefly, Musca domestica, belongs to which family and order?",
            optionA = "Family Diptera and order Muscidae",
            optionB = "Family Muscidae and order Diptera",
            optionC = "Family Muscidae and order Insecta",
            optionD = "Family Hominidae and order Primata",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Pull up the NCERT table row for the housefly: genus Musca, family Muscidae, order Diptera, class Insecta, phylum Arthropoda.
                Step 2: The family is Muscidae — built, as family names are, on the genus Musca. The order is Diptera, the two-winged flies.
                Step 3: Only option B places Muscidae at family rank and Diptera at order rank.
                Trap: Option A swaps the two ranks, the classic table-shuffle. Option C promotes Insecta, which is the class, not the order. Option D is the human row pasted onto the fly.
            """.trimIndent()
        ),

QuestionEntity(
            id = "q_bio_89",
            chapterId = "bio_ch_17",
            subject = "Biology",
            topic = "Living World — Taxonomic Aids",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 75,
            prompt = "A researcher needs (i) a pressed specimen of a rare plant for reference, (ii) an account of the habitat and distribution of plants of her district, and (iii) paired contrasting statements to key out an unknown insect. The aids she should use, in order, are:",
            optionA = "Museum, manual and flora",
            optionB = "Botanical garden, flora and monograph",
            optionC = "Herbarium, flora and key",
            optionD = "Herbarium, monograph and key",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Match each need to its aid. A pressed, dried plant specimen preserved on a sheet for quick reference is the herbarium — not the museum, which is the general preserved-collection aid, and not a garden, which holds living plants.
                Step 2: The account of habitat and distribution of plants of a given area is the definition of a flora. A manual serves identification of names, and a monograph treats one taxon — neither matches need (ii).
                Step 3: Paired contrasting statements are couplets, and couplets build a key — the analytical identification aid.
                Trap: Option D fails only at the middle need — the monograph is about one taxon, not about an area's plants and where they grow. Each distractor breaks exactly one link of the chain, so all three matches must be verified, not just the first.
            """.trimIndent()
        ),

QuestionEntity(
            id = "q_bio_90",
            chapterId = "bio_ch_18",
            subject = "Biology",
            topic = "Sarcomere — Band Changes in Contraction",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "When a skeletal muscle contracts, which of the following remains unchanged in length?",
            optionA = "The I band",
            optionB = "The H zone",
            optionC = "The A band",
            optionD = "The distance between two Z lines",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Apply the sliding filament theory. During contraction the thin actin filaments slide inward over the thick myosin filaments; neither filament shortens, only their overlap increases.
                Step 2: The A band is defined by the length of the thick myosin filaments. Since the myosin filaments do not change length, the A band retains its length.
                Step 3: Option C is therefore the unchanged quantity.
                Trap: The I band is reduced and the H zone shrinks or disappears as actin advances, and the Z lines are pulled closer together — all three of the other options change. Students who picture the whole sarcomere shrinking uniformly pick the A band as shrinking too.
            """.trimIndent()
        ),

QuestionEntity(
            id = "q_bio_91",
            chapterId = "bio_ch_18",
            subject = "Biology",
            topic = "Skull Region — Composition of the 29 Bones",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "The skull region of the human axial skeleton is counted as 29 bones. Which composition is correct?",
            optionA = "Cranial 8, facial 14, ear ossicles 3 and hyoid 1",
            optionB = "Cranial 8, facial 14, ear ossicles 6 and hyoid 1",
            optionC = "Cranial 14, facial 8, ear ossicles 6 and hyoid 1",
            optionD = "Cranial 8, facial 14, ear ossicles 6 and one vertebra",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Rebuild the skull-region total from its NCERT parts: cranial bones 8, facial bones 14, ear ossicles 6 (malleus, incus and stapes in each ear) and the single hyoid bone. Audit the sum: 8 plus 14 plus 6 plus 1 equals 29.
                Step 2: Option B matches every component and the total.
                Step 3: The answer is option B.
                Trap: Option C also sums to 29 but swaps the cranial and facial counts — the total cannot rescue a swapped addend. Option A counts the ossicles of only one ear, giving 26. Option D reaches 29 with a vertebra, which belongs to the vertebral column, not the skull region.
            """.trimIndent()
        ),

QuestionEntity(
            id = "q_bio_92",
            chapterId = "bio_ch_18",
            subject = "Biology",
            topic = "Contraction Mechanism — Unmasking of Actin Sites",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "In a resting muscle fibre the active sites for myosin on the actin filaments are masked. These sites are exposed when:",
            optionA = "Calcium ions bind to a subunit of troponin, shifting the cover off the sites",
            optionB = "ATP binds to troponin and pulls it off the actin filament",
            optionC = "Tropomyosin is broken down by calcium ions released into the sarcoplasm",
            optionD = "The myosin head pulls the tropomyosin strand away by force",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: At rest, a subunit of troponin masks the active binding sites for myosin on the actin filament, with tropomyosin lying over the sites.
                Step 2: When calcium ions flood the sarcoplasm from the sarcoplasmic reticulum, they bind to a subunit of troponin. This shifts the troponin-tropomyosin cover aside and exposes the active sites, so myosin heads can bind and form cross bridges.
                Step 3: Option A states this mechanism exactly.
                Trap: ATP never binds troponin — ATP binds the myosin head (option B). Tropomyosin is shifted, not broken down (option C). The unmasking is done by calcium acting on troponin before any head can bind, so the head cannot pull the cover away itself (option D).
            """.trimIndent()
        ),

QuestionEntity(
            id = "q_bio_93",
            chapterId = "bio_ch_18",
            subject = "Biology",
            topic = "Contraction — Sequence of Events",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "Arrange the following events of muscle contraction in the correct sequence: (i) Ca2+ released from the sarcoplasmic reticulum binds troponin and the active sites on actin are exposed; (ii) acetylcholine is released at the motor-end plate; (iii) the myosin head binds actin, forms a cross bridge and pulls the actin filament; (iv) an action potential spreads over the sarcolemma.",
            optionA = "(ii), (i), (iv), (iii)",
            optionB = "(iv), (ii), (i), (iii)",
            optionC = "(ii), (iv), (iii), (i)",
            optionD = "(ii), (iv), (i), (iii)",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: Anchor the chain at its two ends. The signal arrives from the nerve first, so acetylcholine release at the motor-end plate (ii) must be the opening event. The cross bridge (iii) can only form after the actin sites are exposed, so it must be last.
                Step 2: Between them, the action potential spreads over the sarcolemma (iv) and triggers calcium release; calcium binding troponin and exposing the sites (i) follows.
                Step 3: The full chain is (ii), (iv), (i), (iii) — option D.
                Trap: Option A releases calcium before the action potential that triggers it. Option B starts with the action potential before the acetylcholine that generates it. Option C forms the cross bridge before the sites it needs are exposed.
            """.trimIndent()
        ),

QuestionEntity(
            id = "q_bio_94",
            chapterId = "bio_ch_18",
            subject = "Biology",
            topic = "Disorders — Tetany and Low Calcium",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 75,
            prompt = "A patient shows rapid, wild spasms of the muscles, and blood tests reveal a very low level of calcium ions in the body fluid. The disorder is:",
            optionA = "Myasthenia gravis",
            optionB = "Tetany",
            optionC = "Muscular dystrophy",
            optionD = "Osteoporosis",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Match the trigger words in the stem. The two diagnostic clues are rapid spasms in the muscles and low calcium ions in the body fluid.
                Step 2: Tetany is defined in NCERT by exactly this pairing — rapid spasms (wild contractions) in the muscles due to low calcium ions in body fluid.
                Step 3: The answer is option B.
                Trap: Myasthenia gravis is an autoimmune disorder of the neuromuscular junction causing fatigue and weakening, not spasms from low calcium (option A). Muscular dystrophy is genetic, with progressive degeneration of the muscle itself (option C). Osteoporosis is decreased bone mass with increased fracture risk — a skeletal disorder with no muscle spasms (option D).
            """.trimIndent()
        ),

QuestionEntity(
            id = "q_bio_95",
            chapterId = "bio_ch_19",
            subject = "Biology",
            topic = "Neuron Structure — Nissl Granules",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "Nissl granules are characteristically ABSENT from which part of a neuron?",
            optionA = "The cell body (soma)",
            optionB = "The axon",
            optionC = "The dendrites",
            optionD = "The cytoplasm around the nucleus",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Nissl granules are the granular, protein-synthesising bodies of the neuron. NCERT places them in the cell body, whose cytoplasm contains the nucleus and these granules.
                Step 2: Dendrites also contain Nissl granules — they are continuous with the cell body's cytoplasm. The axon, a pure transmission cable maintained from the soma, does not.
                Step 3: The part without Nissl granules is the axon — option B.
                Trap: Options A, C and D all describe the receiving end of the neuron (cell body and dendrites), which is exactly where the granules are found. The one-mark discriminator of this chapter is granule location: soma and dendrites yes, axon no.
            """.trimIndent()
        ),

QuestionEntity(
            id = "q_bio_96",
            chapterId = "bio_ch_19",
            subject = "Biology",
            topic = "Resting Potential — The Sodium-Potassium Pump",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "In one cycle, the sodium-potassium pump of a resting axon transports:",
            optionA = "2 Na+ out of the axon and 3 K+ into the axon",
            optionB = "3 Na+ into the axon and 2 K+ out of the axon",
            optionC = "3 Na+ out of the axon and 2 K+ into the axon",
            optionD = "2 Na+ into the axon and 3 K+ out of the axon",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Recall what the pump maintains: the axoplasm is rich in K+ and poor in Na+, while the fluid outside is rich in Na+. Leaks constantly erode this arrangement, so the pump must push Na+ out and pull K+ in.
                Step 2: The stoichiometry is fixed: for each ATP consumed, 3 Na+ are transported out and 2 K+ are transported in — a net export of one positive charge per cycle, which also helps keep the inside negative.
                Step 3: The matching statement is 3 Na+ out, 2 K+ in — option C.
                Trap: Option B reverses both directions — that describes the channel flows of depolarisation, not the pump. Options A and D keep the 3-2 numbers but attach them to the wrong ions; the ratio and the directions must both be right.
            """.trimIndent()
        ),

QuestionEntity(
            id = "q_bio_97",
            chapterId = "bio_ch_19",
            subject = "Biology",
            topic = "Conduction — Saltatory Conduction",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "Saltatory conduction in a myelinated fibre is fast mainly because the action potential is regenerated only at the:",
            optionA = "Nodes of Ranvier, so the impulse leaps from one node to the next",
            optionB = "Schwann cells, which actively carry the impulse along",
            optionC = "Synaptic knobs at the branched end of the fibre",
            optionD = "Axon hillock, from where it is re-sent repeatedly",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Myelin is insulation — beneath the sheath no ion exchange with the extracellular fluid is possible, so no regeneration can happen there.
                Step 2: The gaps between two adjacent myelin sheaths are the nodes of Ranvier, where the axon membrane is exposed. Regeneration happens only at these nodes, so the impulse appears to jump node to node instead of being rebuilt at every patch.
                Step 3: Fewer regenerations over the same length means a much faster journey — option A.
                Trap: Option B makes the Schwann cell the conductor; Schwann cells only build the sheath (in the PNS) and never carry the impulse. Options C and D name real structures, but neither is a regeneration site along the fibre.
            """.trimIndent()
        ),

QuestionEntity(
            id = "q_bio_98",
            chapterId = "bio_ch_19",
            subject = "Biology",
            topic = "Synaptic Transmission — Sequence of Events",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "Arrange the events of chemical synaptic transmission in the correct order: (i) neurotransmitter binds to receptors on the post-synaptic membrane; (ii) synaptic vesicles fuse with the pre-synaptic membrane; (iii) an action potential arrives at the axon terminal; (iv) ion channels open in the post-synaptic membrane; (v) neurotransmitter diffuses across the synaptic cleft.",
            optionA = "(iii), (v), (ii), (i), (iv)",
            optionB = "(ii), (iii), (v), (iv), (i)",
            optionC = "(iii), (ii), (i), (v), (iv)",
            optionD = "(iii), (ii), (v), (i), (iv)",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: Anchor the start. Nothing at a synapse begins until the impulse arrives, so (iii) must be first. This eliminates option B, which starts with vesicle fusion.
                Step 2: Arrival triggers the vesicles to move and fuse with the pre-synaptic membrane, releasing neurotransmitter — (ii) second. The transmitter must then diffuse across the fluid-filled cleft (v) before it can bind receptors (i); option C wrongly binds before diffusing.
                Step 3: Binding is what opens the post-synaptic ion channels, so (iv) is last. The full chain is (iii), (ii), (v), (i), (iv) — option D.
                Trap: Option A releases the transmitter (placing diffusion before fusion) — vesicles cannot empty their contents across a cleft before they have fused with the membrane. In every ordering question, fix the two anchors first: arrival first, post-synaptic channel opening last.
            """.trimIndent()
        ),

QuestionEntity(
            id = "q_bio_99",
            chapterId = "bio_ch_19",
            subject = "Biology",
            topic = "Human Eye — The Blind Spot",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "A small object seems to vanish when its image falls exactly on the blind spot of the eye. This happens because that region of the retina:",
            optionA = "Contains only cones, which cannot work without bright light",
            optionB = "Contains no photoreceptor cells at all, since the optic nerve leaves the eye there",
            optionC = "Is covered by the vitreous humour, which blocks the light",
            optionD = "Contains rods whose rhodopsin is temporarily bleached",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: The blind spot is the optic disc — the point slightly above the posterior pole where the optic nerves leave the eye and the retinal blood vessels enter it.
                Step 2: NCERT states that photoreceptor cells are not present in that region. With neither rods nor cones, no signal can be generated from that patch of the image, so the object is not seen.
                Step 3: The correct explanation is the complete absence of photoreceptors — option B.
                Trap: Option A describes the fovea (cones only, sharpest vision) — the functional opposite of the blind spot, and the pairing examiners love to swap. Option D fails because a region with no rods cannot have bleached rods, and option C fails because the vitreous humour fills the whole posterior cavity, not one small spot.
            """.trimIndent()
        ),

QuestionEntity(
            id = "q_bio_100",
            chapterId = "bio_ch_20",
            subject = "Biology",
            topic = "Pituitary — Site of Hormone Synthesis",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "Oxytocin and vasopressin (ADH), the hormones released from the posterior pituitary, are actually synthesised in the:",
            optionA = "Anterior pituitary (pars distalis)",
            optionB = "Posterior pituitary (neurohypophysis)",
            optionC = "Hypothalamus",
            optionD = "Pineal gland",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: The posterior pituitary is under the direct neural regulation of the hypothalamus. Its two hormones are made by neurosecretory cells of the hypothalamus.
                Step 2: They travel down the axons of those neurons to the posterior lobe, which only stores them and releases them into the blood when signalled.
                Step 3: The site of synthesis is therefore the hypothalamus — option C.
                Trap: Option B is the release site, and released from is not made in. Option A makes the anterior pituitary's own six hormones (GH, PRL, TSH, ACTH, LH, FSH) — a different lobe with a different supply line, the portal blood.
            """.trimIndent()
        ),

QuestionEntity(
            id = "q_bio_101",
            chapterId = "bio_ch_20",
            subject = "Biology",
            topic = "Parathyroid — PTH and Blood Calcium",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "The hypercalcemic hormone, which increases the calcium level of the blood, is:",
            optionA = "Parathyroid hormone (PTH)",
            optionB = "Thyrocalcitonin (TCT)",
            optionC = "Insulin",
            optionD = "Aldosterone",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Hypercalcemic means calcium-raising. PTH from the four parathyroid glands raises blood calcium by three routes: resorption of bone, reabsorption of calcium by the renal tubules, and increased absorption of calcium from digested food.
                Step 2: Its secretion is itself controlled by blood calcium — calcium falls, PTH is released; calcium rises, PTH switches off. A hormone secreted when calcium is low must be the one that raises it.
                Step 3: The hypercalcemic hormone is PTH — option A.
                Trap: Option B, thyrocalcitonin from the thyroid, does the exact opposite — it lowers blood calcium. Insulin (option C) regulates glucose, not calcium, and aldosterone (option D) manages sodium and water balance.
            """.trimIndent()
        ),

QuestionEntity(
            id = "q_bio_102",
            chapterId = "bio_ch_20",
            subject = "Biology",
            topic = "Diabetes Insipidus — ADH Deficiency",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A patient passes very large volumes of dilute urine and feels constantly thirsty. Blood glucose is normal and the urine contains no glucose. The most likely cause is:",
            optionA = "Deficiency of insulin from the beta cells of the pancreas",
            optionB = "Excess of glucagon from the alpha cells of the pancreas",
            optionC = "Deficiency of thyroxine from the thyroid gland",
            optionD = "Deficiency of ADH (vasopressin), reducing water resorption in the kidney tubules",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: Read the two normal results first. Normal blood glucose and glucose-free urine rule out diabetes mellitus, where insulin failure sends blood glucose high enough to spill into urine.
                Step 2: What remains is a pure water problem: the kidney tubules are failing to reclaim water. ADH (vasopressin) is the hormone that stimulates resorption of water and electrolytes by the distal tubules, so its deficiency produces exactly this picture — diabetes insipidus.
                Step 3: The cause is ADH deficiency — option D.
                Trap: Options A and B are the pancreas pair and both disturb glucose, which this patient's reports exclude. Option C would slow metabolism (weight gain, cold intolerance), not flood the urine. The word diabetes names the urine volume in both diseases; the hormone and gland are completely different.
            """.trimIndent()
        ),

QuestionEntity(
            id = "q_bio_103",
            chapterId = "bio_ch_20",
            subject = "Biology",
            topic = "Adrenal Cortex — Zona Glomerulosa and Aldosterone",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "Aldosterone, the chief mineralocorticoid, is secreted by which part of the adrenal gland?",
            optionA = "Zona fasciculata of the adrenal cortex",
            optionB = "Zona glomerulosa of the adrenal cortex",
            optionC = "Zona reticularis of the adrenal cortex",
            optionD = "Adrenal medulla",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: The adrenal cortex has three layers, outside to inside: glomerulosa, fasciculata, reticularis — G, F, R. Each layer makes one hormone family: salt, sugar, sex in the same order.
                Step 2: Aldosterone is the salt hormone — a mineralocorticoid acting at the renal tubules to reabsorb sodium and water and excrete potassium and phosphate. Salt belongs to the outer layer, the zona glomerulosa.
                Step 3: The answer is the zona glomerulosa — option B.
                Trap: The fasciculata (option A) makes glucocorticoids such as cortisol, and the reticularis (option C) makes androgens. The medulla (option D) is not cortex at all — it secretes the catecholamines adrenaline and noradrenaline.
            """.trimIndent()
        ),

QuestionEntity(
            id = "q_bio_104",
            chapterId = "bio_ch_20",
            subject = "Biology",
            topic = "Thyroid Disorders — Exophthalmic Goitre",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 90,
            prompt = "A patient shows an enlarged thyroid gland, protrusion of the eyeballs, loss of weight despite a good appetite and an increased basal metabolic rate. The diagnosis is:",
            optionA = "Simple goitre, due to iodine deficiency in the diet",
            optionB = "Myxoedema, also called Gull's disease",
            optionC = "Exophthalmic goitre, also called Graves' disease",
            optionD = "Cretinism, due to hypothyroidism during pregnancy",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Sort by direction first. Weight loss with a raised basal metabolic rate means the metabolic thermostat is turned up — this is hyperthyroidism, an excess of thyroid hormone, not a deficiency.
                Step 2: That single step eliminates options A, B and D, which are all deficiency states: simple goitre (iodine deficiency, low output despite the enlarged gland), myxoedema (adult hypothyroidism — weight gain and slowness, the opposite picture) and cretinism (developmental hypothyroidism with stunted growth and low IQ).
                Step 3: The protruding eyeballs — exophthalmos — are the signature that names the hyperthyroid condition: exophthalmic goitre, Graves' disease — option C.
                Trap: The enlarged gland in option A tempts students who match on neck size alone. Always match on hormone direction first (fast symptoms mean excess), then use the eyes to confirm.
            """.trimIndent()
        ),

QuestionEntity(
            id = "q_bio_105",
            chapterId = "bio_ch_21",
            subject = "Biology",
            topic = "Testis — Leydig Cells and Androgens",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "Androgens in the human male are synthesised and secreted by:",
            optionA = "Sertoli cells located inside the seminiferous tubules",
            optionB = "Leydig cells located in the interstitial spaces outside the seminiferous tubules",
            optionC = "Spermatogonia lining the wall of the seminiferous tubules",
            optionD = "The prostate gland",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Fix the tubule map. Inside the seminiferous tubule are the male germ cells and the Sertoli cells, which provide nutrition to the developing germ cells. Outside the tubules, in the interstitial spaces, lie the Leydig cells, also called interstitial cells.
                Step 2: NCERT assigns androgen production to exactly one address: the Leydig cells synthesise and secrete the androgens, acting under the pituitary hormone LH.
                Step 3: Option B names the right cells in the right location.
                Trap: Option A swaps the two cell teams — Sertoli cells nourish, they do not secrete androgens. Option C names the germ cells, which become sperms and secrete no hormones. Option D is a gland, but the prostate contributes seminal plasma, not androgens.
            """.trimIndent()
        ),

QuestionEntity(
            id = "q_bio_106",
            chapterId = "bio_ch_21",
            subject = "Biology",
            topic = "Oogenesis — Completion of Meiosis II",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "In human females, the second meiotic division of the oocyte is completed:",
            optionA = "At the time of ovulation, inside the Graafian follicle",
            optionB = "Before birth, during fetal development of the ovary",
            optionC = "Only after a sperm enters the secondary oocyte, during fertilisation",
            optionD = "At puberty, when the menstrual cycle begins",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Rebuild the oocyte's two arrests. The primary oocyte starts meiosis I in fetal life and arrests in prophase I; it completes meiosis I only in the tertiary follicle shortly before ovulation, producing the secondary oocyte and the first polar body.
                Step 2: The secondary oocyte — the cell actually released at ovulation — begins meiosis II and arrests again. That division is completed only when a sperm enters it, producing the ovum and the second polar body.
                Step 3: The completion of meiosis II is therefore tied to fertilisation, not to ovulation — option C.
                Trap: Option A describes the completion of meiosis I, the division finished just before ovulation. Option B is when meiosis I merely begins (and arrests). Option D is when follicles resume development, not when any division completes.
            """.trimIndent()
        ),

QuestionEntity(
            id = "q_bio_107",
            chapterId = "bio_ch_21",
            subject = "Biology",
            topic = "Menstrual Cycle — The LH Surge and Ovulation",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "Ovulation in a regular 28-day menstrual cycle is directly triggered by:",
            optionA = "The LH surge — a rapid mid-cycle rise in luteinising hormone that ruptures the Graafian follicle",
            optionB = "A peak of progesterone secreted by the corpus luteum",
            optionC = "The fall of estrogen levels at the end of the menstrual phase",
            optionD = "FSH acting alone on a primary follicle",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Place the event. Ovulation falls mid-cycle, at about day 14, when the mature Graafian follicle ruptures and releases the secondary oocyte.
                Step 2: Both LH and FSH peak at mid-cycle, but NCERT names the trigger precisely: rapid secretion of LH — the LH surge — induces the rupture of the Graafian follicle and the release of the oocyte.
                Step 3: Option A gives the right hormone, the right event and the right mechanism.
                Trap: Option B's progesterone belongs to the luteal phase, after ovulation, and comes from the corpus luteum — which does not even exist until the follicle has ruptured. Option C inverts estrogen's real pattern (it rises through the follicular phase and peaks just before ovulation). Option D forgets that FSH's job is follicle growth, not the rupture itself.
            """.trimIndent()
        ),

QuestionEntity(
            id = "q_bio_108",
            chapterId = "bio_ch_21",
            subject = "Biology",
            topic = "Placenta — The Hormone That Is Not Placental",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 60,
            prompt = "Which of the following hormones is NOT secreted by the human placenta?",
            optionA = "Human chorionic gonadotrophin (hCG)",
            optionB = "Human placental lactogen (hPL)",
            optionC = "Progestogens",
            optionD = "Relaxin",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: Write out the closed placental set from NCERT: the placenta acts as an endocrine tissue and secretes hCG, hPL, estrogens and progestogens. Membership in this set is the whole question.
                Step 2: Check each option against the set. hCG is in it. hPL is in it. Progestogens are in it. Relaxin is not — NCERT assigns relaxin to the ovary, which secretes it in the later phase of pregnancy.
                Step 3: The outsider is relaxin — option D.
                Trap: Relaxin sounds like a pregnancy hormone, and it is one — the trap is the source, not the relevance. A second common outsider planted in such questions is oxytocin, which comes from the maternal pituitary, not the placenta.
            """.trimIndent()
        ),

QuestionEntity(
            id = "q_bio_109",
            chapterId = "bio_ch_21",
            subject = "Biology",
            topic = "Spermatogenesis — Ploidy and Yield",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 75,
            prompt = "A primary spermatocyte carrying 46 chromosomes completes spermatogenesis normally. The final result is:",
            optionA = "Two sperms, each carrying 46 chromosomes",
            optionB = "Four sperms, each carrying 46 chromosomes",
            optionC = "Four sperms, each carrying 23 chromosomes",
            optionD = "Two sperms, each carrying 23 chromosomes",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Count the cells first. Meiosis I turns one primary spermatocyte into two secondary spermatocytes; meiosis II turns those into four spermatids; spermiogenesis converts each spermatid into one sperm. Yield: four sperms, which eliminates options A and D.
                Step 2: Count the chromosomes next. The halving from 2n to n happens at meiosis I, so the secondary spermatocytes already carry 23, and meiosis II changes nothing in the number. Every sperm is haploid, carrying 23 chromosomes.
                Step 3: Four sperms of 23 chromosomes each — option C.
                Trap: Option B keeps the correct cell count but forgets reduction division entirely. Option D halves the chromosomes correctly but deletes meiosis II from the cell count. The two numbers are decided by two different steps, and each wrong option breaks exactly one of them.
            """.trimIndent()
        ),

QuestionEntity(
            id = "q_bio_110",
            chapterId = "bio_ch_22",
            subject = "Biology",
            topic = "Oral Pills — Saheli, the Weekly Pill",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "Saheli, the oral contraceptive for females developed by scientists at CDRI, Lucknow, is correctly described as:",
            optionA = "A steroidal preparation taken daily for 21 days",
            optionB = "A non-steroidal preparation taken only once a week",
            optionC = "A hormone-releasing intra uterine device",
            optionD = "A steroidal preparation taken once a month",
            correctOptionIndex = 1,
            stepByStepExplanation = """
                Step 1: Recall Saheli's identity cards. It is an oral contraceptive pill, but it breaks the ordinary pill pattern in two ways: its preparation is non-steroidal, and it is taken once a week, not daily. It was developed by scientists at the Central Drug Research Institute (CDRI) in Lucknow and has very few side effects with high contraceptive value.
                Step 2: Test each option against those cards. Option A is the ordinary steroidal daily pill, not Saheli. Option C describes an IUD such as LNG-20, a device, not a pill at all. Option D keeps the weekly rhythm wrong (monthly) and the chemistry wrong (steroidal).
                Step 3: Only option B matches both identity cards — non-steroidal and once a week.
                Trap: The daily 21-day rhythm belongs to the conventional progestogen or progestogen-estrogen pills. Saheli questions are lost by students who file every pill under that one schedule.
            """.trimIndent()
        ),

QuestionEntity(
            id = "q_bio_111",
            chapterId = "bio_ch_22",
            subject = "Biology",
            topic = "IUDs — How Copper Ions Work",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Easy",
            estimatedSeconds = 45,
            prompt = "The copper ions released by a copper-releasing IUD such as CuT prevent pregnancy mainly by:",
            optionA = "Inhibiting ovulation in every menstrual cycle",
            optionB = "Making the cervix hostile to the sperms",
            optionC = "Suppressing sperm motility and the fertilising capacity of sperms",
            optionD = "Physically blocking both fallopian tubes",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Sort the IUD family by what each kind releases. Non-medicated IUDs (Lippes loop) release nothing. Copper-releasing IUDs (CuT, Cu7, Multiload 375) release copper ions. Hormone-releasing IUDs (Progestasert, LNG-20) release hormones.
                Step 2: Attach each mechanism to its owner. The copper ions suppress sperm motility and the fertilising capacity of sperms. Making the uterus unsuitable for implantation and the cervix hostile to sperms is the hormone-releasing pair's job. Inhibiting ovulation is the pills' mechanism, and blocking the tubes is tubectomy — a surgical method, not a device effect.
                Step 3: The copper mechanism is option C.
                Trap: Option B is a real mechanism of the wrong subgroup — it belongs to LNG-20 and Progestasert. Inside the IUD family, the released substance (ions versus hormones) decides the mechanism, and this question is engineered to swap them.
            """.trimIndent()
        ),

QuestionEntity(
            id = "q_bio_112",
            chapterId = "bio_ch_22",
            subject = "Biology",
            topic = "Natural Methods — Periodic Abstinence Window",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "A couple practising periodic abstinence must avoid coitus during the fertile period of the menstrual cycle, when ovulation can be expected. This period is:",
            optionA = "Days 10 to 17 of the menstrual cycle",
            optionB = "Days 1 to 7 of the menstrual cycle",
            optionC = "Days 18 to 28 of the menstrual cycle",
            optionD = "Only the single day of menstruation",
            correctOptionIndex = 0,
            stepByStepExplanation = """
                Step 1: Periodic abstinence works on the principle of avoiding the chances of ovum and sperms meeting. The couple abstains from coitus during the fertile period, when ovulation could be expected and the chances of fertilisation are very high.
                Step 2: The chapter fixes that window by day numbers counted from day 1 of the menstrual cycle: days 10 to 17. Days 1 to 7 include menstruation itself and precede the fertile window; days 18 to 28 come after it; a single day is far too narrow to cover the days on which sperms and ovum can meet.
                Step 3: The window is days 10 to 17 — option A.
                Trap: Students who anchor the count to the end of menstruation, or who shrink the window to the day of ovulation alone (about day 14), miss that the chapter's abstinence period is a full eight-day span, 10 to 17.
            """.trimIndent()
        ),

QuestionEntity(
            id = "q_bio_113",
            chapterId = "bio_ch_22",
            subject = "Biology",
            topic = "STIs — The Curability Exception List",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Moderate",
            estimatedSeconds = 60,
            prompt = "Which of the following sexually transmitted infections is NOT completely curable even when it is detected early and treated properly?",
            optionA = "Gonorrhoea",
            optionB = "Syphilis",
            optionC = "Trichomoniasis",
            optionD = "Genital herpes",
            correctOptionIndex = 3,
            stepByStepExplanation = """
                Step 1: Apply the chapter's curability rule: except for hepatitis-B, genital herpes and HIV infections, all other sexually transmitted infections are completely curable if detected early and treated properly.
                Step 2: Check the four options against the exception list. Gonorrhoea (bacterial) is not excepted — curable. Syphilis (bacterial) is not excepted — curable. Trichomoniasis (protozoan) is not excepted — curable. Genital herpes (viral) IS one of the three exceptions.
                Step 3: The infection that is not completely curable is genital herpes — option D.
                Trap: The exception list has exactly three members — hepatitis-B, genital herpes and HIV. Students often add the famous bacterial diseases (syphilis, gonorrhoea) to the incurable side out of fear, but the chapter places them firmly among the completely curable, provided treatment is early and complete.
            """.trimIndent()
        ),

QuestionEntity(
            id = "q_bio_114",
            chapterId = "bio_ch_22",
            subject = "Biology",
            topic = "ART — ZIFT versus IUT by Blastomere Count",
            examSource = "IISER IAT",
            examYear = null,
            isImportantQuestion = true,
            isPyq = false,
            difficulty = "Analytical",
            estimatedSeconds = 75,
            prompt = "In an IVF laboratory, an embryo is allowed to develop beyond the 8-blastomere stage before transfer. The correct technique and the correct site of transfer for this embryo are:",
            optionA = "ZIFT — transferred into the fallopian tube",
            optionB = "GIFT — transferred into the fallopian tube",
            optionC = "IUT — transferred into the uterus",
            optionD = "ICSI — injected into the uterus",
            correctOptionIndex = 2,
            stepByStepExplanation = """
                Step 1: Rebuild the routing rule. After in vitro fertilisation, the zygote or early embryos with up to 8 blastomeres are transferred into the fallopian tube — that is ZIFT, zygote intra fallopian transfer. Embryos with more than 8 blastomeres are transferred into the uterus — that is IUT, intra uterine transfer.
                Step 2: The embryo in the question has crossed the boundary — it is beyond 8 blastomeres — so it fails the ZIFT criterion and matches the IUT criterion, with the uterus as its destination.
                Step 3: Option C is correct. Option A uses the right organ family but the wrong side of the count. Option B fails twice: GIFT transfers a gamete (an ovum), not an embryo, and is not an embryo-transfer technique at all. Option D misuses ICSI, which is the laboratory injection of a single sperm into an ovum, not a transfer procedure.
                Trap: The boundary is inclusive on the ZIFT side — exactly 8 blastomeres still goes to the fallopian tube. Only embryos with MORE than 8 blastomeres change both the technique's name and the destination organ.
            """.trimIndent()
        )

    )



    val initialMockTests: List<MockTestEntity> = listOf(

        MockTestEntity(

            id = "mock_iat_full_1",

            title = "IISER IAT Mock #1",

            examType = "IISER IAT",

            subjectCoverage = "Medium • 60 Qs • 180 Min • FREE",

            questionCount = 60,

            durationMinutes = 180,

            maxMarks = 240,

            positiveMarks = 4,

            negativeMarks = 1,

            status = "Completed",

            latestScore = 186,

            accuracyPercent = 82,

            timeTakenMinutes = 148,

            questionIdsCsv = "q_math_1,q_math_2,q_phys_1,q_phys_2,q_chem_1,q_chem_2,q_bio_1,q_bio_2",

            lastAttemptTimestamp = System.currentTimeMillis() - 86_400_000L

        ),

        MockTestEntity(

            id = "mock_nest_analytical_1",

            title = "IISER IAT Mock #2",

            examType = "IISER IAT",

            subjectCoverage = "Hard • 60 Qs • 180 Min • PRO",

            questionCount = 60,

            durationMinutes = 180,

            maxMarks = 240,

            positiveMarks = 4,

            negativeMarks = 1,

            status = "Not Started",

            questionIdsCsv = "q_math_3,q_math_4,q_phys_3,q_phys_4,q_chem_3,q_chem_4,q_bio_3,q_bio_4"

        ),

        MockTestEntity(

            id = "mock_iat_pyq_sprint",

            title = "IISER IAT Mock #3",

            examType = "IISER IAT",

            subjectCoverage = "Medium • 60 Qs • 180 Min • PRO",

            questionCount = 60,

            durationMinutes = 180,

            maxMarks = 240,

            positiveMarks = 4,

            negativeMarks = 1,

            status = "Not Started",

            questionIdsCsv = "q_math_1,q_math_2,q_math_3,q_phys_1,q_phys_2,q_phys_3,q_chem_1,q_chem_2,q_chem_3,q_bio_1,q_bio_2,q_bio_3"

        ),

        MockTestEntity(

            id = "mock_iat_rank_booster",

            title = "IISER IAT Mock #4",

            examType = "IISER IAT",

            subjectCoverage = "Medium • 60 Qs • 180 Min • PRO",

            questionCount = 60,

            durationMinutes = 180,

            maxMarks = 240,

            positiveMarks = 4,

            negativeMarks = 1,

            status = "Not Started",

            questionIdsCsv = "q_phys_1,q_phys_2,q_phys_3,q_phys_4,q_chem_1,q_chem_2,q_chem_3,q_chem_4,q_math_1,q_math_2,q_math_3,q_math_4,q_bio_1,q_bio_2,q_bio_3,q_bio_4"

        ),

        MockTestEntity(

            id = "mock_iat_full_5",

            title = "IISER IAT Mock #5",

            examType = "IISER IAT",

            subjectCoverage = "Easy • 60 Qs • 180 Min • PRO",

            questionCount = 60,

            durationMinutes = 180,

            maxMarks = 240,

            positiveMarks = 4,

            negativeMarks = 1,

            status = "Not Started",

            questionIdsCsv = "q_math_1,q_phys_1,q_chem_1,q_bio_1,q_math_2,q_phys_2,q_chem_2,q_bio_2"

        ),

        MockTestEntity(

            id = "mock_iat_full_6",

            title = "IISER IAT Mock #6",

            examType = "IISER IAT",

            subjectCoverage = "Easy • 60 Qs • 180 Min • PRO",

            questionCount = 60,

            durationMinutes = 180,

            maxMarks = 240,

            positiveMarks = 4,

            negativeMarks = 1,

            status = "Not Started",

            questionIdsCsv = "q_math_2,q_phys_2,q_chem_2,q_bio_2,q_math_3,q_phys_3,q_chem_3,q_bio_3"

        ),

        MockTestEntity(

            id = "mock_iat_full_7",

            title = "IISER IAT Mock #7",

            examType = "IISER IAT",

            subjectCoverage = "Easy • 60 Qs • 180 Min • PRO",

            questionCount = 60,

            durationMinutes = 180,

            maxMarks = 240,

            positiveMarks = 4,

            negativeMarks = 1,

            status = "Not Started",

            questionIdsCsv = "q_math_3,q_phys_3,q_chem_3,q_bio_3,q_math_4,q_phys_4,q_chem_4,q_bio_4"

        ),

        MockTestEntity(

            id = "mock_iat_full_8",

            title = "IISER IAT Mock #8",

            examType = "IISER IAT",

            subjectCoverage = "Easy • 60 Qs • 180 Min • PRO",

            questionCount = 60,

            durationMinutes = 180,

            maxMarks = 240,

            positiveMarks = 4,

            negativeMarks = 1,

            status = "Not Started",

            questionIdsCsv = "q_math_1,q_math_4,q_phys_1,q_phys_4,q_chem_1,q_chem_4,q_bio_1,q_bio_4"

        ),

        MockTestEntity(

            id = "mock_iat_full_9",

            title = "IISER IAT Mock #9",

            examType = "IISER IAT",

            subjectCoverage = "Easy • 60 Qs • 180 Min • PRO",

            questionCount = 60,

            durationMinutes = 180,

            maxMarks = 240,

            positiveMarks = 4,

            negativeMarks = 1,

            status = "Not Started",

            questionIdsCsv = "q_math_2,q_math_4,q_phys_2,q_phys_4,q_chem_2,q_chem_4,q_bio_2,q_bio_4"

        ),

        MockTestEntity(

            id = "mock_iat_full_10",

            title = "IISER IAT Mock #10",

            examType = "IISER IAT",

            subjectCoverage = "Easy • 60 Qs • 180 Min • PRO",

            questionCount = 60,

            durationMinutes = 180,

            maxMarks = 240,

            positiveMarks = 4,

            negativeMarks = 1,

            status = "Not Started",

            questionIdsCsv = "q_phys_1,q_phys_2,q_phys_3,q_phys_4,q_chem_1,q_chem_2,q_chem_3,q_chem_4,q_math_1,q_math_2,q_math_3,q_math_4,q_bio_1,q_bio_2,q_bio_3,q_bio_4"

        ),

        MockTestEntity(

            id = "mock_phys_sectional_1",

            title = "Physics Quick Mock",

            examType = "IISER IAT",

            subjectCoverage = "Physics • 10 Qs • 15 Min • FREE",

            questionCount = 10,

            durationMinutes = 15,

            maxMarks = 40,

            positiveMarks = 4,

            negativeMarks = 1,

            status = "Not Started",

            questionIdsCsv = "q_phys_1,q_phys_2,q_phys_3,q_phys_4"

        ),

        MockTestEntity(

            id = "mock_chem_sectional_1",

            title = "Chemistry Quick Mock",

            examType = "IISER IAT",

            subjectCoverage = "Chemistry • 10 Qs • 15 Min • PRO",

            questionCount = 10,

            durationMinutes = 15,

            maxMarks = 40,

            positiveMarks = 4,

            negativeMarks = 1,

            status = "Not Started",

            questionIdsCsv = "q_chem_1,q_chem_2,q_chem_3,q_chem_4"

        ),

        MockTestEntity(

            id = "mock_bio_sectional_1",

            title = "Biology Quick Mock",

            examType = "IISER IAT",

            subjectCoverage = "Biology • 10 Qs • 15 Min • PRO",

            questionCount = 10,

            durationMinutes = 15,

            maxMarks = 40,

            positiveMarks = 4,

            negativeMarks = 1,

            status = "Not Started",

            questionIdsCsv = "q_bio_1,q_bio_2,q_bio_3,q_bio_4"

        ),

        MockTestEntity(

            id = "mock_math_sectional_1",

            title = "Mathematics Quick Mock",

            examType = "IISER IAT",

            subjectCoverage = "Mathematics • 10 Qs • 15 Min • PRO",

            questionCount = 10,

            durationMinutes = 15,

            maxMarks = 40,

            positiveMarks = 4,

            negativeMarks = 1,

            status = "Not Started",

            questionIdsCsv = "q_math_1,q_math_2,q_math_3,q_math_4"

        )

    )



    val initialStudyPlanTasks: List<StudyPlanTaskEntity> = listOf(

        StudyPlanTaskEntity(

            id = 1,

            title = "Revise Telescoping Series & AM-GM Inequalities",

            subject = "Mathematics",

            activityType = "Concept Lesson",

            durationMinutes = 25,

            isCompleted = true,

            linkedChapterId = "math_ch_9"

        ),

        StudyPlanTaskEntity(

            id = 2,

            title = "Solve 10 Gauss's Law & Spherical Cavity Problems",

            subject = "Physics",

            activityType = "Important Set",

            durationMinutes = 30,

            isCompleted = false,

            linkedChapterId = "phys_ch_15"

        ),

        StudyPlanTaskEntity(

            id = 3,

            title = "Watch Crystal Field Splitting & Metal Carbonyl Lecture",

            subject = "Chemistry",

            activityType = "Video Lecture",

            durationMinutes = 35,

            isCompleted = false,

            linkedChapterId = "chem_ch_6"

        ),

        StudyPlanTaskEntity(

            id = 4,

            title = "Practice Meiotic Ploidy (n/C) & Enzyme Kinetics PYQs",

            subject = "Biology",

            activityType = "PYQ Drill",

            durationMinutes = 25,

            isCompleted = true,

            linkedChapterId = "bio_ch_10"

        )

    )

}