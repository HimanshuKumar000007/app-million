<!-- BEGIN phys_ch_2 detailedStudyNotes -->
Position, Path Length and Displacement
• Motion is always described relative to a frame of reference — an origin, an axis and a clock. In one dimension the position of a body is a single coordinate x, with a sign fixed by the chosen positive direction.
• Path length (distance travelled) is the total length of the actual route: a scalar, always positive, and it can never decrease as time passes.
• Displacement Δx = x₂ − x₁ is a vector fixed only by the starting and finishing points — the route taken does not matter at all.
✔ KEY FORMULA — Δx = x₂ − x₁ • |Displacement| ≤ path length always, with equality only when the body moves in one direction without ever turning back.
• Worked pattern: an athlete completing one full round of a 400 m track has path length 400 m but displacement exactly 0.
⚠ EXAM TRAP — Displacement can be zero or negative while path length is always positive; read the question word by word — "distance" asks for path length, "displacement" asks for Δx.

Average Velocity and Average Speed
• Average velocity v̄ = Δx/Δt measures how fast the position changes overall; it carries a direction and is zero for any trip that ends where it started.
• Average speed = total path length ÷ total time; it is always positive and is what a trip odometer divided by journey time would give.
✔ KEY FORMULA — Journey split into EQUAL DISTANCES at speeds v₁ and v₂: average speed = 2v₁v₂/(v₁ + v₂) (the harmonic mean) • Split into EQUAL TIMES: average speed = (v₁ + v₂)/2 (the ordinary mean).
• Worked pattern: half the journey at 40 km/h and half at 60 km/h gives average speed = 2 × 40 × 60 / 100 = 48 km/h — not 50 km/h.
• In general |average velocity| ≤ average speed, with equality only for motion in a single direction.
⚠ EXAM TRAP — Averaging two speeds directly is correct only when the two legs take equal time; distance-based legs always pull the average closer to the slower speed.

▸ Instantaneous Velocity and Speed — Velocity at a Moment
• Shrink the interval Δt towards zero around an instant: average velocity over that shrinking interval settles to the instantaneous velocity v = dx/dt.
• On a position–time graph, instantaneous velocity is the slope of the TANGENT drawn to the curve at that instant — not the slope of a chord between two far points.
• The sign of v gives the direction of travel (+ forward, − backward); instantaneous speed = |v| is the magnitude, and it is what a vehicle speedometer actually shows.
✔ KEY FORMULA — v = dx/dt = limit of Δx/Δt as Δt → 0 • For x = at² + bt + c, differentiate term by term: v = 2at + b.
• Worked pattern: x = 3t² + 2t (in metres) gives v = 6t + 2, so at t = 2 s the velocity is 14 m/s in the + direction.
⚠ EXAM TRAP — A body can have v = 0 at an instant without being "at rest" in any lasting sense — a ball at the top of its flight has zero velocity yet is about to fall back.

Position–Time Graphs — Reading Motion from Slope
• The x–t graph plots position against time; the body itself still moves along a straight line however curved this graph appears.
• A straight x–t line means uniform velocity equal to its slope; a horizontal line means the body is at rest; the steeper the line, the faster the motion.
• A curve whose slope grows with time means the body is speeding up in the + direction; a curve whose slope shrinks means it is slowing down; a negative slope means motion in the − direction.
• Where the x–t lines of two bodies cross, the bodies are at the same position at that instant — that crossing is their meeting point.
• The tangent at any point of a curved x–t graph gives the instantaneous velocity at that moment.
⚠ EXAM TRAP — A curved x–t graph does NOT mean a curved path, and the area under an x–t graph has no physical meaning — areas become meaningful only for v–t and a–t graphs.

Acceleration — the Rate of Change of Velocity
• Average acceleration ā = Δv/Δt; instantaneous acceleration a = dv/dt = d²x/dt². Acceleration is a vector with unit m/s², and it exists whenever velocity changes in magnitude OR direction.
• When acceleration is given as a function of position, use the chain-rule form a = v (dv/dx) — it removes time from the problem entirely.
✔ KEY FORMULA — a = dv/dt = d²x/dt² = v (dv/dx) • A body speeds up exactly when v and a have the SAME sign, and slows down exactly when they have OPPOSITE signs.
• Everyday scale: a freely falling body has a = g ≈ 9.8 m/s²; a car reaching 100 km/h (27.8 m/s) in 10 s accelerates at only about 2.8 m/s².
• Uniform (constant) acceleration is the special case this chapter's kinematic equations handle; zero acceleration means uniform velocity, not necessarily rest.
⚠ EXAM TRAP — "Negative acceleration" is not a synonym for slowing down: a body moving in the − direction with negative acceleration is speeding up. Retardation means only one thing — the speed |v| is decreasing.

▸ Velocity–Time Graphs — Slope Gives Acceleration, Area Gives Displacement
• The slope of a v–t graph at any point equals the instantaneous acceleration there; a straight v–t line therefore means uniform acceleration, and a horizontal line means uniform velocity.
✔ KEY FORMULA — Displacement = AREA under the v–t graph, counted positive above the time axis and negative below it • Total distance travelled = sum of the absolute areas • Change in velocity Δv = area under the a–t graph.
• Worked pattern: a triangular v–t graph with base 10 s and peak velocity 20 m/s encloses area ½ × 10 × 20 = 100, so the displacement is 100 m.
• A v–t graph can never be vertical (that would need infinite acceleration) and never folds back in time (time only increases).
• Reading a v–t graph together with its slope signs tells the whole story: direction of motion from the sign of v, speeding up or slowing from slope and sign together.
⚠ EXAM TRAP — The single most common graph error in IAT and JEE papers: area below the time axis must be SUBTRACTED for displacement but ADDED for distance. Decide which quantity the question wants before touching the areas.

Kinematic Equations for Uniformly Accelerated Motion
• The three equations connect the five quantities u (initial velocity), v (final velocity), a (acceleration), s (displacement) and t (time) — and they are valid ONLY when a is constant.
✔ KEY FORMULA — v = u + at • s = ut + ½at² • v² = u² + 2as • Two useful partners: s = vt − ½at² and s = ½(u + v)t.
• Where they come from: a = (v − u)/t rearranges to v = u + at; displacement is average velocity × time = ½(u + v)t; eliminating t between them gives v² = u² + 2as, and eliminating v gives s = ut + ½at².
• Sign discipline decides everything: choose one direction as positive at the start, then u, v, a and s all carry that sign consistently through the whole problem.
• Every quantity is a vector in disguise — if a body returns to its start, s = 0 even though the distance travelled is not.
⚠ EXAM TRAP — Never apply these equations when acceleration varies with time (for example a proportional to t, or a mass on a spring). Then only the calculus definitions v = dx/dt, a = dv/dt — or graph areas — are legal.

▸ Distance Travelled in the nth Second
• The distance covered during one particular second — say the 3rd second, from t = 2 s to t = 3 s — is s(3) − s(2); the general result is worth memorising directly.
✔ KEY FORMULA — sₙ = u + (a/2)(2n − 1) • Starting from rest (u = 0), the distances in successive seconds stand in the ratio 1 : 3 : 5 : 7 … — Galileo's odd-number rule — while the totals grow as 1 : 4 : 9 …
• Worked pattern: from rest with a = 2 m/s², the distance in the 3rd second is 0 + (2/2)(2 × 3 − 1) = 5 m, while the total distance in 3 s is ½ × 2 × 9 = 9 m.
• For an interval that is not a full second, never use sₙ — subtract displacements: distance between t₁ and t₂ = s(t₂) − s(t₁).
⚠ EXAM TRAP — "Distance in the nth second" and "distance in n seconds" are different quantities with different formulas; examiners place both in the options of the same question.

Choosing the Right Equation — a Ten-Second Method
• Write down the five quantities s, u, v, a, t. Mark the three you know, the one you want, and the one that is neither known nor wanted — the missing variable.
• Now pick the equation that does NOT contain the missing variable: no t → v² = u² + 2as • no s → v = u + at • no v → s = ut + ½at² • no a → s = ½(u + v)t • no u → s = vt − ½at².
★ HIGHLIGHT — Every uniformly accelerated motion problem is one of these five choices. Identify the absent variable first and the problem is already half solved — this single habit removes most silly errors under time pressure.
• Two-stage motion (accelerate, then brake): solve each stage separately; the final velocity of the first stage is the initial velocity of the second, and any turning point is simply where v = 0.
• If two bodies are involved, write one equation set per body and let the meeting condition (same position, same time) connect them.

Motion Under Gravity — Free Fall
• Near the Earth's surface every unsupported body accelerates downward at g ≈ 9.8 m/s² (use g = 10 m/s² when the question allows), whatever its mass — as long as air resistance is neglected.
• Take upward as positive and a becomes −g in all three kinematic equations; take downward as positive and a becomes +g. Either convention works — mixing the two inside one problem does not.
✔ KEY FORMULA — Thrown straight up with speed u: time to reach the top = u/g • Maximum height H = u²/(2g) • Total time of flight back to the launch level = 2u/g • It returns to the launch height with speed u again, direction reversed.
✔ KEY FORMULA — Dropped from rest at height h: impact speed v = √(2gh) • Time to fall t = √(2h/g) • A body thrown DOWNWARD from h starts with u ≠ 0 — use the full equations, not the dropped-body shortcuts.
• Symmetry of the flight: time going up equals time coming down between the same two levels, and the speed at any height is the same on the way up and on the way down.
• Distances fallen in successive seconds follow Galileo's odd numbers 1 : 3 : 5 : 7 (scaled by g/2), so the LAST second of a long fall always covers the greatest distance.
⚠ EXAM TRAP — At the very top of the flight v = 0 but a = −g, not zero; and in vacuum a heavy and a light body dropped together land together — mass cancels out of every free-fall formula.

▸ Dropped, Thrown Down, Projected Up — One Family, Three Starts
• The three situations differ ONLY in the value and sign of u: dropped → u = 0; thrown down → u in the direction of fall; projected up → u opposite to g, so v passes through zero at the top.
• A ball thrown up from a tower combines both acts: rise to H above the tower, then a fall from that full height; solve the fall from the top point with u = 0 and total height (tower + H).
• Worked pattern: a stone dropped from 80 m with g = 10 m/s² falls for t = √(2 × 80/10) = 4 s; in the first 3 s it covers 45 m, so the last second alone accounts for 35 m.
• Height ratios shortcut: for falls from rest, distances scale as t² — double the fall time means four times the height.
★ HIGHLIGHT — Whatever the story — lift, tower, balloon, well — rewrite it as u, a = ±g, s and t. The story changes every year in the papers; the equation set never does.

▸ Stopping Distance and Reaction Time
• Between seeing a hazard and the brakes biting, the vehicle travels at full speed for the driver's reaction time tᵣ (about 0.5–1 s): reaction distance = u × tᵣ, with no slowing at all.
✔ KEY FORMULA — Total stopping distance = u·tᵣ + u²/(2a) where a is the braking deceleration • Double the speed and the reaction part only doubles, but the braking part becomes FOUR times larger — stopping distance is dominated by the u² term.
• Worked pattern: u = 20 m/s, tᵣ = 0.5 s, braking deceleration 5 m/s² → reaction distance 10 m + braking distance 40 m = 50 m in total.
• The same square law governs safe following distance and is the physics behind speed limits near schools and crossings.
★ HIGHLIGHT — This is a favourite application in IAT and NEET papers because it tests the v² = u² + 2as equation with v = 0 — recognise "stopping" and immediately write u² = 2as.

Relative Velocity in One Dimension
• The velocity of A as measured by an observer riding with B is v_AB = v_A − v_B, where both velocities on the right are measured from the ground. Always v_BA = −v_AB.
• Two bodies moving in the SAME direction: relative speed = |v_A − v_B| — this governs chasing and overtaking. Moving in OPPOSITE directions: relative speed = v_A + v_B — this governs approaching and meeting.
✔ KEY FORMULA — Meeting time = initial separation ÷ relative speed of approach • Overtaking time = initial gap ÷ (v_faster − v_slower) • For two trains to cross completely, the relative displacement must equal the SUM of their lengths; a train crossing a pole needs only its own length.
• Worked pattern: two cars 100 m apart approaching at 20 m/s and 30 m/s meet after 100/(20 + 30) = 2 s.
• Rain, river and moving-walkway problems in later chapters are this same subtraction in two dimensions — master the 1D signs now.
⚠ EXAM TRAP — Relative velocity errors are almost always sign errors: compute (velocity of the object) − (velocity of the observer) in a fixed positive direction, and let the sign of the answer tell you the direction — never force it positive midway.

When Acceleration Is Not Uniform — the Calculus Toolkit
• The definitions never change: v = dx/dt and a = dv/dt hold at every instant of every motion, uniform or not. The kinematic equations are merely their constant-acceleration shortcuts.
• Run in reverse, the definitions become integrals: v = ∫a dt + u and x = ∫v dt + x₀ — the initial values are part of the answer, not decoration.
• Match the tool to the form given: a as a function of t → integrate directly • a as a function of v → write dt = dv/a(v) • a as a function of x → use a = v (dv/dx) and integrate over x.
• Worked pattern: a = 2t with the body starting from rest gives v = t² and x = t³/3, so at t = 3 s, v = 9 m/s and x = 9 m.
★ HIGHLIGHT — IAT's favourite pattern in this chapter: given x(t), differentiate twice for v and a; given a(t), integrate twice with the initial conditions. Practise x = t³ − 6t² + 9t until questions like "when is the body momentarily at rest?" (v = 0) and "when does it turn?" become free marks.
⚠ EXAM TRAP — With non-uniform acceleration the "average velocity = (u + v)/2" shortcut is ILLEGAL — that mean works only for constant a. Use total displacement ÷ total time instead.

Formula Sheet — One-Glance Recap
✔ KEY FORMULA — v = u + at • s = ut + ½at² • v² = u² + 2as • s = ½(u + v)t • sₙ = u + (a/2)(2n − 1).
✔ KEY FORMULA — Free fall: H = u²/(2g) • t_top = u/g • t_flight = 2u/g • v_impact = √(2gh) • t_fall = √(2h/g).
✔ KEY FORMULA — Stopping distance = u·tᵣ + u²/(2a) • Average speed, equal distances = 2v₁v₂/(v₁ + v₂) • Relative velocity v_AB = v_A − v_B.
• Graph rules, complete set: slope of x–t = velocity • slope of v–t = acceleration • area under v–t = displacement • area under a–t = change in velocity.
• Calculus rules, complete set: v = dx/dt • a = dv/dt = d²x/dt² = v(dv/dx) • x = ∫v dt • v = ∫a dt.

Final Rapid Check — the Traps That Cost Marks
⚠ EXAM TRAP — Distance in the nth second (sₙ) versus distance in n seconds (s): different formulas, both present in the options.
⚠ EXAM TRAP — Area under v–t below the axis: subtract for displacement, add for distance.
⚠ EXAM TRAP — At the top of a vertical throw: v = 0, a = g downward — acceleration does not vanish.
⚠ EXAM TRAP — Negative acceleration is not automatically retardation; check whether |v| is shrinking.
⚠ EXAM TRAP — Kinematic equations and (u + v)/2 both demand constant acceleration.
⚠ EXAM TRAP — Average of two speeds is the harmonic mean when distances are equal, arithmetic when times are equal.
⚠ EXAM TRAP — A curved x–t graph is still straight-line motion; the graph is a chart, not a photograph of the path.
★ HIGHLIGHT — Before submitting any numerical: check the sign convention was consistent, the units are SI (convert km/h by × 5/18), and the answer's size is physically sane — a car stopping in 0.5 m from 100 km/h is a red flag, not a result.
<!-- END phys_ch_2 detailedStudyNotes -->
