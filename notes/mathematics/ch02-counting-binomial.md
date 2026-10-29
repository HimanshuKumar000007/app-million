<!-- BEGIN math_ch_2 detailedStudyNotes -->
Introduction — Why Counting Decides IAT Ranks
• Counting problems look like the lightest part of the paper — no calculus, no graphs, just "in how many ways?" — and they quietly decide ranks, because they punish guesswork and reward clean thinking. One wrong assumption about order or repetition and the answer is not slightly wrong, it is a different number entirely, usually sitting in the options waiting for you.
• DEFINITION — Combinatorics is the art of counting arrangements and selections exactly, without listing them. This chapter builds the whole toolkit: the fundamental principle, permutations, combinations, and the binomial theorem — which turns out to be a counting theorem in disguise.
• WHY two halves, one chapter — counting (permutations and combinations) is the engine of probability later in this course: probability is just favourable counts divided by total counts. The binomial theorem is the algebra of the same coefficients C(n, r), and it powers coefficient questions and approximations, two IAT factories.
• EXAMPLE — A 4-digit PIN uses any of 10 digits in each of 4 slots, repeats allowed: 10^4 = 10,000 possibilities. You already believe this number. By the end of the chapter you will be able to prove it, vary it, and trap-proof it.
• The map: first the fundamental principle (multiply versus add), then permutations (arrangements), the two meanings of repetition, the block and gap methods for restrictions, circular arrangements, combinations (selections), committees, groups and geometry — then the binomial theorem: general term, middle and greatest terms, coefficient hunting in products, coefficient identities, and approximations.
★ HIGHLIGHT — Every counting problem on Earth is four questions in a trench coat: Am I arranging or selecting? Is repetition allowed? Are there restrictions? Does order matter? Answer those four honestly and the formula chooses itself.

The Fundamental Principle of Counting — AND Multiplies, OR Adds
• DEFINITION — The fundamental principle of counting: if a task can be split into stage 1 (doable in m ways) AND stage 2 (doable in n ways, for every outcome of stage 1), the combined task can be done in m x n ways. If instead a job can be done by method A (m ways) OR by method B (n ways), the exclusive alternatives giving no overlap, the job can be done in m + n ways.
• WHY multiply — multiplication is pairing. Each of the m first-stage outcomes can be paired with each of the n second-stage outcomes, so the total is the full grid m x n. Adding would count only one stage or the other; multiplying counts completed journeys through both.
• EXAMPLE — A canteen offers 3 starters, 5 main courses and 4 desserts. A full meal (starter AND main AND dessert) can be chosen in 3 x 5 x 4 = 60 ways.
• EXAMPLE — A number plate with 2 letters followed by 4 digits: 26 x 26 x 10 x 10 x 10 x 10 = 6,760,000 possible plates. Five slots, each filled independently, so five factors multiply.
• WORKED PATTERN — Translate the English before touching numbers: "and then", "followed by", "together with" mean stages, so multiply. "Or instead", "either ... or" for the same single decision mean alternatives, so add.
⚠ EXAM TRAP — The classic blunder is adding when the choices fill different slots in sequence. Two shirts and three trousers make 2 x 3 = 6 outfits, not 5: the shirt AND the trousers are both worn. Add only when you pick one option INSTEAD of another for the same slot.
• YOUR TURN — There are 4 roads from home to city A and 3 roads from A to city B. How many routes run from home to B via A? Separately, a traveller can take any of 5 trains OR any of 7 buses to make one trip — how many travel options? (Answers: 4 x 3 = 12 routes, because road 1 AND road 2 are both travelled. And 5 + 7 = 12 options, because the train replaces the bus. Same answer 12, opposite logic — the words decide.)

Permutations — Arranging Distinct Objects in a Row
• DEFINITION — A permutation is an ordered arrangement. The number of ways to arrange r objects chosen from n distinct objects, where the order of the chosen ones matters, is written nPr = n! / (n - r)!.
• DEFINITION — The factorial: n! = n x (n - 1) x (n - 2) x ... x 2 x 1, the number of ways to arrange all n distinct objects in a row. By convention 0! = 1: there is exactly one way to arrange nothing at all, and the convention keeps every formula in this chapter working.
✔ KEY FORMULA — nPr = n! / (n - r)!. Filling r ordered slots from n distinct objects: n choices, then n - 1, down to n - r + 1. Arranging all n objects is the special case nPn = n!.
• WHY the formula has that shape — the first slot can take any of n objects, the second any of the remaining n - 1, and so on; the fundamental principle multiplies the r factors n x (n - 1) x ... x (n - r + 1), which is exactly n! with the tail (n - r)! cancelled away.
• EXAMPLE — Signals: how many different signals can 6 distinct flags make using exactly 4 flags in a column? Order matters (red over blue differs from blue over red), so 6P4 = 6 x 5 x 4 x 3 = 360 signals.
• EXAMPLE — Seven distinct books on a shelf: 7! = 5040 arrangements. Four distinct prizes (gold, silver, bronze, and a consolation) awarded among 10 students: 10P4 = 5040. Identical arithmetic — both are "fill 4 ordered slots from 10" or "fill 7 slots from 7". Always translate the story into slots.
⚠ EXAM TRAP — Order matters only when the positions are distinguishable: 1st versus 2nd, president versus secretary, gold versus silver. The moment the positions become interchangeable (a committee, a hand of cards), you are in combination territory and this formula overcounts by exactly r!.
• YOUR TURN — Eight sprinters run a final. In how many ways can the gold and silver medals be awarded? (Answer: two ordered slots from 8 athletes: 8P2 = 8 x 7 = 56.)

▸ Repetition in Permutations — Repeats Allowed, Twins Identical
• The word "repetition" hides two completely different situations, and exams profit from the confusion. Situation one: slots may reuse objects. Situation two: the objects themselves include identical copies. Different diseases, different medicines.
• DEFINITION — Repetition allowed: if each of r slots can be filled by any of n objects with reuse permitted, the number of arrangements is n^r. Every slot independently has n choices, and the fundamental principle raises n to the power r.
• EXAMPLE — Three-letter codes from the letters A, B, C, D, E, letters reusable: 5^3 = 125 codes. The PIN from the introduction is the same shape: 10^4 = 10,000. Reuse is why short PINs are weak — the count grows only as a power, and 4 slots is not many.
• DEFINITION — Identical items: the number of distinct arrangements of n objects, of which p are alike of one kind, q are alike of another kind, and the rest are distinct, is n! / (p! q! ...). Start with n! as if all were distinct, then divide by the internal rearrangements of each family of copies, because swapping identical copies produces nothing new.
✔ KEY FORMULA — Distinct arrangements with repeats among the objects: n! divided by (p! x q! x ...) over all identical families. No identical families, no division: the formula politely reduces to n!.
• EXAMPLE — BANANA has 6 letters with A repeated 3 times and N repeated 2 times: 6! / (3! x 2!) = 720 / 12 = 60 distinct arrangements. A computer brute-forcing every distinct ordering of B, A, N, A, N, A counts exactly 60 — the division is real.
• EXAMPLE — MISSISSIPPI: 11 letters with I four times, S four times, P twice: 11! / (4! x 4! x 2!) = 34,650 distinct arrangements. The factorials in the denominator are doing heavy lifting: the raw 11! is nearly 40 million.
⚠ EXAM TRAP — Divide by p! only for copies that are truly interchangeable — the same letter printed twice. Two brothers in a photo are distinct people even if they are twins; two letter A's in BANANA are not. If swapping two items produces a visibly different outcome, they are distinct and no division happens.
• YOUR TURN — How many distinct arrangements does the word ARRANGE have? (Answer: 7 letters with A twice and R twice: 7! / (2! x 2!) = 5040 / 4 = 1260.)

Restrictions — Block Method for Together, Gap Method for Apart
• Most real problems carry a condition: these two must sit together, those two must never touch. Two master tools handle almost every restriction ever set, and Figure 1 draws both. Learn to reach for them by keyword.
• DEFINITION — The block method (for "together"): glue the objects that must stay together into a single super-object. Arrange all the units (loose objects plus the block), then multiply by the number of ways the objects inside the block can be arranged among themselves.
• WORKED PATTERN — The letters of COMPUTER (all distinct) with the vowels O, U, E together: the consonants C, M, P, T, R are 5 loose letters, and the vowel block is 1 unit, giving 6 units to arrange in 6! ways. Inside the block the 3 vowels shuffle in 3! ways. Total 6! x 3! = 720 x 6 = 4320.
• EXAMPLE — Five boys and three girls line up with all three girls together: 5 boys plus 1 girl-block make 6 units, 6! arrangements, times 3! inside the block: 4320 again. Same skeleton, new story — that is what a "method" means.
• DEFINITION — The gap method (for "never together" / "no two adjacent"): arrange the unrestricted objects first. They create gaps — one before the first, one between each pair, one after the last. Place the restricted objects into distinct gaps, at most one per gap, so two restricted objects can never end up adjacent.
• WHY the gap count is objects plus one — a row of n objects has n - 1 internal spaces, plus the two ends: n + 1 gaps in total. This innocent-looking plus one is where gap-method answers live or die.
• WORKED PATTERN — Five boys and three girls in a row, no two girls adjacent: arrange the boys in 5! = 120 ways. The boys create 6 gaps. Choose 3 of the 6 gaps for the girls: C(6, 3) = 20. Arrange the 3 girls in their chosen gaps: 3! = 6. Total 120 x 20 x 6 = 14,400. A brute-force check over all 8! = 40,320 line-ups counts exactly 14,400 — the method is exact.
★ HIGHLIGHT — Figure 1 is this whole section in one frame: left, the block — vowels glued into a super-letter; right, the gap method — the X slots around arranged objects are the only legal homes for the items that must stay apart.
⚠ EXAM TRAP — "No two together" is NOT the complement of "all together". Between them live the arrangements where exactly one pair is together and the third is separate; subtracting the block count from the total leaves those behind and overcounts nothing — it simply answers a different question. Subtraction works for "not all together"; the gap method is the tool for "no two together".
• YOUR TURN — The letters of NUMBER (all distinct) are arranged with the vowels U and E together. How many arrangements? (Answer: 4 consonants plus the vowel block make 5 units: 5! x 2! = 120 x 2 = 240.)

Circular Permutations — The Round Table Rules
• DEFINITION — A circular permutation arranges objects around a circle, where arrangements that differ only by a rotation are considered the same — there is no "first seat" at a round table. The number of circular arrangements of n distinct objects is (n - 1)!.
• WHY (n - 1)! and not n! — every circular arrangement can be rotated into n different line arrangements (one per starting seat), so the n! line arrangements collapse in groups of n: n! / n = (n - 1)!. Equivalent view: seat one person first to break the symmetry — their seat is just a reference point — then arrange the remaining n - 1 people in (n - 1)! ways.
✔ KEY FORMULA — Round table, distinct people: (n - 1)!. Necklace or garland, which can also be flipped over: (n - 1)! / 2. The extra division by 2 is ONLY for flippable rings.
• EXAMPLE — Six friends around a round table: (6 - 1)! = 120 seatings. With 6 distinct beads on a necklace: 120 / 2 = 60, because a necklace turned over shows the same arrangement in mirror order, while chairs around a table cannot be flipped.
• Restrictions survive the move to circles: two particular people insist on sitting together at a round table of 6 — block them into one unit, giving 5 units around the circle: (5 - 1)! x 2! = 24 x 2 = 48 seatings.
• "Never together" at a table uses subtraction, carefully: 8 people at a round table with one specified pair never adjacent: total (8 - 1)! = 5040, minus the together count (7 - 1)! x 2! = 1440, giving 3600.
★ HIGHLIGHT — Figure 3 shows the whole idea: one party, photographed twice with everyone rotated by one seat. Same neighbours, same arrangement — that identification is exactly why we divide by n.
⚠ EXAM TRAP — Two of them: using the line formula n! for a table (forgetting rotations collapse), and dividing by 2 for seated people (forgetting that a table, unlike a necklace, has an up side and cannot flip). Ask "can this arrangement be picked up and turned over?" — yes means divide, no means do not.
• YOUR TURN — How many different necklaces can be made from 8 distinct beads? (Answer: (8 - 1)! / 2 = 5040 / 2 = 2520.)

Combinations — Selection Where Order Does Not Matter
• DEFINITION — A combination is a selection: a set of objects chosen from a larger set, where the order in which they were chosen is irrelevant. The number of ways to choose r objects from n distinct objects is nCr = C(n, r) = n! / (r! (n - r)!).
• WHY combinations are permutations with the order divided out — take any selection of r objects; it can be arranged in r! orders, and each arrangement was counted separately in nPr. So nPr = nCr x r!, and dividing gives the formula. Selections are always the smaller count — a useful sanity check on every answer.
✔ KEY FORMULA — nCr = n! / (r! (n - r)!). Symmetry: nCr = nC(n - r) — choosing the r who go is the same act as choosing the n - r who stay. Pascal's identity: C(n, r) = C(n - 1, r - 1) + C(n - 1, r).
• EXAMPLE — Handshakes: 8 people at a meeting, every pair shakes hands once. A handshake is an unordered pair: C(8, 2) = 28 handshakes.
• EXAMPLE — Choosing 3 books from 10 to take on a trip: C(10, 3) = 120. Compare with 10P3 = 720 if the three slots (hand, bag, pocket) were distinct — the ratio is exactly 3! = 6, the price of caring about order. Whenever a problem changes only in whether order matters, the answers differ by exactly r!.
• EXAMPLE — A lottery asking you to pick 6 numbers from 49: C(49, 6) = 13,983,816 possible tickets. That is why the jackpot keeps rolling over — combinations grow brutally fast, and this number is worth remembering as a scale anchor.
• The symmetry trick in action: C(12, 9) looks heavy until you flip it: C(12, 3) = 220. Always compute whichever of r and n - r is smaller. Pascal's identity example: C(9, 4) = C(8, 3) + C(8, 4) = 56 + 70 = 126 — each coefficient is built from the two above it, which is literally how Pascal's triangle grows in Figure 2.
⚠ EXAM TRAP — Let the verbs decide the tool. "Arrange, line up, rank, award (distinct prizes), appoint president and secretary" are permutation words. "Choose, select, committee, team, delegation, hand of cards" are combination words. When a problem does both — select a team, then arrange it — multiply nCr by the arrangement count for the second stage.
• YOUR TURN — A class of 12 must send a delegation of 9 students. Compute the count the easy way. (Answer: C(12, 9) = C(12, 3) = 220 — choosing the 9 who go equals choosing the 3 who stay, and 3 is cheaper to compute.)

▸ Committees and Conditions — At-Least and At-Most Done Right
• DEFINITION — The committee pattern: the pool is split into categories (men and women, teachers and students, bowlers and batsmen). Choose the required number from each category with combinations, multiply across categories (fundamental principle), and add across the separate cases that satisfy the condition.
• WORKED PATTERN — A committee of 5 from 6 men and 4 women must contain at least 2 women. Split by exact composition: 2 women and 3 men: C(4, 2) x C(6, 3) = 6 x 20 = 120. Three women and 2 men: C(4, 3) x C(6, 2) = 4 x 15 = 60. Four women and 1 man: C(4, 4) x C(6, 1) = 1 x 6 = 6. Add the cases: 120 + 60 + 6 = 186 committees.
• The complement shortcut: "at least one" almost always collapses to total minus none. Committee of 4 from 5 men and 5 women with at least one woman: C(10, 4) - C(5, 4) = 210 - 5 = 205. One subtraction replaces three cases — reach for the complement whenever the forbidden side has fewer cases.
• "At most" works the same way: count the small side. At most 2 women in a team of 5 means cases with 0, 1 or 2 women — or total minus the cases with 3, 4 or 5 women, whichever list is shorter. Here both lists have three entries; with "at most 1" the direct side wins easily.
⚠ EXAM TRAP — The most seductive error in the chapter: for "at least 2 women", students fix 2 women in the committee first and then choose the remaining 3 people freely from the other 8. That counts many committees several times — a committee with 4 women is generated once for every pair of its women you might have "fixed" first. Exact-composition case splits never double count; the fixing shortcut almost always does.
• YOUR TURN — A committee of 6 is chosen from 8 boys and 6 girls and must contain at least 3 girls. Count it. (Answer: split exactly — 3 girls: C(6, 3) x C(8, 3) = 1120; 4 girls: C(6, 4) x C(8, 2) = 420; 5 girls: C(6, 5) x C(8, 1) = 48; 6 girls: 1. Total 1120 + 420 + 48 + 1 = 1589.)

▸ Groups and Geometry — Dividing Teams, Counting Triangles
• DEFINITION — Division into groups: splitting mn distinct objects into n groups of m each. If the groups are unlabelled (just "three groups"), the count is (mn)! / ((m!)^n x n!). If the groups are labelled or have different jobs, the final division by n! is dropped.
• WHY two divisions — dividing by (m!)^n removes the order inside each group (a group is a set). Dividing by n! removes the order among the groups themselves: forming group {A, B, C, D} first and {E, F, G, H} second is the same split as the reverse order when the groups carry no labels.
• EXAMPLE — Twelve students split into 3 groups of 4 for the same project: C(12, 4) x C(8, 4) x C(4, 4) / 3! = 495 x 70 x 1 / 6 = 5775 splits. Send the three groups to three different laboratories instead, and the groups become distinguishable: no division by 3!, giving 34,650. The word "different" in the problem statement is worth a factor of 6.
• EXAMPLE — The smallest case keeps you honest: 6 students into two unnamed groups of 3: C(6, 3) / 2 = 10. Choosing {A, B, C} first or choosing its complement first produces the same split, hence the division by 2 = 2!.
• Geometry counting runs on the same engine: any 3 non-collinear points determine a triangle, any 2 points determine a segment.
• EXAMPLE — Twelve points in a plane, exactly 4 of them on one straight line and no other three collinear. Triangles: C(12, 3) - C(4, 3) = 220 - 4 = 216. The subtraction removes only the 4 "triangles" that collapse onto the line; triples using 1 or 2 of the collinear points with outside points are perfectly good triangles.
✔ KEY FORMULA — Diagonals of an n-sided polygon: C(n, 2) - n = n(n - 3) / 2. All segments between vertices, minus the n sides. Octagon: 8 x 5 / 2 = 20 diagonals.
⚠ EXAM TRAP — Two traps guard this section. In division: dividing by n! when the groups are labelled, or forgetting it when they are not. In geometry: subtracting too much for collinear points — only triples lying entirely on the line fail to form triangles.
• YOUR TURN — How many diagonals does a decagon have? (Answer: C(10, 2) - 10 = 45 - 10 = 35, matching 10 x 7 / 2.)

The Binomial Theorem — The Expansion Machine
• DEFINITION — The binomial theorem: for any positive integer n, (x + y)^n = C(n, 0) x^n + C(n, 1) x^(n - 1) y + C(n, 2) x^(n - 2) y^2 + ... + C(n, n) y^n. In one line: (x + y)^n is the sum over r = 0 to n of C(n, r) x^(n - r) y^r.
• Read the anatomy of the expansion: there are n + 1 terms. The power of x falls from n to 0 while the power of y climbs from 0 to n, and in every single term the two powers add to exactly n. If a term you compute breaks the sum-to-n rule, it is wrong before you even check the coefficient.
• WHY it is true — and why it lives in the counting chapter. Expanding (x + y)(x + y) ... (x + y) means choosing, from each bracket, either x or y. A term with y chosen exactly r times and x the other n - r times arises in C(n, r) ways — choose which brackets donate the y. The coefficients are combinations because expansion IS selection.
★ HIGHLIGHT — Hold onto that: C(n, r) counts committees AND coefficients for the same reason. Pascal's triangle (Figure 2) is simultaneously a table of selections and a table of expansion coefficients — one object, two jobs.
• EXAMPLE — In (x + 2)^5, find the x^3 term: x^3 needs y-part power r = 2, so the term is C(5, 2) x^3 x 2^2 = 10 x 4 x^3 = 40 x^3. Notice the 2 is inside the second part and gets raised to r = 2 along with it.
⚠ EXAM TRAP — Forgetting that the constant in the second bracket is part of the term. In (x + 2)^5 the second "part" is 2, so its contribution is 2^r, not 1. Dropping those powers is the single most common binomial error in IAT papers — the options always include the value you get by making it.
• YOUR TURN — What is the coefficient of x^3 in (1 + 2x)^5? (Answer: the x^3 term has r = 3: C(5, 3) x (2)^3 = 10 x 8 = 80.)

▸ The General Term — Dial Any Term You Want
✔ KEY FORMULA — The general term of (x + y)^n: T(r + 1) = C(n, r) x^(n - r) y^r. The index r counts the power of the SECOND part, and r starts at 0 — the first term is T(1) with r = 0, the fifth term has r = 4.
• This one formula answers every single-expansion question type: the coefficient of a given power, the term independent of x, the value of a named term, the ratio of consecutive terms. The method is always: write the power of x in T(r + 1) as a function of r, set it equal to the target, solve for r, then evaluate.
• WORKED PATTERN — The term independent of x in (x + 1/x^2)^9: the general term is C(9, r) x^(9 - r) x (1/x^2)^r = C(9, r) x^(9 - 3r). Independent of x means the power is zero: 9 - 3r = 0, so r = 3. The term is C(9, 3) = 84 — just a number, as promised.
• Read the pattern of the power: each step of r cost the x-power 1 (because x^(9 - r)) and another 2 (because (1/x^2)^r divides): total slope -3 per step. In (x^2 + 1/x)^15 the power runs 30 - 3r; in (2x - 1/x)^n it runs n - 2r. Find the slope and every question of this family is arithmetic.
• A legitimate twist: if the target power gives a non-integer r, that power simply never occurs and its coefficient is 0. For x^7 in (x - 1/x^2)^12, the power equation 12 - 3r = 7 gives r = 5/3 — no such term exists. Exams do set this, and "0" sits quietly among the options.
⚠ EXAM TRAP — The double off-by-one: T(r + 1) uses C(n, r), and r is the power of the second part, not the first. In (2x + 3)^n the second part is 3, so 3^r appears and r counts the constant's power — students who track the x-power in r end up with the mirror term. Decide what r counts BEFORE writing anything.
• YOUR TURN — Which term of (x + 1/x^2)^9 contains x^3, and what is it? (Answer: 9 - 3r = 3 gives r = 2, so it is T(3), with value C(9, 2) x^3 = 36 x^3.)

▸ Middle Terms and the Greatest Term
• DEFINITION — Middle term(s) of (x + y)^n: if n is even there is exactly one middle term, T(n/2 + 1). If n is odd there are two, T((n + 1)/2) and T((n + 3)/2). The middle is a position — it depends only on n, never on x.
• EXAMPLE — The middle term of (x/3 + 9y)^10: n = 10 is even, so the middle term is T(6), with r = 5: C(10, 5) x (x/3)^5 x (9y)^5 = 252 x (x^5 / 243) x 59049 y^5. Since 59049 / 243 = 243, the term is 252 x 243 x^5 y^5 = 61,236 x^5 y^5.
• EXAMPLE — (x + a)^7 has n odd, so two middle terms: T(4) = C(7, 3) x^4 a^3 = 35 x^4 a^3 and T(5) = C(7, 4) x^3 a^4 = 35 x^3 a^4. Symmetric, as the triangle promises.
• Now a different animal. DEFINITION — The greatest term of an expansion is the term with the largest absolute value once x has been fixed at a specific number. Unlike the middle term, it depends on x — change x and a different term takes the crown.
• The neighbour test finds it: terms grow while the ratio of consecutive terms T(r + 2) / T(r + 1) = ((n - r) / (r + 1)) x (second part value / first part value) stays above 1, and shrink once it drops below 1. The greatest term sits exactly where the ratio crosses 1.
• EXAMPLE — (3 + 2x)^7 at x = 1: the terms are 2187, 10206, 20412, 22680, 15120, 6048, 1344, 128. Check the ratios: at r = 2 the ratio is (5/3) x (2/3) = 10/9, still above 1, so T(4) beats T(3); at r = 3 the ratio is (4/4) x (2/3) = 2/3, below 1, so T(5) falls. The greatest term is T(4) = 22,680.
⚠ EXAM TRAP — Never confuse the three crowns: greatest COEFFICIENT (for (1 + x)^n it is the middle coefficient C(n, n/2)), middle TERM (a position), and greatest TERM (a value at a given x). An option offering C(7, 3) = 35 for the greatest term of (3 + 2x)^7 is harvesting exactly this confusion.
• YOUR TURN — How many middle terms does the expansion of (x + 2)^13 have, and which terms are they? (Answer: n = 13 is odd, so two middle terms: T(7) and T(8).)

Coefficient Hunting — Finding the Coefficient of x^k
• Here is the IAT signature problem of this chapter: the coefficient of a power of x in a PRODUCT of two expansions, like (1 + x)^6 (1 + x^2)^3. Neither expansion alone contains the answer — the target power is built by teamwork between the factors.
• WORKED PATTERN — Coefficient of x^6 in (1 + x)^5 (1 + x^2)^2. The x^6 must be split across the factors: x^a from the first times x^(2b) from the second, with a + 2b = 6, a at most 5, b at most 2. The legal splits: b = 1, a = 4: C(5, 4) x C(2, 1) = 5 x 2 = 10. And b = 2, a = 2: C(5, 2) x C(2, 2) = 10 x 1 = 10. Split b = 0 would need a = 6, more than the first factor can give — illegal. Total coefficient: 10 + 10 = 20.
• The method, distilled: list every split of the target power that respects each factor's step size (x^2 jumps in twos) and maximum power, multiply the two coefficients in each split, and add over splits. A small table of splits, written before computing, is what separates a 20-second solve from a mess.
• The same discipline runs single expansions with negative powers: in (x^2 + 1/x)^15 the power of x in T(r + 1) is 30 - 3r; a target like x^15 gives r = 5 and coefficient C(15, 5) = 3003. Worked Example 5 does this one in full.
⚠ EXAM TRAP — Two failure modes: missing a legal split (the most common — the b = 2 split above is the one everyone drops), and inventing an illegal one (a exceeds its factor's n, or the parity fails — with an x^2 factor, odd leftover powers cannot be completed). Sweep b from its minimum to maximum systematically, never by inspiration.
• YOUR TURN — Find the coefficient of x^2 in (1 + x)^4 (1 - 2x)^3. (Answer: splits (a, b) with a + b = 2: (0, 2): 1 x C(3, 2) x 4 = 12; (1, 1): 4 x (3 x -2) = -24; (2, 0): 6 x 1 = 6. Total 12 - 24 + 6 = -6. Yes, coefficients can be negative — the minus signs inside a factor are real.)

Properties of Binomial Coefficients — Sums and Identities
✔ KEY FORMULA — Putting x = 1 in (1 + x)^n: C(n, 0) + C(n, 1) + ... + C(n, n) = 2^n. The full row of Pascal's triangle sums to a power of 2.
✔ KEY FORMULA — Putting x = -1: C(n, 0) - C(n, 1) + C(n, 2) - ... = 0. The alternating sum vanishes, which forces the odd-position coefficients and the even-position coefficients to have equal sums, each 2^(n - 1).
✔ KEY FORMULA — Sum of squares: C(n, 0)^2 + C(n, 1)^2 + ... + C(n, n)^2 = C(2n, n). This is Vandermonde's identity in its most useful dress: the coefficient of x^n in (1 + x)^n (1 + x)^n = (1 + x)^(2n), read off by splitting n as r + (n - r).
• EXAMPLE — Row 10 does all three tricks at once: the coefficients sum to 2^10 = 1024; the odd positions sum to 2^9 = 512, matching the even positions; and the squares sum to C(20, 10) = 184,756. Three identities, one row — if a question asks for any of these shapes, the answer is a lookup, not a computation.
• Pascal's identity builds the triangle: C(n, r) = C(n - 1, r - 1) + C(n - 1, r) — every entry is the sum of its two parents. Figure 2 draws rows 0 to 8: read any coefficient in under a second once the triangle's shape is in your fingers.
• The hockey-stick identity hides in the same triangle: C(2, 2) + C(3, 2) + C(4, 2) + C(5, 2) = 1 + 3 + 6 + 10 = 20 = C(6, 3). A diagonal of the triangle adds up to the entry just below its last term — the "stick" bends at the end, hence the name. Figure 2 circles this exact diagonal.
• One more workhorse: r x C(n, r) = n x C(n - 1, r - 1) (both sides count "choose a committee of r and then its captain, two ways"). Summing gives the sum of r C(n, r) over r = n x 2^(n - 1): for n = 10 that is 10 x 512 = 5120, a classic one-mark gift.
★ HIGHLIGHT — Look at Figure 2 again: the shaded central column 1, 2, 6, 20, 70 is C(2n, n) for n = 0, 1, 2, 3, 4 — exactly the sum-of-squares answers. The triangle is not decoration; it is a compressed answer key for this whole section.
⚠ EXAM TRAP — The clean identities belong to (1 + x)^n exactly. Put x = 1 in (2 + 3x)^n and you get 5^n = the sum of C(n, r) 2^(n - r) 3^r — a weighted sum, not 2^n. Check the brackets before quoting an identity; the constants inside ride along into every term.
• YOUR TURN — Evaluate C(6, 0)^2 + C(6, 1)^2 + ... + C(6, 6)^2 without squaring six numbers. (Answer: it is the sum of squares for n = 6, so C(12, 6) = 924.)

▸ Binomial Approximation — (1 + x)^n When x Is Tiny
• DEFINITION — The binomial series: for |x| less than 1, (1 + x)^n = 1 + nx + n(n - 1) x^2 / 2 + n(n - 1)(n - 2) x^3 / 6 + ... . For positive integer n the series stops after n + 1 terms and is exact; for fractional or negative n it runs forever but still converges when |x| is less than 1 — and when x is small, two or three terms give exam-grade accuracy.
• WHY the terms die so fast — each successive term picks up roughly another factor of x. At x = 0.02, every new term is about fifty times smaller than the one before, so the third term is already down at the 10^-4 level and the fourth is invisible at exam precision.
• EXAMPLE — (1.02)^8: write it as (1 + 0.02)^8 with n = 8, x = 0.02: 1 + 8 x 0.02 + 28 x (0.02)^2 = 1 + 0.16 + 0.0112 = 1.1712. The true value is 1.17166 — three terms land within 0.05 percent. In a multiple-choice hall, that is a bullseye.
• EXAMPLE — Square root of 0.98 = (1 - 0.02)^(1/2): with n = 1/2 and x = -0.02: 1 + (1/2)(-0.02) + (1/2)(-1/2)/2 x (-0.02)^2 = 1 - 0.01 - 0.00005 = 0.98995. The true root is 0.989949... — the approximation is right to five decimal places. Note how the second-order coefficient for n = 1/2 is (1/2) x (-1/2) / 2 = -1/8, negative even before x speaks.
⚠ EXAM TRAP — The series only accepts the "1 plus small thing" shape. Rewrite 0.98 as 1 - 0.02 and 1.02 as 1 + 0.02 BEFORE expanding. If the base is (2 + x)^n, factor out the 2 first: (2 + x)^n = 2^n (1 + x/2)^n. Expanding with x = 0.98 directly converges so slowly that two terms are nowhere near the answer.
• YOUR TURN — Approximate (0.99)^6 using three terms of the series. (Answer: 1 - 6 x 0.01 + 15 x (0.01)^2 - 20 x (0.01)^3 = 1 - 0.06 + 0.0015 - 0.00002 = 0.94148 — the true value is 0.94148 to five places.)

Formula Sheet — Every Result on One Screen
✔ Fundamental principle: sequential stages multiply; exclusive alternatives for one decision add.
✔ nPr = n! / (n - r)!; arranging all n distinct objects: n!. Factorial: n! = n x (n - 1) x ... x 1, with 0! = 1.
✔ Repetition allowed in r slots from n objects: n^r. Identical objects: n! / (p! q! ...) over the alike families.
✔ Together: block method — arrange the units, multiply by the block's internal arrangements. No two together: gap method — arrange the free objects, choose gaps among the (objects + 1) gaps, place the restricted ones.
✔ Circular arrangements of n distinct objects: (n - 1)!. Necklaces that can flip: (n - 1)! / 2.
✔ nCr = n! / (r! (n - r)!) = nC(n - r). Pascal: C(n, r) = C(n - 1, r - 1) + C(n - 1, r).
✔ Division into n unlabelled groups of m: (mn)! / ((m!)^n x n!). Diagonals of an n-gon: n(n - 3) / 2. Triangles from n points with k collinear: C(n, 3) - C(k, 3).
✔ (x + y)^n = the sum over r of C(n, r) x^(n - r) y^r. General term: T(r + 1) = C(n, r) x^(n - r) y^r.
✔ Middle term: n even, T(n/2 + 1); n odd, T((n + 1)/2) and T((n + 3)/2). Greatest term: where the ratio of consecutive terms crosses 1.
✔ Sum of C(n, r) over all r = 2^n; alternating sum = 0; odd-position sum = even-position sum = 2^(n - 1); sum of squares = C(2n, n); sum of r C(n, r) = n 2^(n - 1).
✔ Approximation for small x: (1 + x)^n = 1 + nx + n(n - 1) x^2 / 2 + n(n - 1)(n - 2) x^3 / 6 + ..., valid for |x| less than 1, any n.

Common Mistakes and Exam Traps
• Mistake 1: Adding when the story multiplies. "Two shirts and three trousers make 5 outfits" — why it is wrong: the shirt AND the trousers are both chosen, so the choices pair up into a grid. Correct principle: stages in sequence multiply; only alternatives for the same single decision add.
• Mistake 2: Counting a committee with permutations. "Choose a president-team of 3 from 10 in 10P3 = 720 ways" — why it is wrong: a team has no internal order, so each team was counted 3! = 6 times. Correct principle: if swapping two selected people changes nothing, the tool is nCr and the count is 120.
• Mistake 3: Forgetting the block's internal arrangements. "Vowels together in COMPUTER: 6! = 720" — why it is wrong: the block is not a single frozen letter; O, U, E shuffle inside it. Correct principle: block method always has two factors — arrange the units, then multiply by the inside arrangements (here 3!, giving 4320).
• Mistake 4: Answering "no two together" by subtracting "all together" from the total. Why it is wrong: arrangements with exactly one pair together are neither "all together" nor "no two together", and subtraction silently claims them for the wrong side. Correct principle: use the gap method for no-two-together; reserve subtraction for "not all together".
• Mistake 5: Round-table answers of n!, or necklace answers without the flip division. Why they are wrong: rotations of a seating are the same seating (divide by n), and a necklace has no front or back (divide by 2 more) — but a table of people cannot flip, so the /2 stops at necklaces. Correct principle: ask what identifications the physical object allows, then divide by exactly those.
• Mistake 6: Dividing by p! for objects that are merely similar, not identical. "Two brothers in a row of 5: 5! / 2!" — why it is wrong: the brothers are distinct people; swapping them gives a different photo. Correct principle: the identical-items division applies only when swapping the copies produces literally the same outcome, like repeated letters.
• Mistake 7: The at-least overcount — fixing the required members first. "At least 2 women: choose 2 women, then any 3 of the remaining 8 people" — why it is wrong: committees with 3 or 4 women are generated multiple times, once per choice of which women were "fixed". Correct principle: split by exact composition and add, or use the complement when it is shorter.
• Mistake 8: General-term off-by-ones. "The 5th term of (x + 2)^n uses C(n, 5) and 2^4..." — why it is wrong twice over: T(5) has r = 4, and r is the power of the second part, so it is C(n, 4) with 2^4 — the two halves of the error cancel just often enough to keep the habit alive. Correct principle: T(r + 1) = C(n, r) x^(n - r) y^r; name what r counts before writing.
• Mistake 9: Missing or illegal splits in coefficient products. "Coefficient of x^6 in (1 + x)^5 (1 + x^2)^2 is C(5, 4) x C(2, 1) = 10" — why it is wrong: the b = 2, a = 2 split also builds x^6 and adds another 10. Correct principle: sweep the step-size factor through all its legal values and add every split; check each factor's maximum power.
• Mistake 10: Quoting (1 + x)^n identities for other brackets. "The coefficients of (2 + 3x)^n sum to 2^n" — why it is wrong: setting x = 1 gives (2 + 3)^n = 5^n, and the sum carries the weights 2^(n - r) 3^r. Correct principle: the clean identities 2^n, 0 and C(2n, n) belong to (1 + x)^n alone; other brackets give weighted versions.

Worked Examples — Basic to Challenging
• Example 1 — Problem: How many 4-digit numbers have all their digits different?
• Given: A 4-digit number cannot start with 0; digits may not repeat.
• Principle: Fill the slots left to right with the fundamental principle, handling the restricted slot (thousands) first.
• Steps: Thousands digit: 9 choices (1 to 9). Hundreds digit: 9 choices (0 is now allowed, one digit used). Tens: 8 choices. Units: 7 choices. Multiply: 9 x 9 x 8 x 7.
• Answer: 4536 numbers.
• Reasoning: The thousands slot is filled first precisely because its restriction (no zero) interacts with the others; after it, each slot simply loses one option. A computer checking every number from 1000 to 9999 confirms 4536.
• Mistake: Computing 10 x 9 x 8 x 7 = 5040 treats the number as a 4-permutation of digits and silently counts 504 "numbers" that begin with 0 and are really 3-digit numbers.
• Example 2 — Problem: In how many ways can the letters of the word STATISTICS be arranged?
• Given: STATISTICS has 10 letters: S three times, T three times, I twice, A once, C once.
• Principle: Identical items — start from 10! and divide by the factorials of each repeated family.
• Steps: Total letters 10. Denominator: 3! for S, 3! for T, 2! for I. Compute 10! / (3! x 3! x 2!) = 3,628,800 / 72.
• Answer: 50,400 arrangements.
• Reasoning: Every distinct arrangement corresponds to exactly 3! x 3! x 2! raw permutations of the labelled copies, so the division restores the count of genuinely different words.
• Mistake: Answering 10! forgets that swapping the three S's among themselves changes nothing — the raw count is 72 times too big.
• Example 3 — Problem: A committee of 5 is to be formed from 6 men and 4 women, with at least 2 women on it. In how many ways?
• Given: Pool split: 6 men, 4 women; committee size 5; condition: women at least 2.
• Principle: Case-split by exact composition; combinations within each category, multiply across categories, add across cases.
• Steps: 2 women, 3 men: C(4, 2) x C(6, 3) = 6 x 20 = 120. Three women, 2 men: C(4, 3) x C(6, 2) = 4 x 15 = 60. Four women, 1 man: C(4, 4) x C(6, 1) = 6. Sum: 120 + 60 + 6.
• Answer: 186 committees.
• Reasoning: The cases are exact compositions, so no committee appears twice and none satisfying the condition is missed — a brute-force enumeration of all C(10, 5) = 252 committees counts exactly 186 with at least 2 women.
• Mistake: Fixing 2 women first and choosing any 3 of the remaining 8 people gives C(4, 2) x C(8, 3) = 336 — bigger than the total number of committees with any women at all, because multi-women committees were counted once per pair of women inside them.
• Example 4 — Problem: Twelve points lie in a plane, exactly 4 of them on one straight line, no other three collinear. How many triangles do the points determine?
• Given: Any 3 non-collinear points form a triangle; the only obstruction is triples entirely on the line.
• Principle: Total triples minus degenerate triples: C(n, 3) - C(k, 3).
• Steps: All triples: C(12, 3) = 220. Triples on the line: C(4, 3) = 4. Subtract: 220 - 4.
• Answer: 216 triangles.
• Reasoning: A triple containing exactly 1 or 2 of the collinear points plus outside points still spans a genuine triangle, so only the 4 fully-collinear triples are removed.
• Mistake: Refusing to use the 4 collinear points at all throws away hundreds of valid triangles; the correction is surgical, subtracting 4, not 4 points.
• Example 5 — Problem: Find the coefficient of x^15 in the expansion of (x^2 + 1/x)^15.
• Given: General term T(r + 1) = C(15, r) (x^2)^(15 - r) (1/x)^r.
• Principle: The power of x in the general term is a linear function of r; set it equal to the target and solve.
• Steps: Power of x: 2(15 - r) - r = 30 - 3r. Set 30 - 3r = 15, so 3r = 15 and r = 5. Coefficient: C(15, 5) = 3003.
• Answer: 3003.
• Reasoning: Only one value of r can produce x^15 because the power falls by exactly 3 at every step; r = 5 lands precisely on 15, so a single combination gives the whole coefficient.
• Mistake: Setting the x^2 part's power 2(15 - r) = 15 ignores the 1/x factor entirely and has no integer solution anyway — both parts of the bracket always contribute to the final power.
• Example 6 — Problem: Find the coefficient of x^5 in (2 + 3x)^4 (1 - x)^3.
• Given: First factor gives powers x^0 to x^4 with coefficients C(4, a) 2^(4 - a) 3^a; second gives x^0 to x^3 with coefficients C(3, b) (-1)^b.
• Principle: Product coefficients — split the target power 5 as a + b across the two factors in every legal way and add the products.
• Steps: Split (a, b) = (2, 3): C(4, 2) x 2^2 x 3^2 = 216, times C(3, 3) x (-1) = -1: contribution -216. Split (3, 2): C(4, 3) x 2 x 27 = 216, times C(3, 2) = 3: contribution 648. Split (4, 1): C(4, 4) x 81 = 81, times C(3, 1) x (-1) = -3: contribution -243. Add: -216 + 648 - 243.
• Answer: 189.
• Reasoning: a cannot exceed 4 and b cannot exceed 3, so (2, 3), (3, 2) and (4, 1) are all the splits there are; the negative contributions come honestly from the minus sign in (1 - x)^3.
• Mistake: Dropping the (4, 1) split or losing a sign: each error shifts the total by hundreds, and the options are built from exactly these slips.
• Example 7 — Problem: Find the greatest term in the expansion of (3 + 2x)^7 when x = 1.
• Given: Terms T(r + 1) = C(7, r) 3^(7 - r) (2x)^r with x = 1.
• Principle: Greatest term, not greatest coefficient — compare consecutive terms; the champion is where the growth ratio crosses 1.
• Steps: Compute the terms: T(1) = 2187, T(2) = 10206, T(3) = 20412, T(4) = 22680, T(5) = 15120, and falling after. Ratio check: at r = 2 the ratio T(4)/T(3) = (5/3) x (2/3) = 10/9 > 1, still growing; at r = 3 the ratio is 2/3 < 1, shrinking. So the peak is T(4).
• Answer: The greatest term is T(4) = 22,680.
• Reasoning: The terms rise while each new term beats its predecessor and fall forever after the ratio drops below 1 — one crossing, one peak. Here the peak sits at r = 3, not at the middle coefficient's home by coincidence but because the ratio test put it there.
• Mistake: Answering with the greatest coefficient C(7, 3) = 35 — that is the largest multiplier in (1 + x)^7, a different question about a different expansion.

Practice Questions — Self-Test Set
• Q1. How many 5-digit numbers can be formed with all digits different? (Digits may not repeat, and the number may not begin with 0.)
• Q2. In how many ways can the letters of the word PARALLEL be arranged if the three L's must always stay together?
• Q3. A committee of 4 is chosen from 7 teachers and 5 students. In how many ways can it be formed with at least 2 students?
• Q4. How many diagonals does a polygon with 15 sides have?
• Q5. Find the coefficient of x^3 in the expansion of (1 + x)^3 (2 - x)^2.
• Q6. Find the middle term of the expansion of (x + 1/x)^10.
• Q7. Seven people sit around a round table. In how many ways can they be seated if two particular people never sit next to each other?
• Q8. If C(n, 4) = C(n, 6) for some n, find n and hence the value of C(n, 2).

▸ Answer Key with Explanations
• A1 — 27,216. Fill the ten-thousands slot first: 9 choices (no zero), then 9, 8, 7, 6: 9 x 9 x 8 x 7 x 6 = 27,216. Misconception caught: 10P5 = 30,240 counts strings that start with 0, which are not 5-digit numbers at all.
• A2 — 360. Glue LLL into one block: the units are P, A, R, A, E and the block — 6 units with A repeated twice: 6! / 2! = 360. The block contributes no internal factor because the three L's are identical. Misconception caught: multiplying by 3! for the L's inside the block treats identical letters as distinct people.
• A3 — 285. Exact splits: 2 students: C(5, 2) x C(7, 2) = 210; 3 students: C(5, 3) x C(7, 1) = 70; 4 students: C(5, 4) = 5. Total 210 + 70 + 5 = 285. Misconception caught: fixing 2 students and choosing any 2 of the remaining 10 counts the 3- and 4-student committees repeatedly.
• A4 — 90. Diagonals = n(n - 3) / 2 = 15 x 12 / 2 = 90. Misconception caught: C(15, 2) = 105 counts every segment between vertices, including the 15 sides, which are not diagonals.
• A5 — -5. Split x^3 across the factors: (1, 2): C(3, 1) x 1 = 3, using the x^2 coefficient 1 of (2 - x)^2; (2, 1): C(3, 2) x (-4) = -12; (3, 0): 1 x 4 = 4. Total 3 - 12 + 4 = -5. Misconception caught: forgetting that (2 - x)^2 carries a negative x coefficient — sign blindness turns this into +19.
• A6 — 252. n = 10 is even, so the middle term is T(6) with r = 5: C(10, 5) x^5 (1/x)^5 = 252, a constant. Misconception caught: reaching for T(5) — the middle of 11 terms is the 6th, because counting starts at T(1).
• A7 — 480. Total seatings (7 - 1)! = 720; the pair together counts as (6 - 1)! x 2! = 240; never together: 720 - 240 = 480. Misconception caught: using the row formulas 7! - 6! x 2 = 3600 — around a table every count is divided by the rotations first.
• A8 — n = 10 and C(10, 2) = 45. When C(n, a) = C(n, b) with a not equal to b, the symmetry nCr = nC(n - r) forces a + b = n: here 4 + 6 = 10. Misconception caught: trying to solve 4 = 6, or assuming no such n exists.

Chapter Summary and Revision Checklist
• Summary — Counting is four questions: arrange or select, repetition or not, restrictions or not, order or not. Permutations count ordered arrangements (nPr, with n!/(p! q!) for identical items); the block and gap methods domesticate restrictions; circles divide by the rotations, necklaces by flips as well; combinations count sets (nCr) and run committees, groups and geometry. The binomial theorem is the same coefficients at work in algebra: the general term T(r + 1) = C(n, r) x^(n - r) y^r answers term and coefficient questions, splits across products answer the IAT signature question, the identities 2^n, 0 and C(2n, n) answer sum questions, and the truncated series answers approximations.
• Revision checklist — I can state when to add and when to multiply, and defend it with the pairing argument.
• Revision checklist — I can move between nPr and nCr fluently and explain the factor of r! between them.
• Revision checklist — I reach for the block method on "together", the gap method on "no two together", and subtraction only on "not all together" — without mixing them.
• Revision checklist — I case-split at-least problems by exact composition, or deliberately choose the complement, and never fix required members first.
• Revision checklist — I write the x-power of the general term as a function of r before solving any term or coefficient question.
• Revision checklist — In product coefficients, I list every legal split of the target power first, respecting step sizes and maximum powers, and only then compute.
• Revision checklist — I can produce 2^n, the alternating sum 0, and the sum of squares C(2n, n) from (1 + x)^n on demand, and I know they fail for other brackets.
• Self-assessment — Rate yourself 1 to 5: Can I classify a new counting problem into the four questions within ten seconds? Can I do a committee problem two ways (cases and complement) and make the answers agree? Can I find a coefficient in a product of two expansions without dropping a split? Below 4 on any of these, redo that section's YOUR TURN and the matching practice question before moving on.
<!-- END math_ch_2 detailedStudyNotes -->
