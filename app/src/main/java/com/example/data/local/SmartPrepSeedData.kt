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

    val initialChapters: List<ChapterEntity> = listOf(
        // ==================== MATHEMATICS (14 CHAPTERS - OFFICIAL IISER IAT SYLLABUS) ====================
        ChapterEntity(
            id = "math_ch_1",
            subject = "Mathematics",
            examTag = "IISER IAT",
            chapterNumber = 1,
            title = "Sets and Logic (includes Relations & Functions)",
            subtitle = "Set Algebra, Equivalence Relations, Bijections & Functional Equations",
            totalLessons = 6,
            completedLessons = 4,
            studyNotesCount = 8,
            practiceQuestionCount = 24,
            durationMinutes = 50,
            formulaHighlight = "|A ∪ B| = |A| + |B| − |A ∩ B|  •  Equivalence: Reflexive, Symmetric & Transitive",
            keyConceptsSummary = "Power sets, Cartesian products, reflexive/symmetric/transitive relations, equivalence classes, one-one (injective) and onto (surjective) functions, composition of functions, and invertible mappings.",
            detailedStudyNotes = """
                1. Set Operations & Inclusion-Exclusion Principle
                • De Morgan's Laws: (A ∪ B)' = A' ∩ B' and (A ∩ B)' = A' ∪ B'.
                • For three finite sets: |A ∪ B ∪ C| = Σ|A| − Σ|A ∩ B| + |A ∩ B ∩ C|.
                • Number of subsets of a set with n elements is 2ⁿ; number of proper subsets is 2ⁿ − 1.

                2. Relations & Equivalence Classes
                • A relation R on set A is an Equivalence Relation iff it is:
                  - Reflexive: (a, a) ∈ R ∀ a ∈ A
                  - Symmetric: (a, b) ∈ R ⇒ (b, a) ∈ R
                  - Transitive: (a, b) ∈ R and (b, c) ∈ R ⇒ (a, c) ∈ R
                • Total number of reflexive relations on an n-element set is 2^(n²−n); symmetric relations is 2^(n(n+1)/2).

                3. Functions, Bijections & Functional Equations
                • If |A| = m and |B| = n:
                  - Total functions A → B: nᵐ
                  - Injective (one-one) functions (when m ≤ n): ⁿPₘ
                  - Bijective functions (when m = n): n!
                • Classic IAT Functional Equations:
                  - f(x + y) = f(x) + f(y) ⇒ f(x) = cx (for continuous/monotonic f)
                  - f(x + y) = f(x)f(y) ⇒ f(x) = aˣ
                  - f(x) + f(1/x) = f(x)f(1/x) ⇒ f(x) = 1 ± xⁿ
            """.trimIndent(),
            videoTitle = "Equivalence Relations, Surjections & IAT Functional Equations",
            videoDurationLabel = "34:15",
            videoInstructor = "Prof. S. Venkataraman (IISER Pune Alumni)",
            videoKeyTakeaways = "Counting onto functions via Inclusion-Exclusion • Domain-range traps • Solving functional equations rapidly",
            isVideoCompleted = true,
            lastAccessedTimestamp = System.currentTimeMillis() - 3_600_000L
        ),
        ChapterEntity(
            id = "math_ch_2",
            subject = "Mathematics",
            examTag = "IISER IAT",
            chapterNumber = 2,
            title = "Basic Counting Techniques (includes Permutations, Combinations, and Binomial Theorem)",
            subtitle = "Combinatorial Reasoning, Derangements, Multinomial & Binomial Identities",
            totalLessons = 6,
            completedLessons = 3,
            studyNotesCount = 9,
            practiceQuestionCount = 26,
            durationMinutes = 55,
            formulaHighlight = "(x + y)ⁿ = Σ ⁿCᵣ xⁿ⁻ʳ yʳ  •  Derangements Dₙ = n! Σ (−1)ᵏ / k!",
            keyConceptsSummary = "Fundamental principle of counting, circular permutations, distribution of identical/distinct objects (beggar's method), Pigeonhole Principle, general and middle terms in binomial expansion, and Vandermonde's identity.",
            detailedStudyNotes = """
                1. Permutations & Combinations
                • Arrangement of n items with p alike of one kind, q alike of second kind: n! / (p! q!).
                • Circular permutations of n distinct objects: (n − 1)! (or (n − 1)!/2 if clockwise and anticlockwise are indistinguishable).
                • Number of non-negative integral solutions to x₁ + x₂ + ... + xᵣ = n is ⁿ⁺ʳ⁻¹Cᵣ₋₁.

                2. Derangements & Inclusion-Exclusion
                • Number of ways in which n items leave their original positions:
                  Dₙ = n! [1 − 1/1! + 1/2! − 1/3! + ... + (−1)ⁿ/n!].
                  Quick values: D₂ = 1, D₃ = 2, D₄ = 9, D₅ = 44.

                3. Binomial Theorem & Series Identities
                • General term in (a + b)ⁿ: Tᵣ₊₁ = ⁿCᵣ aⁿ⁻ʳ bʳ.
                • Properties of Binomial Coefficients:
                  - Σ ⁿCᵣ = 2ⁿ  |  Σ (−1)ʳ ⁿCᵣ = 0
                  - Σ r · ⁿCᵣ = n · 2ⁿ⁻¹
                  - Σ (ⁿCᵣ)² = ²ⁿCₙ (Vandermonde's Identity)
            """.trimIndent(),
            videoTitle = "Combinatorial Proofs, Stars & Bars, and Binomial Series",
            videoDurationLabel = "38:40",
            videoInstructor = "Prof. S. Venkataraman (IISER Pune Alumni)",
            videoKeyTakeaways = "Stars & Bars with lower/upper bounds • Extracting coefficients in trinomials • Telescoping binomial sums",
            isVideoCompleted = false,
            lastAccessedTimestamp = System.currentTimeMillis() - 7_200_000L
        ),
        ChapterEntity(
            id = "math_ch_3",
            subject = "Mathematics",
            examTag = "IISER IAT",
            chapterNumber = 3,
            title = "Complex Numbers, Linear and Quadratic Equations (includes Linear Inequalities)",
            subtitle = "Euler's Form, Roots of Unity, Argand Loci, Vieta's Relations & Wavy Curve",
            totalLessons = 7,
            completedLessons = 5,
            studyNotesCount = 10,
            practiceQuestionCount = 28,
            durationMinutes = 60,
            formulaHighlight = "e^(iθ) = cos θ + i sin θ  •  1 + ω + ω² = 0  •  x = [−b ± √(b²−4ac)] / 2a",
            keyConceptsSummary = "Algebra of complex numbers, modulus and conjugate properties, De Moivre's theorem, nth roots of unity, geometric loci in the Argand plane, location of quadratic roots, and rational linear inequalities.",
            detailedStudyNotes = """
                1. Complex Numbers & Euler's Representation
                • Polar & Euler Form: z = r(cos θ + i sin θ) = r e^(iθ), where r = |z| and θ = arg(z) ∈ (−π, π].
                • Triangle Inequality: ||z₁| − |z₂|| ≤ |z₁ ± z₂| ≤ |z₁| + |z₂|.
                • De Moivre's Theorem: (cos θ + i sin θ)ⁿ = cos(nθ) + i sin(nθ).
                • Cube Roots of Unity (1, ω, ω²): ω³ = 1 and 1 + ω + ω² = 0.

                2. Geometry in the Argand Plane
                • |z − z₀| = R represents a circle centered at z₀ with radius R.
                • |z − z₁| = |z − z₂| represents the perpendicular bisector of segment joining z₁ and z₂.
                • Rotation Theorem: (z₃ − z₁)/(z₂ − z₁) = (|z₃ − z₁|/|z₂ − z₁|) e^(iα).

                3. Quadratic Equations & Linear Inequalities
                • For ax² + bx + c = 0 (a ≠ 0), roots α, β satisfy α + β = −b/a and αβ = c/a.
                • Nature of roots via Discriminant D = b² − 4ac: real & distinct (D > 0), coincident (D = 0), complex conjugate (D < 0).
                • Wavy Curve Method for rational inequalities P(x)/Q(x) ≥ 0: factor into linear terms, mark critical points, and alternate signs according to odd/even multiplicity.
            """.trimIndent(),
            videoTitle = "Argand Plane Loci, Roots of Unity & Location of Quadratic Roots",
            videoDurationLabel = "41:20",
            videoInstructor = "Prof. S. Venkataraman (IISER Pune Alumni)",
            videoKeyTakeaways = "Coni's rotation formula • Polygon geometry with nth roots of unity • Condition for roots in (k₁, k₂)",
            isVideoCompleted = true,
            lastAccessedTimestamp = System.currentTimeMillis() - 10_800_000L
        ),
        ChapterEntity(
            id = "math_ch_4",
            subject = "Mathematics",
            examTag = "IISER IAT",
            chapterNumber = 4,
            title = "Trigonometric Functions (includes Inverse Trigonometric Functions)",
            subtitle = "Compound Angles, Conditional Identities, Principal Value Branches & ITF Series",
            totalLessons = 6,
            completedLessons = 3,
            studyNotesCount = 8,
            practiceQuestionCount = 22,
            durationMinutes = 50,
            formulaHighlight = "tan⁻¹x + tan⁻¹y = tan⁻¹((x+y)/(1−xy)) (xy < 1)  •  R = √(a² + b²)",
            keyConceptsSummary = "Domain, range, and periodicity of trigonometric functions, sum-to-product transformations, extreme values of a cos θ + b sin θ, principal domains of inverse trigonometric functions, and telescoping arctan series.",
            detailedStudyNotes = """
                1. Trigonometric Transformations & Bounds
                • Sum-to-Product:
                  - sin C + sin D = 2 sin((C+D)/2) cos((C−D)/2)
                  - cos C + cos D = 2 cos((C+D)/2) cos((C−D)/2)
                • Cosine Product Series: cos θ · cos 2θ · cos 4θ ... cos(2ⁿ⁻¹θ) = sin(2ⁿθ) / (2ⁿ sin θ).
                • Extreme values: −√(a² + b²) ≤ a cos θ + b sin θ ≤ √(a² + b²).

                2. Principal Value Branches of ITF
                • sin⁻¹x : [−1, 1] → [−π/2, π/2]
                • cos⁻¹x : [−1, 1] → [0, π]
                • tan⁻¹x : ℝ → (−π/2, π/2)
                • Fundamental Identities: sin⁻¹x + cos⁻¹x = π/2 for x ∈ [−1, 1]; tan⁻¹x + cot⁻¹x = π/2 for x ∈ ℝ.

                3. Telescoping Inverse Tan Series
                • Express general term as tan⁻¹((aᵣ₊₁ − aᵣ) / (1 + aᵣ₊₁ aᵣ)) = tan⁻¹(aᵣ₊₁) − tan⁻¹(aᵣ) to sum finite and infinite series in IAT.
            """.trimIndent(),
            videoTitle = "Inverse Trigonometric Graphs, Piece-wise Branches & Telescoping Sums",
            videoDurationLabel = "33:50",
            videoInstructor = "Dr. Ananya Chatterjee (IISc Bangalore)",
            videoKeyTakeaways = "Piecewise graphs of sin(sin⁻¹x) vs sin⁻¹(sin x) • Branch adjustments when xy > 1 • Telescoping tan⁻¹ sums",
            isVideoCompleted = false
        ),
        ChapterEntity(
            id = "math_ch_5",
            subject = "Mathematics",
            examTag = "IISER IAT",
            chapterNumber = 5,
            title = "Vectors",
            subtitle = "Dot & Cross Products, Scalar Triple Product, Coplanarity & Vector Equations",
            totalLessons = 5,
            completedLessons = 3,
            studyNotesCount = 7,
            practiceQuestionCount = 20,
            durationMinutes = 45,
            formulaHighlight = "[a b c] = a · (b × c)  •  a × (b × c) = (a · c)b − (a · b)c",
            keyConceptsSummary = "Collinearity and coplanarity of vectors, orthogonal projection, geometrical meaning of cross product, volume of parallelepiped and tetrahedron via scalar triple product, and Lagrange's vector triple product identity.",
            detailedStudyNotes = """
                1. Scalar (Dot) & Vector (Cross) Products
                • Dot Product: a · b = |a||b| cos θ; projection of a on b is (a · b)/|b|.
                • Cross Product: |a × b| = |a||b| sin θ = area of parallelogram with adjacent sides a and b.
                • Lagrange's Identity: |a × b|² + (a · b)² = |a|² |b|².

                2. Scalar Triple Product (Box Product)
                • [a b c] = (a × b) · c represents the signed volume of the parallelepiped formed by a, b, c.
                • Volume of a tetrahedron with coterminous edges a, b, c is (1/6)|[a b c]|.
                • Three vectors are coplanar iff [a b c] = 0.
                • [a+b  b+c  c+a] = 2[a b c] and [a×b  b×c  c×a] = [a b c]².

                3. Vector Triple Product & Reciprocal System
                • a × (b × c) = (a · c)b − (a · b)c (lies in the plane of b and c).
                • Solving r × a = b with r · c = λ using vector triple product expansion.
            """.trimIndent(),
            videoTitle = "Mastering Box Products, Vector Triple Product & Geometric Vectors",
            videoDurationLabel = "31:15",
            videoInstructor = "Prof. S. Venkataraman (IISER Pune Alumni)",
            videoKeyTakeaways = "Eliminating unknown vectors using dot/cross products • Tetrahedron volume shortcuts • Coplanarity tests",
            isVideoCompleted = false
        ),
        ChapterEntity(
            id = "math_ch_6",
            subject = "Mathematics",
            examTag = "IISER IAT",
            chapterNumber = 6,
            title = "Matrices & Determinants",
            subtitle = "Adjoint Properties, Cramer's Rule, Linear Systems & Cayley-Hamilton Theorem",
            totalLessons = 6,
            completedLessons = 4,
            studyNotesCount = 9,
            practiceQuestionCount = 26,
            durationMinutes = 55,
            formulaHighlight = "|adj(A)| = |A|^(n−1)  •  A · adj(A) = |A|Iₙ  •  det(A − λI) = 0",
            keyConceptsSummary = "Symmetric, skew-symmetric, and orthogonal matrices, determinant properties, adjoint and inverse identities, consistency of systems of linear equations (AX = B), and characteristic polynomial applications.",
            detailedStudyNotes = """
                1. Special Matrices & Determinant Identities
                • Every square matrix A can be uniquely written as ½(A + Aᵀ) + ½(A − Aᵀ) (sum of symmetric and skew-symmetric).
                • For a skew-symmetric matrix of odd order n, det(A) = 0.
                • Orthogonal Matrix: A Aᵀ = Aᵀ A = I ⇒ det(A) = ±1.

                2. Adjoint & Inverse Properties (For n × n Matrix A)
                • A(adj A) = (adj A)A = |A|Iₙ
                • |adj A| = |A|^(n−1)  and  |adj(adj A)| = |A|^((n−1)²)
                • adj(adj A) = |A|^(n−2) A
                • adj(AB) = adj(B) · adj(A)  and  (AB)⁻¹ = B⁻¹ A⁻¹

                3. System of Linear Equations & Cayley-Hamilton
                • Non-homogeneous system AX = B:
                  - |A| ≠ 0: Unique solution X = A⁻¹B.
                  - |A| = 0 and (adj A)B = 0: Infinitely many solutions (or no solution if parallel planes).
                  - |A| = 0 and (adj A)B ≠ 0: Inconsistent (No solution).
                • Cayley-Hamilton Theorem: Every square matrix satisfies its own characteristic equation det(A − λI) = 0. For 2×2: A² − tr(A)A + det(A)I = 0.
            """.trimIndent(),
            videoTitle = "Adjoint Identities, System Consistency & Matrix Powers in IAT",
            videoDurationLabel = "37:45",
            videoInstructor = "Dr. Ananya Chatterjee (IISc Bangalore)",
            videoKeyTakeaways = "Computing Aⁿ via Cayley-Hamilton • Homogeneous non-trivial solution criteria • Determinant row-column operations",
            isVideoCompleted = true,
            lastAccessedTimestamp = System.currentTimeMillis() - 14_400_000L
        ),
        ChapterEntity(
            id = "math_ch_7",
            subject = "Mathematics",
            examTag = "IISER IAT",
            chapterNumber = 7,
            title = "Coordinate Geometry (includes Straight Lines and Conic Sections)",
            subtitle = "Family of Lines, Circles, Parabola, Ellipse, Hyperbola & Tangent-Normal Loci",
            totalLessons = 8,
            completedLessons = 4,
            studyNotesCount = 12,
            practiceQuestionCount = 32,
            durationMinutes = 65,
            formulaHighlight = "y = mx ± √(a²m² + b²)  •  e = √(1 ∓ b²/a²)  •  T = S₁ (Chord of Contact)",
            keyConceptsSummary = "Concurrency, reflection of a point in a line, orthogonal circles, radical axis, focal chord properties of parabola, auxiliary circle and eccentric angle of ellipse, and asymptotes of hyperbola.",
            detailedStudyNotes = """
                1. Straight Lines & Circles
                • Image (x₂, y₂) of (x₁, y₁) in ax + by + c = 0: (x₂−x₁)/a = (y₂−y₁)/b = −2(ax₁+by₁+c)/(a²+b²).
                • Orthogonal Circles S₁ = 0 and S₂ = 0: 2g₁g₂ + 2f₁f₂ = c₁ + c₂.
                • Length of tangent from external point P(x₁, y₁) to circle S = 0 is √S₁.

                2. Parabola (y² = 4ax)
                • Parametric coordinates: (at², 2at); Tangent at 't': ty = x + at²; Normal at 't': y + tx = 2at + at³.
                • For any focal chord with parameters t₁ and t₂: t₁t₂ = −1, and harmonic mean of focal segments is the semi-latus rectum 2a.

                3. Ellipse (x²/a² + y²/b² = 1) & Hyperbola (x²/a² − y²/b² = 1)
                • Ellipse: b² = a²(1 − e²), sum of focal distances SP + S'P = 2a, director circle x² + y² = a² + b².
                • Hyperbola: b² = a²(e² − 1), |SP − S'P| = 2a, Rectangular hyperbola (a = b) has eccentricity e = √2.
            """.trimIndent(),
            videoTitle = "Unified Conic Section Tangents, Focal Properties & Locus Problems",
            videoDurationLabel = "44:10",
            videoInstructor = "Prof. S. Venkataraman (IISER Pune Alumni)",
            videoKeyTakeaways = "Unified T = 0, S₁ = T² equations • Optical reflection property of conics • Parametric chord midpoints",
            isVideoCompleted = false
        ),
        ChapterEntity(
            id = "math_ch_8",
            subject = "Mathematics",
            examTag = "IISER IAT",
            chapterNumber = 8,
            title = "Three-dimensional Geometry",
            subtitle = "Direction Cosines, Skew Lines, Shortest Distance & Line-Plane Intersections",
            totalLessons = 5,
            completedLessons = 2,
            studyNotesCount = 7,
            practiceQuestionCount = 20,
            durationMinutes = 45,
            formulaHighlight = "l² + m² + n² = 1  •  d = |(a₂ − a₁) · (b₁ × b₂)| / |b₁ × b₂|",
            keyConceptsSummary = "Direction cosines and ratios, symmetrical and vector equations of lines in 3D space, shortest distance between skew lines and parallel lines, coplanarity of lines, and angle between lines and planes.",
            detailedStudyNotes = """
                1. Direction Cosines (DCs) & Direction Ratios (DRs)
                • If a line makes angles α, β, γ with positive X, Y, Z axes: l = cos α, m = cos β, n = cos γ with l² + m² + n² = 1.
                • Angle θ between two lines with DCs (l₁, m₁, n₁) and (l₂, m₂, n₂): cos θ = |l₁l₂ + m₁m₂ + n₁n₂|.

                2. Equations of a Line in 3D Space
                • Vector form: r = a + λb; Cartesian form: (x − x₁)/a = (y − y₁)/b = (z − z₁)/c = λ.
                • Foot of perpendicular from P(x₀, y₀, z₀) to a line is found by taking a general point Q(λ) on the line and setting PQ · b = 0.

                3. Skew Lines & Shortest Distance
                • Shortest distance between skew lines r = a₁ + λb₁ and r = a₂ + μb₂:
                  d = |(a₂ − a₁) · (b₁ × b₂)| / |b₁ × b₂|.
                • Distance between parallel lines r = a₁ + λb and r = a₂ + μb:
                  d = |(a₂ − a₁) × b| / |b|.
            """.trimIndent(),
            videoTitle = "3D Skew Lines, Foot of Perpendicular & Spatial Geometry in IAT",
            videoDurationLabel = "30:25",
            videoInstructor = "Prof. S. Venkataraman (IISER Pune Alumni)",
            videoKeyTakeaways = "Finding image of a point in a 3D line • Coplanarity determinant test • Skew line shortest distance",
            isVideoCompleted = false
        ),
        ChapterEntity(
            id = "math_ch_9",
            subject = "Mathematics",
            examTag = "IISER IAT",
            chapterNumber = 9,
            title = "Sequences & Series",
            subtitle = "AP, GP, HP, AGP, Telescoping Sums & AM-GM-HM Inequalities",
            totalLessons = 6,
            completedLessons = 5,
            studyNotesCount = 8,
            practiceQuestionCount = 24,
            durationMinutes = 50,
            formulaHighlight = "AM ≥ GM ≥ HM  •  S_∞ = a / (1 − r) (|r| < 1)  •  Σ k² = n(n+1)(2n+1)/6",
            keyConceptsSummary = "Arithmetic, Geometric, and Harmonic progressions, Arithmetico-Geometric series, method of differences (Vn splitting), power mean and AM-GM inequalities, and Cauchy-Schwarz applications.",
            detailedStudyNotes = """
                1. Progressions & Special Summations
                • AP: Tₙ = a + (n−1)d, Sₙ = (n/2)[2a + (n−1)d].
                • GP: Tₙ = a rⁿ⁻¹, Sₙ = a(1 − rⁿ)/(1 − r); Infinite GP (|r| < 1): S_∞ = a/(1 − r).
                • Power Sums:
                  - Σ k = n(n+1)/2
                  - Σ k² = n(n+1)(2n+1)/6
                  - Σ k³ = [n(n+1)/2]²

                2. Telescoping Series (Vn Method)
                • Express Tₖ = Vₖ − Vₖ₋₁ so that Σ Tₖ = Vₙ − V₀.
                • Classic fraction splitting: 1 / [k(k+1)(k+2)] = ½ [1/(k(k+1)) − 1/((k+1)(k+2))].

                3. AM ≥ GM ≥ HM & Weighted Inequalities
                • For positive reals a₁, a₂, ..., aₙ:
                  (a₁ + a₂ + ... + aₙ)/n ≥ (a₁a₂...aₙ)^(1/n) ≥ n / (1/a₁ + ... + 1/aₙ).
                • Equality holds iff a₁ = a₂ = ... = aₙ.
            """.trimIndent(),
            videoTitle = "Telescoping Series, AGP & AM-GM Optimization for IISER IAT",
            videoDurationLabel = "35:10",
            videoInstructor = "Prof. S. Venkataraman (IISER Pune Alumni)",
            videoKeyTakeaways = "Splitting factorial and inverse trig series • Term-splitting for AM-GM • Recurrence relations",
            isVideoCompleted = true,
            lastAccessedTimestamp = System.currentTimeMillis() - 1_800_000L
        ),
        ChapterEntity(
            id = "math_ch_10",
            subject = "Mathematics",
            examTag = "IISER IAT",
            chapterNumber = 10,
            title = "Limit & Continuity",
            subtitle = "Indeterminate Forms, Taylor Series Expansions, Sandwich Theorem & IVT",
            totalLessons = 5,
            completedLessons = 4,
            studyNotesCount = 8,
            practiceQuestionCount = 22,
            durationMinutes = 45,
            formulaHighlight = "lim (x→a) [1 + f(x)]^(g(x)) = e^[lim f(x)g(x)]  •  lim (sin x)/x = 1",
            keyConceptsSummary = "Seven indeterminate forms, Maclaurin series expansions for standard functions, L'Hôpital's rule, Squeeze (Sandwich) theorem, removable vs jump discontinuities, and Intermediate Value Theorem.",
            detailedStudyNotes = """
                1. Maclaurin Expansions (Around x = 0)
                • sin x = x − x³/3! + x⁵/5! − ...
                • cos x = 1 − x²/2! + x⁴/4! − ...
                • tan x = x + x³/3 + 2x⁵/15 + ...
                • eˣ = 1 + x + x²/2! + x³/3! + ...
                • ln(1 + x) = x − x²/2 + x³/3 − ...

                2. Evaluating 1^∞ and 0/0 Forms
                • If lim (x→a) f(x) = 1 and lim (x→a) g(x) = ∞, then:
                  lim (x→a) [f(x)]^(g(x)) = exp( lim (x→a) g(x)[f(x) − 1] ).

                3. Continuity & Intermediate Value Theorem (IVT)
                • f(x) is continuous at x = c iff LHL = RHL = f(c).
                • IVT: If f is continuous on [a, b] and f(a)·f(b) < 0, there exists at least one c ∈ (a, b) such that f(c) = 0.
            """.trimIndent(),
            videoTitle = "Taylor Expansions, 1^∞ Limits & Continuity of Composite Functions",
            videoDurationLabel = "32:40",
            videoInstructor = "Dr. Ananya Chatterjee (IISc Bangalore)",
            videoKeyTakeaways = "Replacing L'Hôpital with 3-term Taylor expansions • Continuity of [x] and {x} compositions • IVT root existence",
            isVideoCompleted = true
        ),
        ChapterEntity(
            id = "math_ch_11",
            subject = "Mathematics",
            examTag = "IISER IAT",
            chapterNumber = 11,
            title = "Differentiation (includes Application of Derivatives)",
            subtitle = "Differentiability, Rolle's & LMVT, Monotonicity, Tangents & Maxima-Minima",
            totalLessons = 7,
            completedLessons = 4,
            studyNotesCount = 10,
            practiceQuestionCount = 28,
            durationMinutes = 60,
            formulaHighlight = "f'(c) = [f(b) − f(a)] / (b − a)  •  Concave Up: f''(x) > 0",
            keyConceptsSummary = "Left and right hand derivatives, sharp corners in modulus graphs, chain/implicit/parametric differentiation, Rolle's and Lagrange's Mean Value Theorems, critical points, inflection points, and optimization.",
            detailedStudyNotes = """
                1. Differentiability & Sharp Corners
                • f is differentiable at x = a iff LHD = RHD (finite).
                • If g(x) is differentiable and g(a) = 0, then |g(x)| is differentiable at x = a iff g'(a) = 0.

                2. Rolle's Theorem & Lagrange's Mean Value Theorem (LMVT)
                • Rolle's Theorem: If f is continuous on [a, b], differentiable on (a, b), and f(a) = f(b), then ∃ c ∈ (a, b) with f'(c) = 0.
                • LMVT: ∃ c ∈ (a, b) such that f'(c) = [f(b) − f(a)] / (b − a).

                3. Monotonicity, Maxima-Minima & Concavity
                • Strictly increasing on I if f'(x) ≥ 0 and f'(x) = 0 only at isolated points.
                • Second Derivative Test: If f'(c) = 0 and f''(c) < 0 ⇒ Local Maximum; if f''(c) > 0 ⇒ Local Minimum.
                • Point of Inflection: Concavity (sign of f''(x)) changes across x = c.
            """.trimIndent(),
            videoTitle = "Mean Value Theorems, Graphical Differentiability & AOD Optimization",
            videoDurationLabel = "39:30",
            videoInstructor = "Dr. Ananya Chatterjee (IISc Bangalore)",
            videoKeyTakeaways = "Constructing auxiliary functions for Rolle's theorem • Counting real roots with monotonicity • Geometric extrema",
            isVideoCompleted = false
        ),
        ChapterEntity(
            id = "math_ch_12",
            subject = "Mathematics",
            examTag = "IISER IAT",
            chapterNumber = 12,
            title = "Integration (includes Applications of Integration)",
            subtitle = "Indefinite & Definite Integrals, King's Rule, Leibniz Rule & Area Under Curves",
            totalLessons = 7,
            completedLessons = 5,
            studyNotesCount = 11,
            practiceQuestionCount = 30,
            durationMinutes = 65,
            formulaHighlight = "∫_a^b f(x)dx = ∫_a^b f(a+b−x)dx  •  d/dx ∫_{g(x)}^{h(x)} f(t)dt = f(h)h' − f(g)g'",
            keyConceptsSummary = "Integration by parts (∫ eˣ[f(x) + f'(x)]dx), partial fractions, definite integral symmetry properties, differentiation under the integral sign (Leibniz rule), Riemann sums as definite integrals, and bounded area calculation.",
            detailedStudyNotes = """
                1. Key Indefinite Integral Forms
                • Cancellation Form: ∫ eˣ [f(x) + f'(x)] dx = eˣ f(x) + C.
                • Algebraic Twin: ∫ (1 ± 1/x²) / (x ∓ 1/x)² dx via substitution t = x ∓ 1/x.

                2. Definite Integration Properties & Leibniz Rule
                • King's Property: ∫_a^b f(x) dx = ∫_a^b f(a + b − x) dx.
                • Queen's Property: ∫_0^(2a) f(x) dx = ∫_0^a [f(x) + f(2a − x)] dx.
                • Leibniz Rule: d/dx [∫_{g(x)}^{h(x)} f(t) dt] = f(h(x))·h'(x) − f(g(x))·g'(x).
                • Limit of a Sum: lim (n→∞) (1/n) Σ_{r=1}^n f(r/n) = ∫_0^1 f(x) dx.

                3. Applications of Integration (Area Bounded by Curves)
                • Area between y = f(x) and y = g(x) on [a, b]: A = ∫_a^b |f(x) − g(x)| dx.
                • Standard parabolic area shortcut: Area enclosed between y² = 4ax and x² = 4by is 16ab / 3.
            """.trimIndent(),
            videoTitle = "King's Property, Leibniz Integral Differentiation & Bounded Areas",
            videoDurationLabel = "42:15",
            videoInstructor = "Dr. Ananya Chatterjee (IISc Bangalore)",
            videoKeyTakeaways = "Spotting King's property in seconds • Combining Leibniz rule with L'Hôpital • Rapid area between curves",
            isVideoCompleted = true,
            lastAccessedTimestamp = System.currentTimeMillis() - 5_400_000L
        ),
        ChapterEntity(
            id = "math_ch_13",
            subject = "Mathematics",
            examTag = "IISER IAT",
            chapterNumber = 13,
            title = "Differential Equations",
            subtitle = "Order & Degree, Variable Separable, Homogeneous, Linear DE & Exact Differentials",
            totalLessons = 5,
            completedLessons = 3,
            studyNotesCount = 7,
            practiceQuestionCount = 22,
            durationMinutes = 50,
            formulaHighlight = "dy/dx + P(x)y = Q(x)  ⇒  IF = e^(∫ P(x)dx)  ⇒  y · (IF) = ∫ Q(x)·(IF) dx + C",
            keyConceptsSummary = "Order and degree of differential equations, variable separable and homogeneous forms, first-order linear differential equations, Bernoulli's equation, exact differentials, and orthogonal trajectories.",
            detailedStudyNotes = """
                1. Order, Degree & Formation
                • Order: Highest order derivative present in the differential equation.
                • Degree: Highest power of the highest order derivative after clearing radicals and fractions in derivatives.

                2. First-Order Linear & Bernoulli Equations
                • Standard Linear DE: dy/dx + P(x)y = Q(x).
                  Integrating Factor (IF) = e^(∫ P(x) dx); General Solution: y · (IF) = ∫ Q(x) · (IF) dx + C.
                • Bernoulli's Form: dy/dx + P(x)y = Q(x)yⁿ; divide by yⁿ and substitute v = y^(1−n).

                3. Exact Differentials (Inspection Method)
                • x dy + y dx = d(xy)
                • (x dy − y dx) / x² = d(y/x)
                • (x dy − y dx) / (x² + y²) = d(tan⁻¹(y/x))
                • (x dx + y dy) / (x² + y²) = ½ d(ln(x² + y²))
            """.trimIndent(),
            videoTitle = "Integrating Factors, Exact Differentials & Initial Value Problems in IAT",
            videoDurationLabel = "34:05",
            videoInstructor = "Dr. Ananya Chatterjee (IISc Bangalore)",
            videoKeyTakeaways = "Recognizing exact differential combinations • Switching dx/dy for x-linear DEs • Growth/decay curves",
            isVideoCompleted = false
        ),
        ChapterEntity(
            id = "math_ch_14",
            subject = "Mathematics",
            examTag = "IISER IAT",
            chapterNumber = 14,
            title = "Statistics, Probability & Linear Programming",
            subtitle = "Variance, Conditional Probability, Bayes' Theorem, Random Variables & LPP",
            totalLessons = 6,
            completedLessons = 4,
            studyNotesCount = 9,
            practiceQuestionCount = 26,
            durationMinutes = 55,
            formulaHighlight = "P(Eᵢ|A) = P(Eᵢ)P(A|Eᵢ) / Σ P(Eⱼ)P(A|Eⱼ)  •  σ² = (1/n)Σxᵢ² − x̄²",
            keyConceptsSummary = "Mean deviation, variance and standard deviation under linear scaling, conditional probability, Law of Total Probability, Bayes' theorem, binomial probability distribution, and corner-point optimization in LPP.",
            detailedStudyNotes = """
                1. Measures of Dispersion (Variance & Standard Deviation)
                • Variance: σ² = (1/n) Σ(xᵢ − x̄)² = (1/n) Σ xᵢ² − (x̄)².
                • Effect of Linear Transformation yᵢ = a xᵢ + b:
                  - New Mean: ȳ = a x̄ + b
                  - New Variance: σ_y² = a² σ_x² (independent of origin shift b)
                  - New Standard Deviation: σ_y = |a| σ_x.

                2. Conditional Probability, Total Probability & Bayes' Theorem
                • Conditional Probability: P(A | B) = P(A ∩ B) / P(B) (for P(B) > 0).
                • Independent Events: P(A ∩ B) = P(A) · P(B).
                • Bayes' Theorem for mutually exclusive and exhaustive partition E₁, E₂, ..., Eₙ:
                  P(Eₖ | A) = [P(Eₖ) P(A | Eₖ)] / Σⱼ [P(Eⱼ) P(A | Eⱼ)].
                • Binomial Distribution B(n, p): P(X = r) = ⁿCᵣ pʳ qⁿ⁻ʳ, Mean = np, Variance = npq.

                3. Linear Programming Problems (LPP)
                • Corner Point Theorem: The optimal value (maximum or minimum) of objective function Z = ax + by over a convex feasible polygon occurs at one of its extreme corner vertices.
            """.trimIndent(),
            videoTitle = "Bayes' Theorem Trees, Variance Transformations & LPP Feasible Regions",
            videoDurationLabel = "36:50",
            videoInstructor = "Prof. S. Venkataraman (IISER Pune Alumni)",
            videoKeyTakeaways = "Reverse probability trees for Bayes' theorem • Variance of combined datasets • Unbounded LPP verification",
            isVideoCompleted = true
        ),

        // ==================== PHYSICS (28 CHAPTERS - OFFICIAL IISER IAT SYLLABUS) ====================
        ChapterEntity(
            id = "phys_ch_1",
            subject = "Physics",
            examTag = "IISER IAT",
            chapterNumber = 1,
            title = "Units and Measurements",
            subtitle = "The 2019 SI System, Precision Instruments, Error Analysis & Dimensional Methods",
            totalLessons = 4,
            completedLessons = 4,
            studyNotesCount = 25,
            practiceQuestionCount = 10,
            durationMinutes = 45,
            formulaHighlight = "ΔZ/Z = p(ΔA/A) + q(ΔB/B) + r(ΔC/C)  •  e/m = E² / (2VB²)  •  LC = Pitch / Circular Divisions",
            keyConceptsSummary = "SI units are defined by fixed constants of nature — c, h, e, k_B, N_A, \u0394\u03bd_Cs, K_cd\nLeast count decides precision: Vernier LC = 1 MSD \u2212 1 VSD; Screw gauge LC = Pitch \u00f7 Circular divisions\nErrors always add \u2014 powers multiply them: \u0394Z/Z = p(\u0394A/A) + q(\u0394B/B) + r(\u0394C/C)\nSignificant figures: decimal places for + and \u2212; significant figures for \u00d7 and \u00f7\nHomogeneity: only identical dimensions can be added or equated; arguments of sin, e^x and ln are dimensionless\nDimensional analysis derives relations and converts units \u2014 but never finds constants like 2\u03c0\nThomson e/m: e/m = E\u00b2/(2VB\u00b2) \u2248 1.76 \u00d7 10\u00b9\u00b9 C/kg",
            detailedStudyNotes = """
                Units, Measurement and the SI System
                • Physics is a quantitative science: every law is stated through measurable physical quantities — length, mass, time, force, energy, charge. A measurement is complete only when written as a number multiplied by a unit: Q = n × u.
                • The quantity itself never changes when the unit changes: n₁u₁ = n₂u₂. Choose a smaller unit and the number grows in the same ratio — 1 km = 1000 m and 1 inch = 2.54 cm are the same lengths in different clothes.
                • Fundamental (base) quantities are the 7 quantities fixed by international agreement as independent of one another. Every other quantity is a derived quantity, built by multiplying or dividing base quantities: speed is length ÷ time, force is mass × length ÷ time².
                • Earlier systems — CGS (cm, g, s), FPS (foot, pound, second) and MKS (m, kg, s) — gave way to the SI (adopted 1960; scheme of 1971), which the 26th CGPM re-founded entirely on constants of nature in November 2018, effective 20 May 2019.
                ★ HIGHLIGHT — A unit is a standard reference of the same kind as the quantity. A good standard must be well defined, easily reproducible anywhere, stable with time, and of a convenient size.

                ▸ The Seven SI Base Units — the 2019 Definitions
                • Length — metre (m): defined through the speed of light in vacuum, c = 299,792,458 m/s exactly. One metre is the distance light travels in 1/299,792,458 of a second.
                • Mass — kilogram (kg): defined through the Planck constant h = 6.62607015 × 10⁻³⁴ J s exactly, together with the metre and the second. The old platinum-iridium cylinder in Paris is retired.
                • Time — second (s): the duration of 9,192,631,770 periods of the caesium-133 atom transition; the caesium frequency Δν_Cs = 9,192,631,770 Hz exactly. This is why atomic clocks err by about a second in millions of years.
                • Electric current — ampere (A): defined through the elementary charge e = 1.602176634 × 10⁻¹⁹ C exactly. Temperature — kelvin (K): defined through the Boltzmann constant k_B = 1.380649 × 10⁻²³ J/K exactly.
                • Amount of substance — mole (mol): exactly 6.02214076 × 10²³ elementary entities (the Avogadro constant N_A). Luminous intensity — candela (cd): defined through the luminous efficacy K_cd = 683 lm/W at frequency 540 × 10¹² Hz.
                ★ HIGHLIGHT — All 7 SI units now rest on 7 fixed constants of nature: c, h, e, k_B, N_A, Δν_Cs, K_cd. They can never drift or be destroyed — any laboratory in the universe can reproduce them exactly.
                ⚠ EXAM TRAP — Since 2019, μ₀ is NO LONGER exactly 4π × 10⁻⁷ H/m: it is now measured experimentally (CODATA 2022: 1.25663706127 × 10⁻⁶ N/A²), and so is ε₀ = 8.8541878188 × 10⁻¹² F/m — though ε₀μ₀ = 1/c² remains exact. Books still printing μ₀ as an exact defined value are pre-2019.

                ▸ Derived Units, Supplementary Units, Prefixes and Writing Rules
                • Force — newton (N) = kg m s⁻² • Work and energy — joule (J) = kg m² s⁻² • Power — watt (W) = kg m² s⁻³ • Pressure — pascal (Pa) = kg m⁻¹ s⁻² • Frequency — hertz (Hz) = s⁻¹ • Charge — coulomb (C) = A s • Potential — volt (V) = kg m² s⁻³ A⁻¹ • Resistance — ohm (Ω) = kg m² s⁻³ A⁻² • Capacitance — farad (F) = kg⁻¹ m⁻² s⁴ A².
                • Supplementary units: plane angle — radian (rad), the angle subtended by an arc equal to the radius; solid angle — steradian (sr), its 3D counterpart. Both are dimensionless ratios of lengths, yet both carry unit names.
                ⚠ EXAM TRAP — Dimensionless does NOT mean unitless: the radian and steradian are dimensionless but are genuine units. Conversely, strain and refractive index are dimensionless AND unitless.
                • Prefixes scale a unit by powers of ten: pico (p) 10⁻¹² • nano (n) 10⁻⁹ • micro (μ) 10⁻⁶ • milli (m) 10⁻³ • centi (c) 10⁻² • deci (d) 10⁻¹ • kilo (k) 10³ • mega (M) 10⁶ • giga (G) 10⁹ • tera (T) 10¹².
                • Practical and astronomical units: 1 fm = 10⁻¹⁵ m (nuclei) • 1 Å = 10⁻¹⁰ m (atoms) • 1 nm = 10⁻⁹ m • 1 μm = 10⁻⁶ m • 1 light year = 9.46 × 10¹⁵ m • 1 AU = 1.496 × 10¹¹ m • 1 parsec = 3.08 × 10¹⁶ m (the largest length unit here) • 1 amu (u) = 1.66 × 10⁻²⁷ kg • 1 eV = 1.602 × 10⁻¹⁹ J.
                • Writing rules examiners test: never a full stop after a symbol (5 kg, not 5 kg.); never a plural (10 N, not 10 Ns); a space between number and unit; units named after scientists take capital symbols (N, J, W, Pa) but small letters in full (newton, joule, watt).

                Significant Figures — What They Mean
                • The significant figures of a measurement are all the digits known reliably, plus the first uncertain digit. A length written 23.023 cm claims 5 significant figures — knowledge up to the last digit. Writing 23.0230 cm from a millimetre scale would be dishonest: the extra digits are invented.
                • Significant figures are therefore a language of honesty: the number of significant figures tells the reader exactly how precise the measurement was, and the last significant digit is always the doubtful one.
                • Changing the unit never changes the count: 2.308 cm = 0.02308 m = 23.08 mm — 4 significant figures in every unit (NCERT).
                • Order of magnitude (NCERT rule): write N = a × 10^b. If a ≤ 5, the order of magnitude is b; if a > 5, it is b + 1. Earth's diameter 1.28 × 10⁷ m → order 7; hydrogen atom 1.06 × 10⁻¹⁰ m → order −10. Orders of magnitude let you sanity-check any numerical answer in seconds.

                ▸ Counting Significant Figures — the 6 Rules
                • Rule 1: All non-zero digits are significant. 237 has 3; 2371 has 4 significant figures.
                • Rule 2: Zeros between non-zero digits are significant. 2007 has 4; 4.002 has 4 significant figures.
                • Rule 3: Leading zeros are never significant — they only fix the decimal point. 0.0042 has 2; 0.000105 has 3 significant figures.
                • Rule 4: Trailing zeros in a number WITH a decimal point are significant. 3.500 has 4; 0.00120 has 4; 12.000 has 5 significant figures.
                • Rule 5: In a whole number WITHOUT a decimal point, trailing zeros are doubtful. Use scientific notation to say what you mean: 2500 may be 2.5 × 10³ (2 significant figures) or 2.500 × 10³ (4 significant figures).
                • Rule 6: Powers of ten never count, and exact numbers — counted objects and defined constants (12 in a dozen, c = 299,792,458 m/s) — have infinitely many significant figures and never limit a calculation.

                ▸ Rounding Off and Arithmetic with Significant Figures
                • Rounding off: the digit to be dropped is less than 5 — leave the last retained digit unchanged (3.24 → 3.2). Greater than 5 — raise it by one (3.27 → 3.3).
                • Exactly 5 — the unbiased even-odd rule: leave an even last digit unchanged (3.25 → 3.2) and raise an odd one (3.35 → 3.4). NCERT's own worked pair: 2.745 → 2.74 and 2.735 → 2.74. Over long calculations this stops rounding from biasing results upward — "always round 5 up" is NOT the NCERT rule.
                • Subtraction of nearly equal numbers destroys significant figures: 12.9 g − 7.06 g = 5.8 g (not 5.84 g), and 0.307 m − 0.304 m = 0.003 m — only ONE significant figure survives the subtraction.
                • Addition and subtraction follow DECIMAL PLACES, not significant figures: 436.32 + 227.2 + 0.301 = 663.821, reported as 663.8, because 227.2 is known only to one decimal place.
                • Multiplication and division follow SIGNIFICANT FIGURES: 2.456 × 1.2 = 2.9472, reported as 2.9, because 1.2 carries only 2 significant figures.
                ⚠ EXAM TRAP — Never round intermediate steps. Carry extra digits through the whole calculation and round once, at the very end.

                Measurement and Least Count
                • No instrument measures perfectly. The least count (LC) of an instrument is the smallest change it can detect, and it fixes the precision of every reading: a metre scale (LC 1 mm) can never honestly report 12.34 cm.
                ✔ KEY FORMULA — Least count = smallest division the instrument can resolve. Finer instrument → smaller LC → more significant figures in every reading.
                • Every experiment in this chapter is a fight for a smaller least count: metre scale 10⁻³ m, Vernier calipers 10⁻⁴ m, screw gauge 10⁻⁵ m, and travelling microscopes finer still.
                • Precision ranking (NCERT Exercise 1.6): optical instruments, resolving about a wavelength of light, beat the screw gauge (~0.001 cm), which beats Vernier calipers (~0.01 cm), which beat the metre scale (0.1 cm). Adding circular divisions cannot raise a screw gauge's accuracy without limit — mechanical play (backlash) takes over.

                ▸ Vernier Calipers — Least Count, Reading and Zero Error [Fig. 1.1, Fig. 1.4]
                • The object sits between the lower (external) jaws; the upper jaws measure internal diameters, and the thin depth rod at the back measures the depth of a vessel.
                ✔ KEY FORMULA — LC = 1 MSD − 1 VSD (one main scale division minus one vernier scale division). If 10 vernier divisions coincide with 9 main scale divisions and 1 MSD = 1 mm, then LC = 1 mm − 0.9 mm = 0.1 mm = 0.01 cm.
                ✔ KEY FORMULA — Reading = Main scale reading (last full division before the vernier zero) + (Coinciding vernier division × LC) − Zero error.
                • Worked example: main scale reading = 12 mm, the 7th vernier division coincides, LC = 0.1 mm. Reading = 12 + 7 × 0.1 = 12.7 mm = 1.27 cm.
                • Zero error: close the jaws gently. If the vernier zero sits to the RIGHT of the main-scale zero, the instrument over-reads — positive zero error = +(n × LC), subtracted from every reading.
                • If the vernier zero sits to the LEFT, the zero error is negative: ZE = −[(N − n) × LC], where N = total vernier divisions and n = the division coinciding at closure — its magnitude is then ADDED to readings. One rule covers both signs: Corrected value = Observed reading − Zero error (with sign).
                • Variant pattern: if (N + 1) vernier divisions coincide with N main divisions, LC = 1 MSD ÷ (N + 1) — read the coincidence statement carefully before reaching for the standard formula.

                ▸ Screw Gauge — Least Count, Reading and Zero Error [Fig. 1.2, Fig. 1.4]
                • A screw gauge (micrometer) measures the diameter of a wire or thickness of a sheet to about 10⁻⁵ m. One full rotation of the cap advances the spindle by a fixed distance called the pitch.
                ✔ KEY FORMULA — LC = Pitch ÷ Number of circular scale divisions. Pitch 0.5 mm with 50 divisions gives LC = 0.01 mm; pitch 1 mm with 100 divisions also gives 0.01 mm.
                ✔ KEY FORMULA — Reading = Main scale reading + (Coinciding circular division × LC) − Zero error.
                • Worked example: main scale reading = 3 mm, the 32nd circular division coincides, LC = 0.01 mm. Reading = 3 + 32 × 0.01 = 3.32 mm.
                • Zero error signs (screw gauge): circular-scale zero BELOW the reference line at contact → positive ZE = +(n × LC). Circular zero ABOVE the line → negative ZE = −[(N − n) × LC]; example: N = 100 divisions and the 95th coincides at contact → ZE = −5 × LC = −0.05 mm, so ADD 0.05 mm to every reading.
                • Verified exam pattern (NEET style): LC = 0.001 cm, main scale reading 5 mm, 25th division coincides, ZE = −0.004 cm. Observed = 0.500 + 0.025 = 0.525 cm; corrected = 0.525 − (−0.004) = 0.529 cm.
                • Backlash error: worn screw play makes the spindle lag when rotation reverses — always approach the final reading turning in ONE direction only, and use the ratchet for the last contact. A spherometer uses the same screw principle (LC = pitch ÷ circular divisions) to measure curvature: R = l²/(6h) + h/2.
                ⚠ EXAM TRAP — Always use the ratchet for final tightening. Squeezing the cap by hand crushes the wire and falsifies the diameter.

                ▸ Measuring the Very Large and the Very Small — Parallax and Ranges (NCERT Supplement)
                • This section restores material deleted from the current NCERT textbook in the 2023 rationalisation. It survives in NCERT's own exercises (1.6, 1.8) and in JEE/NEET papers every year, so it remains essential — treat it as part of the chapter.
                • Parallax is the apparent shift of a nearby object against a distant background when the viewpoint changes. The distance between the two viewpoints is the basis b, and the shift angle is the parallax angle θ.
                ✔ KEY FORMULA — Distance by parallax: D = b/θ (θ in radians, valid when b ≪ D). Angular size: if an object of size d subtends angle α at distance D, then d = αD.
                • Worked example (NCERT): the Moon, observed from two ends of Earth's diameter (basis b = 1.276 × 10⁷ m) with parallax θ = 1°54′, lies at D = 3.84 × 10⁸ m. The same method with the Sun's angular diameter 1920″ gives the Sun's diameter ≈ 1.39 × 10⁹ m.
                • The length ladder: metre scale 10⁻³–10² m • Vernier 10⁻⁴ m • screw gauge and spherometer 10⁻⁵ m • optical microscope down to about the wavelength of light • electron and tunnelling microscopes below 1 Å. The sizes of things run from ~10⁻¹⁴ m (a nucleus) to ~10²⁶ m (the observable universe).
                • Estimating the very small (NCERT classic): an oleic-acid monolayer spread on water has a thickness of molecular size, about 10⁻⁹ m — a molecule measured with a tray of water and a ruler.
                • Mass and time ranges: 1 unified atomic mass unit, 1 u = (1/12) the mass of one carbon-12 atom = 1.66 × 10⁻²⁷ kg; atomic masses come from the mass spectrograph and planetary masses from gravitational methods. For time, the caesium atomic clock — the same Cs-133 transition that defines the second — is the standard, accurate to about 1 part in 10¹³.

                Errors in Measurement — Types and Measures
                • The difference between a measured value and the true value is its error. Because repeated readings rarely agree exactly, results are reported as a mean with an uncertainty: a = a_mean ± Δa.
                • Systematic errors push every reading the same way by roughly the same amount — zero error, a miscalibrated scale, heat lost to the surroundings in every trial. Cure: better instruments and technique, never mere repetition.
                • Random errors scatter readings on both sides of the true value with no pattern — small fluctuations in conditions and judgement. Cure: many readings and averaging.
                • Gross errors come from carelessness — reading the wrong scale, noting a value wrongly. The cure is attention; such readings are simply rejected.
                • Least count error belongs to the instrument itself: no reading can be trusted beyond one least count.
                • Absolute error of a reading = |measured value − true value|; the reported Δa is the mean of the absolute errors. Relative (fractional) error = Δa / a_mean. Percentage error = (Δa / a_mean) × 100.

                ▸ Accuracy versus Precision
                • Accuracy = how close the mean is to the TRUE value; it is limited by systematic errors. Precision = how closely repeated readings agree WITH EACH OTHER; it is limited by random errors and least count.
                • A faulty instrument can give tightly clustered readings that are all wrong together — precise but inaccurate. A coarse instrument can scatter readings around the true value — accurate on average but imprecise.
                ★ HIGHLIGHT — Every reported result must end at its first uncertain digit. That single sentence is the bridge between errors and significant figures.

                Propagation of Errors — the Rules
                • Working principle: in the maximum-error estimate used at this level, errors always ADD — they are never assumed to cancel.
                ✔ KEY FORMULA — Sum and difference (Z = A ± B): ΔZ = ΔA + ΔB. Even for a difference, absolute errors add — never subtract.
                ✔ KEY FORMULA — Product and quotient (Z = A × B or Z = A ÷ B): ΔZ/Z = ΔA/A + ΔB/B. Relative errors add.
                ✔ KEY FORMULA — Power rule (Z = Aⁿ): ΔZ/Z = n × (ΔA/A). A squared quantity doubles its percentage error; a cubed quantity triples it — powers amplify errors.
                ✔ KEY FORMULA — General rule (Z = Aᵃ Bᵇ / Cᶜ): ΔZ/Z = |a|(ΔA/A) + |b|(ΔB/B) + |c|(ΔC/C), × 100 for percentage error. Denominator errors add too.

                ▸ Propagation — Worked Examples and Laboratory Strategy
                • Example 0 (NCERT): temperatures (50 ± 0.5)°C and (20 ± 0.5)°C differ by 30 ± 1 °C — even a DIFFERENCE of two readings carries the SUM of the two errors.
                • Example 1 (Density of a cube): mass has 2% error, each side 1.5%. ρ = m/L³, so error in ρ = 2 + 3 × 1.5 = 6.5%.
                • Example 2 (Pendulum, g = 4π²L/T²): L measured to 0.1% and T to 0.5%. Error in g = 0.1 + 2 × 0.5 = 1.1%. NCERT's canonical version: L at 2% and T at 1% gives Δg/g = 2 + 2 × 1 = 4%. To improve g, improve T: time 50 oscillations and divide — the timing error divides by 50 as well.
                • Example 3 (How to report a result): a sheet 16.2 ± 0.1 cm by 10.1 ± 0.1 cm has area 163.62 cm² with 1.6% uncertainty, quoted as 164 ± 3 cm² — round the ERROR to one significant figure first, then match the value to it.
                • Maximum permissible vs most probable error: the rules above give the worst-case (maximum permissible) error asked in exams. Research laboratories combine independent random errors in quadrature: ΔZ/Z = √[(p·ΔA/A)² + (q·ΔB/B)² + (r·ΔC/C)²] — always smaller than the maximum.
                ★ HIGHLIGHT — Laboratory strategy: find the quantity with the largest power × largest relative error. Improving that ONE measurement improves the whole result the most.

                Dimensions of Physical Quantities
                • The dimensions of a quantity state which base quantities compose it, and to what powers: [M] mass, [L] length, [T] time, [A] current, [K] temperature, [mol] amount, [cd] luminous intensity. Velocity is [L T⁻¹] because it is length divided by time.
                • The dimensional formula is this bracketed expression. A dimensional equation sets the quantity equal to its formula — [Force] = [M L T⁻²], read off from F = ma: mass × (length ÷ time²).
                ✔ KEY FORMULA — To find any dimensional formula: write the defining equation, replace each quantity by its dimensions, and simplify. Every entry in the master lists below is derived exactly this way.
                • Dimensions depend on the chosen fundamental set — a favourite past-paper pattern: if force (F), velocity (V) and time (T) are taken as fundamental, mass becomes [F V⁻¹ T]; if energy, velocity and time are fundamental, surface tension becomes [E V⁻² T⁻²].

                ▸ Master List — Mechanics and Fluids
                • Velocity [L T⁻¹] • Acceleration [L T⁻²] • Momentum [M L T⁻¹] • Impulse [M L T⁻¹] • Force [M L T⁻²] • Work, energy, torque [M L² T⁻²] • Power [M L² T⁻³]
                • Pressure, stress, Young's modulus, energy density [M L⁻¹ T⁻²] • Density [M L⁻³] • Frequency [T⁻¹] • Angular velocity [T⁻¹] • Angular acceleration [T⁻²] • Angular momentum [M L² T⁻¹] • Moment of inertia [M L²]
                • Surface tension, surface energy per unit area [M T⁻²] • Coefficient of viscosity η [M L⁻¹ T⁻¹] • Gravitational constant G [M⁻¹ L³ T⁻²] (from F = G m₁m₂/r²)

                ▸ Master List — Heat, Electricity, Magnetism and Modern Physics
                • Heat: specific heat capacity [L² T⁻² K⁻¹] • Latent heat, gravitational potential [L² T⁻²] • Gas constant R [M L² T⁻² K⁻¹ mol⁻¹] • Boltzmann constant k_B [M L² T⁻² K⁻¹] • Molar heat capacity C_v [M L² T⁻² K⁻¹ mol⁻¹] • Coefficient of thermal expansion [K⁻¹] • Stefan constant σ [M T⁻³ K⁻⁴] (σ = 5.67 × 10⁻⁸ W m⁻² K⁻⁴, now an exact derived value since k, h, c are exact) • Thermal conductivity [M L T⁻³ K⁻¹] • Entropy, heat capacity [M L² T⁻² K⁻¹]
                • Electricity and magnetism: charge [A T] • Electric field [M L T⁻³ A⁻¹] • Potential, EMF [M L² T⁻³ A⁻¹] • Resistance [M L² T⁻³ A⁻²] • Capacitance [M⁻¹ L⁻² T⁴ A²] • Inductance [M L² T⁻² A⁻²] • Magnetic field B [M T⁻² A⁻¹] • Magnetic flux Φ_B [M L² T⁻² A⁻¹] • Permittivity ε₀ [M⁻¹ L⁻³ T⁴ A²] • Permeability μ₀ [M L T⁻² A⁻²] • Planck constant h [M L² T⁻¹]
                • Modern physics: Rydberg constant R∞ [L⁻¹] = 1.097373 × 10⁷ m⁻¹ (for an infinitely heavy nucleus; for hydrogen R_H = 1.09678 × 10⁷ m⁻¹ — do not mix the two) • Work function Φ [M L² T⁻²] (an energy)
                • Research landmark (asked in IAT 2021): the von Klitzing constant R_K = h/e² ≈ 25,812.8 Ω has the dimensions of resistance. Offered e²/h, e/h, h/e and h/e², only h/e² is a resistance — recognising R_K makes it a one-line question.

                ▸ Identical Dimensions, Trap Pairs and Dimensionless Quantities
                • Memorise the pairs with identical dimensions: work and torque • momentum and impulse • pressure, stress and Young's modulus • frequency, angular velocity and velocity gradient • Planck constant and angular momentum • surface tension and spring constant.
                • Quantities with NO dimensions: plane angle, solid angle, strain, refractive index, relative density, coefficient of restitution, coefficient of friction, Poisson's ratio, efficiency — and the Reynolds number Re = ρvL/η (check: [M L⁻³][L T⁻¹][L] ÷ [M L⁻¹ T⁻¹] = 1).
                • Time-dimension group: L/R, RC and √(LC) all have dimensions [T] — a favourite matching-list question in entrance papers.
                ⚠ EXAM TRAP — Identical dimensions do NOT mean identical nature: torque is a vector, work a scalar; the method cannot tell them apart.
                ⚠ EXAM TRAP — Tension [M L T⁻²] and surface tension [M T⁻²] do NOT share dimensions, though their names suggest it — the NCERT Exemplar's favourite impostor pair. Likewise strain (dimensionless) is not stress.

                Principle of Homogeneity — Checking Equations
                • Principle of homogeneity: a physical equation can be true only if every term on both sides has identical dimensions. Only quantities of the same dimensions may be equated, added or subtracted — adding a length to a time is as meaningless in physics as in arithmetic.
                • The arguments of sin, cos, e^x and ln are always dimensionless, and so are the functions themselves. In x = A sin(ωt), [ωt] must be dimensionless, forcing [ω] = [T⁻¹].
                • Check 1 (Kinematics): s = ut + ½at². [ut] = [L T⁻¹ × T] = [L]. [at²] = [L T⁻² × T²] = [L]. Both match [s] = [L] — the equation passes.
                • Check 2 (Photon energy): E = hν. [hν] = [M L² T⁻¹ × T⁻¹] = [M L² T⁻²] = [E] — and it reveals that h has the dimensions of angular momentum.
                • Check 3 (van der Waals equation): in (P + a/V²)(V − b) = RT, the term a/V² must be a pressure, so [a] = [M L⁵ T⁻²]; and b must be a volume, [b] = [L³]. For multi-term equations, audit every added term separately — that IS the method.
                • Check 4 (Which formula is impossible?): y = (a/T) sin(t/a) cannot be a displacement, because [t/a] = [T L⁻¹] is not dimensionless. In the healthy form y = A sin(ωt − kx), the same test gives [ω] = [T⁻¹] and [k] = [L⁻¹].
                ⚠ EXAM TRAP — Homogeneity is necessary, not sufficient: a dimensionally wrong equation is certainly wrong, but s = ut + 2at² passes every dimensional test and is still false — the true constant is ½, and constants are invisible to dimensions.

                Dimensional Analysis — Deriving Relations
                • The method: guess that the quantity depends on the relevant parameters raised to unknown powers; write the dimensional equation; equate the powers of M, L and T; solve the three equations.
                • Derivation 1 — Pendulum: T = k lᵃ gᵇ mᶜ. Powers of M: c = 0 (period cannot depend on mass). Powers of T: −2b = 1, so b = −½. Powers of L: a + b = 0, so a = ½. Result: T = k√(l/g); experiment fixes k = 2π.
                • Derivation 2 — Stokes' viscous force: F = k ηᵃ rᵇ vᶜ. Powers of M: a = 1. Powers of T: −a − c = −2, so c = 1. Powers of L: −a + b + c = 1, so b = 1. Result: F = kηrv; experiment gives k = 6π — Stokes' law F = 6πηrv.
                • Derivation 3 — Centripetal force: F = k mᵃ vᵇ rᶜ gives a = 1, b = 2, c = −1. Result: F = k mv²/r, with k = 1 from theory.
                • Derivation 4 — Speed of sound in a fluid: v = k Bᵃ ρᵇ with [B] = [M L⁻¹ T⁻²], [ρ] = [M L⁻³] gives a = ½, b = −½. Result: v = k√(B/ρ) — the Newton–Laplace form v = √(γP/ρ), with dimensionless γ hidden in k.
                • Derivation 5 — Planck units from c, G and h (the IAT speciality — IAT 2019 asked for energy built from h, c, G): solving the same three equations for each target gives length √(hG/c³), time √(hG/c⁵), mass √(hc/G) and energy √(hc⁵/G).
                ⚠ EXAM TRAP — True Planck units use ħ = h/2π, school questions use h. The dimensions are identical, so dimensional answers agree — but numerical Planck values (Planck length ≈ 1.616 × 10⁻³⁵ m) belong to ħ. Never mix h and ħ inside a numerical.

                ▸ Dimensional Analysis — Converting Units Between Systems
                ✔ KEY FORMULA — If a quantity has dimensional formula [Mᵃ Lᵇ Tᶜ], then n₂ = n₁ × (M₁/M₂)ᵃ × (L₁/L₂)ᵇ × (T₁/T₂)ᶜ converts its value from system 1 to system 2.
                • Conversion 1: 1 newton into dynes. a = 1, b = 1, c = −2: n₂ = (kg/g) × (m/cm) = 1000 × 100 = 10⁵. So 1 N = 10⁵ dyne.
                • Conversion 2: 1 joule into ergs. a = 1, b = 2: n₂ = (kg/g) × (m/cm)² = 1000 × 10⁴ = 10⁷. So 1 J = 10⁷ erg.
                • Conversion 3: density of mercury 13.6 g/cm³ into SI. n₂ = 13.6 × (g/kg) × (cm/m)⁻³ = 13.6 × 10⁻³ × 10⁶ = 13,600 kg/m³. Equivalently, 1 g/cm³ = 1000 kg/m³.

                ▸ Limitations of Dimensional Analysis
                • Limit 1: dimensionless constants (2π, ½, 6π) are invisible — the method gives the form of a law, never its exact constant.
                • Limit 2: it fails for relations built from sums of terms, or from exponential, logarithmic and trigonometric functions — only that [λ] = [T⁻¹] in N = N₀e^(−λt) can be found, not the law itself.
                • Limit 3: it cannot distinguish quantities that share dimensions (work vs torque). Limit 4: with only three equations (M, L, T) it fails when a quantity depends on more than three parameters. Limit 5: it says nothing about scalar versus vector nature.

                Apparatus in Focus — Thomson's e/m Experiment [Fig. 1.3]
                • Electrons are negatively charged, so an electron's charge is written −e and its mass mₑ. Neither could be measured separately for decades — but their ratio e/m could, and J. J. Thomson measured it in 1897 with the cathode ray tube of the apparatus figure.
                • The apparatus consists of a cathode ray tube with cathode and anode connected to a high voltage source, a magnet placed around the tube, and a fluorescent screen on which the electron beam falls.
                • Electric field alone: electrons deviate to point A, pulled towards the positive plate. Magnetic field alone: electrons hit point C, bent the opposite way by the Lorentz force. Both fields balanced: electrons travel straight to point B.
                ✔ KEY FORMULA — Step 1 (acceleration): eV = ½mₑv². Step 2 (balance — the velocity selector): eE = evB gives v = E/B. Step 3 (combine): e/mₑ = E²/(2VB²).
                • Every quantity on the right is directly measurable, and the result is e/mₑ ≈ 1.76 × 10¹¹ C/kg — about 1836 times the same ratio for a hydrogen ion, the first evidence that the electron is far lighter than any atom.

                Solved Numericals
                • Numerical 1 (NCERT Example 1.1): a cube of side 7.203 m (4 significant figures). Surface area = 6 × (7.203)² = 311.3 m²; volume = (7.203)³ = 373.7 m³ — both reported to 4 significant figures, matching the input.
                • Numerical 2 (NCERT Example 1.2): mass 5.74 g (3 SF) in volume 1.2 cm³ (2 SF). Density = 5.74/1.2 = 4.782…, reported as 4.8 g/cm³ — only 2 significant figures, set by the volume.
                • Numerical 3 (Error): R = V/I with V = 100 ± 5 V and I = 10 ± 0.2 A. R = 10 Ω; percentage error = 5% + 2% = 7%, so R = 10.0 ± 0.7 Ω.
                • Numerical 4 (Dimensions): kinetic energy ½mv²: [M][L T⁻¹]² = [M L² T⁻²]; work = force × displacement: [M L T⁻²][L] = [M L² T⁻²]. Identical — as the work-energy theorem demands.
                • Numerical 5 (Checking): v² = u² + 2as. [v²] = [u²] = [L² T⁻²]; [as] = [L T⁻² × L] = [L² T⁻²]. All terms match — dimensionally sound.

                ★ Rapid Revision — the Whole Chapter on One Screen
                • Q = n × u, and n₁u₁ = n₂u₂ • 7 SI base units defined by 7 constants of nature • Vernier LC = 1 MSD − 1 VSD • Screw gauge LC = Pitch ÷ circular divisions • Corrected reading = Observed − Zero error (with sign)
                • Errors always add • ΔZ/Z = Σ |power| × (Δquantity ÷ quantity) • Significant figures: decimal places for + and −, significant figures for × and ÷ • Even-odd rule for rounding a final 5
                • [F] = [MLT⁻²] • [E] = [ML²T⁻²] • [P] = [ML²T⁻³] • [G] = [M⁻¹L³T⁻²] • [h] = [ML²T⁻¹] • Homogeneity: dimensions must match term by term • Arguments of sin, e^x, ln are dimensionless
                • Dimensional analysis derives forms and converts units, but never finds 2π • Stokes F = 6πηrv • Pendulum T = 2π√(l/g) • Sound v = √(γP/ρ) • e/mₑ = E²/(2VB²) ≈ 1.76 × 10¹¹ C/kg
                • Parallax: D = b/θ and d = αD • Zero error: always subtract ZE with its sign • Since 2019 μ₀ is measured, not exact • R_K = h/e² is a resistance • Planck energy = √(hc⁵/G)
                """.trimIndent(),
            videoTitle = "SI Constants, Precision Instruments & Dimensional Analysis Masterclass",
            videoDurationLabel = "26:40",
            videoInstructor = "Prof. R. Subramanian (IISER Mohali)",
            videoKeyTakeaways = "Zero-error corrected Vernier & screw-gauge readings • Maximum vs most probable error • Planck-scale dimensions from c, G, h • Homogeneity tests for exponential and trigonometric arguments",
            isVideoCompleted = true,
            lastAccessedTimestamp = System.currentTimeMillis() - 9_200_000L
        ),
        ChapterEntity(
            id = "phys_ch_2",
            subject = "Physics",
            examTag = "IISER IAT",
            chapterNumber = 2,
            title = "Motion in a Straight Line",
            subtitle = "1D Kinematics, Calculus of Motion & Kinematic Graphs",
            totalLessons = 5,
            completedLessons = 4,
            studyNotesCount = 7,
            practiceQuestionCount = 20,
            durationMinutes = 40,
            formulaHighlight = "a = v (dv / dx)  •  s_nth = u + a(2n − 1) / 2",
            keyConceptsSummary = "Instantaneous velocity and acceleration, non-uniform acceleration via integration, v-t and a-x graphs, stopping distance, and 1D relative velocity.",
            detailedStudyNotes = """
                1. Position, Path Length and Displacement
                • Motion is described relative to a frame of reference — an origin, axes and a clock. In one dimension, position is a single coordinate x.
                • Path length (distance) is the total length of the actual path: a scalar, always positive, and it never decreases.
                • Displacement Δx = x₂ − x₁ is a vector: it depends only on the start and end points, not on the path taken.
                • |Displacement| ≤ path length always; they are equal only when motion is in one direction without turning back.
                • Example: one full round of a 400 m track — path length = 400 m, displacement = 0.

                2. Average and Instantaneous Velocity and Speed
                • Average velocity v̄ = Δx/Δt = (x₂ − x₁)/(t₂ − t₁). It gives the net rate of change of position, not the details in between.
                • Average speed = total path length ÷ total time. In general, average speed ≥ |average velocity|.
                • Instantaneous velocity v = dx/dt — the velocity at one instant, found as the slope of the tangent to the x–t graph at that point.
                • Instantaneous speed = |v|. Speed is a scalar — a speedometer shows instantaneous speed, never velocity.
                • A body returning to its starting point has zero average velocity for the trip, even though its average speed is not zero.

                3. Acceleration
                • Average acceleration ā = Δv/Δt = (v₂ − v₁)/(t₂ − t₁). Instantaneous acceleration a = dv/dt — the slope of the v–t graph. Unit m/s², dimensions [L T⁻²].
                • Useful forms: a = dv/dt = d²x/dt² = v(dv/dx). The last form is used when acceleration depends on position.
                • Acceleration is a vector. In 1D, a body speeds up when v and a have the same sign and slows down when they have opposite signs — negative acceleration alone does not mean slowing down.
                • Velocity can be zero at an instant while acceleration is not: at the top of a vertical throw, v = 0 but a = −g throughout the flight.
                • If velocity is constant, acceleration is zero. If acceleration is constant, velocity changes equally in equal times.

                4. Graphs of Motion [Fig. 2.1]
                • x–t graph: slope at any point = instantaneous velocity. A straight line means constant velocity; a curve getting steeper means speeding up.
                • v–t graph: slope = acceleration; area under the curve = displacement (area below the time axis counts negative).
                • a–t graph: area under the curve = change in velocity Δv.
                • For uniformly accelerated motion: the x–t graph is a parabola, the v–t graph is a straight line, and the a–t graph is a horizontal line.

                5. Kinematic Equations for Uniformly Accelerated Motion
                • v = u + at
                • s = ut + ½at²
                • v² = u² + 2as
                • Average velocity form (constant a only): s = ((u + v)/2) × t
                • Displacement in the nth second: sₙ = u + (a/2)(2n − 1)
                • Quick check: with u = 0 and a = 2 m/s², s₅ = (2/2)(2×5 − 1) = 9 m — matching s(5 s) − s(4 s) = 25 − 16 = 9 m.
                • These equations apply ONLY when acceleration is constant. Fix one direction as positive at the start and use the same sign convention for u, v, a and s throughout.
                • If acceleration changes with time, do not use these equations — use v = ∫a dt and x = ∫v dt instead.

                6. Motion Under Gravity (Free Fall)
                • A freely falling body has constant acceleration g ≈ 9.8 m/s² directed downwards (use 10 m/s² only if the question says so). Apply the same kinematic equations with a = −g (upward positive).
                • Dropped from rest from height h: time to fall t = √(2h/g); speed at the ground v = √(2gh).
                • Thrown vertically up with speed u: maximum height H = u²/(2g); time to reach the top t = u/g; total time of flight back to the launch point = 2u/g.
                • The motion is symmetric: speed at any height is the same while going up and coming down.
                • Example: a stone dropped from a 45 m tower (g = 10 m/s²) takes t = √(2×45/10) = 3 s and hits the ground at v = √(2×10×45) = 30 m/s.

                7. Relative Velocity in One Dimension and Worked Examples
                • Velocity of A relative to B: v_AB = v_A − v_B, with all velocities measured in the ground frame using the same sign convention. Bodies approaching each other have relative speed equal to the sum of their speeds.
                • Braking example: a car at 20 m/s brakes with retardation 5 m/s². Stopping distance: 0 = 20² + 2(−5)s, so s = 40 m; stopping time: 0 = 20 − 5t, so t = 4 s.
                • Calculus example: for x = t² − 4t + 3, v = dx/dt = 2t − 4, so the particle is instantaneously at rest at t = 2 s; its displacement in the first 2 s is x(2) − x(0) = −4 m.
                """.trimIndent(),
            videoTitle = "Variable Acceleration & v(dv/dx) Problems for IISER IAT",
            videoDurationLabel = "29:15",
            videoInstructor = "Prof. R. Subramanian (IISER Mohali)",
            videoKeyTakeaways = "Converting x-t, v-t, and v-x graphs • Retarding motion • Free fall symmetries",
            isVideoCompleted = true
        ),
        ChapterEntity(
            id = "phys_ch_3",
            subject = "Physics",
            examTag = "IISER IAT",
            chapterNumber = 3,
            title = "Motion in a Plane",
            subtitle = "Projectile Motion, Relative Velocity in 2D & Uniform Circular Kinematics",
            totalLessons = 5,
            completedLessons = 3,
            studyNotesCount = 8,
            practiceQuestionCount = 22,
            durationMinutes = 45,
            formulaHighlight = "y = x tan θ (1 − x/R)  •  a_c = v²/r = ω²r",
            keyConceptsSummary = "Oblique and inclined-plane projectiles, equation of trajectory, river-swimmer and rain-umbrella problems, centripetal and tangential acceleration.",
            detailedStudyNotes = """
                1. Oblique Projectile Motion
                • Time of flight T = 2u sin θ / g; Maximum height H = u² sin²θ / (2g); Range R = u² sin 2θ / g.
                • Trajectory equation: y = x tan θ − (g x²) / (2 u² cos²θ) = x tan θ (1 − x/R).

                2. 2D Relative Motion & Circular Kinematics
                • Minimum distance of approach between two moving bodies using relative velocity frame.
                • Total acceleration in non-uniform circular motion: a = √(a_c² + a_t²) where a_c = v²/r and a_t = dv/dt.
            """.trimIndent(),
            videoTitle = "2D Projectile Trajectories & Closest Approach Vectors",
            videoDurationLabel = "34:20",
            videoInstructor = "Prof. R. Subramanian (IISER Mohali)",
            videoKeyTakeaways = "Velocity perpendicularity time t = u/(g sin θ) • River crossing drift minimization • Radius of curvature",
            isVideoCompleted = false
        ),
        ChapterEntity(
            id = "phys_ch_4",
            subject = "Physics",
            examTag = "IISER IAT",
            chapterNumber = 4,
            title = "Laws of Motion",
            subtitle = "Newton's Laws, Pulley-Wedge Constraints, Friction & Pseudo Forces",
            totalLessons = 6,
            completedLessons = 4,
            studyNotesCount = 9,
            practiceQuestionCount = 24,
            durationMinutes = 50,
            formulaHighlight = "F_ext = dp / dt  •  v_max = √[Rg(sin θ + μ cos θ) / (cos θ − μ sin θ)]",
            keyConceptsSummary = "Impulse-momentum theorem, string and wedge constraint relations, static vs kinetic friction, non-inertial frames, and banking of roads.",
            detailedStudyNotes = """
                1. Constraint Relations & Free Body Diagrams
                • Virtual Work Method for ideal strings: Σ T · x = 0 ⇒ Σ T · v = 0 ⇒ Σ T · a = 0.
                • Normal contact constraint: Components of velocity and acceleration perpendicular to the contact surface must be equal.

                2. Friction & Circular Dynamics
                • Static friction is self-adjusting: 0 ≤ f_s ≤ μ_s N; Kinetic friction f_k = μ_k N.
                • Angle of repose tan α = μ_s.
            """.trimIndent(),
            videoTitle = "Wedge-Pulley Constraints, Two-Block Friction & Banking Dynamics",
            videoDurationLabel = "38:10",
            videoInstructor = "Prof. R. Subramanian (IISER Mohali)",
            videoKeyTakeaways = "Virtual work string constraints • Two-block slipping threshold • Conical pendulum dynamics",
            isVideoCompleted = true
        ),
        ChapterEntity(
            id = "phys_ch_5",
            subject = "Physics",
            examTag = "IISER IAT",
            chapterNumber = 5,
            title = "Work, Energy and Power",
            subtitle = "Work-Energy Theorem, Conservative Forces, Potential Wells & Collisions",
            totalLessons = 6,
            completedLessons = 3,
            studyNotesCount = 8,
            practiceQuestionCount = 24,
            durationMinutes = 50,
            formulaHighlight = "W_all = ΔK  •  F = −∇U  •  e = (v₂ − v₁) / (u₁ − u₂)",
            keyConceptsSummary = "Work done by variable forces, potential energy curves and equilibrium stability, vertical circular motion, and 1D/oblique collisions.",
            detailedStudyNotes = """
                1. Work-Energy Theorem & Conservative Fields
                • W_conservative + W_non-conservative + W_external = K_f − K_i.
                • For a conservative force: F = −dU/dx; Stable equilibrium occurs where dU/dx = 0 and d²U/dx² > 0.

                2. Vertical Circular Motion & Collisions
                • Minimum speed at bottom to complete a vertical loop of string of length L: u_min = √(5gL).
                • Coefficient of restitution e = v_separation / u_approach; fractional loss of KE in head-on collision is ½ μ (1 − e²)(u₁ − u₂)² / K_i.
            """.trimIndent(),
            videoTitle = "Potential Energy Landscapes, Vertical Loops & Oblique Collisions",
            videoDurationLabel = "36:45",
            videoInstructor = "Prof. R. Subramanian (IISER Mohali)",
            videoKeyTakeaways = "Finding oscillation frequency near potential minima • Center-of-mass frame collisions • Power P = F · v",
            isVideoCompleted = false
        ),
        ChapterEntity(
            id = "phys_ch_6",
            subject = "Physics",
            examTag = "IISER IAT",
            chapterNumber = 6,
            title = "System of Particles and Rotational Motion",
            subtitle = "Center of Mass, Moment of Inertia, Torque, Angular Momentum & Rolling",
            totalLessons = 7,
            completedLessons = 4,
            studyNotesCount = 11,
            practiceQuestionCount = 28,
            durationMinutes = 60,
            formulaHighlight = "L = Iω + r_cm × Mv_cm  •  a = g sin θ / (1 + I / MR²)",
            keyConceptsSummary = "Center of mass of continuous bodies, parallel and perpendicular axis theorems, conservation of angular momentum, pure rolling on inclined planes, and instantaneous axis of rotation.",
            detailedStudyNotes = """
                1. Moment of Inertia Theorems
                • Parallel Axis Theorem: I = I_cm + M d².
                • Perpendicular Axis Theorem (for planar laminae): I_z = I_x + I_y.
                • Standard values: Ring (MR²), Disc (½MR²), Solid Sphere (⅖MR²), Hollow Sphere (⅔MR²), Rod about center (ML²/12).

                2. Angular Momentum & Pure Rolling
                • If Σ τ_ext = 0 about a stationary point (or COM), total angular momentum L = I_cm ω + r_cm × M v_cm is conserved.
                • Pure rolling on stationary surface: v_cm = Rω, K_total = ½ M v_cm² (1 + k²/R²).
            """.trimIndent(),
            videoTitle = "Angular Momentum Conservation & Rolling Dynamics in IAT",
            videoDurationLabel = "43:50",
            videoInstructor = "Prof. R. Subramanian (IISER Mohali)",
            videoKeyTakeaways = "Choosing the right pivot to eliminate impulsive friction • IAOR energy shortcuts • Cavity moment of inertia",
            isVideoCompleted = true,
            lastAccessedTimestamp = System.currentTimeMillis() - 6_400_000L
        ),
        ChapterEntity(
            id = "phys_ch_7",
            subject = "Physics",
            examTag = "IISER IAT",
            chapterNumber = 7,
            title = "Gravitation",
            subtitle = "Gravitational Field & Potential, Kepler's Laws & Orbital Mechanics",
            totalLessons = 5,
            completedLessons = 3,
            studyNotesCount = 7,
            practiceQuestionCount = 20,
            durationMinutes = 45,
            formulaHighlight = "E = −GMm / (2a)  •  T² = (4π² / GM) a³  •  v_e = √(2GM / R)",
            keyConceptsSummary = "Shell theorem, gravitational potential inside a solid sphere, variation of g with altitude/depth, satellite energetics, and Kepler's laws of planetary motion.",
            detailedStudyNotes = """
                1. Field & Potential of Spherical Distributions
                • Inside a uniform solid sphere (r < R): E = GMr / R³, V = −GM(3R² − r²) / (2R³).
                • Inside a spherical shell (r < R): E = 0, V = −GM / R (constant).

                2. Orbital Energetics & Kepler's Laws
                • Circular orbit speed v_o = √(GM/r); Escape speed v_e = √(2GM/R) = √2 v_o.
                • Kepler's 2nd Law (dA/dt = L / 2m = constant) is a direct consequence of angular momentum conservation.
            """.trimIndent(),
            videoTitle = "Spherical Cavities, Elliptical Orbits & Kepler's Laws",
            videoDurationLabel = "33:15",
            videoInstructor = "Prof. R. Subramanian (IISER Mohali)",
            videoKeyTakeaways = "Uniform field inside off-center spherical cavity • Perigee-apogee conservation equations • Binary star orbits",
            isVideoCompleted = false
        ),
        ChapterEntity(
            id = "phys_ch_8",
            subject = "Physics",
            examTag = "IISER IAT",
            chapterNumber = 8,
            title = "Mechanical Properties of Solids",
            subtitle = "Stress-Strain Curves, Elastic Moduli, Poisson's Ratio & Elastic Energy",
            totalLessons = 4,
            completedLessons = 2,
            studyNotesCount = 5,
            practiceQuestionCount = 16,
            durationMinutes = 35,
            formulaHighlight = "σ = Y ε  •  u = ½ × Stress × Strain = ½ Y ε²",
            keyConceptsSummary = "Hooke's law, Young's, bulk, and shear moduli, elongation of heavy rods under self-weight, thermal stress, and elastic potential energy density.",
            detailedStudyNotes = """
                1. Elastic Moduli & Hooke's Law
                • Young's Modulus: Y = (F/A) / (ΔL/L); Effective spring constant of a rod: k = YA / L.
                • Elongation under self-weight: ΔL = MgL / (2AY).
                • Thermal Stress in a clamped rod: σ_thermal = Y α ΔT.

                2. Elastic Potential Energy
                • Energy stored per unit volume: u = ½ × Stress × Strain = σ² / (2Y).
            """.trimIndent(),
            videoTitle = "Elasticity, Thermal Stress & Composite Rod Systems",
            videoDurationLabel = "25:30",
            videoInstructor = "Prof. R. Subramanian (IISER Mohali)",
            videoKeyTakeaways = "Spring analogy for series/parallel rods • Self-weight integration • Bulk modulus in acoustics",
            isVideoCompleted = false
        ),
        ChapterEntity(
            id = "phys_ch_9",
            subject = "Physics",
            examTag = "IISER IAT",
            chapterNumber = 9,
            title = "Mechanical Properties of Fluids",
            subtitle = "Hydrostatics, Archimedes' Principle, Bernoulli's Theorem, Viscosity & Surface Tension",
            totalLessons = 6,
            completedLessons = 3,
            studyNotesCount = 9,
            practiceQuestionCount = 24,
            durationMinutes = 50,
            formulaHighlight = "P + ½ρv² + ρgh = const  •  ΔP = 2T/R (drop)  •  h = 2T cos θ / (ρgr)",
            keyConceptsSummary = "Pressure in accelerated fluids, continuity and Bernoulli's equations, Torricelli's efflux law, Stokes' viscous drag, excess pressure in bubbles, and capillary rise.",
            detailedStudyNotes = """
                1. Hydrodynamics: Continuity & Bernoulli's Equation
                • Continuity Equation for incompressible fluid: A₁v₁ = A₂v₂.
                • Bernoulli's Theorem: P + ½ρv² + ρgh = constant along a streamline.
                • Velocity of efflux from an orifice at depth h: v = √(2gh).

                2. Viscosity & Surface Tension
                • Stokes' Law: F_v = 6π η r v; Terminal velocity v_t = 2r²(ρ − σ)g / (9η).
                • Excess Pressure: Liquid drop ΔP = 2T/R; Soap bubble (two surfaces) ΔP = 4T/R.
                • Jurin's Capillary Law: h = 2T cos θ / (ρgr).
            """.trimIndent(),
            videoTitle = "Bernoulli's Theorem, Coalescing Bubbles & Capillary Physics",
            videoDurationLabel = "37:20",
            videoInstructor = "Prof. R. Subramanian (IISER Mohali)",
            videoKeyTakeaways = "Free surface slope tan θ = a/g • Radius of interface of two soap bubbles • Viscous energy dissipation",
            isVideoCompleted = false
        ),
        ChapterEntity(
            id = "phys_ch_10",
            subject = "Physics",
            examTag = "IISER IAT",
            chapterNumber = 10,
            title = "Thermal Properties of Matter",
            subtitle = "Thermal Expansion, Calorimetry, Conduction, Wien's Law & Stefan-Boltzmann Law",
            totalLessons = 5,
            completedLessons = 3,
            studyNotesCount = 7,
            practiceQuestionCount = 18,
            durationMinutes = 40,
            formulaHighlight = "dQ/dt = −kA (dT/dx)  •  λ_m T = b  •  P = ε σ A T⁴",
            keyConceptsSummary = "Anomalous expansion of water, phase-change calorimetry, steady-state thermal resistance in series/parallel, blackbody radiation, and Newton's law of cooling.",
            detailedStudyNotes = """
                1. Thermal Expansion & Calorimetry
                • β = 2α and γ = 3α for isotropic solids.
                • Apparent expansion of liquid in a vessel: ΔV_app = V₀ (γ_liquid − 3α_vessel) ΔT.

                2. Heat Transfer: Conduction & Radiation
                • Thermal Resistance R_th = L / (kA); series/parallel combinations follow electrical resistor rules.
                • Wien's Displacement Law: λ_max · T = b ≈ 2.898 × 10⁻³ m·K.
                • Newton's Law of Cooling (for small ΔT): −dT/dt = K(T − T_s).
            """.trimIndent(),
            videoTitle = "Fourier Conduction Networks & Blackbody Radiation Laws",
            videoDurationLabel = "30:45",
            videoInstructor = "Prof. R. Subramanian (IISER Mohali)",
            videoKeyTakeaways = "Ice layer growth thickness x ∝ √t • Star luminosity and temperature • Average form of Newton's cooling",
            isVideoCompleted = false
        ),
        ChapterEntity(
            id = "phys_ch_11",
            subject = "Physics",
            examTag = "IISER IAT",
            chapterNumber = 11,
            title = "Thermodynamics",
            subtitle = "First & Second Laws, Polytropic Processes, Indicator Diagrams & Carnot Cycles",
            totalLessons = 6,
            completedLessons = 5,
            studyNotesCount = 9,
            practiceQuestionCount = 26,
            durationMinutes = 55,
            formulaHighlight = "dQ = dU + PdV  •  PV^γ = const  •  η_Carnot = 1 − T_C / T_H",
            keyConceptsSummary = "Internal energy, work done in isothermal, adiabatic, and polytropic processes, molar heat capacity, Carnot engine efficiency, and entropy changes.",
            detailedStudyNotes = """
                1. First Law & Thermodynamic Processes
                • dQ = dU + dW, where dU = n C_v dT (state function, true for all ideal gas processes).
                • Isothermal (T = const): W = nRT ln(V_f / V_i).
                • Adiabatic (PV^γ = const): W = (P_i V_i − P_f V_f) / (γ − 1) = nR(T_i − T_f) / (γ − 1).
                • Polytropic (PV^x = const): Molar heat capacity C = R/(γ − 1) + R/(1 − x).

                2. Carnot Cycle & Second Law
                • Carnot Efficiency: η = W / Q_H = 1 − Q_C / Q_H = 1 − T_C / T_H.
                • Entropy change of an ideal gas: ΔS = n C_v ln(T_f / T_i) + nR ln(V_f / V_i).
            """.trimIndent(),
            videoTitle = "PV/TS Indicator Diagrams, Polytropic Processes & Carnot Engines",
            videoDurationLabel = "39:15",
            videoInstructor = "Prof. R. Subramanian (IISER Mohali)",
            videoKeyTakeaways = "Converting P-V to V-T and P-T cycles • Identifying heat absorption vs rejection • Adiabatic vs isothermal slopes",
            isVideoCompleted = true,
            lastAccessedTimestamp = System.currentTimeMillis() - 4_800_000L
        ),
        ChapterEntity(
            id = "phys_ch_12",
            subject = "Physics",
            examTag = "IISER IAT",
            chapterNumber = 12,
            title = "Kinetic Theory",
            subtitle = "Molecular Speeds, Equipartition of Energy, Specific Heats & Mean Free Path",
            totalLessons = 4,
            completedLessons = 3,
            studyNotesCount = 6,
            practiceQuestionCount = 18,
            durationMinutes = 35,
            formulaHighlight = "P = ⅓ ρ v_rms²  •  U = (f/2) nRT  •  λ = 1 / (√2 π n_v d²)",
            keyConceptsSummary = "Ideal gas pressure derivation, Maxwell-Boltzmann speed distribution (v_mp < v_avg < v_rms), degrees of freedom, γ for gas mixtures, and mean free path.",
            detailedStudyNotes = """
                1. Molecular Speeds (Maxwell Distribution)
                • v_rms = √(3RT / M)  |  v_avg = √(8RT / πM)  |  v_mp = √(2RT / M).
                • Ratio v_mp : v_avg : v_rms = √2 : √(8/π) : √3 ≈ 1 : 1.128 : 1.224.

                2. Degrees of Freedom & Equipartition Theorem
                • Energy per degree of freedom per molecule = ½ k_B T.
                • C_v = (f/2)R, C_p = (f/2 + 1)R, γ = C_p / C_v = 1 + 2/f.
                • Monoatomic (f = 3, γ = 5/3), Diatomic rigid (f = 5, γ = 7/5), Polyatomic non-linear (f = 6, γ = 4/3).
            """.trimIndent(),
            videoTitle = "Maxwell Speed Distribution & Gas Mixture Adiabatic Exponent",
            videoDurationLabel = "28:20",
            videoInstructor = "Prof. R. Subramanian (IISER Mohali)",
            videoKeyTakeaways = "Equivalent γ_mix = (n₁C_p1 + n₂C_p2)/(n₁C_v1 + n₂C_v2) • Mean free path scaling with P and T",
            isVideoCompleted = false
        ),
        ChapterEntity(
            id = "phys_ch_13",
            subject = "Physics",
            examTag = "IISER IAT",
            chapterNumber = 13,
            title = "Oscillations",
            subtitle = "Simple Harmonic Motion, Phasor Diagrams, Spring Combinations & Pendulums",
            totalLessons = 6,
            completedLessons = 4,
            studyNotesCount = 8,
            practiceQuestionCount = 24,
            durationMinutes = 50,
            formulaHighlight = "d²x/dt² + ω²x = 0  •  v = ω√(A² − x²)  •  T = 2π√(I / mgd)",
            keyConceptsSummary = "Differential equation of SHM, circular phasor method, kinetic and potential energy oscillations (frequency 2f), series/parallel springs, and compound/torsional pendulums.",
            detailedStudyNotes = """
                1. Kinematics & Energetics of SHM
                • x(t) = A sin(ωt + φ); v(t) = Aω cos(ωt + φ); a(t) = −ω²x.
                • K = ½ mω²(A² − x²), U = ½ mω²x² (assuming U₀ = 0); KE and PE oscillate with frequency 2f.

                2. Spring Systems & Physical Pendulums
                • Series springs: 1/k_eq = 1/k₁ + 1/k₂; Parallel springs: k_eq = k₁ + k₂.
                • Physical (Compound) Pendulum: T = 2π √(I_pivot / (M g d_cm)).
            """.trimIndent(),
            videoTitle = "Phasor Method, Energy Method for SHM & Physical Pendulums",
            videoDurationLabel = "36:10",
            videoInstructor = "Prof. R. Subramanian (IISER Mohali)",
            videoKeyTakeaways = "Solving phase differences using uniform circular projection • Differentiating total energy E = const to find ω",
            isVideoCompleted = true
        ),
        ChapterEntity(
            id = "phys_ch_14",
            subject = "Physics",
            examTag = "IISER IAT",
            chapterNumber = 14,
            title = "Waves",
            subtitle = "Travelling Waves, Superposition, Standing Waves in Strings/Pipes & Beats",
            totalLessons = 6,
            completedLessons = 3,
            studyNotesCount = 8,
            practiceQuestionCount = 22,
            durationMinutes = 50,
            formulaHighlight = "v = √(T/μ)  •  v_sound = √(γRT/M)  •  f_beat = |f₁ − f₂|",
            keyConceptsSummary = "Wave equation y(x,t) = A sin(kx − ωt), power transmitted along a stretched string, harmonics and overtones in strings and organ pipes, resonance tube, and beat frequency.",
            detailedStudyNotes = """
                1. Travelling Waves & Wave Speed
                • Wave speed v = ω/k = fλ; Particle velocity v_p = −v × (slope ∂y/∂x).
                • Transverse wave on string: v = √(T/μ); Longitudinal sound wave in gas (Laplace correction): v = √(γP/ρ) = √(γRT/M).

                2. Standing Waves & Normal Modes
                • String fixed at both ends or Open Organ Pipe: fₙ = n v / (2L) (All harmonics n = 1, 2, 3...).
                • Closed Organ Pipe (one end closed): f_k = (2k − 1) v / (4L) (Only odd harmonics 1, 3, 5...).
            """.trimIndent(),
            videoTitle = "Standing Wave Harmonics, End Correction & Beat Interference",
            videoDurationLabel = "34:55",
            videoInstructor = "Prof. R. Subramanian (IISER Mohali)",
            videoKeyTakeaways = "Resonance tube end-correction e = (L₂ − 3L₁)/2 • Tuning fork waxing/filing logic • Wave power I ∝ A²f²",
            isVideoCompleted = false
        ),
        ChapterEntity(
            id = "phys_ch_15",
            subject = "Physics",
            examTag = "IISER IAT",
            chapterNumber = 15,
            title = "Electric Charges and Fields",
            subtitle = "Coulomb's Law, Continuous Charge Distributions, Electric Dipoles & Gauss's Law",
            totalLessons = 6,
            completedLessons = 5,
            studyNotesCount = 9,
            practiceQuestionCount = 26,
            durationMinutes = 55,
            formulaHighlight = "∮ E · dA = Q_enc / ε₀  •  τ = p × E  •  U = −p · E",
            keyConceptsSummary = "Superposition of electrostatic forces, electric field of rings, discs, and infinite wires, dipole field and torque, electric flux, and symmetric Gauss's law applications.",
            detailedStudyNotes = """
                1. Continuous Charge Distributions & Dipoles
                • Axial field of uniformly charged ring: E = kQx / (R² + x²)^(3/2) (maximum at x = ±R/√2).
                • Short Electric Dipole (p = q · 2a): E_axial = 2kp/r³, E_equatorial = −kp/r³.
                • Torque on dipole in uniform field: τ = p × E; Potential energy: U = −p · E.

                2. Gauss's Law & Symmetry
                • ∮ E · dA = Q_enclosed / ε₀.
                • Infinite line charge: E = λ / (2π ε₀ r); Infinite non-conducting sheet: E = σ / (2ε₀); Conducting surface: E = σ / ε₀.
            """.trimIndent(),
            videoTitle = "Gauss's Law Cavities, Solid Angle Flux & Dipole Mechanics",
            videoDurationLabel = "40:15",
            videoInstructor = "Prof. R. Subramanian (IISER Mohali)",
            videoKeyTakeaways = "Cube corner/face flux shortcuts • Superposition inside spherical cavity • Dipole SHM time period",
            isVideoCompleted = true,
            lastAccessedTimestamp = System.currentTimeMillis() - 2_400_000L
        ),
        ChapterEntity(
            id = "phys_ch_16",
            subject = "Physics",
            examTag = "IISER IAT",
            chapterNumber = 16,
            title = "Electrostatic Potential and Capacitance",
            subtitle = "Equipotential Surfaces, Self-Energy, Conductors, Dielectrics & Capacitor Networks",
            totalLessons = 6,
            completedLessons = 4,
            studyNotesCount = 10,
            practiceQuestionCount = 26,
            durationMinutes = 55,
            formulaHighlight = "E = −∇V  •  C = K ε₀ A / d  •  U = ½ CV² = Q² / (2C)",
            keyConceptsSummary = "Relation between E and V, electrostatic shielding, grounding of concentric shells, parallel-plate capacitors with dielectrics, and heat loss during charge redistribution.",
            detailedStudyNotes = """
                1. Electrostatic Potential & Conductors
                • V(r) = −∫ E · dr  ⇔  E_x = −∂V/∂x, E_y = −∂V/∂y, E_z = −∂V/∂z.
                • Electrostatic potential energy of a system of point charges: U = ∑_{i<j} k qᵢ qⱼ / rᵢⱼ.

                2. Capacitors & Dielectrics
                • Parallel plate with partial dielectric slab of thickness t: C = ε₀ A / [d − t(1 − 1/K)].
                • Force between plates of an isolated capacitor: F = Q² / (2 A ε₀).
                • Energy loss when two capacitors are connected in parallel: ΔH = ½ [C₁C₂ / (C₁ + C₂)] (V₁ − V₂)².
            """.trimIndent(),
            videoTitle = "Concentric Shell Grounding, Dielectric Insertion & Capacitor Circuits",
            videoDurationLabel = "41:30",
            videoInstructor = "Prof. R. Subramanian (IISER Mohali)",
            videoKeyTakeaways = "Battery connected (V const) vs disconnected (Q const) dielectric insertion • Nodal analysis for capacitors",
            isVideoCompleted = true
        ),
        ChapterEntity(
            id = "phys_ch_17",
            subject = "Physics",
            examTag = "IISER IAT",
            chapterNumber = 17,
            title = "Current Electricity",
            subtitle = "Drift Velocity, Kirchhoff's Laws, Wheatstone Bridge, RC Circuits & Instruments",
            totalLessons = 6,
            completedLessons = 4,
            studyNotesCount = 9,
            practiceQuestionCount = 26,
            durationMinutes = 55,
            formulaHighlight = "I = n e A v_d  •  E_eq / r_eq = Σ(Eᵢ / rᵢ)  •  q(t) = CV(1 − e^(−t/RC))",
            keyConceptsSummary = "Microscopic Ohm's law (J = σE), parallel cell combinations, symmetry in resistor networks, transient RC charging/discharging, meter bridge, and galvanometer conversions.",
            detailedStudyNotes = """
                1. Drift Velocity, Cells & Power Transfer
                • Drift speed v_d = eEτ/m; Current I = n e A v_d; Mobility μ = v_d / E.
                • Maximum Power Transfer Theorem: External load R receives maximum power P_max = E²/(4r) when R = r_internal.

                2. Transient RC Circuits & Electrical Instruments
                • Charging: q(t) = Q₀(1 − e^(−t/τ)), I(t) = (V/R) e^(−t/τ) where time constant τ = R_eq C.
                • At t = 0⁺, an uncharged capacitor acts as a short circuit; at t → ∞ (steady state), it acts as an open circuit.
            """.trimIndent(),
            videoTitle = "Symmetry Resistor Networks, RC Transients & Bridge Circuits",
            videoDurationLabel = "38:50",
            videoInstructor = "Prof. R. Subramanian (IISER Mohali)",
            videoKeyTakeaways = "Mirror and folding symmetry in cube networks • Finding R_Thevenin for RC time constant • Shunt calculations",
            isVideoCompleted = false
        ),
        ChapterEntity(
            id = "phys_ch_18",
            subject = "Physics",
            examTag = "IISER IAT",
            chapterNumber = 18,
            title = "Moving Charges and Magnetism",
            subtitle = "Biot-Savart Law, Ampere's Circuital Law, Lorentz Force & Magnetic Dipoles",
            totalLessons = 6,
            completedLessons = 4,
            studyNotesCount = 9,
            practiceQuestionCount = 24,
            durationMinutes = 55,
            formulaHighlight = "F = q(E + v × B)  •  dB = (μ₀/4π) I(dl × r̂)/r²  •  ∮ B · dl = μ₀ I_enc",
            keyConceptsSummary = "Magnetic field of straight wires, circular arcs, and solenoids, helical trajectories in magnetic fields, velocity selector, force between parallel currents, and moving coil galvanometer.",
            detailedStudyNotes = """
                1. Biot-Savart & Ampere's Law
                • Finite wire segment at distance d: B = (μ₀ I / 4πd)(sin θ₁ + sin θ₂).
                • Circular arc subtending angle φ at center: B = (μ₀ I φ) / (4πR).
                • Long solenoid: B = μ₀ n I inside.

                2. Charged Particle Motion & Magnetic Dipole
                • Cyclotron radius r = mv / (qB); Time period T = 2πm / (qB) (independent of speed v).
                • Gyromagnetic ratio of any rotating body with uniform charge-to-mass distribution: M / L = q / (2m).
            """.trimIndent(),
            videoTitle = "3D Lorentz Trajectories, Ampere's Law & Gyromagnetic Ratio",
            videoDurationLabel = "39:40",
            videoInstructor = "Prof. R. Subramanian (IISER Mohali)",
            videoKeyTakeaways = "Wall collision condition in magnetic field region • Non-uniform current density cables • Torque τ = M × B",
            isVideoCompleted = true
        ),
        ChapterEntity(
            id = "phys_ch_19",
            subject = "Physics",
            examTag = "IISER IAT",
            chapterNumber = 19,
            title = "Magnetism and Matter",
            subtitle = "Bar Magnet Dipoles, Magnetization, Dia-, Para- & Ferromagnetic Materials",
            totalLessons = 4,
            completedLessons = 2,
            studyNotesCount = 5,
            practiceQuestionCount = 15,
            durationMinutes = 35,
            formulaHighlight = "B = μ₀(H + M)  •  μ_r = 1 + χ_m  •  T = 2π√(I / MB)",
            keyConceptsSummary = "Bar magnet equivalence to a solenoid, oscillation magnetometer, magnetic intensity H, susceptibility χ, Curie's law for paramagnets, and hysteresis.",
            detailedStudyNotes = """
                1. Magnetic Dipole & Magnetization Vectors
                • Oscillation period of a magnetic needle in uniform field B: T = 2π √(I / MB).
                • B = μ₀(H + M) = μ₀(1 + χ_m)H = μ₀ μ_r H.

                2. Classification of Magnetic Materials
                • Diamagnetic: −1 ≤ χ_m < 0 (independent of T); Paramagnetic: χ_m > 0 and χ_m ∝ 1/T (Curie's Law); Ferromagnetic: χ_m ≫ 1.
            """.trimIndent(),
            videoTitle = "Magnetic Susceptibility, Curie's Law & Dipole Oscillations",
            videoDurationLabel = "24:50",
            videoInstructor = "Prof. R. Subramanian (IISER Mohali)",
            videoKeyTakeaways = "Comparing diamagnetic, paramagnetic, and ferromagnetic graphs • Cutting a bar magnet",
            isVideoCompleted = false
        ),
        ChapterEntity(
            id = "phys_ch_20",
            subject = "Physics",
            examTag = "IISER IAT",
            chapterNumber = 20,
            title = "Electromagnetic Induction",
            subtitle = "Faraday's & Lenz's Laws, Motional EMF, Induced Electric Fields & RL Circuits",
            totalLessons = 6,
            completedLessons = 3,
            studyNotesCount = 9,
            practiceQuestionCount = 24,
            durationMinutes = 50,
            formulaHighlight = "ε = −dΦ_B / dt  •  ∮ E_ind · dl = −dΦ_B / dt  •  U_B = ½ L I²",
            keyConceptsSummary = "Flux linkage, motional EMF in translating and rotating rods, non-conservative induced electric fields, self and mutual inductance, and RL circuit transients.",
            detailedStudyNotes = """
                1. Faraday's Law & Motional EMF
                • Total charge flown through a closed loop of resistance R depends only on net flux change: Δq = ΔΦ_B / R.
                • Conducting rod of length L rotating with angular speed ω about one end in uniform B: ε = ½ B ω L².

                2. Inductance & Magnetic Energy Density
                • Self-inductance of a solenoid: L = μ₀ n² A l; Magnetic energy density u_B = B² / (2μ₀).
                • RL Growth current: I(t) = (V/R)(1 − e^(−t/τ_L)) where τ_L = L / R.
            """.trimIndent(),
            videoTitle = "Motional EMF on Rails, Induced E-Fields & RL Transients",
            videoDurationLabel = "37:35",
            videoInstructor = "Prof. R. Subramanian (IISER Mohali)",
            videoKeyTakeaways = "Terminal velocity of sliding bar on magnetic rails • Cylindrical dB/dt induced electric field E = (r/2)(dB/dt)",
            isVideoCompleted = false
        ),
        ChapterEntity(
            id = "phys_ch_21",
            subject = "Physics",
            examTag = "IISER IAT",
            chapterNumber = 21,
            title = "Alternating Current",
            subtitle = "RMS Values, Phasors, Series LCR Resonance, Power Factor & LC Oscillations",
            totalLessons = 5,
            completedLessons = 3,
            studyNotesCount = 7,
            practiceQuestionCount = 20,
            durationMinutes = 45,
            formulaHighlight = "Z = √[R² + (X_L − X_C)²]  •  ω₀ = 1/√(LC)  •  P_avg = V_rms I_rms cos φ",
            keyConceptsSummary = "Reactance and impedance phasors, series LCR resonance and Quality factor (Q), average power and wattless current, LC oscillations, and ideal transformers.",
            detailedStudyNotes = """
                1. Series LCR Impedance & Resonance
                • Impedance Z = √[R² + (ωL − 1/ωC)²]; phase angle tan φ = (X_L − X_C) / R.
                • At Resonance (X_L = X_C): ω₀ = 1/√(LC), Z_min = R, power factor cos φ = 1.
                • Quality Factor Q = ω₀ / Δω = (1/R) √(L/C).

                2. Power in AC & Transformers
                • Average power P_avg = V_rms I_rms cos φ; Wattless component of current = I_rms sin φ.
                • Ideal Transformer: V_s / V_p = N_s / N_p = I_p / I_s.
            """.trimIndent(),
            videoTitle = "LCR Phasor Diagrams, Sharpness of Resonance & Power Factor",
            videoDurationLabel = "32:10",
            videoInstructor = "Prof. R. Subramanian (IISER Mohali)",
            videoKeyTakeaways = "Adding RMS voltages using vector phasors • Bandwidth Δω = R/L • LC energy conservation analogy",
            isVideoCompleted = false
        ),
        ChapterEntity(
            id = "phys_ch_22",
            subject = "Physics",
            examTag = "IISER IAT",
            chapterNumber = 22,
            title = "Electromagnetic Waves",
            subtitle = "Displacement Current, Maxwell's Equations, Poynting Vector & EM Spectrum",
            totalLessons = 4,
            completedLessons = 3,
            studyNotesCount = 5,
            practiceQuestionCount = 15,
            durationMinutes = 35,
            formulaHighlight = "I_d = ε₀ (dΦ_E/dt)  •  E₀ / B₀ = c = 1/√(μ₀ε₀)  •  I_avg = ½ c ε₀ E₀²",
            keyConceptsSummary = "Ampere-Maxwell law, transverse nature and polarization of EM waves (E × B || k), equal electric and magnetic energy densities, radiation pressure, and EM spectrum order.",
            detailedStudyNotes = """
                1. Wave Propagation & Field Amplitudes
                • Direction of wave propagation is given by E × B.
                • Speed in vacuum c = 1/√(μ₀ε₀) = E₀ / B₀; in dielectric medium v = c / n.

                2. Energy Density, Intensity & Radiation Pressure
                • Average electric and magnetic energy densities are equal: ⟨u_E⟩ = ⟨u_B⟩ = ¼ ε₀ E₀² = B₀² / (4μ₀).
                • Radiation pressure on completely absorbing surface P = I/c; on completely reflecting surface P = 2I/c.
            """.trimIndent(),
            videoTitle = "Maxwell's Displacement Current, Wave Vectors & Radiation Pressure",
            videoDurationLabel = "25:45",
            videoInstructor = "Prof. R. Subramanian (IISER Mohali)",
            videoKeyTakeaways = "Extracting k̂, E₀, B₀ from wave equations • Equal energy partitioning • EM spectrum wavelength hierarchy",
            isVideoCompleted = true
        ),
        ChapterEntity(
            id = "phys_ch_23",
            subject = "Physics",
            examTag = "IISER IAT",
            chapterNumber = 23,
            title = "Ray Optics and Optical Instruments",
            subtitle = "Spherical Mirrors, Refraction, TIR, Lens Maker's Formula, Prisms & Telescopes",
            totalLessons = 7,
            completedLessons = 4,
            studyNotesCount = 10,
            practiceQuestionCount = 28,
            durationMinutes = 60,
            formulaHighlight = "1/f = (n₂/n₁ − 1)(1/R₁ − 1/R₂)  •  n = sin[(A + δ_m)/2] / sin(A/2)",
            keyConceptsSummary = "Mirror and thin lens formulas, refraction at spherical surfaces, critical angle and optical fibers, silvered lenses, prism minimum deviation, and microscope/telescope magnifying power.",
            detailedStudyNotes = """
                1. Spherical Surfaces, Lenses & Silvered Combinations
                • Refraction at single spherical surface: n₂/v − n₁/u = (n₂ − n₁)/R.
                • Equivalent power of a silvered lens: P_eq = 2 P_lens + P_mirror (where P = −1/f_eq).

                2. Prism & Optical Instruments
                • Prism: i + e = A + δ; at minimum deviation (i = e, r₁ = r₂ = A/2): n = sin[(A + δ_m)/2] / sin(A/2).
                • Compound Microscope: M = (v₀/u₀)(1 + D/f_e) (near point) or (v₀/u₀)(D/f_e) (normal adjustment).
                • Astronomical Telescope: M = f₀ / f_e, tube length L = f₀ + f_e (normal adjustment).
            """.trimIndent(),
            videoTitle = "Spherical Surface Refraction, Silvered Lenses & Prism Optics",
            videoDurationLabel = "42:30",
            videoInstructor = "Prof. R. Subramanian (IISER Mohali)",
            videoKeyTakeaways = "Newton's formula xx' = f² • Displacement method for focal length • Grazing emergence condition in prisms",
            isVideoCompleted = false
        ),
        ChapterEntity(
            id = "phys_ch_24",
            subject = "Physics",
            examTag = "IISER IAT",
            chapterNumber = 24,
            title = "Wave Optics",
            subtitle = "Huygens' Principle, Young's Double Slit (YDSE), Single-Slit Diffraction & Malus's Law",
            totalLessons = 6,
            completedLessons = 4,
            studyNotesCount = 8,
            practiceQuestionCount = 24,
            durationMinutes = 50,
            formulaHighlight = "I = I₁ + I₂ + 2√(I₁I₂) cos φ  •  β = λD / d  •  I = I₀ cos²θ",
            keyConceptsSummary = "Coherent superposition, YDSE fringe width and optical path shift with thin glass slab, Fraunhofer single-slit diffraction minima, and polarization by Polaroids.",
            detailedStudyNotes = """
                1. Interference & Young's Double-Slit Experiment (YDSE)
                • Resultant Intensity (for I₁ = I₂ = I₀): I = 4I₀ cos²(φ/2), where phase difference φ = (2π/λ) Δx.
                • Fringe width β = λD / d; Inserting a slab of thickness t and index μ shifts the central maxima by Δy = (μ − 1)t D / d (or (μ − 1)t/λ fringes).

                2. Diffraction & Polarization
                • Single-slit diffraction minima: a sin θ = nλ (n = ±1, ±2, ...); Linear width of central maximum = 2λD / a.
                • Law of Malus: I = I_incident cos²θ (after passing unpolarized light I₀ through first polarizer, I₁ = I₀/2).
            """.trimIndent(),
            videoTitle = "Modified YDSE Setups, Diffraction Minima & Polarizer Chains",
            videoDurationLabel = "36:40",
            videoInstructor = "Prof. R. Subramanian (IISER Mohali)",
            videoKeyTakeaways = "Optical path difference with oblique incidence • Missing orders in double-slit diffraction • Crossed polaroids",
            isVideoCompleted = true
        ),
        ChapterEntity(
            id = "phys_ch_25",
            subject = "Physics",
            examTag = "IISER IAT",
            chapterNumber = 25,
            title = "Dual Nature of Radiation and Matter",
            subtitle = "Photoelectric Effect, Photon Momentum, Radiation Force & de Broglie Waves",
            totalLessons = 5,
            completedLessons = 4,
            studyNotesCount = 7,
            practiceQuestionCount = 20,
            durationMinutes = 45,
            formulaHighlight = "K_max = eV₀ = hν − φ₀  •  λ = h / p = h / √(2mK)",
            keyConceptsSummary = "Einstein's photoelectric equation, stopping potential vs frequency graphs, photon flux and radiation force, and de Broglie wavelength of accelerated particles.",
            detailedStudyNotes = """
                1. Einstein's Photoelectric Equation
                • K_max = e V₀ = hν − φ₀ = hc(1/λ − 1/λ₀), where hc ≈ 1240 eV·nm.
                • Stopping potential V₀ depends only on frequency ν and work function φ₀; saturation photocurrent is proportional to intensity I (for ν > ν₀).

                2. Matter Waves (de Broglie Wavelength)
                • λ = h / p = h / √(2mK) = h / √(2mqV).
                • For an electron accelerated through V volts: λ ≈ 12.27 / √V Å.
            """.trimIndent(),
            videoTitle = "Photoelectric Graphs, Photon Flux & de Broglie Wavelengths",
            videoDurationLabel = "31:20",
            videoInstructor = "Prof. R. Subramanian (IISER Mohali)",
            videoKeyTakeaways = "Using hc = 1240 eV·nm for instant calculation • Photon number flux n = P/(hν) • Relativistic vs classical λ",
            isVideoCompleted = true,
            lastAccessedTimestamp = System.currentTimeMillis() - 3_200_000L
        ),
        ChapterEntity(
            id = "phys_ch_26",
            subject = "Physics",
            examTag = "IISER IAT",
            chapterNumber = 26,
            title = "Atoms",
            subtitle = "Rutherford Scattering, Bohr's Hydrogen Model, Energy Levels & Spectral Series",
            totalLessons = 5,
            completedLessons = 3,
            studyNotesCount = 7,
            practiceQuestionCount = 20,
            durationMinutes = 45,
            formulaHighlight = "E_n = −13.6 Z² / n² eV  •  1/λ = R Z² (1/n₁² − 1/n₂²)",
            keyConceptsSummary = "Distance of closest approach, Bohr's angular momentum quantization (mvr = nh/2π), scaling of radius, speed, and energy with n and Z, Rydberg spectral series, and atomic recoil.",
            detailedStudyNotes = """
                1. Bohr Model Scaling Relations (Hydrogenic Ion)
                • Radius: r_n = 0.529 × (n² / Z) Å.
                • Speed: v_n = (c / 137) × (Z / n) ≈ 2.18 × 10⁶ (Z / n) m/s.
                • Energy: E_n = −13.6 (Z² / n²) eV, with K_n = −E_n and U_n = 2E_n.

                2. Spectral Series & De-excitation
                • Rydberg Formula: 1/λ = R Z² (1/n_f² − 1/n_i²), where 1/R ≈ 912 Å.
                • Number of distinct spectral lines from level n to ground state in a gas sample is n(n − 1)/2.
            """.trimIndent(),
            videoTitle = "Bohr Quantization, Rydberg Spectral Transitions & Recoil Momentum",
            videoDurationLabel = "33:05",
            videoInstructor = "Prof. R. Subramanian (IISER Mohali)",
            videoKeyTakeaways = "Standing de Broglie waves 2πr_n = nλ • Reduced mass correction for positronium/muonic hydrogen",
            isVideoCompleted = false
        ),
        ChapterEntity(
            id = "phys_ch_27",
            subject = "Physics",
            examTag = "IISER IAT",
            chapterNumber = 27,
            title = "Nuclei",
            subtitle = "Nuclear Radius, Mass Defect, Binding Energy Curve, Q-Value & Fission/Fusion",
            totalLessons = 5,
            completedLessons = 3,
            studyNotesCount = 6,
            practiceQuestionCount = 18,
            durationMinutes = 40,
            formulaHighlight = "R = R₀ A^(1/3)  •  Q = (Δm) c² = (Δm in u) × 931.5 MeV",
            keyConceptsSummary = "Constant nuclear density, mass defect and binding energy per nucleon (peak at ⁵⁶Fe), Q-value of α and β decays, and energetics of nuclear fission and fusion.",
            detailedStudyNotes = """
                1. Nuclear Size, Density & Binding Energy
                • Nuclear radius R = R₀ A^(1/3) (R₀ ≈ 1.2 fm) ⇒ Nuclear density ρ ≈ 2.3 × 10¹⁷ kg/m³ is independent of mass number A.
                • Binding energy BE = [Z m_p + (A − Z) m_n − M_nucleus] c².

                2. Nuclear Reactions & Q-Value
                • Q = (∑ m_reactants − ∑ m_products) c² = K_products − K_reactants.
                • In α-decay of a stationary parent nucleus of mass number A: K_α = [(A − 4) / A] Q.
            """.trimIndent(),
            videoTitle = "Binding Energy per Nucleon, Alpha Recoil & Reaction Q-Values",
            videoDurationLabel = "29:40",
            videoInstructor = "Prof. R. Subramanian (IISER Mohali)",
            videoKeyTakeaways = "Computing Q-value from BE/nucleon values • Threshold kinetic energy in endothermic nuclear reactions",
            isVideoCompleted = false
        ),
        ChapterEntity(
            id = "phys_ch_28",
            subject = "Physics",
            examTag = "IISER IAT",
            chapterNumber = 28,
            title = "Semiconductor Electronics: Materials, Devices and Simple Circuits",
            subtitle = "Energy Bands, Intrinsic/Extrinsic Semiconductors, p-n Junction Diodes & Rectifiers",
            totalLessons = 5,
            completedLessons = 3,
            studyNotesCount = 7,
            practiceQuestionCount = 20,
            durationMinutes = 45,
            formulaHighlight = "n_e n_h = n_i²  •  σ = e(n_e μ_e + n_h μ_h)  •  I = I₀(e^(eV / ηk_BT) − 1)",
            keyConceptsSummary = "Valence and conduction bands, mass-action law in doped semiconductors, depletion layer and potential barrier in p-n junctions, half/full-wave rectifiers, Zener voltage regulator, and logic gates.",
            detailedStudyNotes = """
                1. Semiconductor Physics & Mass-Action Law
                • At thermal equilibrium: n_e · n_h = n_i².
                • Electrical conductivity: σ = 1/ρ = e(n_e μ_e + n_h μ_h).

                2. p-n Junction Diode & Rectifier Circuits
                • Ideal Diode Approximation: Forward bias → closed switch (zero resistance); Reverse bias → open switch.
                • Half-wave rectifier ripple frequency = f_in; Full-wave rectifier ripple frequency = 2 f_in.
            """.trimIndent(),
            videoTitle = "p-n Junction Clipper/Clamper Circuits, Zener Regulation & Logic Gates",
            videoDurationLabel = "34:15",
            videoInstructor = "Prof. R. Subramanian (IISER Mohali)",
            videoKeyTakeaways = "Ideal diode state testing • Zener breakdown current limits • De Morgan's theorem for NAND/NOR gates",
            isVideoCompleted = false
        ),

        // ==================== CHEMISTRY (19 CHAPTERS - IISER IAT) ====================
        ChapterEntity(
            id = "chem_ch_1",
            subject = "Chemistry",
            examTag = "IISER IAT",
            chapterNumber = 1,
            title = "Some Basic Concepts of Chemistry",
            subtitle = "Stoichiometry, Mole Concept, Limiting Reagent, Empirical Formula & Concentration Terms",
            totalLessons = 5,
            completedLessons = 4,
            studyNotesCount = 7,
            practiceQuestionCount = 20,
            durationMinutes = 40,
            formulaHighlight = "M = (10 × %w/w × d) / M₀  •  M₁V₁ + M₂V₂ = M_f(V₁ + V₂)",
            keyConceptsSummary = "Laws of chemical combination, mole-to-mole stoichiometry, limiting reagent, empirical and molecular formulas, molarity, molality, mole fraction, and equivalent concept.",
            detailedStudyNotes = """
                1. Mole Concept & Concentration Relations
                • n = W / M₀ = N / N_A = V_STP(L) / 22.7.
                • Relation between Molarity (M), Molality (m), Density (d in g/mL), and Molar Mass (M₀):
                  m = (1000 × M) / (1000 d − M × M₀).
                • Mole fraction of solute in aqueous solution: x_B = m / (m + 55.55).

                2. Limiting Reagent & Sequential Reactions
                • Divide initial moles of each reactant by its stoichiometric coefficient (nᵢ / νᵢ); the minimum ratio identifies the Limiting Reagent (LR).
                • Principle of Atom Conservation (POAC): Total moles of any conserved element remain constant across multistep reactions.
            """.trimIndent(),
            videoTitle = "Stoichiometric Equivalents, POAC & Concentration Conversions",
            videoDurationLabel = "31:15",
            videoInstructor = "Dr. Meera Krishnan (IISER Thiruvananthapuram)",
            videoKeyTakeaways = "Molality-molarity shortcut • Oleum labeling (% free SO₃) • Eudiometry gas contraction",
            isVideoCompleted = true,
            lastAccessedTimestamp = System.currentTimeMillis() - 8_000_000L
        ),
        ChapterEntity(
            id = "chem_ch_2",
            subject = "Chemistry",
            examTag = "IISER IAT",
            chapterNumber = 2,
            title = "Structure of the Atom",
            subtitle = "Bohr Model, de Broglie Wavelength, Heisenberg Uncertainty, Quantum Numbers & Orbitals",
            totalLessons = 6,
            completedLessons = 5,
            studyNotesCount = 8,
            practiceQuestionCount = 22,
            durationMinutes = 45,
            formulaHighlight = "Δx · Δp ≥ h/(4π)  •  Radial Nodes = n − l − 1  •  Angular Nodes = l",
            keyConceptsSummary = "Hydrogen spectrum & Rydberg equation, photoelectric effect, de Broglie matter waves, quantum numbers (n, l, m_l, m_s), radial probability distribution curves, and Aufbau/Hund/Pauli rules.",
            detailedStudyNotes = """
                1. Quantum Mechanical Wave Model & Nodes
                • Total nodes = n − 1; Radial (spherical) nodes = n − l − 1; Angular (planar/conical) nodes = l.
                • Orbital angular momentum = √[l(l + 1)] (h / 2π); Spin angular momentum = √[s(s + 1)] (h / 2π).

                2. Electronic Configurations & Exchange Energy
                • Half-filled (d⁵, f⁷) and fully-filled (d¹⁰, f¹⁴) subshells possess extra stability due to symmetrical charge distribution and high exchange energy (e.g., Cr: [Ar] 3d⁵ 4s¹, Cu: [Ar] 3d¹⁰ 4s¹).
            """.trimIndent(),
            videoTitle = "Radial Wavefunctions Ψ(r), Node Counting & Quantum Numbers",
            videoDurationLabel = "35:40",
            videoInstructor = "Dr. Meera Krishnan (IISER Thiruvananthapuram)",
            videoKeyTakeaways = "Identifying 1s, 2s, 2p, 3s, 3p, 3d from 4πr²R²(r) plots • Magnetic moment and spin multiplicity",
            isVideoCompleted = true
        ),
        ChapterEntity(
            id = "chem_ch_3",
            subject = "Chemistry",
            examTag = "IISER IAT",
            chapterNumber = 3,
            title = "Classification of Elements and Periodicity in Properties",
            subtitle = "Slater's Z_eff, Atomic/Ionic Radii, Ionization Enthalpy, Electron Gain Enthalpy & Electronegativity",
            totalLessons = 4,
            completedLessons = 3,
            studyNotesCount = 6,
            practiceQuestionCount = 18,
            durationMinutes = 35,
            formulaHighlight = "Z_eff = Z − σ  •  χ_Mulliken = (IE + EA) / 2  •  IE₂(Na) > IE₂(Mg)",
            keyConceptsSummary = "Effective nuclear charge, isoelectronic ionic radii, half-filled/penetration exceptions in IE₁, electron affinity of Cl vs F and S vs O, and periodic trends in oxide acidity.",
            detailedStudyNotes = """
                1. Ionization Enthalpy & Electron Gain Enthalpy Exceptions
                • Period 2 IE₁ order: Li < B < Be < C < O < N < F < Ne (Be > B due to 2s penetration; N > O due to 2p³ half-filled stability).
                • Electron Affinity (|Δ_eg H|) in Group 17: Cl > F > Br > I (2p-2p interelectronic repulsion in small F atom); in Group 16: S > Se > Te > Po > O.

                2. Nature of Oxides & Diagonal Relationships
                • Acidic strength of oxides increases across a period and with increasing oxidation state (MnO < Mn₂O₃ < MnO₂ < Mn₂O₇).
                • Amphoteric oxides: BeO, Al₂O₃, ZnO, Ga₂O₃, SnO, SnO₂, PbO, PbO₂, Cr₂O₃, V₂O₅.
            """.trimIndent(),
            videoTitle = "Periodic Anomalies, Successive Ionization Energies & Amphoteric Oxides",
            videoDurationLabel = "28:25",
            videoInstructor = "Prof. Vikramaditya Sen (IISER Kolkata)",
            videoKeyTakeaways = "Detecting valence electrons from IE jumps • Isoelectronic size ordering • Inert pair effect",
            isVideoCompleted = false
        ),
        ChapterEntity(
            id = "chem_ch_4",
            subject = "Chemistry",
            examTag = "IISER IAT",
            chapterNumber = 4,
            title = "Chemical Bonding and Molecular Structure",
            subtitle = "Fajans' Rules, VSEPR Geometry, Hybridization, Dipole Moment, MOT & Hydrogen Bonding",
            totalLessons = 7,
            completedLessons = 5,
            studyNotesCount = 10,
            practiceQuestionCount = 28,
            durationMinutes = 60,
            formulaHighlight = "Steric No. = ½(V + M − C + A)  •  Bond Order = ½(N_b − N_a)",
            keyConceptsSummary = "Lattice energy and Fajans' covalent character rules, VSEPR shapes and Bent's rule, dipole moments, Molecular Orbital Theory (O₂, N₂, C₂, B₂, CO, NO), and intramolecular vs intermolecular H-bonding.",
            detailedStudyNotes = """
                1. VSEPR Theory & Bent's Rule
                • Bent's Rule: More electronegative substituents prefer hybrid orbitals with less s-character (axial positions in trigonal bipyramidal sp³d, e.g., PCl₃F₂ has F at axial positions).
                • Bond angle trends: NH₃ (107°) > NF₃ (102°); H₂O (104.5°) > H₂S (92° — Drago's rule).

                2. Molecular Orbital Theory (MOT)
                • For ≤ 14 electrons (B₂, C₂, N₂): π(2p_x) = π(2p_y) lies below σ(2p_z) due to s-p mixing.
                • For > 14 electrons (O₂, F₂): σ(2p_z) lies below π(2p_x) = π(2p_y).
                • O₂ (BO = 2.0, paramagnetic, 2 unpaired e⁻); O₂⁺ (BO = 2.5); O₂⁻ (BO = 1.5); O₂²⁻ (BO = 1.0, diamagnetic).
            """.trimIndent(),
            videoTitle = "VSEPR, Bent's Rule, MOT Energy Diagrams & Dipole Vectors",
            videoDurationLabel = "44:10",
            videoInstructor = "Prof. Vikramaditya Sen (IISER Kolkata)",
            videoKeyTakeaways = "s-p mixing crossover at 14 e⁻ • Comparing bond lengths in NO⁺, NO, NO⁻ • o- vs p-nitrophenol boiling points",
            isVideoCompleted = true,
            lastAccessedTimestamp = System.currentTimeMillis() - 4_200_000L
        ),
        ChapterEntity(
            id = "chem_ch_5",
            subject = "Chemistry",
            examTag = "IISER IAT",
            chapterNumber = 5,
            title = "The d- & f-block elements",
            subtitle = "Transition Metal Oxidation States, Magnetic Moments, KMnO₄/K₂Cr₂O₇ & Lanthanoid Contraction",
            totalLessons = 5,
            completedLessons = 3,
            studyNotesCount = 8,
            practiceQuestionCount = 20,
            durationMinutes = 45,
            formulaHighlight = "μ_spin = √[n(n + 2)] BM  •  Cr₂O₇²⁻ ⇌ 2 CrO₄²⁻ (pH-dependent)",
            keyConceptsSummary = "Variable oxidation states of 3d series, electrode potential anomalies (E° Cu²⁺/Cu > 0), spin-only magnetic moment, d-d transitions vs LMCT color, K₂Cr₂O₇ and KMnO₄ redox chemistry, and lanthanoid contraction.",
            detailedStudyNotes = """
                1. Electronic Trends, Magnetism & Color
                • Spin-only magnetic moment: μ = √[n(n + 2)] Bohr Magnetons (n = number of unpaired electrons).
                • Charge Transfer (LMCT) gives intense color even with d⁰ configuration: MnO₄⁻ (Mn⁷⁺, deep purple), CrO₄²⁻ (Cr⁶⁺, yellow), Cr₂O₇²⁻ (Cr⁶⁺, orange).

                2. Lanthanoid Contraction & Consequences
                • Poor shielding by 4f electrons (4f < 5d < 6p < 6s) causes steady decrease in radius from La³⁺ to Lu³⁺.
                • Result: 4d and 5d transition pairs (Zr/Hf, Nb/Ta, Mo/W) have nearly identical atomic/ionic radii.
            """.trimIndent(),
            videoTitle = "Transition Metal Redox, LMCT Spectra & Lanthanoid Contraction",
            videoDurationLabel = "34:15",
            videoInstructor = "Prof. Vikramaditya Sen (IISER Kolkata)",
            videoKeyTakeaways = "Why Cu²⁺(aq) is more stable than Cu⁺(aq) • KMnO₄ equivalent weights in acidic/neutral/alkaline media",
            isVideoCompleted = false
        ),
        ChapterEntity(
            id = "chem_ch_6",
            subject = "Chemistry",
            examTag = "IISER IAT",
            chapterNumber = 6,
            title = "Coordination compounds",
            subtitle = "Werner's Theory, IUPAC Nomenclature, Isomerism, VBT, Crystal Field Theory & Metal Carbonyls",
            totalLessons = 6,
            completedLessons = 4,
            studyNotesCount = 10,
            practiceQuestionCount = 26,
            durationMinutes = 55,
            formulaHighlight = "CFSE (Oct) = (−0.4 n_t2g + 0.6 n_eg) Δ_o  •  Δ_t = (4/9) Δ_o",
            keyConceptsSummary = "Denticity and chelate effect, geometrical and optical isomerism in octahedral/square planar complexes, spectrochemical series, octahedral/tetrahedral crystal field splitting, and synergistic π-backbonding.",
            detailedStudyNotes = """
                1. Crystal Field Theory (CFT) & Spectrochemical Series
                • Spectrochemical Order: I⁻ < Br⁻ < SCN⁻ < Cl⁻ < F⁻ < OH⁻ < C₂O₄²⁻ < H₂O < NCS⁻ < EDTA⁴⁻ < NH₃ < en < CN⁻ < CO.
                • Octahedral CFSE = (−0.4 n_t2g + 0.6 n_eg) Δ_o; low-spin occurs when Δ_o > P (strong field ligands or 4d/5d metals).
                • d⁸ with strong field ligand (e.g., [Ni(CN)₄]²⁻, [PtCl₄]²⁻, [AuCl₄]⁻) adopts dsp² square planar geometry (diamagnetic).

                2. Stereoisomerism & Metal Carbonyls
                • [M(AA)₃], cis-[M(AA)₂b₂], and cis-[M(AA)b₂c₂] are optically active (chiral); square planar complexes rarely show optical isomerism unless ligand itself is chiral.
                • Synergistic M → CO π*-backbonding increases M–C bond order and decreases C–O bond order (lowering ν_CO stretching frequency).
            """.trimIndent(),
            videoTitle = "Crystal Field Splitting, Spin-Only Moments & Octahedral Stereoisomers",
            videoDurationLabel = "43:25",
            videoInstructor = "Prof. Vikramaditya Sen (IISER Kolkata)",
            videoKeyTakeaways = "Counting geometrical + optical isomers of [Ma₂b₂c₂] (5 GI + 1 enantiomeric pair = 6 total) • Carbonyl IR stretching order",
            isVideoCompleted = true,
            lastAccessedTimestamp = System.currentTimeMillis() - 2_800_000L
        ),
        ChapterEntity(
            id = "chem_ch_7",
            subject = "Chemistry",
            examTag = "IISER IAT",
            chapterNumber = 7,
            title = "Thermodynamics",
            subtitle = "First Law, Enthalpy, Hess's Law, Entropy, Gibbs Free Energy & Spontaneity Criteria",
            totalLessons = 6,
            completedLessons = 4,
            studyNotesCount = 9,
            practiceQuestionCount = 24,
            durationMinutes = 50,
            formulaHighlight = "ΔH = ΔU + Δn_g RT  •  ΔG = ΔH − TΔS  •  ΔG° = −RT ln K_eq",
            keyConceptsSummary = "IUPAC sign convention (ΔU = q + w), reversible vs irreversible isothermal/adiabatic work, thermochemistry and Born-Haber cycle, entropy changes, and Gibbs free energy spontaneity.",
            detailedStudyNotes = """
                1. First Law & Work in Chemical Thermodynamics
                • ΔU = q + w, where w = −∫ P_ext dV.
                • Reversible isothermal expansion of ideal gas: w_rev = −nRT ln(V₂/V₁), ΔU = 0, ΔH = 0, q = −w_rev.
                • Relation between enthalpy and internal energy of reaction: Δ_r H = Δ_r U + (Δn_g) RT.

                2. Second Law, Entropy & Gibbs Energy
                • Entropy change of ideal gas: ΔS_sys = n C_V,m ln(T₂/T₁) + n R ln(V₂/V₁).
                • Gibbs-Helmholtz Spontaneity: ΔG = ΔH − TΔS < 0 for spontaneous process at constant T, P.
                • Standard Gibbs Free Energy and Equilibrium: ΔG° = −RT ln K_eq = −2.303 RT log₁₀ K_eq.
            """.trimIndent(),
            videoTitle = "Reversible vs Irreversible Work, Thermochemistry & Gibbs Free Energy",
            videoDurationLabel = "39:15",
            videoInstructor = "Dr. Meera Krishnan (IISER Thiruvananthapuram)",
            videoKeyTakeaways = "Comparing |w_rev| > |w_irrev| in expansion • Resonance energy from hydrogenation data • Crossover temperature T = ΔH/ΔS",
            isVideoCompleted = true
        ),
        ChapterEntity(
            id = "chem_ch_8",
            subject = "Chemistry",
            examTag = "IISER IAT",
            chapterNumber = 8,
            title = "Equilibrium",
            subtitle = "Chemical Equilibrium (K_p, K_c), Le Chatelier's Principle, Acids/Bases, Buffers & K_sp",
            totalLessons = 7,
            completedLessons = 5,
            studyNotesCount = 11,
            practiceQuestionCount = 28,
            durationMinutes = 60,
            formulaHighlight = "K_p = K_c(RT)^Δn_g  •  pH = pK_a + log([Salt]/[Acid])  •  K_sp = x^x y^y s^(x+y)",
            keyConceptsSummary = "Law of mass action, degree of dissociation from vapor density, Le Chatelier's principle, Ostwald's dilution law, pH of buffers and hydrolyzed salts, and solubility product with common-ion effect.",
            detailedStudyNotes = """
                1. Chemical Equilibrium & Le Chatelier's Principle
                • K_p = K_c (RT)^(Δn_g); Vapor density degree of dissociation: α = (D − d) / [(n − 1)d].
                • Adding inert gas at constant V has no effect; at constant P, equilibrium shifts toward greater number of gas moles.

                2. Ionic Equilibrium: pH, Buffers & Solubility
                • Salt of weak acid + strong base: pH = 7 + ½(pK_a + log C).
                • Salt of weak acid + weak base: pH = 7 + ½(pK_a − pK_b) (independent of concentration C).
                • Henderson-Hasselbalch Equation: pH = pK_a + log₁₀([A⁻]/[HA]); maximum buffer capacity occurs when [A⁻] = [HA] (pH = pK_a).
            """.trimIndent(),
            videoTitle = "Buffer Titration Curves, Salt Hydrolysis & Selective Precipitation",
            videoDurationLabel = "42:30",
            videoInstructor = "Dr. Meera Krishnan (IISER Thiruvananthapuram)",
            videoKeyTakeaways = "Isoelectric pH of amphiprotic ions (HCO₃⁻, amino acids) = ½(pK_a1 + pK_a2) • Simultaneous solubility with common ion",
            isVideoCompleted = true
        ),
        ChapterEntity(
            id = "chem_ch_9",
            subject = "Chemistry",
            examTag = "IISER IAT",
            chapterNumber = 9,
            title = "Redox Reactions",
            subtitle = "Oxidation Number Rules, Disproportionation, Ion-Electron Balancing & Redox Titrations",
            totalLessons = 4,
            completedLessons = 3,
            studyNotesCount = 6,
            practiceQuestionCount = 18,
            durationMinutes = 35,
            formulaHighlight = "Eq. Wt = M₀ / n-factor  •  n_eq(Oxidant) = n_eq(Reductant)",
            keyConceptsSummary = "Special oxidation states (peroxide linkages in CrO₅, H₂SO₅, H₂S₂O₈), disproportionation vs comproportionation, half-reaction balancing, n-factor calculations, and iodometric/permanganometric titrations.",
            detailedStudyNotes = """
                1. Structural Oxidation States & Special Peroxides
                • CrO₅ (butterfly structure, two peroxo rings): Cr is in +6 oxidation state.
                • Caro's acid (H₂SO₅) and Marshall's acid (H₂S₂O₈): S is in +6 oxidation state.
                • Bleaching powder (CaOCl₂): Contains Cl⁻ (−1) and OCl⁻ (+1); Br₃O₈ has terminal Br (+6) and central Br (+4).

                2. Equivalent Concept & Disproportionation n-Factor
                • For disproportionation where 1 molecule goes from oxidation state x → y (n₁ e⁻ lost) and x → z (n₂ e⁻ gained):
                  n_eq = (n₁ × n₂) / (n₁ + n₂).
            """.trimIndent(),
            videoTitle = "Peroxide Oxidation States, Disproportionation n-Factors & Back Titrations",
            videoDurationLabel = "29:10",
            videoInstructor = "Dr. Meera Krishnan (IISER Thiruvananthapuram)",
            videoKeyTakeaways = "n-factor of Cu₂S, Fe₀.₉₃O, and I₂/S₂O₃²⁻ iodometry • Hardness of water & Winkler's dissolved oxygen method",
            isVideoCompleted = false
        ),
        ChapterEntity(
            id = "chem_ch_10",
            subject = "Chemistry",
            examTag = "IISER IAT",
            chapterNumber = 10,
            title = "Solutions",
            subtitle = "Henry's Law, Raoult's Law, Ideal/Non-Ideal Solutions, Colligative Properties & van 't Hoff Factor",
            totalLessons = 5,
            completedLessons = 4,
            studyNotesCount = 8,
            practiceQuestionCount = 22,
            durationMinutes = 45,
            formulaHighlight = "P_total = P_A° x_A + P_B° x_B  •  ΔT_b = i K_b m  •  π = i C R T",
            keyConceptsSummary = "Henry's law for gas solubility, Raoult's law and vapor-phase mole fraction y_A, positive/negative deviations and azeotropes, all four colligative properties, and van 't Hoff factor i for association/dissociation.",
            detailedStudyNotes = """
                1. Raoult's Law & Vapor Phase Composition
                • Liquid phase: P_T = P_A° x_A + P_B° x_B.
                • Vapor phase (Dalton's Law): y_A = P_A / P_T = (P_A° x_A) / P_T  ⇒  1/P_T = y_A/P_A° + y_B/P_B°.

                2. Colligative Properties & van 't Hoff Factor (i)
                • Relative Lowering of Vapor Pressure: (P° − P_s)/P° = i x_solute.
                • Elevation in Boiling Point: ΔT_b = i K_b m; Depression in Freezing Point: ΔT_f = i K_f m; Osmotic Pressure: π = i C R T.
                • Dissociation (A → n Ions): i = 1 + (n − 1)α; Association (n A → A_n): i = 1 + (1/n − 1)α.
            """.trimIndent(),
            videoTitle = "Raoult-Dalton Vapor Plots, Azeotropes & van 't Hoff Colligative Math",
            videoDurationLabel = "34:50",
            videoInstructor = "Dr. Meera Krishnan (IISER Thiruvananthapuram)",
            videoKeyTakeaways = "Dimerization of benzoic acid in benzene (i ≈ 0.5) vs ionization in water • Isotonic solutions",
            isVideoCompleted = true
        ),
        ChapterEntity(
            id = "chem_ch_11",
            subject = "Chemistry",
            examTag = "IISER IAT",
            chapterNumber = 11,
            title = "Electrochemistry",
            subtitle = "Galvanic Cells, Nernst Equation, Gibbs Energy, Kohlrausch's Law & Faraday's Laws of Electrolysis",
            totalLessons = 6,
            completedLessons = 4,
            studyNotesCount = 9,
            practiceQuestionCount = 24,
            durationMinutes = 55,
            formulaHighlight = "E_cell = E°_cell − (0.0591/n) log Q  •  Λ°_m = ν₊ λ°₊ + ν₋ λ°₋  •  W = (E · I · t) / 96500",
            keyConceptsSummary = "Standard reduction potentials, Latimer diagrams, Nernst equation and concentration cells, molar conductivity and Kohlrausch's law of independent migration, and quantitative electrolysis.",
            detailedStudyNotes = """
                1. Nernst Equation & Thermodynamic Relations
                • ΔG° = −n F E°_cell; when combining two half-reactions (1 + 2 = 3), add ΔG° (not E° directly): n₃ E°₃ = n₁ E°₁ + n₂ E°₂.
                • At 298 K: E_cell = E°_cell − (0.0591 / n) log₁₀ Q; at equilibrium E_cell = 0 ⇒ E°_cell = (0.0591 / n) log₁₀ K_eq.
                • Temperature coefficient: ΔS° = n F (∂E_cell / ∂T)_P.

                2. Electrolytic Conductance & Faraday's Laws
                • Molar conductivity Λ_m = (κ × 1000) / M; Degree of dissociation α = Λ_m / Λ°_m; K_a = C α² / (1 − α).
                • Faraday's First & Second Laws: Moles of substance deposited/liberated = (I · t) / (n · F).
            """.trimIndent(),
            videoTitle = "Nernst Concentration Cells, Kohlrausch Conductometric Titrations & Electrolysis",
            videoDurationLabel = "40:10",
            videoInstructor = "Dr. Meera Krishnan (IISER Thiruvananthapuram)",
            videoKeyTakeaways = "Predicting anode/cathode products of aqueous NaCl, CuSO₄, and AgNO₃ • Conductometric titration graphs",
            isVideoCompleted = false
        ),
        ChapterEntity(
            id = "chem_ch_12",
            subject = "Chemistry",
            examTag = "IISER IAT",
            chapterNumber = 12,
            title = "Chemical Kinetics",
            subtitle = "Rate Laws, Order & Molecularity, Integrated Zero/First-Order Equations & Arrhenius Theory",
            totalLessons = 6,
            completedLessons = 4,
            studyNotesCount = 9,
            practiceQuestionCount = 24,
            durationMinutes = 50,
            formulaHighlight = "k₁ = (2.303/t) log([A]₀/[A]_t)  •  t_{1/2} = 0.693/k  •  k = A e^(−E_a / RT)",
            keyConceptsSummary = "Differential and integrated rate laws for zero, first, and nth order reactions, gas-phase pressure kinetics, parallel and sequential first-order reactions, steady-state approximation, and Arrhenius temperature dependence.",
            detailedStudyNotes = """
                1. Integrated Rate Laws & Half-Lives
                • Zero Order: [A]_t = [A]₀ − kt; t_{1/2} = [A]₀ / (2k); completion time t_100% = [A]₀ / k.
                • First Order: [A]_t = [A]₀ e^(−kt); t_{1/2} = ln(2)/k = 0.693/k (independent of initial concentration); t_99.9% = 10 × t_{1/2}.
                • General nth Order: t_{1/2} ∝ [A]₀^(1 − n).

                2. Arrhenius Equation & Parallel First-Order Pathways
                • ln(k₂ / k₁) = (E_a / R)(1/T₁ − 1/T₂).
                • For A → B (k₁) and A → C (k₂): k_eff = k₁ + k₂, E_a(eff) = (k₁ E_a1 + k₂ E_a2) / (k₁ + k₂), and [B]/[C] = k₁ / k₂ at any time t.
            """.trimIndent(),
            videoTitle = "Gas-Phase Pressure Kinetics, Parallel Pathways & Steady-State Approximation",
            videoDurationLabel = "38:45",
            videoInstructor = "Dr. Meera Krishnan (IISER Thiruvananthapuram)",
            videoKeyTakeaways = "t_3/4 = 2 × t_1/2 for first order • Deriving rate laws from pre-equilibrium vs steady-state mechanisms",
            isVideoCompleted = true
        ),
        ChapterEntity(
            id = "chem_ch_13",
            subject = "Chemistry",
            examTag = "IISER IAT",
            chapterNumber = 13,
            title = "Organic Chemistry – Some Basic Principles and Techniques",
            subtitle = "IUPAC Nomenclature, Electronic Effects (I, M, H), Aromaticity, Stereoisomerism & Purification",
            totalLessons = 7,
            completedLessons = 5,
            studyNotesCount = 11,
            practiceQuestionCount = 28,
            durationMinutes = 60,
            formulaHighlight = "Hückel (4n + 2) π e⁻  •  DBE = C + 1 − (H + X − N)/2  •  %N (Kjeldahl) = 1.4 N V / W",
            keyConceptsSummary = "Inductive, resonance/mesomeric, and hyperconjugation effects, carbocation/carbanion/radical stability, acidity and basicity orders, Hückel aromaticity, E/Z and R/S stereochemistry, and Lassaigne/Dumas/Kjeldahl analysis.",
            detailedStudyNotes = """
                1. Electronic Effects, Aromaticity & Intermediate Stability
                • Aromaticity (Hückel Rule): Cyclic, planar, sp²/sp fully conjugated system with (4n + 2) π electrons (e.g., tropylium cation 6π, cyclopentadienyl anion 6π).
                • Anti-aromatic: Cyclic, planar, fully conjugated with 4n π electrons (extremely unstable, e.g., cyclobutadiene, cyclopentadienyl cation).
                • Ortho Effect: Ortho-substituted benzoic acids are stronger acids than benzoic acid due to steric inhibition of resonance (SIR).

                2. Stereochemistry & Quantitative Elemental Analysis
                • CIP Priority (R/S and E/Z): Higher atomic number > higher mass isotope; Meso compounds have chiral centers + plane/center of symmetry (optically inactive).
                • Dumas Method (%N via N₂ gas); Kjeldahl Method (%N via NH₃ — not applicable to nitro, azo, or pyridine rings).
            """.trimIndent(),
            videoTitle = "Aromaticity, Acid-Base pKa Trends, R/S Projections & Organic Estimation",
            videoDurationLabel = "45:20",
            videoInstructor = "Prof. Vikramaditya Sen (IISER Kolkata)",
            videoKeyTakeaways = "Fischer-Newman interconversion • Comparing basicity of aniline derivatives • Carius & Kjeldahl calculations",
            isVideoCompleted = true,
            lastAccessedTimestamp = System.currentTimeMillis() - 1_900_000L
        ),
        ChapterEntity(
            id = "chem_ch_14",
            subject = "Chemistry",
            examTag = "IISER IAT",
            chapterNumber = 14,
            title = "Hydrocarbons",
            subtitle = "Conformations, Alkene/Alkyne Additions, Ozonolysis, Stereospecific Reactions & EAS in Arenes",
            totalLessons = 6,
            completedLessons = 4,
            studyNotesCount = 9,
            practiceQuestionCount = 24,
            durationMinutes = 50,
            formulaHighlight = "Syn + Cis → Erythro (Meso)  •  Anti + Trans → Erythro (Meso)",
            keyConceptsSummary = "Newman conformations of ethane/butane, Wurtz & Kolbe electrolysis, Markovnikov vs Kharasch peroxide addition, oxymercuration vs hydroboration-oxidation, ozonolysis, and Electrophilic Aromatic Substitution (EAS).",
            detailedStudyNotes = """
                1. Stereospecific Alkene Additions & Ozonolysis
                • Syn-addition (H₂/Pd, cold dilute KMnO₄, OsO₄, BH₃·THF/H₂O₂) vs Anti-addition (Br₂/CCl₄, peracid RCO₃H/H₃O⁺).
                • Mnemonic (CIS-SYN-ERYTHRO / CAR-TRANS-ANTI-RAC): Cis-2-butene + anti-Br₂ → (±)-2,3-dibromobutane (racemic); Trans-2-butene + anti-Br₂ → meso-2,3-dibromobutane.
                • Reductive Ozonolysis (O₃, then Zn/H₂O or Me₂S) cleaves C=C into aldehydes/ketones; Oxidative Ozonolysis (O₃/H₂O₂) oxidizes aldehydes further to carboxylic acids.

                2. Alkynes & Electrophilic Aromatic Substitution (EAS)
                • Alkyne Reduction: Lindlar's catalyst (H₂/Pd-CaCO₃) → cis-alkene; Birch reduction (Na/liq. NH₃) → trans-alkene.
                • EAS Directing Groups: −OH, −NH₂, −OR, −R are o/p-directing activators; −Halogens are o/p-directing deactivators; −NO₂, −CN, −CHO, −COOH are m-directing deactivators.
            """.trimIndent(),
            videoTitle = "Alkene Stereospecificity, Ozonolysis Roadmaps & Aromatic Substitution",
            videoDurationLabel = "39:30",
            videoInstructor = "Prof. Vikramaditya Sen (IISER Kolkata)",
            videoKeyTakeaways = "Carbocation rearrangement in H⁺/H₂O vs no rearrangement in OM-DM and HBO • Friedel-Crafts limitations",
            isVideoCompleted = false
        ),
        ChapterEntity(
            id = "chem_ch_15",
            subject = "Chemistry",
            examTag = "IISER IAT",
            chapterNumber = 15,
            title = "Haloalkanes and haloarenes",
            subtitle = "SN1, SN2, E1, E2, E1cB Mechanisms, Stereochemical Outcomes, Grignard Reagents & Polyhalogen Compounds",
            totalLessons = 6,
            completedLessons = 4,
            studyNotesCount = 9,
            practiceQuestionCount = 24,
            durationMinutes = 50,
            formulaHighlight = "SN2: Rate = k[RX][Nu⁻] (Inversion)  •  SN1: Rate = k[RX] (Racemization)",
            keyConceptsSummary = "SN2 backside attack vs SN1 carbocation mechanism, Zaitsev vs Hofmann E2 elimination, ambident nucleophiles (CN⁻/NC, NO₂⁻/ONO⁻), SNAr in haloarenes, and Grignard reagent reactions.",
            detailedStudyNotes = """
                1. Nucleophilic Substitution (SN1 vs SN2) & Ambident Nucleophiles
                • SN2: 1° > 2° > 3° RX; concerted transition state with 100% Walden inversion; accelerated by polar aprotic solvents (DMSO, DMF, acetone).
                • SN1: 3° > 2° > 1° RX (driven by carbocation stability, allylic/benzylic fast); partial racemization + rearrangement; favored by polar protic solvents.
                • Ambident Nucleophiles: RX + KCN → R–CN (nitrile); RX + AgCN → R–NC (isonitrile); RX + KNO₂ → R–ONO; RX + AgNO₂ → R–NO₂.

                2. Eliminations (E2 vs E1) & Aryl Halide Reactivity
                • E2 requires anti-periplanar geometry (H and X at 180° dihedral angle). Bulky base (t-BuOK) favors less substituted Hofmann alkene; unhindered alc. KOH favors Zaitsev alkene.
                • Haloarenes resist SN1/SN2 due to partial C=C double-bond character and sp² carbon; electron-withdrawing −NO₂ groups at ortho/para positions enable SNAr via Meisenheimer complex.
            """.trimIndent(),
            videoTitle = "SN1/SN2/E1/E2 Competition Matrix & Anti-Periplanar Cyclohexane E2",
            videoDurationLabel = "38:15",
            videoInstructor = "Prof. Vikramaditya Sen (IISER Kolkata)",
            videoKeyTakeaways = "Diaxial requirement for E2 in substituted cyclohexanes • Finkelstein & Swarts halogen exchange",
            isVideoCompleted = true
        ),
        ChapterEntity(
            id = "chem_ch_16",
            subject = "Chemistry",
            examTag = "IISER IAT",
            chapterNumber = 16,
            title = "Alcohols, phenols, and ethers",
            subtitle = "Acidity of Phenols, Lucas Test, Pinacol Rearrangement, Reimer-Tiemann, Kolbe's & Williamson Synthesis",
            totalLessons = 6,
            completedLessons = 3,
            studyNotesCount = 9,
            practiceQuestionCount = 22,
            durationMinutes = 50,
            formulaHighlight = "Williamson: R'O⁻ + 1° R–X → R'–O–R (SN2)  •  Phenol + Br₂(aq) → 2,4,6-Tribromophenol",
            keyConceptsSummary = "Hydroboration/oxymercuration/Grignard synthesis of alcohols, Lucas reagent differentiation, PCC vs Jones oxidation, cumene hydroperoxide phenol synthesis, Reimer-Tiemann & Kolbe-Schmitt reactions, and HI cleavage of ethers.",
            detailedStudyNotes = """
                1. Alcohol Reactions & Phenol Name Reactions
                • Selective Oxidation: 1° Alcohol + PCC/PDC (in CH₂Cl₂) → Aldehyde; 1° Alcohol + KMnO₄ or Jones reagent (CrO₃/H₂SO₄) → Carboxylic Acid.
                • Reimer-Tiemann Reaction: Phenol + CHCl₃ + aq. NaOH → Salicylaldehyde (electrophile is singlet dichlorocarbene :CCl₂).
                • Kolbe's Reaction: Sodium phenoxide + CO₂ (400 K, 4–7 atm), then H⁺ → Salicylic acid (aspirin precursor on acetylation).

                2. Williamson Ether Synthesis & Acidic Cleavage of Ethers
                • Williamson Synthesis (SN2): Use 1° alkyl halide + 3° alkoxide (e.g., t-BuO⁻Na⁺ + CH₃Br → t-Bu–O–CH₃); using 3° RX gives E2 alkene instead.
                • Cleavage of R–O–R' with anhydrous HI: If 1°/2° groups → SN2 (I⁻ attacks smaller group); if 3° or benzyl group present → SN1 (forms 3°/benzyl iodide). Anisole (Ph–O–CH₃) + HI always gives Phenol + CH₃I.
            """.trimIndent(),
            videoTitle = "Reimer-Tiemann Mechanism, Pinacol Rearrangement & Ether HI Cleavage",
            videoDurationLabel = "37:40",
            videoInstructor = "Prof. Vikramaditya Sen (IISER Kolkata)",
            videoKeyTakeaways = "Why Phenol + Br₂/CS₂ gives p-bromophenol vs Br₂/H₂O gives 2,4,6-tribromophenol • Anhydrous vs conc. HI with ethers",
            isVideoCompleted = false
        ),
        ChapterEntity(
            id = "chem_ch_17",
            subject = "Chemistry",
            examTag = "IISER IAT",
            chapterNumber = 17,
            title = "Aldehydes, ketones, and carboxylic acids",
            subtitle = "Nucleophilic Addition, Aldol & Cannizzaro, Haloform, Clemmensen/Wolff-Kishner & HVZ Reaction",
            totalLessons = 7,
            completedLessons = 4,
            studyNotesCount = 11,
            practiceQuestionCount = 28,
            durationMinutes = 60,
            formulaHighlight = "Aldol: α-H required (dil. OH⁻)  •  Cannizzaro: No α-H (conc. OH⁻)  •  Iodoform: CH₃C=O / CH₃CH(OH)",
            keyConceptsSummary = "Rosenmund, Stephen, Etard, and Gattermann-Koch syntheses, nucleophilic addition reactivity, Aldol/Cross-Aldol condensation, Cannizzaro disproportionation, Tollens/Fehling/Iodoform tests, and carboxylic acid acidity/HVZ reaction.",
            detailedStudyNotes = """
                1. Carbonyl Nucleophilic Addition & Name Condensations
                • Reactivity toward nucleophilic addition (steric + electronic): HCHO > CH₃CHO > PhCHO > CH₃COCH₃ > PhCOCH₃ > PhCOPh.
                • Aldol Condensation: Aldehydes/ketones having at least one α-H with dilute NaOH form β-hydroxy carbonyl → α,β-unsaturated carbonyl upon heating.
                • Cannizzaro Reaction: Aldehydes lacking α-H (HCHO, PhCHO, Me₃C–CHO) with conc. NaOH (50%) disproportionate into alcohol + carboxylate salt. In Cross-Cannizzaro with HCHO, HCHO is always oxidized to HCOONa.

                2. Diagnostic Tests, Reductions & Carboxylic Acids
                • Tollens' Reagent ([Ag(NH₃)₂]⁺): Oxidizes aliphatic and aromatic aldehydes (and HCOOH) to silver mirror. Fehling's Solution: Oxidizes aliphatic aldehydes (NOT PhCHO) to red Cu₂O.
                • Iodoform Test (I₂/NaOH): Yellow CHI₃ precipitate given by methyl ketones (R–CO–CH₃), acetaldehyde, ethanol, and 2-alkanols (R–CH(OH)–CH₃).
                • Clemmensen (Zn-Hg/conc. HCl, acidic) vs Wolff-Kishner (NH₂NH₂/KOH/ethylene glycol, basic) reduce >C=O to >CH₂.
            """.trimIndent(),
            videoTitle = "Aldol vs Cannizzaro Mastery, Selective Reductions & Diagnostic Tests",
            videoDurationLabel = "44:50",
            videoInstructor = "Prof. Vikramaditya Sen (IISER Kolkata)",
            videoKeyTakeaways = "Intramolecular aldol ring sizes (5- and 6-membered favored) • Choosing Clemmensen vs Wolff-Kishner for acid/base-sensitive substrates",
            isVideoCompleted = true
        ),
        ChapterEntity(
            id = "chem_ch_18",
            subject = "Chemistry",
            examTag = "IISER IAT",
            chapterNumber = 18,
            title = "Organic compounds containing nitrogen",
            subtitle = "Amine Basicity in Gas/Aqueous Phase, Gabriel Phthalimide, Hoffmann Bromamide, Hinsberg & Diazonium Salts",
            totalLessons = 5,
            completedLessons = 3,
            studyNotesCount = 8,
            practiceQuestionCount = 22,
            durationMinutes = 45,
            formulaHighlight = "Aq. Basicity (Et): 2° > 3° > 1° > NH₃  •  Aq. Basicity (Me): 2° > 1° > 3° > NH₃",
            keyConceptsSummary = "Aqueous vs gas-phase basicity of amines, Gabriel phthalimide and Hoffmann bromamide degradation, Carbylamine and Hinsberg tests, and Sandmeyer/Gattermann/azo-coupling reactions of benzene diazonium chloride.",
            detailedStudyNotes = """
                1. Amine Synthesis, Basicity & Distinction Tests
                • Gas-phase basicity: 3° > 2° > 1° > NH₃ (pure +I effect). In aqueous solution (interplay of +I, solvation H-bonding, and steric hindrance):
                  For R = −C₂H₅: Et₂NH (2°) > Et₃N (3°) > EtNH₂ (1°) > NH₃.
                  For R = −CH₃: Me₂NH (2°) > MeNH₂ (1°) > Me₃N (3°) > NH₃.
                • Hoffmann Bromamide Degradation: R–CONH₂ + Br₂ + 4 NaOH → R–NH₂ (1° amine with one fewer carbon; proceeds via nitrene/isocyanate with retention of configuration).
                • Gabriel Phthalimide Synthesis: Prepares pure aliphatic 1° amines (cannot prepare aniline because aryl halides do not undergo SN2 with phthalimide anion).

                2. Hinsberg Test, Carbylamine & Diazonium Chemistry
                • Carbylamine Reaction: Only 1° amines (aliphatic or aromatic) + CHCl₃ + alc. KOH → foul-smelling isocyanide (R–NC).
                • Hinsberg Reagent (PhSO₂Cl): 1° amine → sulfonamide soluble in aq. KOH; 2° amine → insoluble sulfonamide; 3° amine → no reaction.
                • Benzene Diazonium Chloride (PhN₂⁺Cl⁻): + H₃PO₂ or EtOH → Benzene; + Cu₂Cl₂/HCl → PhCl (Sandmeyer); + KI → PhI; + HBF₄/Δ → PhF (Balz-Schiemann).
            """.trimIndent(),
            videoTitle = "Aqueous Amine Basicity, Hoffmann Rearrangement & Diazonium Roadmaps",
            videoDurationLabel = "36:20",
            videoInstructor = "Prof. Vikramaditya Sen (IISER Kolkata)",
            videoKeyTakeaways = "Protecting −NH₂ via acetylation before bromination/nitration • Azo dye coupling pH conditions (phenol pH 9–10 vs aniline pH 4–5)",
            isVideoCompleted = false
        ),
        ChapterEntity(
            id = "chem_ch_19",
            subject = "Chemistry",
            examTag = "IISER IAT",
            chapterNumber = 19,
            title = "Biomolecules",
            subtitle = "Carbohydrates (Anomers, Mutarotation, Reducing Sugars), Amino Acids (pI), Proteins, Enzymes & Nucleic Acids",
            totalLessons = 5,
            completedLessons = 3,
            studyNotesCount = 8,
            practiceQuestionCount = 20,
            durationMinutes = 45,
            formulaHighlight = "pI (neutral AA) = ½(pK_a1 + pK_a2)  •  Chargaff: [A] = [T], [G] = [C]",
            keyConceptsSummary = "D/L-Glucose reactions (HI, Br₂ water, HNO₃), α/β anomers and mutarotation, reducing vs non-reducing disaccharides (sucrose, maltose, lactose), zwitterions and isoelectric point, protein structures, vitamins, and DNA/RNA base pairing.",
            detailedStudyNotes = """
                1. Carbohydrates: Glucose Reactions, Epimers & Glycosidic Linkages
                • D-Glucose + HI/Δ → n-Hexane (proves straight 6-carbon chain); + Br₂ water → D-Gluconic acid; + conc. HNO₃ → D-Saccharic acid.
                • Epimers of D-Glucose: C-2 epimer is D-Mannose; C-4 epimer is D-Galactose. α- and β-D-glucopyranose are C-1 diastereomers called Anomers.
                • Sucrose (α-D-glucose C1 – β-D-fructose C2): Non-reducing sugar, does NOT show mutarotation, dextrorotatory (+66.5°) but gives levorotatory invert sugar (−20°) on hydrolysis. Maltose (α-1,4) and Lactose (β-1,4) are reducing sugars.

                2. Amino Acids, Proteins, Vitamins & Nucleic Acids
                • Essential Amino Acids (PVT TIM HALL): Phenylalanine, Valine, Threonine, Tryptophan, Isoleucine, Methionine, Histidine, Arginine, Leucine, Lysine. Glycine is the only achiral proteinogenic amino acid.
                • Isoelectric Point (pI): At pH = pI, amino acid exists as dipolar zwitterion with zero net migration in an electric field.
                • Nucleic Acids: DNA contains β-D-2-deoxyribose and bases A, G, C, T (A=T has 2 H-bonds; G≡C has 3 H-bonds); RNA contains β-D-ribose and A, G, C, U.
            """.trimIndent(),
            videoTitle = "Carbohydrate Haworth Projections, Amino Acid pI & Nucleic Acid Chemistry",
            videoDurationLabel = "35:15",
            videoInstructor = "Dr. Rohini Deshmukh (IISER Bhopal)",
            videoKeyTakeaways = "Distinguishing reducing vs non-reducing sugars (hemiacetal test) • Calculating pI for acidic (Asp, Glu) and basic (Lys, Arg, His) amino acids",
            isVideoCompleted = false
        ),

        // ==================== BIOLOGY (16 CHAPTERS - IISER IAT) ====================
        ChapterEntity(
            id = "bio_ch_1",
            subject = "Biology",
            examTag = "IISER IAT",
            chapterNumber = 1,
            title = "The Living World",
            subtitle = "Taxonomic Hierarchy, Binomial Nomenclature, ICBN/ICZN Rules & Biodiversity",
            totalLessons = 4,
            completedLessons = 4,
            studyNotesCount = 6,
            practiceQuestionCount = 16,
            durationMinutes = 35,
            formulaHighlight = "Kingdom → Phylum/Division → Class → Order → Family → Genus → Species",
            keyConceptsSummary = "Defining vs non-defining properties of living organisms, Carolus Linnaeus binomial nomenclature rules, obligate taxonomic categories, and taxonomic aids.",
            detailedStudyNotes = """
                1. Defining Characteristics of Living Organisms
                • Growth and reproduction are NOT defining properties (non-living mountains grow by accretion; sterile worker bees, mules, and infertile humans do not reproduce).
                • Cellular organization, metabolism (anabolism + catabolism), and consciousness (ability to sense environment and respond) are defining properties without exception.

                2. Binomial Nomenclature & Taxonomic Hierarchy
                • Proposed by Carolus Linnaeus (Systema Naturae). Generic name starts with a capital letter; specific epithet starts with a lowercase letter; printed in italics or underlined separately when handwritten.
                • Taxonomic Hierarchy (ascending): Species (basic unit, Ernst Mayr's biological species concept) → Genus → Family (ends in -aceae in plants) → Order (ends in -ales in plants) → Class → Phylum (animals) / Division (plants) → Kingdom.
                • Moving from Species to Kingdom, the number of common characteristics decreases while taxonomic generality increases.
            """.trimIndent(),
            videoTitle = "Defining Properties of Life, ICBN/ICZN Rules & Taxonomic Hierarchy",
            videoDurationLabel = "26:40",
            videoInstructor = "Dr. Rohini Deshmukh (IISER Bhopal)",
            videoKeyTakeaways = "Distinguishing defining vs non-defining life features • Standard suffixes (-ales, -aceae) in plant taxonomy",
            isVideoCompleted = true,
            lastAccessedTimestamp = System.currentTimeMillis() - 5_000_000L
        ),
        ChapterEntity(
            id = "bio_ch_2",
            subject = "Biology",
            examTag = "IISER IAT",
            chapterNumber = 2,
            title = "Biological Classification",
            subtitle = "Whittaker's Five Kingdoms, Monera, Protista, Fungi, Viruses, Viroids & Prions",
            totalLessons = 5,
            completedLessons = 4,
            studyNotesCount = 8,
            practiceQuestionCount = 22,
            durationMinutes = 45,
            formulaHighlight = "5 Kingdoms: Monera (Prokaryotic) • Protista • Fungi (Chitin) • Plantae • Animalia",
            keyConceptsSummary = "Archaebacteria vs Eubacteria, Chrysophytes/Dinoflagellates/Euglenoids/Slime Moulds, Phycomycetes/Ascomycetes/Basidiomycetes/Deuteromycetes, and acellular pathogens.",
            detailedStudyNotes = """
                1. Monera & Protista
                • Archaebacteria: Differ from eubacteria in having branched-chain membrane lipids and lacking peptidoglycan (pseudomurein cell wall), enabling survival in extreme habitats (halophiles, thermoacidophiles, methanogens).
                • Cyanobacteria (BGA): Oxygenic photoautotrophs; fix atmospheric N₂ in specialized thick-walled cells called heterocysts (e.g., Nostoc, Anabaena). Mycoplasma are the smallest living cells and completely lack a cell wall (resistant to penicillin).
                • Protista: Diatoms have silica-embedded indestructible soap-box cell walls (diatomaceous earth); Dinoflagellates (Gonyaulax causes red tides); Euglenoids have a proteinaceous pellicle and mixotrophic nutrition.

                2. Fungi (Mycota) & Acellular Entities
                • Fungal Classes: Phycomycetes (aseptate, coenocytic mycelium; Rhizopus, Mucor, Albugo), Ascomycetes (sac fungi; endogenous ascospores + exogenous conidia; Neurospora, Aspergillus, Claviceps), Basidiomycetes (club fungi; dikaryotic phase n+n, exogenous basidiospores, no sex organs; Agaricus, Puccinia, Ustilago), Deuteromycetes (fungi imperfecti; sexual stage absent; Alternaria, Colletotrichum, Trichoderma).
                • Viruses, Viroids & Prions: Viruses are nucleoproteins (TMV has ssRNA + capsomeres; bacteriophages usually have dsDNA). Viroids (T.O. Diener) are free low-molecular-weight infectious RNA lacking a protein coat (potato spindle tuber disease). Prions are abnormally folded infectious proteins (BSE, CJD).
            """.trimIndent(),
            videoTitle = "Fungal Life Cycles, Dikaryophase & Acellular Pathogens (Viruses/Viroids/Prions)",
            videoDurationLabel = "34:15",
            videoInstructor = "Dr. Rohini Deshmukh (IISER Bhopal)",
            videoKeyTakeaways = "Endogenous ascospores vs exogenous basidiospores • Why Mycoplasma is insensitive to β-lactam antibiotics",
            isVideoCompleted = true,
            lastAccessedTimestamp = System.currentTimeMillis() - 12_000_000L
        ),
        ChapterEntity(
            id = "bio_ch_3",
            subject = "Biology",
            examTag = "IISER IAT",
            chapterNumber = 3,
            title = "Plant Kingdom",
            subtitle = "Algae (Chloro/Phaeo/Rhodophyceae), Bryophytes, Pteridophytes, Gymnosperms & Life Cycles",
            totalLessons = 6,
            completedLessons = 4,
            studyNotesCount = 9,
            practiceQuestionCount = 24,
            durationMinutes = 50,
            formulaHighlight = "Chl a+b (Starch) • Chl a+c (Mannitol/Laminarin) • Chl a+d (Floridean Starch)",
            keyConceptsSummary = "Pigments and reserve food in algae, gametophyte-dominant bryophytes, heterospory and seed habit in pteridophytes, naked-seeded gymnosperms, and haplontic/diplontic/haplo-diplontic alternation.",
            detailedStudyNotes = """
                1. Algae Classification & Reserve Food
                • Chlorophyceae (Green Algae): Chlorophyll a, b; cell wall of cellulose + pectose; pyrenoids store starch besides protein; 2–8 equal apical flagella (Chlamydomonas, Volvox, Spirogyra).
                • Phaeophyceae (Brown Algae): Chlorophyll a, c, fucoxanthin; food stored as laminarin and mannitol; cell wall cellulose + algin; 2 unequal lateral flagella (Ectocarpus, Dictyota, Laminaria, Sargassum, Fucus).
                • Rhodophyceae (Red Algae): Chlorophyll a, d, r-phycoerythrin; food stored as floridean starch (structurally very similar to amylopectin and glycogen); cellulose + pectin + polysulphate esters (agar from Gelidium and Gracilaria); flagella completely absent (Polysiphonia, Porphyra).

                2. Bryophytes, Pteridophytes & Gymnosperms
                • Bryophytes (Amphibians of Plant Kingdom): Dominant haploid (n) photosynthetic gametophyte; diploid (2n) sporophyte (foot, seta, capsule) is nutritionally dependent on the gametophyte. Gemmae are green, multicellular asexual buds in Marchantia.
                • Pteridophytes: First vascular tracheophytes with dominant diploid (2n) sporophyte. Most are homosporous, whereas Selaginella and Salvinia are heterosporous (precursor to seed habit).
                • Gymnosperms: Ovules are not enclosed by an ovary wall. Endosperm is haploid (n) and formed BEFORE fertilization. Pinus has mycorrhizal roots (monoeceious); Cycas has coralloid roots with N₂-fixing cyanobacteria (dioecious).
                • Life Cycles: Haplontic (Volvox, Spirogyra, Chlamydomonas), Diplontic (Fucus, all Gymnosperms & Angiosperms), Haplo-diplontic (Bryophytes, Pteridophytes, Ectocarpus, Polysiphonia, Kelps).
            """.trimIndent(),
            videoTitle = "Comparative Plant Kingdom: Heterospory, Endosperm Ploidy & Alternation of Generations",
            videoDurationLabel = "38:50",
            videoInstructor = "Dr. Rohini Deshmukh (IISER Bhopal)",
            videoKeyTakeaways = "Haploid gymnosperm endosperm (n) vs triploid angiosperm endosperm (3n) •Exceptions in algal life cycles (Fucus, Ectocarpus, Polysiphonia)",
            isVideoCompleted = false
        ),
        ChapterEntity(
            id = "bio_ch_4",
            subject = "Biology",
            examTag = "IISER IAT",
            chapterNumber = 4,
            title = "Animal Kingdom",
            subtitle = "Basis of Classification, Symmetry, Coelom, Non-Chordate Phyla & Chordata Classes",
            totalLessons = 6,
            completedLessons = 3,
            studyNotesCount = 10,
            practiceQuestionCount = 26,
            durationMinutes = 55,
            formulaHighlight = "Acoelomate (Platyhelminthes) • Pseudocoelomate (Aschelminthes) • Schizocoelom/Enterocoelom",
            keyConceptsSummary = "Levels of organization, coelom types, canal vs water vascular system, metamerism, diagnostic traits from Porifera to Hemichordata, and Urochordata/Cephalochordata/Vertebrata.",
            detailedStudyNotes = """
                1. Basis of Classification & Non-Chordates
                • Symmetry & Coelom: Radial symmetry in Coelenterata, Ctenophora, and adult Echinoderms (larvae are bilateral). Pseudocoelomate: Aschelminthes (nematodes). True Coelomates: Annelida to Chordata.
                • True Metamerism: Present in Annelida, Arthropoda, and Chordata.
                • Key Diagnostic Features:
                  - Porifera: Water canal system (Ostia → Spongocoel → Osculum), choanocytes (collar cells).
                  - Coelenterata (Cnidaria): Cnidoblasts with stinging nematocysts, metagenesis (Polyp ⇌ Medusa in Obelia).
                  - Ctenophora: 8 external rows of ciliated comb plates, bioluminescence, exclusively marine (Pleurobrachia).
                  - Platyhelminthes: Dorso-ventrally flattened, flame cells (protonephridia) for osmoregulation and excretion.
                  - Arthropoda: Chitinous exoskeleton, jointed appendages, malpighian tubules, open circulation.
                  - Echinodermata: Water vascular system (locomotion, food capture, respiration), calcareous endoskeleton, exclusively marine.

                2. Phylum Chordata & Vertebrate Classes
                • Fundamental Chordate Features: Notochord, dorsal hollow nerve cord, paired pharyngeal gill slits, and post-anal tail.
                • Protochordates: Urochordata (notochord only in larval tail: Ascidia, Salpa) and Cephalochordata (notochord head-to-tail throughout life: Branchiostoma/Amphioxus).
                • Vertebrata: Cyclostomata (jawless ectoparasites, 6–15 gill slits: Petromyzon), Chondrichthyes (cartilaginous, placoid scales, ventral mouth, no air bladder, claspers: Scoliodon), Osteichthyes (bony, cycloid/ctenoid scales, operculum, air bladder), Amphibia, Reptilia, Aves (pneumatic bones, warm-blooded), Mammalia (mammary glands, pinnae, diaphragm).
            """.trimIndent(),
            videoTitle = "Water Canal vs Water Vascular System, Coelom Evolution & Chordate Diagnostics",
            videoDurationLabel = "41:20",
            videoInstructor = "Dr. Rohini Deshmukh (IISER Bhopal)",
            videoKeyTakeaways = "Distinguishing Chondrichthyes vs Osteichthyes • Excretory organs across invertebrate phyla",
            isVideoCompleted = false
        ),
        ChapterEntity(
            id = "bio_ch_5",
            subject = "Biology",
            examTag = "IISER IAT",
            chapterNumber = 5,
            title = "Morphology of Flowering Plants",
            subtitle = "Root/Stem/Leaf Modifications, Inflorescence, Aestivation, Placentation & Floral Formulas",
            totalLessons = 5,
            completedLessons = 3,
            studyNotesCount = 8,
            practiceQuestionCount = 22,
            durationMinutes = 45,
            formulaHighlight = "Hypogynous (Superior G̲) • Perigynous (Half-Inferior) • Epigynous (Inferior G̅)",
            keyConceptsSummary = "Homologous vs analogous plant organs, racemose vs cymose inflorescence, aestivation and placentation types, monocot vs dicot seed structure, and Fabaceae/Solanaceae/Liliaceae formulas.",
            detailedStudyNotes = """
                1. Flower Symmetry, Ovary Position, Aestivation & Placentation
                • Ovary Position: Hypogynous (superior ovary: Mustard, China rose, Brinjal), Perigynous (half-inferior ovary: Plum, Rose, Peach), Epigynous (inferior ovary: Guava, Cucumber, ray florets of Sunflower).
                • Aestivation: Valvate (Calotropis), Twisted (China rose, Lady's finger, Cotton), Imbricate (Cassia, Gulmohur), Vexillary/Papilionaceous (1 standard + 2 wings + 2 fused keel petals: Pea, Bean).
                • Placentation: Marginal (Pea), Axile (China rose, Tomato, Lemon), Parietal (Mustard, Argemone — false septum replum), Free-central (Dianthus, Primrose), Basal (Sunflower, Marigold).

                2. Fruit, Seed & Plant Families
                • Drupe (Mango, Coconut): Develops from monocarpellary superior ovary; pericarp differentiated into epicarp, mesocarp (fleshy in mango, fibrous in coconut), and stony hard endocarp.
                • Monocot Seed (Maize): Endospermic; proteinaceous aleurone layer (3n) separates endosperm from embryo; single shield-shaped cotyledon called scutellum; coleoptile covers plumule, coleorhiza covers radicle.
                • Floral Formulas:
                  - Fabaceae: % ⚥ K_(5) C_(1+2+(2)) A_((9)+1) G̲_1 (Diadelphous stamens, marginal placentation).
                  - Solanaceae: ⊕ ⚥ K_(5) Ĉ_(5) A_5 G̲_(2) (Epipetalous stamens, swollen axile placenta).
                  - Liliaceae: Br ⊕ ⚥ P̂_((3+3)) A_(3+3) G̲_(3) (Epiphyllous tepals, tricarpellary syncarpous).
            """.trimIndent(),
            videoTitle = "Aestivation, Placentation Mnemonics & Decoding Angiosperm Floral Formulas",
            videoDurationLabel = "35:10",
            videoInstructor = "Dr. Rohini Deshmukh (IISER Bhopal)",
            videoKeyTakeaways = "Matching examples of aestivation and placentation • Identifying Fabaceae vs Solanaceae vs Liliaceae from floral diagrams",
            isVideoCompleted = false
        ),
        ChapterEntity(
            id = "bio_ch_6",
            subject = "Biology",
            examTag = "IISER IAT",
            chapterNumber = 6,
            title = "Anatomy of Flowering Plants",
            subtitle = "Meristems, Simple & Complex Tissues, Vascular Bundles, Dicot/Monocot Anatomy & Secondary Growth",
            totalLessons = 5,
            completedLessons = 2,
            studyNotesCount = 8,
            practiceQuestionCount = 20,
            durationMinutes = 45,
            formulaHighlight = "Root: Radial & Exarch  •  Stem: Conjoint & Endarch  •  Periderm = Phellogen + Phellem + Phelloderm",
            keyConceptsSummary = "Xylem and phloem elements, stomatal apparatus, radial vs conjoint vascular bundles, Kranz/bulliform leaf anatomy, and vascular/cork cambium activity.",
            detailedStudyNotes = """
                1. Plant Tissues & Vascular Bundle Organization
                • Complex Tissues: Xylem (tracheids, vessels, xylem fibres, xylem parenchyma — vessels are characteristic of angiosperms and absent in gymnosperms). Phloem (sieve tube elements, companion cells, phloem parenchyma, phloem fibres — phloem parenchyma is absent in most monocots; mature sieve tubes lack a nucleus and are controlled by the nucleus of companion cells).
                • Protoxylem Arrangement: Exarch (protoxylem towards periphery, metaxylem towards center — characteristic of ROOTS); Endarch (protoxylem towards pith/center, metaxylem towards periphery — characteristic of STEMS).

                2. Dicot vs Monocot Anatomy & Secondary Growth
                • Dicot Root vs Monocot Root: Dicot root has 2–4 xylem/phloem patches (tetrarch) and undergoes secondary growth; Monocot root has polyarch (>6) xylem bundles, large well-developed pith, and NO secondary growth. Both have Casparian strips (suberin) in the endodermis.
                • Dicot Stem vs Monocot Stem: Dicot stem has conjoint, collateral, OPEN vascular bundles (with cambium) arranged in a ring and parenchymatous pith; Monocot stem has conjoint, CLOSED vascular bundles scattered in ground tissue with a sclerenchymatous bundle sheath.
                • Bulliform Cells: Large, empty, colorless adaxial epidermal cells in grasses (isobilateral leaves) that curl leaves inward during water stress to minimize transpiration.
            """.trimIndent(),
            videoTitle = "Root vs Stem Cross-Sections, Endarch/Exarch Logic & Vascular Cambium Dynamics",
            videoDurationLabel = "36:25",
            videoInstructor = "Dr. Rohini Deshmukh (IISER Bhopal)",
            videoKeyTakeaways = "Identifying monocot vs dicot root and stem slides • Spring wood (early) vs autumn wood (late) and heartwood vs sapwood",
            isVideoCompleted = false
        ),
        ChapterEntity(
            id = "bio_ch_7",
            subject = "Biology",
            examTag = "IISER IAT",
            chapterNumber = 7,
            title = "Structural Organisation in Animals",
            subtitle = "Epithelial, Connective, Muscular & Neural Tissues, Cell Junctions & Organ System Morphology",
            totalLessons = 5,
            completedLessons = 2,
            studyNotesCount = 7,
            practiceQuestionCount = 18,
            durationMinutes = 40,
            formulaHighlight = "Junctions: Tight (Stop Leakage) • Adhering (Cementing) • Gap (Cytoplasmic Ion Transfer)",
            keyConceptsSummary = "Simple vs compound epithelium, loose/dense/specialized connective tissues, skeletal/smooth/cardiac muscle fibers, neuroglia, and comparative organ system anatomy (Frog/Cockroach).",
            detailedStudyNotes = """
                1. Animal Tissues & Intercellular Junctions
                • Simple Epithelium: Squamous (alveoli of lungs, endothelium of blood vessels — diffusion boundary), Cuboidal (PCT of nephron with microvilli, ducts of glands), Columnar (stomach and intestinal lining), Ciliated (bronchioles and fallopian tubes).
                • Cell Junctions: Tight junctions prevent leakage across tissues; Adhering junctions perform cementing to keep neighboring cells together; Gap junctions connect cytoplasm of adjoining cells for rapid transfer of ions and small molecules (e.g., intercalated discs in cardiac muscle).
                • Connective Tissue: Tendons (dense regular: skeletal muscle to bone) vs Ligaments (dense regular: bone to bone). Areolar tissue contains fibroblasts, macrophages, and mast cells (secrete histamine, serotonin, heparin).

                2. Comparative Organ Systems (Frog & Cockroach)
                • Frog (Rana tigrina): Poikilothermic amphibian; cutaneous respiration (skin in water & during hibernation/aestivation) + buccopharyngeal + pulmonary respiration; 3-chambered heart (2 atria, 1 ventricle) with sinus venosus and conus arteriosus; hepatic and renal portal systems present; 10 pairs of cranial nerves; ureotelic adult (tadpole is ammonotelic).
                • Cockroach (Periplaneta americana): Chitinous exoskeleton sclerites (tergites dorsal, sternites ventral) joined by arthrodial membrane; open circulation with 13-chambered tubular heart and alary muscles; tracheal respiration via 10 pairs of spiracles; excretion by Malpighian tubules (uricotelic); mosaic vision via 2000 hexagonal ommatidia.
            """.trimIndent(),
            videoTitle = "Epithelial & Connective Tissue Histology + Frog & Cockroach Organ Systems",
            videoDurationLabel = "33:45",
            videoInstructor = "Dr. Rohini Deshmukh (IISER Bhopal)",
            videoKeyTakeaways = "Matching epithelial types to nephron segments and respiratory tract • Frog portal veins and respiratory modes",
            isVideoCompleted = false
        ),
        ChapterEntity(
            id = "bio_ch_8",
            subject = "Biology",
            examTag = "IISER IAT",
            chapterNumber = 8,
            title = "Cell: The Unit of Life",
            subtitle = "Prokaryotic vs Eukaryotic Cells, Fluid Mosaic Membrane, Endomembrane System & Semi-Autonomous Organelles",
            totalLessons = 6,
            completedLessons = 4,
            studyNotesCount = 9,
            practiceQuestionCount = 24,
            durationMinutes = 50,
            formulaHighlight = "70S = 50S + 30S (Prokaryotes/Mito/Plastids)  •  80S = 60S + 40S (Eukaryotic Cytosol)",
            keyConceptsSummary = "Singer-Nicolson fluid mosaic model, active vs passive transport, ER-Golgi-Lysosome-Vacuole endomembrane pathway, mitochondria and chloroplasts, 9+2 vs 9+0 microtubule arrays, and chromosome centromere types.",
            detailedStudyNotes = """
                1. Cell Envelope, Plasma Membrane & Endomembrane System
                • Prokaryotic Cell: Glycocalyx (slime layer or thick capsule) → Cell wall (peptidoglycan) → Plasma membrane. Mesosomes are infoldings of plasma membrane involved in cell wall formation, DNA replication, and respiration.
                • Fluid Mosaic Model (Singer & Nicolson, 1972): Quasi-fluid lipid bilayer enables lateral movement of proteins within the overall bilayer. Human RBC membrane is ~52% protein and 40% lipid.
                • Endomembrane System (ER, Golgi Apparatus, Lysosomes, Vacuoles): Coordinated functions. RER synthesizes proteins; SER synthesizes lipids and steroidal hormones. Golgi cis (forming) face receives vesicles from ER and trans (maturing) face ships glycoproteins and glycolipids. Lysosomes contain hydrolytic enzymes (acid hydrolases) active at acidic pH (~5.0).

                2. Semi-Autonomous Organelles, Cytoskeleton & Chromosomes
                • Mitochondria & Chloroplasts: Double membrane-bound; possess circular dsDNA, 70S ribosomes, and RNA (endosymbiotic origin).
                • Cilia/Flagella vs Centrioles: Eukaryotic cilia and flagella have a 9+2 axonemal array (9 peripheral doublets + 2 central singlet microtubules); Centrioles/Basal bodies have a cartwheel 9+0 array (9 peripheral triplets of tubulin, no central microtubules) and lack a membrane.
                • Chromosome Classification by Centromere: Metacentric (middle, V-shape), Sub-metacentric (slightly away from middle, L-shape), Acrocentric (close to end, J-shape), Telocentric (terminal centromere, I-shape).
            """.trimIndent(),
            videoTitle = "Endomembrane Protein Trafficking, 9+2 vs 9+0 Microtubules & Organelle Biogenesis",
            videoDurationLabel = "37:30",
            videoInstructor = "Dr. Rohini Deshmukh (IISER Bhopal)",
            videoKeyTakeaways = "Why peroxisomes, mitochondria, and chloroplasts are NOT part of the endomembrane system • Ribosome Svedberg sedimentation coefficients",
            isVideoCompleted = true,
            lastAccessedTimestamp = System.currentTimeMillis() - 8_000_000L
        ),
        ChapterEntity(
            id = "bio_ch_9",
            subject = "Biology",
            examTag = "IISER IAT",
            chapterNumber = 9,
            title = "Biomolecules",
            subtitle = "Amino Acids, Protein Structure, Polysaccharides, Nucleic Acids & Michaelis-Menten Enzyme Kinetics",
            totalLessons = 6,
            completedLessons = 4,
            studyNotesCount = 9,
            practiceQuestionCount = 26,
            durationMinutes = 50,
            formulaHighlight = "v₀ = (V_max [S]) / (K_m + [S])  •  1/v₀ = (K_m/V_max)(1/[S]) + 1/V_max",
            keyConceptsSummary = "Acid-soluble vs acid-insoluble cellular fractions, primary to quaternary protein structures, B-DNA Watson-Crick parameters, Michaelis-Menten constant K_m, and competitive vs non-competitive inhibition.",
            detailedStudyNotes = """
                1. Cellular Biomolecules & Macromolecular Structure
                • Trichloroacetic Acid (Cl₃CCOOH) Fractionation: Acid-soluble pool contains biomicromolecules (MW 18–800 Da: amino acids, monosaccharides, nucleotides). Acid-insoluble retentate contains biomacromolecules (>10,000 Da: proteins, nucleic acids, polysaccharides) PLUS lipids (MW < 800 Da, retained because cell membranes fragment into water-insoluble vesicles).
                • Proteins & Polysaccharides: RuBisCO is the most abundant protein in the whole biosphere; Collagen is the most abundant protein in the animal world. Cellulose (β-1,4-D-glucose homopolymer) does NOT trap I₂ because it lacks complex helices, whereas Starch (α-1,4 and α-1,6) forms a blue-black complex with iodine. Chitin is a homopolymer of N-acetylglucosamine (NAG).
                • B-DNA Parameters: Antiparallel strands; pitch per helical turn = 34 Å (3.4 nm) with 10 base pairs per turn (rise per bp = 3.4 Å, 36° twist).

                2. Enzyme Classification & Michaelis-Menten Kinetics
                • Holoenzyme = Apoenzyme (protein part) + Cofactor (prosthetic group like haem tightly bound, coenzyme like NAD⁺/NADP⁺ transiently bound, or metal ion like Zn²⁺ for carboxypeptidase and carbonic anhydrase).
                • Michaelis-Menten Equation: v₀ = V_max [S] / (K_m + [S]), where K_m is the substrate concentration at v₀ = ½ V_max. Lower K_m indicates higher enzyme-substrate affinity.
                • Enzyme Inhibition:
                  - Competitive Inhibitor (e.g., malonate inhibiting succinate dehydrogenase): Binds active site; Apparent K_m increases, V_max remains unchanged.
                  - Non-competitive Inhibitor: Binds allosteric site; V_max decreases, K_m remains unchanged.
            """.trimIndent(),
            videoTitle = "Michaelis-Menten & Lineweaver-Burk Plots, TCA Fractionation & Protein Folding",
            videoDurationLabel = "39:15",
            videoInstructor = "Dr. Rohini Deshmukh (IISER Bhopal)",
            videoKeyTakeaways = "Why lipids appear in the acid-insoluble macromolecular fraction • Calculating v₀ in the presence of competitive inhibitors",
            isVideoCompleted = false
        ),
        ChapterEntity(
            id = "bio_ch_10",
            subject = "Biology",
            examTag = "IISER IAT",
            chapterNumber = 10,
            title = "Cell Cycle and Cell Division",
            subtitle = "Interphase (G1, S, G2), Checkpoints, Ploidy (n) & DNA Content (C) Tracking, Mitosis & Meiosis I/II",
            totalLessons = 5,
            completedLessons = 4,
            studyNotesCount = 8,
            practiceQuestionCount = 24,
            durationMinutes = 45,
            formulaHighlight = "G₁ (2n, 2C) → S (2n, 4C) → G₂ (2n, 4C) → Meiosis I (1n, 2C) → Meiosis II (1n, 1C)",
            keyConceptsSummary = "DNA replication vs chromosome number in S phase, equational division (mitosis), Prophase I substages (Leptotene to Diakinesis), crossing over, and nondisjunction.",
            detailedStudyNotes = """
                1. Cell Cycle Phases & Ploidy/C-Value Tracking
                • G₁ Phase: Cell is metabolically active and grows; chromosome number = 2n, DNA content = 2C. G₀ (Quiescent stage): Cells exit G₁ and remain metabolically active without proliferating (e.g., heart cells).
                • S (Synthesis) Phase: DNA content doubles from 2C → 4C (and centrioles duplicate in the cytoplasm of animal cells), while chromosome number remains UNCHANGED at 2n!
                • Mitosis (Equational Division): Metaphase is best for studying chromosome morphology (spindle fibres attach to kinetochores). In Anaphase, centromeres split and sister chromatids separate, transiently doubling the chromosome count inside the dividing cell before cytokinesis restores 2n, 2C.

                2. Meiosis I & II (Reductional & Equational Stages)
                • Prophase I Substages (Lata Zara Pani De De):
                  - Leptotene: Chromosome compaction begins.
                  - Zygotene: Pairing of homologous chromosomes (synapsis) forming synaptonemal complex and bivalent (1 bivalent = 2 homologous chromosomes = 4 chromatids = 1 tetrad).
                  - Pachytene: Crossing over (recombination nodules) mediated by recombinase enzyme between non-sister chromatids of homologous chromosomes.
                  - Diplotene: Dissolution of synaptonemal complex; X-shaped chiasmata become visible (can last for months/years in vertebrate oocytes — dictyotene stage).
                  - Diakinesis: Terminalisation of chiasmata; nucleolus disappears and nuclear envelope breaks down.
                • Anaphase I vs Anaphase II: Homologous chromosomes separate in Anaphase I (centromeres do NOT split; reductional 2n → n); centromeres split and sister chromatids separate in Anaphase II.
            """.trimIndent(),
            videoTitle = "Chromosome (n) & DNA Content (C) Numericals + Prophase I Substages",
            videoDurationLabel = "34:50",
            videoInstructor = "Dr. Rohini Deshmukh (IISER Bhopal)",
            videoKeyTakeaways = "Tracking n and C values across G₁, G₂, Metaphase I, and Metaphase II • Bivalent vs Tetrad vs Chromatid calculations",
            isVideoCompleted = true,
            lastAccessedTimestamp = System.currentTimeMillis() - 3_500_000L
        ),
        ChapterEntity(
            id = "bio_ch_11",
            subject = "Biology",
            examTag = "IISER IAT",
            chapterNumber = 11,
            title = "Photosynthesis in Higher Plants",
            subtitle = "Z-Scheme, Cyclic vs Non-Cyclic Photophosphorylation, Chemiosmosis, Calvin (C3) & Hatch-Slack (C4) Pathways",
            totalLessons = 6,
            completedLessons = 3,
            studyNotesCount = 10,
            practiceQuestionCount = 26,
            durationMinutes = 55,
            formulaHighlight = "C3 Glucose: 18 ATP + 12 NADPH  •  C4 Glucose: 30 ATP + 12 NADPH",
            keyConceptsSummary = "PS II (P680) and PS I (P700), water splitting complex, proton gradient across thylakoid membrane, RuBisCO carboxylation vs photorespiration (C2), and Kranz anatomy in C4 plants.",
            detailedStudyNotes = """
                1. Light Reaction, Photophosphorylation & Chemiosmotic Hypothesis
                • Non-Cyclic Photophosphorylation (Z-Scheme): Involves both PS II (680 nm) and PS I (700 nm) in grana lamellae. Water splitting (2H₂O → 4H⁺ + O₂ + 4e⁻) occurs on the inner (lumen) side of the thylakoid membrane (requires Mn²⁺ and Cl⁻), synthesizing both ATP and NADPH + H⁺.
                • Cyclic Photophosphorylation: Occurs in stroma lamellae (which lack PS II and NADP reductase enzyme); operates at wavelengths > 680 nm; produces ONLY ATP (no NADPH, no O₂ evolution).
                • Chemiosmotic Hypothesis (Peter Mitchell): Proton concentration increases inside the thylakoid LUMEN (low pH in lumen, high pH in stroma during light reaction). CF₀-CF₁ ATP synthase uses proton motive force from lumen → stroma to synthesize ATP.

                2. Calvin Cycle (C3), Photorespiration (C2) & Hatch-Slack Pathway (C4)
                • Calvin Cycle (Mesophyll of C3; Bundle Sheath of C4): Three stages — Carboxylation (RuBP + CO₂ → two 3-PGA via RuBisCO), Reduction (uses 2 ATP + 2 NADPH per CO₂), and Regeneration of RuBP (uses 1 ATP per CO₂). Total for 1 Glucose (6 turns): 18 ATP and 12 NADPH.
                • Photorespiration (C2 Cycle): Triggered by high O₂ / low CO₂; RuBisCO acts as oxygenase (RuBP + O₂ → one 3-PGA + one 2-C phosphoglycolate). Involves Chloroplast → Peroxisome → Mitochondria; wastes ATP and releases CO₂ with zero sugar synthesis.
                • C4 Pathway (Maize, Sorghum, Sugarcane): Kranz anatomy (agranal bundle sheath chloroplasts rich in RuBisCO; granal mesophyll chloroplasts rich in PEPcase and lacking RuBisCO). Primary CO₂ acceptor is 3-C PEP forming 4-C Oxaloacetic Acid (OAA). Regeneration of PEP from pyruvate via PPDK consumes 2 extra ATP equivalents per CO₂ (Total: 30 ATP + 12 NADPH per glucose).
            """.trimIndent(),
            videoTitle = "C3 vs C4 Energetics, Thylakoid Proton Gradient & Photorespiration",
            videoDurationLabel = "42:10",
            videoInstructor = "Dr. Rohini Deshmukh (IISER Bhopal)",
            videoKeyTakeaways = "Comparing thylakoid lumen vs mitochondrial matrix proton accumulation • ATP/NADPH accounting in C3, C4, and CAM plants",
            isVideoCompleted = false
        ),
        ChapterEntity(
            id = "bio_ch_12",
            subject = "Biology",
            examTag = "IISER IAT",
            chapterNumber = 12,
            title = "Respiration in Plants",
            subtitle = "Glycolysis (EMP), Fermentation, Link Reaction, Krebs (TCA) Cycle, Mitochondrial ETS & Respiratory Quotient",
            totalLessons = 5,
            completedLessons = 3,
            studyNotesCount = 9,
            practiceQuestionCount = 24,
            durationMinutes = 50,
            formulaHighlight = "RQ = CO₂ Evolved / O₂ Consumed  •  Carbohydrate = 1.0  •  Fat = 0.7  •  Protein = 0.9",
            keyConceptsSummary = "Substrate-level vs oxidative phosphorylation, pyruvate dehydrogenase link reaction, TCA cycle intermediates, Complexes I–V of mitochondrial electron transport chain, and RQ calculations.",
            detailedStudyNotes = """
                1. Glycolysis, Fermentation & Krebs (TCA) Cycle
                • Glycolysis (EMP Pathway in Cytosol): 1 Glucose (6C) → 2 Pyruvate (3C); consumes 2 ATP and generates 4 ATP (net 2 ATP via substrate-level phosphorylation) + 2 NADH + H⁺. Does not require O₂.
                • Link Reaction (Mitochondrial Matrix): Pyruvate + CoA + NAD⁺ → Acetyl-CoA (2C) + CO₂ + NADH + H⁺ (catalyzed by Pyruvate Dehydrogenase complex requiring Mg²⁺).
                • Krebs Cycle (Mitochondrial Matrix): Per molecule of Acetyl-CoA (1 turn): produces 3 NADH + H⁺, 1 FADH₂, 1 GTP (substrate-level phosphorylation at Succinyl-CoA → Succinic acid), and 2 CO₂. Succinate dehydrogenase is the only TCA enzyme bound to the inner mitochondrial membrane.

                2. Electron Transport System (ETS), ATP Balance & Respiratory Quotient (RQ)
                • Mitochondrial ETS (Inner Membrane):
                  - Complex I: NADH dehydrogenase (oxidizes NADH, pumps protons into intermembrane space).
                  - Complex II: Succinate dehydrogenase (FADH₂; does NOT pump protons).
                  - Complex III: Cytochrome bc₁ complex (transfers electrons via mobile carrier Cytochrome c on outer surface of inner membrane).
                  - Complex IV: Cytochrome c oxidase (contains cytochromes a and a₃, and 2 copper centers; transfers electrons to O₂, the terminal electron acceptor).
                  - Complex V: F₀-F₁ ATP synthase (protons flow from intermembrane space back into matrix).
                • Respiratory Quotient (RQ = Volume of CO₂ evolved / Volume of O₂ consumed): Carbohydrates = 1.0; Tripalmitin (Fats) = 0.7; Proteins ≈ 0.9; Organic acids (e.g., Malic acid) > 1.0 (1.33); Anaerobic respiration = ∞.
            """.trimIndent(),
            videoTitle = "Mitochondrial ETS Complexes I–V, ATP Accounting & Respiratory Quotient (RQ)",
            videoDurationLabel = "38:05",
            videoInstructor = "Dr. Rohini Deshmukh (IISER Bhopal)",
            videoKeyTakeaways = "Tracking NADH, FADH₂, and substrate-level ATP per glucose • Why fats have RQ < 1 while organic acids have RQ > 1",
            isVideoCompleted = false
        ),
        ChapterEntity(
            id = "bio_ch_13",
            subject = "Biology",
            examTag = "IISER IAT",
            chapterNumber = 13,
            title = "Plant Growth and Development",
            subtitle = "Arithmetic vs Geometric Growth Curves, Dedifferentiation & Phytohormones (Auxin, GA, Cytokinin, Ethylene, ABA)",
            totalLessons = 5,
            completedLessons = 2,
            studyNotesCount = 8,
            practiceQuestionCount = 20,
            durationMinutes = 45,
            formulaHighlight = "Arithmetic: L_t = L₀ + r·t  •  Geometric (Sigmoid): W₁ = W₀ · e^(r·t)",
            keyConceptsSummary = "Growth kinetics, differentiation/dedifferentiation/redifferentiation, plasticity (heterophylly), physiological roles and bioassays of the 5 major plant growth regulators (PGRs).",
            detailedStudyNotes = """
                1. Growth Kinetics, Differentiation & Plasticity
                • Arithmetic vs Geometric Growth: In arithmetic growth, only one daughter cell continues to divide (linear curve: L_t = L₀ + rt, e.g., root elongating at constant rate). In geometric growth, both progeny cells divide mitotically (sigmoid S-curve with lag, exponential log, and stationary phases: W₁ = W₀ e^(rt)).
                • Differentiation, Dedifferentiation & Redifferentiation: Living differentiated parenchyma cells regaining capacity to divide under certain conditions is Dedifferentiation (e.g., formation of interfascicular cambium and cork cambium). Cells produced by them that mature again to perform specific functions (secondary xylem/phloem, phellem/phelloderm) undergo Redifferentiation.
                • Plasticity (Heterophylly): Developmental heterophylly in Cotton, Coriander, and Larkspur; Environmental heterophylly in Buttercup (Ranunculus — terrestrial vs water leaf shapes).

                2. Plant Growth Regulators (PGRs) & Antagonistic Pairs
                • Auxins (IAA, IBA; synthetic: NAA, 2,4-D; precursor: Tryptophan + Zn²⁺): Apical dominance, rooting in stem cuttings, parthenocarpy in tomatoes, xylem differentiation; 2,4-D selectively kills broad-leaved dicot weeds without harming mature monocots.
                • Gibberellins (GA₃, terpene derivatives): Bolting (internode elongation prior to flowering in beet, cabbage), increasing sugarcane stem length, speeding up malting (α-amylase induction in barley seeds), delaying senescence.
                • Cytokinins (Zeatin, Kinetin — adenine/purine derivatives): Overcome apical dominance (antagonistic to auxin; promote lateral bud growth), delay leaf senescence via nutrient mobilization (Richmond-Lang effect). In tissue culture: High Auxin : Cytokinin ratio induces rooting; Low Auxin : Cytokinin ratio induces shoot bud differentiation.
                • Ethylene (C₂H₄) & Abscisic Acid (ABA, carotenoid derivative): Ethylene promotes fruit ripening (climacteric respiratory rise), triple response, apical hook formation in dicot seedlings, and rapid internode/petiole elongation in deep-water rice. ABA is the stress hormone (induces stomatal closure, promotes seed dormancy — antagonistic to Gibberellic acid).
            """.trimIndent(),
            videoTitle = "Phytohormone Antagonism, Callus Organogenesis Ratios & Growth Kinetics",
            videoDurationLabel = "34:20",
            videoInstructor = "Dr. Rohini Deshmukh (IISER Bhopal)",
            videoKeyTakeaways = "Auxin:Cytokinin ratios in plant tissue culture •GA vs ABA antagonism in seed germination",
            isVideoCompleted = false
        ),
        ChapterEntity(
            id = "bio_ch_14",
            subject = "Biology",
            examTag = "IISER IAT",
            chapterNumber = 14,
            title = "Breathing and Exchange of Gases",
            subtitle = "Mechanism of Breathing, Spirometry Volumes/Capacities, Oxyhemoglobin Curve (Bohr Shift) & CO₂ Transport",
            totalLessons = 5,
            completedLessons = 3,
            studyNotesCount = 8,
            practiceQuestionCount = 22,
            durationMinutes = 45,
            formulaHighlight = "VC = ERV + TV + IRV  •  TLC = VC + RV  •  FRC = ERV + RV",
            keyConceptsSummary = "Diaphragm and intercostal muscle mechanics, pulmonary volumes and capacities, partial pressure gradients of O₂/CO₂, sigmoidal oxygen dissociation curve, and chloride shift (Hamburger phenomenon).",
            detailedStudyNotes = """
                1. Mechanism of Breathing & Pulmonary Volumes/Capacities
                • Inspiration: Active process; diaphragm contracts (flattens, increasing volume in anteroposterior axis) and external intercostal muscles contract (lifting ribs and sternum in dorsoventral axis), reducing intrapulmonary pressure below atmospheric pressure.
                • Standard Respiratory Volumes:
                  - Tidal Volume (TV) ≈ 500 mL (6000–8000 mL/min).
                  - Inspiratory Reserve Volume (IRV) ≈ 2500–3000 mL.
                  - Expiratory Reserve Volume (ERV) ≈ 1000–1100 mL.
                  - Residual Volume (RV) ≈ 1100–1200 mL (cannot be measured by a simple spirometer).
                • Pulmonary Capacities: Inspiratory Capacity (IC = TV + IRV), Functional Residual Capacity (FRC = ERV + RV), Vital Capacity (VC = ERV + TV + IRV ≈ 4000–4600 mL), Total Lung Capacity (TLC = VC + RV).

                2. Oxygen Dissociation Curve, Bohr Shift & CO₂ Transport
                • Partial Pressures (mmHg): Alveoli (pO₂ = 104, pCO₂ = 40); Oxygenated blood (pO₂ = 95, pCO₂ = 40); Tissues/Deoxygenated blood (pO₂ = 40, pCO₂ = 45).Every 100 mL of oxygenated blood delivers ~5 mL of O₂ to tissues under normal physiological conditions.
                • Oxyhemoglobin Dissociation Curve (Sigmoid):
                  - Left Shift (Lower P₅₀, favors Oxyhemoglobin formation in alveoli): High pO₂, low pCO₂, lower [H⁺] (higher pH), lower temperature.
                  - Right Shift / Bohr Effect (Higher P₅₀, favors O₂ dissociation at active tissues): Low pO₂, high pCO₂, high [H⁺] (low pH), high temperature, high 2,3-BPG.
                • CO₂ Transport: ~70% as bicarbonate (HCO₃⁻ via RBC carbonic anhydrase and Chloride Shift), 20–25% as carbamino-haemoglobin (Haldane effect), and ~7% dissolved in plasma.
            """.trimIndent(),
            videoTitle = "Oxyhemoglobin Dissociation Shifts (Bohr & Haldane Effects) & Spirometry Numericals",
            videoDurationLabel = "36:40",
            videoInstructor = "Dr. Rohini Deshmukh (IISER Bhopal)",
            videoKeyTakeaways = "Factors shifting the O₂-Hb curve right vs left • Why Residual Volume (RV), FRC, and TLC cannot be measured directly by spirometry",
            isVideoCompleted = false
        ),
        ChapterEntity(
            id = "bio_ch_15",
            subject = "Biology",
            examTag = "IISER IAT",
            chapterNumber = 15,
            title = "Body Fluids and Circulation",
            subtitle = "Blood Groups (ABO & Rh), Coagulation Cascade, Cardiac Cycle (0.8 s), Cardiac Output & ECG Wave Analysis",
            totalLessons = 6,
            completedLessons = 3,
            studyNotesCount = 9,
            practiceQuestionCount = 24,
            durationMinutes = 50,
            formulaHighlight = "Cardiac Output (CO) = Stroke Volume (70 mL) × Heart Rate (72 min⁻¹) ≈ 5040 mL/min",
            keyConceptsSummary = "Formed elements of blood, erythroblastosis foetalis, SA/AV nodal conduction pathway, atrial/ventricular systole and diastole, heart sounds (Lub/Dub), and P-QRS-T electrocardiograph waves.",
            detailedStudyNotes = """
                1. Blood Groups, Coagulation & Cardiac Conduction System
                • ABO & Rh Grouping: Group O is universal donor (no A/B antigens on RBCs, both anti-A and anti-B antibodies in plasma); Group AB is universal recipient (both A and B antigens, no antibodies). Erythroblastosis foetalis occurs when an Rh⁻ mother carries a second Rh⁺ fetus (maternal anti-Rh IgG antibodies cross the placenta; prevented by administering anti-Rh antibodies / RhoGAM immediately after the first delivery).
                • Coagulation Cascade: Thrombokinase converts inactive Prothrombin → Thrombin (requires Ca²⁺); Thrombin converts soluble Fibrinogen → insoluble Fibrin meshwork.
                • Conduction Pathway: Sino-Atrial Node (SAN, pacemaker in right upper corner of right atrium: 70–75 action potentials/min) → AV Node → Bundle of His → Left/Right Bundle Branches → Purkinje Fibres.

                2. Cardiac Cycle (0.8 sec) & Electrocardiograph (ECG)
                • Cardiac Cycle Events (at 75 beats/min, duration = 60/75 = 0.8 s): Joint diastole (0.4 s) → Atrial systole (0.1 s, increases ventricular filling by 30%) → Ventricular systole (0.3 s).
                • Heart Sounds: First sound "LUB" is produced by closure of tricuspid and bicuspid (mitral) AV valves at the onset of ventricular systole; Second sound "DUB" is produced by closure of semilunar valves at the beginning of ventricular diastole.
                • ECG Waves:
                  - P wave: Electrical excitation (depolarisation) of the atria, leading to atrial contraction.
                  - QRS complex: Depolarisation of the ventricles, which initiates ventricular contraction shortly after Q.
                  - T wave: Repolarisation of the ventricles (return from excited to normal state); end of T wave marks the end of ventricular systole.
            """.trimIndent(),
            videoTitle = "Cardiac Cycle Pressure-Volume Loops, ECG Wave Correlations & Rh Incompatibility",
            videoDurationLabel = "39:30",
            videoInstructor = "Dr. Rohini Deshmukh (IISER Bhopal)",
            videoKeyTakeaways = "Correlating Lub/Dub valve closures with QRS and T waves • Calculating Stroke Volume (EDV − ESV) and Cardiac Output",
            isVideoCompleted = false
        ),
        ChapterEntity(
            id = "bio_ch_16",
            subject = "Biology",
            examTag = "IISER IAT",
            chapterNumber = 16,
            title = "Excretory Products and Their Elimination",
            subtitle = "Nephron Structure, Glomerular Filtration Rate (GFR), Tubular Reabsorption, Counter-Current Multiplier & RAAS",
            totalLessons = 6,
            completedLessons = 3,
            studyNotesCount = 9,
            practiceQuestionCount = 24,
            durationMinutes = 50,
            formulaHighlight = "GFR = 125 mL/min (180 L/day)  •  Medullary Gradient: 300 → 1200 mOsmol L⁻¹",
            keyConceptsSummary = "Ammonotelism/ureotelism/uricotelism, cortical vs juxtamedullary nephrons, ultrafiltration net pressure, Loop of Henle and vasa recta counter-current osmolarity, and ADH/RAAS/ANF regulation.",
            detailedStudyNotes = """
                1. Nephron Anatomy, Ultrafiltration & Tubular Transport
                • Cortical vs Juxtamedullary Nephrons: Cortical nephrons (~85%) have short Loops of Henle extending very little into the medulla and lack well-developed vasa recta; Juxtamedullary nephrons (~15%) have long Loops of Henle running deep into the medulla with prominent vasa recta, essential for producing concentrated hypertonic urine.
                • Glomerular Filtration Rate (GFR): ~125 mL/min or 180 L/day in healthy adults (~99% is reabsorbed, yielding ~1.5 L/day urine). Filtration slits are formed by podocytes of Bowman's capsule epithelium.
                • Segmental Function:
                  - PCT (Simple cuboidal brush-border epithelium): Reabsorbs 70–80% of electrolytes and water, plus virtually 100% of glucose and amino acids.
                  - Loop of Henle: Descending limb is permeable to water but almost impermeable to electrolytes (concentrates filtrate down to 1200 mOsmol/L); Ascending limb is impermeable to water but actively/passively transports electrolytes (NaCl) out (dilutes filtrate).

                2. Counter-Current Mechanism & Hormonal Regulation (ADH, RAAS, ANF)
                • Counter-Current Multiplier: Proximity between Henle's loop and vasa recta, and counter-current flow in them, maintains an increasing medullary interstitial osmolarity gradient from 300 mOsmol/L in the cortex to 1200 mOsmol/L in the inner medulla (caused mainly by NaCl and urea).
                • Juxtaglomerular Apparatus (JGA) & RAAS: Fall in GFR/blood pressure stimulates JG cells to release Renin → converts liver Angiotensinogen to Angiotensin I → Angiotensin II (powerful vasoconstrictor that raises glomerular BP AND stimulates adrenal cortex to secrete Aldosterone for Na⁺ and water reabsorption in DCT).
                • ADH vs ANF: ADH (Vasopressin from neurohypophysis) increases water permeability of DCT and collecting duct to prevent diuresis. Atrial Natriuretic Factor (ANF from heart atria in response to high BP) causes vasodilation and inhibits renin/aldosterone (physiological check on RAAS).
            """.trimIndent(),
            videoTitle = "Counter-Current Osmolarity Gradient (300–1200 mOsmol/L) & RAAS vs ANF Feedback",
            videoDurationLabel = "40:45",
            videoInstructor = "Dr. Rohini Deshmukh (IISER Bhopal)",
            videoKeyTakeaways = "Descending (water-permeable) vs Ascending (salt-permeable) Loop of Henle • JGA Renin-Angiotensin-Aldosterone vs ANF antagonism",
            isVideoCompleted = false
        )
    )

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

        // ==================== BIOLOGY QUESTIONS ====================
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