<!-- BEGIN math_ch_5 detailedStudyNotes -->
Introduction — Vectors with a Sense of Direction
• In Physics you met vectors as arrows with jobs: velocity, force, displacement. This chapter strips the physics away and studies the arrows themselves — how they are written, added, multiplied and turned into proofs. The reward is a machine that solves geometry without needing a single clever diagram.
• DEFINITION — A vector is a quantity that has both magnitude and direction, represented by an arrow whose length is the magnitude and whose sense is the direction. A quantity with magnitude alone, like mass, temperature or speed, is a scalar.
• NOTATION used throughout this chapter — a vector is written as a = a1 i + a2 j + a3 k, where i, j and k are the unit vectors along the x, y and z axes. The magnitude of a is written |a|. The dot product is written a.b, the cross product is written a x b, and a-hat means the unit vector in the direction of a.
• WHY the algebra matters — once a direction becomes three numbers, geometry questions turn into arithmetic: angles become a dot product, areas become a cross product, volumes become one determinant, and "prove these points are collinear" becomes "solve for lambda". The IAT loves exactly these translations.
• EXAMPLE — The displacement from P(1, 2, 3) to Q(4, 6, 3) is the vector PQ = (4 - 1) i + (6 - 2) j + (3 - 3) k = 3i + 4j, and its magnitude is sqrt(9 + 16) = 5. One subtraction produced the arrow; one Pythagoras produced its length.
★ HIGHLIGHT — The chapter in one breath: components turn directions into numbers; the dot product extracts angles and projections; the cross product extracts areas and normals; the scalar triple product extracts volumes and detects flatness. Four tools, four geometric questions answered.
• A roadmap warning — Physics used these products as tools. Here you must also know their algebraic personalities: the dot product commutes, the cross product anti-commutes, and confusing the two personalities is where most marks quietly leak away.

Types of Vectors — Meet the Cast
• DEFINITION — The zero vector, written 0, has magnitude zero and no defined direction; it is the only vector whose start and end coincide, and a + 0 = a for every vector a.
• DEFINITION — A unit vector has magnitude exactly 1 and carries pure direction with no size. The vectors i, j, k are unit vectors, and for any nonzero a, the vector a-hat = a / |a| is the unit vector along a.
• DEFINITION — Equal vectors have the same magnitude and the same direction, wherever they happen to start. A vector is a free arrow: it can be slid parallel to itself anywhere in space without changing what it is.
• DEFINITION — Collinear (parallel) vectors point along the same line or along parallel lines: b is collinear with a exactly when b = lambda a for some scalar lambda. Like vectors have the same direction; unlike vectors are collinear with opposite directions.
• DEFINITION — Coplanar vectors lie in, or are parallel to, one common plane. Any two vectors are always coplanar, because two arrows through one point always define a plane; three or more vectors may fail to be coplanar.
• DEFINITION — The negative of a, written -a, has the same magnitude as a and the opposite direction, so a + (-a) = 0. Coinitial vectors share an initial point; coterminous vectors share a terminal point.
• EXAMPLE — The vectors 2i + 4j and i + 2j are collinear because the second is exactly half the first (lambda = 1/2). The vectors 3i and -5i are unlike collinear vectors: same line, opposite senses, different lengths.
⚠ EXAM TRAP — "Equal" is stricter than "collinear": equality demands the same magnitude AND the same direction. And parallel does not require equal lengths — any option that rejects 2a as "not parallel to a" is simply wrong.
• YOUR TURN — Is the vector (6i - 8j) / 10 a unit vector? Answer — yes: its magnitude is sqrt(36 + 64) / 10 = 10 / 10 = 1. It is exactly the unit vector along 6i - 8j.

Components — a Vector Is Its Coordinates
• DEFINITION — The components of a = a1 i + a2 j + a3 k are the signed lengths of its projections on the three axes. Geometrically, a is the diagonal of the rectangular box whose three edges, starting at its tail, are a1, a2 and a3 along the axes.
✔ KEY FORMULA — Magnitude: |a| = sqrt(a1^2 + a2^2 + a3^2); in two dimensions the same formula simply drops the third term. Components behave component-wise: the first component of a + b is a1 + b1, and the first component of lambda a is lambda a1, and so on for every axis.
• WORKED PATTERN — The vector between two points is always "head minus tail": for P(x1, y1, z1) and Q(x2, y2, z2), the vector PQ = (x2 - x1) i + (y2 - y1) j + (z2 - z1) k. Almost every component you will ever need is born from one such subtraction.
• EXAMPLE — a = 2i - 3j + 6k has magnitude sqrt(4 + 9 + 36) = sqrt 49 = 7 — a dressed-up 2-3-6 Pythagorean pattern worth recognising on sight, because examiners reuse it constantly.
• WHY components beat pictures — a diagram can only suggest that two vectors are perpendicular; components prove it with one line of arithmetic. Every test in this chapter — angle, area, volume, collinearity — is a component computation wearing a geometric costume.
• EXAMPLE — The vector from A(1, 0, 2) to B(4, 4, 2) is 3i + 4j + 0k. Its z-component is 0, which tells you instantly that AB runs parallel to the xy plane. Components narrate geometry if you read them.
★ HIGHLIGHT — Two numbers in 2D, three numbers in 3D: that is the entire vector. If a problem hands you points, your first move is always the same — subtract to get components, then let the products of the coming sections do the heavy lifting.
⚠ EXAM TRAP — The magnitude is the root of the SUM OF SQUARES, never the sum of the components: |3i + 4j| is 5, not 7. And a negative component like -3j still contributes +9 to the squared magnitude.
• YOUR TURN — Find |a| for a = i - 2j + 2k. Answer — sqrt(1 + 4 + 4) = sqrt 9 = 3.

Direction Cosines and Direction Ratios
• DEFINITION — If a vector makes angles alpha, beta and gamma with the positive x, y and z axes, then l = cos alpha, m = cos beta and n = cos gamma are its direction cosines. They are exactly the three components of the unit vector a-hat.
✔ KEY FORMULA — l^2 + m^2 + n^2 = 1. For a = a1 i + a2 j + a3 k, the cosines are l = a1 / |a|, m = a2 / |a| and n = a3 / |a| — the components, each divided by the magnitude.
• DEFINITION — Direction ratios are any three numbers proportional to the direction cosines — most conveniently the components a1, a2, a3 themselves. Ratios describe the direction, but only the cosines are actual cosines of actual angles.
• EXAMPLE — For a = 2i + 3j + 6k with |a| = 7, the direction cosines are 2/7, 3/7 and 6/7. Audit: 4/49 + 9/49 + 36/49 = 49/49 = 1, exactly as the identity demands.
• WORKED PATTERN — Given two of the three axis angles, the third falls out of the identity: cos^2 gamma = 1 - cos^2 alpha - cos^2 beta. The square root leaves a genuine plus-or-minus sign: two mirror-image directions both satisfy the same data, and both are legitimate answers.
• EXAMPLE — A line equally inclined to all three axes has l = m = n, so 3l^2 = 1 and l = 1 / sqrt 3: the angle with each axis is the angle whose cosine is 1 / sqrt 3, about 54.74 degrees. This is the direction of a cube's body diagonal — keep it in mind for the geometry section.
⚠ EXAM TRAP — Direction ratios are NOT cosines until they are divided by the magnitude. Writing cos alpha = 2 for the vector 2i + 3j + 6k is a classic blunder: a cosine can never exceed 1, so the normalisation step can never be skipped.
• YOUR TURN — Find the direction cosines of i + 2j + 2k. Answer — |a| = 3, so l = 1/3, m = 2/3 and n = 2/3.

Position Vectors and the Section Formula
• DEFINITION — The position vector of a point P is the vector OP from the origin to P; the point (x, y, z) has position vector x i + y j + z k. Position vectors turn every point into a vector, so all of point geometry becomes vector algebra.
✔ KEY FORMULA — Section formula, internal division: the point P dividing AB in the ratio m : n, meaning AP : PB = m : n, has position vector (m b + n a) / (m + n), where a and b are the position vectors of A and B. The midpoint is the case m = n, giving (a + b) / 2.
✔ KEY FORMULA — Section formula, external division: the point dividing AB externally in the ratio m : n has position vector (m b - n a) / (m - n). The centroid of a triangle with position vectors a, b, c is (a + b + c) / 3 — the plain average of the three.
• WHY the weights cross — the larger m is, the closer P sits to B, and the formula indeed weights b more heavily. The weight attached to an endpoint is proportional to the segment at the OTHER end. If your computed point lands closer to the wrong endpoint, you have crossed the weights the wrong way.
• EXAMPLE — A has position vector 2i + 3j and B has position vector 5i + 7j. The midpoint is (7/2) i + 5j. The point dividing AB internally in the ratio 2 : 1 is (2(5i + 7j) + 1(2i + 3j)) / 3 = 4i + (17/3) j.
• EXAMPLE — Dividing the same AB externally in the ratio 3 : 1 gives (3(5i + 7j) - (2i + 3j)) / (3 - 1) = (13/2) i + 9j, which lies beyond B on the line from A through B. External points always sit outside the segment — if yours lands between A and B, a sign has gone wrong.
⚠ EXAM TRAP — Ratio order is a loaded gun: "divides AB in the ratio 2 : 1" means AP : PB = 2 : 1, measured from A. Read which endpoint the ratio starts from before touching the formula, then sanity-check that your point sits closer to the end carrying the larger share.
• YOUR TURN — Find the midpoint of the segment joining the points with position vectors 3i - j + 2k and i + 5j - 4k. Answer — ((3 + 1) / 2) i + ((-1 + 5) / 2) j + ((2 - 4) / 2) k = 2i + 2j - k.

Vector Addition — Triangle and Parallelogram Laws
• DEFINITION — Triangle law: if two vectors are drawn head-to-tail, their sum is the vector from the tail of the first to the head of the second. In symbols, AB + BC = AC — the middle point cancels, a pattern worth memorising in itself.
• DEFINITION — Parallelogram law: if two vectors drawn from one point are adjacent sides of a parallelogram, their sum is the diagonal drawn from that same point. It is the triangle law drawn twice; the two laws are one fact in two costumes.
✔ KEY FORMULA — Addition is component-wise, commutative and associative: a + b = b + a and (a + b) + c = a + (b + c). The bridge identity |a + b|^2 = |a|^2 + |b|^2 + 2 a.b connects addition to the dot product of the next sections.
• EXAMPLE — Walk 3 km east, then 4 km north: your displacement is 3i + 4j with magnitude 5 km, even though you walked 7 km. Distance walked is a scalar sum; displacement is a vector sum — that difference is the entire point of this chapter.
• EXAMPLE — a = 2i + 3j and b = i - 2j give a + b = 3i + j, with |a + b| = sqrt 10. Notice |a| = sqrt 13 and |b| = sqrt 5: magnitudes never add the way components do.
• Subtraction is addition in disguise: a - b = a + (-b), and geometrically it is the vector from the tip of b to the tip of a when both start at the same point. The workhorse formula AB = b - a for position vectors is exactly this move.
★ HIGHLIGHT — The polygon rule scales everything up: a chain of vectors placed head-to-tail sums to the single vector from the first tail to the last head, and a closed polygon sums to zero. Around any triangle, AB + BC + CA = 0.
⚠ EXAM TRAP — |a + b| equals |a| + |b| only when a and b are like collinear vectors. In general the triangle inequality rules: |a + b| is at most |a| + |b|, with equality reserved for same-direction vectors.
• YOUR TURN — If a = i - 2j + k and b = 2i + j - 3k, find a - b. Answer — (1 - 2) i + (-2 - 1) j + (1 + 3) k = -i - 3j + 4k.

Scalar Multiplication and Unit Vectors
• DEFINITION — Multiplying a vector by a scalar lambda stretches it: lambda a has magnitude |lambda| times |a|, the same direction as a when lambda is positive, the opposite direction when lambda is negative, and 0 a = 0. The components simply scale: lambda (a1 i + a2 j + a3 k) = (lambda a1) i + (lambda a2) j + (lambda a3) k.
✔ KEY FORMULA — The unit vector along a is a-hat = a / |a|, and the vector of magnitude M in the direction of a is M a / |a|. Dividing by the magnitude — once, with the root-sum-of-squares value — is the only normalising move in this chapter.
• WORKED PATTERN — To build a vector of a given length along a given direction, use two moves in this order: first normalise (divide by the length), then scale (multiply by the target length).
• EXAMPLE — a = 3i + 4j - 12k has |a| = sqrt(9 + 16 + 144) = 13, so a-hat = (3i + 4j - 12k) / 13, and the vector of magnitude 26 along a is simply twice a: 6i + 8j - 24k.
• EXAMPLE — The vector of magnitude 5 along i - 2j + 2k is (5/3)(i - 2j + 2k), because |i - 2j + 2k| = 3. Fractions like 5/3 are normal in these answers; do not try to "fix" them.
• Finding an unknown component from a magnitude: if a = 2i + x j + k has |a| = 3, then 4 + x^2 + 1 = 9, so x^2 = 4 and x = 2 or x = -2. Magnitudes always leave a sign ambiguity, and both answers describe genuine vectors.
⚠ EXAM TRAP — A unit vector is not made by dividing each component by the number of components, nor by dividing by |a|^2. It is a / |a|, exactly once. Options showing unnormalised or doubly-divided vectors are planted bait.
• YOUR TURN — Write the vector of magnitude 5 in the direction of 6i - 8j. Answer — |6i - 8j| = 10, so the unit vector is (3i - 4j) / 5 and scaling by 5 gives 3i - 4j.

The Dot Product — Measuring Alignment
• DEFINITION — The dot product of a and b is the SCALAR a.b = |a| |b| cos theta, where theta is the angle between the vectors placed tail to tail, always taken between 0 and 180 degrees. It measures how much the two vectors point the same way.
✔ KEY FORMULA — In components: a.b = a1 b1 + a2 b2 + a3 b3. The angle follows from cos theta = (a.b) / (|a| |b|). The perpendicular test is the sharpest special case: a and b are perpendicular exactly when a.b = 0.
✔ KEY FORMULA — The scalar projection of a on b is (a.b) / |b|: the signed length of the shadow a casts on the b direction. The projection VECTOR is ((a.b) / |b|^2) b. A length versus a vector — the exam tests the difference deliberately.
• The dot product is polite algebra: it commutes (a.b = b.a), it distributes over addition, and a.a = |a|^2. The axis facts i.i = j.j = k.k = 1 and i.j = j.k = k.i = 0 are exactly why the component formula works.
• EXAMPLE — a = 2i + 3j - k and b = i - j + 2k give a.b = 2 - 3 - 2 = -3. The negative sign announces an obtuse angle before any magnitude is computed. The scalar projection of a on b is -3 / sqrt 6, about -1.22: the shadow of a on the b line points opposite to b itself.
• WHY the sign is a diagnosis — a.b positive means an acute angle, zero means a right angle, negative means an obtuse angle. Half of all dot-product questions are settled by the sign alone.
• WORKED PATTERN — The standard three steps: (1) compute a.b from components, (2) compute |a| and |b|, (3) divide to get cos theta. If only perpendicularity is asked, stop after step one — zero or not zero is the whole answer.
• The physicist's souvenir: work is a dot product, W = F.d. For F = 3i + 4j newtons and displacement d = 2i + j metres, W = 6 + 4 = 10 joules. Only the component of force along the motion earns its keep — the projection idea, cashed.
★ HIGHLIGHT — a.b is a number, not a vector. It has no direction, cannot be drawn as an arrow, and an expression like (a.b) x c is meaningless because there is nothing left to cross. Examiners probe exactly this with "which of the following is a vector" questions.
⚠ EXAM TRAP — Projection direction matters: the projection of a on b divides by |b| — the magnitude of the vector you project ONTO — never by |a|. Swapping them is the single most common dot-product error, and the options always include the swapped value.
• YOUR TURN — Find the scalar projection of a = i - j on b = i + j. Answer — a.b = 1 - 1 = 0, so the projection is 0: the vectors are perpendicular, and a casts no shadow on b at all.

The Cross Product — Area with a Direction
• DEFINITION — The cross product a x b is the VECTOR whose magnitude is |a| |b| sin theta and whose direction is perpendicular to both a and b, fixed by the right-hand rule: curl the fingers of your right hand from a toward b, and your thumb points along a x b.
✔ KEY FORMULA — In components, a x b is the determinant with rows (i, j, k), (a1, a2, a3), (b1, b2, b3): it equals (a2 b3 - a3 b2) i - (a1 b3 - a3 b1) j + (a1 b2 - a2 b1) k. The j component carries the minus sign — tattoo it.
✔ KEY FORMULA — |a x b| is the area of the parallelogram with adjacent sides a and b; the area of the triangle on the same two sides is (1/2) |a x b|. The unit normal to both vectors is n-hat = (a x b) / |a x b|.
• The cross product is rude algebra: it ANTI-commutes, b x a = -(a x b), and a x a = 0 for every a. The cyclic trio i x j = k, j x k = i, k x i = j — with the sign flipping whenever a pair is reversed — is the multiplication table to memorise cold.
• EXAMPLE — For a = 2i + 3j - k and b = i - j + 2k, the determinant gives a x b = (3 x 2 - (-1)(-1)) i - (2 x 2 - (-1)(1)) j + (2(-1) - 3 x 1) k = 5i - 5j - 5k. Audit it: (5i - 5j - 5k).a = 10 - 15 + 5 = 0 and (5i - 5j - 5k).b = 5 + 5 - 10 = 0. A cross product must be perpendicular to both parents; this two-second check catches most determinant slips.
• EXAMPLE — The parallelogram on those two sides has area |a x b| = sqrt(25 + 25 + 25) = 5 sqrt 3, the triangle on the same sides has area (5 sqrt 3) / 2, and the unit normal is (i - j - k) / sqrt 3.
• Collinearity test: for nonzero vectors, a x b = 0 exactly when a and b are parallel. Witness the 2D pair 2i + 4j and i + 2j: the k-component of their cross product is 2 x 2 - 4 x 1 = 0, and indeed one vector is twice the other.
• The physicist's souvenir: torque, the moment of a force, is r x F. That is why a door is easiest to push at its far edge, at right angles to the door: sin theta is at its maximum there and collapses to zero when you push along the door's own plane.
★ HIGHLIGHT — Dot and cross are complementary twins. The dot product extracts the parallel part of the relationship — projection and alignment; the cross product extracts the perpendicular part — area and turning. When |a.b| is at its largest, |a x b| vanishes, and vice versa.
⚠ EXAM TRAP — Three recurring cross-product wounds: forgetting the minus sign on the j component of the determinant; reporting the parallelogram area when the triangle was asked, dropping the half; and assuming a x b equals b x a. All three are planted as options every single year.
• YOUR TURN — Find the area of the triangle with adjacent sides a = i + 2j and b = 2i - j. Answer — the k-component of a x b is 1 x (-1) - 2 x 2 = -5, so |a x b| = 5 and the area is 5/2.

The Scalar Triple Product — Volume in One Number
• DEFINITION — The scalar triple product [a b c] = a.(b x c) blends the two products into one scalar: the signed volume of the parallelepiped — the slanted box — built on the three coterminous edges a, b, c. Its sign reports the handedness of the trio: positive for a right-handed set.
✔ KEY FORMULA — [a b c] equals the determinant of the three component rows. The volume of the parallelepiped is |[a b c]|; the volume of the tetrahedron on the same three edges is (1/6) |[a b c]|.
✔ KEY FORMULA — Coplanarity test: a, b and c are coplanar exactly when [a b c] = 0 — a flat parallelepiped has no volume. Four points A, B, C, D are coplanar exactly when [AB AC AD] = 0, using edge vectors from one vertex.
• The product is cyclically tame: [a b c] = [b c a] = [c a b], but swapping any two vectors flips the sign, so [b a c] = -[a b c]. And [i j k] = 1, the volume of the unit cube, as it must be.
• EXAMPLE — For a = i + j, b = j + k and c = k + i, the determinant of the rows (1, 1, 0), (0, 1, 1), (1, 0, 1) is 1(1 - 0) - 1(0 - 1) + 0 = 2. The parallelepiped has volume 2, and the tetrahedron on the same edges has volume 2/6 = 1/3.
• A scaling identity worth its mark: [a + b, b + c, c + a] = 2 [a b c]. Expand the determinant and every one of a, b, c ends up counted exactly twice — a two-minute row-operation exercise that the IAT has recycled in several costumes.
• WORKED PATTERN — Every triple-product question has one of three shapes: (1) compute a volume — evaluate the determinant, take the absolute value, and divide by 6 only for a tetrahedron; (2) test coplanarity — ask whether the determinant is zero; (3) find lambda — put lambda in one component, expand, set the determinant to zero and solve the LINEAR equation that results.
★ HIGHLIGHT — Volume zero is geometry's flatness alarm. Whenever a problem whispers "coplanar", "lies in the same plane" or "four points", reach for [a b c] = 0 before reaching for anything else.
⚠ EXAM TRAP — Volume is never negative: a determinant of -12 means a volume of 12, and the tetrahedron on those edges has volume 2, not -2. And the division by 6 belongs to tetrahedra alone; the parallelepiped takes |[a b c]| whole.
• YOUR TURN — Find the volume of the parallelepiped with edges 2i, 3j and 4k. Answer — [2i, 3j, 4k] = 2 x 3 x 4 x [i j k] = 24.

▸ Vector Triple Product and Lagrange's Identity
• DEFINITION — The vector triple product a x (b x c) expands by the BAC-CAB rule: a x (b x c) = (a.c) b - (a.b) c. Notice the result is built from b and c alone, so it always lies in the plane of b and c — never along a.
• EXAMPLE — Take a = i, b = i + j and c = k. Then b x c = i - j, and a x (b x c) = i x (i - j) = -k. The formula agrees: (a.c) b - (a.b) c = 0 x b - 1 x k = -k. Two routes, one answer.
✔ KEY FORMULA — Lagrange's identity: |a x b|^2 + (a.b)^2 = |a|^2 |b|^2. It is the statement cos^2 theta + sin^2 theta = 1 wearing vector clothes, and it converts between the two products without ever finding the angle.
• EXAMPLE — For the running pair a = 2i + 3j - k and b = i - j + 2k: |a x b|^2 = 75 and (a.b)^2 = 9, totalling 84, while |a|^2 |b|^2 = 14 x 6 = 84. Identity verified — use it whenever a question hands you one product and demands the other.
• Vector equations in one breath: an unknown vector r is pinned down by combining a cross condition like r x a = b with a dot condition like r.c = lambda. Dot or cross the given equation with carefully chosen vectors, expand with BAC-CAB, and r isolates itself. The technique is always: expand first, solve second.
⚠ EXAM TRAP — a x (b x c) is NOT (a x b) x c in general: the cross product is not associative, and the two sides are genuinely different vectors. The brackets inside a triple product are load-bearing, not decorative.

Collinearity and Coplanarity — the Lambda Tests
• The pattern of this section: an unknown lambda sits inside a vector, a geometric condition is imposed, and one clean equation drops out. Three conditions, three tests — the skill is matching the right test to the right condition.
✔ KEY FORMULA — Three points with position vectors a, b, c are collinear exactly when the joining vectors are parallel: AB = lambda AC for some lambda. Equivalently, the middle point's position vector is a weighted average of the other two with weights summing to 1 — the section formula run in reverse.
• WORKED PATTERN — Collinear points: build two joining vectors from the same point, demand that their components be proportional, and read lambda off the ratios. Every ratio must agree; the component you did not use becomes your free verification.
• EXAMPLE — Points A, B, C have position vectors i + j, 2i + 3j and 4i + lambda j. Then AB = i + 2j and AC = 3i + (lambda - 1) j. The i-components fix the ratio at 3, so proportionality demands lambda - 1 = 3 x 2 = 6, giving lambda = 7.
✔ KEY FORMULA — Coplanarity of three vectors: a, b, c are coplanar exactly when [a b c] = 0. With lambda inside one component, expand the determinant, set it to zero and solve: a determinant is always LINEAR in any single component, so the equation never fights back.
• EXAMPLE — The vectors a = 2i + j, b = i - j + 2k and c = 3i + lambda k have component rows (2, 1, 0), (1, -1, 2), (3, 0, lambda), and the determinant expands to -2 lambda - (lambda - 6) = 6 - 3 lambda. Setting it to zero gives lambda = 2.
• For four points, the same alarm: D lies in the plane of ABC exactly when [AB AC AD] = 0. Build the three edge vectors out of one vertex and test those — never feed raw position vectors into the determinant.
⚠ EXAM TRAP — Two vectors are ALWAYS coplanar, so "show that a and b are coplanar" is a free statement, not a task; the test only bites for three vectors. And collinearity of points is a claim about joining vectors: testing whether the position vectors themselves are proportional tests whether the points lie on one line through the ORIGIN — a different claim entirely.
• YOUR TURN — The vectors a = lambda i + 2j and b = 4i - j are collinear. Find lambda. Answer — component proportionality gives lambda / 4 = 2 / (-1) = -2, so lambda = -8.

Vectors Prove Geometry — Midpoints and Diagonals
• The method of this section: give every point a position vector, translate the geometric claim into algebra, and watch it prove itself. No constructions, no auxiliary lines, no diagram luck — the vectors are the proof.
• PROOF — Midpoint theorem. In triangle OAB, let A and B have position vectors a and b. The midpoints M of OA and N of OB have position vectors a/2 and b/2, so the vector MN = b/2 - a/2 = (b - a) / 2 = (1/2) AB. That single line says MN is parallel to AB and half its length. Proved.
• PROOF — Diagonals of a parallelogram bisect each other. Let one corner be the origin and the adjacent vertices have position vectors a and b; the fourth vertex is then a + b. The diagonal from the origin ends at a + b and has midpoint (a + b) / 2. The other diagonal joins the points a and b and has midpoint (a + b) / 2. The midpoints coincide, so each diagonal cuts the other in half. Proved.
• PROOF — The medians concur at the centroid. The point two-thirds of the way from vertex A to the midpoint of BC is (a + 2 x ((b + c) / 2)) / 3 = (a + b + c) / 3. Running the same computation from vertex B or C lands on the identical point — and that coincidence is precisely the concurrency of the medians, with the meeting point at the centroid (a + b + c) / 3.
• EXAMPLE — The angle between a cube's diagonals. Two body diagonals of a unit cube are d1 = i + j + k and d2 = i + j - k. Their dot product is 1 + 1 - 1 = 1, each has magnitude sqrt 3, so cos theta = 1 / 3 and theta is about 70.53 degrees — the famous fixed angle between any two body diagonals of a cube.
• EXAMPLE — Triangle area straight from vertices. The vertices have position vectors i + 2j + 3k, 2i - j + k and 3i + j - k. From the first vertex: AB = i - 3j - 2k and AC = 2i - j - 4k, and AB x AC = 10i + 0j + 5k with magnitude 5 sqrt 5. The area is (5 sqrt 5) / 2 — position vectors in, area out, with no base and no height ever measured.
★ HIGHLIGHT — The universal recipe for area and volume questions: pick one vertex as a local origin, subtract to get the edge vectors, then take (1/2) |AB x AC| for a triangle's area or (1/6) |[AB AC AD]| for a tetrahedron's volume.
⚠ EXAM TRAP — The area formula eats EDGE vectors from ONE vertex. Feeding raw position vectors into the cross product silently computes the area of the triangle those points make with the origin — a different triangle. The subtraction step is where this question is won or lost.
• YOUR TURN — The position vectors of P and Q are 3i + 2j - k and i - 2j + 3k. Find PQ and |PQ|. Answer — PQ = -2i - 4j + 4k, and |PQ| = sqrt(4 + 16 + 16) = 6.

High-Yield Formula Sheet
✔ |a| = sqrt(a1^2 + a2^2 + a3^2); a-hat = a / |a|; the vector of magnitude M along a is M a / |a|
✔ Direction cosines: l = a1 / |a|, m = a2 / |a|, n = a3 / |a|, and l^2 + m^2 + n^2 = 1 always
✔ Section formula: internal division (m b + n a) / (m + n); external division (m b - n a) / (m - n); midpoint (a + b) / 2; centroid (a + b + c) / 3
✔ a.b = a1 b1 + a2 b2 + a3 b3 = |a| |b| cos theta; a and b are perpendicular exactly when a.b = 0
✔ Scalar projection of a on b = (a.b) / |b|; the projection vector of a on b = ((a.b) / |b|^2) b
✔ a x b = the determinant with rows (i, j, k), (a1, a2, a3), (b1, b2, b3); b x a = -(a x b); i x j = k, j x k = i, k x i = j
✔ |a x b| = area of the parallelogram on a and b; the triangle on a and b has area (1/2) |a x b|; unit normal = (a x b) / |a x b|
✔ [a b c] = a.(b x c) = the component determinant; parallelepiped volume = |[a b c]|; tetrahedron volume = (1/6) |[a b c]|
✔ Coplanarity of a, b, c: [a b c] = 0; collinearity of a, b: a x b = 0, equivalently components proportional
✔ a x (b x c) = (a.c) b - (a.b) c (BAC-CAB); Lagrange: |a x b|^2 + (a.b)^2 = |a|^2 |b|^2
✔ |a + b|^2 = |a|^2 + |b|^2 + 2 a.b; for position vectors, AB = b - a

Common Mistakes and Exam Traps
• MISTAKE 1 — Projecting a onto b but dividing by |a|
• Why it fails — The projection is a length measured along b, so its scale is set by b alone; dividing by |a| computes the projection of b on a instead, a different number
• Correct principle — Projection of a on b is (a.b) / |b|; the divisor is always the magnitude of the vector named after the word "on"
• MISTAKE 2 — Treating a.b as a vector, or writing (a.b) x c
• Why it fails — The dot product is a scalar, and a scalar cannot be crossed with anything; the expression (a.b) x c is not wrong arithmetic, it is meaningless
• Correct principle — a.b is a number; a x b is a vector; (a.b) c is a vector again only because a scalar multiplies the vector c
• MISTAKE 3 — Losing the minus sign on the j component of a x b
• Why it fails — The determinant's checkerboard of signs (+, -, + across the top row) makes the middle cofactor negative; expanding all three terms with plus signs flips the j component
• Correct principle — Write a x b = (a2 b3 - a3 b2) i - (a1 b3 - a3 b1) j + (a1 b2 - a2 b1) k and audit the answer by dotting it with a and b — both must give zero
• MISTAKE 4 — Reporting the parallelogram area when the triangle was asked
• Why it fails — |a x b| is the area of the full parallelogram, which is two copies of the triangle
• Correct principle — Triangle area = (1/2) |a x b|; parallelogram area = |a x b|; read the shape named in the question before answering
• MISTAKE 5 — Reporting a negative volume from a negative determinant
• Why it fails — The sign of [a b c] records only the handedness of the trio; volume is a size and cannot be negative
• Correct principle — Volume of the parallelepiped is |[a b c]|, and of the tetrahedron (1/6) |[a b c]| — absolute value first, then divide
• MISTAKE 6 — Quoting direction ratios as direction cosines
• Why it fails — Ratios like 2, 3, 6 are proportional to the cosines but are not cosines; a "cosine" of 2 or 6 is impossible on its face
• Correct principle — Divide each component by |a| first; the results must satisfy l^2 + m^2 + n^2 = 1, which is a free check
• MISTAKE 7 — Uncrossing the weights in the section formula
• Why it fails — Writing (n b + m a) / (m + n) for a division in the ratio m : n puts the point closer to the wrong endpoint
• Correct principle — The weight of an endpoint equals the OTHER segment's ratio share: (m b + n a) / (m + n), then verify the point sits nearer the endpoint with the bigger share
• MISTAKE 8 — Concluding from a x b = 0 that one of the vectors must be zero
• Why it fails — sin theta is also zero when theta is 0 or 180 degrees, so any two parallel nonzero vectors have a zero cross product
• Correct principle — For nonzero vectors, a x b = 0 is exactly the parallel test; it says nothing about either vector vanishing
• MISTAKE 9 — Writing |a + b| = |a| + |b| as a general rule
• Why it fails — That equality is the degenerate case of two vectors pointing the same way; in general the resultant is shorter than the sum of the lengths
• Correct principle — Use |a + b|^2 = |a|^2 + |b|^2 + 2 a.b, or add the components and take the magnitude of the sum
• MISTAKE 10 — Hunting for the angle with sin, or rejecting a negative cos theta
• Why it fails — The dot product is built on cos theta, and a negative cosine simply means the angle is obtuse; it is an answer, not an error flag
• Correct principle — cos theta = (a.b) / (|a| |b|), with theta read between 0 and 180 degrees; reserve sin theta for the cross product's magnitude

Worked Examples — Basic to Challenging
• EXAMPLE 1 — SEVEN IN DISGUISE
• Problem — For a = 2i - 3j + 6k, find |a|, the unit vector a-hat, and the direction cosines of a
• Given — Components a1 = 2, a2 = -3, a3 = 6
• Principle — Magnitude is the root of the sum of squares; the unit vector and the direction cosines are the components each divided by that magnitude
• Steps — |a| = sqrt(4 + 9 + 36) = sqrt 49 = 7; a-hat = (2i - 3j + 6k) / 7; direction cosines are 2/7, -3/7 and 6/7
• Answer — |a| = 7, a-hat = (2i - 3j + 6k) / 7, direction cosines 2/7, -3/7, 6/7
• Reasoning — One magnitude computation feeds three answers; the direction cosines are just the unit vector's components read aloud, and 4/49 + 9/49 + 36/49 = 1 audits them
• Mistake to avoid — Dropping the minus sign on the y direction cosine, or announcing the direction cosines as 2, -3, 6 without dividing by 7
• EXAMPLE 2 — THE TWO-TO-ONE POINT
• Problem — A and B have position vectors i + 2j - k and 3i - 4j + 2k. Find the position vector of the point P dividing AB internally in the ratio 2 : 1
• Given — a = i + 2j - k, b = 3i - 4j + 2k, ratio m : n = 2 : 1 measured from A
• Principle — Internal section formula: p = (m b + n a) / (m + n)
• Steps — p = (2(3i - 4j + 2k) + 1(i + 2j - k)) / 3 = ((6 + 1) i + (-8 + 2) j + (4 - 1) k) / 3 = (7/3) i - 2j + k
• Answer — p = (7/3) i - 2j + k
• Reasoning — P is twice as far from A as from B, so B's coordinates dominate the weighted average — the j component lands at -2, far closer to B's -4 than to A's +2, exactly as the geometry demands
• Mistake to avoid — Uncrossing the weights to (2a + b) / 3, which gives (5/3) i — the point that divides AB in the ratio 1 : 2 instead
• EXAMPLE 3 — ANGLE AND SHADOW
• Problem — For a = i + j + k and b = 2i - j + k, find the angle between them and the scalar projection of a on b
• Given — Two component triples; both the angle and the projection flow from the single number a.b
• Principle — a.b = |a| |b| cos theta for the angle; scalar projection of a on b = (a.b) / |b|
• Steps — a.b = 2 - 1 + 1 = 2; |a| = sqrt 3 and |b| = sqrt 6; cos theta = 2 / (sqrt 3 x sqrt 6) = 2 / sqrt 18 = sqrt 2 / 3, so theta is about 61.87 degrees; projection = 2 / sqrt 6 = sqrt 6 / 3, about 0.82
• Answer — theta is about 61.87 degrees; the scalar projection of a on b is sqrt 6 / 3
• Reasoning — One dot product, two geometric facts: the angle reads how aligned the vectors are, and the projection reads how much of a lives along b — the twin outputs of the same computation
• Mistake to avoid — Dividing a.b by |a| for the projection and reporting 2 / sqrt 3: that is the projection of b on a, the swapped shadow
• EXAMPLE 4 — THE PERPENDICULAR PARAMETER
• Problem — Find p so that a = 2i + p j + k is perpendicular to b = i - 2j + 3k
• Given — One unknown component, one geometric condition: perpendicularity
• Principle — Perpendicular vectors have a zero dot product, so the condition a.b = 0 is a linear equation in p
• Steps — a.b = (2)(1) + (p)(-2) + (1)(3) = 2 - 2p + 3 = 5 - 2p; setting 5 - 2p = 0 gives p = 5/2
• Answer — p = 5/2
• Reasoning — Every "find the parameter for perpendicularity" problem in existence is this shape: dot, expand, set to zero, solve one linear equation
• Mistake to avoid — Reaching for the cross product, whose zero would impose parallelism instead; or losing the sign of the -2p term and reporting p = -5/2
• EXAMPLE 5 — AREA AND NORMAL IN ONE DETERMINANT
• Problem — For a = 2i + 3j - k and b = i - j + 2k, find the area of the parallelogram and of the triangle on a and b as adjacent sides, and a unit vector normal to both
• Given — The running pair of the chapter; one cross product answers all three parts
• Principle — a x b gives the normal direction; its magnitude is the parallelogram area; halve for the triangle; divide by the magnitude for the unit normal
• Steps — a x b = (3 x 2 - (-1)(-1)) i - (2 x 2 - (-1)(1)) j + (2(-1) - 3 x 1) k = 5i - 5j - 5k; |a x b| = sqrt 75 = 5 sqrt 3; triangle area = (5 sqrt 3) / 2; unit normal = (5i - 5j - 5k) / (5 sqrt 3) = (i - j - k) / sqrt 3
• Answer — Parallelogram area 5 sqrt 3, triangle area (5 sqrt 3) / 2, unit normal (i - j - k) / sqrt 3 (or its negative)
• Reasoning — The audit from the cross-product section still applies: the answer dotted with a gives 10 - 15 + 5 = 0 and with b gives 5 + 5 - 10 = 0, so the normal really is normal
• Mistake to avoid — The j-component sign: without the determinant's built-in minus, you get 5i + 5j - 5k, which fails the perpendicular audit instantly — run the audit, always
• EXAMPLE 6 — FLAT BY A HAIR
• Problem — Find lambda so that a = i - j + 2k, b = 2i + j - k and c = lambda i + 3j + k are coplanar
• Given — Three vectors, one unknown component, one condition: coplanarity
• Principle — Coplanarity is exactly [a b c] = 0; the determinant is linear in lambda
• Steps — Expanding the determinant of the rows (1, -1, 2), (2, 1, -1), (lambda, 3, 1): 1(1 x 1 - (-1) x 3) + 1(2 x 1 - (-1) lambda) + 2(2 x 3 - 1 x lambda) = 4 + (2 + lambda) + (12 - 2 lambda) = 18 - lambda; setting 18 - lambda = 0 gives lambda = 18
• Answer — lambda = 18
• Reasoning — The large answer is fine: lambda is a component, not a probability. At lambda = 18 the slanted box on a, b, c collapses to zero volume, which is the geometric meaning of the three vectors sharing a plane
• Mistake to avoid — Testing the vectors pairwise — any two are automatically coplanar, so pairwise tests prove nothing; the triple product is the only honest test for three
• EXAMPLE 7 — A PROOF: DIAGONALS OF A PARALLELOGRAM BISECT EACH OTHER
• Problem — Using vectors, prove that the diagonals of a parallelogram bisect each other
• Given — A parallelogram with one corner at the origin O and adjacent vertices A and B with position vectors a and b; the fourth vertex C is a + b
• Principle — Two segments bisect each other exactly when they share the same midpoint; compute both midpoints independently and compare
• Steps — Diagonal OC runs from 0 to a + b, so its midpoint is (a + b) / 2; diagonal AB runs from a to b, so its midpoint is (a + b) / 2; the two midpoints are the same point
• Answer — Both diagonals pass through (a + b) / 2, so each is cut in half by the other — proved
• Reasoning — Notice what the proof never did: it never assumed the diagonals meet, never drew a line, and never used a length. Position vectors plus the midpoint formula carried the entire theorem
• Mistake to avoid — Begging the question by starting "let the diagonals meet at their midpoint M" — that assumes the conclusion. Compute each midpoint separately and let equality do the proving

Practice Questions — Self-Test Set
• Q1 — If a = 4i - 2j + 4k, then |a| equals: (A) 2 (B) 6 (C) 8 (D) 36
• Q2 — The unit vector in the direction opposite to 3i + 4j is: (A) (3i + 4j) / 5 (B) -(3i + 4j) / 5 (C) (4i + 3j) / 5 (D) (3i + 4j) / 25
• Q3 — The vectors a = p i + 2j - k and b = 3i - j + 2k are perpendicular when p equals: (A) 4/3 (B) -4/3 (C) 3/4 (D) 4
• Q4 — The scalar projection of a = 2i + 3j - 6k on b = i + j + k is: (A) -1 (B) 1 / sqrt 3 (C) -1 / sqrt 3 (D) -sqrt 3
• Q5 — The area of the parallelogram with adjacent sides 3i + j and i + 2j is: (A) 5 (B) 5/2 (C) sqrt 5 (D) 7
• Q6 — The volume of the parallelepiped with coterminous edges i + k, j + k and i + j is: (A) 0 (B) 1 (C) 2 (D) 3
• Q7 — The vectors lambda i + 2j and 4i - j are collinear when lambda equals: (A) 8 (B) -8 (C) 2 (D) -2
• Q8 — A vector makes angles of 60 degrees and 60 degrees with the x-axis and the y-axis. Its angle with the z-axis can be: (A) 30 degrees (B) 45 degrees (C) 60 degrees (D) 90 degrees

▸ Answer Key with Explanations
• Q1 — Answer (B), 6: |a| = sqrt(16 + 4 + 16) = sqrt 36 = 6. Misconception — option (D) 36 is the sum of squares before the root is taken; the magnitude is the root, not the radicand
• Q2 — Answer (B): |3i + 4j| = 5, the unit vector along it is (3i + 4j) / 5, and "opposite" flips the sign of the whole vector. Misconception — option (D) divides by 25, the squared magnitude; normalising divides by the magnitude once
• Q3 — Answer (A), 4/3: a.b = 3p - 2 - 2 = 3p - 4 = 0 gives p = 4/3. Misconception — option (C) 3/4 inverts the fraction at the final step; write the equation 3p = 4 and divide carefully
• Q4 — Answer (C): a.b = 2 + 3 - 6 = -1 and |b| = sqrt 3, so the projection is -1 / sqrt 3; the negative sign is real information — a leans against b. Misconception — option (A) -1 is the dot product itself, before the division by |b| that turns it into a length
• Q5 — Answer (A), 5: the k-component of the cross product is 3 x 2 - 1 x 1 = 5, and the parallelogram takes |a x b| whole. Misconception — option (B) 5/2 halves it out of triangle habit; check which shape the question names
• Q6 — Answer (C), 2: the determinant of the rows (1, 0, 1), (0, 1, 1), (1, 1, 0) is -2, and the volume is its absolute value, 2. Misconception — reporting -2, or hunting for a zero because the vectors "look symmetric"; symmetry is not coplanarity
• Q7 — Answer (B), -8: collinearity needs the cross product's k-component, lambda x (-1) - 2 x 4 = -lambda - 8, to vanish, giving lambda = -8. Misconception — option (A) 8 drops the sign that the negative j-component of b forces
• Q8 — Answer (B), 45 degrees: cos^2 gamma = 1 - cos^2 60 - cos^2 60 = 1 - 1/4 - 1/4 = 1/2, so cos gamma = 1 / sqrt 2 (the other root gives 135 degrees). Misconception — assuming the three axis angles must add to 180 degrees; they obey the squares identity, not a sum

Chapter Summary and Revision Checklist
• The whole chapter is four translations: points become components by subtraction; alignment becomes the dot product; area and turning become the cross product; volume and flatness become the scalar triple product
• Components first, always: |a| = sqrt(a1^2 + a2^2 + a3^2), direction cosines are components over |a| with squares summing to 1, and the section formula weights each endpoint by the other segment's share
• Dot product audit trail: a.b positive, zero or negative reads acute, right or obtuse; the projection of a on b divides by |b|; a.b is a scalar and can never be crossed with anything
• Cross product audit trail: anti-commutative, j component negative in the determinant, perpendicular to both parents (dot-check it), magnitude equal to the parallelogram's area — halve for the triangle
• Triple product audit trail: cyclic swaps are free, single swaps flip the sign, volume takes the absolute value, the tetrahedron takes a sixth, and zero volume means coplanar
• Self-check: I can state the definitions of collinear, coplanar, unit vector and position vector without notes
• Self-check: I can find a unit vector, a vector of given magnitude along a direction, and the direction cosines of any given vector
• Self-check: I can apply the section formula internally and externally and say why the weights cross
• Self-check: I can compute an angle, test perpendicularity and find a projection from components without hesitation
• Self-check: I can compute an area or a unit normal from a cross product and audit it with two dot products
• Self-check: I can compute a volume, divide by 6 for a tetrahedron, and solve a lambda problem for coplanarity or collinearity
• Self-check: I can reproduce the midpoint theorem and parallelogram-diagonal proofs in position-vector language
• Self-assessment: score the Practice Set out of 8. 7-8: move on, this chapter is yours. 5-6: rework the sections behind your two misses, then retry. Below 5: rebuild from the Dot Product section, redo every Worked Example with the book closed, and only then retest
<!-- END math_ch_5 detailedStudyNotes -->
