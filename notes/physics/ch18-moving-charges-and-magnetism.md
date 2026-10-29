<!-- BEGIN phys_ch_18 detailedStudyNotes -->
Introduction — The Force That Never Pushes Forward
• A compass needle swings towards a current-carrying wire. A proton entering the Earth's magnetic field spirals down towards the poles and paints the aurora. A hospital MRI magnet, strong enough to lift a car, guides nothing but invisible field lines. One actor sits behind all of it: the magnetic force — the strangest force you have met so far, because it pushes sideways, never forward.
• Here is the promise of this chapter. By the end you will be able to compute the force on any moving charge and any current-carrying wire, predict the exact circle or helix a particle traces in a magnetic field, find the field produced by wires, loops, solenoids and toroids, and design the shunt or series resistor that turns a delicate galvanometer into a working ammeter or voltmeter.
• The chapter has two halves that mirror each other beautifully. Half one: magnetic fields EXERT forces (on charges and currents). Half two: currents CREATE magnetic fields (Biot–Savart and Ampere). The bridge between them — the force between two current-carrying wires — is so fundamental that it was used to define the ampere itself.
• One golden fact to carry through everything: a magnetic force is always perpendicular to the velocity of the charge it acts on. It can bend a path, curve a trajectory, twist a coil — but it can never speed a particle up or slow it down. Keep that in sight and half the traps in this chapter simply evaporate.
★ HIGHLIGHT — The whole chapter in one breath: charges feel F = qv × B, currents feel F = IL × B, currents make fields by Biot–Savart and Ampere's laws, and a current loop in a field feels a pure turning torque τ = NIAB sinθ with no net force.

Magnetic Force on a Moving Charge — the Lorentz Force
• DEFINITION — Magnetic (Lorentz) force: the force exerted by a magnetic field B on a charge q moving with velocity v is F = qvB sinθ in magnitude, where θ is the angle between v and B. In vector form, F = q(v × B).
• DEFINITION — Lorentz force (complete form): when electric and magnetic fields act together, the total electromagnetic force on a charge is F = qE + q(v × B). The first term is the electric force; the second is the magnetic force.
• Direction — use the right-hand rule for the cross product: point the fingers of your right hand along v, curl them towards B; your thumb gives the direction of F for a POSITIVE charge. For a negative charge (an electron!), the force is exactly opposite.
• WHY the force is sideways — the magnetic force arises because a moving charge is itself a tiny current, and a field can only deflect the motion it cuts across. If v is parallel or antiparallel to B, sinθ = 0 and the force vanishes: a charge sliding along a field line feels nothing at all.
• EXAMPLE — A proton (q = 1.6 × 10^-19 C) moving at 4 × 10^5 m/s in a field of 0.5 T at 30 degrees to the field feels F = qvB sin30 = 1.6 × 10^-14 N. Tiny — but the proton's mass is tinier still, so the sideways acceleration is enormous.
• EXAMPLE — An electron in a TV tube or an aurora moves through the Earth's field of about 5 × 10^-5 T. The force is small per particle, yet with astronomical numbers of particles it organises the entire light show of the polar sky.
• WORKED PATTERN — Any Lorentz-force question is three checks in order: (1) what is θ between v and B? (2) is the charge positive or negative (flip the direction if negative)? (3) magnitude from qvB sinθ, direction from the cross product — never guessed, always derived.
• YOUR TURN — A charge of 2 microcoulombs moves at 10^6 m/s perpendicular to a 0.3 T field. Force? Answer: F = qvB = 2 × 10^-6 × 10^6 × 0.3 = 0.6 N.
★ HIGHLIGHT — The magnetic force does NO work. Because F is always perpendicular to v, the displacement along F is zero: the speed and kinetic energy of a charge in a pure magnetic field NEVER change — only the direction of motion changes.
✔ KEY FORMULA — F = qvB sinθ; F = q(v × B); total Lorentz force F = qE + q(v × B). SI unit of B: the tesla, 1 T = 1 N A^-1 m^-1 = 1 N C^-1 (m/s)^-1.
⚠ EXAM TRAP — Students write F = qvB even when v is at an angle or parallel to B. The sinθ is not decoration: parallel motion means zero force, and 30 degrees means half the maximum force. Also, never forget the electron sign flip — IAT loves asking for the direction of the force on an electron.

▸ Force on a Current-Carrying Conductor
• DEFINITION — A straight conductor of length L carrying current I in a uniform field B experiences F = BIL sinθ, where θ is the angle between the conductor (the current direction) and B. Vector form: F = I(L × B), with L pointing along the current.
• WHY this is the same law — a current is just a river of moving charges. Add up the Lorentz force qvB on every drifting electron inside the wire (with I = nqAv_d doing the bookkeeping) and the microscopic force becomes the macroscopic BIL sinθ. One law, two costumes.
• Fleming's left-hand rule — First finger: Field, seCond finger: Current, thuMb: Motion (force). This is the motor rule; it applies to the force on a conductor or a positive charge.
• EXAMPLE — A 0.5 m wire carrying 4 A perpendicular to a 0.6 T field feels F = BIL = 0.6 × 4 × 0.5 = 1.2 N — enough to visibly kick the wire. This kick is the working principle of every electric motor, loudspeaker and galvanometer you will meet in this chapter.
• EXAMPLE — A wire carrying current parallel to the field feels zero force, however large the current. Motors are designed so the active sides of the coil stay perpendicular to B for exactly this reason.
• WORKED PATTERN — For a bent or curved wire in a uniform field, replace it by the straight vector joining its endpoints: the total force depends only on the net L vector between the entry and exit points. For a CLOSED loop in a uniform field the net magnetic force is exactly zero — remember this when torque arrives later: pure turning, no translation.
• YOUR TURN — A 20 cm wire carries 5 A at 45 degrees to a 0.4 T field. Force? Answer: F = BIL sin45 = 0.4 × 5 × 0.2 × 0.707 ≈ 0.28 N.
⚠ EXAM TRAP — Magnetic force on a conductor is zero only if the current is parallel to B or the current is zero. A stationary charge in a magnetic field also feels nothing — the magnetic force needs MOTION. A stationary charge near a magnet is completely unaffected.

Circular Motion of a Charge in a Magnetic Field
• DEFINITION — When a charge enters a uniform magnetic field with velocity perpendicular to B, the Lorentz force — always perpendicular to v, always the same size qvB — plays the role of a perfect centripetal force. The particle moves in a circle at constant speed.
• The radius follows from qvB = mv²/r, giving r = mv/(qB) = p/(qB): radius grows with momentum and shrinks with field strength and charge.
• The period is T = 2πr/v = 2πm/(qB) — and notice what is missing: the speed. Faster particles draw bigger circles in exactly the same time. The frequency ν = qB/(2πm) is called the cyclotron frequency; hold on to it, the cyclotron is built on it.
• EXAMPLE — An electron at 2.0 × 10^7 m/s in a 0.40 T field: r = mv/(qB) = 9.11 × 10^-31 × 2.0 × 10^7 / (1.6 × 10^-19 × 0.40) = 2.84 × 10^-4 m, a circle barely 0.28 mm in radius, completed in T = 8.93 × 10^-11 s — over ten billion laps per second.
• EXAMPLE — Double the speed and the radius doubles, but the period is unchanged. Double the field and the radius halves while the period halves. These scalings — not the raw formulas — are what one-mark questions actually test.
• WORKED PATTERN — Comparing particles: at the same velocity, r ∝ m/q. An alpha particle (4m, 2q) versus a proton gives r_alpha = 2 r_proton. At the same kinetic energy, r = √(2mK)/(qB) ∝ √m/q, and the alpha-to-proton ratio becomes exactly 1 — same radius. Learn to ask: same v, same p, or same K? Each has its own ratio.
• YOUR TURN — A proton moves in a circle of radius 0.10 m in a 0.5 T field. Its speed? Answer: v = qBr/m = 1.6 × 10^-19 × 0.5 × 0.10 / 1.67 × 10^-27 ≈ 4.8 × 10^6 m/s.
✔ KEY FORMULA — r = mv/(qB), T = 2πm/(qB), ν = qB/(2πm). Period and frequency are independent of the particle's speed and the circle's radius.
⚠ EXAM TRAP — The magnetic force changes the direction of velocity, hence momentum changes, but kinetic energy does not. Any option claiming the field accelerates the particle's speed is wrong. And if the particle enters at an angle that is not 90 degrees, it is NOT a circle — read on.

▸ Helical Motion — When Velocity Is Tilted
• DEFINITION — If the velocity makes an angle θ with B (neither 0 nor 90 degrees), split it: v_perp = v sinθ drives the circular motion, while v_parallel = v cosθ is untouched by the field and carries the particle steadily forward. Circle plus drift equals a HELIX.
• The helix is described by its radius r = mv sinθ/(qB), its period T = 2πm/(qB) — the same T, set by the field alone — and its pitch, the forward distance covered in one turn: pitch = v cosθ × T.
• EXAMPLE — A proton enters a 0.1 T field at 10^6 m/s at 60 degrees to the field. v_perp = 8.66 × 10^5 m/s and v_parallel = 5 × 10^5 m/s. Then r = 9.0 cm, T = 6.56 × 10^-7 s, and pitch = 5 × 10^5 × 6.56 × 10^-7 = 0.33 m. One neat corkscrew, 33 cm per turn.
• WHY nature loves helices — charged particles from the Sun spiral along the Earth's field lines towards the poles (the field lines themselves converge there), which is why auroras are polar. The same spiralling traps particles in the Van Allen belts and confines plasma in magnetic bottles and tokamaks.
• WORKED PATTERN — For any angled entry: resolve FIRST, then treat the two components as separate problems — circle from v_perp, straight line from v_parallel — and recombine only at the end for pitch or displacement questions.
• YOUR TURN — The same proton enters at 30 degrees instead of 60. What happens to the pitch? Answer: v_parallel grows to 8.66 × 10^5 m/s, T is unchanged, so the pitch grows to about 0.57 m while the radius shrinks — a longer, tighter corkscrew.
★ HIGHLIGHT — The period of the helical motion is still 2πm/(qB), completely independent of the angle and the speed. Angle changes only split the velocity; they never touch the clock.

Motion in Combined Fields — the Velocity Selector
• DEFINITION — Velocity selector: a region of crossed (mutually perpendicular) electric and magnetic fields arranged so their forces on a charge oppose each other. Only charges with one exact speed pass through undeflected.
• The balance condition: electric force qE cancels magnetic force qvB, so qE = qvB and the selected speed is v = E/B. Notice q cancels — the selector filters by speed alone, blind to charge, sign and mass.
• EXAMPLE — With E = 1.5 × 10^5 N/C and B = 0.25 T crossed, only particles moving at v = E/B = 6.0 × 10^5 m/s travel straight. Faster ones are bent by the magnetic force; slower ones by the electric force. In a mass spectrometer this clean beam then enters a pure B region, where the radius r = mv/(qB) weighs the particles.
• WHY the geometry matters — E, B and v must be mutually perpendicular, with E and B oriented so their forces oppose. Rotate one field the wrong way and the forces add instead of cancelling; the device selects nothing.
• WORKED PATTERN — In any crossed-field problem, first test the balance: if v = E/B the path is straight; if v is greater, the magnetic force wins and the particle curves towards the magnetic side; if v is smaller, the electric force wins. Direction of curvature tells you which force dominates — a favourite conceptual question.
• YOUR TURN — A selector has B = 0.4 T and must pass electrons at 8 × 10^5 m/s. What E is needed? Answer: E = vB = 8 × 10^5 × 0.4 = 3.2 × 10^5 N/C.
✔ KEY FORMULA — Velocity selector: v = E/B. The condition is independent of q and m — that is precisely what makes it a VELOCITY selector and not a mass or charge selector.
⚠ EXAM TRAP — For the selected particle the net force is zero, so it moves in a straight line at constant velocity — but the individual forces are NOT zero; they cancel. And a neutral particle passes through every selector undeflected, selected or not.

The Cyclotron — Riding the Magnetic Roundabout
• DEFINITION — Cyclotron: a particle accelerator in which charged particles spiral inside two semicircular hollow electrodes (dees) placed in a perpendicular magnetic field, receiving a small energy kick from an alternating electric field at every crossing of the gap between the dees.
• The principle: inside a dee, the magnetic field bends the particle in a semicircle at the cyclotron frequency ν = qB/(2πm), which does NOT depend on the radius or speed. So a fixed-frequency alternating supply can stay in step with the particle forever: each half-turn takes the same time, each gap crossing arrives exactly when the field has flipped to push again.
• Maximum energy: the particle exits when its circle reaches the dee radius R, so v_max = qBR/m and K_max = q²B²R²/(2m). The energy is set by B and R alone — the gap voltage only decides how FEW turns are needed, not the final energy.
• EXAMPLE — A proton in a 0.8 T field with R = 0.5 m: the oscillator frequency is ν = qB/(2πm) = 12.2 MHz, and K_max = q²B²R²/(2m) = 1.23 × 10^-12 J ≈ 7.7 MeV. Raise B or build bigger dees and the energy climbs — the supply frequency stays the same.
• Limitations, honestly stated: (1) at speeds approaching light, the mass effectively grows (relativistic effect), the revolution frequency drops, and the particle falls out of step with the fixed-frequency supply — classical cyclotrons stall around a few tens of MeV for protons; (2) the design accelerates charged particles only — neutrons feel nothing; (3) electrons, being very light, turn relativistic almost immediately and are poor cyclotron candidates.
• WORKED PATTERN — Cyclotron questions are nearly always one of three: frequency ν = qB/(2πm) (watch for oscillator frequency = particle frequency, sometimes stated per full turn with two kicks per turn), maximum radius or energy from K_max = q²B²R²/(2m), or number of revolutions = total energy gain needed divided by gain per turn (2qV for two gap crossings per turn at voltage V).
• YOUR TURN — How many revolutions does the proton of the example make if the gap voltage is 50 kV? Answer: gain per revolution = 2 × 50 keV = 100 keV; total needed 7.7 MeV, so about 77 revolutions.
★ HIGHLIGHT — The cyclotron works BECAUSE the period in a magnetic field is speed-independent. Resonance between a fixed-frequency oscillator and a particle whose frequency never changes — that one fact is the whole machine.
⚠ EXAM TRAP — Doubling the gap voltage does NOT double the final energy; it only halves the number of turns. Final energy depends only on q, B and R. Also: the magnetic field does no work here either — every joule of gain comes from the electric kicks in the gap.

Biot–Savart Law — the Field from a Current Element
• DEFINITION — Biot–Savart law: the magnetic field at a point due to a small element of current-carrying wire of length dl, carrying current I, at distance r from the element, has magnitude dB = (μ0/4π) × I dl sinθ / r², where θ is the angle between the element and the line joining it to the point. Direction: perpendicular to the plane of the element and r, given by the right-hand rule for dl × r̂.
• DEFINITION — μ0, the permeability of free space, equals 4π × 10^-7 T m A^-1 — post-2019 it is a measured constant, but at this level you use it as exact, and the combination μ0/4π = 10^-7 makes Biot–Savart arithmetic mercifully clean.
• The personality of the law: field falls as 1/r² from each element (like Coulomb), grows with I and dl, and vanishes for points along the element's own line (sinθ = 0). Total field = sum (integral) over all elements — so the game is always: choose an element, write dB, exploit symmetry, integrate.
• EXAMPLE — A short 2 cm element carrying 5 A: at a point 10 cm away on its perpendicular bisector, dB = 10^-7 × 5 × 0.02 × sin90 / 0.10² = 10^-7 × 0.1/0.01 = 10^-6 T. Single elements make microtesla contributions; real fields come from whole wires summed up — which is exactly what the next section does.
• WORKED PATTERN — Direction first, magnitude second: curl the fingers of your right hand in the sense of dl × r̂ (or use the screw rule) before touching numbers. In most exam setups, all elements contribute dB in the SAME direction (into or out of the page), so the integral is a friendly scalar sum.
• YOUR TURN — The same element viewed from a point on its own axis line: what is dB? Answer: zero — θ = 0 makes sinθ = 0. Points along the wire's own direction get nothing from that element.
✔ KEY FORMULA — dB = (μ0/4π) I dl sinθ / r². Compare Coulomb: charge element dq creates E; current element I dl creates B — and both carry the 1/r² fingerprint of a point source.

▸ Field Due to a Straight Wire and a Circular Loop
• DEFINITION — Infinitely long straight wire: integrating Biot–Savart gives B = μ0I/(2πr) at perpendicular distance r. The field circles the wire (right-hand thumb rule: thumb along current, fingers curl along B) and falls as 1/r — slower than 1/r², because every slice of the endless wire keeps contributing.
• DEFINITION — Finite straight wire: B = (μ0I/4πr)(sinφ1 + sinφ2), where φ1 and φ2 are the angles between the line to the point and the lines joining the point to the two ends. For an infinite wire both angles are 90 degrees and the formula collapses to μ0I/(2πr). For a point level with one end of a semi-infinite wire, B is exactly half the infinite value.
• EXAMPLE — A long wire carries 15 A. At 4 cm from it, B = μ0I/(2πr) = 2 × 10^-7 × 15/0.04 = 7.5 × 10^-5 T — comparable to the Earth's own field. Stand a compass 4 cm from a busy cable and the wire wins.
• DEFINITION — Circular loop, centre: every element of the loop is at distance R with sinθ = 1, so the fields add to B = μ0I/(2R) for one turn, and B = μ0NI/(2R) for N turns. Direction: along the loop's axis, fixed by curling right-hand fingers with the current — thumb gives B.
• DEFINITION — Circular loop, on its axis at distance x from the centre: B = μ0IR²/(2(R² + x²)^(3/2)), always along the axis. At x = 0 it reduces to the centre value; at x = R it is the centre value divided by 2√2 ≈ 2.83.
• EXAMPLE — A 50-turn coil of radius 10 cm carrying 2 A: B at the centre = μ0NI/(2R) = 4π × 10^-7 × 50 × 2/(0.20) = 6.28 × 10^-4 T — over ten times the Earth's field from a coil that fits in your palm.
• WORKED PATTERN — Faces of a loop: the face where the current runs anticlockwise behaves as a north pole (field leaves it); clockwise means south pole. Memory hook: anticlockwise–North shares the open curve of the letter shapes less than you would like, so use this instead — curl fingers with the current, thumb = north = direction of B inside the loop.
• YOUR TURN — A single loop of radius 5 cm carries 4 A. Field at the centre? Answer: B = μ0I/(2R) = 4π × 10^-7 × 4/0.10 = 5.03 × 10^-5 T.
⚠ EXAM TRAP — Two classics: (1) for the loop's centre, B ∝ N and B ∝ 1/R — students drop the N or square the R; (2) on the axis, the formula carries R² in the numerator — using the centre formula at an axial point overestimates the field badly.

Ampere's Circuital Law — the Shortcut with Conditions
• DEFINITION — Ampere's circuital law: the line integral of B around any closed loop equals μ0 times the total current passing through the loop: ∮B·dl = μ0 × I_enclosed. It is the magnetic cousin of Gauss's law — a global statement that becomes a calculation tool when symmetry makes B constant along the chosen path (an Amperian loop).
• HOW to use it — pick a loop that follows the field's symmetry (a circle around a wire, a rectangle through a solenoid), argue B is constant in magnitude along it and parallel to dl, pull B out of the integral, and read off B = μ0I_enclosed/(loop length). Where the enclosed current is zero, B need not be zero — only its circulation is.
• EXAMPLE — The long wire again, honestly earned this time: take a circular Amperian loop of radius r around the wire. Symmetry gives constant B along it, so B × 2πr = μ0I and B = μ0I/(2πr) — the Biot–Savart marathon finished in two lines. This is why Ampere's law exists.
• EXAMPLE — Inside the wire itself (uniform current density), the enclosed current at radius r is I × r²/R², so B grows linearly: B = μ0Ir/(2πR²). Outside, it falls as 1/r. The field peaks exactly at the surface — sketch this graph once and you own a whole family of graph questions.
• WORKED PATTERN — Ampere questions hinge on ONE skill: computing I_enclosed correctly. Only currents piercing the loop count; currents outside contribute field but zero circulation. Sign conventions (right-hand rule for the loop direction) decide the sign when currents oppose.
• YOUR TURN — An Amperian circle of radius 20 cm encloses two wires: 3 A out of the page and 5 A into the page. What is ∮B·dl? Answer: net enclosed current = 3 − 5 = −2 A, so ∮B·dl = μ0 × (−2) = −8π × 10^-7 T m; the sign just records the sense.
✔ KEY FORMULA — ∮B·dl = μ0 I_enclosed. Use Biot–Savart when symmetry is poor and elements are few; use Ampere when symmetry is rich (wires, solenoids, toroids).

▸ Magnetic Field of a Solenoid and a Toroid
• DEFINITION — Solenoid: a long helical coil. Inside a long ideal solenoid the field is uniform and parallel to the axis, B = μ0nI, where n is the number of turns per unit length. Outside, the field is nearly zero — the solenoid keeps its field at home.
• DEFINITION — Toroid: a solenoid bent into a doughnut. The field lives entirely inside the ring's core, circling the centre, with B = μ0NI/(2πr) at radius r within the windings (N = total turns). Outside the toroid — both in the hole and beyond the ring — the field is zero by Ampere's law, because the net enclosed current there is zero.
• EXAMPLE — A solenoid with n = 1000 turns per metre carrying 2 A: B = μ0nI = 4π × 10^-7 × 1000 × 2 = 2.51 × 10^-3 T, the same at every interior point — this uniformity is why solenoids sit inside MRI scanners, relays and doorbells.
• EXAMPLE — A toroid of 400 turns carrying 2 A, at a mean radius of 15 cm: B = μ0NI/(2πr) = 4π × 10^-7 × 400 × 2/(2π × 0.15) = 1.07 × 10^-3 T — but unlike the solenoid, it fades as 1/r across the core, stronger near the inner edge.
• WHY the solenoid ends matter — at the exact end face of a long solenoid the axial field is half the interior value, B_end = μ0nI/2, because beyond the end the return contributions vanish. Exam setters adore this factor of two.
• WORKED PATTERN — Solenoid problems: read n carefully — if the problem gives total turns N and length L, then n = N/L before anything else. Toroid problems: r is measured from the toroid's centre to the point inside the core, not from the wire.
• YOUR TURN — A solenoid 50 cm long has 500 turns and carries 3 A. Interior field? Answer: n = 1000 per metre, so B = μ0 × 1000 × 3 = 3.77 × 10^-3 T.
⚠ EXAM TRAP — Ampere's law for the solenoid credits only the turns pierced by the rectangular Amperian loop. And a toroid's field is NOT μ0nI with a fixed n — it varies with r across the core; μ0nI is only the mean-radius approximation.

Force Between Two Parallel Conductors — Defining the Ampere
• DEFINITION — Two long parallel wires carrying currents I1 and I2, separated by distance d, attract or repel each other with a force per unit length F/L = μ0I1I2/(2πd). Parallel currents (same direction) attract; antiparallel currents repel.
• WHY — Wire 1 creates B = μ0I1/(2πd) at wire 2's location; wire 2, being a current in that field, feels F = B I2 L. Field of one, force law of the other — the two halves of this chapter shaking hands. The attraction of like currents surprises everyone who expects like things to repel: here the magnetic force overrules that instinct completely.
• EXAMPLE — Wires carrying 8 A and 10 A, 5 cm apart: F/L = 2 × 10^-7 × 8 × 10/0.05 = 3.2 × 10^-4 N per metre. Over a 1.5 m run the total force is 4.8 × 10^-4 N — small, but in power stations with kiloampere bus bars this force can tear mountings apart during short circuits.
• DEFINITION — The ampere (historical definition): one ampere is the current which, flowing in each of two infinitely long parallel wires 1 m apart in vacuum, produces a force of 2 × 10^-7 N on each metre of the other wire. (Since 2019 the ampere is defined through the fixed elementary charge, but this force picture remains the best intuition for what an ampere IS.)
• WORKED PATTERN — Set I1 = I2 = 1 A and d = 1 m in F/L and you recover exactly 2 × 10^-7 N/m — the definition is just the formula evaluated at unit values. Whenever a question quotes 2 × 10^-7 N/m, it is asking about this definition.
• YOUR TURN — Two wires 10 cm apart carry equal currents and attract with 2 × 10^-5 N/m. The current? Answer: from F/L = 2 × 10^-7 I²/d, I² = 2 × 10^-5 × 0.10/(2 × 10^-7) = 10, so I = √10 ≈ 3.16 A.
✔ KEY FORMULA — F/L = μ0I1I2/(2πd). Same direction attract, opposite repel — the exact opposite of the charge rule. Say it until it feels natural.
⚠ EXAM TRAP — The force on each wire is equal and opposite (Newton's third law holds even though neither wire "touches" the other). And do not swap in the separation for a radius: d is wire-to-wire distance, the same r that appears in B = μ0I/(2πr) of the partner wire.

Torque on a Current Loop in a Magnetic Field
• DEFINITION — A rectangular loop (or coil of N turns) of area A carrying current I in a uniform field B experiences a torque τ = NIAB sinθ, where θ is the angle between the field B and the NORMAL to the loop's plane. The net force on the loop is zero; the field twists it, it does not push it.
• WHY — the two active sides of the loop each feel BIL, in opposite directions, forming a couple. The inactive sides feel forces along their own length (or zero). A couple's torque depends on the lever arm, which is set by the loop's width and the angle of its normal — hence τ ∝ A sinθ.
• DEFINITION — Magnetic dipole moment of the coil: M = NIA, pointing along the normal by the right-hand rule (fingers curl with the current, thumb gives M). Then τ = MB sinθ = M × B in vector form, and the potential energy is U = −MB cosθ = −M·B.
• Landmarks on the dial: θ = 0 (normal along B) — stable equilibrium, τ = 0, U minimum at −MB. θ = 90 degrees (loop plane parallel to B) — maximum torque NIAB, U = 0. θ = 180 degrees — unstable equilibrium, τ = 0 but any nudge flips the coil home.
• EXAMPLE — A 100-turn coil of area 0.02 m² carrying 2 A in a 0.3 T field: maximum torque = NIAB = 100 × 2 × 0.02 × 0.3 = 1.2 N·m. With its normal at 30 degrees to the field, τ = 1.2 × sin30 = 0.6 N·m.
• WORKED PATTERN — The single most common error in this topic is angle bookkeeping: if the problem gives the angle between the PLANE of the loop and B, convert — θ in the formula is measured from the normal, so θ_formula = 90 degrees minus θ_plane. Draw the normal on your diagram before writing anything.
• YOUR TURN — A coil's torque is half its maximum when its normal makes what angle with B? Answer: sinθ = 1/2, so θ = 30 degrees (or 150 degrees).
★ HIGHLIGHT — A current loop in a field is a magnetic dipole, twin of the electric dipole: τ = M × B turns it, U = −M·B prices its orientations. Motors, galvanometers and compass needles are all this one idea wearing different uniforms.
⚠ EXAM TRAP — Zero net force does not mean zero torque — the loop spins in place. And maximum torque occurs when the plane is parallel to B (normal perpendicular), which students routinely invert.

Moving Coil Galvanometer — Principle and Sensitivity
• DEFINITION — Moving coil galvanometer: an instrument that measures small currents by the deflection of a coil suspended in a radial magnetic field. Current through the coil produces torque τ = NIAB; the suspension fibre's restoring torque κφ balances it, so the deflection φ is proportional to the current: I = (κ/NAB) × φ.
• The radial field is the clever bit: pole pieces and a soft-iron core shape B so that the coil's plane is always parallel to the field, making sinθ = 1 at every deflection. The result: a perfectly linear scale — equal current steps, equal needle steps.
• DEFINITION — Current sensitivity: deflection per unit current, Si = φ/I = NAB/κ. Raise it with more turns N, larger area A, stronger B, or a gentler suspension (smaller κ). Units: radian per ampere, or divisions per milliampere.
• DEFINITION — Voltage sensitivity: deflection per unit voltage, Sv = φ/V = NAB/(κ × R_coil_total) = Si/R. A galvanometer can be a superb current detector yet a poor voltage detector if its resistance is high — the two sensitivities are different virtues.
• EXAMPLE — A galvanometer with N = 200 turns, A = 2 × 10^-3 m², B = 0.2 T and κ = 10^-6 N·m per radian has Si = NAB/κ = 200 × 2 × 10^-3 × 0.2/10^-6 = 8 × 10^4 rad/A — a microampere swings it by 0.08 radian. That delicacy is precisely why it cannot survive amperes without protection, which the next section provides.
• WORKED PATTERN — Most galvanometers are specified by two numbers: coil resistance G (yes, the letter G is used for it here) and full-scale deflection current Ig — the current that swings the needle fully. Every conversion problem in the next section starts from exactly these two data.
• YOUR TURN — If N is doubled and the suspension is made twice as stiff, what happens to the current sensitivity? Answer: Si = NAB/κ doubles from N but halves from κ — unchanged. Sensitivity is a tug of war.
⚠ EXAM TRAP — Increasing N raises sensitivity but also raises the coil's resistance (more wire), which lowers VOLTAGE sensitivity. exam questions exploit exactly this asymmetry.

▸ From Galvanometer to Ammeter and Voltmeter
• DEFINITION — Ammeter conversion: connect a small resistance (the shunt, S) in PARALLEL with the galvanometer. Most of the current bypasses through the shunt; only Ig enters the coil. Current division gives S = Ig × G/(I − Ig), where I is the desired full-scale range and G is the galvanometer resistance.
• DEFINITION — Voltmeter conversion: connect a large resistance R in SERIES with the galvanometer. The series resistor swallows most of the voltage; the coil still sees only its full-scale current Ig. Then R = V/Ig − G, where V is the desired full-scale voltage.
• EXAMPLE — A galvanometer of G = 100 Ω with Ig = 1 mA becomes a 1 A ammeter with shunt S = 0.001 × 100/(1 − 0.001) ≈ 0.100 Ω — a sliver of thick wire in parallel. The same galvanometer becomes a 10 V voltmeter with series R = 10/0.001 − 100 = 9900 Ω.
• WHY the ideal limits — an ideal ammeter has ZERO resistance (it must not reduce the current it measures) and sits in series; an ideal voltmeter has INFINITE resistance (it must not draw current from the points it probes) and sits in parallel. Real conversions are judged by how close they come: shunt smaller → ammeter better; series R larger → voltmeter better.
• WORKED PATTERN — Both conversions are one-line Ohm-law arguments: write down where Ig flows, demand it flows at full scale, and let the resistor absorb the rest — the REST of the current for the shunt (parallel: same voltage, Ig × G = (I − Ig) × S), the REST of the voltage for the series resistor (series: same current, V = Ig(G + R)). If you can say that sentence, you can re-derive both formulas under exam pressure.
• YOUR TURN — A galvanometer (G = 50 Ω, Ig = 2 mA) is to become a 10 A ammeter. Shunt? Answer: S = 0.002 × 50/(10 − 0.002) ≈ 0.0100 Ω — about one-hundredth of an ohm. Shunts are always tiny; that is the sanity check.
✔ KEY FORMULA — Ammeter: shunt in parallel, S = IgG/(I − Ig); total resistance falls below G. Voltmeter: resistance in series, R = V/Ig − G; total resistance rises far above G.
⚠ EXAM TRAP — Two mirror-image errors: putting the shunt in series (it must be parallel) and using I instead of (I − Ig) in the shunt formula. For I much larger than Ig the difference is small — which is exactly why examiners choose ranges where it is not.

Formula Sheet — One-Glance Recap
• ✔ Lorentz force: F = qvB sinθ; F = q(v × B); with E present, F = qE + q(v × B)
• ✔ Force on a conductor: F = BIL sinθ; F = I(L × B); closed loop in uniform B: net force zero
• ✔ Circular path: r = mv/(qB); T = 2πm/(qB); ν = qB/(2πm); speed and KE unchanged
• ✔ Helix: r = mv sinθ/(qB); pitch = v cosθ × 2πm/(qB)
• ✔ Velocity selector: v = E/B (forces cancel, path straight)
• ✔ Cyclotron: ν = qB/(2πm); K_max = q²B²R²/(2m); v_max = qBR/m
• ✔ Biot–Savart: dB = (μ0/4π) I dl sinθ/r²; μ0 = 4π × 10^-7 T m A^-1
• ✔ Straight wire: B = μ0I/(2πr); finite wire: B = (μ0I/4πr)(sinφ1 + sinφ2)
• ✔ Loop: centre B = μ0NI/(2R); axis B = μ0NIR²/(2(R² + x²)^(3/2))
• ✔ Ampere: ∮B·dl = μ0 I_enclosed; inside a wire B ∝ r, outside B ∝ 1/r
• ✔ Solenoid: B = μ0nI inside, μ0nI/2 at the end face; toroid: B = μ0NI/(2πr) inside the core
• ✔ Parallel wires: F/L = μ0I1I2/(2πd); like currents attract; ampere defined by 2 × 10^-7 N/m
• ✔ Torque: τ = NIAB sinθ; M = NIA; τ = M × B; U = −MB cosθ
• ✔ Galvanometer: I = (κ/NAB)φ; Si = NAB/κ; Sv = Si/R
• ✔ Conversions: shunt S = IgG/(I − Ig) in parallel; series R = V/Ig − G

Common Mistakes and Exam Traps
• ⚠ Mistake 1: Claiming the magnetic field does work on a charge. Why wrong: F is always perpendicular to v, so power F·v = 0 at every instant. Correct principle: a pure B field changes only the direction of motion — speed, KE and hence temperature of the particle stay fixed.
• ⚠ Mistake 2: Using r = mv/(qB) for a particle entering at an angle. Why wrong: only the perpendicular component of velocity circles; the parallel component drifts. Correct principle: resolve v first — circle from v sinθ, helix overall, pitch from v cosθ × T.
• ⚠ Mistake 3: Forgetting the electron's direction flip. Why wrong: the cross product q(v × B) carries the sign of q. Correct principle: find the direction for a positive charge, then reverse it for electrons and other negative carriers.
• ⚠ Mistake 4: In torque problems, measuring θ from the plane of the coil. Why wrong: τ = NIAB sinθ defines θ from the NORMAL. Correct principle: θ_formula = 90 degrees − θ_plane; maximum torque when the plane is parallel to B.
• ⚠ Mistake 5: Expecting like currents to repel. Why wrong: each wire sits in the other's field and the Lorentz force pulls them together. Correct principle: parallel currents attract, antiparallel repel — the reverse of the electrostatic rule.
• ⚠ Mistake 6: Using the loop-centre formula on the axis, or dropping N. Why wrong: the axial field carries the extra factor R²/(R² + x²)^(3/2) relative to μ0I/2-style forms, and N turns multiply everything. Correct principle: centre — μ0NI/(2R); axis — μ0NIR²/(2(R² + x²)^(3/2)).
• ⚠ Mistake 7: Connecting a shunt in series or a voltmeter resistor in parallel. Why wrong: the two conversions are structural opposites. Correct principle: ammeter = tiny shunt in PARALLEL (and the finished ammeter goes in series with the circuit); voltmeter = large resistor in SERIES (and the finished voltmeter goes in parallel across the points).
• ⚠ Mistake 8: Believing a bigger cyclotron gap voltage gives a bigger final energy. Why wrong: exit happens at the dee radius R, fixed by geometry and B. Correct principle: K_max = q²B²R²/(2m) — voltage controls only the number of turns.
• ★ Named trap — The stationary charge: a charge at rest in a magnetic field feels NO force, however strong the field. Motion is the entry ticket. Similarly, a charge moving exactly along B feels nothing — examiners set both ambushes in the first two options.
• ★ Named trap — The mass-spectrometer two-step: selector first (v = E/B, ignores mass), pure field second (r = mv/(qB), weighs mass). If a question mixes E into the radius region or B into the balance region, it is testing whether you kept the regions separate.

Worked Examples — Exam Patterns
• EXAMPLE 1 — Problem: A proton moving at 4 × 10^5 m/s enters a uniform field of 0.5 T at 30 degrees to the field direction. Find the force on it.
• • Given: q = 1.6 × 10^-19 C, v = 4 × 10^5 m/s, B = 0.5 T, θ = 30 degrees.
• • Principle: F = qvB sinθ, direction perpendicular to both v and B.
• • Steps: F = 1.6 × 10^-19 × 4 × 10^5 × 0.5 × sin30 = 1.6 × 10^-19 × 4 × 10^5 × 0.5 × 0.5.
• • Answer: F = 1.6 × 10^-14 N, directed perpendicular to the plane of v and B (right-hand rule).
• • Reasoning: Only the component of v across the field counts; sin30 halves the v that matters.
• • Mistake to avoid: Dropping sinθ gives 3.2 × 10^-14 N — exactly double, and a guaranteed wrong option waiting for you.
• EXAMPLE 2 — Problem: An electron travels at 2.0 × 10^7 m/s perpendicular to a 0.40 T field. Find the radius of its path and its period of revolution.
• • Given: m = 9.11 × 10^-31 kg, q = 1.6 × 10^-19 C, v = 2.0 × 10^7 m/s, B = 0.40 T.
• • Principle: qvB supplies the centripetal force, so r = mv/(qB) and T = 2πm/(qB).
• • Steps: r = (9.11 × 10^-31 × 2.0 × 10^7)/(1.6 × 10^-19 × 0.40) = 1.82 × 10^-23/6.4 × 10^-20 = 2.84 × 10^-4 m. T = 2π × 9.11 × 10^-31/6.4 × 10^-20 = 8.93 × 10^-11 s.
• • Answer: r ≈ 0.28 mm; T ≈ 8.9 × 10^-11 s (about 1.1 × 10^10 revolutions per second).
• • Reasoning: The period contains no v — check your own numbers: had the electron been twice as fast, r would double and T would not move.
• • Mistake to avoid: Using the diameter instead of the radius, or proton mass for an electron — both errors are planted in the options.
• EXAMPLE 3 — Problem: A proton enters a 0.1 T field at 10^6 m/s, at 60 degrees to the field. Describe its path completely.
• • Given: m = 1.67 × 10^-27 kg, q = 1.6 × 10^-19 C, v = 10^6 m/s, B = 0.1 T, θ = 60 degrees.
• • Principle: Resolve v: v_perp = v sinθ circles, v_parallel = v cosθ drifts; the path is a helix.
• • Steps: v_perp = 8.66 × 10^5 m/s, v_parallel = 5 × 10^5 m/s. r = mv_perp/(qB) = 1.67 × 10^-27 × 8.66 × 10^5/1.6 × 10^-20 = 0.090 m. T = 2πm/(qB) = 6.56 × 10^-7 s. Pitch = v_parallel × T = 5 × 10^5 × 6.56 × 10^-7 = 0.33 m.
• • Answer: A helix of radius 9.0 cm, advancing 0.33 m per turn, one turn every 6.56 × 10^-7 s.
• • Reasoning: T is computed from the full q and m with B alone — the angle never enters T, only the split of v.
• • Mistake to avoid: Putting the full v into the radius formula gives r = 10.4 cm — wrong, because only v_perp bends.
• EXAMPLE 4 — Problem: A velocity selector uses E = 1.5 × 10^5 N/C and B = 0.25 T. Protons that pass through then enter a region with only the 0.25 T field. Find their path radius there.
• • Given: E, B as above; proton m and q standard.
• • Principle: Selector passes v = E/B; in the pure field, r = mv/(qB).
• • Steps: v = 1.5 × 10^5/0.25 = 6.0 × 10^5 m/s. Then r = 1.67 × 10^-27 × 6.0 × 10^5/(1.6 × 10^-19 × 0.25) = 1.0 × 10^-21/4.0 × 10^-20 = 0.025 m.
• • Answer: Selected speed 6.0 × 10^5 m/s; radius in the field region = 2.5 cm.
• • Reasoning: This two-step device IS the mass spectrometer: the selector fixes v for every ion, so the radius measures m/q alone.
• • Mistake to avoid: Using qE = qvB with the charge of an electron when the particle is a proton — q cancels in step one, but step two needs the right m and q.
• EXAMPLE 5 — Problem: A cyclotron has dees of radius 0.5 m in a 0.8 T field and accelerates protons. Find the oscillator frequency and the maximum proton energy.
• • Given: R = 0.5 m, B = 0.8 T, proton q and m.
• • Principle: ν = qB/(2πm) — constant at all radii; exit speed from r = R gives K_max = q²B²R²/(2m).
• • Steps: ν = 1.6 × 10^-19 × 0.8/(2π × 1.67 × 10^-27) = 1.22 × 10^7 Hz. K_max = (1.6 × 10^-19)² × 0.64 × 0.25/(2 × 1.67 × 10^-27) = 1.23 × 10^-12 J = 7.7 MeV.
• • Answer: Oscillator frequency ≈ 12.2 MHz; maximum energy ≈ 7.7 MeV.
• • Reasoning: No voltage appears anywhere — the supply voltage would only set the turn count, never the exit energy.
• • Mistake to avoid: Reporting the energy in joules when the options are in MeV; divide by 1.6 × 10^-13 J per MeV.
• EXAMPLE 6 — Problem: (a) Find B at 4 cm from a long wire carrying 15 A. (b) Find B at the centre of a 50-turn coil of radius 10 cm carrying 2 A.
• • Given: (a) I = 15 A, r = 0.04 m. (b) N = 50, I = 2 A, R = 0.10 m.
• • Principle: (a) B = μ0I/(2πr). (b) B = μ0NI/(2R).
• • Steps: (a) B = 2 × 10^-7 × 15/0.04 = 7.5 × 10^-5 T. (b) B = 4π × 10^-7 × 100/0.20 = 6.28 × 10^-4 T.
• • Answer: (a) 7.5 × 10^-5 T, circling the wire. (b) 6.28 × 10^-4 T, along the coil's axis.
• • Reasoning: The coil wins by nearly a factor of ten because N turns concentrate their fields at one point, while the wire's field keeps spreading around its circles.
• • Mistake to avoid: In (b), using diameter 0.20 m as R halves the answer; R is the radius, 0.10 m.
• EXAMPLE 7 — Problem: Two long parallel wires 5 cm apart carry 8 A and 10 A in the same direction. Find the force on a 1.5 m length of one wire and its direction.
• • Given: I1 = 8 A, I2 = 10 A, d = 0.05 m, L = 1.5 m, currents parallel.
• • Principle: F/L = μ0I1I2/(2πd); parallel currents attract.
• • Steps: F/L = 2 × 10^-7 × 8 × 10/0.05 = 3.2 × 10^-4 N/m. F = 3.2 × 10^-4 × 1.5 = 4.8 × 10^-4 N.
• • Answer: 4.8 × 10^-4 N, attractive — each wire pulled towards the other.
• • Reasoning: Cross-check with the definition of the ampere: the same formula at 1 A, 1 A, 1 m gives 2 × 10^-7 N/m — the arithmetic family is consistent.
• • Mistake to avoid: Reporting F/L when the question asks for the force on a stated length — multiply by L.
• EXAMPLE 8 — Problem: A galvanometer has resistance 100 Ω and gives full-scale deflection at 1 mA. Convert it into (a) an ammeter reading to 1 A, (b) a voltmeter reading to 10 V.
• • Given: G = 100 Ω, Ig = 1 mA = 0.001 A. (a) I = 1 A. (b) V = 10 V.
• • Principle: (a) Parallel shunt takes the excess current: S = IgG/(I − Ig). (b) Series resistor takes the excess voltage: R = V/Ig − G.
• • Steps: (a) S = 0.001 × 100/(1 − 0.001) = 0.100/0.999 ≈ 0.100 Ω in parallel. (b) R = 10/0.001 − 100 = 10000 − 100 = 9900 Ω in series.
• • Answer: (a) Shunt ≈ 0.10 Ω in parallel. (b) Series resistance 9900 Ω.
• • Reasoning: Sanity checks: the shunt (0.1 Ω) is far SMALLER than G — most current bypasses, as designed. The series resistor (9900 Ω) dwarfs G — most voltage drops across it, as designed. If your numbers fail these comparisons, you have swapped the formulas.
• • Mistake to avoid: Forgetting the − Ig or − G corrections: using S = IgG/I gives 0.100 Ω here too (they nearly agree at large range ratios), but for a 10 mA range the error is 10 percent and fatal.

Practice Questions — Self-Test Set
• Q1 (single correct) — A 25 cm wire carrying 6 A lies perpendicular to a 0.8 T field. The force on it is: (A) 0.12 N (B) 1.2 N (C) 12 N (D) zero
• Q2 (single correct) — A proton and an alpha particle enter the same magnetic field with the same velocity, perpendicular to B. The ratio of their periods of revolution, T_alpha/T_proton, is: (A) 1 (B) 2 (C) 4 (D) 1/2
• Q3 (single correct) — In a cyclotron, if the magnetic field is doubled (same dees), the maximum energy of the emerging protons becomes: (A) double (B) four times (C) unchanged (D) half
• Q4 (numerical) — A solenoid 40 cm long with 800 turns carries 1.5 A. The field inside, in millitesla, is about: (A) 0.38 (B) 3.8 (C) 38 (D) 1.9
• Q5 (single correct) — A 50-turn coil of area 0.01 m² carrying 1.5 A sits in a 0.4 T field with its PLANE at 30 degrees to the field. The torque is about: (A) 0.15 N·m (B) 0.26 N·m (C) 0.30 N·m (D) 0.52 N·m
• Q6 (multiple correct) — For a charge moving in a pure uniform magnetic field, which statements are true? (A) The field does no work on the charge (B) The force vanishes if the velocity is parallel to B (C) The kinetic energy increases steadily (D) The force is maximum when velocity is perpendicular to B
• Q7 (single correct) — A galvanometer of 200 Ω with full-scale current 0.5 mA is converted to an ammeter of range 5 A. The shunt required is: (A) 0.02 Ω in series (B) 0.02 Ω in parallel (C) 20 Ω in parallel (D) 4000 Ω in series
• Q8 (assertion–reason) — Assertion: The period of revolution of a charged particle in a uniform magnetic field does not depend on its speed. Reason: A faster particle moves in a proportionally larger circle, so the time per revolution stays the same. (A) Both true, reason explains assertion (B) Both true, reason does not explain (C) Assertion true, reason false (D) Assertion false

▸ Answer Key with Explanations
• Q1 — B. F = BIL = 0.8 × 6 × 0.25 = 1.2 N. Misconception behind A: using L = 25 instead of 0.25 m — SI units are the whole game.
• Q2 — B. T = 2πm/(qB), so T ∝ m/q; alpha has m/q = 4/2 = 2 in proton units. Misconception behind C: using mass ratio alone (4) and forgetting the doubled charge.
• Q3 — B. K_max = q²B²R²/(2m) grows as B squared. Misconception behind A: treating K as if it were proportional to the frequency, which only doubles.
• Q4 — B. n = 800/0.40 = 2000 per metre; B = μ0nI = 4π × 10^-7 × 2000 × 1.5 = 3.77 × 10^-3 T ≈ 3.8 mT. Misconception behind D: using N = 800 directly as n.
• Q5 — B. The formula's angle is from the normal: plane at 30 degrees to B means normal at 60 degrees. τ = NIAB sin60 = 50 × 1.5 × 0.01 × 0.4 × 0.866 = 0.26 N·m. Misconception behind A: using sin30 (the plane angle) — the chapter's most planted trap, set here deliberately.
• Q6 — A, B and D. The force is perpendicular to v (no work, KE fixed), zero for parallel motion, and qvB sinθ peaks at 90 degrees. C is the planted falsehood: KE never changes in a pure field.
• Q7 — B. S = IgG/(I − Ig) = 0.0005 × 200/(5 − 0.0005) ≈ 0.020 Ω, connected in parallel. Misconception behind D: 4000 Ω in series would be a (wrong-headed) voltmeter-style conversion, and the device asked for is an ammeter.
• Q8 — A. T = 2πm/(qB) has no v because r ∝ v exactly cancels it: circumference 2πr grows in step with the speed. The reason is the correct physical explanation, not just a true neighbour.

Chapter Summary and Revision Checklist
• Summary — one paragraph: A magnetic field pushes moving charges sideways with F = qvB sinθ and never does work; perpendicular entry gives circles of radius mv/(qB) with a speed-independent period 2πm/(qB), tilted entry gives helices, and crossed E and B fields select the single speed v = E/B. The cyclotron exploits the constant period to accelerate charges to K_max = q²B²R²/(2m). Currents return the favour: Biot–Savart builds fields element by element (straight wire μ0I/2πr, loop centre μ0NI/2R), Ampere's law harvests symmetry (solenoid μ0nI, toroid μ0NI/2πr), parallel currents pull with μ0I1I2/(2πd) per metre — the force that defined the ampere — and a coil in a field twists with τ = NIAB sinθ, the engine inside every galvanometer, whose conversions are a small parallel shunt for ammeters and a large series resistor for voltmeters.
• Essential definitions to be able to recite: Lorentz force; cyclotron frequency; Biot–Savart law; Ampere's circuital law; magnetic dipole moment; current and voltage sensitivity; shunt.
• Must-remember pairs that examiners confuse: radius vs period (one depends on v, the other does not); field of wire (1/r) vs field of element (1/r²); shunt (parallel, tiny) vs series resistor (series, huge); θ from the normal vs θ from the plane; solenoid (uniform, μ0nI) vs toroid (1/r inside its core).
• Revision checklist — tick each only when you can do it without notes:
• • Derive r and T for circular motion from qvB = mv²/r, and state why KE is constant
• • Split any angled entry into circle + drift and compute radius, period and pitch
• • Run a velocity-selector balance and a cyclotron frequency/energy calculation
• • Derive the straight-wire field from Ampere's law and quote the finite-wire and inside-wire results
• • Write the loop centre and axis formulas and the solenoid end-face half-value
• • Compute the force between parallel wires and state the ampere definition value 2 × 10^-7 N/m
• • Compute torque with the angle correctly taken from the normal, and locate both equilibria
• • Convert a galvanometer both ways, stating placement (parallel/series) before touching numbers
• Self-assessment — answer aloud, then check against the chapter: (1) Why can a magnetic field never be the energy source in a cyclotron? (Because it does no work; the gap's electric field supplies every joule.) (2) A particle's period doubles when it is replaced by an alpha particle at the same speed — true or false? (True in ratio: T_alpha = 2 T_proton at the same B; the period never depended on speed anyway.) (3) Your calculated shunt comes out LARGER than the galvanometer resistance. What went wrong? (Shunts are always much smaller than G — you have probably used the voltmeter formula or misplaced the decimal in Ig.)
★ HIGHLIGHT — If you remember only five results, take these: F = qvB sinθ (no work, ever); r = mv/(qB) with T = 2πm/(qB) (period ignores speed); v = E/B (the selector); B = μ0I/(2πr) and μ0nI (the two workhorse fields); S = IgG/(I − Ig) in parallel (the shunt). The rest of the chapter is these five ideas in costume.
<!-- END phys_ch_18 detailedStudyNotes -->
