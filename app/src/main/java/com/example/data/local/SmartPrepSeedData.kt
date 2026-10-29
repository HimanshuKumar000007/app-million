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

            studyNotesCount = 24,

            practiceQuestionCount = 10,

            durationMinutes = 45,

            formulaHighlight = "ΔZ/Z = p(ΔA/A) + q(ΔB/B) + r(ΔC/C)  •  e/m = E² / (2VB²)  •  LC = Pitch / Circular Divisions",

            keyConceptsSummary = "SI units are defined by fixed constants of nature — c, h, e, k_B, N_A, \u0394\u03bd_Cs, K_cd\nLeast count decides precision: Vernier LC = 1 MSD \u2212 1 VSD; Screw gauge LC = Pitch \u00f7 Circular divisions\nErrors always add \u2014 powers multiply them: \u0394Z/Z = p(\u0394A/A) + q(\u0394B/B) + r(\u0394C/C)\nSignificant figures: decimal places for + and \u2212; significant figures for \u00d7 and \u00f7\nHomogeneity: only identical dimensions can be added or equated; arguments of sin, e^x and ln are dimensionless\nDimensional analysis derives relations and converts units \u2014 but never finds constants like 2\u03c0\nThomson e/m: e/m = E\u00b2/(2VB\u00b2) \u2248 1.76 \u00d7 10\u00b9\u00b9 C/kg",

            detailedStudyNotes = """

Introduction to Measurement
• Every law of physics is a statement about measurable quantities — how long, how heavy, how hot, how much charge. Before any law can be tested, the quantities in it must be measured, and measured in a language every laboratory on Earth shares. That language is built in this chapter.
• DEFINITION — Physical quantity: anything that can be measured and expressed as a number multiplied by a unit, Q = n × u. Length, mass, force and charge are physical quantities. "Beauty" is not — nobody can build an instrument for it.
• DEFINITION — Unit: a fixed standard of the same kind as the quantity, chosen by agreement, against which the quantity is compared. The number n tells how many standards fit into the quantity; the unit u tells which standard was used. "5" alone means nothing; "5 metres" means everything.
• Why measurement is non-negotiable: a claim like "this rod is long" cannot be tested, reproduced or engineered from. "This rod is 1.25 m" can — by anyone, anywhere. Measurement converts opinion into shared fact, and shared fact is the raw material of every theory you will meet.
• The master identity of the chapter: the quantity itself never changes when the unit changes, because n₁u₁ = n₂u₂. Shrink the unit and the number inflates in exactly the same ratio — 1 km and 1000 m are the same walk in different clothes; 1 inch and 2.54 cm are the same thumb-width.
• DEFINITION — Fundamental (base) quantities: the small set of quantities fixed by international agreement as independent of one another. Derived quantities: everything else, built by multiplying or dividing base quantities — speed is length ÷ time; force is mass × length ÷ time²; energy is force × length.
• EXAMPLE — Cooking runs on derived quantities: "200 °C for 25 minutes" combines a base quantity (time) with a derived-feeling one you will soon define precisely (temperature is actually base — the kelvin). Recipes, cricket speeds, phone batteries: civilisation is bookkeeping of quantities.
• Three words to plant now and harvest later: PRECISION is how finely an instrument can read (its least count), ACCURACY is how close a reading sits to the truth, and UNCERTAINTY is the doubt you honestly attach to every result, written as value ± Δvalue. Sections ahead give each its full treatment.

The International System of Units — the SI
• Imagine every country — then every planet — measuring with private rulers. Science would drown in conversion chaos. The SI exists to end that: one coherent system, adopted in 1960 with its scheme fixed in 1971, in which every unit is built from seven base units by multiplication and division alone, with no stray conversion factors hiding inside formulas.
• A short, examinable history: the world tried CGS (centimetre, gram, second), FPS (foot, pound, second) and MKS (metre, kilogram, second) before converging on the SI. Then, in November 2018, the 26th General Conference on Weights and Measures voted the deepest change ever made to measurement: from 20 May 2019, the SI is founded entirely on constants of nature. No unit depends on a manufactured object anymore.
• DEFINITION — The SI (International System of Units): the internationally agreed system built on seven base units — metre, kilogram, second, ampere, kelvin, mole, candela — each defined since 2019 by fixing the value of a constant of nature.
★ HIGHLIGHT — What a good standard must be: well defined, reproducible in any laboratory, stable for all time, and of convenient size. The 2019 SI is the first system in history to satisfy all four perfectly — because constants of nature cannot corrode, drift, or be lost in a fire.

▸ The Seven SI Base Units — the Defining-Constant Table
• Read this table as seven rows of one story: quantity — unit — symbol — the constant that defines it. (Fig. 1.5 gathers these constants visually.)
• Length — metre — m — speed of light in vacuum, c = 299,792,458 m/s exactly. One metre is the distance light travels in 1/299,792,458 of a second.
• Mass — kilogram — kg — Planck constant, h = 6.62607015 × 10⁻³⁴ J s exactly (with the metre and second). The platinum-iridium cylinder "Le Grand K" in Paris is retired: the kilogram is now a recipe, not an object.
• Time — second — s — caesium frequency, Δν_Cs = 9,192,631,770 Hz exactly: the second is the duration of 9,192,631,770 periods of the caesium-133 atom's transition. This is why atomic clocks drift by only about a second in millions of years.
• Electric current — ampere — A — elementary charge, e = 1.602176634 × 10⁻¹⁹ C exactly: the ampere is the flow of 1/(1.602176634 × 10⁻¹⁹) elementary charges per second.
• Thermodynamic temperature — kelvin — K — Boltzmann constant, k_B = 1.380649 × 10⁻²³ J/K exactly.
• Amount of substance — mole — mol — Avogadro constant, N_A = 6.02214076 × 10²³ mol⁻¹ exactly: one mole contains exactly that many elementary entities.
• Luminous intensity — candela — cd — luminous efficacy, K_cd = 683 lm/W exactly, for light of frequency 540 × 10¹² Hz.
★ HIGHLIGHT — Seven units, seven constants: c, h, Δν_Cs, e, k_B, N_A, K_cd. Any civilisation anywhere could rebuild our entire measurement system from these seven numbers — that was the design goal, and it is achieved.

▸ Derived Units, Prefixes and Writing Rules
• DEFINITION — Derived unit: a unit obtained by multiplying or dividing base units, following the defining equation of its quantity. Because the SI is coherent, no extra numerical factors appear: force is mass × acceleration, so 1 N = 1 kg m s⁻², exactly.
• The derived-units table — read each row as an equation: Force — newton (N) = kg m s⁻² • Work and energy — joule (J) = kg m² s⁻² • Power — watt (W) = kg m² s⁻³ • Pressure — pascal (Pa) = kg m⁻¹ s⁻² • Frequency — hertz (Hz) = s⁻¹.
• Continuing the table: Electric charge — coulomb (C) = A s • Electric potential — volt (V) = kg m² s⁻³ A⁻¹ • Resistance — ohm (Ω) = kg m² s⁻³ A⁻² • Capacitance — farad (F) = kg⁻¹ m⁻² s⁴ A² • Magnetic flux — weber (Wb) = kg m² s⁻² A⁻¹ • Magnetic field — tesla (T) = kg s⁻² A⁻¹.
• Base versus derived, made concrete: the second is base because it is defined directly by a constant; the newton is derived because it is DEFINED through other units — nobody fixed a "force constant of nature" to define it. Ask of any unit: "is it on the list of seven, or is it built from them?" That one question sorts the entire table.
• DEFINITION — Supplementary units: the radian (rad) for plane angle — the angle whose arc length equals the radius — and the steradian (sr) for solid angle, its three-dimensional counterpart. Both are ratios of lengths, hence dimensionless, yet both carry genuine unit names.
⚠ EXAM TRAP — Dimensionless does NOT mean unitless: rad and sr are dimensionless but are real units. In the opposite corner, strain and refractive index are dimensionless AND unitless. Examiners test exactly this four-way distinction.
• Prefixes are powers of ten with name tags — learn them as a ladder: pico (p) 10⁻¹² • nano (n) 10⁻⁹ • micro (μ) 10⁻⁶ • milli (m) 10⁻³ • centi (c) 10⁻² • deci (d) 10⁻¹ • kilo (k) 10³ • mega (M) 10⁶ • giga (G) 10⁹ • tera (T) 10¹². Your daily life already speaks it: gigabytes of storage, nanometre chips, millilitres of syrup.
• Scientific notation is the working language: write N = a × 10ᵇ with 1 ≤ a < 10. It makes significant figures unambiguous (2.500 × 10³ declares 4 figures; bare 2500 cannot) and keeps the length ladder manageable: 1 fm = 10⁻¹⁵ m (nucleus) • 1 Å = 10⁻¹⁰ m (atom) • 1 nm = 10⁻⁹ m • 1 μm = 10⁻⁶ m • 1 light year = 9.46 × 10¹⁵ m • 1 AU = 1.496 × 10¹¹ m • 1 parsec = 3.08 × 10¹⁶ m, the largest length unit in this list. Also 1 u = 1.66 × 10⁻²⁷ kg and 1 eV = 1.602 × 10⁻¹⁹ J.
• Unit conversion is one disciplined move: multiply by a conversion factor equal to 1 (like 100 cm / 1 m) arranged so the unwanted unit cancels. Chain several and units cancel like algebraic symbols — if the surviving unit is wrong, the chain was wrong. This "factor-label" habit will silently check your work for years.
• Writing rules that examiners genuinely test: no full stop after a symbol (5 kg, not 5 kg.); no plurals (10 N, not 10 Ns); a space between number and unit (5 kg, not 5kg); symbols for units named after scientists are capitalised (N, J, W, Pa, Hz) while their full names stay lowercase (newton, joule, watt, pascal, hertz); compound units use negative powers or a solidus consistently (m s⁻² or m/s²).
• YOUR TURN — Which is written correctly: (a) 5 kgs (b) 5 kg. (c) 5 kg (d) 5 Kg? (Answer: only (c). Small marks live in exactly these corners.)

Significant Figures — What They Mean
• You measure a pencil with a school ruler and write 14.0 cm. A friend writes 14.000 cm from the same ruler. One of you is claiming knowledge the ruler never provided. Significant figures are the honesty system that settles such claims, and every numerical answer you ever submit is judged by it.
• DEFINITION — Significant figures: all the digits in a measurement that are known reliably, PLUS the first uncertain (estimated) digit. A length reported as 23.023 cm claims 5 significant figures; the final 3 is the doubtful one — and that declared doubt is information, not weakness.
• What significant figures represent: the precision of the measurement itself. More figures = a finer instrument = a stronger claim. Writing 23.0230 cm from a millimetre scale invents two digits of knowledge — in a research lab that is misconduct; in an exam it is a straightforward lost mark.
• An unchanging truth worth memorising: switching units never changes the count. 2.308 cm = 0.02308 m = 23.08 mm — 4 significant figures in every outfit (NCERT's own example), because the instrument did not change, only its clothing.
• DEFINITION — Order of magnitude: the power of ten nearest to a quantity, by the NCERT rule — write N = a × 10ᵇ; if a ≤ 5 the order is b; if a > 5 it is b + 1. Earth's diameter 1.28 × 10⁷ m → order 7; a hydrogen atom 1.06 × 10⁻¹⁰ m → order −10.
• EXAMPLE — Why orders of magnitude matter beyond this chapter: they are a five-second lie detector. If your mechanics answer gives a car's speed as 10⁸ m/s, the order of magnitude alone convicts it (cars live near 10¹) long before you hunt the algebra slip.

▸ Counting Significant Figures — the 6 Rules
• Six rules, learned once, used forever. Test each rule against its example as you read — passive reading is how these are lost.
• Rule 1 — All non-zero digits are significant: 237 → 3; 2371 → 4.
• Rule 2 — Captive zeros (zeros between non-zero digits) are significant — they were measured, not placed: 2007 → 4; 4.002 → 4.
• Rule 3 — Leading zeros are never significant — they only park the decimal point: 0.0042 → 2; 0.000105 → 3.
• Rule 4 — Trailing zeros in a number WITH a decimal point are significant — someone measured them: 3.500 → 4; 0.00120 → 3 (the digits 1, 2 and the final 0); 12.000 → 5.
• Rule 5 — Trailing zeros in a whole number WITHOUT a decimal point are ambiguous. Scientific notation resolves the honesty: 2500 as 2.5 × 10³ declares 2 figures; as 2.500 × 10³ declares 4.
• Rule 6 — Powers of ten never count, and EXACT numbers have unlimited significant figures and never limit a calculation: counted objects (24 students), defined constants (c = 299,792,458 m/s exactly), and defined conversion factors (1 inch = 2.54 cm exactly).
• YOUR TURN — Count the significant figures: (a) 0.00508 (b) 60.0 (c) 4005 (d) 3.00 × 10⁻⁴. (Answers: (a) 3 — leading zeros are scenery; (b) 3 — the trailing zero was measured; (c) 4 — captive zeros count; (d) 3 — the power of ten is invisible to the count.)

▸ Rounding Off and the Two Arithmetic Rulebooks
• DEFINITION — Rounding off: reducing a number to a stated number of significant figures by dropping the remaining digits under fixed rules, so the reported value stays as honest as the original measurement.
• The rounding rules: digit to be dropped is LESS than 5 → the last kept digit stays (3.24 → 3.2). MORE than 5 → the last kept digit rises by one (3.27 → 3.3).
• Exactly 5 is where NCERT parts company with school habit — the EVEN-ODD (banker's) rule: if the last kept digit is even, leave it (3.25 → 3.2); if odd, raise it (3.35 → 3.4). NCERT's own pair: 2.745 → 2.74 and 2.735 → 2.74. WHY: always rounding 5 upward biases long chains of calculations systematically upward; the even-odd rule is unbiased over many roundings. Assumptions matter: this rule applies when the dropped part is exactly 5 followed by nothing.
• Now the two rulebooks — and WHY they differ, which is what separates understanding from memorising. ADDITION AND SUBTRACTION follow DECIMAL PLACES. Reason: adding numbers aligns their ABSOLUTE uncertainties, and absolute uncertainty lives in a decimal place — a value known to ±0.1 cannot certify hundredths in a sum, whatever its digit count. Example: 436.32 + 227.2 + 0.301 = 663.821, reported as 663.8, because 227.2 is known only to one decimal place.
• MULTIPLICATION AND DIVISION follow SIGNIFICANT FIGURES. Reason: multiplying scales RELATIVE uncertainty, and relative precision is exactly what significant figures count. Example: 2.456 × 1.2 = 2.9472, reported as 2.9, because 1.2 carries only 2 significant figures — a relative precision of about 1 part in 12, which the answer may not pretend to beat.
• Subtraction's dark corner: subtracting nearly equal numbers destroys precision. 12.9 g − 7.06 g = 5.8 g (not 5.84), and 0.307 m − 0.304 m = 0.003 m — ONE significant figure survives. The absolute errors stay, the value shrinks, so the relative error explodes. Instrument designers fear this; examiners test it.
• Precision versus accuracy, settled here once: significant figures report PRECISION (fineness of the reading). They say nothing about ACCURACY — a miscalibrated instrument produces beautifully precise, confidently wrong numbers. The next section separates the two ideas completely.
⚠ EXAM TRAP — Never round intermediate steps. Carry at least one extra digit through the whole calculation and round ONCE, at the very end. Mid-calculation rounding is a silent leak that compounds across multi-step numericals.

Measurement, Least Count and Errors
• Every instrument has a smallest whisper it can hear; below that size it is deaf, and pretending otherwise is how fake precision is born. This section equips you with the vocabulary of honest measurement — least count, error families, and the accuracy–precision distinction.
• DEFINITION — Least count (LC): the smallest change in a quantity that an instrument can detect. It caps the precision of every reading: a metre scale (LC 1 mm) can never honestly report 12.34 cm.
✔ KEY FORMULA — The precision ladder of this chapter: metre scale ~10⁻³ m → Vernier calipers ~10⁻⁴ m → screw gauge ~10⁻⁵ m → optical instruments ~ a wavelength of light. Finer instrument → smaller LC → more significant figures per reading.
• Why can't we subdivide scales forever? NCERT's precision ranking (Exercise 1.6): optical instruments resolve about a wavelength of light and beat every mechanical device; then the screw gauge (~0.001 cm), then Vernier calipers (~0.01 cm), then the metre scale (0.1 cm). For mechanical screws the floor is set by play in the thread — backlash — not by engraving.
• EXAMPLE — Choosing the instrument IS the first experimental decision: a hair's thickness (~10⁻⁴ m) laughs at a metre scale, is routine for a screw gauge, and is coarse work for a microscope. Match the LC to the job before measuring anything.
• Readings of the same quantity rarely agree exactly, so results are reported as a mean with uncertainty: a = a_mean ± Δa. The rest of this section names the disagreements.
• DEFINITION — Error: the difference between a measured value and the true value. Absolute error of a reading = |measured − true|; the reported Δa is the mean of the absolute errors over repeated readings. Relative (fractional) error = Δa/a_mean. Percentage error = (Δa/a_mean) × 100.
• DEFINITION — Systematic errors: errors pushing every reading the same way by roughly the same amount — a zero error, a shrunken scale, heat leaking identically in every trial. Repetition does NOT cure them; better instruments, calibration and technique do.
• DEFINITION — Random errors: errors scattering readings on both sides of the true value with no pattern — tiny fluctuations in conditions and judgement. Repetition DOES cure these: average many readings and the scatter shrinks.
• Gross errors are pure carelessness — misreading a scale, transposing digits. No statistics rescues them; the reading is rejected and retaken, carefully. Least count error belongs to the instrument itself: no reading is trustworthy beyond one least count.
• EXAMPLE — One thermometer, both families: if it reads 0.5° high in melting ice, it reads high everywhere (systematic — calibrate it away). If your stopwatch thumb is early on one trial and late on the next, timings scatter around the truth (random — average them).
▸ Accuracy versus Precision
• Picture a dartboard and the two words stop being interchangeable. DEFINITION — Accuracy: how close the mean of the readings is to the TRUE value — the cluster centred on the bullseye; it is limited by systematic errors. DEFINITION — Precision: how closely the readings agree WITH EACH OTHER — a tight cluster anywhere on the board; it is limited by random errors and least count.
• So a miscalibrated screw gauge is precise but inaccurate (tight cluster, off target), while a coarse scale read many times can be accurate on average but imprecise (scatter centred on truth). The professional diagnoses which enemy is present before reaching for a cure.
★ HIGHLIGHT — The bridge rule: every reported result ends at its first uncertain digit. Mean ± Δa and significant figures are two dialects of one language — honesty about doubt.

▸ Vernier Calipers — Least Count, Reading and Zero Error
• The first precision instrument of your life (Fig. 1.1): a sliding vernier scale rides beside the main scale, and the slight mismatch between their divisions lets your eyes read a tenth of a millimetre. Lower jaws grip outside dimensions, upper jaws measure inside diameters, and the tail rod probes depths.
• DEFINITION — Vernier least count: LC = 1 MSD − 1 VSD, the difference between one main scale division and one vernier scale division.
✔ KEY FORMULA — If 10 vernier divisions coincide with 9 main scale divisions and 1 MSD = 1 mm, then 1 VSD = 0.9 mm and LC = 0.1 mm = 0.01 cm. Reading = Main scale reading + (Coinciding vernier division × LC) − Zero error.
• WORKED PATTERN — Main scale reads 12 mm, the 7th vernier division coincides, LC = 0.1 mm: reading = 12 + 7 × 0.1 = 12.7 mm = 1.27 cm. Three moves: read the main scale, find the coinciding line, add its share.
• DEFINITION — Zero error: the reading shown when the true value is zero (jaws fully closed, Fig. 1.4). It is subtracted — WITH ITS SIGN — from every reading: corrected value = observed reading − zero error.
• Reading the sign like a professional: jaws closed and the vernier zero sits RIGHT of the main zero → the instrument over-reads → positive zero error = +(n × LC). Vernier zero sits LEFT → negative zero error, ZE = −[(N − n) × LC] with N the total vernier divisions and n the coinciding one; its magnitude is effectively added back to readings.
• Variant alert: if (N + 1) vernier divisions coincide with N main divisions, then LC = 1 MSD ÷ (N + 1). Read the coincidence sentence in the question word by word before reaching for a formula.
• YOUR TURN — LC = 0.01 cm; main scale reading 2.3 cm; 6th division coincides; zero error +0.02 cm. Corrected length? (Answer: observed = 2.3 + 6 × 0.01 = 2.36 cm; corrected = 2.36 − 0.02 = 2.34 cm.)

▸ Screw Gauge — Least Count, Reading and Zero Error
• If the Vernier reads tenths of a millimetre, the screw gauge (Fig. 1.2) reads hundredths: a precision screw converts rotation into tiny forward steps. One full turn of the cap advances the spindle by exactly one pitch; divide that turn into 50 or 100 parts and wire diameters and foil thicknesses yield to 10⁻⁵ m.
• DEFINITION — Pitch: the distance the spindle advances in one complete rotation of the cap. Least count of a screw gauge: LC = Pitch ÷ Number of circular scale divisions.
✔ KEY FORMULA — Pitch 0.5 mm over 50 divisions → LC = 0.01 mm; pitch 1 mm over 100 divisions → LC = 0.01 mm. Reading = Main scale reading + (Coinciding circular division × LC) − Zero error.
• WORKED PATTERN — Main scale 3 mm, 32nd circular division coincides, LC = 0.01 mm: reading = 3 + 32 × 0.01 = 3.32 mm.
• Zero error, screw-gauge edition (Fig. 1.4): at contact, circular zero BELOW the reference line → positive ZE = +(n × LC). Circular zero ABOVE the line → negative ZE = −[(N − n) × LC]. Concrete case: N = 100 and the 95th division coincides at contact → ZE = −5 × 0.01 = −0.05 mm, so ADD 0.05 mm to every reading.
• EXAM-GRADE PATTERN (NEET style): LC = 0.001 cm, main scale reading 5 mm, 25th division coincides, ZE = −0.004 cm. Observed = 0.500 + 0.025 = 0.525 cm; corrected = 0.525 − (−0.004) = 0.529 cm. The double negative does real work — this is exactly why zero-error signs are drilled.
• DEFINITION — Backlash error: the lag in a worn screw thread that makes the spindle hesitate when rotation reverses. Defence: approach every final reading turning in ONE direction only, and let the ratchet — never your grip — make the final contact. The spherometer uses the same screw principle to measure curvature: R = l²/(6h) + h/2.
⚠ EXAM TRAP — The ratchet is not decoration. Squeezing the cap by hand crushes the wire and falsifies the diameter — a technique error no formula can repair afterwards.

▸ Measuring the Very Large and the Very Small — Parallax and Ranges
• A kept promise: this section restores material deleted from the NCERT textbook in the 2023 rationalisation — but it survives in NCERT's own exercises (1.6, 1.8) and in JEE/NEET papers every year, so it remains fully in the game.
• DEFINITION — Parallax: the apparent shift of a nearby object against a distant background when the observer's viewpoint changes. The separation between viewpoints is the basis b; the angular shift is the parallax angle θ. You use it daily: blink alternate eyes at a raised finger and it "jumps" against the wall.
✔ KEY FORMULA — Distance by parallax: D = b/θ (θ in radians, valid when b ≪ D). Angular size: an object of size d at distance D subtending angle α obeys d = αD.
• WORKED PATTERN (NCERT): the Moon, viewed from the two ends of Earth's diameter (basis b = 1.276 × 10⁷ m) with parallax angle 1°54′, lies at D = 3.84 × 10⁸ m. The Sun's angular diameter 1920″ in d = αD returns its diameter ≈ 1.39 × 10⁹ m — the size of a star, from an angle and a distance.
• The scale of everything: instruments resolve from metre scales (10⁻³ m) down through Vernier, screw gauge and optical microscopes to electron microscopes below 1 Å, while nature runs from ~10⁻¹⁴ m (a nucleus) to ~10²⁶ m (the observable universe). Physics measures across forty orders of magnitude; this chapter is the toolbox.
• Estimating the invisible (NCERT classic): an oleic-acid monolayer spread on water has a thickness of molecular size, about 10⁻⁹ m — a molecule measured with a tray of water and a ruler. And the mass anchor: 1 unified atomic mass unit, u = (1/12) the mass of a carbon-12 atom = 1.66 × 10⁻²⁷ kg; atomic masses come from the mass spectrograph, planetary masses from gravitational methods, and time rests on the caesium clock at about 1 part in 10¹³.

Dimensions of Physical Quantities
• Now the chapter's second superpower. Strip any quantity down to its recipe — how much mass, how much length, how much time is baked into it — and you gain a machine that audits equations, converts units and even derives laws. That recipe is the quantity's dimensions.
• DEFINITION — Dimensions of a physical quantity: the powers to which the base quantities must be raised to represent that quantity. Velocity is [L T⁻¹] because it is a length raised to 1 divided by a time raised to 1; the exponents ARE the dimensions.
• The seven base dimensions, with their symbols: Mass [M] • Length [L] • Time [T] • Electric current [A] • Thermodynamic temperature [K] • Amount of substance [mol] • Luminous intensity [cd]. Every dimensional formula in physics is a product of these seven, each raised to some (often zero) power.
• What an exponent means, physically: in [Force] = [M¹ L¹ T⁻²], doubling the mass unit's scale affects force linearly (exponent 1 on M), while the time exponent −2 says force varies as the inverse square of the time unit. Exponents are sensitivities — remember this when unit conversion arrives: they become the powers in the conversion formula.
• Why dimensions earn their keep: two quantities can share a unit yet differ in dimensions (a joule of work versus a joule-per-kelvin of entropy — wait, entropy's unit J/K already betrays different dimensions), and quantities with identical dimensions always respond identically to unit changes. Dimensional thinking sees structure that unit labels hide.
• Dimensions are relative to the chosen fundamental set — a pattern past papers love: take force (F), velocity (V) and time (T) as fundamental and mass becomes [F V⁻¹ T] (from F = ma → m = F/a = F ÷ (V/T)); take energy (E), velocity and time as fundamental and surface tension becomes [E V⁻² T⁻²]. Same physics, different alphabet — the method adapts.
• YOUR TURN — Dimensions of pressure, from scratch: pressure = force ÷ area → [M L T⁻²] ÷ [L²] = [M L⁻¹ T⁻²]. Fifteen seconds, no memorisation.

▸ Master Reference Table — Dimensional Formulae, Derived Not Listed
✔ KEY FORMULA — The universal derivation recipe: (1) write the quantity's defining equation, (2) replace every quantity in it by its dimensions, (3) simplify. Every row below is produced by this recipe — derive, never memorise.
• AREA AND VOLUME — Area = length × breadth → [L²]. Volume = length³ → [L³]. (No defining subtlety: pure geometry.)
• VELOCITY AND ACCELERATION — Velocity = displacement ÷ time → [L T⁻¹]. Acceleration = change of velocity ÷ time → [L T⁻²]. Angular velocity = angle ÷ time → [T⁻¹], because the angle itself is dimensionless.
• MOMENTUM, IMPULSE AND FORCE — Momentum = mass × velocity → [M L T⁻¹]. Impulse = force × time → [M L T⁻¹] (the twin of momentum, as the impulse–momentum theorem demands). Force = mass × acceleration → [M L T⁻²].
• WORK, ENERGY AND POWER — Work = force × displacement → [M L² T⁻²]; every energy (kinetic, potential, thermal) shares this. Power = work ÷ time → [M L² T⁻³]. Torque = force × lever arm → [M L² T⁻²] — work's dimensional twin, though torque is a vector and work a scalar.
• PRESSURE, STRESS AND DENSITY — Pressure = force ÷ area → [M L⁻¹ T⁻²]; stress and Young's modulus share it exactly. Density = mass ÷ volume → [M L⁻³].
• FREQUENCY AND PERIOD — Period is a time → [T]. Frequency = 1 ÷ period → [T⁻¹]. Angular momentum = momentum × radius → [M L² T⁻¹] — the twin of the Planck constant. Moment of inertia = mass × length² → [M L²].
• GRAVITATIONAL CONSTANT — From F = G m₁m₂/r²: [G] = [F][L²] ÷ [M²] = [M⁻¹ L³ T⁻²]. Derive it this way in the exam if it slips your memory.
• SPRING CONSTANT AND SURFACE TENSION — Spring constant k = force ÷ extension → [M L T⁻²] ÷ [L] = [M T⁻²]. Surface tension = force ÷ length (or energy ÷ area) → also [M T⁻²]. Twins again — a favourite matching pair.
• VISCOSITY — From the viscous force law F = ηA(dv/dx): [η] = [F] ÷ ([L²] × [T⁻¹]) = [M L⁻¹ T⁻¹]. The velocity gradient dv/dx carries [T⁻¹].
• HEAT FAMILY — Specific heat capacity = heat ÷ (mass × temperature rise) → [L² T⁻² K⁻¹]. Latent heat = heat ÷ mass → [L² T⁻²]. Boltzmann constant k_B = energy ÷ temperature → [M L² T⁻² K⁻¹]. Gas constant R (per mole) → [M L² T⁻² K⁻¹ mol⁻¹]. Thermal conductivity → [M L T⁻³ K⁻¹]. Stefan constant σ → [M T⁻³ K⁻⁴] (σ = 5.67 × 10⁻⁸ W m⁻² K⁻⁴).
• ELECTRICITY AND MAGNETISM — Charge = current × time → [A T]. Electric field = force ÷ charge → [M L T⁻³ A⁻¹]. Electric potential and EMF = work ÷ charge → [M L² T⁻³ A⁻¹]. Resistance = potential ÷ current → [M L² T⁻³ A⁻²]. Capacitance = charge ÷ potential → [M⁻¹ L⁻² T⁴ A²]. Inductance → [M L² T⁻² A⁻²]. Magnetic field B = force ÷ (charge × velocity) → [M T⁻² A⁻¹]. Magnetic flux → [M L² T⁻² A⁻¹]. Permittivity ε₀ → [M⁻¹ L⁻³ T⁴ A²]. Permeability μ₀ → [M L T⁻² A⁻²]. Planck constant h = energy ÷ frequency → [M L² T⁻¹].
• MODERN PHYSICS — Rydberg constant R∞ → [L⁻¹], value 1.097373 × 10⁷ m⁻¹ for an infinitely heavy nucleus; hydrogen's own R_H = 1.09678 × 10⁷ m⁻¹ is slightly smaller — do not mix them. Work function Φ is an energy → [M L² T⁻²].
• A landmark IAT actually asked (2021): the von Klitzing constant R_K = h/e² ≈ 25,812.8 Ω. Offered e²/h, e/h, h/e and h/e², only h/e² carries the dimensions of resistance — one line, if you think dimensionally.

Dimensional Formulae and Dimensional Equations
• DEFINITION — Dimensional formula: the bracketed expression showing how and in what powers the base quantities compose a quantity — [M L T⁻²] for force. DEFINITION — Dimensional equation: the equation obtained by setting a quantity equal to its dimensional formula — [Force] = [M L T⁻²]; [Energy] = [M L² T⁻²]. The general form of any formula is [Mᵃ Lᵇ Tᶜ θᵈ …], where the exponents a, b, c, d are the dimensions with respect to each base quantity.
• Constructing a formula, once more with feeling: start from the DEFINING equation — the law that introduces the quantity — not from a convenient rearrangement. Power comes from P = W/t, not from W = Pt, if power is what you are defining. Textbooks occasionally rearrange; the dimensions survive either way, but the defining route never confuses cause with effect.
• DEFINITION — Principle of homogeneity: a physical equation can be correct only if every term on both sides has exactly the same dimensions. Only quantities of identical dimensions may be equated, added or subtracted. Adding a length to a time is as meaningless in physics as adding 3 kilograms to 2 seconds in a shop.
• Corollary with teeth: the argument of sin, cos, tan, eˣ and ln must be dimensionless, and the functions themselves are dimensionless. In x = A sin(ωt), the product ωt must be dimensionless, forcing [ω] = [T⁻¹]. In N = N₀e^(−λt), the same logic forces [λ] = [T⁻¹]. No exceptions, ever.
• How to audit an equation, mechanically: (1) pick one term, compute its dimensions; (2) repeat for every term on both sides; (3) all must match the dimensions of the quantity isolated on the left. Audit every added term separately — that IS the whole technique.
• Dimensionless versus dimensioned, finally sorted: a quantity is DIMENSIONLESS when all seven exponents are zero — strain, refractive index, plane angle, relative density, Poisson's ratio, efficiency, coefficient of friction, and the Reynolds number Re = ρvL/η (verify: [M L⁻³][L T⁻¹][L] ÷ [M L⁻¹ T⁻¹] = 1). Dimensionless quantities may still carry a unit (rad, sr) or none — the two ideas are independent.
• The identical-dimension families — memorise these groupings as units: {work, energy, torque} • {momentum, impulse} • {pressure, stress, Young's modulus, energy density} • {frequency, angular velocity, velocity gradient} • {Planck constant, angular momentum} • {surface tension, spring constant} • the time trio {L/R, RC, √(LC)} all carrying [T].
⚠ EXAM TRAP — Identical dimensions do NOT mean identical nature: torque is a vector, work a scalar; angular momentum is a vector, Planck's constant a scalar. Dimensions audit recipes, not meanings.
⚠ EXAM TRAP — The impostor pair: tension [M L T⁻²] and surface tension [M T⁻²] do NOT share dimensions despite their names (an NCERT Exemplar favourite). Likewise strain (dimensionless) is not stress [M L⁻¹ T⁻²], and angle (dimensionless) is not angular momentum [M L² T⁻¹].

Dimensional Analysis and Its Applications
• Dimensional analysis is the disciplined use of dimensions to extract information about physical laws. It has exactly five applications — learn them as five separate tools, because exam questions name them separately.
• APPLICATION 1 — Checking consistency: audit a candidate equation term by term (the homogeneity principle at work). An equation that fails is certainly wrong; one that passes is merely not-yet-convicted.
• APPLICATION 2 — Deriving relationships: assume the target depends on plausible parameters raised to unknown powers, write the dimensional equation, and solve. APPLICATION 3 — Finding the powers: the same machinery answers the narrower question "to what power does X enter?" Both rest on assumptions you must state: the list of relevant parameters is COMPLETE, the relationship is a product of powers (monomial), and the dimensionless constant stays undetermined.
• Derivation 1 — Pendulum period: assume T = k lᵃ gᵇ mᶜ. Dimensions: [T] = [L]ᵃ [L T⁻²]ᵇ [M]ᶜ. M: c = 0 — the period cannot involve the bob's mass. T: −2b = 1 → b = −½. L: a + b = 0 → a = ½. Result: T = k√(l/g). Experiment fixes k = 2π — analysis alone cannot.
• Derivation 2 — Stokes' viscous force: F = k ηᵃ rᵇ vᶜ. M: a = 1. T: −a − c = −2 → c = 1. L: −a + b + c = 1 → b = 1. Result: F = kηrv; experiment crowns it with k = 6π, giving Stokes' law F = 6πηrv.
• Derivation 3 — Centripetal force: F = k mᵃ vᵇ rᶜ yields a = 1, b = 2, c = −1: F = k mv²/r, with k = 1 from theory — the same v²/r that geometry will prove in the circular-motion chapter.
• Derivation 4 — Speed of sound: v = k Bᵃ ρᵇ with [B] = [M L⁻¹ T⁻²] and [ρ] = [M L⁻³] gives a = ½, b = −½: v = k√(B/ρ) — the Newton–Laplace v = √(γP/ρ) in disguise, the dimensionless γ hiding inside k.
• Derivation 5 — Planck units from c, G and h (the IAT speciality; IAT 2019 asked for energy built from h, c, G): the same three-equation machine returns length √(hG/c³), time √(hG/c⁵), mass √(hc/G), energy √(hc⁵/G). Constructing quantities from fundamental constants is IAT's fingerprint — practise it until it is reflex.
⚠ EXAM TRAP — True Planck units are built with ħ = h/2π; school questions use h. The dimensions agree, so dimensional answers agree — but the numerical Planck length ≈ 1.616 × 10⁻³⁵ m belongs to ħ. Never mix h and ħ inside a numerical.
• APPLICATION 4 — Converting units between systems. The conversion law follows from the master identity n₁u₁ = n₂u₂ plus the fact that a unit's size scales as the product of base units raised to the dimensional exponents:
✔ KEY FORMULA — For dimensional formula [Mᵃ Lᵇ Tᶜ]: n₂ = n₁ × (M₁/M₂)ᵃ × (L₁/L₂)ᵇ × (T₁/T₂)ᶜ. Worked: 1 N in dynes — exponents (1, 1, −2) → n₂ = (kg/g)¹ × (m/cm)¹ = 1000 × 100 = 10⁵ dyne. 1 J in ergs — exponents (1, 2, −2) → n₂ = 1000 × 100² = 10⁷ erg. Mercury's density 13.6 g/cm³ in SI: 13.6 × (g/kg) × (cm/m)⁻³ = 13.6 × 10⁻³ × 10⁶ = 13,600 kg/m³; pocket form: 1 g/cm³ = 1000 kg/m³.
• APPLICATION 5 — Identifying impossible expressions: any candidate formula whose terms mismatch, or whose transcendental argument carries dimensions, is rejected without calculation. This is the fastest question type in the chapter — train it to reflex speed in the practice set below.

▸ Thomson's e/m Experiment — Dimensional Thinking Catches a Particle
• The chapter's finale is a detective story. By 1897, cathode rays were known to carry negative charge, but the electron's charge e and mass mₑ separately were unmeasurable. Their RATIO could be caught — and J. J. Thomson caught it with the apparatus of Fig. 1.3: a cathode ray tube with cathode and anode on a high-voltage supply, a magnet arranged around the tube, and a fluorescent screen where the beam lands.
• Three acts: Electric field alone — the spot deflects to point A, dragged towards the positive plate. Magnetic field alone — the spot bends to point C, pushed the other way by the Lorentz force. Both fields balanced — the spot returns to the centre B; the beam flies straight.
✔ KEY FORMULA — Step 1 (acceleration through voltage V): eV = ½mₑv². Step 2 (balance — a velocity selector): eE = evB, hence v = E/B. Step 3 (combine): e/mₑ = E²/(2VB²).
• Every quantity on the right is directly measurable, so the ratio emerges: e/mₑ ≈ 1.76 × 10¹¹ C/kg — about 1836 times the same ratio for a hydrogen ion. That single comparison announced the electron as vastly lighter than any atom: the first subatomic particle had a measured fingerprint.
• EXAMPLE — The transferable strategy: when two quantities cannot be measured separately, measure a well-chosen COMBINATION of them. e/m here; ε₀μ₀ yielding 1/c² elsewhere; R_K = h/e² in the quantum Hall effect. Same trick, different costumes — recognising it is research-level thinking.

▸ Limitations of Dimensional Analysis
• Every superpower has kryptonite, and examiners test the limits as happily as the method. Five walls, each with its reason:
• Limit 1 — Dimensionless constants are invisible. The method yields the FORM of a law, never its 2π, ½ or 6π, because pure numbers have no dimensions to track. Any derivation you present is incomplete until experiment or theory supplies the constant — say so, every time.
• Limit 2 — Sums defeat it. If a law is a sum of terms with different parameter combinations (s = ut + ½at² involves two different monomials), a single product-of-powers assumption cannot represent it. The method can audit such equations but cannot derive them.
• Limit 3 — Transcendental functions defeat derivation. Laws containing eˣ, sin x or ln x cannot be derived, because their arguments must be dimensionless constants-combinations the power-product ansatz cannot generate; only the argument's dimensionlessness itself can be extracted.
• Limit 4 — Too many parameters. With three base dimensions in mechanics (M, L, T) you get three equations; a quantity depending on more than three independent parameters leaves the system underdetermined — infinitely many dimensionally acceptable forms.
• Limit 5 — It cannot separate twins, nor identify mechanism. Work and torque pass identical audits; the method certifies consistency, never causation. It will never tell you WHY the pendulum's period ignores mass — only that any correct law must.
• The common student mistakes that grow from these limits: presenting T = k√(l/g) as the finished law (k missing); claiming a dimensionally consistent formula is "proved"; applying the power-product method to exponential decay; and forgetting that the parameter list itself is a physical assumption that can simply be wrong (omit air resistance from the pendulum and the method never complains).

High-Yield Formula Sheet
• SI anchors: c = 299,792,458 m/s • h = 6.62607015 × 10⁻³⁴ J s • e = 1.602176634 × 10⁻¹⁹ C • k_B = 1.380649 × 10⁻²³ J/K • N_A = 6.02214076 × 10²³ mol⁻¹ • Δν_Cs = 9,192,631,770 Hz • K_cd = 683 lm/W.
✔ KEY FORMULA — Q = n × u with n₁u₁ = n₂u₂ • Vernier LC = 1 MSD − 1 VSD • Screw gauge LC = Pitch ÷ Circular divisions • Corrected reading = Observed − Zero error (with sign) • Parallax D = b/θ, size d = αD.
✔ KEY FORMULA — Error flow: sum/difference ΔZ = ΔA + ΔB • product/quotient ΔZ/Z = ΔA/A + ΔB/B • power ΔZ/Z = n(ΔA/A) • master rule ΔZ/Z = Σ |exponent| × (Δquantity/quantity).
• Significant figures in one breath: non-zero always • captive zeros yes • leading zeros never • trailing zeros count only with a decimal point • +/− follow decimal places • ×/÷ follow significant figures • exact-5 rounding goes to the even digit.
✔ KEY FORMULA — Core dimensions: [F] = [M L T⁻²] • [E] = [M L² T⁻²] • [P] = [M L² T⁻³] • [pressure] = [M L⁻¹ T⁻²] • [G] = [M⁻¹ L³ T⁻²] • [h] = [M L² T⁻¹] • [η] = [M L⁻¹ T⁻¹] • [surface tension] = [M T⁻²] • [R] = [M L² T⁻³ A⁻²].
✔ KEY FORMULA — Unit conversion: n₂ = n₁ (M₁/M₂)ᵃ (L₁/L₂)ᵇ (T₁/T₂)ᶜ • 1 N = 10⁵ dyne • 1 J = 10⁷ erg • 1 g/cm³ = 1000 kg/m³ • 1 eV = 1.602 × 10⁻¹⁹ J • 1 light year = 9.46 × 10¹⁵ m.
• Derived-by-analysis results: pendulum T = 2π√(l/g) • Stokes F = 6πηrv • centripetal F = mv²/r • sound v = √(γP/ρ) • Planck energy √(hc⁵/G) • e/mₑ = E²/(2VB²) ≈ 1.76 × 10¹¹ C/kg.

Common Mistakes and Exam Traps
• Mistake 1 — Confusing units with dimensions. Why wrong: a unit is a chosen standard (metre, foot); a dimension is the abstract recipe [L]. The same dimension wears many units; the same unit name can even serve different quantities in sloppy speech. Correct principle: convert with units, audit with dimensions — never interchange the two jobs.
• Mistake 2 — "Dimensionally correct, therefore true." Why wrong: homogeneity is necessary, not sufficient; s = ut + 2at² passes every dimensional test and is still false, because dimensionless constants (here ½ versus 2) are invisible to dimensions. Correct principle: a failed audit convicts; a passed audit merely acquits for lack of evidence.
• Mistake 3 — Applying significant-figure rules to addition. Why wrong: addition aligns absolute uncertainties, which live in decimal places — 227.2 limits a sum to one decimal place regardless of its 4 significant figures. Correct principle: +/− → decimal places; ×/÷ → significant figures.
• Mistake 4 — Equating precision with accuracy. Why wrong: a miscalibrated instrument gives tightly clustered, systematically wrong readings — precise, inaccurate. Correct principle: precision = scatter (random errors, least count); accuracy = distance from truth (systematic errors).
• Mistake 5 — Forgetting conversion factors mid-calculation. Why wrong: mixing km/h with metres and seconds silently corrupts every downstream number; 72 km/h is 20 m/s, and the 3.6 factor is the single most dropped factor in Indian entrance exams. Correct principle: convert everything to SI before substituting, and let units cancel visibly.
• Mistake 6 — "Dimensionless means unitless." Why wrong: the radian and steradian are dimensionless yet are genuine named units; strain is dimensionless and unitless. Correct principle: dimensions and units are separate ledgers — check both.
• Mistake 7 — Botching exponent algebra. Why wrong: when quantities multiply, exponents ADD; when a quantity is raised to power n, exponents MULTIPLY by n. Writing [v²] = [L² T⁻²] correctly but then [√v] with doubled exponents inverts the rule. Correct principle: dimensions follow the same algebra as the quantities themselves.
• Mistake 8 — Subtracting errors in a difference. Why wrong: for Z = A − B the maximum error is ΔZ = ΔA + ΔB, because each reading can err in the direction that widens the gap. Correct principle: in maximum-error accounting, errors always add — for sums, differences, products and quotients alike.
⚠ EXAM TRAP — The three named traps of the chapter, collected: post-2019 μ₀ is measured, not exactly 4π × 10⁻⁷ • tension ≠ surface tension • R∞ ≠ R_H. If an option leans on any of these, it is the trap.

Worked Examples — Basic to Challenging
• EXAMPLE 1 (Unit conversion). Problem: express 72 km/h in SI units. Given: 72 km/h; 1 km = 1000 m, 1 h = 3600 s. Principle: multiply by conversion factors equal to 1 so units cancel. Steps: 72 × (1000 m)/(3600 s) = 72 × 5/18 = 20 m/s. Answer: 20 m/s. Reasoning: the factor 5/18 is this conversion pre-computed — derive it once, use it forever. Mistake to avoid: multiplying by 3.6 instead of dividing (that converts m/s INTO km/h).
• EXAMPLE 2 (Counting and rounding). Problem: (a) significant figures in 0.000405060; (b) round 34.750 to 3 significant figures. Given: the 6 counting rules; the even-odd rule. Steps: (a) leading zeros never count; digits 4, 0, 5, 0, 6, 0 all count (captive and trailing-with-point) → 6 significant figures. (b) 34.750 → keep 34.7, dropped part is exactly 5 after an odd digit 7 → raise → 34.8. Answers: (a) 6 (b) 34.8. Mistake to avoid: rounding 34.750 "up because 5" without checking the even-odd rule's condition — here it agrees, but against an even kept digit it would not.
• EXAMPLE 3 (The two rulebooks). Problem: compute (a) 436.32 + 227.2 + 0.301 (b) 12.9 − 7.06, reporting honestly. Principle: +/− follow decimal places. Steps: (a) raw sum 663.821; 227.2 limits to 1 decimal place → 663.8. (b) raw difference 5.84; 12.9 limits to 1 decimal place → 5.8. Answers: 663.8 and 5.8. Reasoning: the least-precise decimal place is a wall no sum may cross. Mistake to avoid: reporting 663.821 "because the calculator said so" — calculators do not know your instruments.
• EXAMPLE 4 (Dimensional formula, two routes). Problem: derive the dimensions of surface tension twice. Given: surface tension = force ÷ length, and = surface energy ÷ area. Steps: route 1: [M L T⁻²] ÷ [L] = [M T⁻²]. Route 2: [M L² T⁻²] ÷ [L²] = [M T⁻²]. Answer: [M T⁻²] both ways. Reasoning: two independent defining equations agreeing is the strongest self-check this chapter offers — use it whenever a quantity has two definitions. Mistake to avoid: confusing surface tension with tension [M L T⁻²] — the impostor pair again.
• EXAMPLE 5 (Homogeneity audit). Problem: in the van der Waals equation (P + a/V²)(V − b) = RT, find [a] and [b]. Principle: any term added to P must be a pressure; any term subtracted from V must be a volume. Steps: [a/V²] = [P] = [M L⁻¹ T⁻²] → [a] = [M L⁻¹ T⁻²] × [L⁶] = [M L⁵ T⁻²]. [b] = [V] = [L³]. Answers: [a] = [M L⁵ T⁻²], [b] = [L³]. Mistake to avoid: auditing only the whole equation's two sides — multi-term equations must be audited term by term.
• EXAMPLE 6 (Deriving a law). Problem: a sphere of radius r moves at speed v through a fluid of viscosity η; derive the viscous force. Given: assume F = k ηᵃ rᵇ vᶜ, with [η] = [M L⁻¹ T⁻¹]. Steps: [M L T⁻²] = [M L⁻¹ T⁻¹]ᵃ [L]ᵇ [L T⁻¹]ᶜ. M: a = 1. T: −a − c = −2 → c = 1. L: −a + b + c = 1 → b = 1. Answer: F = kηrv — experiment sets k = 6π (Stokes' law). Reasoning: three unknowns, three base dimensions, three equations — the machine works precisely when the counts match. Mistake to avoid: presenting F = ηrv without k — the constant is part of the law.
• EXAMPLE 7 (Converting a derived unit). Problem: express 1 atmosphere = 1.013 × 10⁵ Pa in CGS (dyne/cm²). Given: [pressure] = [M L⁻¹ T⁻²], exponents (1, −1, −2). Steps: n₂ = 1.013 × 10⁵ × (kg/g)¹ × (m/cm)⁻¹ = 1.013 × 10⁵ × 1000 ÷ 100 = 1.013 × 10⁶. Answer: 1.013 × 10⁶ dyne/cm². Reasoning: a negative length exponent FLIPS its ratio — the (m/cm)⁻¹ is the step everyone rushes. Mistake to avoid: using (cm/m) instead and landing a factor of 10⁴ away.
• EXAMPLE 8 (Challenge — IAT style). Problem: construct an energy from h, c and G alone. Given: [h] = [M L² T⁻¹], [c] = [L T⁻¹], [G] = [M⁻¹ L³ T⁻²]; assume E = k hᵃ cᵇ Gᶜ'. Steps: [M L² T⁻²] = [M L² T⁻¹]ᵃ [L T⁻¹]ᵇ [M⁻¹ L³ T⁻²]ᶜ'. M: a − c' = 1. L: 2a + b + 3c' = 2. T: −a − b − 2c' = −2. Solving: a = ½, b = 5/2, c' = −½. Answer: E = k√(hc⁵/G) — the Planck energy (k = 1 in ħ-based units). Reasoning: this is the examiners' favourite construction game; fluency here is a genuine IAT edge. Mistake to avoid: sign-slipping the G exponent — G carries M⁻¹, so its exponent enters the M-equation negatively.

Practice Questions — Self-Test Set
• Instructions: attempt all ten before opening the answer key. Types are mixed as in real papers: single-correct (Q1–Q4), multiple-correct (Q5–Q6), numerical-response (Q7–Q8) and statement-based (Q9–Q10). Difficulty, the concept tested and the trap are declared for every question — after you attempt it.
• Q1 [Easy • SI base units] Which of the following is an SI BASE unit? (a) newton (b) joule (c) candela (d) pascal
• Q2 [Easy • Addition rule] The sum 12.9 + 7.06 must be reported as: (a) 19.96 (b) 20.0 (c) 19.9 (d) 19.960
• Q3 [Medium • Deriving dimensions] Using F = ηA(dv/dx), the dimensions of the coefficient of viscosity η are: (a) [M L⁻¹ T⁻¹] (b) [M L T⁻¹] (c) [M L⁻¹ T] (d) [M⁻¹ L T⁻¹]
• Q4 [Medium • Homogeneity] In v² = u² + 2as, if s is in metres and a in m/s², then u must be measured in: (a) m/s (b) m²/s (c) m/s² (d) any unit, since constants absorb it
• Q5 [Medium • Multiple correct — dimensionless quantities] Which of the following have NO dimensions? (a) strain (b) solid angle (c) stress (d) Poisson's ratio
• Q6 [Medium • Multiple correct — dimensional twins] Which pairs share identical dimensions? (a) work and torque (b) tension and surface tension (c) Planck constant and angular momentum (d) frequency and angular velocity
• Q7 [Numerical • Significant figures in a result] A cube of side 4.20 cm has mass 74.5 g. Its density, correctly reported, is ___ g/cm³.
• Q8 [Numerical • Screw gauge] A screw gauge has pitch 0.5 mm and 50 circular divisions. Main scale reading 2.5 mm, 38th division coincides, zero error −0.02 mm. The corrected thickness is ___ mm.
• Q9 [Statement-based • Limits of homogeneity] Statement I: A dimensionally correct equation is always physically correct. Statement II: s = ut + 2at² is dimensionally homogeneous. Choose: (a) both true (b) I true, II false (c) I false, II true (d) both false
• Q10 [Assertion–Reason • Transcendental arguments] Assertion: the argument of eˣ in a physical law must be dimensionless. Reason: eˣ = 1 + x + x²/2! + …, and quantities of different dimensions cannot be added. Choose: (a) both true, and the reason explains the assertion (b) both true, reason does not explain (c) assertion true, reason false (d) assertion false, reason true
▸ Answer Key with Explanations
• A1 — (c) candela. The newton, joule and pascal are all derived (kg m s⁻², kg m² s⁻², kg m⁻¹ s⁻²). Concept: base versus derived. Misconception targeted: "named units are base units" — most named units honour scientists precisely because they are derived combinations.
• A2 — (b) 20.0. The raw sum is 19.96; 12.9 limits the result to one decimal place, and 19.96 rounds to 20.0 at one decimal place. (a) ignores the rule; (c) truncates wrongly; (d) invents precision. Concept: addition follows decimal places.
• A3 — (a) [M L⁻¹ T⁻¹]. η = F ÷ (A × dv/dx): [M L T⁻²] ÷ ([L²][T⁻¹]) = [M L⁻¹ T⁻¹]. Options (b)–(d) each drop or flip one factor — the velocity gradient's [T⁻¹] is the usual casualty. Concept: deriving dimensions from a defining law.
• A4 — (a) m/s. [u²] must equal [v²] = [L² T⁻²], so [u] = [L T⁻¹]. Option (d) is the classic error — the 2 in 2as is dimensionless and absorbs nothing. Concept: homogeneity constrains every symbol, not just the answer's unit.
• A5 — (a), (b) and (d). Strain (ΔL/L), solid angle (area/r²) and Poisson's ratio (strain/strain) are pure ratios. Stress is force/area, [M L⁻¹ T⁻²] — dimensioned. Concept: dimensionless quantities. Misconception: "solid angle has a unit, so it has dimensions" — rad/sr are dimensionless units.
• A6 — (a), (c) and (d). Work and torque both [M L² T⁻²]; h and angular momentum both [M L² T⁻¹]; frequency and angular velocity both [T⁻¹]. Pair (b) is the impostor: tension [M L T⁻²] versus surface tension [M T⁻²]. Concept: identical-dimension families.
• A7 — 1.01 g/cm³. Volume = (4.20)³ = 74.088 cm³; density = 74.5 ÷ 74.088 = 1.0056 g/cm³, reported to 3 significant figures (both inputs carry 3) → 1.01 g/cm³. Misconception: reporting 1.0056 — the calculator's digits are not the measurement's digits.
• A8 — 2.90 mm. LC = 0.5 ÷ 50 = 0.01 mm. Observed = 2.5 + 38 × 0.01 = 2.88 mm. Corrected = observed − ZE = 2.88 − (−0.02) = 2.90 mm. Misconception: adding the zero error with the wrong sign — always subtract ZE as a signed quantity.
• A9 — (c). Statement I is false (homogeneity is necessary, not sufficient — the very counterexample in Statement II passes the dimensional audit with a wrong constant 2 instead of ½, so II is true and simultaneously disproves I). Concept: limits of dimensional analysis.
• A10 — (a). The series for eˣ adds 1, x, x²/2!, … — terms that would carry different dimensions unless x is dimensionless; addition of unlike dimensions is meaningless, which is exactly why the assertion holds. The reason is the correct explanation. Concept: why transcendental arguments are dimensionless.
• Scoring guide: 9–10 = exam-ready for this chapter; 6–8 = strong, revisit the sections named by the questions you missed; below 6 = re-read the chapter with the practice set open beside you, then re-attempt after a day.

Chapter Summary and Revision Checklist
• Summary in one paragraph: Measurement expresses quantities as number × unit in the SI, a coherent system now founded on seven constants of nature. Significant figures report a measurement's precision honestly, with decimal-place rules for addition and significant-figure rules for multiplication. Errors classify into systematic, random and gross, and propagate by addition through every calculation. Dimensions — the powers of the base quantities in a quantity's recipe — power dimensional analysis: auditing equations, deriving laws, and converting units, within firm limits (no constants, no sums, no transcendental laws, no twin-separation).
• Essential definitions to be able to reproduce verbatim: physical quantity and unit (Q = n × u) • significant figures • least count • zero error • accuracy versus precision • dimensions and dimensional equation • principle of homogeneity.
• Must-remember formulae: LC rules for Vernier and screw gauge • ΔZ/Z = Σ|exponent| × relative error • [F], [E], [G], [h] and the twin families • conversion law n₂ = n₁(M₁/M₂)ᵃ(L₁/L₂)ᵇ(T₁/T₂)ᶜ • T = 2π√(l/g), F = 6πηrv, E_Planck = √(hc⁵/G) • e/mₑ = E²/(2VB²).
• Frequently confused pairs — say the difference aloud for each: unit versus dimension • precision versus accuracy • systematic versus random error • tension versus surface tension • dimensionless versus unitless • R∞ versus R_H • dimensionally correct versus physically correct.
• Revision checklist: □ I can write the seven base units with their defining constants □ I can count significant figures in any form, including scientific notation □ I can round with the even-odd rule and justify it □ I can read a Vernier and a screw gauge, with signed zero error □ I can classify an error and state its cure □ I can derive any common dimensional formula from its defining equation □ I can audit an equation term by term □ I can derive the pendulum and Stokes results unaided □ I can convert force, energy and density between SI and CGS □ I can state all five limitations without notes.
• Self-assessment — answer honestly: (1) Why does addition follow decimal places while multiplication follows significant figures? (2) Why can't dimensional analysis find the 2π in the pendulum law? (3) A screw gauge's zero error is −0.03 mm and a reading is 4.12 mm — what is the corrected value, and why? (4) Which has more significant figures, 0.00120 or 1200, and what extra information would settle the second? (5) Construct a pressure from h, c and G-style constants is impossible — which limitation explains why some constructions fail? If any answer stalls, revisit: (1) the arithmetic section, (2) and (5) limitations, (3) the screw gauge section, (4) the counting rules. (Answers: (3) 4.15 mm — subtract the signed error: 4.12 − (−0.03); (4) 0.00120 has exactly 3 significant figures (1, 2 and the trailing 0), while 1200 is ambiguous — it could carry 2, 3 or 4, and only scientific notation can declare which.)
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

            studyNotesCount = 16,

            practiceQuestionCount = 20,

            durationMinutes = 40,

            formulaHighlight = "v = u + at • s = ut + ½at² • v² = u² + 2as • sₙ = u + a(2n − 1)/2 • H = u²/2g",

            keyConceptsSummary = "Displacement vs path length \u2014 |\u0394x| \u2264 distance, always\nInstantaneous velocity v = dx/dt \u2014 the slope of the x\u2013t tangent\nAcceleration a = dv/dt \u2014 speeding up when v and a share a sign\nv\u2013t graph: slope gives a, signed area gives displacement\nThree kinematic equations \u2014 valid only for constant a\nFree fall: H = u\u00b2/2g, flight time 2u/g; at the top v = 0 but a = \u2212g\nRelative velocity v_AB = v_A \u2212 v_B; stopping distance = u\u00b7t_r + u\u00b2/2a",

            detailedStudyNotes = """

Position, Path Length and Displacement
• DEFINITION — Position: the location of a body given by its signed coordinate x measured from a chosen origin along the line of motion. Displacement: the change of position, Δx = x_final − x_initial — a vector from the starting point to the finishing point that does not care about the route taken.
• EXAMPLE — Put home at 0 and the school gate at +2 km. You walk to a friend's house at +3 km, then back to school. Path length = 3 + 1 = 4 km; displacement = +2 km. Same legs, two different quantities — feel the difference once and you will never confuse them.
• Let's start with a scene you know. You walk 4 m east to the gate, realise you forgot your phone, and walk 4 m back west. Quick question — how far are you from where you started? Zero. But your legs definitely travelled 8 m. That gap between "how much ground you covered" and "where you finally ended up" is the whole game of this chapter.
• Path length (distance) is the total ground covered, added up step by step, ignoring direction. It only ever grows. In the scene above it is 8 m.
• Displacement is the straight-line jump from start point to end point, WITH direction: Δx = x₂ − x₁. Round trip back home? Displacement = 0, even after a marathon of walking.
✔ KEY FORMULA — Displacement Δx = x₂ − x₁ • Always |displacement| ≤ path length. They become equal only when the motion is in a straight line with no U-turn.
• YOUR TURN — A runner completes exactly one lap of a 400 m circular track. Distance? Displacement? (Answer: distance = 400 m, displacement = 0 — she ends where she started. This exact idea returns in Chapter 3, so lock it in.)
• Signs do the talking in 1D: pick one direction as positive (say, right or upward) and stick to it for the entire problem. A displacement of −5 m simply means "5 m in the opposite direction" — the minus is information, not an error.
⚠ EXAM TRAP — Never write "displacement = −8 m, so path length is also 8 m covered backwards". Path length has no sign and no direction. Mixing these two is the single most common silly mistake in kinematics.

Average Velocity and Average Speed
• DEFINITION — Average velocity: the total displacement divided by the total time taken, v_avg = Δx/Δt — a vector whose sign tells the net direction of travel. Average speed: the total path length divided by the total time — a scalar, what the odometer and the clock agree on.
• Average velocity answers: "overall, how fast did the position change?" Average speed answers a different question: "overall, how fast did the body actually move?" Examiners love that these two answers can differ wildly.
✔ KEY FORMULA — Average velocity = Δx / Δt (displacement ÷ time; it carries a sign) • Average speed = total path length ÷ total time (always ≥ 0, never negative).
• Picture a delivery rider: showroom to your house is 6 km east, he rides 8 km of winding streets in 30 minutes. His average velocity is 6 km / 0.5 h = 12 km/h east — but his average speed is 8 / 0.5 = 16 km/h. Same trip, two honest answers.
• Now the classic exam trap, live: a car covers HALF the distance at 40 km/h and the other half at 60 km/h. Your gut says 50 km/h. Your gut is wrong.
✔ KEY FORMULA — For equal DISTANCES at speeds v₁ and v₂: average speed = 2v₁v₂ / (v₁ + v₂) — the harmonic mean — always LESS than the plain average. Here: 2 × 40 × 60 / 100 = 48 km/h. (For equal TIMES, the plain average (v₁ + v₂)/2 is correct — read the question's wording like a lawyer.)
• Why is it less? Because the car spends MORE time crawling at 40 than flying at 60, so the slow speed gets more "votes" in the average.
⚠ EXAM TRAP — If a body returns to its starting point, average velocity is exactly ZERO no matter how fast it moved. Average speed is not zero. Questions swap these two on purpose.

▸ Instantaneous Velocity and Speed — Velocity at a Moment
• DEFINITION — Instantaneous velocity: the velocity of a body at one particular instant, defined as the limit of average velocity as the time interval around that instant shrinks to zero, v = dx/dt. Its magnitude is the instantaneous speed.
• EXAMPLE — A photo-finish camera does not care about a sprinter's average over 100 m — it judges the instantaneous speed at the line. Your bike's speedometer needle, right now, is also reporting an instantaneous value.
• "Average" velocity is a blunt instrument — it hides everything that happened in between. What you really want is the velocity at one exact moment: that is what a speedometer shows (as speed), and what calculus gives us precisely.
✔ KEY FORMULA — Instantaneous velocity v = dx/dt — the slope of the TANGENT to the position–time graph at that instant. Instantaneous speed = |v|, always the positive size of it.
• THINK OF IT LIKE THIS — Shrink the time window Δt smaller and smaller around the moment you care about. The average velocity over that tiny window settles down to one number: the instantaneous velocity. dx/dt is just that idea written in symbols.
• WORKED PATTERN — Given x = 3t² + 2t, differentiate: v = dx/dt = 6t + 2. At t = 2 s, v = 14 m/s. Differentiate once more: a = dv/dt = 6 m/s², constant. Whenever a problem hands you x(t), this two-step is your entire job.
• YOUR TURN — If x = 5t − t², at what time is the body momentarily at rest? Set v = 5 − 2t = 0 → t = 2.5 s. (Notice: "momentarily at rest" is code for v = 0 — it does NOT mean the acceleration is zero there. Hold that thought; gravity will prove it soon.)
• On a curved position–time graph, draw the tangent at your point and measure its slope — steep tangent means fast, flat tangent means instant rest, downward tangent means moving backwards.
★ HIGHLIGHT — Velocity can be read three ways and they are the same statement: v = dx/dt = slope of x–t graph = the limit of Δx/Δt. If one route is blocked in a problem, take another.

Position–Time Graphs — Reading Motion from Slope
• DEFINITION — Position–time (x–t) graph: a plot of a body's position against time. Its slope at any point equals the velocity at that instant; a tangent drawn at a curve gives the instantaneous velocity there.
• Before you look at the figure, predict: what should the x–t graph of a parked car look like? A car cruising at steady speed? A car speeding away? Now scroll to Fig. 2.1 and check yourself — that prediction habit is worth more than re-reading.
• The one rule that runs everything here: SLOPE = VELOCITY. Horizontal line → at rest. Straight slanted line → uniform velocity. Curve getting steeper → speeding up. Curve flattening out → slowing down. Line going downhill → moving in the negative direction.
• Two bodies on the same x–t graph: where their lines CROSS, they are at the same place at the same time — a meeting. The steeper line at any moment is the faster body at that moment.
• STOP & THINK — Can an x–t graph ever loop back over itself, like a circle? Never. That would mean the body is at two positions at the same time — impossible. If an option shows it, reject it instantly.
• WORKED PATTERN — A straight x–t line climbs from x = 2 m at t = 0 to x = 14 m at t = 4 s. Slope = (14 − 2)/4 = 3 m/s — that IS the velocity, uniform throughout.
⚠ EXAM TRAP — The x–t graph is NOT a picture of the road. A curved x–t graph still describes motion along a straight line — the curve lives in the graph, not in the street.

Acceleration — the Rate of Change of Velocity
• DEFINITION — Acceleration: the rate at which velocity changes with time — a = Δv/Δt on average, a = dv/dt at an instant. A vector in m/s², present whenever velocity changes in size OR in direction (or both).
• EXAMPLE — Three faces of one definition: a metro train pulling out of a station (growing velocity), the same train braking in (shrinking velocity), and a car sweeping around a roundabout at a steady 30 km/h (turning velocity). All three are accelerating.
• Velocity tells you how position changes. Acceleration tells you how VELOCITY changes — and "changes" includes slowing down and turning, not just speeding up. That wider meaning is where most students slip.
✔ KEY FORMULA — Average acceleration = Δv / Δt • Instantaneous acceleration a = dv/dt = d²x/dt² • Unit: m/s². On a velocity–time graph, acceleration is the SLOPE.
• The sign rule that saves careers: if v and a have the SAME sign, the body speeds up. If they have OPPOSITE signs, it slows down. Acceleration negative does NOT automatically mean slowing down — a body moving in the negative direction with negative acceleration is speeding up (in reverse).
• WORKED PATTERN — A car moving at −20 m/s (say, towards the left) brakes with acceleration +5 m/s². Opposite signs → it slows: after 4 s its velocity is −20 + 5 × 4 = 0. It stops, it does not "decelerate into positive speed" unless the force keeps pushing.
• YOUR TURN — A ball thrown straight up: on the way up, what are the signs of v and a (taking up as positive)? (Answer: v is +, a is −9.8 the whole flight — even at the top, even on the way down where v turns −. Gravity never takes a break.)
• Zero velocity does not imply zero acceleration — at the top of a throw, v = 0 but a = −g in full force. Zero acceleration DOES imply velocity is constant (which includes staying at rest).
★ HIGHLIGHT — Memorise the chain: position → (differentiate) → velocity → (differentiate) → acceleration. Integration runs the same chain backwards. Almost every calculus question in this chapter is one of these two directions.

▸ Velocity–Time Graphs — Slope Gives Acceleration, Area Gives Displacement
• DEFINITION — Velocity–time (v–t) graph: a plot of velocity against time. Its slope at any point equals the acceleration; the signed area between the graph and the time axis equals the displacement.
• The v–t graph is the most information-packed picture in the chapter: slope hands you acceleration, area hands you displacement. Look at Fig. 2.2 and find both before reading on.
✔ KEY FORMULA — Slope of v–t graph = acceleration • Signed area under the v–t graph = displacement Δx. Area ABOVE the time axis counts positive; area BELOW it counts negative — they can cancel.
• WORKED PATTERN — A v–t graph forms a triangle of base 10 s and height 20 m/s. Displacement = ½ × 10 × 20 = 100 m. No formula sheet needed — just geometry.
• But if they ask for DISTANCE, add the absolute areas (below-axis area counts as positive distance). Displacement vs distance, one graph, two questions — the paper-setter's favourite pair.
• A horizontal v–t line means uniform velocity (a = 0). A v–t line hugging the axis means the body is barely moving. A v–t line CROSSING the axis means the body changed direction at that instant.
• YOUR TURN — A v–t line falls steadily from +10 m/s at t = 0 to −10 m/s at t = 20 s. What is the displacement over the 20 s? (Answer: the + area and − area cancel → displacement = 0. But the distance travelled is 100 m — check by the two triangles, ½ × 10 × 10 each.)
⚠ EXAM TRAP — Never read the VALUE of the v–t graph as acceleration. The value is velocity; the SLOPE is acceleration; the AREA is displacement. Write V-S-A on your rough sheet for every graph question.

Kinematic Equations for Uniformly Accelerated Motion
• DEFINITION — Uniformly accelerated motion: motion in which the acceleration stays constant — same size, same direction — throughout the interval being analysed. Only for this motion do the three kinematic equations hold exactly.
• Here is the good news: when acceleration is constant, ALL of straight-line motion collapses into three equations. Here is the discipline: they work ONLY when acceleration is constant. Tattoo that condition on the inside of your eyelids.
✔ KEY FORMULA — (1) v = u + at • (2) s = ut + ½at² • (3) v² = u² + 2as. Plus the bonus: s = ½(u + v)t, and average velocity = (u + v)/2 for uniform acceleration.
• Where do they come from? Not magic: acceleration constant means the v–t graph is a straight line; its slope gives equation (1) and the trapezium area under it gives (2); eliminating t between them gives (3). Knowing this, a forgotten formula can be rebuilt from a sketch in 30 seconds.
• Each equation is missing exactly one variable — that is the selection secret. (1) has no s. (2) has no v. (3) has no t. (Bonus has no a.) The variable the problem neither gives nor asks for tells you which equation to pick. Next section turns this into a 10-second drill.
• SYMBOL DISCIPLINE — u = velocity at the START of the interval you are analysing, v = at the END of that same interval, s = displacement during it, t = its duration, a = constant throughout. Most "formula errors" are actually interval errors: students feed in numbers from different intervals.
• WORKED PATTERN — A train starts from rest, accelerates at 2 m/s² for 10 s. v = 0 + 2 × 10 = 20 m/s. s = 0 + ½ × 2 × 100 = 100 m. Cross-check with the bonus: s = ½(0 + 20) × 10 = 100 m ✓. Two routes agreeing is how toppers verify under pressure.
⚠ EXAM TRAP — Braking is just negative a. Pick your positive direction, then let the signs flow: if motion is forward-positive, braking means a is negative. Never flip signs mid-problem.

▸ Distance Travelled in the nth Second
• DEFINITION — 'Distance in the nth second' means the distance covered during the single second that runs from t = n − 1 to t = n — one slice of the journey, not the total distance up to n seconds.
• Subtle question, classic exam bait: "distance in the 3rd second" is NOT "distance in 3 seconds". The 3rd second is just the one-second slice between t = 2 and t = 3 — and there is a one-line formula for any such slice.
✔ KEY FORMULA — sₙ = u + (a/2)(2n − 1) = distance in first n seconds − distance in first (n − 1) seconds.
• WORKED PATTERN — From rest with a = 2 m/s²: the 3rd second gives s₃ = 0 + 1 × (2×3 − 1) = 5 m. Compare: distance in 3 seconds total is 9 m. The options in the exam will contain BOTH 5 and 9 — they are hunting students who misread.
• From rest, the distances in successive seconds follow the odd numbers 1 : 3 : 5 : 7 (times ½a) — Galileo's pattern. So with a = 2, the seconds give 1 m, 3 m, 5 m, 7 m… and cumulative totals are perfect squares × ½a: 1, 4, 9, 16.
• YOUR TURN — A body starts from rest with a = 4 m/s². Distance in the 2nd second? (Answer: ½ × 4 × 3 = 6 m. And in the first 2 seconds: 8 m. See how the slice and the total differ?)
★ HIGHLIGHT — Ratio questions are free marks here: from rest, s₂/s₁ = 3, s₃/s₁ = 5, and distance in n seconds ∝ n². If a question asks "in what ratio are distances in the 1st, 2nd, 3rd seconds", the answer 1 : 3 : 5 should be out before you reach for the pen.

Choosing the Right Equation — a Ten-Second Method
• EXAMPLE — 'A stone dropped from a cliff hits the ground at 30 m/s. How high is the cliff?' Given: v = 30, u = 0, a = g = 10. Asked: s. Missing: t. So v² = u² + 2as → s = 900/20 = 45 m. Notice how the drill, not luck, chose the equation.
• In the exam hall, nobody has time to try all three equations. Use this drill instead — it turns equation-hunting into a reflex.
• Step 1: List the five players — u, v, a, s, t — and tick which three the problem GIVES you. Step 2: Name the one it ASKS for. Step 3: The fifth player, neither given nor asked, is "missing" — pick the equation that does not contain it. No s → v = u + at. No v → s = ut + ½at². No t → v² = u² + 2as. No a → s = ½(u + v)t.
• TRY THE DRILL — "A bus moving at 15 m/s brakes with deceleration 3 m/s². How far before it stops?" Given: u, a, and v = 0 (hidden in the word "stops" — always translate "stops" into v = 0). Asked: s. Missing: t. So v² = u² + 2as → 0 = 225 − 6s → s = 37.5 m. Ten seconds, no drama.
• Read for hidden givens: "starts from rest" = u = 0. "Dropped" = u = 0. "Stops" = v = 0. "Falls freely" = a = g ≈ 10 m/s² (or 9.8). Half the problem is translation; the algebra is the easy half.
• Units check before you compute: convert km/h to m/s by multiplying by 5/18 the moment you see it. Do it in the first line, every time — mid-solution conversions are where factors of 3.6 go to die.
⚠ EXAM TRAP — If the problem gives you FOUR of the five players, any equation works — but the asked quantity might need two steps (find t first, then use it). Don't force one equation to do two jobs.

Motion Under Gravity — Free Fall
• DEFINITION — Free fall: the motion of a body acted on by gravity alone, air resistance neglected, so that its acceleration is the constant g pointing towards the Earth — whatever the body's mass and whatever its velocity at that moment.
• EXAMPLE — In a vacuum tube, a coin and a feather released together land together. Apollo 15 astronaut David Scott did the same demonstration on the Moon with a hammer and a feather — no air, no difference. On Earth, air is the only reason everyday falls look unequal.
• Now the star application. Near Earth's surface, every freely falling body — coin, cricket ball, carelessly dropped phone — accelerates downward at g ≈ 9.8 m/s² (use 10 when the problem says so). Mass does not matter. Shape does not matter (once we ignore air). Galileo's tower story, in one line: gravity treats everyone equally.
• Free fall is just the three kinematic equations with a replaced by −g (taking upward as positive) — nothing new to memorise, one substitution to make. v = u − gt • s = ut − ½gt² • v² = u² − 2gs.
✔ KEY FORMULA — Dropped from rest at height h: fall time t = √(2h/g) • Impact speed v = √(2gh). Thrown UP at u: max height H = u²/(2g) • Time to top = u/g • Total flight time (back to launch level) = 2u/g.
• WORKED PATTERN — A stone is dropped from an 80 m tower, g = 10. Fall time = √(160/10) = 4 s. Distance in the first 3 s = ½ × 10 × 9 = 45 m — so the LAST second alone covers 80 − 45 = 35 m. Falling bodies feast late: most of the distance comes in the final moments because speed keeps building.
• Symmetry to exploit: for a projectile returning to launch level, time up = time down, and it passes each height with the same speed going up and coming down (directions flipped). Half of all free-fall MCQs collapse if you spot the symmetry first.
• YOUR TURN — A ball is thrown up at 30 m/s (g = 10). Maximum height? Time to return to the hand? (Answer: H = 900/20 = 45 m; total time = 2 × 30/10 = 6 s.)
⚠ EXAM TRAP — At maximum height, v = 0 but a = −g, NOT zero. If a were zero at the top, the ball would just stay there. Any option claiming "acceleration is zero at the highest point" is bait — take the free mark.

▸ Dropped, Thrown Down, Projected Up — One Family, Three Starts
• EXAMPLE — Movie scene, real physics: a lift cable snaps. The lift and its passengers become one dropped family with u equal to the lift's speed at that instant — and because everything falls together, the passengers feel weightless until the fall ends.
• Three problem costumes, one body: the only difference between them is the starting velocity u you feed into the same three equations. Learn to see through the costume.
• DROPPED: u = 0. The equations shrink: s = ½gt², v = gt, v² = 2gs. THROWN DOWN at u: everything is the dropped case plus a head start — it lands sooner AND faster: v² = u² + 2gh. PROJECTED UP at u: it rises for u/g seconds, gains u²/2g of height, then becomes — mid-air — a dropped body. Split every upward problem at the top; the second half is always a simple drop.
• WORKED PATTERN — From a 45 m roof (g = 10): dropped, a stone takes √(2×45/10) = 3 s. Thrown down at 10 m/s: 45 = 10t + 5t² → t² + 2t − 9 = 0 → t ≈ 2.16 s. Thrown UP at 10 m/s: it returns to roof level after 2 s moving down at 10 m/s, then needs the same 2.16 s → total ≈ 4.16 s. Same roof, three stories, one method.
• A beautiful check: thrown up or thrown down at the same speed from the same height, the IMPACT speed is identical √(u² + 2gh) — the up-thrown ball wastes time, not speed.
★ HIGHLIGHT — When a problem feels complicated, ask: "at which instant does this become a simple drop?" Almost every hard free-fall question is an easy drop wearing a disguise for its first act.

▸ Stopping Distance and Reaction Time
• DEFINITION — Reaction time: the interval between a driver first seeing a hazard and the brakes actually biting, during which the vehicle continues at its full original speed. Stopping distance: reaction distance + braking distance, the total road consumed before the vehicle halts.
• EXAMPLE — At 90 km/h (25 m/s), a typical 0.7 s reaction time eats 25 × 0.7 = 17.5 m of road before braking even begins — more than two parked cars end to end, gone before the brakes exist.
• This section is physics you will literally use on the road. A driver sees danger. Two things must happen before the car stops: the driver's brain reacts (during which the car cruises on, untouched), then the brakes bite. Total stopping distance = reaction distance + braking distance.
✔ KEY FORMULA — Reaction distance = u × t_reaction • Braking distance = u² / (2a) • Stopping distance = u·tᵣ + u²/(2a).
• WORKED PATTERN — Car at 20 m/s, reaction time 0.5 s, braking deceleration 5 m/s²: reaction distance = 10 m, braking distance = 400/10 = 40 m, total = 50 m. That is half a football field — at city speed.
• Feel the scaling: double the speed and the reaction distance doubles, but the braking distance QUADRUPLES (it carries u²). This is why highway speeds are unforgiving, and why "speed doubled, stopping distance doubled" is always a wrong option.
• YOUR TURN — Same car, same driver, but speed is now 40 m/s. Stopping distance? (Answer: 40 × 0.5 + 1600/10 = 20 + 160 = 180 m. Speed ×2, stopping distance ×3.6 — nowhere near double.)
⚠ EXAM TRAP — Forgetting the reaction distance is the designed error — the braking-only number (40 m above) will always be sitting in the options, smiling at you. Add both parts, every time.

Relative Velocity in One Dimension
• DEFINITION — Relative velocity of A with respect to B: the velocity of A as measured by an observer who is moving along with B, v_AB = v_A − v_B.
• EXAMPLE — Seated in a moving train, the passenger facing you appears perfectly still — your relative velocity is zero — while the platform, relative to you, streams backwards at the train's full speed.
• Velocity is meaningless until you say "measured by whom". A passenger walks forward inside a train at 2 m/s; the train does 30 m/s past the platform. The platform sees the passenger at 32 m/s. Both numbers are correct — in different frames. Relative velocity is how we translate between frames.
✔ KEY FORMULA — v of A as seen by B: v_AB = v_A − v_B (velocities signed along the line, both measured in the ground frame).
• Same direction: subtract — a car at 30 chasing a car at 25 gains at only 5 m/s. Opposite directions: the signs do the work — two trains approaching at 30 and 20 close at 30 − (−20) = 50 m/s. "Closing speed" is just relative velocity wearing a name tag.
• WORKED PATTERN — Two cars 100 m apart drive towards each other at 20 m/s and 30 m/s. Closing speed = 50 m/s, so they meet in 100/50 = 2 s. Meeting problems are one division once you think relatively: freeze one car, let the other come at the combined speed.
• The rain-on-a-train-window effect, in 1D dress: hold your hand out of a moving car and the still air hits you like wind — because relative to you, the air rushes backwards at the car's speed. Chapter 3 lifts this exact idea into two dimensions with rain and rivers.
• YOUR TURN — A truck at 25 m/s is ahead of a car at 30 m/s, 40 m apart, same direction. When does the car catch up? (Answer: relative speed 5 m/s → 40/5 = 8 s.)
⚠ EXAM TRAP — v_AB = −v_BA, always. And v_AB means "A as seen FROM B" — swapping the order flips the sign. Write the sentence in words before touching numbers.

When Acceleration Is Not Uniform — the Calculus Toolkit
• DEFINITION — Non-uniform acceleration: acceleration that itself changes — with time, with position, or with velocity. It is described by a function such as a(t) or a(x), and only calculus (never the three kinematic equations) can handle it.
• Real motion is messier than constant a — engines surge, springs oscillate. The three kinematic equations retire here, but calculus does not break a sweat. Four tools handle everything.
✔ KEY FORMULA — v = dx/dt • a = dv/dt = d²x/dt² • a = v (dv/dx) when time is not in the story • And backwards: v = ∫a dt, x = ∫v dt (with the starting values as constants — never drop them).
• Choosing the tool: given x(t) → differentiate down the chain. Given a(t) → integrate up the chain. Given a in terms of x, or v in terms of x → the chain-rule form a = v dv/dx is the only door. Given a graph → slope/area thinking from earlier sections.
• WORKED PATTERN — A particle starts from rest with a = 2t. Integrate: v = t² + C, and rest at t = 0 gives C = 0. Integrate again: x = t³/3. At t = 3 s: v = 9 m/s, x = 9 m. Clean numbers are the examiner telling you you're on the right path.
• WORKED PATTERN 2 — Velocity depends on position: v = 2√x. Find a. Use a = v dv/dx: dv/dx = 1/√x, so a = 2√x × 1/√x = 2 m/s² — a constant hiding inside a messy-looking motion. Beautiful, and a known IAT flavour.
★ HIGHLIGHT — IAT's signature move in this area: hand you something like x(t) or a(t) with clean numbers and ask for the OTHER quantity at a specific instant. Differentiate or integrate, substitute, done. Students who reach for v = u + at here are bringing a knife to a calculus fight.
⚠ EXAM TRAP — Integration constants are not decoration: "starts from rest" and "starts at the origin" are the clues that fix them. An answer missing the constant is an answer missing the initial condition.

Formula Sheet — One-Glance Recap
✔ KEY FORMULA — v = u + at • s = ut + ½at² • v² = u² + 2as • s = ½(u + v)t • sₙ = u + (a/2)(2n − 1).
✔ KEY FORMULA — v = dx/dt • a = dv/dt = v dv/dx • Free fall: t = √(2h/g), v = √(2gh), H = u²/2g • Stopping: u·tᵣ + u²/2a.
✔ KEY FORMULA — Equal-distance average speed = 2v₁v₂/(v₁ + v₂) • Relative velocity v_AB = v_A − v_B • v–t area = displacement, v–t slope = acceleration.
• The five-second self-test before any problem: Is a constant? Which three variables do I have? Which one is missing? — then write the equation.

Final Rapid Check — the Traps That Cost Marks
⚠ EXAM TRAP — Distance in the nth second ≠ distance in n seconds (5 m vs 9 m in our worked case — both will be options).
⚠ EXAM TRAP — Average speed over equal distances is the harmonic mean (48, not 50). Over equal times it is the plain mean.
⚠ EXAM TRAP — At the top of a throw: v = 0, a = −g. Not both zero. Never both zero.
⚠ EXAM TRAP — The kinematic equations demand constant a. If a varies, switch to calculus without a second thought.
⚠ EXAM TRAP — Negative acceleration is not a synonym for slowing down — compare the SIGNS of v and a.
⚠ EXAM TRAP — On graphs: value, slope and area are three different quantities. Label which one the question wants before computing.
⚠ EXAM TRAP — Stopping distance has TWO parts; "stops" means v = 0; km/h converts with 5/18 in line one.
★ HIGHLIGHT — You now own the full straight-line toolkit: describe it (graphs), average it, differentiate it, integrate it, and pick the right equation in ten seconds. Chapter 3 takes every one of these ideas off the line and into the plane — vectors are next, and they are friendlier than they look.
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

            studyNotesCount = 16,

            practiceQuestionCount = 22,

            durationMinutes = 45,

            formulaHighlight = "R = √(A² + B² + 2AB cosθ) • R = u² sin2θ/g • H = u² sin²θ/2g • a_c = v²/r = ω²r",

            keyConceptsSummary = "Vectors add by vector laws, not arithmetic \u2014 |A \u2212 B| \u2264 R \u2264 A + B\nResolution first: A_x = A cos\u03b8, A_y = A sin\u03b8 \u2014 then work axis by axis\nResultant R = \u221a(A\u00b2 + B\u00b2 + 2AB cos\u03b8), with \u03b8 measured tail-to-tail\nProjectile (level ground): T = 2u sin\u03b8/g, H = u\u00b2 sin\u00b2\u03b8/2g, R = u\u00b2 sin2\u03b8/g\nAt the top of the flight v = u cos\u03b8, not zero \u2014 only v_y vanishes\nCircular motion: v = \u03c9r and a_c = v\u00b2/r towards the centre \u2014 constant speed still accelerates\nRelative velocity is vector subtraction: v_AB = v_A \u2212 v_B (rain and river problems)",

            detailedStudyNotes = """

Scalars and Vectors — the Two Kinds of Quantity
• DEFINITION — Scalar: a physical quantity completely described by a magnitude (a number with a unit) — mass, time, speed, energy. Vector: a physical quantity described by a magnitude AND a direction, which combines with other vectors by the triangle/parallelogram law — displacement, velocity, force.
• EXAMPLE — '5 litres of petrol' is a complete scalar statement — direction does not exist for it. '5 km towards the airport' is a vector statement — delete the direction and the instruction collapses into uselessness.
• Imagine two instructions. First: "the water is 40 °C". Complete — nothing more to ask. Second: "walk 40 metres". Your instant reply: "in which direction?" That itch you feel with the second one is the scalar–vector divide, and this chapter lives on the vector side.
• A scalar has magnitude only: mass, time, temperature, speed, energy, distance. Scalars add like money — 3 + 4 is just 7, finished.
• A vector has magnitude AND direction, and follows its own addition rules (3 + 4 might give 7, 5, 1, or anything between — this chapter explains why). Displacement, velocity, acceleration, force and momentum are vectors. We draw a vector as an arrow: the LENGTH is the magnitude, the HEAD points the way.
• Notation to read fluently: A⃗ (or bold A) is the vector; |A⃗| or plain A is its magnitude. A magnitude is a length-like quantity — it can be zero, it can be huge, it can NEVER be negative.
• Two vectors are EQUAL when magnitude and direction both match — where the arrow sits does not matter. Slide an arrow anywhere parallel to itself and it is still the same vector. That freedom is what makes the graphical methods below legal.
• The null vector (0⃗) has zero length and no direction worth naming. It sounds useless; it is actually the referee: whenever vector changes cancel out completely — like the displacement after any closed round trip — the null vector is the verdict.
• YOUR TURN — Which of these are vectors: 5 kg, 5 m north, 5 m/s² downward, 5 seconds, 5 joules? (Answer: the northward 5 m and the downward 5 m/s². The rest are scalars wearing numbers.)
⚠ EXAM TRAP — Electric current has a direction in a wire, yet it is NOT a vector — currents at a junction add like scalars (3 A + 4 A = 7 A, no angle involved). Direction alone does not make a vector; obeying vector addition does.

▸ Multiplying a Vector by a Real Number — and Unit Vectors
• DEFINITION — Unit vector: a vector whose magnitude is exactly one, carrying direction and nothing else; the unit vector along A⃗ is Â = A⃗/|A⃗|.
• Push a trolley with force F⃗ and it responds a certain way. Push twice as hard in the same line — that is 2F⃗: same direction, double length. Pull instead of push — that is −F⃗: same size, flipped direction. Multiplying a vector by a number stretches or flips it; it never rotates it to a new angle (unless the number is negative, which turns it exactly 180°).
✔ KEY FORMULA — |λA⃗| = |λ| × |A⃗| • λ > 0 keeps the direction, λ < 0 reverses it • λ = 0 gives the null vector.
• Now the most useful trick in the chapter: divide a vector by its own magnitude and you get a UNIT vector — pure direction, size exactly 1, no unit attached. Â = A⃗/|A⃗| reads as "the direction of A, and nothing else".
• The celebrity unit vectors are î, ĵ, k̂ — arrows of length 1 along the x, y and z axes. With them, ANY vector in the plane can be written as a shopping list: A⃗ = A_x î + A_y ĵ ("this much east, this much north").
• WORKED PATTERN — A⃗ = 3î + 4ĵ. Its magnitude: √(3² + 4²) = 5. Its unit vector: Â = (3î + 4ĵ)/5 = 0.6î + 0.8ĵ. Check: √(0.6² + 0.8²) = 1 ✓. The 3-4-5 triangle will follow you all through physics — become friends now.
• YOUR TURN — What is the unit vector along 6î − 8ĵ? (Answer: magnitude is 10, so Â = 0.6î − 0.8ĵ. Notice the minus survives — direction is the whole point.)
⚠ EXAM TRAP — You can divide a vector by a NUMBER, never by another vector. "A⃗ ÷ B⃗" is not physics, it is a typo. If you catch yourself writing it in the exam, stop and rethink.

Addition and Subtraction of Vectors — the Graphical Method
• DEFINITION — Resultant: the single vector that has exactly the same effect as two or more vectors acting together; the resultant of A⃗ and B⃗ is R⃗ = A⃗ + B⃗.
• Here is the puzzle that starts it all: walk 3 m east, then 4 m north. How far from the start? Not 7 (that would be your path length), not 1. Draw it — you have built a right triangle, and the straight-line answer is 5 m, pointing north-east-ish. Vector addition is that drawing, formalised.
• TRIANGLE LAW — Draw A⃗. From its HEAD, draw B⃗. The arrow from the START of A⃗ to the END of B⃗ is R⃗ = A⃗ + B⃗. Head-to-tail, close the triangle, read the resultant. For three or more vectors, keep chaining head-to-tail (the polygon law) — the resultant always runs from the first tail to the last head.
• PARALLELOGRAM LAW — Draw A⃗ and B⃗ from the SAME tail, complete the parallelogram, and the diagonal from that tail is the same R⃗. Two drawings, one answer — Fig. 3.1 shows both side by side. Use whichever the diagram in front of you suggests.
• SUBTRACTION, without tears: A⃗ − B⃗ means A⃗ + (−B⃗) — flip B⃗ and add as usual. There is also a picture worth memorising: with A⃗ and B⃗ standing tail-to-tail, A⃗ − B⃗ is the arrow from the head of B⃗ to the head of A⃗ — "the difference points to the first-named vector".
• STOP & THINK — If chained vectors form a closed polygon (last head lands back on the first tail), what is the resultant? Zero — the null vector. That closed-polygon picture is exactly what "balanced" will mean when forces arrive in Chapter 4.
• YOUR TURN — Displacement A⃗ is 5 m east; B⃗ is 5 m north. Draw the triangle: what is |A⃗ + B⃗| and |A⃗ − B⃗|? (Answer: both are √50 ≈ 7.07 m — sum points north-east, difference points south-east. Same size, different story.)
★ HIGHLIGHT — Every analytical formula later in this chapter is one of these two pictures translated into algebra. If a vector problem ever feels abstract, go back to the drawing — the triangle never lies.

▸ The Resultant — How Large Can It Be?
• EXAMPLE — Two tugboats pull a ship with 100 N each. Pulling in the same direction (0° apart): 200 N of useful pull. At right angles: √(100² + 100²) ≈ 141 N. Pulling against each other: 0 N. Same boats, same fuel — the angle alone writes the result.
• Two vectors of 3 and 4 units walk into an exam. What is their resultant? The honest answer is "it depends" — and the dependence is a favourite examiner toy, so let's master it.
✔ KEY FORMULA — As the angle θ between the vectors swings from 0° to 180°, the resultant slides between two walls: A + B (parallel, maximum) and |A − B| (antiparallel, minimum). |A − B| ≤ R ≤ A + B, always.
• At the famous middle stop, θ = 90°: R = √(A² + B²) — Pythagoras, which is why 3 and 4 give 5 only there. At any other angle you need the full formula of the next-but-one section; there are no other shortcuts.
• Addition is FRIENDLY: A⃗ + B⃗ = B⃗ + A⃗ (commutative — walk east-then-north or north-then-east, same destination) and grouping never matters (associative). Rearrange chains freely to make the drawing easy.
• EQUAL-VECTOR SHORTCUT — Two vectors of the SAME magnitude A with angle θ between them: the resultant is R = 2A cos(θ/2), and it points exactly along the bisector — the "average direction". Raindrops, symmetric forces, rhombus diagonals: this pattern recurs everywhere.
• WORKED PATTERN — Two 5-unit vectors at 60°: R = 2 × 5 × cos30° = 8.66 units along the bisector. (Sanity: it sits between 5 and 10, closer to the top because 60° is a "friendly" angle. Always sanity-check against the walls.)
• YOUR TURN — Vectors of 6 and 8 units: can their resultant be 15? Can it be 2? Can it be 10? (Answer: No — the ceiling is 14. Yes — 2 is the floor, at 180°. Yes — 10 happens at exactly 90°, the 6-8-10 triangle.)
⚠ EXAM TRAP — If a question gives two magnitudes but NO angle and asks for THE resultant, the only defensible answer is a range — or the angle is hiding in words like "perpendicular" (90°) or "opposite" (180°). Hunt for it before computing.

Resolution of Vectors — Splitting into Components
• DEFINITION — Resolution of a vector: replacing one vector by two (usually perpendicular) components whose vector sum is exactly the original vector. Each component is the projection — the shadow — of the vector on that axis.
• EXAMPLE — Dragging a suitcase by a handle held at an angle: part of your pull lifts the case slightly (fighting friction), part drags it forward. One pull, two jobs — the floor resolves your force whether you think about it or not.
• Time to learn the chapter's master key. A vector pointing diagonally is awkward to work with — so we replace it with two perpendicular partners along the axes that add up to exactly the same thing. That splitting is RESOLUTION, and Fig. 3.2 is its portrait.
✔ KEY FORMULA — If A⃗ makes angle θ with the x-axis: A_x = A cosθ (the component NEXT to the angle) and A_y = A sinθ (the one across from it) • Rebuild anytime: A = √(A_x² + A_y²), tanθ = A_y/A_x.
• PICTURE IT — The components are the vector's SHADOWS on the two axes. A torch shining straight down casts the arrow's shadow on the ground (x-shadow = A_x); shine from the side and the wall shows A_y. A shadow can never be longer than the object — so |A_x| and |A_y| can never exceed A.
• WORKED PATTERN — A velocity of 10 m/s at 60° above horizontal: v_x = 10 cos60° = 5 m/s, v_y = 10 sin60° = 8.66 m/s. The body glides forward at 5 while climbing at 8.66 — two simple stories replacing one diagonal one.
• Signs carry the quadrant: a vector pointing up-left has A_x < 0, A_y > 0. Never drop a minus sign "because lengths are positive" — components are signed, and the sign IS the direction information.
• YOUR TURN — Resolve 20 N at 30° above the horizontal. (Answer: F_x = 20 cos30° ≈ 17.3 N, F_y = 20 sin30° = 10 N. Rebuild check: √(17.3² + 10²) = 20 ✓. Build the rebuild-check into your routine; it takes five seconds.)
⚠ EXAM TRAP — tanθ = A_y/A_x gives an angle, but calculators report it in the first quadrant. If A_x is negative, the true direction is 180° away from the calculator's answer. Always sketch the quadrant — your eyes are the error-check your calculator lacks.

Vector Addition — the Analytical Method
• EXAMPLE — A drone flies east at 8 m/s relative to the air while a north wind blows at 6 m/s. Over the ground it actually moves at √(8² + 6²) = 10 m/s, at tan⁻¹(6/8) ≈ 37° north of east — one component addition, and the drone's true path is known.
• Graphical addition is beautiful and slow. The analytical method is its industrial version: resolve EVERYTHING into components, add the x-parts, add the y-parts, rebuild once at the end. This is how multi-vector problems are actually won.
✔ KEY FORMULA — For two vectors with tail-to-tail angle θ: R = √(A² + B² + 2AB cosθ) • Direction from A⃗: tanα = B sinθ / (A + B cosθ). For three or more vectors, use components: R_x = ΣA_x, R_y = ΣA_y, R = √(R_x² + R_y²).
• Verify the formula against old friends: θ = 0° → cosθ = 1 → R = A + B ✓. θ = 180° → R = |A − B| ✓. θ = 90° → R = √(A² + B²) ✓. A formula that reproduces all three walls is a formula you can trust mid-exam.
• WORKED PATTERN — A = 3, B = 4, θ = 90°: R = √(9 + 16 + 0) = 5, and tanα = 4/3 → α ≈ 53° from the 3-vector. The complete answer is "5 units at 53°" — magnitude AND direction. Half an answer is half the marks.
• STOP & PREDICT — Before computing R for A = 5, B = 5, θ = 120°, guess a bracket. (The walls are 0 and 10; 120° is "unfriendly", so expect the lower half. Formula: √(25 + 25 + 50 × (−½)) = √25 = 5. Spot the cross-check: the equal-vector shortcut gives 2 × 5 × cos60° = 5 ✓ — two methods, one answer.)
• YOUR TURN — Add A⃗ = 2î + 3ĵ and B⃗ = 4î − ĵ by components. (Answer: R⃗ = 6î + 2ĵ, |R| = √40 ≈ 6.32. Thirty seconds, no diagram needed. THIS is the method's power.)
⚠ EXAM TRAP — The θ in the resultant formula is the angle when the vectors stand TAIL TO TAIL. If your diagram (like a displacement triangle) shows them head-to-tail, the angle inside that triangle is 180° − θ. Feeding the triangle's angle into the formula is the most common vector error in Indian entrance exams — you have been warned by name.

Motion in a Plane — Position, Velocity and Acceleration Vectors
• DEFINITION — Position vector: the vector r⃗ drawn from the origin of the coordinate system to the particle's position at that instant — in a plane, r⃗ = x î + y ĵ.
• Chapter 2 chained motion to a line. Cut the chain: a body in a plane needs TWO coordinates, and every quantity from Chapter 2 grows a second component. Position becomes r⃗ = x î + y ĵ — one arrow from the origin to the body.
✔ KEY FORMULA — Displacement Δr⃗ = r⃗₂ − r⃗₁ • Average velocity = Δr⃗/Δt • Instantaneous velocity v⃗ = dr⃗/dt, with v_x = dx/dt and v_y = dy/dt • Speed = √(v_x² + v_y²) • Acceleration a⃗ = dv⃗/dt with components a_x = dv_x/dt, a_y = dv_y/dt.
• The velocity vector has a picture worth a thousand formulas: it always points along the TANGENT to the path, in the direction of travel. Watch a car on a curved road — its velocity arrow is forever glued to the road's direction at that point, never pointing at some future destination.
• Acceleration gets interesting: a⃗ points along Δv⃗, the CHANGE in velocity — which need not be anywhere near v⃗. Slowing down on a curve, speeding up on a curve, turning at steady speed: each bends a⃗ a different way.
• WORKED PATTERN — r⃗ = (3t)î + (4t)ĵ. Differentiate: v⃗ = 3î + 4ĵ — constant. Speed = 5 units, a⃗ = 0. Straight-line uniform motion wearing vector clothes: notice the path is the line y = (4/3)x.
• YOUR TURN — A particle has v_x = 6 m/s and v_y = 8 m/s. Its speed? Its direction? (Answer: speed = 10 m/s at tan⁻¹(8/6) ≈ 53° above the x-axis. Another 6-8-10 — the examiners reuse this triangle shamelessly.)
⚠ EXAM TRAP — "Constant speed" in a plane does NOT mean "zero acceleration" — turning alone creates a⃗. That single sentence is the seed of circular motion at the end of this chapter, and an examiner favourite every single year.

Motion in a Plane with Constant Acceleration
• EXAMPLE — A spacecraft coasts with one thruster burning steadily: its acceleration arrow never changes, so its velocity arrow grows by the same a⃗t every second. The split-axis method tracks such a craft exactly — x-story and y-story, solved separately, recombined once.
• Suppose a⃗ is constant — one unchanging arrow. Then Chapter 2's equations return, wearing vector form, and a beautifully simple working method appears alongside them.
✔ KEY FORMULA — v⃗ = u⃗ + a⃗t • r⃗ = r⃗₀ + u⃗t + ½a⃗t². In practice, never wrestle the vectors whole: split into two independent 1D problems — the x-story (u_x, a_x) and the y-story (u_y, a_y) — solve each with Chapter 2 tools, recombine at the end.
• The two stories share exactly ONE thing: the clock. The same t flows through both, and eliminating t between the stories is how trajectory equations (the path's shape) are born.
• The royal special case: gravity. Set a_x = 0 and a_y = −g. The x-story becomes "cruise forever at u cosθ", the y-story becomes Chapter 2's free fall. Fireworks in the next section — but notice, nothing conceptually new is coming: just independence, applied.
• WORKED PATTERN — A particle starts with u⃗ = 4î + 3ĵ under constant a⃗ = −ĵ (units SI). At t = 2 s: v⃗ = 4î + 3ĵ − 2ĵ = 4î + ĵ, so speed = √17 ≈ 4.12 m/s. Component-wise arithmetic, one line per component.
★ HIGHLIGHT — INDEPENDENCE OF PERPENDICULAR MOTIONS — underline it, star it, tattoo it next to the constant-acceleration condition from Chapter 2. One motion never reaches across and disturbs the perpendicular one. Every projectile, every river crossing, every rain problem below is this sentence in costume.

Projectile Motion — Range, Height and Time of Flight
• DEFINITION — Projectile: a body given an initial velocity and thereafter moving under gravity alone (air resistance neglected). Projectile motion: its two-dimensional motion — uniform velocity horizontally, uniformly accelerated motion vertically.
• EXAMPLE — One family, many faces: a cricket ball sailing towards the boundary, water arcing out of a garden hose, a long-jumper frozen mid-flight. Different sports, identical parabolas, identical three formulas.
• Launch a ball at speed u, angle θ above the horizontal, over level ground, air ignored. You already own every tool needed: horizontally it cruises (a_x = 0), vertically it free-falls (a_y = −g). Run both movies at once and you get the three most-asked formulas in kinematics.
✔ KEY FORMULA — Time of flight T = 2u sinθ / g • Maximum height H = u² sin²θ / (2g) • Range R = u² sin2θ / g = 2u² sinθ cosθ / g.
• See where each is born: T is the free-fall clock — the vertical story goes up (u sinθ worth) and returns, taking 2u sinθ/g. H is just "how high does the vertical story climb": u_y²/2g. R is the horizontal cruise: distance = (u cosθ) × T. No memorisation needed if you see the parents.
• Range peaks at θ = 45° with R_max = u²/g. And for any smaller range, TWO angles work — θ and its complement 90° − θ (a flat fast throw or a high lob, same landing spot, different flights: the lob stays airborne longer and climbs higher).
• At the top, the ball does NOT stop: v_y dies to zero but v_x = u cosθ cruises on untouched. "Velocity at the highest point" = u cosθ, horizontal — a gift of a question when it appears.
• WORKED PATTERN — u = 20 m/s, θ = 45°, g = 10: R = 400 × sin90°/10 = 40 m; H = 400 × ½ /20 = 10 m; T = 2 × 20 × 0.707/10 ≈ 2.83 s. (Fig. 3.3 is exactly this flight — check the parabola peaks at x = 20, mid-range, as symmetry demands.)
• YOUR TURN — Same launch speed 20 m/s but θ = 30°. What happens to R and H? (Answer: R = 400 × sin60°/10 ≈ 34.6 m — less, as expected off-45°; H = 400 × ¼ /20 = 5 m — halved, because sin²30° is a quarter. And θ = 60° gives the SAME range 34.6 m with H = 15 m — complements share range, never height.)
⚠ EXAM TRAP — R = u² sin2θ/g is licensed for LEVEL launch-and-landing only. Cliff, rooftop or valley in the problem? That licence is void — solve the vertical story for T, then multiply by u cosθ. (Next section does exactly this.)

▸ The Trajectory Is a Parabola — Velocity at Any Instant
• DEFINITION — Trajectory: the actual path a moving body traces in space. For a projectile under constant g, the trajectory is a parabola — the curve y = x tanθ (1 − x/R).
• What shape does the projectile actually trace? Eliminate the clock: from x = (u cosθ)t get t = x/(u cosθ), feed it into the y-story, and a quadratic in x falls out — the signature of a parabola.
✔ KEY FORMULA — y = x tanθ − gx²/(2u²cos²θ), which factorises beautifully as y = x tanθ (1 − x/R). At any time t: v_x = u cosθ, v_y = u sinθ − gt, speed = √(v_x² + v_y²), direction tanφ = v_y/v_x.
• The factorised form is a lie-detector: it shows y = 0 exactly at x = 0 and x = R (launch and landing) without any solving. When a problem asks "does the ball clear a 3 m wall standing 15 m away?" — put x = 15 into the trajectory, compare y with 3. Direct hit, no time calculations.
• Direction along the flight: φ starts at +θ, flattens to 0 at the top, and deepens negative on the way down, landing at exactly −θ (level ground) with the launch SPEED fully restored. The flight is a palindrome in speed, mirrored in angle.
• WORKED PATTERN — For our 45°, 20 m/s flight: at x = 10 m, y = 10 × 1 × (1 − 10/40) = 7.5 m. The ball is 7.5 m up a quarter of the way across — comfortably over a 5 m building at that spot.
• YOUR TURN — In the same flight, what is v_y at t = 1 s, and the speed then? (Answer: v_y = 20 × 0.707 − 10 × 1 ≈ 4.14 m/s; speed = √(14.14² + 4.14²) ≈ 14.7 m/s. Notice v_x stayed 14.14 — it always does.)
★ HIGHLIGHT — Exam questions disguise the trajectory equation as "the path of a projectile is y = ax − bx², find the range/height". Compare coefficients: the x-coefficient is tanθ, the roots give R = a/b instantly. Pattern-recognition like this is what separates ranks.

▸ Projectile Variations — Horizontal Launch and Inclined Planes
• EXAMPLE — A rescue aircraft dropping supplies cannot release the package over the target: the package leaves with the plane's full forward speed and falls as a horizontal projectile, so the pilot releases early and lets the parabola deliver it.
• Two variations complete the projectile family, and both are older favourites of paper-setters.
• HORIZONTAL LAUNCH from height h (θ = 0): the vertical story is a pure drop, so T = √(2h/g); the horizontal story cruises, so range = u√(2h/g); impact speed = √(u² + 2gh) — launch speed and fall speed combined by Pythagoras, aimed below the horizontal.
• WORKED PATTERN — A ball rolls off a 45 m tower at 10 m/s horizontally (g = 10): T = √(90/10) = 3 s, range = 30 m from the base, impact speed = √(100 + 900) ≈ 31.6 m/s. Three answers, three one-liners — that is why this variation is beloved.
✔ KEY FORMULA — INCLINED PLANE — Launch at θ to the horizontal, up a plane sloping at α: flight time T = 2u sin(θ − α)/(g cosα) • Range measured ALONG the plane: R_plane = 2u² cosθ sin(θ − α)/(g cos²α). Longest when θ = 45° + α/2 — aim halfway between the plane's perpendicular logic and 45°, tilted by the slope.
• The incline trick that unlocks derivations: rotate your axes — x along the plane, y perpendicular to it. Gravity then splits into g sinα (along, pulling the body down-slope) and g cosα (perpendicular, deciding the flight). Tilted axes turn an incline problem back into a level problem.
• YOUR TURN — A projectile is fired horizontally at 15 m/s from a cliff 80 m high (g = 10). Time to land and distance from the cliff base? (Answer: T = √(160/10) = 4 s; range = 15 × 4 = 60 m.)
⚠ EXAM TRAP — In incline formulas, θ is measured from the HORIZONTAL while (θ − α) is the angle above the PLANE. Two angles, two references — write both on your diagram before substituting anything.

Uniform Circular Motion — Speeding Without Speeding Up
• DEFINITION — Uniform circular motion: the motion of a body along a circular path at constant speed. The velocity's direction changes continuously, so the body has a centripetal acceleration a_c = v²/r directed towards the centre.
• EXAMPLE — A ceiling-fan tip, a car on a roundabout at a steady 30 km/h, the Moon circling the Earth — speed constant, direction endlessly changing, acceleration endlessly present.
• A body rounds a circle at perfectly steady speed. Speedometer: frozen. And yet it accelerates every single instant — because velocity is a vector, and the vector is rotating. This section is Chapter 2's "v = 0 at the top" lesson grown into a whole topic.
✔ KEY FORMULA — Angle in radians: θ = arc/radius • Angular velocity ω = dθ/dt = 2π/T = 2πν • Linear speed v = ωr • Centripetal acceleration a_c = v²/r = ω²r = 4π²r/T² — aimed at the centre, always.
• Learn the triangle of relations as one object: T (period, seconds per round) and ν (frequency, rounds per second) are reciprocals; ω converts rounds into radians per second; v = ωr converts rotation into road speed. Bigger radius at the same ω means faster road speed — the outside of a merry-go-round rushes, the centre dawdles.
• Direction discipline: v⃗ is TANGENT (along the motion), a⃗_c is RADIAL-INWARD (along the string, towards the hub). Fig. 3.4 fixes the geometry — if the body were released, it would fly off along v⃗, the tangent, never "outwards". Remember feeling that on a merry-go-round? You were feeling your own inertia, not an outward force.
• WORKED PATTERN — A stone on a 2 m string whirled at 6 m/s: ω = 6/2 = 3 rad/s, a_c = 36/2 = 18 m/s², period = 2π/3 ≈ 2.1 s. Four quantities, three formulas, one minute.
• YOUR TURN — A fan blade tip moves on a circle of radius 0.5 m, completing 10 rounds per second. Its speed and centripetal acceleration? (Answer: ω = 2π × 10 = 62.8 rad/s; v = ωr ≈ 31.4 m/s; a_c = v²/r ≈ 1972 m/s² — about 200 g. Spinning things live violent lives.)
⚠ EXAM TRAP — "Centripetal" names a DIRECTION (towards the centre), not a new force of nature, and "centrifugal force" makes no appearance in an inertial-frame solution. If an option invents an outward force balancing things in the ground frame, cross it out.

▸ Centripetal Acceleration — Where v²/r Comes From
• EXAMPLE — Whirl a key-ring on a string around your head. Whirl faster and the inward pull on your fingers grows; shorten the string and it grows again. Your hand is voting for a_c = v²/r — it feels both the v² and the 1/r.
• Formulas you can derive are formulas you can trust, so here is v²/r in four honest steps. Freeze two snapshots of the velocity arrow, a tiny time Δt apart. In that time the body sweeps angle Δθ = ωΔt — and the velocity arrow, glued to the tangent, rotates by the SAME Δθ.
• The change Δv⃗ is the little arrow joining the two velocity tips; for small Δθ its length is |Δv⃗| ≈ v Δθ (arc of a circle of radius v). Divide by Δt: a = v Δθ/Δt = vω — and with ω = v/r, a = v²/r. No hand-waving anywhere.
• Direction: as Δt shrinks, Δv⃗ settles perpendicular to v⃗ — pointing straight at the centre. An acceleration permanently perpendicular to velocity can rotate the velocity endlessly while never changing its length: that is WHY uniform circular motion keeps its speed. The geometry and the definition agree, as they must.
• Two readings to keep separate: at fixed ω, a_c = ω²r grows with r (outer = more). At fixed v, a_c = v²/r grows as r shrinks (tighter = more). Exam questions toggle between the two readings — ask yourself "what is being held constant here?" before choosing.
• When speed ALSO changes (non-uniform circular motion), a second player enters: tangential acceleration a_t = dv/dt along the tangent, and the total acceleration is √(a_c² + a_t²), tilted between centre and tangent. One line now; it becomes the backbone of rotational dynamics later.
★ HIGHLIGHT — Derive it once on paper today — snapshots, Δθ, |Δv| ≈ vΔθ, divide. A derived formula survives exam panic; a merely-read one often does not.

Relative Motion in a Plane — Rain and River Problems
• EXAMPLE — An aircraft heads east at 200 km/h through a 50 km/h wind blowing from the north. Over the ground it truly travels √(200² + 50²) ≈ 206 km/h, pushed slightly south of east — which is why pilots angle ('crab') the nose into the wind to hold a straight track.
• Chapter 2's relative velocity takes off its training wheels: in a plane, v⃗_AB = v⃗_A − v⃗_B is a VECTOR subtraction — components subtract, or draw A⃗ plus the flipped B⃗. Two classic theatres follow, and both are pure pattern once seen clearly.
• RAIN & THE RUNNER — Rain falls vertically at v_r; you run horizontally at v_m. Relative to you, the rain picks up a horizontal piece −v_m (the world rushes backwards at your speed), so it appears to slant towards you at angle tan⁻¹(v_m/v_r) from the vertical. That is why your umbrella tilts FORWARD when you run, and why rain streaks diagonally on a moving train's window.
• RIVER & BOAT — the boat's engine gives it speed v_b relative to the WATER; the water itself slides at v_r relative to the bank. The bank sees the vector sum. Two classic asks, two different strategies:
✔ KEY FORMULA — SHORTEST TIME: aim straight across. Time = width / v_b (the current cannot rush or delay your crossing — it only drags you downstream: drift = v_r × time). SHORTEST PATH: aim upstream at sin⁻¹(v_r/v_b) from the straight-across line so the drift cancels; crossing speed becomes √(v_b² − v_r²) and the time is width / √(v_b² − v_r²) — needs v_b > v_r, and it takes LONGER.
• WORKED PATTERN — River 100 m wide, boat 5 m/s, current 3 m/s. Fastest crossing: aim across, 100/5 = 20 s, landing 3 × 20 = 60 m downstream. No-drift crossing: aim sin⁻¹(3/5) ≈ 37° upstream, cross at √(25 − 9) = 4 m/s, taking 25 s. Faster arrival or straighter arrival — pick per the question, they are never the same answer.
• YOUR TURN — Rain falls at 10 m/s vertically. You cycle at 10 m/s. At what angle from the vertical does the rain seem to fall, and how should you tilt the umbrella? (Answer: tan⁻¹(10/10) = 45° — tilt the umbrella 45° forward. Equal speeds, diagonal rain.)
⚠ EXAM TRAP — Every speed in these problems wears a frame label: "of the boat relative to water" is not "of the boat relative to bank". Underline the labels in the question. Then remember: shortest-time ≠ shortest-path, and the no-drift route is impossible if the current outruns the boat.

Formula Sheet — One-Glance Recap
✔ KEY FORMULA — Resultant: R = √(A² + B² + 2AB cosθ), tanα = B sinθ/(A + B cosθ) • |A − B| ≤ R ≤ A + B • Equal vectors: R = 2A cos(θ/2) • Components: A_x = A cosθ, A_y = A sinθ.
✔ KEY FORMULA — Projectile: T = 2u sinθ/g • H = u² sin²θ/2g • R = u² sin2θ/g • y = x tanθ (1 − x/R) • Horizontal launch from h: T = √(2h/g).
✔ KEY FORMULA — Circular: v = ωr • ω = 2π/T = 2πν • a_c = v²/r = ω²r, towards the centre • v⃗_AB = v⃗_A − v⃗_B.
• The ritual that runs the whole chapter: resolve → work each axis alone → recombine → state magnitude AND direction. Four steps, in order, every time.

Final Rapid Check — the Traps That Cost Marks
⚠ EXAM TRAP — The resultant of 3 and 4 is 5 ONLY at 90°. No angle given → answer is a range between |A − B| and A + B.
⚠ EXAM TRAP — The cosθ formula wants the TAIL-TO-TAIL angle; head-to-tail diagrams hide 180° − θ.
⚠ EXAM TRAP — At the projectile's top: velocity = u cosθ horizontal, not zero; acceleration = g, as always.
⚠ EXAM TRAP — R = u² sin2θ/g dies when landing height ≠ launch height. Vertical story first, then range.
⚠ EXAM TRAP — Constant speed + changing direction = acceleration. Circular motion is the proof, not the exception.
⚠ EXAM TRAP — Components can be negative or zero, but never bigger than the vector itself — use it as a free error-check.
⚠ EXAM TRAP — Shortest-time and shortest-path river crossings are different strategies with different answers; the straight route takes longer and needs v_boat > v_river.
★ HIGHLIGHT — Final habit, worth more than any single formula: a vector answer is a magnitude AND a direction. If your pen stops after just a number, you have answered half the question. You now think in components — and from here, forces (Chapter 4) are just vectors with a job to do.
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

            studyNotesCount = 22,

            practiceQuestionCount = 5,

            durationMinutes = 50,

            formulaHighlight = "F = dp/dt = ma • J = F Δt = Δp • f_s ≤ μ_s N, f_k = μ_k N • tan α = μ_s • F_c = mv²/r • v_max = √[rg(sin θ + μ_s cos θ)/(cos θ − μ_s sin θ)] • v_bottom ≥ √(5gr)",

            keyConceptsSummary = "• Newton's laws: inertia and inertial frames, F = dp/dt = ma, action–reaction pairs acting on different bodies
• Free-body diagrams: one body at a time, real forces only, ΣF = ma written along each axis
• Connected bodies: Atwood a = (m₂ − m₁)g/(m₁ + m₂), T = 2m₁m₂g/(m₁ + m₂), wedge constraints, pseudo force −mA
• Friction is self-adjusting up to μ_s N; kinetic friction f_k = μ_k N; angle of repose tan α = μ_s
• Impulse J = F Δt = Δp; total momentum is conserved whenever the net external impulse is negligible
• Circular motion: real forces supply mv²/r — flat-curve limit √(μ_s gr), frictionless banking tan θ = v²/(rg)
• Vertical circle on a string: v_top ≥ √(gr), v_bottom ≥ √(5gr), and T_bottom − T_top = 6mg",

            detailedStudyNotes = """

Introduction — Why Things Move (or Refuse To)
• Chapters 2 and 3 taught you to DESCRIBE motion — position, velocity, acceleration. This chapter answers the deeper question: WHY does motion change? Why does a rolling ball slow down, why do you lurch forward when a bus brakes, why does the Moon keep circling the Earth instead of flying off? One word runs the whole chapter: force.
• Here is the scene to hold in your mind. A hockey puck slides on perfectly smooth ice. No one touches it. Your everyday intuition whispers "it will slow down and stop" — but on truly frictionless ice it would glide in a straight line at the same speed forever. Everyday intuition is trained on a world full of friction, and friction has been lying to you since childhood.
• Newton's three laws correct that intuition. The first law says what happens when NO net force acts. The second law — the engine of the chapter — says exactly how velocity changes when a net force DOES act. The third law says forces always come in pairs. From these three, everything in this chapter flows: pulleys, wedges, friction, banking, collisions.
• A warning before we begin, in the spirit of this app: almost every mistake in this chapter is a language mistake. "Force" in physics is not "effort", "power" or "energy". It is a push or a pull, measured in newtons, always exerted BY one body ON another. Keep asking "which body pushes, which body receives?" and half the traps in the exam disarm themselves.
★ HIGHLIGHT — The master key of the chapter: pick ONE body, draw every force acting ON it (its free-body diagram), write ΣF = ma for that body alone. Every single problem type ahead — Atwood machines, wedges, conical pendulums — is this one move repeated with different scenery.

The Law of Inertia and Newton's First Law
• DEFINITION — Inertia: the inherent property of a body by virtue of which it resists any change in its state of rest or of uniform motion in a straight line. Mass is the measure of inertia — the heavier the body, the harder it is to start, stop or deflect.
• DEFINITION — Newton's first law: a body remains in its state of rest, or of uniform motion in a straight line, unless compelled to change that state by a net external force acting on it.
• Read the law again and notice what it quietly does: it DEFINES force qualitatively (that which changes motion) and it tells you the natural state of things is not rest — it is constant VELOCITY. Rest is just the special case v = 0. A body needs no force to keep moving; it needs a force to STOP moving or to turn.
• EXAMPLE — You are standing in a bus that brakes suddenly. Your feet, gripping the floor, slow down with the bus — but your upper body, obeying the first law, continues forward at the old speed. You do not get "thrown forward by a force"; you simply keep your motion while the bus loses its. Seatbelts exist because of this law: they supply the force your body needs to slow down WITH the car.
• EXAMPLE — A tablecloth yanked sharply from under dishes: the dishes barely move. Friction acts only briefly, so the horizontal impulse is tiny and the dishes keep their state of rest — inertia, performed as a magic trick.
• WHY friction fooled Aristotle for 2000 years: on Earth, every sliding object has friction acting on it, so "things stop unless pushed" LOOKS true. Newton saw through it: the stopping is itself caused by a force. Remove the force and the motion persists. The first law is therefore a statement about what happens in the ABSENCE of net force — an idealisation no earthly surface perfectly shows.
• DEFINITION — Inertial frame of reference: a frame in which Newton's first law holds — a frame that is unaccelerated (at rest or moving with constant velocity). The ground is approximately inertial for everyday mechanics; an accelerating lift or a turning car is NOT.
• Frames matter because the laws change their form outside inertial frames. In a non-inertial frame you must add a fictitious pseudo force to make Newton's laws work — Section 9 gives you that tool. For now, fix the rule: apply F = ma directly only in inertial frames.
• YOUR TURN — A book rests on a table. A classmate says "no forces act on the book, that is why it does not move." What is wrong? (Answer: two forces act — gravity pulling down and the table's normal force pushing up. The NET force is zero, so the velocity stays zero. "No net force" is not "no forces".)
⚠ EXAM TRAP — The first law is NOT a special case of the second law with F = 0. It does separate work: it selects the inertial frames in which the second law is valid, and it defines force qualitatively. Exam statements love to swap this — do not let them.

Newton's Second Law — Force, Mass and Momentum
• DEFINITION — Linear momentum: the quantity of motion of a body, p = mv — a vector in the direction of velocity, measured in kg m/s. It fuses the two things that make a moving body hard to stop: how heavy it is and how fast it goes.
• EXAMPLE — A truck of 5000 kg crawling at 2 m/s and a car of 1000 kg at 10 m/s have momenta 10,000 and 10,000 kg m/s — equal. Stopping either in the same time demands the same force. Momentum, not speed alone, is what your brakes argue with.
• DEFINITION — Newton's second law: the rate of change of momentum of a body is directly proportional to the net external force applied, and takes place in the direction of that force. In SI form: F = dp/dt.
• For the overwhelming majority of problems the mass is constant, and dp/dt simplifies: F = d(mv)/dt = m(dv/dt) = ma. This is the form you will use daily — but remember it is the SPECIAL case. The general law F = dp/dt also handles rockets losing mass and raindrops gaining it.
✔ KEY FORMULA — F_net = dp/dt, and for constant mass F_net = ma. The SI unit of force, the newton: 1 N = 1 kg m/s² — the force that gives 1 kg an acceleration of 1 m/s².
• Three words in the formula carry all the marks: NET, EXTERNAL, and the vector nature. Net: add all forces as vectors first, then apply the law once. External: forces a body exerts on ITSELF (internal forces) cannot accelerate its centre of mass. Vector: F = ma holds independently along each axis — ΣF_x = ma_x and ΣF_y = ma_y, and you will often solve the two axes completely separately.
• WORKED PATTERN — A 5 kg block on a frictionless floor is pulled east with 30 N while a rope pulls west with 10 N. Net force = 30 − 10 = 20 N east. a = F_net/m = 20/5 = 4 m/s² east. Notice the ritual: choose a positive direction, sign the forces, add, THEN divide by mass. Never divide each force separately and add accelerations from different directions without signs.
• WORKED PATTERN — Find the force needed to bring a 1000 kg car from 20 m/s to rest in 5 s. a = (0 − 20)/5 = −4 m/s² (the minus sign says deceleration). F = ma = 1000 × (−4) = −4000 N — a retarding force of 4000 N, supplied by brakes and friction. The negative sign is information, not an error.
• EXAMPLE — Why do fielders pull their hands back while catching a fast ball, and why do cars have crumple zones? Both stretch the TIME over which momentum changes. Since F = Δp/Δt, a larger Δt for the same Δp means a smaller force. Engineering safety is the second law read backwards.
• YOUR TURN — What constant net force accelerates a 2 kg body from rest to 10 m/s in 5 s? (Answer: a = 10/5 = 2 m/s², so F = ma = 4 N.)
⚠ EXAM TRAP — Acceleration points along the NET FORCE, not necessarily along the velocity. A car braking has velocity forward and acceleration backward; a particle in circular motion has velocity tangential and acceleration toward the centre. "a is in the direction of motion" is the single most common false statement in this chapter.

▸ Impulse and the Impulse–Momentum Theorem
• DEFINITION — Impulse: the product of a force and the time for which it acts, J = F Δt for a constant force (more generally, the area under the force–time graph). Units: N s, identical to kg m/s.
• DEFINITION — Impulse–momentum theorem: the impulse of the net force on a body equals the change in its momentum: J = Δp = mv − mu.
• WHY this theorem deserves its own section: some forces act for such a short time, and spike so violently (a bat hitting a ball, a hammer hitting a nail), that measuring F itself is hopeless — but the impulse, the total push delivered, is easy to find from the momentum change. Whenever a problem gives you a collision time, it is begging for this theorem.
✔ KEY FORMULA — J = F Δt = Δp. If the force varies, J is the area under the F–t curve between the two instants.
• WORKED PATTERN — A batsman deflects a 0.15 kg ball arriving at 30 m/s so it leaves at 20 m/s in the opposite direction. Δp = m(v − u) with signs: take the outgoing direction positive: Δp = 0.15 × (20 − (−30)) = 0.15 × 50 = 7.5 kg m/s. If contact lasted 0.01 s, the average force = 7.5/0.01 = 750 N — fifty times the ball's weight, delivered in a blink.
• EXAMPLE — A karate strike breaks a board because the hand stops in a very short Δt against the board, so F = Δp/Δt is huge. The same hand pushing slowly against the board merely shoves it. Same momentum change, wildly different force — time is the dial.
• YOUR TURN — A 0.2 kg ball strikes a wall at 10 m/s and rebounds at 8 m/s. What impulse did the wall deliver? (Answer: Δp = 0.2 × (8 + 10) = 3.6 N s, directed away from the wall. Note the PLUS — reversal adds the momenta, it does not subtract them.)
⚠ EXAM TRAP — Impulse is a VECTOR. Rebound problems are sign traps: define a positive direction first and let u carry a minus sign if it points the other way. Most wrong answers in impulse questions are sign errors, not physics errors.

Newton's Third Law — Action and Reaction
• DEFINITION — Newton's third law: to every action there is an equal and opposite reaction. If body A exerts a force F on body B, then B simultaneously exerts a force −F on A.
• Three facts about the pair, each one examinable. One: the two forces act on DIFFERENT bodies — action on B, reaction on A. Two: they are equal in magnitude and opposite in direction at every instant. Three: they are of the same nature — if the action is gravitational, so is the reaction; if friction, then friction.
• Because the pair acts on different bodies, action and reaction NEVER cancel each other. Cancellation only happens between forces on the SAME body. This one sentence resolves the famous paradox: "if the horse pulls the cart forward and the cart pulls the horse back equally, how can anything move?" The cart moves because on the CART, the horse's pull beats friction. The horse moves because on the HORSE, the ground's forward friction (the reaction to the horse pushing the ground backward) beats the cart's backward pull. Two bodies, two separate force accounts — analyse each alone.
• EXAMPLE — Walking is third-law engineering: your foot pushes the ground backward; the ground pushes your foot forward. That forward push — friction from the ground — is the external force that accelerates you. On perfectly smooth ice the pair collapses (no grip, no backward push, no forward reaction) and walking becomes comedy.
• EXAMPLE — A rocket does not "push against the air". It throws exhaust gas backward at high speed; the gas throws the rocket forward. The pair works in empty space, which is precisely why rockets work where there is no air at all.
• WORKED PATTERN — Two skaters on ice, 40 kg and 60 kg, push each other apart. The forces are equal and opposite (say 120 N each way during contact). Accelerations: a₁ = 120/40 = 3 m/s² and a₂ = 120/60 = 2 m/s² — the lighter skater accelerates more, in the ratio 3:2, the inverse of the masses. Same force, different masses, different accelerations: the third law plus the second law, holding hands.
• YOUR TURN — A book rests on a table. Identify the third-law partner of the book's weight (the Earth pulling the book down). (Answer: the BOOK pulling the EARTH up — not the table's normal force. The normal force's partner is the book pushing the table down. Weight and normal force on the book are equal here, but they are NOT an action–reaction pair: both act on the same body and they are of different natures.)
⚠ EXAM TRAP — "Action and reaction cancel, so nothing can ever accelerate" is false, and so is labelling weight and normal reaction as an action–reaction pair in general — on an accelerating lift they are not even equal. Pairs are identified by the swap test: reverse the sentence "A pushes B" to "B pushes A" — if both forces exist in the swapped sentence, you have a pair.
The Free-Body Diagram Method
• DEFINITION — Free-body diagram (FBD): a diagram of ONE chosen body, isolated from its surroundings, showing every external force acting ON it as an arrow, with magnitudes and directions labelled. It is the single most transferable skill in mechanics.
• The five-step ritual — follow it in this order, every problem, no exceptions. Step 1: choose ONE body and isolate it mentally. Step 2: list every force ON it — gravity, contact forces from anything touching it, applied forces, friction. Step 3: draw the body as a dot or box and draw each force as an arrow from it. Step 4: choose axes (tip: align one axis with the acceleration) and resolve any tilted forces. Step 5: write ΣF_x = ma_x and ΣF_y = ma_y, and solve.
• Two discipline rules that prevent 90% of errors. Rule one: forces ON the body only — never draw forces the body exerts on others (those belong on the OTHER body's diagram). Rule two: ma is NOT a force. Never draw an "ma arrow" on an FBD; ma is what the sum of real forces equals. Every arrow on your diagram must have a physical agent: Earth (gravity), a surface (normal, friction), a rope (tension), a hand, a spring.
• WORKED PATTERN — A lamp of mass 2 kg hangs from a cord. FBD of the lamp: weight mg = 20 N downward (agent: Earth), tension T upward (agent: cord). Lamp is in equilibrium, a = 0, so ΣF = 0 gives T = 20 N. Simple — but notice the method was complete even here: one body, two arrows, one equation.
• WORKED PATTERN — Preview of the incline (Section 10's figure draws it fully): a block on a slope of angle θ has weight mg vertically down. Resolve along axes aligned with the slope: component along the slope = mg sin θ (pulls it down the slope), component into the slope = mg cos θ (presses it into the surface, and the normal force answers it). Choosing tilted axes turns a two-dimensional problem into two one-dimensional ones — this is why the ritual says align an axis with the acceleration.
• YOUR TURN — Draw the FBD (mentally) of a ball being carried upward by a lift at constant velocity. Which forces act, and how do they compare? (Answer: weight mg down, normal force from the floor up — and they are EQUAL, because constant velocity means a = 0, so ΣF = 0. The lift's upward motion does not require an upward net force.)
⚠ EXAM TRAP — Including the "force of motion" or the force a body exerts on its support in its own FBD is the classic diagram error. If an arrow's agent cannot be named, the arrow does not exist.

Common Forces in Mechanics
• DEFINITION — Weight: the gravitational force exerted by the Earth on a body, W = mg, directed toward the Earth's centre. g ≈ 9.8 m/s²; in this chapter's arithmetic we often use g = 10 m/s² when the problem invites it.
• DEFINITION — Normal reaction (N): the force a surface exerts on a body touching it, directed PERPENDICULAR to the surface, pushing the body away. It is an electromagnetic contact force at root, and it is self-adjusting: it grows or shrinks to exactly prevent penetration — no more, no less.
• The normal force is NOT automatically mg. On an incline it is mg cos θ. In an accelerating lift it is m(g + a) or m(g − a). If an extra downward push acts, N increases by that push. N equals whatever the perpendicular direction's equation ΣF_perp = ma_perp demands. Treating "N = mg" as a law is the most expensive habit in this chapter — friction depends on N, so the error cascades.
• DEFINITION — Tension (T): the pulling force transmitted through a string, rope or rod, directed AWAY from the body along the connector. For a light (massless), inextensible string over a frictionless pulley, the tension is the SAME throughout — the pulley changes only the direction of the force, not its size.
• Why a massless string has uniform tension: apply F = ma to any segment of it. Its mass is ~0, so even a finite acceleration needs ~zero net force — hence the pulls at its two ends must balance. Real strings have mass and their tension varies along their length; entrance problems idealise this away, and you should state the idealisation when you use it.
• DEFINITION — Spring force: a spring stretched or compressed by x from its natural length exerts F = kx, directed toward the natural length (Hooke's law, valid within the elastic limit). k is the spring constant, in N/m — stiffer spring, larger k.
• EXAMPLE — A spring of k = 200 N/m stretched by 5 cm exerts F = 200 × 0.05 = 10 N pulling back. Compress it by the same 5 cm and it pushes with the same 10 N. Symmetric, linear, dependable — which is why springs are the laboratory's force meters (a spring balance is Hooke's law with a scale printed on it).
• Contact forces have a family portrait: whenever two bodies touch, the contact force can be split into the perpendicular part (normal reaction) and the parallel part (friction). Section 10 is devoted to the parallel part. Until then, remember the split exists — "the force exerted by the surface" is always these two components wearing one coat.
• YOUR TURN — A 5 kg block sits on a horizontal floor. A person presses it downward with an extra 30 N while it stays put. What is the normal force? (Answer: N = mg + 30 = 50 + 30 = 80 N. The floor answers the total downward load, not just the weight.)
⚠ EXAM TRAP — Weight acts even when nothing touches the body; normal force and friction exist ONLY in contact. A body in free fall has full weight mg but zero normal force from anything — that is why astronauts in orbit feel "weightless" while gravity still pulls on them at nearly full strength.

Equilibrium of a Particle
• DEFINITION — Equilibrium of a particle: the state in which the net external force on it is zero, ΣF = 0, so its acceleration is zero — the particle is either at rest or moving with constant velocity.
• Equilibrium is not a synonym for rest. A car cruising at a steady 100 km/h is in equilibrium: engine thrust forward exactly cancels drag and friction backward. The first law is the equilibrium statement — velocity, not position, is what zero net force preserves.
✔ KEY FORMULA — Equilibrium in components: ΣF_x = 0 and ΣF_y = 0 (and ΣF_z = 0 in 3D). For three concurrent forces in equilibrium, Lami's theorem: each force divided by the sine of the angle opposite to it (the angle between the other two) gives the same value — F₁/sin α = F₂/sin β = F₃/sin γ.
• WORKED PATTERN — A 10 kg block rests on a 30° incline, held by friction. Resolve the weight (100 N): along the slope, mg sin 30° = 50 N pulling down-slope; into the slope, mg cos 30° ≈ 86.6 N. Equilibrium then reads the answers off directly: friction f = 50 N up-slope, and normal N = 86.6 N. No acceleration, no drama — equilibrium problems are FBD problems where the right-hand side is zero.
• WORKED PATTERN — A picture of mass 2 kg hangs from two symmetric strings, each making 30° with the vertical. Vertical equilibrium: 2T cos 30° = mg = 20 N, so T = 20/(2 × 0.866) ≈ 11.5 N per string. Symmetry did half the work: equal angles mean equal tensions.
• YOUR TURN — A traffic light of mass 10 kg hangs from a single vertical cable. Tension? (Answer: equilibrium → T = mg = 100 N. If the cable were two symmetric cables, each would carry less — geometry shares loads.)
⚠ EXAM TRAP — Equilibrium means ΣF = 0, not "all forces are equal in pairs". Four unequal forces can sum to zero. Test the vector sum, not the individual sizes.

Connected Bodies — Pulleys and Strings
• When bodies are tied together by strings, they no longer move independently — the string imposes a CONSTRAINT: connected bodies share the same acceleration magnitude along the string. The winning strategy: write F = ma for EACH body from its own FBD, then let the constraint link the equations.
• WORKED PATTERN — The Atwood machine: masses 3 kg and 5 kg hang from a light string over a frictionless pulley (the figure in this section shows the setup). The heavier side falls. Take the direction of motion as positive for each mass. For 5 kg: 5g − T = 5a. For 3 kg: T − 3g = 3a. Add the equations — tension cancels: (5 − 3)g = (5 + 3)a, so a = (2/8) × 10 = 2.5 m/s². Back-substitute: T = 3(g + a) = 3 × 12.5 = 37.5 N.
✔ KEY FORMULA — Atwood machine: a = (m₂ − m₁)g/(m₁ + m₂) for m₂ > m₁, and T = 2m₁m₂g/(m₁ + m₂). Sanity checks built in: if m₁ = m₂, a = 0 and T = mg — equilibrium, as it must be.
• WORKED PATTERN — A 4 kg block on a frictionless table is tied over a pulley to a hanging 2 kg mass. Constraint: both accelerate together with the same a. Table block (horizontal): T = 4a. Hanging mass (vertical): 2g − T = 2a. Substitute: 20 − 4a = 2a → a = 20/6 ≈ 3.33 m/s², and T = 4 × 3.33 ≈ 13.3 N. Cross-check with the hanging mass: T = 2(g − a) = 2 × 6.67 ≈ 13.3 N ✓. Two routes agreeing is how toppers verify.
• WORKED PATTERN — Two blocks in contact on a frictionless floor, 2 kg behind 3 kg, pushed with 10 N. Together: a = 10/5 = 2 m/s². Now isolate the 3 kg block: the ONLY horizontal force on it is the contact push from its neighbour, so contact force = 3 × 2 = 6 N — not 10 N. The push is spent accelerating both blocks; each body only "feels" what its own FBD shows.
• EXAMPLE — Real Atwood thinking hides inside lifts and counterweights: a lift cabin is counterweighted so the motor fights only the DIFFERENCE of the masses — the same (m₂ − m₁)/(m₁ + m₂) structure, wearing overalls.
• YOUR TURN — Atwood machine, 2 kg and 6 kg, g = 10. Acceleration and tension? (Answer: a = (4/8) × 10 = 5 m/s²; T = 2 × 2 × 6 × 10/8 = 30 N.)
⚠ EXAM TRAP — Tension in an Atwood machine is NOT equal to either weight, and the two masses do NOT have separate accelerations. One string → one a, one T. Also: never write a single F = ma for "the whole system" and then expect internal forces like tension to appear — internal forces cancel inside a system equation; tension is found only by isolating a body.

▸ Wedge Constraints and Pseudo Force
• DEFINITION — Constraint relation: the mathematical link between the accelerations (or displacements) of connected bodies imposed by strings, surfaces or wedges. For an inextensible string, the total string length is constant — differentiate that fact and the acceleration relation falls out. For a block on a wedge, the block must stay ON the surface: the components of acceleration perpendicular to the surface, for block and wedge, must match.
• WORKED PATTERN — The classic movable wedge: a block slides on the smooth incline (angle θ) of a wedge that can itself slide horizontally. If the wedge accelerates at A, the constraint says the block's acceleration relative to the wedge is along the incline, and its ground-frame acceleration is the vector sum: wedge's A plus the along-slope relative acceleration. Write components, never slogans: perpendicular to the incline, block and wedge accelerations agree. This single component-matching step is the whole secret of wedge problems — and the seed of the "virtual work" shortcut, Σ T·a = 0 for ideal strings, that advanced problems use.
• DEFINITION — Pseudo force (inertial force): the fictitious force, F_pseudo = −mA, that must be added to a body of mass m when analysing it from a non-inertial frame that itself accelerates at A. It acts opposite to the frame's acceleration, through the body, and has no physical agent and no third-law partner.
• WHY the pseudo force works: in the accelerating frame, every body appears to be pushed backward — passengers "thrown" toward the rear of an accelerating bus. Rather than abandoning F = ma in such frames, we add −mA to the force list and the second law works again inside the frame. It is bookkeeping, not a real interaction — but bookkeeping that gets correct answers.
• WORKED PATTERN — A pendulum hangs from the ceiling of a car accelerating at 5 m/s². In the car's frame, the bob is in equilibrium under three forces: weight mg down, tension along the string, and pseudo force ma horizontally backward. The string settles at angle θ with tan θ = a/g = 5/10 = 0.5, so θ ≈ 26.6° from vertical, tilted backward. (In the ground frame the same angle comes from tension's horizontal component supplying ma — two frames, one answer, as physics demands.)
• WORKED PATTERN — Apparent weight in a lift: a 60 kg person stands on a scale in a lift accelerating upward at 2 m/s². Ground frame: N − mg = ma → N = m(g + a) = 60 × 12 = 720 N; the scale reads 720 N, i.e. "72 kg" — you feel heavier. Accelerating downward at 2 m/s²: N = m(g − a) = 480 N — you feel lighter. In free fall (a = g downward), N = 0: complete weightlessness, no pseudo-force mystery required.
• YOUR TURN — A lift descends with acceleration 3 m/s². A 50 kg person's apparent weight? (Answer: N = m(g − a) = 50 × 7 = 350 N — the scale shows the equivalent of 35 kg.)
⚠ EXAM TRAP — Never apply a pseudo force in an inertial (ground) frame analysis, and never apply it twice. Choose ONE frame per problem: ground frame → real forces only; accelerating frame → real forces PLUS −mA on every body. Mixing frames mid-problem is the wedge chapter's number-one mark-killer.
Friction — the Self-Adjusting Force
• DEFINITION — Friction: the component of the contact force parallel to the surface of contact, opposing RELATIVE motion (kinetic friction) or the tendency of relative motion (static friction) between the surfaces. It arises from surface roughness and interlocking of irregularities, and at root is electromagnetic.
• DEFINITION — Static friction (f_s): the friction between surfaces at rest relative to each other. Its defining trait: it is SELF-ADJUSTING. It matches the applied tendency exactly — push gently and it pushes back gently — up to a maximum limit. Only at the limit does it take its famous formula value.
✔ KEY FORMULA — 0 ≤ f_s ≤ f_max = μ_s N. Kinetic (sliding) friction: f_k = μ_k N, approximately independent of speed and of contact area. Almost always μ_k < μ_s — it is harder to start a slide than to sustain it.
• WORKED PATTERN — A 5 kg block rests on a floor with μ_s = 0.4 and μ_k = 0.3 (g = 10, so N = 50 N). Limiting friction = 0.4 × 50 = 20 N. Push horizontally with 12 N: friction is NOT 20 N — static friction self-adjusts to exactly 12 N and the block stays put. Push with 25 N: the block breaks free; now kinetic friction rules at 0.3 × 50 = 15 N, and a = (25 − 15)/5 = 2 m/s². The 12 N case is where exams hunt: they wait for you to write f = μN blindly.
• Direction discipline: friction opposes relative slipping (or its tendency) AT THE CONTACT — not necessarily the body's motion. A walking person's foot tends to slip backward, so friction on the foot points FORWARD — friction is what propels you. The driving wheels of a car are pushed forward by friction; the rolling suitcase is slowed by it. Always ask "which way would the contact point slip without friction?" and point friction the other way.
• EXAMPLE — Why racing tyres are wide and why chalk helps a weightlifter's grip are subtle (contact-area independence is an empirical approximation for hard surfaces), but the everyday checks are direct: sand scattered on an icy road raises μ; oil on a hinge lowers it; ABS brakes fight to keep wheels near the STATIC regime because μ_s > μ_k — a rolling-while-braking tyre grips better than a locked, sliding one.
• Rolling friction (f_r) is far smaller than sliding friction — the wheel's gift to civilisation. It appears in the syllabus family portrait but entrance problems usually quantify only static and kinetic friction.
• YOUR TURN — A 2 kg block slides on a floor with μ_k = 0.25. Friction magnitude, and the deceleration? (Answer: f = 0.25 × 20 = 5 N; a = f/m = 2.5 m/s² opposing the motion.)
⚠ EXAM TRAP — Three friction traps, collected: (1) writing f = μN for a body at rest under a small push — use self-adjustment; (2) friction on a body in an accelerating system judged in the wrong frame — friction depends on relative motion at the contact, frame-independent if you track the contact surfaces; (3) assuming friction always opposes the velocity of the body's centre — it opposes slipping at the contact, which for a driven wheel or a walking foot is the opposite of what intuition shouts.

▸ Limiting Friction, Angle of Friction and Angle of Repose
• DEFINITION — Limiting friction: the maximum value of static friction, f_max = μ_s N, reached at the verge of slipping. The coefficient μ_s is a property of the pair of surfaces (and their condition), not of the body's mass or the contact area.
• DEFINITION — Angle of friction (λ): the angle between the normal reaction and the TOTAL contact reaction (normal + friction combined) when friction is limiting. Geometry of the force triangle gives tan λ = f_max/N = μ_s — the angle of friction is simply μ_s wearing a protractor.
• DEFINITION — Angle of repose (α): the steepest angle of an incline at which a block placed on it just begins to slip under its own weight. Resolving mg along the slope at the tipping point: mg sin α = f_max = μ_s mg cos α, hence tan α = μ_s.
✔ KEY FORMULA — tan(angle of repose) = tan(angle of friction) = μ_s. Below the repose angle, a block rests unaided; above it, no static friction can hold it.
• WORKED PATTERN — μ_s = 0.5 → angle of repose = tan⁻¹(0.5) ≈ 26.6°. Tilt the same surface to 30° and the block MUST slide — the surface's grip ceiling (26.6°) has been passed. Conversely, a block that starts slipping at exactly 30° is reporting μ_s = tan 30° ≈ 0.577 — one observation, coefficient measured. This is a standard laboratory method for finding μ_s, and a standard exam question in disguise.
• WORKED PATTERN — A block slides DOWN a 45° incline with μ_k = 0.25. Along the slope: driving component mg sin 45°, friction μ_k mg cos 45° up-slope. a = g(sin 45° − μ_k cos 45°) = 10 × (0.707 − 0.25 × 0.707) = 10 × 0.530 = 5.30 m/s². General result worth memorising as a pattern: a = g(sin θ − μ_k cos θ) down a rough incline, valid once sliding (θ above repose).
• YOUR TURN — μ_s = 1 for a pair of surfaces. Angle of repose? (Answer: tan⁻¹(1) = 45°. And if μ_s were larger than 1 — possible! — the repose angle would exceed 45°; coefficients above 1 are legal, e.g. rubber on dry tarmac.)
⚠ EXAM TRAP — Angle of repose uses μ_s (the verge of slipping), never μ_k. And a block resting on an incline BELOW repose experiences friction mg sin θ — the self-adjusted value — not μ_s mg cos θ. The formula μ_s N is a ceiling, not a salary.

Conservation of Momentum
• DEFINITION — Conservation of linear momentum: if the net external force on a system is zero (or the net external impulse negligible during the event), the total momentum of the system remains constant: Σp = constant, in every component separately.
• WHY it is true — the derivation is three lines and worth owning. For two interacting bodies, the second law gives F_A→B = dp_B/dt and F_B→A = dp_A/dt. The third law says these forces are equal and opposite, so dp_A/dt + dp_B/dt = 0: the total momentum's rate of change is zero. Internal forces only TRANSFER momentum between members; only external forces can change the system's total. This is why the principle is exactly as deep as Newton's laws themselves.
• The event clause matters: in collisions and explosions, internal forces are enormous and brief, while external impulses (gravity, friction) over that blink are negligible — so momentum is conserved during the event even though the system is not isolated in the long run. A bouncing ball's momentum is not conserved at impact with the Earth? It is — if your system includes the Earth, whose recoil is real but unmeasurably tiny.
✔ KEY FORMULA — m₁u₁ + m₂u₂ = m₁v₁ + m₂v₂ (vector equation — apply per component). Elastic collisions conserve kinetic energy too; inelastic ones do not; a perfectly inelastic collision ends with the bodies stuck together, sharing one velocity.
• WORKED PATTERN — Recoil: a 4 kg gun fires a 0.05 kg bullet at 200 m/s. System (gun + bullet) starts at rest, external impulse during firing ≈ 0. Conservation: 0 = 4 × V + 0.05 × 200 → V = −2.5 m/s. The gun recoils at 2.5 m/s. Note the asymmetry the formula reveals: same momentum magnitude, but the light bullet carries most of the kinetic energy — recoil energy is the small change of the transaction.
• WORKED PATTERN — A 2 kg block moving at 3 m/s strikes a stationary 1 kg block and they stick. Common velocity: v = (2 × 3 + 1 × 0)/(2 + 1) = 2 m/s. Kinetic energy before: ½ × 2 × 9 = 9 J. After: ½ × 3 × 4 = 6 J. Momentum: perfectly conserved (6 kg m/s both sides ✓). Kinetic energy: 3 J converted to heat, sound and deformation. Momentum conservation is unconditional here; energy conservation is not — never apply the wrong one.
• EXAMPLE — Rocket propulsion is momentum bookkeeping in continuous form: exhaust thrown backward carries momentum away, so the rocket gains equal momentum forward. No air, no ground, no pushing surface needed — conservation alone does the job, which is why it works in vacuum.
• YOUR TURN — A 50 kg skater at rest throws a 2 kg ball forward at 10 m/s. Her recoil speed? (Answer: 2 × 10/50 = 0.4 m/s backward.)
⚠ EXAM TRAP — Momentum is a VECTOR and is conserved component-wise: in a 2D collision, conserve p_x and p_y separately — a body can gain x-momentum from an interaction while the system's total vector stays fixed. And "momentum conserved" never licenses "kinetic energy conserved" — check the collision type before touching energy.

Circular Motion — Centripetal Force
• From Chapter 3 you own the kinematics: a particle in uniform circular motion has speed constant but velocity turning, with acceleration a_c = v²/r = ω²r directed toward the centre. This chapter adds the dynamics: by the second law, a real net force must supply it.
✔ KEY FORMULA — F_centripetal = mv²/r = mω²r, directed toward the centre. Crucial understanding: "centripetal force" is not a new kind of force — it is the NAME OF THE JOB that real forces (tension, friction, gravity, normal reaction, or a component of one) must collectively perform.
• Therefore, in an FBD for circular motion, you NEVER draw a separate "centripetal force" arrow. You draw the real forces, write ΣF_toward centre = mv²/r, and let the equation say which real force (or component) is doing the job. Drawing mv²/r as an extra force double-counts and ruins the problem.
• WORKED PATTERN — A 1000 kg car rounds a flat (unbanked) curve of radius 50 m at 10 m/s. The only horizontal force available is friction between tyres and road: f = mv²/r = 1000 × 100/50 = 2000 N. Required μ: f/N = 2000/(1000 × 10) = 0.2. If the road offers only μ_s = 0.15, the car cannot hold the curve at this speed — it slides outward (not because a "centrifugal force" throws it, but because friction cannot supply the required inward force, so the car keeps its tangential line while the road curves away).
• WORKED PATTERN — Maximum speed on a flat curve: set friction at its limit: μ_s mg = mv²/r → v_max = √(μ_s g r). For μ_s = 0.5, r = 50 m: v_max = √(0.5 × 10 × 50) = √250 ≈ 15.8 m/s. Mass cancels — a truck and a bicycle share the same ceiling on the same curve (in this idealisation).
• EXAMPLE — The spin cycle of a washing machine: the drum wall's normal force supplies centripetal force to the clothes; the water, at the drum's holes, finds no inward force available and continues tangentially out. Centripetal thinking explains your laundry.
• YOUR TURN — A 0.5 kg stone whirled on a 2 m string at 10 m/s (horizontal circle). Tension in the string? (Answer: tension alone does the centripetal job: T = mv²/r = 0.5 × 100/2 = 25 N.)
⚠ EXAM TRAP — "Centrifugal force" is a pseudo force — legitimate ONLY inside the rotating frame. In ground-frame solutions it does not exist; writing it alongside real forces in an inertial-frame FBD is an automatic error. Choose your frame, then be loyal to it.

▸ Banking of Roads and the Conical Pendulum
• Flat curves are limited by friction, and friction is fickle (rain, ice, oil). Engineers cheat: tilt the road so the NORMAL force itself leans inward and donates a horizontal component to the centripetal job. That tilt is banking.
• WORKED PATTERN — Frictionless banking: road banked at θ, car at speed v on radius r. Forces: weight mg down, normal N perpendicular to the road surface. Vertical equilibrium: N cos θ = mg. Horizontal (centripetal): N sin θ = mv²/r. Divide: tan θ = v²/(rg). At this one DESIGN speed, no friction is needed at all. For r = 100 m, v = 20 m/s, g = 10: tan θ = 400/1000 = 0.4 → θ ≈ 21.8°.
✔ KEY FORMULA — Design speed on a frictionless bank: v = √(rg tan θ). With friction, the safe window widens: v_max = √[rg (sin θ + μ_s cos θ)/(cos θ − μ_s sin θ)] (friction points down-slope at the top speed, stopping the car sliding UP) and v_min = √[rg (sin θ − μ_s cos θ)/(cos θ + μ_s sin θ)] (friction points up-slope, stopping it sliding DOWN).
• Read the v_max formula's drama: if μ_s = tan θ... no — if the denominator (cos θ − μ_s sin θ) hits zero, v_max → ∞: friction alone could hold the car on a wall of death. Formulas that blow up are telling you physics, not failing you.
• DEFINITION — Conical pendulum: a bob on a string that revolves in a horizontal circle, the string sweeping out a cone. The bob's circle radius is r = l sin θ, where l is the string length and θ the half-angle of the cone.
• WORKED PATTERN — Conical pendulum analysis: forces on the bob — weight mg down, tension T along the string. Vertical: T cos θ = mg. Horizontal (centripetal): T sin θ = mv²/r. Dividing: tan θ = v²/(rg) — the same skeleton as banking, because a tilted force is again donating its horizontal component. Period: T_p = 2π√(l cos θ/g). For l = 1 m, θ = 30°, g = 10: T_p = 2π√(0.866/10) = 2π × 0.294 ≈ 1.85 s. Note l cos θ is the vertical height of the cone — the period depends only on that height, a lovely pattern shared with the simple pendulum.
• EXAMPLE — A ceiling fan's pull-chain switch swinging in a small circle when the fan wobbles, and a chair-o-plane ride at a fairground: the chairs rise until tan θ = v²/(rg) is satisfied — faster ride, wider cone, same equation as the highway engineer's.
• YOUR TURN — A frictionless banked curve, r = 40 m, θ = 45°. Design speed? (Answer: v = √(10 × 40 × tan 45°) = √400 = 20 m/s.)
⚠ EXAM TRAP — At speeds BELOW the design speed on a banked road, friction points UP the slope (the car tends to slide down); above it, friction points DOWN the slope. Most banking errors are this sign flip. And in the conical pendulum, tension is NOT mg/cos θ by magic — it follows from T cos θ = mg only because the vertical acceleration is zero; quote the equation, not the fragment.

▸ Motion in a Vertical Circle
• Now the circle stands upright and gravity plays both friend and enemy: helping the fall on the way down, fighting the rise on the way up. Speed is no longer constant, so energy conservation joins dynamics at the party (energy tools get their full chapter next; here we use v² differences of 2g × height, which you already own).
• The string case is the strict one. A bob on a STRING can only pull inward — tension cannot push. At the top of the circle, both weight and tension point toward the centre: mg + T = mv_top²/r. The critical moment is T = 0 — the string just stays taut — giving the minimum top speed v_top = √(gr). Any slower and the string slackens; the bob leaves the circle and becomes a projectile.
✔ KEY FORMULA — For a string (or a particle on the OUTSIDE of a sphere): minimum speed at the top = √(gr); by energy conservation from the bottom (2r below), minimum speed at the bottom = √(5gr). Tension difference: T_bottom − T_top = 6mg — a universal result for any complete vertical circle at any speed.
• WORKED PATTERN — Take a 0.5 kg bob on a string, circle radius r = 0.5 m, g = 10. Minimum top speed: √(gr) = √5 ≈ 2.24 m/s. Minimum bottom speed: √(5gr) = √25 = 5 m/s. Now launch it at 10 m/s from the bottom: T_bottom = m(g + v²/r) = 0.5 × (10 + 100/0.5) = 0.5 × 210 = 105 N. At the top, v_top² = v_bottom² − 4gr = 100 − 20 = 80, so T_top = m(v²/r − g) = 0.5 × (160 − 10) = 75 N. Difference: 105 − 75 = 30 N = 6mg ✓ — the universal check confirms the arithmetic.
• Contrast the constraints — the exam's favourite comparison. A bob on a rigid ROD can be pushed as well as pulled, so it completes the circle with ANY positive speed at the top (even ~0). A bead threaded on a wire behaves like the rod. A particle sliding INSIDE a loop track behaves like the string (normal force can only push it toward the centre... precisely: the track can only push, never pull, so the √(gr)/√(5gr) conditions apply). Classify the constraint first; the formulas follow the classification.
• EXAMPLE — Looping-the-loop stunts and rollercoasters are sized by √(5gr): engineers add margin, but the physics floor for the entry speed is set by a string-and-bob argument older than the aeroplane.
• YOUR TURN — A bob must loop a vertical circle of radius 2 m (string). Minimum speed at the bottom? (Answer: √(5 × 10 × 2) = √100 = 10 m/s.)
⚠ EXAM TRAP — At the top of a vertical circle, gravity points TOWARD the centre and HELPS the centripetal requirement — the equation is mg + T = mv²/r, never T − mg. And "the bob completes the circle if it reaches the top" is false for a string: reaching the top slowly means the string went slack long before; the condition lives in the tension, not the altitude.
Formula Sheet — One-Glance Recap
✔ KEY FORMULA — Second law: F_net = dp/dt = ma (constant mass) • Momentum p = mv • Impulse J = F Δt = Δp • Weight W = mg • Spring force F = kx • Equilibrium: ΣF = 0.
✔ KEY FORMULA — Friction: f_s ≤ μ_s N (self-adjusting) • f_k = μ_k N • tan(angle of friction) = tan(angle of repose) = μ_s • Rough incline: a = g(sin θ − μ_k cos θ) when sliding down.
✔ KEY FORMULA — Atwood: a = (m₂ − m₁)g/(m₁ + m₂) • T = 2m₁m₂g/(m₁ + m₂) • Pseudo force in a frame accelerating at A: F = −mA • Lift: N = m(g + a) rising, m(g − a) descending, 0 in free fall.
✔ KEY FORMULA — Momentum conservation (no net external impulse): m₁u₁ + m₂u₂ = m₁v₁ + m₂v₂ • Perfectly inelastic: v = (m₁u₁ + m₂u₂)/(m₁ + m₂).
✔ KEY FORMULA — Circular: F_c = mv²/r = mω²r • flat curve v_max = √(μ_s gr) • frictionless bank tan θ = v²/(rg) • banked with friction v_max = √[rg(sin θ + μ_s cos θ)/(cos θ − μ_s sin θ)] • conical pendulum period 2π√(l cos θ/g) • vertical circle (string): v_top ≥ √(gr), v_bottom ≥ √(5gr), T_bottom − T_top = 6mg.

Common Mistakes — and the Principles That Fix Them
• Mistake 1 — Writing N = mg automatically. Why wrong: the normal force answers the perpendicular equation, and inclines (mg cos θ), lifts (m(g ± a)) and extra pushes all change it — and since friction is μN, the error then poisons the friction too. Correct principle: N is found, never assumed — write ΣF_perpendicular = ma_perpendicular and let the equation speak.
• Mistake 2 — Writing f = μ_s N for every resting body. Why wrong: static friction is self-adjusting between 0 and μ_s N; a 12 N push on a block whose limit is 20 N meets 12 N of friction, and the block does not move. Correct principle: first test whether the required friction exceeds μ_s N; if not, friction equals the requirement.
• Mistake 3 — Drawing "centripetal force" or "centrifugal force" as an extra arrow in a ground-frame FBD. Why wrong: centripetal is the name of the net inward RESULT, not an additional agent; centrifugal is a pseudo force that exists only in the rotating frame. Correct principle: draw only forces with physical agents; write ΣF_inward = mv²/r as the equation.
• Mistake 4 — "Action and reaction cancel, so the system cannot accelerate." Why wrong: the pair acts on different bodies; cancellation requires forces on the SAME body. Correct principle: do the accounts body by body — each body's motion is decided by the forces on IT alone.
• Mistake 5 — Putting "ma" on the FBD as a force. Why wrong: ma is the value the vector sum of real forces equals; it has no agent. Correct principle: every arrow needs a named agent (Earth, surface, rope, spring, hand); if you cannot name it, erase it.
• Mistake 6 — Conserving kinetic energy in every collision because momentum is conserved. Why wrong: perfectly inelastic collisions lose KE to heat and deformation (9 J → 6 J in Section 12's pattern) while momentum survives untouched. Correct principle: momentum conservation needs only negligible external impulse; KE conservation is the special privilege of elastic collisions.
• Mistake 7 — Adding a pseudo force in the ground frame, or in both frames' equations at once. Why wrong: the pseudo force is a frame-conversion device, not a physical interaction. Correct principle: one problem, one frame — ground frame: real forces only; accelerating frame: real forces plus −mA on every body.

Worked Examples — Basic to Challenging
• EXAMPLE 1 (Force at an angle). Problem: a 20 N force pulls a 4 kg block at 37° above horizontal on a frictionless floor (sin 37° ≈ 0.6, cos 37° ≈ 0.8). Find the acceleration and the normal force. Given: F = 20 N, m = 4 kg. Principle: resolve F; only the horizontal component accelerates the block. Steps: F_x = 20 × 0.8 = 16 N → a = 16/4 = 4 m/s². Vertical: N + F sin 37° = mg → N = 40 − 20 × 0.6 = 40 − 12 = 28 N. Answer: a = 4 m/s², N = 28 N. Reasoning: the angled pull partly lifts the block, unloading the floor — N < mg without anything leaving the surface. Mistake to avoid: using the full 20 N for acceleration.
• EXAMPLE 2 (Atwood machine). Problem: masses 4 kg and 6 kg hang over a frictionless pulley (g = 10). Find a and T. Principle: one string → one a, one T; write F = ma per body and add. Steps: a = (6 − 4)/(6 + 4) × 10 = 2 m/s². T = 2 × 4 × 6 × 10/10 = 48 N. Answer: a = 2 m/s², T = 48 N. Cross-check: T = 4 × (10 + 2) = 48 N ✓ (the lighter mass is pulled up, so tension exceeds its weight). Mistake to avoid: setting T equal to one of the weights.
• EXAMPLE 3 (Friction threshold). Problem: a 10 kg block on a floor, μ_s = 0.5, μ_k = 0.4. A horizontal push grows slowly: what happens at 30 N, and at 60 N? Given: N = mg = 100 N. Principle: static friction self-adjusts up to μ_s N = 50 N. Steps: at 30 N (< 50 N): friction = 30 N, block at rest. At 60 N (> 50 N): block slides; kinetic friction = 0.4 × 100 = 40 N; a = (60 − 40)/10 = 2 m/s². Answer: rest at 30 N; accelerates at 2 m/s² under 60 N. Mistake to avoid: answering "friction is 50 N" at the 30 N stage.
• EXAMPLE 4 (Rough incline). Problem: a block slides down a 30° incline with μ_k = 0.1 (g = 10). Find its acceleration. Principle: along-slope equation with kinetic friction opposing the slide. Steps: a = g(sin 30° − μ_k cos 30°) = 10 × (0.5 − 0.1 × 0.866) = 10 × 0.4134 ≈ 4.13 m/s². Answer: ≈ 4.1 m/s² down the slope. Reasoning: friction trims the smooth-incline value (5 m/s²) but cannot stop the slide since tan 30° = 0.577 > μ_k... and indeed θ is far above the repose angle tan⁻¹(0.1) ≈ 5.7°. Mistake to avoid: using μ_s in a sliding problem.
• EXAMPLE 5 (Apparent weight). Problem: a 60 kg person rides a lift accelerating upward at 2 m/s², then the cable snaps (the lift free-falls). What does the floor's normal force read in each phase? Principle: N − mg = ma with the sign of a. Steps: rising: N = 60 × (10 + 2) = 720 N. Free fall: a = −10 relative to up-positive → N = 60 × (10 − 10) = 0 N. Answer: 720 N, then zero — total weightlessness in free fall. Mistake to avoid: believing the person's WEIGHT changes; mg is 600 N throughout — only the normal force (the felt weight) changes.
• EXAMPLE 6 (Perfectly inelastic collision). Problem: a 3 kg block at 6 m/s hits a stationary 3 kg block and they stick. Find the final speed and the kinetic energy lost. Principle: momentum conserved (external impulse negligible); KE not required to survive. Steps: v = (3 × 6 + 0)/6 = 3 m/s. KE before = ½ × 3 × 36 = 54 J; after = ½ × 6 × 9 = 27 J; lost = 27 J. Answer: 3 m/s; 27 J lost to heat/deformation. Mistake to avoid: conserving KE and getting v = 4.24 m/s — that answer violates momentum (6 × 4.24 ≠ 18).
• EXAMPLE 7 (Vertical circle). Problem: a 0.2 kg bob on a 1 m string is swung in a vertical circle with 10 m/s at the bottom (g = 10). Find the tension at the bottom and at the top. Principle: dynamics at each point plus v_top² = v_bottom² − 4gr. Steps: T_bottom = mg + mv²/r = 2 + 0.2 × 100/1 = 22 N. v_top² = 100 − 40 = 60; T_top = mv²/r − mg = 12 − 2 = 10 N. Answer: 22 N and 10 N (difference 12 N = 6mg ✓). Reasoning: the string stays taut comfortably since T_top > 0. Mistake to avoid: writing T_top = mg − mv²/r — at the top gravity points toward the centre and ADDS to tension's duty.

Practice Questions — Self-Test Set
• Instructions: attempt all eight before opening the answer key. Mixed types as in real papers: single-correct (Q1–Q3), multiple-correct (Q4), numerical-response (Q5–Q6), statement-based (Q7–Q8). Each answer in the key names the concept and the misconception it hunts.
• Q1 [Easy • First law] A book rests on a table. The net force on the book is zero because: (a) no forces act on the book (b) its weight and the table's normal force balance (c) friction cancels its weight (d) the book has no mass-worth of force
• Q2 [Easy • Second law with friction] A 5 kg block on a floor is pushed with 30 N; friction opposes with 10 N. The block's acceleration is: (a) 6 m/s² (b) 2 m/s² (c) 4 m/s² (d) 8 m/s²
• Q3 [Moderate • Atwood machine] Masses 2 kg and 6 kg hang from an Atwood machine (g = 10 m/s²). The acceleration of the system is: (a) 2.5 m/s² (b) 5 m/s² (c) 7.5 m/s² (d) 10 m/s²
• Q4 [Moderate • Multiple correct — third law] Which statements about an action–reaction pair are TRUE? (a) They act on the same body (b) They act on different bodies (c) They cancel each other on each body (d) They are equal, opposite and of the same nature
• Q5 [Numerical • Recoil] A 5 kg gun fires a 0.02 kg bullet at 250 m/s. The gun's recoil speed is ___ m/s.
• Q6 [Numerical • Circular motion] A car takes a flat curve of radius 20 m on a road with μ_s = 0.5 (g = 10). The maximum safe speed is ___ m/s.
• Q7 [Statement-based • Static friction] Statement I: the static friction on a resting body always equals μ_s N. Statement II: static friction adjusts its magnitude from 0 up to μ_s N as needed. Choose: (a) both true (b) I true, II false (c) I false, II true (d) both false
• Q8 [Assertion–Reason • Pseudo force/apparent weight] Assertion: a passenger feels heavier when a lift begins accelerating upward. Reason: in the lift's frame a pseudo force acts downward on the passenger, adding to gravity. Choose: (a) both true, reason explains assertion (b) both true, reason does not explain (c) assertion true, reason false (d) assertion false, reason true

▸ Answer Key with Explanations
• A1 — (b). Weight (Earth on book) and normal force (table on book) act on the same body and sum to zero. (a) is the targeted misconception: zero NET force is not zero forces. (c) fails — no friction acts on a book that is not being pushed sideways.
• A2 — (c) 4 m/s². Net force = 30 − 10 = 20 N; a = 20/5 = 4 m/s². Misconception hunted: (a) 6 m/s² ignores friction entirely — the second law wants the NET force.
• A3 — (b) 5 m/s². a = (6 − 2)/(6 + 2) × 10 = 5 m/s². (a) 2.5 comes from dividing by 16 instead of 8 — the denominator is the SUM of the masses.
• A4 — (b) and (d). The pair acts on different bodies, equal and opposite and of the same nature. (a) and (c) are the same misconception in two costumes — if the pair acted on one body and cancelled, no interaction could ever accelerate anything.
• A5 — 1 m/s. Conservation from rest: V = m_bullet × v_bullet/m_gun = 0.02 × 250/5 = 1 m/s. Misconception: dividing momenta the wrong way (bullet speed × mass ratio inverted) gives 2500 m/s absurdities — sanity-check magnitudes.
• A6 — 10 m/s. v_max = √(μ_s g r) = √(0.5 × 10 × 20) = √100 = 10 m/s. Misconception: using μ_k, or inserting the car's mass — it cancels.
• A7 — (c). Statement I is the classic falsehood (μ_s N is only the ceiling); Statement II is the definition of self-adjustment. Concept: limiting versus actual static friction.
• A8 — (a). In the lift frame, pseudo force −mA points down (opposite the upward acceleration), so the floor must push up with m(g + a) — the passenger feels heavier. The ground frame agrees via N − mg = ma. Both true, and the reason is precisely the mechanism.
• Scoring guide: 7–8 = exam-ready for this chapter; 5–6 = strong — revisit the sections named by your misses; below 5 = re-read with this set open, then re-attempt tomorrow.

Chapter Summary and Revision Checklist
• Summary in one breath: Newton's first law defines inertia and the frames where physics is simple; the second law F = dp/dt (ma for constant mass) converts net force into acceleration; the third law pairs forces across two bodies. The FBD ritual — one body, real forces only, ΣF = ma per axis — solves equilibrium, pulleys, wedges and lifts, with the pseudo force −mA as the passport into non-inertial frames. Friction is a self-adjusting contact force capped at μ_s N (kinetic: μ_k N), summarised by tan(repose) = μ_s. Momentum of a system survives every internal interaction; only external impulses change it. Circular motion is the second law aimed at a centre: real forces must supply mv²/r — on flat curves friction volunteers, on banked roads the normal force leans in, and in a vertical circle the string's survival is decided at the top by √(gr) and √(5gr).
• Essential definitions to reproduce verbatim: inertia • Newton's three laws • momentum and impulse • free-body diagram • normal reaction and tension • pseudo force • static/kinetic/limiting friction • angle of friction and angle of repose • centripetal force • conical pendulum.
• Revision checklist: □ I can state all three laws precisely, with the frames clause □ I can draw a clean FBD for any body in this chapter, naming every agent □ I can solve an Atwood machine and a table-plus-hanging-mass system unaided □ I can write the wedge/surface constraint in components □ I can use the pseudo force in a lift or accelerating car, in ONE frame only □ I never write f = μN without first asking whether the body is at rest, at the limit, or sliding □ I can find the angle of repose from μ_s and friction from the angle □ I can conserve momentum component-wise and check KE separately □ I can identify which real force supplies mv²/r in any circular setup □ I can state the √(gr) and √(5gr) conditions and the 6mg tension rule.
• Self-assessment — answer honestly: (1) A frame accelerates rightward. Which way does the pseudo force act on a body inside it? (2) A block rests on a 20° incline with μ_s = 0.5. Does it slide, and what is the friction? (3) For a string-swing vertical circle, what physical event sets the minimum top speed? (4) Why can't action and reaction cancel? (5) On which body does the friction that walks you forward act, and which way does it point? (Answers: (1) leftward — opposite the frame's acceleration. (2) tan 20° ≈ 0.36 < 0.5, so no slide; friction self-adjusts to mg sin 20° up-slope, NOT μ_s N. (3) Tension falling to zero — the string going slack. (4) They act on different bodies; cancellation needs one body. (5) On YOU (from the ground), pointing forward.)
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

            studyNotesCount = 22,

            practiceQuestionCount = 5,

            durationMinutes = 50,

            formulaHighlight = "W = Fs cosθ • W_net = ΔKE = ½mv² − ½mu² • U = mgh • U_spring = ½kx² • P = F·v • e = separation speed ÷ approach speed",

            keyConceptsSummary = "Work: W = F s cosθ — only the component of force along the displacement transfers energy; the sign tells who gains and who loses
Kinetic energy KE = ½mv² — doubling the speed quadruples the energy, and the braking distance with it
Work-energy theorem: the net work of ALL forces equals the change in KE — true for constant and variable forces alike
Work by a variable force is the area under the F–x curve: W = ∫ F dx
Potential energy: ΔU = −W of the conservative force; U = mgh for gravity and U = ½kx² for a spring
Mechanical energy KE + PE is conserved only when conservative forces alone do work; otherwise W_non-conservative = ΔE
Power: P = W/t = F·v — and in collisions momentum is always conserved, kinetic energy only in elastic ones (restitution e grades the bounce)",

            detailedStudyNotes = """

Introduction — Work, Energy and the Bookkeeping of Motion
• Chapters 2 to 4 taught you to track motion moment by moment: position, velocity, force, acceleration. That works, but it is slow — like paying for a month of groceries one coin at a time. This chapter hands you the ledger instead: energy. Track the energy, and you can jump straight from the start of a motion to its end without solving for time at all.
• Here is the promise. A stone falls from a tower: how fast does it land? Newton's laws want acceleration, time, then velocity. Energy bookkeeping wants one line: the height it lost tells you the speed it gained. Same answer, fraction of the work — and in collisions, where forces are violent and unknown, the ledger still balances when force-tracking gives up entirely.
• The cast of this chapter: WORK is how energy gets transferred — a force pushing through a distance, paying energy in or collecting it out. KINETIC ENERGY is the energy a body owns simply by moving. POTENTIAL ENERGY is work stored in a configuration — a height, a stretched spring — waiting to be paid back. POWER is the speed of the whole transaction. And COLLISIONS are where the ledger gets audited hardest.
• DEFINITION — Energy: the capacity of a system to do work, measured in joules (J). Energy is never created or destroyed in any process — it only changes form or changes owner. That single conservation statement is the most powerful accounting rule in physics.
• EXAMPLE — One joule, to feel its size: lifting a small apple (about 100 g) by one metre costs roughly 1 J. A heartbeat spends about 1 J. A speeding cricket ball carries a few hundred joules. A lightning bolt, about a billion. The joule is small; the bookkeeping scales forever.
• A warning before we start, because it shapes everything: in everyday speech "work" means effort, and a person holding a heavy suitcase perfectly still is "working hard". In physics, as the next section shows, that person does exactly ZERO work on the suitcase. Physics words are contracts — read them literally.

Work Done by a Constant Force
• Picture a porter dragging a loaded trolley across a platform, pulling at an upward angle. The trolley moves forward; the pull points partly forward, partly up. Only the forward part of the pull actually moves the load — the upward part just lightens the wheels. Work counts only the part of the force that acts along the displacement.
• DEFINITION — Work done by a constant force: W = F s cosθ, where F is the force magnitude, s is the displacement magnitude, and θ is the angle between the force and the displacement. Equivalently, W = (component of force along displacement) × displacement, and W = F⃗ · s⃗, the scalar (dot) product.
✔ KEY FORMULA — W = F s cosθ. θ = 0° → W = +Fs (full payment in). θ = 90° → W = 0 (no transfer at all). θ = 180° → W = −Fs (full payment out).
• WHY the cosine? Because the component of F along the motion is F cosθ, and the perpendicular component F sinθ can neither speed the body up nor slow it down — it is perpendicular to every step of the journey. Work is the tax a force collects only along the road actually travelled. (Figure 5.4 draws exactly this geometry.)
• Work is a SCALAR — it has a sign but no direction. The sign is the bookkeeping entry: positive work means the force pays energy INTO the body; negative work means the force collects energy OUT of it. The unit is the joule: 1 J = 1 N × 1 m = 1 kg m² s⁻².
• WORKED PATTERN — A force of 20 N acts at 60° to the displacement of a crate that slides 5 m. W = 20 × 5 × cos60° = 100 × 0.5 = 50 J. Notice the cos60° halved the naive answer of 100 J — the angle is never decoration.
• WORKED PATTERN — You lift a 2 kg bag vertically by 3 m at constant speed. Gravity (20 N, pointing down) works against the upward displacement: W_gravity = −mgh = −2 × 10 × 3 = −60 J. Your hand does +60 J. The two cancel — which is why the bag's speed never changed, a fact the work-energy theorem will soon make automatic.
• When SEVERAL forces act, compute each force's work separately and add — work is scalar bookkeeping, so the entries simply sum: W_total = W₁ + W₂ + W₃ + … This total is what the work-energy theorem spends.
• YOUR TURN — You push a box with 50 N horizontally and it slides 8 m. (a) Work by your push? (b) Now you pull the same box with 50 N at 37° above horizontal (cos37° ≈ 0.8) over the same 8 m — work? (Answers: (a) 50 × 8 = 400 J. (b) 50 × 8 × 0.8 = 320 J — the tilt cost you 80 J of useful push.)
⚠ EXAM TRAP — Force applied does NOT mean work done. Carry a suitcase horizontally at steady speed and your upward force does zero work (θ = 90° to the displacement). Push a wall that does not move and s = 0, so W = 0 however hard you strain. Both are favourite one-mark traps.

▸ The Sign of Work — Who Gains, Who Loses
• The sign of work is a direction of payment, and reading it fluently is a core skill. Positive work: the force has a component ALONG the displacement — engines, pushes in the direction of travel, gravity acting on a falling body. The body gains energy.
• Negative work: the force has a component AGAINST the displacement — friction almost always, brakes, air drag, gravity acting on a rising body. The body loses energy; the lost energy leaves as heat, sound or deformation.
• Zero work happens in three disguises, all worth memorising: (1) no displacement — the wall you push; (2) force perpendicular to displacement — the normal reaction on a sliding block, tension in circular motion, the centripetal force at every instant; (3) no force at all — a coasting body in empty space.
• EXAMPLE — A satellite in a circular orbit: gravity pulls it toward Earth, its motion is always sideways to that pull, θ = 90° at every instant, so gravity does zero work — which is exactly why the satellite's speed never changes. Zero work and unchanging speed are the same statement.
• EXAMPLE — A book sliding to rest on a table: friction is the only horizontal force, pointing against the slide, so W_friction = −f × s. Every joule it collects leaves the book's motion and warms the table surface slightly. Negative work is never lost energy — it is energy changing address.
• YOUR TURN — A porter carries a 20 kg suitcase 50 m horizontally at constant height and speed, then sets it down. Work done by gravity over the whole trip? (Answer: zero — on the horizontal leg θ = 90°, and on any up-down pair the entries cancel. Carrying is tiring for muscles, free of charge for gravity.)
⚠ EXAM TRAP — The angle θ is measured between the force vector and the displacement vector, both placed tail to tail — NOT between the force and the surface, and not the angle marked in a diagram by default. Friction opposing motion has θ = 180°, cosθ = −1: students who plug the surface angle lose the sign and the mark.

Kinetic Energy — the Price of Motion
• A moving body can do work when it stops — a hammer drives a nail, a wave lifts a surfer, a braking car heats its discs. That capacity, owned purely because of motion, is kinetic energy. Let us see exactly how it depends on mass and speed.
• DEFINITION — Kinetic energy: KE = ½ m v², the energy a body of mass m possesses by virtue of its speed v. It is a scalar, always zero or positive, measured in joules.
• WHY the ½ and why v squared? Push a body from rest with a constant force F over distance s: W = Fs = mas. Kinematics gives v² = 2as, so as = v²/2 — and the work stored becomes W = m v²/2. The ½ is not a convention; it falls out of v² = u² + 2as. And the square is profound: double the speed and the energy quadruples, because the faster body needs both more force-effect per metre AND travels further while stopping.
• WORKED PATTERN — A 1000 kg car at 20 m/s (72 km/h) carries KE = ½ × 1000 × 400 = 200,000 J = 200 kJ. At 40 m/s it carries 800 kJ — four times, not two. This square law is why braking distances explode with speed (you met it in Chapter 2's stopping distances; now you own the reason).
• Kinetic energy depends on the observer's frame: a passenger's KE is zero in the car's frame and 200 kJ in the road's frame. That is not a contradiction — work and energy are frame-dependent quantities, while the LAWS connecting them (next section) hold in every inertial frame.
• YOUR TURN — A 2 kg ball rolls at 3 m/s. Its kinetic energy? And if it speeds up to 6 m/s? (Answers: ½ × 2 × 9 = 9 J; then ½ × 2 × 36 = 36 J — double the speed, four times the energy, every time.)
★ HIGHLIGHT — KE = ½mv² is the first member of an energy family where the square rules: spring energy ½kx² and rotational energy ½Iω² wear the same shape. When you see ½ × (inertia) × (speed-like quantity)², you are looking at kinetic energy in costume.

The Work-Energy Theorem
• Now the chapter's engine. Everything so far — work as F s cosθ, KE as ½mv² — locks together into one theorem that solves problems in a single line.
• DEFINITION — Work-energy theorem: the net work done by ALL forces acting on a body equals the change in its kinetic energy. W_net = ΔKE = ½ m v² − ½ m u², where u and v are the initial and final speeds.
✔ KEY FORMULA — W_net = ½mv² − ½mu². Include EVERY force in W_net — applied forces, gravity, friction, normal reaction (whose work is usually zero) — or use the resultant force's work; both give the same number.
• WHY it is true (the one-minute proof): for a constant net force, W = F s = m a s, and v² = u² + 2as gives as = (v² − u²)/2, so W = ½mv² − ½mu². The next sections extend the same truth to variable forces — the theorem never breaks, only the integration gets richer.
• The theorem's superpower: it connects speeds at two instants WITHOUT time and WITHOUT the details of the path. No acceleration, no clock — just the total work tallied along the way. When a problem gives distances and forces but never mentions time, it is quietly begging for this theorem.
• WORKED PATTERN — A 2 kg block at rest is pushed by a net force of 10 N over 5 m on a frictionless floor. W_net = 50 J = ½ × 2 × v² − 0, so v² = 50 and v ≈ 7.07 m/s. One line; kinematics would have taken three.
• WORKED PATTERN — Braking by energy: the 1000 kg car at 20 m/s must shed 200 kJ. If friction supplies 5000 N, the stopping distance s satisfies 5000 × s = 200,000, so s = 40 m. Double the speed and the distance quadruples to 160 m — the v² law, now with lives depending on it.
• The theorem also runs backwards: if speeds change and no force accounting explains it, a force was missed — usually friction. In the lab and in exams, ΔKE is the auditor that catches forgotten work.
• YOUR TURN — A net work of 200 J is done on a 4 kg body starting from rest. Final speed? (Answer: 200 = ½ × 4 × v² → v² = 100 → v = 10 m/s.)
⚠ EXAM TRAP — The theorem uses NET work. Students routinely insert the work of ONE force (say, the applied push) and forget friction's negative entry, then wonder why the speed is too large. Also: it connects speed, not velocity — direction changes with no speed change (circular motion) mean ΔKE = 0 and W_net = 0, however busy the forces look.

Work Done by a Variable Force
• Real forces refuse to stay constant: a spring pulls harder the more you stretch it, gravity weakens with altitude, a rocket's thrust fades as fuel burns. The constant-force formula W = Fs cosθ dies here — and calculus performs the rescue, exactly as it did for non-uniform acceleration in Chapter 2.
• Slice the journey into tiny steps. In each small displacement dx the force is nearly constant, so the work in that slice is dW = F(x) dx. Add all slices and the sum becomes an integral — and geometrically, an AREA.
• DEFINITION — Work by a variable force (one-dimensional, force parallel to displacement): W = ∫ F(x) dx between the initial and final positions. On a graph of F against x, the work is the AREA under the curve between those positions.
✔ KEY FORMULA — W = area under the F–x curve. Rectangles and triangles you can count by eye; curves you integrate. (Figure 5.1 shows the shaded area — that area IS the work.)
• WORKED PATTERN (graph) — A force grows steadily from 0 to 10 N as a body moves 4 m. The F–x graph is a triangle: W = ½ × base × height = ½ × 4 × 10 = 20 J. No integral needed — area is area.
• WORKED PATTERN (integral) — A force F = 3x² newtons (x in metres) acts from x = 0 to x = 2 m. W = ∫ 3x² dx = [x³] from 0 to 2 = 8 − 0 = 8 J. Same idea, algebraic costume.
• If the variable force points at an angle, integrate the component: W = ∫ F cosθ dx. If the path is curved or the force is a vector field, the full form is W = ∫ F⃗ · dr⃗ along the path — you will meet it again in electrostatics, where it computes the work of electric forces with the same geometry.
• YOUR TURN — A force F = 2x (newtons) pushes a body from x = 0 to x = 3 m. Work done? (Answer: ∫ 2x dx = [x²] from 0 to 3 = 9 J.)
⚠ EXAM TRAP — Never use the AVERAGE of initial and final force times distance unless the force varies LINEARLY (as with a spring) — for a curve like 3x², the endpoint average (0 + 12)/2 × 2 = 12 J contradicts the true 8 J. When in doubt, integrate or find the area honestly.

▸ The Work-Energy Theorem for a Variable Force
• The theorem survives generalisation untouched — and the proof shows why. With a variable force, Newton's second law gives F = m (dv/dt) = m v (dv/dx). Integrate the work: W = ∫ F dx = ∫ m v dv, from u to v — and out falls ½mv² − ½mu² again.
✔ KEY FORMULA — For ANY net force, constant or variable, along any path: W_net = ∫ F_net dx = ½mv² − ½mu². The theorem is a law, not an approximation.
• Why this matters: it frees you from ever needing the force's time history. Springs, gravity over large heights, drag — if you can tally the work (by area or integral), the speed change is yours.
• WORKED PATTERN — A 1 kg particle starts from rest at x = 0 under a force F = 2x newtons. At x = 3 m the work tallies ∫2x dx = 9 J, so 9 = ½ × 1 × v² and v = √18 ≈ 4.24 m/s. Newton's-law route would need solving a differential equation; the ledger took two lines.
• One honest limitation: the theorem gives SPEEDS, never times or directions. If the question asks "how long", energy alone cannot pay — pair it with momentum or kinematics. Knowing what a tool cannot do is half of mastery.

Potential Energy — Work Stored for Later
• Lift a book onto a shelf and your work does not vanish — it is deposited. Nudge the book off and gravity refunds every joule as kinetic energy on the way down. Energy stored by position or configuration, refundable on demand, is potential energy.
• DEFINITION — Potential energy (PE): the energy stored in a system due to the position or configuration of its parts, defined through the work of a conservative force: ΔU = −W_conservative. Near Earth's surface, gravitational PE is U = mgh, with h measured from a chosen reference level.
✔ KEY FORMULA — U = mgh (gravitational, near Earth) and, in general, U(final) − U(initial) = −(work done by the conservative force). The minus sign is the soul of the definition: when gravity does positive work (falling), PE decreases by the same amount.
• WHY the minus sign? Because PE is a bank account for the force's future work. Gravity paying out +60 J of work must drain the account by 60 J — otherwise energy would double-count. Every sign confusion in this chapter dissolves if you remember: PE change is the NEGATIVE of the conservative force's work.
• The reference level is your free choice — PE itself is not absolute, only PE DIFFERENCES are physical. Set h = 0 at the floor, the tabletop, or the launch point, whichever makes the arithmetic kindest. ME (next sections) depends only on differences, so the choice never changes an answer.
• WORKED PATTERN — A 5 kg mass rests 4 m above your chosen zero. U = 5 × 10 × 4 = 200 J. Lower it to 1 m and U = 50 J; the missing 150 J is exactly the work gravity would do on the way down — account audited.
• PE belongs to the SYSTEM, not the body: gravitational PE belongs to body + Earth together (Earth's pull is one partner in the configuration). Loose language says "the ball's potential energy"; precise language remembers the partnership — it matters when systems change, as in collisions with springs.
• EXAMPLE — Potential energy is everywhere once you look: water behind a dam (gravitational), a drawn bow (elastic), a wound clock spring, food and fuel (chemical), a charged battery (electrical). Civilisation runs on storing work and refunding it later — this section is the theory of every battery ever built.
• YOUR TURN — A 2 kg stone sits on a 45 m cliff edge (take the sea below as zero). Its PE? And the PE if you instead choose the cliff top as zero? (Answers: 2 × 10 × 45 = 900 J; then 0 J — and both are correct, because only the 900 J DIFFERENCE to the sea is physics.)
⚠ EXAM TRAP — U = mgh is a local approximation: it assumes g is constant, fine near Earth's surface. It also needs a STATED reference level in any solution — an answer "PE = 200 J" with no zero defined is an incomplete answer, and examiners know it.

▸ Conservative Forces — the Round-Trip Test
• Not every force keeps a bank account. Gravity and springs do; friction never does. The dividing line is one clean test.
• DEFINITION — Conservative force: a force whose work on a body depends only on the endpoints of the path, not on the route — equivalently, whose work around any closed round trip is exactly zero. Gravity, spring force and electrostatic force are conservative. Friction, air drag and applied pushes are NON-conservative: their work depends on the path (friction grows with every extra metre travelled).
• The round-trip test in action: lift a book and set it back down — gravity's total work is zero, and the PE account is exactly restored. Drag a box around a closed loop on the floor — friction's work is negative on every leg and never refunds. One force banks; the other burns.
• WHY only conservative forces get a PE: PE is a function of position alone. If work depended on the route, the "stored value" at a point would be ambiguous — two arrivals, two balances. Path-independence is precisely what makes a single-valued account U(position) possible.
• Friction's path-dependence, quantified: drag a box 10 m straight, friction collects f × 10. Drag it 10 m out and 10 m back: friction collects f × 20, while gravity on the same trip collects zero. Same endpoints — different bills. That asymmetry is the entire distinction.
★ HIGHLIGHT — Conservative ⇔ work is path-independent ⇔ round-trip work is zero ⇔ a potential energy exists. Four faces of one idea — exam questions rotate among all four phrasings.

Conservation of Mechanical Energy
• Combine the two accounts — kinetic and potential — and, when only conservative forces do work, their sum refuses to change. Motion becomes a currency exchange with a fixed total.
• DEFINITION — Mechanical energy: E = KE + PE = ½mv² + U. Conservation of mechanical energy: if only conservative forces do work, E stays constant throughout the motion: ½mu² + U_initial = ½mv² + U_final.
✔ KEY FORMULA — KE + PE = constant (conservative forces only). Falling: PE converts to KE. Rising: KE converts to PE. The total is the invariant; the split is the story.
• WORKED PATTERN — A stone drops from rest at 20 m. At the ground: mgh = ½mv² → v = √(2 × 10 × 20) = 20 m/s. The mass cancelled — every body falls at this speed from this height (air aside), a fact Chapter 2 earned the slow way and energy gives for free.
• WORKED PATTERN — A ball released from rest at 1.25 m on a smooth curved track: at the bottom, v = √(2 × 10 × 1.25) = √25 = 5 m/s. Smooth matters — friction would levy its tax and break the conservation, which is the next warning.
• When non-conservative forces DO work, the law generalises instead of dying: W_non-conservative = ΔE = E_final − E_initial. Friction's negative work shows up as a smaller final total — the "missing" energy warming the surfaces. Energy is still conserved universally; MECHANICAL energy is conserved only when the tax collectors stay home.
• EXAMPLE — A pendulum is the conservation law you can watch: at the extremes, all PE and no KE (it momentarily stops); at the bottom, all KE and least PE; the total never flickers. Real pendulums decay only because air drag and pivot friction — non-conservative tolls — skim a little each swing.
• YOUR TURN — A stone is thrown straight up at 20 m/s. How high does it rise (g = 10)? (Answer: KE converts fully to PE at the top: ½v² = gh → h = 400/20 = 20 m.)
⚠ EXAM TRAP — "Mechanical energy is conserved" is CONDITIONAL — it fails the moment friction, drag or an external push does work. Stating it unconditionally on a rough-surface problem is the chapter's most expensive sentence. Check the forces before invoking the law.

Potential Energy of a Spring
• A spring is a bank with a quadratic interest rate. Stretch or compress it and the restoring force grows with every millimetre — so the stored work grows faster than the displacement, and that growth has an exact shape.
• DEFINITION — Spring (elastic) potential energy: U = ½ k x², where k is the spring constant (force per unit extension, N/m) and x is the extension or compression from the natural (unstretched) length.
✔ KEY FORMULA — U_spring = ½kx². Derivation in one breath: the force grows linearly from 0 to kx, so its AVERAGE over the stretch is kx/2; work = average force × distance = (kx/2) × x = ½kx². The ½ is the average of a linearly growing force — the same triangle area you met on the F–x graph.
• The formula is blind to sign: stretching by x or compressing by x stores the same ½kx², because x enters squared. The spring does not care which way you deformed it; the bill is identical.
• WORKED PATTERN — A spring with k = 200 N/m is compressed by 0.10 m: U = ½ × 200 × (0.10)² = ½ × 200 × 0.01 = 1 J. A gentler spring, k = 100 N/m stretched 0.20 m: U = ½ × 100 × 0.04 = 2 J.
• The spring force itself: F = −kx (Hooke's law) — the minus sign announces restoration: the force always points back toward the natural length. Its work is W = −ΔU, the conservative-force signature from the PE definition.
• YOUR TURN — A spring of k = 400 N/m is stretched 0.05 m. Stored energy? (Answer: ½ × 400 × 0.0025 = 0.5 J.)
⚠ EXAM TRAP — x is measured from the NATURAL length, not from wherever the spring happens to hang loaded. A vertically hanging spring already stretched by a load starts its x at that load's equilibrium only if the problem says so — read the origin of x before squaring anything.

▸ The Spring in Motion — Energy Changing Costume
• Attach a mass to a spring on a frictionless table, pull it aside, and let go. You have built the purest energy-exchange machine in physics — and Figure 5.2 is its portrait: the PE parabola ½kx², with the mass forever trading between the curve's store and kinetic motion.
• At the extremes (x = ±A): the mass momentarily stops — KE = 0 and U = ½kA², the whole fortune in the bank. At the centre (x = 0): the spring is slack, U = 0, and the speed peaks — the whole fortune is kinetic: ½mv²_max = ½kA², so v_max = A√(k/m).
• WORKED PATTERN — The 1 J spring of the previous section (k = 200 N/m, compressed 0.10 m) launches a 0.5 kg block on a smooth table. Energy converts completely: ½ × 0.5 × v² = 1 J → v² = 4 → v = 2 m/s as it leaves the spring. No forces, no times — one conservation line.
• Between extremes, the split varies smoothly: at displacement x, U = ½kx² and KE = ½k(A² − x²). At x = A/√2 the two accounts hold exactly half each — a favourite checkpoint question.
• EXAMPLE — This exchange is not a toy: car suspensions, pogo sticks, trampolines, and the quartz crystal in every watch all live on spring-energy bookkeeping. Even atoms vibrate like masses on springs — the parabola of Figure 5.2 reappears in molecular physics wearing the same shape.
★ HIGHLIGHT — For any spring-mass system on a smooth surface: total E = ½kA² forever, speed at centre v_max = A√(k/m), and KE at position x is ½k(A² − x²). Three facts; most spring problems are one of them in disguise.

Power — How Fast the Work Gets Done
• Two cranes lift the same load to the same height: one in a minute, one in an hour. Same work — wildly different machines. The difference is not energy but its delivery rate, and that rate has a name.
• DEFINITION — Power: the rate at which work is done (or energy is transferred). Average power: P_avg = W / t. Instantaneous power: P = dW/dt. Unit: the watt, 1 W = 1 J/s. The old imperial unit survives in showrooms: 1 horsepower = 746 W.
✔ KEY FORMULA — P = F⃗ · v⃗ = F v cosθ for a force acting on a body moving at velocity v. At constant velocity against a resistive force, the engine's power feeds the resistance exactly: P = F_resistive × v.
• WHY P = F·v: in a small time dt the body moves dr = v dt, so dW = F · dr = F · v dt, and dividing by dt leaves P = F · v. It is the work formula divided by time — nothing new, everything faster.
• WORKED PATTERN — A crane lifts 500 kg by 20 m in 10 s: W = mgh = 500 × 10 × 20 = 100,000 J, so P = 100,000 / 10 = 10,000 W = 10 kW. The same lift in 100 s needs only 1 kW — power is patience priced in watts.
• WORKED PATTERN — A car cruising at 30 m/s with its engine delivering 60 kW: the driving force is F = P/v = 60,000 / 30 = 2000 N — which at steady speed equals the total resistive force. This is why top speed is a power question: raise v and the same power buys less force.
• EXAMPLE — Power ratings are daily life: a human sustains about 100 W (a bright old bulb), a kettle draws 2000 W, a car engine peaks near 100 kW, a power station outputs near 1000 MW. And your electricity bill counts energy, not power: 1 kilowatt-hour = 1000 W × 3600 s = 3.6 × 10⁶ J — a unit of work wearing a power costume.
• YOUR TURN — (a) A motor does 6000 J of work in 20 s: its power? (b) You (60 kg) run up 3 m of stairs in 5 s: your average power against gravity? (Answers: (a) 300 W. (b) W = 60 × 10 × 3 = 1800 J; P = 1800/5 = 360 W — for those five seconds, you out-powered three humans' worth of cruise output.)
⚠ EXAM TRAP — Kilowatt-hour is ENERGY (power × time), not power — option-writers love the swap. Also, P = Fv gives INSTANTANEOUS power; using average speed in it for an accelerating body quietly breaks the answer. Match the formula to the moment or the interval, deliberately.

Collisions — When Bodies Meet
• Two bodies approach, interact violently for a fraction of a second, and separate (or don't). During the impact the forces are enormous, brief, and usually unknown in detail — force-tracking dies here. But two ledgers still balance: momentum always, and kinetic energy sometimes. This section classifies the meetings; the next computes them.
• The stage: bodies of mass m₁ and m₂ with velocities u₁ and u₂ before, v₁ and v₂ after (one dimension, signs carry direction). External impulses during the brief impact are negligible beside the collision forces, so total momentum is conserved in EVERY collision: m₁u₁ + m₂u₂ = m₁v₁ + m₂v₂.
• DEFINITION — Elastic collision: a collision in which total kinetic energy is ALSO conserved — no energy is diverted to heat, sound or permanent deformation. Ideal gas molecules and near-perfect steel-ball impacts approximate it.
• DEFINITION — Inelastic collision: a collision in which kinetic energy is NOT conserved — some is converted to heat, sound or deformation — while momentum still is. A PERFECTLY (completely) inelastic collision is the extreme: the bodies stick together and move as one, losing the maximum KE that momentum conservation permits.
✔ KEY FORMULA — Momentum conservation (all collisions): m₁u₁ + m₂u₂ = m₁v₁ + m₂v₂. KE conservation (elastic only): ½m₁u₁² + ½m₂u₂² = ½m₁v₁² + ½m₂v₂². Two equations for elastic; one equation plus the sticking condition for perfectly inelastic.
• Why KE leaks in inelastic collisions: during impact the bodies deform; the deformation does not fully spring back, and the unrecovered work becomes internal energy and sound. Momentum survives because it answers to external impulses, which are negligible — energy answers to internal bookkeeping, which is not.
• EXAMPLE — A neutron slowing down in a reactor is collision physics with stakes: bouncing elastically off hydrogen nuclei (nearly equal masses) drains its energy fastest — the equal-mass exchange of the next section, working inside every nuclear reactor's moderator.
★ HIGHLIGHT — In any collision question, write momentum conservation FIRST — it never fails. Then ask the classification question: elastic (use KE too) or inelastic (do not) or perfectly inelastic (they stick — one final velocity). Ninety per cent of collision errors are classification errors, not algebra errors.

▸ Elastic and Inelastic Collisions in One Dimension
• Solving the two conservation equations for an elastic collision gives the standard results — worth deriving once and recognising forever:
✔ KEY FORMULA — Elastic collision: v₁ = [(m₁ − m₂)/(m₁ + m₂)] u₁ + [2m₂/(m₁ + m₂)] u₂ and v₂ = [2m₁/(m₁ + m₂)] u₁ + [(m₂ − m₁)/(m₁ + m₂)] u₂. A shortcut with the same content: in an elastic collision the relative speed of approach equals the relative speed of separation: u₁ − u₂ = v₂ − v₁.
• Special case 1 — equal masses (m₁ = m₂): the formulas collapse to v₁ = u₂ and v₂ = u₁: the bodies EXCHANGE velocities. Hit a stationary twin and you stop dead while it leaves at your speed — Newton's cradle, explained in one line.
• Special case 2 — a light body hits a massive wall (m₂ ≫ m₁, u₂ = 0): v₁ ≈ −u₁ — the light body rebounds at the same speed, the wall keeps the momentum change without visible motion. A ball bouncing off the floor is nearly this.
• Special case 3 — a heavy body hits a light stationary one (m₁ ≫ m₂): v₁ ≈ u₁ (the truck barely notices) and v₂ ≈ 2u₁ — the light body flies off at up to TWICE the heavy body's speed, a result that surprises everyone the first time and powers gravitational slingshots.
• WORKED PATTERN (elastic) — A 1 kg ball at 10 m/s strikes a stationary 3 kg ball elastically. v₁ = [(1 − 3)/4] × 10 = −5 m/s (it rebounds at 5 m/s); v₂ = [2 × 1/4] × 10 = 5 m/s. Audit: momentum after = −5 + 15 = 10 kg m/s ✓; KE after = 12.5 + 37.5 = 50 J = KE before ✓. Figure 5.3 draws this very collision.
• WORKED PATTERN (perfectly inelastic) — A 2 kg cart at 6 m/s hits a stationary 4 kg cart and they couple. One final velocity: v = (2 × 6)/(2 + 4) = 2 m/s. KE before = ½ × 2 × 36 = 36 J; KE after = ½ × 6 × 4 = 12 J — 24 J converted to heat, sound and deformation. Momentum: 12 kg m/s before and after ✓.
• The pattern inside the loss: sticking collisions always lose the KE of the relative motion — the heavier the stationary partner, the larger the fraction lost. When a bullet embeds in a block, typically over 95% of the KE leaves as heat and splinters; the audit is Worked Example 8 below.
• YOUR TURN — Two identical trolleys: one rolls at 4 m/s into the other at rest and they stick. Final speed and fraction of KE lost? (Answers: v = 2 m/s by momentum; KE halves — from ½m(16) to ½(2m)(4), a 50% loss. Equal-mass sticking always costs exactly half the KE.)
⚠ EXAM TRAP — Never apply KE conservation to a collision just because it "looks bouncy". If the problem does not say elastic (or perfectly smooth spheres / no deformation), KE conservation is an assumption you must not smuggle in. And in perfectly inelastic problems, forgetting that BOTH masses move afterward is the classic lost mark.

▸ Coefficient of Restitution — Measuring the Bounce
• Between the perfect springiness of elastic collisions and the dead thud of sticking ones lies a spectrum — and a single number grades where a collision sits on it.
• DEFINITION — Coefficient of restitution: e = (speed of separation) / (speed of approach) = (v₂ − v₁)/(u₁ − u₂) for a one-dimensional collision. e = 1: perfectly elastic. e = 0: perfectly inelastic (no separation at all — the bodies move together). Real collisions live between: 0 < e < 1.
✔ KEY FORMULA — v₂ − v₁ = −e (u₂ − u₁), the restitution form of Newton's experimental law — pair it with momentum conservation to solve any 1D collision without assuming elasticity.
• For a ball bouncing on a fixed floor, e connects heights: dropped from h₁ and rebounding to h₂, e = √(h₂/h₁) — because speeds at the floor scale as √h by energy conservation. Each successive bounce multiplies the height by e².
• WORKED PATTERN — A ball dropped from 1.25 m rebounds to 0.80 m: e = √(0.80/1.25) = √0.64 = 0.8. Its next bounce reaches 0.80 × 0.64 ≈ 0.51 m — the e² decay, visible in any bouncing ball's dying rhythm.
• EXAMPLE — e is a materials fingerprint: steel on steel ≈ 0.9+, a tennis ball on court ≈ 0.75 (the ITF actually specifies bounce tests), a lump of clay ≈ 0. Sports equipment rules are restitution limits in disguise.
• YOUR TURN — Two bodies collide with approach speed 6 m/s and separate at 3 m/s. e? And the collision type? (Answer: e = 3/6 = 0.5 — inelastic, halfway between spring and thud.)
⚠ EXAM TRAP — e is defined with SEPARATION over APPROACH, both as positive speeds along the line of impact. Using signed velocities carelessly — or applying e to the velocities relative to the ground instead of relative to each other — inverts or corrupts it. Compute relative speeds first, then divide.

Formula Sheet — One-Glance Recap
✔ KEY FORMULA — Work (constant force): W = F s cosθ = F⃗ · s⃗ • Work (variable force): W = ∫ F dx = area under the F–x curve • Net work: W_net = sum of the works of all forces.
✔ KEY FORMULA — Kinetic energy: KE = ½mv² • Work-energy theorem: W_net = ½mv² − ½mu², for constant AND variable forces.
✔ KEY FORMULA — Potential energy: ΔU = −W_conservative • Gravitational: U = mgh • Spring: U = ½kx², with F_spring = −kx.
✔ KEY FORMULA — Mechanical energy: E = KE + U • Conservation: E constant when only conservative forces work • With friction and friends: W_non-conservative = ΔE.
✔ KEY FORMULA — Power: P_avg = W/t • Instantaneous: P = dW/dt = F⃗ · v⃗ = Fv cosθ • 1 hp = 746 W • 1 kWh = 3.6 × 10⁶ J.
✔ KEY FORMULA — Collisions: momentum m₁u₁ + m₂u₂ = m₁v₁ + m₂v₂ always • Elastic adds KE conservation and u₁ − u₂ = v₂ − v₁ • Perfectly inelastic: v_common = (m₁u₁ + m₂u₂)/(m₁ + m₂) • Restitution: e = separation speed ÷ approach speed; bounce heights multiply by e².
• Elastic-collision results: v₁ = [(m₁ − m₂)u₁ + 2m₂u₂]/(m₁ + m₂) • v₂ = [2m₁u₁ + (m₂ − m₁)u₂]/(m₁ + m₂) • Equal masses exchange velocities • Spring-mass: E = ½kA², v_max = A√(k/m), KE(x) = ½k(A² − x²).

Common Mistakes and Exam Traps
• Mistake 1 — "A force was applied, so work was done." Why wrong: work needs displacement along the force — pushing an immovable wall and carrying a suitcase horizontally both score exactly zero for the obvious force. Correct principle: check s and cosθ before claiming any work.
• Mistake 2 — Using one force's work in the work-energy theorem. Why wrong: the theorem spends NET work; omitting friction's negative entry inflates every speed. Correct principle: list every force, tally every work, then apply W_net = ΔKE.
• Mistake 3 — Conserving mechanical energy on rough surfaces. Why wrong: friction is non-conservative and skims energy into heat; E falls by exactly |W_friction|. Correct principle: on rough paths use W_nc = ΔE, and reserve KE + PE = constant for conservative-only motion.
• Mistake 4 — Conserving KE in every collision. Why wrong: KE survives only in elastic collisions; sticking collisions lose the maximum possible. Correct principle: momentum always, KE only when the problem certifies elastic.
• Mistake 5 — Sign chaos with gravity's work and PE. Why wrong: rising bodies gain PE while gravity does negative work; the two statements are one fact — ΔU = −W_gravity. Correct principle: decide the account first (work OR energy change), never mix both signs in one line.
• Mistake 6 — Averaging a non-linear force. Why wrong: (F_initial + F_final)/2 × s equals the area only for linear variation; for F = 3x² it overstates the true integral by half again (12 J vs 8 J). Correct principle: linear → triangle or average is legal; curved → integrate.
• Mistake 7 — Measuring spring x from the wrong origin. Why wrong: U = ½kx² counts deformation from the NATURAL length; a hanging spring's loaded position is not x = 0 unless defined so. Correct principle: locate the unstretched position before squaring.
• Mistake 8 — Treating the kilowatt-hour as power. Why wrong: kWh = power × time = energy, the thing bills charge for. Correct principle: watts measure rate; joules (or kWh) measure amount. Units are the first audit — run it on every option.
⚠ EXAM TRAP — The chapter's named traps, collected: doubling speed quadruples KE and braking distance • a light body can leave a heavy-body collision at up to 2u₁ • equal-mass sticking always destroys exactly half the KE • centripetal force does zero work while changing everything about the direction.

Worked Examples — Basic to Challenging
• EXAMPLE 1 (Work at an angle). Problem: a sledge is pulled with a force of 100 N at 30° above horizontal over 20 m of level snow. Find the work done by the pull. Given: F = 100 N, θ = 30°, s = 20 m. Principle: W = Fs cosθ. Steps: W = 100 × 20 × cos30° = 2000 × 0.866 = 1732 J. Answer: about 1.73 × 10³ J. Reasoning: only the horizontal component 86.6 N earns; the vertical component merely unloads the runners. Mistake to avoid: using sin30° (the component perpendicular to travel) — cos belongs to the component ALONG the displacement.
• EXAMPLE 2 (Work-energy theorem). Problem: a 1200 kg car accelerates from 10 m/s to 20 m/s. Find the net work done on it. Given: m = 1200 kg, u = 10, v = 20 m/s. Principle: W_net = ΔKE. Steps: ΔKE = ½ × 1200 × (20² − 10²) = 600 × (400 − 100) = 600 × 300 = 180,000 J. Answer: 1.8 × 10⁵ J. Reasoning: no distance or time was given — the theorem neither needs nor wants them. Mistake to avoid: computing ½m(v − u)² = 600 × 100 = 60,000 J; the theorem subtracts the SQUARES, never squares the difference.
• EXAMPLE 3 (Variable force). Problem: a force F = (4x + 2) N pushes a body along the x-axis from x = 1 m to x = 3 m. Find the work. Given: F(x) = 4x + 2. Principle: W = ∫ F dx. Steps: W = [2x² + 2x] evaluated from 1 to 3 = (18 + 6) − (2 + 2) = 24 − 4 = 20 J. Answer: 20 J. Reasoning: the integral is the F–x area — a trapezium here, whose area (average height (6 + 14)/2 = 10 N over width 2 m) confirms 20 J by geometry. Mistake to avoid: W = F × s with F evaluated at one endpoint — at x = 3 that invents 28 J.
• EXAMPLE 4 (Conservation of energy). Problem: a block slides from rest down a frictionless track from a height of 5 m. Find its speed (a) at the bottom, (b) at a height of 2 m. Given: h = 5 m, g = 10 m/s². Principle: KE + PE constant. Steps: (a) mgh = ½mv² → v = √(2 × 10 × 5) = 10 m/s. (b) The drop is 3 m: v = √(2 × 10 × 3) = √60 ≈ 7.75 m/s. Answers: 10 m/s and about 7.75 m/s. Reasoning: only the VERTICAL DROP matters — the track's shape is irrelevant on a smooth surface, which is the conservation law's great labour-saving secret. Mistake to avoid: using the slope length as h; PE answers to height alone.
• EXAMPLE 5 (Spring energy, vertical launch). Problem: a spring of k = 500 N/m is compressed 0.20 m and launches a 0.10 kg ball vertically. How high does the ball rise? Given: k = 500, x = 0.20 m, m = 0.10 kg. Principle: spring PE → gravitational PE. Steps: U_spring = ½ × 500 × (0.20)² = ½ × 500 × 0.04 = 10 J. Set mgh = 10: h = 10/(0.10 × 10) = 10 m. Answer: 10 m above the launch point. Reasoning: two banks, one transfer — no force analysis of the violent launch was needed. Mistake to avoid: adding the 0.20 m compression to h or subtracting it carelessly; h is measured from where the ball leaves the spring, as the problem defines.
• EXAMPLE 6 (Power). Problem: a pump lifts 1000 kg of water through 10 m in one minute. Find its average power. Given: m = 1000 kg, h = 10 m, t = 60 s. Principle: P = W/t = mgh/t. Steps: W = 1000 × 10 × 10 = 100,000 J; P = 100,000/60 ≈ 1667 W. Answer: about 1.67 kW. Reasoning: the useful output is purely gravitational PE per second. Mistake to avoid: dividing by 1 (the "one minute" read as one second) — time units are silent mark-thieves; convert to seconds first.
• EXAMPLE 7 (Elastic collision). Problem: a 2 kg ball moving at 6 m/s strikes a stationary 1 kg ball elastically. Find both final velocities. Given: m₁ = 2, u₁ = 6; m₂ = 1, u₂ = 0. Principle: momentum + KE conservation, or the standard formulas. Steps: v₁ = [(2 − 1)/3] × 6 = 2 m/s; v₂ = [2 × 2/3] × 6 = 8 m/s. Audit: momentum 4 + 8 = 12 ✓ (before: 12); KE after = ½ × 2 × 4 + ½ × 1 × 64 = 4 + 32 = 36 J ✓ (before: 36 J). Answer: 2 m/s and 8 m/s. Reasoning: the light ball leaves FASTER than the incoming ball — legal, because the heavy ball keeps most of the momentum with little speed. Mistake to avoid: assuming the striker stops (that is the equal-mass case only).
• EXAMPLE 8 (Perfectly inelastic collision). Problem: a bullet of 0.020 kg travelling at 400 m/s embeds in a stationary 1.98 kg wooden block. Find the block's speed and the KE lost. Given: m = 0.020, u = 400; M = 1.98 kg. Principle: momentum conservation; then audit KE. Steps: v = (0.020 × 400)/(2.00) = 8/2 = 4 m/s. KE before = ½ × 0.020 × 400² = 1600 J; KE after = ½ × 2.00 × 16 = 16 J; lost = 1584 J, about 99%. Answer: 4 m/s; 1584 J converted to heat, sound and deformation. Reasoning: the bullet's energy mostly never had a chance — the mass ratio (1:100) guarantees near-total KE loss, which is exactly why ballistic pendulums measure momentum, not energy. Mistake to avoid: applying KE conservation here — the embedding is the definition of perfectly inelastic.

Practice Questions — Self-Test Set
• Instructions: attempt all eight before opening the answer key. Types: single-correct (Q1–Q4), multiple-correct (Q5), numerical-response (Q6), statement-based (Q7) and a collision audit (Q8). Difficulty, concept and the targeted misconception are declared with each answer.
• Q1 [Easy • Zero work] A body moves once around a circle at constant speed. The net work done on it is: (a) positive (b) negative (c) zero (d) proportional to the radius
• Q2 [Easy • KE scaling] A body's kinetic energy is 50 J when its speed is v. When its speed becomes 2v, the kinetic energy is: (a) 100 J (b) 200 J (c) 150 J (d) 400 J
• Q3 [Easy • Spring PE] A spring of constant 400 N/m is stretched by 0.05 m. The stored potential energy is: (a) 1 J (b) 0.25 J (c) 0.5 J (d) 2 J
• Q4 [Medium • Work-energy theorem] A net force of 25 N acts over 8 m on a 5 kg body initially at rest (friction already included in the net force). The final speed is about: (a) 4 m/s (b) 8.9 m/s (c) 20 m/s (d) 6.3 m/s
• Q5 [Medium • Multiple correct — falling body] A stone falls freely under gravity alone (no air resistance). Which statements are TRUE? (a) its KE increases (b) its PE decreases (c) its mechanical energy stays constant (d) its momentum stays constant
• Q6 [Numerical • Stopping distance] An 800 kg car travelling at 15 m/s brakes with a constant friction force of 6000 N. The stopping distance is ___ m.
• Q7 [Statement-based • Power] Statement I: P = Fv gives the instantaneous power of a force. Statement II: the kilowatt-hour is a unit of power. Choose: (a) both true (b) I false, II true (c) I true, II false (d) both false
• Q8 [Medium • Inelastic collision audit] A 3 kg body moving at 8 m/s collides and sticks to a stationary 1 kg body. The fraction of the initial KE lost is: (a) 0% (b) 25% (c) 50% (d) 75%

▸ Answer Key with Explanations
• A1 — (c) zero. The speed never changes, so ΔKE = 0 and by the work-energy theorem W_net = 0; directly, the centripetal force is perpendicular to the motion at every instant. Concept: zero work. Misconception targeted: "a force acts, so work must be done."
• A2 — (b) 200 J. KE ∝ v²: doubling v multiplies KE by 4: 50 × 4 = 200 J. Option (a) is the linear-thinking trap. Concept: the square law of kinetic energy.
• A3 — (c) 0.5 J. U = ½kx² = ½ × 400 × (0.05)² = 200 × 0.0025 = 0.5 J. Option (a) forgets the ½; option (d) forgets to square x properly. Concept: spring PE.
• A4 — (b) about 8.9 m/s. W_net = 25 × 8 = 200 J = ½ × 5 × v² → v² = 80 → v ≈ 8.94 m/s. Option (d) 6.3 m/s uses v² = 40 (work halved by mistake); option (c) treats 200 J as ½v² with m forgotten. Concept: work-energy theorem with net force.
• A5 — (a), (b) and (c). Falling converts PE to KE at a constant total (gravity is conservative); momentum grows steadily because gravity is an unbalanced external force — momentum conservation needs an isolated system, and a lone falling stone is not one. Concept: conservation laws and their conditions. Misconception: "everything is conserved in free fall."
• A6 — 15 m. KE = ½ × 800 × 15² = 90,000 J; friction's work Fs must absorb it: s = 90,000/6000 = 15 m. Concept: energy audit of braking. Misconception: reaching for kinematic equations without a known deceleration.
• A7 — (c). Statement I is true: with v the instantaneous velocity, P = F · v is the instantaneous rate of working. Statement II is false: the kilowatt-hour is power × time — a unit of ENERGY (3.6 × 10⁶ J). Concept: power versus energy units.
• A8 — (b) 25%. Common velocity: v = (3 × 8)/4 = 6 m/s. KE before = ½ × 3 × 64 = 96 J; KE after = ½ × 4 × 36 = 72 J; lost fraction = 24/96 = 25%. Concept: KE audit of a sticking collision. Misconception: the famous 50% figure belongs to EQUAL masses; mass ratio sets the fraction.
• Scoring guide: 7–8 = exam-ready for this chapter; 5–6 = strong — revisit the sections named by your misses; below 5 = re-read with this set open, then re-attempt tomorrow.

Summary and Revision Checklist
• Summary in one paragraph: Work transfers energy — Fs cosθ for constant forces, the F–x area for variable ones. The work-energy theorem equates net work to the change in ½mv² for any force history. Conservative forces bank their work as potential energy (mgh for gravity, ½kx² for springs), and when they alone act, KE + PE is constant; non-conservative work is the tax that changes the total. Power prices the rate of it all, P = F · v. In collisions momentum always survives; KE survives only in elastic meetings, graded by the coefficient of restitution.
• Essential definitions to reproduce verbatim: work of a constant force • kinetic energy • work-energy theorem • potential energy and ΔU = −W • conservative force (round-trip test) • mechanical energy and its conservation condition • power, average and instantaneous • elastic, inelastic and perfectly inelastic collisions • coefficient of restitution.
• Frequently confused pairs — say the difference aloud: work versus energy (transfer versus store) • power versus energy (rate versus amount) • conservative versus non-conservative (path test) • elastic versus perfectly inelastic (KE kept versus bodies stuck) • momentum conservation (always in collisions) versus KE conservation (elastic only).
• Revision checklist: □ I can compute work at any angle and state its sign physically □ I can derive KE = ½mv² from Fs and v² = u² + 2as □ I can apply W_net = ΔKE including friction's entry □ I can find work from an F–x graph or an integral □ I can state when ME is conserved and repair the law with W_nc = ΔE when it is not □ I can use ½kx² and find v_max = A√(k/m) □ I can switch between P = W/t and P = Fv fluently □ I can classify a collision before computing it □ I can use e and the e² bounce decay.
• Self-assessment — answer honestly: (1) Why does the centripetal force do no work on a circling body? (2) A block slides down a ROUGH incline: write the correct energy law. (3) Two identical balls, one moving at 8 m/s, collide head-on elastically with the second at rest: describe the outcome in words. (4) An engine's power is fixed and a car's speed doubles: what happens to the driving force available? (Answers: (1) it is perpendicular to every displacement, cos90° = 0; (2) W_friction = ΔE, i.e. KE + PE falls by the friction work; (3) they exchange velocities — the first stops, the second leaves at 8 m/s; (4) F = P/v halves.) If any answer stalls, revisit: (1) the sign-of-work section, (2) conservation of mechanical energy, (3) the collision section, (4) power.
★ HIGHLIGHT — The chapter in one sentence: energy is the ledger, work is the transfer, power is the rate — and every problem in this chapter is bookkeeping with the correct account, the correct sign, and the correct conservation condition.
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

            studyNotesCount = 22,

            practiceQuestionCount = 6,

            durationMinutes = 60,

            formulaHighlight = "R_cm = Σmᵢrᵢ/M • τ = r × F • L = r × p = Iω • I = I_cm + Md² • KE = ½Iω² • v_cm = ωR",

            keyConceptsSummary = "Centre of mass R_cm = (Σ mᵢ rᵢ)/M moves like a single particle of mass M under the net external force
Total momentum of a system P = M V_cm is conserved whenever the net external force is zero
Cross product |a × b| = ab sinθ with the right-hand rule — torque and angular momentum are built from it
τ = r × F = dL/dt; angular momentum L = r × p = Iω is conserved when the net external torque is zero
Moment of inertia I = Σ mᵢ rᵢ² depends on the mass distribution and the axis; radius of gyration K = √(I/M)
Parallel axis theorem I = I_cm + Md²; perpendicular axis theorem I_z = I_x + I_y for planar bodies
Rolling without slipping: v_cm = ωR, KE = ½Mv²(1 + K²/R²) — sphere beats disc beats ring down an incline",

            detailedStudyNotes = """

Introduction — One Point That Speaks for the Whole System
• Until now every object was a point. Real objects are crowds: a thrown wrench tumbles, a planet spins while it orbits, a car wheel translates while it rotates. This chapter gives you the two master keys for all such motion — the centre of mass, which handles the translation of the whole crowd, and rotation about an axis, which handles the spin.
• DEFINITION — System of particles: a collection of particles whose motions may influence one another through internal forces, while external forces act on the system from outside. Internal forces cancel in pairs; only external forces can move the system as a whole.
• DEFINITION — Rigid body: an idealised body in which the distance between any two particles never changes, however strong the applied forces. No real body is perfectly rigid, but for metals and solids in ordinary mechanics the approximation is superb — and it is what makes fixed-axis rotation analysable at all.
• The grand strategy of the chapter, in one line: ANY motion of a rigid body = translation of its centre of mass + rotation about the centre of mass. Master the two pieces separately and every tumbling, rolling, spinning problem decomposes into pieces you already own.
• Watch for the parallel structure as you read: force ↔ torque, mass ↔ moment of inertia, momentum ↔ angular momentum, F = ma ↔ τ = Iα. Rotational mechanics is translational mechanics wearing a new alphabet — this chapter teaches you the alphabet.
• EXAMPLE — A cricket ball bowled with seam movement: its centre of mass obeys the projectile parabola of Chapter 3 exactly, while the ball simultaneously spins about that moving centre. Two simple motions, added — never one complicated one. (Fig. 6.1 ahead shows the COM of a flat body being located.)

Centre of Mass — the Balance Point of a System
• Rest a metre scale on one fingertip and slide it until it balances: your finger is under its centre of mass. Every system, however irregular, owns exactly one such point — the point that behaves as if the entire mass were concentrated there.
• DEFINITION — Centre of mass (COM): the point whose position vector is the mass-weighted average of the positions of all particles, R_cm = (Σ mᵢ rᵢ) ÷ (Σ mᵢ) = (1/M) Σ mᵢ rᵢ, where M is the total mass. Component-wise: X_cm = (Σ mᵢ xᵢ)/M, and similarly for Y and Z.
• WHY the weighting works: a particle twice as heavy pulls the average twice as hard towards itself, exactly as a heavier child drags a seesaw's balance point towards their side. The formula is a tug-of-war in which mass is strength.
• Two particles first, because everything generalises from them: for masses m₁ and m₂ separated by distance d, the COM lies on the line joining them, at distance m₂d/(m₁ + m₂) from m₁ and m₁d/(m₁ + m₂) from m₂. Notice the inversion — the COM sits CLOSER to the heavier mass, in the inverse ratio of the masses.
• EXAMPLE — An 80 kg adult and a 20 kg child sit 4 m apart on a seesaw plank. The COM of the pair lies 20 × 4/100 = 0.8 m from the adult — the fulcrum goes there, not at the midpoint, and the plank balances.
• WORKED PATTERN — Masses 1 kg, 2 kg and 3 kg sit at x = 0, 2 m and 6 m on a line. X_cm = (1×0 + 2×2 + 3×6)/6 = 22/6 ≈ 3.67 m. Method: multiply, add, divide by total mass — the same rhythm every single time.
• YOUR TURN — Masses 2 kg at x = 0 and 6 kg at x = 4 m: where is the COM? (Answer: X_cm = 24/8 = 3 m — three quarters of the way towards the heavier mass, exactly as the inverse ratio promises.)

▸ Centre of Mass of Standard Bodies
• For a continuous body the sum becomes an integral: X_cm = (1/M) ∫ x dm, with dm the mass of a thin slice at position x. You rarely integrate in the exam — instead you use symmetry plus a small table of standard results.
• The symmetry principle does half the work free: if a body has a plane, axis or point of symmetry, the COM lies on it. Uniform rod → its midpoint. Ring and disc → the geometric centre. Sphere → its centre. Always spend five seconds on symmetry before any calculation.
★ HIGHLIGHT — The COM need not lie inside the material: a ring's COM is at its centre, where there is no matter at all. COM is an average position, not a piece of the body — boomerangs and hollow hemispheres exploit this.
• The standard results table — quantity, then COM measured from the centre of the full circle unless stated: Uniform rod → L/2 from either end • Semicircular wire (thin arc) → 2R/π ≈ 0.64R along the axis of symmetry • Semicircular disc (flat half-plate) → 4R/(3π) ≈ 0.42R • Solid hemisphere → 3R/8 = 0.375R • Hollow hemisphere (thin shell) → R/2 • Solid cone → h/4 above the base (that is, 3h/4 from the apex) • Hollow cone → h/3 above the base.
• EXAMPLE — Notice the pattern in the numbers: the semicircular DISC (0.42R) keeps more of its area near the diameter than the semicircular WIRE (0.64R), whose mass all lives out on the arc. COM questions are often pure "where is the mass concentrated" intuition wearing these constants.
• YOUR TURN — A solid hemisphere of radius 12 cm rests on its flat face. How high is its COM above the table? (Answer: 3R/8 = 3 × 12/8 = 4.5 cm.)

▸ Centre of Mass with a Piece Removed — the Negative-Mass Trick
• Cut a hole in a disc and the COM crawls away from the hole. The professional method treats the removed piece as NEGATIVE mass sitting in an intact body: compute the COM of (full body) + (hole with negative mass), and the geometry does the rest.
✔ KEY FORMULA — For a body of mass M with COM at X, from which a piece of mass m with COM at x is removed: X_new = (MX − mx) ÷ (M − m). For uniform plates, masses may be replaced by areas — density cancels.
• WORKED PATTERN — A uniform disc of radius 10 cm has a circular hole of radius 4 cm punched in it, the hole's centre 6 cm from the disc's centre. Shift of the remaining COM = r²d/(R² − r²) = (16 × 6)/(100 − 16) = 96/84 ≈ 1.14 cm, on the OPPOSITE side of the centre from the hole. The minus sign in the method is what pushes it backwards.
• WHY opposite? Removing mass from the right is like ADDING negative mass on the right — the average position is dragged left, away from the missing piece. If your answer ever shifts TOWARDS a hole, you have dropped the sign.
• YOUR TURN — Disc radius 6 cm, hole radius 2 cm with centre 3 cm from the disc centre. Shift? (Answer: (4 × 3)/(36 − 4) = 12/32 = 0.375 cm, away from the hole.)
⚠ EXAM TRAP — The negative-mass trick needs the ORIGINAL body's COM and the REMOVED piece's COM, both measured in the same coordinate system, and masses proportional to area only for uniform thickness and density. Mixing coordinate origins mid-problem is the standard way this method goes wrong.

Motion of the Centre of Mass
• Differentiate the COM definition once and the crowd's motion organises itself. Each particle may zigzag wildly, but the COM moves with majestic simplicity.
✔ KEY FORMULA — Velocity of COM: V_cm = (Σ mᵢ vᵢ)/M = P_total/M, where P_total is the total linear momentum. Acceleration of COM: A_cm = F_ext/M — only the net EXTERNAL force appears.
• WHY internal forces vanish: every internal force has its Newton's-third-law partner inside the same system, equal and opposite; summed over the system they cancel exactly. The particles can push each other around, but the system cannot lift itself by its own bootstraps.
• The statement A_cm = F_ext/M is Newton's second law promoted to systems: the COM moves exactly as a single particle of mass M would under the net external force. This is the licence for treating planets as points in orbital mechanics.
• EXAMPLE — A firework rocket climbs, then explodes mid-air into a dozen fragments. The fragments scatter on their own parabolas, but their COM continues along the ORIGINAL parabola undisturbed (until fragments hit the ground), because gravity — the only external force — never changed. Exam setters love this picture.
• EXAMPLE — Two skaters on frictionless ice push off each other. Each glides away, speeds in inverse ratio of their masses, but the COM of the pair stays exactly where it was: no external horizontal force acted. Push-off, collision, explosion — internal events never move the COM by themselves.
• YOUR TURN — A 2 kg block moving at 3 m/s and a 4 kg block moving at −1.5 m/s (opposite direction) collide and stick. Velocity of the combined mass? (Answer: V_cm = (2×3 + 4×(−1.5))/6 = 0/6 = 0 — the wreck stands still, however violent the crash.)

Linear Momentum of a System of Particles
• DEFINITION — Linear momentum of a system: the vector sum of the momenta of all its particles, P = Σ pᵢ. The COM machinery compresses this into one identity worth memorising: P = M V_cm.
• That identity is a two-way tool. Read left to right, it computes a system's momentum from its COM motion. Read right to left, it says the momentum of a sprawling system equals that of one fictitious particle carrying all the mass at the COM.
✔ KEY FORMULA — Conservation of linear momentum: if the net external force on a system is zero, P is constant — equivalently, V_cm is constant. If external force acts in only one direction, momentum is conserved in the perpendicular directions separately.
• Distinguish the twins with care: total momentum is conserved whenever F_ext = 0, but kinetic energy is conserved only in elastic events. In a perfectly inelastic collision (objects stick), momentum survives intact while KE takes its maximum possible loss — the COM part of the KE can never be lost, only the relative-motion part can.
• WORKED PATTERN — A 60 kg man walks 3 m along a 120 kg boat floating on still water (ignore water resistance). The COM cannot move, so the boat slides the other way: boat shift = (60 × 3)/(60 + 120) = 1 m, and the man's ground displacement is 3 − 1 = 2 m. Check the balance: 60 × 2 = 120 × 1 ✓ — mass × ground-shift matches on both sides.
• EXAMPLE — Recoil is this law with a trigger: the gun's backward momentum equals the bullet-and-gases' forward momentum, because the explosion's forces were internal to the gun + bullet system.
⚠ EXAM TRAP — Conservation of momentum needs zero net EXTERNAL impulse, not zero external force at every instant in every direction, and it is a VECTOR law. Gravity blocks vertical conservation for a projectile, but horizontal momentum is still conserved — decompose before you declare it dead.

Vector Product of Two Vectors — the Cross Product
• Rotation needs a product that outputs a vector pointing along an axis. That product is the cross product, and torque, angular momentum and angular velocity are all built from it — learn it properly here and the rest of the chapter is arithmetic.
• DEFINITION — Vector (cross) product: a × b is a vector of magnitude ab sinθ, where θ is the smaller angle between a and b placed tail to tail; its direction is perpendicular to the plane of a and b, given by the right-hand rule — curl the fingers of your right hand from a towards b and your thumb points along a × b.
• The property list that runs the chapter: a × b = −(b × a) (order matters — swapping flips the sign) • a × a = 0 • parallel vectors have zero cross product • the product distributes over addition • for unit vectors, î × ĵ = k̂, ĵ × k̂ = î, k̂ × î = ĵ, and reversing any pair flips the sign.
• Magnitude with meaning: |a × b| equals the area of the parallelogram built on a and b; half of it is the area of the triangle. Physics translation: torque is |r × F| = rF sinθ — the "area" of the r–F parallelogram measures how much turning leverage the force really has.
• In components, the determinant pattern: a × b = (a₂b₃ − a₃b₂) î + (a₃b₁ − a₁b₃) ĵ + (a₁b₂ − a₂b₁) k̂. Each component is a little 2 × 2 difference — cyclic and systematic, never memorised as six random terms.
• EXAMPLE — Push a door: your force and the door's position vector from the hinge are nearly perpendicular when you push properly (sinθ ≈ 1, maximum cross product). Push along the door towards the hinge and sinθ collapses — the cross product has been telling you this since childhood.
• YOUR TURN — |a| = 2, |b| = 5, angle between them 30°. Find |a × b|. (Answer: 2 × 5 × sin30° = 5, directed perpendicular to both.)
⚠ EXAM TRAP — The angle in ab sinθ is measured between the vectors when placed TAIL TO TAIL, and it is the smaller angle (0 to 180°). Diagrams that show vectors head-to-tail from addition problems seduce students into using the supplement — sin(180° − θ) = sinθ saves the magnitude, but the right-hand direction flips.

Angular Velocity and Its Relation with Linear Velocity
• A point mass circles; a rigid body rotates. The bridge quantity is angular velocity — one number that describes the rotation of every particle of the body at once.
• DEFINITION — Angular velocity: ω = dθ/dt, the rate of change of angular displacement, measured in rad/s. For a rigid body about a fixed axis, ω is the SAME for every particle — that is the entire advantage of angular language. Its direction lies along the rotation axis by the right-hand rule: fingers curl with the rotation, thumb gives ω.
✔ KEY FORMULA — v = ω × r. For a particle at perpendicular distance r from the axis, the speed is v = ωr — particles farther out move faster, in exact proportion to r. Also ω = 2π/T = 2πn for periodic rotation.
• DEFINITION — Angular acceleration: α = dω/dt = d²θ/dt², in rad/s². The tangential acceleration of a particle is a_t = αr, while its centripetal acceleration is a_c = ω²r = v²/r, aimed at the axis. The total acceleration is the vector sum of the two.
• EXAMPLE — Earth's spin: ω = 2π/86400 ≈ 7.27 × 10⁻⁵ rad/s — tiny. Yet the equator, at r = 6.4 × 10⁶ m, races at v = ωr ≈ 465 m/s, while a point near the pole barely moves. Same ω, wildly different v: that is v = ωr doing its work.
• EXAMPLE — A ceiling fan and a clock's second hand share the formalism: the second hand has ω = 2π/60 ≈ 0.105 rad/s, and the tip of a 10 cm hand moves at just over 1 cm/s. Whenever a problem hands you a period or a frequency in rpm, convert to ω first — rpm × 2π/60 is the gateway move.
• YOUR TURN — A wheel of radius 0.3 m spins at ω = 20 rad/s. Speed of a point on the rim? And of a point halfway out? (Answer: rim v = 20 × 0.3 = 6 m/s; halfway v = 3 m/s. Linear in r, always.)
⚠ EXAM TRAP — v = ωr uses the PERPENDICULAR distance from the axis, not the distance from the origin or from the centre of the body. For a tilted or offset axis, that distinction is the whole question.

Torque — the Cause of Rotational Change
• Force makes masses accelerate; torque makes bodies rotate. But not all of a force counts — only its twist about the axis, and the cross product is the machine that extracts exactly that part.
• DEFINITION — Torque about a point: τ = r × F, where r is the position vector from the reference point to the point of application of F. Magnitude: τ = rF sinθ = F × (perpendicular distance from the axis to the line of action of the force). Unit: N·m.
• Read the formula as two filters: only the component of F perpendicular to r contributes (the radial component pulls along r and cannot twist), and the lever arm is the perpendicular distance, not the raw distance. A force through the axis, or parallel to r, produces exactly zero torque.
• EXAMPLE — Doorcraft: handles sit far from hinges because τ grows with r; you push perpendicular to the door because sinθ must be near 1. A long wrench beats a strong hand on a stubborn nut for the same reason — torque is force × leverage, and leverage is cheaper than strength.
• WORKED PATTERN — A 20 N force applied tangentially at the rim of a wheel of radius 0.25 m: r and F are perpendicular, so τ = rF = 20 × 0.25 = 5 N·m. Now tilt the force until the angle between r and F is only 30°: τ = rF sin30° = half the maximum. The sinθ factor is the tax you pay for pushing at a lazy angle.
• The rotational second law preview: a net torque about a fixed axis produces angular acceleration, τ_net = Iα — derived properly in the dynamics section. And torque is reference-dependent: state your point. About the COM or a fixed axis are the two honest choices in this course.
• YOUR TURN — A 10 N force acts at the end of a 0.5 m spanner. Find the torque (a) when the force is perpendicular to the spanner, (b) when the angle between force and spanner is 30°. (Answers: (a) 10 × 0.5 = 5 N·m. (b) 10 × 0.5 × sin30° = 2.5 N·m — half the force, wasted on geometry.)
⚠ EXAM TRAP — Torque's unit N·m is dimensionally the joule, but torque is NOT energy and is never measured in joules. Same dimensions, different creature — exactly the trap pair warning from Chapter 1, now with teeth.

Angular Momentum and Its Conservation
• If torque is the cause, angular momentum is the quantity it changes — the rotational mirror of p and F = dp/dt, and the chapter's deepest conservation law.
• DEFINITION — Angular momentum of a particle about a point: L = r × p, magnitude L = mvr sinθ = p × (perpendicular distance from the point to the line of motion). For a particle circling a centre, L = mr²ω. For a rigid body about a fixed axis, L = Iω.
• Do not let a circle requirement sneak in: a particle moving in a STRAIGHT line also carries angular momentum about any point off its path, because its perpendicular distance to that point is fixed. Comets and pucks sliding past a post have L about well-chosen points.
✔ KEY FORMULA — τ_ext = dL/dt: the net external torque about a point equals the rate of change of angular momentum about that point — Newton's second law in rotational dress, valid about a fixed point or about the COM.
✔ KEY FORMULA — Conservation of angular momentum: if the net external torque about a point is zero, L about that point stays constant. Central forces (gravity towards the Sun) exert no torque about the centre, which is why a planet's L about the Sun is conserved.
• EXAMPLE — Kepler's second law falls out free: the Sun–planet line sweeps equal areas in equal times because the areal velocity dA/dt = L/2m is constant. Planets hurry near the Sun and dawdle far away, keeping L fixed — conservation written across the sky.
• WORKED PATTERN — The pirouette audit: a skater with I = 4 kg·m² spins at 3 rad/s, then pulls her arms in to I = 2 kg·m². L = Iω = 12 must survive, so ω doubles to 6 rad/s. But her KE goes from 18 J to 36 J — it DOUBLES. Angular momentum is conserved; kinetic energy is not; her muscles pay the difference. This single example defeats three standard traps at once.
• EXAMPLE — A diver leaves the board spinning slowly, tucks to shrink I, somersaults fast, then opens out to grow I and kill the spin before entry. No external torque about the COM (gravity acts AT the COM) — the whole routine is L = constant being stage-managed.
• YOUR TURN — A puck of mass 0.5 kg slides at 4 m/s in a straight line whose closest distance to a fixed post is 0.3 m. What is its angular momentum about the post? (Answer: L = m v d = 0.5 × 4 × 0.3 = 0.6 kg·m²/s — no circle required, only a perpendicular distance.)
⚠ EXAM TRAP — L = Iω and τ = Iα hold about a FIXED AXIS (or through the COM). Applying them about an arbitrary accelerating point is the classic way to manufacture wrong answers that look professional.

Equilibrium of a Rigid Body
• A rigid body at rest must be failing to translate AND failing to rotate — two separate failures, two separate conditions. Most real structures, from bridges to your own forearm, live in this section.
✔ KEY FORMULA — Conditions of equilibrium: Σ F_ext = 0 (no translation) and Σ τ_ext = 0 (no rotation). If ΣF = 0, the net torque is the same about every point, so choose the pivot that kills the most unknown forces.
• DEFINITION — Couple: two equal, opposite, parallel forces acting at different points. A couple has zero net force but a net torque = F × (perpendicular distance between the lines of action), identical about every point — pure rotation with no translation. Turning a steering wheel or a tap is applying a couple.
• DEFINITION — Centre of gravity: the point through which the total weight of the body may be taken to act. In a uniform gravitational field it coincides exactly with the COM — the two names separate only when g varies across the body (tall structures, astrophysics).
• The pivot-choice strategy: take torques about the point where the most unknown forces act (a hinge, a contact point) — those forces get zero lever arm and vanish from the equation, leaving the unknowns you actually want.
• WORKED PATTERN — Seesaw audit: a 30 kg child sits 2 m left of the fulcrum; where must a 40 kg child sit on the right? Balance of torques: 30 × 2 = 40 × x, so x = 1.5 m. g cancelled — equilibrium of torques is a balance of mass × distance whenever only weights act.
• EXAMPLE — A ladder against a wall is held by this section: floor friction balances the wall's push (ΣF = 0), and torques about the floor contact fix the wall's force before friction's limit is tested. Raise the climber and the torque equation tells you exactly when slipping starts.
• YOUR TURN — A couple consists of two 5 N forces whose lines of action are 0.4 m apart. Torque of the couple? (Answer: 5 × 0.4 = 2 N·m, about any point you like.)
⚠ EXAM TRAP — Neither condition alone is equilibrium: a body under a single net force through its COM has zero torque about the COM yet accelerates away, and a body under a pure couple has zero net force yet spins up. Both conditions, always, independently checked.

Moment of Inertia — Mass in Rotational Language
• Push two doors of equal size, one solid oak, one hollow — same geometry, different effort. Rotation resists being hurried, and the measure of that resistance is not mass alone but mass times distance-squared from the axis.
• DEFINITION — Moment of inertia about an axis: I = Σ mᵢ rᵢ², where rᵢ is the PERPENDICULAR distance of particle i from the axis. For a continuous body, I = ∫ r² dm. Unit: kg·m².
• Read the formula's two lessons: mass far from the axis counts quadratically more (double the distance, quadruple the contribution), and I depends on the AXIS as much as on the body — one body owns infinitely many moments of inertia, one per axis. Always ask "about which axis?" before quoting a number.
• DEFINITION — Radius of gyration: the distance K from the axis at which the entire mass, if concentrated at a single point (or thin ring), would give the same I: I = MK², so K = √(I/M). It compresses a whole mass distribution into one length.
• WORKED PATTERN — Point masses 1 kg at 1 m and 2 kg at 2 m from an axis: I = 1 × 1² + 2 × 2² = 9 kg·m². Radius of gyration K = √(9/3) = √3 ≈ 1.73 m — the single distance that represents the spread of this 3 kg system.
• EXAMPLE — Flywheels exploit the r² weighting: mass is pushed to the rim (nearly a ring) so a modest mass stores huge I and steadies the machine's rotation. A solid disc of the same mass and radius would hold only half the I — distribution is destiny.
• YOUR TURN — A ring and a disc share M and R. About the central perpendicular axis, which resists angular acceleration more, and by what factor? (Answer: the ring — I_ring = MR² versus I_disc = ½MR² — exactly twice the resistance.)
⚠ EXAM TRAP — Moment of inertia is NOT a property of the spinning state: it does not depend on ω, α or torque. A flywheel at rest and the same flywheel at full speed have identical I. It is pure geometry-plus-mass.

▸ The Two Axis Theorems
• Nobody integrates in the exam hall for standard bodies — instead, two theorems let you move a known result to a new axis. Together they generate half the reference table from the other half.
✔ KEY FORMULA — Parallel axis theorem: I = I_cm + Md², where d is the distance between the two parallel axes, one of which MUST pass through the COM. Why it works: expanding Σm(r + d)², the cross term 2d Σm r vanishes because Σm r = 0 about the COM — the COM condition is the engine of the proof.
✔ KEY FORMULA — Perpendicular axis theorem: for a FLAT (planar) body, I_z = I_x + I_y, where x and y are axes in the plane and z is perpendicular to the plate through their intersection. Why: every element's distance² from z splits as x² + y², and the two sums are precisely I_y and I_x.
• WORKED PATTERN — The rod doubles itself: rod about a perpendicular axis through its end = ML²/12 + M(L/2)² = ML²/12 + ML²/4 = ML²/3. One theorem, zero integration.
• WORKED PATTERN — The ring finds its diameter: for a ring, I_z (through centre, perpendicular) = MR², and by symmetry I_x = I_y (two diameters), so MR² = 2 I_diameter, giving I_diameter = ½MR². Same move gives the disc's diameter value ¼MR² from its ½MR².
⚠ EXAM TRAP — Two fences: the parallel axis theorem's known value must be the COM value (chaining between two non-COM axes needs two steps via the COM), and the perpendicular axis theorem is for PLANAR bodies only — never apply it to a sphere or a cylinder block.

▸ Moment of Inertia — the Reference Table
• Every entry below carries its derivation hint, because in the exam the hint IS the memory. M = mass, R = radius, L = length throughout.
• THIN ROD, axis perpendicular through centre → ML²/12. Hint: integrate (M/L) x² dx from −L/2 to L/2; the cube of L/2 divided by 3 does it.
• THIN ROD, axis perpendicular through one end → ML²/3. Hint: parallel axis theorem on the centre value.
• RING, axis through centre perpendicular to its plane → MR². Hint: every mass element sits at the same r = R, so I = R² Σm — the only trivial integral in the table.
• RING, axis along a diameter → ½MR². Hint: perpendicular axis theorem, two equal diameters.
• RING, axis tangent and perpendicular to its plane → 2MR². Hint: parallel axis, MR² + MR².
• DISC, axis through centre perpendicular to its plane → ½MR². Hint: build the disc from concentric rings of radius r, mass (2M/R²) r dr; integrating r² dm from 0 to R yields ½MR².
• DISC, axis along a diameter → ¼MR². Hint: perpendicular axis theorem on ½MR², two equal diameters.
• DISC, axis tangent and perpendicular to its plane → (3/2)MR². Hint: parallel axis, ½MR² + MR².
• SOLID SPHERE, axis along a diameter → (2/5)MR². Hint: slice the sphere into thin discs perpendicular to the axis; each disc's radius shrinks as √(R² − x²), and the integration lands on 2/5.
• HOLLOW SPHERE (thin shell), diameter → (2/3)MR². Hint: all mass sits at distance R from the centre, but at varying distances from the axis; averaging sin²θ over the shell gives the 2/3.
• SOLID SPHERE, tangent axis → (7/5)MR². Hint: parallel axis, (2/5)MR² + MR².
• SOLID CYLINDER, its own geometric axis → ½MR². Hint: a cylinder is a stack of discs along the axis — same value as one disc.
• HOLLOW CYLINDER (thin wall), its own axis → MR². Hint: like the ring, all mass at R. (Thick hollow cylinder with inner R₁ and outer R₂: ½M(R₁² + R₂²).)
• RECTANGULAR PLATE a × b, axis perpendicular through centre → (M/12)(a² + b²). Hint: perpendicular axis theorem from the two in-plane values (M/12)b² and (M/12)a².
★ HIGHLIGHT — Radius of gyration quick table: ring K = R • disc K = R/√2 ≈ 0.71R • solid sphere K = √(2/5) R ≈ 0.63R • rod (centre, perpendicular) K = L/√12 ≈ 0.29L. Smaller K for the same M and size means mass huddled near the axis — and a body that wins rolling races.

Kinematics of Rotation About a Fixed Axis
• When α is constant, rotational kinematics is Chapter 2 with every symbol rotated one seat over: x becomes θ, v becomes ω, a becomes α. The equations are not new — they are old friends in new clothes.
✔ KEY FORMULA — The constant-α trio: ω = ω₀ + αt • θ = ω₀t + ½αt² • ω² = ω₀² + 2αθ. And the nth-second mirror: θ in the nth second = ω₀ + (α/2)(2n − 1).
• Sign discipline: choose a positive sense of rotation once (say anticlockwise) and let ω, α and θ carry signs. A wheel spinning clockwise while braking has ω and α of opposite signs — write both with signs and the trio never lies.
• WORKED PATTERN — A flywheel starts from rest with α = 4 rad/s². After 5 s: ω = 0 + 4 × 5 = 20 rad/s, and θ = ½ × 4 × 25 = 50 rad of turning — about 8 full revolutions (50 ÷ 2π ≈ 7.96).
• EXAMPLE — A ceiling fan switched off coasts: ω₀ = 30 rad/s (about 286 rpm), bearing friction gives roughly constant α = −1.5 rad/s²; it stops in 20 s after sweeping θ = 30²/(2 × 1.5) = 300 rad ≈ 48 revolutions. Long coasting is just small α in the ω² equation.
• YOUR TURN — A wheel spins at ω₀ = 10 rad/s and brakes at α = −2 rad/s². Through what angle does it turn before stopping, and how many revolutions is that? (Answer: θ = ω₀²/(2 × 2) = 25 rad; 25 ÷ 2π ≈ 3.98, so just under 4 revolutions.)
⚠ EXAM TRAP — These equations demand CONSTANT α and a FIXED axis, exactly as their linear twins demanded constant a. For variable α, integrate: ω = ω₀ + ∫α dt. Reaching for the trio when α varies with θ or t is the standard failure.

Dynamics of Rotation About a Fixed Axis
• Now marry torque to the kinematics: the fixed-axis law τ = Iα is F = ma after the same change of alphabet, and everything about work and energy follows the translation script line for line.
✔ KEY FORMULA — τ_net = Iα about a fixed axis (or about the COM for a moving body). Rotational kinetic energy: KE = ½ Iω². Derivation in one breath: sum ½ mᵢ vᵢ² over all particles with vᵢ = ωrᵢ, and ½ω² Σ mᵢ rᵢ² is ½ Iω² — the definition of I was built to make this happen.
✔ KEY FORMULA — Work done by a constant torque: W = τθ. Power in rotation: P = τω — the exact mirror of P = Fv. Work–energy theorem: net work on a rotating body = Δ(½ Iω²).
• The translation–rotation dictionary, complete: x ↔ θ • v ↔ ω • a ↔ α • m ↔ I • F ↔ τ • p = mv ↔ L = Iω • KE = ½mv² ↔ ½Iω² • P = Fv ↔ P = τω. A problem you cannot solve in one column is often already solved in the other.
• WORKED PATTERN — A disc of M = 4 kg, R = 0.5 m (I = ½MR² = 0.5 kg·m²) takes a constant torque of 2 N·m from rest. α = τ/I = 4 rad/s²; after 3 s, ω = 12 rad/s; KE = ½ × 0.5 × 144 = 36 J. Three formulas, one unbroken chain.
• EXAMPLE — Power as τω at work: an engine quoted at 200 N·m and 3000 rpm delivers P = 200 × (3000 × 2π/60) ≈ 200 × 314 ≈ 62.8 kW. Gears trade τ against ω at nearly fixed P — the dictionary runs the automobile industry.
• YOUR TURN — A ring of M = 2 kg, R = 0.4 m spins about its central axis at ω = 10 rad/s. Its rotational KE? (Answer: I = MR² = 2 × 0.16 = 0.32 kg·m²; KE = ½ × 0.32 × 100 = 16 J.)
⚠ EXAM TRAP — τ = Iα needs the torque and I about the SAME axis, and for a body that is also translating, that axis must be the fixed axis of rotation or pass through the COM. Mixing an I about the centre with a torque about a rim point manufactures errors silently.

Rolling Motion — Translation and Rotation Together
• A rolling wheel is this chapter's final exam in miniature: the COM translates, the body rotates about the COM, and a single geometric condition welds the two motions together.
• DEFINITION — Rolling without slipping (pure rolling): the contact point of the body is instantaneously at rest relative to the surface. This one statement is equivalent to the rolling condition v_cm = ωR, and differentiating, a_cm = αR.
✔ KEY FORMULA — Total KE of a rolling body: KE = ½ M v_cm² + ½ I_cm ω² = ½ M v² (1 + β), where β = K²/R² with K the radius of gyration about the centre. The roster: solid sphere β = 2/5, solid cylinder or disc β = 1/2, hollow sphere β = 2/3, ring β = 1.
• Velocity map of a rolling wheel — learn it as a picture: contact point speed 0 (instant rest), centre speed v, top point speed 2v. Every point's velocity is its translational v plus its rotational share ω × (distance from centre); at the contact the two cancel exactly.
• Down an incline, gravity's energy pays both bills: v at the bottom from height h is v = √(2gh/(1 + β)), and the acceleration is a = g sinθ/(1 + β). Mass, radius — everything cancels except shape (β). The race order never changes: solid sphere (β = 2/5) beats disc (1/2) beats hollow sphere (2/3) beats ring (1).
• Friction's subtle job: in pure rolling the friction is STATIC and does no work (its point of application is instantaneously at rest), yet on an incline it is indispensable — it supplies the torque about the COM that spins the body up. On an incline it points UP the slope for a body rolling down. Remove it (icy slope) and the body slides without rotating.
• WORKED PATTERN — Disc on a 30° incline, g = 10 m/s²: a = g sin30°/(1 + ½) = 5/1.5 ≈ 3.33 m/s² — compare sliding without friction, 5 m/s². Rolling is always slower down the hill because gravity's work is taxed by rotation.
• YOUR TURN — A solid sphere and a ring start together at the top of the same incline. Which reaches the bottom first, and does doubling the sphere's mass change the result? (Answer: the sphere — β = 2/5 < 1. Mass cancels entirely; a heavier twin finishes in a dead heat with the lighter one.)
⚠ EXAM TRAP — v = ωR is the no-slip CONDITION, not a law of nature: a skidding wheel (v > ωR) or a spinning burnout wheel (ωR > v) breaks it, and then KE is still ½Mv² + ½Iω² but the two terms are independent. Check the problem's wording for "without slipping" before welding them.

High-Yield Formula Sheet
• COM: R_cm = (Σ mᵢ rᵢ)/M • V_cm = P_total/M • A_cm = F_ext/M • P_system = M V_cm • Two-particle COM divides the join in the inverse mass ratio.
✔ KEY FORMULA — τ = r × F, τ = rF sinθ • L = r × p • τ_ext = dL/dt • L = Iω (fixed axis) • L conserved when τ_ext = 0 • Areal velocity = L/2m.
✔ KEY FORMULA — v = ωr • a_t = αr • a_c = ω²r • ω = ω₀ + αt • θ = ω₀t + ½αt² • ω² = ω₀² + 2αθ.
✔ KEY FORMULA — I = Σ mᵢ rᵢ² = ∫ r² dm • K = √(I/M) • Parallel axis: I = I_cm + Md² • Perpendicular axis (planar): I_z = I_x + I_y • τ = Iα • KE_rot = ½Iω² • W = τθ • P = τω.
✔ KEY FORMULA — Rolling: v_cm = ωR • KE = ½Mv²(1 + K²/R²) • a_incline = g sinθ/(1 + K²/R²) • β values: sphere 2/5, disc 1/2, shell 2/3, ring 1.
• Standard COM: semicircular wire 2R/π • semicircular disc 4R/(3π) • solid hemisphere 3R/8 • hollow hemisphere R/2 • solid cone h/4 from base • removed part: X = (MX − mx)/(M − m).
• Standard I: ring MR² • disc ½MR² • rod centre ML²/12 • rod end ML²/3 • solid sphere (2/5)MR² • shell (2/3)MR² • solid cylinder ½MR² • plate (M/12)(a² + b²).

Common Mistakes and Exam Traps
• Mistake 1 — "The COM must lie inside the body, at its geometric centre." Why wrong: the COM is a mass-weighted average position, not a material point — a ring's COM is in empty space, and any non-uniform body's COM leaves the geometric centre. Correct principle: find it by symmetry first, by the weighted-average formula second; never by eyeballing the shape.
• Mistake 2 — "Torque is just force times distance." Why wrong: τ = rF sinθ — the angle and the perpendicular lever arm do real work in the formula; a huge force along r gives zero torque. Correct principle: only the perpendicular component of F about the chosen point twists.
• Mistake 3 — "If angular momentum is conserved, kinetic energy is too." Why wrong: the pirouette doubles the skater's KE while L is untouched; internal forces can do work while exerting no net external torque. Correct principle: L conservation needs τ_ext = 0; KE conservation is a separate, stronger demand — never let one impersonate the other.
• Mistake 4 — "Moment of inertia depends only on the mass." Why wrong: I = Σmr² weights distance quadratically and changes with the axis; the same rod owns ML²/12 and ML²/3 about two standard axes. Correct principle: no axis named, no number quoted — I is a property of mass distribution ABOUT AN AXIS.
• Mistake 5 — "Friction always opposes rolling and wastes its energy." Why wrong: in pure rolling friction is static, acts at an instantaneously stationary point, and does no work; on an incline it points up the slope and is the very agency that creates the rotation. Correct principle: friction opposes relative SLIPPING at the contact, not motion of the body.
• Mistake 6 — "Apply I_z = I_x + I_y to any body." Why wrong: the perpendicular axis theorem lives and dies with planar geometry — distances must split as x² + y² within a lamina. Correct principle: lamina only; for spheres and solids, slice into discs or use the table.
• Mistake 7 — "Use τ = Iα about any convenient point." Why wrong: the law in this simple form holds about a fixed axis or about the COM; about a general accelerating point an extra term appears. Correct principle: fixed axis or COM — pick one, state it, and take both τ and I about it.
• Mistake 8 — "The COM part of kinetic energy can be dissipated in a collision." Why wrong: total momentum conservation pins V_cm when F_ext = 0, so ½M V_cm² is untouchable; only the KE of motion relative to the COM can convert to heat and deformation. Correct principle: split KE into COM motion + relative motion before judging any collision.
⚠ EXAM TRAP — The chapter's named traps, collected: torque measured in joules (never) • COM of a system moving under internal explosion (it does not budge) • ring beating a sphere down an incline (shape β decides, the ring always loses) • angular momentum needing circular motion (straight-line motion carries it too).

Worked Examples — Basic to Challenging
• EXAMPLE 1 (COM on a line). Problem: masses 1 kg, 2 kg, 3 kg are placed at x = 0, 2 m, 6 m. Find the COM. Given: three point masses on the x-axis. Principle: X_cm = (Σ mᵢ xᵢ)/M. Steps: Σ mᵢ xᵢ = 1×0 + 2×2 + 3×6 = 22 kg·m; M = 6 kg; X_cm = 22/6 ≈ 3.67 m. Answer: 3.67 m from the 1 kg mass. Reasoning: the answer must sit between 2 and 6, pulled towards the heavy 3 kg end — it does. Mistake to avoid: the plain average of positions (2.67 m) ignores the mass weighting entirely.
• EXAMPLE 2 (Removed part). Problem: a uniform disc of radius 10 cm has a circular hole of radius 4 cm whose centre is 6 cm from the disc's centre. Find the COM of the remainder, measured from the disc's centre. Given: uniform plate, so masses ∝ areas; original COM at 0. Principle: negative-mass method, X = (M×0 − m x_hole)/(M − m), masses replaced by areas. Steps: shift magnitude = (16 × 6)/(100 − 16) = 96/84 ≈ 1.14 cm. Answer: 1.14 cm from the centre, on the side opposite the hole. Reasoning: removing right-side mass drags the average left. Mistake to avoid: reporting the shift towards the hole — the sign is the physics here.
• EXAMPLE 3 (Explosion and the COM). Problem: a projectile fired with range 40 m (no air resistance) explodes at the top of its trajectory into two equal fragments. One fragment is knocked backwards and lands at the launch point. Where does the other fragment land? Given: equal masses; gravity is the only external force, so the COM must land at 40 m — the point where the unexploded projectile would have landed. Principle: for equal masses, the COM of the two landing positions is their ordinary average. Steps: (0 + x)/2 = 40, so x = 80 m. Answer: the second fragment lands 80 m from the launch point. Reasoning: the explosion is internal — it redistributes the fragments symmetrically about the COM's appointment with the ground. Mistake to avoid: assuming both fragments land near 40 m; the COM lands at 40 m, and the fragments land wherever symmetry about it demands.
• EXAMPLE 4 (Angular momentum without a circle). Problem: a 2 kg particle moves in a straight line at 3 m/s, and its line of motion passes 4 m from a fixed point O. Find its angular momentum about O, and state whether it changes as the particle moves. Given: L = p × perpendicular distance. Steps: L = 2 × 3 × 4 = 24 kg·m²/s. The perpendicular distance from O to the fixed line never changes, so L is constant along the whole motion. Answer: 24 kg·m²/s, constant. Reasoning: r grows and shrinks, θ compensates — only the perpendicular distance matters. Mistake to avoid: writing L = mvr with r as the (changing) distance from O instead of the perpendicular distance to the line.
• EXAMPLE 5 (Conservation of L, audit of KE). Problem: a rigid body rotating freely has I = 4 kg·m² and ω = 3 rad/s. Internal rearrangement reduces I to 2 kg·m². Find the new ω and the change in KE. Given: no external torque about the axis. Principle: L = Iω conserved. Steps: ω₂ = (4 × 3)/2 = 6 rad/s. KE₁ = ½ × 4 × 9 = 18 J; KE₂ = ½ × 2 × 36 = 36 J; ΔKE = +18 J. Answer: ω doubles to 6 rad/s; KE increases by 18 J. Reasoning: the energy is paid by whatever internal agent did the rearrangement (muscles, springs, motors). Mistake to avoid: conserving KE and getting ω₂ = 3√2 — that equation conserves the wrong quantity.
• EXAMPLE 6 (Fixed-axis dynamics). Problem: a uniform disc of mass 2 kg and radius 0.5 m is acted on by a constant torque of 5 N·m about its central perpendicular axis, starting from rest. Find α, and the KE after 2 s. Given: I_disc = ½MR². Steps: I = ½ × 2 × 0.25 = 0.25 kg·m². α = τ/I = 5/0.25 = 20 rad/s². ω(2 s) = 40 rad/s. KE = ½ × 0.25 × 40² = 200 J. Answer: α = 20 rad/s², KE = 200 J. Reasoning: cross-check with work — θ in 2 s = ½αt² = 40 rad, so W = τθ = 5 × 40 = 200 J ✓. Two routes, one answer. Mistake to avoid: using I = MR² (the ring's value) for a disc.
• EXAMPLE 7 (The rolling race). Problem: a solid sphere and a ring, both of the same mass and radius, roll without slipping down from a height of 3.5 m (g = 10 m/s²). Find each speed at the bottom. Given: v = √(2gh/(1 + β)); β_sphere = 2/5, β_ring = 1. Steps: sphere: v = √(2 × 10 × 3.5/1.4) = √50 ≈ 7.07 m/s. Ring: v = √(2 × 10 × 3.5/2) = √35 ≈ 5.92 m/s. Answer: sphere 7.07 m/s, ring 5.92 m/s — the sphere wins without any contest. Reasoning: the ring parks half its energy budget in rotation (β = 1 means rotation takes as much as translation), the sphere only 2/7 of the total. Mistake to avoid: mass or radius cancelling "by luck" — they cancel structurally; quoting them in the answer signals a missed point.

Practice Questions — Self-Test Set
• Instructions: attempt all eight before opening the key. Types: single-correct MCQs (Q1, Q2, Q5, Q6), numerical (Q3, Q4, Q7) and statement-based (Q8). Difficulty and the concept tested are declared with each answer.
• Q1 [Easy • COM in 2D] Masses 1 kg at (0, 0), 2 kg at (3, 0) and 3 kg at (0, 4) (metres). The COM is at: (a) (1, 1) (b) (1, 2) (c) (2, 1) (d) (1.5, 2)
• Q2 [Easy • Standard COM] The COM of a uniform semicircular disc of radius R lies on its axis of symmetry at a distance from the centre equal to: (a) 2R/π (b) 4R/(3π) (c) R/2 (d) 3R/8
• Q3 [Numerical • Cross product] Two vectors have magnitudes 3 and 4 with 60° between them. The magnitude of their cross product is ___
• Q4 [Numerical • Torque] A force of 20 N is applied at the handle of a door, 0.8 m from the hinges, perpendicular to the door. The torque about the hinges is ___ N·m
• Q5 [Medium • Conservation of angular momentum] A person on a frictionless turntable rotates at 4 rad/s holding weights that give total I = 6 kg·m². Pulling the weights in reduces I to 3 kg·m². The new angular speed is: (a) 2 rad/s (b) 4 rad/s (c) 6 rad/s (d) 8 rad/s
• Q6 [Medium • Moment of inertia] A ring and a disc have the same mass M and radius R. About the axis through the centre perpendicular to their planes: (a) I_ring = I_disc (b) I_ring = 2 × I_disc (c) I_disc = 2 × I_ring (d) the ratio depends on M
• Q7 [Numerical • Rotational kinematics] A wheel starting at ω₀ = 10 rad/s decelerates uniformly at 2 rad/s². The angle turned before stopping is ___ rad
• Q8 [Statement-based • Rolling] Statement I: In pure rolling, static friction does no work on the body. Statement II: In pure rolling, the contact point is instantaneously at rest. Choose: (a) both true (b) I true, II false (c) I false, II true (d) both false
• ANSWER KEY — Q1: (b) (1, 2). X = (0 + 6 + 0)/6 = 1; Y = (0 + 0 + 12)/6 = 2. Misconception: averaging the coordinates without mass weights gives (1, 1.33) — the weights are the whole method.
• ANSWER KEY — Q2: (b) 4R/(3π) ≈ 0.42R. Option (a) 2R/π is the semicircular WIRE — the disc-versus-wire swap is the designed trap; (d) 3R/8 belongs to the solid hemisphere.
• ANSWER KEY — Q3: 6√3 ≈ 10.39. |a × b| = 3 × 4 × sin60° = 12 × (√3/2). Misconception: using cos60° (that is the dot product's factor) halves the answer to 6.
• ANSWER KEY — Q4: 16 N·m. τ = rF sin90° = 0.8 × 20 = 16. Misconception: forgetting that only the perpendicular push counts — the same 20 N pushed along the door's surface, straight towards the hinges, produces exactly zero torque.
• ANSWER KEY — Q5: (d) 8 rad/s. L = 6 × 4 = 24 = 3 × ω₂, so ω₂ = 8 rad/s. Misconception: conserving KE instead of L gives about 5.7 rad/s; conserving nothing and guessing lands on (a) or (b).
• ANSWER KEY — Q6: (b). I_ring = MR², I_disc = ½MR² — the ring's mass all sits at R, the disc's is spread inward where r² is smaller. Misconception: (d) — M cancels in the ratio; distribution, not amount, decides.
• ANSWER KEY — Q7: 25 rad. From ω² = ω₀² − 2αθ with final ω = 0: θ = 100/(2 × 2) = 25 rad. Misconception: using θ = ω₀t without first finding t = 5 s is fine (½ × (10 + 0) × 5 = 25 ✓) — but plugging t into θ = ω₀t alone forgets the deceleration and doubles the answer.
• ANSWER KEY — Q8: (a) both true. Statement II is the definition of rolling without slipping, and Statement I follows from it: friction acts at a point with zero instantaneous velocity, so its power F·v is zero at every instant. Misconception: "friction always dissipates energy" — kinetic friction does; static friction at a resting contact does not.
• Scoring guide: 7–8 = exam-ready for this chapter; 5–6 = strong, revisit the sections named by your misses; below 5 = re-read with this set open beside you and re-attempt tomorrow.

Chapter Summary and Revision Checklist
• Summary in one paragraph: A system's COM moves as a single particle of mass M under the net external force, carrying the total momentum P = M V_cm, which is conserved when F_ext = 0. Rotation about a fixed axis mirrors translation through the dictionary x ↔ θ, m ↔ I, F ↔ τ, p ↔ L: torque τ = r × F changes angular momentum L = r × p at the rate τ = dL/dt, and L is conserved when the external torque vanishes. Moment of inertia I = Σmr² — moved between axes by the parallel and perpendicular axis theorems — sets rotational KE ½Iω², and pure rolling welds translation to rotation through v_cm = ωR, splitting energy in the ratio fixed by β = K²/R².
• Essential definitions to reproduce verbatim: centre of mass • rigid body • torque • angular momentum • moment of inertia • radius of gyration • couple • rolling without slipping.
• Must-remember results: semicircular disc COM 4R/(3π) • disc-with-hole shift r²d/(R² − r²) • areal velocity L/2m • I values — ring MR², disc ½MR², rod ML²/12 and ML²/3, sphere (2/5)MR², shell (2/3)MR² • race order sphere, disc, shell, ring.
• Frequently confused pairs — state the difference aloud: COM versus centre of gravity • internal versus external force • angular momentum versus kinetic energy in the pirouette • moment of inertia versus mass • static friction in rolling versus kinetic friction in sliding • diameter value versus central value of I.
• Revision checklist: □ I can locate the COM of discrete masses in 2D without hesitation □ I can run the negative-mass method with the sign right □ I can prove V_cm is unmoved by explosions and collisions □ I can take a cross product by components and by magnitude-direction □ I can derive rod-end and ring-diameter values from the two axis theorems □ I can audit a pirouette problem conserving L, not KE □ I can split rolling KE using β and predict any race □ I can state when τ = Iα is legal and when it is not.
• Self-assessment — answer honestly: (1) A ring's COM is at its centre — but there is no mass there. What exactly is "at" the centre, then? (2) A skater pulls her arms in and her KE rises. Which conservation law survived, and who paid for the energy? (3) Starting from ML²/12, produce the rod's ML²/3 about its end in one line. (4) Two identical discs roll and slide — one rolls without slipping, one slides frictionlessly — down the same incline. Which arrives first, and why does the rolling one "waste" time if friction does no work? (5) A particle flies in a straight line past a point O. Is its angular momentum about O zero, constant, or changing? (Answers: (1) the mass-weighted average position — a property of the distribution, not a piece of matter. (2) Angular momentum; the skater's muscles, doing work against the outward pull as she draws mass inward. (3) ML²/12 + M(L/2)² = ML²/3 by the parallel axis theorem. (4) The sliding disc — all of mgh becomes translation; the rolling disc must share with rotation, and the sharing is enforced by static friction's torque, which transfers energy between the two forms without dissipating any. (5) Constant — L = p × perpendicular distance to the line, and that distance never changes.)
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

            studyNotesCount = 19,

            practiceQuestionCount = 5,

            durationMinutes = 45,

            formulaHighlight = "F = GMm/r² • g = GM/R² • v_e = √(2gR) ≈ 11.2 km/s • v_o = √(GM/r) • E = −GMm/(2r)",

            keyConceptsSummary = "Kepler's laws: elliptical orbits with the Sun at a focus, equal areas in equal times (angular momentum conserved), T² ∝ a³
Newton's law F = GMm/r² — r is always centre to centre; G = 6.67 × 10⁻¹¹ is universal, g is local
Gravitational field E = GM/r² equals g at Earth's surface; fields add as vectors, potentials add as scalars
Above the surface g falls as g/(1 + h/R)²; below it as g(1 − d/R); g is zero at Earth's centre
Potential V = −GM/r and potential energy U = −GMm/r: zero at infinity, negative for every bound system
Escape speed v_e = √(2GM/R) = √(2gR) ≈ 11.2 km/s; orbital speed v_o = √(GM/r); v_e = √2 × v_o
Orbit energies obey KE = +GMm/(2r), PE = −GMm/r, E = −GMm/(2r); binding energy = −E; weightlessness is free fall, not zero gravity",

            detailedStudyNotes = """

Introduction — One Weak Force Runs the Universe
• Here is a strange fact to open with: the weakest force in nature runs the entire universe. Gravity is feeble — a tiny fridge magnet defeats the whole Earth's pull on a paperclip — yet it alone decides the shapes of galaxies, the orbits of planets and the fall of your pen. This chapter is its complete story.
• The plot in one line: Kepler first described HOW planets move (pure pattern, from data), Newton then explained WHY (one universal law), and everything else here — g changing with height, satellites, escape speed — is that one law cashed out in different situations.
• DEFINITION — Gravitation: the universal mutual attraction between any two masses in the universe. Gravity: the special case of that attraction when one of the masses is the Earth (or another celestial body).
• Data we will use all chapter — state it before every calculation, exactly as examiners expect: G = 6.67 × 10⁻¹¹ N m²/kg², mass of Earth M = 6 × 10²⁴ kg, radius of Earth R = 6400 km = 6.4 × 10⁶ m, and g = 10 m/s² for numerical work.
• Roadmap of the chapter: Kepler's laws → Newton's law → the gravitational field → g at, above and below the surface → potential energy and potential → escape speed → satellites and their energy. Each station uses only the ones before it, so read in order.
★ HIGHLIGHT — Almost every gravitation problem is one of three moves in disguise: F = GMm/r² (force), g = GM/r² (field), or energy bookkeeping with U = −GMm/r. Learn to spot which costume the question is wearing.

Kepler's Laws — the Pattern Before the Physics
• Between 1609 and 1619, Johannes Kepler, grinding through Tycho Brahe's obsessively precise naked-eye observations of Mars, extracted three laws that described planetary motion perfectly — without knowing any force behind them. Newton later showed all three are consequences of one inverse-square law. In exams, Kepler gives you ratios; Newton gives you causes.
• DEFINITION — Kepler's first law (law of orbits): every planet moves in an ellipse with the Sun at one of the two foci. Not near a focus, not at the centre — AT one focus; the other focus is empty space.
• DEFINITION — Kepler's second law (law of areas): the line joining a planet to the Sun sweeps out equal areas in equal intervals of time. Consequence: a planet moves fastest at perihelion (closest to the Sun) and slowest at aphelion (farthest), exactly enough to keep the swept area constant (study Fig. 7.1 — the two shaded sectors have equal area).
✔ KEY FORMULA — Second law as angular momentum: areal velocity = (1/2) r² (dθ/dt) = L/(2m) = constant, and at perihelion/aphelion, v_p × r_p = v_a × r_a.
• WHY the second law is really a conservation law: gravity pulls along the line joining planet and Sun, so its torque about the Sun is zero; zero torque means angular momentum L is conserved; and swept area per unit time is L/(2m). One line of reasoning, three chapters connected.
• EXAMPLE — Earth itself obeys it: at perihelion (r = 1.47 × 10¹¹ m, early January) Earth moves at 30.3 km/s; at aphelion (r = 1.52 × 10¹¹ m, early July) it slows to 29.3 km/s. Check: 30.3 × 1.47 ≈ 29.3 × 1.52 ≈ 44.5 — the products match, as the law demands.
• DEFINITION — Kepler's third law (law of periods): the square of a planet's orbital period is proportional to the cube of the semi-major axis of its elliptical orbit, T² ∝ a³. For circular orbits the semi-major axis is simply the radius r.
⚠ EXAM TRAP — For elliptical orbits the third law uses the SEMI-MAJOR AXIS a — not the perihelion distance, not the average of the planet's distance at some instant. For a circle, a = r and the trap disappears.
• YOUR TURN — Mars has a semi-major axis 1.52 times Earth's. Its year is therefore 1.52^(3/2) ≈ 1.87 Earth years. Verify the power: T ∝ a^(3/2), and 1.52^1.5 = 1.87. (Answer: ≈ 1.87 Earth years.)

▸ Kepler's Third Law — Periods from Distances
• The third law is the great ratio machine of this chapter: it compares two orbits around the SAME central body without ever needing G or the body's mass.
✔ KEY FORMULA — Ratio form: (T₁/T₂)² = (r₁/r₂)³, i.e. T ∝ r^(3/2). Double the radius → period grows by 2^(3/2) ≈ 2.83; quadruple the radius → period grows by 8.
• WORKED PATTERN — A satellite skimming Earth's surface (r = R) has period about 84 minutes. A satellite at r = 4R therefore has period 84 × 4^(3/2) = 84 × 8 = 672 minutes ≈ 11.2 hours. No G, no M, one line — this is why examiners love the ratio form.
• Where the constant hides: Newton later proved T² = (4π²/GM) r³, so the proportionality constant 4π²/(GM) is the same for every satellite of one planet but different for different planets — it is a fingerprint of the central mass. Weighing a planet from its moon's period is exactly this formula rearranged.
⚠ EXAM TRAP — The third-law constant is NOT universal: T²/r³ for Earth's satellites differs from T²/r³ for Jupiter's moons, because M differs. Comparing orbits around two different bodies with one constant is a classic wrong move.
• YOUR TURN — Satellite A orbits at r, satellite B at 9r, both around Earth. If A's period is 2 hours, B's period is 2 × 9^(3/2) = 2 × 27 = 54 hours. (Answer: 54 hours.)

Newton's Universal Law of Gravitation
• Newton's leap (1666, published 1687) was not the apple — it was the audacity: the force pulling the apple down and the force holding the Moon up are the SAME force, obeying one law that applies to every pair of masses everywhere. Universal is the operative word.
• DEFINITION — Newton's law of gravitation: every particle attracts every other particle with a force directly proportional to the product of their masses and inversely proportional to the square of the distance between them, acting along the line joining them.
✔ KEY FORMULA — F = G m₁ m₂ / r². The force on each body is equal in magnitude and opposite in direction (Newton's third law pair), and each body is pulled towards the other.
• Why inverse-square matters physically: the influence of a mass spreads over the surface of a growing sphere, whose area grows as r² — so the intensity dilutes as 1/r². Double the distance: force quarters. Ten times the distance: force drops to 1/100.
• The law in vector spirit, without heavy notation: r is measured CENTRE TO CENTRE for spherical bodies. A uniform sphere (and Earth, to good approximation) attracts external objects exactly as if all its mass were concentrated at its centre — Newton's shell theorem, which we will exploit repeatedly.
• Superposition: with several masses present, the force on any one mass is the VECTOR sum of the forces from each other mass, computed pair by pair. Gravity never gets "used up" or blocked by an intervening mass.
• EXAMPLE — Feel how weak it is: two 60 kg students sitting 1 m apart attract each other with F = 6.67 × 10⁻¹¹ × 60 × 60 / 1² ≈ 2.4 × 10⁻⁷ N — utterly unfeelable. Gravity rules the universe not by strength but because it is always attractive, never cancels, and accumulates over astronomical masses.
⚠ EXAM TRAP — F = GMm/r² needs r between CENTRES, not between surfaces. For a satellite at height h above Earth, r = R + h. Using h alone in the denominator is the single most common numerical error in this chapter.
• YOUR TURN — Two spheres of mass 10 kg and 40 kg are 0.5 m apart (centres). F = 6.67 × 10⁻¹¹ × 10 × 40 / 0.25 ≈ 1.07 × 10⁻⁷ N. (Answer: ≈ 1.1 × 10⁻⁷ N, attractive, equal on both spheres.)

▸ The Gravitational Constant — Weighing the Earth
• DEFINITION — The gravitational constant G: the universal constant in Newton's law, G = 6.67 × 10⁻¹¹ N m²/kg². It is the same for every pair of masses, anywhere, at any time — that is what makes Newton's law universal rather than local.
• G is tiny, and that tininess is why Cavendish's 1798 experiment is legendary: he measured the twist of a delicate suspended fibre caused by two known lead spheres attracting two small ones — the first measurement of the force between laboratory masses, and with it, the first value of G.
• WHY Cavendish is called the man who "weighed the Earth": once G is known, g = GM/R² turns inside out to give M = gR²/G. Plug in g = 10 m/s², R = 6.4 × 10⁶ m: M = 10 × (6.4 × 10⁶)² / (6.67 × 10⁻¹¹) ≈ 6.1 × 10²⁴ kg — Earth's mass, measured without leaving its surface.
• Earth's average density falls out of the same algebra: ρ = M / (4/3 π R³) = 3g / (4πGR) ≈ 5.5 × 10³ kg/m³ — about 5.5 times water. Since surface rock is only ~2.7 × 10³ kg/m³, the interior must be far denser: a metal core, deduced from a torsion fibre and arithmetic.
★ HIGHLIGHT — G is universal; g is local. G never changes anywhere in the universe; g changes from planet to planet, and even across one planet's surface. Confusing the capital with the small letter is an error examiners hunt for.
• YOUR TURN — Using M = gR²/G with g = 9.8 m/s² instead of 10: M = 9.8 × (6.4 × 10⁶)² / (6.67 × 10⁻¹¹) ≈ 6.0 × 10²⁴ kg — the accepted value. (Answer: ≈ 6 × 10²⁴ kg.)

Gravitational Field — Gravity Without Touching
• Newton never liked "action at a distance" — how does Earth pull the Moon across empty space? The field idea answers it: a mass fills the space around it with a gravitational field; any other mass placed in that field feels a force. Earth pulls the field's point; the field pulls the Moon.
• DEFINITION — Gravitational field strength (intensity) at a point: the gravitational force experienced by a unit mass placed at that point, E = F/m. It is a vector pointing towards the source mass, with units N/kg — which are the same as m/s².
✔ KEY FORMULA — Field of a point mass (or outside a uniform sphere): E = GM/r², directed towards the mass. Force on a mass m placed there: F = mE = GMm/r² — Newton's law recovered, as it must be.
• The punchline identity: at Earth's surface, E = GM/R² = g. The acceleration due to gravity IS the gravitational field strength of Earth at its surface. Two names, one quantity — which is why N/kg and m/s² are interchangeable here.
• Inside a uniform spherical SHELL the field is exactly zero everywhere (the shell's pulls cancel — shell theorem again), while outside it the shell acts like a point mass at its centre. A hollow planet would have a weightless interior cavity.
• Fields add as vectors (superposition again): the field at a point due to many masses is the vector sum of individual fields. Between two equal masses, the midpoint has zero field — yet, as the next sections show, it does NOT have zero potential. Hold that thought.
• EXAMPLE — The Moon's field at Earth: E = GM_moon/d² ≈ 3.3 × 10⁻⁵ N/kg — tiny, but applied to entire oceans it raises the tides. Fields let you compute such effects point by point instead of wrestling with pairs of bodies.
⚠ EXAM TRAP — Field is a property of SPACE around the source mass: it exists whether or not a test mass is present. The test mass reveals the field; it does not create it (and in the ideal definition it is too small to disturb it).

Acceleration Due to Gravity — g at Earth's Surface
• Now specialise Newton's law to the most familiar stage of all: objects falling near Earth's surface.
• DEFINITION — Acceleration due to gravity g: the acceleration of a freely falling body near Earth's surface, caused by Earth's gravitational pull. All masses fall with the same g at a given place (air resistance aside) because the m in F = ma cancels the m in F = GMm/R².
✔ KEY FORMULA — g = GM/R². With our chapter data: g = (6.67 × 10⁻¹¹ × 6 × 10²⁴) / (6.4 × 10⁶)² ≈ 9.8 m/s² — which is why we adopt g = 10 m/s² for numerical work.
• Read the formula like a story: g grows with the planet's mass (more pull), and falls with the square of its radius (same mass spread over a bigger sphere means a surface farther from the centre). A planet with twice Earth's mass and twice Earth's radius has g = G(2M)/(2R)² = g/2 — the square beats the doubling.
• Two small print items examiners love: (1) Earth is not a perfect sphere — its equatorial radius exceeds the polar radius, so g is slightly larger at the poles; (2) Earth's rotation flings you slightly outward at the equator, reducing effective g there. Both make g smallest at the equator, largest at the poles, by about half a percent — small, but asked.
• Relation to weight: weight W = mg is simply Earth's gravitational force on the body at the surface. Wherever g changes — height, depth, another planet — weight changes, while mass (the body's own matter) does not.
• EXAMPLE — The Moon: M_moon ≈ M/81 and R_moon ≈ R/3.7, so g_moon = g × (1/81) × (3.7)² ≈ g × 0.17 ≈ g/6 ≈ 1.7 m/s². Astronauts' bouncing gait is this fraction made visible.
• YOUR TURN — A planet has mass 4M and radius 2R (Earth values M, R). Its surface g is G(4M)/(2R)² = GM/R² = g itself, 10 m/s². (Answer: unchanged — the ×4 and the ÷4 cancel.)

▸ g Above the Surface and g Below It
• Leave the surface in either direction and g falls — but by DIFFERENT rules, and mixing them up is a chapter classic. Study Fig. 7.2 alongside: inside Earth, g grows linearly from 0 at the centre; outside, it falls as 1/r².
✔ KEY FORMULA — Above the surface, at height h (r = R + h from centre): g_h = GM/(R + h)² = g / (1 + h/R)². For small heights (h ≪ R): g_h ≈ g (1 − 2h/R).
✔ KEY FORMULA — Below the surface, at depth d (r = R − d from centre): g_d = g (1 − d/R) = g (R − d)/R. Only the mass INSIDE radius r still pulls; the shell outside contributes nothing (shell theorem).
• WHY the depth rule is linear: going down, two effects fight — you get closer to the centre (which alone would raise g as 1/r²), but the mass beneath you shrinks as r³ (only the inner sphere counts). The r³ wins: g ∝ r³/r² = r. At Earth's centre, g = 0 exactly.
• The landmark values to memorise: at h = R, g drops to g/4 = 2.5 m/s²; at depth d = R/2, g drops to g/2 = 5 m/s²; at h = R/2, g = g/(1.5)² = 4g/9 ≈ 4.4 m/s². And per equal distance x, g falls FASTER with height than with depth (for small x, height loses 2x/R of g, depth loses only x/R) — a favourite statement-question.
• EXAMPLE — A lift descending a 1280 km mine shaft (a fantasy shaft, d = R/5): g inside = 10 × (1 − 1/5) = 8 m/s², so a 60 kg miner's weight falls from 600 N to 480 N — same miner, same mass, less planet beneath him.
• WORKED PATTERN — "g at height h equals g at depth d; relate h and d" (for small values): g(1 − 2h/R) = g(1 − d/R) gives d = 2h. The exact (non-approximate) version needs the full formulas, but d = 2h is the exam's beloved approximation answer.
⚠ EXAM TRAP — The depth formula assumes Earth has UNIFORM density. Real Earth is denser at the core, so real g actually stays nearly constant (even rises slightly) for the first few hundred km down. The exam tests the uniform-density model — use it, but know it is a model.
• YOUR TURN — At what height does g become g/9? Solve (1 + h/R)² = 9 → 1 + h/R = 3 → h = 2R = 12,800 km. (Answer: 12,800 km above the surface.)

Gravitational Potential Energy and Potential
• Force tells you the push right now; energy tells you the whole journey's account. For gravity the account has a sign convention that confuses everyone once — this section makes it permanent.
• DEFINITION — Gravitational potential energy U of two masses: the work done by an external agent in assembling them from infinite separation, against their mutual attraction, without acceleration. Equivalently, U = −(work done BY gravity in bringing them together from infinity).
✔ KEY FORMULA — U = −GMm/r. The minus sign is physics, not decoration: U is defined as ZERO at r = ∞, and since gravity is attractive, the system LOSES potential energy (goes negative) as the masses approach — a bound system sits in an energy well (Fig. 7.3).
• WHY mgh still works near the ground: expanding the exact result near the surface, U(R + h) − U(R) = GMm[1/R − 1/(R + h)] = GMmh / [R(R + h)] ≈ (GM/R²) mh = mgh when h ≪ R. The school formula is the exact formula's first approximation — with the bonus that the exact one stays valid for satellites, where mgh fails badly.
• DEFINITION — Gravitational potential V at a point: the potential energy per unit mass at that point, V = U/m — the work done bringing a unit mass from infinity to that point. Units: J/kg. It is a SCALAR, so potentials from many masses simply ADD (no directions to resolve).
✔ KEY FORMULA — V = −GM/r for a point mass (outside a sphere). At Earth's surface: V = −GM/R = −gR = −10 × 6.4 × 10⁶ = −6.4 × 10⁷ J/kg.
• Field versus potential, the pair examiners set against each other: field E is a vector, force per unit mass, GM/r²; potential V is a scalar, energy per unit mass, −GM/r. Recall the two-masses midpoint: field zero there (vectors cancel) but potential = −2GM/(d/2) ≠ 0 (scalars add). Different quantities, different cancellation rules.
• EXAMPLE — Lifting a 10 kg satellite mass from the surface to h = R (r = 2R): ΔU = GMm(1/R − 1/2R) = GMm/(2R) = mgR/2 = 10 × 10 × 6.4 × 10⁶ / 2 = 3.2 × 10⁸ J. Note what did NOT appear: mgh with h = 6.4 × 10⁶ m would give 6.4 × 10⁸ J — exactly double, and wrong, because g halves and keeps falling along the way.
⚠ EXAM TRAP — U = −GMm/r uses r from the CENTRE, and U at the surface is −GMm/R, NOT zero. Setting surface potential energy to zero is a choice allowed only in the mgh approximation, never with the exact formula.
• YOUR TURN — Potential at a height R above Earth (r = 2R): V = −GM/(2R) = −3.2 × 10⁷ J/kg, exactly half the surface value. (Answer: −3.2 × 10⁷ J/kg.)

Escape Speed — the Point of No Return
• Throw a ball upward and it returns. Throw it harder and it still returns — but there is a threshold speed at which "returns" becomes "never returns": gravity's grip, weakening as 1/r², can be outrun if the ball keeps enough speed to reach infinity. That threshold is the escape speed, and it is pure energy bookkeeping.
• DEFINITION — Escape speed v_e: the minimum speed with which a body must be projected from a planet so that it escapes the planet's gravitational field and never returns (assuming no atmosphere and no other bodies).
✔ KEY FORMULA — Derivation in one breath: give the body KE = (1/2) m v_e² just enough to climb from U = −GMm/R to U = 0 at infinity, arriving with zero speed. (1/2) m v_e² = GMm/R, so v_e = √(2GM/R) = √(2gR).
• The numbers for Earth: v_e = √(2 × 10 × 6.4 × 10⁶) ≈ 1.13 × 10⁴ m/s ≈ 11.2 km/s (the standard quoted value, using GM/R directly). Notice the projectile's own mass cancelled — escape speed is a property of the planet, not of what you throw: a molecule and a rocket share the same v_e.
• Three examinable consequences: (1) Direction does not matter — v_e is a SPEED; fire at any angle (that misses the planet) and the same threshold applies, because energy is scalar. (2) v_e = √2 × (orbital speed at the same height) — remember the pair together. (3) If a body in orbit is given √2 times its orbital speed, it escapes on the spot.
• WHY the Moon has no atmosphere but Earth keeps hers: gas molecules on the Moon face v_e ≈ 2.3 km/s; thermal speeds of light gases at lunar day temperatures are a fair fraction of that, so over ages the fast tail of molecules escaped, one by one. Earth's v_e of 11.2 km/s is far above molecular thermal speeds — the air stays. Escape speed is quietly an atmosphere-retention criterion.
• EXAMPLE — A projectile fired at 11.2 km/s from Earth still has speed left at infinity equal to zero by construction; fired at 12 km/s, energy conservation leaves it (1/2)m(12² − 11.2²) per unit mass ≈ (1/2)(144 − 125.4) × 10⁶ ≈ 9.3 × 10⁶ J/kg of KE — it coasts away forever at about 4.3 km/s (from (1/2)v² = 9.3 × 10⁶).
⚠ EXAM TRAP — Escape speed does NOT depend on the mass or size of the projected body, and it does not require firing vertically. Options claiming v_e doubles for double mass, or that a horizontal launch needs more speed, are traps.
• YOUR TURN — A planet has the same density as Earth but twice the radius. Its v_e = √(2gR) with g ∝ ρR, so v_e ∝ R: double radius, double escape speed ≈ 22.4 km/s. (Answer: ≈ 22.4 km/s.)

Earth Satellites — Falling Around the Earth
• Newton's own picture explains orbits best: fire a cannonball horizontally from a mountaintop. Faster and faster, its fall curves wider — until its rate of falling matches the curving away of Earth's surface, and it falls forever without landing. An orbit is not the absence of gravity; it is gravity, perfectly employed as the centripetal force. (Fig. 7.4 shows the geometry.)
• DEFINITION — Orbital speed v_o: the speed with which a satellite must move tangentially so that gravity alone supplies exactly the centripetal force for its circular orbit of radius r.
✔ KEY FORMULA — Setting GMm/r² = mv_o²/r gives v_o = √(GM/r). For a low orbit skimming the surface (r ≈ R): v_o = √(gR) = √(10 × 6.4 × 10⁶) = 8000 m/s ≈ 8 km/s (more precisely 7.9 km/s — the famous "first cosmic velocity").
✔ KEY FORMULA — Period of a satellite: T = 2πr/v_o = 2π √(r³/GM) — Kepler's third law again, now with Newton's constant visible. Low orbit: T = 2π√(R/g) ≈ 84 minutes.
• Height's effect, in words the exam loves: higher orbit → weaker gravity → smaller orbital speed (v_o ∝ 1/√r) but LONGER period (T ∝ r^(3/2)). High satellites are slow and late; low satellites are fast and frequent — ISS circles in ~92 minutes, the Moon in 27.3 days.
• WORKED PATTERN — Satellite at height h = R (r = 2R): v_o = √(GM/2R) = 7.9/√2 ≈ 5.6 km/s, and T = 2π(2R)/v_o ≈ 4 hours. One template, two answers — most satellite questions are this pattern with different h.
★ HIGHLIGHT — Gravity at ISS altitude (~400 km) is still about 0.87 g — nearly full strength. Astronauts float NOT because gravity is absent there but because station, crew and tools fall together in the same orbit. Weightlessness is free fall, not zero g (the next section formalises this).
• EXAMPLE — GPS satellites sit at r ≈ 4.2R with a period of about 12 hours — check by the pattern: T = 84 min × (4.2)^(3/2) ≈ 84 × 8.6 ≈ 723 min ≈ 12 hours. The ratio machine confirms the engineering.
⚠ EXAM TRAP — r in every satellite formula is measured from Earth's CENTRE: r = R + h. A "height of 400 km" question that plugs 400 km into v_o = √(GM/r) has already been lost.
• YOUR TURN — How does orbital speed change if a satellite is moved from r to 4r? v_o ∝ 1/√r, so it halves: from 7.9 km/s to about 3.95 km/s at 4R. (Answer: it becomes half.)

▸ Geostationary Satellites and Weightlessness
• DEFINITION — Geostationary satellite: a satellite in a circular orbit in Earth's EQUATORIAL plane, revolving in the same direction as Earth's rotation with period exactly 24 hours (one sidereal day), so it appears fixed over one point of the equator — the backbone of TV broadcast and weather watch.
• Its address is forced by Kepler–Newton: T = 24 h in T = 2π√(r³/GM) gives r ≈ 4.24 × 10⁷ m from the centre, i.e. height h ≈ 3.6 × 10⁷ m ≈ 36,000 km above the surface, and orbital speed v = 2πr/T ≈ 3.1 km/s. There is exactly ONE geostationary ring — every such satellite shares it.
• Conditions checklist (statement questions love these): circular orbit ✓; equatorial plane ✓ (an inclined 24-hour orbit is merely geosynchronous — it traces a figure-eight, not a fixed point); west-to-east direction, same as Earth's spin ✓; period one sidereal day ✓. Miss any one and it is not geostationary.
• DEFINITION — Weightlessness: the state in which a body experiences zero apparent weight — the normal reaction from any supporting surface vanishes — because body and support are in free fall together with the same acceleration. True weight (gravity's force, mg) is still acting; only the FELT weight disappears.
• Where you meet it: an orbiting satellite and everything in it (continuous free fall around Earth); a lift whose cable snaps (brief, terrifying free fall); a projectile at every point of its flight — a thrown ball's contents are weightless all the way up and down. Conversely, apparent weight EXCEEDS mg in a lift accelerating upward, and drops below mg when it accelerates downward — same principle, support no longer matching free fall.
⚠ EXAM TRAP — "Astronauts are weightless because there is no gravity in space" is the misconception this whole topic exists to kill: at orbital heights g is 85–90% of surface value. Weightlessness = free fall, full stop.
• YOUR TURN — A geostationary satellite's period is doubled in a question's fiction — impossible while staying geostationary; what single change would a 48-hour equatorial satellite need? Larger radius: T ∝ r^(3/2) → r grows by 2^(2/3) ≈ 1.59, to about 6.7 × 10⁷ m from the centre. (Answer: it must move to ≈ 1.59 times the geostationary radius, and it would no longer hover over one point.)

Energy of an Orbiting Satellite — Binding Energy
• Force questions ask "how does it move"; energy questions ask "what would it take to change that". For satellites the energy ledger has a beautiful, rigid structure — learn it once and a whole family of questions collapses.
✔ KEY FORMULA — For a satellite of mass m in a circular orbit of radius r: KE = +GMm/(2r) (from (1/2)mv_o² with v_o² = GM/r), PE = −GMm/r, and total energy E = KE + PE = −GMm/(2r).
• Read the structure: PE is exactly twice E, and KE is exactly −E. PE : KE : E = −2 : +1 : −1 in units of GMm/(2r). The orbit is bound BECAUSE E is negative — the satellite sits in the energy well of Fig. 7.3 and cannot climb out without help.
• DEFINITION — Binding energy of a satellite: the minimum energy that must be supplied to free it from its orbit to infinity, equal to −E = +GMm/(2r). It is what a launch vehicle must ultimately provide (over and above reaching the height).
• EXAMPLE — A 100 kg satellite in low orbit (r ≈ R): E = −mgR/2 = −(100 × 10 × 6.4 × 10⁶)/2 = −3.2 × 10⁹ J. Its KE is +3.2 × 10⁹ J, its PE is −6.4 × 10⁹ J, and its binding energy is 3.2 × 10⁹ J — three numbers from one template.
• The satellite-raising paradox, a genuine exam favourite: to move a satellite to a HIGHER orbit (larger r) you must ADD energy (E rises towards zero, e.g. from −3.2 × 10⁹ J to −1.6 × 10⁹ J at 2R for our 100 kg satellite) — yet its orbital speed DECREASES ( KE falls from 3.2 × 10⁹ J to 1.6 × 10⁹ J). The added energy goes more than entirely into PE (+3.2 × 10⁹ J); KE pays part of the bill. Rockets fire to slow down — true, and provable in two lines.
• If instead the satellite LOSES energy (atmospheric drag on low satellites), E falls, r shrinks, and — the second paradox — it speeds UP as it spirals in, because KE = −E grows. Dragged satellites die faster and faster.
★ HIGHLIGHT — One identity rules all circular-orbit energy questions: KE = −E and PE = 2E. Given any one of the three energies, the other two are immediate.
⚠ EXAM TRAP — Total energy of an orbiting satellite is NEGATIVE; of an escaping body, zero or positive. Any solution that ends with a positive total energy for a body claimed to be in a closed orbit has made a sign error.
• YOUR TURN — A satellite's total energy in orbit is −5 × 10⁹ J. Its kinetic energy is +5 × 10⁹ J and its potential energy is −10 × 10⁹ J — and 5 × 10⁹ J must be supplied to free it. (Answer: KE = +5 × 10⁹ J, PE = −1.0 × 10¹⁰ J, binding energy 5 × 10⁹ J.)

Formula Sheet — One-Glance Recap
• Constants and data: G = 6.67 × 10⁻¹¹ N m²/kg² • Earth: M = 6 × 10²⁴ kg, R = 6.4 × 10⁶ m, g = 10 m/s² (9.8 for precision) • always r = R + h, centre to centre.
✔ KEY FORMULA — Newton: F = GMm/r² • Field: E = GM/r², F = mE • Surface gravity: g = GM/R² • Earth mass from g: M = gR²/G • Mean density: ρ = 3g/(4πGR).
✔ KEY FORMULA — Kepler: T² ∝ a³, ratio form (T₁/T₂)² = (r₁/r₂)³ • Areal velocity constant ⇔ v_p r_p = v_a r_a • Newton form: T² = 4π²r³/(GM).
✔ KEY FORMULA — Height: g_h = g/(1 + h/R)², small h: g(1 − 2h/R) • Depth: g_d = g(1 − d/R) • Landmarks: g(R above) = g/4, g(R/2 deep) = g/2, g at centre = 0.
✔ KEY FORMULA — Potential and energy: V = −GM/r • U = −GMm/r • Surface: V = −gR • ΔU near ground ≈ mgh (h ≪ R only).
✔ KEY FORMULA — Escape: v_e = √(2GM/R) = √(2gR) ≈ 11.2 km/s • Orbital: v_o = √(GM/r), at surface √(gR) ≈ 7.9–8 km/s • v_e = √2 v_o at the same r.
✔ KEY FORMULA — Satellite period: T = 2π√(r³/GM) ≈ 84 min at surface • Geostationary: T = 24 h, r ≈ 4.24 × 10⁷ m, h ≈ 36,000 km, v ≈ 3.1 km/s.
✔ KEY FORMULA — Orbit energies: KE = +GMm/(2r), PE = −GMm/r, E = −GMm/(2r) • KE = −E, PE = 2E • Binding energy = +GMm/(2r) = −E.

Common Mistakes and Exam Traps
• Mistake 1 — Plugging the height h where the radius r belongs. Why wrong: every gravitation formula measures distance from Earth's CENTRE; h is only the height above the surface. Correct principle: before any substitution, write r = R + h (above) or r = R − d (below) and use r everywhere.
• Mistake 2 — Using U = mgh for satellites. Why wrong: mgh assumes constant g, valid only for h ≪ R; over orbital distances g falls steeply, and mgh overestimates ΔU (by a factor of 2 at h = R). Correct principle: use U = −GMm/r whenever heights are comparable to R.
• Mistake 3 — Sign slips in orbit energy. Why wrong: PE = −GMm/r is negative, total E = −GMm/(2r) is negative for every bound orbit; a positive E means the body is NOT in a closed orbit. Correct principle: check the final sign — bound ⇒ E < 0; escape threshold ⇒ E = 0.
• Mistake 4 — "Weightlessness means no gravity." Why wrong: at ISS height g ≈ 0.87 g; the crew floats because everything is in free fall together, so no surface pushes back. Correct principle: apparent weight is the normal reaction, and it vanishes in free fall — true weight mg acts throughout.
• Mistake 5 — Swapping the height and depth rules. Why wrong: above the surface g follows an inverse-square law in r; below it (uniform Earth) g falls LINEARLY with depth. Using (1 − d/R) for a height, or 1/r² inside the planet, mixes two different derivations. Correct principle: outside → 1/r²; inside → proportional to r.
• Mistake 6 — Treating Kepler's constant as universal. Why wrong: T²/r³ = 4π²/(GM) depends on the central mass M; Earth's satellites and Jupiter's moons live on different constants. Correct principle: ratios T ∝ r^(3/2) may only compare orbits around the SAME body.
• Mistake 7 — Making escape speed depend on the rocket. Why wrong: m cancels in (1/2)mv_e² = GMm/R; v_e depends only on the planet's M and R (v_e = √(2GM/R) = √(2gR)), and as an energy condition it is direction-independent. Correct principle: v_e is a property of the planet alone.
• Mistake 8 — Cancelling potentials like fields. Why wrong: field is a vector (contributions can cancel, e.g. zero at the midpoint of two equal masses); potential is a scalar (contributions always add, so the same midpoint has V = −4GM/d for separation d, not zero). Correct principle: vectors cancel; scalars accumulate.
⚠ EXAM TRAP — The chapter's three most-set traps, collected: r versus h in satellite formulas • mgh stretched beyond h ≪ R • "no gravity in space" offered as the reason for weightlessness. If an option leans on any of these, it is the trap.

Worked Examples — Basic to Challenging
• EXAMPLE 1 (The Earth–Moon force). Problem: find the gravitational force between Earth and Moon. Given: M = 6 × 10²⁴ kg, M_moon = 7.4 × 10²² kg, centre-to-centre distance d = 3.84 × 10⁸ m. Principle: Newton's law, F = GMm/d². Steps: numerator = 6.67 × 10⁻¹¹ × 6 × 10²⁴ × 7.4 × 10²² = 2.96 × 10³⁷; denominator = (3.84 × 10⁸)² = 1.47 × 10¹⁷. Answer: F ≈ 2.0 × 10²⁰ N — this one force is the Moon's centripetal force and the tides' engine. Mistake to avoid: using the surface-to-surface distance instead of centre-to-centre.
• EXAMPLE 2 (Height for 1% gravity). Problem: at what height does g fall to 1% of its surface value? Given: g_h = g/(1 + h/R)². Principle: invert the height rule. Steps: (1 + h/R)² = 100 → 1 + h/R = 10 → h = 9R. Answer: h = 9 × 6400 = 57,600 km. Reasoning: because the law is inverse-SQUARE, cutting g by 100 needs only 10× the distance — square-root thinking is the shortcut. Mistake to avoid: answering h = 99R by treating the fall as linear.
• EXAMPLE 3 (Height versus depth, head to head). Problem: compare g at a height R/4 above Earth with g at a depth R/4 below. Given: g = 10 m/s², both distances x = R/4. Principle: height uses 1/r²; depth uses the linear rule. Steps: height: g = 10/(1.25)² = 10/1.5625 = 6.4 m/s². Depth: g = 10 × (1 − 0.25) = 7.5 m/s². Answer: 6.4 m/s² above versus 7.5 m/s² below — for the same excursion, depth keeps more gravity. Mistake to avoid: applying one formula to both directions.
• EXAMPLE 4 (Potential energy at the surface). Problem: find the gravitational potential energy of a 2 kg mass resting on Earth's surface, and the potential there. Given: U = −GMm/R and V = U/m, with GM/R = gR = 6.4 × 10⁷ J/kg. Steps: V = −6.4 × 10⁷ J/kg; U = 2 × (−6.4 × 10⁷) = −1.28 × 10⁸ J. Answer: U = −1.28 × 10⁸ J, V = −6.4 × 10⁷ J/kg. Reasoning: the negative sign says the mass is bound — 1.28 × 10⁸ J must be supplied to free this 2 kg to infinity. Mistake to avoid: reporting U = 0 at the surface by habit from mgh problems.
• EXAMPLE 5 (Cost of escape). Problem: what minimum kinetic energy must be given to a 1000 kg spacecraft on Earth's surface to escape Earth's gravity? Given: escape condition (1/2)mv_e² = GMm/R = mgR. Steps: KE = 1000 × 10 × 6.4 × 10⁶ = 6.4 × 10¹⁰ J. Answer: 6.4 × 10¹⁰ J (delivered at v_e ≈ 11.2 km/s). Reasoning: GMm/R is simultaneously the depth of the energy well and the escape fare — one number, two readings. Mistake to avoid: computing (1/2)mv² with v_o = 7.9 km/s instead of v_e — that buys an orbit, not an escape.
• EXAMPLE 6 (Satellite at h = R, full service). Problem: a satellite orbits at height equal to Earth's radius. Find its orbital speed and period. Given: r = 2R = 1.28 × 10⁷ m, v_o = √(GM/r), T = 2πr/v_o. Steps: v_o = √(6.67 × 10⁻¹¹ × 6 × 10²⁴ / 1.28 × 10⁷) = √(3.13 × 10⁷) ≈ 5.6 × 10³ m/s. T = 2π × 1.28 × 10⁷ / 5.6 × 10³ ≈ 1.44 × 10⁴ s ≈ 4 hours. Answers: v_o ≈ 5.6 km/s, T ≈ 4 h. Reasoning: cross-check by ratios from the surface orbit — v falls by √2 (7.9 → 5.6 ✓) and T grows by 2^(3/2) (84 min → 238 min ≈ 4 h ✓). Two routes agreeing is how toppers verify. Mistake to avoid: r = R instead of 2R, which returns the surface values.
• EXAMPLE 7 (Paying to slow down). Problem: how much energy must be supplied to shift a 100 kg satellite from a surface-grazing orbit (r = R) to an orbit at r = 2R? Given: E = −GMm/(2r), and GMm/R = mgR = 6.4 × 10⁹ J for m = 100 kg. Steps: E(R) = −3.2 × 10⁹ J; E(2R) = −1.6 × 10⁹ J; ΔE = +1.6 × 10⁹ J. Answer: 1.6 × 10⁹ J must be ADDED — even though the satellite's orbital speed drops from 7.9 to 5.6 km/s and its KE falls by 1.6 × 10⁹ J, because its PE rises by 3.2 × 10⁹ J. Mistake to avoid: concluding the satellite should LOSE energy because it slows down.
• EXAMPLE 8 (Challenge — placing the geostationary ring). Problem: from T = 24 h alone, find the geostationary radius. Given: T = 2π√(r³/GM), so r³ = GMT²/(4π²); T = 86,400 s, GM = 4.0 × 10¹⁴ m³/s². Steps: T² = 7.46 × 10⁹ s²; GMT² = 2.98 × 10²⁴; divide by 4π² ≈ 39.5 → 7.55 × 10²²; cube root → r ≈ 4.23 × 10⁷ m. Answer: r ≈ 4.24 × 10⁷ m from the centre, height ≈ 36,000 km, and v = 2πr/T ≈ 3.1 km/s. Reasoning: Kepler's third law with Newton's constant exposed IS the satellite-placement formula — the whole telecommunications industry lives in this calculation. Mistake to avoid: reporting the radius 4.24 × 10⁷ m as the HEIGHT — subtract R first.

Practice Questions — Self-Test Set
• Instructions: attempt all eight before opening the answer key. Mixed types as in real papers: single-correct (Q1–Q3), multiple-correct (Q4), numerical-response (Q5, Q7), statement-based (Q6) and assertion–reason (Q8). Data for all questions: G = 6.67 × 10⁻¹¹, M = 6 × 10²⁴ kg, R = 6400 km, g = 10 m/s².
• Q1 [Easy • Variation of g] At a height of 2R above Earth's surface, the value of g becomes: (a) g/3 (b) g/4 (c) g/9 (d) g/6
• Q2 [Easy • Escape versus orbital speed] For a satellite in a low orbit around Earth, the ratio of escape speed to orbital speed at the same height is: (a) 1 (b) √2 (c) 2 (d) 1/√2
• Q3 [Moderate • Kepler's third law] A satellite just above Earth's surface has a period of 84 minutes. The period of a satellite at radius 4R (from the centre) is: (a) 168 min (b) 336 min (c) 672 min (d) 1344 min
• Q4 [Moderate • Multiple correct — satellite energy] For a satellite of mass m in a circular orbit of radius r around Earth (total energy E), which statements are correct? (a) E is negative (b) potential energy equals 2E (c) kinetic energy equals −E (d) binding energy equals −E
• Q5 [Numerical • Depth rule] An 80 kg person weighs 800 N at Earth's surface. Their weight at the bottom of a mine of depth R/4 is ___ N.
• Q6 [Statement-based • Height versus depth] Statement I: for equal small distances, g decreases faster with height than with depth. Statement II: inside a uniform Earth, g at distance r from the centre is proportional to r. Choose: (a) both true (b) I true, II false (c) I false, II true (d) both false
• Q7 [Numerical • Potential energy] The work done in lifting a 5 kg mass from Earth's surface to a height R (against gravity, no KE change) is ___ J.
• Q8 [Assertion–Reason • Geostationary orbit] Assertion: a geostationary satellite must orbit in the equatorial plane. Reason: its angular velocity must match Earth's rotation in both magnitude and direction, which is possible only for a circular orbit centred on Earth's axis in the equatorial plane. Choose: (a) both true, reason explains assertion (b) both true, reason does not explain (c) assertion true, reason false (d) assertion false, reason true

▸ Answer Key with Explanations
• A1 — (c) g/9. At height 2R, r = 3R, so g scales by (R/3R)² = 1/9. Option (b) g/4 is the value at height R — the trap of forgetting r = R + h. Concept: inverse-square height rule. Misconception targeted: using h instead of r.
• A2 — (b) √2. v_e = √(2GM/r) and v_o = √(GM/r) at the same r; the ratio is √2 ≈ 1.41, independent of height and planet. Concept: the escape–orbital pair. Misconception: believing escape needs "double" the orbital speed (option c).
• A3 — (c) 672 min. T ∝ r^(3/2): (4R/R)^(3/2) = 8, so T = 84 × 8 = 672 min. Options (a) and (b) come from using T ∝ r or T ∝ r². Concept: Kepler's third law as a ratio machine.
• A4 — (a), (b), (c) and (d) — all four. E = −GMm/(2r) < 0; PE = −GMm/r = 2E; KE = +GMm/(2r) = −E; freeing the satellite needs −E. Concept: the rigid −2 : +1 : −1 structure of orbit energies. Misconception: expecting at least one statement to be false — the structure really is this tight.
• A5 — 600 N. At depth d = R/4, g' = g(1 − 1/4) = 7.5 m/s², so weight = 80 × 7.5 = 600 N. Concept: linear depth rule; mass unchanged at 80 kg, only g (and hence weight) fell.
• A6 — (a) both true. For small x: height gives g(1 − 2x/R), depth gives g(1 − x/R) — height loses g twice as fast, so I holds; II is the uniform-density result g = (GM/R³) r ∝ r. Concept: comparing the two variation rules.
• A7 — 1.6 × 10⁸ J. ΔU = GMm(1/R − 1/(2R)) = GMm/(2R) = mgR/2 = 5 × 10 × 6.4 × 10⁶ / 2 = 1.6 × 10⁸ J. Using mgh with h = R would double it to 3.2 × 10⁸ J — the exact misconception this question hunts. Concept: exact versus approximate potential energy.
• A8 — (a). A satellite must share Earth's angular velocity VECTOR — same period, same direction, axis aligned — which forces a circular equatorial orbit centred on Earth; the reason states precisely this and therefore explains the assertion. Concept: geostationary conditions.
• Scoring guide: 7–8 = exam-ready for this chapter; 5–6 = strong — revisit the sections named by your misses; below 5 = re-read with this set open beside you, then re-attempt after a day.

Chapter Summary and Revision Checklist
• Summary in one paragraph: Kepler's three laws describe planetary motion — elliptical orbits with the Sun at a focus, equal areas in equal times (angular momentum in disguise), and T² ∝ a³. Newton's F = GMm/r² explains all three and defines a field E = GM/r² whose surface value is g. Above Earth g falls as 1/r²; inside a uniform Earth it falls linearly to zero at the centre. Bound systems carry negative potential energy U = −GMm/r and potential V = −GM/r; supplying GMm/R per mass m at the surface buys escape at v_e = √(2gR) ≈ 11.2 km/s, while v_o = √(GM/r) buys an orbit whose energies obey PE : KE : E = −2 : +1 : −1, with binding energy −E.
• Essential definitions to reproduce verbatim: universal law of gravitation • gravitational field strength • acceleration due to gravity • gravitational potential • potential energy (with its infinity zero) • escape speed • orbital speed • geostationary satellite • weightlessness • binding energy.
• Must-remember formulae: F = GMm/r² • g = GM/R² • g_h = g/(1 + h/R)² • g_d = g(1 − d/R) • V = −GM/r • U = −GMm/r • v_e = √(2GM/R) • v_o = √(GM/r) • T = 2π√(r³/GM) • E = −GMm/(2r) with KE = −E and PE = 2E.
• Frequently confused pairs — say the difference aloud for each: G versus g • force versus field • field (vector, cancels) versus potential (scalar, adds) • height rule versus depth rule • orbital speed versus escape speed • true weight versus apparent weight • radius r versus height h.
• Revision checklist: □ I can state all three Kepler laws and derive the third law's constant from Newton's law □ I can explain Kepler's second law as angular-momentum conservation □ I can compute g at any height and any depth, and sketch g versus r for the whole Earth □ I can derive U = −GMm/r's meaning and use it instead of mgh for large heights □ I can derive v_e and v_o and state their √2 relation □ I can place the geostationary orbit (r, h, v) from T = 24 h □ I can write KE, PE, E for any circular orbit and the binding energy □ I can explain weightlessness as free fall, not zero gravity.
• Self-assessment — answer honestly: (1) Why does a higher satellite move more slowly yet possess greater total energy? (2) What are g and V at Earth's centre (uniform Earth)? (3) A satellite's orbital KE is X joules; what is its binding energy? (4) Why does g fall twice as fast (per metre, near the surface) with height as with depth? (5) If Earth's radius halved at fixed mass, what would happen to g and v_e? (Answers: (1) PE rises by 2 units for every 1 unit KE falls — net E rises towards zero. (2) g = 0; V = −3GM/(2R) = −9.6 × 10⁷ J/kg — field cancels, potential accumulates. (3) Exactly X — binding energy = −E = KE. (4) Height loses g by the inverse-square dilution (factor 2x/R); depth loses only the mass-overhead effect (x/R). (5) g → 4g = 40 m/s² and v_e → √2 × 11.2 ≈ 15.8 km/s.)
• Where to revisit if an answer stalled: (1) satellite energy section (2) field-versus-potential and the depth rule (3) binding energy (4) the g-variation section (5) g = GM/R² and v_e = √(2GM/R). Then send the Chapter 8 syllabus when you are ready — gravity's story continues into solids and fluids.
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

            studyNotesCount = 20,

            practiceQuestionCount = 5,

            durationMinutes = 35,

            formulaHighlight = "Y = FL/(AΔL) • G = FL/(AΔx) • B = −ΔP/(ΔV/V) • Y = 2G(1 + σ) = 3B(1 − 2σ) • U = ½ F ΔL • δ ∝ L³/(bd³)",

            keyConceptsSummary = "Stress = F/A is the internal restoring force per unit area — longitudinal, shearing or hydraulic; strain is the fractional deformation it causes, and is always dimensionless
Hooke's law: stress is proportional to strain up to the proportional limit; their constant ratio is the modulus of elasticity, a property of the material alone, never of the sample's size
The stress–strain curve in order: A proportional limit, B elastic limit, C yield point, D ultimate tensile strength, E fracture point — ductile materials show a long plastic region, brittle materials almost none
Young's modulus Y = FL/(AΔL) governs stretching, shear modulus G governs sliding of layers, bulk modulus B = −ΔP/(ΔV/V) governs squeezing; liquids and gases possess only B
Poisson's ratio σ couples sideways contraction to lengthening and locks the moduli together: Y = 2G(1 + σ), Y = 3B(1 − 2σ) and 9/Y = 3/G + 1/B
Stretching a wire stores elastic potential energy U = ½ F ΔL, with energy density ½ × stress × strain — the factor ½ comes from the force growing linearly from zero
Applications run on stress caps and geometry: crane ropes are sized by permissible stress, girder sag falls as 1/d³ so depth beats material, and rock's elastic limit caps mountains near 10 km",

            detailedStudyNotes = """

Introduction — Why Solids Push Back
• Stretch a rubber band and it pulls back. Squeeze a sponge and it pushes back. Press a steel ruler and it quietly resists with enormous force. This chapter is about that push-back — the hidden strength of solids — and it is far more practical than it looks: every bridge, crane rope, building column and mountain on Earth is designed (or limited) by the rules you are about to learn.
• DEFINITION — Elasticity: the property of a body by virtue of which it opposes any change in its size or shape when a deforming force is applied, and recovers its original size and shape when that force is removed.
• DEFINITION — Deforming force: an external force applied to a body that changes its size, shape, or both.
• WHY do solids push back at all? Picture the atoms of a solid sitting at fixed equilibrium positions, held there by interatomic forces that behave like tiny springs. Push two atoms closer and the spring pushes out; pull them apart and the spring pulls in. Stretch a wire and you are stretching billions of these atomic springs at once — their combined pull is the restoring force you feel.
• EXAMPLE — A spring balance is this chapter in your hand: load it and its internal springs displace until the restoring force exactly balances your load. The pointer stops where push meets push-back.
• The whole chapter runs on two quantities and one law: STRESS (how hard the material is loaded, per unit area), STRAIN (how much it deforms, as a fraction), and HOOKE'S LAW linking them — plus three stiffness constants called moduli.
• YOUR TURN — A plastic scale and a steel scale of the same size are both bent slightly. Which needs the bigger force, and which springs back more completely? (Answer: the steel scale — far stiffer, and within small bends it recovers fully; the plastic one bends easily and may stay slightly bent.)
★ HIGHLIGHT — Elasticity is not about being stretchy. In physics, a MORE elastic material is one that resists deformation more strongly — by that definition steel is far more elastic than rubber. Hold that thought; it is a classic exam trap.

Stress — the Internal Answer to a Deforming Force
• When you pull a wire, the wire does not just submit — inside the material, an internal restoring force develops that opposes your pull. At equilibrium this internal force equals the applied force, and what matters for the material is not the force alone but the force spread over the area carrying it.
• DEFINITION — Stress: the restoring force developed per unit area of the body. In equilibrium, stress = applied force ÷ area, Stress = F/A. SI unit: N/m², called the pascal (Pa). Dimensional formula: [M L⁻¹ T⁻²] — the same as pressure.
• WHY per unit area? Because force alone lies. A 1000 N load is trivial for a thick bridge cable but snaps a sewing thread instantly. Divide by area and the two situations separate cleanly — stress is the load each square metre of material actually feels.
• EXAMPLE — This is why a sharp knife cuts and a blunt one does not: the same hand force concentrated on a microscopic edge area creates a gigantic stress that exceeds what the bread's material can resist. Stress, not force, is what breaks things.
• WORKED PATTERN — An elevator of mass 2000 kg hangs from a steel rope of radius 1 cm. Is the rope comfortable? Area A = π r² = π × (0.01 m)² ≈ 3.14 × 10⁻⁴ m². Load F = mg = 2000 × 10 = 2.0 × 10⁴ N. Stress = F/A ≈ 2.0 × 10⁴ / 3.14 × 10⁻⁴ ≈ 6.4 × 10⁷ Pa. Steel can elastically handle about 3 × 10⁸ Pa — so the rope is working at barely a fifth of its elastic limit. Comfortable indeed.
✔ KEY FORMULA — Stress = F/A, and at equilibrium the internal restoring force equals the applied force. Every modulus in this chapter is built by dividing a stress by its strain.
⚠ EXAM TRAP — Stress is NOT pressure, even though they share units and dimensions. Pressure is an external force per unit area, always compressive and perpendicular; stress is the internal restoring response, and it can be tensile, compressive or tangential. Same costume, different actor.

▸ Three Faces of Stress — Longitudinal, Shearing, Hydraulic
• Stress comes in exactly three costumes, decided by the direction of the force relative to the surface it acts on. Learn to spot which costume a problem is wearing — each one has its own strain and its own modulus.
• DEFINITION — Longitudinal stress: the deforming force acts perpendicular (normal) to the cross-section, pulling it or pushing it. Pulling gives TENSILE stress; pushing gives COMPRESSIVE stress. A stretched wire and a pillar under a roof live here.
• DEFINITION — Shearing (tangential) stress: the deforming force acts parallel (tangential) to the surface, trying to slide one layer of the material over another. Think of pushing the top cover of a thick book sideways while its base stays fixed.
• DEFINITION — Hydraulic stress: the body is immersed in a fluid under pressure, so force acts perpendicularly over its ENTIRE surface from all sides, squeezing its volume. A submarine hull and a deep-sea fish live here. Hydraulic stress is numerically equal to the pressure.
• EXAMPLE — One cube, three fates: pull its opposite faces apart (longitudinal), push its top face sideways (shearing), or sink it to the ocean floor (hydraulic). Same cube, three different stresses, three different deformations — which is why the next section needs three different strains. (The figure below shows all three.)
• YOUR TURN — A rivet joining two plates is pulled sideways by both plates. Which stress acts inside the rivet? (Answer: shearing stress — the forces act parallel to the rivet's cross-section, trying to slice it. That is exactly how rivets fail in old bridges.)

Strain — Deformation, Normalised
• Stress tells you the loading; strain tells you the result. And just like stress, strain is defined as a RATIO — because a 1 mm stretch is enormous for a 10 cm wire but negligible for a 100 m cable.
• DEFINITION — Longitudinal strain: the change in length divided by the original length, Strain = ΔL/L. It is a pure ratio — no unit, no dimensions.
• DEFINITION — Shearing strain: the angle (in radians) by which a line originally perpendicular to the fixed surface tilts, equal to the relative sideways displacement divided by the distance from the fixed surface, θ = Δx/L. For small angles tan θ ≈ θ, so the ratio and the angle are the same number.
• DEFINITION — Volume strain: the change in volume divided by the original volume, ΔV/V — again a pure ratio.
• EXAMPLE — The same 1 mm stretch, two stories: in a 1 m wire the strain is 10⁻³; in a 10 cm wire it is 10⁻² — ten times the strain from the same millimetre. Strain is what the material actually experiences; raw ΔL is just bookkeeping.
• WORKED PATTERN — A 2.0 m steel wire stretches by 1.5 mm under load. Strain = ΔL/L = 1.5 × 10⁻³ / 2.0 = 7.5 × 10⁻⁴. No units — and notice the strain is a small number: elastic strains in metals are almost always below 10⁻², which is why Hooke's law (next section) works so well for them.
• YOUR TURN — A rubber band of length 10 cm stretches to 40 cm. Its longitudinal strain? (Answer: ΔL/L = 30/10 = 3 — a strain of 3, or 300%. Rubber laughs at the small-strain world of metals, which is why its behaviour gets its own discussion later.)
⚠ EXAM TRAP — Strain has NO unit and NO dimensions, ever. If an answer choice gives strain in metres or percent as a "unit", it is wrong — percent is only a way of quoting the ratio, not a unit.

Hooke's Law — the Proportional Promise
• Now the law that organises the whole chapter. Robert Hooke's discovery, in words every examiner loves: within limits, deformation is proportional to load. Double the load, double the stretch.
• DEFINITION — Hooke's law: within the proportional limit, stress is directly proportional to strain. Stress ∝ Strain, so Stress/Strain = a constant.
• DEFINITION — Modulus of elasticity: that constant — the ratio of stress to strain for a given type of deformation. It measures the stiffness of the material itself: bigger modulus, smaller strain for the same stress.
✔ KEY FORMULA — Modulus of elasticity E = Stress/Strain. It depends on the MATERIAL and the type of deformation — never on the size or shape of the sample. A steel wire and a steel bridge girder share the same modulus.
• WHY does the ratio stay constant? Because near equilibrium, the interatomic "springs" are barely disturbed, and any spring-like restoring force grows linearly for small displacements. Hooke's law is the small-displacement shadow of the interatomic force law — which is also why it FAILS once displacements grow large: real springs, atomic or otherwise, stop being linear.
• EXAMPLE — Hang masses on a wire one by one and plot extension against load: you get a straight line through the origin. That straight line IS Hooke's law drawn — and its slope quietly contains the material's modulus, as the formula sheet will show.
• YOUR TURN — Two wires of the same steel, one twice as long as the other, carry the same load through the same cross-section. Which has the larger modulus? (Answer: neither — the modulus is identical, because it is a material property. The longer wire stretches twice as much in millimetres, but its strain — and so the ratio stress/strain — is the same.)
⚠ EXAM TRAP — Hooke's law is a LIMITED law: it holds only up to the proportional limit, not all the way to breaking. Questions that apply modulus formulas to hugely deformed or broken samples are testing exactly this boundary.

The Stress–Strain Curve — a Material's Biography
• One experiment tells a material's whole life story. Take a wire, increase the load in small steps, and plot stress against strain. The curve you get — drawn in the figure below — is the single most important picture of this chapter. Read it point by point.
• From O to A the curve is a straight line: stress ∝ strain, Hooke's law holds perfectly. Point A is the PROPORTIONAL LIMIT — the last point of perfect proportionality.
• DEFINITION — Elastic limit: the maximum stress up to which the body, on being unloaded, returns completely to its original size and shape. In the region from A to B the curve bends slightly — stress is no longer proportional to strain — yet the material is still elastic: unload anywhere up to B and it recovers fully.
• Beyond B the story changes. At the YIELD POINT (C), strain begins to increase rapidly with little or no increase in stress — the material "gives way" and starts to flow like a very stiff liquid. Deformation beyond the elastic limit is PLASTIC: unload now and the body keeps a permanent set — it never fully recovers.
• DEFINITION — Ultimate tensile strength: the maximum stress on the curve (point D) — the greatest load per unit area the material can bear before it starts to neck down and weaken.
• DEFINITION — Fracture point: the stress at which the material finally breaks (point E). Between D and E the wire thins locally (a "neck" forms), so the average stress falls even though the material is failing.
• Read the areas like an examiner: for a DUCTILE material (like steel or copper) the plastic region B–E is huge — it can be drawn into wires and hammered into sheets. For a BRITTLE material (glass, cast iron) fracture follows almost immediately after the elastic limit — the curve ends young, with almost no plastic region.
★ HIGHLIGHT — The slope of the straight part OA is Young's modulus. A steep curve means a stiff material. Two materials, one graph, and you can compare their stiffness, strength and ductility at a glance.
• YOUR TURN — A material's stress–strain curve rises steeply and snaps at a strain of just 0.002 with no yield region. Ductile or brittle? (Answer: brittle — a large modulus, a tiny plastic region, and sudden fracture. Glass and cast iron behave exactly like this.)

▸ Elastic or Plastic — Three Material Personalities
• DEFINITION — Elastic behaviour: the body recovers its original size and shape completely when the deforming force is removed. Plastic behaviour: the body retains some deformation permanently after unloading.
• Personality 1 — DUCTILE metals (steel, copper, aluminium): a modest elastic region, then a long plastic journey before fracture. They can be drawn into wires (ductility) and beaten into sheets (malleability) precisely because the plastic region is generous.
• Personality 2 — BRITTLE materials (glass, cast iron, ceramics): elastic almost to the end, then sudden fracture with little warning and almost no plastic deformation. Strong, but unforgiving.
• Personality 3 — ELASTOMERS (rubber): they stretch to several times their length — strains of 100% and more — and still recover. Their stress–strain curve has NO straight-line portion at all, so no single modulus describes them; Hooke's law simply does not apply, even though they are perfectly elastic in the recovery sense.
• EXAMPLE — Elastic hysteresis: load a rubber band and unload it, and the unloading curve loops below the loading one instead of retracing it. The loop's area is energy converted to heat — which is why a repeatedly stretched rubber band feels warm.
• Two fine-print terms: ELASTIC AFTER-EFFECT — some materials (glass fibres) recover only slowly after unloading; ELASTIC FATIGUE — repeated straining weakens a material, the way bending a wire back and forth eventually snaps it.
⚠ EXAM TRAP — "Elastic" in everyday speech means stretchy; in physics it means "recovers, and resists". Rubber stretches the most yet has the SMALLEST Young's modulus — steel, which barely stretches at all, is the more elastic material by the physicist's measure (modulus). Expect this inversion to be tested directly.

Young's Modulus — Stiffness Against Stretching
• Of the three moduli, this is the king — the one used for every wire, rod, cable and column problem. It answers: for a given pull per unit area, what fraction does the material stretch?
• DEFINITION — Young's modulus (Y): the ratio of longitudinal stress to longitudinal strain, within the proportional limit. Y = (F/A) ÷ (ΔL/L).
✔ KEY FORMULA — Y = FL/(AΔL). Rearranged for the most common exam ask: ΔL = FL/(AY). Units: Pa (N/m²), same as stress, since strain is dimensionless.
• Read the formula like a story: extension grows with force and with length (longer wire, more atomic springs in series, more total stretch), and shrinks with area (thicker wire, more springs in parallel sharing the load) and with Y (stiffer material, stiffer springs).
• WORKED PATTERN — A copper wire 3.0 m long, cross-section 2.0 mm², is pulled by 220 N. How much does it stretch? (Y for copper = 1.1 × 10¹¹ Pa.) ΔL = FL/(AY) = 220 × 3.0 / (2.0 × 10⁻⁶ × 1.1 × 10¹¹) = 660 / 2.2 × 10⁵ = 3.0 × 10⁻³ m = 3.0 mm. Sanity check: millimetre-scale stretch for a metre-scale metal wire — exactly the right neighbourhood.
★ HIGHLIGHT — Typical values to carry in your head: steel Y ≈ 2.0 × 10¹¹ Pa, aluminium ≈ 7.0 × 10¹⁰ Pa, copper ≈ 1.1 × 10¹¹ Pa, rubber ≈ 5 × 10⁸ Pa. Steel is roughly 400 times stiffer than rubber — that single ratio answers half the comparison questions ever set.
• YOUR TURN — A steel rod and an aluminium rod have identical dimensions and carry identical loads. The aluminium rod stretches about how many times more than the steel one? (Answer: strain ∝ 1/Y, so the ratio is Y_steel/Y_aluminium ≈ 2.0 × 10¹¹ / 7.0 × 10¹⁰ ≈ 2.9 — roughly 3 times more.)
⚠ EXAM TRAP — Young's modulus is defined ONLY for solids, and only for longitudinal deformation within the proportional limit. Liquids and gases have no Y — they cannot sustain a length at all. Options offering a Young's modulus for water are automatic rejects.

Shear Modulus — Stiffness Against Sliding Layers
• Pull a material and Young's modulus answers. Slide its layers and a different stiffness answers — the shear modulus, also called the modulus of rigidity.
• DEFINITION — Shear modulus (G): the ratio of shearing stress to shearing strain, within the proportional limit. G = (F/A) ÷ θ, where θ is the shear strain in radians.
✔ KEY FORMULA — G = F/(Aθ) = FL/(AΔx), using θ = Δx/L. Units: Pa.
• Picture it with a thick book glued to the table: push the top cover sideways with force F. Each page slides a little over the one below, the block leans by angle θ, and the ratio of your sideways stress to that lean angle is G. Materials with layered or slippery internal structure shear easily (small G); tightly bonded solids resist (large G).
• EXAMPLE — A rubber eraser shears dramatically under your thumb — small G. A steel block under the same thumb force does not visibly lean at all — its G ≈ 8.4 × 10¹⁰ Pa is roughly a million times larger. For every solid, G is smaller than Y (typically G ≈ Y/2.6 for metals): solids are always easier to shear than to stretch — a fact the relations section will prove from Poisson's ratio.
• WORKED PATTERN — An aluminium block (G = 2.6 × 10¹⁰ Pa) has its top face, of area 1.0 × 10⁻² m², pushed tangentially until the shear strain is 5.0 × 10⁻⁴ rad. What force was needed? Shearing stress = Gθ = 2.6 × 10¹⁰ × 5.0 × 10⁻⁴ = 1.3 × 10⁷ Pa. Force = stress × A = 1.3 × 10⁷ × 1.0 × 10⁻² = 1.3 × 10⁵ N — the weight of a small car, to lean a metal block by a hair. Solids are stubborn.
• YOUR TURN — Why do earthquakes produce two kinds of waves in rock — fast P-waves and slower S-waves — while the liquid outer core transmits only P-waves? (Answer: S-waves are shear waves and need a shear modulus. Liquids have G = 0 — they cannot sustain shearing stress at all — so S-waves die at the core. This is real evidence that Earth's outer core is liquid.)

Bulk Modulus — Stiffness Against Squeezing
• The third modulus rules the third stress: squeeze a body from all sides and ask how much its volume shrinks.
• DEFINITION — Bulk modulus (B): the ratio of hydraulic stress to volume strain. B = P ÷ (−ΔV/V) = −PV/ΔV, where P is the increase in pressure and ΔV the (negative) change in volume.
✔ KEY FORMULA — B = −ΔP/(ΔV/V). The minus sign exists because pressure increase makes ΔV negative; it keeps B a positive number. Units: Pa.
• DEFINITION — Compressibility: the reciprocal of bulk modulus, k = 1/B, unit Pa⁻¹. High compressibility = easy to squeeze = small B.
• WHY is B the only modulus liquids and gases possess? Because a fluid has no fixed shape: it cannot sustain longitudinal pulls or shear — push its layers and it simply flows. But squeeze its VOLUME and it pushes back hard. Water's B ≈ 2.2 × 10⁹ Pa is small next to steel's 1.6 × 10¹¹ Pa, yet still large enough that engineers treat water as nearly incompressible.
• EXAMPLE — Under 1000 m of ocean the pressure rises by about 1.0 × 10⁷ Pa, yet a steel ball (B = 1.6 × 10¹¹ Pa) shrinks by only ΔV/V ≈ 6.3 × 10⁻⁵ — 0.006%. For gases the story flips: air's bulk modulus at ordinary pressure is only about 1.4 × 10⁵ Pa, so gases compress readily — and for them B depends on how the compression is done (slowly or suddenly).
• WORKED PATTERN — How much pressure compresses a litre of water by 0.10%? Needed volume strain = 1.0 × 10⁻³. ΔP = B × strain = 2.2 × 10⁹ × 1.0 × 10⁻³ = 2.2 × 10⁶ Pa ≈ 22 atmospheres — for a mere 0.1% squeeze. "Incompressible" is an exaggeration, but an understandable one.
• YOUR TURN — Two identical balloons, one filled with water and one with air, are taken down 100 m in a lake. Which changes volume more, and roughly by what factor logic? (Answer: the air balloon, enormously — air's bulk modulus at the surface is around 10⁵ Pa against water's 2.2 × 10⁹ Pa, a factor of about twenty thousand in compressibility. The water balloon is nearly unchanged.)
⚠ EXAM TRAP — For gases, B is not a fixed constant of the material like it is for solids — it depends on the process: B equals P for a slow (isothermal) squeeze and γP for a sudden (adiabatic) one. And never drop the minus sign silently: volume strain ΔV/V is negative under pressure, and B is defined to come out positive.

Poisson's Ratio — the Sideways Shrink
• Stretch a rubber band and watch its width: it thins as it lengthens. Every material does this — pull it long and it contracts sideways. The ratio of the two strains is a material constant in its own right.
• DEFINITION — Poisson's ratio (σ): the ratio of lateral strain to longitudinal strain, when a body is stretched by a longitudinal stress. σ = (lateral strain)/(longitudinal strain) = (−Δd/d)/(ΔL/L), where d is the diameter (or width) and L the length. The minus sign records that the diameter DECREASES when length increases; quoted values of σ are positive for ordinary materials.
✔ KEY FORMULA — σ = −(Δd/d) ÷ (ΔL/L). It is a pure ratio — dimensionless, no unit. For most materials σ lies between 0 and 0.5; for steel σ ≈ 0.28, aluminium ≈ 0.33, copper ≈ 0.35, rubber ≈ 0.5.
• WHY the ceiling of 0.5? If σ were exactly 0.5, sideways shrinkage would exactly compensate the lengthening and the volume would never change on stretching — rubber, nearly incompressible, sits almost exactly there. Theory also sets a floor: σ cannot be less than −1 (a few exotic "auxetic" foams actually have negative σ and grow fatter when stretched — a favourite curiosity, not an exam requirement).
• WORKED PATTERN — A wire of diameter 4.0 mm is stretched to a longitudinal strain of 2.0 × 10⁻³. The material has σ = 0.25. Lateral strain = σ × longitudinal strain = 0.25 × 2.0 × 10⁻³ = 5.0 × 10⁻⁴. Change in diameter = 5.0 × 10⁻⁴ × 4.0 mm = 2.0 × 10⁻³ mm — two micrometres thinner. Invisible, but precision instruments feel it.
• YOUR TURN — If a stretched material showed NO sideways contraction at all, what would σ be, and what everyday material comes close? (Answer: σ = 0 — cork is the classic near-zero example, which is exactly why cork is used for bottle stoppers: push it in lengthwise and it does not bulge sideways and jam.)
★ HIGHLIGHT — Poisson's ratio is the coupling constant of elasticity: it is the reason the three moduli are not independent. Give me Y and σ, and I can hand you G and B — the next section shows the keys.

▸ The Moduli Reference Table — and Their Relations
• One table to rule the chapter. All values are typical room-temperature figures (Pa); volumes of the same material vary slightly with purity and treatment.
• Young's modulus Y — STEEL 2.0 × 10¹¹ • IRON (wrought) 1.9 × 10¹¹ • COPPER 1.1 × 10¹¹ • ALUMINIUM 7.0 × 10¹⁰ • GLASS ≈ 6.5 × 10¹⁰ • RUBBER ≈ 5 × 10⁸.
• Shear modulus G — STEEL 8.4 × 10¹⁰ • COPPER 3.6 × 10¹⁰ • ALUMINIUM 2.6 × 10¹⁰ • (fluids: exactly 0).
• Bulk modulus B — STEEL 1.6 × 10¹¹ • COPPER 1.4 × 10¹¹ • ALUMINIUM 7.0 × 10¹⁰ • WATER 2.2 × 10⁹ • AIR (at atmospheric pressure) ≈ 1.4 × 10⁵.
• Poisson's ratio σ — STEEL 0.28 • COPPER 0.35 • ALUMINIUM 0.33 • RUBBER ≈ 0.5 • CORK ≈ 0.
• Read the table vertically and a pattern jumps out: for any solid, Y, G and B are all in the same broad range, with G always the smallest of the three — solids resist stretching and squeezing more than sliding.
✔ KEY FORMULA — The three relations (isotropic solids): Y = 2G(1 + σ) • Y = 3B(1 − 2σ) • 9/Y = 3/G + 1/B. Any two constants determine the rest.
• WHY must such relations exist? Because the deformations are not independent: a longitudinal pull is secretly a mixture of a volume change and a shape change (shear), coupled by Poisson contraction. One material, one set of atomic springs — pull, slide and squeeze are three questions asked of the same springs, so the answers must be consistent.
• WORKED PATTERN — Check the table against itself for steel: from G = 8.4 × 10¹⁰ and σ = 0.28, Y = 2G(1 + σ) = 2 × 8.4 × 10¹⁰ × 1.28 ≈ 2.15 × 10¹¹ Pa — close to the tabulated 2.0 × 10¹¹. And from B = 1.6 × 10¹¹: Y = 3B(1 − 2σ) = 3 × 1.6 × 10¹¹ × 0.44 ≈ 2.1 × 10¹¹ Pa. Two routes, one answer — the relations work.
⚠ EXAM TRAP — The relations assume an ISOTROPIC material (same properties in every direction). Wood, single crystals and rolled sheets break them — and σ outside the range −1 to 0.5 for an isotropic solid signals an inconsistent question or a misread value.

Elastic Potential Energy — the Spring Inside the Wire
• Stretching a wire takes work — you pull against the restoring force through a distance. That work does not vanish: it is stored inside the strained material as elastic potential energy, and it is returned when the wire is unloaded (minus a little heat, if you strayed into hysteresis).
• Build it honestly: the force grows from 0 to F as the wire stretches from 0 to ΔL (Hooke's law — a linear ramp), so the average force during stretching is F/2. Work done = average force × extension = ½ F ΔL.
✔ KEY FORMULA — Elastic PE stored in a stretched wire: U = ½ × F × ΔL = ½ × stress × strain × volume. Per unit volume (energy density): u = ½ × stress × strain = ½ Y (strain)² = (stress)²/(2Y).
• EXAMPLE — Where does this energy show itself? In the twang of a plucked string, the snap of a released catapult, the spring of a diving board — and dangerously, in the whiplash of a snapped crane cable, which releases in a fraction of a second all the energy stored along its whole length.
• WORKED PATTERN — A wire carries a steady force of 200 N and has stretched 2.0 mm. Stored energy U = ½ × 200 × 2.0 × 10⁻³ = 0.20 J. Cross-check by density: if the wire is 1.0 m long with area 0.50 mm², strain = 2.0 × 10⁻³, stress = 200/(5.0 × 10⁻⁷) = 4.0 × 10⁸ Pa, so u = ½ × 4.0 × 10⁸ × 2.0 × 10⁻³ = 4.0 × 10⁵ J/m³, times volume 5.0 × 10⁻⁷ m³ gives 0.20 J. Two routes, one answer — the habit of champions.
• YOUR TURN — A wire is stretched with twice the force (still within Hooke's law). The stored energy becomes how many times larger? (Answer: 4 times — extension also doubles, and U = ½ F ΔL picks up both factors. Energy grows as the SQUARE of load or strain. This square law is why slightly overloaded cables are far more dangerous than they look.)
⚠ EXAM TRAP — U = ½ F ΔL uses the FINAL force F with the factor ½ coming from the linear ramp. Writing U = F ΔL forgets that the force was smaller during most of the stretch — the single most common energy error in this chapter.

Applications — Engineering with Elasticity
• Time to spend the theory. Every structure you have ever trusted was sized by someone asking: what is the stress, what is the strain, and how close are we to the elastic limit? Three classic NCERT-style applications follow — crane ropes here, beams and mountains next.
• APPLICATION 1 — Crane ropes are thick for a reason. A rope lifting mass m must carry stress mg/A without ever approaching the elastic limit of steel (≈ 3 × 10⁸ Pa), because a rope that yields even once is permanently weakened. Design therefore demands a generous area: A ≥ mg/(permissible stress).
• WORKED PATTERN — A crane must lift 10⁴ kg. With g = 10 m/s² the load is 1.0 × 10⁵ N. If the working stress is capped at steel's elastic limit 3 × 10⁸ Pa: A = 1.0 × 10⁵ / 3 × 10⁸ = 3.33 × 10⁻⁴ m², so r = √(A/π) ≈ √(1.06 × 10⁻⁴) ≈ 1.03 × 10⁻² m ≈ 1 cm radius — a rope about 2 cm thick. Real cranes use several such ropes together, adding a safety factor on top.
• EXAMPLE — The same logic inverted explains thin things: a spider's silk thread can be hair-thin because the load is tiny and silk's strength is superb. Load per area — not load alone — decides survival.
• YOUR TURN — A lift cable is replaced by one of half the radius, same steel, same lift. By what factor does the working stress rise? (Answer: area falls to one quarter, so stress rises 4 times. Radius is a squared lever — respect it.)

▸ Beams, Girders and Mountains — Shape and Limits
• APPLICATION 2 — Why beams sag, and how shape defeats sag. A horizontal beam supported at its ends and loaded at the centre bends: the top surface compresses, the bottom surface stretches, and the middle layer (the neutral surface) keeps its length. The depression at the centre is δ = WL³/(4Ybd³) for a beam of length L, breadth b and depth d.
✔ KEY FORMULA — Sagging of a centrally loaded beam: δ ∝ L³/(b d³). Read the exponents: doubling the length multiplies sag by 8; doubling the DEPTH divides sag by 8. Depth is the engineer's favourite weapon.
• WORKED PATTERN — A wooden beam (Y ≈ 1.0 × 10¹⁰ Pa), L = 2.0 m, b = 0.10 m, d = 0.20 m, carries 1000 N at its centre. δ = 1000 × 8 / (4 × 1.0 × 10¹⁰ × 0.10 × 0.008) = 8000 / 3.2 × 10⁷ = 2.5 × 10⁻⁴ m = 0.25 mm. Rebuild it with double the depth (d = 0.40 m) and the sag falls eightfold to about 0.03 mm — same wood, same length, eight times stiffer, purely from shape.
• WHY the I-shape? In a bent beam the stress is maximum at the top and bottom surfaces and zero at the neutral middle. An I-section (or hollow rectangular girder) puts the material where the stress lives — thick flanges top and bottom, a thin web between — giving nearly the strength of a solid beam for a fraction of the weight. Railway girders, floor joists and crane arms all wear this shape.
• APPLICATION 3 — How tall can a mountain be? A mountain's own weight stresses its base: stress ≈ ρgh, with rock density ρ ≈ 3 × 10³ kg/m³. If this exceeds the elastic limit (crushing strength) of rock, about 3 × 10⁸ Pa, the base flows and the mountain sinks/spreads instead of growing.
• WORKED PATTERN — h_max = 3 × 10⁸ / (3 × 10³ × 10) = 1.0 × 10⁴ m = 10 km. And reality applauds: Everest stands 8.8 km high — just under the elastic ceiling of rock. Mars, with weaker gravity, hosts Olympus Mons at about 22 km — smaller g, taller permitted mountain, exactly as the formula predicts.
★ HIGHLIGHT — Three applications, one moral: stress = load/area, strain follows modulus, and geometry (area, depth, height) is as much a part of physics as the material itself. Examiners love these because they test understanding, not memory.

Formula Sheet — One-Glance Recap
✔ KEY FORMULA — Stress = F/A • Longitudinal strain = ΔL/L • Shearing strain θ = Δx/L • Volume strain = ΔV/V • Hooke's law: stress ∝ strain (up to proportional limit).
✔ KEY FORMULA — Young's modulus Y = (F/A)/(ΔL/L) = FL/(AΔL) • Extension ΔL = FL/(AY) • Shear modulus G = (F/A)/θ = FL/(AΔx).
✔ KEY FORMULA — Bulk modulus B = −ΔP/(ΔV/V) • Compressibility k = 1/B • Poisson's ratio σ = −(Δd/d)/(ΔL/L).
✔ KEY FORMULA — Relations: Y = 2G(1 + σ) • Y = 3B(1 − 2σ) • 9/Y = 3/G + 1/B • Elastic PE U = ½ F ΔL • Energy density u = ½ × stress × strain = (stress)²/(2Y).
• Curve landmarks in order: O origin → A proportional limit → B elastic limit → C yield point → D ultimate tensile strength → E fracture point.
• Anchor values: Y_steel 2.0 × 10¹¹ Pa • G_steel 8.4 × 10¹⁰ Pa • B_steel 1.6 × 10¹¹ Pa • B_water 2.2 × 10⁹ Pa • σ_steel 0.28 • elastic limit of steel ≈ 3 × 10⁸ Pa • beam sag δ ∝ L³/(bd³) • mountain ceiling ρgh ≲ 3 × 10⁸ Pa.

Common Mistakes and Exam Traps
• Mistake 1 — Using force where stress is needed. Why wrong: failure depends on force per unit area; the same force that is nothing to a cable snaps a thread. Correct principle: the moment a problem asks "will it break / how much does it stretch", convert force to stress F/A first.
• Mistake 2 — Calling rubber "more elastic" than steel. Why wrong: everyday language rewards stretchiness; physics rewards resistance to deformation, measured by modulus. Steel's Y is about 400 times rubber's. Correct principle: "more elastic" in an exam means larger modulus of elasticity.
• Mistake 3 — Forgetting that strain is a ratio. Why wrong: quoting ΔL as "the strain" mixes metres into a dimensionless quantity and wrecks every modulus formula downstream. Correct principle: always divide by the original length (or volume) before touching a modulus.
• Mistake 4 — Applying Hooke's law beyond its limit. Why wrong: past the proportional limit the stress–strain graph curves, yields and flows; linear formulas silently stop describing reality. Correct principle: modulus formulas are valid only in the straight-line region OA of the curve.
• Mistake 5 — Mixing up the three moduli. Why wrong: each modulus answers its own stress — Y for pulling, G for sliding, B for squeezing; liquids possess only B (G = 0). Correct principle: first name the stress type in the problem, and the modulus chooses itself.
• Mistake 6 — Dropping the minus sign (or the sense) in bulk modulus. Why wrong: under increased pressure ΔV is negative; B = −ΔP/(ΔV/V) is constructed to be positive. Sign confusion produces negative moduli — an instant tell of a wrong answer. Correct principle: work with magnitudes for volume strain and state B as positive.
• Mistake 7 — Writing U = F ΔL for stored energy. Why wrong: the force ramps linearly from zero, so the average is F/2. Correct principle: U = ½ F ΔL = ½ × stress × strain × volume — the ½ is the signature of a linear spring.
• Mistake 8 — Thinking Poisson's ratio can be any number. Why wrong: for isotropic solids theory confines σ to −1 < σ < 0.5; a computed 0.8 means an arithmetic slip, usually swapping lateral and longitudinal strain. Correct principle: lateral strain is the SMALLER one in the numerator — check the ratio is below 0.5 for ordinary materials.
⚠ EXAM TRAP — The curve's cruel favourite: ultimate tensile strength (D) is the MAXIMUM stress, but fracture (E) happens at a LOWER average stress because the neck reduces the load-bearing area. "Breaking stress" questions are about E, "strongest point" questions about D.

Worked Examples — Exam Patterns
• EXAMPLE 1 — Young's modulus, the full routine. Problem: A steel wire 2.0 m long and 1.0 mm² in cross-section is pulled by a 100 N force. Find the stress, strain and extension. (Y_steel = 2.0 × 10¹¹ Pa.) Given: L = 2.0 m, A = 1.0 × 10⁻⁶ m², F = 100 N. Principle: stress = F/A; strain = stress/Y; ΔL = strain × L. Steps: stress = 100/1.0 × 10⁻⁶ = 1.0 × 10⁸ Pa. Strain = 1.0 × 10⁸/2.0 × 10¹¹ = 5.0 × 10⁻⁴. ΔL = 5.0 × 10⁻⁴ × 2.0 = 1.0 × 10⁻³ m. Answer: stress 1.0 × 10⁸ Pa, strain 5.0 × 10⁻⁴, extension 1.0 mm. Reasoning: chain the three definitions in order — stress, then strain, then size change; nearly every wire problem is this chain. Mistake: using A = 1.0 mm² as 1.0 × 10⁻³ m² — one mm² is 10⁻⁶ m²; area conversions are the chapter's top mark-killer.
• EXAMPLE 2 — The NCERT rod. Problem: A structural steel rod of radius 10 mm and length 1.0 m is pulled by a 100 kN force. Find stress, strain and elongation. (Y = 2.0 × 10¹¹ Pa.) Given: r = 1.0 × 10⁻² m, L = 1.0 m, F = 1.0 × 10⁵ N. Principle: same chain, with A = πr². Steps: A = π × (1.0 × 10⁻²)² ≈ 3.14 × 10⁻⁴ m². Stress = 1.0 × 10⁵/3.14 × 10⁻⁴ ≈ 3.18 × 10⁸ Pa. Strain = 3.18 × 10⁸/2.0 × 10¹¹ ≈ 1.59 × 10⁻³. Elongation = 1.59 × 10⁻³ × 1.0 ≈ 1.59 mm. Answer: 3.18 × 10⁸ Pa; 1.59 × 10⁻³; 1.59 mm. Reasoning: notice the strain (≈ elastic limit territory) — this rod is working hard, which is why real structures add safety margins. Mistake: diameter–radius swap in A = πr², a factor-of-4 ambush.
• EXAMPLE 3 — Bulk modulus under the ocean. Problem: A steel ball is lowered to a depth of 1000 m in the ocean, where the pressure exceeds the surface pressure by about 1.0 × 10⁷ Pa. Find the fractional change in its volume. (B_steel = 1.6 × 10¹¹ Pa.) Given: ΔP = 1.0 × 10⁷ Pa. Principle: volume strain = ΔP/B. Steps: ΔV/V = 1.0 × 10⁷/1.6 × 10¹¹ = 6.25 × 10⁻⁵. Answer: the volume shrinks by about 6.3 × 10⁻⁵, i.e. 0.006%. Reasoning: B for solids is so large that even ocean-floor pressures barely dent them. Mistake: feeding the ABSOLUTE pressure instead of the pressure CHANGE — only the change strains the ball (it was already in equilibrium at the surface pressure... the surface pressure is present inside and out; the excess does the squeezing).
• EXAMPLE 4 — Shear modulus from a leaning block. Problem: An aluminium block is fixed at its base. A tangential force of 1.3 × 10⁵ N acts on its top face of area 1.0 × 10⁻² m², and the top face shifts by 0.050 mm relative to a height of 0.10 m. Find G. Given: F = 1.3 × 10⁵ N, A = 1.0 × 10⁻² m², Δx = 5.0 × 10⁻⁵ m, L = 0.10 m. Principle: G = (F/A)/(Δx/L). Steps: shearing stress = 1.3 × 10⁵/1.0 × 10⁻² = 1.3 × 10⁷ Pa. Shear strain θ = 5.0 × 10⁻⁵/0.10 = 5.0 × 10⁻⁴ rad. G = 1.3 × 10⁷/5.0 × 10⁻⁴ = 2.6 × 10¹⁰ Pa. Answer: G ≈ 2.6 × 10¹⁰ Pa — matching aluminium's tabulated value. Reasoning: the check against the table is not decoration; it is how you catch a slipped power of ten. Mistake: measuring Δx from the wrong face — shear strain uses displacement relative to the FIXED surface divided by the height.
• EXAMPLE 5 — Energy stored in a stretched wire. Problem: A wire 1.0 m long and 0.50 mm² in cross-section carries 200 N and stretches 2.0 mm (within Hooke's law). Find the elastic energy stored, two ways. Given: F = 200 N, ΔL = 2.0 × 10⁻³ m, L = 1.0 m, A = 5.0 × 10⁻⁷ m². Principle: U = ½ F ΔL, or U = ½ × stress × strain × volume. Steps (route 1): U = ½ × 200 × 2.0 × 10⁻³ = 0.20 J. Steps (route 2): stress = 200/5.0 × 10⁻⁷ = 4.0 × 10⁸ Pa; strain = 2.0 × 10⁻³; volume = 5.0 × 10⁻⁷ m³; U = ½ × 4.0 × 10⁸ × 2.0 × 10⁻³ × 5.0 × 10⁻⁷ = 0.20 J. Answer: 0.20 J, both ways. Reasoning: agreement between routes is the strongest verification this chapter offers. Mistake: omitting the ½ — the force was not 200 N throughout the stretch; it grew to 200 N.
• EXAMPLE 6 — One modulus from the others. Problem: For a steel-like material, Y = 2.0 × 10¹¹ Pa and σ = 0.30. Find G and B. Given: the relations Y = 2G(1 + σ) and Y = 3B(1 − 2σ). Principle: two constants determine all. Steps: G = Y/(2(1 + σ)) = 2.0 × 10¹¹/(2 × 1.30) = 2.0 × 10¹¹/2.6 ≈ 7.7 × 10¹⁰ Pa. B = Y/(3(1 − 2σ)) = 2.0 × 10¹¹/(3 × 0.40) = 2.0 × 10¹¹/1.2 ≈ 1.67 × 10¹¹ Pa. Answer: G ≈ 7.7 × 10¹⁰ Pa, B ≈ 1.7 × 10¹¹ Pa — comfortably close to steel's tabulated 8.4 × 10¹⁰ and 1.6 × 10¹¹. Reasoning: the relations are consistency locks; exam questions that hand you two constants are quietly inviting you to pick the lock. Mistake: using (1 − 2σ) with σ = 0.30 as 1 − 0.6 = 0.4 — correct — but then dividing by 3 twice; write each step.
• EXAMPLE 7 — Designing the crane rope. Problem: A crane lifts a 10⁴ kg load. Taking steel's elastic limit as 3 × 10⁸ Pa and g = 10 m/s², find the minimum radius of a single steel rope. Given: m = 10⁴ kg, F = mg = 1.0 × 10⁵ N, permissible stress 3 × 10⁸ Pa. Principle: A = F/stress, A = πr². Steps: A = 1.0 × 10⁵/3 × 10⁸ = 3.33 × 10⁻⁴ m². r = √(A/π) = √(1.06 × 10⁻⁴) ≈ 1.03 × 10⁻² m. Answer: r ≈ 1.0 cm (diameter ≈ 2 cm) — and real designs multiply ropes and add safety factors. Reasoning: "minimum" appears because the stress cap is an inequality; a thinner rope would cross the elastic limit. Mistake: designing AT the breaking stress rather than the elastic limit — a rope may survive breaking stress once, but yielding destroys it permanently.

Practice Questions — Self-Test Set
• Instructions: attempt all eight before reading the key. Types are mixed as in real papers: single-correct, multiple-correct, numerical and statement-based. Difficulty, concept and the targeted misconception are declared with each answer.
• Q1 [Easy • Stress scales with area] A wire carries a tensile force F. If the wire's diameter is doubled (same force), the tensile stress becomes: (a) 4 times (b) 2 times (c) one-half (d) one-fourth
• Q2 [Easy • Finding Y] A wire 1.5 m long, cross-section 2.0 mm², extends by 0.75 mm under a 200 N load. Young's modulus of the material is: (a) 1.0 × 10¹¹ Pa (b) 2.0 × 10¹¹ Pa (c) 3.0 × 10¹¹ Pa (d) 4.0 × 10¹¹ Pa
• Q3 [Medium • Multiple correct — Hooke's law] Within the proportional limit, which statements are TRUE? (a) stress/strain is constant (b) the modulus depends on the dimensions of the sample (c) unloading restores the original length (d) the stress–strain graph is a straight line through the origin
• Q4 [Medium • Which modulus] A sample of oil in a hydraulic press is compressed. The modulus that describes its response is: (a) Young's modulus (b) shear modulus (c) bulk modulus (d) all three equally
• Q5 [Medium • Numerical — bulk] The pressure on a 1.0 litre sample of a liquid (B = 2.0 × 10¹⁰ Pa) is raised by 2.0 × 10⁷ Pa. The volume decreases by: (a) 0.1 cm³ (b) 1 cm³ (c) 10 cm³ (d) 100 cm³
• Q6 [Medium • Statement-based] Statement I: Steel is more elastic than rubber. Statement II: For the same applied stress, steel undergoes a much smaller strain than rubber. Choose: (a) both true (b) I true, II false (c) I false, II true (d) both false
• Q7 [Hard • Numerical — Poisson] A wire of diameter 4.0 mm is stretched with longitudinal strain 2.0 × 10⁻³. If σ = 0.25, the decrease in diameter is: (a) 2.0 × 10⁻³ mm (b) 2.0 × 10⁻² mm (c) 5.0 × 10⁻⁴ mm (d) 8.0 × 10⁻³ mm
• Q8 [Hard • Applications] Bridge girders are made deep (and often I-shaped) mainly because: (a) depth increases the Young's modulus (b) sag decreases strongly with depth, δ ∝ 1/d³, and the I-shape places material where bending stress is greatest (c) deeper girders weigh less (d) depth increases the elastic limit of steel
• ANSWER KEY — A1: (d). Area grows fourfold when diameter doubles, so stress F/A falls to one-fourth. Misconception targeted: "double size, half effect" — area is a squared quantity, so the factor is 4, not 2.
• A2: (b). Y = FL/(AΔL) = 200 × 1.5/(2.0 × 10⁻⁶ × 7.5 × 10⁻⁴) = 300/1.5 × 10⁻⁹ = 2.0 × 10¹¹ Pa — steel, as the value itself hints. Concept: the full FL/(AΔL) routine with clean unit conversion.
• A3: (a), (c) and (d). The modulus is a material constant — statement (b) is the classic falsehood: dimensions change stress and strain together, never their ratio. Concept: what "material property" really means.
• A4: (c). A liquid cannot sustain length or shear — it flows — so only volume response exists: bulk modulus alone. Misconception: assigning all moduli to all states of matter.
• A5: (b). Volume strain = ΔP/B = 2.0 × 10⁷/2.0 × 10¹⁰ = 1.0 × 10⁻³. ΔV = 1.0 × 10⁻³ × 1000 cm³ = 1 cm³. Concept: B as pressure-per-fractional-squeeze.
• A6: (a). Both statements are true, and II is precisely WHY I is true in the physicist's sense: elasticity is measured by modulus, and modulus is stress per strain — smaller strain for the same stress means larger modulus. Misconception: everyday "elastic = stretchy".
• A7: (a). Lateral strain = σ × longitudinal strain = 0.25 × 2.0 × 10⁻³ = 5.0 × 10⁻⁴. Δd = 5.0 × 10⁻⁴ × 4.0 mm = 2.0 × 10⁻³ mm. Concept: Poisson's ratio as a strain multiplier. Watch out: option (d) is ΔL per metre thinking — keep lateral and longitudinal separate.
• A8: (b). Depth enters the sag formula cubed, and bending stress concentrates at the outer surfaces — the I-section exploits both facts. Options (a) and (d) invent changes to material constants: geometry never changes Y or the elastic limit. Concept: shape versus material — the chapter's closing moral.
• Scoring guide: 7–8 = exam-ready; 5–6 = strong, revisit the sections named by your misses; below 5 = re-read with this set open beside you and re-attempt tomorrow.

Chapter Summary and Revision Checklist
• Summary in one paragraph: Solids resist deformation through internal restoring forces. Stress (F/A) measures the loading per unit area — longitudinal, shearing or hydraulic — and strain measures the fractional deformation it causes. Within the proportional limit the two are proportional (Hooke's law), and their ratio is a modulus: Y for stretching, G for sliding, B for squeezing, linked through Poisson's ratio σ by Y = 2G(1 + σ) and Y = 3B(1 − 2σ). The stress–strain curve narrates a material's life from proportionality through yield and ultimate strength to fracture, separating ductile, brittle and elastomer personalities. Stretching stores energy U = ½ F ΔL, and the same stress–strain thinking sizes crane ropes, stiffens girders through depth, and caps mountains near 10 km.
• Essential definitions to reproduce verbatim: stress and its three types • the three strains • Hooke's law • modulus of elasticity • Young's, shear and bulk moduli • Poisson's ratio • proportional limit, elastic limit, yield point, ultimate tensile strength, fracture point.
• Must-remember formulae: Y = FL/(AΔL) • G = FL/(AΔx) • B = −ΔP/(ΔV/V) • σ = −(Δd/d)/(ΔL/L) • Y = 2G(1 + σ) • Y = 3B(1 − 2σ) • U = ½ F ΔL • δ ∝ L³/(bd³).
• Frequently confused pairs — say the difference aloud: stress versus pressure • strain versus extension • elastic (physics) versus stretchy (everyday) • proportional limit versus elastic limit • ultimate strength versus fracture stress • Y versus G versus B.
• Revision checklist: □ I can classify any loading as longitudinal, shearing or hydraulic □ I can compute stress and all three strains with clean units □ I can narrate the stress–strain curve point by point: A, B, C, D, E □ I can derive ΔL = FL/(AY) and use it both directions □ I can pick the correct modulus for any scenario, including "liquids: B only" □ I can move between Y, G, B and σ using the relations □ I can compute stored energy with the ½ honestly explained □ I can reproduce the crane-rope, beam-sag and mountain-height arguments.
• Self-assessment — answer honestly: (1) A wire's diameter is doubled at the same load — by what factor do its stress and its extension change, and why are the two factors equal? (2) A material fractures just after its elastic limit with no yield point — sketch its curve and name its personality. (3) Why do liquids have exactly one modulus? (4) A computed Poisson's ratio comes out 0.9 — what do you conclude before anything else? (5) Where does the ½ in U = ½ F ΔL come from? If any answer stalls, revisit: (1) stress and Young's modulus sections, (2) the curve section, (3) the bulk modulus section, (4) the mistakes section, (5) the energy section. (Answers: (1) both fall to one-fourth — stress drops because area quadruples, and extension follows strain, which follows stress; (2) brittle; (3) they cannot sustain length or shear, only volume change; (4) an arithmetic slip — σ above 0.5 is impossible for ordinary isotropic solids; (5) the force grows linearly from zero, so the average force during stretching is F/2.)
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

            title = "Sexual Reproduction In Flowering Plants",

            subtitle = "Flower Morphology, Micro/Megasporogenesis, Pollination, Double Fertilisation & Embryo Development",

            totalLessons = 5,

            completedLessons = 3,

            studyNotesCount = 8,

            practiceQuestionCount = 18,

            durationMinutes = 40,

            formulaHighlight = "Pollen Tube Entry (Micropyle) • Syngamy (2n Zygote) • Triple Fusion (3n PEN) • Double Fertilisation",

            keyConceptsSummary = "Tapetum polyploidy & nourishment, sporopollenin resistance, monosporic 8-nucleate/7-celled embryo sac, filiform apparatus guidance, syngamy + triple fusion double fertilisation, albuminous vs exalbuminous seeds, apomixis & polyembryony.",

            detailedStudyNotes = """

                Introduction

                Are we not lucky that plants reproduce sexually? The myriads of flowers that we enjoy gazing at, the scents and the perfumes that we swoon over, the rich colours that attract us, are all there as an aid to sexual reproduction. Flowers do not exist only for us to be used for our own selfishness. All flowering plants show sexual reproduction. A look at the diversity of structures of the inflorescences, flowers and floral parts, shows an amazing range of adaptations to ensure formation of the end products of sexual reproduction, the fruits and seeds. In this chapter, let us understand the morphology, structure and the processes of sexual reproduction in flowering plants (angiosperms).



                1.1 FLOWER — A FASCINATING ORGAN OF ANGIOSPERMS

                Human beings have had an intimate relationship with flowers since time immemorial. Flowers are objects of aesthetic, ornamental, social, religious and cultural value – they have always been used as symbols for conveying important human feelings such as love, affection, happiness, grief, mourning, etc. _List at least five flowers of ornamental value that are commonly cultivated at homes and in gardens. Find out the names of five more flowers that are used in social and cultural celebrations in your family. Have you heard of floriculture – what does it refer to?_



                To a biologist, flowers are morphological and embryological marvels and the sites of sexual reproduction. In class XI, you have read the various parts of a flower. Can you recall the two parts that are of maximum interest for reproduction?



                1.2 PRE-FERTILISATION: STRUCTURES AND EVENTS

                Much before the actual flower is seen on a plant, the decision that the plant is going to flower has taken place. Several hormonal and structural changes are initiated which lead to the differentiation and further development of the floral primordium. Inflorescences are formed which bear the floral buds and then the flowers. In the flower the male and female reproductive structures, the androecium and the gynoecium differentiate and develop. You would recollect that the androecium consists of a whorl of stamens representing the male reproductive organ and the gynoecium represents the female reproductive organ.



                1.2.1 Stamen, Microsporangium and Pollen Grain

                • A typical stamen consists of two parts: the long and slender stalk called the filament, and the terminal generally bilobed structure called the anther. The proximal end of the filament is attached to the thalamus or the petal of the flower.

                • A typical angiosperm anther is bilobed with each lobe having two theca (dithecous). The anther is a four-sided (tetragonal) structure consisting of four microsporangia located at the corners, two in each lobe.

                • Four wall layers of microsporangium: Epidermis, Endothecium, Middle layers (perform the function of protection and help in dehiscence of anther to release pollen), and the innermost Tapetum (nourishes the developing pollen grains; possesses dense cytoplasm and generally polyploid/multinucleate).

                • Sporogenous tissue occupies the centre of each microsporangium in a young anther. Each cell of the sporogenous tissue is a microspore mother cell (PMC) capable of giving rise to a microspore tetrad through meiosis.

                • Pollen Grain (male gametophyte): Two-layered wall. Outer exine is made of sporopollenin — one of the most resistant organic materials known (withstands high temperatures, strong acids and alkali; no enzyme that degrades sporopollenin is known). Exine has prominent apertures called germ pores where sporopollenin is absent. Inner wall is intine (thin, continuous made of cellulose and pectin).

                • At pollination, pollen grains are shed at the 2-celled stage (vegetative cell + generative cell) in over 60% of angiosperms; in the remaining species, the generative cell divides mitotically into two male gametes before shedding (3-celled stage).

                ★ HIGHLIGHT — Sporopollenin enables pollen grains to be preserved as pristine fossils for millions of years without biodegradation.

                ⚠ EXAM TRAP — Pollen allergy is caused by Parthenium (carrot grass) introduced as a contaminant with imported wheat; it causes chronic respiratory disorders including asthma and bronchitis.



                1.2.2 The Pistil, Megasporangium (ovule) and Embryo sac

                • The gynoecium represents the female reproductive organ. Monocarpellary (single pistil) or multicarpellary (syncarpous when fused, e.g., Papaver; apocarpous when free, e.g., Michelia).

                • Three parts of a pistil: Stigma (landing platform for pollen), Style (elongated slender tract), and Ovary (basal bulged part containing locules and placenta).

                • The ovule (megasporangium) is attached to the placenta by the funicle. Hilum is the junction between ovule and funicle. Integuments surround the nucellus except at the micropyle. Opposite the micropyle is the chalaza (basal part).

                • Megasporogenesis: Formation of megaspores from megaspore mother cell (MMC) via meiosis. One functional megaspore develops into the female gametophyte (monosporic development).

                • Typical female gametophyte (embryo sac) at maturity is 8-nucleate and 7-celled: 3 cells at the micropylar end form the egg apparatus (one egg cell + two synergids with filiform apparatus), 3 cells at the chalazal end are antipodals, and a large central cell with two polar nuclei.

                ★ HIGHLIGHT — The filiform apparatus present at the micropylar tip of synergids plays a crucial role in guiding pollen tubes into the synergid.



                1.3 DOUBLE FERTILISATION

                • Pollen tube enters one of the synergids through the filiform apparatus and releases two male gametes into the cytoplasm of the synergid.

                • Syngamy: One male gamete fuses with the egg nucleus to form the diploid zygote (2n).

                • Triple Fusion: The second male gamete fuses with the two polar nuclei in the central cell to produce the triploid Primary Endosperm Nucleus (PEN, 3n).

                ✔ KEY FORMULA — Double Fertilisation = Syngamy (Male gamete n + Egg n → Zygote 2n) + Triple Fusion (Male gamete n + 2 Polar nuclei 2n → PEN 3n).

                • The central cell after triple fusion becomes the primary endosperm cell (PEC) and develops into endosperm, while the zygote develops into an embryo.



                1.4 POST-FERTILISATION: STRUCTURES AND EVENTS

                • Endosperm development precedes embryo development to ensure assured nutrition for the developing embryo. In free-nuclear endosperm (e.g., coconut water), the PEN undergoes successive nuclear divisions without cell wall formation.

                • Embryogeny: Zygote gives rise to proembryo → globular → heart-shaped → mature embryo. Dicot embryo has an embryonal axis and two cotyledons; monocot embryo (grasses) has one cotyledon called scutellum.

                • Seed: The fertilised ovule becomes the seed. Non-albuminous/exalbuminous seeds (pea, groundnut, beans) consume endosperm completely before seed maturation. Albuminous seeds (wheat, maize, barley, castor, sunflower) retain part of the endosperm.

                • Pericarp: The wall of the ovary develops into the wall of fruit called pericarp. False fruits (apple, strawberry, cashew) have thalamus contributing to fruit formation; parthenocarpic fruits (banana) develop without fertilisation.



                1.5 APOMIXIS AND POLYEMBRYONY

                • Apomixis is a form of asexual reproduction that mimics sexual reproduction, producing seeds without fertilisation (common in Asteraceae and grasses).

                • Polyembryony: Occurrence of more than one embryo in a seed (frequent in Citrus and Mango, where maternal nucellar cells around embryo sac divide and protrude into the embryo sac).

                • High significance in hybrid agriculture: Hybrid seeds do not segregate characters when propagated through apomixis, saving farmers the cost of purchasing expensive hybrid seeds every year.

            """.trimIndent(),

            videoTitle = "Microsporogenesis, Megasporogenesis & Double Fertilisation in Angiosperms",

            videoDurationLabel = "32:45",

            videoInstructor = "Dr. Rohini Deshmukh (IISER Bhopal)",

            videoKeyTakeaways = "Sporopollenin chemistry • 7-celled 8-nucleate embryo sac organisation • Syngamy vs Triple Fusion energetics",

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