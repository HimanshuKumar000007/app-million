<!-- BEGIN math_ch_4 detailedStudyNotes -->
Introduction — One Chapter, Two Directions
• Trigonometry runs in two directions, and the IAT tests both in the same paper. The forward direction takes an angle and returns a number: sin 75°, tan 2x, the maximum of 3 sin x + 4 cos x. The reverse direction takes a number and returns an angle: sin^-1(1/2), tan^-1 2 + tan^-1 3, the principal value of cos^-1(cos(7pi/6)). Students usually master the forward direction and bleed marks in the reverse one — this chapter is built to fix exactly that imbalance.
• DEFINITION — The trigonometric functions assign to every angle x the ratios sin x, cos x, tan x and their reciprocals cosec x, sec x, cot x. The inverse trigonometric functions undo them: sin^-1 t is the angle whose sine is t — but only after we agree WHICH angle, because infinitely many angles share the same sine.
• WHY the forward direction is a fluency game — compound angles, multiple angles and the sum-to-product system are a closed toolkit: about twenty formulas generate every value, identity and equation in the syllabus. The marks go to whoever can pick the right formula in under ten seconds, not to whoever can derive it from scratch in the exam hall.
• WHY the reverse direction is a discipline game — an inverse function is only honest inside its principal value branch. Almost every inverse-trig error is the same error: a correct-looking formula applied outside its branch, producing an angle that lives in the wrong interval. The formula tan^-1 x + tan^-1 y = tan^-1((x + y)/(1 - xy)) is true only when xy < 1, and the correction cases around it are among the most repeated traps in the IAT.
• EXAMPLE — The two directions in one breath: forward, sin(7pi/12) = (sqrt(6) + sqrt(2))/4 by a compound-angle expansion. Reverse, tan^-1 2 + tan^-1 3 = 3pi/4 — not the -pi/4 the raw formula blurts out, because 2 x 3 = 6 > 1 forces a + pi correction. Both answers are verified in this chapter, step by step.
• The map of the chapter: angles and the sign map first, then standard values including the golden angles 18° and 36°. Then the forward engine room — compound, multiple and C-D formulas, the R-method for extremes, conditional identities for triangles, and trigonometric equations. Then the reverse gear — branches, properties, the tan^-1 addition correction, the 2 tan^-1 x family, telescoping series and inverse equations.
★ HIGHLIGHT — The whole chapter in one breath: forward trigonometry is formula fluency (twenty formulas, endlessly recombined), and inverse trigonometry is branch discipline (every answer must live inside its principal interval, and the xy test guards the door).

Angles, Degrees and Radians — Two Languages for Turning
• DEFINITION — A degree is 1/360 of a full revolution. A radian is the angle at the centre of a circle that cuts off an arc exactly as long as the radius: when arc length s equals radius r, the angle is exactly 1 radian.
✔ KEY FORMULA — Arc length s = r x theta, with theta in RADIANS, always. One full revolution is 360° = 2pi radians, so 180° = pi radians and 1 radian = 180/pi ≈ 57.3°.
• WORKED PATTERN — Converting: degrees to radians, multiply by pi/180; radians to degrees, multiply by 180/pi. Anchor pairs worth memorising cold: 30° = pi/6, 45° = pi/4, 60° = pi/3, 90° = pi/2, 120° = 2pi/3, 135° = 3pi/4, 150° = 5pi/6, 180° = pi, 270° = 3pi/2, 360° = 2pi.
• EXAMPLE — A wheel of radius 6 m rolls through an angle of 2.5 rad. The contact arc is s = 6 x 2.5 = 15 m. In degrees that angle is 2.5 x 180/pi ≈ 143.2° — same turning, two languages, and the formula only speaks radians.
• DEFINITION — Angles measured anticlockwise from the positive x-axis are positive; clockwise angles are negative. Angles differing by a full turn (2pi or 360°) are coterminal — they point the same way and every trigonometric function gives them the same value.
• EXAMPLE — cos(-300°) = cos(300°) because cosine is an even function, and 300° is coterminal with -60°, so cos(-300°) = cos 60° = 1/2. Two facts — evenness and coterminality — chain together constantly in this chapter.
• YOUR TURN — (a) Convert 7pi/6 to degrees. (b) Convert 150° to radians. (c) A circle of radius 10 cm subtends an arc of 15 cm at the centre; find the angle in radians. Answers: (a) 210°, (b) 5pi/6, (c) theta = s/r = 15/10 = 1.5 rad.
⚠ EXAM TRAP — s = r theta with theta in degrees is silently wrong: the formula is built on the radian definition. The second trap is your calculator's MODE — a radian question answered in degree mode returns garbage that looks like a number. Check the mode before the first question, not after the last.

The Six Functions and the ASTC Sign Map
• DEFINITION — On the unit circle, the point at angle x is (cos x, sin x). Then tan x = sin x / cos x, and the reciprocals are cosec x = 1/sin x, sec x = 1/cos x, cot x = 1/tan x = cos x / sin x. Every sign question in trigonometry is answered by asking where that point sits.
✔ KEY FORMULA — Periods: sin x, cos x, sec x and cosec x repeat every 2pi; tan x and cot x repeat every pi. Even and odd: cos(-x) = cos x and sec(-x) = sec x, while sin, tan, cosec and cot all flip sign with a negative angle.
• DEFINITION — The ASTC rule names the positive function in each quadrant: Quadrant I (0 to pi/2) — All positive. Quadrant II (pi/2 to pi) — Sin (and cosec) positive. Quadrant III (pi to 3pi/2) — Tan (and cot) positive. Quadrant IV (3pi/2 to 2pi) — Cos (and sec) positive. Read it as All, Sin, Tan, Cos going anticlockwise.
• WORKED PATTERN — Allied angles, the machine behind every reduction: to evaluate a function of pi/2 ± x or pi ± x, do two things. First the name: for pi/2 ± x the function CHANGES to its co-function (sin to cos, tan to cot, sec to cosec); for pi ± x and 2pi - x it STAYS. Second the sign: give the ORIGINAL function the sign it has in that quadrant by ASTC. Example: sin(pi + x): stays sin, quadrant III where sin is negative, so sin(pi + x) = -sin x. And cos(pi/2 - x): changes to sin, quadrant I all positive, so cos(pi/2 - x) = sin x — the co-function identity itself.
• EXAMPLE — sin 200° sits in quadrant III, where sine is negative, and 200° = 180° + 20°, so sin 200° = -sin 20° ≈ -0.342. The reference angle (distance to the nearest x-axis) is what survives; ASTC supplies the sign.
• YOUR TURN — (a) Evaluate tan(7pi/4). (b) Give the sign of tan 100° without a calculator. Answers: (a) 7pi/4 is quadrant IV, tan(7pi/4) = -tan(pi/4) = -1. (b) 100° is quadrant II, where only sin is positive, so tan 100° is negative.
★ HIGHLIGHT — Figure 4.1 draws this whole section: one circle, a sample angle with its reference angle, the ASTC label in each quadrant, and degrees with radians around the rim. If you can reproduce that picture from memory, sign questions stop costing marks.
⚠ EXAM TRAP — The allied-angle name change happens for pi/2 and 3pi/2 partners only. sin(3pi/2 - x) = -cos x (changes name, quadrant III sign for sine is negative), but sin(pi - x) = +sin x (same name, quadrant II sign positive). Mixing the two rules is the standard allied-angle blunder.

Standard Values — and the Golden Angles 18° and 36°
• DEFINITION — The standard values are the exact sine, cosine and tangent of 0°, 30°, 45°, 60° and 90°. They are the bricks every other exact value in this chapter is built from.
✔ KEY FORMULA — The sine row is a pattern, not a list: sin 0°, 30°, 45°, 60°, 90° = sqrt(0)/2, sqrt(1)/2, sqrt(2)/2, sqrt(3)/2, sqrt(4)/2 = 0, 1/2, 1/sqrt(2), sqrt(3)/2, 1. The cosine row is the same list read backwards. The tangent row is sin over cos: 0, 1/sqrt(3), 1, sqrt(3), and undefined at 90°.
• WORKED PATTERN — Any forgotten value is ten seconds away: need cos 30°? The cosine row is the sine row reversed, so cos 30° = sin 60° = sqrt(3)/2. Need tan 60°? sin 60° / cos 60° = (sqrt(3)/2) / (1/2) = sqrt(3). Never memorise 15 values when one pattern regenerates them.
• DEFINITION — The golden angles come from the pentagon and the golden ratio: sin 18° = (sqrt(5) - 1)/4 ≈ 0.309 and cos 36° = (sqrt(5) + 1)/4 ≈ 0.809 — note cos 36° is exactly half the golden ratio (1 + sqrt(5))/2. Completing the family: cos 18° = sqrt(10 + 2 sqrt(5))/4 ≈ 0.951 and sin 36° = sqrt(10 - 2 sqrt(5))/4 ≈ 0.588.
• WHY 18° has an exact value at all — 18° is special because 2 x 18° = 90° - 3 x 18°, which turns into a quadratic equation in sin 18°: 4s^2 + 2s - 1 = 0. Worked Example 2 solves it in full. No such luck exists for 1° or 20° — their exact forms need cubics, which is why the syllabus stops at 18°.
• EXAMPLE — Complementary pairs halve the memorising: sin 54° = cos 36° = (sqrt(5) + 1)/4 ≈ 0.809, because sin(90° - x) = cos x. Every golden value does double duty at its complement.
• YOUR TURN — Write down sin 72° exactly. Answer: sin 72° = cos 18° = sqrt(10 + 2 sqrt(5))/4 ≈ 0.951 — complement first, then the golden table.
⚠ EXAM TRAP — Do not swap the golden pair: sin 18° ≈ 0.309 is the SMALL one (a small angle has a small sine), cos 36° ≈ 0.809 is the big one. If your recalled value makes sin 18° bigger than sin 30° = 0.5, you have swapped them. And tan 90° is undefined — "infinity" is not an option value, it is the absence of one.
Compound Angles — sin, cos and tan of A + B and A - B
• DEFINITION — A compound angle is a sum or difference of two angles, A + B or A - B. The compound-angle formulas expand a function of the sum into functions of the parts — they are the engine that manufactures every non-standard exact value.
✔ KEY FORMULA — sin(A + B) = sin A cos B + cos A sin B, and sin(A - B) = sin A cos B - cos A sin B. cos(A + B) = cos A cos B - sin A sin B, and cos(A - B) = cos A cos B + sin A sin B. tan(A + B) = (tan A + tan B)/(1 - tan A tan B), and tan(A - B) = (tan A - tan B)/(1 + tan A tan B).
• WHY cos(A - B) is the mother formula — place two points on the unit circle at angles A and B; the distance between them, computed two ways, gives cos(A - B) = cos A cos B + sin A sin B. Every other formula in this section is a child of it: replace B by -B for cos(A + B), use the co-function sin x = cos(pi/2 - x) for the sine pair, and divide sine by cosine for the tangent pair. One derivation, six formulas.
• Sign discipline — sine keeps its sign pattern (sin(A + B) has + between terms, matching the + in the angle); cosine REVERSES it (cos(A + B) has - between the terms). For tangent, the numerator copies the angle's sign and the denominator flips it. Say it as: sin same, cos contrary, tan top-same-bottom-flipped.
• WORKED PATTERN — sin 75° = sin(45° + 30°) = sin 45° cos 30° + cos 45° sin 30° = (1/sqrt(2))(sqrt(3)/2) + (1/sqrt(2))(1/2) = (sqrt(3) + 1)/(2 sqrt(2)) = (sqrt(6) + sqrt(2))/4 ≈ 0.966. The recipe is always: split into standard angles, expand, substitute the table.
• EXAMPLE — tan 105° = tan(60° + 45°) = (sqrt(3) + 1)/(1 - sqrt(3)) — rationalise by multiplying top and bottom by (1 + sqrt(3)): ((sqrt(3) + 1)(1 + sqrt(3)))/(1 - 3) = (4 + 2 sqrt(3))/(-2) = -(2 + sqrt(3)) ≈ -3.73. Negative, as a quadrant II tangent must be — ASTC audits the answer for free.
• YOUR TURN — Evaluate cos 15°. Answer: cos(45° - 30°) = cos 45° cos 30° + sin 45° sin 30° = (sqrt(6) + sqrt(2))/4 ≈ 0.966 — the same value as sin 75°, as the co-function identity promised.
⚠ EXAM TRAP — sin(A + B) is NOT sin A + sin B. Test it: A = B = 30° gives sin 60° = sqrt(3)/2 ≈ 0.866 on the left, but sin 30° + sin 30° = 1 on the right. Functions of sums never distribute over the sum — the expansion formulas exist precisely because the naive split fails.

Multiple Angles — Double and Triple Angle Formulas
• DEFINITION — Multiple-angle formulas are the compound formulas with B set equal to A: functions of 2A and 3A expressed through functions of A alone. They convert between an angle and its double or triple in both directions.
✔ KEY FORMULA — sin 2A = 2 sin A cos A = 2 tan A/(1 + tan^2 A). cos 2A = cos^2 A - sin^2 A = 2 cos^2 A - 1 = 1 - 2 sin^2 A = (1 - tan^2 A)/(1 + tan^2 A). tan 2A = 2 tan A/(1 - tan^2 A).
✔ KEY FORMULA — sin 3A = 3 sin A - 4 sin^3 A. cos 3A = 4 cos^3 A - 3 cos A. tan 3A = (3 tan A - tan^3 A)/(1 - 3 tan^2 A). Memory hook: the 3-formulas are 3-and-4 patterns — sine reads 3, -4; cosine reads 4, -3.
• WHY cos 2A owns four forms — each form trades in a different currency: cos^2 - sin^2 is symmetric, 2cos^2 - 1 is pure cosine, 1 - 2sin^2 is pure sine, and the tan form needs no roots. Given sin A, reach for 1 - 2 sin^2 A; given cos A, reach for 2 cos^2 A - 1. Choosing the form that matches the given data is worth more than knowing all four.
• WORKED PATTERN — If sin A = 3/5 with A acute, then cos A = 4/5, so sin 2A = 2 x (3/5) x (4/5) = 24/25 and cos 2A = 1 - 2 x (9/25) = 7/25. Notice 7-24-25: double-angle answers on a 3-4-5 triangle land on the next Pythagorean triple — a pattern worth recognising on sight.
• EXAMPLE — The half-angle children: rearranging cos 2A gives sin^2(A/2) = (1 - cos A)/2 and cos^2(A/2) = (1 + cos A)/2. With A = 60°: cos^2 30° = (1 + 1/2)/2 = 3/4, matching the table. The square root at the end carries a ± that only the quadrant of A/2 can settle.
• YOUR TURN — If tan A = 1/3, find tan 2A. Answer: tan 2A = (2/3)/(1 - 1/9) = (2/3)/(8/9) = 3/4.
★ HIGHLIGHT — The factorisation pair 1 + cos 2A = 2 cos^2 A and 1 - cos 2A = 2 sin^2 A are the hardest-working lines in equation solving: they turn sums into products, and products are what let you set factors to zero.
⚠ EXAM TRAP — cos 2A = 2 cos^2 A - 1, not 2 cos A - 1, and not cos^2 A - sin^2 A with the terms swapped in the pure forms: 1 - 2 sin^2 A (sine form) versus 2 cos^2 A - 1 (cosine form). Swapping them flips the sign of every downstream answer.

Sum to Product, Product to Sum — the C-D System
• DEFINITION — The C-D system converts sums of sines and cosines into products, and products back into sums. It is named for the substitution C = A + B, D = A - B, which gives A = (C + D)/2 and B = (C - D)/2 — the half-sum and half-difference that appear in every line.
✔ KEY FORMULA — Product to sum: 2 sin A cos B = sin(A + B) + sin(A - B). 2 cos A sin B = sin(A + B) - sin(A - B). 2 cos A cos B = cos(A + B) + cos(A - B). 2 sin A sin B = cos(A - B) - cos(A + B).
✔ KEY FORMULA — Sum to product: sin C + sin D = 2 sin((C + D)/2) cos((C - D)/2). sin C - sin D = 2 cos((C + D)/2) sin((C - D)/2). cos C + cos D = 2 cos((C + D)/2) cos((C - D)/2). cos C - cos D = -2 sin((C + D)/2) sin((C - D)/2), also written 2 sin((C + D)/2) sin((D - C)/2).
• WHY you never need to memorise these cold — set A = (C + D)/2 and B = (C - D)/2 in any product-to-sum line and the sum-to-product line falls out. Learn one direction and the substitution; the other direction is a thirty-second derivation, and deriving beats mis-remembering a sign.
• WORKED PATTERN — sin 75° - sin 15° = 2 cos((75° + 15°)/2) sin((75° - 15°)/2) = 2 cos 45° sin 30° = 2 x (1/sqrt(2)) x (1/2) = 1/sqrt(2) ≈ 0.707. Cross-check from the table: 0.966 - 0.259 = 0.707. Two routes, one answer — the habit of cross-checking is the real skill here.
• EXAMPLE — Product chains collapse with one extra factor: sin 20° sin 40° sin 60° sin 80° = 3/16, a classical result built by pairing sin 20° sin 80°-type products into sums repeatedly. Dividing by sin 60° = sqrt(3)/2 gives sin 20° sin 40° sin 80° = (3/16)/(sqrt(3)/2) = sqrt(3)/8 ≈ 0.217 — a favourite exact-value question (Practice Question 2).
• YOUR TURN — Evaluate cos 105° + cos 15°. Answer: 2 cos 60° cos 45° = 2 x (1/2) x (1/sqrt(2)) = 1/sqrt(2) = sqrt(2)/2 ≈ 0.707.
⚠ EXAM TRAP — cos C - cos D is the sign trap of the system: the answer carries a MINUS, -2 sin((C + D)/2) sin((C - D)/2). Writing it as 2 sin((C + D)/2) sin((D - C)/2) keeps every factor in the comfortable order and the sign positive — pick one convention and never improvise mid-paper.

The R-Method — a sin x + b cos x and Extreme Values
• DEFINITION — The R-method rewrites any combination a sin x + b cos x as a single sine wave, R sin(x + alpha). A combination that looks like two waves is secretly one wave with a bigger amplitude and a phase shift.
✔ KEY FORMULA — a sin x + b cos x = R sin(x + alpha), where R = sqrt(a^2 + b^2), cos alpha = a/R and sin alpha = b/R (so tan alpha = b/a, with the quadrant of alpha fixed by the two signs). Therefore -R ≤ a sin x + b cos x ≤ R for every x: the extreme values are exactly ± sqrt(a^2 + b^2).
• WHY it works — expanding R sin(x + alpha) = R sin x cos alpha + R cos x sin alpha and matching coefficients gives a = R cos alpha and b = R sin alpha; squaring and adding gives R^2 = a^2 + b^2. The amplitude of the combined wave is forced by Pythagoras — the two components can never peak at the same instant, and R is exactly what survives of their tug.
• WORKED PATTERN — 3 sin x + 4 cos x: R = sqrt(9 + 16) = 5, so the maximum is 5 and the minimum is -5, no calculus, no graph. The maximum occurs when x + alpha = pi/2 with alpha = tan^-1(4/3) ≈ 53.1°, i.e. near x ≈ 36.9° — recognisably the 3-4-5 triangle wearing a phase shift.
• EXAMPLE — Solvability by inspection: sin x + cos x has R = sqrt(2) ≈ 1.414. So the equation sin x + cos x = 1.5 has NO solution — the left side can never reach 1.5 — while sin x + cos x = sqrt(2) has the single family x = pi/4 + 2n pi, where the wave touches its ceiling. Half of equation questions are secretly this test.
• EXAMPLE — Solving with the R-method: sin x + cos x = 1 on [0, 2pi] becomes sqrt(2) sin(x + pi/4) = 1, so sin(x + pi/4) = 1/sqrt(2), giving x + pi/4 = pi/4 or 3pi/4 in range, hence x = 0 or x = pi/2 (with 2pi the same point as 0). Worked Example 4 revisits this.
• YOUR TURN — Find the range of 3 sin x - 4 cos x. Answer: R = sqrt(9 + 16) = 5, so the expression lives in [-5, 5] — the minus sign changes the phase alpha, never the amplitude.
★ HIGHLIGHT — The twin form a cos x + b sin x obeys the same bound ± sqrt(a^2 + b^2) (this app's chapter card quotes exactly this R). Whenever an option list offers extremes for a sine-cosine mix, compute sqrt(a^2 + b^2) before anything else — it eliminates half the options instantly.
⚠ EXAM TRAP — alpha from tan alpha = b/a alone can land in the wrong quadrant when a is negative: tan repeats every pi, so tan^-1( b/a ) may be off by pi. Always pin alpha with BOTH cos alpha = a/R and sin alpha = b/R. The extremes ±R are quadrant-proof; the phase is not.

Conditional Identities — When A + B + C = pi
• DEFINITION — A conditional identity is an identity that holds only under a condition — here, A, B and C are the angles of a triangle, so A + B + C = pi and A + B = pi - C. That single fact rewires the compound formulas: sin(A + B) = sin C, cos(A + B) = -cos C, tan(A + B) = -tan C.
✔ KEY FORMULA — If A + B + C = pi, then tan A + tan B + tan C = tan A tan B tan C.
✔ KEY FORMULA — If A + B + C = pi, then sin 2A + sin 2B + sin 2C = 4 sin A sin B sin C, and cos 2A + cos 2B + cos 2C = -1 - 4 cos A cos B cos C.
✔ KEY FORMULA — If A + B + C = pi, then cos^2 A + cos^2 B + cos^2 C + 2 cos A cos B cos C = 1.
• WHY the tangent identity works — tan(A + B) = -tan C means (tan A + tan B)/(1 - tan A tan B) = -tan C. Cross-multiplying: tan A + tan B = -tan C + tan A tan B tan C, and moving -tan C across gives the identity. Three lines — this is a derivation to own, not a formula to borrow, because the same three lines adapt to any variant the paper invents.
• WORKED PATTERN — Numerical audit with A = 50°, B = 60°, C = 70°: tan 50° + tan 60° + tan 70° ≈ 1.192 + 1.732 + 2.747 = 5.671, and tan 50° tan 60° tan 70° ≈ 5.671. Both sides agree — run this audit mentally whenever you are unsure whether the condition is being used correctly.
• EXAMPLE — The identity as an equation-solver: in a triangle, if tan A = 1 and tan B = 2, find tan C. The identity says 1 + 2 + tan C = 1 x 2 x tan C, so 3 + tan C = 2 tan C and tan C = 3. (Indeed the angles are 45°, about 63.4° and about 71.6°, summing to 180°.)
• YOUR TURN — State sin(A + B) and cos(A + B) in terms of C alone when A + B + C = pi. Answer: sin(A + B) = sin(pi - C) = sin C, and cos(A + B) = cos(pi - C) = -cos C. These two lines are the seed from which every conditional identity in this section grows.
⚠ EXAM TRAP — Two warnings. First, the tangent identity needs all three tangents to exist: in a right triangle tan 90° is undefined, so switch to the sine or cosine conditional forms. Second, the condition is essential — for arbitrary A, B, C the identity simply fails (try A = B = C = 45°: the tangent sum is 3 but the product is 1). Never apply a conditional identity to angles that do not sum to pi.

Trigonometric Equations — Principal and General Solutions
• DEFINITION — A solution of a trigonometric equation in [0, 2pi) is called a principal solution. The general solution is the formula, in terms of an integer n, that generates every solution everywhere — because trig functions repeat, every equation that has one solution has infinitely many.
✔ KEY FORMULA — General solutions: sin x = sin a gives x = n pi + (-1)^n a. cos x = cos a gives x = 2n pi ± a. tan x = tan a gives x = n pi + a. And the unified square form: sin^2 x = sin^2 a, cos^2 x = cos^2 a or tan^2 x = tan^2 a each give x = n pi ± a.
✔ KEY FORMULA — Special values: sin x = 0 gives x = n pi. cos x = 0 gives x = (2n + 1) pi/2. tan x = 0 gives x = n pi. sin x = 1 gives x = 2n pi + pi/2. sin x = -1 gives x = 2n pi - pi/2. cos x = 1 gives x = 2n pi. cos x = -1 gives x = (2n + 1) pi.
• WHY sine's formula alternates — sine hits the same value once while rising and once while falling in each period, and the (-1)^n factor encodes exactly that alternation: even n gives the a-family, odd n gives the (pi - a)-family. Cosine's two families split symmetrically as ±a, and tangent, with its shorter period pi, needs only one family.
• WORKED PATTERN — sin x = 1/2: here a = pi/6, so x = n pi + (-1)^n (pi/6). The principal solutions inside [0, 2pi) are pi/6 and 5pi/6 — read off by taking n = 0 (gives pi/6) and n = 1 (gives pi - pi/6 = 5pi/6). When a question asks only for principal solutions, this two-step read-off is the whole method.
• WORKED PATTERN — The three-move method for harder equations: (1) convert everything to ONE function using the identities (usually sin or cos, via sin^2 + cos^2 = 1 or a double-angle form); (2) factorise or solve the resulting polynomial; (3) write the general solution for each root family and reject any root with |value| > 1 for sine or cosine.
• EXAMPLE — 2 cos^2 x + 3 sin x = 0 becomes 2(1 - sin^2 x) + 3 sin x = 0, i.e. 2 sin^2 x - 3 sin x - 2 = 0, i.e. (2 sin x + 1)(sin x - 2) = 0. So sin x = -1/2 or sin x = 2 — the second is impossible and dies on the spot. From sin x = -1/2, the solutions in [0, 2pi) are 7pi/6 and 11pi/6 (Question q_math_21 tests exactly this).
• YOUR TURN — Find the principal solutions of sin x = -sqrt(3)/2 in [0, 2pi). Answer: sine is negative in quadrants III and IV, with reference angle pi/3, giving x = 4pi/3 and x = 5pi/3.
⚠ EXAM TRAP — Never divide both sides of an equation by sin x or cos x: you silently delete every solution where that factor is zero. Factorise instead — bring everything to one side and set each factor to zero. And if you square both sides anywhere, every candidate must be re-checked in the original equation, because squaring manufactures fakes (the next section shows one being caught).

▸ Equation Patterns — Factorising, Squaring and Bounding
• DEFINITION — Most exam equations are one of four patterns wearing a disguise: factorisable, homogeneous in sin and cos, bounded by an extreme value, or solvable only after squaring. Naming the pattern is half the solution.
• WORKED PATTERN — Factorising pattern: cos 2x = sin x. Convert cos 2x = 1 - 2 sin^2 x, giving 2 sin^2 x + sin x - 1 = 0 = (2 sin x - 1)(sin x + 1). So sin x = 1/2 or sin x = -1, and the general solution is x = n pi + (-1)^n (pi/6) together with x = 2n pi - pi/2. Worked Example 5 runs this in full.
• WORKED PATTERN — Bounding pattern: an equation like sin x + cos x = sqrt(2) can hold only where the R-method wave touches its maximum sqrt(2), which happens at the single phase x + pi/4 = pi/2. Hence x = pi/4 + 2n pi — one family, not two. Sums of squares work the same way: if an equation reduces to (something)^2 + (something else)^2 = 0, each bracket must vanish separately.
• WORKED PATTERN — Squaring pattern, with its health warning: solve sin x + cos x = 1 on [0, 2pi]. Squaring gives 1 + sin 2x = 1, so sin 2x = 0 and x = 0, pi/2, pi, 3pi/2 (and 2pi). Now the audit: x = pi gives -1 + 0 = -1, not 1 — REJECT. x = 3pi/2 gives -1 — REJECT. Only x = 0, pi/2 (and 2pi) survive, matching the R-method answer from the earlier section. Squaring proposed four candidates; the original equation hanged two of them.
• EXAMPLE — Homogeneous pattern: 2 sin x cos x = cos x. Do NOT cancel cos x. Factorise: cos x (2 sin x - 1) = 0, giving cos x = 0 (x = (2n + 1) pi/2) or sin x = 1/2 (x = n pi + (-1)^n pi/6). Cancelling would have thrown away the entire first family — half the answer.
• YOUR TURN — Solve tan^2 x - 3 = 0 in [0, 2pi). Answer: tan x = ± sqrt(3), giving x = pi/3, 2pi/3, 4pi/3, 5pi/3 — four solutions, because tangent's pi-period packs two families into one revolution.
★ HIGHLIGHT — The equation checklist: one function, factorise, bound-check with R, audit after squaring. Run those four words over any equation and the pattern announces itself.
⚠ EXAM TRAP — An answer like sin x = 2 or cos x = -1.5 in your working is not a family to report — it is an impossibility to discard. Options in the paper sometimes include a "solution" built on such a root; the bound |sin x| ≤ 1 and |cos x| ≤ 1 is a free elimination tool.

Inverse Functions — Why Branches Must Exist
• DEFINITION — The sine function on all of R is many-to-one: sin 0 = sin pi = sin 2pi = 0. A many-to-one function has no inverse, so to define sin^-1 we first RESTRICT sine to an interval where it is one-one and still covers its full range [-1, 1]. On [-pi/2, pi/2] sine rises from -1 to 1 exactly once — that interval becomes the principal value branch of sin^-1.
• DEFINITION — The principal value of an inverse trigonometric expression is the value that lies inside the chosen branch. sin^-1 t answers: "the angle in [-pi/2, pi/2] whose sine is t". Every inverse question is secretly asking whether you know which interval the answer must live in.
• WHY the branches are chosen the way they are — each branch is the "home interval" nearest the origin that captures the full range: sine and cosecant hug 0 inside [-pi/2, pi/2], while cosine, secant and cotangent live in [0, pi] because cosine is not one-one on any interval symmetric about 0. Tangent uses (-pi/2, pi/2). These are the NCERT conventions, and the IAT follows NCERT.
• WORKED PATTERN — Folding an angle home: sin^-1(sin(2pi/3)) is NOT 2pi/3, because 2pi/3 lies outside [-pi/2, pi/2]. Compute inside-out: sin(2pi/3) = sqrt(3)/2, and the angle in [-pi/2, pi/2] with that sine is pi/3. So sin^-1(sin(2pi/3)) = pi/3. The inverse function folds every angle back into its branch.
• EXAMPLE — cos^-1(cos(7pi/6)): cos(7pi/6) = -sqrt(3)/2, and the angle in [0, pi] with cosine -sqrt(3)/2 is 5pi/6. So cos^-1(cos(7pi/6)) = 5pi/6 — folded from quadrant III up into quadrant II, the branch's home.
• YOUR TURN — Evaluate sin^-1(sin(5pi/6)). Answer: sin(5pi/6) = 1/2, and the home angle in [-pi/2, pi/2] with sine 1/2 is pi/6 — so the value is pi/6, not 5pi/6.
★ HIGHLIGHT — f^-1(f(x)) = x ONLY when x already lives in the branch. Outside the branch, f^-1(f(x)) is the folded twin of x, and finding that twin is a guaranteed exam question every year.
⚠ EXAM TRAP — sin^-1 x is an angle, not 1/sin x. The -1 is function notation (inverse), not an exponent: sin^-1(1/2) = pi/6, while (sin(1/2))^-1 would be a completely different, much uglier number. Similarly tan^-1 x has nothing to do with 1/tan x = cot x — though tan^-1(1/x) does connect to cot^-1 x, with a catch handled in the properties section.

Domains and Principal Value Branches — the Master Table
• DEFINITION — sin^-1 x: domain [-1, 1], principal branch [-pi/2, pi/2]. cos^-1 x: domain [-1, 1], principal branch [0, pi]. These two branches are the most tested lines in the chapter.
• DEFINITION — tan^-1 x: domain all real numbers, principal branch (-pi/2, pi/2) — open, because tangent explodes at the endpoints. cot^-1 x: domain all real numbers, principal branch (0, pi).
• DEFINITION — sec^-1 x: domain (-infinity, -1] union [1, infinity), principal branch [0, pi] with pi/2 removed. cosec^-1 x: same domain, principal branch [-pi/2, pi/2] with 0 removed. The removals exist because sec pi/2 and cosec 0 do not exist.
• WORKED PATTERN — Reading principal values off the table: cos^-1(-1/2) = 2pi/3 (the [0, pi] angle with cosine -1/2). sin^-1(-1/2) = -pi/6 (negative output allowed — the sine branch straddles 0). tan^-1(-1) = -pi/4. But cot^-1(-1) = 3pi/4, never -pi/4, because the cotangent branch (0, pi) contains no negative angles at all. sec^-1(-2) = 2pi/3 and cosec^-1(-2) = -pi/6.
• WHY the two families behave differently — the [-pi/2, pi/2] family (sin^-1, tan^-1, cosec^-1) is odd-friendly: negative inputs give negative outputs. The [0, pi] family (cos^-1, sec^-1, cot^-1) folds negatives upward: a negative input gives an obtuse output between pi/2 and pi. Sorting the six functions into these two families organises every property in the next section.
• EXAMPLE — The graphs make the table visible: Figure 4.2 plots all three workhorses — sin^-1 climbing from (-1, -pi/2) to (1, pi/2), cos^-1 falling from (-1, pi) to (1, 0), tan^-1 sweeping between its horizontal asymptotes at ±pi/2. In each panel the original function is faint, its principal-branch segment is bold, and the inverse is that bold segment reflected in the line y = x.
• YOUR TURN — Evaluate cos^-1(cos(10pi/9)). Answer: 10pi/9 is outside [0, pi]; cos(10pi/9) = -cos(pi/9), and the angle in [0, pi] with that cosine is pi - pi/9 = 8pi/9. (Practice Question 5 re-tests this fold.)
★ HIGHLIGHT — Memorise the table as two rows, not six facts: "sine-type" branches [-pi/2, pi/2] for sin^-1, tan^-1, cosec^-1; "cosine-type" branches inside [0, pi] for cos^-1, sec^-1, cot^-1. Domain split: sin^-1 and cos^-1 eat [-1, 1]; tan^-1 and cot^-1 eat everything; sec^-1 and cosec^-1 eat |x| ≥ 1.
⚠ EXAM TRAP — Asking for sin^-1(2) or cos^-1(-3/2) is a domain violation — no such angle exists, and "does not exist" style options feed on students who start computing anyway. Check the domain before the branch, and the branch before the formula.

First Properties — Negatives, Reciprocals and Complementary Pairs
✔ KEY FORMULA — Negative inputs, odd family: sin^-1(-x) = -sin^-1 x, tan^-1(-x) = -tan^-1 x, cosec^-1(-x) = -cosec^-1 x. Negative inputs, mirror family: cos^-1(-x) = pi - cos^-1 x, sec^-1(-x) = pi - sec^-1 x, cot^-1(-x) = pi - cot^-1 x.
✔ KEY FORMULA — Complementary pairs: sin^-1 x + cos^-1 x = pi/2 for |x| ≤ 1. tan^-1 x + cot^-1 x = pi/2 for every real x. sec^-1 x + cosec^-1 x = pi/2 for |x| ≥ 1. Each pair is two branches that tile a right angle.
✔ KEY FORMULA — Reciprocals: sin^-1(1/x) = cosec^-1 x and cos^-1(1/x) = sec^-1 x for |x| ≥ 1. And the delicate one: tan^-1(1/x) = cot^-1 x when x > 0, but tan^-1(1/x) = cot^-1 x - pi when x < 0.
• WHY the mirror family mirrors — an angle in [0, pi] whose cosine is -x is the supplement of the angle whose cosine is x, because cos(pi - theta) = -cos theta. The odd family instead uses sin(-theta) = -sin theta directly. Same chapter, two geometries — the branch decides which.
• WORKED PATTERN — Complementary pairs as a shortcut: if cos^-1 x = pi/3 then sin^-1 x = pi/2 - pi/3 = pi/6 without touching a triangle. Whenever a problem hands you one member of a pair and asks for the other, the answer is pi/2 minus what you were given.
• EXAMPLE — The two faces of a negative: tan^-1(-1/sqrt(3)) = -pi/6 (odd family, negative in, negative out), while cot^-1(-1/sqrt(3)) = 2pi/3 (mirror family — the angle in (0, pi) whose cotangent is -1/sqrt(3)). Same input, opposite instincts; the options in the paper will contain both values, and only the branch can separate them.
• YOUR TURN — Given cos^-1(3/5) is some angle theta, what is sin^-1(3/5) in terms of theta? Answer: pi/2 - theta, instantly, by the complementary pair — no computation of theta required.
★ HIGHLIGHT — These three property groups — negatives, reciprocals, complementary pairs — are pure branch consequences. If a "property" you half-remember contradicts the branch table, the table wins: re-derive the property from the branch in fifteen seconds rather than trusting the memory.
⚠ EXAM TRAP — cot^-1(-x) = -cot^-1 x is FALSE; the truth is pi - cot^-1 x. This single line is responsible for a steady stream of lost marks, because cot^-1 feels like it should behave like tan^-1. It cannot: its branch (0, pi) has no negative territory to answer from.

Adding Inverse Tangents — the xy Correction
• DEFINITION — The most used and most abused formula of the chapter: tan^-1 x + tan^-1 y = tan^-1((x + y)/(1 - xy)) — valid exactly as written ONLY when xy < 1 (and, as always, the result then automatically sits in the branch). The number xy is the gatekeeper: compute it before you touch the formula.
✔ KEY FORMULA — The three cases: if xy < 1, use the formula directly. If xy > 1 and x, y are both positive, the answer is pi + tan^-1((x + y)/(1 - xy)). If xy > 1 and x, y are both negative, the answer is -pi + tan^-1((x + y)/(1 - xy)) (equivalently, the raw value minus pi). Mixed signs give xy < 0 < 1, so no correction ever arises there.
• WHY the correction exists — the raw formula always reports an angle in (-pi/2, pi/2), because that is all tan^-1 can say. But when x, y > 0 with xy > 1, each angle exceeds... their sum genuinely lives in (pi/2, pi): tangent there is negative, and indeed (x + y)/(1 - xy) is negative, so the raw formula hands back a negative angle in (-pi/2, 0). Adding pi walks that answer across to its true home in (pi/2, pi) without changing its tangent — tangent has period pi, so the walk is legal. Figure 4.3 draws the three cases on one number line.
• WORKED PATTERN — tan^-1 2 + tan^-1 3: first the gatekeeper — xy = 6 > 1, both positive, correction armed. Raw: (2 + 3)/(1 - 6) = -1, and tan^-1(-1) = -pi/4. Corrected: -pi/4 + pi = 3pi/4. Sanity check: tan^-1 2 ≈ 63.4° and tan^-1 3 ≈ 71.6° sum to 135° = 3pi/4 — the raw -45° was never plausible for two large positive angles.
• EXAMPLE — No correction needed: tan^-1(1/2) + tan^-1(1/3) has xy = 1/6 < 1, so directly tan^-1((1/2 + 1/3)/(1 - 1/6)) = tan^-1((5/6)/(5/6)) = tan^-1 1 = pi/4. And the negative mirror: tan^-1(-2) + tan^-1(-3) has xy = 6 > 1 with both negative: raw value tan^-1((-5)/(1 - 6)) = tan^-1 1 = pi/4, corrected to pi/4 - pi = -3pi/4, matching -(tan^-1 2 + tan^-1 3).
• EXAMPLE — The difference form is the sum form in disguise: tan^-1 x - tan^-1 y = tan^-1 x + tan^-1(-y), and since the product x(-y) = -xy, the correction triggers when -xy > 1, i.e. xy < -1. In the common case xy > -1 it is simply tan^-1((x - y)/(1 + xy)).
• YOUR TURN — Evaluate tan^-1 1 + tan^-1 2 + tan^-1 3. Answer: group the last two first — tan^-1 2 + tan^-1 3 = 3pi/4 (the worked pattern above) — then add tan^-1 1 = pi/4 to get exactly pi. A famous identity hiding inside a routine exercise.
★ HIGHLIGHT — The ritual that protects every inverse-tangent sum: (1) compute xy, (2) announce the case, (3) only then use the formula. Three seconds of ritual, one guaranteed mark protected — Question q_math_20 in this chapter's practice bank tests nothing else.
⚠ EXAM TRAP — THE trap of the chapter: answering -pi/4 for tan^-1 2 + tan^-1 3. The raw formula's output is a tangent value's home angle, not the sum. If x and y are both positive and your sum comes out negative, the paper is telling you the correction was skipped — two positive acute angles cannot add to a negative number.

The 2 tan^-1 x Family and Telescoping Series
✔ KEY FORMULA — Doubling conversions: 2 tan^-1 x = tan^-1(2x/(1 - x^2)) when |x| < 1. 2 tan^-1 x = sin^-1(2x/(1 + x^2)) when |x| ≤ 1. 2 tan^-1 x = cos^-1((1 - x^2)/(1 + x^2)) when x ≥ 0. And 3 tan^-1 x = tan^-1((3x - x^3)/(1 - 3x^2)) when |x| < 1/sqrt(3).
• WHY three costumes for one angle — substituting x = tan theta turns 2x/(1 + x^2) into sin 2theta and (1 - x^2)/(1 + x^2) into cos 2theta: the three formulas are the double-angle formulas read backwards. The side conditions are branch guards — each costume fits only while 2 tan^-1 x stays within the target function's branch.
• WORKED PATTERN — Euler's gem: 2 tan^-1(1/3) + tan^-1(1/7) = pi/4. Step 1, double: 2 tan^-1(1/3) = tan^-1((2/3)/(1 - 1/9)) = tan^-1(3/4). Step 2, add: tan^-1(3/4) + tan^-1(1/7) = tan^-1((3/4 + 1/7)/(1 - 3/28)) = tan^-1((25/28)/(25/28)) = tan^-1 1 = pi/4. The fractions were designed to cancel — spotting designed numbers is a transferable exam instinct.
• DEFINITION — A telescoping arctan series writes each term as a difference of consecutive inverse tangents: tan^-1(1/(1 + n + n^2)) = tan^-1(n + 1) - tan^-1(n), because (n + 1 - n)/(1 + n(n + 1)) = 1/(1 + n + n^2) and the product n(n + 1) is positive with the difference landing inside the branch, so no correction intrudes.
• WORKED PATTERN — Sum the telescope: the sum from n = 1 to N of tan^-1(1/(1 + n + n^2)) collapses to tan^-1(N + 1) - tan^-1(1) = tan^-1(N + 1) - pi/4, every middle term cancelling with its neighbour. Let N run to infinity: tan^-1(N + 1) tends to pi/2, so the infinite sum is pi/2 - pi/4 = pi/4. This telescoping arctan series is a signature IAT pattern — it is named on this chapter's own subtitle card.
• EXAMPLE — The sine-sum cousin: sin^-1 x + sin^-1 y = sin^-1(x sqrt(1 - y^2) + y sqrt(1 - x^2)) when x^2 + y^2 ≤ 1 (or xy ≤ 0); when x, y are both positive with x^2 + y^2 > 1, the sum exceeds pi/2 and the answer becomes pi minus that expression. You will use the safe case in Worked Example 7.
• YOUR TURN — Sum tan^-1(1/3) + tan^-1(1/7) + tan^-1(1/13) (the n = 1, 2, 3 telescope terms, since 1 + n + n^2 gives 3, 7, 13). Answer: tan^-1 4 - tan^-1 1 = tan^-1 4 - pi/4 ≈ 1.326 - 0.785 = 0.540 rad.
⚠ EXAM TRAP — The |x| guards are load-bearing: 2 tan^-1 2 is NOT tan^-1(4/(1 - 4)) = tan^-1(-4/3). Since 2 lies outside |x| < 1, the correct statement is 2 tan^-1 2 = pi + tan^-1(-4/3) = pi - tan^-1(4/3) ≈ 2.21 rad. Dropping the guard turns a second-quadrant answer into a fourth-quadrant one.

Solving Inverse-Trig Equations
• DEFINITION — An inverse-trig equation mixes inverse functions and constants, like tan^-1(2x) + tan^-1(3x) = pi/4. The method has four moves: combine everything into ONE inverse function using the properties, respect the branch conditions while combining, solve the resulting ordinary equation, and then VERIFY every candidate in the original equation.
• WHY verification is not optional here — combining formulas applies branch-sensitive identities to unknown quantities: you do not yet know whether xy < 1 held for the true solution. The algebra therefore proposes candidates under assumptions the candidates themselves may violate. Substitution back into the original is the only court of appeal.
• WORKED PATTERN — Solve tan^-1(2x) + tan^-1(3x) = pi/4. Combine: (2x + 3x)/(1 - 6x^2) must have inverse tangent pi/4, so 5x/(1 - 6x^2) = 1, giving 6x^2 + 5x - 1 = 0, so x = 1/6 or x = -1. Verify: x = 1/6 gives tan^-1(1/3) + tan^-1(1/2) = pi/4 (the no-correction example from the addition section) — KEEP. x = -1 gives tan^-1(-2) + tan^-1(-3) = -3pi/4, not pi/4 — REJECT. One candidate was born from the wrong branch case.
• WORKED PATTERN — Solve sin^-1(1 - x) - 2 sin^-1 x = pi/2 (a classical NCERT equation). Move terms: sin^-1(1 - x) = pi/2 + 2 sin^-1 x; take sine of both sides, using sin(pi/2 + t) = cos t with t = 2 sin^-1 x: 1 - x = cos(2 sin^-1 x) = 1 - 2x^2. Hence 2x^2 = x, so x = 0 or x = 1/2. Verify: x = 0 gives sin^-1 1 - 0 = pi/2 — KEEP. x = 1/2 gives sin^-1(1/2) - 2 sin^-1(1/2) = -pi/6 — REJECT. Answer: x = 0 alone.
• EXAMPLE — The complementary pair as an equation-solver: sin^-1 x = cos^-1 x. But cos^-1 x = pi/2 - sin^-1 x, so sin^-1 x = pi/4 and x = sin(pi/4) = 1/sqrt(2). (Practice Question 8 re-tests this; the domain |x| ≤ 1 is satisfied.)
• YOUR TURN — The equation tan^-1 x + cot^-1 x = pi/2 has what solution set? Answer: EVERY real x — it is the complementary-pair identity, not an equation to solve. Recognising an identity disguised as an equation is itself a scored skill, and "all real numbers" is an option examiners love to offer and students love to distrust.
★ HIGHLIGHT — Inverse equations are the chapter in miniature: properties to combine, branches to respect, candidates to verify. If your final answer was never substituted back, it is a draft, not an answer.
⚠ EXAM TRAP — Rejecting nothing is the classic failure: the pair x = 1/6 and x = -1 above appears in options as "1/6 or -1" and it is wrong. The second classic failure is the opposite — rejecting a valid root because a mid-step formula needed a correction case; if a candidate fails only under one case assumption, retest it under the other case before discarding.

Formula Sheet — the Identity Bank
✔ sin^2 x + cos^2 x = 1; 1 + tan^2 x = sec^2 x; 1 + cot^2 x = cosec^2 x
✔ sin(A ± B) = sin A cos B ± cos A sin B; cos(A ± B) = cos A cos B ∓ sin A sin B; tan(A ± B) = (tan A ± tan B)/(1 ∓ tan A tan B)
✔ sin 2A = 2 sin A cos A = 2 tan A/(1 + tan^2 A); cos 2A = 2 cos^2 A - 1 = 1 - 2 sin^2 A; tan 2A = 2 tan A/(1 - tan^2 A)
✔ sin 3A = 3 sin A - 4 sin^3 A; cos 3A = 4 cos^3 A - 3 cos A; tan 3A = (3 tan A - tan^3 A)/(1 - 3 tan^2 A)
✔ sin C + sin D = 2 sin((C + D)/2) cos((C - D)/2); cos C + cos D = 2 cos((C + D)/2) cos((C - D)/2); cos C - cos D = -2 sin((C + D)/2) sin((C - D)/2)
✔ 2 sin A cos B = sin(A + B) + sin(A - B); 2 cos A cos B = cos(A + B) + cos(A - B); 2 sin A sin B = cos(A - B) - cos(A + B)
✔ a sin x + b cos x lies between -sqrt(a^2 + b^2) and +sqrt(a^2 + b^2); equality when the phase hits pi/2 or -pi/2
✔ sin 18° = (sqrt(5) - 1)/4; cos 36° = (sqrt(5) + 1)/4; sin 75° = (sqrt(6) + sqrt(2))/4; tan 75° = 2 + sqrt(3); tan 15° = 2 - sqrt(3)
✔ If A + B + C = pi: tan A + tan B + tan C = tan A tan B tan C; sin 2A + sin 2B + sin 2C = 4 sin A sin B sin C; cos^2 A + cos^2 B + cos^2 C + 2 cos A cos B cos C = 1
✔ General solutions: sin x = sin a gives x = n pi + (-1)^n a; cos x = cos a gives x = 2n pi ± a; tan x = tan a gives x = n pi + a
✔ Branches: sin^-1 in [-pi/2, pi/2]; cos^-1 in [0, pi]; tan^-1 in (-pi/2, pi/2); cot^-1 in (0, pi); sec^-1 in [0, pi] minus pi/2; cosec^-1 in [-pi/2, pi/2] minus 0
✔ sin^-1 x + cos^-1 x = pi/2; tan^-1 x + cot^-1 x = pi/2; sec^-1 x + cosec^-1 x = pi/2; cos^-1(-x) = pi - cos^-1 x; sin^-1(-x) = -sin^-1 x
✔ tan^-1 x + tan^-1 y = tan^-1((x + y)/(1 - xy)) if xy < 1; add pi if xy > 1 with x, y > 0; subtract pi if xy > 1 with x, y < 0
✔ 2 tan^-1 x = tan^-1(2x/(1 - x^2)) for |x| < 1; = sin^-1(2x/(1 + x^2)) for |x| ≤ 1; = cos^-1((1 - x^2)/(1 + x^2)) for x ≥ 0
✔ tan^-1(1/(1 + n + n^2)) = tan^-1(n + 1) - tan^-1(n), so the series telescopes to tan^-1(N + 1) - pi/4 and to pi/4 at infinity
✔ s = r theta (theta in radians); 180° = pi rad; periods: sin and cos 2pi, tan pi; ASTC — All, Sin, Tan, Cos positive in quadrants I, II, III, IV

Common Mistakes and Exam Traps
• Mistake 1: Writing sin(A + B) = sin A + sin B. Why it is wrong: functions do not distribute over sums — sin 60° is 0.866, but sin 30° + sin 30° is 1. Correct principle: expand with the compound formulas, always.
• Mistake 2: Applying tan^-1 x + tan^-1 y = tan^-1((x + y)/(1 - xy)) when xy > 1. Why it is wrong: the raw output is trapped in (-pi/2, pi/2) while the true sum sits outside it (tan^-1 2 + tan^-1 3 = 3pi/4, not -pi/4). Correct principle: compute xy first; add or subtract pi when xy > 1, by the signs of x and y.
• Mistake 3: Cancelling an inverse with its function outside the branch: sin^-1(sin(2pi/3)) = 2pi/3. Why it is wrong: 2pi/3 is not in [-pi/2, pi/2], so the inverse returns the folded value pi/3. Correct principle: f^-1(f(x)) = x only inside the branch; otherwise evaluate the inner function and re-enter the branch.
• Mistake 4: Writing cot^-1(-x) = -cot^-1 x by analogy with tan^-1. Why it is wrong: the cot^-1 branch (0, pi) contains no negative numbers, so the output cannot be negative; cot^-1(-1) = 3pi/4. Correct principle: the [0, pi] family mirrors — f^-1(-x) = pi - f^-1(x) for cos^-1, sec^-1, cot^-1.
• Mistake 5: Dividing a trigonometric equation through by sin x or cos x. Why it is wrong: every root of the cancelled factor is silently deleted (cancelling cos x in 2 sin x cos x = cos x loses x = (2n + 1) pi/2). Correct principle: bring everything to one side and factorise.
• Mistake 6: Squaring an equation and reporting every algebraic root. Why it is wrong: squaring cannot distinguish u = v from u = -v, so it proposes both families (sin x + cos x = 1 "gains" x = pi and 3pi/2). Correct principle: squaring is a proposal mechanism — the original equation disposes.
• Mistake 7: Reaching for the wrong cos 2A form, e.g. using 2 sin^2 A - 1 or feeding sin data into the cosine form. Why it is wrong: 2 sin^2 A - 1 equals -cos 2A, flipping every sign downstream. Correct principle: the pure forms are 1 - 2 sin^2 A and 2 cos^2 A - 1; choose the one matching the function you are given.
• Mistake 8: Using a conditional identity without the condition — e.g. tan A + tan B + tan C = tan A tan B tan C for angles that do not sum to pi. Why it is wrong: at A = B = C = 45° the two sides are 3 and 1. Correct principle: conditional identities are contracts; check A + B + C = pi before signing.
• Mistake 9: Mixing degrees and radians inside one computation — s = r theta with theta in degrees, or a general solution like n x 180 + (-1)^n x 30 next to pi-based options. Why it is wrong: the formulas of this chapter (arc length, general solutions, branches) are stated in radians. Correct principle: convert everything to radians at the door; keep degrees only for intuition and final geometry answers.
• Mistake 10: Writing tan^-1(1/x) = cot^-1 x for negative x. Why it is wrong: for x < 0 the equality needs a -pi correction (tan^-1(1/x) = cot^-1 x - pi), because tan^-1 answers negatively while cot^-1 answers in (0, pi). Correct principle: reciprocal swaps between the two families always deserve a branch check on negative inputs.

Worked Examples — Basic to Challenging
• Example 1 — Problem: Find the exact values of sin 75° and tan 15°.
• Given: Only the standard table for 30°, 45°, 60° may be used.
• Principle: Compound-angle expansions with 75° = 45° + 30° and 15° = 45° - 30°.
• Steps: sin 75° = sin 45° cos 30° + cos 45° sin 30° = (1/sqrt(2))(sqrt(3)/2) + (1/sqrt(2))(1/2) = (sqrt(3) + 1)/(2 sqrt(2)); rationalise to (sqrt(6) + sqrt(2))/4. tan 15° = (tan 45° - tan 30°)/(1 + tan 45° tan 30°) = (1 - 1/sqrt(3))/(1 + 1/sqrt(3)) = (sqrt(3) - 1)/(sqrt(3) + 1) = 2 - sqrt(3) after rationalising.
• Answer: sin 75° = (sqrt(6) + sqrt(2))/4 ≈ 0.966; tan 15° = 2 - sqrt(3) ≈ 0.268.
• Reasoning: Both splits use only table angles, and the decimal checks agree with quadrant sense: sin 75° is near 1, tan 15° is small and positive.
• Mistake to avoid: Splitting 75° as 90° - 15° is circular (it needs the very values being found); split into two KNOWN angles.
• Example 2 — Problem: Prove that sin 18° = (sqrt(5) - 1)/4.
• Given: Let theta = 18°, so 2 theta = 36° and 3 theta = 54° = 90° - 36°.
• Principle: sin 2 theta = cos 3 theta (complementary angles), then the double- and triple-angle formulas turn this into a quadratic in sin theta.
• Steps: sin 2 theta = cos 3 theta gives 2 sin theta cos theta = 4 cos^3 theta - 3 cos theta. Divide by cos theta (nonzero): 2 sin theta = 4 cos^2 theta - 3 = 4(1 - sin^2 theta) - 3 = 1 - 4 sin^2 theta. Set s = sin theta: 4s^2 + 2s - 1 = 0, so s = (-2 ± sqrt(4 + 16))/8 = (-1 ± sqrt(5))/4.
• Answer: sin 18° = (sqrt(5) - 1)/4 ≈ 0.309, taking the positive root.
• Reasoning: sin 18° is positive and less than sin 30° = 0.5; (-1 + sqrt(5))/4 ≈ 0.309 fits, while (-1 - sqrt(5))/4 ≈ -0.809 is impossible for this angle.
• Mistake to avoid: Reporting both quadratic roots — a sine of an acute angle is a specific positive number under 0.5 here, and the extraneous root is the trap the problem was built around.
• Example 3 — Problem: Show that sin 75° - sin 15° = 1/sqrt(2).
• Given: A difference of sines with angles symmetric about 45°.
• Principle: Sum-to-product: sin C - sin D = 2 cos((C + D)/2) sin((C - D)/2).
• Steps: (75° + 15°)/2 = 45° and (75° - 15°)/2 = 30°, so the difference equals 2 cos 45° sin 30° = 2 x (1/sqrt(2)) x (1/2) = 1/sqrt(2).
• Answer: 1/sqrt(2) = sqrt(2)/2 ≈ 0.707, confirmed directly: 0.966 - 0.259 = 0.707.
• Reasoning: The C-D formula converted two non-table values into one product of table values — that conversion is the entire point of the system.
• Mistake to avoid: Reaching for compound expansions of both angles separately — it works but costs four terms and two rationalisations where the C-D route costs one line.
• Example 4 — Problem: Solve sin x + cos x = 1 for x in [0, 2pi].
• Given: A sine-cosine mixture set equal to a constant inside its range.
• Principle: The R-method: sin x + cos x = sqrt(2) sin(x + pi/4), and sqrt(2) ≥ 1 so solutions exist.
• Steps: sqrt(2) sin(x + pi/4) = 1 gives sin(x + pi/4) = 1/sqrt(2). With x + pi/4 in [pi/4, 2pi + pi/4], the solutions are x + pi/4 = pi/4, 3pi/4 (and 2pi + pi/4). Hence x = 0, pi/2 (and 2pi, the same point as 0).
• Answer: x = 0 and x = pi/2 within [0, 2pi), with 2pi closing the interval.
• Reasoning: Direct check: sin 0 + cos 0 = 1 and sin(pi/2) + cos(pi/2) = 1. The squaring route of the patterns section proposes pi and 3pi/2 as well — both fail this same check, which is why the check exists.
• Mistake to avoid: Using the phase shift with alpha in the wrong quadrant — here both coefficients are positive so alpha = pi/4 is safe, but the habit of pinning alpha by both its sine and cosine is what survives harder problems.
• Example 5 — Problem: Find the general solution of cos 2x = sin x.
• Given: An equation mixing a double angle with a single angle.
• Principle: Convert cos 2x into the sine currency: cos 2x = 1 - 2 sin^2 x, then factorise.
• Steps: 1 - 2 sin^2 x = sin x gives 2 sin^2 x + sin x - 1 = 0 = (2 sin x - 1)(sin x + 1). So sin x = 1/2 or sin x = -1. The first gives x = n pi + (-1)^n (pi/6); the second gives x = 2n pi - pi/2 (equivalently 2n pi + 3pi/2).
• Answer: x = n pi + (-1)^n (pi/6) or x = 2n pi - pi/2, for integer n.
• Reasoning: Both families are genuine: at x = pi/6, cos(pi/3) = 1/2 = sin(pi/6); at x = 3pi/2, cos 3pi = -1 = sin(3pi/2).
• Mistake to avoid: Using cos 2x = 2 cos^2 x - 1 here forces a mixed sin-cos quadratic that will not factorise — choose the double-angle form that matches the other side's function.
• Example 6 — Problem: Prove that tan^-1 1 + tan^-1 2 + tan^-1 3 = pi.
• Given: Three inverse tangents with arguments 1, 2, 3.
• Principle: Pairwise addition with the xy correction — the pair (2, 3) has xy = 6 > 1.
• Steps: tan^-1 2 + tan^-1 3 = pi + tan^-1((2 + 3)/(1 - 6)) = pi + tan^-1(-1) = pi - pi/4 = 3pi/4. Then add tan^-1 1 = pi/4: total = 3pi/4 + pi/4 = pi.
• Answer: pi, exactly.
• Reasoning: Decimal audit: 45° + 63.43° + 71.57° = 180°. The correction step was not decoration — without it the "proof" collapses to 0, an obviously false claim about three positive angles.
• Mistake to avoid: Adding all three rawly in one step; the formula is binary, and the correction belongs to the specific pair whose product exceeds 1.
• Example 7 — Problem: Simplify sin^-1(3/5) + sin^-1(8/17) to a single inverse function.
• Given: Two inverse sines with x^2 + y^2 = 9/25 + 64/289 = (153 + 64)/... precisely 0.36 + 0.221 = 0.581 ≤ 1, so the safe case of the sine-sum formula applies.
• Principle: sin^-1 x + sin^-1 y = sin^-1(x sqrt(1 - y^2) + y sqrt(1 - x^2)) in the safe case.
• Steps: sqrt(1 - (8/17)^2) = 15/17 and sqrt(1 - (3/5)^2) = 4/5. So the sum is sin^-1((3/5)(15/17) + (8/17)(4/5)) = sin^-1(45/85 + 32/85) = sin^-1(77/85).
• Answer: sin^-1(77/85) ≈ sin^-1(0.906) ≈ 1.13 rad.
• Reasoning: The 3-4-5 and 8-15-17 triangles supplied both square roots for free — exam numbers are chosen so the radicals collapse, and noticing the triples before computing is the speed skill.
• Mistake to avoid: Reporting cos^-1(36/85) as a different answer — it is actually the SAME angle in disguise (cos of the sum is 36/85), so if an option list holds both, the question wants the sin^-1 form the question's shape implies; check which function the question asks to end with.
• Example 8 — Problem: Solve tan^-1(2x) + tan^-1(3x) = pi/4.
• Given: An inverse equation whose combined product (2x)(3x) = 6x^2 has unknown sign status until x is known.
• Principle: Combine with the addition formula, solve the algebra, then verify each candidate in the ORIGINAL equation.
• Steps: (5x)/(1 - 6x^2) = tan(pi/4) = 1, so 6x^2 + 5x - 1 = 0 = (6x - 1)(x + 1), giving x = 1/6 or x = -1. Verify x = 1/6: tan^-1(1/3) + tan^-1(1/2) = pi/4 (product 1/6 < 1, direct case) — valid. Verify x = -1: tan^-1(-2) + tan^-1(-3) = -3pi/4 — invalid.
• Answer: x = 1/6 only.
• Reasoning: The rejected root satisfied the combined equation under the wrong branch case (for x = -1 the true combination needs the -pi correction, changing the equation it solves).
• Mistake to avoid: Presenting "x = 1/6 or -1" — the two-root answer is the designed trap of this problem type, and it is wrong.

Practice Questions — Self-Test Set
• Q1. Evaluate tan 105° exactly.
• Q2. Evaluate sin 20° sin 40° sin 80° exactly.
• Q3. Write the general solution of tan x = -1.
• Q4. Find the maximum and minimum values of 5 sin x - 12 cos x.
• Q5. Evaluate cos^-1(cos(10pi/9)) as a principal value.
• Q6. Evaluate tan^-1(1/2) + tan^-1(1/5) + tan^-1(1/8).
• Q7. If A + B + C = pi, express cos 2A + cos 2B + cos 2C in terms of cos A, cos B, cos C.
• Q8. Solve sin^-1 x = cos^-1 x for x in the common domain.

▸ Answer Key with Explanations
• A1. tan 105° = -(2 + sqrt(3)) ≈ -3.73. Misconception watch: the sign — 105° is in quadrant II where tangent is negative; answers of +(2 + sqrt(3)) forgot ASTC, and 2 - sqrt(3) is tan 15° wearing the wrong angle.
• A2. sin 20° sin 40° sin 80° = sqrt(3)/8 ≈ 0.217. Route: multiply by sin 60° to use the classical product sin 20° sin 40° sin 60° sin 80° = 3/16, then divide by sqrt(3)/2. Misconception watch: reaching for a calculator identity per factor instead of the product-to-sum chain.
• A3. x = n pi + 3pi/4 (equivalently n pi - pi/4), n any integer. Misconception watch: writing 2n pi ± 3pi/4 — that is the cosine pattern; tangent repeats every pi, so one family with step pi covers everything.
• A4. Maximum 13, minimum -13, by the R-method with R = sqrt(25 + 144) = 13. Misconception watch: answering 17 (adding the coefficients) or sqrt(119) (subtracting the squares) — the amplitude is the hypotenuse of the coefficient pair.
• A5. 8pi/9. The angle 10pi/9 folds into [0, pi] as pi - pi/9 because cos(10pi/9) = -cos(pi/9). Misconception watch: answering 10pi/9 itself — a principal value must live in the branch, and 10pi/9 does not.
• A6. pi/4. Route: tan^-1(1/2) + tan^-1(1/5) = tan^-1(7/9) (product 1/10 < 1), then tan^-1(7/9) + tan^-1(1/8) = tan^-1((65/72)/(65/72)) = tan^-1 1. Misconception watch: this is Euler's identity — the fractions are engineered; if your arithmetic produces ugly numbers, an arithmetic slip has occurred, not a hard problem.
• A7. cos 2A + cos 2B + cos 2C = -1 - 4 cos A cos B cos C. Misconception watch: the sign of the product term is negative here, unlike the tangent identity's clean equality — verify with an equilateral triangle: each cos 2A = cos 120° = -1/2, sum -3/2; right side -1 - 4 x (1/8) = -3/2. Correct.
• A8. x = 1/sqrt(2). Route: cos^-1 x = pi/2 - sin^-1 x forces sin^-1 x = pi/4. Misconception watch: x = 0 is NOT a solution (sin^-1 0 = 0 but cos^-1 0 = pi/2); the equality needs the two branches to meet exactly at their shared midpoint pi/4.

Chapter Summary, Revision Checklist and Self-Assessment
• Summary: Forward trigonometry is a closed toolkit — compound formulas generate multiple-angle and C-D formulas, the R-method bounds every sine-cosine mixture by sqrt(a^2 + b^2), conditional identities switch on exactly when A + B + C = pi, and equations fall to a four-word checklist: one function, factorise, bound-check, audit.
• Summary: Inverse trigonometry is branch discipline — six functions, two branch families, and every property (negatives, reciprocals, complementary pairs) is the branch table in disguise. The tan^-1 addition formula is guarded by the xy test, the 2 tan^-1 x conversions carry |x| guards, telescoping series collapse by design, and inverse equations are not finished until every candidate has been substituted back.
• Revision checklist — I can convert degrees and radians both ways and use s = r theta without a mode error.
• Revision checklist — I can regenerate the standard table from the sqrt(n)/2 pattern and quote sin 18° and cos 36° exactly.
• Revision checklist — I can expand any compound, double or triple angle and choose the cos 2A form that matches the data.
• Revision checklist — I can move between sums and products with the C-D system and I know the cos C - cos D sign cold.
• Revision checklist — I can bound a sin x + b cos x instantly and use the bound to kill impossible equations and options.
• Revision checklist — I can derive tan A + tan B + tan C = tan A tan B tan C from tan(A + B) = -tan C in three lines.
• Revision checklist — I can write all three general solutions and never divide an equation by a function that might be zero.
• Revision checklist — I can state all six branches and domains, sort the six functions into the odd family and the mirror family, and fold any f^-1(f(x)) back home.
• Revision checklist — I run the xy test before every inverse-tangent addition and I verify every candidate root of an inverse equation.
• Self-assessment: Score your practice set. 7-8 correct: exam-ready — move on and revisit in a week. 5-6: the toolkit is there; drill the sections behind your two misses. 3-4: rebuild from the Formula Sheet, one family of formulas per day, re-testing after each. Below 3: restart from the ASTC section and work forward slowly — this chapter rewards sequence, and every later section leans on the earlier ones.

<!-- END math_ch_4 detailedStudyNotes -->
