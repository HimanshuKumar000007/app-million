<!-- BEGIN math_ch_9 detailedStudyNotes -->
Introduction — Patterns with a Memory
• A sequence is a list of numbers with a rule hiding inside it, and a series is what you get when you add the list up. Almost every IAT paper asks you to spot the rule, sum the list, or prove two quantities stand in a fixed order — and this chapter is the complete toolbox for all three jobs.
• DEFINITION — A sequence is an ordered list a_1, a_2, a_3, ... where each term a_n is fixed by a rule. A series is the sum of terms: S_n = a_1 + a_2 + ... + a_n is the sum of the first n terms, called the nth partial sum.
• WHY one chapter, five machines — arithmetic progressions add the same step, geometric progressions multiply by the same factor, harmonic progressions are APs standing on their heads, AGP is an AP riding on a GP, and telescoping series collapse from the inside. Learn to recognise which machine you are looking at and the sum is half done.
• EXAMPLE — The list 3, 7, 11, 15, ... adds 4 each time (an AP in disguise). The list 2, 6, 18, 54, ... multiplies by 3 (a GP). The list 1/2, 1/6, 1/12, 1/20, ... looks like neither — until you split each term as a difference, and the whole series folds up like a telescope. Three different reflexes, three different sums.
★ HIGHLIGHT — Before any formula, ask one question: what stays constant from term to term — the difference, the ratio, the reciprocals, or nothing at all? The constant you find names the method, and the method names the answer.

Sequences — nth Terms and Reading Patterns
• DEFINITION — The nth term a_n is the rule that manufactures the list: give it n and it hands back the term in position n. Two sequences can share their first few terms and still be different sequences, because the rule — not the opening terms — is the identity of the sequence.
• EXAMPLE — a_n = 2n - 1 manufactures the odd numbers 1, 3, 5, 7, ... while a_n = n^2 manufactures 1, 4, 9, 16, ... . The first three terms of both lists agree at 1 and then part ways at once: never trust a pattern from two terms.
• WORKED PATTERN — Reading a mystery list: compute the differences between neighbours. If the first differences are constant, it is an AP. If the differences themselves grow by a constant (second differences constant), the nth term is a quadratic in n. If the ratios are constant, it is a GP. This one diagnostic table settles most "find the nth term" questions.
• EXAMPLE — 3, 7, 13, 21, 31, ... has differences 4, 6, 8, 10 and second differences 2, 2, 2 — constant. So a_n is quadratic, and matching a_n = n^2 + n + 1: check n = 1 gives 3, n = 2 gives 7, n = 3 gives 13. The formula fits every term, not just the first.
⚠ EXAM TRAP — A pattern that fits the given terms is a guess, not a proof — 1, 2, 4 could continue 8 (doubling) or 7 (differences 1, 2, 3). Exam questions always hide enough structure (a named family, a sum formula, a recurrence) to pin the rule down. If your rule uses only the visible terms and ignores a stated condition, it is probably the wrong rule.
• YOUR TURN — The differences of a sequence are 5, 8, 11, 14 — what family is the sequence itself, and what is its nth-term shape? (Answer: the differences form an AP, so the second differences are constant 3, and a_n is a quadratic in n. Only the differences are arithmetic — the sequence itself is not an AP, and summing it needs the special-sums machinery later in this chapter.)

Arithmetic Progressions — nth Term and Properties
• DEFINITION — An arithmetic progression (AP) is a sequence where consecutive terms differ by a fixed number d, the common difference: a, a + d, a + 2d, a + 3d, ... . The nth term is a_n = a + (n - 1) d, where a is the first term.
• WHY (n - 1) and not n — to reach the nth term from the first, you climb exactly n - 1 steps: the first term itself has climbed zero steps. Every off-by-one error in this chapter is born from forgetting that the first term is already home.
✔ KEY FORMULA — a_n = a + (n - 1) d. Three quantities (a, d, n) fix the fourth; and a_m - a_n = (m - n) d, so two known terms hand you d immediately: d = (a_m - a_n) / (m - n).
• EXAMPLE — AP 5, 8, 11, ... has a = 5, d = 3. The 15th term: a_15 = 5 + 14 x 3 = 47. Going backwards is just as legal: if a_15 = 47 and d = 3, then a = 47 - 42 = 5.
• The equidistant property: terms equally far from the two ends add to the same total. In 5, 8, 11, ..., 47: a_2 + a_14 = 8 + 44 = 52, and a_1 + a_15 = 5 + 47 = 52. In symbols, a_k + a_(n+1-k) = a_1 + a_n for every k — this is the engine inside the sum formula.
• WORKED PATTERN — Three numbers in AP: never call them x, y, z. Call them a - d, a, a + d. Their sum collapses to 3a, so the middle number falls out instantly, and any product condition becomes a single equation in d. Numbers with sum 15 and product 80: middle a = 5, then 5(25 - d^2) = 80 gives d^2 = 9, d = 3 — the numbers are 2, 5, 8. Four numbers in AP use a - 3d, a - d, a + d, a + 3d (common difference 2d) so the sum collapses to 4a.
⚠ EXAM TRAP — d can be negative, zero, or fractional — an AP like 20, 17, 14, ... (d = -3) is falling, and the formulas do not care. Students who assume d is positive reject perfectly good answers. Also: the terms a, b, c are in AP exactly when 2b = a + c; the middle term is the average of its neighbours. If a question says b is the arithmetic mean of a and c, it is saying the same thing in words.
• YOUR TURN — In an AP, a_4 = 13 and a_9 = 33. Find d and the first term. (Answer: d = (33 - 13) / (9 - 4) = 4, and a = 13 - 3 x 4 = 1. The AP is 1, 5, 9, 13, ... — check a_9 = 1 + 8 x 4 = 33.)

▸ AP Sums and Arithmetic Means
✔ KEY FORMULA — S_n = (n/2)(2a + (n - 1) d) = (n/2)(a + a_n). Two dresses, one formula: use the second when you know the last term, the first when you know d. The (n/2)(a + a_n) shape says: average of first and last, times the number of terms — an AP sum is just an average dressed up.
• WHY the formula works — write the sum forwards and backwards and add: each of the n column pairs totals a + a_n (the equidistant property), so 2 S_n = n (a + a_n). Gauss reportedly did exactly this as a schoolboy for 1 + 2 + ... + 100 = 50 x 101 = 5050.
• EXAMPLE — For 5, 8, 11, ... the sum of 15 terms: S_15 = (15/2)(5 + 47) = 15 x 26 = 390. Cross-check with the other dress: (15/2)(2 x 5 + 14 x 3) = (15/2)(52) = 390. Same answer — always run the second version when the numbers are cheap; agreement is a free audit.
• DEFINITION — Arithmetic means: numbers A_1, A_2, ..., A_m inserted between a and b so that a, A_1, ..., A_m, b is an AP. The inserted block plus the ends makes m + 2 terms, so the common difference is d = (b - a) / (m + 1).
• EXAMPLE — Insert 4 arithmetic means between 3 and 38: d = (38 - 3) / 5 = 7, and the means are 10, 17, 24, 31. One mean alone is the familiar average: the single AM between a and b is (a + b) / 2.
⚠ EXAM TRAP — The divisor is m + 1, not m and not m + 2: inserting m means creates m + 1 equal jumps between a and b. A second trap: S_n counts TERMS, not the value of the last term — "sum of the first 20 multiples of 3" has n = 20 terms (3 to 60), and S_20 = 10 x (3 + 60) = 630.
• YOUR TURN — Find the sum of the first 20 terms of the AP with a = 2 and d = 5. (Answer: a_20 = 2 + 19 x 5 = 97, and S_20 = (20/2)(2 + 97) = 990.)

Geometric Progressions — nth Term and Sums
• DEFINITION — A geometric progression (GP) is a sequence where each term is the previous term times a fixed number r, the common ratio: a, ar, ar^2, ar^3, ... . The nth term is a_n = a r^(n - 1) — again n - 1, because the first term carries r to the power zero.
✔ KEY FORMULA — a_n = a r^(n - 1), and the finite sum S_n = a (r^n - 1) / (r - 1) when r is not 1. If r = 1 every term equals a and the sum is simply S_n = n a — the formula would divide by zero, which is the algebra's way of telling you this case lives elsewhere.
• WHY the sum formula works — write S_n, multiply the whole thing by r, and subtract: every middle term cancels against its twin, leaving only a r^n - a. That multiply-and-subtract trick is so powerful that this chapter uses it twice more (infinite GP and AGP) — learn it here as a move, not a formula.
• EXAMPLE — GP 3, 6, 12, ... (a = 3, r = 2): S_6 = 3 (2^6 - 1) / (2 - 1) = 3 x 63 = 189. Direct addition audits it: 3 + 6 + 12 + 24 + 48 + 96 = 189. And for 2, 6, 18, ... (r = 3): a_8 = 2 x 3^7 = 4374, S_8 = 2 (3^8 - 1) / 2 = 6560.
• The equidistant property has a GP twin: terms equally far from the ends multiply to the same product, a_k x a_(n+1-k) = a_1 x a_n. And three numbers in GP are written a/r, a, ar — their product collapses to a^3, so the middle term is the cube root of the product.
• WORKED PATTERN — Three numbers in GP have product 216 and sum 19. Write them a/r, a, ar: product gives a^3 = 216, so a = 6. Sum gives 6 (1/r + 1 + r) = 19, so r + 1/r = 13/6, and 6r^2 - 13r + 6 = 0 yields r = 3/2 or 2/3. The numbers are 4, 6, 9 (or the same list backwards — GP problems usually accept the set).
⚠ EXAM TRAP — The exponent off-by-one: a_n = a r^(n - 1), so the 8th term of a GP with r = 3 carries 3^7, not 3^8. A second trap: r can be negative (terms alternate in sign: 4, -2, 1, -1/2, ... has r = -1/2) or a fraction. If you extract r from two terms, use r = a_(n+1) / a_n with the actual signs attached — dropping a minus sign flips every later term.
• YOUR TURN — A GP has a = 5 and r = 3. Find a_6 and S_6. (Answer: a_6 = 5 x 3^5 = 1215, and S_6 = 5 (3^6 - 1) / 2 = 5 x 364 = 1820. Audit by addition if you like: 5 + 15 + 45 + 135 + 405 + 1215 = 1820.)

▸ Infinite GP — When a Sum Settles Down
• DEFINITION — If the ratio satisfies |r| < 1 (r strictly between -1 and 1), the terms shrink towards zero and the infinite sum settles at a finite value: S = a / (1 - r). If |r| is 1 or more, the terms do not die away and the infinite sum does not exist — the series diverges.
✔ KEY FORMULA — Infinite GP sum: S = a / (1 - r), valid only for |r| < 1. The condition is part of the formula. Quoting the value without checking the condition is the single most common infinite-series error.
• WHY it settles — in S_n = a (1 - r^n) / (1 - r), the factor r^n marches to zero when |r| < 1, so S_n marches to a / (1 - r). The partial sums do not jump to the limit; they creep towards it, each step closing a fixed fraction of the remaining gap.
• EXAMPLE — 12 + 4 + 4/3 + ... has r = 1/3, so S = 12 / (1 - 1/3) = 18. Watch the partial sums creep: 12, 16, 17.33, 17.78, 17.93 — always below 18, always closer. A shrinking GP is a promise the sum keeps approaching but the partial sums never overshoot here because every term is positive.
★ HIGHLIGHT — Figure 1 puts the three growth stories side by side. Left: AP terms climb in equal steps (a = 3, d = 4) — steady, linear, never in a hurry. Middle: GP terms with r = 2 double relentlessly — 2, 4, 8, ..., 256 — exponential growth outruns any AP eventually, whatever the AP's head start. Right: the partial sums of a dying GP (a = 16, r = 1/2) — 16, 24, 28, 30, 31, 31.5 — flattening against the limit 32. Same family tree, three utterly different futures; the value of r decides which story you are in.
• EXAMPLE — Repeating decimals are infinite GPs in costume: 0.333... = 3/10 + 3/100 + 3/1000 + ... with a = 3/10 and r = 1/10, giving (3/10) / (9/10) = 1/3. The costume comes off the same way every time: first chunk over one minus ratio.
⚠ EXAM TRAP — Two traps guard the gate. First: r = -1/2 is legal (|r| < 1) even though the terms alternate in sign — the sum still settles. Second: given a sum like S = 24 for a GP with r = 1/2, the first term is a = S (1 - r) = 12 — students routinely divide by r instead of multiplying by (1 - r). Write a = S (1 - r) on your formula sheet in exactly that direction.
• YOUR TURN — Find the infinite sum of 9 + 3 + 1 + 1/3 + ... and the first term if instead the ratio were 2/3 with the same infinite sum. (Answer: r = 1/3, so S = 9 / (2/3) = 27/2. For the second: a = S (1 - r) = (27/2)(1/3) = 9/2.)

Harmonic Progressions — Flip It into an AP
• DEFINITION — A harmonic progression (HP) is a sequence whose reciprocals form an AP. If a, b, c are in HP, then 1/a, 1/b, 1/c are in AP. There is no new machinery in this section at all — there is only a flip.
• WORKED PATTERN — Every HP question follows one protocol: (1) flip every term to its reciprocal, (2) solve the resulting AP question with AP tools, (3) flip the answer back. The nth term of an HP is 1 / (nth term of the flipped AP). Example: the HP 1/4, 1/7, 1/10, ... flips to the AP 4, 7, 10 (d = 3); its 8th AP term is 4 + 7 x 3 = 25, so the 8th HP term is 1/25.
• EXAMPLE — Which term of the HP 1/2, 1/5, 1/8, ... equals 1/29? Flip: AP 2, 5, 8, ... with d = 3. Solve 2 + (n - 1) x 3 = 29: n - 1 = 9, so n = 10 — the 10th term. Notice the question asked "which term", so the flipped equation is solved for n, not for a value.
• DEFINITION — The harmonic mean of two positive numbers a and b is H = 2ab / (a + b): the reciprocal of H is the arithmetic mean of the reciprocals of a and b. For 6 and 12: H = 2 x 6 x 12 / 18 = 8. Check the flip: (1/6 + 1/12) / 2 = 1/8, and 1/H = 1/8. Consistent.
⚠ EXAM TRAP — Say it loudly, because the exam tests it: there is NO sum formula for an HP. No S_n shortcut exists — anyone offering you one is selling the AP formula with the terms flipped, which is simply wrong: the sum of flipped-back terms is not the flip of the AP sum. HP questions ask for terms, means, and conditions (like "a, b, c in HP" means b = 2ac / (a + c)) — never for long sums. If a problem seems to demand an HP sum, you have misread it; it is probably an AP in disguise or a telescoping series.
• A second trap: a, b, c in HP does NOT mean b - a = c - b. The equal differences live one floor down, in the reciprocals: 1/b - 1/a = 1/c - 1/b. Students who subtract HP terms directly are doing AP arithmetic in an HP house.
• YOUR TURN — Find the 6th term of the HP 1/2, 1/5, 1/8, ... and the harmonic mean of 4 and 16. (Answers: flipped AP has a = 2, d = 3, so the 6th AP term is 2 + 5 x 3 = 17 and the 6th HP term is 1/17. HM of 4 and 16 = 2 x 4 x 16 / 20 = 6.4 — keep this pair in mind; it returns in the next section wearing all three means at once.)

AM, GM, HM — The Three Means and Their Order
• DEFINITION — For two positive numbers a and b: the arithmetic mean A = (a + b) / 2, the geometric mean G = sqrt(ab), and the harmonic mean H = 2ab / (a + b). They always stand in one fixed order: A >= G >= H, with equality in both places exactly when a = b.
✔ KEY FORMULA — A >= G >= H for positive numbers, and the three means are themselves in GP: G^2 = A x H. Check it on 4 and 16: A = 10, G = sqrt(64) = 8, H = 6.4 — order 10 >= 8 >= 6.4 respected, and 8^2 = 64 = 10 x 6.4. One check, both facts.
★ HIGHLIGHT — Figure 2 shows WHY the order can never break. Draw a semicircle on a diameter split into lengths 4 and 16. The radius is the AM, 10. The perpendicular raised at the split meets the circle at height sqrt(4 x 16) = 8 — the GM, drawn as a chord height, visibly shorter than the radius because only the diameter's midpoint reaches the full radius. And the HM, 6.4, sits below both. The inequality A >= G >= H is not a rule to memorise; it is a picture of a circle.
• WHY AM >= GM is the workhorse — rearranged, it says: for a fixed sum, the product is largest when the numbers are equal; for a fixed product, the sum is smallest when they are equal. Every "minimum value" question in this chapter is one of those two sentences wearing a costume.
• WORKED PATTERN — Minimum of x + 4/x for x > 0. By AM-GM, x + 4/x >= 2 sqrt(x x 4/x) = 2 sqrt(4) = 4. The bound is real only if equality can occur: equality needs x = 4/x, i.e. x = 2, which is allowed — so the minimum is genuinely 4, attained at x = 2. Never quote an AM-GM bound without checking the equality case is reachable; an unreachable bound is not a minimum, just a rumour.
• EXAMPLE — If a + b = 10 with a, b positive, the product ab is at most ((a + b) / 2)^2 = 25, reached at a = b = 5. Flip it: if ab = 36, the sum a + b is at least 2 sqrt(36) = 12, reached at a = b = 6. Same theorem, two directions — decide which quantity is fixed before choosing the sentence.
⚠ EXAM TRAP — AM-GM is a theorem about POSITIVE numbers. Apply it to x + 1/x with x negative and the "minimum 2" claim collapses — at x = -1 the value is -2, and the expression dives to minus infinity near zero from the left. If a problem does not state positivity, either the context forces it (lengths, counts, squares) or the AM-GM road is closed. Also note: sqrt(ab) as GM requires the same positivity.
• YOUR TURN — Find the minimum value of 2x + 8/x for x > 0, and where it occurs. (Answer: 2x + 8/x >= 2 sqrt(2x x 8/x) = 2 sqrt(16) = 8; equality when 2x = 8/x, i.e. x = 2. Minimum 8 at x = 2.)

▸ Inserting Means Between Two Numbers
• The three insertion recipes are one idea in three costumes: build the progression that starts at a, ends at b, and has exactly m stops between. For an AP the stops are evenly spaced in value; for a GP evenly spaced in ratio; for an HP evenly spaced after the flip.
✔ KEY FORMULA — Inserting m means between a and b: AP — common difference d = (b - a) / (m + 1). GP — common ratio r = (b/a)^(1/(m + 1)). HP — insert m AMs between 1/a and 1/b, then flip each result back.
• EXAMPLE — Three geometric means between 2 and 162: the full GP is 2, G_1, G_2, G_3, 162, five terms, so r^4 = 162 / 2 = 81 and r = 3. The means are 6, 18, 54. Two harmonic means between 2 and 4: flip to 1/2 and 1/4, insert two AMs with d = (1/4 - 1/2) / 3 = -1/12, giving the AP 1/2, 5/12, 1/3, 1/4 — flip back: the harmonic means are 12/5 = 2.4 and 3.
⚠ EXAM TRAP — The exponent in the GP recipe is 1 / (m + 1), not 1/m: inserting 3 means creates 4 ratio-steps, so r is the 4th root of b/a. And for even roots, r could in principle be negative as well (r = -3 also satisfies r^4 = 81) — NCERT-style questions silently assume positive terms unless stated; if the problem allows negatives, both families of means exist and the question should say which it wants. Read the room.
• YOUR TURN — Insert two geometric means between 4 and 108. (Answer: r^3 = 108 / 4 = 27, so r = 3, and the means are 12 and 36. The full list 4, 12, 36, 108 has ratio 3 throughout — audit passed.)

AGP — The Multiply-and-Subtract Machine
• DEFINITION — An arithmetico-geometric progression (AGP) has terms built as (AP term) x (GP term): a, (a + d) r, (a + 2d) r^2, (a + 3d) r^3, ... . It is the IAT's favourite series because it looks unclassifiable until you know the one move that cracks it.
• WORKED PATTERN — The method: write S, multiply the whole sum by r, shift the product one place right, and subtract. The AP parts line up and mostly cancel; what survives is a constant piece, a plain GP, and one leftover tail term. In symbols, for S = a + (a + d) r + (a + 2d) r^2 + ... + (a + (n - 1) d) r^(n - 1), subtracting rS from S gives (1 - r) S = a + d (r + r^2 + ... + r^(n - 1)) - (a + (n - 1) d) r^n — the middle is now an ordinary GP sum. The two dangers are the endpoints: the opening a and the tail term are the only pieces that do not pair off.
• EXAMPLE — S = 1 + 2 x 3 + 3 x 3^2 + 4 x 3^3 (four terms; AP part 1, 2, 3, 4 on GP ratio 3). Direct value: 1 + 6 + 27 + 108 = 142. Now the machine: 3S = 3 + 2 x 3^2 + 3 x 3^3 + 4 x 3^4; subtracting, S - 3S = 1 + (2 - 1) x 3 + (3 - 2) x 3^2 + (4 - 3) x 3^3 - 4 x 3^4 = 1 + 3 + 9 + 27 - 324 = -284, so -2S = -284 and S = 142. Machine agrees with brute force — that agreement is the method's signature.
★ HIGHLIGHT — For an infinite AGP with |r| < 1 the tail term dies (r^n goes to 0 while the AP factor grows only linearly), and the machine leaves the jewel: the sum of k r^(k - 1) over all k is 1 / (1 - r)^2. So 1 + 2r + 3r^2 + 4r^3 + ... = 1 / (1 - r)^2. At r = 1/2 this gives 4; at r = 1/3 it gives 9/4. IAT asks exactly these two values in rotation — recognise the costume and the question is already answered.
• EXAMPLE — Sum to infinity of 1 + 2/3 + 3/9 + 4/27 + ... : term k is k x (1/3)^(k - 1), the jewel shape with r = 1/3, so the sum is 1 / (1 - 1/3)^2 = 1 / (4/9) = 9/4. Partial sums audit the claim: 1, 5/3 = 1.67, 2, 58/27 = 2.15, ... creeping up on 2.25 from below.
⚠ EXAM TRAP — The multiply-and-subtract alignment is where marks bleed: the shifted rS must start one position later, so the subtraction pairs (a + (k+1) d) r^k with (a + kd) r^k. Rush the shift and every coefficient is off by one d. Second trap: quoting 1 / (1 - r)^2 when the first term is not 1 or the AP part does not start at 1 — the jewel fits sum of k r^(k-1) exactly; an AGP like 2 + 5r + 8r^2 + ... (AP part 2, 5, 8) needs the full machine, not the jewel.
• YOUR TURN — Sum to infinity of 1 + 3/4 + 5/16 + 7/64 + ... , where the numerators are the odd numbers and the denominators are powers of 4. (Answer: term k is (2k - 1) x (1/4)^(k - 1) — an AGP with a = 1, d = 2, r = 1/4. The machine: (1 - 1/4) S = 1 + 2 (1/4) / (1 - 1/4) = 1 + 2/3 = 5/3, so S = (5/3) / (3/4) = 20/9.)

Special Sums — Sum of k, k^2 and k^3
• Some series are neither AP nor GP but surrender to three memorised blocks. If you can sum the powers, you can sum any polynomial in k by splitting it into powers — this section is the engine room for half the "series" questions ever set.
✔ KEY FORMULA — Sum of k from 1 to n = n(n + 1)/2. Sum of k^2 = n(n + 1)(2n + 1)/6. Sum of k^3 = (n(n + 1)/2)^2 — the cubes sum to the SQUARE of the triangular sum, the prettiest identity in the chapter: 1 + 8 + 27 + 64 + 125 = 225 = 15^2.
• EXAMPLE — First audit the blocks at n = 10: sum of k = 55, sum of k^2 = 10 x 11 x 21/6 = 385, sum of k^3 = 55^2 = 3025. Then any blend is arithmetic: the sum of (k^2 + 1) for k = 1 to 10 is 385 + 10 = 395 — the +1 contributes once per term, ten times.
• WORKED PATTERN — Sum of the first n odd numbers: the kth odd number is 2k - 1, so the sum is 2 x (n(n + 1)/2) - n = n(n + 1) - n = n^2. First 10 odds sum to 100 — a perfect square, and the picture (an L-shaped border added to a square each time) is why. Whenever a series is a polynomial in k, split it into the three blocks and let the formulas carry the weight; never expand term by term beyond a sanity check.
⚠ EXAM TRAP — The blocks start at k = 1. A sum from k = 5 to n is (sum to n) minus (sum to 4) — students who plug 5 into the closed forms as if the sum started there lose everything. And watch the k^2 coefficient: it is (2n + 1), not (2n - 1); at n = 1 the block must return 1, and n(n + 1)(2n + 1)/6 gives 1 x 2 x 3/6 = 1. That one-second audit catches the misquote.
• YOUR TURN — Evaluate the sum of (3k^2 - 2k) for k = 1 to 5. (Answer: 3 x 55 - 2 x 15 = 165 - 30 = 135. Audit by hand: terms are 1, 8, 21, 40, 65 — total 135.)

Telescoping Series — The Method of Differences
• DEFINITION — A telescoping series is one whose general term can be written as a difference f(k) - f(k + 1) of consecutive values of one function. When the terms are laid out, each -f(k + 1) is murdered by the +f(k + 1) of the next term, and the whole sum collapses to f(1) - f(n + 1): only the first head and the last tail survive.
✔ KEY FORMULA — 1 / (k(k + 1)) = 1/k - 1/(k + 1). Sum over k = 1 to n: 1 - 1/(n + 1) = n/(n + 1). The poster child of the method — memorise its shape, because a dozen costumes hang on it.
★ HIGHLIGHT — Figure 3 draws the collapse for the first four terms: (1 - 1/2) + (1/2 - 1/3) + (1/3 - 1/4) + (1/4 - 1/5). The -1/2 cancels the +1/2, the -1/3 cancels the +1/3, the -1/4 cancels the +1/4 — the middle dies in pairs, and the boxed survivors 1 and -1/5 give S_4 = 4/5. Every telescoping sum on Earth is this picture with a different f.
• WORKED PATTERN — Widen the gap: 1 / (k(k + 2)) = (1/2)(1/k - 1/(k + 2)). Now each negative term cancels the positive term TWO rows later, so TWO heads and TWO tails survive: the sum to n is (1/2)(1 + 1/2 - 1/(n + 1) - 1/(n + 2)). At n = 3: (1/2)(3/2 - 1/4 - 1/5) = 21/40, and direct addition audits it: 1/3 + 1/8 + 1/15 = 21/40. The gap width tells you how many survivors to expect — that is the whole generalisation.
• EXAMPLE — Rationalising is telescoping in a mask: 1 / (sqrt(k) + sqrt(k + 1)) = sqrt(k + 1) - sqrt(k) after multiplying top and bottom by the conjugate. So the sum from k = 1 to 8 is sqrt(9) - sqrt(1) = 3 - 1 = 2 — eight ugly fractions, one clean integer. When a series has consecutive-index roots or factorials in the denominator, reach for the difference form before reaching for anything else.
⚠ EXAM TRAP — The split has a MINUS in it: 1/(k(k+1)) = 1/k MINUS 1/(k + 1). Writing a plus is the classic slip, and it is detectably wrong at k = 1: 1/2 cannot equal 1 + 1/2. Always test your split on the first term. Second trap: with gap 2, students still cancel only one head and one tail — count the survivors from the gap, every time.
• YOUR TURN — Find the sum of the first 99 terms of 1/(1 x 2) + 1/(2 x 3) + 1/(3 x 4) + ... . (Answer: n/(n + 1) with n = 99 gives 99/100. The infinite sum would be exactly 1 — the partial sums creep up on it just like a GP decay.)

▸ Mixed Patterns — Splitting a Series Apart
• Real exam series are often two friends walking together: a term like a_n = n^2 + 2^n is a polynomial part plus a GP part. The reflex: sum each part with its own machine and add the results. Linearity of summation is the licence — a sum of sums is the sum of the pieces.
• EXAMPLE — Sum of the first 5 terms of a_n = n^2 + 2^n: polynomial part sums to 1 + 4 + 9 + 16 + 25 = 55, GP part sums to 2 + 4 + 8 + 16 + 32 = 62, total 117. No new formula was needed — two old ones shook hands.
• WORKED PATTERN — Differences that double: 2, 5, 11, 23, 47, ... has differences 3, 6, 12, 24 — a GP hiding underneath. Rebuild: a_n = 3 x 2^(n - 1) - 1 (check: n = 1 gives 2, n = 3 gives 11). Sum to 5 terms: 3(2^5 - 1) - 5 = 93 - 5 = 88, audited by raw addition 2 + 5 + 11 + 23 + 47 = 88. When first differences form a GP, the sequence is (GP) plus (constant) — split it exactly that way.
⚠ EXAM TRAP — Do not force mixed series into single-family formulas. a_n = n^2 + 2^n is not an AP (differences 3, 7, 15, 31 are not constant) and not a GP (ratios drift). The tell is in the diagnostic: run differences AND ratios; if neither is constant, suspect a split or a second-difference pattern, and decompose before you compute.
• YOUR TURN — Find the sum of the first 6 terms of the series with a_n = n + 3^n. (Answer: sum of n to 6 is 21; sum of 3^n for n = 1 to 6 is 3(3^6 - 1)/(3 - 1) = 1092; total 1113.)

From S_n Back to a_n — The Difference Trap
• DEFINITION — If S_n is the sum of the first n terms, then each term is recoverable as a_n = S_n - S_(n - 1): the last term added is the difference between the sum including it and the sum before it. This is true by definition — for n >= 2. The first term plays by its own rule: a_1 = S_1.
✔ KEY FORMULA — a_n = S_n - S_(n - 1) for n >= 2, and a_1 = S_1 checked separately. Two cases, always. The formula's fine print is not decoration; it is where the marks live.
• EXAMPLE — Clean case: S_n = 3n^2 + 2n. Then a_n = (3n^2 + 2n) - (3(n - 1)^2 + 2(n - 1)) = 6n - 1, and a_1 = S_1 = 5 matches 6 x 1 - 1 = 5. Why does the formula survive n = 1 here? Because S_n has no constant term — S_0 would be 0, so the difference formula accidentally stays honest. Enjoy it, but never rely on the accident.
★ HIGHLIGHT — The trap case: S_n = n^2 + 3. Blindly applying the difference at every n gives a_n = 2n - 1, claiming a_1 = 1. But a_1 = S_1 = 4. The truth: a_1 = 4, and a_n = 2n - 1 only for n >= 2 (check a_2 = S_2 - S_1 = 7 - 4 = 3 = 2 x 2 - 1). The constant +3 in S_n belongs to NO term — it is a bookkeeping ghost, and the difference formula at n = 1 sweeps it into a_1's chair where it does not belong. Any constant term in S_n is a siren: split a_1 out by hand.
⚠ EXAM TRAP — Options in S_n questions are built from this exact slip: the value of the difference formula at n = 1 sits there as the most attractive wrong answer. The defence costs three seconds: whatever formula you derive for a_n, test it against a_1 = S_1 and a_2 = S_2 - S_1 before trusting it anywhere else.
• YOUR TURN — If S_n = 5n^2 - 3n, find a_1 and a_n, and state whether the difference formula is safe at n = 1. (Answer: a_1 = S_1 = 2. For n >= 2, a_n = 10n - 8; at n = 1 it gives 2 — safe this time, because S_n has no constant term. Verdict: safe, but only after the check, never before it.)

Formula Sheet — Every Result on One Screen
✔ AP: a_n = a + (n - 1) d; S_n = (n/2)(2a + (n - 1) d) = (n/2)(a + a_n). Equidistant terms: a_k + a_(n+1-k) = a_1 + a_n.
✔ Three in AP: a - d, a, a + d. Inserting m AMs between a and b: d = (b - a) / (m + 1); single AM = (a + b) / 2.
✔ GP: a_n = a r^(n - 1); S_n = a (r^n - 1) / (r - 1) for r not 1; S_n = n a if r = 1. Equidistant terms multiply to a_1 x a_n.
✔ Infinite GP, only when |r| < 1: S = a / (1 - r). Three in GP: a/r, a, ar. Inserting m GMs: r = (b/a)^(1/(m + 1)).
✔ HP: reciprocals form an AP — flip, solve, flip back. a, b, c in HP exactly when b = 2ac / (a + c). There is NO HP sum formula.
✔ Means: A = (a + b)/2, G = sqrt(ab), H = 2ab / (a + b); A >= G >= H with equality only at a = b; also G^2 = A x H.
✔ AGP: multiply S by r, shift, subtract — (1 - r) S = a + d (r + r^2 + ... + r^(n - 1)) - (a + (n - 1) d) r^n. Jewel: sum of k r^(k - 1) to infinity = 1 / (1 - r)^2.
✔ Power sums: sum of k = n(n + 1)/2; sum of k^2 = n(n + 1)(2n + 1)/6; sum of k^3 = (n(n + 1)/2)^2.
✔ Telescoping: if a_k = f(k) - f(k + 1), the sum to n is f(1) - f(n + 1). Poster child: 1/(k(k + 1)) = 1/k - 1/(k + 1), sum = n/(n + 1). Gap g leaves g heads and g tails.
✔ From sums to terms: a_n = S_n - S_(n - 1) for n >= 2; a_1 = S_1 separately. A constant term in S_n is the warning flag.

Common Mistakes and Exam Traps
• Mistake 1: Using a_n = S_n - S_(n - 1) at n = 1 without checking. Why it is wrong: if S_n carries a constant term, the formula at n = 1 misassigns it — with S_n = n^2 + 3 it claims a_1 = 1 when a_1 = S_1 = 4. Correct principle: a_1 = S_1 always; the difference formula is licensed for n >= 2, and any derived a_n must pass the a_1 and a_2 audits.
• Mistake 2: Quoting S = a / (1 - r) when |r| is 1 or more. "Sum to infinity of 3 + 6 + 12 + ... is 3 / (1 - 2) = -3" — why it is wrong: the terms grow, the partial sums run away, and a negative total for positive terms exposes the nonsense. Correct principle: the infinite sum exists only for |r| < 1; otherwise the series diverges and the correct answer is "does not exist".
• Mistake 3: Doing AP arithmetic inside an HP. "In the HP 1/2, 1/5, 1/8, the next term subtracts 3/40..." — why it is wrong: HP terms have no common difference; the equal steps live in the reciprocals 2, 5, 8. Correct principle: flip to the AP, work there, flip back — and remember no HP sum formula exists at all.
• Mistake 4: Applying AM-GM to numbers that are not positive. "The minimum of x + 1/x is 2" — why it is wrong as stated: for x < 0 the expression is at most -2 and unbounded below near zero. Correct principle: AM-GM needs positive quantities, and the equality case must be reachable; state both checks before claiming a minimum.
• Mistake 5: AGP subtraction without the shift. Why it is wrong: multiplying S by r but aligning the terms in the same positions pairs each AP coefficient with itself, cancelling nothing useful and losing the tail term entirely. Correct principle: rS starts one slot later; the subtraction pairs neighbours, leaves one head, one GP strip, and exactly one tail term with the FULL last AP coefficient.
• Mistake 6: Feeding r = 1 into the GP sum formula. Why it is wrong: it divides by (r - 1) = 0. A GP with r = 1 is constant, and its sum is n a. Correct principle: r = 1 is a separate case with its own trivial formula — check r before choosing the weapon.
• Mistake 7: Declaring a sequence an AP or GP from two terms. "1, 2, 4, ... is a GP, so the sum formula gives..." — why it is wrong: the same opening fits differences 1, 2, 3 (next term 7) and infinitely many other rules. Correct principle: a family claim needs the defining evidence — constant differences across all given terms, constant ratios, or a stated rule; use every term you are given.
• Mistake 8: Splitting a telescoping term with a plus sign. "1/(k(k + 1)) = 1/k + 1/(k + 1)" — why it is wrong: at k = 1 it claims 1/2 = 3/2. Correct principle: it is a DIFFERENCE, 1/k - 1/(k + 1); test any split on the first term before summing a hundred of them.
• Mistake 9: Swapping a_n and S_n. "The nth term is 3n^2 + 2n, so a_5 = 85" — why it is wrong: 3n^2 + 2n was given as the SUM formula; the term is a_5 = S_5 - S_4 = 85 - 56 = 29 (and indeed 6 x 5 - 1 = 29). Correct principle: the letter S is load-bearing; a sum formula must be differenced before it answers term questions.
• Mistake 10: Off-by-one exponents and counts. "The 8th term of a GP with r = 3 is a x 3^8" and "inserting 3 GMs needs the cube root of b/a" — why they are wrong: the first term already holds r^0, so term 8 holds r^7; inserting 3 means makes 4 ratio-steps, so r is the 4th root. Correct principle: count the STEPS, not the terms — steps are always one less than the positions spanned.

Worked Examples — Basic to Challenging
• Example 1 — Problem: In an AP, the 5th term is 19 and the 9th term is 35. Find the first term, the common difference, and the sum of the first 20 terms.
• Given: a_5 = 19, a_9 = 35; a and d unknown.
• Principle: Two terms give d directly: d = (a_9 - a_5) / (9 - 5); then a falls out of either term, and S_n finishes the job.
• Steps: d = (35 - 19) / 4 = 4. From a_5: a + 4d = 19, so a = 19 - 16 = 3. Then S_20 = (20/2)(2 x 3 + 19 x 4) = 10 x 82.
• Answer: a = 3, d = 4, S_20 = 820.
• Reasoning: The gap between the 5th and 9th terms is exactly 4 steps of d — dividing the value gap by the position gap is the fastest route to d in any two-term AP problem.
• Mistake: Dividing (35 - 19) by (9 - 5 + 1) or by 9 - 5 counted wrongly as 5 steps — positions 5 to 9 span 4 jumps; count jumps, not fenceposts.
• Example 2 — Problem: Three numbers in AP have sum 21 and product 231. Find them.
• Given: Three terms in AP; sum and product conditions.
• Principle: The a - d, a, a + d parametrisation: the sum kills d, the product then yields d alone.
• Steps: Sum: 3a = 21, so a = 7. Product: a (a^2 - d^2) = 231, so 7 (49 - d^2) = 231, giving 49 - d^2 = 33 and d^2 = 16, d = 4. Terms: 7 - 4, 7, 7 + 4.
• Answer: 3, 7, 11.
• Reasoning: The symmetric parametrisation turned two conditions into a one-line chain — sum first (linear in a), product second (quadratic in d, with a already known). Check the audit: 3 + 7 + 11 = 21 and 3 x 7 x 11 = 231.
• Mistake: Naming the terms x, y, z and drowning in three unknowns; or forgetting d = -4 gives the same set reversed — harmless here, fatal when the question asks for the largest term specifically.
• Example 3 — Problem: Three numbers in GP have product 216 and sum 19. Find them.
• Given: Three terms in GP; product and sum conditions.
• Principle: The a/r, a, ar parametrisation: the product collapses to a^3.
• Steps: Product: a^3 = 216, so a = 6. Sum: 6 (1/r + 1 + r) = 19, so r + 1/r = 13/6. Multiply by 6r: 6r^2 - 13r + 6 = 0, factorising as (3r - 2)(2r - 3) = 0, so r = 2/3 or 3/2. With r = 3/2: terms 4, 6, 9.
• Answer: 4, 6, 9 (r = 3/2; r = 2/3 returns the same list in reverse).
• Reasoning: Product conditions in a GP are gifts — the symmetric form makes the middle term pop out as a pure root before the ratio is even mentioned.
• Mistake: Writing the terms as a, ar, ar^2 forces a cubic in two unknowns; and reporting only r = 3/2 while claiming uniqueness — both roots are valid, they describe the same set read in opposite directions.
• Example 4 — Problem: Sum to infinity: 1 + 2 x (1/2) + 3 x (1/4) + 4 x (1/8) + ... .
• Given: Term k is k x (1/2)^(k - 1): AP part 1, 2, 3, 4, ..., GP part ratio 1/2. An AGP.
• Principle: Multiply by r and subtract; or invoke the jewel: sum of k r^(k - 1) = 1 / (1 - r)^2 for |r| < 1.
• Steps: S - (1/2) S collects the surviving strip: 1 + 1/2 + 1/4 + 1/8 + ... = 1 / (1 - 1/2) = 2. So (1/2) S = 2.
• Answer: S = 4.
• Reasoning: The machine strips the AGP down to a plain infinite GP; the jewel formula compresses the same two steps into one line — 1 / (1 - 1/2)^2 = 4 — and partial sums (1, 2, 2.75, 3.25, ...) confirm the approach to 4.
• Mistake: Truncating after a few terms and calling it the sum; or applying 1 / (1 - r)^2 to an AGP whose AP part starts at 2 or steps by 2 — the jewel fits ONLY the exact shape sum of k r^(k - 1).
• Example 5 — Problem: Find the sum of the series 1 x 2 + 2 x 3 + 3 x 4 + ... for the first 10 terms.
• Given: General term k(k + 1) = k^2 + k, summed for k = 1 to 10.
• Principle: Split into power sums: sum of k^2 plus sum of k, each a memorised block.
• Steps: Sum of k^2 to 10 = 10 x 11 x 21 / 6 = 385. Sum of k to 10 = 55. Add: 385 + 55.
• Answer: 440. (In general the sum to n is n(n + 1)(n + 2)/3 — spot it from 385 + 55 = 440 = 10 x 11 x 12 / 3.)
• Reasoning: Products in the general term expand into powers, and powers are blocks. The general shape n(n + 1)(n + 2)/3 is worth recognising on sight — it is the k(k + 1) signature.
• Mistake: Summing it as a GP or AP (it is neither — ratios and differences both drift), or using the k^2 block with (2n - 1) instead of (2n + 1) and landing on 350.
• Example 6 — Problem: Evaluate the sum of 1 / (sqrt(k) + sqrt(k + 1)) for k = 1 to 8.
• Given: Eight terms with consecutive roots in each denominator.
• Principle: Rationalise each term: it equals sqrt(k + 1) - sqrt(k), a difference of consecutive values — telescoping.
• Steps: The sum becomes (sqrt(2) - sqrt(1)) + (sqrt(3) - sqrt(2)) + ... + (sqrt(9) - sqrt(8)). Every interior root cancels; survivors are -sqrt(1) and +sqrt(9).
• Answer: sqrt(9) - sqrt(1) = 3 - 1 = 2.
• Reasoning: After rationalisation the series is the telescoping picture with f(k) = sqrt(k): heads and tails only. Eight irrational terms summing to a whole number is the method's party trick.
• Mistake: Adding decimal approximations term by term (slow and error-prone), or rationalising with the wrong conjugate sign and producing a sum of roots instead of a difference.
• Example 7 — Problem: The sum of the first n terms of a sequence is S_n = n^2 + 3. Find a_1 and a_n.
• Given: S_n = n^2 + 3 — note the constant term, the siren from the theory section.
• Principle: a_1 = S_1 by hand; the difference formula only for n >= 2.
• Steps: a_1 = S_1 = 1 + 3 = 4. For n >= 2: a_n = (n^2 + 3) - ((n - 1)^2 + 3) = 2n - 1. Audit: a_2 = S_2 - S_1 = 7 - 4 = 3 = 2 x 2 - 1, and a_5 = 28 - 19 = 9 = 2 x 5 - 1.
• Answer: a_1 = 4; a_n = 2n - 1 for n >= 2 (the sequence runs 4, 3, 5, 7, 9, ...).
• Reasoning: The formula 2n - 1 describes every term from the second onward; the first term carries the ghost constant and must be lifted out of S_1 directly. The sequence is not even an AP — its first gap is -1, the rest are +2.
• Mistake: Answering a_n = 2n - 1 for all n, which reports a_1 = 1 — the single most planted trap answer in this entire chapter.

Practice Questions — Self-Test Set
• Q1. Find the 10th term of the AP 4, 9, 14, 19, ... .
• Q2. Find the sum of the first 15 terms of the AP with first term 2 and common difference 3.
• Q3. Find the 7th term of the GP 3, 6, 12, 24, ... .
• Q4. Find the sum to infinity of the GP 9 + 3 + 1 + 1/3 + ... .
• Q5. Find the 6th term of the HP 1/2, 1/5, 1/8, ... .
• Q6. Insert two geometric means between 4 and 108.
• Q7. Find the sum of the first 12 terms of 1/(1 x 2) + 1/(2 x 3) + 1/(3 x 4) + ... .
• Q8. For x > 0, find the minimum value of x + 9/x, and the value of x where it occurs.

▸ Answer Key with Explanations
• A1 — 49. a_10 = 4 + 9 x 5 = 49. Misconception caught: using 10 gaps instead of 9 — the 10th term stands 9 steps from the 1st.
• A2 — 345. S_15 = (15/2)(2 x 2 + 14 x 3) = (15/2)(46) = 345. Misconception caught: inventing a_15 = 2 + 15 x 3 = 47 (fifteen steps instead of fourteen) gives (15/2)(2 + 47) = 367.5 — a non-integer sum of integers, which should have rung the alarm.
• A3 — 192. a_7 = 3 x 2^6 = 192. Misconception caught: 3 x 2^7 = 384 doubles once too often — the 7th term carries r^6.
• A4 — 27/2. r = 1/3, and |r| < 1, so S = 9 / (1 - 1/3) = 27/2. Misconception caught: writing 9 / (1 - 3) or skipping the |r| check — here the condition holds, but the check is the habit that saves you when it does not.
• A5 — 1/17. Flip to the AP 2, 5, 8 (d = 3): the 6th AP term is 2 + 5 x 3 = 17, so the 6th HP term is 1/17. Misconception caught: hunting for a common difference among 1/2, 1/5, 1/8 themselves — there is none worth the name; the AP lives in the reciprocals.
• A6 — 12 and 36. Two means make three ratio-steps: r^3 = 108 / 4 = 27, so r = 3; the list is 4, 12, 36, 108. Misconception caught: taking the square root (two means, two steps) — the steps always outnumber the inserted means by one.
• A7 — 12/13. The terms are 1/(k(k + 1)), telescoping to n/(n + 1); at n = 12 the sum is 12/13. Misconception caught: computing S = 1 - 1/12 = 11/12 — the surviving tail is 1/(n + 1), not 1/n.
• A8 — Minimum 6 at x = 3. AM-GM: x + 9/x >= 2 sqrt(9) = 6, with equality when x = 9/x, i.e. x = 3 (positive, so reachable). Misconception caught: quoting the bound 6 without the equality audit — a bound that equality cannot reach is not a minimum.

Chapter Summary and Revision Checklist
• Summary — A sequence is named by what stays constant. Constant difference: AP, with a_n = a + (n - 1) d and sums that average the ends. Constant ratio: GP, with a_n = a r^(n - 1), finite sums by multiply-and-subtract, and an infinite sum a / (1 - r) that exists only when |r| < 1. Constant reciprocal-difference: HP, solved entirely by flipping into an AP, with no sum formula at all. The three means obey A >= G >= H, and AM-GM converts fixed sums into product bounds and back. AGP falls to the multiply-shift-subtract machine (with the jewel 1 / (1 - r)^2 for sum of k r^(k - 1)); polynomial series split into the three power blocks; difference-shaped terms telescope to their heads and tails; and any S_n hands back its terms by differencing — with a_1 always audited separately.
• Revision checklist — I classify a new series in seconds: differences, ratios, reciprocals — one of them is constant, or it splits.
• Revision checklist — I count steps, not fenceposts: term n holds (n - 1) steps, and inserting m means makes m + 1 steps.
• Revision checklist — I check |r| < 1 out loud before writing any infinite-GP or AGP-to-infinity answer.
• Revision checklist — I never quote an AM-GM bound without verifying the equality case is reachable and the quantities are positive.
• Revision checklist — In AGP I write S, then rS shifted one slot, then subtract — and I can point at the surviving head, GP strip, and tail.
• Revision checklist — I test every telescoping split on its first term and count survivors from the gap width.
• Revision checklist — Given any S_n, I produce a_1 from S_1 and a_n from the difference, and I audit the formula at n = 1 and n = 2.
• Self-assessment — Rate yourself 1 to 5: Can I sum an AGP to infinity without notes? Can I spot a telescoping series in a rationalised or partial-fraction costume? Do I flinch — correctly — when an S_n has a constant term? Below 4 anywhere, redo that section's YOUR TURN and the matching practice question before moving on.
<!-- END math_ch_9 detailedStudyNotes -->
