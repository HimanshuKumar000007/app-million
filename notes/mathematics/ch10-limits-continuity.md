<!-- BEGIN math_ch_10 detailedStudyNotes -->
Introduction — Approaching Without Arriving
• A limit is a prediction. It answers the question: as x creeps closer and closer to a target value a, what number does f(x) home in on? The prediction is made entirely from neighbouring values — the function does not even need to be defined at a itself, and when it is defined there, its value at a is allowed to disagree with the prediction.
• DEFINITION — We write "the limit of f(x) as x tends to a equals L" when f(x) can be made arbitrarily close to L by taking x sufficiently close to a, but not equal to a. Close-but-not-equal is the whole game: a limit studies the approach, never the arrival.
• EXAMPLE — Take f(x) = (x^2 - 4)/(x - 2). At x = 2 the function does not exist (it is 0/0). Yet at x = 1.99 the value is 3.99, at x = 2.01 it is 4.01 — the function is sprinting towards 4 from both sides. The limit as x tends to 2 is 4, even though there is no value at 2 at all.
• WHY this chapter is guaranteed marks — the IAT returns to the same small cast every year: the standard limits (sin x / x and friends), one-sided traps like e^(1/x), and the piecewise-continuity question "find k". These are pattern questions, not invention questions — a student who has drilled the patterns collects them in under a minute each.
• WHY limits come before everything else in calculus — continuity in this chapter is defined through limits, and the derivative in the next chapter IS a limit (the limit of a difference quotient). One bridge line only: everything in calculus is this chapter wearing different clothes.
• The map of the chapter: first the existence question (left-hand and right-hand limits), then the algebra rules and the standard limits bank. Then the four techniques — factorisation, rationalisation, standard-form reduction, substitution and squeeze. Then limits at infinity and the indeterminate forms gallery. Finally continuity: the three-part contract, the three discontinuity types, and the find-k pattern that closes almost every IAT paper's calculus section.
★ HIGHLIGHT — The whole chapter in one breath: a limit is what the function intends to do near a point; continuity is the promise that the intention and the actual value agree. Learn to compute intentions fast, and to audit the agreement honestly.

Left-Hand and Right-Hand Limits — When Does a Limit Exist
• DEFINITION — The left-hand limit (LHL) is the value f(x) approaches as x tends to a from below (through values less than a). The right-hand limit (RHL) is the value approached as x tends to a from above. They are computed independently — each side only looks at its own neighbourhood.
• DEFINITION — The two-sided limit exists (as a finite number L) exactly when LHL = RHL = L. If the two sides approach different numbers, or either side runs off to infinity or oscillates, the two-sided limit does not exist.
• EXAMPLE — f(x) = |x| / x at 0. From the right, |x| / x = x / x = 1, so RHL = 1. From the left, |x| / x = (-x) / x = -1, so LHL = -1. The sides disagree, so the limit as x tends to 0 does not exist — even though the function is beautifully defined at every nearby point.
• EXAMPLE — The greatest integer function [x] at 0. Just right of 0, [x] = 0, so RHL = 0. Just left of 0, x is a small negative number and its floor is -1, so LHL = -1. Again the limit does not exist; [x] jumps at every integer.
• WORKED PATTERN — The existence audit, three steps: (1) compute the LHL by approaching through the left piece or the left sign; (2) compute the RHL the same way from the right; (3) compare. Equal and finite: that is the limit. Anything else: the limit does not exist, and you should say WHY (sides differ, side is infinite, or oscillation).
• WORKED PATTERN — For piecewise functions, each side is computed from its own piece: the left limit uses the formula valid just left of the joint, the right limit uses the formula valid just right of it. The piece that owns the point itself is irrelevant for limits — it only matters later, for continuity.
• YOUR TURN — Decide whether the limit of (x - 2) / |x - 2| as x tends to 2 exists. Answer: from the right the ratio is (positive)/(positive) = 1; from the left, (x - 2) is negative while |x - 2| is positive, giving -1. LHL is -1, RHL is 1, so the limit does not exist.
⚠ EXAM TRAP — Two mirror-image errors: assuming the limit must equal f(a) (it need not — the point is excluded), and assuming an undefined point kills the limit (it does not — (x^2 - 4)/(x - 2) has a perfect limit of 4 at the very point where it is undefined).

Algebra of Limits — The Combination Rules
• DEFINITION — If the limits of f and g as x tends to a both exist, say L and M, then limits combine term by term: the limit of (f + g) is L + M, of (f - g) is L - M, of (f g) is L M, of a constant times f is the constant times L, and of (f / g) is L / M provided M is not 0. Powers and roots pass through as well: the limit of (f)^n is L^n.
• WHY the rules work — near a, f behaves like L and g behaves like M, so the combination behaves like the combination of L and M. The rules are just arithmetic performed on the predictions.
• EXAMPLE — Limit as x tends to 2 of (x^2 + 3x) / (x + 1). Numerator tends to 4 + 6 = 10, denominator tends to 3, and 3 is not 0, so the quotient rule applies: the limit is 10/3. Direct substitution and the algebra rules are the same move for tame functions.
• WORKED PATTERN — The substitution test comes FIRST in every problem: plug x = a into the expression. If you get an ordinary number, that number is the limit and you are done. Only when substitution produces an indeterminate form (next sections) do you reach for a technique.
• YOUR TURN — Evaluate the limit as x tends to 1 of (x^3 + 2x) / (x^2 + 1). Answer: numerator tends to 1 + 2 = 3, denominator to 2, so the limit is 3/2 — plain substitution, no technique needed.
⚠ EXAM TRAP — The algebra rules have a licence condition: the individual limits must exist. They say nothing about 0/0, infinity minus infinity, or 0 times infinity — those forms are called indeterminate precisely because the rules fall silent and the answer depends on the details. Section 9 is their gallery.

The Standard Limits Bank — Results You Must Know Cold
• DEFINITION — The standard limits are a small bank of benchmark results. Every harder limit in this chapter is solved by converting it, through algebra, into one of these. Tag them honestly: some are NCERT core results, others are standard extensions the IAT expects you to command.
✔ KEY FORMULA — (NCERT core) Limit as x tends to a of (x^n - a^n) / (x - a) = n a^(n - 1), for any rational n. Memory anchor: the answer looks exactly like differentiating x^n at a — that is no accident, and the next chapter explains why.
✔ KEY FORMULA — (NCERT core) Limit as x tends to 0 of sin x / x = 1, and with it tan x / x tends to 1 (divide sin x / x by cos x, which tends to 1). RADIANS ONLY — in degrees the sine limit would be pi / 180, not 1.
✔ KEY FORMULA — (IAT extension) Limit as x tends to 0 of (1 - cos x) / x^2 = 1/2, from 1 - cos x = 2 sin^2(x/2): the expression becomes (1/2) x (sin(x/2) / (x/2))^2, and the bracket tends to 1.
✔ KEY FORMULA — (IAT extension) Limit as x tends to 0 of (e^x - 1) / x = 1, and of ln(1 + x) / x = 1. The expansion e^x = 1 + x + x^2/2 + ... shows why: subtracting 1 and dividing by x leaves 1 plus terms that vanish.
✔ KEY FORMULA — (IAT extension) Limit as x tends to 0 of (a^x - 1) / x = ln a, for a > 0. Anchor case: (2^x - 1) / x tends to ln 2 ≈ 0.693. This is the first bank result whose answer is not a whole number — respect it.
✔ KEY FORMULA — (NCERT core family) Limit as x tends to 0 of (1 + x)^(1/x) = e, equivalently the limit as x tends to infinity of (1 + 1/x)^x = e. This is the parent of every 1^infinity form in Section 9.
✔ KEY FORMULA — (IAT extension) Limit as x tends to 0 of sin^-1 x / x = 1 and of tan^-1 x / x = 1. Substitute t = sin^-1 x, so x = sin t and the first becomes t / sin t, the reciprocal of a bank result.
• EXAMPLE — Limit as x tends to 2 of (x^3 - 8) / (x - 2). Match the first bank result with n = 3, a = 2: the answer is 3 x 2^2 = 12. No factorisation needed once the pattern is recognised.
• WORKED PATTERN — Recognition beats computation: scan every 0/0 limit and ask which bank shape it resembles — a power difference, a sine over its angle, an exponential minus 1 over x. Sections 4 to 6 are just the art of forcing a limit into one of these shapes.
• YOUR TURN — Evaluate the limit as x tends to 2 of (x^5 - 32) / (x - 2). Answer: it is the power-difference shape with n = 5, a = 2, so the limit is 5 x 2^4 = 5 x 16 = 80.
⚠ EXAM TRAP — The sine limit is the most misquoted result in the chapter: sin 3x / x does NOT tend to 1. The angle and the denominator must match — sin 3x / (3x) tends to 1, so sin 3x / x tends to 3. Every standard limit is a contract about the exact shape, not a vibe.

Technique One — Direct Substitution and Factorisation
• DEFINITION — The attack ladder for any limit: first substitute. If substitution gives a number, stop. If it gives 0/0, the expression almost always hides a common factor of (x - a) in numerator and denominator — factor it out, cancel, then substitute into the simpler expression.
• WHY cancelling is legal — during the approach x is never equal to a, so (x - a) is never actually 0, and dividing numerator and denominator by it changes nothing about the values being approached. The cancelled function and the original agree everywhere except at a itself — and the limit cannot see a.
• EXAMPLE — Limit as x tends to 2 of (x^2 - 4) / (x - 2). Substitution gives 0/0. Factor: (x - 2)(x + 2) / (x - 2) = x + 2 for x not equal to 2, and x + 2 tends to 4. Answer: 4.
• EXAMPLE — Limit as x tends to 3 of (x^2 - 9) / (x - 3). Same shape: (x - 3)(x + 3) / (x - 3) = x + 3, which tends to 6. Notice this is also the bank result (x^2 - a^2) / (x - a) with n = 2 — the techniques and the bank agree, as they must.
• WORKED PATTERN — Any difference of powers factorises with (x - a) as a factor: x^n - a^n = (x - a)(x^(n-1) + x^(n-2) a + ... + a^(n-1)). For small n, factor by inspection; for the general shape, quote the bank result n a^(n-1) directly.
• YOUR TURN — Evaluate the limit as x tends to 3 of (x^3 - 27) / (x - 3). Answer: factor out (x - 3) or quote the bank: 3 x 3^2 = 27.
⚠ EXAM TRAP — After cancelling, students sometimes substitute back into the ORIGINAL expression, hit 0/0 again, and declare the limit does not exist. Wrong twice over: substitute into the simplified form, and remember that 0/0 never meant "no limit" — it means "not yet computed".

Technique Two — Rationalisation and Standard-Form Reduction
• DEFINITION — Rationalisation: when a 0/0 limit contains square roots, multiply numerator and denominator by the conjugate — for sqrt(A) - sqrt(B), the conjugate is sqrt(A) + sqrt(B). The product collapses via (p - q)(p + q) = p^2 - q^2, the roots vanish, and the hidden (x - a) factor appears.
• EXAMPLE — Limit as x tends to 0 of (sqrt(1 + x) - 1) / x. Multiply top and bottom by (sqrt(1 + x) + 1): the numerator becomes (1 + x) - 1 = x, so the expression is x / (x (sqrt(1 + x) + 1)) = 1 / (sqrt(1 + x) + 1), which tends to 1/2. Answer: 1/2.
• EXAMPLE — Limit as x tends to 4 of (sqrt(x) - 2) / (x - 4). Rationalise: multiply by (sqrt(x) + 2) to get (x - 4) / ((x - 4)(sqrt(x) + 2)) = 1 / (sqrt(x) + 2), tending to 1/4. Cross-check with the bank: this is (x^(1/2) - 4^(1/2)) / (x - 4), and n a^(n-1) with n = 1/2, a = 4 gives (1/2)(1/2) = 1/4. Two routes, one answer — that agreement is your error detector.
• DEFINITION — Standard-form reduction: reshape a limit algebraically until a bank shape appears with matching arguments. The moves are: divide numerator and denominator by x (or by the angle), split into a product of bank pieces, and rescale the angle with a compensating factor.
• EXAMPLE — Limit as x tends to 0 of sin 5x / sin 3x. Write it as (sin 5x / (5x)) x ((3x) / sin 3x) x (5/3): the first two brackets tend to 1 and its reciprocal, leaving 5/3. The general law: sin(mx) / sin(nx) tends to m/n.
• EXAMPLE — Limit as x tends to 0 of (e^x - 1) / sin x. Split as ((e^x - 1) / x) x (x / sin x): both brackets tend to 1, so the limit is 1. Mixed families (exponential over trig) fall to the same divide-and-match move.
• YOUR TURN — Evaluate the limit as x tends to 0 of tan 2x / (3x). Answer: tan 2x / (3x) = (tan 2x / (2x)) x (2/3), and the bracket tends to 1, so the limit is 2/3.
⚠ EXAM TRAP — The compensating factor is where marks leak: sin 5x / sin 3x students answer 1 ("both tend to the bank value") or 3/5 (inverting the ratio). Track the rescale factors explicitly — write the brackets, do not do them in your head.

Technique Three — Substitution, the Squeeze and Bounded Functions
• DEFINITION — Substitution: to attack a limit as x tends to a, set h = x - a, so the limit becomes one as h tends to 0, where the whole bank lives. The shift moves the battlefield to friendly ground.
• EXAMPLE — Limit as x tends to pi/2 of cos x / (x - pi/2). Set h = x - pi/2, so x = pi/2 + h and cos x = cos(pi/2 + h) = -sin h. The limit becomes the limit as h tends to 0 of (-sin h) / h = -1. Answer: -1 — the minus sign is the whole question.
• DEFINITION — The squeeze (sandwich) theorem: if g(x) is trapped between two functions, g(x) between p(x) and q(x), near a, and both p and q tend to the same limit L, then g also tends to L. The trap closes, and the prisoner has nowhere else to go.
• EXAMPLE — Limit as x tends to 0 of x^2 sin(1/x). The sine factor oscillates wildly between -1 and 1, but it is BOUNDED: -x^2 is at most x^2 sin(1/x), which is at most x^2. Both bounds tend to 0, so the limit is 0. The bounded factor is crushed by the vanishing factor.
• EXAMPLE — Squeeze with the floor function: for all x, x - 1 is less than [x], which is at most x. Divide by x (positive, large): 1 - 1/x is less than [x]/x, which is at most 1. Both sides tend to 1 as x tends to infinity, so [x] / x tends to 1.
• WORKED PATTERN — Spot the squeeze signature: a bounded-but-ugly factor (sin(anything), cos(anything), a floor, a fractional part) multiplied by something tending to 0. Bound the ugly factor by its extreme values, multiply through, and check both walls tend to the same number.
• YOUR TURN — Evaluate the limit as x tends to 0 of x^2 cos(1/x). Answer: cos(1/x) is bounded between -1 and 1, so the expression sits between -x^2 and x^2, both tending to 0. The limit is 0.
⚠ EXAM TRAP — sin(1/x) by itself, as x tends to 0, has NO limit: it oscillates through every value between -1 and 1 infinitely often near 0. It only surrenders when multiplied by a factor that crushes it to 0. An oscillating factor is bounded, not convergent — do not report a "limit" for it.

Limits at Infinity — Divide by the Highest Power
• DEFINITION — A limit at infinity asks for the end behaviour of f as x grows without bound (or plunges to negative infinity). For rational functions the master move is: divide numerator and denominator by the highest power of x present, then use the fact that 1/x and its powers tend to 0.
• EXAMPLE — Limit as x tends to infinity of (3x^2 + 2x) / (5x^2 - 1). Divide through by x^2: (3 + 2/x) / (5 - 1/x^2). The small terms die, leaving 3/5. Answer: 3/5.
• DEFINITION — The degree verdicts: if the numerator's degree is less than the denominator's, the limit is 0 (the denominator outruns). If the degrees are equal, the limit is the ratio of the leading coefficients. If the numerator's degree is greater, the limit is infinite — with a sign that depends on the direction and the leading terms.
• EXAMPLE — Limit as x tends to infinity of (2x + 1) / (x - 3). Degrees equal, leading coefficients 2 and 1, so the limit is 2. The lower terms are decoration; only the leaders survive the journey to infinity.
• WORKED PATTERN — Square roots at infinity: treat sqrt(x^2) as |x|, and for x tending to +infinity write sqrt(x^2 + ...) by factoring x^2 out of the root: sqrt(4x^2 + x) = x sqrt(4 + 1/x), which is why (sqrt(4x^2 + x)) / (2x) tends to 1.
• EXAMPLE — The negative-infinity ambush: limit as x tends to minus infinity of (sqrt(x^2 + 1) + x). Rationalise by the conjugate: the expression equals 1 / (sqrt(x^2 + 1) - x). As x tends to minus infinity, sqrt(x^2 + 1) behaves like |x| = -x, so the denominator behaves like -x - x = -2x, which tends to +infinity. The limit is 0 — but from the positive side, a whisper above 0.
• YOUR TURN — Evaluate the limit as x tends to infinity of (5x^3 - x) / (2x^3 + 7). Answer: equal degrees, leading ratio 5/2.
⚠ EXAM TRAP — sqrt(x^2) = |x|, not x. At +infinity the distinction hides; at minus infinity it flips signs and destroys answers. Any time a root meets negative infinity, rewrite the root with |x| before doing anything else.

Infinite Limits and One-Sided Traps
• DEFINITION — An infinite limit describes a function blowing up near a point: as x tends to a, f(x) grows beyond every bound. Writing the limit as +infinity or -infinity is a description of behaviour, not the existence of a finite limit — in the finite sense, the limit does not exist.
• EXAMPLE — The function 1/x at 0: from the right it rockets to +infinity, from the left it plunges to -infinity. Two different infinities, so no single description works — the two-sided limit does not exist in any sense.
• EXAMPLE — The function 1/x^2 at 0: both sides rocket to +infinity (the square erases the sign). Here the one-sided behaviours agree, and we say the limit is +infinity — still not a finite limit, but a clean, agreed blow-up.
• EXAMPLE — The superstar trap, e^(1/x) at 0. From the right, 1/x tends to +infinity, so e^(1/x) tends to +infinity. From the left, 1/x tends to -infinity, so e^(1/x) tends to e^(-infinity) = 0. Left side whispers 0, right side explodes: the two-sided limit does not exist, and the two sides could not be more different.
• WORKED PATTERN — One-sided audit for blow-ups: when a denominator or an exponent contains (x - a) or 1/x, ALWAYS split into left and right before answering. Ask: what sign does the inner quantity take on each side, and where does that send the function?
• WORKED PATTERN — Sign chart for 1/(x - a): just right of a, the denominator is a small positive number, so the value is a large positive; just left, small negative, large negative value. The pole flips sign — unless the denominator is squared or even-powered, in which case both sides share a sign.
• YOUR TURN — State the one-sided limits of e^(1/x) as x tends to 0, and the verdict. Answer: from the left, 0; from the right, +infinity; the two-sided limit does not exist.
⚠ EXAM TRAP — Writing "the limit of e^(1/x) as x tends to 0 is infinity" is the classic IAT donation: it ignores the left side entirely, where the function quietly tends to 0. Examiners place this exact asymmetry in the options — the correct option almost always says the two-sided limit does not exist, with the two one-sided values named.

The Indeterminate Forms Gallery — Seven Suspects, Seven Moves
• DEFINITION — An indeterminate form is a shape produced by naive substitution — 0/0, infinity/infinity, 0 x infinity, infinity - infinity, 1^infinity, 0^0, infinity^0 — whose true value cannot be read from the shape alone. Each shape is a locked door, and each has a specific key.
• WHY they are indeterminate — the symbols hide a race: in 0/0, numerator and denominator are both sprinting to 0, and the limit is decided by who is faster and by how much. (x^2 - 4)/(x - 2) gives 4, sin x / x gives 1, x^2 / x gives 0 — same shape, three verdicts.
✔ KEY FORMULA — The master key for 1^infinity: if f tends to 0 and g tends to infinity, then the limit of (1 + f)^g is e raised to the limit of (f x g). Derivation in one line: (1 + f)^g = ((1 + f)^(1/f))^(f g), the inner bracket tends to e, and the exponent tends to the limit of f g.
• EXAMPLE — 1^infinity in action: limit as x tends to 0 of (1 + 3x)^(2/x). Here f = 3x and g = 2/x, so f g = 6 constantly: the answer is e^6. Second specimen: limit as x tends to infinity of (1 + 2/x)^x: f = 2/x, g = x, f g = 2, answer e^2.
• WORKED PATTERN — 0 x infinity: move one factor downstairs as a reciprocal to reach 0/0 or infinity/infinity. Specimen: limit as x tends to 0 from the right of x ln x. Rewrite as ln x / (1/x), an infinity/infinity shape, and the verdict (standard at IAT depth) is 0 — the logarithm grows far too slowly to fight the 1/x.
• WORKED PATTERN — Infinity - infinity: force a common form — rationalise if roots appear, or take a common denominator. Specimen: limit as x tends to infinity of (sqrt(x^2 + x) - x). Multiply by the conjugate over itself: the expression becomes x / (sqrt(x^2 + x) + x), and dividing by x gives 1 / (sqrt(1 + 1/x) + 1), tending to 1/2.
• WORKED PATTERN — 0^0 and infinity^0 appear only in power towers; the universal move is to take logarithms: set y equal to the expression, compute the limit of ln y (which lands in the 0 x infinity family), and exponentiate back. At NCERT depth you only need the move, not a gallery of results.
• YOUR TURN — Evaluate the limit as x tends to 0 of (1 + 5x)^(1/x). Answer: f g = 5x x (1/x) = 5, so the limit is e^5.
⚠ EXAM TRAP — Not every scary shape is indeterminate: 1/0-type forms are NOT indeterminate (they blow up, one side at a time), and neither is 0^positive or infinity^positive. Only the seven listed shapes hide a race. Calling everything indeterminate is as wrong as calling nothing indeterminate.

Continuity at a Point — The Three-Part Contract
• DEFINITION — A function f is continuous at a point a when three clauses all hold: (1) f(a) is defined; (2) the limit of f as x tends to a exists (both sides, equal and finite); (3) the limit equals f(a). Break any clause and the function is discontinuous at a — the failure mode tells you the type, which is the next section's business.
• WHY the picture matches the algebra — continuity is the "no lifting the pen" property: the graph arrives at (a, f(a)) from both sides without a jump, a hole, or a launch to infinity. Clause (2) says the graph approaches a single height; clause (3) says the point itself sits at that height.
• EXAMPLE — f(x) = (x^2 - 9)/(x - 3) for x not equal to 3. The limit as x tends to 3 is 6 (factor and cancel), so clause (2) holds — but f(3) is undefined, clause (1) fails, and the function is discontinuous at 3. The repair is surgical: define f(3) = 6 and the function becomes continuous there. A limit can be perfect while continuity fails on a technicality of one point.
• DEFINITION — Continuity on an interval: f is continuous on an open interval when it is continuous at every point of it, and on a closed interval [a, b] when it is also right-continuous at a and left-continuous at b. Everyday functions like polynomials are continuous everywhere; that is why substitution worked all along.
• EXAMPLE — The intermediate value idea, in one line: if f is continuous on [a, b], it takes every value between f(a) and f(b) somewhere inside — in particular, if f(a) and f(b) have opposite signs, a root of f(x) = 0 lives strictly between a and b. This is the IVT, and it is the rigorous reason "the graph must cross the axis".
• YOUR TURN — Is f(x) = x^2 sin(1/x) for x not equal to 0, with f(0) = 0, continuous at 0? Answer: yes. The squeeze result from Section 6 gives the limit as 0, and f(0) = 0 matches it — all three clauses hold despite the wild oscillation nearby.
⚠ EXAM TRAP — "The limit exists, so the function is continuous" is false — clause (3) is a separate audit. The most common IAT continuity error is stopping after computing the limit and never comparing it with the defined value at the point.

Discontinuities — Removable, Jump and Infinite
• DEFINITION — Removable discontinuity: the limit exists (both sides agree) but the point is missing or misplaced — f(a) is undefined, or defined at the wrong height. One-point surgery fixes it: (re)define f(a) to equal the limit. Specimen: (x^2 - 9)/(x - 3) at 3, repaired by f(3) = 6.
• DEFINITION — Jump discontinuity: both one-sided limits exist and are finite, but they differ. The graph leaps from one height to another, and no redefinition of a single point can bridge a leap. Specimens: [x] at every integer (jump of size 1), |x| / x at 0 (from -1 to 1).
• DEFINITION — Infinite discontinuity: at least one side blows up to plus or minus infinity — the graph has a vertical asymptote at the point. Specimens: 1/x at 0, 1/x^2 at 0, tan x at pi/2.
• DEFINITION — A fourth flavour worth naming: the oscillatory (essential) discontinuity of sin(1/x) at 0, where the function swings through all values between -1 and 1 in every neighbourhood. No limit, no blow-up, no repair — pure oscillation. It is beyond the NCERT three, but the IAT knows it.
• WORKED PATTERN — The classification audit at a suspect point a: compute LHL, compute RHL, read off f(a). Both sides equal and finite, f(a) missing or different: removable. Both sides finite but unequal: jump. Any side infinite: infinite. Sides fail to settle at all: oscillatory.
• YOUR TURN — Classify the discontinuity of f(x) = (x - 1) / |x - 1| at x = 1. Answer: from the left the ratio is -1, from the right it is 1 — both finite, unequal, so this is a jump discontinuity (and f(1) is undefined, but that is not what makes it a jump).
⚠ EXAM TRAP — A hole is not automatically removable: if the two sides approach DIFFERENT heights, the point is a jump even though the function is undefined there. Removable requires the two-sided limit to exist first. Read the sides before naming the type.

Algebra of Continuous Functions — What Stays Continuous
• DEFINITION — Continuity is preserved by algebra: sums, differences, products and constant multiples of continuous functions are continuous; quotients are continuous wherever the denominator is not 0; and compositions of continuous functions are continuous. Build any function from continuous bricks with these operations and it is continuous on its domain.
• DEFINITION — The standard bricks, continuous everywhere they are defined: all polynomials, sin x and cos x, the exponential e^x, |x| (continuous even at its corner at 0), constants; and on their natural domains: tan x, ln x, sqrt(x), 1/x.
• EXAMPLE — |x| at 0 is the concept-checker: LHL = 0, RHL = 0, |0| = 0 — continuous. The corner is sharp, but sharpness is about slopes, and slopes belong to the next chapter. Continuity only audits breaks, and there is no break.
• EXAMPLE — [x] is continuous at every non-integer point (it is locally constant there) and discontinuous at every integer. One function, both behaviours, sorted entirely by location — continuity is a point-by-point property, never a global personality.
• WORKED PATTERN — To prove continuity on a region, decompose: name the bricks, name the operations, note where denominators vanish. To disprove continuity at a point, one failed clause suffices — exhibit it.
• YOUR TURN — Is x [x] continuous at 0? Answer: surprisingly, yes. Just left of 0, [x] = -1, so x [x] = -x, tending to 0; just right, [x] = 0, so the product is 0; and the value at 0 is 0. All three clauses hold — multiplying by the vanishing factor x healed the jump.
⚠ EXAM TRAP — Do not overgeneralise the healing: a product of a discontinuous function with a continuous one can go either way ([x] jumps at 0, x [x] does not, 1/x [x] explodes). There is no product rule verdict — run the three clauses at the point in question.

Finding k — The Piecewise Continuity Pattern
• DEFINITION — The find-k pattern: a function is defined by different formulas on the two sides of a joint a, with a parameter k hiding in one formula. Continuity at the joint forces LHL = RHL = f(a), and that equation determines k. It is arguably the single most repeated calculus question in the IAT.
• WORKED PATTERN — The three-line drill: (1) f(a) comes from the piece that OWNS the point (the one with the equality sign in its condition). (2) LHL from the left piece, RHL from the right piece, using substitution or a technique if a piece gives 0/0. (3) Set them equal and solve for k. If two parameters appear, a second condition (continuity at a second joint, usually) provides the second equation.
• EXAMPLE — f(x) = kx + 1 for x at most 2, and 3x - 1 for x greater than 2. At the joint: f(2) = 2k + 1 from the owning piece; RHL = 3 x 2 - 1 = 5. Continuity: 2k + 1 = 5, so k = 2.
• EXAMPLE — The removable flavour: f(x) = (x^2 - 4)/(x - 2) for x not equal to 2, and f(2) = k. The limit at 2 is 4 (factor and cancel), so continuity forces k = 4. Here k is not inside a formula — k IS the value at the point, and it must equal the limit.
• YOUR TURN — Find a such that f(x) = (sin 2x)/x for x not equal to 0, with f(0) = a, is continuous at 0. Answer: the limit is 2 (sin 2x / (2x) x 2), so a = 2.
⚠ EXAM TRAP — The joint audit has a saboteur: using the wrong piece for f(a). If the point belongs to the right piece, f(a) comes from the right formula even while you compute the LHL from the left one. Mis-assigning ownership is the number-one find-k error — read the inequality signs before touching algebra.

Special Functions on Trial — |x|, [x], {x} and sin(1/x)
• DEFINITION — The modulus |x|: continuous at every point, including 0. Its derived sign function |x| / x (for x not 0) is the opposite story at 0: LHL -1, RHL 1, a jump. Same actor, two verdicts — the division by x is what breaks it.
• DEFINITION — The greatest integer function [x] (floor): at every integer it jumps by 1 — at 0, LHL = -1, RHL = 0, and [0] = 0, so [x] is right-continuous but not continuous at integers. Between integers it is constant, hence perfectly continuous.
• DEFINITION — The fractional part {x} = x - [x]: a sawtooth rising from 0 to (just under) 1 on every unit interval. At 0: just left of 0, {x} is close to 1 (for instance x = -0.01 has {x} = 0.99), so LHL = 1; just right, {x} = x itself, so RHL = 0 = {0}. A jump at every integer, mirror-imaged against [x].
• DEFINITION — sin(1/x) at 0: no limit at all — in every neighbourhood of 0 it attains every value in [-1, 1]. Consequently no choice of f(0) can make sin(1/x) continuous at 0. But multiply by x and the squeeze crushes it: x sin(1/x), with f(0) = 0 defined, IS continuous at 0 (Section 6). The pair sin(1/x) vs x sin(1/x) is the IAT's favourite contrast.
• WORKED PATTERN — For any greatest-integer or fractional-part question at an integer joint, translate before computing: just left of the integer n, [x] = n - 1 and {x} hovers just below 1; just right, [x] = n and {x} hovers just above 0. The entire analysis is these two sentences.
• YOUR TURN — Find the one-sided limits of {x} as x tends to 0 and give the verdict on the two-sided limit. Answer: LHL = 1, RHL = 0, so the two-sided limit does not exist.
⚠ EXAM TRAP — The reflexive errors: "[x] tends to 0 from the left at 0" (it tends to -1), and "{x} tends to 0 from the left" (it tends to 1). Sketch one sawtooth and one staircase near 0 in the margin of your rough sheet before answering any such question — five seconds of drawing beats a memorised table.

Formula Sheet — The Standard Limits Bank
✔ KEY FORMULA — Existence: the limit as x tends to a exists (finite) exactly when LHL = RHL; continuity at a needs the third clause, limit = f(a).
✔ KEY FORMULA — (x^n - a^n) / (x - a) tends to n a^(n - 1) as x tends to a. Companions: (x^n - 1) / (x - 1) tends to n, and a ratio of two power forms gives the ratio of the two n values.
✔ KEY FORMULA — sin x / x tends to 1 and tan x / x tends to 1 as x tends to 0, radians only. Scaled versions: sin(mx) / x tends to m; sin(mx) / sin(nx) tends to m / n.
✔ KEY FORMULA — (1 - cos x) / x^2 tends to 1/2 as x tends to 0, because 1 - cos x = 2 sin^2(x / 2).
✔ KEY FORMULA — (e^x - 1) / x tends to 1 and ln(1 + x) / x tends to 1 as x tends to 0; (a^x - 1) / x tends to ln a.
✔ KEY FORMULA — (1 + x)^(1/x) tends to e as x tends to 0; the 1^infinity master key: (1 + f)^g tends to e^(limit of f g) when f tends to 0 and g tends to infinity.
✔ KEY FORMULA — Rational functions at infinity: divide by the highest power; equal degrees give the ratio of leading coefficients; lower-degree numerator gives 0. And sqrt(x^2) = |x|, always.
✔ KEY FORMULA — One-sided landmarks: 1/x goes to +infinity from the right of 0 and -infinity from the left; e^(1/x) goes to 0 from the left and +infinity from the right; 1/x^2 goes to +infinity from both sides.
✔ KEY FORMULA — Squeeze: if p(x) is at most g(x), which is at most q(x), near a, and p and q both tend to L, then g tends to L. Bounded factor times vanishing factor tends to 0.
✔ KEY FORMULA — Continuity bricks: polynomials, sin, cos, e^x, |x| are continuous everywhere; sums, products, quotients (denominator nonzero) and compositions of continuous functions are continuous.
✔ KEY FORMULA — Find-k drill at a joint a: f(a) from the owning piece, LHL from the left piece, RHL from the right piece; set all three equal and solve.

Common Mistakes and Exam Traps
• Mistake 1: Substituting into a 0/0 form and answering 0 (or 1). Why it is wrong: 0/0 is indeterminate — (x^2 - 4)/(x - 2) gives 4 and sin x / x gives 1 under the same shape. Correct principle: 0/0 is an instruction to deploy a technique, never an answer.
• Mistake 2: Quoting sin 3x / x tends to 1. Why it is wrong: the bank contract needs the angle and the denominator to match; sin 3x / (3x) tends to 1, so sin 3x / x tends to 3. Correct principle: rescale deliberately — rewrite over the matching angle and carry the compensating factor outside.
• Mistake 3: Cancelling (x - a), then substituting a into the original expression and declaring the limit does not exist. Why it is wrong: the limit never evaluates the original at a; it evaluates the simplified form near a. Correct principle: after cancelling, the simplified function IS the limit problem.
• Mistake 4: Writing 1^infinity = 1. Why it is wrong: the base is not 1, it only tends to 1 while the exponent explodes — (1 + 3x)^(2/x) tends to e^6, not 1. Correct principle: run the master key, e raised to the limit of f times g.
• Mistake 5: Replacing sqrt(x^2) by x when x tends to minus infinity. Why it is wrong: sqrt(x^2) = |x| = -x for negative x, and the sign error inverts conclusions (the limit of sqrt(x^2 + 1) + x at minus infinity is 0, not 2|x| or infinity). Correct principle: roots of squares are moduli; write |x| first.
• Mistake 6: Reporting the limit of e^(1/x) at 0 as infinity. Why it is wrong: from the left the function tends to 0; a two-sided claim of infinity erases half the graph. Correct principle: split one-sided whenever 1/x or 1/(x - a) sits inside an exponential or a denominator.
• Mistake 7: Declaring continuity after checking only that the limit exists. Why it is wrong: (x^2 - 9)/(x - 3) at 3 has limit 6 but no value at 3 — discontinuous. Correct principle: the contract has three clauses; the limit must also equal f(a).
• Mistake 8: In find-k problems, computing f(a) from the wrong piece. Why it is wrong: the value at the joint belongs to the piece whose condition includes equality; using the other piece solves a different problem. Correct principle: identify the owning piece from the inequality signs before any algebra.
• Mistake 9: Giving the left-hand limit of [x] at 0 as 0. Why it is wrong: just left of 0 the numbers are small negatives, whose floor is -1. Correct principle: floor questions are answered from the staircase picture — left of an integer the floor is one step down.
• Mistake 10: Dividing numerator and denominator by x for a limit as x tends to 0, imitating the infinity technique. Why it is wrong: at 0, 1/x explodes rather than vanishes, so the move manufactures infinities; the divide-by-highest-power key opens only the infinity door. Correct principle: match the technique to the destination — factor/rationalise/standard-form at a finite point, highest-power division at infinity.

Worked Examples — Basic to Challenging
• Example 1 — Problem: Evaluate the limit as x tends to 2 of (x^2 - 4) / (x - 2).
• Given: A rational function; substitution produces 0/0.
• Principle: Factor out the hidden (x - a) factor, cancel it (legal because x is never 2 during the approach), then substitute.
• Steps: (x^2 - 4) / (x - 2) = (x - 2)(x + 2) / (x - 2) = x + 2 for x not equal to 2. As x tends to 2, x + 2 tends to 4.
• Answer: 4.
• Reasoning: The graph is the line y = x + 2 with a single hole at x = 2; the limit reads the line's height at the hole, which is 4.
• Mistake to avoid: Answering "does not exist because the function is undefined at 2" — undefined at the point, perfect limit beside it.
• Example 2 — Problem: Evaluate the limit as x tends to 0 of (sqrt(1 + x) - 1) / x.
• Given: A 0/0 form with a square root in the numerator.
• Principle: Rationalise with the conjugate sqrt(1 + x) + 1; the difference of squares deletes the root and exposes a factor of x.
• Steps: Multiply top and bottom by sqrt(1 + x) + 1. Numerator: (1 + x) - 1 = x. The expression becomes x / (x (sqrt(1 + x) + 1)) = 1 / (sqrt(1 + x) + 1). As x tends to 0 this tends to 1 / (1 + 1) = 1/2.
• Answer: 1/2.
• Reasoning: The conjugate turned a root difference into a plain x — whenever a root blocks a 0/0, the conjugate is the crowbar.
• Mistake to avoid: Squaring numerator and denominator separately "to remove the root" — that changes the function entirely. Conjugate multiplication multiplies by 1 in disguise; squaring does not.
• Example 3 — Problem: Evaluate the limit as x tends to 0 of sin 5x / sin 3x.
• Given: A 0/0 form mixing two sine scales.
• Principle: Standard-form reduction — express each sine over its own angle and let the bank result sin u / u tend to 1 twice.
• Steps: sin 5x / sin 3x = (sin 5x / (5x)) x ((3x) / sin 3x) x (5x / (3x)). The first bracket tends to 1, the second tends to 1, and 5x / (3x) = 5/3. Product: 5/3.
• Answer: 5/3.
• Reasoning: The angles' ratio survives the two bank applications — sin(mx) / sin(nx) tends to m / n in general, a pattern worth memorising outright.
• Mistake to avoid: Answering 1 by "cancelling the sine limits" — each sine tends to its bank value only after division by its own angle, and the rescaling leaves 5/3 behind.
• Example 4 — Problem: Evaluate the limit as x tends to 1 of (x^7 - 1) / (x^3 - 1).
• Given: A 0/0 form with two different powers over the same point.
• Principle: Divide numerator and denominator by (x - 1) conceptually: the expression is ((x^7 - 1) / (x - 1)) divided by ((x^3 - 1) / (x - 1)), and each bracket is the bank power form at a = 1.
• Steps: The numerator bracket tends to 7 x 1^6 = 7; the denominator bracket tends to 3 x 1^2 = 3. The ratio tends to 7/3.
• Answer: 7/3.
• Reasoning: A ratio of two standard forms collapses to the ratio of their n-values — the a = 1 case makes a^(n-1) invisible, which is why IAT setters love x tends to 1.
• Mistake to avoid: Expanding x^7 - 1 and x^3 - 1 and wrestling the polynomials — the bank result exists precisely to skip that labour.
• Example 5 — Problem: Evaluate the limit as x tends to infinity of (3x^2 + 2x) / (5x^2 - 1).
• Given: A rational function at infinity; naive substitution gives infinity / infinity.
• Principle: Divide numerator and denominator by the highest power, x^2, and let 1/x terms vanish.
• Steps: The expression becomes (3 + 2/x) / (5 - 1/x^2). As x tends to infinity, 2/x and 1/x^2 tend to 0, leaving 3/5.
• Answer: 3/5.
• Reasoning: Equal degrees on top and bottom, so the degree verdict predicts the ratio of leading coefficients 3/5 before any algebra — the computation merely confirms it.
• Mistake to avoid: Dividing by x only (the first power you see) — leftover x terms remain and the form stays indeterminate. The divisor is the HIGHEST power present.
• Example 6 — Problem: Evaluate the limit as x tends to 0 of (1 + 2x)^(3/x).
• Given: Base tends to 1, exponent tends to infinity — the 1^infinity indeterminate form.
• Principle: The master key: with f = 2x tending to 0 and g = 3/x tending to infinity, the limit is e raised to the limit of f g.
• Steps: f g = 2x x (3/x) = 6 for every x not equal to 0, so its limit is 6. Therefore the original limit is e^6.
• Answer: e^6 (approximately 403.4).
• Reasoning: The exponent's blow-up rate and the base's approach rate are perfectly balanced here — f g is constant — so the answer lands on a clean power of e.
• Mistake to avoid: Answering 1 ("the base is 1") or e^2 and e^3 (using only one of the two rates). Both rates enter through the product f g — that product is the question.
• Example 7 — Problem: f(x) = (x^2 - 9) / (x - 3) for x not equal to 3, and f(3) = k. Find k so that f is continuous at 3, and classify the discontinuity for any other k.
• Given: A removable-shape function with its point value left as a parameter.
• Principle: Continuity's three clauses; the limit comes from factorisation, and clause (3) forces k to equal it.
• Steps: (x^2 - 9) / (x - 3) = x + 3 for x not equal to 3, so the limit as x tends to 3 is 6. Clause (3): k must equal 6. For any other k the limit still exists but disagrees with f(3), so the discontinuity is removable (repaired exactly by k = 6).
• Answer: k = 6; for all other values of k the discontinuity at 3 is removable, never a jump or infinite type.
• Reasoning: The classification follows the limit's behaviour alone: a finite two-sided limit with a wrong or missing point value is the definition of removable — the type cannot change with k, only the continuity verdict can.
• Mistake to avoid: Calling it a jump because "the function is broken at 3" — jumps need the two sides to disagree, and here both sides approach 6 together.

Practice Questions — Self-Test Set
• Q1. Evaluate the limit as x tends to 0 of tan 2x / (3x).
• Q2. Evaluate the limit as x tends to 0 of (e^x - 1) / sin x.
• Q3. Evaluate the limit as x tends to infinity of (2x^2 - x) / (x^2 + 3).
• Q4. Evaluate the limit as x tends to 0 of (1 - cos x) / x^2.
• Q5. Evaluate the limit as x tends to 0 of (1 + 5x)^(1/x).
• Q6. Evaluate the limit as x tends to 4 of (sqrt(x) - 2) / (x - 4).
• Q7. Decide, with one-sided evidence, whether the limit of e^(1/x) as x tends to 0 exists.
• Q8. Find the value of a for which f(x) = (sin 2x) / x for x not equal to 0, with f(0) = a, is continuous at 0.

▸ Answer Key with Explanations
• A1. 2/3. Route: tan 2x / (3x) = (tan 2x / (2x)) x (2/3), and the bracket tends to 1. Misconception watch: answering 1 forgets the rescale factor 2/3; answering 2/3 via "tan tends to its angle" without the bracket is the right answer by a wrong road — write the bracket.
• A2. 1. Route: split as ((e^x - 1) / x) x (x / sin x); both factors tend to 1. Misconception watch: treating numerator and denominator as tending to "the same thing" and cancelling informally — the split into two bank pieces is what makes the 1 rigorous.
• A3. 2. Route: equal degrees, ratio of leading coefficients 2/1. Misconception watch: answering 2/1 = 2 is correct, but answering -1/3 comes from dividing by x instead of x^2 and chasing the wrong surviving terms — the divisor is the highest power.
• A4. 1/2. Route: 1 - cos x = 2 sin^2(x/2), so the expression is (1/2) x (sin(x/2) / (x/2))^2, tending to 1/2. Misconception watch: answering 0 because "the numerator tends to 0" — the denominator also tends to 0; 0/0 demands the bank, and the bank says 1/2.
• A5. e^5. Route: 1^infinity master key with f g = 5x x (1/x) = 5. Misconception watch: answering 1 (the base "is 1") or e (quoting (1 + x)^(1/x) without noticing the 5 inside) — the f g product carries the 5.
• A6. 1/4. Route: rationalise with sqrt(x) + 2, or quote the bank with n = 1/2, a = 4: (1/2) x 4^(-1/2) = 1/4. Misconception watch: answering 1/2 by keeping only the n and dropping a^(n - 1) — the bank result has two ingredients.
• A7. The limit does not exist. Evidence: from the left, 1/x tends to -infinity, so e^(1/x) tends to 0; from the right, 1/x tends to +infinity, so e^(1/x) tends to +infinity. Misconception watch: any single-value answer (0, 1, or infinity) has silently graded only one side of the graph.
• A8. a = 2. Route: the limit of (sin 2x)/x is 2 (rewrite as 2 x sin 2x / (2x)), and continuity forces f(0) to equal the limit. Misconception watch: answering a = 1 by pattern-matching sin x / x without rescaling for the doubled angle — the same trap as Q1, wearing continuity clothes.

Chapter Summary, Revision Checklist and Self-Assessment
• Summary: A limit is a two-sided prediction that ignores the point itself; it exists finitely exactly when the left-hand and right-hand limits agree. The algebra rules handle tame combinations, and every wild one is routed through a short list of doors: substitute, factor, rationalise, reduce to a standard form, substitute h = x - a, or squeeze.
• Summary: The standard bank — (x^n - a^n)/(x - a), sin x / x, tan x / x, (1 - cos x)/x^2, (e^x - 1)/x, ln(1 + x)/x, (a^x - 1)/x, and the e-parent (1 + x)^(1/x) — plus the 1^infinity master key e^(limit of f g), covers the computational core of the chapter. Limits at infinity fall to degree verdicts and highest-power division, with sqrt(x^2) = |x| guarding the negative direction.
• Summary: Continuity is the three-clause contract — defined, limit exists, limit equals value — and its failures sort into removable (repair by one point), jump (sides disagree), infinite (a side explodes) and oscillatory (sin(1/x)). The find-k pattern and the special-function trials of |x|, [x], {x} and sin(1/x) are the examiners' favourite hunting grounds.
• Revision checklist — I can run the existence audit: LHL, RHL, compare, and state the reason whenever a limit fails to exist.
• Revision checklist — I can quote all eight standard limits and tag which are NCERT core and which are IAT extensions.
• Revision checklist — I rescale angles automatically: sin(mx) over anything triggers the matching-angle rewrite before I compute.
• Revision checklist — I choose the technique by the shape: factor for polynomial 0/0, conjugate for roots, standard-form for bank lookalikes, squeeze for bounded factors, highest-power division at infinity.
• Revision checklist — I split one-sided for every 1/x, 1/(x - a), e^(1/x) and floor/fractional-part question, without being reminded.
• Revision checklist — I run the 1^infinity master key (limit of f times g in the exponent) instead of answering 1.
• Revision checklist — For continuity I audit all three clauses in order, and for find-k I identify the owning piece before writing equations.
• Revision checklist — I can classify any discontinuity as removable, jump, infinite or oscillatory from the LHL/RHL/f(a) evidence alone.
• Self-assessment: Score your practice set. 7-8 correct: exam-ready — the patterns are reflexes now; revisit in a week. 5-6: solid base; drill the sections behind your misses, especially any one-sided or find-k slips. 3-4: rebuild from the Formula Sheet, re-deriving each bank result once, then re-test. Below 3: restart from the existence audit in Section 1 and work forward slowly — limits reward patience now and speed later.
<!-- END math_ch_10 detailedStudyNotes -->
