<!-- BEGIN math_ch_6 detailedStudyNotes -->
Introduction — Matrices: Tables That Obey Algebra
• A matrix looks like a humble table of numbers, but it is one of the hardest-working objects in the IAT syllabus: one matrix packages an entire system of equations, a determinant compresses that package into a single decisive number, and the inverse undoes the package completely. This chapter builds all three machines and teaches you when each one fires.
• DEFINITION — A matrix is a rectangular array of numbers arranged in rows and columns. A matrix with m rows and n columns has order m x n, and the entry in row i and column j is written a_ij — row first, column second, always.
• NOTATION used throughout this chapter — a matrix is written in row text form: A = [1 2; 3 4] means row 1 is 1, 2 and row 2 is 3, 4; the semicolon separates the rows. The determinant of A is written det A or |A|, the inverse is written A^-1, and the transpose is written A^T.
• EXAMPLE — The system x + y = 5 and 2x - y = 1 is the single matrix equation AX = B with A = [1 1; 2 -1], X = [x; y] and B = [5; 1]. Its solution x = 2, y = 3 is hiding inside A — and by the end of this chapter you will extract it three different ways.
• WHY matrices run everything — geometry transformations, systems of equations, Markov chains and half of physics are matrix computations in costume. The IAT tests the costume changes: the same determinant reappears as an area, as a consistency verdict and as the key to an inverse.
★ HIGHLIGHT — The chapter in one breath: matrices add entry-by-entry but multiply row-into-column; determinants obey scaling laws where the order n is an exponent, not a factor; the inverse is the adjugate divided by the determinant; and a system AX = B has a unique solution exactly when det A is not zero.
⚠ EXAM TRAP — Order and index discipline: a 2 x 3 matrix has 2 rows and 3 columns, never the reverse, and a_21 lives in row 2, column 1. Half the silly errors in this chapter are committed before any algebra begins.

Meet the Cast — Types of Matrices
• DEFINITION — A row matrix has exactly one row and a column matrix exactly one column. A square matrix has equally many rows and columns; a square matrix of order n is the only kind that owns a determinant and, possibly, an inverse.
• DEFINITION — The zero matrix has every entry 0 and is written 0. A diagonal matrix is square with every off-diagonal entry 0. A scalar matrix is a diagonal matrix whose diagonal entries are all equal, and the identity matrix I is the scalar matrix with 1s on the diagonal.
• DEFINITION — A symmetric matrix satisfies A^T = A, equivalently a_ij = a_ji for all i, j: it mirrors perfectly across its main diagonal, like A = [1 2; 2 3].
• DEFINITION — A skew-symmetric matrix satisfies A^T = -A, equivalently a_ij = -a_ji. Setting i = j forces a_ii = -a_ii, so every diagonal entry of a skew-symmetric matrix is 0 — as in [0 2; -2 0].
• Counting the freedom: an n x n symmetric matrix has only n(n + 1)/2 independent entries — 6 for n = 3 — because the mirror copies the rest. A skew-symmetric matrix has n(n - 1)/2 — 3 for n = 3 — because its diagonal is nailed to zero.
• EXAMPLE — The matrix [2 0 0; 0 2 0; 0 0 2] is scalar (it is 2I), while [1 0 0; 0 5 0; 0 0 9] is diagonal but not scalar: its diagonal entries differ. Every scalar matrix is diagonal; the converse is false.
⚠ EXAM TRAP — Symmetric demands equality across the diagonal; skew-symmetric demands negation AND a zero diagonal. The matrix [0 1; 1 0] looks antisymmetric but is actually symmetric — the sign check is on A^T, not on appearances.
• YOUR TURN — Is [0 3; -3 0] skew-symmetric? Answer — yes: its transpose is [0 -3; 3 0], which is exactly its negative, and the diagonal is already zero.

Matrix Algebra — Addition and Scalar Multiplication
• DEFINITION — Two matrices of the SAME order add entry by entry: (A + B)_ij = a_ij + b_ij. Matrices of different orders cannot be added at all — the operation simply does not exist.
• Addition is polite algebra: it commutes (A + B = B + A), it associates, the zero matrix is its identity, and every A has an additive inverse -A with A + (-A) = 0.
✔ KEY FORMULA — Scalar multiplication hits EVERY entry: (kA)_ij = k a_ij. It obeys k(A + B) = kA + kB and (k + l)A = kA + lA — the distributive laws that let you solve matrix equations exactly like number equations.
• EXAMPLE — A = [1 2; 3 4] and B = [5 -1; 0 2] give A + B = [6 1; 3 6] and 2A - B = [2 - 5, 4 + 1; 6 - 0, 8 - 2] = [-3 5; 6 6]. Entry by entry, no surprises — addition is the calm before the multiplication storm.
• WORKED PATTERN — Matrix equations solve like scalar ones: from X + Y = P and X - Y = Q, add to get 2X = P + Q, so X = (P + Q)/2 and Y = (P - Q)/2. Whenever unknowns appear in symmetric pairs, add and subtract the equations before reaching for anything heavier.
⚠ EXAM TRAP — There is no entry-wise multiplication in matrix algebra: the product AB is not [a_ij b_ij]. Students who multiply corresponding entries are computing a different operation that this chapter never uses.
• YOUR TURN — For A = [2 -1; 0 5] and B = [1 3; -2 1], find A - 2B. Answer — [2 - 2, -1 - 6; 0 + 4, 5 - 2] = [0 -7; 4 3].

Matrix Multiplication — the Row-times-Column Machine
• DEFINITION — The product AB exists exactly when the number of COLUMNS of A equals the number of ROWS of B. If A is m x n and B is n x p, then AB is m x p, and its (i, j) entry is row i of A dotted with column j of B: (AB)_ij = a_i1 b_1j + a_i2 b_2j + ... + a_in b_nj.
✔ KEY FORMULA — Dimension flow: (m x n) x (n x p) = (m x p). The inner numbers must match and they cancel; the outer numbers survive as the order of the product. Check dimensions before computing a single entry.
• EXAMPLE — A = [1 2 3; 4 5 6] is 2 x 3 and B = [7 8; 9 10; 11 12] is 3 x 2, so AB is 2 x 2: AB = [58 64; 139 154]. Watch the (1, 1) entry being born: 1 x 7 + 2 x 9 + 3 x 11 = 7 + 18 + 33 = 58 — the first row of A marched along the first column of B.
• EXAMPLE — The reverse product BA is 3 x 3: BA = [39 54 69; 49 68 87; 59 82 105]. So AB and BA can differ even in size. Multiplication is the first operation in this chapter where order is not a detail — it is the whole game.
• EXAMPLE — Even with matching square orders, A = [1 2; 3 4] and B = [0 1; 0 0] give AB = [0 1; 0 3] but BA = [3 4; 0 0]. Matrix multiplication does NOT commute: AB = BA is a special event, never a default.
• Zero divisors exist here: [1 0; 0 0] x [0 0; 0 1] = [0 0; 0 0], the zero matrix, although neither factor is zero. The familiar law "product zero means a factor is zero" dies at the matrix border.
• Powers and identities behave: A^2 = A A, A^3 = A A A, and AI = IA = A for the identity of matching order. But binomial expansions break: (A + B)^2 = A^2 + AB + BA + B^2, with both cross terms in their own order.
• EXAMPLE — With A and B as above, (A + B)^2 = [10 15; 15 25], while the school formula A^2 + 2AB + B^2 would give [7 12; 15 28]. The two disagree because AB and BA disagree; the cross terms must be kept separate.
⚠ EXAM TRAP — Three multiplication wounds: assuming AB = BA; cancelling a matrix factor (from AB = AC you may conclude B = C only if A is invertible); and concluding A = 0 or B = 0 from AB = 0. All three are planted as options every year.
• YOUR TURN — For A = [2 0; 1 3] and B = [1 4; 0 2], find AB. Answer — [2 x 1 + 0 x 0, 2 x 4 + 0 x 2; 1 x 1 + 3 x 0, 1 x 4 + 3 x 2] = [2 8; 1 10].

Transpose — and the Symmetric-Skew Split
• DEFINITION — The transpose A^T of a matrix is obtained by interchanging its rows and columns: the (i, j) entry of A^T is the (j, i) entry of A. An m x n matrix transposes to an n x m matrix.
✔ KEY FORMULA — Transpose laws: (A^T)^T = A; (A + B)^T = A^T + B^T; (kA)^T = k A^T; and the famous one — (AB)^T = B^T A^T, the order of the factors REVERSES.
• EXAMPLE — For A = [1 2; 3 4] and B = [0 1; 0 0], AB = [0 1; 0 3] so (AB)^T = [0 0; 1 3]. Separately, B^T = [0 0; 1 0] and A^T = [1 3; 2 4], and B^T A^T = [0 x 1 + 0 x 2, 0 x 3 + 0 x 4; 1 x 1 + 0 x 2, 1 x 3 + 0 x 4] = [0 0; 1 3]. Same matrix — the reversal law survives its audit.
✔ KEY FORMULA — Every square matrix splits uniquely into a symmetric plus a skew-symmetric part: A = (A + A^T)/2 + (A - A^T)/2, where the first piece is always symmetric and the second is always skew-symmetric with zero diagonal.
• EXAMPLE — A = [3 5; 1 2] has A^T = [3 1; 5 2]. The symmetric part is (A + A^T)/2 = [3 3; 3 2] and the skew part is (A - A^T)/2 = [0 2; -2 0]. Add them: [3 5; 1 2] — A is rebuilt exactly, and each piece passes its own symmetry test.
• WHY the split matters — it is the standard IAT decomposition question, and it also proves that symmetric and skew-symmetric matrices together span all square matrices: nothing is left over.
⚠ EXAM TRAP — (AB)^T is B^T A^T, not A^T B^T. If you ever doubt it mid-exam, test it on dimensions alone: A^T B^T usually does not even have compatible inner dimensions.
• YOUR TURN — Write the symmetric part of A = [1 4; 2 3]. Answer — (A + A^T)/2 = ([1 4; 2 3] + [1 2; 4 3])/2 = [2 6; 6 6]/2 = [1 3; 3 3].

Determinants I — Evaluating 2x2 and 3x3
• DEFINITION — A determinant is a single number assigned to a SQUARE matrix. It is written det A or |A|, and it measures, among other things, how the matrix scales areas and whether the matrix can be inverted at all.
✔ KEY FORMULA — For a 2 x 2 matrix, |a b; c d| = ad - bc: main diagonal product minus the anti-diagonal product. EXAMPLE — |3 1; 2 4| = 3 x 4 - 1 x 2 = 10.
✔ KEY FORMULA — For 3 x 3, expand along any row or column with the checkerboard of signs + - + / - + - / + - +. Along row 1: det = a11 C11 + a12 C12 + a13 C13, where each cofactor Cij is plus-or-minus the minor left after deleting row i and column j.
• EXAMPLE — |1 2 3; 4 5 6; 7 8 10| = 1 x (5 x 10 - 6 x 8) - 2 x (4 x 10 - 6 x 7) + 3 x (4 x 8 - 5 x 7) = 1 x 2 - 2 x (-2) + 3 x (-3) = 2 + 4 - 9 = -3.
• The Sarrus shortcut for 3 x 3: copy the first two columns to the right, add the three downward diagonal products, subtract the three upward ones. EXAMPLE — |2 1 0; 1 3 1; 0 1 2|: downward products 2 x 3 x 2 + 1 x 1 x 0 + 0 x 1 x 1 = 12; upward products 0 x 3 x 0 + 1 x 1 x 2 + 2 x 1 x 1 = 4; determinant = 12 - 4 = 8.
• DEFINITION — A square matrix with det A = 0 is called singular; with det A not zero, non-singular. Singular is the chapter's alarm word: it will mean no inverse, no unique solution, collapsed area.
• Triangular shortcut: if a matrix is upper or lower triangular, its determinant is simply the product of its diagonal entries. EXAMPLE — |2 1 5; 0 3 4; 0 0 4| = 2 x 3 x 4 = 24, whatever the entries above the diagonal are doing.
⚠ EXAM TRAP — Sarrus works ONLY for 3 x 3 — it collapses for 4 x 4, where cofactor expansion or row operations are the honest tools. And a determinant is a number, not a matrix: |A| = -3 is a complete answer.
• YOUR TURN — Evaluate |5 2; 3 1|. Answer — 5 x 1 - 2 x 3 = -1.

Determinants II — Properties and Shortcuts
• Professional determinant work is property work: raw expansion is the last resort. Each property below is a shortcut, and each comes with its own favourite trap.
✔ KEY FORMULA — Transposing changes nothing: det(A^T) = det A. Every row property in this section has an identical column twin.
✔ KEY FORMULA — Swapping two rows (or two columns) flips the sign of the determinant. Swapping twice restores it — two sign flips cancel.
✔ KEY FORMULA — If two rows are identical, or one is a constant multiple of another, the determinant is 0. EXAMPLE — |1 2 3; 4 5 6; 7 8 9| = 0: the row differences R2 - R1 and R3 - R2 both equal [3 3 3], so the rows are chained together and the determinant collapses. Rows in arithmetic progression always do this.
✔ KEY FORMULA — A factor taken out of ONE row multiplies the determinant by that factor once. But scaling the WHOLE n x n matrix scales the determinant by k^n: det(kA) = k^n det A, because each of the n rows contributes one factor of k.
• EXAMPLE — For A = [1 0 2; 2 1 0; 0 1 1] with det A = 5, the matrix 3A has det(3A) = 3^3 x 5 = 135. For the 2 x 2 matrix [1 2; 3 4] with det -2, det(2A) = 2^2 x (-2) = -8. The exponent is the order — that is the entire trap, and it is worth several marks a year.
✔ KEY FORMULA — Adding a multiple of one row to another row leaves the determinant unchanged: R_i replaced by R_i + c R_j changes nothing. This is the workhorse operation — use it to manufacture zeros, then expand along the emptied row or column.
✔ KEY FORMULA — Determinants multiply over products: det(AB) = det A x det B. EXAMPLE — A = [1 2; 3 4] has det -2 and B = [2 0; 1 1] has det 2; their product AB = [4 2; 10 4] has det 16 - 20 = -4, exactly (-2) x 2.
• The factor-extraction jewel: the Vandermonde determinant |1 1 1; a b c; a^2 b^2 c^2| = (a - b)(b - c)(c - a). With a = 1, b = 2, c = 3 it gives (1 - 2)(2 - 3)(3 - 1) = 2 — recognising the pattern turns a page of expansion into one line.
• WORKED PATTERN — Before expanding any determinant, scan it: equal or proportional rows (instant zero), a row or column rich in zeros (expand there), a common factor in a row (pull it out), or an AP/GP pattern in the entries (subtract neighbouring rows). Thirty seconds of scanning routinely replaces five minutes of arithmetic.
⚠ EXAM TRAP — Determinants do NOT add: det(A + B) is not det A + det B. Witness A = [1 2; 3 4] with det -2 and B = [0 1; 0 0] with det 0: A + B = [1 3; 3 4] has det 4 - 9 = -5, not -2. Addition lives at matrix level; the determinant is computed afterwards, whole.
• YOUR TURN — Evaluate the determinant with rows (2, 4) and (1, 2). Answer — 0: the first row is exactly twice the second, so the determinant vanishes without any expansion.

Minors, Cofactors and the Adjugate
• DEFINITION — The minor M_ij of the entry a_ij is the determinant of the smaller matrix left after deleting row i and column j of A. The cofactor is the signed minor: C_ij = (-1)^(i + j) M_ij, with signs following the checkerboard + - + / - + - / + - +.
✔ KEY FORMULA — The determinant is the sum of entries times cofactors along ANY single row or column: det A = a_11 C_11 + a_12 C_12 + a_13 C_13 along row 1, and similarly for every other line. Expand along the line with the most zeros.
• EXAMPLE — For A = [1 2 3; 0 1 4; 5 6 0], three cofactors of row 1: C_11 = +(1 x 0 - 4 x 6) = -24; C_12 = -(0 x 0 - 4 x 5) = 20; C_13 = +(0 x 6 - 1 x 5) = -5. The full cofactor matrix of A is [-24 20 -5; 18 -15 4; 5 -4 1].
• DEFINITION — The adjugate (or adjoint) of A, written adj A, is the TRANSPOSE of the cofactor matrix. The transpose is not a formality — it is what makes the next identity work.
✔ KEY FORMULA — The master identity: A x adj(A) = adj(A) x A = (det A) I. Every diagonal entry of the product is det A itself; every off-diagonal entry is an entry-times-foreign-cofactor sum, which always vanishes.
• Adjoint properties worth their own line: |adj A| = |A|^(n - 1) for an n x n matrix, and adj(adj A) = |A|^(n - 2) A. EXAMPLE — for A = [1 2; 3 4], adj A = [4 -2; -3 1] and |adj A| = 4 - 6 = -2 = |A|^(2 - 1); and applying adj twice returns A itself, exactly as |A|^(2 - 2) A = A promises.
• EXAMPLE — The adjugate of the 3 x 3 matrix A = [1 2 3; 0 1 4; 5 6 0] is the transpose of its cofactor matrix: adj A = [-24 18 5; 20 -15 -4; -5 4 1]. Keep this matrix in view — the next section divides it by det A = 1 and calls it the inverse.
⚠ EXAM TRAP — The cofactor checkerboard starts with + at (1, 1) and alternates; the (1, 2), (2, 1), (2, 3) and (3, 2) positions carry minus signs. And adj A is the transpose of the cofactor matrix — students who forget the transpose build a wrong inverse that fails its audit.
• YOUR TURN — Find the cofactor of the entry 4 in A = [1 2; 3 4]. Answer — the entry sits at (2, 2); deleting row 2 and column 2 leaves the minor 1, and the sign (-1)^(2 + 2) is +, so C_22 = 1.

The Inverse of a Matrix
• DEFINITION — A square matrix A is invertible when there is a matrix A^-1 with A A^-1 = A^-1 A = I. The inverse exists exactly when det A is not zero: singular matrices have no inverse, full stop.
✔ KEY FORMULA — A^-1 = adj(A) / det A. The recipe: compute the cofactor matrix, transpose it to get the adjugate, divide every entry by the determinant.
✔ KEY FORMULA — The 2 x 2 shortcut: [a b; c d]^-1 = (1/(ad - bc)) x [d -b; -c a] — swap the diagonal entries, negate the off-diagonal entries, divide by the determinant.
• EXAMPLE — [1 2; 3 4]^-1 = (1/-2) x [4 -2; -3 1] = [-2 1; 3/2 -1/2]. Audit: [1 2; 3 4] x [-2 1; 3/2 -1/2] = [-2 + 3, 1 - 1; -6 + 6, 3 - 2] = [1 0; 0 1]. An inverse that does not multiply back to I is not an inverse — run the audit.
• EXAMPLE — For A = [1 2 3; 0 1 4; 5 6 0] with det A = 1, the inverse equals the adjugate itself: A^-1 = [-24 18 5; 20 -15 -4; -5 4 1]. A determinant of 1 makes the inverse an all-integer matrix — examiners plant this gift deliberately.
• EXAMPLE — For A = [2 1 1; 1 2 1; 1 1 2] with det A = 4, the inverse is A^-1 = (1/4) x [3 -1 -1; -1 3 -1; -1 -1 3]: diagonal entries 3/4, off-diagonal entries -1/4. Symmetric matrices have symmetric inverses — use it as a free check.
✔ KEY FORMULA — Inverse laws: (AB)^-1 = B^-1 A^-1 (order reverses, like the transpose); (A^-1)^-1 = A; (A^T)^-1 = (A^-1)^T; and |A^-1| = 1/|A|.
⚠ EXAM TRAP — There is no division by a matrix: the expression B/A does not exist. To "divide" an equation AX = B you multiply by A^-1 on the correct side — X = A^-1 B, with the inverse on the LEFT, because matrix multiplication does not commute.
• YOUR TURN — Find the inverse of [2 0; 0 3]. Answer — it is diagonal, so invert entry by entry: [1/2 0; 0 1/3]. Audit: the product with the original is I.

Area of a Triangle and Collinearity
✔ KEY FORMULA — The area of the triangle with vertices (x1, y1), (x2, y2), (x3, y3) is (1/2) x |D|, where D is the determinant with rows (x1, y1, 1), (x2, y2, 1), (x3, y3, 1). The third column of 1s is what lets one determinant hold three points at once.
• EXAMPLE — Vertices (1, 2), (3, 4), (5, 3): D = 1 x (4 x 1 - 1 x 3) - 2 x (3 x 1 - 1 x 5) + 1 x (3 x 3 - 4 x 5) = 1 + 4 - 11 = -6, so the area is (1/2) x |-6| = 3 square units. The negative sign only records that the vertices were listed clockwise — area itself is never negative.
✔ KEY FORMULA — Three points are collinear exactly when their area determinant is 0. The determinant is simultaneously an area machine and a flatness alarm — the same philosophy as the scalar triple product for volumes in the Vectors chapter.
• EXAMPLE — The points (1, 1), (2, 3), (3, 5) give D = 1 x (3 - 5) - 1 x (2 - 3) + 1 x (10 - 9) = -2 + 1 + 1 = 0, so they are collinear — indeed all three lie on the line y = 2x - 1.
• WORKED PATTERN — Unknown-coordinate problems: if a vertex carries a parameter, write the area formula, set the expression equal to the given area (or to zero for collinearity), and solve. The determinant is linear in any single coordinate, so the equation never fights back.
⚠ EXAM TRAP — Two wounds: dropping the factor 1/2, and reporting a negative area when the vertex order makes D negative. The 1/2 and the absolute value are both part of the formula — write them before you expand.
• YOUR TURN — Find the area of the triangle with vertices (0, 0), (4, 0), (0, 3). Answer — the determinant with rows (0, 0, 1), (4, 0, 1), (0, 3, 1) is 12, so the area is 6 — matching the school formula (1/2) x base 4 x height 3.

Systems of Linear Equations — the Matrix Method
• Every system of linear equations is one matrix equation: AX = B, where A holds the coefficients, X the unknowns and B the constants. The whole theory of systems is the theory of this one line.
✔ KEY FORMULA — If det A is not zero, A^-1 exists and the system has the UNIQUE solution X = A^-1 B. One inverse unlocks the entire system at a stroke — and the same inverse solves the system again for any other right-hand side B.
• EXAMPLE — Solve 2x + y = 7 and x - y = 2. Here A = [2 1; 1 -1] with det A = -3, and A^-1 = (1/-3) x [-1 -1; -1 2] = [1/3 1/3; 1/3 -2/3]. Then X = A^-1 B gives x = 7/3 + 2/3 = 3 and y = 7/3 - 4/3 = 1. Audit in the original equations: 2 x 3 + 1 = 7 and 3 - 1 = 2. Solved and certified.
• EXAMPLE — The 3 x 3 system x + y + z = 6, x - y + z = 2, 2x + y - z = 1 has det A = 6 and adj A = [0 2 2; 3 -3 0; 3 1 -2], so X = (1/6) adj A x B works out to x = 1, y = 2, z = 3. The full computation is Worked Example 4 below — notice how the adjugate, built once, does all the work.
• WHY the determinant decides — det A = 0 means the coefficient rows are chained together (one is a combination of the others), so the equations cannot pin down every unknown independently. A non-zero determinant means genuinely independent equations — exactly enough information for exactly one solution.
⚠ EXAM TRAP — X = A^-1 B has the inverse on the LEFT of B. Writing B A^-1 is not a harmless slip: for non-square B it is not even defined, and for square systems it solves a different problem.
• YOUR TURN — Solve x + y = 4 and x - y = 2 by the matrix method. Answer — det A = -2, A^-1 = [1/2 1/2; 1/2 -1/2], so x = 4/2 + 2/2 = 3 and y = 4/2 - 2/2 = 1.

▸ Consistency — Unique, None or Infinite
• When det A = 0 the matrix method stalls, and the system falls into one of two failure modes: no solution at all (inconsistent) or infinitely many (dependent equations). The adjugate separates them.
✔ KEY FORMULA — The consistency test: if det A is not zero, the solution is unique. If det A = 0 and (adj A) B is not the zero vector, the system is INCONSISTENT — no solution. If det A = 0 and (adj A) B = 0, the system MAY have infinitely many solutions — confirm by inspecting the equations, because this direction of the test is a possibility, not a guarantee.
• Geometry makes it visible (see this section's figure): two lines in a plane meet once (unique, det not zero), run parallel (no solution, det zero), or lie on top of each other (infinite, det zero). For three equations, the lines become planes with the same three fates.
• EXAMPLE — The system x + y = 1 and 2x + 2y = k has det A = 0 and (adj A) B = (2 - k, k - 2). If k is not 2, this is nonzero and the system has NO solution — the lines are parallel and distinct. If k = 2, (adj A) B = 0 and the second equation is just the first doubled: infinitely many solutions on the line x + y = 1.
• EXAMPLE — The system x + y + z = 1, x + 2y + 3z = 2, x + 3y + 5z = 4 has det A = 0 and (adj A) B = (1, -2, 1), which is not zero — so it has no solution. Subtracting the first equation from the others exposes why: they demand y + 2z = 1 and 2y + 4z = 3 simultaneously, and the second is not twice the first.
• WORKED PATTERN — Consistency questions in the IAT almost always hide a parameter: compute det A, factor it, and the critical parameter values fall out. Then test (adj A) B at each critical value to split "no solution" from "infinite". Two computations, full marks.
⚠ EXAM TRAP — det A = 0 does NOT automatically mean "no solution" — that reflex is the single most expensive error in this chapter. Zero determinant means "not unique": the adjugate test decides whether the system is impossible or under-determined.
• YOUR TURN — Classify the system 3x + y = 6 and 6x + 2y = 12. Answer — the second equation is exactly twice the first, det A = 0 with (adj A) B = 0, and the system has infinitely many solutions.

Cramer's Rule and Homogeneous Systems
• DEFINITION — Cramer's rule solves a non-singular system by determinants alone: x = Dx / D, y = Dy / D, z = Dz / D, where D = det A and Dx is D with the x-column replaced by the constants B, and similarly for the others. It is elegant for 2 x 2, heavy for 3 x 3, and dead when D = 0.
• EXAMPLE — For 2x + y = 7 and x - y = 2: D = -3, Dx = |7 1; 2 -1| = -7 - 2 = -9 and Dy = |2 7; 1 2| = 4 - 7 = -3, giving x = (-9)/(-3) = 3 and y = (-3)/(-3) = 1 — the same answer the inverse produced, as it must.
• DEFINITION — A homogeneous system AX = 0 has all constants zero. It always admits the trivial solution X = 0; the only question is whether anything else survives.
✔ KEY FORMULA — A homogeneous system has a NON-TRIVIAL solution exactly when det A = 0, and then it has infinitely many. If det A is not zero, the zero solution is the only one.
• EXAMPLE — The system x + y + z = 0, 2x - y + z = 0, x + 2y - z = 0 has det A = 7, not zero — so x = y = z = 0 is the complete solution set, however hard the equations try to look roomy.
• EXAMPLE — The system x + y + z = 0, x - y + z = 0, -x + y - z = 0 has det A = 0 (its third row is exactly the negative of its second row), and indeed (x, y, z) = (1, 0, -1) is a non-trivial solution: 1 + 0 - 1 = 0, 1 - 0 - 1 = 0, -1 + 0 + 1 = 0. Every scalar multiple of it is a solution too.
⚠ EXAM TRAP — For homogeneous systems the adjugate test is pointless — (adj A) B is automatically 0 since B = 0. The determinant alone delivers the whole verdict: zero means non-trivial solutions exist; non-zero means only the trivial one.
• YOUR TURN — Does x + 2y = 0 and 2x + 4y = 0 have non-trivial solutions? Answer — yes: the determinant is 1 x 4 - 2 x 2 = 0, and every (x, y) = (-2t, t) works.

Cayley-Hamilton — a Matrix Obeys Its Own Equation
• DEFINITION — The characteristic equation of a square matrix A is det(A - lambda I) = 0. For a 2 x 2 matrix it always takes the shape lambda^2 - (tr A) lambda + det A = 0, where tr A is the trace, the sum of the diagonal entries.
✔ KEY FORMULA — The Cayley-Hamilton theorem: every square matrix satisfies its OWN characteristic equation. For 2 x 2: A^2 - (tr A) A + (det A) I = 0. The matrix is a root of its own polynomial.
• EXAMPLE — A = [1 2; 3 4] has trace 5 and determinant -2, so it must obey A^2 - 5A - 2I = 0. Audit: A^2 = [7 10; 15 22], and A^2 - 5A - 2I = [7 - 5 - 2, 10 - 10 - 0; 15 - 15 - 0, 22 - 20 - 2] = [0 0; 0 0]. The theorem survives a full numerical audit.
• PAYOFF 1 — Inverses for free: from A^2 - 5A - 2I = 0, factor A out: A(A - 5I) = 2I, so A^-1 = (A - 5I)/2 = ([1 2; 3 4] - [5 0; 0 5])/2 = [-2 1; 3/2 -1/2] — the same inverse the adjugate produced, with no cofactors at all.
• PAYOFF 2 — Powers collapse: from A^2 = 5A + 2I, every higher power reduces to a combination of A and I. So A^3 = 5A^2 + 2A = 5[7 10; 15 22] + 2[1 2; 3 4] = [37 54; 81 118] — verified against direct multiplication.
• For a 3 x 3 matrix the characteristic equation is cubic, so every power of A reduces to a quadratic form a A^2 + b A + c I. The pattern is the point: Cayley-Hamilton turns infinite towers of powers into two or three matrix ingredients.
⚠ EXAM TRAP — The characteristic equation uses det(A - lambda I), not det(A + lambda I), and the 2 x 2 template carries PLUS det A: A^2 - (tr A) A + (det A) I = 0. Sign slips in either place poison both payoffs.
• YOUR TURN — Write the Cayley-Hamilton equation of A = [2 0; 0 3]. Answer — trace 5, determinant 6, so A^2 - 5A + 6I = 0; indeed each diagonal entry separately satisfies t^2 - 5t + 6 = 0.

Formula Sheet
✔ Multiplication gate: (m x n) x (n x p) = (m x p); entry (i, j) is row i of A dotted with column j of B; AB is not BA in general, and (A + B)^2 = A^2 + AB + BA + B^2
✔ Transpose: (A^T)^T = A; (A + B)^T = A^T + B^T; (kA)^T = k A^T; (AB)^T = B^T A^T — the factors reverse
✔ Symmetric means A^T = A; skew-symmetric means A^T = -A with zero diagonal; every square A = (A + A^T)/2 + (A - A^T)/2, symmetric part plus skew part
✔ Determinants: 2 x 2 gives ad - bc; 3 x 3 expands by cofactors or Sarrus; a triangular determinant is the product of its diagonal entries
✔ Determinant laws: swapping two rows flips the sign; identical or proportional rows give 0; a factor k from ONE row multiplies the determinant by k; det(kA) = k^n det A for order n; det(AB) = det A det B; det(A^T) = det A; R_i + c R_j leaves the determinant unchanged
✔ Cofactor C_ij = (-1)^(i + j) M_ij; adj A is the transpose of the cofactor matrix; A adj(A) = (det A) I; |adj A| = |A|^(n - 1); adj(adj A) = |A|^(n - 2) A
✔ Inverse: A^-1 = adj(A) / det A, existing exactly when det A is not 0; the 2 x 2 shortcut swaps the diagonal, negates the off-diagonal and divides by the determinant; (AB)^-1 = B^-1 A^-1; |A^-1| = 1/|A|
✔ Area of a triangle = (1/2)|D| with D built from rows (x, y, 1) for the three vertices; D = 0 is exactly the collinearity test
✔ Systems AX = B: det not 0 gives the unique X = A^-1 B; det = 0 with (adj A)B not zero gives no solution; det = 0 with (adj A)B = 0 may give infinitely many; homogeneous AX = 0 has non-trivial solutions exactly when det A = 0
✔ Cayley-Hamilton: A obeys its own characteristic equation; for 2 x 2, A^2 - (tr A) A + (det A) I = 0, which yields inverses and collapses all higher powers

Common Mistakes and Exam Traps
• MISTAKE 1 — Writing det(kA) = k det A
• Why it fails — The scalar k multiplies all n rows of an n x n matrix, and the determinant collects one factor of k from each row, so the true scaling is k^n, not k
• Correct principle — det(kA) = k^n det A: for a 3 x 3 matrix with det 5, det(3A) = 27 x 5 = 135, never 15
• MISTAKE 2 — Assuming AB = BA, or expanding (A + B)^2 as A^2 + 2AB + B^2
• Why it fails — Matrix multiplication does not commute, so the two cross products AB and BA are genuinely different matrices and cannot merge into 2AB
• Correct principle — Keep both cross terms in order: (A + B)^2 = A^2 + AB + BA + B^2, and never swap factors inside a product
• MISTAKE 3 — Concluding A = 0 or B = 0 from AB = 0, or cancelling in AB = AC
• Why it fails — Matrices have zero divisors: [1 0; 0 0] x [0 0; 0 1] = 0 with both factors nonzero; and cancellation is multiplication by an inverse, which a singular A does not have
• Correct principle — From AB = AC, conclude B = C only after confirming det A is not zero and left-multiplying by A^-1
• MISTAKE 4 — Building the adjugate without transposing the cofactor matrix
• Why it fails — A times the raw cofactor matrix does not produce (det A) I; the master identity needs the cofactors in transposed positions
• Correct principle — adj A = (cofactor matrix)^T, then A^-1 = adj(A)/det A; audit any inverse by multiplying it back against A
• MISTAKE 5 — Writing det(A + B) = det A + det B
• Why it fails — The determinant is not a linear function of the matrix: with det A = -2 and det B = 0, the sum A + B = [1 3; 3 4] has determinant -5, not -2
• Correct principle — Determinants multiply over products, det(AB) = det A det B, but they never split over sums; compute the sum first, then its determinant
• MISTAKE 6 — Mixing up the row-operation effects on a determinant
• Why it fails — Three operations have three different effects: swapping flips the sign, scaling a row by k scales the determinant by k, and adding a multiple of another row changes nothing; blending them corrupts every shortcut
• Correct principle — Swap: sign flips. Scale one row by k: det scales by k. Add c times another row: det unchanged. Say the trio aloud before any property problem
• MISTAKE 7 — Dropping the 1/2 or the absolute value in the area formula
• Why it fails — The determinant D is a signed double-area: it equals twice the area and can be negative when vertices are listed clockwise
• Correct principle — Area = (1/2)|D|, with both the half and the modulus written down before expanding
• MISTAKE 8 — Announcing "no solution" whenever det A = 0
• Why it fails — A zero determinant rules out only a UNIQUE solution; the system may still be dependent with infinitely many solutions, as x + y = 1 and 2x + 2y = 2 shows
• Correct principle — Run the adjugate test: det = 0 with (adj A)B nonzero means inconsistent; (adj A)B = 0 means possibly infinitely many — then inspect the equations
• MISTAKE 9 — Writing (AB)^-1 = A^-1 B^-1 or (AB)^T = A^T B^T
• Why it fails — Undoing a two-step process requires reversing the order: socks and shoes come off in the opposite order they went on, and both the inverse and the transpose obey this
• Correct principle — (AB)^-1 = B^-1 A^-1 and (AB)^T = B^T A^T — reversed factors, every time
• MISTAKE 10 — Losing cofactor signs in a 3 x 3 expansion
• Why it fails — The checkerboard + - + / - + - / + - + makes positions (1,2), (2,1), (2,3) and (3,2) negative; expanding with all plus signs flips four terms and wrecks everything downstream
• Correct principle — Write the sign grid before the minors, expand along the row or column with the most zeros, and audit the result with a second expansion or a property shortcut

Worked Examples — Basic to Challenging
• EXAMPLE 1 — THE COMMUTATIVITY SHOCK
• Problem — For A = [1 2; 3 4] and B = [0 1; 0 0], compute AB and BA and compare
• Given — Two 2 x 2 matrices; both products exist since the orders match
• Principle — Entry (i, j) of a product is row i of the left factor dotted with column j of the right factor
• Steps — AB: row 1 gives 1 x 0 + 2 x 0 = 0 and 1 x 1 + 2 x 0 = 1; row 2 gives 3 x 0 + 4 x 0 = 0 and 3 x 1 + 4 x 0 = 3, so AB = [0 1; 0 3]. BA: row 1 gives 0 x 1 + 1 x 3 = 3 and 0 x 2 + 1 x 4 = 4; row 2 is all zeros, so BA = [3 4; 0 0]
• Answer — AB = [0 1; 0 3] and BA = [3 4; 0 0]; they are completely different matrices
• Reasoning — Both products are legal and both computations are correct — the difference is the ORDER, which changes which rows meet which columns. This is the founding fact of matrix algebra
• Mistake to avoid — Computing one product and reporting it for both, or "fixing" the mismatch by swapping entries until the two agree
• EXAMPLE 2 — A DETERMINANT THAT VANISHES BY DESIGN
• Problem — Evaluate the determinant with rows (1, 2, 3), (4, 5, 6), (7, 8, 9) without full expansion
• Given — Rows in arithmetic progression: each row is the previous plus (3, 3, 3)
• Principle — Row operations of the form R_i + c R_j leave the determinant unchanged; proportional rows force it to zero
• Steps — Replace R2 by R2 - R1 to get (3, 3, 3), and R3 by R3 - R1 to get (6, 6, 6). Now R3 is exactly twice R2, so the determinant is 0. Audit by expansion: 1 x (45 - 48) - 2 x (36 - 42) + 3 x (32 - 35) = -3 + 12 - 9 = 0
• Answer — 0
• Reasoning — Any determinant whose rows or columns run in AP collapses this way: equal differences mean chained rows. Spot the structure first and the arithmetic is free
• Mistake to avoid — Grinding out all six Sarrus products when the AP pattern is visible; and its twin, claiming the determinant of ANY matrix with a pattern is zero — the pattern must chain the rows, as here
• EXAMPLE 3 — AN INVERSE WITH NO FRACTIONS
• Problem — Find the inverse of A = [1 2 3; 0 1 4; 5 6 0]
• Given — A 3 x 3 matrix; the cofactor matrix is [-24 20 -5; 18 -15 4; 5 -4 1] and det A = -24 + 40 - 15 = 1
• Principle — A^-1 = adj(A) / det A, where adj A is the transpose of the cofactor matrix
• Steps — Transpose the cofactor matrix to get adj A = [-24 18 5; 20 -15 -4; -5 4 1]. Since det A = 1, dividing changes nothing: A^-1 = adj A. Audit one entry of A A^-1: row 1 of A against column 1 of A^-1 gives 1 x (-24) + 2 x 20 + 3 x (-5) = -24 + 40 - 15 = 1, the (1, 1) entry of I
• Answer — A^-1 = [-24 18 5; 20 -15 -4; -5 4 1]
• Reasoning — A determinant of exactly 1 is the examiner's gift: the inverse is the adjugate untouched, all integers. Always compute det A first — it tells you how ugly the answer is allowed to be
• Mistake to avoid — Forgetting to transpose the cofactor matrix (you would report the cofactor matrix itself as the inverse), and skipping the multiplication audit
• EXAMPLE 4 — THE FULL MATRIX METHOD
• Problem — Solve x + y + z = 6, x - y + z = 2 and 2x + y - z = 1
• Given — Coefficient matrix A with rows (1, 1, 1), (1, -1, 1), (2, 1, -1), and B = (6, 2, 1)
• Principle — X = A^-1 B = (adj A / det A) B, valid because det A will turn out nonzero
• Steps — Expand: det A = 1 x (1 - 1) - 1 x (-1 - 2) + 1 x (1 + 2) = 0 + 3 + 3 = 6. The adjugate is adj A = [0 2 2; 3 -3 0; 3 1 -2]. Multiply: adj A x B = (0 x 6 + 2 x 2 + 2 x 1, 3 x 6 - 3 x 2 + 0 x 1, 3 x 6 + 1 x 2 - 2 x 1) = (6, 12, 18). Divide by 6: X = (1, 2, 3)
• Answer — x = 1, y = 2, z = 3
• Reasoning — Audit in all three equations: 1 + 2 + 3 = 6; 1 - 2 + 3 = 2; 2 + 2 - 3 = 1. The adjugate did the heavy lifting once, and the audit certifies the result in ten seconds
• Mistake to avoid — Stopping at det A: the determinant only licenses the method; the solution needs the full adjugate multiplication and the division by det A
• EXAMPLE 5 — ONE PARAMETER, THREE FATES
• Problem — Discuss the system x + y = 1 and 2x + 2y = k for every real value of k
• Given — Coefficient matrix A = [1 1; 2 2] and constants (1, k)
• Principle — det A = 0, so uniqueness is impossible; the adjugate test (adj A) B splits inconsistency from dependence
• Steps — det A = 1 x 2 - 1 x 2 = 0. The adjugate is adj A = [2 -1; -2 1], and (adj A) B = (2 - k, k - 2). Case k = 2: this is (0, 0), and indeed the second equation is the first doubled — infinitely many solutions, every point of the line x + y = 1. Case k not 2: (adj A) B is nonzero — the lines are parallel and distinct, so no solution exists
• Answer — k = 2 gives infinitely many solutions; every other k gives no solution; a unique solution never occurs
• Reasoning — The geometry and the algebra tell one story: the two lines coincide exactly when k matches, and the adjugate test is that geometric fact compressed into one multiplication
• Mistake to avoid — Answering "no solution for all k" from det A = 0 alone — the trap this whole section exists to disarm
• EXAMPLE 6 — AREA AND COLLINEARITY FROM ONE DETERMINANT
• Problem — (a) Find the area of the triangle with vertices (1, 2), (3, 4), (5, 3). (b) Show that (1, 1), (2, 3), (3, 5) are collinear
• Given — Three points per part; the area determinant D is built from rows (x, y, 1)
• Principle — Area = (1/2)|D|; collinearity is the statement D = 0
• Steps — (a) D = 1 x (4 - 3) - 2 x (3 - 5) + 1 x (9 - 20) = 1 + 4 - 11 = -6, so the area is (1/2) x 6 = 3. (b) D = 1 x (3 - 5) - 1 x (2 - 3) + 1 x (10 - 9) = -2 + 1 + 1 = 0, so the area vanishes and the points are collinear — all three satisfy y = 2x - 1
• Answer — (a) 3 square units. (b) The points are collinear, lying on y = 2x - 1
• Reasoning — One machine, two verdicts: a nonzero absolute value is an area, zero is a collinearity certificate. The sign of D only reports the orientation of the listing
• Mistake to avoid — Reporting -3 as the area in part (a): the half and the modulus are both compulsory, and area is a size, never negative
• EXAMPLE 7 — CAYLEY-HAMILTON DOES EVERYTHING
• Problem — For A = [1 2; 3 4]: verify the Cayley-Hamilton theorem, find A^-1 from it, and compute A^3
• Given — tr A = 5 and det A = -2, so the characteristic equation is lambda^2 - 5 lambda - 2 = 0
• Principle — A satisfies A^2 - 5A - 2I = 0; rearranged, this one identity yields the inverse and reduces every power
• Steps — A^2 = [7 10; 15 22], and A^2 - 5A - 2I = [7 - 5 - 2, 10 - 10; 15 - 15, 22 - 20 - 2] = [0 0; 0 0] — verified. From A(A - 5I) = 2I, read off A^-1 = (A - 5I)/2 = [-2 1; 3/2 -1/2]. From A^2 = 5A + 2I, multiply by A: A^3 = 5A^2 + 2A = 5[7 10; 15 22] + 2[1 2; 3 4] = [37 54; 81 118]
• Answer — A^-1 = [-2 1; 3/2 -1/2] and A^3 = [37 54; 81 118]
• Reasoning — One identity, three deliverables: the verification, an inverse with zero cofactors computed, and a cube obtained without ever multiplying A by A by A. This is why the subtitle of this chapter names the theorem
• Mistake to avoid — Writing the characteristic equation with the wrong sign on the determinant term: for 2 x 2 it is A^2 - (tr A) A + (det A) I = 0 — plus det A, always

Practice Questions — Self-Test Set
• Q1 — If A = [2 1; 0 3] and B = [1 0; 4 2], then AB equals: (A) [2 2; 12 6] (B) [6 2; 12 6] (C) [6 0; 12 6] (D) [2 0; 12 6]
• Q2 — The determinant |3 2; 1 4| equals: (A) 10 (B) 14 (C) -10 (D) 5
• Q3 — If A is a 4 x 4 matrix with det A = 2, then det(2A) equals: (A) 4 (B) 8 (C) 16 (D) 32
• Q4 — Which of the following matrices is skew-symmetric: (A) [0 1; 1 0] (B) [0 -3; 3 0] (C) [1 0; 0 1] (D) [0 2; 2 0]
• Q5 — The inverse of [2 0; 0 3] is: (A) [3 0; 0 2] (B) [1/2 0; 0 1/3] (C) [2 0; 0 3] (D) [0 1/2; 1/3 0]
• Q6 — The system 2x + y = 5 and 4x + 2y = 7 has: (A) a unique solution (B) no solution (C) infinitely many solutions (D) exactly two solutions
• Q7 — The determinant with rows (2, 0, 0), (0, 3, 0), (0, 0, 5) equals: (A) 0 (B) 6 (C) 30 (D) 10
• Q8 — The matrix A = [2 0; 0 3] satisfies which equation: (A) A^2 - 5A + 6I = 0 (B) A^2 + 5A + 6I = 0 (C) A^2 - 6A + 5I = 0 (D) A^2 - A + 6I = 0

▸ Answer Key with Explanations
• Q1 — Answer (B): AB = [2 x 1 + 1 x 4, 2 x 0 + 1 x 2; 0 x 1 + 3 x 4, 0 x 0 + 3 x 2] = [6 2; 12 6]. Misconception — option (A) multiplies entry by entry, which is not matrix multiplication; every entry of AB is a full row-times-column sum
• Q2 — Answer (A): 3 x 4 - 2 x 1 = 10. Misconception — option (B) 14 adds the two products instead of subtracting; the anti-diagonal product is always taken away
• Q3 — Answer (D): det(2A) = 2^4 x det A = 16 x 2 = 32. Misconception — option (B) 8 applies the one-row scaling rule to the whole matrix; scaling all four rows collects one factor of 2 from each, and the exponent is the order, 4
• Q4 — Answer (B): its transpose is [0 3; -3 0], its own negative, and the diagonal is zero. Misconception — options (A) and (D) are symmetric, not skew: their transposes equal themselves. A skew-symmetric matrix must negate under transpose AND have a zero diagonal
• Q5 — Answer (B): a diagonal matrix inverts entry by entry, reciprocals on the diagonal. Misconception — option (D) swaps the reciprocals off the diagonal; the inverse of a diagonal matrix stays diagonal
• Q6 — Answer (B): the second left side is exactly twice the first, but 7 is not twice 5 — the lines are parallel and distinct. Misconception — option (C) would need the constants to double as well; proportional coefficients with unproportional constants means inconsistency
• Q7 — Answer (C): a diagonal (indeed triangular) determinant is the product of its diagonal entries, 2 x 3 x 5 = 30. Misconception — option (B) 6 multiplies only the first two entries; every diagonal entry is a factor
• Q8 — Answer (A): tr A = 5 and det A = 6, so Cayley-Hamilton gives A^2 - 5A + 6I = 0 — check the (1, 1) entry: 4 - 10 + 6 = 0. Misconception — option (C) swaps the roles of trace and determinant; the trace multiplies A, the determinant multiplies I

Chapter Summary, Revision Checklist and Self-Assessment
• The whole chapter is three machines: matrix algebra (entries, products, transposes), the determinant (one number obeying scaling laws), and the inverse (adjugate over determinant) — with systems of equations as the arena where all three meet
• Addition is entry-wise and calm; multiplication is row-into-column, order-sensitive, and home to zero divisors — check dimensions first and never assume AB = BA
• Determinant audit trail: transpose free, swap flips sign, proportional rows kill, one-row factor k counts once, whole-matrix factor k counts k^n times, det(AB) = det A det B, and det(A + B) splits over nothing
• Inverse audit trail: cofactors, transpose to adjugate, divide by det — then multiply back to I as a compulsory audit; det A = 1 makes the inverse integral, det A = 0 makes it nonexistent
• Systems audit trail: det nonzero means unique X = A^-1 B; det zero sends you to (adj A) B — nonzero means inconsistent, zero means possibly infinite; homogeneous systems need the determinant alone
• Cayley-Hamilton is the chapter's master key: A obeys its own characteristic equation, and for 2 x 2 that single line hands you the inverse and collapses every power
• Self-check: I can multiply matrices of any compatible orders and state exactly when a product does not exist
• Self-check: I can split any square matrix into its symmetric and skew-symmetric parts
• Self-check: I can evaluate a 3 x 3 determinant by cofactors and by properties, and say which method a given determinant deserves
• Self-check: I can produce det(kA), |adj A| and the inverse of a 2 x 2 matrix without hesitation
• Self-check: I can solve a 3 x 3 system by the matrix method and audit the answer in the original equations
• Self-check: I can classify a singular system as inconsistent or possibly infinite using (adj A) B
• Self-check: I can write a 2 x 2 characteristic equation and use it to find an inverse and a higher power
• Self-assessment: score the Practice Set out of 8. 7-8: move on, this chapter is yours. 5-6: rework the sections behind your two misses, then retry. Below 5: rebuild from Determinants I, redo every Worked Example with the book closed, and only then retest
<!-- END math_ch_6 detailedStudyNotes -->
