<!-- BEGIN phys_ch_2 detailedStudyNotes -->
Position, Path Length and Displacement
• Let's start with a scene you know. You walk 4 m east to the gate, realise you forgot your phone, and walk 4 m back west. Quick question — how far are you from where you started? Zero. But your legs definitely travelled 8 m. That gap between "how much ground you covered" and "where you finally ended up" is the whole game of this chapter.
• Path length (distance) is the total ground covered, added up step by step, ignoring direction. It only ever grows. In the scene above it is 8 m.
• Displacement is the straight-line jump from start point to end point, WITH direction: Δx = x₂ − x₁. Round trip back home? Displacement = 0, even after a marathon of walking.
✔ KEY FORMULA — Displacement Δx = x₂ − x₁ • Always |displacement| ≤ path length. They become equal only when the motion is in a straight line with no U-turn.
• YOUR TURN — A runner completes exactly one lap of a 400 m circular track. Distance? Displacement? (Answer: distance = 400 m, displacement = 0 — she ends where she started. This exact idea returns in Chapter 3, so lock it in.)
• Signs do the talking in 1D: pick one direction as positive (say, right or upward) and stick to it for the entire problem. A displacement of −5 m simply means "5 m in the opposite direction" — the minus is information, not an error.
⚠ EXAM TRAP — Never write "displacement = −8 m, so path length is also 8 m covered backwards". Path length has no sign and no direction. Mixing these two is the single most common silly mistake in kinematics.

Average Velocity and Average Speed
• Average velocity answers: "overall, how fast did the position change?" Average speed answers a different question: "overall, how fast did the body actually move?" Examiners love that these two answers can differ wildly.
✔ KEY FORMULA — Average velocity = Δx / Δt (displacement ÷ time; it carries a sign) • Average speed = total path length ÷ total time (always ≥ 0, never negative).
• Picture a delivery rider: showroom to your house is 6 km east, he rides 8 km of winding streets in 30 minutes. His average velocity is 6 km / 0.5 h = 12 km/h east — but his average speed is 8 / 0.5 = 16 km/h. Same trip, two honest answers.
• Now the classic exam trap, live: a car covers HALF the distance at 40 km/h and the other half at 60 km/h. Your gut says 50 km/h. Your gut is wrong.
✔ KEY FORMULA — For equal DISTANCES at speeds v₁ and v₂: average speed = 2v₁v₂ / (v₁ + v₂) — the harmonic mean — always LESS than the plain average. Here: 2 × 40 × 60 / 100 = 48 km/h. (For equal TIMES, the plain average (v₁ + v₂)/2 is correct — read the question's wording like a lawyer.)
• Why is it less? Because the car spends MORE time crawling at 40 than flying at 60, so the slow speed gets more "votes" in the average.
⚠ EXAM TRAP — If a body returns to its starting point, average velocity is exactly ZERO no matter how fast it moved. Average speed is not zero. Questions swap these two on purpose.

▸ Instantaneous Velocity and Speed — Velocity at a Moment
• "Average" velocity is a blunt instrument — it hides everything that happened in between. What you really want is the velocity at one exact moment: that is what a speedometer shows (as speed), and what calculus gives us precisely.
✔ KEY FORMULA — Instantaneous velocity v = dx/dt — the slope of the TANGENT to the position–time graph at that instant. Instantaneous speed = |v|, always the positive size of it.
• THINK OF IT LIKE THIS — Shrink the time window Δt smaller and smaller around the moment you care about. The average velocity over that tiny window settles down to one number: the instantaneous velocity. dx/dt is just that idea written in symbols.
• WORKED PATTERN — Given x = 3t² + 2t, differentiate: v = dx/dt = 6t + 2. At t = 2 s, v = 14 m/s. Differentiate once more: a = dv/dt = 6 m/s², constant. Whenever a problem hands you x(t), this two-step is your entire job.
• YOUR TURN — If x = 5t − t², at what time is the body momentarily at rest? Set v = 5 − 2t = 0 → t = 2.5 s. (Notice: "momentarily at rest" is code for v = 0 — it does NOT mean the acceleration is zero there. Hold that thought; gravity will prove it soon.)
• On a curved position–time graph, draw the tangent at your point and measure its slope — steep tangent means fast, flat tangent means instant rest, downward tangent means moving backwards.
★ HIGHLIGHT — Velocity can be read three ways and they are the same statement: v = dx/dt = slope of x–t graph = the limit of Δx/Δt. If one route is blocked in a problem, take another.

Position–Time Graphs — Reading Motion from Slope
• Before you look at the figure, predict: what should the x–t graph of a parked car look like? A car cruising at steady speed? A car speeding away? Now scroll to Fig. 2.1 and check yourself — that prediction habit is worth more than re-reading.
• The one rule that runs everything here: SLOPE = VELOCITY. Horizontal line → at rest. Straight slanted line → uniform velocity. Curve getting steeper → speeding up. Curve flattening out → slowing down. Line going downhill → moving in the negative direction.
• Two bodies on the same x–t graph: where their lines CROSS, they are at the same place at the same time — a meeting. The steeper line at any moment is the faster body at that moment.
• STOP & THINK — Can an x–t graph ever loop back over itself, like a circle? Never. That would mean the body is at two positions at the same time — impossible. If an option shows it, reject it instantly.
• WORKED PATTERN — A straight x–t line climbs from x = 2 m at t = 0 to x = 14 m at t = 4 s. Slope = (14 − 2)/4 = 3 m/s — that IS the velocity, uniform throughout.
⚠ EXAM TRAP — The x–t graph is NOT a picture of the road. A curved x–t graph still describes motion along a straight line — the curve lives in the graph, not in the street.

Acceleration — the Rate of Change of Velocity
• Velocity tells you how position changes. Acceleration tells you how VELOCITY changes — and "changes" includes slowing down and turning, not just speeding up. That wider meaning is where most students slip.
✔ KEY FORMULA — Average acceleration = Δv / Δt • Instantaneous acceleration a = dv/dt = d²x/dt² • Unit: m/s². On a velocity–time graph, acceleration is the SLOPE.
• The sign rule that saves careers: if v and a have the SAME sign, the body speeds up. If they have OPPOSITE signs, it slows down. Acceleration negative does NOT automatically mean slowing down — a body moving in the negative direction with negative acceleration is speeding up (in reverse).
• WORKED PATTERN — A car moving at −20 m/s (say, towards the left) brakes with acceleration +5 m/s². Opposite signs → it slows: after 4 s its velocity is −20 + 5 × 4 = 0. It stops, it does not "decelerate into positive speed" unless the force keeps pushing.
• YOUR TURN — A ball thrown straight up: on the way up, what are the signs of v and a (taking up as positive)? (Answer: v is +, a is −9.8 the whole flight — even at the top, even on the way down where v turns −. Gravity never takes a break.)
• Zero velocity does not imply zero acceleration — at the top of a throw, v = 0 but a = −g in full force. Zero acceleration DOES imply velocity is constant (which includes staying at rest).
★ HIGHLIGHT — Memorise the chain: position → (differentiate) → velocity → (differentiate) → acceleration. Integration runs the same chain backwards. Almost every calculus question in this chapter is one of these two directions.

▸ Velocity–Time Graphs — Slope Gives Acceleration, Area Gives Displacement
• The v–t graph is the most information-packed picture in the chapter: slope hands you acceleration, area hands you displacement. Look at Fig. 2.2 and find both before reading on.
✔ KEY FORMULA — Slope of v–t graph = acceleration • Signed area under the v–t graph = displacement Δx. Area ABOVE the time axis counts positive; area BELOW it counts negative — they can cancel.
• WORKED PATTERN — A v–t graph forms a triangle of base 10 s and height 20 m/s. Displacement = ½ × 10 × 20 = 100 m. No formula sheet needed — just geometry.
• But if they ask for DISTANCE, add the absolute areas (below-axis area counts as positive distance). Displacement vs distance, one graph, two questions — the paper-setter's favourite pair.
• A horizontal v–t line means uniform velocity (a = 0). A v–t line hugging the axis means the body is barely moving. A v–t line CROSSING the axis means the body changed direction at that instant.
• YOUR TURN — A v–t line falls steadily from +10 m/s at t = 0 to −10 m/s at t = 20 s. What is the displacement over the 20 s? (Answer: the + area and − area cancel → displacement = 0. But the distance travelled is 100 m — check by the two triangles, ½ × 10 × 10 each.)
⚠ EXAM TRAP — Never read the VALUE of the v–t graph as acceleration. The value is velocity; the SLOPE is acceleration; the AREA is displacement. Write V-S-A on your rough sheet for every graph question.

Kinematic Equations for Uniformly Accelerated Motion
• Here is the good news: when acceleration is constant, ALL of straight-line motion collapses into three equations. Here is the discipline: they work ONLY when acceleration is constant. Tattoo that condition on the inside of your eyelids.
✔ KEY FORMULA — (1) v = u + at • (2) s = ut + ½at² • (3) v² = u² + 2as. Plus the bonus: s = ½(u + v)t, and average velocity = (u + v)/2 for uniform acceleration.
• Where do they come from? Not magic: acceleration constant means the v–t graph is a straight line; its slope gives equation (1) and the trapezium area under it gives (2); eliminating t between them gives (3). Knowing this, a forgotten formula can be rebuilt from a sketch in 30 seconds.
• Each equation is missing exactly one variable — that is the selection secret. (1) has no s. (2) has no v. (3) has no t. (Bonus has no a.) The variable the problem neither gives nor asks for tells you which equation to pick. Next section turns this into a 10-second drill.
• SYMBOL DISCIPLINE — u = velocity at the START of the interval you are analysing, v = at the END of that same interval, s = displacement during it, t = its duration, a = constant throughout. Most "formula errors" are actually interval errors: students feed in numbers from different intervals.
• WORKED PATTERN — A train starts from rest, accelerates at 2 m/s² for 10 s. v = 0 + 2 × 10 = 20 m/s. s = 0 + ½ × 2 × 100 = 100 m. Cross-check with the bonus: s = ½(0 + 20) × 10 = 100 m ✓. Two routes agreeing is how toppers verify under pressure.
⚠ EXAM TRAP — Braking is just negative a. Pick your positive direction, then let the signs flow: if motion is forward-positive, braking means a is negative. Never flip signs mid-problem.

▸ Distance Travelled in the nth Second
• Subtle question, classic exam bait: "distance in the 3rd second" is NOT "distance in 3 seconds". The 3rd second is just the one-second slice between t = 2 and t = 3 — and there is a one-line formula for any such slice.
✔ KEY FORMULA — sₙ = u + (a/2)(2n − 1) = distance in first n seconds − distance in first (n − 1) seconds.
• WORKED PATTERN — From rest with a = 2 m/s²: the 3rd second gives s₃ = 0 + 1 × (2×3 − 1) = 5 m. Compare: distance in 3 seconds total is 9 m. The options in the exam will contain BOTH 5 and 9 — they are hunting students who misread.
• From rest, the distances in successive seconds follow the odd numbers 1 : 3 : 5 : 7 (times ½a) — Galileo's pattern. So with a = 2, the seconds give 1 m, 3 m, 5 m, 7 m… and cumulative totals are perfect squares × ½a: 1, 4, 9, 16.
• YOUR TURN — A body starts from rest with a = 4 m/s². Distance in the 2nd second? (Answer: ½ × 4 × 3 = 6 m. And in the first 2 seconds: 8 m. See how the slice and the total differ?)
★ HIGHLIGHT — Ratio questions are free marks here: from rest, s₂/s₁ = 3, s₃/s₁ = 5, and distance in n seconds ∝ n². If a question asks "in what ratio are distances in the 1st, 2nd, 3rd seconds", the answer 1 : 3 : 5 should be out before you reach for the pen.

Choosing the Right Equation — a Ten-Second Method
• In the exam hall, nobody has time to try all three equations. Use this drill instead — it turns equation-hunting into a reflex.
• Step 1: List the five players — u, v, a, s, t — and tick which three the problem GIVES you. Step 2: Name the one it ASKS for. Step 3: The fifth player, neither given nor asked, is "missing" — pick the equation that does not contain it. No s → v = u + at. No v → s = ut + ½at². No t → v² = u² + 2as. No a → s = ½(u + v)t.
• TRY THE DRILL — "A bus moving at 15 m/s brakes with deceleration 3 m/s². How far before it stops?" Given: u, a, and v = 0 (hidden in the word "stops" — always translate "stops" into v = 0). Asked: s. Missing: t. So v² = u² + 2as → 0 = 225 − 6s → s = 37.5 m. Ten seconds, no drama.
• Read for hidden givens: "starts from rest" = u = 0. "Dropped" = u = 0. "Stops" = v = 0. "Falls freely" = a = g ≈ 10 m/s² (or 9.8). Half the problem is translation; the algebra is the easy half.
• Units check before you compute: convert km/h to m/s by multiplying by 5/18 the moment you see it. Do it in the first line, every time — mid-solution conversions are where factors of 3.6 go to die.
⚠ EXAM TRAP — If the problem gives you FOUR of the five players, any equation works — but the asked quantity might need two steps (find t first, then use it). Don't force one equation to do two jobs.

Motion Under Gravity — Free Fall
• Now the star application. Near Earth's surface, every freely falling body — coin, cricket ball, carelessly dropped phone — accelerates downward at g ≈ 9.8 m/s² (use 10 when the problem says so). Mass does not matter. Shape does not matter (once we ignore air). Galileo's tower story, in one line: gravity treats everyone equally.
• Free fall is just the three kinematic equations with a replaced by −g (taking upward as positive) — nothing new to memorise, one substitution to make. v = u − gt • s = ut − ½gt² • v² = u² − 2gs.
✔ KEY FORMULA — Dropped from rest at height h: fall time t = √(2h/g) • Impact speed v = √(2gh). Thrown UP at u: max height H = u²/(2g) • Time to top = u/g • Total flight time (back to launch level) = 2u/g.
• WORKED PATTERN — A stone is dropped from an 80 m tower, g = 10. Fall time = √(160/10) = 4 s. Distance in the first 3 s = ½ × 10 × 9 = 45 m — so the LAST second alone covers 80 − 45 = 35 m. Falling bodies feast late: most of the distance comes in the final moments because speed keeps building.
• Symmetry to exploit: for a projectile returning to launch level, time up = time down, and it passes each height with the same speed going up and coming down (directions flipped). Half of all free-fall MCQs collapse if you spot the symmetry first.
• YOUR TURN — A ball is thrown up at 30 m/s (g = 10). Maximum height? Time to return to the hand? (Answer: H = 900/20 = 45 m; total time = 2 × 30/10 = 6 s.)
⚠ EXAM TRAP — At maximum height, v = 0 but a = −g, NOT zero. If a were zero at the top, the ball would just stay there. Any option claiming "acceleration is zero at the highest point" is bait — take the free mark.

▸ Dropped, Thrown Down, Projected Up — One Family, Three Starts
• Three problem costumes, one body: the only difference between them is the starting velocity u you feed into the same three equations. Learn to see through the costume.
• DROPPED: u = 0. The equations shrink: s = ½gt², v = gt, v² = 2gs. THROWN DOWN at u: everything is the dropped case plus a head start — it lands sooner AND faster: v² = u² + 2gh. PROJECTED UP at u: it rises for u/g seconds, gains u²/2g of height, then becomes — mid-air — a dropped body. Split every upward problem at the top; the second half is always a simple drop.
• WORKED PATTERN — From a 45 m roof (g = 10): dropped, a stone takes √(2×45/10) = 3 s. Thrown down at 10 m/s: 45 = 10t + 5t² → t² + 2t − 9 = 0 → t ≈ 2.16 s. Thrown UP at 10 m/s: it returns to roof level after 2 s moving down at 10 m/s, then needs the same 2.16 s → total ≈ 4.16 s. Same roof, three stories, one method.
• A beautiful check: thrown up or thrown down at the same speed from the same height, the IMPACT speed is identical √(u² + 2gh) — the up-thrown ball wastes time, not speed.
★ HIGHLIGHT — When a problem feels complicated, ask: "at which instant does this become a simple drop?" Almost every hard free-fall question is an easy drop wearing a disguise for its first act.

▸ Stopping Distance and Reaction Time
• This section is physics you will literally use on the road. A driver sees danger. Two things must happen before the car stops: the driver's brain reacts (during which the car cruises on, untouched), then the brakes bite. Total stopping distance = reaction distance + braking distance.
✔ KEY FORMULA — Reaction distance = u × t_reaction • Braking distance = u² / (2a) • Stopping distance = u·tᵣ + u²/(2a).
• WORKED PATTERN — Car at 20 m/s, reaction time 0.5 s, braking deceleration 5 m/s²: reaction distance = 10 m, braking distance = 400/10 = 40 m, total = 50 m. That is half a football field — at city speed.
• Feel the scaling: double the speed and the reaction distance doubles, but the braking distance QUADRUPLES (it carries u²). This is why highway speeds are unforgiving, and why "speed doubled, stopping distance doubled" is always a wrong option.
• YOUR TURN — Same car, same driver, but speed is now 40 m/s. Stopping distance? (Answer: 40 × 0.5 + 1600/10 = 20 + 160 = 180 m. Speed ×2, stopping distance ×3.6 — nowhere near double.)
⚠ EXAM TRAP — Forgetting the reaction distance is the designed error — the braking-only number (40 m above) will always be sitting in the options, smiling at you. Add both parts, every time.

Relative Velocity in One Dimension
• Velocity is meaningless until you say "measured by whom". A passenger walks forward inside a train at 2 m/s; the train does 30 m/s past the platform. The platform sees the passenger at 32 m/s. Both numbers are correct — in different frames. Relative velocity is how we translate between frames.
✔ KEY FORMULA — v of A as seen by B: v_AB = v_A − v_B (velocities signed along the line, both measured in the ground frame).
• Same direction: subtract — a car at 30 chasing a car at 25 gains at only 5 m/s. Opposite directions: the signs do the work — two trains approaching at 30 and 20 close at 30 − (−20) = 50 m/s. "Closing speed" is just relative velocity wearing a name tag.
• WORKED PATTERN — Two cars 100 m apart drive towards each other at 20 m/s and 30 m/s. Closing speed = 50 m/s, so they meet in 100/50 = 2 s. Meeting problems are one division once you think relatively: freeze one car, let the other come at the combined speed.
• The rain-on-a-train-window effect, in 1D dress: hold your hand out of a moving car and the still air hits you like wind — because relative to you, the air rushes backwards at the car's speed. Chapter 3 lifts this exact idea into two dimensions with rain and rivers.
• YOUR TURN — A truck at 25 m/s is ahead of a car at 30 m/s, 40 m apart, same direction. When does the car catch up? (Answer: relative speed 5 m/s → 40/5 = 8 s.)
⚠ EXAM TRAP — v_AB = −v_BA, always. And v_AB means "A as seen FROM B" — swapping the order flips the sign. Write the sentence in words before touching numbers.

When Acceleration Is Not Uniform — the Calculus Toolkit
• Real motion is messier than constant a — engines surge, springs oscillate. The three kinematic equations retire here, but calculus does not break a sweat. Four tools handle everything.
✔ KEY FORMULA — v = dx/dt • a = dv/dt = d²x/dt² • a = v (dv/dx) when time is not in the story • And backwards: v = ∫a dt, x = ∫v dt (with the starting values as constants — never drop them).
• Choosing the tool: given x(t) → differentiate down the chain. Given a(t) → integrate up the chain. Given a in terms of x, or v in terms of x → the chain-rule form a = v dv/dx is the only door. Given a graph → slope/area thinking from earlier sections.
• WORKED PATTERN — A particle starts from rest with a = 2t. Integrate: v = t² + C, and rest at t = 0 gives C = 0. Integrate again: x = t³/3. At t = 3 s: v = 9 m/s, x = 9 m. Clean numbers are the examiner telling you you're on the right path.
• WORKED PATTERN 2 — Velocity depends on position: v = 2√x. Find a. Use a = v dv/dx: dv/dx = 1/√x, so a = 2√x × 1/√x = 2 m/s² — a constant hiding inside a messy-looking motion. Beautiful, and a known IAT flavour.
★ HIGHLIGHT — IAT's signature move in this area: hand you something like x(t) or a(t) with clean numbers and ask for the OTHER quantity at a specific instant. Differentiate or integrate, substitute, done. Students who reach for v = u + at here are bringing a knife to a calculus fight.
⚠ EXAM TRAP — Integration constants are not decoration: "starts from rest" and "starts at the origin" are the clues that fix them. An answer missing the constant is an answer missing the initial condition.

Formula Sheet — One-Glance Recap
✔ KEY FORMULA — v = u + at • s = ut + ½at² • v² = u² + 2as • s = ½(u + v)t • sₙ = u + (a/2)(2n − 1).
✔ KEY FORMULA — v = dx/dt • a = dv/dt = v dv/dx • Free fall: t = √(2h/g), v = √(2gh), H = u²/2g • Stopping: u·tᵣ + u²/2a.
✔ KEY FORMULA — Equal-distance average speed = 2v₁v₂/(v₁ + v₂) • Relative velocity v_AB = v_A − v_B • v–t area = displacement, v–t slope = acceleration.
• The five-second self-test before any problem: Is a constant? Which three variables do I have? Which one is missing? — then write the equation.

Final Rapid Check — the Traps That Cost Marks
⚠ EXAM TRAP — Distance in the nth second ≠ distance in n seconds (5 m vs 9 m in our worked case — both will be options).
⚠ EXAM TRAP — Average speed over equal distances is the harmonic mean (48, not 50). Over equal times it is the plain mean.
⚠ EXAM TRAP — At the top of a throw: v = 0, a = −g. Not both zero. Never both zero.
⚠ EXAM TRAP — The kinematic equations demand constant a. If a varies, switch to calculus without a second thought.
⚠ EXAM TRAP — Negative acceleration is not a synonym for slowing down — compare the SIGNS of v and a.
⚠ EXAM TRAP — On graphs: value, slope and area are three different quantities. Label which one the question wants before computing.
⚠ EXAM TRAP — Stopping distance has TWO parts; "stops" means v = 0; km/h converts with 5/18 in line one.
★ HIGHLIGHT — You now own the full straight-line toolkit: describe it (graphs), average it, differentiate it, integrate it, and pick the right equation in ten seconds. Chapter 3 takes every one of these ideas off the line and into the plane — vectors are next, and they are friendlier than they look.
<!-- END phys_ch_2 detailedStudyNotes -->
