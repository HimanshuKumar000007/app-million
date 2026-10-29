<!-- BEGIN math_ch_7 detailedStudyNotes -->
Introduction — One Plane, Two Toolkits
• Coordinate geometry is the art of turning geometry into algebra: pin every point down with two numbers (x, y), and every curve becomes an equation whose algebra you can interrogate. A question about distances, angles, tangencies or paths stops being a drawing puzzle and becomes a computation with a guaranteed route.
• This chapter fuses the two NCERT units the IAT tests most heavily from this area. The first toolkit is the straight line: slope, the five forms of a line, distances, reflections and families of lines, plus the locus idea that powers everything after it. The second toolkit is the conic sections — circle, parabola, ellipse and hyperbola — curves defined by distance conditions, each with a standard equation whose constants (a, b, c, e) can be read off at sight.
• Here is the honest exam picture. IAT coordinate questions are rarely long; they are reads and one-step computations. Read the centre and radius out of a general circle. Read a, the focus and the latus rectum out of a parabola. Read the eccentricity out of an ellipse or hyperbola. Measure a distance with the correct formula and the correct signs. The students who score here are not cleverer — they have the parameter-extraction patterns drilled until they are reflexes, and they know the five or six traps that recycle every year.
• DEFINITION — A conic section is the curve cut when a plane slices a double cone; equivalently, each conic in this chapter is the locus of a point moving under one distance rule — fixed distance from a point (circle), equal distances from a point and a line (parabola), constant sum of distances to two points (ellipse), constant difference of distances to two points (hyperbola). Hold that sentence and the whole second half organises itself.
• The working method of the chapter: for every curve we do anatomy first (name every part and where it sits), then parameter extraction (go from any given equation to the parts in seconds), then the tangent formulas at recognition depth. Figures 1 to 4 draw the anatomy so the formulas have a picture to live in.
★ HIGHLIGHT — The one-breath summary: a line is slope plus one point of data; a circle is centre plus radius; a parabola is the single number a wearing the equation y^2 = 4ax; an ellipse is a, b and e = sqrt(1 - b^2/a^2); a hyperbola is the same cast with a plus sign, e = sqrt(1 + b^2/a^2). Every question in this chapter is one of those reads, or one distance formula away from it.

The Coordinate Toolkit — Distance, Section Formula, Area
• DEFINITION — The distance between P(x1, y1) and Q(x2, y2) is PQ = sqrt((x2 - x1)^2 + (y2 - y1)^2). It is Pythagoras wearing coordinates: the horizontal gap and the vertical gap are the legs, the distance is the hypotenuse, and the squares make the signs of the gaps irrelevant.
• EXAMPLE — Distance between (2, 3) and (5, 7): gaps 3 and 4, so PQ = sqrt(9 + 16) = 5. The 3-4-5 triangle is the most planted pair of gaps in the exam — when you see gaps of 3 and 4, or 6 and 8, or 5 and 12, do not compute, recognise.
• DEFINITION — The section formula: the point dividing the segment from P(x1, y1) to Q(x2, y2) internally in the ratio m : n is ((m x2 + n x1)/(m + n), (m y2 + n y1)/(m + n)). Note the crossing: the weight m multiplies the FAR point Q, because the dividing point sits closer to the point it is weighted towards — it is a weighted average pulled towards the bigger weight.
• EXAMPLE — Divide (1, 2) to (7, 8) internally in the ratio 2 : 1: x = (2 x 7 + 1 x 1)/3 = 15/3 = 5, y = (2 x 8 + 1 x 2)/3 = 18/3 = 6. The point is (5, 6), visibly twice as close to (7, 8) as to (1, 2) — audit passed.
• The midpoint is the ratio 1 : 1 case: ((x1 + x2)/2, (y1 + y2)/2). External division in the ratio m : n replaces the sums with differences: ((m x2 - n x1)/(m - n), (m y2 - n y1)/(m - n)), and the dividing point then lies outside the segment, on the side of the larger weight.
• DEFINITION — The area of the triangle with vertices (x1, y1), (x2, y2), (x3, y3) is (1/2) |x1(y2 - y3) + x2(y3 - y1) + x3(y1 - y2)|. The modulus is not decoration: the signed sum can come out negative depending on the order you list the vertices, and area cannot be negative.
• EXAMPLE — Area of (0, 0), (4, 0), (0, 3): (1/2) |0(0 - 3) + 4(3 - 0) + 0(0 - 0)| = (1/2)(12) = 6, matching the right-triangle read (1/2) x 4 x 3. The formula and the picture agree, as they must.
✔ KEY FORMULA — Three points are collinear exactly when the area formula returns 0 — equivalently when the signed sum x1(y2 - y3) + x2(y3 - y1) + x3(y1 - y2) equals 0. This is the fastest collinearity test when slopes would force you to compare fractions.
• YOUR TURN — Find the midpoint of (1, 5) and (7, 13), and the area of the triangle (0, 0), (6, 0), (3, 4). Answer: midpoint ((1 + 7)/2, (5 + 13)/2) = (4, 9). Area: (1/2) |0 + 6 x 4 + 0| = 12, again the (1/2) x base x height read, since the third point sits directly above the base's midpoint line.
• YOUR TURN — The point (5, 6) from the section example: check it really lies on the segment from (1, 2) to (7, 8) by distances. Answer: distance to (1, 2) is sqrt(16 + 16) = 4 sqrt(2); distance to (7, 8) is sqrt(4 + 4) = 2 sqrt(2); ratio 2 : 1 with the point nearer (7, 8), exactly as weighted.

Slope — the Steepness Number
• DEFINITION — The slope of the line through (x1, y1) and (x2, y2) is m = (y2 - y1)/(x2 - x1): rise over run, the vertical change per unit of horizontal change. It equals tan(theta), where theta, the inclination, is the angle the line makes with the positive x-axis, measured anticlockwise, with 0 degrees ≤ theta < 180 degrees.
• The sign of the slope is a picture: m > 0 means the line climbs left to right (acute inclination), m < 0 means it falls (obtuse inclination), m = 0 is horizontal (theta = 0), and a vertical line (theta = 90 degrees) has NO slope — x2 - x1 = 0 and the fraction does not exist. Saying a vertical line has slope 0 is a classic wrong answer; zero slope is the horizontal line.
• EXAMPLE — Slope of the line through (2, 3) and (5, 9): m = (9 - 3)/(5 - 2) = 6/3 = 2: every step right climbs 2 up. Slope through (-1, 2) and (3, -6): m = (-6 - 2)/(3 - (-1)) = -8/4 = -2, a falling line, as the second point being lower demands.
✔ KEY FORMULA — The slope of the line ax + by + c = 0 is m = -a/b: negative, x-coefficient over y-coefficient. From 3x + 4y = 12, m = -3/4. The two planted errors are forgetting the minus sign and inverting the ratio; both are free marks for the examiner, so build the read as a reflex: minus, a, over b.
• WHY slope runs the whole chapter — the slope compresses a line's direction into one number, and direction is what angle, parallel and perpendicular questions are all about. Two of the next section's three facts are one-liners purely because direction has been numbered.
• Standard inclinations to know cold: m = 0 ↔ 0 degrees, m = 1/sqrt(3) ↔ 30 degrees, m = 1 ↔ 45 degrees, m = sqrt(3) ↔ 60 degrees, and m large ↔ theta approaching 90 degrees. When an IAT question gives an inclination, convert to slope immediately; when it gives a slope like sqrt(3), hear 60 degrees.
• WORKED PATTERN — Slope of a line through the origin and (a, b) is b/a, and the line making equal angles with the axes has slope 1 or -1 (theta = 45 or 135 degrees) — two reads that appear constantly inside bigger problems.
⚠ EXAM TRAP — The slope formula subtracts in the same order top and bottom: (y2 - y1)/(x2 - x1). Mixing orders, (y2 - y1)/(x1 - x2), flips the sign — and a sign flip in slope inverts every conclusion downstream: a climbing line becomes a falling one, an acute angle becomes obtuse, a perpendicular slope becomes its own negative.
• YOUR TURN — Find the inclination of a line with slope -1, and the slope of a line inclined at 120 degrees. Answer: tan(theta) = -1 with theta obtuse gives theta = 135 degrees. tan(120 degrees) = -sqrt(3), so the slope is -sqrt(3): falling steeply, consistent with an inclination past vertical's neighbourhood.
• YOUR TURN — A line passes through (k, 2) and (3, 5) with slope 1. Find k. Answer: (5 - 2)/(3 - k) = 1 gives 3 = 3 - k, so k = 0. Audit: through (0, 2) and (3, 5) the rise 3 matches the run 3.

Angle Between Two Lines; Parallel and Perpendicular
• DEFINITION — The angle between two lines is taken as the acute (or right) angle between them, between 0 and 90 degrees. Direction vectors along the lines form both theta and 180 degrees - theta; the exam's angle is always the smaller one.
✔ KEY FORMULA — If the lines have slopes m1 and m2, then tan(theta) = |(m2 - m1)/(1 + m1 m2)|. The modulus is what guarantees the acute angle: the raw fraction can be negative, signalling the obtuse supplement, and the modulus throws the supplement away.
• EXAMPLE — Slopes 3 and 1/2: tan(theta) = |(1/2 - 3)/(1 + 3/2)| = |(-5/2)/(5/2)| = 1, so theta = 45 degrees. When the fraction collapses to 1, 1/sqrt(3) or sqrt(3), the angle is 45, 30 or 60 degrees — the three values the exam recycles.
✔ KEY FORMULA — Parallel lines: m1 = m2 (same direction). Perpendicular lines: m1 m2 = -1, which is exactly the case 1 + m1 m2 = 0, where the tan formula's denominator vanishes and theta = 90 degrees — the formula and the condition are the same fact viewed twice.
• EXAMPLE — Slopes 2 and 3: tan(theta) = |(3 - 2)/(1 + 6)| = 1/7, so theta = arctan(1/7), about 8.13 degrees. Not every angle is a standard one; reporting tan(theta) = 1/7 cleanly is the skill — do not round-hunt for a pretty degree value that is not there.
• WORKED PATTERN — Angle between a line and an axis: the line's own inclination IS the angle with the x-axis, so a line of slope sqrt(3) makes 60 degrees with the positive x-axis and 30 degrees with the y-axis. Two-line problems where one line is an axis are one-line problems in disguise.
• Collinearity through slopes: three points A, B, C are collinear exactly when slope of AB equals slope of BC. Use slopes when the numbers are clean fractions; use the area-equals-zero test from Section 1 when they are not.
⚠ EXAM TRAP — The perpendicular condition m1 m2 = -1 silently assumes BOTH slopes exist. A horizontal line (m = 0) is perpendicular to a vertical line (no slope), and the product test cannot even be written. When one line is an axis, answer from the picture, not the formula.
• YOUR TURN — Find the angle between lines of slopes sqrt(3) and 1/sqrt(3). Answer: tan(theta) = |(1/sqrt(3) - sqrt(3))/(1 + 1)| = |((1 - 3)/sqrt(3))/2| = (2/sqrt(3))/2 = 1/sqrt(3), so theta = 30 degrees. It had to be: the inclinations are 60 and 30 degrees, and the angle between the lines is their difference.
• YOUR TURN — Show the lines through (1, 1), (2, 3) and through (3, 5), (4, 7) are parallel, and that the line through (1, 1), (3, 5) is the same line as the first. Answer: slopes are (3 - 1)/(2 - 1) = 2 and (7 - 5)/(4 - 3) = 2 — equal, so parallel (or coincident). Slope (5 - 1)/(3 - 1) = 2 also, and it shares the point (1, 1) with the first line, so it IS the first line: (3, 5) was on it all along, since 1, 3, 5 march in step.

The Five Forms of a Straight Line
• One line, five costumes. Every form below packages the same information differently, and the exam skill is picking the costume that matches the data given. Figure 1 draws a single line, 3x + 4y = 12, in four of the five forms — watch the same line wear each one.
• DEFINITION — Point-slope form: the line through (x1, y1) with slope m is y - y1 = m(x - x1). This is the default construction form: slope plus one point is the commonest data pair in questions.
• DEFINITION — Two-point form: the line through (x1, y1) and (x2, y2) is y - y1 = ((y2 - y1)/(x2 - x1)) (x - x1) — point-slope with the slope built from the two points. For our figure line through (0, 3) and (4, 0): y - 3 = ((0 - 3)/(4 - 0)) x, that is y - 3 = -(3/4) x.
• DEFINITION — Slope-intercept form: y = m x + c, where c is the y-intercept, the height where the line crosses the y-axis. Our line: y = -(3/4) x + 3. This is the graphing form — slope and crossing read at a glance — and the form calculus will want later.
• DEFINITION — Intercept form: x/a + y/b = 1, where a and b are the x- and y-intercepts. Our line: x/4 + y/3 = 1, since it crosses the axes at (4, 0) and (0, 3). Converting any line to intercept form is one division: for 3x + 4y = 12, divide through by 12.
✔ KEY FORMULA — The five forms of the line 3x + 4y = 12: slope-intercept y = -(3/4)x + 3; intercept x/4 + y/3 = 1; normal (3/5)x + (4/5)y = 12/5; general 3x + 4y - 12 = 0. One line — the constants change costume, the geometry does not.
• DEFINITION — Normal form: x cos(w) + y sin(w) = p, where p is the perpendicular distance from the origin to the line and w is the angle that perpendicular makes with the positive x-axis. To convert ax + by + c = 0, divide by sqrt(a^2 + b^2) (choosing signs so p > 0): our line gives (3/5)x + (4/5)y = 12/5, so p = 12/5 and cos(w) = 3/5, sin(w) = 4/5, w about 53.13 degrees.
• WHY the normal form matters — it is the only form whose constant IS a distance. The point-to-line distance formula of the next section is nothing but the normal form evaluated at a point, which is why the conversion recipe (divide by sqrt(a^2 + b^2)) keeps reappearing.
• Which form when — a working pattern: given a point and a slope, point-slope. Given two points, two-point. Given intercepts or axis-crossing data, intercept form. Given a distance from the origin or a perpendicular direction, normal form. Given anything else, build in point-slope and rearrange into the general form ax + by + c = 0.
⚠ EXAM TRAP — The intercept form cannot represent a line through the origin (both intercepts would be 0) or a line parallel to an axis (one intercept does not exist). If a or b comes out 0 or infinite during a conversion, the form has failed, not the line — switch costumes.
• YOUR TURN — Write 2x - 3y = 6 in intercept form and read off both intercepts. Answer: divide by 6: x/3 + y/(-2) = 1, so the x-intercept is 3 and the y-intercept is -2 — the line crosses the x-axis at (3, 0) and the y-axis below the origin at (0, -2), consistent with its positive slope 2/3.
• YOUR TURN — Find the normal form of x + y = 2 and the distance it encodes. Answer: divide by sqrt(2): (1/sqrt(2)) x + (1/sqrt(2)) y = sqrt(2), so p = sqrt(2) with cos(w) = sin(w) = 1/sqrt(2), w = 45 degrees: the perpendicular from the origin hits the line at 45 degrees, at distance sqrt(2).

Distance of a Point from a Line; Distance Between Parallel Lines
✔ KEY FORMULA — The distance from the point (x1, y1) to the line ax + by + c = 0 is d = |a x1 + b y1 + c| / sqrt(a^2 + b^2). Read it as: evaluate the line's left side at the point, take the modulus, divide by the length of the coefficient vector (a, b). The evaluation measures how far the point is from satisfying the equation; the division converts that into honest geometric distance.
• EXAMPLE — Distance from (2, 3) to 3x + 4y - 5 = 0: |6 + 12 - 5| / sqrt(9 + 16) = 13/5 = 2.6. The denominator 5 is no accident — 3-4-5 coefficient pairs are planted precisely so the division is clean.
• EXAMPLE — Distance from the origin to 3x + 4y = 12, i.e. 3x + 4y - 12 = 0: |0 + 0 - 12|/5 = 12/5. Compare with the normal form of the same line in Section 4, whose p was exactly 12/5: the normal form's constant is the origin's distance, as promised.
• DEFINITION — The distance between the parallel lines ax + by + c1 = 0 and ax + by + c2 = 0 is |c1 - c2| / sqrt(a^2 + b^2) — but ONLY once the coefficients of x and y match exactly in the two equations. It is the point-line formula applied to any point of one line, simplified.
• EXAMPLE — Between 3x + 4y + 5 = 0 and 3x + 4y + 15 = 0: |5 - 15|/5 = 2. Between 3x - 4y + 7 = 0 and 3x - 4y - 8 = 0: |7 - (-8)|/5 = 15/5 = 3 — mind the double negative; the constants subtract as signed numbers, and -8 fleeing to +8 inside the modulus is where this computation usually dies.
⚠ EXAM TRAP — Non-standardised parallels: 3x + 4y + 5 = 0 and 6x + 8y + 9 = 0. Subtracting constants directly gives nonsense. Halve the second first: 3x + 4y + 9/2 = 0, then the distance is |5 - 9/2|/5 = (1/2)/5 = 1/10. Small, and completely missed by anyone who skips the standardising step.
• WORKED PATTERN — Area from distance: the area of a triangle or parallelogram built on a line often reduces to (base) x (distance from the opposite point to the line). When a problem hands you a line and a stray point, compute the distance first — it is very likely the height in disguise.
• YOUR TURN — Find the distance from (1, 2) to 5x - 12y + 3 = 0, and from the origin to 12x - 5y + 7 = 0. Answer: |5 - 24 + 3|/13 = 16/13. And |7|/13 = 7/13 — both denominators are 13 because 5-12-13 is the other planted Pythagorean pair.
• YOUR TURN — The line 3x + 4y = 12 cuts the axes at (4, 0) and (0, 3). Find the length of the segment it cuts off, and the area of the triangle it makes with the axes. Answer: segment = distance between the intercepts = sqrt(16 + 9) = 5. Area = (1/2) x 4 x 3 = 6. Audit by distance: the origin's distance to the line is 12/5, and (1/2) x segment x distance = (1/2) x 5 x 12/5 = 6. Two routes, one answer.

▸ Foot of the Perpendicular, Image of a Point and Families of Lines
• DEFINITION — The foot of the perpendicular from a point P to a line is the point where the perpendicular through P meets the line; the image (reflection) of P in the line is the point P' on the far side such that the line is the perpendicular bisector of PP' — the foot is the midpoint of P and its image.
• The reliable method needs no memorised formula: the perpendicular direction to ax + by + c = 0 is the vector (a, b) itself. Walk from P along (a, b): points (x1 + a t, y1 + b t); choose t so the walking point lands on the line, by substituting into the equation. That landing point is the foot; double the walk and you are at the image.
• EXAMPLE — Foot and image of (2, 3) with respect to x + y = 3: walk (2 + t, 3 + t); landing condition (2 + t) + (3 + t) = 3 gives 5 + 2t = 3, so t = -1 (we walk backwards, since P is on the far side). Foot = (1, 2). Image = walk twice as far: (2 - 2, 3 - 2) = (0, 1). Audit: the midpoint of (2, 3) and (0, 1) is (1, 2), the foot, and it lies on the line: 1 + 2 = 3. Closed loop.
• For the standard formula route, the foot (h, k) of (x1, y1) on ax + by + c = 0 satisfies (h - x1)/a = (k - y1)/b = -(a x1 + b y1 + c)/(a^2 + b^2), and the image replaces the minus sign's factor with twice: (h - x1)/a = (k - y1)/b = -2(a x1 + b y1 + c)/(a^2 + b^2). The walk method above is this formula in words — use whichever you can execute without slips.
• DEFINITION — A family of lines is the set of all lines through the intersection point of two given lines L1 = 0 and L2 = 0, written L1 + lambda L2 = 0, one line for each value of the parameter lambda. Every member passes through the intersection automatically, because at that point both L1 and L2 vanish, so any combination vanishes too.
• EXAMPLE — Lines x + y - 3 = 0 and 2x - y + 1 = 0 meet where solving gives (2/3, 7/3). The family is (x + y - 3) + lambda(2x - y + 1) = 0. Which member passes through the origin? Substituting (0, 0): -3 + lambda = 0, so lambda = 3, and the member is x + y - 3 + 3(2x - y + 1) = 7x - 2y = 0. Audit: 7(2/3) - 2(7/3) = 0 — the intersection lies on it, as every member must.
• WORKED PATTERN — Family problems are always two steps: write the family, then spend the one condition given (a point it passes through, a slope, a distance) to buy lambda. One parameter, one condition — the count always matches, and if you find yourself needing a second condition, you have misread the question.
⚠ EXAM TRAP — The family L1 + lambda L2 = 0 never produces L2 itself, for any finite lambda (you would need lambda = infinity). If the answer to a family question turns out to be exactly L2, the family should have been written the other way round, or the missing member checked separately.
• Concurrency in one line: three lines are concurrent when the intersection of two of them lies on the third — substitute and check. In family language, the third line is a member of the family of the first two.
• YOUR TURN — Using the family of x - y = 0 and x + y - 2 = 0 (which meet at (1, 1)), find the member through (3, 0). Answer: (x - y) + lambda(x + y - 2) = 0 at (3, 0): 3 + lambda(1) = 0, so lambda = -3. The member: (x - y) - 3(x + y - 2) = -2x - 4y + 6 = 0, i.e. x + 2y - 3 = 0. Audit: at (1, 1): 1 + 2 - 3 = 0 ✓; at (3, 0): 3 - 3 = 0 ✓.

Locus — the Equation of a Path
• DEFINITION — The locus of a moving point is the path it traces while obeying a stated condition, and the equation of the locus is the equation that exactly the points of the path satisfy. Every curve in this chapter is somebody's locus: the circle is the locus of points at fixed distance from a centre, and so on.
• The method is a three-step machine. Step 1: name the moving point P(x, y) with unknown coordinates. Step 2: translate the stated condition into algebra using the toolkit — distances, slopes, areas. Step 3: simplify to a recognisable equation and name the curve. The condition chooses the formula; there is no fourth step.
• EXAMPLE — Locus of points equidistant from A(2, 0) and B(0, 2): PA = PB gives (x - 2)^2 + y^2 = x^2 + (y - 2)^2. The squares cancel and the linear terms survive: -4x + 4 = -4y + 4, so x = y. The locus is the perpendicular bisector of AB — a line, as the locus dictionary in the complex-numbers chapter promised for equal distances.
• EXAMPLE — Locus of P with PA = 2 PB, where A = (0, 0) and B = (3, 0): x^2 + y^2 = 4((x - 3)^2 + y^2) gives x^2 + y^2 = 4x^2 - 24x + 36 + 4y^2, i.e. 3x^2 + 3y^2 - 24x + 36 = 0, i.e. x^2 + y^2 - 8x + 12 = 0. That is a circle, centre (4, 0), radius sqrt(16 - 12) = 2 — the circle of Apollonius. A constant RATIO of distances (other than 1) always draws a circle; ratio exactly 1 draws the bisector line. One family of conditions, two curve types, decided by a single value.
• WHY the locus machine matters beyond its own questions — it is the definition engine for the conics. The parabola, ellipse and hyperbola below are each introduced BY a locus condition, and their equations are just Step 2 of this machine applied once, carefully. When a conic question feels strange, re-run its locus definition — the strangeness usually dissolves.
⚠ EXAM TRAP — Squaring a distance condition is safe (distances are non-negative), but conditions involving a SIGNED quantity — a directed distance, a slope equality, an area without modulus — can admit mirror points that do not obey the original condition. When the condition has a sign in it, audit a test point of your locus against the words of the question.
• YOUR TURN — Find the locus of a point equidistant from the point (0, 4) and the x-axis. Answer: distance to (0, 4) is sqrt(x^2 + (y - 4)^2); distance to the x-axis is |y|. Equating and squaring: x^2 + y^2 - 8y + 16 = y^2, so x^2 = 8(y - 2), i.e. x^2 = 8y - 16. A parabola — hold this result; the next-but-two section defines the parabola by exactly this point-versus-line distance condition.

Circles — Centre and Radius from Any Form
• DEFINITION — The circle is the locus of points at a fixed distance r (the radius) from a fixed point (h, k) (the centre). The locus machine with the distance formula gives the standard form at once: (x - h)^2 + (y - k)^2 = r^2.
• DEFINITION — Expanding the standard form gives the general form x^2 + y^2 + 2g x + 2f y + c = 0, with centre (-g, -f) and radius sqrt(g^2 + f^2 - c). Compare term by term: 2g = -(2h) coefficient logic means g and f are HALF the x and y coefficients, with flipped signs for the centre. This halving is the single most-tested read in the chapter.
✔ KEY FORMULA — From x^2 + y^2 + 2g x + 2f y + c = 0: centre = (-g, -f), radius = sqrt(g^2 + f^2 - c). Preconditions for a genuine circle: the coefficients of x^2 and y^2 are equal, there is no xy term, and g^2 + f^2 - c > 0. If g^2 + f^2 - c = 0 the circle shrinks to a point circle (just the centre); if negative, the circle is imaginary — the equation holds for no real point at all.
• EXAMPLE — x^2 + y^2 - 4x - 6y + 4 = 0: 2g = -4 gives g = -2, 2f = -6 gives f = -3, c = 4. Centre = (2, 3). Radius = sqrt(4 + 9 - 4) = sqrt(9) = 3. Figure 2's circle does the same read on x^2 + y^2 - 6x + 4y - 12 = 0: centre (3, -2), radius sqrt(9 + 4 + 12) = 5.
• EXAMPLE — A non-circle audition: x^2 + y^2 + 4x + 2y + 6 = 0 gives centre (-2, -1) formally, but g^2 + f^2 - c = 4 + 1 - 6 = -1 < 0 — imaginary, no real graph. The exam plants these to catch students who read the centre, smile, and never check the radius exists.
• WORKED PATTERN — Reverse construction: centre (h, k) and radius r are given, or centre and a point on the circle (radius = distance between them), or centre and a tangent line (radius = point-line distance from Section 5). Three data shapes, three one-step builds — the tangent-line build is the favourite, because it chains two sections.
⚠ EXAM TRAP — The halving trap in both directions: x^2 + y^2 - 4x - 6y + 4 = 0 has centre (2, 3), NOT (4, 6) and not (-2, -3). Halve AND flip: the centre is minus half of each linear coefficient. Students lose this mark in both directions in the same paper, every year.
• YOUR TURN — Read the centre and radius of x^2 + y^2 - 2x + 4y - 20 = 0. Answer: g = -1, f = 2, c = -20; centre (1, -2); radius sqrt(1 + 4 + 20) = sqrt(25) = 5.
• YOUR TURN — Find the equation of the circle with centre (1, -2) passing through (4, 2). Answer: radius = distance = sqrt(9 + 16) = 5, so (x - 1)^2 + (y + 2)^2 = 25, expanding to x^2 + y^2 - 2x + 4y - 20 = 0 — the very circle of the previous turn, built from the other direction.

Circles — Position of a Point, Diameter Form and Tangent Length
• DEFINITION — For the circle S = x^2 + y^2 + 2g x + 2f y + c = 0 and a point (x1, y1), let S1 be the value of the expression at the point. Then S1 > 0 means the point is OUTSIDE the circle, S1 = 0 means ON it, and S1 < 0 means INSIDE. The sign does the whole classification — S1 is secretly (distance from centre)^2 - r^2, which is why its sign compares the distance with the radius.
• EXAMPLE — On S = x^2 + y^2 - 4x - 6y + 4 (centre (2, 3), r = 3): the point (1, 1) gives S1 = 1 + 1 - 4 - 6 + 4 = -4 < 0, inside — and indeed its distance from the centre is sqrt(1 + 4) = sqrt(5) < 3. The point (6, 3) gives S1 = 36 + 9 - 24 - 18 + 4 = 7 > 0, outside — distance from centre is 4 > 3. Both audits agree with the sign.
• DEFINITION — The diameter form: the circle with diameter endpoints (x1, y1) and (x2, y2) is (x - x1)(x - x2) + (y - y1)(y - y2) = 0. It comes from the angle-in-a-semicircle fact: for any point on the circle, the lines to the two endpoints are perpendicular, and the product of their slopes being -1 is exactly this equation.
• EXAMPLE — Diameter endpoints (-1, 1) and (7, -5): the equation is (x + 1)(x - 7) + (y - 1)(y + 5) = 0, expanding to x^2 - 6x - 7 + y^2 + 4y - 5 = x^2 + y^2 - 6x + 4y - 12 = 0 — Figure 2's circle, whose centre (3, -2) is the endpoints' midpoint and whose radius 5 is half their distance sqrt(64 + 36) = 10. The diameter form and the general form are the same circle confessing twice.
✔ KEY FORMULA — The length of the tangent from an external point (x1, y1) to the circle S = 0 is sqrt(S1). It is Pythagoras in the triangle centre–external point–touchpoint: (distance from centre)^2 = r^2 + (tangent length)^2, and (distance)^2 - r^2 is precisely S1. Two equal tangents can be drawn from any outside point; from an inside point, none — matching S1 < 0 making the root imaginary.
• EXAMPLE — Tangents from (6, 8) to x^2 + y^2 = 25: S1 = 36 + 64 - 25 = 75, tangent length sqrt(75) = 5 sqrt(3). In Figure 2, the external point (8, 3) and circle centre (3, -2), r = 5 give S1 = 64 + 9 - 48 + 12 - 12 = 25, tangent length 5 — and the drawing shows both tangents landing on the beautifully clean touchpoints (3, 3) and (8, -2), each exactly 5 units from (8, 3).
• At recognition depth, two named tangents facts. The tangent at a point (x1, y1) ON the circle is T = 0, where T = x x1 + y y1 + g(x + x1) + f(y + y1) + c: for x^2 + y^2 = 25 at (3, 4), T = 0 gives 3x + 4y = 25. And the chord of contact — the line joining the two touchpoints of tangents from an external point (x1, y1) — is T = S1: from (6, 8) to x^2 + y^2 = 25 it is 6x + 8y = 75. Section 15 collects these with the other conics.
⚠ EXAM TRAP — sqrt(S1) is the tangent length only when S1 > 0. For an inside point the formula returns an imaginary number, which is the algebra's way of saying the question is malformed — no tangent exists. If a problem asks for a tangent length and your S1 is negative, you have misread the circle or the point; stop and re-read rather than reporting sqrt of a negative.
• YOUR TURN — Classify (3, 4) with respect to x^2 + y^2 = 25, and find the tangent length from (2, 6) to x^2 + y^2 = 9. Answer: 9 + 16 - 25 = 0, so (3, 4) is ON the circle. For the second, S1 = 4 + 36 - 9 = 31 > 0, so the point is outside and the tangent length is sqrt(31).

Parabola — Anatomy of y^2 = 4ax
• DEFINITION — The parabola is the locus of points equidistant from a fixed point (the focus) and a fixed line (the directrix) — the locus machine's condition from the Your Turn in Section 7, which produced x^2 = 8(y - 2) there. In standard position the equal-distance condition between focus (a, 0) and directrix x = -a simplifies to y^2 = 4 a x, and that simplification is the whole derivation — worth doing once by hand.
• The anatomy of y^2 = 4 a x (a > 0): vertex at the origin (the curve's nose), focus at (a, 0) inside the bowl, directrix the line x = -a behind the nose, axis the x-axis (the line through focus perpendicular to the directrix), and the curve opening right, widening forever. It is symmetric about its axis.
✔ KEY FORMULA — The latus rectum of y^2 = 4 a x is the chord through the focus perpendicular to the axis; its length is 4a and its endpoints are (a, 2a) and (a, -2a). It is the curve's width gauge at the focus, and the most-asked single number in parabola questions. Read 4a first, then a = (coefficient of x)/4 follows.
• The four orientations, one pattern: y^2 = 4ax opens right, focus (a, 0), directrix x = -a. y^2 = -4ax opens left, focus (-a, 0), directrix x = a. x^2 = 4ay opens up, focus (0, a), directrix y = -a. x^2 = -4ay opens down, focus (0, -a), directrix y = a. In every case the focus sits a units from the vertex INSIDE the opening, the directrix sits a units OUTSIDE, and the latus rectum is 4a.
• EXAMPLE — y^2 = 12x: 4a = 12, so a = 3; focus (3, 0), directrix x = -3, latus rectum 12 with endpoints (3, 6) and (3, -6). Figure 3 draws y^2 = 8x with a = 2 — same read, halved numbers.
• EXAMPLE — x^2 = -16y: the squared variable is x and the sign is negative, so it opens DOWN; 4a = 16 gives a = 4; focus (0, -4), directrix y = 4, latus rectum 16. Two-step read: sign and squared variable choose the orientation, the coefficient gives a. Never let the coefficient speak before the orientation is settled.
• WORKED PATTERN — Finding a from a point: if y^2 = 4 a x passes through (3, 2), then 4 = 12 a, so a = 1/3, focus (1/3, 0), latus rectum 4/3. One substitution prices the whole curve — this is the standard IAT parabola opener.
⚠ EXAM TRAP — The a in y^2 = 12x is 3, not 12. The equation carries 4a as the coefficient; students who read a = 12 then report focus (12, 0) and latus rectum 48 have quadrupled every answer in the question. Say it as a mantra: the coefficient IS 4a; a is a quarter of it.
• YOUR TURN — Give the focus, directrix and latus rectum of y^2 = -6x. Answer: opens left, 4a = 6 so a = 3/2; focus (-3/2, 0), directrix x = 3/2, latus rectum 6.

▸ Parabola — Parametric Points, Focal Chords and Tangents
• DEFINITION — Every point of y^2 = 4 a x can be written parametrically as (a t^2, 2 a t) for a real parameter t: substitute and check, (2 a t)^2 = 4 a (a t^2). The parameter labels points along the curve — t = 0 is the vertex, t = 1 and t = -1 are the latus-rectum endpoints (a, ±2a), and t and -t are mirror points across the axis.
✔ KEY FORMULA — The focal distance of the point (a t^2, 2 a t) — its distance from the focus — is a(t^2 + 1). By the defining property it also equals the distance to the directrix, a t^2 + a. In Figure 3, the point at t = 2 on y^2 = 8x is (8, 8), and both distances are 2(4 + 1) = 10: the definition, audited numerically.
• DEFINITION — A focal chord is any chord through the focus. If one endpoint has parameter t, the other has parameter -1/t — the endpoints' parameters multiply to -1. The two halves of the chord, SP and SQ, obey the harmonic relation 1/SP + 1/SQ = 1/a, and the full length is a(t + 1/t)^2.
• EXAMPLE — On y^2 = 8x (a = 2), the focal chord at t = 2 joins (8, 8) to the point with parameter -1/2, namely (2 x 1/4, 2 x 2 x (-1/2)) = (1/2, -2). Its length: sqrt((8 - 1/2)^2 + (8 + 2)^2) = sqrt(56.25 + 100) = sqrt(156.25) = 25/2. Formula audit: a(t + 1/t)^2 = 2(2 + 1/2)^2 = 2 x 25/4 = 25/2. And 1/SP + 1/SQ with SP = 10 and SQ = 2(1/4 + 1) = 5/2: 1/10 + 2/5 = 1/2 = 1/a. Three computations, one story.
• The tangent at a point (x1, y1) on the parabola is T = 0 with T = y y1 - 2a(x + x1), i.e. y y1 = 2a(x + x1). At the parametric point it becomes t y = x + a t^2. EXAMPLE — At (2, 4) on y^2 = 8x (a = 2, t = 1): by the point form, 4y = 4(x + 2), so y = x + 2; by the parametric form, (1) y = x + 2(1) — identical, as they must be, since the point IS t = 1.
• The normal at (x1, y1) is perpendicular to the tangent there, with slope -y1/(2a), or in parametric terms slope -t. At (2, 4) on y^2 = 8x: slope = -4/4 = -1, equation y - 4 = -(x - 2), i.e. x + y = 6. Tangents and normals to all conics are collected in Section 15; here, note only that parabola normals are the ones whose slope is just -t — the cleanest of the family.
⚠ EXAM TRAP — The focal-chord partner of t is -1/t, not 1/t and not -t. The minus sign is the geometry: the chord passes through the focus, so its endpoints lie on opposite sides of the axis, forcing opposite-sign parameters. Losing the minus turns the chord into one that misses the focus entirely.
• YOUR TURN — Write down the point of y^2 = 8x at t = 3 and its focal distance. Answer: (a t^2, 2 a t) = (2 x 9, 2 x 2 x 3) = (18, 12) — audit: 12^2 = 144 = 8 x 18 ✓. Focal distance a(t^2 + 1) = 2 x 10 = 20.

Ellipse — Anatomy of the Standard Ellipse
• DEFINITION — The ellipse is the locus of points whose distances from two fixed points (the foci) sum to a constant 2a, larger than the distance between the foci. Gardeners draw it with two pins and a loop of string of length 2a; Figure 4 draws its anatomy next to the hyperbola's.
• The standard equation is x^2/a^2 + y^2/b^2 = 1 with a > b. Anatomy: centre at the origin; major axis along the x-axis of length 2a, with vertices (±a, 0); minor axis of length 2b, with co-vertices (0, ±b); foci at (±c, 0) where c = sqrt(a^2 - b^2), so the interfocal distance is 2c.
✔ KEY FORMULA — Eccentricity e = c/a = sqrt(1 - b^2/a^2), always between 0 and 1 for an ellipse. It measures the squash: e near 0 is nearly a circle (the foci huddle at the centre), e near 1 is a needle. The two directrices are the lines x = ±a/e, standing outside the vertices since a/e > a, and the latus rectum — the chord through a focus perpendicular to the major axis — has length 2b^2/a.
• EXAMPLE — x^2/25 + y^2/9 = 1, Figure 4's ellipse: a = 5, b = 3, c = sqrt(25 - 9) = 4, e = 4/5, foci (±4, 0), directrices x = ±25/4 = ±6.25, latus rectum 2 x 9/5 = 18/5. Five reads from two denominators — this fluency is the chapter's core skill, and it should take under twenty seconds.
• The flipped orientation: x^2/9 + y^2/25 = 1 has the LARGER denominator under y, so the major axis is vertical: semi-major 5 along y, foci (0, ±4), e = 4/5, vertices (0, ±5). The rule that survives every flip: a is always the SEMI-MAJOR axis (the bigger denominator's root), the foci always sit on the major axis, and e = sqrt(1 - (semi-minor)^2/(semi-major)^2). Rename the axes by size, never by letter position.
• WORKED PATTERN — Building the equation from foci and the sum: foci (±3, 0) and sum of focal distances 10 give 2a = 10 so a = 5, c = 3, b^2 = a^2 - c^2 = 16: the ellipse is x^2/25 + y^2/16 = 1, with e = 3/5 and latus rectum 32/5. The build is always a from the sum, c from the foci, b^2 by subtraction — Pythagoras with a minus sign, because c is a LEG of the ellipse's right triangle, not the hypotenuse.
⚠ EXAM TRAP — In the ellipse, a^2 = b^2 + c^2: a is the hypotenuse. Students who import the hyperbola's relation (where c^2 = a^2 + b^2 and c is the biggest) into the ellipse get c > a and e > 1 — an impossible ellipse eccentricity, and a flashing signal that the two relations have been swapped. Sanity-check every ellipse with e < 1 and every hyperbola with e > 1.
• YOUR TURN — Read e, the foci and the latus rectum of x^2/49 + y^2/24 = 1. Answer: a = 7, b^2 = 24, c = sqrt(49 - 24) = 5, e = 5/7, foci (±5, 0), latus rectum 2 x 24/7 = 48/7.

▸ Ellipse — Eccentric Angle and the Auxiliary Circle
• DEFINITION — Every point of the ellipse can be written as (a cos(theta), b sin(theta)); theta is the eccentric angle of the point. Setting theta = 0, 90, 180, 270 degrees gives the four vertices and co-vertices in turn, which is the quickest audit that the parametrisation is honest.
• DEFINITION — The auxiliary circle is the circle x^2 + y^2 = a^2 on the major axis as diameter. The point of the ellipse at eccentric angle theta sits directly below (or above) the point (a cos(theta), a sin(theta)) of the auxiliary circle — same x, y squashed by the factor b/a. The eccentric angle is measured on the CIRCLE, not on the ellipse, which is why it is called eccentric: it is not the angle of the point as seen from the centre, except on the axes.
• EXAMPLE — Theta = 90 degrees on x^2/25 + y^2/9 = 1 gives (5 cos 90, 3 sin 90) = (0, 3), the top co-vertex, whose auxiliary-circle partner is (0, 5). Same vertical line x = 0, heights 3 and 5 — the squash factor 3/5 made visible.
✔ KEY FORMULA — The focal distances of a point (x1, y1) on the ellipse are a - e x1 and a + e x1, summing to 2a as the definition demands. At (5, 0) on Figure 4's ellipse: 5 - (4/5)(5) = 1 and 5 + 4 = 9, matching the raw distances to (4, 0) and (-4, 0). When a problem gives a point and asks for its focal distances, this formula replaces two distance computations with two multiplications.
• WORKED PATTERN — Parametric points plug straight into tangents and distances: the point at theta = 45 degrees on x^2/25 + y^2/9 = 1 is (5/sqrt(2), 3/sqrt(2)) — write it instantly, then compute. Hesitation about WHICH coordinate gets a and which gets b is cured by the audit: the x-coordinate pairs with a because the parametrisation must hit (a, 0) at theta = 0.
• YOUR TURN — Find the point of x^2/16 + y^2/4 = 1 at eccentric angle 60 degrees, and verify it lies on the ellipse. Answer: (4 cos 60, 2 sin 60) = (4 x 1/2, 2 x sqrt(3)/2) = (2, sqrt(3)). Verify: 4/16 + 3/4 = 1/4 + 3/4 = 1 ✓.

Hyperbola — Anatomy, Asymptotes and the Rectangular Hyperbola
• DEFINITION — The hyperbola is the locus of points whose distances from two fixed points (the foci) differ by a constant 2a, smaller than the interfocal distance. The absolute difference forces two branches — points nearer one focus or nearer the other — one curve with two separate pieces.
• The standard equation is x^2/a^2 - y^2/b^2 = 1. Anatomy: centre at the origin; transverse axis along the x-axis, with vertices (±a, 0) where the branches nose towards each other; conjugate axis of length 2b along y (its endpoints (0, ±b) are NOT on the curve — b is measured on the asymptote rectangle, not the curve); foci at (±c, 0) with c = sqrt(a^2 + b^2), so c is the biggest of the three.
✔ KEY FORMULA — Eccentricity e = c/a = sqrt(1 + b^2/a^2), always GREATER than 1 for a hyperbola — the sign flip inside the root is the whole difference from the ellipse formula. Directrices: x = ±a/e (now INSIDE the vertices' span, since a/e < a). Latus rectum: 2b^2/a, the same shape of formula as the ellipse.
• EXAMPLE — Figure 4's hyperbola, x^2/16 - y^2/9 = 1: a = 4, b = 3, c = sqrt(16 + 9) = 5, e = 5/4, foci (±5, 0), directrices x = ±16/5 = ±3.2, latus rectum 2 x 9/4 = 9/2. Deliberately the ellipse's 3-4-5 triangle with the roles shuffled: same numbers, different anatomy.
• DEFINITION — The asymptotes are the two lines y = ±(b/a) x through the centre, which the branches approach forever without touching — formally, they are the curve you get by replacing the 1 in the equation with 0: x^2/a^2 - y^2/b^2 = 0 factorises into exactly those two lines. For Figure 4's hyperbola they are y = ±(3/4) x, drawn dashed in the figure, with the branches hugging them.
• The conjugate hyperbola of x^2/a^2 - y^2/b^2 = 1 is x^2/a^2 - y^2/b^2 = -1, i.e. y^2/b^2 - x^2/a^2 = 1: same asymptotes, branches opening up-down instead of left-right, eccentricity e' with 1/e^2 + 1/e'^2 = 1. Audit with our pair: e = 5/4 gives 16/25; the conjugate (a' = 3 along y, b' = 4) has e' = 5/3 giving 9/25; 16/25 + 9/25 = 1 ✓.
• DEFINITION — The rectangular hyperbola is the case a = b: x^2 - y^2 = a^2, whose asymptotes y = ±x are perpendicular, and whose eccentricity is sqrt(2). Rotated 45 degrees it becomes xy = c^2, the form in which it appears inside coordinate problems about products of coordinates — recognise both costumes.
⚠ EXAM TRAP — The hyperbola's b is not a curve measurement: no point of x^2/a^2 - y^2/b^2 = 1 has x = 0, so the curve never meets the conjugate axis. Students who mark (0, ±b) as points of the hyperbola have drawn the ellipse's anatomy onto the wrong curve. b lives on the asymptotes' rectangle — vertices (±a, 0) are the only axis points the curve owns.
• YOUR TURN — For y^2/9 - x^2/16 = 1, give the orientation, e and the foci. Answer: the positive term is in y, so the branches open up and down; semi-transverse a = 3 (along y), b = 4, c = sqrt(9 + 16) = 5, e = 5/3, foci (0, ±5). Same 3-4-5 skeleton, stood upright.

Tangents and Normals to Conics — the Formula Bank
• This section is deliberately a bank, not a derivation course: the IAT asks these at recognition and one-step-application depth. The organising device is the symbol T. For a curve S = 0 and a point (x1, y1), T is built by the replacement rules: x^2 becomes x x1, y^2 becomes y y1, 2x becomes (x + x1), 2y becomes (y + y1), and constants stay.
✔ KEY FORMULA — Tangent at (x1, y1) ON the curve, for all four conics, is T = 0: circle x^2 + y^2 + 2g x + 2f y + c = 0 gives x x1 + y y1 + g(x + x1) + f(y + y1) + c = 0; parabola y^2 = 4 a x gives y y1 = 2a(x + x1); ellipse x^2/a^2 + y^2/b^2 = 1 gives x x1/a^2 + y y1/b^2 = 1; hyperbola x^2/a^2 - y^2/b^2 = 1 gives x x1/a^2 - y y1/b^2 = 1. One device, four costumes — learn the replacement rules, not four separate formulas.
• EXAMPLE — Tangent to the ellipse x^2/25 + y^2/9 = 1 at (3, 12/5) (first audit the point: 9/25 + (144/25)/9 = 9/25 + 16/25 = 1, on the curve ✓): T = 0 gives 3x/25 + (12/5) y/9 = 1, i.e. 3x/25 + 4y/15 = 1, and clearing fractions (multiply by 75): 9x + 20y = 75.
✔ KEY FORMULA — Slope forms — the tangents of given slope m: circle x^2 + y^2 = r^2: y = m x ± r sqrt(1 + m^2); parabola y^2 = 4 a x: y = m x + a/m; ellipse x^2/a^2 + y^2/b^2 = 1: y = m x ± sqrt(a^2 m^2 + b^2); hyperbola x^2/a^2 - y^2/b^2 = 1: y = m x ± sqrt(a^2 m^2 - b^2). The ± gives the two parallel tangents; the expression under the root is the condition of tangency wearing the slope.
• EXAMPLE — Tangents of slope 1 to x^2/25 + y^2/9 = 1: y = x ± sqrt(25 x 1 + 9) = x ± sqrt(34). Notice a^2 multiplies m^2 and b^2 stands alone — swapping them gives sqrt(a^2 + b^2 m^2), the single most common transcription error in this bank.
• The normal at (x1, y1) is the line through the point perpendicular to the tangent: build it as (point) + (direction perpendicular to the tangent's direction). For the circle it always passes through the centre — a one-line fact worth more than its formula. For the parabola in parametric form the normal's slope is -t (Section 11); for the ellipse and hyperbola, work from the tangent's slope and the negative reciprocal.
• The chord of contact, completing the T family: from an external point (x1, y1), the line joining the two touchpoints is T = S1 — met for the circle in Section 9 (6x + 8y = 75 from (6, 8)). The chord whose midpoint is (x1, y1) is T = S1 in the same notation with a different meaning of S1; at recognition depth, hold the chord of contact firmly and the midpoint chord as a familiar face.
⚠ EXAM TRAP — T = 0 is the tangent only when (x1, y1) lies ON the curve. Feeding an external point into T = 0 produces the chord of contact instead (with T = S1), and feeding an internal point produces a chord-related line, not a tangent. Audit the point against the curve FIRST — one substitution, as in the ellipse example above, before choosing which formula the point has earned.
• YOUR TURN — Find the tangent to x^2 + y^2 = 16 at (-2, 2 sqrt(3)). Answer: first audit: 4 + 12 = 16, on the circle ✓. T = 0: -2x + 2 sqrt(3) y = 16, dividing by -2: x - sqrt(3) y + 8 = 0.

Formula Sheet
✔ Distance PQ = sqrt((x2 - x1)^2 + (y2 - y1)^2); midpoint = ((x1 + x2)/2, (y1 + y2)/2)
✔ Section formula (internal, ratio m : n): ((m x2 + n x1)/(m + n), (m y2 + n y1)/(m + n)) — the weights cross
✔ Area of a triangle = (1/2) |x1(y2 - y3) + x2(y3 - y1) + x3(y1 - y2)|; collinearity is area = 0
✔ Slope m = (y2 - y1)/(x2 - x1) = tan(theta); slope of ax + by + c = 0 is -a/b
✔ Angle between lines: tan(theta) = |(m2 - m1)/(1 + m1 m2)|; parallel m1 = m2; perpendicular m1 m2 = -1
✔ Line forms: point-slope y - y1 = m(x - x1); intercept x/a + y/b = 1; normal x cos(w) + y sin(w) = p
✔ Distance from (x1, y1) to ax + by + c = 0: |a x1 + b y1 + c| / sqrt(a^2 + b^2)
✔ Distance between parallels ax + by + c1 = 0 and ax + by + c2 = 0: |c1 - c2| / sqrt(a^2 + b^2), coefficients matched first
✔ Family of lines through L1 = 0 and L2 = 0 intersection: L1 + lambda L2 = 0 (never yields L2 itself)
✔ Circle x^2 + y^2 + 2g x + 2f y + c = 0: centre (-g, -f), radius sqrt(g^2 + f^2 - c), real only if g^2 + f^2 - c > 0
✔ Point versus circle: S1 > 0 outside, S1 = 0 on, S1 < 0 inside; tangent length from outside = sqrt(S1)
✔ Diameter form: (x - x1)(x - x2) + (y - y1)(y - y2) = 0
✔ Parabola y^2 = 4 a x: focus (a, 0), directrix x = -a, latus rectum 4a with endpoints (a, ±2a)
✔ Parabola point (a t^2, 2 a t); focal distance a(t^2 + 1); focal chord partner t' = -1/t; 1/SP + 1/SQ = 1/a; chord length a(t + 1/t)^2
✔ Ellipse x^2/a^2 + y^2/b^2 = 1 (a > b): c = sqrt(a^2 - b^2), e = sqrt(1 - b^2/a^2) < 1, foci (±c, 0), directrices x = ±a/e, latus rectum 2b^2/a
✔ Ellipse point (a cos(theta), b sin(theta)) on auxiliary circle x^2 + y^2 = a^2; focal distances a ∓ e x1
✔ Hyperbola x^2/a^2 - y^2/b^2 = 1: c = sqrt(a^2 + b^2), e = sqrt(1 + b^2/a^2) > 1, foci (±c, 0), directrices x = ±a/e, latus rectum 2b^2/a
✔ Asymptotes of the hyperbola: y = ±(b/a) x, i.e. the equation with 1 replaced by 0; rectangular hyperbola a = b, e = sqrt(2), rotated form xy = c^2
✔ Tangent at (x1, y1) on any conic: T = 0 (x^2 to x x1, y^2 to y y1, 2x to x + x1); chord of contact from outside: T = S1
✔ Slope-form tangents: ellipse y = m x ± sqrt(a^2 m^2 + b^2); hyperbola y = m x ± sqrt(a^2 m^2 - b^2); parabola y = m x + a/m; circle x^2 + y^2 = r^2: y = m x ± r sqrt(1 + m^2)

Common Mistakes and Exam Traps
• MISTAKE 1 — Subtracting the constants of two parallel lines whose x and y coefficients do not match, like 3x + 4y + 5 = 0 and 6x + 8y + 9 = 0
• Why it fails — The formula |c1 - c2| / sqrt(a^2 + b^2) compares constants of the SAME (a, b); with doubled coefficients the constant 9 lives on a different scale and the subtraction is meaningless
• Correct principle — Standardise first (halve the second line to 3x + 4y + 9/2 = 0), then subtract: the true distance is 1/10, not the naive (9 - 5)/5
• MISTAKE 2 — Reading the circle's centre as (g, f) or as half the coefficients without the sign flip, e.g. centre (4, 6) for x^2 + y^2 - 4x - 6y + 4 = 0
• Why it fails — The general form stores 2g and 2f, and the centre is (-g, -f): two operations (halve, negate) stand between the printed coefficients and the centre
• Correct principle — Centre (2, 3) here: halve -4 and -6 to -2 and -3, then negate. Say "minus half the coefficient" as one indivisible phrase
• MISTAKE 3 — Reporting a tangent length sqrt(S1) when S1 is negative
• Why it fails — Negative S1 means the point is inside the circle, from where no real tangent exists; the formula's imaginary output is a diagnosis, not an answer
• Correct principle — Classify the point first (S1 sign); if S1 < 0, the question or your reading of it is wrong — re-read before computing anything else
• MISTAKE 4 — Reading a as the full coefficient in y^2 = 12x, giving a = 12
• Why it fails — The standard form's coefficient is 4a, so the equation already contains the factor 4; taking 12 as a quadruples the focus, directrix and latus rectum in one move
• Correct principle — a = (coefficient of x)/4 = 3; latus rectum = the coefficient itself, 12, and a is always one quarter of it
• MISTAKE 5 — Assuming the ellipse's a is whichever denominator sits under x^2
• Why it fails — In x^2/9 + y^2/25 = 1 the major axis is vertical; using a = 3 puts the foci on the wrong axis and corrupts e, the directrices and the latus rectum together
• Correct principle — a is the semi-MAJOR axis: the root of the LARGER denominator, on whichever axis; the foci live on that axis
• MISTAKE 6 — Using the ellipse's e = sqrt(1 - b^2/a^2) for a hyperbola, or the hyperbola's plus sign for an ellipse
• Why it fails — The ellipse has c^2 = a^2 - b^2 (c is a leg) and the hyperbola has c^2 = a^2 + b^2 (c is the hypotenuse); the e formulas are those two relations divided by a^2
• Correct principle — Audit with the ranges: ellipse e must come out < 1, hyperbola e > 1. If your value violates its range, the sign was wrong, full stop
• MISTAKE 7 — Giving the angle between lines as the obtuse supplement
• Why it fails — The raw fraction (m2 - m1)/(1 + m1 m2) can be negative, and arctan of it returns a negative or obtuse-flavoured answer, while the angle between two lines is defined as the acute one
• Correct principle — Keep the modulus in tan(theta) = |(m2 - m1)/(1 + m1 m2)|; it exists precisely to discard the supplement
• MISTAKE 8 — Marking (0, ±b) as points of the hyperbola
• Why it fails — Setting x = 0 in x^2/a^2 - y^2/b^2 = 1 gives -y^2/b^2 = 1, impossible; the curve never meets the conjugate axis
• Correct principle — b is measured on the asymptote rectangle; the curve's only axis crossings are the vertices (±a, 0)
• MISTAKE 9 — Using T = 0 for a point that is not on the curve and calling the result a tangent
• Why it fails — T = 0 is the tangent only at an on-curve point; at an external point the tangent pair satisfies a different setup, and T appears as T = S1 (the chord of contact) instead
• Correct principle — Substitute the point into the curve first: on → T = 0; outside → tangent length sqrt(S1) machinery and T = S1 for the chord of contact; inside → stop
• MISTAKE 10 — Writing the slope of ax + by + c = 0 as a/b, or claiming a vertical line has slope 0
• Why it fails — Solving for y gives y = -(a/b) x - c/b: the minus sign is structural, and a vertical line's run is 0 so its slope is undefined, while slope 0 belongs to the horizontal line
• Correct principle — Slope is "minus a over b"; vertical means no slope exists, horizontal means slope zero — the two axis cases are opposites, not synonyms

Worked Examples — Basic to Challenging
• EXAMPLE 1 — THE PERPENDICULAR THROUGH A POINT
• Problem — Find the equation of the line through (2, 3) perpendicular to the line 3x + 4y = 12
• Given — The target line has slope -3/4 by the minus-a-over-b read; the required line passes through (2, 3)
• Principle — Perpendicular slopes multiply to -1, so the required slope is the negative reciprocal, 4/3; then point-slope form builds the line
• Steps — Required slope m = 4/3. Point-slope: y - 3 = (4/3)(x - 2). Multiply by 3: 3y - 9 = 4x - 8, so 4x - 3y + 1 = 0
• Answer — 4x - 3y + 1 = 0
• Reasoning — The perpendicular direction is a swap-and-flip of the coefficient pair: a line with direction coefficients (3, 4) is perpendicular to one with (4, -3), which is why the answer's coefficients look like the question's, shuffled — a built-in plausibility check
• Mistake to avoid — Using the same slope -3/4 (that builds the PARALLEL through the point) or the reciprocal without the sign (that is neither parallel nor perpendicular)
• EXAMPLE 2 — A DISTANCE THAT IS A HEIGHT IN DISGUISE
• Problem — Find the distance from the point (5, 1) to the line 4x - 3y - 2 = 0
• Given — Point (5, 1); line coefficients a = 4, b = -3, c = -2, with sqrt(a^2 + b^2) = 5
• Principle — The point-line distance formula: evaluate, modulus, divide by the coefficient length
• Steps — Evaluate: 4(5) - 3(1) - 2 = 20 - 3 - 2 = 15. Modulus 15. Divide by 5: distance = 3
• Answer — 3 units
• Reasoning — The 3-4-5 coefficient pair guarantees a clean denominator; examiners choose such pairs when they want the method tested, not the arithmetic — a messy denominator is often your first hint of a substitution slip
• Mistake to avoid — Substituting the point into the SLOPE formula instead, or forgetting that b is -3 (the line is 4x - 3y - 2 = 0, so b y1 is (-3)(1) = -3, not +3)
• EXAMPLE 3 — READING A CIRCLE AND PLACING A POINT
• Problem — For the circle x^2 + y^2 - 8x + 2y + 8 = 0, find the centre and radius, and state where the point (7, 2) lies
• Given — Coefficients: 2g = -8, 2f = 2, c = 8
• Principle — Centre (-g, -f); radius sqrt(g^2 + f^2 - c); position from the sign of S1 at the point
• Steps — g = -4, f = 1, so centre = (4, -1). Radius = sqrt(16 + 1 - 8) = sqrt(9) = 3. S1 at (7, 2): 49 + 4 - 56 + 4 + 8 = 9 > 0
• Answer — Centre (4, -1), radius 3; the point (7, 2) lies OUTSIDE the circle
• Reasoning — Audit by distance: (7, 2) is sqrt(9 + 9) = 3 sqrt(2), about 4.24, from the centre — beyond the radius 3, agreeing with S1 > 0; its tangent length, if asked, would be sqrt(S1) = 3
• Mistake to avoid — Reading f = 2 instead of 1 (the printed coefficient is 2f, so halve) and concluding the centre is (4, -2)
• EXAMPLE 4 — ONE POINT PRICES A PARABOLA
• Problem — The parabola y^2 = 4 a x passes through (4, -8). Find a, the focus, the directrix and the equation of the tangent at that point
• Given — A point on the curve and the standard form with one unknown
• Principle — A point on a curve satisfies its equation: one substitution buys a; the tangent at the point is T = 0
• Steps — (-8)^2 = 4 a (4) gives 64 = 16 a, so a = 4. Focus (4, 0); directrix x = -4. Tangent: y y1 = 2a(x + x1) gives -8y = 8(x + 4), i.e. x + y + 4 = 0
• Answer — a = 4; focus (4, 0); directrix x = -4; tangent x + y + 4 = 0
• Reasoning — Note the tangent passes through the given point: 4 + (-8) + 4 = 0 ✓. Also the point (4, -8) is exactly the lower latus-rectum endpoint (a, -2a) — planted numbers keep confessing their structure once you know the anatomy
• Mistake to avoid — Dropping the sign of y1 = -8 in the tangent formula and reporting x - y + 4 = 0; the tangent formula takes the point as it is, signs included
• EXAMPLE 5 — BUILDING AN ELLIPSE FROM ITS DEFINITION
• Problem — Find the equation of the ellipse whose foci are (±3, 0) and for which the sum of the focal distances of every point is 14; also give e and the latus rectum
• Given — Foci on the x-axis at distance c = 3 from the centre; defining sum 2a = 14
• Principle — a from the sum, c from the foci, b^2 = a^2 - c^2 (ellipse: a is the hypotenuse)
• Steps — a = 7. b^2 = 49 - 9 = 40. Equation: x^2/49 + y^2/40 = 1. e = c/a = 3/7. Latus rectum = 2b^2/a = 80/7
• Answer — x^2/49 + y^2/40 = 1; e = 3/7; latus rectum 80/7
• Reasoning — Every ellipse build is this three-step: sum gives a, foci give c, subtraction gives b^2. The hyperbola build of the next example is identical except b^2 comes by ADDITION — the two builds are one pattern with the sign flipped, which is exactly why the exam pairs them
• Mistake to avoid — Taking 2a = 14 as a = 14; the defining constant is 2a, the full string length, and the semi-major axis is half of it
• EXAMPLE 6 — READING A HYPERBOLA COMPLETELY
• Problem — For the hyperbola x^2/9 - y^2/16 = 1, find a, b, c, e, the foci, the directrices, the latus rectum and the asymptotes
• Given — Standard form with denominators 9 and 16
• Principle — a^2 and b^2 are the denominators; c^2 = a^2 + b^2 (hyperbola: c is the hypotenuse); e = c/a; latus rectum 2b^2/a; asymptotes y = ±(b/a) x
• Steps — a = 3, b = 4; c = sqrt(9 + 16) = 5; e = 5/3; foci (±5, 0); directrices x = ±a/e = ±9/5; latus rectum = 2 x 16/3 = 32/3; asymptotes y = ±(4/3) x
• Answer — a = 3, b = 4, c = 5, e = 5/3; foci (±5, 0); directrices x = ±9/5; latus rectum 32/3; asymptotes y = ±(4/3)x
• Reasoning — Audit e: 5/3 > 1, as a hyperbola demands. Notice the 3-4-5 triangle again — a, b, c of planted hyperbolas are very often a Pythagorean triple, so if your c comes out as an ugly root, suspect a denominator misread
• Mistake to avoid — Reporting the latus rectum as 2b^2/a with a and b swapped (2 x 9/4 = 9/2): a is the transverse semi-axis, the one under the POSITIVE term, here 3
• EXAMPLE 7 — REFLECTING A POINT IN A LINE
• Problem — Find the image of the point (4, 3) in the line x + y = 1
• Given — Point (4, 3); mirror line x + y - 1 = 0 with perpendicular direction (1, 1)
• Principle — Walk from the point along the perpendicular direction (a, b) = (1, 1) to the foot, then walk the same step again to the image
• Steps — Line value at (4, 3): 4 + 3 - 1 = 6; the walk parameter is t = -6/(1^2 + 1^2) = -3. Foot = (4 - 3, 3 - 3) = (1, 0). Image = (4 - 6, 3 - 6) = (-2, -3)
• Answer — The image is (-2, -3), with foot of perpendicular (1, 0)
• Reasoning — Audits: the midpoint of (4, 3) and (-2, -3) is (1, 0), which lies on the mirror (1 + 0 = 1 ✓), and the segment joining them has direction (-6, -6), parallel to (1, 1), the line's perpendicular direction ✓. Both audits are the definition of reflection restated
• Mistake to avoid — Stopping at the foot (1, 0) and reporting it as the image; the foot is the halfway point of the journey, and reflection questions are failed at the halfway mark more than anywhere else

Practice Questions — Self-Test Set
• Q1 — Find the slope of the line joining (2, -3) and (5, 6)
• Q2 — Write the equation of the line whose x-intercept is 3 and y-intercept is -4, in general form
• Q3 — Find the distance between the parallel lines 5x + 12y - 3 = 0 and 5x + 12y + 10 = 0
• Q4 — Find the centre and radius of the circle x^2 + y^2 + 8x - 6y + 9 = 0
• Q5 — Find the length of the tangent from the point (5, 5) to the circle x^2 + y^2 = 9
• Q6 — For the parabola x^2 = 20y, give the focus, the directrix and the length of the latus rectum
• Q7 — For the ellipse 9x^2 + 16y^2 = 144, find the eccentricity, the foci and the length of the latus rectum
• Q8 — For the hyperbola x^2/25 - y^2/16 = 1, find the eccentricity and the equations of the asymptotes

▸ Answer Key with Explanations
• A1 — Slope = (6 - (-3))/(5 - 2) = 9/3 = 3. Misconception: computing (6 - (-3)) as 3 by dropping the double negative gives slope 1 — the y-gap is 9, not 3
• A2 — Intercept form: x/3 + y/(-4) = 1; multiply by 12: 4x - 3y = 12. Misconception: writing 4x + 3y = 12 — the y-intercept is -4, and its sign survives into the general form; audit at (0, -4): 0 - 3(-4) = 12 ✓
• A3 — Coefficients already match: |10 - (-3)| / sqrt(25 + 144) = 13/13 = 1. Misconception: answering 13 (forgetting the division) or 13/5 (dividing by the wrong root); the 5-12-13 pair makes the denominator 13 and the answer exactly 1
• A4 — 2g = 8 and 2f = -6 give g = 4, f = -3; centre (-4, 3); radius sqrt(16 + 9 - 9) = sqrt(16) = 4. Misconception: centre (4, -3) — the halving was done but the negation skipped; the centre is MINUS half of each coefficient
• A5 — S1 = 25 + 25 - 9 = 41 > 0, so the point is outside and the tangent length is sqrt(41). Misconception: computing the distance from the centre, sqrt(50), instead — the tangent length comes from Pythagoras AFTER removing r^2 = 9: sqrt(50 - 9) = sqrt(41)
• A6 — x^2 = 20y opens up with 4a = 20, a = 5: focus (0, 5), directrix y = -5, latus rectum 20. Misconception: focus (5, 0) — the squared variable is x, so the axis is the y-axis and the focus lives on it; orientation before numbers, always
• A7 — Divide by 144: x^2/16 + y^2/9 = 1, so a = 4, b = 3, c = sqrt(7), e = sqrt(7)/4, foci (±sqrt(7), 0), latus rectum 2 x 9/4 = 9/2. Misconception: taking a^2 = 9 from the x^2 coefficient 9 in the un-divided equation — the denominators exist only AFTER dividing through; 9 and 16 in 9x^2 + 16y^2 = 144 are coefficients, not denominators
• A8 — a = 5, b = 4, c = sqrt(25 + 16) = sqrt(41), e = sqrt(41)/5; asymptotes y = ±(4/5) x. Misconception: e = sqrt(41)/4 or sqrt(9)/5 — e is c over the TRANSVERSE semi-axis a = 5, the denominator under the positive term

Chapter Summary, Revision Checklist and Self-Assessment
• The chapter in one paragraph: coordinate geometry converts pictures into algebra through a small toolkit — distance, section formula, area — and one direction number, the slope. Lines come in five forms chosen by the data given; distances from points to lines and between parallels are one formula each. The conics are loci: the circle (fixed distance), the parabola (equal distances to focus and directrix), the ellipse (constant sum 2a), the hyperbola (constant difference 2a) — each with a standard equation whose anatomy (a, b, c, e, foci, directrices, latus rectum) is read off by pattern, and tangents across all four are governed by the single T = 0 device.
• REVISION CHECKLIST — Can you read the centre and radius from any general circle in under ten seconds, halving and negating without hesitation?
• REVISION CHECKLIST — Can you convert the same line among general, slope-intercept, intercept and normal forms, and say when each form fails?
• REVISION CHECKLIST — Can you produce the point-line distance and the parallel-lines distance, standardising coefficients before subtracting constants?
• REVISION CHECKLIST — Can you run the locus machine: name the moving point, translate the condition, simplify, and name the curve?
• REVISION CHECKLIST — Given any of y^2 = ±4ax or x^2 = ±4ay, can you state focus, directrix and latus rectum after settling the orientation first?
• REVISION CHECKLIST — Given an ellipse or hyperbola in standard form, can you deliver a, b, c, e, foci, directrices and latus rectum, and audit e against its range (below 1, above 1)?
• REVISION CHECKLIST — Can you write the tangent at a point on any conic via T = 0, and do you audit that the point is on the curve before choosing the formula?
• SELF-ASSESSMENT — Score yourself: 8 of 8 practice questions with audits (application-ready); 6 of 8 (revise the two failed patterns today); 4 or fewer (rework Sections 8, 10, 12 and 14 — the four anatomy sections — before attempting timed sets)
• The bridge forward: lines and conics return inside calculus as tangents, normals and areas, and the locus machine becomes the definition tool for every curve you will ever meet. The parameter-reading reflexes built here — halve and negate, quarter the coefficient, audit the eccentricity — are permanent equipment.
<!-- END math_ch_7 detailedStudyNotes -->
