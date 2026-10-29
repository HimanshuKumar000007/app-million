<!-- BEGIN phys_ch_16 detailedStudyNotes -->
Introduction — Potential, the Energy View of Electricity
• In the last chapter you met the electric field E — a vector that tells a charge which way to run and how hard it will be pushed. This chapter introduces the field's quieter twin: the electrostatic potential V. It is a scalar, it needs no arrows, and yet it answers the questions exams actually ask — how much work, how much energy, how fast will this charge be moving when it gets there.
• Here is the one-line summary to hold in your head: potential is potential energy per unit charge. Where E is about force, V is about energy bookkeeping. Voltage on every battery and every wall socket is this same V — you have been using this chapter's hero since childhood.
• The second half of the chapter turns V into hardware: the capacitor, a device built to store charge and energy in an electric field. Capacitors sit inside your phone, your camera flash and every power supply you own, and the capacitor questions in IAT are among the most reliably scoreable in the whole paper.
• Roadmap: potential and potential difference first, then V due to point charges, charge systems and dipoles; equipotential surfaces; potential energy of pairs, systems and dipoles; the special behaviour of conductors; a short stop at dielectrics; then capacitance, the parallel plate capacitor, dielectric effects, series and parallel networks, stored energy, and finally the famous puzzle of energy that vanishes when two capacitors are connected.
★ HIGHLIGHT — The whole chapter in one breath: V is a scalar landscape built by charges; E points downhill on that landscape, steepest descent first; a capacitor is two conductors that store separated charge on that landscape, and everything else is arithmetic.

Electrostatic Potential — Work per Unit Charge
• DEFINITION — Electrostatic potential at a point: the work done by an external agent in bringing a unit positive test charge from infinity to that point, slowly (without acceleration), against the electric field. V = W/q₀. SI unit: volt (V), where 1 V = 1 J/C.
• DEFINITION — Potential difference between points A and B: ΔV = V_B − V_A = W(A to B)/q₀ — the work per unit charge to move a test charge from A to B. Only differences are physically measurable; the absolute V of a point depends on where you choose the zero.
• WHY infinity as the zero? Because at infinity every charge's influence dies away completely, so it is the one reference point all problems share. By convention V(∞) = 0, and every formula in this chapter quietly uses that choice.
• WHY is V a scalar and why should you celebrate? Because scalars simply add. The potential of ten charges is ten numbers added — no components, no angles, no parallelogram law. Half the hard field problems of the last chapter become one-line additions here.
• The electrostatic field is conservative: the work done moving a charge between two points is the same along every path, and zero around any closed loop. That is exactly why a potential function can exist at all — if work depended on the path, V at a point would have no single value.
✔ KEY FORMULA — The E–V bridge, two directions: moving along the field, V falls; quantitatively E = −dV/dr along any direction, i.e. the field is minus the slope (gradient) of the potential. Steep V-slope means strong E; flat V means no field.
• EXAMPLE — A 12 V car battery: moving 1 coulomb of charge from its negative to its positive terminal (through the battery) gains 12 J; moving it through the outside circuit spends those 12 J. A charge of 3 C pushed through the full circuit exchanges 36 J — just W = qΔV.
• WORKED PATTERN — Work to move q = 2 μC from a point at 100 V to a point at 400 V: W = q(V_final − V_initial) = 2 × 10⁻⁶ × 300 = 6 × 10⁻⁴ J. The field does the opposite: W_field = −6 × 10⁻⁴ J. Sign discipline: external agent's work is +qΔV, the field's work is −qΔV, and potential energy change is ΔU = +qΔV.
• The electron-volt, the energy unit of atomic physics: 1 eV is the energy an electron (or proton) gains crossing a potential difference of 1 V: 1 eV = 1.6 × 10⁻¹⁹ J. An electron accelerated through 100 V carries 100 eV = 1.6 × 10⁻¹⁷ J of kinetic energy — this is how X-ray tubes and old TV screens set their particle energies.
• YOUR TURN — A charge of 5 μC is moved from a point at 200 V to a point at 50 V. How much work does the external agent do? (Answer: W = qΔV = 5 × 10⁻⁶ × (50 − 200) = −7.5 × 10⁻⁴ J. Negative — the agent does not push; it holds back while the field does positive work. Moving downhill in V, a positive charge is carried by the field.)
⚠ EXAM TRAP — Potential is NOT potential energy. V belongs to the point (J/C); U belongs to a charge placed at the point (J): U = qV. Half of all errors in this chapter are this one confusion wearing different clothes.

▸ Potential Due to a Point Charge
• Derive it once and own it forever: bring q₀ from infinity to distance r from a fixed charge Q. The field's push varies along the way, but the integral collapses beautifully — the work depends only on the endpoint distance.
✔ KEY FORMULA — V = kQ/r, where k = 1/(4πε₀) = 9 × 10⁹ N m²/C². The sign of V is the sign of Q itself: a positive charge builds a positive potential hill around itself; a negative charge digs a potential well.
• Read the shape of it: V falls like 1/r, NOT 1/r². Potential reaches farther than field — at 10 m from a charge the field is down to 1% of its 1 m value, but the potential is still 10% of its 1 m value. Graphs of V versus r are hyperbolas, never parabolas.
• EXAMPLE — The proton: at 1 Å (10⁻¹⁰ m, atomic distance) from a proton, V = 9 × 10⁹ × 1.6 × 10⁻¹⁹ / 10⁻¹⁰ = 14.4 V. This is exactly why atomic energy levels live in the eV-to-tens-of-eV range — the potential landscape inside atoms is tens of volts deep.
• WORKED PATTERN — Q = 2 μC, find V at r = 0.3 m: V = 9 × 10⁹ × 2 × 10⁻⁶ / 0.3 = 18000/0.3 = 6 × 10⁴ V = 60 kV. Then the energy of a 0.5 μC charge placed there: U = qV = 0.5 × 10⁻⁶ × 6 × 10⁴ = 0.03 J. Two-step rhythm — first V from the source, then U = qV for any guest charge — solves a huge family of questions.
• YOUR TURN — At what distance from a 5 μC charge is the potential 45 kV? (Answer: r = kQ/V = 9 × 10⁹ × 5 × 10⁻⁶ / 45000 = 45000/45000 = 1 m.)
⚠ EXAM TRAP — V = kQ/r uses the distance to the point, always positive; the sign comes only from Q. Do not attach a minus because the point is "on the left" — potential has no directions to attach signs to.

Potential Due to a System of Charges — Scalars Simply Add
• DEFINITION — Superposition for potential: the potential at any point due to a collection of charges is the algebraic sum of the individual potentials: V = Σ kqᵢ/rᵢ = k Σ (qᵢ/rᵢ). Algebraic means signs ride along with the charges; distances are all measured from the point.
• WHY this is powerful: for E you would resolve ten vectors and add components; for V you add ten signed numbers and you are done. When a problem gives you an awkward geometry but asks only about work or energy, switch from E-thinking to V-thinking immediately.
• WORKED PATTERN — Point P sits 0.3 m from +4 μC and 0.6 m from −2 μC. V_P = 9 × 10⁹ × (4 × 10⁻⁶/0.3 − 2 × 10⁻⁶/0.6) = 9 × 10⁹ × (1.333 × 10⁻⁵ − 0.333 × 10⁻⁵) = 9 × 10⁹ × 1.0 × 10⁻⁵ = 9 × 10⁴ V = 90 kV. Notice the negative charge simply subtracted its share.
• Zero potential does not mean zero field. Two equal opposite charges: every point on their perpendicular bisector has V = 0, yet E there is strong. Conversely, two equal like charges at their midpoint give E = 0 but V = 2kQ/r, far from zero. V and E carry different information — never trade one for the other.
• Continuous distributions follow the same idea with an integral, V = ∫ k dq/r — for the exam, the charged ring on its axis and the charged spherical shell are the two results worth owning: shell of radius R, charge Q: V = kQ/R for every point inside or on it, kQ/r outside (proved in the conductors section below).
• YOUR TURN — Charges +3 μC and +3 μC sit 0.4 m apart. Find V at their midpoint. (Answer: each contributes k × 3 × 10⁻⁶/0.2 = 1.35 × 10⁵ V; total 2.7 × 10⁵ V = 270 kV, while E there is exactly zero — the classic asymmetry.)
⚠ EXAM TRAP — When charges have mixed signs, students hunt for vector cancellation in a scalar sum. There is none: write each term with its sign, add, done.

Potential Due to an Electric Dipole
• Recall the cast: a dipole is charges −q and +q separated by 2a, with dipole moment p = q × 2a, directed from −q to +q. You met its field last chapter; now its potential — which is simpler than its field and falls faster.
✔ KEY FORMULA — At a point at distance r from the dipole centre, at angle θ from the dipole axis (measured from the p direction), for r much larger than 2a: V = kp cosθ / r².
• Read the formula like a story. On the axis beyond +q (θ = 0): V = +kp/r², maximum positive. On the axis beyond −q (θ = 180°): V = −kp/r². On the equatorial line (θ = 90°): cosθ = 0, so V = 0 at every equatorial point, near or far. And the fall is 1/r² — one power faster than a single charge, because the two charges' potentials nearly cancel at large distances.
• WHY the near-cancellation? At a distant point, V = kq/r₊ − kq/r₋. The two terms are almost equal; only the small difference survives, and that difference is proportional to (separation × cosθ)/r². Dipole potential is the leftover of a subtraction — that is the deep reason for both the cosθ and the 1/r².
• WORKED PATTERN — A dipole of charges ±2 μC separated by 2 cm has p = 2 × 10⁻⁶ × 0.02 = 4 × 10⁻⁸ C m. At an axial point 0.2 m from its centre: V = 9 × 10⁹ × 4 × 10⁻⁸/(0.2)² = 360/0.04 = 9000 V. At an equatorial point the same distance away: V = 0 exactly. At θ = 60°, same r: V = 9000 × cos60° = 4500 V.
• EXAMPLE — A water molecule is a permanent dipole (p ≈ 6.2 × 10⁻³⁰ C m). Its potential near a dissolved ion steers how water molecules orient around the ion — the microscopic reason salt dissolves and your nerves can fire. Dipole potentials run chemistry.
• YOUR TURN — For the same dipole (p = 4 × 10⁻⁸ C m), find V at r = 0.1 m on the axis beyond the negative charge. (Answer: θ = 180°, cosθ = −1: V = −9 × 10⁹ × 4 × 10⁻⁸/0.01 = −36000 V = −36 kV.)
⚠ EXAM TRAP — The angle θ is measured from the dipole AXIS (the direction of p, from − to +), not from the line joining the point to one charge, and the formula needs r measured from the dipole CENTRE. Both slips are planted in options every year.

Equipotential Surfaces — Contour Lines of Electricity
• DEFINITION — Equipotential surface: a surface (or line, in 2D diagrams) on which the potential has the same value at every point. For a point charge these are concentric spheres; for a uniform field, parallel planes; for a dipole, the curved lobes of the figure below.
• Property 1 — No work is done moving a charge along an equipotential: ΔV = 0, so W = qΔV = 0. The field may push, but never along the surface.
• Property 2 — The field is everywhere perpendicular to the equipotential surface. WHY: if E had a component along the surface, it would do work along it, contradicting Property 1. E pierces equipotentials at right angles, always.
• Property 3 — Equipotential surfaces never cross: a crossing point would need two potentials at once, which is impossible.
• Property 4 — Spacing reads the field strength: where surfaces crowd together, V changes fast, so E = −dV/dr is large. Contour-map logic, identical to hills: close contours mean a steep slope. Surfaces drawn for equal voltage steps bunch near charges and spread out far away.
• Property 5 — The surface of a conductor in electrostatic equilibrium is an equipotential, and so is its entire volume (conductors get their own section shortly).
• Read the figure: left, a point charge — radial field arrows pierce spherical equipotentials at 90°, spacing widening as V ∝ 1/r flattens. Right, a dipole — positive lobes hug the + charge, negative lobes the − charge, every field line crossing every equipotential at a right angle, and the mid-plane an exact V = 0 sheet.
• WORKED PATTERN — Equipotentials at 10 V and 12 V are 1 cm apart near a region. Field magnitude there ≈ ΔV/Δr = 2/0.01 = 200 V/m, directed from the 12 V surface towards the 10 V surface. Two numbers, one division — this estimate style is a favourite one-mark question.
• YOUR TURN — A charge moves on a circle around a point charge, staying 0.5 m away. How much work does the field do in one full trip? (Answer: zero — the circle is an equipotential, and a closed loop in a conservative field costs nothing anyway.)
⚠ EXAM TRAP — Field lines CAN cross equipotentials (they must, at 90°) but field lines never cross EACH OTHER, and equipotentials never cross each other. Keep the two "never cross" rules paired with the right families.

Electrostatic Potential Energy — What It Costs to Assemble Charges
• DEFINITION — Electrostatic potential energy of a system of charges: the total work an external agent must do to assemble the system, bringing each charge in from infinity, slowly, against the fields of those already placed. It is stored in the configuration, not in any single charge.
✔ KEY FORMULA — For a pair: U = kq₁q₂/r. Same signs: U positive (you paid work to force them together; the system would explode apart if released). Opposite signs: U negative (the system is bound; you must pay work to tear it apart).
• Building a system, charge by charge: the first charge costs nothing (no field to fight yet). The second pays U = kq₁q₂/r₁₂. The third pays against both: kq₃q₁/r₁₃ + kq₃q₂/r₂₃. Total: U = sum over each PAIR counted exactly once — for n charges there are n(n−1)/2 pairs.
• WORKED PATTERN — U of +2 μC and −3 μC held 0.15 m apart: U = 9 × 10⁹ × (2 × 10⁻⁶)(−3 × 10⁻⁶)/0.15 = −0.054/0.15 = −0.36 J. Negative: bound pair; separating them to infinity costs +0.36 J.
• WORKED PATTERN — Three charges 1 μC, 2 μC, 3 μC at the corners of an equilateral triangle of side 0.1 m: pairs give k/r × (1×2 + 2×3 + 1×3) × 10⁻¹² = (9 × 10⁹/0.1) × 11 × 10⁻¹² = 9 × 10¹⁰ × 1.1 × 10⁻¹¹ = 0.99 J. List the pairs first, then one clean sum — pair-listing is the anti-error ritual.
• The energy view of motion problems: a charge released in a field converts ΔU into kinetic energy: ½mv² gain = q(V_start − V_end) for a positive charge moving to lower V. This single line replaces pages of kinematics whenever the field is complicated but the endpoint potentials are known.
• EXAMPLE — An electron falling through 1 V gains exactly 1 eV = 1.6 × 10⁻¹⁹ J; through the 25 kV of an old picture tube it gains 25 keV, reaching about a third of light speed. Potential differences are speed dials for charges.
• YOUR TURN — How much work must an external agent do to separate the +2 μC / −3 μC pair of the worked pattern from 0.15 m to infinity? (Answer: +0.36 J — undoing a bound system always costs the negative of its U.)
⚠ EXAM TRAP — U of a pair is kq₁q₂/r, NOT kq₁q₂/r² — that is the force. And when the problem asks for the energy of ONE charge in an existing field, use U = qV; when it asks for the energy of the ASSEMBLY, use the pair sum. Same letter, two different questions.

▸ A Dipole in an External Field — Energy, Torque and Stability
• Place a dipole in a uniform external field E. The two charges feel equal and opposite forces — no net force, but a turning couple you met last chapter: torque τ = pE sinθ, always working to align p with E.
✔ KEY FORMULA — Potential energy of the dipole: U = −pE cosθ = −(p · E). At θ = 0 (aligned): U = −pE, the minimum — stable equilibrium. At θ = 90°: U = 0 (our chosen reference). At θ = 180° (anti-aligned): U = +pE, the maximum — unstable equilibrium.
• WHY the minus sign and the cosine: rotating the dipole from 90° to θ against the torque costs work; integrating τ dθ from the 90° reference gives exactly −pE cosθ. The formula is the torque law in stored form — differentiate U with respect to θ and the torque falls back out.
• WORKED PATTERN — p = 2 × 10⁻⁸ C m in E = 5 × 10⁴ N/C at θ = 60°: U = −2 × 10⁻⁸ × 5 × 10⁴ × cos60° = −5 × 10⁻⁴ J. Torque magnitude there: τ = pE sin60° = 10⁻³ × 0.866 = 8.66 × 10⁻⁴ N m, pulling it towards alignment. Flipping it fully to 180° would cost ΔU = (+pE) − (−pE cos60°) = 10⁻³ + 5 × 10⁻⁴ = 1.5 × 10⁻³ J.
• EXAMPLE — This is why polar molecules rotate to follow oscillating fields — and why microwave ovens heat food: water dipoles chase a flipping field 2.45 billion times a second, and the rotational friction becomes heat.
• A non-uniform field adds the missing piece: the two end forces no longer cancel, so a dipole is also PULLED towards the stronger-field region (if aligned). That pull is why a charged comb drags neutral paper bits — induced dipoles, drawn to the strong field near the comb.
• YOUR TURN — A dipole sits anti-aligned in a field (θ = 180°). It is nudged and swings to alignment. How much kinetic energy does it gain (p = 2 × 10⁻⁸ C m, E = 5 × 10⁴ N/C)? (Answer: ΔU = U(0) − U(180°) = −pE − (+pE) = −2pE = −2 × 10⁻³ J, so KE gained = 2 × 10⁻³ J.)
⚠ EXAM TRAP — U = −pE cosθ uses θ between p and E, with U = 0 defined at 90°, not at alignment. If you memorise "U = 0 when aligned", every sign in the problem flips.
Electrostatics of Conductors — Charge Runs to the Surface
• DEFINITION — Electrostatic equilibrium: the state, reached in a flash, in which no net motion of charge occurs inside a conductor. Everything in this section is a consequence of that one state — free electrons shuffle until every force on them cancels, then stop.
• Fact 1 — E = 0 everywhere inside the conducting material. WHY: if any field remained inside, free charges would still be moving, contradicting equilibrium. (Inside a hollow cavity it can differ — see Fact 4.)
• Fact 2 — All net charge resides on the outer surface. By Gauss's law with E = 0 inside, any Gaussian surface drawn within the material encloses zero net charge — so excess charge has nowhere to live but the surface.
• Fact 3 — The conductor is an equipotential body: E = 0 inside means V cannot change from point to point (E = −dV/dr = 0), so surface and interior share one single potential. Just outside the surface, E is perpendicular to it, with magnitude E = σ/ε₀, where σ is the local surface charge density.
• Fact 4 — Cavities and shielding: an empty cavity inside a conductor has E = 0 inside it — the cavity wall's charges arrange to cancel the outside world completely. This is electrostatic shielding, the Faraday cage: cars are safe in lightning, and sensitive instruments live in metal boxes, for exactly this reason. But place a charge +q INSIDE the cavity and the picture changes: −q is induced on the cavity's inner wall, +q appears on the outer surface, and the outside world feels the charge as if the cavity were not there.
✔ KEY FORMULA — The charged conducting sphere (or shell), radius R, charge Q: for r ≥ R, V = kQ/r and E = kQ/r², exactly like a point charge at the centre; for r ≤ R, E = 0 and V = kQ/R — constant, equal to the surface value. Its capacitance as an isolated conductor: C = Q/V = 4πε₀R.
• Read the V–r graph in the figure: flat at kQ/R all the way from centre to surface, then a 1/r glide down. The E–r graph beside it is zero inside and jumps at the surface to kQ/R² before falling as 1/r². Exams love asking for V at the centre: it is NOT zero — it equals the surface value. That single idea is worth marks every single year.
• Charge crowds at sharp points: on an irregular conductor, σ is largest where the radius of curvature is smallest — pointed ends collect dense charge and intense local fields (E = σ/ε₀). Air near a sharp point can ionise: corona discharge. Lightning rods exploit this, leaking charge away quietly (and offering a preferred strike path when leaking is not enough).
• WORKED PATTERN — A conducting sphere of radius 9 cm carries 3 μC. Surface potential: V = 9 × 10⁹ × 3 × 10⁻⁶/0.09 = 3 × 10⁵ V = 300 kV — and that is also the potential at its centre and at every interior point. Capacitance: C = R/k = 0.09/(9 × 10⁹) = 10⁻¹¹ F = 10 pF. Note how tiny an isolated sphere's capacitance is — practical capacitors exist because 10 pF stores almost nothing.
• EXAMPLE — The Earth itself, R = 6400 km, has C = 4πε₀R ≈ 711 μF — the whole planet is under a millifarad. Capacitance is genuinely hard to accumulate; remember this when a problem casually quotes microfarads for a small device: geometry tricks are doing heavy lifting.
• YOUR TURN — A hollow conducting sphere of radius 10 cm carries 1 μC. What is V at its centre? (Answer: V = kQ/R = 9 × 10⁹ × 10⁻⁶/0.1 = 9 × 10⁴ V = 90 kV — not zero. E at the centre is zero; V is not.)
⚠ EXAM TRAP — "E = 0 inside a conductor" is about the material (and empty cavities). "V = 0 inside" is simply false unless the conductor is earthed. Earthing pins V to zero; isolation leaves V floating at kQ/R.

Dielectrics and Polarisation — Matter Softens the Field
• DEFINITION — Dielectric: an electrical insulator whose atoms/molecules distort (or whose permanent dipoles rotate) when placed in an electric field, without free charge flow. Glass, mica, plastic, oil and dry air are dielectrics.
• DEFINITION — Polarisation: in a field, the positive and negative charge centres of each molecule separate slightly (non-polar molecules) or molecular dipoles rotate into alignment (polar molecules). The bulk result: bound charge appears on the dielectric's surfaces — negative on the face towards the positive plate, positive on the other.
• The induced surface charge builds its own field opposing the applied one, so the net field inside the dielectric drops: E = E₀/K, where E₀ is the field without the dielectric.
• DEFINITION — Dielectric constant (relative permittivity) K = ε/ε₀: the factor by which the material reduces the field (with geometry fixed), equivalently the factor by which it will raise capacitance. Vacuum K = 1, air ≈ 1.0006, water ≈ 80, mica ≈ 5–7, most plastics 2–3.
• Dielectric strength is the limit you must respect: the maximum field a dielectric survives before it breaks down and conducts — for air about 3 × 10⁶ V/m (the number behind every lightning bolt and every spark). It caps the voltage, hence the energy, any real capacitor can hold.
• EXAMPLE — Water's K ≈ 80 is why it dissolves salts so well: the field between Na⁺ and Cl⁻ ions is weakened 80-fold inside water, so thermal jiggling can pull the crystal apart. Solubility is electrostatics wearing a chemistry coat.
• YOUR TURN — A field of 6 × 10⁵ N/C exists in a gap. A slab with K = 3 is slipped in (battery disconnected, isolated plates). What is the field inside the slab? (Answer: E₀/K = 2 × 10⁵ N/C — the missing two-thirds is cancelled by the polarisation field of the bound surface charge.)
⚠ EXAM TRAP — K multiplies capacitance only when the dielectric FILLS the space between plates appropriately; partial fillings need the series/parallel models of the next sections — do not slap a K onto any capacitor that merely has dielectric "nearby".

Capacitors and Capacitance — Bottles for Charge
• DEFINITION — Capacitor: a pair of conductors (plates) carrying equal and opposite charges +Q and −Q, separated by an insulator. The system's job is storing separated charge — and with it, energy — in the field between the plates.
• DEFINITION — Capacitance: C = Q/V, where Q is the magnitude of charge on either plate and V is the potential difference between the plates. SI unit: farad (F), 1 F = 1 C/V. Capacitance depends ONLY on geometry and the medium — never on the Q or V you happen to apply.
• Read C as a size, not a state: like the capacity of a bottle in litres, it says how much charge the device holds per volt of push. Double the voltage and the charge doubles — C itself does not budge. Practical values: pF (10⁻¹²) for radio circuits, μF (10⁻⁶) for electronics, and farad-scale supercapacitors for energy bursts.
• WHY do two plates store so well? Each plate's charge holds the other plate's opposite charge in place by attraction, letting the pair carry far more separated charge, at far lower voltage, than either conductor could alone. Mutual attraction is the whole business model.
• An isolated single conductor also has capacitance — C = Q/V against infinity as the second "plate": the sphere's 4πε₀R from the conductor section was exactly this.
• EXAMPLE — Camera flash: a capacitor of about 100 μF charged to 300 V stores U = ½CV² = 0.5 × 10⁻⁴ × 9 × 10⁴ = 4.5 J, dumped through the flash tube in a millisecond — a power burst of kilowatts from a battery that could never deliver it directly. Storage-plus-fast-release is the capacitor's signature trick.
• YOUR TURN — A capacitor holds 60 μC when connected to 12 V. Find C, and the charge at 20 V. (Answer: C = 60/12 = 5 μF; at 20 V, Q = CV = 5 × 20 = 100 μC. C stayed 5 μF.)
⚠ EXAM TRAP — In C = Q/V, Q is the charge on ONE plate (magnitude), not the sum 2Q of both plates, and not the net charge of the device (which is zero — a charged capacitor is neutral overall).

The Parallel Plate Capacitor — Deriving C = ε₀A/d
• The workhorse geometry: two parallel conducting plates, each of area A, separated by a small distance d (d much smaller than the plate size, so the field inside is uniform and fringing at the edges can be ignored).
• The derivation in three moves. Move 1 — field between oppositely charged plates: each plate alone gives σ/(2ε₀); between the plates the fields add: E = σ/ε₀ = Q/(ε₀A), uniform. (Outside, they cancel — the field lives only between the plates.)
• Move 2 — potential difference: V = E × d = Qd/(ε₀A).
• Move 3 — divide: C = Q/V.
✔ KEY FORMULA — C = ε₀A/d. Capacitance grows with plate area, shrinks with separation. The levers of capacitor design: big A (foil wound into rolls), tiny d (nanometre oxide films), and high-K dielectric in the gap — all three are just this formula being pushed.
• WORKED PATTERN — A = 100 cm² = 10⁻² m², d = 2 mm = 2 × 10⁻³ m: C = 8.85 × 10⁻¹² × 10⁻²/(2 × 10⁻³) = 8.85 × 10⁻¹² × 5 ≈ 44 pF. At 100 V it holds Q = CV ≈ 4.4 × 10⁻⁹ C — a few nanocoulombs. Air-spaced plates are feeble; that is the honest scale.
• Sanity ladder for the geometry levers: halving d doubles C; doubling A doubles C; both together quadruple it. Exams ask these as one-line ratio questions — answer them from the formula's skeleton without computing anything.
• EXAMPLE — Your phone's touchscreen is this formula at work: a finger changes the effective dielectric and geometry of tiny plate pairs, shifting C measurably. Capacitance sensing runs touchscreens, fingerprint readers and fluid-level gauges.
• YOUR TURN — Plates of area 200 cm² at d = 1 mm: find C. (Answer: C = 8.85 × 10⁻¹² × 2 × 10⁻²/10⁻³ = 8.85 × 10⁻¹² × 20 = 177 pF.)
⚠ EXAM TRAP — C = ε₀A/d wants A in m² and d in m. The cm²-to-m² conversion (×10⁻⁴) is the most farmed arithmetic error in this chapter — write the conversion explicitly every time.

▸ Dielectric Inside a Capacitor — Battery Connected or Not
• Now fill the gap (fully) with a dielectric of constant K. Capacitance is multiplied: C = Kε₀A/d = KC₀. But what happens to Q, V and U splits into two stories, and telling them apart is the single most tested skill in this chapter.
• STORY 1 — Battery stays connected: the battery is a voltage dictator, so V is FIXED. C rises K-fold, so Q = CV rises K-fold (the battery pushes in extra charge), and U = ½CV² rises K-fold. The dielectric also gets pulled in by the field — the battery pays for everything.
• STORY 2 — Battery disconnected first: the plates are isolated islands, so Q is FIXED. C rises K-fold, so V = Q/C falls K-fold, E falls K-fold, and U = Q²/(2C) falls K-fold. Where did the energy go? It was spent as the field pulled the dielectric slab in — the capacitor does mechanical work on the slab.
• Memory hook: the battery pins V; isolation pins Q. Whichever is pinned, hold it fixed and let the other quantities rearrange around the new C.
• Partial filling 1 — slab of thickness t (t < d) covering the full plate area: the gap acts as two capacitors in SERIES (dielectric layer + air layer), giving C = ε₀A/(d − t + t/K). Check the limits: t = 0 gives ε₀A/d ✓; t = d gives Kε₀A/d ✓. If your derived formula fails these two checks, it is wrong — always run them.
• Partial filling 2 — slab covering part of the plate AREA (like the figure, slid in a length x of plates of width w): the filled and unfilled strips are two capacitors in PARALLEL sharing the same V: C = (ε₀/d) × [area_unfilled + K × area_filled] = (ε₀w/d) × [(L − x) + Kx]. As x grows, C grows linearly — which is why a connected battery keeps pumping charge in as the slab slides.
• WORKED PATTERN — A = 100 cm², d = 4 mm, with a slab of thickness 2 mm and K = 4 filling half the gap thickness: C = ε₀A/(d − t + t/K) = 8.85 × 10⁻¹² × 10⁻²/(0.004 − 0.002 + 0.0005) = 8.85 × 10⁻¹⁴/0.0025 ≈ 35.4 pF, versus 22.1 pF for the empty capacitor. A half-thickness slab buys a 60% rise — partial geometry, honest arithmetic.
• YOUR TURN — A 10 μF capacitor is charged to 12 V and the battery is removed. A K = 4 slab is then inserted fully. Find the new V and where the energy went. (Answer: Q = 120 μC pinned; C becomes 40 μF; V = 120/40 = 3 V. U falls from ½ × 10 × 144 = 0.72 mJ to ½ × 40 × 9 = 0.18 mJ — the missing 0.54 mJ is the work the field did pulling the slab in.)
⚠ EXAM TRAP — Inserting a dielectric does NOT always raise the stored energy. Connected: U rises. Disconnected: U falls. Any option claiming "U always increases" is bait.

Capacitors in Series and Parallel
• Two ways to wire capacitors, and the rules are the mirror image of resistors. Learn them by their conserved quantity, not by rote.
• SERIES — one chain, single path. The battery charges the end plates; each inner pair of connected plates is an isolated island, so induction forces the SAME magnitude of charge Q on every capacitor in the chain. Voltages add: V = V₁ + V₂ + … with Vᵢ = Q/Cᵢ.
✔ KEY FORMULA — Series: 1/C_eq = 1/C₁ + 1/C₂ + … For two: C_eq = C₁C₂/(C₁ + C₂) (product over sum). C_eq is always SMALLER than the smallest member — the chain behaves like one capacitor with a bigger plate gap.
• VOLTAGE DIVISION in series runs inverse to capacitance: Vᵢ = Q/Cᵢ, so the SMALLEST capacitor carries the LARGEST voltage. This decides which member breaks down first in a real chain — and in exam options.
• PARALLEL — every capacitor wired directly across the same two nodes. The potential difference V is the SAME on each; charges add: Q_total = Q₁ + Q₂ + … = (C₁ + C₂ + …)V.
✔ KEY FORMULA — Parallel: C_eq = C₁ + C₂ + … C_eq is LARGER than the largest member — the bank behaves like one plate of combined area. Charge divides in direct proportion to C: Qᵢ = CᵢV.
• The figure draws both networks side by side — same Q / V divides for series, same V / Q divides for parallel. Mixed networks fall to a two-step rhythm: collapse the innermost pure group first, redraw, repeat. Never try to swallow a mixed network in one gulp.
• WORKED PATTERN — 2 μF and 3 μF in series across 100 V: C_eq = (2 × 3)/(2 + 3) = 1.2 μF. Chain charge Q = C_eq × V = 120 μC on EACH capacitor. Voltages: V₁ = 120/2 = 60 V across the 2 μF, V₂ = 120/3 = 40 V across the 3 μF — sum 100 V ✓, and the smaller capacitor took the bigger share ✓.
• EXAMPLE — Why series at all? Voltage rating: two 10 μF capacitors rated 50 V each, in series, tolerate 100 V (sharing it) at the price of halving to 5 μF. Real power supplies use exactly this trade.
• YOUR TURN — 6 μF and 12 μF in parallel across 24 V: find C_eq, total charge, and total energy. (Answer: C_eq = 18 μF; Q = 18 × 24 = 432 μC; U = ½ × 18 × 10⁻⁶ × 24² = 5.18 × 10⁻³ J ≈ 5.2 mJ.)
⚠ EXAM TRAP — Series capacitors do NOT split charge and parallel capacitors do NOT split voltage — swapping the two invariants is the most common network error. Ask first: "what is common here — Q or V?"

Energy Stored in a Capacitor — Energy Lives in the Field
• Charging is carrying charge uphill: each small packet dq is pushed from the − plate to the + plate against the growing potential difference. Integrating that effort from 0 to Q gives the stored energy.
✔ KEY FORMULA — Three faces of one energy: U = ½CV² = Q²/(2C) = ½QV. Choose the face that matches what is held constant in your problem: V fixed? Use ½CV². Q fixed? Use Q²/(2C).
• WHY the half? Because the voltage grows as you charge — the first packets cross nearly zero potential difference, the last cross the full V. The average push is V/2, hence U = Q × (V/2). The battery, meanwhile, does total work QV — exactly double — and the other half is spent as heat in the connecting wires (and a whisper of electromagnetic radiation) no matter how thin or perfect the wires are.
✔ KEY FORMULA — Energy density of the field: u = U/volume = ½ε₀E² (in vacuum/air). For a parallel plate capacitor this is exact: the energy is not "on the plates" — it is spread through the field in the gap, at ½ε₀E² joules per cubic metre.
• Numbers for intuition: E = 3 × 10⁵ V/m (a strong lab field) gives u = ½ × 8.85 × 10⁻¹² × 9 × 10¹⁰ ≈ 0.4 J/m³ — field energy is dilute, which is why capacitors store modest energy unless E approaches breakdown.
• WORKED PATTERN — A 5 μF capacitor at 200 V: U = ½ × 5 × 10⁻⁶ × 40000 = 0.1 J. Small in joules — but release it in a microsecond and it is momentarily a 100 kW source. Energy modest, power fierce: remember the flash.
• Discharge behaviour, qualitatively: a charged capacitor left connected to a resistor bleeds its charge exponentially, U falling as the square of charge. The stored field energy ends as heat in the resistor — all of it, always.
• YOUR TURN — A capacitor of 4 μF holds 32 μC. Find the stored energy two ways. (Answer: V = Q/C = 8 V; U = ½QV = ½ × 32 × 10⁻⁶ × 8 = 1.28 × 10⁻⁴ J. Check with Q²/(2C) = (32 × 10⁻⁶)²/(8 × 10⁻⁶) = 1.28 × 10⁻⁴ J ✓.)
⚠ EXAM TRAP — U = ½CV², not CV². Dropping the half doubles your answer — and there is always a doubled option waiting. The half is the average-voltage factor; respect it.

▸ Connecting Capacitors — the Case of the Vanishing Energy
• The classic setup: a charged capacitor is connected across an uncharged one (no battery anywhere). Charge races through the wire until both reach one common potential — and when the dust settles, some energy is simply GONE. Let us account for every joule.
• Charge conservation runs the meeting: the total charge on the connected plate-pair is trapped (that pair of plates is an isolated island), so Q_total before = (C₁ + C₂) × V_common after.
✔ KEY FORMULA — Common potential: V_common = (C₁V₁ + C₂V₂)/(C₁ + C₂) — total initial charge over total capacitance (with signs respected if plates are connected in opposition — the trap variant).
✔ KEY FORMULA — The energy loss: ΔU = U_before − U_after = ½ × [C₁C₂/(C₁ + C₂)] × (V₁ − V₂)². It depends on the SQUARE of the initial voltage difference — connect equal-potential capacitors and nothing is lost; connect very different ones and the loss is savage.
• Where did it go? Not into a bookkeeping error: the redistribution current surges through the wire, and the lost energy leaves as heat in the wire's resistance plus a pulse of electromagnetic radiation (the tiny click a radio hears from a spark). Make the wire resistance smaller and the surge is just faster and sparklier — the loss is the same. It is not an imperfection; it is a theorem.
• WORKED PATTERN — C₁ = 2 μF charged to 100 V, connected to uncharged C₂ = 3 μF. Initial charge: 200 μC; initial energy: ½ × 2 × 10⁻⁶ × 10⁴ = 10 mJ. Common potential: 200/(2 + 3) = 40 V. Final energy: ½ × 5 × 10⁻⁶ × 1600 = 4 mJ. Loss = 6 mJ — check by the formula: ½ × (6/5 × 10⁻⁶) × (100)² = ½ × 1.2 × 10⁻⁶ × 10⁴ = 6 mJ ✓. Sixty percent of the energy vanished into heat and a spark-click.
• The moral for problem-solving: in connection problems, charge is your conserved currency — energy is not. Students who conserve energy here get elegant, confident, wrong answers.
• EXAMPLE — This is also why paralleling a charged capacitor into a circuit can weld contacts and kill components: the "missing" energy leaves through whatever resistance it finds, fast.
• YOUR TURN — C₁ = 4 μF at 50 V is connected to an identical uncharged 4 μF. Find the common potential and the fraction of energy lost. (Answer: V = 200/8 = 25 V. U_before = ½ × 4 × 10⁻⁶ × 2500 = 5 mJ; U_after = ½ × 8 × 10⁻⁶ × 625 = 2.5 mJ; exactly half is lost — for equal capacitors sharing with an empty partner, the loss is always 50%.)
⚠ EXAM TRAP — Connecting positive plate to NEGATIVE plate flips signs: use V_common = (C₁V₁ − C₂V₂)/(C₁ + C₂) with charges as signed quantities, or you will invent charge that never existed.

Formula Sheet — One-Glance Recap
✔ V = W/q₀ and ΔV = W/q₀ — potential is work per unit charge; unit volt = J/C
✔ Point charge: V = kQ/r with k = 9 × 10⁹ — sign follows Q; falls as 1/r
✔ System of charges: V = k Σ (qᵢ/rᵢ) — algebraic sum, no components
✔ Dipole (r >> 2a): V = kp cosθ/r² — axial ±kp/r², equatorial 0
✔ E = −dV/dr — field is minus the potential slope; E ⊥ equipotentials; fast V change means strong E
✔ Pair energy: U = kq₁q₂/r; system energy: sum over pairs, each counted once
✔ Dipole in field: U = −pE cosθ; torque τ = pE sinθ; flip cost from θ₁ to θ₂ is pE(cosθ₁ − cosθ₂)... use ΔU = U₂ − U₁ directly
✔ Conductor: E = 0 inside material; charge on outer surface; whole body at one V; just outside E = σ/ε₀, perpendicular
✔ Conducting sphere: V = kQ/R for r ≤ R, kQ/r for r ≥ R; C_sphere = 4πε₀R
✔ Dielectric: field inside reduced to E₀/K; polarisation puts bound charge on the faces
✔ Capacitance: C = Q/V (Q = one plate's charge); parallel plate C = ε₀A/d
✔ Dielectric full slab: C = KC₀; battery on: V pinned, Q and U scale by K; battery off: Q pinned, V, E and U divide by K
✔ Partial thickness slab: C = ε₀A/(d − t + t/K); partial area: filled and empty strips in parallel
✔ Series: Q common, 1/C_eq = Σ 1/Cᵢ, V divides inversely with C; Parallel: V common, C_eq = Σ Cᵢ, Q divides with C
✔ Stored energy: U = ½CV² = Q²/(2C) = ½QV; energy density u = ½ε₀E²; battery does work QV, half stored, half heat
✔ Sharing: V_common = total charge/(C₁ + C₂); loss ΔU = ½ [C₁C₂/(C₁ + C₂)] (V₁ − V₂)² — charge conserved, energy not

Common Mistakes and Exam Traps
• MISTAKE 1 — Treating potential and potential energy as the same thing. Why wrong: V is a property of the point (J/C); U = qV is a property of a charge at the point. Correct principle: compute V from sources first (no test charge involved), then multiply by whichever charge you place there.
• MISTAKE 2 — "V = 0 here, so E must be 0." Why wrong: E measures the SLOPE of V, not its value; on the perpendicular bisector of a dipole V = 0 everywhere while E is strong. Correct principle: E = 0 needs V constant in the neighbourhood, not V zero at a point.
• MISTAKE 3 — Setting V = 0 inside a charged conductor because E = 0 there. Why wrong: zero slope means constant V, and the constant is the surface value kQ/R. Correct principle: inside a conductor, E = 0 but V = surface potential (unless earthed).
• MISTAKE 4 — Splitting charge in series and voltage in parallel. Why wrong: in series the isolated middle plates force equal Q on every member; in parallel all members share the same two nodes, hence the same V. Correct principle: name the invariant first — series pins Q, parallel pins V.
• MISTAKE 5 — Assuming a dielectric always increases stored energy. Why wrong: with the battery connected U rises K-fold, but disconnected (Q pinned) U falls K-fold as the field spends energy pulling the slab in. Correct principle: ask what is pinned — V or Q — before touching U.
• MISTAKE 6 — Writing U = CV². Why wrong: charging fights a growing voltage; the average is V/2. Correct principle: U = ½CV² — the half is non-negotiable.
• MISTAKE 7 — Conserving energy when capacitors are connected together. Why wrong: redistribution currents dump energy as heat and radiation; only charge (on each isolated plate-group) is conserved. Correct principle: find V_common from charge conservation, then compute energies before and after.
• MISTAKE 8 — Feeding centimetres into C = ε₀A/d. Why wrong: the formula is SI-only; 100 cm² is 10⁻² m², not 100 of anything usable. Correct principle: convert A to m² and d to m in writing, every single time.
• MISTAKE 9 — Giving a dipole's equatorial potential a nonzero value, or measuring θ from the wrong line. Why wrong: at θ = 90°, cosθ = 0 exactly, and θ is always measured from the dipole axis (direction of p) to the line from the centre to the point. Correct principle: draw p, mark θ at the centre, then compute.

Worked Examples — Exam Patterns
• EXAMPLE 1 — Problem: Find the potential at 0.3 m from an isolated charge of +2 μC, and the potential energy of a 0.5 μC charge placed at that point.
• Given: Q = 2 × 10⁻⁶ C, r = 0.3 m, guest charge q = 0.5 × 10⁻⁶ C.
• Principle: V = kQ/r first (source only); then U = qV (guest).
• Steps: V = 9 × 10⁹ × 2 × 10⁻⁶/0.3 = 18000/0.3 = 6 × 10⁴ V. U = 0.5 × 10⁻⁶ × 6 × 10⁴ = 0.03 J.
• Answer: V = 60 kV; U = +0.03 J.
• Reasoning: The positive U says the pair repels — release the guest and it flies off with up to 0.03 J of kinetic energy.
• Mistake to avoid: Using the guest charge inside kQ/r. The landscape is built by the source alone.
• EXAMPLE 2 — Problem: Point P is 0.3 m from a +4 μC charge and 0.6 m from a −2 μC charge. Find V at P and the work an external agent does bringing a 1 μC charge from infinity to P.
• Given: q₁ = +4 μC at r₁ = 0.3 m; q₂ = −2 μC at r₂ = 0.6 m; moved charge 1 μC.
• Principle: Scalar superposition, then W = qV_P.
• Steps: V_P = 9 × 10⁹ × (4 × 10⁻⁶/0.3 − 2 × 10⁻⁶/0.6) = 9 × 10⁹ × (1.0 × 10⁻⁵) = 9 × 10⁴ V. W = 10⁻⁶ × 9 × 10⁴ = 0.09 J.
• Answer: V_P = 90 kV; W = 0.09 J.
• Reasoning: The negative charge's contribution arrives with its sign already attached — no separate handling needed.
• Mistake to avoid: Resolving "components" of potential. There are none.
• EXAMPLE 3 — Problem: A dipole consists of ±2 μC separated by 2 cm. Find V at (a) an axial point 0.2 m from the centre on the + side, (b) an equatorial point 0.2 m away, (c) a point at 0.2 m at 60° to the axis.
• Given: p = q × 2a = 2 × 10⁻⁶ × 0.02 = 4 × 10⁻⁸ C m; r = 0.2 m.
• Principle: V = kp cosθ/r² with θ measured from the axis.
• Steps: kp/r² = 9 × 10⁹ × 4 × 10⁻⁸/0.04 = 9000 V. (a) θ = 0: V = +9000 V. (b) θ = 90°: V = 0. (c) θ = 60°: V = 9000 × 0.5 = 4500 V.
• Answer: +9000 V; 0; +4500 V.
• Reasoning: One base number, three cosines — dipole potential questions are cosine questions in disguise.
• Mistake to avoid: Using r from one of the charges instead of from the centre.
• EXAMPLE 4 — Problem: Charges +2 μC and −3 μC are held 0.15 m apart. Find the system's potential energy and state whether the pair is bound.
• Given: q₁q₂ = −6 × 10⁻¹² C², r = 0.15 m.
• Principle: U = kq₁q₂/r; negative U means bound.
• Steps: U = 9 × 10⁹ × (−6 × 10⁻¹²)/0.15 = −0.054/0.15 = −0.36 J.
• Answer: U = −0.36 J; the pair is bound — separating them to infinity costs +0.36 J of work.
• Reasoning: Opposite signs attract; the external agent got paid 0.36 J while assembling them, and must return it to take them apart.
• Mistake to avoid: Dropping the sign of q₁q₂ and reporting +0.36 J — the sign IS the physics here.
• EXAMPLE 5 — Problem: A conducting sphere of radius 9 cm is charged to 3 μC. Find the potential at its surface, at its centre, and its capacitance.
• Given: R = 0.09 m, Q = 3 × 10⁻⁶ C.
• Principle: For r ≤ R, V = kQ/R everywhere; C = Q/V = 4πε₀R = R/k.
• Steps: V = 9 × 10⁹ × 3 × 10⁻⁶/0.09 = 3 × 10⁵ V at the surface AND at the centre. C = 0.09/(9 × 10⁹) = 10⁻¹¹ F.
• Answer: V = 300 kV (surface and centre alike); C = 10 pF.
• Reasoning: E = 0 inside forces V to be constant through the whole body.
• Mistake to avoid: Answering 0 for the centre — that is the FIELD's value there, not the potential's.
• EXAMPLE 6 — Problem: A parallel plate capacitor has plates of 100 cm² separated by 2 mm of air. Find C, the charge at 100 V, and the new charge if a K = 5 dielectric fully fills the gap with the battery still connected.
• Given: A = 10⁻² m², d = 2 × 10⁻³ m, V = 100 V, K = 5.
• Principle: C = ε₀A/d; Q = CV; battery connected pins V, dielectric multiplies C and Q by K.
• Steps: C = 8.85 × 10⁻¹² × 10⁻²/(2 × 10⁻³) ≈ 44.3 pF. Q = 44.3 × 10⁻¹² × 100 ≈ 4.43 nC. With dielectric: C = 5 × 44.3 ≈ 221 pF, Q ≈ 22.1 nC.
• Answer: C ≈ 44 pF; Q ≈ 4.4 nC; after dielectric Q ≈ 22 nC at the same 100 V.
• Reasoning: The battery is a charge pump holding 100 V — raise C and it simply pumps five times the charge.
• Mistake to avoid: Keeping Q fixed in a battery-connected problem. Connected means V is the pinned quantity.
• EXAMPLE 7 — Problem: Capacitors of 2 μF and 3 μF are connected in series across a 100 V battery. Find the equivalent capacitance, the charge on each, and the voltage across each.
• Given: C₁ = 2 μF, C₂ = 3 μF, V_total = 100 V.
• Principle: Series — C_eq = product/sum; Q identical on both; Vᵢ = Q/Cᵢ.
• Steps: C_eq = 6/5 = 1.2 μF. Q = 1.2 × 100 = 120 μC on each. V₁ = 120/2 = 60 V; V₂ = 120/3 = 40 V. Check: 60 + 40 = 100 ✓.
• Answer: C_eq = 1.2 μF; Q = 120 μC each; 60 V and 40 V, the smaller capacitor taking the larger voltage.
• Reasoning: The voltage split is inverse to C — always verify the sum at the end.
• Mistake to avoid: Dividing 100 V in the ratio 2:3 directly (that gives 40/60 — exactly backwards).
• EXAMPLE 8 — Problem: A 2 μF capacitor is charged to 100 V, disconnected, and then connected across an uncharged 3 μF capacitor. Find the common potential and the energy lost.
• Given: C₁ = 2 μF, V₁ = 100 V; C₂ = 3 μF, V₂ = 0.
• Principle: Charge conserved on the joined plates; energy is not.
• Steps: Q_total = 2 × 100 = 200 μC. V_common = 200/(2 + 3) = 40 V. U_before = ½ × 2 × 10⁻⁶ × 10⁴ = 10 mJ. U_after = ½ × 5 × 10⁻⁶ × 40² = 4 mJ. Loss = 6 mJ.
• Answer: V_common = 40 V; 6 mJ (60%) lost as heat and radiation in the connecting wire.
• Reasoning: Cross-check with ΔU = ½ × [C₁C₂/(C₁ + C₂)] × (V₁ − V₂)² = ½ × 1.2 × 10⁻⁶ × 10⁴ = 6 mJ ✓.
• Mistake to avoid: Setting U_after = U_before and solving for V — energy conservation is the one law that does NOT apply here.

Practice Questions — Self-Test Set
• Q1 (single correct) — The potential at a distance of 0.5 m from a point charge of +10 μC is:
• A) 90 kV
• B) 180 kV
• C) 360 kV
• D) 18 kV
• Q2 (single correct) — The work done by an external agent in bringing a charge of 2 μC from infinity to a point where the potential is 50 kV is:
• A) 0.01 J
• B) 0.05 J
• C) 0.1 J
• D) 1 J
• Q3 (multiple correct) — Which statements about equipotential surfaces are TRUE?
• A) No work is done moving a charge along an equipotential surface
• B) The electric field is parallel to an equipotential surface at every point
• C) Two equipotential surfaces for different potentials never intersect
• D) The entire volume of a charged conductor is at one potential
• Q4 (numerical) — Capacitors of 6 μF and 12 μF are connected in parallel across 24 V. Find the total energy stored in the combination, in mJ.
• Q5 (single correct) — A 10 μF capacitor is charged to 12 V, disconnected from the battery, and a dielectric slab of K = 4 is then fully inserted. The new potential difference is:
• A) 12 V
• B) 48 V
• C) 3 V
• D) 6 V
• Q6 (single correct) — A dipole of moment 2 × 10⁻⁸ C m sits in a uniform field of 5 × 10⁴ N/C at 60° to the field. Its potential energy is:
• A) −1 × 10⁻³ J
• B) −5 × 10⁻⁴ J
• C) +5 × 10⁻⁴ J
• D) zero
• Q7 (numerical) — Find the capacitance of an isolated conducting sphere of radius 18 cm, in pF.
• Q8 (assertion–reason) — Assertion (A): In a series combination, the smallest capacitor bears the largest share of the total voltage. Reason (R): In series every capacitor carries the same charge, and V = Q/C.
• Options for Q8: (a) Both A and R are true and R explains A (b) Both true but R does not explain A (c) A true, R false (d) A false, R true

▸ Answer Key with Explanations
• Q1 — B) 180 kV. V = kQ/r = 9 × 10⁹ × 10⁻⁵/0.5 = 1.8 × 10⁵ V. Misconception check: A) 90 kV comes from using r = 1 m; C) from squaring nothing but doubling wrongly — always write kQ/r before touching numbers.
• Q2 — C) 0.1 J. W = qV = 2 × 10⁻⁶ × 5 × 10⁴ = 0.1 J. Misconception check: the answer does not depend on the path or on how fast the charge moved — only on q and the endpoint V.
• Q3 — A, C and D. B is false: E is PERPENDICULAR to an equipotential surface — if it had a parallel component it would do work along the surface, contradicting A. Misconception check: "no work along" and "E perpendicular" are the same fact stated twice.
• Q4 — 5.18 mJ. Parallel: C_eq = 18 μF; U = ½ × 18 × 10⁻⁶ × 24² = ½ × 18 × 576 μJ = 5184 μJ ≈ 5.18 mJ. Misconception check: in parallel each capacitor sees the full 24 V — solving them separately (2.59 mJ + ...) and adding energies gives the same total, a good cross-check.
• Q5 — C) 3 V. Battery disconnected pins Q = 10 × 12 = 120 μC. C becomes 40 μF, so V = 120/40 = 3 V. Misconception check: B) 48 V is the battery-CONNECTED trap applied to a disconnected setup; U also falls fourfold here, from 0.72 mJ to 0.18 mJ.
• Q6 — B) −5 × 10⁻⁴ J. U = −pE cosθ = −2 × 10⁻⁸ × 5 × 10⁴ × 0.5 = −5 × 10⁻⁴ J. Misconception check: A) forgets cos60°; C) flips the sign of the defining formula; U = 0 lives at 90°, not 60°.
• Q7 — 20 pF. C = 4πε₀R = R/k = 0.18/(9 × 10⁹) = 2 × 10⁻¹¹ F. Misconception check: sphere capacitance grows with R (linearly), not with area (R²) — the V in Q/V already contains the geometry.
• Q8 — (a). R is exactly the mechanism: equal Q in series, and V = Q/C makes the smallest C carry the largest V. Misconception check: assertion–reason questions are won by testing "does R CAUSE A?" — here it does, one step, no gaps.

Chapter Summary and Revision Checklist
• The chapter in one paragraph: potential V is the scalar energy landscape built by charges — V = kQ/r for a point charge, an algebraic sum for a system, kp cosθ/r² for a dipole. E is its downhill slope, perpendicular to equipotential contours. Potential energy U = qV belongs to charges; assemblies cost the pair sum kq₁q₂/r; a dipole stores U = −pE cosθ. Conductors freeze the landscape flat at one potential with all charge on the skin. Capacitors store separated charge with C = Q/V; the parallel plate gives C = ε₀A/d, dielectrics multiply by K (with opposite energy stories for battery on/off), series pins Q and parallel pins V, stored energy is ½CV² living in the field at ½ε₀E² per unit volume — and when capacitors are connected to each other, charge is conserved but energy provably is not.
• Essential definitions to be able to recite: electrostatic potential; potential difference; equipotential surface; potential energy of a system; dielectric constant; polarisation; capacitance.
• Confused pairs to separate before the exam: V versus U = qV; E = 0 versus V = 0 inside a conductor; series invariant Q versus parallel invariant V; battery-connected (V pinned) versus disconnected (Q pinned) dielectric behaviour.
• Revision checklist — tick each only when you can do it cold:
• I can derive V = kQ/r by the work argument, not just quote it
• I can compute V for a mixed-sign charge system without reaching for vectors
• I can state the dipole potential on axis, equator and at a general angle
• I can list the pairs and sum the energy of a 3 or 4 charge system
• I can give U and τ of a dipole at any angle, with signs
• I can draw V–r and E–r graphs for a charged conducting sphere from memory
• I can explain cavity shielding and where the charge sits if a charge is inside the cavity
• I can derive C = ε₀A/d in three moves
• I can handle both dielectric stories and both partial-filling models
• I can collapse series, parallel and mixed networks, naming the invariant first
• I can solve a charge-sharing problem and account for the lost energy
• Self-assessment (answers in brackets — cover them and try):
• SA1 — What is the potential at the centre of a charged hollow conducting sphere? (kQ/R — the surface value, not zero.)
• SA2 — Equivalent capacitance of 3 μF and 6 μF in series? (2 μF — product over sum.)
• SA3 — An isolated capacitor has its plate separation doubled. What happens to V and U? (C halves; Q pinned, so V doubles and U = Q²/2C doubles.)
• SA4 — Equipotential surfaces for equal voltage steps are twice as far apart in region B as in region A. Compare the fields. (E in B is about half of E in A — E ≈ ΔV/Δr.)
• SA5 — A 6 μF capacitor at 30 V is connected to an uncharged 3 μF. Common potential? (Total charge 180 μC over 9 μF = 20 V.)
★ HIGHLIGHT — If you leave this chapter with three reflexes, leave with these: potentials add as signed numbers; series means same Q, parallel means same V; and in any connection problem, conserve charge — never energy.
<!-- END phys_ch_16 detailedStudyNotes -->
