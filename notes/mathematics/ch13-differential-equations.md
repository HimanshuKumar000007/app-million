<!-- BEGIN math_ch_13 detailedStudyNotes -->
Introduction — An Equation That Speaks in Derivatives
• Every equation you have solved so far has unknown numbers. A differential equation (DE) is bolder: its unknown is an entire function, and the clues it gives are about that function's rates of change. Solve it and you do not get a number — you get the curve itself, the population itself, the temperature itself.
• DEFINITION — A differential equation is an equation involving one or more derivatives of a dependent variable with respect to an independent variable (possibly alongside the variables themselves). This chapter uses ordinary DEs only: one independent variable, written dy/dx, d^2y/dx^2 and so on. If y depends on x alone, it is an ordinary DE; partial derivatives are out of scope.
• EXAMPLE — Three faces of the same idea: dy/dx = 3y (a quantity whose growth rate is triple its current size), dT/dt = -k(T - 20) (a hot object cooling towards a 20-degree room), and d^2s/dt^2 = -g (falling motion: acceleration is constant). Each sentence about a rate becomes an equation about a derivative.
• WHY the picture matters — read the figure with this section: it plots the slope field of dy/dx = x + y. The DE does not hand you a curve; it hands you a direction at every point, a tiny compass needle saying "if you pass through here, you must head this way". A solution is a curve that threads through the field obeying every needle it touches. Keep that image and every method in this chapter becomes "how do I find the thread".
• WHY this chapter is guaranteed marks — the IAT asks the same small cast: read the order and degree, form the DE of a family, solve by one of three methods (separable, homogeneous, linear), and run one growth-or-cooling application. Four patterns, endlessly re-costumed. Drill the cast and the chapter pays out in minutes.
• The map of the chapter: first the two labels (order, degree) and what a solution means, then how to check a claimed solution and how to build a DE from a family of curves. Then the three solving machines, a flip trick for stubborn equations, and a shortcut-spotting section. Finally the applications — growth, decay and cooling — where the chapter meets the real world.
★ HIGHLIGHT — The whole chapter in one breath: a DE is a rule about slopes; a solution is any curve that obeys the rule everywhere; the order tells you how many arbitrary constants the full solution family carries. Everything else is technique.

Order and Degree — The Two Labels of a DE
• DEFINITION — The order of a DE is the order of the highest derivative appearing in it. dy/dx + y = x is order 1; d^2y/dx^2 + y = 0 is order 2. Nothing else about the equation matters for the order — not powers, not coefficients, just the highest derivative present.
• DEFINITION — The degree of a DE is the power (exponent) of the highest-order derivative, counted only when the equation is a polynomial equation in the derivatives. In (d^2y/dx^2)^2 + (dy/dx)^3 + y = 0 the highest derivative is d^2y/dx^2 and its power is 2, so the degree is 2 — the cube on dy/dx is decoration.
• WHY the polynomial condition exists — a "power" only makes sense if the derivative appears as a plain algebraic factor. If a derivative hides inside sin, e, ln or a root that cannot be cleared, there is no honest exponent to report, and the degree is simply not defined. "Not defined" is a legitimate exam answer, not a failure.
• EXAMPLE — d^2y/dx^2 + sin(dy/dx) = 0. Order: 2, from d^2y/dx^2. Degree: not defined, because dy/dx sits inside sin, and no algebra turns sin(dy/dx) into a polynomial term. This exact shape is the IAT's favourite degree trap.
• EXAMPLE — sqrt(1 + (dy/dx)^2) = d^2y/dx^2. Square both sides: 1 + (dy/dx)^2 = (d^2y/dx^2)^2. Now the equation is polynomial in the derivatives, the highest derivative carries power 2, so order 2, degree 2. Roots that CAN be cleared by raising to a power do not block the degree.
• EXAMPLE — (dy/dx)^5 + d^2y/dx^2 = 0. The eye is dragged to the 5, but degree belongs to the highest ORDER derivative: d^2y/dx^2 appears to power 1, so order 2, degree 1. The (dy/dx)^5 is bait.
• EXAMPLE — d^3y/dx^3 + (dy/dx)^2 = x. Highest derivative is the third, appearing to the first power: order 3, degree 1. The squared first derivative is again decoration — order first, then the degree of THAT derivative.
• WORKED PATTERN — The label drill, three steps: (1) clean the equation — clear roots and fractional powers of derivatives by raising both sides to suitable powers, when possible; (2) check that no derivative survives inside a trig, exponential or log function — if one does, degree is not defined, full stop; (3) read the order off the highest derivative, then read the degree off that same derivative's exponent.
• YOUR TURN — State the order and degree of (d^3y/dx^3)^2 + (dy/dx)^4 + y = x. Answer: order 3 (the third derivative is present), degree 2 (its power is 2; the fourth power on dy/dx is the same bait as the last example).
⚠ EXAM TRAP — Two mirror errors: reporting a degree for an equation containing sin(dy/dx), e^(dy/dx) or ln(dy/dx) (impossible — degree is not defined), and reading the degree from the biggest exponent anywhere in the equation instead of the exponent of the highest-order derivative. Clean first, check for trapped derivatives, then read the labels off the top derivative only.

Solutions — General, Particular and the Constant Count
• DEFINITION — A solution of a DE is a function that satisfies the equation identically when substituted into it — every x, not just one point. A general solution is the complete family: it contains as many independent arbitrary constants as the order of the DE. A particular solution is one member of the family, with the constants pinned down by extra conditions (usually an initial value like y(0) = 3).
• EXAMPLE — dy/dx = 2y has general solution y = C e^(2x): one arbitrary constant C, matching order 1. Give the condition y(0) = 3 and C is forced: 3 = C e^0 = C, so the particular solution is y = 3 e^(2x). One condition, one constant, one curve.
• EXAMPLE — d^2y/dx^2 + y = 0 has general solution y = A cos x + B sin x: two constants A and B, matching order 2. Pinning both needs two conditions, for instance y(0) and y'(0).
• WHY the count always matches — solving a DE of order n means integrating n times (in spirit), and every integration donates exactly one arbitrary constant. Order 1, one integration, one constant; order 2, two constants. The count is not a coincidence — it is bookkeeping of the integrations.
• WORKED PATTERN — To predict a family question: count the arbitrary constants in the given family; that number is the order of the DE the family satisfies, and it tells you how many times you will differentiate when forming the DE (next sections put this to work).
• YOUR TURN — Write the particular solution of dy/dx = cos x with y(0) = 5. Answer: integrating, the general solution is y = sin x + C; the condition gives 5 = sin 0 + C = C, so y = sin x + 5.
⚠ EXAM TRAP — Presenting a family with fewer constants than the order as "the general solution" — y = A cos x alone is NOT the general solution of y'' + y = 0, because the sin x family has been lost. If the constant count is short of the order, the solution is incomplete, however pretty it looks.

Verifying a Solution — Differentiation as the Lie Detector
• DEFINITION — To verify that a function solves a DE, differentiate the candidate as many times as the DE demands, substitute the function and its derivatives into the DE, and simplify: the equation must collapse to an identity (left side equal to right side for all x). Then, if an initial condition is given, check it separately by direct substitution.
• EXAMPLE — Claim: y = x^2 solves x(dy/dx) = 2y. Differentiate: dy/dx = 2x. Substitute: left side x times 2x = 2x^2; right side 2 times x^2 = 2x^2. Identical — verified, in four lines.
• EXAMPLE — Claim: y = e^(3x) solves dy/dx = 3y. Differentiate: dy/dx = 3 e^(3x) = 3y. The derivative is literally 3 times the function — verified at sight.
• EXAMPLE — A full audit with a condition: claim y = sin x + 5 solves dy/dx = cos x with y(0) = 5. Equation audit: dy/dx = cos x, exactly the right side — pass. Condition audit: y(0) = sin 0 + 5 = 5 — pass. Both audits green, so this is THE particular solution, not just A solution.
• WHY this section earns its keep — verification runs the solving machinery backwards, and backwards is easier. In a multiple-choice question it is often faster to test the four options by substitution than to solve the DE outright, and in a written answer it is a free self-audit: differentiate your final answer and watch the DE accept it.
• WORKED PATTERN — The audit, three lines: (1) compute the derivatives the DE needs; (2) substitute everything and simplify until the two sides visibly match (or do not); (3) test any initial or boundary condition on the candidate itself. A candidate passes only if all three lines pass.
• YOUR TURN — Is y = e^(-x) a solution of dy/dx + y = 0? Answer: yes — dy/dx = -e^(-x), and -e^(-x) + e^(-x) = 0 for every x.
⚠ EXAM TRAP — Verifying the equation but forgetting the initial condition: y = e^(2x) genuinely solves dy/dx = 2y, yet it fails the condition y(0) = 3 (it gives 1). Equation-check and condition-check are two separate audits, and the second is where setters hide the wrong option.

Forming a DE — Eliminating the Arbitrary Constants
• DEFINITION — A family of curves is one equation containing arbitrary constants — x^2 + y^2 = r^2 is a family (all circles centred at the origin, one for each r). The DE of the family is the single differential equation that every member satisfies and that contains none of the constants: the family's shared slope-law.
• WORKED PATTERN — The elimination drill: (1) count the arbitrary constants — that is how many times you differentiate; (2) differentiate the family equation that many times (treating y as a function of x); (3) eliminate the constants between the original equation and its derivatives; (4) audit the result: no constant may survive.
• EXAMPLE — The circles x^2 + y^2 = r^2 (one constant, r). Differentiate once: 2x + 2y(dy/dx) = 0, that is x + y(dy/dx) = 0. The constant r vanished on its own — no elimination step was even needed. Read the figure with this section: every circle in the family, whatever its radius, has tangent slope -x/y at each point; that shared law IS the DE.
• EXAMPLE — The lines y = mx through the origin (one constant, m). Differentiate: dy/dx = m. Substitute back: dy/dx = y/x, or x(dy/dx) - y = 0. Every straight line through the origin obeys it, and m is gone.
• EXAMPLE — The parabolas y^2 = 4ax (one constant, a). Differentiate: 2y(dy/dx) = 4a. From the family, 4a = y^2/x, so 2y(dy/dx) = y^2/x, which tidies to 2x(dy/dx) = y. One differentiation, one substitution, constant eliminated.
• EXAMPLE — Two constants need two differentiations: y = A e^x + B e^(-x). First derivative: y' = A e^x - B e^(-x). Second: y'' = A e^x + B e^(-x) = y. So the DE is y'' - y = 0 — order 2, exactly the constant count, as the bookkeeping promised.
• YOUR TURN — Form the DE of the family y = C x^2. Answer: differentiate, y' = 2Cx; divide by the family equation (or substitute C = y/x^2): y' = 2y/x, i.e. x(dy/dx) = 2y.
⚠ EXAM TRAP — Differentiating fewer times than there are constants and proudly presenting an "answer" that still contains A or C — that is not a DE of the family, it is the family wearing a derivative. Count constants first, differentiate that many times, and finish with the no-constant audit.

Method One — Variable Separable
• DEFINITION — A first-order DE is variable separable when it can be rearranged as (expression in y alone) dy = (expression in x alone) dx: all the y-stuff on one side with dy, all the x-stuff on the other side with dx. Then each side integrates independently, and one constant of integration appears.
• WORKED PATTERN — The separation drill: (1) factor the right side as f(x) times g(y) if needed; (2) divide so that dy/g(y) faces f(x) dx; (3) integrate both sides — do not forget the constant, and hang it on one side only; (4) tidy into y as a function of x if the question asks or an initial condition is given; (5) apply the condition to fix the constant for a particular solution.
✔ KEY FORMULA — dy/dx = f(x) g(y) separates to: integral of dy/g(y) = integral of f(x) dx + C. The workhorse integrals: integral of dy/y = ln|y|, and integral of e-type and power forms from the integration chapter.
• EXAMPLE — Solve dy/dx = 2xy with y(0) = 1. Separate: dy/y = 2x dx. Integrate: ln y = x^2 + C, so y = A e^(x^2). The condition: 1 = A e^0 = A. Particular solution y = e^(x^2), and at x = 2 it gives y = e^4 ≈ 54.6 — the growth is ferocious because the exponent itself is growing.
• EXAMPLE — Solve dy/dx = x/y. Separate: y dy = x dx. Integrate: y^2/2 = x^2/2 + C, tidied to y^2 - x^2 = C1 (the doubled constant renamed). Note the answer is an implicit relation, not y = something — perfectly acceptable as a general solution.
• EXAMPLE — Solve dy/dx = e^(x - y). Split the exponent: e^(x - y) = e^x times e^(-y), so the equation separates as e^y dy = e^x dx. Integrate: e^y = e^x + C, i.e. y = ln(e^x + C). Exponent-splitting is the standard disguise for separable equations in IAT papers — whenever you see e^(x - y) or similar, split it before concluding anything.
• WHY separation is the first tool to reach for — most first-order DEs the IAT sets, including the growth law dN/dt = kN behind Section 10, are separable in disguise. If a DE can be massaged into f(x) g(y) shape, separation ends it in four lines.
• YOUR TURN — Solve dy/dx = 3x^2 y with y(0) = 1, and give y(1). Answer: dy/y = 3x^2 dx gives ln y = x^3 + C, so y = e^(x^3) after the condition; y(1) = e ≈ 2.718.
⚠ EXAM TRAP — Dividing by g(y) without a thought: if g(y) can be zero, the constant function you divided away may itself be a solution (for dy/dx = 2xy, y = 0 solves the DE — luckily it reappears as the C = 0 member of the family). The safe habit: after separating, ask "did I divide by something that can vanish, and does that constant function check out as a solution?"

Method Two — Homogeneous Equations and y = vx
• DEFINITION — A first-order DE dy/dx = f(x, y) is homogeneous when the right side depends only on the ratio y/x — equivalently, when numerator and denominator are built from terms of the same total degree, so f(tx, ty) = f(x, y) for any scale t. Specimens: (x + y)/x, (x^2 + y^2)/(2xy), (x - y)/x.
• WHY y = vx works — if only the ratio y/x matters, promote the ratio to a variable: set v = y/x, i.e. y = vx. The two-variable tangle collapses to a separable equation in v and x, because the DE was secretly about the ratio all along.
• WORKED PATTERN — The substitution drill: (1) confirm homogeneity (same-degree terms, or rewrite in y/x); (2) set y = vx, and MEMORISE the derivative: dy/dx = v + x(dv/dx) — the product rule, not just x(dv/dx); (3) substitute and watch the v terms arrange themselves into a separable equation in v and x; (4) separate, integrate, then back-substitute v = y/x; (5) apply any initial condition.
✔ KEY FORMULA — y = vx gives dy/dx = v + x(dv/dx). After substitution the x cancels structurally and the equation separates: dv/(something in v) = dx/x, whose right side always integrates to ln|x|.
• EXAMPLE — Solve dy/dx = (x + y)/x. Substitute y = vx: v + x(dv/dx) = 1 + v. The v cancels (the signature moment of this method): x(dv/dx) = 1, so dv = dx/x, giving v = ln|x| + C. Back-substitute: y = x ln|x| + Cx. With y(1) = 2: C = 2, so y = x ln x + 2x for x positive, and y(e) = e + 2e = 3e ≈ 8.15.
• EXAMPLE — A degree audit: is dy/dx = (x^2 + xy)/x^2 homogeneous? Numerator terms have degree 2, denominator degree 2 — divide top and bottom by x^2: 1 + (y/x), a function of y/x alone. Yes, homogeneous; y = vx will separate it.
• YOUR TURN — Solve dy/dx = (x - y)/x. Answer: with y = vx, v + x(dv/dx) = 1 - v, so x(dv/dx) = 1 - 2v; separating, dv/(1 - 2v) = dx/x; integrating, -(1/2) ln|1 - 2v| = ln|x| + C, which tidies to y = x/2 + C/x — check it by differentiating if you like; it obeys the DE exactly.
⚠ EXAM TRAP — The missing +v: writing dy/dx = x(dv/dx) after setting y = vx throws away the product-rule term and derails everything downstream. Say it as a sentence every time: "y equals v x, so y-prime equals v plus x v-prime."

Method Three — Linear Equations and the Integrating Factor
• DEFINITION — A first-order linear DE has the standard form dy/dx + P(x) y = Q(x), where P and Q are functions of x alone: y and dy/dx appear only to the first power, never multiplied together, never inside functions. It is the most mechanical DE in the chapter — there is a machine, and the machine always works.
• WHY the integrating factor works — multiply the whole equation by a factor IF chosen so that the left side becomes the derivative of a product: d/dx (y times IF). The product rule gives (dy/dx)(IF) + y(IF'), and matching y(IF') with P y (IF) forces IF' = P times IF, whose solution is IF = e^(integral of P dx). One multiplication converts "unsolvable-looking" into "integrate both sides".
✔ KEY FORMULA — For dy/dx + P(x) y = Q(x): IF = e^(integral of P(x) dx), and the solution drops out in one line: y times IF = integral of (Q times IF) dx + C. No constant is needed inside the IF's own integral — pick the simplest antiderivative of P.
• WORKED PATTERN — The machine, five steps: (1) force standard form — divide through so the coefficient of dy/dx is exactly 1; (2) read off P (with its sign) and Q; (3) compute IF = e^(integral P dx); (4) write y times IF = integral of Q times IF dx + C in one breath; (5) integrate the right side, divide by IF, apply any condition.
• EXAMPLE — Solve dy/dx + y = e^x. P = 1, so IF = e^x. Then y e^x = integral of e^x times e^x dx = integral of e^(2x) dx = e^(2x)/2 + C. Divide: y = e^x/2 + C e^(-x). Verify mentally: y' + y = (e^x/2 - C e^(-x)) + (e^x/2 + C e^(-x)) = e^x. Clean.
• EXAMPLE — Solve dy/dx + y/x = x^2, with y(1) = 1. P = 1/x, so IF = e^(ln x) = x. Then xy = integral of x^2 times x dx = x^4/4 + C, so y = x^3/4 + C/x. The condition: 1 = 1/4 + C gives C = 3/4. At x = 2: y = 8/4 + 3/8 = 19/8 = 2.375.
• EXAMPLE — Solve dy/dx + 2y = e^(-x). P = 2, so IF = e^(2x). Then y e^(2x) = integral of e^(-x) times e^(2x) dx = integral of e^x dx = e^x + C. Divide: y = e^(-x) + C e^(-2x). Notice how the IF merged the exponents into one easy integral — that merging is the machine earning its keep.
• YOUR TURN — Solve dy/dx - y = 2. Answer: P = -1, so IF = e^(-x); y e^(-x) = integral of 2 e^(-x) dx = -2 e^(-x) + C; divide by e^(-x): y = C e^x - 2.
⚠ EXAM TRAP — Reading P before standardising: in 2(dy/dx) + 4y = x, the P is 2, not 4 — you must divide by 2 first so dy/dx stands alone. And mind the sign: dy/dx - y has P = -1 and IF = e^(-x); flipping the sign in the exponent is the single most common integrating-factor error.

The dx/dy Flip — When x Is the Dependent Variable
• DEFINITION — Some equations are ugly as dy/dx but tame as dx/dy: if swapping the roles of x and y produces the linear shape dx/dy + P1(y) x = Q1(y), the whole integrating-factor machine runs again with y as the independent variable and IF = e^(integral of P1 dy). Nothing about the machine cares which letter is on top.
• WHEN to flip — look at the equation and ask which arrangement isolates a first-power "dependent variable times a coefficient". If y is trapped inside an exponential or a messy bracket while x appears politely to the first power, flip: treat x as the function, y as the input.
• WORKED PATTERN — The flip drill: (1) rewrite dy/dx as 1/(dx/dy) — the equation turns into a statement about dx/dy; (2) rearrange to dx/dy + P1(y) x = Q1(y); (3) IF = e^(integral of P1 dy); (4) x times IF = integral of Q1 times IF dy + C; (5) present the answer as a relation between x and y (solving for y explicitly is often impossible and never required).
• EXAMPLE — Solve (x + y) dy = dx. As dy/dx this is 1/(x + y), hopeless-looking. Flip: dx/dy = x + y, i.e. dx/dy - x = y — linear in x. IF = e^(-y). Then x e^(-y) = integral of y e^(-y) dy = -(y + 1) e^(-y) + C, so x = C e^y - y - 1. One flip turned a wall into a routine integral.
• EXAMPLE — Recognition drill: dy/dx = e^y/(x + ...) style equations, where y sits in an exponent and x appears linearly on the other side, are flip candidates almost by definition — as dx/dy they typically read "dx/dy = (something in y) divided by (something with x to the first power)", and the linear template is one rearrangement away.
• YOUR TURN — Solve dx/dy - x = e^y. Answer: IF = e^(integral of -1 dy) = e^(-y); x e^(-y) = integral of e^y times e^(-y) dy = integral of 1 dy = y + C; so x = (y + C) e^y.
⚠ EXAM TRAP — After flipping, students keep integrating with respect to x out of muscle memory: the IF is e^(integral of P1 dy) and the final integration is in y. Every symbol in the flipped problem lives in y-world until the answer is written.

Spotting the Shortcut — Products in Disguise
• DEFINITION — A small family of first-order equations are exact derivatives wearing a disguise: the left side is already d/dx of a product or quotient. Spot the pattern and the "solution" is a single integration — no method, no substitution, no IF.
✔ KEY FORMULA — d/dx (xy) = y + x(dy/dx). So if an equation reads y + x(dy/dx) = (function of x), then xy = integral of that function dx + C immediately.
✔ KEY FORMULA — d/dx (y/x) = (x(dy/dx) - y)/x^2, and d/dx (x/y) has the matching form. An equation whose left side is x(dy/dx) - y, possibly divided by x^2, is y/x waiting to be integrated.
• EXAMPLE — Solve y + x(dy/dx) = 6x. The left side is d/dx (xy) verbatim. Integrate: xy = 3x^2 + C, so y = 3x + C/x. Twenty seconds, done — the IF machine would also work here (it is the linear equation dy/dx + y/x = 6 in disguise), but spotting the product skips the machinery entirely.
• EXAMPLE — Solve (x(dy/dx) - y)/x^2 = 2x. The left side is d/dx (y/x) verbatim. Integrate: y/x = x^2 + C, so y = x^3 + Cx. Verify by differentiating if the pattern felt too easy — it checks out exactly.
• WHY setters love these — the equation looks like work and is actually a gift, but only for students who have the product and quotient derivatives loaded as visual patterns. This is a recognition skill, and it is trainable in one sitting: rewrite y + x y', x y' - y, and y' y-forms until your eye catches them mid-equation.
• YOUR TURN — Solve x(dy/dx) + y = x^3. Answer: the left side is d/dx (xy), so xy = x^4/4 + C and y = x^3/4 + C/x — the same skeleton as the linear example in Section 7, reached in one line.
⚠ EXAM TRAP — Forcing the shortcut onto a near-miss: y + 2x(dy/dx) is NOT d/dx of anything simple (the coefficients must match the product rule exactly — 1 and 1 for xy, with the x attached to the derivative). If the match is not exact, fall back on the machine; a forced pattern is worse than an honest method.

Applications I — Growth and Decay
• DEFINITION — The growth law: when a quantity N changes at a rate proportional to its current size, dN/dt = kN. Separating (Section 5) gives the solution N = N0 e^(kt), where N0 is the size at t = 0. k positive is growth, k negative is decay — one DE, one formula, both directions.
✔ KEY FORMULA — N = N0 e^(kt). Doubling time (growth) and half-life (decay) are the same number in mirror: the time for the exponent to reach ln 2, i.e. T = ln 2 / |k| ≈ 0.693/|k|. After n doubling times the quantity is multiplied by 2^n; after n half-lives it is multiplied by (1/2)^n.
• EXAMPLE — Radioactive decay: a 100 g sample has half-life 5 days. After 15 days — three half-lives — the remaining mass is 100 times (1/2)^3 = 12.5 g. No k needed; the half-life data plus power counting finishes it.
• EXAMPLE — Population growth: a town of 1000 grows to 8000 in 30 years. 8000 is 1000 times 8 = 2^3, so exactly 3 doublings fit in 30 years and the doubling time is 10 years. At 50 years — 5 doublings — the population is 1000 times 2^5 = 32,000.
• EXAMPLE — Bacteria: a culture grows from 500 to 2000 in 2 hours. Four-fold in 2 hours means two doublings, so the doubling time is 1 hour; after 5 hours (5 doublings) the count is 500 times 2^5 = 16,000.
• EXAMPLE — Working backwards from a percentage: a sample decays to 25 percent of itself in 12 years. 25 percent is (1/2)^2, so 12 years holds exactly 2 half-lives and the half-life is 6 years. After 18 years — 3 half-lives — the remainder is (1/2)^3 = 12.5 percent. Percentages that are clean powers of 1/2 are the setter telling you to count, not to compute k.
• WORKED PATTERN — The application drill: (1) translate the words into the DE or straight into N = N0 e^(kt); (2) prefer ratio reasoning — count doublings or half-lives and use powers of 2 or 1/2 — and only solve for k (via ln) when the question demands a time or a rate; (3) if k is needed: k = ln(N/N0)/t, with the sign carried honestly; (4) sanity-check the direction: growth answers exceed N0, decay answers fall below it.
• WHY the same DE keeps reappearing — "rate proportional to the amount present" is nature's favourite sentence: bacteria, compound interest, radioactive nuclei, drug clearance. The IAT rotates the costume (grams, people, rupees, cells) and never changes the equation.
• YOUR TURN — A sample starts at 1000 units and doubles every 10 years. What remains of the growth story after 30 years? Answer: 3 doublings, so 1000 times 2^3 = 8000 units.
⚠ EXAM TRAP — The percentage costume: "grows by 10 percent per hour" tempts students to write k = 10 or to use (1.1)^t blindly with a mismatched N0. In the DE model the rate constant is a relative rate (k = ln 2 / doubling time, or k from the data), and when the paper hands you a half-life or doubling time, power counting with 2 and 1/2 bypasses k entirely — do not manufacture a k you were not given.

Applications II — Cooling and Word-Statement Equations
• DEFINITION — Newton's law of cooling: the rate of change of a body's temperature T is proportional to the gap between the body and its surroundings Ts, so dT/dt = -k(T - Ts) with k positive. The minus sign is the physics: a hotter body (T above Ts) must have dT/dt negative. Separating and integrating gives T = Ts + (T0 - Ts) e^(-kt) — exponential approach to room temperature, never overshooting.
✔ KEY FORMULA — Cooling: T = Ts + A e^(-kt), where A = T0 - Ts is the starting gap. The gap halves every ln 2 / k minutes, exactly the decay law wearing a thermometer.
• EXAMPLE — Coffee at 90 degrees sits in a 20-degree room, so T = 20 + 70 e^(-kt). After 10 minutes it reads 65 degrees: the gap fell from 70 to 45, so e^(-10k) = 45/70 = 9/14, giving k = ln(14/9)/10 ≈ 0.0442 per minute. At 20 minutes the gap is multiplied by (9/14)^2 = 81/196 ≈ 0.413, so T ≈ 20 + 70 times 0.413 ≈ 48.9 degrees. Notice the trick: squaring the 10-minute factor skips solving for k entirely.
• WORKED PATTERN — The word-to-DE dictionary: "rate proportional to the amount present" becomes dN/dt = kN; "rate proportional to the difference from ambient" becomes dT/dt = -k(T - Ts); "the slope at (x, y) equals (some expression)" becomes dy/dx = that expression, verbatim; "velocity proportional to the square root of distance fallen" becomes dv/dt = k times sqrt(s). Translate first, solve second — the translation IS the question in application problems.
• EXAMPLE — Slope statements: "a curve has slope at (x, y) equal to twice its x-coordinate" is dy/dx = 2x. Integrate: y = x^2 + C — the family of all parabolas y = x^2 + C, a forming-and-solving question compressed into one line.
• YOUR TURN — Translate: "the rate at which a substance decomposes is proportional to the mass still present." Answer: dm/dt = -km — the minus sign because the mass decreases; drop it and your "decay" grows, which the sanity check would catch.
★ HIGHLIGHT — Scope note, said once and plainly: solving second-order DEs (with constant coefficients and the rest) is OUT of the IAT scope for this chapter. Second-order equations appear only for order-and-degree labels, forming DEs, and verifying solutions — if a question asks you to SOLVE beyond first order, you have misread it.
⚠ EXAM TRAP — Sign sabotage in cooling: writing dT/dt = -k(T - Ts) for a body colder than the room and panicking at the "negative rate" — in fact T below Ts makes (T - Ts) negative, so dT/dt comes out positive and the body warms, correctly. The formula handles both directions; do not flip signs by hand.

Formula Sheet — The Whole Chapter on One Screen
✔ KEY FORMULA — Order = highest derivative present. Degree = power of that derivative, and it exists only when the equation is polynomial in the derivatives (clear roots first; sin, e, ln of a derivative means degree is not defined).
✔ KEY FORMULA — A DE of order n has a general solution with exactly n independent arbitrary constants; an initial condition fixes one constant each.
✔ KEY FORMULA — Separable: dy/dx = f(x) g(y) becomes integral of dy/g(y) = integral of f(x) dx + C.
✔ KEY FORMULA — Homogeneous (right side a function of y/x): set y = vx, and dy/dx = v + x(dv/dx); the equation then separates in v and x, with dx/x integrating to ln|x|.
✔ KEY FORMULA — Linear: dy/dx + P(x) y = Q(x) has IF = e^(integral of P dx) and solution y times IF = integral of (Q times IF) dx + C. Standardise first: the coefficient of dy/dx must be 1 before P is read.
✔ KEY FORMULA — The flip: dx/dy + P1(y) x = Q1(y) has IF = e^(integral of P1 dy) and solution x times IF = integral of (Q1 times IF) dy + C.
✔ KEY FORMULA — Disguised products: y + x(dy/dx) = d/dx (xy), and (x(dy/dx) - y)/x^2 = d/dx (y/x). Exact match required — then one integration solves the equation.
✔ KEY FORMULA — Growth and decay: dN/dt = kN gives N = N0 e^(kt); doubling time and half-life both equal ln 2 / |k| ≈ 0.693/|k|. Count powers of 2 or 1/2 before solving for k.
✔ KEY FORMULA — Cooling: dT/dt = -k(T - Ts) gives T = Ts + (T0 - Ts) e^(-kt). The temperature gap decays exponentially towards zero; the body never overshoots the room.
✔ KEY FORMULA — Forming a DE: differentiate once per arbitrary constant, eliminate the constants between the equations, and audit that none survive.

Common Mistakes and Exam Traps
• Mistake 1: Reading the degree from the biggest exponent in the equation. Why it is wrong: in (dy/dx)^5 + d^2y/dx^2 = 0 the degree is 1, because degree belongs to the highest-ORDER derivative only. Correct principle: find the highest derivative first; its exponent is the degree.
• Mistake 2: Awarding a degree to d^2y/dx^2 + sin(dy/dx) = 0. Why it is wrong: a derivative inside sin makes the equation non-polynomial in the derivatives, so no degree exists. Correct principle: trapped derivatives (inside trig, exp or log) mean "degree not defined" — say so.
• Mistake 3: Reading labels before cleaning roots. Why it is wrong: sqrt(1 + (dy/dx)^2) = d^2y/dx^2 looks degreeless until squared into 1 + (dy/dx)^2 = (d^2y/dx^2)^2, where the degree is plainly 2. Correct principle: clear roots and fractional powers first, then read the labels.
• Mistake 4: Calling a solution "general" with too few constants. Why it is wrong: y = A cos x for y'' + y = 0 omits the entire sin x family. Correct principle: constant count must equal the order; count before you claim.
• Mistake 5: In homogeneous equations, writing dy/dx = x(dv/dx) after y = vx. Why it is wrong: the product rule demands dy/dx = v + x(dv/dx); dropping the v wrecks the separation. Correct principle: chant "v plus x v-prime" at every substitution.
• Mistake 6: Reading P from an unstandardised equation. Why it is wrong: in 2(dy/dx) + 4y = x the machine needs P = 2 (after dividing by 2), not 4; the wrong P poisons the IF. Correct principle: divide until dy/dx stands alone, then read P with its sign.
• Mistake 7: Sign slip in the IF exponent. Why it is wrong: dy/dx - y = 2 has P = -1 and IF = e^(-x); using e^x integrates the wrong product and the "solution" fails verification. Correct principle: P carries its minus sign into the exponent, and a 10-second differentiate-back audit catches any slip.
• Mistake 8: Dividing by y while separating and never mentioning the lost solution. Why it is wrong: dy/y = ... assumes y is never 0, yet y = 0 may satisfy the original DE. Correct principle: after separating, test the constant function you divided away; report it (or note it returns as the C = 0 member).
• Mistake 9: Mixing variables after the dx/dy flip. Why it is wrong: the flipped IF is e^(integral of P1 dy) and the closing integral is in y; integrating in x out of habit produces nonsense. Correct principle: after flipping, live in y-world until the answer is written down.
• Mistake 10: Sign errors in applications. Why it is wrong: decay and cooling need the minus sign (dN/dt = -kN for a decaying mass with k positive, dT/dt = -k(T - Ts)); without it, "decay" grows exponentially. Correct principle: fix the sign from the story (is the quantity shrinking?), then sanity-check the final answer's direction.

Worked Examples — Basic to Challenging
• Example 1 — Problem: Find the order and degree of sqrt(1 + (dy/dx)^2) = d^2y/dx^2.
• Given: A DE with the first derivative under a square root and the second derivative standing alone.
• Principle: Clean the equation into polynomial form first; then order from the highest derivative, degree from its power.
• Steps: Square both sides: 1 + (dy/dx)^2 = (d^2y/dx^2)^2. The highest derivative present is d^2y/dx^2, so the order is 2. Its power in the cleaned equation is 2, so the degree is 2.
• Answer: Order 2, degree 2.
• Reasoning: The root blocked the degree only until it was cleared; a clearable root never makes a degree "not defined" — only trapped derivatives inside trig, exp or log functions do that.
• Mistake to avoid: Announcing "degree not defined" at the sight of the square root, or reporting the degree as 2 because of the (dy/dx)^2 before checking WHICH derivative carries it.
• Example 2 — Problem: Form the DE of the family of circles x^2 + y^2 = r^2.
• Given: One arbitrary constant, r; all circles centred at the origin.
• Principle: One constant means one differentiation; then eliminate r — or watch it eliminate itself.
• Steps: Differentiate with respect to x: 2x + 2y(dy/dx) = 0. Divide by 2: x + y(dy/dx) = 0. The constant r has vanished entirely.
• Answer: x + y(dy/dx) = 0.
• Reasoning: Every circle in the family has tangent slope -x/y at (x, y) — the radius is perpendicular to the tangent — so one first-order DE captures the whole family.
• Mistake to avoid: Trying to "solve for r" and substitute (r = sqrt(x^2 + y^2)) — messy and pointless; differentiation removes constants, substitution chases them.
• Example 3 — Problem: Form the DE of y = A e^x + B e^(-x).
• Given: Two arbitrary constants, A and B.
• Principle: Differentiate twice (once per constant), then eliminate A and B between the three equations.
• Steps: y' = A e^x - B e^(-x). Then y'' = A e^x + B e^(-x). Compare with the original: y'' is term-for-term identical to y. So y'' - y = 0.
• Answer: d^2y/dx^2 - y = 0, order 2 — matching the two constants.
• Reasoning: The two exponentials are each their own second derivative (up to sign pattern), so the family as a whole reproduces itself after two differentiations; elimination is then just recognition.
• Mistake to avoid: Stopping after one differentiation and "eliminating" one constant — the result still contains the other constant and is not the family's DE.
• Example 4 — Problem: Solve dy/dx = 2xy with y(0) = 1, and find y(2).
• Given: A separable DE with an initial condition.
• Principle: Separate, integrate, fix the constant with the condition, then evaluate.
• Steps: dy/y = 2x dx. Integrate: ln y = x^2 + C, so y = A e^(x^2). Apply y(0) = 1: A = 1. Particular solution: y = e^(x^2). At x = 2: y = e^4 ≈ 54.6.
• Answer: y = e^(x^2); y(2) = e^4 ≈ 54.6.
• Reasoning: The growth compounds quadratically in the exponent — that is why the value explodes from 1 to nearly 55 in two units, far outrunning plain e^(2x) growth.
• Mistake to avoid: Writing the constant additively after exponentiating (y = e^(x^2) + C) — the constant lives inside as a multiplier A = e^C; the initial condition decides A, not an added C.
• Example 5 — Problem: Solve dy/dx = (x + y)/x with y(1) = 2, and find y(e).
• Given: A homogeneous DE (right side is 1 + y/x) with an initial condition.
• Principle: Substitute y = vx, separate in v and x, back-substitute, then fix the constant.
• Steps: y = vx gives v + x(dv/dx) = 1 + v, so x(dv/dx) = 1 and dv = dx/x. Integrate: v = ln x + C (for x positive). Back-substitute: y = x ln x + Cx. The condition y(1) = 2 gives C = 2. At x = e: y = e times 1 + 2e = 3e ≈ 8.15.
• Answer: y = x ln x + 2x; y(e) = 3e ≈ 8.15.
• Reasoning: The cancellation of v on the two sides is the method's signature — it happens for every homogeneous equation and confirms the substitution was the right key.
• Mistake to avoid: Forgetting the back-substitution and presenting v = ln x + C as the answer — v was scaffolding; the answer must speak in x and y.
• Example 6 — Problem: Solve dy/dx + y/x = x^2 with y(1) = 1, and find y(2).
• Given: A linear DE in standard form, P = 1/x, Q = x^2.
• Principle: Run the integrating-factor machine: IF = e^(integral of P dx), then y times IF = integral of (Q times IF) dx + C.
• Steps: IF = e^(ln x) = x. Then xy = integral of (x^2 times x) dx = x^4/4 + C, so y = x^3/4 + C/x. Condition: 1 = 1/4 + C, so C = 3/4. At x = 2: y = 8/4 + 3/8 = 19/8 = 2.375.
• Answer: y = x^3/4 + 3/(4x); y(2) = 19/8.
• Reasoning: The IF here collapses to plain x because integral of 1/x dx is ln x and e^(ln x) = x — when the IF is a simple polynomial factor, the machine is nearly free.
• Mistake to avoid: Integrating Q alone on the right side (forgetting Q times IF): the RHS is integral of x^3, not of x^2 — the IF multiplies EVERYTHING.
• Example 7 — Problem: A radioactive sample of 80 g has a half-life of 8 days. How much remains after 24 days, and what is the decay constant k?
• Given: Decay data in half-life form; the DE is dN/dt = -kN with solution N = N0 e^(-kt).
• Principle: Count half-lives for the amount; use T = ln 2 / k for the constant.
• Steps: 24 days is 3 half-lives, so N = 80 times (1/2)^3 = 80/8 = 10 g. And k = ln 2 / 8 ≈ 0.693/8 ≈ 0.0866 per day.
• Answer: 10 g remains; k ≈ 0.0866 per day.
• Reasoning: The power-counting route and the formula route agree — check: e^(-0.0866 times 24) = e^(-2.079) ≈ 0.125 = 1/8, matching three halvings. Two routes, one answer.
• Mistake to avoid: Halving 80 three times as 80, 40, 20 and stopping (that is only two halvings at day 16) — count the half-lives in the elapsed time first: 24 divided by 8 is 3.

Practice Questions — Self-Test Set
• Q1. State the order and degree of (d^2y/dx^2)^2 + (dy/dx)^3 + y = 0.
• Q2. Form the differential equation of the family y = A sin x + B cos x.
• Q3. Solve dy/dx = x^2 y.
• Q4. Solve dy/dx = (x + y)/x.
• Q5. Solve dy/dx + y = x.
• Q6. Solve dy/dx = y with y(0) = 5, and give y(1).
• Q7. A population obeys dN/dt = 0.02 N with N(0) = 5000. Find N(50).
• Q8. State the order and degree of d^2y/dx^2 = (1 + (dy/dx)^2)^(3/2).

▸ Answer Key with Explanations
• A1. Order 2, degree 2. Route: the highest derivative is d^2y/dx^2 and its power is 2. Misconception watch: the cube on dy/dx is not the degree — degree reads only the top derivative's exponent.
• A2. d^2y/dx^2 + y = 0. Route: differentiate twice — y' = A cos x - B sin x, then y'' = -A sin x - B cos x = -y. Misconception watch: stopping after one differentiation leaves one constant alive; two constants demand two rounds.
• A3. y = C e^(x^3/3). Route: separate, dy/y = x^2 dx; integrate, ln y = x^3/3 + C. Misconception watch: integrating x^2 to x^3 and dropping the division by 3 — the antiderivative of x^2 is x^3/3.
• A4. y = x ln|x| + Cx. Route: y = vx gives x(dv/dx) = 1, so v = ln|x| + C (same skeleton as Worked Example 5). Misconception watch: presenting the answer in v — back-substitute before boxing anything.
• A5. y = x - 1 + C e^(-x). Route: linear with P = 1, IF = e^x; y e^x = integral of x e^x dx = (x - 1) e^x + C; divide. Misconception watch: integral of x e^x is (x - 1) e^x, not x e^x — integrate by parts or differentiate the guess to check.
• A6. y = 5e^x, so y(1) = 5e ≈ 13.59. Route: separate dy/dx = y into y = C e^x; the condition fixes C = 5. Misconception watch: answering e (the C = 1 solution) by forgetting the initial condition scales the whole curve.
• A7. N(50) = 5000 e^(0.02 times 50) = 5000 e ≈ 13,591. Route: N = N0 e^(kt) with k = 0.02 and t = 50, and the exponent lands exactly on 1. Misconception watch: computing 2 percent of 5000 (only 100) and scaling linearly — the DE compounds; the answer is exponential, not linear.
• A8. Order 2, degree 2. Route: square both sides to get (d^2y/dx^2)^2 = (1 + (dy/dx)^2)^3, a polynomial equation in the derivatives; the top derivative's power is 2. Misconception watch: calling the degree 3/2 from the original exponent — degree is read after cleaning, from the cleaned equation, and it is the power of d^2y/dx^2 (2), not the 3 now sitting on the bracket.

Chapter Summary, Revision Checklist and Self-Assessment
• Summary: A differential equation prescribes slopes, not values; its order is the highest derivative present, its degree is that derivative's power when the equation is polynomial in the derivatives — and "not defined" whenever a derivative is trapped inside sin, exp or log. A solution is any function the DE accepts on substitution; the general solution of an order-n DE carries exactly n arbitrary constants, and conditions pin them into a particular solution.
• Summary: Building a DE from a family means differentiating once per constant and eliminating every constant. Solving a first-order DE means choosing the right door: separate the variables if the right side factors as f(x) g(y); substitute y = vx (with dy/dx = v + x(dv/dx)) if the equation speaks only of y/x; run the integrating factor IF = e^(integral P dx) if the equation is linear; flip to dx/dy when x behaves better as the dependent variable; and always glance first for a disguised product like y + x(dy/dx) = d/dx (xy).
• Summary: The applications are one law in costumes: rate proportional to amount gives N = N0 e^(kt) with doubling time and half-life ln 2 / |k|; rate proportional to the temperature gap gives Newton's cooling T = Ts + (T0 - Ts) e^(-kt). Ratio reasoning — counting doublings and half-lives — beats solving for k whenever the data allows. Second-order solving stays out of scope: labels, forming and verifying only.
• Revision checklist — I can label any DE: clean roots, check for trapped derivatives, then read order and degree off the highest derivative.
• Revision checklist — I can verify a candidate solution by differentiating and substituting, and I check initial conditions as a separate audit.
• Revision checklist — I can form the DE of a family: count constants, differentiate that many times, eliminate, and confirm no constant survives.
• Revision checklist — I separate variables fluently and remember to ask whether a divided-away constant function is itself a solution.
• Revision checklist — I run y = vx with the full product rule (v + x dv/dx), separate, integrate to ln|x|, and back-substitute.
• Revision checklist — I standardise before reading P, build the IF with the correct sign, and write y times IF = integral of (Q times IF) dx in one motion.
• Revision checklist — I recognise the flip (linear in x as a function of y) and the disguised products d/dx (xy) and d/dx (y/x) at sight.
• Revision checklist — For growth, decay and cooling I translate the words into the DE first, count doublings or half-lives where possible, and sanity-check the direction of my answer.
• Self-assessment: Score your practice set. 7-8 correct: exam-ready — the three machines and the labels are reflexes; revisit in a week. 5-6: solid; re-drill the method behind each miss, especially any IF sign slips. 3-4: rebuild from the Formula Sheet, redo Worked Examples 4 to 6 by hand, then re-test. Below 3: restart from Order and Degree and work forward slowly — differential equations reward a clean sequence: label it, check it, form it, then solve it.
<!-- END math_ch_13 detailedStudyNotes -->
