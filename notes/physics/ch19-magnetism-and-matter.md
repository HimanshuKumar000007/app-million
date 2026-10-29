<!-- BEGIN phys_ch_19 detailedStudyNotes -->
Introduction — Every Magnet Is Made of Loops
• Take a bar magnet and snap it in half, hunting for the lonely north pole you were promised in childhood. You will never find it. Each half is a complete magnet with its own north and south, and if you keep cutting, every fragment — down to the atoms themselves — still carries both poles. This chapter explains why that has to be true, and what it reveals about the magnetism hiding inside all matter.
• Here is the promise of this chapter. You will treat a bar magnet as a magnetic dipole and compute its field on the axis and the equator, see why it is indistinguishable from a solenoid, master the torque and energy of a dipole in a field, state Gauss's law for magnetism, decode the Earth's field into three measurable elements, and sort all of matter into diamagnetic, paramagnetic and ferromagnetic — ending with hysteresis, the loop that lets iron remember.
★ HIGHLIGHT — The whole chapter in one breath: a magnet is a dipole M; its field falls as 1/r³ with the axial value twice the equatorial; a field twists it with τ = MB sinθ towards U = −MB cosθ; no monopoles exist, so ∮B·dA = 0; and matter replies to a field through B = μ0(H + M), weakly (dia/para) or with domain-powered memory (ferro).

The Bar Magnet — Field Lines and Their Properties
• DEFINITION — Bar magnet: a body with two regions of concentrated magnetic influence, the poles, near its ends. The pole that points roughly geographic north when the magnet hangs freely is the north (N) pole; the other is the south (S) pole. Like poles repel, unlike poles attract.
• DEFINITION — Pole strength m: the strength of one pole, measured in A·m. The two poles of a magnet always have equal magnitude; there is no magnet with a strong N and a weak S.
• DEFINITION — Magnetic dipole moment M: M = m × 2l, where 2l is the magnetic length (the separation of the poles, slightly less than the geometric length). M is a vector pointing from S to N INSIDE the magnet. SI unit: A m², equivalently J/T.
• Field lines outside the magnet run from N to S; inside the magnet they continue from S to N, completing closed loops. A field line has no beginning and no end — remember this when Gauss's law arrives.
• The tangent to a field line at any point gives the direction of B there, and the crowding of lines gives its strength — lines bunch near the poles where the field is fierce and spread far away where it fades. Lines never intersect: at a crossing, B would need two directions at once.
• A compass needle is itself a tiny magnet on a pivot. Placed in a field, it swings until its own M lines up with B — its N pole pointing along the field. Iron filings do the same job in bulk, tracing the whole line pattern for your camera.
• EXAMPLE — Sprinkle filings around a bar magnet and the loops leap out: dense brushes at the poles, wide arcs sweeping from N around to S. Every filing is a temporary dipole aligned by the field — the alignment physics this whole chapter studies.
• Cut a magnet across its length: each piece keeps pole strength m but has half the length, so each has M/2 — and each is a complete dipole. Cut it lengthwise instead: the area halves, pole strength halves, M halves again. There is no cutting strategy that isolates a pole.
• YOUR TURN — A magnet of M = 6 A m² is cut into three equal pieces across its length. Moment of each piece? Answer: pole strength unchanged, length one third, so M = 2 A m² each — three complete small magnets.
✔ KEY FORMULA — M = m × 2l (S to N inside the magnet); field lines: closed loops, N to S outside, S to N inside, never crossing, density proportional to B.
⚠ EXAM TRAP — Field lines do NOT start at N and end at S the way electric field lines start and end on charges. They pass through the magnet's interior. Any option claiming a field line terminates on a pole is false — that single fact is Gauss's law in disguise.

▸ Field of a Bar Magnet — Axial and Equatorial Points
• DEFINITION — Axial point: a point on the line through the magnet's centre along M (the axis). Equatorial point: a point on the perpendicular bisector of the magnet. Both are measured by r, the distance from the CENTRE of the magnet.
• For a short magnet (r much larger than l), the axial field is B_axial = (μ0/4π) × 2M/r³, directed PARALLEL to M (away from the magnet on the N side, towards it beyond the S side — always along M).
• The equatorial field is B_equatorial = (μ0/4π) × M/r³, directed ANTIPARALLEL to M. Same distance, exactly half the axial strength.
• WHY 1/r³ — a dipole is two equal opposite influences almost cancelling; what survives is the small mismatch between them, and that mismatch dies one power of r faster than a single pole's 1/r² ever could. The 1/r³ fall-off is the fingerprint of every dipole, electric or magnetic.
• The electric-dipole mirror: E_axial = (1/4πε0) × 2p/r³ along p, E_equatorial = (1/4πε0) × p/r³ against p. Replace p by M and 1/4πε0 by μ0/4π and the magnetic formulas appear. Learn one dipole, own both.
• WORKED PATTERN — Read the geometry first: point on the axis → factor 2, direction along M; point on the bisector → no factor 2, direction against M. Then cube the centre-distance. Ninety percent of errors in this topic are one of those three steps skipped.
• YOUR TURN — M = 8 A m²; find B at 0.10 m on the equator and on the axis. Answer: equatorial = 10^-7 × 8/(0.10)³ = 8 × 10^-4 T; axial = double = 1.6 × 10^-3 T.
✔ KEY FORMULA — B_axial = (μ0/4π)(2M/r³) along M; B_equatorial = (μ0/4π)(M/r³) against M; ratio at equal r is exactly 2 : 1.
⚠ EXAM TRAP — r is measured from the magnet's CENTRE, not from the nearer pole, and the 2 belongs ONLY to the axial formula. Also note the equatorial field points opposite to M — the most commonly flipped direction in the chapter.

A Bar Magnet as an Equivalent Solenoid
• Chapter 18 built the field on the axis of a solenoid. Far from a solenoid of N turns, current I and area A, that field reduces to B = (μ0/4π) × 2(NIA)/r³ on the axis — which is precisely the bar magnet's axial formula with M replaced by NIA.
• So a bar magnet and a solenoid with the same M produce the SAME field everywhere outside themselves. No external experiment can tell them apart. The magnet is an equivalent solenoid; the solenoid is an electromagnet you can switch.
• WHY the equivalence runs deep — inside the magnet the lines run S to N, just as through a solenoid's bore; and halve a solenoid and each half is still a dipole, exactly as halving a magnet gives two magnets. Ampere guessed the reason two centuries early: magnetism in matter is tiny circulating currents — today, orbiting and spinning electrons.
• EXAMPLE — A solenoid of 500 turns carrying 2 A with turn area 2 × 10^-3 m² has M = NIA = 500 × 2 × 2 × 10^-3 = 2 A m². At distant points it mimics a bar magnet of M = 2 A m² in every detail.
• YOUR TURN — Solenoid: 1000 turns, 0.5 A, area 1 × 10^-3 m². Its moment? Answer: M = 1000 × 0.5 × 1 × 10^-3 = 0.5 A m².
✔ KEY FORMULA — M_solenoid = NIA with N the TOTAL number of turns; identical external field to a bar magnet of the same M.
⚠ EXAM TRAP — N here is the total turns on the solenoid, not the turns per metre n. If a problem gives n and the length l, the total is N = nl — forgetting the length silently shrinks M.

Torque and Potential Energy of a Magnetic Dipole
• DEFINITION — Torque on a dipole: a uniform field B exerts τ = MB sinθ on a magnetic dipole, where θ is the angle between M and B. Vector form: τ = M × B. The torque twists M towards B; it is zero at θ = 0 and 180 degrees and maximum at 90 degrees.
• DEFINITION — Potential energy of a dipole: U = −MB cosθ = −M·B. The zero of energy is set at θ = 90 degrees; U is minimum (−MB) at θ = 0 and maximum (+MB) at θ = 180 degrees.
• WHY these two are one story — the field's torque does work as the dipole swings; that work is stored as the drop in U. Stable equilibrium at θ = 0 (dipole aligned, U lowest): nudge it and the torque restores it. Unstable equilibrium at θ = 180 degrees (U highest): torque is also zero there, but the tiniest nudge flips the dipole all the way around.
• Work done by an external agent rotating the dipole from θ1 to θ2: W = MB(cosθ1 − cosθ2). The full flip from aligned to anti-aligned costs W = 2MB — a favourite one-line question.
• Oscillation bonus: hang the magnet freely in the Earth's horizontal field B_H and it swings like a pendulum with period T = 2π√(I/(M B_H)), I being its moment of inertia. This vibration magnetometer turns a stopwatch into a field-meter — Chapter 13's pendulum wearing a magnetic restoring torque.
• WORKED PATTERN — For any dipole-in-field question, fix θ from B to M first. Torque needs sinθ; energy needs −cosθ; work needs a difference of cosines. If the question says "plane of the coil", convert: θ is measured from the field to M (the coil's normal), never from the plane.
• YOUR TURN — A magnet with I = 2 × 10^-5 kg m² and M = 0.8 A m² hangs in B_H = 4 × 10^-5 T. Its oscillation period? Answer: T = 2π√(2 × 10^-5/(0.8 × 4 × 10^-5)) = 2π√0.625 ≈ 5.0 s.
✔ KEY FORMULA — τ = MB sinθ; U = −MB cosθ; W(θ1 to θ2) = MB(cosθ1 − cosθ2); T_oscillation = 2π√(I/(M B_H)).
⚠ EXAM TRAP — "Torque is zero at 180 degrees, so it is a stable equilibrium" is the classic false statement: zero torque, yes; stable, no — U is maximum there. And energy at 90 degrees is ZERO by convention, not MB.

Gauss's Law for Magnetism — the Law of No Monopoles
• DEFINITION — Gauss's law for magnetism: the net magnetic flux through ANY closed surface is zero: ∮B·dA = 0. Always, for every closed surface, in every situation.
• Set it beside its electric twin: ∮E·dA = q_enclosed/ε0. Electric flux counts the charge inside because isolated charges exist. Magnetic flux is always zero because isolated magnetic poles — monopoles — do not. Every N pole ever found arrives with its S partner attached.
• WHY it must be so — field lines are closed loops. A loop that pierces a closed surface must pierce it again on its way back, contributing equal inward and outward flux. Lines have no ends, so flux has no sources. The failed hunt for a lone pole in section 1 was this law announcing itself.
• EXAMPLE — Seal a bar magnet inside a cardboard box. Lines stream out of the box near N and back in near S; counted with signs, the total flux through the cardboard is exactly zero.
• What Gauss's law does NOT say: flux through an OPEN surface need not be zero, and B on the surface need not be zero. A hemisphere in a uniform field catches plenty of flux — worked example 3 cashes this in.
• YOUR TURN — Through one part of a closed surface, 0.04 Wb of flux enters. What is the flux through the rest of the surface? Answer: 0.04 Wb must LEAVE through the rest — the signed total is zero.
★ HIGHLIGHT — If a monopole is ever discovered, this law becomes ∮B·dA = μ0 × (magnetic charge inside) overnight. Decades of searches have found none; every IAT answer assumes the zero.
⚠ EXAM TRAP — Do not compute "flux due to the pole inside the surface". There is no magnetic Gauss-law charge term. If a closed surface is mentioned and a nonzero net flux is offered as an option, eliminate it on sight.

The Earth's Magnetism — a Planet-Sized Magnet
• The Earth itself is a dipole, with magnetic moment about 8 × 10^22 A m², as if a colossal bar magnet sat near its centre. Its magnetic SOUTH pole lies near the geographic NORTH — which is exactly why a compass needle's N is pulled that way. The dipole axis is tilted about 11.3 degrees from the rotation axis, and it drifts slowly with time.
• DEFINITION — Geographic meridian: the vertical plane through a place containing the Earth's rotation axis (true north–south). Magnetic meridian: the vertical plane containing the direction a free compass needle settles in (the direction of the Earth's field's horizontal trace).
• DEFINITION — Declination (D): the angle between the magnetic meridian and the geographic meridian at a place. It tells a navigator how far the compass lies from true north — small (often a degree or two, east or west) but never safe to ignore on a long journey.
• DEFINITION — Inclination or dip (δ): the angle the Earth's total field B_E makes with the horizontal, measured in the magnetic meridian. A dip needle — a magnet free to swing in the vertical plane — reads it directly.
• DEFINITION — Horizontal component B_H: the part of B_E lying in the horizontal plane of the magnetic meridian. It is the only component a common (horizontal) compass feels, and the component that drives the vibration magnetometer.
• The geometry is one right triangle: B_H = B_E cosδ, B_V = B_E sinδ, and tanδ = B_V/B_H, where B_V is the vertical component. Given any two of the four quantities, the triangle hands you the rest.
• At the magnetic equator, δ = 0: the field is purely horizontal, B_H = B_E and a dip needle lies flat. At the magnetic poles, δ = 90 degrees: B_H = 0, the field dives vertically, a dip needle stands on end, and a horizontal compass spins uselessly — explorers' complaints, explained by one cosine.
• Apparent dip: if the dip needle's vertical plane is rotated by θ away from the magnetic meridian, the needle shows an inflated value δ' with tanδ' = tanδ/cosθ. In the plane perpendicular to the meridian the needle points straight down (δ' = 90 degrees) whatever the true dip.
• WORKED PATTERN — Draw the right triangle before touching a formula: hypotenuse B_E, adjacent B_H, opposite B_V, angle δ at the ground. Then read off whichever ratio the question wants. Every Earth-magnetism arithmetic question in IAT is this triangle plus unit care (gauss to tesla: 1 G = 10^-4 T).
• YOUR TURN — True dip is 30 degrees. A dip circle is set in a vertical plane 60 degrees from the magnetic meridian. Apparent dip? Answer: tanδ' = tan30/cos60 = 0.577/0.5 = 1.155, so δ' ≈ 49 degrees — always larger than the true dip.
✔ KEY FORMULA — B_H = B_E cosδ; B_V = B_E sinδ; tanδ = B_V/B_H; apparent dip tanδ' = tanδ/cosθ.
⚠ EXAM TRAP — The Earth's field direction: at a place in the northern hemisphere B_E points northward and DOWNWARD (dip is measured below the horizontal). Also, compass "north" is magnetic north — declination is precisely the correction between the two norths.

Magnetisation and Magnetic Intensity — M, H and B
• Slide an iron rod into a current-carrying solenoid and the field explodes from milliteslas to over a tesla. The current did not change — the material joined in. This section builds the three quantities that keep the bookkeeping honest: what you supply (H), what the material adds (M), and the total that forces actually feel (B).
• DEFINITION — Magnetisation M: the net magnetic dipole moment per unit volume of a material, M = (net magnetic moment)/(volume). Unit: A/m — the same unit as H, which is no accident.
• DEFINITION — Magnetic intensity H: the magnetising field produced by FREE currents alone, ignoring the material's response. For a long solenoid, H = nI, and the field it would create in vacuum is B0 = μ0H. H depends only on your circuit, never on what you stuffed into the solenoid.
• The material's dipoles add their own field μ0M on top of yours, giving the total: B = μ0(H + M). This one line is the constitution of the whole topic — everything below is commentary.
• DEFINITION — Magnetic susceptibility χ: for most materials M is proportional to H, M = χH. χ is dimensionless and carries the material's signature: its SIGN splits diamagnets from paramagnets, its SIZE exposes ferromagnets.
• DEFINITION — Permeability: combining M = χH with B = μ0(H + M) gives B = μ0(1 + χ)H = μH, where μ is the permeability of the material and the relative permeability is μ_r = μ/μ0 = 1 + χ.
• WHY two fields at all — because they answer different questions. H is what your power supply controls: double the solenoid current and H doubles, whatever the core. B is what physics acts with: the Lorentz force is qv × B, induction uses B, torque uses B. Confusing them is the chapter's most expensive error.
• EXAMPLE — Run H = 2000 A/m through an empty solenoid: B0 = μ0H ≈ 2.5 × 10^-3 T. Add an iron core (χ ≈ 599) and the SAME H delivers B ≈ 1.5 T. Worked example 5 does this arithmetic in full.
• YOUR TURN — A material has χ = 0.001. Its μ_r? Answer: μ_r = 1 + χ = 1.001 — a weak paramagnet, barely distinguishable from vacuum by permeability, which is exactly the point.
✔ KEY FORMULA — B = μ0(H + M); M = χH; B = μ0μ_rH with μ_r = 1 + χ; solenoid H = nI.
⚠ EXAM TRAP — Two traps live here: using H in the Lorentz force (forces always take B), and writing μ_r = χ (the +1 is real: vacuum has χ = 0 but μ_r = 1). For dia/paramagnets χ is so small that μ_r ≈ 1 — for ferromagnets the +1 is a rounding error. It matters precisely in the middle questions examiners set.

Diamagnetic Materials — Pushed Away by Fields
• DEFINITION — Diamagnetic material: one whose atoms have no permanent magnetic moment, and which acquires a weak magnetisation OPPOSITE to the applied field. Susceptibility χ is small and NEGATIVE (between −1 and 0), and μ_r is slightly less than 1.
• WHY the opposition — a field disturbs the orbital motion of the electrons, and by Lenz's law at the atomic scale the induced change fights its own cause: the atom grows a small moment pointing against B. No alignment is involved, which is why temperature barely matters — there is nothing for thermal agitation to knock out of line.
• Behaviour to picture: a diamagnetic body is weakly REPELLED by a magnet and drifts from stronger field towards weaker field. Field lines bend slightly AWAY from a diamagnetic sample, as if politely avoiding it (the material is a slightly worse home for flux than vacuum).
• EXAMPLE — The classic bench demo: a diamagnetic liquid in a watch glass on two close magnet poles is depressed at the centre, where the field is strongest — the liquid flees the strong-field region. In a fierce field gradient diamagnetism can even levitate: a frog has famously floated in a 16 T magnet, unharmed and presumably surprised.
• Examples with numbers: bismuth, the strongest common diamagnet (χ = −1.66 × 10^-4), copper (−9.8 × 10^-6), water (−9.0 × 10^-6), gold, diamond, lead and hydrogen. If a question names bismuth, it is asking about diamagnetism.
★ HIGHLIGHT — A superconductor is the extreme limit: χ = −1 exactly, μ_r = 0, field lines expelled completely (the Meissner effect). Perfect diamagnetism, and the reason superconducting magnets can levitate a train.
✔ KEY FORMULA — Diamagnetic signature: −1 ≤ χ < 0, μ_r < 1, magnetisation against B, response almost independent of temperature.
⚠ EXAM TRAP — Diamagnetic does not mean "non-magnetic" or χ = 0. The response is weak but real, and its SIGN is the whole identification: negative χ in the options means diamagnetic, full stop.

Paramagnetic Materials — Weakly Pulled In
• DEFINITION — Paramagnetic material: one whose atoms DO carry permanent magnetic moments, randomly oriented by thermal agitation when no field acts. A field aligns a small fraction of them, producing a weak magnetisation ALONG B. χ is small and POSITIVE, μ_r slightly greater than 1.
• WHY the weakness — two armies fight: the field tries to line the atomic moments up; temperature shakes them random again. At room temperature the shake wins almost completely, so only a tiny surplus aligns — hence χ of order 10^-5, not 10^2.
• Behaviour to picture: weak ATTRACTION — a paramagnetic body drifts from weaker field towards stronger, and field lines crowd slightly INTO the sample. Liquid oxygen, deep blue and paramagnetic, clings between the poles of a strong magnet instead of falling — the party trick of this section.
• Examples with numbers: aluminium (χ = 2.2 × 10^-5), platinum (2.9 × 10^-4), sodium, calcium, magnesium and oxygen gas. Aluminium and platinum are the names examiners reach for.
• Curie's law: for a paramagnet, χ = C/T, with C a material constant and T the absolute temperature. Cool the sample and the field's army wins more recruits: halve T and χ doubles. Heat it and the response fades to nothing.
• YOUR TURN — A paramagnetic salt has χ = 3.0 × 10^-4 at 300 K. What is χ at 150 K? Answer: χ ∝ 1/T, so χ = 3.0 × 10^-4 × 300/150 = 6.0 × 10^-4.
✔ KEY FORMULA — Paramagnetic signature: 0 < χ << 1, μ_r slightly > 1, magnetisation along B, Curie's law χ = C/T.
⚠ EXAM TRAP — Positive χ is necessary but not sufficient for "paramagnetic" in an exam's intent: χ = 500 is positive too, but that size means ferromagnetic behaviour. Examiners test whether you check MAGNITUDE as well as sign.

Ferromagnetic Materials — the Strong Responders
• DEFINITION — Ferromagnetic material: one in which neighbouring atomic moments lock parallel in large groups, producing an enormous magnetisation along B. χ is huge and positive but NOT constant — it varies with H and with the sample's history — and μ_r can reach 10^3 to 10^5.
• The secret is the DOMAIN: a micrometre-scale region containing something like 10^11 atoms whose moments a quantum-mechanical coupling (exchange interaction) holds rigidly parallel. Each domain is a saturated micro-magnet; the material is a crowd of them.
• An unmagnetised sample has its domains pointing every which way, so net M is zero. Apply H and favourably oriented domains GROW by swallowing their neighbours, while stubborn domains ROTATE into line. At strong H every domain agrees — the sample saturates at a magnetisation no paramagnet could dream of.
• Remove the field and a ferromagnet does not fully let go: much of the alignment survives. That leftover magnetisation is why permanent magnets exist — and its detailed behaviour is hysteresis, the next-but-one section.
• Examples: iron, cobalt, nickel, gadolinium, and engineered alloys such as steel and alnico (aluminium–nickel–cobalt). "Ferromagnetic" names the behaviour, not just the metal — though iron (ferrum) lent it the name.
• Curie temperature: heat a ferromagnet and thermal agitation eventually breaks the domain lock-step. Above the Curie temperature T_C it becomes an ordinary paramagnet, obeying χ = C/(T − T_C) (the Curie–Weiss law). Benchmarks: iron 1043 K, cobalt 1404 K, nickel 627 K, gadolinium 317 K.
• EXAMPLE — Gadolinium's T_C of 317 K sits just above room temperature: warm it gently past 44 degrees C and its fierce attraction switches off into paramagnetic weakness — a party-piece demonstration that ferromagnetism is an alliance temperature can dissolve.
⚠ EXAM TRAP — Heating a ferromagnet does NOT strengthen it, and passing T_C does not destroy it forever: above T_C it is paramagnetic, and cooled again (in a field, if you want net magnetisation) the domains reform. Also, χ for a ferromagnet is not a fixed number — any question treating it as one is testing a paramagnet in disguise.
✔ KEY FORMULA — Ferromagnetic signature: χ >> 1 and variable, μ_r >> 1, domains, saturation, memory (hysteresis), Curie temperature above which it turns paramagnetic.

▸ The Dia Para Ferro Comparison Table
• Read this table row by row: each row is one property, in the order diamagnetic | paramagnetic | ferromagnetic.
• • Susceptibility χ: small and negative (−10^-4 to −10^-6 typical) | small and positive (10^-5 to 10^-3) | very large and positive, up to 10^5, and not constant
• • Relative permeability μ_r: slightly less than 1 | slightly greater than 1 | enormously greater than 1 (10^2 to 10^5)
• • In a field gradient: repelled, moves from strong field to weak | attracted weakly, moves from weak field to strong | attracted powerfully towards the strongest field
• • Field lines through the sample: slightly expelled, lines thin out | slightly concentrated, lines crowd in | massively channelled through the material
• • Atomic origin: induced moments oppose B; atoms have no permanent moment | permanent atomic moments, a small fraction aligned by B | domains — vast groups of moments pre-aligned, grown and rotated by B
• • Effect of temperature: almost none | χ falls as 1/T (Curie's law) | ferromagnetism dies at the Curie temperature; paramagnetic above it
• • When the field is switched off: magnetisation vanishes | magnetisation vanishes | magnetisation (largely) REMAINS — retentivity
• • Star examples: bismuth, copper, water | aluminium, platinum, oxygen | iron, cobalt, nickel, alnico
✔ KEY FORMULA — One-line sort: χ negative → dia; χ small positive → para; χ huge or history-dependent → ferro. Sign first, size second, memory third.

Hysteresis — When a Material Remembers
• Now cycle the magnetising field H of a ferromagnetic sample slowly up and down and plot B. B does not retrace its steps: it LAGS behind H, tracing a closed loop — the hysteresis loop (hysteresis is Greek for "lagging behind"). The material's present state depends on its past: it remembers.
• Walk the loop once: from unmagnetised at the origin, B climbs a virgin curve and flattens at SATURATION, where every domain is aligned and more H buys nothing. Reduce H to zero and B stops at the RETENTIVITY B_r, the magnetism kept for free. Reverse H and B surrenders at the COERCIVITY H_c, the reverse field that demagnetises the sample. Push to negative saturation, return, and the loop closes.
• DEFINITION — Retentivity (remanence) B_r: the value of B remaining when H is reduced to zero after saturation — read off the B-axis intercept, a tesla-scale number. Coercivity H_c: the reverse H needed to bring B back to zero — read off the H-axis intercept, an A/m number. The two intercepts live on different axes; that is the whole distinction.
• The loop's AREA is not decoration: it equals the energy dissipated as heat in each unit volume of material during one full cycle of magnetisation. Hysteresis loss per second = (loop area) × (volume) × (cycles per second). Transformer designers pay this bill every second of every day.
• WHY the loss — flipping domains is not free: domain walls snap through the lattice and sudden reorientations dump energy as heat. A fat loop means a stubborn material and a big heating bill; a thin loop means an obliging one.
• Soft magnets (soft iron): narrow loop, tiny coercivity, huge permeability, magnetise and demagnetise at a whisper of H, small loss per cycle. Hard magnets (steel, alnico): wide loop, large coercivity, once magnetised they shrug off demagnetising fields — that stubbornness is the product.
• YOUR TURN — A transformer core of volume 4 × 10^-4 m³ has a hysteresis loop of area 250 J/m³ and runs at 50 Hz. Heat generated per second? Answer: 250 × 4 × 10^-4 = 0.1 J per cycle; × 50 cycles = 5 W of heat to get rid of.
✔ KEY FORMULA — Loop area (in B–H units) = energy lost per unit volume per cycle; retentivity = B at H = 0; coercivity = H at B = 0.
⚠ EXAM TRAP — The axis swap: retentivity is read on the B axis (it is a value of B, in tesla), coercivity on the H axis (a value of H, in A/m). Options that quote coercivity in tesla are wrong before you even check the number.

▸ Electromagnets versus Permanent Magnets
• Same physics, opposite wishes. An electromagnet wants a material that obeys the current instantly and forgets completely; a permanent magnet wants a material that learned once and never forgets. Hysteresis vocabulary makes the shopping list precise.
• Electromagnet: a coil on a SOFT iron core. High μ_r multiplies the field (worked example 5: a factor of 600), while the narrow loop and tiny coercivity make magnetisation track the current — switch off and (nearly) all magnetism vanishes; reverse the current and the poles swap. Scrapyard cranes lift a car and drop it on command; MRI scanners and relays live on the same obedience.
• Permanent magnet: a HARD material — steel, alnico, ferrites, neodymium alloys. What matters is high retentivity (a strong leftover B_r) married to high coercivity (knocks and stray fields cannot erase it). A wide hysteresis loop is not a flaw here; it is the specification.
• Transformer and motor cores want the same soft iron, but chosen for the THINNEST loop (least hysteresis loss per cycle) and laminated into sheets to strangle eddy currents — a different loss, the same energy bill.
• The selection rule to carry into any question: need memory → wide loop, hard material; need obedience → narrow loop, soft material; need efficiency under AC → softest, thinnest loop you can buy, laminated.
✔ KEY FORMULA — Electromagnet = soft core, field controlled by current; permanent magnet = hard material, high B_r and high H_c; AC cores = soft and laminated.
⚠ EXAM TRAP — "Soft iron has low retentivity" is false — soft iron actually retains strongly; what makes it soft is its tiny COERCIVITY: it lets go the moment a small reverse field (or no field) asks. The soft/hard axis is coercivity, not retentivity.

Formula Sheet — One-Glance Recap
• ✔ Dipole moment: M = m × 2l; solenoid M = NIA (N total turns)
• ✔ Axial field: B = (μ0/4π)(2M/r³), along M; equatorial field: B = (μ0/4π)(M/r³), against M; axial : equatorial = 2 : 1
• ✔ Torque: τ = MB sinθ = M × B; potential energy U = −MB cosθ = −M·B; work W = MB(cosθ1 − cosθ2); full flip W = 2MB
• ✔ Oscillation in Earth's field: T = 2π√(I/(M B_H))
• ✔ Gauss's law for magnetism: ∮B·dA = 0 (no monopoles; field lines are closed loops)
• ✔ Earth's elements: B_H = B_E cosδ; B_V = B_E sinδ; tanδ = B_V/B_H; apparent dip tanδ' = tanδ/cosθ
• ✔ In matter: B = μ0(H + M); M = χH; B = μ0μ_rH; μ_r = 1 + χ; solenoid H = nI
• ✔ Dia: −1 ≤ χ < 0, μ_r < 1, repelled | Para: 0 < χ << 1, μ_r slightly > 1, χ = C/T | Ferro: χ, μ_r >> 1, domains, Curie temperature
• ✔ Hysteresis: loop area = energy lost per unit volume per cycle; loss power = area × volume × frequency; retentivity B_r (at H = 0); coercivity H_c (at B = 0)

Common Mistakes and Exam Traps
• ⚠ Mistake 1: Using 2M/r³ for an equatorial point. Why wrong: the factor 2 belongs to the axis alone; the equatorial field is (μ0/4π)(M/r³) and points against M. Correct principle: geometry first — axis gets the 2 and the parallel direction, equator gets neither.
• ⚠ Mistake 2: Measuring r from the pole tip. Why wrong: the dipole formulas are built on the centre distance in the short-magnet limit. Correct principle: r is always from the magnet's centre.
• ⚠ Mistake 3: Calling θ = 180 degrees a stable equilibrium because the torque vanishes there. Why wrong: U = −MB cosθ is MAXIMUM at 180 degrees; zero torque with maximum energy is unstable equilibrium. Correct principle: stability is decided by U, not by τ alone.
• ⚠ Mistake 4: Putting H into the Lorentz force or torque. Why wrong: H counts only free currents; the actual field acting on charges and dipoles is B, which inside matter includes the material's own μ0M. Correct principle: forces, torques and induction always take B.
• ⚠ Mistake 5: Writing μ_r = χ. Why wrong: B = μ0(H + M) = μ0(1 + χ)H, so μ_r = 1 + χ; vacuum itself has χ = 0, μ_r = 1. Correct principle: the +1 is the vacuum's own share — never drop it for dia/paramagnets, where χ ~ 10^-5.
• ⚠ Mistake 6: Saying a diamagnetic material is "non-magnetic". Why wrong: it responds with a real, weak magnetisation against the field; χ is small and negative, not zero. Correct principle: negative χ, however tiny, is a diamagnetic fingerprint.
• ⚠ Mistake 7: Swapping retentivity and coercivity. Why wrong: retentivity B_r is a value of B (tesla) read at H = 0; coercivity H_c is a value of H (A/m) read at B = 0. Correct principle: name the axis before you name the quantity.
• ⚠ Mistake 8: Claiming that heating a ferromagnet past its Curie temperature destroys it permanently. Why wrong: above T_C it simply behaves paramagnetically; cooled below T_C the domains reform (a field applied while cooling restores net magnetisation). Correct principle: T_C switches the behaviour, not the material's existence.
• ★ Named trap — The helpful pole: options that compute net flux through a closed surface from "the pole enclosed" import the electric Gauss law wholesale. Magnetic flux through any closed surface is zero, poles or no poles.

Worked Examples — Exam Patterns
• EXAMPLE 1 — Problem: A short bar magnet has M = 4 A m². Find the field at 0.20 m from its centre (a) on the axis, (b) on the equatorial line.
• • Given: M = 4 A m², r = 0.20 m, μ0/4π = 10^-7 T m/A.
• • Principle: B_axial = (μ0/4π)(2M/r³) along M; B_equatorial = (μ0/4π)(M/r³) against M.
• • Steps: r³ = 0.008 m³. (a) B_axial = 10^-7 × 2 × 4/0.008 = 10^-7 × 1000 = 1.0 × 10^-4 T. (b) B_equatorial = exactly half = 5.0 × 10^-5 T.
• • Answer: (a) 1.0 × 10^-4 T along M; (b) 5.0 × 10^-5 T opposite to M.
• • Reasoning: One division gives both answers — the equatorial value is the axial value halved, the dipole's 2 : 1 signature.
• • Mistake to avoid: Measuring 0.20 m from the pole instead of the centre, or handing the equatorial point the factor 2 — both are planted options in real papers.
• EXAMPLE 2 — Problem: A magnetic dipole of M = 2 A m² sits in a uniform field B = 0.40 T at 60 degrees to the field. Find (a) the torque on it, (b) its potential energy, (c) the work needed to rotate it from alignment (0 degrees) to anti-alignment (180 degrees).
• • Given: M = 2 A m², B = 0.40 T, so MB = 0.80 J; θ = 60 degrees.
• • Principle: τ = MB sinθ; U = −MB cosθ; W = MB(cosθ1 − cosθ2).
• • Steps: (a) τ = 0.80 × sin60 = 0.80 × 0.866 = 0.69 N·m. (b) U = −0.80 × cos60 = −0.80 × 0.5 = −0.40 J. (c) W = 0.80 × (cos0 − cos180) = 0.80 × (1 − (−1)) = 1.6 J.
• • Answer: τ = 0.69 N·m (towards alignment); U = −0.40 J; W = 1.6 J.
• • Reasoning: Notice the division of labour: sinθ drives the torque, cosθ keeps the energy accounts. At 60 degrees both are mid-range, which is why examiners choose it.
• • Mistake to avoid: Computing the work from 0 to 180 as MB — the full flip crosses from −MB to +MB, a climb of 2MB. Half-flips and full flips are different bills.
• EXAMPLE 3 — Problem: A uniform field B = 0.20 T passes through a hemispherical surface of radius 0.10 m, with the field directed along the hemisphere's axis (perpendicular to its flat face). Find the flux through the curved surface.
• • Given: B = 0.20 T, R = 0.10 m; the hemisphere plus its flat disk form a closed surface.
• • Principle: Gauss's law for magnetism — net flux through the closed surface is zero, so flux in through the disk equals flux out through the dome.
• • Steps: Flux through the flat disk = B × πR² (field perpendicular to the disk) = 0.20 × π × 0.010 = 6.28 × 10^-3 Wb entering. Therefore flux through the curved dome = 6.28 × 10^-3 Wb leaving.
• • Answer: 6.3 × 10^-3 Wb through the curved surface.
• • Reasoning: Integrating B·dA over the dome element by element is the long way home; Gauss's law walks through the front door. Whenever a closed surface can be completed with an easy face, complete it.
• • Mistake to avoid: Answering zero because "Gauss's law says flux is zero" — zero is the NET over the whole closed surface; each open piece can carry as much as geometry allows.
• EXAMPLE 4 — Problem: At a place, the horizontal component of the Earth's field is B_H = 3.6 × 10^-5 T and the angle of dip is 60 degrees. Find the vertical component and the total field.
• • Given: B_H = 3.6 × 10^-5 T, δ = 60 degrees.
• • Principle: tanδ = B_V/B_H; B_E = B_H/cosδ.
• • Steps: B_V = B_H tan60 = 3.6 × 10^-5 × 1.732 = 6.24 × 10^-5 T. B_E = 3.6 × 10^-5/cos60 = 3.6 × 10^-5/0.5 = 7.2 × 10^-5 T.
• • Answer: B_V = 6.2 × 10^-5 T; B_E = 7.2 × 10^-5 T.
• • Reasoning: At δ = 60 degrees the vertical component already exceeds the horizontal — the field is more "diving" than "pointing". At the magnetic equator the same triangle collapses to B_V = 0.
• • Mistake to avoid: Using sinδ where cosδ belongs — anchor yourself with the triangle: B_H sits ADJACENT to δ, so it takes the cosine.
• EXAMPLE 5 — Problem: A solenoid has 1000 turns per metre and carries 2 A. It is filled with an iron core of susceptibility χ = 599. Find H, the magnetisation M, and the total field B inside. Compare with the empty solenoid.
• • Given: n = 1000 m^-1, I = 2 A, χ = 599, μ0 = 4π × 10^-7.
• • Principle: H = nI (free currents only); M = χH; B = μ0(H + M) = μ0(1 + χ)H.
• • Steps: H = 1000 × 2 = 2000 A/m. M = 599 × 2000 = 1.198 × 10^6 A/m. B = 4π × 10^-7 × (2000 + 1.198 × 10^6) = 4π × 10^-7 × 1.2 × 10^6 = 1.51 T. Empty: B0 = μ0H = 2.5 × 10^-3 T.
• • Answer: H = 2000 A/m; M ≈ 1.2 × 10^6 A/m; B ≈ 1.5 T — the core multiplies the field by μ_r = 600.
• • Reasoning: Stare at the addition H + M: the material's 1.198 × 10^6 dwarfs your 2000. In a ferromagnet, the core does essentially all the magnetising — H is just the instruction, M is the workforce.
• • Mistake to avoid: Reporting B = μ0H = 2.5 mT as the final answer — that is the field your current would make in vacuum, ignoring the iron you were given.
• EXAMPLE 6 — Problem: A paramagnetic material has susceptibility 1.2 × 10^-5 at 300 K. (a) Find its susceptibility at 600 K. (b) At what temperature does the susceptibility fall to 4.0 × 10^-6?
• • Given: χ1 = 1.2 × 10^-5 at T1 = 300 K; Curie's law χ = C/T.
• • Principle: χ scales as 1/T, so χ1/χ2 = T2/T1.
• • Steps: (a) χ2 = 1.2 × 10^-5 × 300/600 = 6.0 × 10^-6. (b) T = 300 × (1.2 × 10^-5)/(4.0 × 10^-6) = 300 × 3 = 900 K.
• • Answer: (a) 6.0 × 10^-6 at 600 K; (b) 900 K.
• • Reasoning: Doubling the absolute temperature halves the alignment surplus — thermal chaos taxes paramagnetism at a simple inverse rate.
• • Mistake to avoid: Using Celsius in Curie's law. The law lives in kelvin: 600 K, not "600 degrees C", and a change from 27 degrees C to 327 degrees C is 300 K to 600 K, a doubling — not the twelvefold jump the Celsius numbers suggest.
• EXAMPLE 7 — Problem: The hysteresis loop of a transformer steel has area 600 J/m³. The core volume is 1.0 × 10^-3 m³ and the supply frequency is 50 Hz. Find the energy lost per cycle, the power wasted as heat, and the energy wasted in one hour.
• • Given: loop area = 600 J/m³ per cycle; V = 1.0 × 10^-3 m³; f = 50 Hz.
• • Principle: Energy per cycle = (loop area) × volume; power = energy per cycle × frequency.
• • Steps: Per cycle: 600 × 1.0 × 10^-3 = 0.60 J. Power: 0.60 × 50 = 30 W. Per hour: 30 × 3600 = 1.08 × 10^5 J.
• • Answer: 0.60 J per cycle; 30 W of continuous heating; about 1.1 × 10^5 J per hour.
• • Reasoning: This is why transformer cores are built from the thinnest-loop soft steel available — the hysteresis tax is collected 50 times a second, forever. Halve the loop area and you halve the tax; nothing else in the design forgives like that.
• • Mistake to avoid: Forgetting the frequency — loop area alone gives energy per cycle, not power. And keep the units straight: the area's J/m³ already hides a tesla × A/m product.

Practice Questions — Self-Test Set
• Q1 (single correct) — At a point on the axis of a short magnet the field is 8 × 10^-5 T. At the same distance on the equatorial line, the field is: (A) 1.6 × 10^-4 T (B) 8 × 10^-5 T (C) 4 × 10^-5 T (D) 2 × 10^-5 T
• Q2 (single correct) — A dipole of M = 3 A m² is placed in a field of 0.5 T. The maximum torque it can experience is: (A) zero (B) 0.75 N·m (C) 1.5 N·m (D) 3.0 N·m
• Q3 (single correct) — At a place on Earth, the vertical and horizontal components of the field are equal. The angle of dip there is: (A) 0 degrees (B) 30 degrees (C) 45 degrees (D) 90 degrees
• Q4 (numerical) — A solenoid's field H inside is 1000 A/m and its core has χ = 999. The total field B in the core is about: (A) 1.26 × 10^-3 T (B) 1.26 T (C) 12.6 T (D) 0.126 T
• Q5 (single correct) — A bar magnet oscillates in the Earth's horizontal field with period T. If it is taken to a place where B_H is twice as large, its period becomes: (A) 2T (B) T/2 (C) T/√2 (D) unchanged
• Q6 (multiple correct) — About the hysteresis loop of a ferromagnetic material, which statements are true? (A) Its area equals the energy lost per unit volume per cycle (B) Retentivity is the value of B when H = 0 (C) Soft iron has a very large coercivity (D) Transformer cores are chosen to have narrow loops
• Q7 (single correct) — Which of the following is a diamagnetic material? (A) Aluminium (B) Platinum (C) Bismuth (D) Cobalt
• Q8 (assertion–reason) — Assertion: Cutting a bar magnet into two pieces can never produce an isolated north pole. Reason: Magnetic field lines form closed loops and the net magnetic flux through any closed surface is zero, so poles always exist in pairs. (A) Both true, reason explains assertion (B) Both true, reason does not explain (C) Assertion true, reason false (D) Assertion false

▸ Answer Key with Explanations
• Q1 — C. Equatorial = axial/2 = 4 × 10^-5 T at the same r. Misconception behind A: doubling instead of halving — the 2 belongs to the axial side of the ratio.
• Q2 — C. τ_max = MB sin90 = 3 × 0.5 = 1.5 N·m. Misconception behind A: confusing maximum torque with the zero torque at alignment; torque peaks when the dipole is perpendicular to the field.
• Q3 — C. tanδ = B_V/B_H = 1 gives δ = 45 degrees. Misconception behind D: 90 degrees is the dip only at the magnetic poles, where B_H = 0 and the components are anything but equal.
• Q4 — B. B = μ0(1 + χ)H = 4π × 10^-7 × 1000 × 1000 = 1.26 T. Misconception behind A: 1.26 × 10^-3 T is μ0H — the vacuum field, computed by forgetting the core entirely.
• Q5 — C. T = 2π√(I/(M B_H)), so T ∝ 1/√B_H; doubling B_H divides T by √2. Misconception behind B: treating the dependence as inverse-linear — the square root is the pendulum's signature (compare Chapter 13).
• Q6 — A, B and D. The area is the per-cycle energy loss per unit volume; retentivity is B at H = 0; narrow loops minimise the loss, which is what transformer cores need. C is the planted falsehood — soft iron's coercivity is famously SMALL; that is what "soft" means.
• Q7 — C. Bismuth is the textbook diamagnet (χ = −1.66 × 10^-4). Aluminium and platinum are paramagnetic, cobalt ferromagnetic — the option list is one of each family plus the answer.
• Q8 — A. Both statements are true, and the reason is precisely why the assertion holds: with no monopoles and closed field lines, every fragment must carry flux out and back — a north and a south. Gauss's law for magnetism is the assertion wearing formal clothes.

Chapter Summary and Revision Checklist
• Summary — one paragraph: A bar magnet is a dipole M whose field falls as 1/r³ — (μ0/4π)(2M/r³) along M on the axis, (μ0/4π)(M/r³) against M on the equator — indistinguishable from a solenoid of M = NIA. A field twists a dipole with τ = MB sinθ towards U = −MB cosθ, charging 2MB for a full flip. Gauss's law ∮B·dA = 0 certifies that monopoles do not exist and field lines never end. Earth's dipole is read through declination, dip and B_H = B_E cosδ. Matter answers H with its own M, giving B = μ0(H + M) and μ_r = 1 + χ: diamagnets (χ small, negative) retreat, paramagnets (χ small, positive, χ = C/T) lean in weakly, and ferromagnets answer with domains — saturation, a Curie temperature, and a hysteresis loop whose area is an energy tax and whose shape chooses electromagnet core or permanent magnet.
• Essential definitions to be able to recite: magnetic dipole moment; pole strength; Gauss's law for magnetism; declination; inclination (dip); horizontal component; magnetisation; magnetic intensity H; susceptibility; relative permeability; domain; Curie temperature; retentivity; coercivity.
• Must-remember pairs that examiners confuse: axial vs equatorial (factor 2, direction flips); stable vs unstable equilibrium (both have zero torque; U separates them); B vs H (total vs free-current part — forces take B); retentivity vs coercivity (B-intercept vs H-intercept); soft vs hard magnets (coercivity small vs large, not retentivity); χ vs μ_r (they differ by exactly 1).
• Revision checklist — tick each only when you can do it without notes:
• • Sketch a bar magnet's field lines and state all four of their properties, including what happens inside the magnet
• • Compute axial and equatorial fields from M and r, with directions, and convert any solenoid (N, I, A) into its equivalent M
• • Given M, B and θ, produce torque, potential energy and the work for any rotation, and identify both equilibria
• • State Gauss's law for magnetism and explain, in two sentences, why it forbids isolated poles
• • Given any two of B_E, B_H, B_V and δ, extract the rest, and correct a dip reading taken off-meridian
• • From χ, classify a material, estimate μ_r, and predict which way it moves in a field gradient
• • Sketch a labelled hysteresis loop, read off B_r and H_c on the correct axes, and compute a hysteresis power loss
• • Choose core materials for an electromagnet, a permanent magnet and a transformer, justifying each from the loop shape
• Self-assessment — answer aloud, then check against the chapter: (1) A compass needle at the magnetic equator and one at the magnetic pole — which one still works as a compass? (The equatorial one: B_H is maximal there, while at the pole B_H = 0 and the horizontal needle gets no guidance.) (2) Your solenoid calculation gives B = 2.5 mT for an iron-cored solenoid. What did you most likely do? (Computed μ0H and forgot the core's M — with χ ≈ 599 the answer should be ~600 times bigger.) (3) A material's loop is fat and its coercivity huge, yet the question asks for a transformer core. Verdict? (Reject it: fat loop = large hysteresis loss per cycle; transformers demand the thinnest loop, i.e. soft iron.)
★ HIGHLIGHT — If you remember only five results, take these: B_axial = (μ0/4π)(2M/r³) and B_equatorial = half of it, opposite in direction; τ = MB sinθ with U = −MB cosθ (flip costs 2MB); ∮B·dA = 0 (no monopoles, ever); B_H = B_E cosδ with tanδ = B_V/B_H; B = μ0(H + M) with μ_r = 1 + χ — and the loop area is heat. The rest of the chapter is these five ideas in costume.
<!-- END phys_ch_19 detailedStudyNotes -->
