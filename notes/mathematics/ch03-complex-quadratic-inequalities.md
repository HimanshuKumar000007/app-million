<!-- BEGIN math_ch_3 detailedStudyNotes -->
Introduction — Three Toolkits in One Chapter
• This chapter hands you three toolkits that look unrelated and turn out to be one story. Complex numbers extend arithmetic so that every equation gets its roots. Quadratic equations are where those roots are studied, priced and located. Inequalities stop asking "what is x exactly" and start asking "which x are allowed" — the question behind optimisation, feasibility and half of applied maths.
• DEFINITION — A complex number is a number of the form z = a + ib, where a and b are real numbers and i is a new unit obeying i^2 = -1. The toolkit exists because x^2 + 1 = 0 has no real solution, and mathematics refused to leave it unsolved.
• DEFINITION — A quadratic equation is a polynomial equation of degree 2, ax^2 + bx + c = 0 with a not equal to 0. Its two roots always exist once complex numbers are allowed — that is the first toolkit paying rent inside the second.
• DEFINITION — An inequality is a statement that one expression is smaller or larger than another, and solving it means finding the whole set of x values that make it true — usually an interval, not a point.
• Here is the map. We build complex arithmetic first (i, conjugate, modulus, argument), give it geometry on the Argand plane, then compress it into polar form and De Moivre's theorem, ending with the cube roots of unity — an IAT favourite. Then quadratics: discriminant, Vieta's relations, common roots, sign of the expression, and pinning roots to a location. Finally inequalities: the sign-flip rule, the wavy curve machine, modulus as distance, and two-variable regions whose corners secretly run the Linear Programming of Chapter 14.
★ HIGHLIGHT — The one-breath summary: i lets every quadratic have roots, the discriminant and Vieta's relations describe those roots without computing them, and the wavy curve turns any product or quotient inequality into a picture of signs. Master the argument quadrant check, the sum-product read-off, and the sign-flip rule, and this chapter is yours.

Complex Numbers — the Number i and Its Algebra
• DEFINITION — The imaginary unit i is defined by i^2 = -1, equivalently i = sqrt(-1). It is not a real number and it is not a trick; it is an extension of the number system, accepted because it is consistent — every computation with it follows the usual rules of algebra plus this one new law.
• DEFINITION — In z = a + ib, a is the real part, written Re(z), and b is the imaginary part, written Im(z). Note that Im(z) is the real number b, not ib. Two complex numbers are equal exactly when their real parts are equal AND their imaginary parts are equal — one complex equation is secretly two real equations, a fact IAT loves to exploit.
• Powers of i run in a cycle of four — i^1 = i, i^2 = -1, i^3 = -i, i^4 = 1, and then the wheel turns again: i^5 = i, i^6 = -1, and so on forever.
✔ KEY FORMULA — To evaluate i^n, divide n by 4 and keep only the remainder: remainder 0 gives 1, remainder 1 gives i, remainder 2 gives -1, remainder 3 gives -i. Four consecutive powers always cancel: i^n + i^(n+1) + i^(n+2) + i^(n+3) = 0.
• EXAMPLE — i^2027: divide 2027 by 4 — 2027 = 4 x 506 + 3, remainder 3, so i^2027 = i^3 = -i. Three seconds, no expansion.
• Addition and subtraction are componentwise: (a + ib) + (c + id) = (a + c) + i(b + d). Multiplication is FOIL with the law i^2 = -1 applied at the end.
• EXAMPLE — (3 + 2i)(1 - i) = 3 - 3i + 2i - 2i^2 = 3 - i - 2(-1) = 5 - i. Watch the last step: the term -2i^2 is +2, and forgetting that flip is the most common algebra slip in this unit.
• Two special shapes recur constantly: (1 + i)^2 = 2i and (1 - i)^2 = -2i, so (1 + i)^4 = (2i)^2 = -4 and (1 + i)^8 = 16 — pure real numbers hiding inside complex powers, and the seed of several exam questions.
• A complex number is purely real when its imaginary part is 0, and purely imaginary when its real part is 0 (and the imaginary part is not). Setting the unwanted part to zero is the standard move in "find x and y" problems.
⚠ EXAM TRAP — sqrt(-4) x sqrt(-9) is NOT sqrt(36) = 6. The rule sqrt(p) x sqrt(q) = sqrt(pq) is valid only for non-negative p and q. Compute honestly: sqrt(-4) = 2i and sqrt(-9) = 3i, so the product is 6i^2 = -6. The minus sign is the entire question.
• YOUR TURN — Evaluate i^57 and i^100 + i^101 + i^102 + i^103. Answer: 57 = 4 x 14 + 1, remainder 1, so i^57 = i. The four powers are consecutive, so they cancel in one block: the sum is 0.
• YOUR TURN — Find the real numbers x and y if (x + iy)(1 + i) = 4 + 2i. Answer: expand the left side: (x - y) + i(x + y). Equate parts: x - y = 4 and x + y = 2, so x = 3 and y = -1, i.e. x + iy = 3 - i. Check: (3 - i)(1 + i) = 3 + 3i - i - i^2 = 4 + 2i. Correct.

Conjugate, Modulus and Argument
• DEFINITION — The conjugate of z = a + ib is conj(z) = a - ib: same real part, flipped imaginary part. On the Argand plane it is the mirror image of z in the real axis, and algebraically it is the master key to division.
• DEFINITION — The modulus of z is |z| = sqrt(a^2 + b^2), the distance of the point (a, b) from the origin. Modulus is always a non-negative real number, and |z| = 0 only when z = 0.
✔ KEY FORMULA — z x conj(z) = |z|^2 = a^2 + b^2, a plain positive real. This is why division works: to divide by a + ib, multiply top and bottom by its conjugate and the denominator becomes the real number a^2 + b^2.
• EXAMPLE — 1/(1 + i): multiply top and bottom by conj(1 + i) = 1 - i. Denominator: 1 + 1 = 2. So 1/(1 + i) = (1 - i)/2. Every complex division in the exam is this one move.
• Modulus behaves beautifully under multiplication and division: |z1 z2| = |z1| x |z2| and |z1 / z2| = |z1| / |z2|. Conjugate also respects everything: conj(z1 + z2) = conj(z1) + conj(z2), conj(z1 z2) = conj(z1) conj(z2), and conj(conj(z)) = z. And the triangle inequality frames all distances: | |z1| - |z2| | ≤ |z1 + z2| ≤ |z1| + |z2|.
• DEFINITION — The argument of z, written arg z, is the angle the line from the origin to z makes with the positive real axis, measured anticlockwise. The principal value of the argument is the unique value in the range -pi < arg z ≤ pi, and every formula sheet answer is expected in this range.
• The calculator trap lives here. arctan(b/a) only ever returns an angle between -pi/2 and pi/2 — the right half of the plane. For the left half you must correct by pi. The reliable recipe uses the acute reference angle alpha = arctan(|b/a|), always between 0 and pi/2, and then reads the quadrant.
• Quadrant recipe — Quadrant I (a > 0, b > 0): arg z = alpha. Quadrant II (a < 0, b > 0): arg z = pi - alpha. Quadrant III (a < 0, b < 0): arg z = -(pi - alpha). Quadrant IV (a > 0, b < 0): arg z = -alpha. On the axes read directly: positive real axis gives 0, positive imaginary axis gives pi/2, negative real axis gives pi, negative imaginary axis gives -pi/2.
• EXAMPLE — z = 3 + 4i: |z| = sqrt(9 + 16) = 5, quadrant I, arg z = arctan(4/3), about 0.93 radians (53.13 degrees). This 3-4-5 triangle returns in Figure 1.
• EXAMPLE — z = -1 + i sqrt(3): |z| = sqrt(1 + 3) = 2. alpha = arctan(sqrt(3)/1) = pi/3, quadrant II, so arg z = pi - pi/3 = 2pi/3.
• EXAMPLE — z = -1 - i: |z| = sqrt(2). alpha = arctan(1) = pi/4, quadrant III, so arg z = -(pi - pi/4) = -3pi/4.
• EXAMPLE — z = 1 - i sqrt(3): |z| = 2, quadrant IV, arg z = -pi/3. Same modulus as the -1 + i sqrt(3) example, argument of the opposite sign and different size — the quadrant, not the modulus, carries the information.
⚠ EXAM TRAP — arg(-1 - i) is -3pi/4. The answer pi/4 comes from blindly trusting arctan, and 5pi/4 — though it points the same way — is illegal because it sits outside the principal range -pi < arg ≤ pi. Always finish with the quadrant recipe and a range check.
• YOUR TURN — Find |z| and arg z for z = -2 - 2i and for z = -sqrt(3) + i. Answer: for -2 - 2i, |z| = 2 sqrt(2), alpha = pi/4, quadrant III, arg z = -3pi/4. For -sqrt(3) + i, |z| = 2, alpha = arctan(1/sqrt(3)) = pi/6, quadrant II, arg z = pi - pi/6 = 5pi/6.

The Argand Plane — Geometry You Can See
• DEFINITION — The Argand plane is the ordinary coordinate plane with a job change: the x-axis is the real axis, the y-axis is the imaginary axis, and z = a + ib is the point (a, b) — equivalently, the tip of the vector from the origin to (a, b). Every algebraic condition on z becomes a geometric shape, and Figure 1 draws the three shapes IAT asks about most.
• Distance is modulus of a difference: |z1 - z2| is the distance between the points z1 and z2. So |z - z0| measures the distance from the moving point z to the fixed point z0, and every locus below is just a distance sentence read aloud.
✔ KEY FORMULA — The locus dictionary: |z - z0| = r is the circle with centre z0 and radius r. |z - z0| < r is the open disc inside it. |z - z1| = |z - z2| is the perpendicular bisector of the segment joining z1 and z2. |z - z1| + |z - z2| = 2a (with 2a greater than the distance between z1 and z2) is an ellipse with foci z1 and z2. arg(z - z0) = theta is a ray from z0 at angle theta.
• EXAMPLE — |z - 1 - i| = 2: read it as |z - (1 + i)| = 2, distance from z to the point 1 + i fixed at 2 — a circle with centre (1, 1) and radius 2. One rewrite, one picture, done.
• EXAMPLE — |z| = |z - 2|: z is equidistant from 0 and from 2, so z lies on the perpendicular bisector of the segment from (0, 0) to (2, 0), which is the vertical line x = 1, written Re(z) = 1.
• EXAMPLE — |z - 1| + |z + 1| = 4: sum of distances to the two foci -1 and +1 is constantly 4, an ellipse. Here 2a = 4 so a = 2, the focal distance gives c = 1, and b^2 = a^2 - c^2 = 3, so in coordinates the curve is x^2/4 + y^2/3 = 1.
• WHY this dictionary matters — locus questions award the mark for naming the shape and its data (centre, radius, foci, line), not for pages of algebra with x and y. Translate first, compute second. If you do expand, |z - z0| = r squares into a circle equation and |z - z1| = |z - z2| collapses into a straight line — the dictionary is just those expansions memorised.
⚠ EXAM TRAP — In |z - 3 + 2i| = 1 the centre is 3 - 2i, not 3 + 2i, because the pattern is z MINUS centre: z - 3 + 2i = z - (3 - 2i). The radius is 1. Sign slips inside loci are the cheapest marks lost in this chapter.
• YOUR TURN — Describe |z + 1 - 2i| ≤ 3 and |z - 2| = |z + 2|. Answer: z + 1 - 2i = z - (-1 + 2i), so it is the closed disc with centre -1 + 2i and radius 3. The second says z is equidistant from 2 and -2: the perpendicular bisector is the imaginary axis, Re(z) = 0.

Polar Form and Euler's Form
• DEFINITION — The polar form of z writes the point by its distance and direction instead of its coordinates: z = r(cos theta + i sin theta), where r = |z| and theta = arg z. Converting is always the same two steps — compute r, then find theta with the quadrant recipe from the previous section.
• DEFINITION — Euler's form compresses the same information using the identity e^(i theta) = cos theta + i sin theta, so z = r e^(i theta). Nothing new is claimed — it is a notation — but it is the notation in which multiplication becomes effortless.
✔ KEY FORMULA — Multiplication in polar form: moduli multiply, arguments add. If z1 = r1 e^(i theta1) and z2 = r2 e^(i theta2), then z1 z2 = r1 r2 e^(i (theta1 + theta2)), and z1 / z2 = (r1 / r2) e^(i (theta1 - theta2)). In words: multiplying by a complex number scales by its modulus and rotates by its argument.
• WHY this is the form that matters — in rectangular form, multiplication mixes all four components and hides the geometry. In polar form the two effects separate cleanly: size from r, turning from theta. Powers, roots and rotations — the rest of this unit — are all one-line consequences of "arguments add".
• EXAMPLE — Write 1 + i sqrt(3) in polar and Euler form. r = 2, quadrant I, theta = arctan(sqrt(3)) = pi/3. So 1 + i sqrt(3) = 2(cos(pi/3) + i sin(pi/3)) = 2 e^(i pi/3).
• WORKED PATTERN — Powers preview: (1 + i)^8. Here r = sqrt(2) and theta = pi/4, so (1 + i)^8 has modulus (sqrt(2))^8 = 16 and argument 8 x pi/4 = 2pi, which is the full turn back to the positive real axis. Answer: 16 — matching the rectangular computation (1 + i)^2 = 2i, (1 + i)^4 = -4, (1 + i)^8 = 16 exactly.
• Note the argument bookkeeping: arguments may wander outside (-pi, pi] during a calculation — that is allowed mid-flight. Only the FINAL stated arg z must be folded back into the principal range by adding or subtracting 2pi.
• YOUR TURN — Write z = -2 - 2i in polar form. Answer: r = 2 sqrt(2), and from the quadrant recipe arg z = -3pi/4, so z = 2 sqrt(2) (cos(-3pi/4) + i sin(-3pi/4)) = 2 sqrt(2) e^(-3 pi i / 4).

De Moivre's Theorem — Powers and Roots
• DEFINITION — De Moivre's theorem states that for any integer n, (cos theta + i sin theta)^n = cos(n theta) + i sin(n theta). It is the "arguments add" rule applied n times, and it turns raising to a power — agony in rectangular form — into a single multiplication of the angle.
• WORKED PATTERN — (1 + i sqrt(3))^6: polar form is 2(cos(pi/3) + i sin(pi/3)), so the sixth power is 2^6 (cos(6 x pi/3) + i sin(6 x pi/3)) = 64(cos 2pi + i sin 2pi) = 64. A purely real answer from a heavily complex base — the signature of a well-chosen exam number.
• WORKED PATTERN — Simplify ((1 + i)/(1 - i))^n. First the base: (1 + i)/(1 - i) = (1 + i)^2 / ((1 - i)(1 + i)) = 2i / 2 = i. So the expression is i^n, and the smallest positive integer n making it equal to 1 is n = 4. Two tools from earlier sections — conjugate division and the i-cycle — did all the work.
• DEFINITION — The n-th roots of a complex number z = r(cos theta + i sin theta) are n in number: each has modulus r^(1/n), and their arguments are (theta + 2kpi)/n for k = 0, 1, 2, ..., n-1. On the Argand plane they sit equally spaced on a circle — the vertices of a regular n-gon.
• EXAMPLE — Square roots of i: i = cos(pi/2) + i sin(pi/2), modulus 1. The roots have modulus 1 and arguments pi/4 and pi/4 + pi = 5pi/4, giving (1 + i)/sqrt(2) and its negative -(1 + i)/sqrt(2). Check the first: ((1 + i)/sqrt(2))^2 = 2i/2 = i. Correct.
⚠ EXAM TRAP — For fractional powers De Moivre gives ALL the values, not one: (cos theta + i sin theta)^(1/2) has two square roots, differing by a sign. Quoting only the k = 0 root in a "find all values" question earns half the marks for full work.
• YOUR TURN — Evaluate (cos(pi/6) + i sin(pi/6))^12. Answer: by De Moivre it is cos(12 x pi/6) + i sin(12 x pi/6) = cos 2pi + i sin 2pi = 1.

Cube Roots of Unity — omega and Its Powers
• DEFINITION — The cube roots of unity are the three solutions of x^3 = 1: the real root 1 and the two complex roots omega and omega^2, where omega = cos(2pi/3) + i sin(2pi/3) = -1/2 + i sqrt(3)/2. Figure 2 draws them: three points on the unit circle, 120 degrees apart, forming an equilateral triangle.
• The two facts that run every omega question: omega^3 = 1 (it is a cube root of 1) and 1 + omega + omega^2 = 0 (the three roots sum to zero — they are also the roots of x^2 + x + 1 = 0, and Vieta's relations from Section 9 will show the sum is the negative of the x-coefficient).
✔ KEY FORMULA — omega toolkit: omega^3 = 1; 1 + omega + omega^2 = 0, so 1 + omega = -omega^2, 1 + omega^2 = -omega and omega + omega^2 = -1; omega^2 = conj(omega) = 1/omega; and powers reduce modulo 3 — omega^n depends only on the remainder when n is divided by 3 (remainder 0 gives 1, remainder 1 gives omega, remainder 2 gives omega^2).
• EXAMPLE — omega^99 + omega^100: 99 is divisible by 3, so omega^99 = (omega^3)^33 = 1, and omega^100 = omega^99 x omega = omega. Sum: 1 + omega = -omega^2. Notice the final step used the sum-to-zero fact, not expansion — that is the exam-speed route.
• WORKED PATTERN — (1 + omega^2)^4: first 1 + omega^2 = -omega, so the expression is (-omega)^4 = omega^4 = omega^3 x omega = omega. Three facts chained, no coordinates touched.
• WORKED PATTERN — (1 - omega + omega^2)(1 + omega - omega^2) = 4: in the first bracket, 1 + omega^2 = -omega, so the bracket is -omega - omega = -2 omega. In the second, 1 + omega = -omega^2, so it is -omega^2 - omega^2 = -2 omega^2. Product: 4 omega^3 = 4. This factor-to-double trick is a recurring IAT pattern — when you see 1 ± omega ± omega^2, always merge two of the terms first.
• WHY the geometry explains the algebra — Figure 2 shows the three roots as arrows from the origin. Tip-to-tail, the arrow 1 followed by the arrow omega followed by the arrow omega^2 returns exactly to the origin: the vector sum is zero, which is precisely 1 + omega + omega^2 = 0 wearing geometric clothes.
⚠ EXAM TRAP — Two cycles, two moduli: powers of i reduce modulo 4, powers of omega reduce modulo 3. Writing omega^100 = omega^0 = 1 because "100 is divisible by 4-ish" is the classic slip. Check which unit you are holding before choosing the cycle.
• YOUR TURN — Evaluate (1 - omega)(1 - omega^2) and omega^105 + omega^210. Answer: expand the first: 1 - omega - omega^2 + omega^3 = 1 - (omega + omega^2) + 1 = 1 + 1 + 1 = 3. For the second, 105 and 210 are both divisible by 3, so both terms equal 1 and the sum is 2.

Rotation in the Argand Plane
• DEFINITION — Multiplying z by e^(i theta) rotates the point z about the origin through angle theta, anticlockwise for positive theta. The most used special case: multiplying by i rotates by pi/2 (90 degrees anticlockwise), by -i rotates by -pi/2 (clockwise), and by -1 rotates by pi (a half turn).
• WORKED PATTERN — Rotate z = 1 + i by 90 degrees anticlockwise about the origin: multiply by i — i(1 + i) = i + i^2 = -1 + i. The point (1, 1) moves to (-1, 1), exactly a quarter turn, and |z| is unchanged: rotation never changes modulus.
✔ KEY FORMULA — Rotation about a general centre z0: translate, rotate, translate back. The image of z after rotation through theta about z0 is z' = z0 + (z - z0) e^(i theta). Forgetting the translate-back step is the only way this formula goes wrong.
• EXAMPLE — Rotate z = 2 (the point (2, 0)) by pi/2 about the centre z0 = 1 + i. Translate: z - z0 = 1 - i. Rotate by i: i(1 - i) = 1 + i. Translate back: z' = (1 + i) + (1 + i) = 2 + 2i. Sanity check by distances: |z - z0| = |1 - i| = sqrt(2) and |z' - z0| = |1 + i| = sqrt(2) — preserved, as a rotation demands.
• WHY examiners care — rotation converts geometry problems (squares and equilateral triangles built on segments, a Class 12 and IAT staple) into one multiplication. If P and Q are adjacent vertices of a square or triangle built on a segment, the next vertex is z_P + (z_Q - z_P) x (the rotation factor for the shape's angle).
• YOUR TURN — The point z = 3 + i is rotated 90 degrees anticlockwise about the origin. Find its image. Answer: i(3 + i) = 3i + i^2 = -1 + 3i.

Quadratic Equations — the Discriminant Decides
• DEFINITION — For ax^2 + bx + c = 0 with a not equal to 0, the discriminant is D = b^2 - 4ac. It is the expression under the square root in the quadratic formula x = (-b ± sqrt(D)) / (2a), and its sign alone classifies the roots before any root is computed.
✔ KEY FORMULA — The discriminant table: D > 0 gives two distinct real roots. D = 0 gives two equal real roots, both -b/(2a). D < 0 gives two non-real complex roots that are conjugates of each other. When a, b, c are rational, one refinement: D a perfect square gives rational roots, D positive but not a perfect square gives irrational roots in a conjugate pair p ± sqrt(q).
• EXAMPLE — x^2 - 5x + 6 = 0: D = 25 - 24 = 1 > 0, roots real and distinct — indeed 2 and 3.
• EXAMPLE — x^2 + x + 1 = 0: D = 1 - 4 = -3 < 0, roots non-real — and they are exactly omega and omega^2 from Section 6. The two toolkits shake hands: the quadratic with discriminant -3 manufactures the cube roots of unity.
• EXAMPLE — x^2 - 4x + 4 = 0: D = 16 - 16 = 0, one repeated root x = 4/2 = 2, and the left side is the perfect square (x - 2)^2.
• WORKED PATTERN — Parameter for equal roots: find k so that 3x^2 - kx + 12 = 0 has equal roots. Set D = 0: k^2 - 4 x 3 x 12 = k^2 - 144 = 0, so k = 12 or k = -12. Both signs count — D involves k^2, and dropping the negative value is a standard lost mark.
⚠ EXAM TRAP — D < 0 means no REAL roots, never "no roots". With complex numbers admitted, every quadratic has exactly two roots counting multiplicity — the Fundamental Theorem of Algebra in its smallest case. An option saying a D < 0 quadratic "has no solution" is false.
• YOUR TURN — Classify the roots of 2x^2 - 3x + 5 = 0 and of x^2 - 6x + 9 = 0. Answer: D = 9 - 40 = -31 < 0, a non-real conjugate pair. And D = 36 - 36 = 0, equal roots x = 3.

Vieta's Relations — Sum and Product of Roots
• DEFINITION — Vieta's relations connect the coefficients of a quadratic to symmetric data about its roots without ever solving it. If alpha and beta are the roots of ax^2 + bx + c = 0, then the sum alpha + beta = -b/a and the product alpha beta = c/a.
✔ KEY FORMULA — The Vieta toolkit: alpha + beta = -b/a; alpha beta = c/a; alpha^2 + beta^2 = (alpha + beta)^2 - 2 alpha beta; (alpha - beta)^2 = (alpha + beta)^2 - 4 alpha beta, so |alpha - beta| = sqrt(D)/|a|; 1/alpha + 1/beta = (alpha + beta)/(alpha beta); alpha^3 + beta^3 = (alpha + beta)^3 - 3 alpha beta (alpha + beta). Every symmetric expression in alpha and beta reduces to sum and product — that is the whole game.
• WORKED PATTERN — Building an equation from roots: roots 2 and -3 have sum -1 and product -6, so the monic equation is x^2 - (sum) x + (product) = x^2 + x - 6 = 0. The template x^2 - Sx + P = 0 is worth memorising as a single object.
• EXAMPLE — x^2 - 5x + 6 = 0: sum 5, product 6, so alpha^2 + beta^2 = 25 - 12 = 13 (check against the roots 2 and 3: 4 + 9 = 13) and |alpha - beta| = sqrt(1)/1 = 1.
• EXAMPLE — 2x^2 - 8x + 3 = 0: divide by a first — sum = 8/2 = 4, product = 3/2. Then alpha^2 + beta^2 = 16 - 2 x (3/2) = 13. Coincidence of answers, completely different route.
• EXAMPLE — x^2 - 3x + 1 = 0: sum 3, product 1, so alpha^3 + beta^3 = 27 - 3 x 1 x 3 = 18, computed without ever meeting the irrational roots (3 ± sqrt(5))/2.
• WHY symmetric functions are the examiners' favourite — the roots themselves may be ugly surds or complex numbers, yet symmetric combinations are clean rationals, because the surd parts cancel. When a problem asks for alpha^2 + beta^2, alpha^3 + beta^3, 1/alpha + 1/beta or alpha/beta + beta/alpha, it is begging you NOT to solve the quadratic.
⚠ EXAM TRAP — The sum is -b/a, with the minus sign, and both relations need division by a. For 2x^2 - 8x + 3 the sum is 4, not 8 and not -8. Read the coefficients off only after mentally dividing through by a.
• YOUR TURN — For the roots of x^2 - 7x + 3 = 0, find alpha^2 + beta^2 and 1/alpha + 1/beta. Answer: sum 7, product 3, so alpha^2 + beta^2 = 49 - 6 = 43, and 1/alpha + 1/beta = 7/3.

Common Roots — When Two Quadratics Share
• DEFINITION — A common root of two quadratic equations is an x-value satisfying both. The practical consequence: any common root also satisfies any combination of the two equations — in particular their difference, which is at most linear and therefore hands you the candidate on a plate.
• WORKED PATTERN — x^2 - 3x + 2 = 0 (roots 1, 2) and x^2 - 4x + 3 = 0 (roots 1, 3): subtract the equations and the x^2 terms cancel, leaving x - 1 = 0, so the only possible common root is x = 1. Verify in either original: 1 - 3 + 2 = 0. Confirmed — subtraction proposes, substitution disposes.
• WORKED PATTERN — Parameter version: find k such that x^2 - 3x + k = 0 and x^2 - 4x + 3 = 0 share a root. The shared root must be a root of the second equation, so it is 1 or 3. Try x = 1 in the first: 1 - 3 + k = 0 gives k = 2. Try x = 3: 9 - 9 + k = 0 gives k = 0. So k = 0 or k = 2 — two answers, and a single-answer attempt loses half the problem.
✔ KEY FORMULA — The bookkeeping condition: a1 x^2 + b1 x + c1 = 0 and a2 x^2 + b2 x + c2 = 0 have a common root exactly when (c1 a2 - c2 a1)^2 = (a1 b2 - a2 b1)(b1 c2 - b2 c1). And they have BOTH roots common exactly when the coefficients are proportional: a1/a2 = b1/b2 = c1/c2. In the exam hall the subtraction method is faster and safer than the formula; keep the formula for verification.
• WHY subtraction works — if alpha satisfies both equations, it satisfies (equation 1) - (equation 2) = 0, a linear equation whose single solution is the only possible common root. If that candidate then fails in the originals, the quadratics simply share nothing.
⚠ EXAM TRAP — When a1 = a2 and b1 = b2, subtraction leaves only a constant: then the equations share a root only if also c1 = c2 (identical equations). Subtracting and getting "5 = 0" is the equations telling you there is no common root — believe them.
• YOUR TURN — Do x^2 - 5x + 6 = 0 and x^2 - 7x + 12 = 0 share a root? Answer: subtract — 2x - 6 = 0, candidate x = 3. Check: 9 - 15 + 6 = 0. Yes, x = 3 is common (the root sets are {2, 3} and {3, 4}).

The Quadratic Expression — Sign and Extremum
• DEFINITION — The quadratic expression f(x) = ax^2 + bx + c is a parabola: opening upwards when a > 0, downwards when a < 0. Beyond solving f(x) = 0, the examinable questions are: what sign does f keep, and what is its extreme value?
✔ KEY FORMULA — Sign rules for a > 0: if D < 0, f(x) > 0 for every real x (the parabola floats above the axis). If D = 0, f(x) ≥ 0, touching zero at the double root. If D > 0 with roots alpha < beta, f(x) > 0 outside the roots (x < alpha or x > beta) and f(x) < 0 strictly between them. For a < 0 every inequality reverses. Compressed: f keeps the sign of a everywhere except between two distinct real roots, where it flips.
• The always-positive test: f(x) > 0 for all real x exactly when a > 0 AND D < 0 — two conditions, both essential. Always negative is the mirror: a < 0 AND D < 0.
• EXAMPLE — x^2 + 2x + 5: D = 4 - 20 = -16 < 0 and a = 1 > 0, so it is positive for all x. Its smallest value is at the vertex.
✔ KEY FORMULA — The vertex: f has its extreme value at x = -b/(2a), and the extreme value is (4ac - b^2)/(4a). It is a minimum when a > 0 and a maximum when a < 0.
• EXAMPLE — For x^2 + 2x + 5 the vertex sits at x = -1 and the minimum value is (20 - 4)/4 = 4. Direct check: f(-1) = 1 - 2 + 5 = 4. So x^2 + 2x + 5 ≥ 4 always — stronger than mere positivity, and exactly the kind of bound inequality problems feed on.
• WORKED PATTERN — Find all k with kx^2 + 4x + 1 > 0 for every x. Two conditions: k > 0, and D = 16 - 4k < 0, i.e. k > 4. Combined answer: k > 4. The k > 0 condition is not decoration: at k = 0 the expression degenerates to the linear 4x + 1, which dives negative for small x.
⚠ EXAM TRAP — In "always positive" problems, students routinely enforce D < 0 and forget a > 0. With a < 0 and D < 0 the expression is always NEGATIVE — the conditions are a package deal, and the question is designed so the missing condition is the answer.
• YOUR TURN — Is x^2 - 2x + 3 always positive? What is its minimum value? Answer: D = 4 - 12 = -8 < 0 with a > 0, so yes. Vertex at x = 1, minimum value f(1) = 1 - 2 + 3 = 2.

Location of Roots — Pinning Roots Down
• DEFINITION — Location problems ask not for the roots but for their address: both roots greater than k, both less than k, or k trapped between them. The toolkit always combines three witnesses — the discriminant (roots are real), the axis of symmetry (which side they lean to), and the sign of f(k) (where k stands relative to the curve).
✔ KEY FORMULA — Both roots exceed k exactly when D ≥ 0, the axis -b/(2a) > k, and a x f(k) > 0 (f(k) has the sign of a, since k lies outside the root interval on the far side). Both roots are below k with the axis condition flipped. And k lies strictly between the roots exactly when a x f(k) < 0 — in that case D > 0 comes free, no separate check needed.
• WORKED PATTERN — Find m so that both roots of x^2 - 6x + m = 0 exceed 2. Discriminant: 36 - 4m ≥ 0 gives m ≤ 9. Axis: -(-6)/2 = 3 > 2, automatically satisfied. End check: f(2) = 4 - 12 + m = m - 8 > 0 gives m > 8. Combined: 8 < m ≤ 9. Audit the ends: m = 9 gives the double root 3, which does exceed 2; m = 8.5 gives roots about 2.29 and 3.71, both above 2; m = 8 gives roots 2 and 4 — the root AT 2 fails "exceed", so 8 is correctly excluded.
• EXAMPLE — A number between the roots: 1 lies between the roots of x^2 - 3x + m exactly when f(1) = m - 2 < 0 (a = 1 > 0), i.e. m < 2. At m = 1 the roots are about 0.38 and 2.62, and 1 indeed sits between them.
• A structural curiosity worth one line: if the coefficients are palindromic, a = c, then the product of roots c/a = 1, so the roots are a reciprocal pair. EXAMPLE — 2x^2 - 5x + 2 = 0 has roots 2 and 1/2. Spot the palindrome, halve the work.
⚠ EXAM TRAP — D ≥ 0 alone locates nothing: it promises real roots but says nothing about where they live. Every location condition is a conjunction of checks, and omitting the axis or the f(k) check admits impostor configurations — roots straddling k can pass a discriminant-only test.
• YOUR TURN — Find k so that both roots of x^2 - 4x + k = 0 are less than 5. Answer: D ≥ 0 gives k ≤ 4; axis is 2 < 5, automatic; f(5) = 25 - 20 + k = k + 5 > 0 gives k > -5. Combined: -5 < k ≤ 4.

Linear Inequalities — Rules of the Game
• DEFINITION — A linear inequality in one variable has the form ax + b < 0 (or with ≤, >, ≥), and solving it means describing all x that satisfy it — an interval drawn on the number line, with an open circle for a strict end and a closed circle for an included end.
✔ KEY FORMULA — The legal moves: adding or subtracting the same quantity on both sides never changes an inequality. Multiplying or dividing by a POSITIVE number keeps the direction. Multiplying or dividing by a NEGATIVE number REVERSES the direction — the single most punished rule in this unit.
• EXAMPLE — 3x - 7 > 5 - x: gather terms, 4x > 12, so x > 3. On the number line: open circle at 3, shading to the right.
• EXAMPLE — The flip in action: -2x < 6. Divide by -2 and reverse: x > -3. Sanity check with a test value, x = 0: -0 < 6 is true, and 0 > -3 is consistent; the flipped answer contains the values that actually work.
• Compound inequalities are processed at every part simultaneously: -3 < 2x + 1 ≤ 5. Subtract 1 throughout: -4 < 2x ≤ 4. Halve (positive, no flip): -2 < x ≤ 2. The left end is excluded, the right end included — mixed circles on the number line.
• WORKED PATTERN — Always close with a test value. Pick any point inside your claimed solution and one outside it, and substitute into the ORIGINAL inequality. Ten seconds of testing has rescued more inequality answers than any theorem in this chapter.
⚠ EXAM TRAP — Squaring both sides of an inequality is not a legal move: from x < 2 you cannot conclude x^2 < 4 (try x = -5). Operations that are safe for equations routinely break inequalities; the legal machine for products and quotients is the wavy curve of the next section, never blanket squaring or cross-multiplication.
• YOUR TURN — Solve 4 - 2x ≥ 10. Answer: -2x ≥ 6, divide by -2 and flip: x ≤ -3.

The Wavy Curve Method — Sign Schemes
• DEFINITION — The wavy curve (sign scheme) method solves inequalities built from products and quotients of linear factors, like (x - 1)(x - 4)(x + 2) ≥ 0 or (x - 1)/(x + 2) ≤ 0, by tracking the SIGN of the whole expression interval by interval instead of expanding anything.
✔ KEY FORMULA — The algorithm: (1) Move everything to one side so the other side is 0, and factor completely. (2) Mark the critical points: the zero of every numerator factor and every denominator factor. (3) The expression is positive for very large x (adjust if the overall leading sign is negative). (4) Walk leftwards across the number line: the sign FLIPS at a critical point of odd multiplicity and STAYS at one of even multiplicity (a squared factor). (5) Read off the intervals matching the inequality; numerator zeros may be included for ≤ or ≥, denominator zeros are NEVER included, whatever the inequality says.
• Figure 3 works the flagship example: f(x) = (x + 1)(x - 2)^2 (x - 3) ≥ 0. Critical points: -1 (single), 2 (double — the curve touches the axis and bounces), 3 (single). Sign chart: positive left of -1, negative from -1 to 3 (the bounce at 2 changes nothing), positive beyond 3. Solution: x ≤ -1, or x ≥ 3, or the isolated point x = 2 — a double root still makes f equal to 0, so it satisfies ≥ 0 all by itself even though it sits inside a negative region.
• EXAMPLE — A rational case: (x - 1)/(x + 2) ≤ 0. Critical points 1 (numerator) and -2 (denominator). Signs: positive for x > 1, negative between -2 and 1, positive for x < -2. We need ≤ 0: the interval (-2, 1], opening at -2 because the denominator zero is excluded absolutely, closing at 1 because the numerator zero is allowed.
• WHY the bounce happens — near a double root like (x - 2)^2 the factor is a square: non-negative on both sides, so it cannot drag the product across zero. Near a simple root the factor itself changes sign, and the product follows it across. Multiplicity is destiny.
⚠ EXAM TRAP — Never clear a denominator by multiplying both sides by (x + 2): its sign is unknown, so the flip-or-not decision is unknowable, and the method collapses. The wavy curve exists precisely to handle denominators honestly. Second trap: including a denominator zero in a ≤ answer — division by zero is not "equal to zero", it is undefined.
• YOUR TURN — Solve (x + 3)(x - 2) ≥ 0 and (x - 4)(x + 1) < 0. Answer: critical points -3 and 2 split the line into positive-negative-positive, so the first gives x ≤ -3 or x ≥ 2. The second is negative strictly between its roots: -1 < x < 4.

Modulus Inequalities — Distance in Disguise
• DEFINITION — |x - a| is the distance between x and a on the number line. Every modulus inequality is a distance sentence: |x - a| < b says "x lies within b of a", and |x - a| > b says "x is farther than b from a". Read them as distances and the answers draw themselves.
✔ KEY FORMULA — The four translations, for a > 0: |x| < a means -a < x < a. |x| ≤ a means -a ≤ x ≤ a. |x| > a means x > a OR x < -a — two separate rays, never one interval. |x| ≥ a means x ≥ a OR x ≤ -a. Shifted versions: |x - a| < b means a - b < x < a + b.
• EXAMPLE — |x - 3| < 2: x is within 2 of 3, so 1 < x < 5. One line, no case-splitting.
• EXAMPLE — |2x - 1| ≥ 5: strip the inner expression as a single object: 2x - 1 ≥ 5 or 2x - 1 ≤ -5, giving x ≥ 3 or x ≤ -2. Two rays, reported with "or" — that word is part of the answer.
• Edge cases examiners plant: |x| < -2 has NO solution, because a modulus is never negative. |x| ≤ 0 forces x = 0 exactly. |x| > -1 holds for every real x. If the right side is not positive, stop and think before reaching for the template.
⚠ EXAM TRAP — Writing the answer to |x| > 3 as the chained inequality -3 > x > 3. That chain asserts x is simultaneously less than -3 and greater than 3 — impossible. The solution is a UNION of two rays, x < -3 or x > 3, and the "or" cannot be compressed into a chain.
• YOUR TURN — Solve |x + 4| ≤ 3. Answer: distance reading — x within 3 of -4, so -7 ≤ x ≤ -1.

Inequalities in Two Variables — Half-Planes and Corners
• DEFINITION — A linear inequality in two variables, like 2x + 3y ≤ 6, has solutions that are points of the plane, and its solution set is a HALF-PLANE: one entire side of the boundary line 2x + 3y = 6, including the line itself when the inequality is non-strict.
• WORKED PATTERN — Graph 2x + 3y ≤ 6: draw the line through its intercepts (3, 0) and (0, 2), solid because ≤ includes equality. Then test one point off the line — the origin is the laziest: 0 ≤ 6 is true, so the origin's side is the solution side. Shade it. If the test point fails, shade the other side; the line is never re-examined, only the side is in question.
• A system of such inequalities intersects the half-planes into a feasible region, usually a polygon. Its corners are the intersection points of pairs of boundary lines, found by solving the pairs as simultaneous equations.
✔ KEY FORMULA — The corner principle: a linear expression ax + by evaluated over a polygonal feasible region attains its maximum and minimum at CORNERS of the region. So optimising means: list the corners, evaluate, compare. This is the entire engine of Linear Programming in the Statistics and Probability chapter — this section is its foundation stone.
• EXAMPLE — Region: x + y ≤ 4, x ≥ 0, y ≥ 0. A triangle with corners (0, 0), (4, 0), (0, 4). Maximise Z = x + 2y: at the corners Z equals 0, 4 and 8 respectively, so the maximum is 8 at (0, 4) — no calculus, no scanning of the interior, just three evaluations.
• Boundary etiquette: strict inequalities (<, >) draw DASHED boundary lines whose points are excluded; non-strict (≤, ≥) draw SOLID lines whose points count. In a system, a corner lying on a dashed line is not itself feasible — check before crowning it the optimum.
⚠ EXAM TRAP — Testing the origin fails silently when the boundary line passes through the origin (then 0 ≤ 0 tells you nothing about sides). Pick another test point, like (1, 0), whenever the origin lies on the line.
• YOUR TURN — Does the point (2, 2) satisfy both x + y ≤ 4 and 3x + 2y ≤ 6? Answer: x + y = 4 ≤ 4, yes — boundary points count for ≤. But 3x + 2y = 10 > 6, no. Both must hold, so (2, 2) is not in the system's region.

Formula Sheet
✔ |z| = sqrt(a^2 + b^2) for z = a + ib; conj(z) = a - ib; z x conj(z) = |z|^2; |z1 z2| = |z1| |z2|; |z1 + z2| ≤ |z1| + |z2|
✔ Powers of i cycle with period 4: i, -1, -i, 1 — reduce the exponent modulo 4. Powers of omega cycle with period 3 — reduce modulo 3
✔ Principal argument: -pi < arg z ≤ pi; alpha = arctan(|b/a|); quadrants give alpha, pi - alpha, -(pi - alpha), -alpha
✔ Polar and Euler forms: z = r(cos theta + i sin theta) = r e^(i theta); products add arguments, quotients subtract them
✔ De Moivre: (cos theta + i sin theta)^n = cos(n theta) + i sin(n theta); the n roots of z have modulus |z|^(1/n) and arguments (theta + 2kpi)/n
✔ omega: omega = -1/2 + i sqrt(3)/2; omega^3 = 1; 1 + omega + omega^2 = 0; omega and omega^2 are the roots of x^2 + x + 1 = 0
✔ Loci: |z - z0| = r circle; |z - z1| = |z - z2| perpendicular bisector; |z - z1| + |z - z2| = 2a ellipse with foci z1, z2
✔ Rotation: multiply by i for 90 degrees anticlockwise about the origin; about centre z0 use z' = z0 + (z - z0) e^(i theta)
✔ Quadratic formula x = (-b ± sqrt(D)) / (2a) with D = b^2 - 4ac: D > 0 distinct real roots, D = 0 equal roots, D < 0 conjugate complex pair
✔ Vieta: alpha + beta = -b/a; alpha beta = c/a; alpha^2 + beta^2 = (alpha + beta)^2 - 2 alpha beta; |alpha - beta| = sqrt(D)/|a|; alpha^3 + beta^3 = (alpha + beta)^3 - 3 alpha beta (alpha + beta)
✔ Sign of ax^2 + bx + c: positive for all x exactly when a > 0 and D < 0; vertex at x = -b/(2a), extreme value (4ac - b^2)/(4a)
✔ Location: both roots > k needs D ≥ 0, axis > k, a f(k) > 0; k between the roots exactly when a f(k) < 0
✔ Wavy curve: sign flips at odd-multiplicity critical points, survives even ones; numerator zeros includable for ≤ and ≥, denominator zeros never
✔ Modulus: |x| < a is -a < x < a; |x| > a is x > a or x < -a; |x - a| < b is a - b < x < a + b

Common Mistakes and Exam Traps
• MISTAKE 1 — Reading the argument straight off arctan(b/a). Why it fails: arctan only sees the right half of the plane; for a < 0 its answer is wrong by pi, and it never warns you. Correct principle: compute the reference angle alpha = arctan(|b/a|), then place it with the quadrant recipe, and confirm the final value lies in (-pi, pi].
• MISTAKE 2 — Using sqrt(p) x sqrt(q) = sqrt(pq) on negative numbers. Why it fails: the rule is a theorem about non-negative reals only; sqrt(-4) x sqrt(-9) = (2i)(3i) = -6, not +6. Correct principle: convert every sqrt of a negative into i-form first, then multiply with i^2 = -1.
• MISTAKE 3 — Losing the i^2 flip in expansions. Why it fails: in (3 + 2i)(1 - i), the term (2i)(-i) = -2i^2 = +2; treating it as -2 turns the answer 5 - i into 1 - i. Correct principle: after every expansion, hunt down each i^2 and replace it with -1 before collecting terms.
• MISTAKE 4 — Reducing powers with the wrong cycle. Why it fails: i repeats every 4 powers, omega every 3; omega^100 reduced modulo 4 gives a confident wrong answer. Correct principle: name the unit first — i means mod 4, omega means mod 3.
• MISTAKE 5 — Misquoting 1 + omega + omega^2 = 0. Why it fails: students remember a zero and attach it to the wrong pair, claiming omega + omega^2 = 0 or 1 + omega = omega^2. Correct principle: the three pair-sums are 1 + omega = -omega^2, 1 + omega^2 = -omega, omega + omega^2 = -1. Only the full triple sums to zero.
• MISTAKE 6 — Vieta read off raw coefficients. Why it fails: for 2x^2 - 8x + 3 = 0 the sum of roots is 4, not 8 — the relations are -b/a and c/a, division included, and the sum carries a minus sign. Correct principle: divide through by a mentally before reading anything.
• MISTAKE 7 — Clearing denominators in inequalities by multiplication. Why it fails: multiplying (x - 1)/(x + 2) ≤ 0 by (x + 2) gambles on its sign; half the number line then gets the wrong direction. Correct principle: one side zero, factor, wavy curve — never multiply by an expression of unknown sign.
• MISTAKE 8 — Dividing an inequality by a negative without flipping. Why it fails: -2x ≥ 6 divided carelessly gives x ≥ -3, but x = 0 then "satisfies" it while 0 ≥ 6 is false in the original. Correct principle: negative multiplier or divisor flips the sign, every time, and a test value confirms it.
• MISTAKE 9 — Chaining a modulus union. Why it fails: |x| > 3 written as -3 > x > 3 claims x is both below -3 and above 3. Correct principle: "greater than" modulus answers are two rays joined by OR; "less than" answers are one interval joined by AND.
• MISTAKE 10 — Locating roots with the discriminant alone. Why it fails: D ≥ 0 certifies real roots but is silent about their position; roots at -5 and 5 pass D ≥ 0 for a "both roots exceed 2" demand. Correct principle: location needs the triple check — discriminant, axis position, and sign of a x f(k).

Worked Examples — Basic to Challenging
• EXAMPLE 1 — Problem: Evaluate (1 + i)^8 + (1 - i)^8.
• Given: The two bases are conjugates; (1 + i)^2 = 2i and (1 - i)^2 = -2i.
• Principle: Repeated squaring beats eight multiplications; conjugate powers give conjugate results.
• Steps: (1 + i)^2 = 2i, so (1 + i)^4 = (2i)^2 = -4 and (1 + i)^8 = (-4)^2 = 16. Similarly (1 - i)^8 = 16.
• Answer: 16 + 16 = 32.
• Reasoning: Each squaring is one line, and the cross-check via polar form agrees: modulus (sqrt(2))^8 = 16 with argument 8 x (pi/4) = 2pi, landing on 16.
• Mistake to avoid: Expanding with the binomial theorem term by term — eight chances to drop an i^2 sign for a result obtainable in three squarings.
• EXAMPLE 2 — Problem: Find the modulus and principal argument of z = -1 - sqrt(3) i, and write z in polar form.
• Given: a = -1, b = -sqrt(3): third quadrant.
• Principle: |z| = sqrt(a^2 + b^2); argument from the reference angle plus the quadrant recipe.
• Steps: |z| = sqrt(1 + 3) = 2. alpha = arctan(sqrt(3)/1) = pi/3. Quadrant III: arg z = -(pi - alpha) = -(pi - pi/3) = -2pi/3.
• Answer: |z| = 2, arg z = -2pi/3, and z = 2(cos(-2pi/3) + i sin(-2pi/3)).
• Reasoning: Verify by expansion: 2 cos(-2pi/3) = 2 x (-1/2) = -1 and 2 sin(-2pi/3) = 2 x (-sqrt(3)/2) = -sqrt(3). The polar form rebuilds the original number.
• Mistake to avoid: Answering 2pi/3 or 4pi/3 — the first has the wrong sign for a third-quadrant point below the axis, the second is outside the principal range.
• EXAMPLE 3 — Problem: If omega is a non-real cube root of unity, evaluate (1 - omega + omega^2)(1 + omega - omega^2).
• Given: The only facts available: omega^3 = 1 and 1 + omega + omega^2 = 0.
• Principle: Merge pairs first — in each bracket, two of the three terms combine via the sum-to-zero identity.
• Steps: First bracket: 1 + omega^2 = -omega, so it equals -omega - omega = -2 omega. Second bracket: 1 + omega = -omega^2, so it equals -omega^2 - omega^2 = -2 omega^2. Multiply: (-2 omega)(-2 omega^2) = 4 omega^3 = 4 x 1 = 4.
• Answer: 4.
• Reasoning: The problem is engineered so each bracket collapses to a single term; expanding into coordinates (-1/2 ± i sqrt(3)/2) also works but takes five times longer.
• Mistake to avoid: Expanding the product blindly into six terms and then drowning — if a cube-root expression does not collapse within two moves, you have missed a pair-merge.
• EXAMPLE 4 — Problem: alpha and beta are roots of x^2 - 3x + 1 = 0. Find alpha^3 + beta^3 without solving the equation.
• Given: Vieta data: alpha + beta = 3, alpha beta = 1.
• Principle: alpha^3 + beta^3 = (alpha + beta)^3 - 3 alpha beta (alpha + beta) — symmetric, so Vieta suffices.
• Steps: (3)^3 - 3 x 1 x 3 = 27 - 9 = 18.
• Answer: 18.
• Reasoning: The actual roots are (3 ± sqrt(5))/2, whose cubes involve nested surds — yet their sum is the clean integer 18, because the surd parts cancel in any symmetric combination.
• Mistake to avoid: Solving for the roots and cubing them — the problem is a Vieta test wearing a cube costume.
• EXAMPLE 5 — Problem: Find all m for which both roots of x^2 - 6x + m = 0 are greater than 2.
• Given: a = 1, b = -6, c = m; target location k = 2.
• Principle: The location triple check: D ≥ 0, axis > k, a f(k) > 0.
• Steps: D = 36 - 4m ≥ 0 gives m ≤ 9. Axis = 3 > 2, automatic. f(2) = 4 - 12 + m = m - 8 > 0 gives m > 8. Intersect: 8 < m ≤ 9.
• Answer: 8 < m ≤ 9.
• Reasoning: Boundary audit: m = 9 gives the double root 3 (allowed — it exceeds 2); m = 8 gives roots 2 and 4, and the root equal to 2 is not GREATER than 2, so 8 is excluded. The asymmetry of the interval (open at 8, closed at 9) is the problem's whole point.
• Mistake to avoid: Reporting m < 9 from the discriminant alone, which admits m = 0 — roots 0 and 6, nowhere near the demand.
• EXAMPLE 6 — Problem: Solve (2x - 3)/(x + 1) ≥ 1.
• Given: A rational inequality with a non-zero right side.
• Principle: Never multiply out the denominator. Bring everything to one side, combine into a single fraction, then wavy curve.
• Steps: Subtract 1: (2x - 3)/(x + 1) - 1 = (2x - 3 - x - 1)/(x + 1) = (x - 4)/(x + 1) ≥ 0. Critical points: 4 (numerator, includable) and -1 (denominator, never includable). Sign chart: positive for x > 4, negative between -1 and 4, positive for x < -1.
• Answer: x < -1 or x ≥ 4.
• Reasoning: Test all three regions in the original: x = 5 gives 7/6 ≥ 1, true. x = 0 gives -3 ≥ 1, false. x = -2 gives 7 ≥ 1, true. The solution set matches every test.
• Mistake to avoid: Cross-multiplying by (x + 1) — it produces x ≥ 4 only and silently murders the entire x < -1 ray.
• EXAMPLE 7 — Problem: The feasible region is x + y ≤ 4, x ≥ 0, y ≥ 0. Find the maximum and minimum of Z = x + 2y on it.
• Given: A triangular region with corners at pairwise intersections of the boundary lines.
• Principle: The corner principle — a linear objective on a polygon peaks at a corner.
• Steps: Corners: (0, 0) from the two axes; (4, 0) from y = 0 with x + y = 4; (0, 4) from x = 0 with x + y = 4. Evaluate Z: 0, 4, and 8.
• Answer: Maximum 8 at (0, 4); minimum 0 at (0, 0).
• Reasoning: Z rewards y twice as much as x, so the optimum slides to the corner richest in y — intuition and the corner computation agree, but the computation is the proof.
• Mistake to avoid: Testing the centre of the region or a random interior point — no interior point of a polygon ever beats the best corner for a linear objective.

Practice Questions — Self-Test Set
• Q1 — Evaluate i^2025 + i^2026 + i^2027 + i^2028.
• Q2 — For z = 1 - i sqrt(3), state |z| and the principal value of arg z.
• Q3 — If omega is a non-real cube root of unity, evaluate (1 + omega^2)^5.
• Q4 — alpha and beta are roots of x^2 - 7x + 3 = 0. Find alpha^2 + beta^2.
• Q5 — Find all k for which 3x^2 - kx + 12 = 0 has equal roots.
• Q6 — Solve (x - 5)(x + 2) ≤ 0.
• Q7 — Solve |x + 1| > 4.
• Q8 — Describe the locus of points z satisfying |z - 2| = |z + 2|.

▸ Answer Key with Explanations
• A1 — 0. The four exponents are consecutive, and any four consecutive powers of i sum to zero: i + (-1) + (-i) + 1 in some rotation. Misconception: computing each power separately via mod 4 also gives i - 1 - i + 1 = 0 — correct but slower; the block cancellation is the pattern to internalise.
• A2 — |z| = 2 and arg z = -pi/3. Misconception: answering pi/3 (forgetting the point is BELOW the axis, quadrant IV) or 5pi/3 (outside the principal range). The sign of b decides the sign of the argument in the right half-plane.
• A3 — -omega^2. Since 1 + omega^2 = -omega, the expression is (-omega)^5 = -omega^5 = -omega^2 (omega^5 = omega^3 x omega^2). Misconception: answering omega^2 by dropping the minus sign, or expanding omega = -1/2 + i sqrt(3)/2 into a binomial slog.
• A4 — 43. Sum 7, product 3, so alpha^2 + beta^2 = 49 - 2 x 3 = 43. Misconception: 49 - 3 = 46, from forgetting the factor 2 in (alpha + beta)^2 = alpha^2 + beta^2 + 2 alpha beta.
• A5 — k = 12 or k = -12. Equal roots need D = k^2 - 144 = 0. Misconception: reporting only k = 12 — D is quadratic in k, and both square roots are legitimate parameters.
• A6 — -2 ≤ x ≤ 5. The product of two linear factors is ≤ 0 between its roots, endpoints included since the factors vanish there. Misconception: flipping to the outside intervals, which is the answer for ≥ 0, not ≤ 0.
• A7 — x > 3 or x < -5. Distance from -1 exceeding 4 gives two rays. Misconception: writing -5 > x > 3 as a chain, or answering with a single interval — a "greater than" modulus never produces one interval.
• A8 — The imaginary axis, Re(z) = 0. The points are equidistant from 2 and -2, so the locus is their perpendicular bisector — the y-axis of the Argand plane. Misconception: calling it a circle; equal distances to two fixed points always give a straight line, never a curve.

Chapter Summary, Revision Checklist and Self-Assessment
• SUMMARY — Complex numbers begin with one audacious definition, i^2 = -1, and everything else is bookkeeping: the i-cycle of period 4, division by conjugates, modulus as distance, and argument as direction with its principal range -pi < arg z ≤ pi. Polar form turns multiplication into scaling-plus-rotation, De Moivre turns powers into angle multiplication, and the cube roots of unity — 1, omega, omega^2 with omega^3 = 1 and 1 + omega + omega^2 = 0 — are the recurring special case IAT cannot resist.
• SUMMARY — Quadratics are governed by two instruments: the discriminant D = b^2 - 4ac, which classifies roots and powers the always-positive test and location problems, and Vieta's relations, which extract symmetric information about roots without solving. Add the location triple check (D, axis, a f(k)) and the common-root subtraction trick, and the unit is complete.
• SUMMARY — Inequalities trade points for intervals. The sign flips under multiplication by a negative; products and quotients fall to the wavy curve, with its multiplicity rule and its absolute ban on including denominator zeros; modulus is distance on the number line; and two-variable systems carve out polygons whose corners optimise any linear objective — the doorway to Linear Programming.
• REVISION CHECKLIST — I can reduce any i^n in under five seconds using mod 4, and any omega^n using mod 3.
• REVISION CHECKLIST — I can divide two complex numbers by the conjugate method and state |z| and arg z for points in all four quadrants without touching a calculator's arctan blindly.
• REVISION CHECKLIST — I can translate |z - z0| = r, |z - z1| = |z - z2| and |z - z1| + |z - z2| = 2a into their shapes instantly, centres and radii included.
• REVISION CHECKLIST — I can write any complex number in polar form and use De Moivre for powers and for listing all n-th roots.
• REVISION CHECKLIST — I can classify roots from D, build a quadratic from given roots, and reduce symmetric expressions in alpha and beta to sum and product.
• REVISION CHECKLIST — I can run the location triple check and justify each of its three parts, including why k between the roots needs only a f(k) < 0.
• REVISION CHECKLIST — I can solve product, quotient and modulus inequalities with the wavy curve and distance readings, and I never multiply through by a denominator.
• REVISION CHECKLIST — I can graph a two-variable system, list its corners, and optimise a linear objective by corner evaluation.
• SELF-ASSESSMENT — Score yourself honestly: 8 of 8 checklist items secure means exam-ready. 5 to 7 means drill the practice set again after re-reading the weak sections. Below 5 means rebuild in order — Sections 1 to 2 for complex arithmetic, Section 9 for Vieta, Section 14 for the wavy curve — then return to the worked examples and try each with the solution covered.
<!-- END math_ch_3 detailedStudyNotes -->
