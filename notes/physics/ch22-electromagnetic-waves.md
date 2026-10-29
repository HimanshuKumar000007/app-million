<!-- BEGIN phys_ch_22 detailedStudyNotes -->
Introduction — A Wave That Travels Through Nothing
• Sunlight left the Sun about eight minutes ago and crossed 1.5 × 10¹¹ metres of absolutely empty space to reach you. No air, no water, no string — nothing at all to do the wiggling. Sound could never make that trip, yet light makes it effortlessly. This chapter explains how.
• In 1865 James Clerk Maxwell took the four known laws of electricity and magnetism, repaired one small crack in them, and found a wave hiding in the mathematics — with a predicted speed of 3 × 10⁸ m/s, the measured speed of light. His outrageous conclusion: light itself is an electromagnetic wave. In 1887 Hertz generated the invisible members of the family on a bench, and radio was born.
• Here is the promise of this short, high-yield chapter: you will explain exactly what Maxwell fixed and why, state all four of his equations in plain words, describe an EM wave's anatomy, compute with E₀ = cB₀, intensity and radiation pressure, and place any wave — radio to gamma — on the spectrum with its production, detection and uses.
• Roadmap: first the repair job (displacement current), then the four equations in words, then the birth and anatomy of the wave, its speed, energy and push — and finally the family portrait, the spectrum.
★ HIGHLIGHT — The whole chapter in one breath: a changing electric field creates a magnetic field, a changing magnetic field creates an electric field, and that mutual creation detaches from its source and races through empty space at c — carrying energy and momentum, in seven named bands from radio to gamma.

Displacement Current — Maxwell Fixes Ampere's Law
• Start with what you trust. Ampere's law says a current creates a magnetic field around it: ∮B·dl = μ₀I, where I is the conduction current passing through the loop.
• DEFINITION — Conduction current: the flow of electric charges through a material — electrons in a wire, ions in a solution. This is the only kind of current Ampere's law originally knew about.
• Now the crack. Charge a capacitor and draw an Amperian loop around the connecting wire. Rest a flat surface on the loop so it cuts the wire: current I passes through, all is well. Now choose a balloon-shaped surface on the same loop that bulges in between the capacitor plates instead: no charge crosses it, so I = 0 — yet B around the loop is one definite physical thing. One loop, two different answers. Ampere's law, as it stands, contradicts itself.
• EXAMPLE — It is like two accountants counting the same company's cash through two different doors and getting different totals. An entry is missing from the ledger. Maxwell found it: while the capacitor charges, the electric field between the plates grows steadily, so the electric flux Φ_E through the balloon surface grows with it.
• DEFINITION — Displacement current: I_d = ε₀ dΦ_E/dt, where Φ_E is the electric flux through the surface. Despite the name, no charge flows anywhere — it is a changing electric field, measured in amperes, and it produces a magnetic field in exactly the same way a conduction current does.
• WHY the fix is exactly right, not a patch: Gauss's law gives the flux between the plates as Φ_E = Q/ε₀, where Q is the charge on the plate. So I_d = ε₀ d(Q/ε₀)/dt = dQ/dt — precisely the conduction current in the wire. Both accountants now agree through every door.
★ HIGHLIGHT — The deep point: the SUM of conduction and displacement current is continuous everywhere. Current never starts or stops — where charge carriers halt at a capacitor plate, the displacement current carries the story across the gap.
• WORKED PATTERN — Any "find I_d" problem is three moves: (1) flux Φ_E = EA (plate area, not gap distance); (2) differentiate, I_d = ε₀A dE/dt; (3) sanity check — during charging it should equal the current in the leads.
• YOUR TURN — A capacitor's plates have area 0.02 m² and the field between them grows at 6 × 10¹¹ V/m every second. Find I_d. (Answer: I_d = 8.85 × 10⁻¹² × 0.02 × 6 × 10¹¹ ≈ 0.11 A.)
⚠ EXAM TRAP — Displacement current exists only while E is CHANGING. A fully charged capacitor sitting on your desk has a strong E between its plates and exactly zero displacement current. And nothing material "flows" across the gap — ever.
✔ KEY FORMULA — I_d = ε₀ dΦ_E/dt = ε₀A dE/dt (for uniform E between plates)

▸ The Ampere–Maxwell Law — Two Currents, One Story
• Here is the repaired law, the one to quote: ∮B·dl = μ₀(I_c + I_d) = μ₀I_c + μ₀ε₀ dΦ_E/dt. Magnetic fields are made by moving charges AND by changing electric fields.
• Savour the symmetry Maxwell exposed. Faraday's law: a changing B creates E. The new term: a changing E creates B. Two fields, each able to give birth to the other — in §4 you will see this partnership escape and become a wave.
• Side by side: conduction current needs charges and a material path, produces heating in resistors, and is what ammeters measure. Displacement current needs only a changing field, exists in insulators and even in vacuum, produces no heating — and no ammeter reads it directly; you detect it by the magnetic field it creates.
• EXAMPLE — In a household copper wire at 50 Hz, the displacement current is smaller than the conduction current by a factor of roughly 10¹⁶ — utterly negligible. Inside a charging capacitor's gap, displacement current carries 100% of the action. At the frequency of light, "current" in empty space is purely displacement current.
• Inside the gap, B behaves as if I_d were an ordinary current spread over the plates: at distance r from the axis (plate radius R), B = μ₀I_d r/(2πR²) for r < R.
• EXAMPLE — A capacitor with plates of radius 12 cm charges with I = 0.15 A. Between the plates at r = 6 cm, B = (4π × 10⁻⁷ × 0.15 × 0.06)/(2π × 0.0144) = 1.25 × 10⁻⁷ T — small, but real, and measured.
• YOUR TURN — Same capacitor: what is B right at the plate edge, r = 12 cm? (Answer: 2.5 × 10⁻⁷ T — and notice it equals μ₀I/(2πR), the ordinary wire formula. At the edge the two descriptions shake hands, as continuity demands.)
⚠ EXAM TRAP — In any Ampere-law problem with a capacitor, use the TOTAL current I_c + I_d through your surface. Forgetting the displacement term in the gap is the single most common error in this chapter.

Maxwell's Equations — Four Laws in Plain Words
• You already own all four laws — they were met one at a time in earlier chapters. This section simply lines them up, because together they are the complete theory of electromagnetism and the birth certificate of the EM wave.
• EQUATION 1 — Gauss's law for electricity: ∮E·dA = Q_enc/ε₀. IN WORDS — Electric charges are the sources of the electric field: field lines begin on positive charges and end on negative ones, and the total flux out of a closed surface counts the charge inside.
• EQUATION 2 — Gauss's law for magnetism: ∮B·dA = 0. IN WORDS — There are no magnetic monopoles. Magnetic field lines never begin or end anywhere; they form closed loops. Slice a magnet in half and you get two smaller dipoles, never an isolated pole — this equation is the reason.
• EQUATION 3 — Faraday's law: ∮E·dl = −dΦ_B/dt. IN WORDS — A changing magnetic flux creates an electric field, one whose field lines form closed loops (unlike the charge-born field of Equation 1). Every generator, transformer and induction stove runs on this line.
• EQUATION 4 — The Ampere–Maxwell law: ∮B·dl = μ₀(I_c + ε₀ dΦ_E/dt). IN WORDS — Magnetic fields are created by electric currents and by changing electric fields. The second source is Maxwell's own addition — without it there are no waves and no light in the theory.
• Read the four as a story: charges make E (Eq. 1); lone poles do not exist (Eq. 2); change a B, get an E (Eq. 3); change an E, get a B (Eq. 4). In empty space Equations 3 and 4 keep each other alive forever — E creates B creates E, marching outward at c.
• EXAMPLE — Why can't a compass needle be a monopole detector success story? Because Equation 2 forces the flux through any closed surface around any magnet to be zero: as much B leaves as enters, always.
• YOUR TURN — A scientist claims to have isolated a single north pole in a bottle. Which one of the four equations does the claim violate, and what would its flux statement have to become? (Answer: Equation 2 — ∮B·dA would have to equal a nonzero "magnetic charge" term instead of zero.)
★ HIGHLIGHT — For the exam, you need each equation's meaning in words, not derivation: charges source E; monopoles do not exist; changing B makes E; currents and changing E make B.

Birth of an EM Wave — Accelerate a Charge
• Lay out the family rules first. A charge at rest makes only an electric field. A charge drifting at constant velocity (a steady current) adds a steady magnetic field. Neither arrangement radiates anything — the fields stay attached to the charge like a shadow.
• DEFINITION — Electromagnetic wave: a self-propagating disturbance of electric and magnetic fields that travels through space, transporting energy and momentum, and needs no material medium.
• The trigger is acceleration. Shake a charge — oscillate it up and down, swing it in a circle, slam it to a stop — and the field near it kinks. The kink cannot stay home: the changing E at one point creates B beside it (Equation 4), that changing B creates fresh E further out (Equation 3), and the disturbance hands itself forward, point to point, at speed c. Once launched it no longer needs the source — which is why we see light from stars that died long ago.
• EXAMPLE — In a radio transmitter, electrons are driven up and down an aerial millions of times per second; each oscillation launches a fresh shell of field. In an X-ray tube, electrons are accelerated then stopped abruptly in a metal target — the deceleration radiates X-rays. Same rule, wildly different frequencies.
• Hertz proved it with a spark gap: sparks in his transmitter induced sympathetic sparks in a wire loop metres away — invisible waves, detected. Measuring their λ and ν, he recovered c, confirming Maxwell completely.
• YOUR TURN — A battery drives a steady current through a long straight wire for an hour. Does the wire broadcast an EM wave? (Answer: No. Steady current means steady fields — nothing changes, so nothing detaches. Only the brief moments of switching on and off radiate, as tiny pulses.)
⚠ EXAM TRAP — Uniformly moving charges and steady currents do NOT radiate. If a question's source is not accelerating, there is no EM wave, however large the charge or current.

Anatomy of an EM Wave — E and B, Hand in Hand
• Freeze one wave and look at it (Figure 5 in this chapter shows the classic picture). Let it travel along the x-axis. The electric field oscillates along y, the magnetic field along z: E_y = E₀ sin(kx − ωt) and B_z = B₀ sin(kx − ωt).
• DEFINITION — Transverse wave: the oscillations are perpendicular to the direction of travel. In an EM wave, E, B and the propagation direction form a mutually perpendicular, right-handed trio — the vector E × B always points along the direction of travel.
• Notice the shared sine. E and B are IN PHASE: they crest together, cross zero together, and trough together, at every point and every instant. Many students picture B lagging a quarter-cycle behind E — that is wrong for a travelling EM wave in free space.
• Their sizes are locked in proportion: E/B = c at every point and instant, so for the amplitudes, E₀ = cB₀. Since c is enormous, the magnetic part is numerically tiny: a wave with E₀ = 120 V/m carries B₀ = 120/(3 × 10⁸) = 4 × 10⁻⁷ T — about a hundred times weaker than Earth's magnetic field.
• Two tests separate EM waves from particle beams: the wave carries no charge, and it passes undeflected through electric and magnetic fields (an electron beam bends). What oscillates is the field itself, not any stuff.
• YOUR TURN — A wave travels in the +z direction and at some instant its E field points along +x. Along which direction does B point at that instant? (Answer: +y, because E × B must point along travel: x̂ × ŷ = ẑ.)
✔ KEY FORMULA — E₀ = cB₀, and E/B = c at every point of the wave

The Speed of Light — Built into Empty Space
• With charges and currents set to zero, Maxwell's equations admit wave solutions whose speed is fixed purely by two constants of the vacuum: c = 1/√(μ₀ε₀). No property of the source appears. A radio wave and a gamma ray share that speed — it belongs to space itself.
• WORKED PATTERN — Watch the number fall out (do this arithmetic once, by hand, and you will never forget the result): μ₀ε₀ = (4π × 10⁻⁷)(8.85 × 10⁻¹²) ≈ 1.11 × 10⁻¹⁷; its square root is ≈ 3.34 × 10⁻⁹; the reciprocal is ≈ 3 × 10⁸ m/s. Two laboratory constants, measured with coils and capacitors on a bench, predict the speed of light. Maxwell's famous conclusion: light is an electromagnetic disturbance.
• In a material medium the fields drag against matter and the wave slows: v = 1/√(με) = c/√(ε_rμ_r) = c/n, where n is the refractive index. For most transparent materials μ_r ≈ 1, so n ≈ √ε_r.
• What changes at a boundary, and what refuses to: the FREQUENCY is the source's property and stays identical in every medium; the speed and wavelength adjust, λ_medium = λ_vacuum/n.
• EXAMPLE — Yellow light of 600 nm entering glass (n = 1.5) keeps its frequency and colour, but its wavelength shrinks to 400 nm and its speed to 2 × 10⁸ m/s.
• YOUR TURN — A wave enters a medium with ε_r = 4 and μ_r = 1. Find its speed. (Answer: v = c/√4 = 1.5 × 10⁸ m/s.)
⚠ EXAM TRAP — "Light slows in glass, so its frequency must drop." No: frequency is locked by the source and by continuity at the surface — it is λ that shrinks. Colour is a frequency property; that is why the light stays yellow in the glass.

Energy on the Move — Intensity and the Poynting Vector
• An EM wave is an energy courier. Start with stored energy densities: electric, u_E = ½ε₀E²; magnetic, u_B = B²/(2μ₀). In a travelling wave these two are EQUAL at every instant — substitute B = E/c and watch u_B collapse into u_E — so the total is simply u = ε₀E².
• DEFINITION — Poynting vector: S = (1/μ₀) E × B, the energy crossing unit area per unit time (W/m²). It points along the direction of travel — exactly where the energy is going. Its magnitude is S = EB/μ₀ = cε₀E².
• DEFINITION — Intensity: the time average of the Poynting magnitude, I = S_avg = u_avg × c = ½ε₀cE₀². The factor ½ is the average of sin² over a cycle — losing it is a classic slip.
• EXAMPLE — Sunlight arrives with I ≈ 1.4 × 10³ W/m² above the atmosphere (the solar constant). Then u_avg = I/c ≈ 4.7 × 10⁻⁶ J/m³, and E_rms = √(I/(cε₀)) ≈ 730 V/m, with B_rms ≈ 2.4 × 10⁻⁶ T. Every square metre facing the Sun intercepts over a kilowatt.
• EXAMPLE — A laser pointer putting 1 mW into a 1 mm² spot delivers I = 10³ W/m² — sunshine-level intensity in a dot, which is why even toy lasers endanger eyes.
• YOUR TURN — A distant radio wave has E₀ = 0.6 V/m. Estimate its intensity. (Answer: I = ½ × 3 × 10⁸ × 8.85 × 10⁻¹² × 0.36 ≈ 4.8 × 10⁻⁴ W/m² — under half a milliwatt per square metre, yet your receiver hears it clearly.)
⚠ EXAM TRAP — Keep amplitudes and rms values straight: I = ½ε₀cE₀² with amplitudes, or I = ε₀c E_rms² with rms. Mixing the two forms plants a stray factor of 2 in your answer.

A Gentle Push — Momentum and Radiation Pressure
• Energy is not all the wave carries — it also carries linear momentum. When a surface absorbs energy U from a wave, it receives momentum p = U/c.
• DEFINITION — Radiation pressure: the pressure exerted by an EM wave on a surface. For a perfect absorber, P = I/c. For a perfect reflector the momentum reverses, doubling the kick: P = 2I/c.
• Feel the scale: sunlight on a black surface pushes with P ≈ 4.7 × 10⁻⁶ Pa — ten-billionths of atmospheric pressure. Absurdly feeble, yet measurable, and it steadily shapes the cosmos.
• EXAMPLE — A comet's dust tail points away from the Sun partly because sunlight pushes the dust. Engineers use it deliberately: a reflective solar sail of 100 m² in full sunlight feels F = 2IA/c ≈ 9.3 × 10⁻⁴ N — a grain of sand's weight, applied relentlessly with no fuel.
• YOUR TURN — An absorbing panel faces a beam of intensity 600 W/m². What pressure does it feel? (Answer: P = I/c = 600/(3 × 10⁸) = 2 × 10⁻⁶ Pa.)
⚠ EXAM TRAP — The factor 2 belongs to REFLECTION only. Absorber: I/c. Perfect mirror: 2I/c. Partial reflector: somewhere between — and a question that just says "surface" usually means absorber unless it says mirror or reflecting.

The Electromagnetic Spectrum — One Family, Many Faces
• Spread every EM wave by wavelength and you get one continuous family portrait (Figure 9 in this chapter). Every member travels at c in vacuum, every member obeys E₀ = cB₀ — the ONLY thing that changes along the family is λ, equivalently ν = c/λ, from radio waves kilometres long to gamma rays far smaller than an atom.
• The names are historical, not physical walls: boundaries were drawn where production and detection technology changed, so bands overlap at their edges. The physics is one smooth ramp; the labels are ours.
• Why does one number, ν, change everything a wave does? Because ν decides how the wave is born (aerial currents versus nuclear decays) and how it talks to matter (gently shaking molecules versus violent ionisation).
• Read the family from long λ to short: radio — microwaves — infrared — visible — ultraviolet — X-rays — gamma rays. Energy per wave grows, penetrating power grows, and so does the biological hazard: radio washes over you harmlessly all day, while gamma rays must be shielded with lead.
• EXAMPLE — Two extremes, one speed: an FM wave (λ ≈ 3 m) and a hospital X-ray (λ ≈ 10⁻¹⁰ m) differ in frequency by ten powers of ten, yet in vacuum they race to a dead heat.
• YOUR TURN — Which reaches higher frequency, infrared or microwave? And which has the longer wavelength, UV or X-rays? (Answers: infrared; UV.)
★ HIGHLIGHT — Exam strategy for the spectrum: memorise the ORDER cold, attach one production method, one detector and one use to each band, and let ν = c/λ regenerate any number you are asked for.

▸ The Spectrum Reference Table
• RADIO WAVES — λ: greater than 0.1 m (up to about 10⁴ m) — ν: below 3 × 10⁹ Hz — PRODUCED by oscillating electrons in aerials and LC circuits — DETECTED by receiver aerials with tuned circuits — USED for radio and TV broadcasting and mobile communication
• MICROWAVES — λ: 10⁻³ m to 0.1 m — ν: 3 × 10⁹ to 3 × 10¹¹ Hz — PRODUCED by klystrons, magnetrons and Gunn diodes — DETECTED by point-contact (crystal) diodes — USED in radar, satellite links, and microwave ovens at 2.45 GHz, whose waves water absorbs strongly
• INFRARED — λ: 7 × 10⁻⁷ m to 10⁻³ m — ν: 3 × 10¹¹ to 4.3 × 10¹⁴ Hz — PRODUCED by hot bodies and vibrating molecules — DETECTED by thermopiles, bolometers and heat-sensitive film — USED in TV remotes, night-vision and heat cameras, physiotherapy, and keeping Earth warm through the greenhouse effect
• VISIBLE LIGHT — λ: 4 × 10⁻⁷ m to 7 × 10⁻⁷ m — ν: 4.3 × 10¹⁴ to 7.5 × 10¹⁴ Hz — PRODUCED by electron transitions in atoms and by hot bodies — DETECTED by the eye, photographic film and photocells — USED for sight, photography and lasers
• ULTRAVIOLET — λ: 10⁻⁹ m to 4 × 10⁻⁷ m — ν: 7.5 × 10¹⁴ to 3 × 10¹⁷ Hz — PRODUCED by the Sun, arcs and ionised gases — DETECTED by photocells and photographic film — USED to sterilise water and surgical tools and in checking forged documents; the ozone layer absorbs most solar UV, and excess exposure causes sunburn
• X-RAYS — λ: 10⁻¹¹ m to 10⁻⁹ m — ν: 3 × 10¹⁷ to 3 × 10¹⁹ Hz — PRODUCED when fast electrons slam into a metal target in an X-ray tube — DETECTED by photographic film and Geiger counters — USED in medical imaging and CT scans, airport baggage scanners, and revealing crystal structures
• GAMMA RAYS — λ: below 10⁻¹¹ m — ν: above 3 × 10¹⁹ Hz — PRODUCED by radioactive nuclei and nuclear reactions — DETECTED by Geiger counters — USED in cancer radiotherapy and sterilising medical equipment; they are the most penetrating and most dangerous band
• Checkpoint facts examiners love: FM radio sits near 100 MHz (λ ≈ 3 m); the oven's 2.45 GHz (λ ≈ 12 cm) is microwave; remotes flash infrared; sunburn is ultraviolet's signature; bone photographs are X-rays.
• A memory hook for the order, rising in frequency: "Raging Martians Invaded Venus Using X-ray Guns" — Radio, Microwave, Infrared, Visible, Ultraviolet, X-ray, Gamma.

▸ Talking Across the Sky — Radio and Microwave Links
• Why do different bands do different communication jobs? Two facts decide everything: an aerial works efficiently only when its size is comparable to λ (roughly λ/4 to λ/2), and the ionosphere — a charged layer high in the atmosphere — reflects only the longer radio waves.
• AM radio (medium wave, λ of a few hundred metres) is reflected by the ionosphere, so at night its signals bounce back down hundreds of kilometres away — the sky wave; by day the ground wave carries them.
• FM and TV signals (λ of a few metres) are too short to be reflected — they pass through the ionosphere into space. Reception is line-of-sight only (the space wave), which is why transmitters sit on tall towers and why repeaters and satellites exist.
• Microwaves are beamed almost like light: straight-line, narrow, and able to pierce the ionosphere — ideal for bouncing signals off communication satellites and for radar, where the delay of an echo measures distance. A satellite dish can be small because a 3 cm wavelength needs only a small aerial; a long-wave transmitter needs an aerial field.
• Modulation in one line: the pure wave is just a carrier — the message is stamped on by varying its amplitude (AM) or frequency (FM).
• YOUR TURN — Why can AM stations sometimes be heard 1000 km away at night while FM stations fade after about 50 km? (Answer: AM's long waves reflect off the ionosphere; FM's short waves escape through it, so FM is limited to the line of sight.)
⚠ EXAM TRAP — Satellite TV uses MICROWAVES precisely because they are NOT reflected by the ionosphere — they pass through to the satellite. Claiming satellites use ionosphere-reflected waves inverts the physics.

Formula Sheet — One-Glance Recap
✔ Displacement current: I_d = ε₀ dΦ_E/dt = ε₀A dE/dt
✔ Ampere–Maxwell law: ∮B·dl = μ₀I_c + μ₀ε₀ dΦ_E/dt
✔ Gauss (E): ∮E·dA = Q_enc/ε₀ — Gauss (B): ∮B·dA = 0 — Faraday: ∮E·dl = −dΦ_B/dt
✔ Speed in vacuum: c = 1/√(μ₀ε₀) = 3 × 10⁸ m/s — in a medium: v = c/√(ε_rμ_r) = c/n
✔ Wave relation: νλ = c — wavelength in a medium: λ/n, frequency unchanged
✔ Field lock: E₀ = cB₀, and E/B = c at every point and instant; E, B in phase, mutually perpendicular
✔ Energy density: u = u_E + u_B = ε₀E² (the two halves are equal)
✔ Poynting vector and intensity: S = EB/μ₀ — I = S_avg = ½ε₀cE₀² = u_avg c
✔ Momentum delivered on absorption: p = U/c
✔ Radiation pressure: absorber P = I/c — perfect reflector P = 2I/c
✔ Spectrum order (rising ν): radio, microwave, infrared, visible, ultraviolet, X-ray, gamma

Common Mistakes and Exam Traps
• MISTAKE 1 — "Displacement current is charge flowing across the capacitor gap." WHY IT FAILS — No charge crosses the dielectric; the plates are insulated from each other. CORRECT PRINCIPLE — Displacement current is the changing electric field itself, ε₀ dΦ_E/dt, named a current only because it creates B exactly as a real current does.
• MISTAKE 2 — Drawing B peaking a quarter-cycle away from E. WHY IT FAILS — That picture belongs to standing waves and LC oscillations, not a travelling wave. CORRECT PRINCIPLE — In a travelling EM wave E and B are in phase everywhere: same sine, same zeros, same crests.
• MISTAKE 3 — Writing B₀ = cE₀, or E = B/c. WHY IT FAILS — c is huge, so B is the small partner: B₀ = E₀/c. CORRECT PRINCIPLE — E₀ = cB₀; always check that your B comes out tiny (10⁻⁷–10⁻⁶ T for ordinary waves).
• MISTAKE 4 — "EM waves need a medium, so they cannot cross vacuum." WHY IT FAILS — The oscillating quantities are fields, which exist in vacuum; Equations 3 and 4 sustain each other unaided. CORRECT PRINCIPLE — EM waves are the one wave family that requires NO medium; mechanical waves are the ones that do.
• MISTAKE 5 — Letting the frequency change when light enters glass. WHY IT FAILS — The surface is driven at the incoming frequency and passes that frequency on; energy steps of atoms also fix ν. CORRECT PRINCIPLE — ν is invariant across media; v and λ scale by 1/n.
• MISTAKE 6 — Quoting P = 2I/c for every surface. WHY IT FAILS — The doubling comes from momentum reversal, which only a reflector performs. CORRECT PRINCIPLE — Absorber: I/c. Perfect reflector: 2I/c.
• MISTAKE 7 — Ordering the spectrum by frequency using the wavelength order. WHY IT FAILS — ν and λ run in opposite directions (ν = c/λ), so the two orders are mirror images. CORRECT PRINCIPLE — Decide which quantity the question wants, then recite: rising λ is gamma-to-radio; rising ν is radio-to-gamma.
• MISTAKE 8 — "Only infrared heats things; microwaves are a separate kind of ray." WHY IT FAILS — Heating happens whenever any band is absorbed; ovens heat water with microwaves, and skin absorbs UV with (painful) chemical effects. CORRECT PRINCIPLE — Bands differ in how matter absorbs them, not in kind: all are the same E-and-B wave at different ν.

Worked Examples — Guided Practice
• WORKED EXAMPLE 1 — PROBLEM — A parallel-plate capacitor has circular plates of radius 6 cm. While it charges, the electric field between the plates grows at 10¹² V/m per second. Find the displacement current.
• GIVEN — R = 0.06 m, so A = πR² = 1.13 × 10⁻² m²; dE/dt = 10¹² V/m/s; ε₀ = 8.85 × 10⁻¹².
• PRINCIPLE — I_d = ε₀A dE/dt.
• STEPS — I_d = 8.85 × 10⁻¹² × 1.13 × 10⁻² × 10¹² = 8.85 × 10⁻¹² × 1.13 × 10¹⁰ ≈ 0.10 A.
• ANSWER — I_d ≈ 0.10 A.
• REASONING — It must equal the conduction current in the leads — continuity guarantees it.
• MISTAKE — Using the plate separation instead of the plate area in Φ_E = EA.
• WORKED EXAMPLE 2 — PROBLEM — Using μ₀ = 4π × 10⁻⁷ and ε₀ = 8.85 × 10⁻¹², compute the speed of EM waves in vacuum, then the wavelength of an FM station at 100 MHz.
• GIVEN — The two vacuum constants; ν = 10⁸ Hz.
• PRINCIPLE — c = 1/√(μ₀ε₀); λ = c/ν.
• STEPS — μ₀ε₀ = 1.256 × 10⁻⁶ × 8.85 × 10⁻¹² ≈ 1.11 × 10⁻¹⁷; √ ≈ 3.34 × 10⁻⁹; c ≈ 3 × 10⁸ m/s. Then λ = 3 × 10⁸/10⁸ = 3 m.
• ANSWER — c ≈ 3 × 10⁸ m/s; λ ≈ 3 m.
• REASONING — A 3 m wave is why FM aerials are about a metre long.
• MISTAKE — Taking ε₀ as 8.85 × 10⁻¹² but μ₀ as 4π without the 10⁻⁷ — guard the powers of ten.
• WORKED EXAMPLE 3 — PROBLEM — An EM wave has electric amplitude E₀ = 120 V/m. Find B₀ and the rms magnetic field.
• GIVEN — E₀ = 120 V/m; c = 3 × 10⁸ m/s.
• PRINCIPLE — B₀ = E₀/c; B_rms = B₀/√2.
• STEPS — B₀ = 120/(3 × 10⁸) = 4 × 10⁻⁷ T; B_rms = 4 × 10⁻⁷/1.414 ≈ 2.8 × 10⁻⁷ T.
• ANSWER — B₀ = 4 × 10⁻⁷ T; B_rms ≈ 2.8 × 10⁻⁷ T.
• REASONING — Even a strong wave's magnetic part sits far below Earth's field — why antennas respond to E.
• MISTAKE — Inverting the ratio to B₀ = E₀c — the units alone (T = (V/m)·(m/s)) expose the error.
• WORKED EXAMPLE 4 — PROBLEM — Sunlight reaches the top of the atmosphere with intensity 1.4 × 10³ W/m². Find the average energy density and E_rms of the light.
• GIVEN — I = 1400 W/m²; c = 3 × 10⁸ m/s; ε₀ = 8.85 × 10⁻¹².
• PRINCIPLE — u_avg = I/c; E_rms = √(I/(cε₀)).
• STEPS — u_avg = 1400/(3 × 10⁸) ≈ 4.7 × 10⁻⁶ J/m³. E_rms = √(1400/(3 × 10⁸ × 8.85 × 10⁻¹²)) = √(5.27 × 10⁵) ≈ 730 V/m.
• ANSWER — u_avg ≈ 4.7 × 10⁻⁶ J/m³; E_rms ≈ 730 V/m.
• REASONING — Half this energy rides in E and half in B — u_E = u_B is built into the wave.
• MISTAKE — Using E₀ where E_rms belongs: E₀ = √2 × 730 ≈ 1030 V/m answers a different question.
• WORKED EXAMPLE 5 — PROBLEM — A solar-sail craft carries a perfectly reflecting sail of area 100 m² facing sunlight of intensity 1.4 × 10³ W/m². Find the force, and the sail's daily speed gain if the craft's mass is 10 kg.
• GIVEN — A = 100 m², I = 1400 W/m², m = 10 kg, reflector.
• PRINCIPLE — F = P×A with P = 2I/c; a = F/m; Δv = a × 86400 s.
• STEPS — F = 2 × 1400 × 100/(3 × 10⁸) ≈ 9.3 × 10⁻⁴ N. a ≈ 9.3 × 10⁻⁵ m/s². Δv ≈ 9.3 × 10⁻⁵ × 86400 ≈ 8 m/s per day.
• ANSWER — F ≈ 9.3 × 10⁻⁴ N; about 8 m/s gained every day, fuel-free.
• REASONING — Feeble but relentless — over a year it rivals chemical rockets.
• MISTAKE — Dropping the factor 2 for the mirror — or adding it for an absorber.
• WORKED EXAMPLE 6 — PROBLEM — A microwave oven works at 2.45 GHz and a dental X-ray source emits at 3 × 10¹⁸ Hz. Find both wavelengths and confirm each sits in its named band.
• GIVEN — ν₁ = 2.45 × 10⁹ Hz; ν₂ = 3 × 10¹⁸ Hz.
• PRINCIPLE — λ = c/ν; compare with the table (microwaves 10⁻³–0.1 m; X-rays 10⁻¹¹–10⁻⁹ m).
• STEPS — λ₁ = 3 × 10⁸/(2.45 × 10⁹) ≈ 0.12 m — a microwave (band edges in the table are nominal, and oven waves sit at the family's long-wavelength end). λ₂ = 3 × 10⁸/(3 × 10¹⁸) = 10⁻¹⁰ m = 0.1 nm, squarely an X-ray.
• ANSWER — 12 cm (microwave) and 0.1 nm (X-ray).
• REASONING — Convert ν to λ, consult the table — classification done.
• MISTAKE — Reporting λ₂ as 10⁻¹⁰ nm — it is 10⁻¹⁰ m, which equals 0.1 nm.

Practice Questions — Test Yourself
• Q1 (single correct) — Which statement about a travelling EM wave in vacuum is correct? (a) E and B are perpendicular to each other but parallel to the direction of travel (b) E and B are in phase and both perpendicular to the direction of travel (c) The wave needs a material medium to propagate (d) B₀ = cE₀
• Q2 (numerical) — The field between capacitor plates of area 0.04 m² grows at 5 × 10¹⁰ V/m per second. Find the displacement current in milliamperes.
• Q3 (numerical) — A wave has B₀ = 4 × 10⁻⁶ T. Find E₀.
• Q4 (ordering) — Arrange in INCREASING frequency: gamma rays, radio waves, visible light, microwaves.
• Q5 (multiple correct) — Maxwell's equations tell us that (a) magnetic monopoles do not exist (b) a changing magnetic field produces an electric field (c) a steady current produces a changing electric field (d) light is an electromagnetic wave.
• Q6 (numerical) — An FM station broadcasts at 91.1 MHz. Find its wavelength and the length of a quarter-wave aerial.
• Q7 (statements) — Statement I: Displacement current is the flow of charges across a capacitor's gap. Statement II: During charging, the displacement current between the plates equals the conduction current in the leads. Choose: (a) both true (b) I true, II false (c) I false, II true (d) both false.
• Q8 (assertion–reason) — Assertion (A): EM waves exert a pressure on any surface they strike. Reason (R): EM waves carry linear momentum. Choose: (a) A and R true, R explains A (b) A and R true, R does not explain A (c) A true, R false (d) A false, R true.

▸ Answer Key — Explanations, Traps and Misconceptions
• A1 — (b). E, B and travel direction are mutually perpendicular, E and B in phase; no medium is needed; and E₀ = cB₀, not the reverse. Misconception caught: importing the quarter-phase picture from LC oscillations.
• A2 — I_d = ε₀A dE/dt = 8.85 × 10⁻¹² × 0.04 × 5 × 10¹⁰ ≈ 1.77 × 10⁻² A ≈ 18 mA. Misconception caught: using diameter or separation in place of plate area.
• A3 — E₀ = cB₀ = 3 × 10⁸ × 4 × 10⁻⁶ = 1200 V/m. Misconception caught: dividing by c again instead of multiplying.
• A4 — Radio, microwaves, visible light, gamma rays. Misconception caught: reciting the wavelength order when frequency was asked — the two orders are reversed.
• A5 — (a), (b) and (d). A steady current produces steady fields only, so (c) fails — change is the whole game in Equations 3 and 4.
• A6 — λ = 3 × 10⁸/(91.1 × 10⁶) ≈ 3.29 m; quarter-wave aerial ≈ 0.82 m. Misconception caught: quoting the full wavelength as the aerial length.
• A7 — (c). No charge ever crosses the gap (I is false); continuity makes the two currents equal during charging (II is true).
• A8 — (a). The pressure exists precisely because the wave hands over its momentum p = U/c — R is the direct explanation of A.

Summary, Revision Checklist and Self-Assessment
• The one-paragraph story: Ampere's law failed at the capacitor; Maxwell's displacement current — a changing E acting as a current — repaired it and revealed that changing E and changing B generate each other. That mutual generation is the EM wave: transverse, in-phase E and B with E₀ = cB₀, crossing vacuum at c = 1/√(μ₀ε₀), carrying energy (I = ½ε₀cE₀²) and momentum (p = U/c), in seven bands from radio to gamma.
• Essential definitions to be able to say aloud: displacement current • Poynting vector • intensity • radiation pressure • transverse wave.
• Frequently confused pairs: conduction current versus displacement current • E₀ = cB₀ versus B₀ = cE₀ • absorber pressure I/c versus reflector 2I/c • amplitude versus rms in intensity • wavelength order versus frequency order • medium slows the wave versus frequency changes.
• Revision checklist: □ I can retell the capacitor paradox and its resolution □ I can state all four Maxwell equations in words □ I can derive I_d = dQ/dt from Φ_E = Q/ε₀ □ I know why only accelerated charges radiate □ I can draw E, B and v as a right-handed trio and state the phase relation □ I can reproduce c from μ₀ and ε₀ □ I can place all seven bands in order with a production, a detector and a use each □ I know why satellites use microwaves and why FM is line-of-sight.
• Self-assessment — answer honestly: (1) A capacitor is fully charged and disconnected, its plates then slowly pulled apart. Is there a displacement current during the pulling? (2) A wave's intensity quadruples. What happens to E₀ and to the radiation pressure on an absorber? (3) Which band would you choose to see through fog at an airport, and which to sterilise a water tank? (4) Green light enters water (n = 1.33). What are its speed and wavelength if its vacuum wavelength is 532 nm? (Answers: (1) No (ideally) — the capacitor is isolated, so Q is fixed, and E between the plates equals Q/(ε₀A), which does not depend on the separation at all; Φ_E stays constant and I_d = 0, even though V rises as C falls. Had it stayed connected to a battery, E = V/d would fall during the pulling and a displacement current would flow. (2) E₀ doubles (I ∝ E₀²); pressure doubles (P = I/c ∝ I). (3) Infrared for thermal imaging through haze; ultraviolet for sterilising. (4) v = c/1.33 ≈ 2.26 × 10⁸ m/s; λ = 532/1.33 ≈ 400 nm — frequency and colour identity unchanged.)
<!-- END phys_ch_22 detailedStudyNotes -->
