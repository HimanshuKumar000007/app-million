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