# Physics Ch 02 — Motion in a Straight Line
# For: ChapterEntity id = "phys_ch_2", field detailedStudyNotes in SmartPrepSeedData.kt
# Syllabus: Instantaneous velocity and speed; Acceleration; Kinematic equations for uniformly accelerated motion.
# Images for this chapter (PNG, delivered separately — add to app assets):
#   fig-2.1-motion-graphs.png  (Section 4)
# ---- BEGIN detailedStudyNotes text (paste between the triple quotes) ----

1. Position, Path Length and Displacement
• Motion is described relative to a frame of reference — an origin, axes and a clock. In one dimension, position is a single coordinate x.
• Path length (distance) is the total length of the actual path: a scalar, always positive, and it never decreases.
• Displacement Δx = x₂ − x₁ is a vector: it depends only on the start and end points, not on the path taken.
• |Displacement| ≤ path length always; they are equal only when motion is in one direction without turning back.
• Example: one full round of a 400 m track — path length = 400 m, displacement = 0.

2. Average and Instantaneous Velocity and Speed
• Average velocity v̄ = Δx/Δt = (x₂ − x₁)/(t₂ − t₁). It gives the net rate of change of position, not the details in between.
• Average speed = total path length ÷ total time. In general, average speed ≥ |average velocity|.
• Instantaneous velocity v = dx/dt — the velocity at one instant, found as the slope of the tangent to the x–t graph at that point.
• Instantaneous speed = |v|. Speed is a scalar — a speedometer shows instantaneous speed, never velocity.
• A body returning to its starting point has zero average velocity for the trip, even though its average speed is not zero.

3. Acceleration
• Average acceleration ā = Δv/Δt = (v₂ − v₁)/(t₂ − t₁). Instantaneous acceleration a = dv/dt — the slope of the v–t graph. Unit m/s², dimensions [L T⁻²].
• Useful forms: a = dv/dt = d²x/dt² = v(dv/dx). The last form is used when acceleration depends on position.
• Acceleration is a vector. In 1D, a body speeds up when v and a have the same sign and slows down when they have opposite signs — negative acceleration alone does not mean slowing down.
• Velocity can be zero at an instant while acceleration is not: at the top of a vertical throw, v = 0 but a = −g throughout the flight.
• If velocity is constant, acceleration is zero. If acceleration is constant, velocity changes equally in equal times.

4. Graphs of Motion [Fig. 2.1]
• x–t graph: slope at any point = instantaneous velocity. A straight line means constant velocity; a curve getting steeper means speeding up.
• v–t graph: slope = acceleration; area under the curve = displacement (area below the time axis counts negative).
• a–t graph: area under the curve = change in velocity Δv.
• For uniformly accelerated motion: the x–t graph is a parabola, the v–t graph is a straight line, and the a–t graph is a horizontal line.

5. Kinematic Equations for Uniformly Accelerated Motion
• v = u + at
• s = ut + ½at²
• v² = u² + 2as
• Average velocity form (constant a only): s = ((u + v)/2) × t
• Displacement in the nth second: sₙ = u + (a/2)(2n − 1)
• Quick check: with u = 0 and a = 2 m/s², s₅ = (2/2)(2×5 − 1) = 9 m — matching s(5 s) − s(4 s) = 25 − 16 = 9 m.
• These equations apply ONLY when acceleration is constant. Fix one direction as positive at the start and use the same sign convention for u, v, a and s throughout.
• If acceleration changes with time, do not use these equations — use v = ∫a dt and x = ∫v dt instead.

6. Motion Under Gravity (Free Fall)
• A freely falling body has constant acceleration g ≈ 9.8 m/s² directed downwards (use 10 m/s² only if the question says so). Apply the same kinematic equations with a = −g (upward positive).
• Dropped from rest from height h: time to fall t = √(2h/g); speed at the ground v = √(2gh).
• Thrown vertically up with speed u: maximum height H = u²/(2g); time to reach the top t = u/g; total time of flight back to the launch point = 2u/g.
• The motion is symmetric: speed at any height is the same while going up and coming down.
• Example: a stone dropped from a 45 m tower (g = 10 m/s²) takes t = √(2×45/10) = 3 s and hits the ground at v = √(2×10×45) = 30 m/s.

7. Relative Velocity in One Dimension and Worked Examples
• Velocity of A relative to B: v_AB = v_A − v_B, with all velocities measured in the ground frame using the same sign convention. Bodies approaching each other have relative speed equal to the sum of their speeds.
• Braking example: a car at 20 m/s brakes with retardation 5 m/s². Stopping distance: 0 = 20² + 2(−5)s, so s = 40 m; stopping time: 0 = 20 − 5t, so t = 4 s.
• Calculus example: for x = t² − 4t + 3, v = dx/dt = 2t − 4, so the particle is instantaneously at rest at t = 2 s; its displacement in the first 2 s is x(2) − x(0) = −4 m.

# ---- END detailedStudyNotes text ----
