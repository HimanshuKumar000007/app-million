<!-- BEGIN math_ch_14 detailedStudyNotes -->
Introduction — Three Units, One Theme of Chance and Average
• This chapter fuses three units that look unrelated and are secretly one subject: Statistics asks "what is typical, and how spread out is it?", Probability asks "how likely is each possibility?", and Linear Programming asks "what is the best choice inside a fence of limits?" Averages, chances and optima — the mathematics of real decisions made with incomplete information.
• WHY the IAT loves this chapter — the questions are formula-direct and pattern-based. A grouped median, a Bayes reversal, a binomial probability, a corner-point maximum: each is a fixed machine with fixed steps, and the traps are always the same five or six. This is the highest marks-per-hour chapter in the mathematics syllabus if your machines are drilled.
• EXAMPLE — A coaching institute advertises "average score 92" for its batch. One number, three possible meanings (mean, median, mode), and the honest question — how spread out were the scores? — needs a fourth idea entirely (standard deviation). By the end of this chapter you will be able to interrogate any such claim like an examiner.
• The map of the chapter: first Statistics — mean, step deviation, median and mode; then spread — variance, standard deviation, the scaling laws, coefficient of variation and mean deviation. Then Probability — sample spaces and the addition rule, the exclusive-versus-independent confusion, conditional probability, Bayes' theorem, random variables and the binomial distribution. Finally one compact section on Linear Programming and its corner-point method.
• YOUR TURN — A school reports that the "average" salary of its 10 teachers is 9 lakh per year, but 9 of them earn between 3 and 5 lakh. Which centre is being quoted, and which would be honest? Answer: the mean, dragged up by one very large salary (the principal's); the median, around 4 lakh, describes a typical teacher far better. Keep this suspicion alive through the whole chapter.
★ HIGHLIGHT — The whole chapter in one breath: describe data with a centre AND a spread, price uncertainty with honest base rates, and optimise by checking corners — three machines, zero invention required in the exam hall.

The Mean — Raw Data, Grouped Data and the Assumed Mean
• DEFINITION — The mean (arithmetic mean) of n observations x1, x2, ..., xn is their sum divided by n: mean = (x1 + x2 + ... + xn) / n. It is the balance point of the data: the total, shared out equally.
• EXAMPLE — Raw data: marks 12, 15, 18, 20, 25. Sum = 90, n = 5, mean = 90 / 5 = 18. Every value contributed; no value was ignored. That is both the mean's strength (it uses all the data) and its weakness (one extreme value drags it, as the salary story showed).
• DEFINITION — For grouped data with class marks xi (the mid-value of each class) and frequencies fi, the mean is mean = (sum of fi xi) / (sum of fi). The class mark represents every observation inside its class.
• EXAMPLE — Marks of 35 students: classes 0-10, 10-20, 20-30, 30-40, 40-50 with frequencies 5, 8, 12, 7, 3. Class marks are 5, 15, 25, 35, 45. The products fi xi are 25, 120, 300, 245, 135, giving sum fi xi = 825 and N = 35, so mean = 825 / 35 = 165/7, approximately 23.57. This table returns all chapter long — call it Table One.
• WORKED PATTERN — The four-column machine for any grouped mean: (1) write the class marks xi; (2) multiply each by its frequency to get fi xi; (3) add both columns; (4) divide. Never skip writing the table — most errors are arithmetic slips in invisible mental columns, and the table makes them visible.
• WHY the class mark is honest — inside a class we no longer know the exact values, so the mid-value is the fair representative: errors from values above and below it roughly cancel, which is exactly why grouped results are estimates, not exact values.
• DEFINITION — The assumed-mean method: pick any value A (usually the middle class mark), set di = xi - A, and compute mean = A + (sum of fi di) / N. Small deviations are easier to add than big class marks.
• EXAMPLE — Table One with A = 25: the deviations di are -20, -10, 0, 10, 20 and fi di are -100, -80, 0, 70, 60, summing to -50. Mean = 25 + (-50) / 35 = 25 - 10/7 = 165/7, approximately 23.57. Same answer, friendlier numbers.
• YOUR TURN — Find the mean of the first 10 natural numbers. Answer: sum = 55, n = 10, mean = 5.5. (Worth remembering: the mean of 1 to n is (n + 1) / 2.)
✔ KEY FORMULA — mean = (sum of fi xi) / N for grouped data, and mean = A + (sum of fi di) / N with di = xi - A for the assumed-mean method
⚠ EXAM TRAP — Using a class boundary (like 10 or 20) instead of the class MARK (the mid-value, like 15) in the fi xi column. And the silent killer: dividing by the number of classes instead of by N, the total frequency.

Step Deviation — The Shortcut That Shrinks Big Numbers
• DEFINITION — Step deviation codes each class mark as ui = (xi - A) / h, where A is an assumed mean and h is the common class width. The mean is then mean = A + ((sum of fi ui) / N) x h: compute in the small coded world, then decode.
• WHY it works — coding is just a change of ruler. Subtracting A shifts every value by the same amount, so the mean shifts by A too; dividing by h squeezes the scale, so the mean squeezes by h. Reversing both operations exactly restores the true mean — nothing is approximated here, the shortcut is exact.
• EXAMPLE — Table One again, with A = 25 and h = 10. The codes ui are -2, -1, 0, 1, 2; the products fi ui are -10, -8, 0, 7, 6, summing to -5. Mean = 25 + (-5 / 35) x 10 = 25 - 10/7 = 165/7, approximately 23.57 — a third method, the same answer, and the arithmetic never left single digits.
• WORKED PATTERN — Five steps: (1) choose A as the class mark of the middle (or highest-frequency) class; (2) read h, the class width; (3) code ui = (xi - A) / h — these should come out as small integers like -2, -1, 0, 1, 2; if they do not, A or h is wrong; (4) total fi ui; (5) decode with mean = A + (sum fi ui / N) x h.
• EXAMPLE — When does this matter? When class marks are ugly: classes 100-110, 110-120, ... with marks 105, 115, 125. Coding with A = 125 and h = 10 turns them into -2, -1, 0, 1, 2 and the whole problem becomes mental arithmetic.
• YOUR TURN — A coded calculation gives A = 40, h = 5 and (sum of fi ui) / N = 0.4. Find the mean. Answer: 40 + 0.4 x 5 = 42. The decode step — multiply by h, then add A — is where the marks live.
✔ KEY FORMULA — ui = (xi - A) / h and mean = A + ((sum of fi ui) / N) x h; the same coding returns for variance in a few sections
⚠ EXAM TRAP — Two classics: forgetting to multiply by h at the decode step (you report the coded mean as the answer), and trying step deviation when class widths are unequal — the method needs one common h.

Median and Mode — The Other Two Centres
• DEFINITION — The median is the middle value of ordered data: half the observations lie at or below it, half at or above. For n ordered values, if n is odd it is the ((n+1)/2)th value; if n is even it is the average of the (n/2)th and (n/2 + 1)th values.
• EXAMPLE — Ordered marks 3, 7, 9, 12, 15, 18, 20: n = 7, so the median is the 4th value, 12. The mean of the same data is also exactly 12 — the two centres agree here because this data is nearly symmetric; they part company exactly when the data is skewed.
• DEFINITION — For grouped data, the median is Median = l + ((N/2 - cf) / f) x h, where l is the lower limit of the median class, cf is the cumulative frequency of the class before it, f is its frequency and h is the class width. The median class is the first class whose cumulative frequency reaches N/2.
• EXAMPLE — Table One: N = 35, so N/2 = 17.5. Cumulative frequencies run 5, 13, 25, 32, 35, so the median class is 20-30 (the first to reach 17.5), with l = 20, cf = 13, f = 12, h = 10. Median = 20 + ((17.5 - 13) / 12) x 10 = 20 + 3.75 = 23.75.
• DEFINITION — The mode is the most frequent value — the crowd's favourite. For grouped data, Mode = l + ((f1 - f0) / (2 f1 - f0 - f2)) x h, where f1 is the frequency of the modal class (the tallest class) and f0, f2 are the frequencies of the classes just before and after it.
• EXAMPLE — Table One: the modal class is 20-30 with f1 = 12, f0 = 8, f2 = 7, l = 20, h = 10. Mode = 20 + ((12 - 8) / (24 - 8 - 7)) x 10 = 20 + (4/9) x 10 = 220/9, approximately 24.44. So Table One reads: mean 23.57, median 23.75, mode 24.44 — three centres, three slightly different stories, because the data leans a little.
• EXAMPLE — The chapter's first figure shows marks of 60 students in classes 0-10 up to 50-60 with frequencies 12, 18, 14, 9, 5, 2. There the mode is 16, the median is 20 and the mean is 133/6, approximately 22.17: a long right tail drags the mean upward while the mode stays with the crowd. In a right-skewed distribution the order is mode, then median, then mean; in a left-skewed one it reverses.
• WORKED PATTERN — Cumulative frequency is the engine of the median: build the cf column first, locate N/2 inside it, and only then open the formula. For the mode, identify the tallest class first and read its two neighbours — the formula is meaningless until those three frequencies are named.
• YOUR TURN — Find the median of 4, 8, 15, 16, 23, 42. Answer: n = 6 is even, so average the 3rd and 4th ordered values: (15 + 16) / 2 = 15.5. Note the 42 — an outlier — dragged the mean up to 18 but left the median calm at 15.5.
★ HIGHLIGHT — Karl Pearson's empirical relation for moderately skewed data: Mode is approximately 3 x Median - 2 x Mean. Check it on the figure's data: 3 x 20 - 2 x 22.17 = 15.67, close to the true mode 16. It is an approximation, not a law — but a superb way to audit a computed mode.
✔ KEY FORMULA — Median = l + ((N/2 - cf) / f) x h, and Mode = l + ((f1 - f0) / (2 f1 - f0 - f2)) x h, both anchored at the lower limit l of the special class
⚠ EXAM TRAP — Using (N + 1) / 2 to hunt the median class in grouped data — that recipe belongs to raw data; grouped data uses N/2 inside the cumulative frequencies. And in the mode formula, f0 and f2 are the neighbours of the MODAL class, not of any class you happen to like.

Variance and Standard Deviation — Measuring the Spread
• DEFINITION — The variance measures the average squared distance from the mean: variance = (sum of (xi - mean)^2) / n for raw data, and (sum of fi (xi - mean)^2) / N for grouped data. The standard deviation (SD) is its square root. Squaring makes every deviation positive and punishes big deviations harder — exactly what "spread" should mean.
• WHY SD is the headline and variance the engine — variance lives in squared units (marks squared means nothing to a teacher), while SD is back in the original units and can be compared with the mean directly. Compute with variance, report with SD.
• EXAMPLE — Raw data 2, 4, 6, 8, 10: mean = 6, deviations -4, -2, 0, 2, 4, squares 16, 4, 0, 4, 16, sum 40. Variance = 40 / 5 = 8, and SD = sqrt(8) = 2 sqrt(2), approximately 2.83. Small, tidy, and worth memorising as a reference example.
• DEFINITION — The shortcut formula skips the deviation column entirely: variance = (sum of fi xi^2) / N - (mean)^2, the mean of the squares minus the square of the mean. With step deviation it becomes variance = h^2 x [ (sum of fi ui^2) / N - ((sum of fi ui) / N)^2 ].
• EXAMPLE — Table One by the shortcut: sum of fi xi^2 = 125 + 1800 + 7500 + 8575 + 6075 = 24075, so (sum fi xi^2) / N = 24075 / 35, approximately 687.86, and (mean)^2 = (165/7)^2, approximately 555.61. Variance = 6480/49, approximately 132.24, and SD is approximately 11.50 marks.
• EXAMPLE — Same answer by step deviation: with A = 25 and h = 10, sum of fi ui^2 = 47 and sum of fi ui = -5, so variance = 100 x [ 47/35 - (1/7)^2 ] = 100 x (324/245) = 6480/49, approximately 132.24. Two routes, one number — in the exam, use whichever the given table makes cheaper.
• WORKED PATTERN — The spread audit, three questions in order: (1) do I have the mean right? (every spread formula eats the mean; a wrong mean poisons everything); (2) which formula matches the table I am given — deviations, squares, or codes?; (3) did I take the square root at the end if the question asks for SD, not variance?
• YOUR TURN — Find the variance and SD of 1, 2, 3, 4, 5. Answer: mean = 3, squared deviations 4, 1, 0, 1, 4 sum to 10, variance = 10 / 5 = 2, SD = sqrt(2), approximately 1.41.
✔ KEY FORMULA — variance = (sum of fi xi^2) / N - (mean)^2, and SD = sqrt(variance); in coded form, variance = h^2 x [ (sum fi ui^2) / N - ((sum fi ui) / N)^2 ]
⚠ EXAM TRAP — Dividing by N - 1 out of habit from other courses: the NCERT and IAT convention for variance and SD divides by N, the total frequency. And the mirror trap: computing variance perfectly, then forgetting the final square root when the question asked for standard deviation.

The Scaling Laws — Transforming Data Without Recomputing
• DEFINITION — If every observation is transformed by y = a x + b, then the centres and spreads obey: new mean = a x (old mean) + b; new variance = a^2 x (old variance); new SD = |a| x (old SD). The shift b moves the centre but leaves every measure of spread untouched; the multiplier a stretches the spread, and variance — being squared — stretches by a^2.
• WHY the shift cannot change spread — spread measures distances between values, and adding the same b to every value moves the whole dataset rigidly: all gaps stay identical. Only stretching (a) changes the gaps, and it multiplies every gap by |a|.
• EXAMPLE — A dataset has mean 10 and SD 4. Transform every value by y = 3x + 2 (say, converting and rescaling scores). New mean = 3 x 10 + 2 = 32. New SD = 3 x 4 = 12. New variance = 9 x 16 = 144 — note that 12^2 = 144, a built-in audit that the two answers agree.
• WORKED PATTERN — The three-line drill for any transformation question: (1) apply a and b to the mean; (2) apply only |a| to the SD; (3) apply only a^2 to the variance. Then cross-check: (new SD)^2 must equal the new variance. If it does not, one of the three lines used the wrong law.
• EXAMPLE — Grace marks: every student's mark is increased by 5. The mean rises by exactly 5, but the SD and variance do not move at all — the class is exactly as spread out as before, just shifted. Examiners adore asking this because intuition shouts "everything increases".
• YOUR TURN — A dataset has SD 5. Every value is doubled and then increased by 3. Find the new SD. Answer: the doubling stretches SD to 2 x 5 = 10; the +3 shift changes nothing. New SD = 10 (and the new variance is 100, not 28).
✔ KEY FORMULA — Under y = a x + b: mean scales by a then shifts by b; SD scales by |a| only; variance scales by a^2 only. Shifts never touch spread.
⚠ EXAM TRAP — The single most-tested error in this chapter: scaling the SD by a^2 as well (that law belongs to variance), or adding b to the SD (b belongs to the mean only). This exact trap is worked in the examples and tested in the question set below.

Coefficient of Variation and Mean Deviation
• DEFINITION — The coefficient of variation is CV = (SD / mean) x 100 percent. It expresses spread as a percentage of the centre, which makes it the only fair way to compare the consistency of two datasets whose means (or units) differ.
• WHY raw SD misleads — an SD of 5 marks is wild for a test averaging 20 and negligible for one averaging 500. SD alone cannot tell you which dataset is "more consistent"; CV can, because it asks "spread relative to what?"
• EXAMPLE — Series A: mean 50, SD 5, so CV = 10 percent. Series B: mean 80, SD 12, so CV = 15 percent. Series B has the bigger mean and the bigger SD, yet Series A is the more consistent one — its spread is a smaller fraction of its centre. Verdict: A wins on consistency.
• DEFINITION — The mean deviation about a centre c is the average of the absolute deviations: MD = (sum of |xi - c|) / n, taken about the mean or the median. It is the spread measure that treats all deviations linearly — no squaring — so outliers hurt it less than they hurt variance.
• EXAMPLE — For 2, 4, 6, 8, 10 about the mean 6: absolute deviations are 4, 2, 0, 2, 4, summing to 12, so MD = 12 / 5 = 2.4. Compare with the SD of the same data, 2.83: the SD is larger because squaring amplified the two big deviations of 4.
• WORKED PATTERN — Consistency questions have a fixed script: compute CV for each series, and the SMALLER CV is the more consistent (less variable) one. If a question gives SDs and means in different units (runs vs wickets, rupees vs dollars), CV is not optional — it is the only legal comparison.
• YOUR TURN — A batsman averages 40 with SD 8. Find his CV. Answer: (8 / 40) x 100 = 20 percent. (A second batsman averaging 60 with SD 9 has CV 15 percent — more consistent, despite the larger SD.)
⚠ EXAM TRAP — Declaring the series with the smaller SD "more consistent" when the means are far apart — that is precisely the error CV exists to catch. Also: CV is meaningless when the mean is near zero or the data straddles zero (temperatures in Celsius), because the ratio explodes or flips sign.

Probability — Sample Spaces, Events and the First Rules
• DEFINITION — A random experiment's sample space S is the set of all possible outcomes. An event is any subset of S. When all outcomes are equally likely, P(E) = (number of outcomes favourable to E) / (number of outcomes in S). Every probability lives in [0, 1]: 0 is impossible, 1 is certain.
• EXAMPLE — Two dice are thrown: S has 36 equally likely pairs. The event "sum is 8" holds for (2,6), (3,5), (4,4), (5,3), (6,2) — five outcomes — so P(sum 8) = 5/36. Notice the method: count the event, count the space, divide. Ninety percent of school probability is disciplined counting.
• DEFINITION — The complement rule: P(not E) = 1 - P(E). The addition rule: P(A or B) = P(A) + P(B) - P(A and B), where the subtracted term repairs the double-counted overlap. If A and B cannot happen together, the overlap is 0 and the rule simplifies — that special case gets its own section next.
• EXAMPLE — One card from 52: P(red or king). There are 26 red cards and 4 kings, but 2 cards (the red kings) are counted twice, so P = (26 + 4 - 2) / 52 = 28/52 = 7/13. Forget the overlap and you get 30/52 — a wrong answer that looks completely respectable.
• WORKED PATTERN — The three-step habit: (1) name the sample space and its size; (2) count the event with clean cases, watching for overlaps and order (does (3,5) differ from (5,3)? for two dice, yes); (3) divide, then sanity-check that the answer lies between 0 and 1 and that complementary events sum to 1.
• YOUR TURN — A single die is thrown. Find P(not a 6) using the complement rule. Answer: 1 - 1/6 = 5/6. The complement rule is the laziest powerful move in the chapter — whenever "at least one" or "not" appears, price the opposite event first.
✔ KEY FORMULA — P(E) = favourable / total for equally likely outcomes; P(not E) = 1 - P(E); P(A or B) = P(A) + P(B) - P(A and B)
⚠ EXAM TRAP — Adding probabilities for "or" without subtracting the overlap. The overlap error is invisible because the result still looks like a plausible fraction — audit every "or" with the question: can both happen at once? If yes, subtract.

Mutually Exclusive versus Independent — The Classic Confusion
• DEFINITION — Events A and B are mutually exclusive (disjoint) if they cannot occur together: P(A and B) = 0. They are independent if learning that one occurred changes nothing about the other: P(A and B) = P(A) x P(B), equivalently P(A given B) = P(A).
• WHY they are opposites, not synonyms — exclusivity is about the outcomes themselves (the events share no outcomes); independence is about information (one event's occurrence carries no news about the other). An exclusive pair is maximally informative: if A happened, B is now impossible. That is the opposite of independent.
• EXAMPLE — Exclusive: one die, A = {1, 2} and B = {5, 6}. They share no outcome, so P(A or B) = P(A) + P(B) = 1/3 + 1/3 = 2/3, with nothing to subtract. But they are not independent: P(A) x P(B) = 1/9, which is not 0.
• EXAMPLE — Independent: two separate events with P(A) = 0.3, P(B) = 0.5 and P(A and B) = 0.15. Check the product: 0.3 x 0.5 = 0.15 — the product condition holds exactly, so A and B are independent. Their union: P(A or B) = 0.3 + 0.5 - 0.15 = 0.65. Note the overlap is NOT zero here; independence never promises that.
• WORKED PATTERN — The two tests, kept separate: to test exclusivity, ask "can both happen together?" and check whether P(A and B) is 0. To test independence, multiply: does P(A) x P(B) equal P(A and B)? A question that hands you three probabilities is begging for the multiplication test.
• YOUR TURN — A coin is tossed twice. Let A = "first toss is a head" and B = "second toss is a head". Exclusive or independent? Answer: independent — the tosses do not share outcomes and neither influences the other; P(A and B) = 1/2 x 1/2 = 1/4. They are certainly not exclusive, since both heads happen a quarter of the time.
★ HIGHLIGHT — If A and B are mutually exclusive with both probabilities positive, they can NEVER be independent: exclusivity forces P(A and B) = 0, independence would force P(A and B) = P(A) x P(B), which is positive. One line, and half the confusion in this unit dies.
✔ KEY FORMULA — Exclusive: P(A and B) = 0 and P(A or B) = P(A) + P(B). Independent: P(A and B) = P(A) x P(B) and P(A or B) = P(A) + P(B) - P(A) x P(B)
⚠ EXAM TRAP — The phrase "the events do not affect each other, so they are mutually exclusive" is wrong twice over: no-effect is independence, and independent events usually CAN occur together. Read every such statement with the two tests, never with vibes.

Conditional Probability — Shrinking the Sample Space
• DEFINITION — The conditional probability P(A given B) is the probability of A inside the reduced world where B is known to have occurred: P(A given B) = P(A and B) / P(B), valid whenever P(B) is not 0. The word "given" shrinks the sample space to B and re-normalises.
• EXAMPLE — A card is drawn and seen to be a face card (jack, queen or king — 12 cards). What is the probability it is a king? The shrunken world has 12 cards, of which 4 are kings: P(king given face card) = 4/12 = 1/3. Compare the unconditional P(king) = 4/52 = 1/13 — the information "face card" changed the answer completely.
• EXAMPLE — Two dice are thrown and you are told at least one die shows a 5. What is the probability the sum is 8? The shrunken world is the 11 pairs containing a 5; among them, (3,5) and (5,3) give sum 8. Answer: 2/11. Notice how wrong the unconditioned count (5/36) would be here.
• DEFINITION — The multiplication rule rearranges the definition: P(A and B) = P(B) x P(A given B) = P(A) x P(B given A). It prices a chain of dependent events one conditional step at a time, and when the events are independent the conditional factor collapses to the plain probability — the multiplication rule contains independence as a special case.
• EXAMPLE — Two aces in two draws without replacement: P = (4/52) x (3/51) = 12/2652 = 1/221. The second factor is conditional — after one ace leaves, 3 aces remain among 51 cards. "Without replacement" in a problem statement is a flashing sign that the second probability must be recomputed.
• WORKED PATTERN — The shrink-first method for any "given" problem: (1) describe the reduced sample space (only outcomes where the given event holds); (2) count the target inside that reduced space; (3) divide the two counts. This counting route and the formula route always agree — use whichever the problem's numbers make easier, and use the other to check.
• YOUR TURN — A card drawn from a deck is known to be red. Find the probability that it is a heart. Answer: the shrunken world is the 26 red cards, 13 of which are hearts: 13/26 = 1/2.
✔ KEY FORMULA — P(A given B) = P(A and B) / P(B), and P(A and B) = P(A) x P(B given A); with replacement, conditionals collapse to plain probabilities
⚠ EXAM TRAP — P(A given B) and P(B given A) are different numbers with different shrunken worlds — swapping them is the single most consequential error in this unit, and the next section (Bayes) exists entirely because the swap is so tempting.

Bayes' Theorem — Running Probability Backwards
• DEFINITION — Bayes' theorem reverses a conditional: P(E given A) = P(A given E) x P(E) / P(A), where the denominator is rebuilt by total probability: P(A) = P(A given E) x P(E) + P(A given not E) x P(not E). In words: posterior = (likelihood x prior) / (all the ways the evidence could arise).
• WHY this section matters beyond marks — every "the test is 95 percent accurate, so a positive result means 95 percent chance I am ill" headline commits the swap error from the last section. Bayes is the correction, and its engine is the base rate: how common the condition was BEFORE the test spoke.
• WORKED PATTERN — The medical test, honestly priced. A condition affects 2 percent of a population (the base rate, or prior). A test detects it in 95 percent of those who have it (sensitivity: P(+ given condition) = 0.95) but also flags 10 percent of those who do not (false-alarm rate: P(+ given healthy) = 0.10, so specificity is 90 percent). You test positive. What is P(condition given +)?
• EXAMPLE — Build the tree (the chapter's second figure draws exactly this): the condition branch contributes 0.02 x 0.95 = 0.019 true positives; the healthy branch contributes 0.98 x 0.10 = 0.098 false alarms. Total positives: 0.019 + 0.098 = 0.117. Therefore P(condition given +) = 0.019 / 0.117 = 19/117, approximately 16.2 percent. Read that again: a "95 percent accurate" test, and a positive is right only about one time in six.
• WHY the answer is so low — the healthy crowd is 49 times larger than the ill crowd, so even a small false-alarm rate manufactures more false positives (0.098 of everyone) than the test finds true ones (0.019). The base rate is not a detail; when the condition is rare, the base rate IS the story.
• WORKED PATTERN — The Bayes machine, four moves: (1) write the prior P(E) and its complement; (2) attach the likelihoods P(A given E) and P(A given not E) as tree branches; (3) multiply along branches to get every route to the evidence; (4) the posterior is (your route) divided by (sum of all routes to the same evidence). If your tree's final branch products do not sum to 1, a branch is wrong.
• YOUR TURN — Same test, but now the condition affects half the population (prior 0.5). Find P(condition given +). Answer: routes are 0.5 x 0.95 = 0.475 and 0.5 x 0.10 = 0.05, so the posterior is 0.475 / 0.525 = 19/21, approximately 90.5 percent. Same test, wildly different verdict — the prior did that.
✔ KEY FORMULA — P(E given A) = P(A given E) x P(E) / [ P(A given E) x P(E) + P(A given not E) x P(not E) ]; the denominator is the law of total probability
⚠ EXAM TRAP — Answering with the sensitivity (95 percent) when the question asks for the posterior. The moment a problem gives a prevalence AND a test accuracy AND asks "given a positive, what is the chance", it is Bayes — reach for the tree, never for the headline number.

Random Variables — Distributions, Mean and Variance
• DEFINITION — A random variable X assigns a number to each outcome of an experiment. Its probability distribution lists each value xi with its probability pi, and the pi must satisfy two laws: every pi lies in [0, 1], and the pi sum to exactly 1. A distribution that breaks either law is not a distribution — checking the sum is a free error-detector.
• DEFINITION — The mean (expected value) of X is E(X) = sum of xi pi — the long-run average if the experiment repeats forever. The variance is Var(X) = E(X^2) - (E(X))^2, where E(X^2) = sum of xi^2 pi; the standard deviation is sqrt(Var(X)). Expectation is the centre of the distribution, variance its spread — Statistics has followed us into Probability, wearing the same formulas.
• EXAMPLE — Let X take values 0, 1, 2 with probabilities 0.2, 0.5, 0.3 (check: they sum to 1). E(X) = 0 x 0.2 + 1 x 0.5 + 2 x 0.3 = 1.1. E(X^2) = 0 x 0.2 + 1 x 0.5 + 4 x 0.3 = 1.7. Var(X) = 1.7 - (1.1)^2 = 1.7 - 1.21 = 0.49, so SD = 0.7. Clean numbers, and the same three-step rhythm as every mean-variance problem before it.
• WORKED PATTERN — The three-column machine: build columns for xi, pi, xi pi and xi^2 pi side by side. Sum the third column for E(X), sum the fourth for E(X^2), then combine. The table prevents the classic disaster of computing E(X^2) as (E(X))^2 — they are different objects and their difference is precisely the variance.
• EXAMPLE — A fair die: X is the face shown, each with probability 1/6. E(X) = (1 + 2 + 3 + 4 + 5 + 6) / 6 = 21/6 = 3.5. You will never roll a 3.5 — expectation is a long-run average, not a prediction of a single trial, and confusing the two is a conceptual trap examiners probe with "which value is most likely" style follow-ups (here every face is equally likely; 3.5 is not even a face).
• YOUR TURN — For the die above, E(X^2) = (1 + 4 + 9 + 16 + 25 + 36) / 6 = 91/6. Find Var(X). Answer: 91/6 - (3.5)^2 = 91/6 - 49/4 = (182 - 147) / 12 = 35/12, approximately 2.92.
✔ KEY FORMULA — E(X) = sum of xi pi; Var(X) = E(X^2) - (E(X))^2 = sum of xi^2 pi - (sum of xi pi)^2; and the probabilities in any distribution sum to 1
⚠ EXAM TRAP — Writing Var(X) = E(X^2) and forgetting to subtract (E(X))^2 — the subtraction is the whole formula. Second trap: accepting a "distribution" whose probabilities sum to 0.9 or 1.1; the question is testing whether you check.

Bernoulli Trials and the Binomial Distribution
• DEFINITION — A Bernoulli trial is a single experiment with exactly two outcomes: success (probability p) and failure (probability q = 1 - p). Repeat it under three strict conditions — a fixed number n of trials, independence between trials, and the same p every trial — and the number of successes X follows the binomial distribution: P(X = k) = C(n, k) x p^k x q^(n-k).
• WHY each condition is load-bearing — fixed n tells you how many trials to count; independence lets the probabilities multiply; constant p keeps every arrangement of k successes equally priced at p^k q^(n-k), so the only remaining question is how many arrangements exist — and that count is exactly C(n, k).
• EXAMPLE — A fair die is rolled 4 times; find P(exactly 2 sixes). Here n = 4, p = 1/6, q = 5/6, k = 2: P = C(4, 2) x (1/6)^2 x (5/6)^2 = 6 x (1/36) x (25/36) = 150/1296 = 25/216, approximately 0.116. The C(4, 2) = 6 counts the six orders in which the two sixes can appear — omitting it is the most common binomial error.
• DEFINITION — The binomial's centre and spread need no table: mean = n p, variance = n p q, SD = sqrt(n p q). A marksman with p = 0.3 over n = 10 shots expects np = 3 hits on average, with variance 10 x 0.3 x 0.7 = 2.1 and SD approximately 1.45.
• WORKED PATTERN — The applicability audit before touching the formula: (1) is n fixed in advance? (2) exactly two outcomes per trial? (3) is p the same on every trial? (4) are trials independent? Four yeses: binomial. Any no — especially drawing without replacement from a small bag, where p changes after every draw — and the formula is illegal, however tempting.
• YOUR TURN — A student guesses all 20 true-or-false questions on a quiz (p = 0.5 each). Find the expected score and the variance of the score. Answer: mean = 20 x 0.5 = 10; variance = 20 x 0.5 x 0.5 = 5 (SD approximately 2.24). Pure guessing centres you on half marks with a spread of about 2 — the mathematics of why guessing is a strategy, not a plan.
✔ KEY FORMULA — P(X = k) = C(n, k) p^k q^(n-k) with q = 1 - p; mean = np, variance = npq. For "at least one success", use 1 - q^n
⚠ EXAM TRAP — Three regulars: forgetting the C(n, k) factor; swapping p and q mid-problem (define success first, in writing); and grinding out "at least one" by adding P(1) + P(2) + ... when the complement 1 - P(0) does it in one line.

Linear Programming — The Corner-Point Method
• DEFINITION — A linear programming problem (LPP) asks for the maximum or minimum of a linear objective function Z = a x + b y subject to linear constraints and the non-negativity conditions x, y are at least 0. The set of points satisfying every constraint is the feasible region — always a convex polygon (possibly unbounded, possibly empty).
• DEFINITION — The corner-point theorem: if an optimum exists, it is attained at a corner (vertex) of the feasible region. The interior is never better than the best corner — so an infinite search collapses to checking finitely many points.
• WORKED PATTERN — Maximise Z = 3x + 5y subject to x + 2y is at most 8, 3x + 2y is at most 12, x and y at least 0 (the chapter's third figure draws this). Corners: (0, 0) from the axes; (4, 0) where 3x + 2y = 12 meets y = 0; (0, 4) where x + 2y = 8 meets x = 0; and (2, 3) where the two constraint lines cross (subtracting the equations gives 2x = 4). Evaluate Z: 0, 12, 20, and 21. Maximum Z = 21 at (2, 3).
• WORKED PATTERN — The five-step routine for any LPP: (1) draw each constraint line and shade the correct side (test the origin); (2) mark the feasible region; (3) list every corner, solving pairs of lines for the crossing ones; (4) evaluate Z at each corner in a small table; (5) read off the best value AND the point where it occurs — questions ask for both.
• EXAMPLE — Two flags the routine must raise. If the feasible region is empty (constraints contradict each other), the problem is infeasible — no solution exists, and saying so IS the answer. If the region is unbounded in the direction the objective grows, a maximum may not exist at all: always check whether Z can keep growing along the open side before declaring a corner the winner.
• YOUR TURN — Keep the same feasible region as the worked pattern but change the objective to Z = x + 2y. Evaluate the corners. Answer: (0, 0) gives 0, (4, 0) gives 4, (2, 3) gives 8, (0, 4) gives 8 — a tie between two corners, which means every point on the edge joining (2, 3) and (0, 4) is optimal: when Z's direction is parallel to a boundary edge, that whole edge wins.
✔ KEY FORMULA — There is no single formula; the theorem is the tool: optimum of a linear objective over a polygonal feasible region, if it exists, sits at a corner. List corners, evaluate Z, compare
⚠ EXAM TRAP — Testing a random interior point (the centre is never the answer in an LPP), forgetting the non-negativity constraints when listing corners, and reporting the maximum VALUE without the point — half the marks live in the coordinates.

Formula Sheet — Every Result on One Screen
✔ Raw mean = (sum of xi) / n; grouped mean = (sum of fi xi) / N; assumed mean: mean = A + (sum of fi di) / N with di = xi - A
✔ Step deviation: ui = (xi - A) / h and mean = A + ((sum of fi ui) / N) x h
✔ Grouped median = l + ((N / 2 - cf) / f) x h, using the first class whose cumulative frequency reaches N / 2
✔ Grouped mode = l + ((f1 - f0) / (2 f1 - f0 - f2)) x h, with f0 and f2 the neighbours of the modal class
✔ Variance = (sum of fi xi^2) / N - (mean)^2; SD = sqrt(variance); by step deviation, variance = h^2 x [ (sum fi ui^2) / N - ((sum fi ui) / N)^2 ]
✔ Scaling under y = a x + b: new mean = a (mean) + b; new SD = |a| (SD); new variance = a^2 (variance); a shift b alone changes no spread
✔ Coefficient of variation = (SD / mean) x 100 percent — the smaller CV is the more consistent series; mean deviation = (sum of |xi - c|) / n about the mean or median
✔ P(E) = favourable / total (equally likely); P(not E) = 1 - P(E); P(A or B) = P(A) + P(B) - P(A and B)
✔ Exclusive events: P(A and B) = 0. Independent events: P(A and B) = P(A) x P(B). Non-trivial exclusive events are never independent
✔ Conditional: P(A given B) = P(A and B) / P(B); multiplication rule: P(A and B) = P(A) x P(B given A)
✔ Bayes: P(E given A) = P(A given E) P(E) / [ P(A given E) P(E) + P(A given not E) P(not E) ] — prior times likelihood, over all routes to the evidence
✔ Random variable: E(X) = sum of xi pi; Var(X) = E(X^2) - (E(X))^2; the pi sum to 1
✔ Binomial: P(X = k) = C(n, k) p^k q^(n - k), q = 1 - p; mean = np; variance = npq; at least one success = 1 - q^n
✔ Linear programming: the optimum, if it exists, is at a corner of the feasible region — evaluate Z at every corner and compare

Common Mistakes and Exam Traps
• Mistake 1: Scaling the standard deviation by a^2 when data is multiplied by a. Why it is wrong: a^2 is the variance law; the SD is a square-rooted quantity and stretches only by |a|. Correct principle: y = a x + b sends mean to a(mean) + b, SD to |a| x SD, variance to a^2 x variance — three different laws for three different objects.
• Mistake 2: Adding the shift b to the SD. Why it is wrong: spread is built from gaps between values, and a rigid shift changes no gap. Correct principle: shifts move centres only; if every value gains 5, the mean gains 5 and the SD gains nothing.
• Mistake 3: Hunting the grouped median class with (N + 1) / 2. Why it is wrong: that recipe locates the middle item of raw data; grouped data has no items, only cumulative frequencies, and its formula is built around N / 2. Correct principle: raw data uses (N + 1) / 2 positions; grouped median uses the first cf reaching N / 2.
• Mistake 4: Feeding the mode formula the frequencies of the wrong classes. Why it is wrong: f0 and f2 must be the immediate neighbours of the modal class; any other pair corrupts the interpolation. Correct principle: name the modal class first, then read its left and right neighbours, then compute.
• Mistake 5: Comparing consistency by comparing raw SDs. Why it is wrong: an SD of 9 around a mean of 45 is relatively larger than an SD of 6 around 60, even though 9 beats 6 in absolute size. Correct principle: consistency comparisons run on CV = (SD / mean) x 100 percent; smaller CV wins.
• Mistake 6: Writing P(A or B) = P(A) + P(B) unconditionally. Why it is wrong: when both events can occur together, the overlap is counted twice — red-or-king becomes 30/52 instead of the true 28/52. Correct principle: always subtract P(A and B); it vanishes only for mutually exclusive events.
• Mistake 7: Treating "mutually exclusive" and "independent" as the same idea. Why it is wrong: exclusive events share no outcomes and are maximally dependent on each other, while independent events typically overlap freely. Correct principle: test exclusivity by P(A and B) = 0 and independence by P(A and B) = P(A) x P(B) — two separate tests for two separate ideas.
• Mistake 8: Swapping P(A given B) with P(B given A). Why it is wrong: the two conditionals shrink the world to different sets — P(king given face card) is 1/3, but P(face card given king) is 1. Correct principle: the event after "given" owns the denominator; reversing the question needs Bayes and fresh numbers.
• Mistake 9: Quoting the test's sensitivity as the answer to a Bayes question. Why it is wrong: sensitivity is P(positive given condition); the question asks P(condition given positive), and when the base rate is 2 percent the honest answer collapses to about 16 percent. Correct principle: draw the tree, multiply along branches, and divide your route by all routes to the evidence.
• Mistake 10: Applying the binomial formula to draws without replacement from a small set. Why it is wrong: each draw changes the composition, so p is not constant and trials are not independent — the formula's entry conditions fail. Correct principle: run the four-point audit (fixed n, two outcomes, constant p, independence) before any C(n, k) p^k q^(n-k) appears; price changing-probability chains with the multiplication rule instead.
• Mistake 11: In linear programming, evaluating the objective at a convenient interior point. Why it is wrong: the corner-point theorem guarantees the optimum, if it exists, at a vertex; interior points are never better than the best corner. Correct principle: list every corner of the feasible region, tabulate Z there, and also flag the unbounded and infeasible cases before declaring a winner.

Worked Examples — Basic to Challenging
• Example 1 — Problem: For Table One (classes 0-10 to 40-50, frequencies 5, 8, 12, 7, 3), find the mean by step deviation.
• Given: Class marks 5, 15, 25, 35, 45 and a common class width h = 10.
• Principle: Code with ui = (xi - A) / h around A = 25, compute in the coded world, then decode with mean = A + ((sum fi ui) / N) x h.
• Steps: Codes: -2, -1, 0, 1, 2. Products fi ui: -10, -8, 0, 7, 6, summing to -5, with N = 35. Mean = 25 + (-5 / 35) x 10 = 25 - 10/7.
• Answer: 165/7, approximately 23.57.
• Reasoning: The direct method (sum fi xi = 825, divided by 35) gives the identical 165/7 — step deviation is a labour-saving device, never an approximation.
• Mistake to avoid: Stopping at the coded value -5/35 and reporting it as the mean; the decode (times h, plus A) is part of the method, not an optional garnish.
• Example 2 — Problem: For Table One, find the median and the mode.
• Given: N = 35; cumulative frequencies 5, 13, 25, 32, 35; the tallest class is 20-30.
• Principle: Median = l + ((N/2 - cf) / f) x h from the median class; Mode = l + ((f1 - f0) / (2 f1 - f0 - f2)) x h from the modal class.
• Steps: N/2 = 17.5 first falls inside 20-30, so l = 20, cf = 13, f = 12, h = 10: Median = 20 + (4.5 / 12) x 10 = 23.75. Mode with f1 = 12, f0 = 8, f2 = 7: Mode = 20 + (4 / 9) x 10 = 24.44.
• Answer: Median 23.75; Mode 220/9, approximately 24.44.
• Reasoning: The order mean (23.57) below median (23.75) below mode (24.44) signals a slight left lean in the data — the three centres together describe the shape, not just the centre.
• Mistake to avoid: Choosing 10-20 as the median class because cf jumps past 17.5 "somewhere nearby" — the rule is the FIRST class whose cumulative frequency reaches N/2, and that is 20-30 with cf before it equal to 13.
• Example 3 — Problem: For Table One, find the variance and standard deviation.
• Given: Class marks and frequencies as before; sum of fi xi^2 = 24075 (built from 5 x 25, 8 x 225, 12 x 625, 7 x 1225, 3 x 2025); mean = 165/7.
• Principle: Variance = (sum of fi xi^2) / N - (mean)^2; SD is its square root.
• Steps: (sum fi xi^2) / N = 24075 / 35, approximately 687.86. (mean)^2 = (165/7)^2, approximately 555.61. Variance = 687.86 - 555.61, approximately 132.24 (exactly 6480/49). SD = sqrt(132.24), approximately 11.50.
• Answer: Variance 6480/49, approximately 132.24; SD approximately 11.50 marks.
• Reasoning: Audit by step deviation: variance = 100 x [ 47/35 - (1/7)^2 ] = 6480/49 — the same number, so the squares column and the codes agree.
• Mistake to avoid: Reporting 132.24 as "the standard deviation" — that is the variance; the question's unit (marks, not marks-squared) tells you the square root is still owed.
• Example 4 — Problem: A dataset has mean 20 and SD 6. Every value is transformed by y = 2x + 10 (a scaling plus grace marks). Find the new mean, variance and SD.
• Given: a = 2, b = 10; old mean 20, old SD 6, old variance 36.
• Principle: The scaling laws: mean takes a then b; SD takes |a| only; variance takes a^2 only.
• Steps: New mean = 2 x 20 + 10 = 50. New SD = 2 x 6 = 12. New variance = 4 x 36 = 144. Audit: 12^2 = 144 — the SD and variance agree.
• Answer: Mean 50, SD 12, variance 144.
• Reasoning: No raw data was needed — transformation questions are pure law-application, which is why examiners set them: they separate students who know the laws from students who recompute.
• Mistake to avoid: The double error of new SD = 2 x 6 + 10 = 22 (adding b to the SD) or new variance = 2 x 36 = 72 (scaling by a instead of a^2). The audit (new SD)^2 = new variance catches both.
• Example 5 — Problem: A condition affects 2 percent of a population. A test has sensitivity 95 percent and a false-alarm rate of 10 percent on healthy people. A random person tests positive. Find the probability they have the condition.
• Given: Prior P(condition) = 0.02; P(+ given condition) = 0.95; P(+ given healthy) = 0.10.
• Principle: Bayes' theorem on a tree: posterior = (route to a true positive) / (all routes to a positive).
• Steps: True-positive route: 0.02 x 0.95 = 0.019. False-alarm route: 0.98 x 0.10 = 0.098. All positives: 0.019 + 0.098 = 0.117. Posterior: 0.019 / 0.117 = 19/117.
• Answer: 19/117, approximately 16.2 percent.
• Reasoning: The healthy group is 49 times larger, so its 10 percent false-alarm rate produces about five times as many positives as the condition itself. Base rates dominate verdicts whenever the condition is rare.
• Mistake to avoid: Answering 95 percent (the sensitivity) — that is P(+ given condition), the forward conditional. The question asks the reverse conditional, and the reverse needs the tree.
• Example 6 — Problem: Two dice are thrown. Given that at least one die shows a 5, find the probability that the sum is 8.
• Given: The condition restricts the world to pairs containing a 5: (1,5), (2,5), (3,5), (4,5), (5,5), (6,5), (5,1), (5,2), (5,3), (5,4), (5,6) — 11 pairs.
• Principle: Conditional probability by shrinking the sample space, then counting inside it.
• Steps: Inside the 11-pair world, sum 8 occurs for (3,5) and (5,3) only: 2 favourable outcomes. Probability = 2/11.
• Answer: 2/11.
• Reasoning: Formula check: P(sum 8 and a 5 shows) = 2/36 and P(a 5 shows) = 11/36, whose ratio is 2/11 — the counting and formula routes agree, as they always must.
• Mistake to avoid: Answering 5/36 (the unconditional P(sum 8)) or 2/36 (forgetting to re-normalise after shrinking). The word "given" changes the denominator — that is its entire job.
• Example 7 — Problem: A random variable X takes values 1, 2, 3 with probabilities 1/6, 1/2, 1/3. Find E(X), Var(X) and the SD.
• Given: A valid distribution (probabilities sum to 1/6 + 1/2 + 1/3 = 1).
• Principle: E(X) = sum of xi pi; Var(X) = E(X^2) - (E(X))^2.
• Steps: E(X) = 1 x (1/6) + 2 x (1/2) + 3 x (1/3) = 1/6 + 1 + 1 = 13/6. E(X^2) = 1 x (1/6) + 4 x (1/2) + 9 x (1/3) = 1/6 + 2 + 3 = 31/6. Var = 31/6 - (13/6)^2 = 31/6 - 169/36 = (186 - 169) / 36 = 17/36. SD = sqrt(17) / 6.
• Answer: E(X) = 13/6, approximately 2.17; Var(X) = 17/36, approximately 0.47; SD approximately 0.69.
• Reasoning: The expectation sits between 2 and 3, pulled toward 3 by its heavy 1/3 probability, and the modest variance confirms the values huddle near the centre.
• Mistake to avoid: Computing E(X^2) as (E(X))^2 = 169/36 — then the "variance" comes out 0. The two quantities differ exactly by the variance; keep their columns separate.
• Example 8 — Problem: Maximise Z = 3x + 5y subject to x + 2y at most 8, 3x + 2y at most 12, x and y at least 0.
• Given: A bounded feasible region with corners where constraint lines meet the axes and each other.
• Principle: The corner-point theorem: evaluate Z at every corner; the best corner is the optimum.
• Steps: Corners: (0, 0) gives Z = 0; (4, 0), from 3x + 2y = 12 on y = 0, gives 12; (0, 4), from x + 2y = 8 on x = 0, gives 20; the crossing of the two lines (subtract: 2x = 4, so x = 2, y = 3) gives 3 x 2 + 5 x 3 = 21. Largest value: 21.
• Answer: Maximum Z = 21 at (x, y) = (2, 3).
• Reasoning: Brute-force scanning of the region on a fine grid confirms no interior or edge point beats 21 — the theorem's promise holds, as it must for linear objectives.
• Mistake to avoid: Testing the "middle" of the region or only the axis corners and missing (2, 3): the crossing point of the two constraint lines is a corner too, and here it is the winner.

Practice Questions — Self-Test Set
• Q1. Find the mean of 5, 8, 12, 15, 20, 24.
• Q2. Find the median of 9, 3, 14, 7, 21, 11, 5.
• Q3. Class A has mean 60 and SD 6; Class B has mean 45 and SD 9. Which class is more consistent, and why?
• Q4. A bag holds 4 red and 6 blue balls. Two balls are drawn at random without replacement. Find the probability that both are red.
• Q5. Events A and B satisfy P(A) = 0.4, P(B) = 0.5 and P(A and B) = 0.2. Are A and B independent? Also find P(A or B).
• Q6. Box A contains 3 red and 2 white balls; Box B contains 2 red and 3 white balls. A box is chosen at random (equal chance) and one ball is drawn, which turns out red. Find the probability that it came from Box A.
• Q7. A fair coin is tossed 3 times. Find the probability of getting at least one head.
• Q8. Minimise Z = 2x + 3y subject to x + y is at least 4, x is at most 6, y is at most 6, and x, y are at least 0. State the minimum value and the point where it occurs.

▸ Answer Key with Explanations
• A1. 14. Route: sum = 5 + 8 + 12 + 15 + 20 + 24 = 84, and 84 / 6 = 14. Misconception watch: dividing by 5 (miscounting the data) or averaging only the extremes ((5 + 24) / 2 = 14.5) — the mean uses every value exactly once.
• A2. 9. Route: order the data — 3, 5, 7, 9, 11, 14, 21 — and take the 4th of 7 values: 9. Misconception watch: picking the middle of the UNSORTED list (7, the 4th printed value) — the median is defined on ordered data; sorting is not a courtesy step, it is the definition.
• A3. Class A is more consistent. Route: CV of A = (6 / 60) x 100 = 10 percent; CV of B = (9 / 45) x 100 = 20 percent; smaller CV means relatively steadier. Misconception watch: answering B because "9 is a bigger SD so B varies more, so A" by luck, or answering B outright by comparing SDs in the wrong direction — the comparison must be relative to the means, which is the entire point of CV.
• A4. 2/15. Route: multiplication rule with re-computed conditionals: (4/10) x (3/9) = 12/90 = 2/15. Misconception watch: using (4/10) x (4/10) — that is the WITH-replacement price; the words "without replacement" shrink both the red count and the total for the second draw.
• A5. Yes, independent; P(A or B) = 0.7. Route: check the product — P(A) x P(B) = 0.4 x 0.5 = 0.2, which equals P(A and B), so the independence test passes. Then P(A or B) = 0.4 + 0.5 - 0.2 = 0.7. Misconception watch: refusing independence because "the events overlap, so they cannot be independent" — overlap is irrelevant to independence; only the product test decides. (It is EXCLUSIVE events that cannot afford overlap.)
• A6. 3/5. Route: Bayes with equal priors. Route from A: (1/2) x (3/5) = 3/10. Route from B: (1/2) x (2/5) = 2/10. Posterior: (3/10) / (3/10 + 2/10) = 3/5. Misconception watch: answering 3/5 "because Box A has 3 red balls out of 5 total" by coincidence of numbers — the reasoning must run through the two routes; with unequal priors the naive fraction fails while the tree still works.
• A7. 7/8. Route: complement — P(at least one head) = 1 - P(no heads) = 1 - (1/2)^3 = 1 - 1/8 = 7/8. Misconception watch: adding P(one head) + P(two heads) + P(three heads) the long way and slipping on the binomial coefficients (the long way gives 3/8 + 3/8 + 1/8, which does check the complement — use it as the audit, not the method).
• A8. Minimum Z = 8 at (4, 0). Route: the feasible region's corners are (4, 0), (6, 0), (6, 6), (0, 6), (0, 4), with Z values 8, 12, 30, 18, 12 — the smallest is 8 at (4, 0). Misconception watch: testing (0, 0), which violates x + y at least 4 and is not feasible at all — a point must pass EVERY constraint before its Z value means anything. Note also the direction: with "at least" constraints the region opens outward, and it is the caps x, y at most 6 that close it here.

Chapter Summary, Revision Checklist and Self-Assessment
• Summary: Statistics runs on two questions — where is the centre, and how wide is the spread? The mean (raw, grouped, assumed-mean and step-deviation routes), median and mode answer the first; variance, SD, mean deviation and the scaling laws answer the second; and the coefficient of variation turns spread into a percentage so different datasets can be compared fairly.
• Summary: Probability prices uncertainty by counting: favourable over total, complements for "at least" and "not", addition with the overlap subtracted. Mutually exclusive and independent are different tests (zero overlap versus product rule), conditional probability shrinks the world to the given event, and Bayes' theorem reverses a conditional honestly by weighing routes against the base rate.
• Summary: Random variables import the centre-and-spread machinery into probability — E(X) and Var(X) = E(X^2) - (E(X))^2 — and the binomial distribution packages repeated Bernoulli trials into P(X = k) = C(n, k) p^k q^(n-k) with mean np and variance npq. Linear programming closes the chapter: optimise a linear objective by evaluating it at the corners of the feasible region.
• Revision checklist — I can build the fx and cumulative-frequency tables for grouped data and extract mean, median, mode and SD from them without hesitating.
• Revision checklist — I can state the three scaling laws (mean, SD, variance under y = a x + b) and run the audit (new SD)^2 = new variance.
• Revision checklist — I compare consistency with CV, never with naked SDs, and I can say why mean deviation and SD can disagree about outliers.
• Revision checklist — I run the two tests separately: exclusivity by P(A and B) = 0, independence by the product rule, and I know non-trivial exclusive events are never independent.
• Revision checklist — On any "given" I shrink the sample space first; on any reverse conditional I draw the Bayes tree and check that branch products sum to 1.
• Revision checklist — I audit binomial problems with the four conditions (fixed n, two outcomes, constant p, independence) and use 1 - q^n for "at least one".
• Revision checklist — For an LPP I shade the feasible region, list ALL corners including line-crossings, tabulate Z, and flag infeasible or unbounded cases before answering.
• Self-assessment: Score your practice set. 7-8 correct: exam-ready — the machines are reflexes; revisit in a week. 5-6: solid; drill the sections behind your misses, especially any base-rate or scaling slip. 3-4: rebuild from the Formula Sheet, re-deriving each result once on Table One, then re-test. Below 3: restart from the Mean section and work forward slowly — this chapter rewards methodical rebuilding more than any other.
<!-- END math_ch_14 detailedStudyNotes -->
