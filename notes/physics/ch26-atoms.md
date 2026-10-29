<!-- BEGIN phys_ch_26 detailedStudyNotes -->
Introduction — Firing Particles at the Atom
• By 1909, physicists knew atoms contained electrons, but nobody knew how the atom's positive charge and mass were arranged inside. Was the atom a soft pudding with electrons studded in it, as Thomson proposed, or something far stranger? The answer came from one of the most audacious experiments ever done — firing alpha particles at a gold foil thinner than a soap bubble's wall and watching where they bounced.
• DEFINITION — An atom is the smallest unit of an element: a tiny, dense, positively charged nucleus (radius about 10⁻¹⁵ to 10⁻¹⁴ m) holding nearly all the mass, with electrons moving around it in a region of radius about 10⁻¹⁰ m.
• Here is the promise of this chapter. By the end you will be able to compute how close an alpha particle gets to a nucleus, write down the radius, speed and energy of any Bohr orbit in seconds, predict the wavelength of any hydrogen spectral line, and explain — with a standing wave — why Bohr's mysterious angular-momentum rule works.
• The story arc is a perfect model of how physics progresses: an experiment (alpha scattering) destroys a model (plum pudding), a new model (Rutherford's nucleus) explains the experiment but breaks classical physics, and a patched model (Bohr) fixes the breakage with three bold postulates — later justified beautifully by de Broglie's waves.
• Roadmap: the scattering experiment and its two formulas, Rutherford's model and its two failures, spectra, Bohr's postulates and orbit formulas, the level diagram, the Rydberg formula and the five series, excitation and ionisation, and finally de Broglie's standing waves.
★ HIGHLIGHT — The whole chapter in one breath: the atom is mostly empty space, its charge and mass crushed into a nucleus 100,000 times smaller than the atom — and electrons may only occupy orbits whose circumference holds a whole number of de Broglie wavelengths.
• YOUR TURN — An atom is about 10⁻¹⁰ m wide and its nucleus about 10⁻¹⁴ m. If the nucleus were blown up to a marble of radius 1 cm, roughly how wide would the atom be? (Answer: scale factor 10¹², so the atom becomes about 100 m wide — a football field with a marble at the centre. That emptiness is what the scattering experiment proved.)

The Alpha-Scattering Experiment — Bullets at Tissue Paper
• The setup (Geiger and Marsden, 1909, working under Rutherford): alpha particles from a radioactive source were collimated into a narrow beam and fired at a gold foil only about 2.1 × 10⁻⁷ m thick — roughly a thousand atoms. A zinc sulphide screen flashed wherever an alpha struck, and a microscope, rotated around the foil, counted flashes at each scattering angle θ.
• WHY gold, and why so thin — gold is the most malleable metal (it can be beaten thinnest) and has a high atomic number Z = 79, whose strong nuclear charge produces measurable deflections; a foil only ~1000 atoms thick keeps each alpha to at most one significant collision, so a flash means a single clean scattering event.
• DEFINITION — The scattering angle θ is the angle between the alpha particle's incoming direction and its outgoing direction after it passes the nucleus. θ = 0° means it sailed straight through; θ = 180° means it rebounded head-on.
• The observations stunned everyone: (1) most alphas passed straight through with little or no deflection; (2) a small fraction, about 0.14%, were scattered by more than 1°; (3) a tiny fraction — about 1 in 8000 — were deflected by more than 90°, some bouncing almost straight back.
• Rutherford's famous reaction: it was as if you fired a 15-inch shell at a piece of tissue paper and it rebounded right back at you. A diffuse pudding of charge could never repel an alpha like that — only a compact, massive, highly charged centre could.
• DEFINITION — The impact parameter b is the perpendicular distance between the nucleus's centre and the alpha particle's original straight-line path (the line it would have followed if the nucleus exerted no force).
• Read the impact parameter like a dial: large b means the alpha passes far from the nucleus, feels a weak force and bends slightly (small θ); small b means a near miss with a violent bend; b = 0 is a head-on collision and gives θ = 180°, a clean rebound. Figure 26.1 shows the three regimes.
✔ KEY FORMULA — Impact parameter: b = (Ze²/(4πε₀ × ½mv²)) × cot(θ/2), where the alpha carries charge 2e, the nucleus carries Ze, and ½mv² is the alpha's kinetic energy. Smaller b, bigger θ — cot(θ/2) is the whole story.
• WORKED PATTERN — any question giving you a scattering angle and asking for b (or vice versa) is this one formula plus kinetic energy in joules. Convert MeV to joules first: 1 eV = 1.602 × 10⁻¹⁹ J, and remember the alpha's charge 2e is already built into the formula as written above.
⚠ EXAM TRAP — Do not put Z = 2 for the alpha in this formula — the 2 is already counted. The Z in every scattering formula of this chapter is the NUCLEUS's atomic number (79 for gold). Students who write 2 × 79 get answers exactly 2 times too big.
• YOUR TURN — Two alpha particles of the same energy strike a foil; one has b = 2 × 10⁻¹⁴ m, the other b = 8 × 10⁻¹⁴ m. Which one scatters through the larger angle? (Answer: the one with the smaller b — it passes closer to the nucleus, feels the stronger repulsion, and bends more. b and θ always move in opposite directions.)

▸ Impact Parameter and Distance of Closest Approach
• Push the dial to its limit: b = 0, a perfectly head-on alpha. It charges straight at the nucleus, slows as its kinetic energy converts into electrostatic potential energy, stops for an instant, and is hurled back along its own path. The turning point defines the closest an alpha can ever get.
• DEFINITION — The distance of closest approach r₀ is the separation between alpha and nucleus at the turning point of a head-on (b = 0) collision, where the alpha's entire initial kinetic energy has become electrostatic potential energy.
• Derivation in three lines: energy conservation says initial KE = PE at closest approach, so ½mv² = (1/4πε₀) × (2e)(Ze)/r₀, giving r₀ = (1/4πε₀) × 2Ze²/(½mv²).
✔ KEY FORMULA — Distance of closest approach: r₀ = 2Ze²/(4πε₀ × KE), with KE the alpha's kinetic energy in joules. Double the energy and r₀ halves; double Z and r₀ doubles.
• EXAMPLE — A 5 MeV alpha fired head-on at gold (Z = 79) stops at r₀ = 4.55 × 10⁻¹⁴ m ≈ 45 fm from the centre — still outside the gold nucleus itself (radius ~7 × 10⁻¹⁵ m), which is why the pure Coulomb formula stays valid: the alpha never actually touches nuclear matter.
• WHY this number mattered historically — it put the first experimental upper bound on the nuclear size: the nucleus of gold had to be smaller than about 10⁻¹⁴ m, a hundred thousand times smaller than the atom. One formula turned a counting experiment into a measurement of the invisible.
• A beautiful consistency check links our two formulas: for θ = 90°, b = (Ze²/(4πε₀ × KE)) × cot45° = Ze²/(4πε₀ × KE) = r₀/2. The 90-degree impact parameter is exactly half the head-on distance. If a problem gives you one, you own the other.
⚠ EXAM TRAP — The distance of closest approach is measured from the CENTRE of the nucleus, not from its surface, and it is an upper bound on the nuclear radius, not the radius itself. Also, r₀ applies only to head-on collisions; a general trajectory's nearest approach is larger.
• YOUR TURN — An alpha beam's energy is quadrupled. What happens to r₀, and what happens to the number of particles rebounding backwards? (Answer: r₀ falls to one quarter, so alphas probe deeper; but rebounding needs tiny b, and the scattering pattern shifts — fewer particles scatter at large angles for the same foil, because each alpha now ploughs closer with less bending.)

Rutherford's Nuclear Model — a Tiny, Heavy, Charged Core
• From the flashes on the zinc sulphide screen, Rutherford (1911) built the nuclear model of the atom. Every observation became a structural conclusion — learn them as a matched set.
• DEFINITION — Rutherford's nuclear model: the atom's entire positive charge Ze and nearly all its mass are concentrated in a minute nucleus at the centre; electrons revolve around the nucleus in orbits, like planets around the Sun, held by the Coulomb attraction; most of the atom is empty space.
• Observation → conclusion 1: most alphas pass straight through → the atom is overwhelmingly empty; there is almost nothing in an alpha's way.
• Observation → conclusion 2: a few alphas deflect by large angles, even bouncing back → the deflecting centre is massive (a light electron cannot rebound a heavy alpha, just as a table-tennis ball cannot rebound a bowling ball) and carries a large charge concentrated in a tiny volume, so the repulsion at close range is enormous.
• Observation → conclusion 3: the fraction scattered at each angle matched the formula for a single point-like charge → the positive charge is not spread over 10⁻¹⁰ m but packed into ≲ 10⁻¹⁴ m.
• Size bookkeeping worth memorising: atomic radius ~10⁻¹⁰ m (1 Å), nuclear radius ~10⁻¹⁵ to 10⁻¹⁴ m (1 to 10 fm). The nucleus occupies about one trillionth (10⁻¹²) of the atom's volume yet holds more than 99.97% of its mass.
• EXAMPLE — The density implied is staggering: nuclear matter packs about 10¹⁷ kg/m³ — a teaspoon of it would mass roughly a billion tonnes. Rutherford's model hinted at such densities decades before neutron stars were understood.
• The dynamics: for a stable orbit the Coulomb force supplies the centripetal force, (1/4πε₀)Ze²/r² = mv²/r for a nucleus of charge Ze. This single equation is the seed from which Bohr's entire model grows two sections from now.
★ HIGHLIGHT — Rutherford explained the scattering perfectly and his model is still the correct picture of WHERE everything is. Its problem was never geometry — it was that classical physics forbids such an atom to survive. That tension is exactly what Bohr resolved.
• YOUR TURN — Why did the plum-pudding model predict that back-scattering (θ > 90°) should essentially never happen? (Answer: in the pudding, charge is spread over the whole atom, so the maximum electric field an alpha meets is far too weak to turn a fast, heavy alpha around; no single encounter could deflect it by more than a fraction of a degree, and ~1000 random small kicks cannot add up to a rebound.)

▸ Where Rutherford's Model Fails
• Failure 1 — stability. In classical electromagnetism, any accelerating charge radiates energy. An orbiting electron is permanently accelerating (its direction changes), so it should radiate continuously, lose energy, and spiral into the nucleus in roughly 10⁻⁸ s. Rutherford atoms should collapse instantly — yet matter is stable. The model contradicts the existence of the chair you are sitting on.
• Failure 2 — spectra. A spiralling electron's orbital frequency changes continuously as it falls in, so it should radiate a continuous smear of frequencies. Reality: atoms emit sharp, discrete line spectra (next section) — a barcode, not a rainbow smear. The model cannot produce a single one of those lines, let alone their pattern.
• Be precise about what failed: not the nucleus (scattering proves the nucleus), but the classical laws of motion and radiation applied to the electrons. The fix had to be new rules for the electron's motion, not a new address for the charge.
⚠ EXAM TRAP — Exam questions love asking which observation the nuclear model fails to explain, with options like "alpha back-scattering". Back-scattering is what the model EXPLAINS — its failures are atomic stability and line spectra. Keep the two columns strictly separate.
• YOUR TURN — If Rutherford's atom obeyed classical physics exactly, what would the emission spectrum of hydrogen look like, and how long would a hydrogen atom last? (Answer: a continuous band of all frequencies, brightening as the electron spirals in; and the atom would collapse in about 10⁻⁸ s. Neither happens — that is the crisis Bohr stepped into.)

Atomic Spectra — Every Element Signs Its Name in Light
• Heat a gas or pass a discharge through it and it glows — but not with white light. Split that glow with a prism or grating and you find the signature that Rutherford's model could not explain: sharp bright lines at specific wavelengths, unique to each element.
• DEFINITION — An emission spectrum is the set of discrete wavelengths an excited gas emits; for atoms it appears as bright coloured lines on a dark background (a line spectrum). An absorption spectrum is the continuous spectrum of white light after passing through a cooler gas — the same characteristic wavelengths appear as dark lines where the gas absorbed them.
• WHY the two spectra share wavelengths — absorption is emission run backwards: an atom absorbs exactly the photon energies it can emit, because both are fixed by the same internal energy-level gaps. Hydrogen's dark absorption lines sit at precisely the wavelengths of its bright emission lines.
• EXAMPLE — Astronomers identify elements in stars they can never touch purely from these barcodes: the Sun's spectrum shows hydrogen and helium lines (helium was in fact discovered in sunlight, in 1868, before it was found on Earth). Forensic labs and flame tests (sodium's yellow, calcium's brick-red) run on the same principle.
• The hydrogen barcode had a tantalising pattern: in 1885 Balmer found the visible lines fit a simple formula, and Rydberg generalised it — 1/λ = R(1/n_f² − 1/n_i²) — years before anyone knew why. A purely empirical rule begging for a mechanism. Bohr supplied it.
★ HIGHLIGHT — Line spectra are the experimental fact that forced quantisation: atoms exchange energy with light only in specific amounts, so the atom's internal energies themselves must come in specific amounts. Discrete lines in, discrete levels out.
• YOUR TURN — A gas shows bright lines at 656 nm and 486 nm in emission. White light passed through the same gas (cooler) shows what at those wavelengths? (Answer: dark lines at exactly 656 nm and 486 nm — absorption removes the same photon energies the gas emits when excited.)

Bohr's Three Postulates — the Rules That Saved the Atom
• In 1913, Niels Bohr kept Rutherford's nucleus and planetary orbits but replaced the classical rulebook with three postulates. They look arbitrary; they predicted hydrogen's spectrum to stunning precision, and de Broglie later showed why the strangest of them is true.
• DEFINITION — Postulate 1 (stationary orbits): the electron revolves around the nucleus only in certain stable orbits, called stationary states, in which it does NOT radiate energy despite accelerating. Each allowed orbit has a definite total energy.
• DEFINITION — Postulate 2 (quantised angular momentum): the electron's angular momentum in a permitted orbit is an integral multiple of h/2π — mvr = nh/2π, where n = 1, 2, 3, ... is the principal quantum number. Orbits failing this condition simply do not exist.
• DEFINITION — Postulate 3 (transitions): the electron emits or absorbs a photon only when it jumps between stationary orbits; the photon energy equals the energy difference, hf = E_initial − E_final (emission, initial higher) — the frequency condition.
• Notice how each postulate surgically kills one Rutherford failure: postulate 1 forbids the radiation that caused collapse (stability restored); postulate 3 makes photons come out only at level-gap energies (discrete lines restored). Postulate 2 is the rule deciding which levels exist.
• The force balance stays classical and is worth writing every time: Coulomb attraction provides the centripetal force, mv²/r = (1/4πε₀)(Ze²/r²) for a hydrogen-like atom of nuclear charge Ze (Z = 1 for hydrogen, 2 for He⁺, 3 for Li²⁺ — Bohr's model works ONLY for one-electron species).
✔ KEY FORMULA — Quantisation: mvr = nh/2π (n = 1, 2, 3, ...). Combined with the force balance it generates every orbit formula in the next section — radius ∝ n²/Z, speed ∝ Z/n, energy ∝ −Z²/n².
• EXAMPLE — Apply postulate 3 to a single jump: an electron falling from n = 3 to n = 2 releases exactly the gap energy 1.89 eV as one photon of wavelength 656 nm — the famous red H-alpha line. One postulate turns a spectral line into an energy transaction you can audit.
⚠ EXAM TRAP — Bohr's model does NOT apply to multi-electron atoms like neutral helium or carbon — its formulas are for hydrogen-like (single-electron) species only: H, He⁺, Li²⁺. Applying E = −13.6 Z²/n² to neutral helium is a classic wrong answer.
• YOUR TURN — An electron in hydrogen sits in n = 4. A photon arrives with energy exactly equal to the n = 4 → n = 2 gap. What can happen? (Answer: it can be absorbed, lifting the electron from n = 2... no — absorption raises the electron: a photon of the n=2→4 gap energy, 2.55 eV, is absorbed by an electron in n = 2, not by one already in n = 4. An electron in n = 4 can only be pushed up by gaps starting at 4, or ionised by ≥ 0.85 eV.)

Orbits in Numbers — Radius, Speed and Total Energy
• Combine the force balance with mvr = nh/2π, eliminate v, and the orbit sizes fall out: r_n = ε₀n²h²/(πme²Z). For hydrogen this is the most quoted number in atomic physics.
✔ KEY FORMULA — Radius of the nth orbit: r_n = 0.53 × n²/Z Å. Ground orbit of hydrogen (n = 1, Z = 1): r₁ = 0.53 Å, the Bohr radius a₀. Orbits grow as n² — the n = 3 orbit is 9 times wider than n = 1.
• Eliminate r instead and the speeds appear: v_n = Ze²/(2ε₀nh), which for hydrogen's ground orbit gives v₁ = 2.19 × 10⁶ m/s — about c/137, fast yet safely non-relativistic, which quietly justifies the classical kinetic energy used everywhere in this chapter.
✔ KEY FORMULA — Speed in the nth orbit: v_n = 2.19 × 10⁶ × Z/n m/s. Speed falls as 1/n: outer electrons are slower electrons.
• Energy follows from the orbit: kinetic energy KE = ½mv² = +(1/4πε₀)Ze²/(2r), potential energy PE = −(1/4πε₀)Ze²/r — exactly twice the KE and negative. Total E = KE + PE = −(1/4πε₀)Ze²/(2r) = −KE = PE/2. This KE = −E, PE = 2E pattern (the virial pattern) is a free error-check on every problem.
✔ KEY FORMULA — Total energy of the nth level: E_n = −13.6 × Z²/n² eV. Hydrogen's levels: E₁ = −13.6, E₂ = −3.4, E₃ = −1.51, E₄ = −0.85, E₅ = −0.54 eV, crowding towards 0 at n = ∞.
• DEFINITION — The ground state is the lowest energy state (n = 1), the atom's most stable configuration. Any n > 1 is an excited state. The negative sign of E_n means the electron is BOUND: you must supply |E_n| of energy to free it.
• The full closed form, for completeness: E_n = −(me⁴Z²)/(8ε₀²n²h²) — substituting constants gives the 13.6 eV. You will never plug constants into it in an exam; the scaled form −13.6 Z²/n² eV is the working tool.
• Scaling drills that IAT loves: frequency of revolution f_n = v_n/(2πr_n) ∝ Z²/n³, so hydrogen's ground-orbit electron circles about 6.6 × 10¹⁵ times per second, and 8 times slower (n³ = 8) in n = 2. Orbital period scales as n³ — Kepler's third law wearing quantum clothes.
• EXAMPLE — He⁺ (Z = 2), n = 1: r = 0.53/2 = 0.26 Å, v = 2 × 2.19 × 10⁶ = 4.38 × 10⁶ m/s, E = −13.6 × 4 = −54.4 eV. Everything tightens and deepens with Z — one template, three multiplications.
• WORKED PATTERN — ratio method: never recompute constants. Want r for n = 3, Li²⁺? r = 0.53 × 9/3 = 1.59 Å. Want E for n = 2, He⁺? −13.6 × 4/4 = −13.6 eV. Write the scaling, substitute n and Z, done in one line.
⚠ EXAM TRAP — Kinetic energy in an orbit is POSITIVE (+13.6 Z²/n² eV) even though total energy is negative. Options that give KE = −3.4 eV for hydrogen n = 2 are bait; KE = +3.4 eV, PE = −6.8 eV, E = −3.4 eV.
• YOUR TURN — For hydrogen's n = 2 orbit, state r, v, KE, PE and E. (Answer: r = 4 × 0.53 = 2.12 Å; v = 2.19 × 10⁶/2 = 1.09 × 10⁶ m/s; KE = +3.4 eV; PE = −6.8 eV; E = −3.4 eV — and KE = −E, PE = 2E checks out.)

▸ The Energy-Level Diagram — the Atom's Staircase
• Draw the energies as horizontal rungs with E = 0 (a free electron at rest, infinitely far away) as the ceiling. Figure 26.2 is this staircase for hydrogen: rungs at −13.6, −3.4, −1.51, −0.85, −0.54 eV, squeezing closer as they approach zero — because E ∝ 1/n², the gaps shrink as n grows.
• DEFINITION — An energy-level diagram plots each stationary state's energy as a horizontal line; a transition is a vertical arrow between rungs, downward for emission (photon out) and upward for absorption (photon in), with the arrow's length proportional to the photon's energy.
• Reading the diagram pays instantly: the longest arrows (Lyman, down to n = 1) are the most energetic photons — ultraviolet. Medium arrows ending at n = 2 (Balmer) are visible light. Short hops ending at n = 3, 4, 5 (Paschen, Brackett, Pfund) are infrared whispers.
• Vertical gaps you should feel in your bones: n = 1→2 costs 10.2 eV, n = 2→3 costs 1.89 eV, n = 1→∞ costs 13.6 eV. Notice the first step is more than half the whole staircase — ground-state atoms are hard to excite and quick to fall home.
★ HIGHLIGHT — The level diagram is the chapter's master key: every spectral line, excitation energy and ionisation question is an arrow on this one picture. Sketch it from memory (six rungs: −13.6, −3.4, −1.51, −0.85, −0.54, 0) before attempting any numerical.
• YOUR TURN — On the diagram, which single jump emits the most energetic photon possible in hydrogen, and which emits the least energetic? (Answer: most energetic — ∞ → 1, 13.6 eV, the Lyman limit; least energetic — between adjacent high rungs like 6 → 5, only 0.17 eV, deep infrared. Energy differences, not the rungs themselves, set the photon.)

The Line Spectrum of Hydrogen — the Rydberg Formula
• Bohr's model must now earn its keep: predict the measured lines. The photon from a fall n_i → n_f carries E = 13.6 × (1/n_f² − 1/n_i²) eV, and setting E = hc/λ turns that into a wavelength formula.
✔ KEY FORMULA — Rydberg formula: 1/λ = RZ²(1/n_f² − 1/n_i²), with the Rydberg constant R = 1.097 × 10⁷ m⁻¹ and n_i > n_f. Bohr's theory even predicts R from first principles: R = me⁴/(8ε₀²ch³) — experiment and theory agree, the model's triumph.
• DEFINITION — A spectral series is the family of lines from all transitions ending on the same final level n_f. Each series has a longest wavelength (the shortest step, n_i = n_f + 1 → n_f) and a series limit — the shortest wavelength (n_i = ∞ → n_f), where the lines crowd together and merge.
• The visible Balmer lines to recognise on sight: H-alpha (3→2) 656.3 nm red, H-beta (4→2) 486.1 nm blue-green, H-gamma (5→2) 434.1 nm violet, H-delta (6→2) 410.2 nm violet — marching towards the 364.6 nm limit.
• EXAMPLE — Verify H-alpha the Bohr way: E = 13.6 × (1/4 − 1/9) = 13.6 × 5/36 = 1.89 eV; λ = hc/E = 1240 eV·nm / 1.89 eV ≈ 656 nm. Matches the measured red line — this is the calculation that made physicists take Bohr seriously. (Keep hc = 1240 eV·nm in your pocket; it converts any eV gap to nanometres in one division.)
• WORKED PATTERN — for any series question: (1) identify n_f from the series name; (2) longest λ uses n_i = n_f + 1, shortest uses n_i = ∞; (3) if Z ≠ 1, multiply R by Z² (He⁺ lines crowd to shorter wavelengths); (4) compute 1/λ, invert, convert metres to nanometres (×10⁹).
⚠ EXAM TRAP — Wavelength questions fail on two slips: using n_i < n_f (which gives a negative 1/λ — a signal you swapped them), and quoting the answer in metres when options are in nanometres. Also, the series limit is ∞ → n_f, NOT n_f + 1 → n_f; those are opposite ends of the series.
• YOUR TURN — What is the wavelength of the first Lyman line (2→1)? (Answer: 1/λ = R(1 − 1/4) = 0.75 × 1.097 × 10⁷, so λ = 1.22 × 10⁻⁷ m = 121.5 nm — ultraviolet, as every Lyman line must be.)

▸ The Five Hydrogen Series — Reference Table
• Every hydrogen line belongs to exactly one of five families, named by their discoverers. Figure 26.3 sketches where their lines fall across the spectrum; the table below is the text version to memorise.
• Lyman series — final level n_f = 1 — ultraviolet — range 91.2 nm (limit, ∞→1) to 121.5 nm (2→1)
• Balmer series — final level n_f = 2 — visible — range 364.6 nm (limit, ∞→2) to 656.3 nm (3→2)
• Paschen series — final level n_f = 3 — infrared — range 820 nm (limit, ∞→3) to 1875 nm (4→3)
• Brackett series — final level n_f = 4 — infrared — range 1459 nm (limit, ∞→4) to 4051 nm (5→4)
• Pfund series — final level n_f = 5 — infrared — range 2279 nm (limit, ∞→5) to 7458 nm (6→5)
• Pattern to lock in: only Balmer is visible — one reason hydrogen's visible spectrum is so clean. Neighbouring series overlap in wavelength, so what identifies a line's series is its final level n_f, never its colour alone.
• Memory hook for limits: series limit λ = n_f²/R, giving 91.2, 364.6, 820, 1459, 2279 nm for n_f = 1..5 — each is just n_f² × 91.2 nm. The first line of a series is its limit stretched by the factor (n_f+1)²/((n_f+1)² − n_f²): for Balmer that factor is 9/5, and 364.6 × 9/5 = 656.3 nm exactly. Or simply remember the famous first lines: 121.5, 656.3, 1875 nm.
✔ KEY FORMULA — Series limit: λ_limit = n_f²/(RZ²). For hydrogen: Lyman 91.2 nm, Balmer 364.6 nm — the two limits examiners ask for most.
⚠ EXAM TRAP — "Longest wavelength of the Balmer series" is 656.3 nm (3→2, the smallest energy step), and "shortest" is 364.6 nm (the limit). Long wavelength means small energy — students routinely hand in the pair swapped.
• YOUR TURN — The Paschen limit is 820 nm. A line is observed at 1094 nm (a real Paschen line). Without the full formula, argue it must be a Paschen-or-higher series line and find its upper level. (Answer: 1094 nm > 820 nm and IR, so n_f ≥ 3. Try n_f = 3: 1/λ = R(1/9 − 1/n_i²) gives 1/n_i² = 1/9 − 1/(Rλ) = 0.1111 − 0.0834 = 0.0278, so n_i² = 36, n_i = 6 — the line is 6→3.)

Excitation and Ionisation — Paying the Energy Bill
• Definitions first, because exams grade the wording: to excite an atom is to lift its electron from the ground state to a higher bound level; to ionise it is to remove the electron completely (n → ∞).
• DEFINITION — The excitation energy for ground → n is ΔE = 13.6 × (1 − 1/n²) eV (for hydrogen). The first excitation energy (1→2) is 10.2 eV; the ionisation energy from the ground state is 13.6 eV. From an arbitrary level n, ionisation costs 13.6/n² eV.
• DEFINITION — Excitation potential and ionisation potential are these energies expressed as voltages: an electron accelerated through 10.2 V gains exactly the 10.2 eV needed for hydrogen's first excitation; hydrogen's ionisation potential is 13.6 V. For electrons, energy in eV and accelerating voltage in V carry the same number — that is the definition of the electron-volt doing quiet work.
• EXAMPLE — Gas discharge tubes (and the Franck–Hertz experiment) confirm the levels directly: electrons fired through hydrogen gas lose energy in chunks — nothing below 10.2 eV (collisions stay elastic), then sudden losses at 10.2 eV as atoms swallow the first excitation energy whole. Quantised levels, measured with a voltmeter.
• WORKED PATTERN — "minimum photon wavelength to ionise hydrogen from ground" = convert 13.6 eV: λ = 1240/13.6 = 91.2 nm (the Lyman limit — no coincidence, it IS the limit). "From n = 2": 3.4 eV → λ = 1240/3.4 = 365 nm (the Balmer limit). Ionisation thresholds and series limits are the same numbers wearing two hats.
• Collisions with electrons vs photons — one asymmetry to know: a photon is absorbed only if its energy matches a gap EXACTLY (or exceeds the ionisation energy, the excess becoming electron KE). A colliding electron, being divisible, can donate exactly the gap energy and keep the change — so electron bombardment excites at any energy above the first excitation threshold.
⚠ EXAM TRAP — A 12 eV photon striking ground-state hydrogen is NOT absorbed (no 12 eV gap exists: gaps are 10.2, 12.09, 12.75... eV), but a 12 eV electron CAN excite hydrogen (to n = 2 or 3, keeping the leftover as kinetic energy). Photon = exact change only; electron = any amount up to its energy.
• YOUR TURN — What minimum kinetic energy must an electron have to ionise hydrogen atoms that are already in the n = 2 state? (Answer: the ionisation energy from n = 2 is 13.6/4 = 3.4 eV, so 3.4 eV suffices — excited atoms are far easier to ionise, a fact that matters in stellar atmospheres.)

de Broglie Explains Bohr — Standing Waves on a Ring
• Bohr's postulate 2 (mvr = nh/2π) worked but looked like a rabbit from a hat. In 1924 de Broglie supplied the reason: if the electron is a wave with λ = h/(mv), an orbit survives only if the wave joins up with itself — otherwise it interferes destructively and cancels out.
• DEFINITION — The de Broglie wavelength of a particle is λ = h/(mv) = h/p. For Bohr's quantisation: an orbit of radius r is allowed only if its circumference contains a whole number of wavelengths, 2πr = nλ (n = 1, 2, 3, ...).
• The derivation is three steps and worth reproducing: 2πr = nλ = nh/(mv) → mvr = nh/2π. Bohr's postulate drops out — the allowed orbits are precisely the standing-wave orbits. Non-integer n means the wave's tail misses its head, phase mismatch accumulates each lap, and the wave self-destructs: those orbits cannot persist.
✔ KEY FORMULA — Standing-wave condition: 2πr_n = nλ_n, equivalently λ_n = 2πr_n/n. In hydrogen's ground orbit λ₁ = 2π × 0.53 Å = 3.33 Å — exactly one wavelength wraps the smallest ring.
• EXAMPLE — Check n = 3 both ways: r₃ = 0.53 × 9 = 4.77 Å, so the standing-wave condition gives λ = 2π × 4.77/3 = 9.99 Å. Directly: v₃ = 2.19 × 10⁶/3 = 7.3 × 10⁵ m/s, and h/(mv) = 6.63 × 10⁻³⁴/(9.11 × 10⁻³¹ × 7.3 × 10⁵) = 9.97 × 10⁻¹⁰ m ≈ 9.97 Å. Two routes, one answer — the wave picture and the orbit picture agree.
• WHY this matters beyond one chapter — quantisation stops being a rule about circles and becomes a boundary condition on waves. The same idea (waves fitting into boxes and wells) grows into the full quantum mechanics you will meet later; Bohr's atom is its first rough sketch.
★ HIGHLIGHT — Bohr's model overall verdict: exact for hydrogen-like spectra, radii and energies; silent on fine structure, multi-electron atoms, transition intensities and chemical bonding. Know its limits as crisply as its formulas — comparison questions are IAT favourites.
⚠ EXAM TRAP — The standing-wave condition uses the CIRCUMFERENCE 2πr = nλ, not the radius or diameter. Also λ here is the electron's de Broglie wavelength in that orbit — it changes from orbit to orbit (λ ∝ n, since r ∝ n² and we divide by n).
• YOUR TURN — How many de Broglie wavelengths fit around the n = 5 orbit, and what is λ₅ for hydrogen? (Answer: exactly 5, by the quantisation condition itself; λ₅ = 2π × 0.53 × 25/5 = 16.6 Å.)

Formula Sheet — One-Glance Recap
• Scattering: impact parameter b = (Ze²/(4πε₀ × ½mv²))cot(θ/2) — small b, large θ
• Scattering: distance of closest approach r₀ = 2Ze²/(4πε₀ × KE) — head-on only, from the nuclear centre
• Force balance: mv²/r = (1/4πε₀)Ze²/r² — Coulomb attraction supplies the centripetal force
• Quantisation: mvr = nh/2π, n = 1, 2, 3, ... — equivalently 2πr = nλ
• Orbit radius: r_n = 0.53 n²/Z Å — Bohr radius a₀ = 0.53 Å (H, n = 1)
• Orbit speed: v_n = 2.19 × 10⁶ Z/n m/s — ground-orbit H speed is c/137
• Total energy: E_n = −13.6 Z²/n² eV — H levels −13.6, −3.4, −1.51, −0.85, −0.54 eV
• Energy split: KE_n = +13.6 Z²/n² eV, PE_n = −27.2 Z²/n² eV — always KE = −E, PE = 2E
• Transition: hf = E_i − E_f, and the pocket converter hc = 1240 eV·nm, λ(nm) = 1240/E(eV)
• Rydberg: 1/λ = RZ²(1/n_f² − 1/n_i²), R = 1.097 × 10⁷ m⁻¹ — series limit λ = n_f²/(RZ²)
• Excitation (ground → n): 13.6(1 − 1/n²) eV — first excitation 10.2 eV; ionisation from n: 13.6 Z²/n² eV
• Revolution frequency: f_n = v_n/(2πr_n) ∝ Z²/n³ — H ground orbit ≈ 6.6 × 10¹⁵ Hz
• de Broglie: λ = h/(mv) — standing wave 2πr_n = nλ_n, λ_n = 2πr_n/n

Common Mistakes and Exam Traps
• Mistake 1 — Using Z = 2 (the alpha's charge) inside the scattering formulas. Why wrong: the 2e of the alpha is already built into r₀ = 2Ze²/(...) and the b formula. Correct principle: Z is always the nucleus — 79 for gold, 47 for silver.
• Mistake 2 — Computing r₀ with the alpha's energy left in MeV. Why wrong: the Coulomb constant works in SI, so KE must be in joules; 1 eV = 1.602 × 10⁻¹⁹ J is not optional decoration. Correct principle: convert energy units before touching 4πε₀, or use the shortcut ke² = 1.44 eV·nm consistently in eV and nm.
• Mistake 3 — Saying Rutherford's model failed to explain alpha scattering. Why wrong: scattering is its one great success. Correct principle: its failures are (a) stability — classical radiation should collapse the atom in ~10⁻⁸ s, and (b) spectra — it predicts a continuous smear, not lines.
• Mistake 4 — Applying E_n = −13.6 Z²/n² to neutral helium or any multi-electron atom. Why wrong: Bohr's derivation assumes one electron around a bare nucleus. Correct principle: hydrogen-like species only — H (Z = 1), He⁺ (Z = 2), Li²⁺ (Z = 3).
• Mistake 5 — Reporting kinetic energy as negative. Why wrong: KE = ½mv² ≥ 0 always; in the nth orbit KE = +13.6 Z²/n² eV. Correct principle: PE = 2E carries all the negativity; check every orbit answer with KE = −E and PE = 2E.
• Mistake 6 — Swapping series extremes: quoting 364.6 nm as Balmer's longest wavelength. Why wrong: 364.6 nm is the series LIMIT (∞→2, the biggest energy step, hence shortest λ). Correct principle: longest λ = first line (n_f + 1 → n_f); shortest λ = limit (∞ → n_f).
• Mistake 7 — Treating a 12 eV photon and a 12 eV electron as equally able to excite hydrogen. Why wrong: photons are absorbed whole or not at all, and 12 eV matches no gap. Correct principle: photon energy must equal a gap exactly (or exceed ionisation); electrons can donate part of their energy.
• Mistake 8 — Putting r = nλ or 2r = nλ in the de Broglie condition. Why wrong: the wave must close around the full circle. Correct principle: circumference 2πr_n = nλ_n — then λ_n = 2πr_n/n, growing ∝ n.
• Mistake 9 — Calling 10.2 eV the ionisation energy of hydrogen. Why wrong: 10.2 eV is the FIRST EXCITATION energy (1→2); ionisation is 13.6 eV. Correct principle: excitation reaches a bound rung; ionisation reaches E = 0. From level n, ionisation = 13.6/n² eV.
• Mistake 10 — Expecting absorption and emission lines at different wavelengths for the same gas. Why wrong: both are set by the same level gaps. Correct principle: dark absorption lines sit exactly on the bright emission wavelengths.

Worked Examples — Exam Patterns
• EXAMPLE 1 — Problem: An alpha particle of energy 7.7 MeV approaches a gold nucleus (Z = 79) head-on. Find the distance of closest approach.
• Given: KE = 7.7 MeV = 7.7 × 10⁶ × 1.602 × 10⁻¹⁹ J = 1.234 × 10⁻¹² J; Z = 79; 1/4πε₀ = 8.99 × 10⁹
• Principle: Head-on collision — all KE converts to PE at the turning point: KE = (1/4πε₀)(2Ze²)/r₀
• Steps: r₀ = 8.99 × 10⁹ × 2 × 79 × (1.602 × 10⁻¹⁹)² / 1.234 × 10⁻¹² = 3.64 × 10⁻²⁶ / 1.234 × 10⁻¹² ≈ 2.95 × 10⁻¹⁴ m
• Answer: r₀ ≈ 3.0 × 10⁻¹⁴ m ≈ 30 fm
• Reasoning: The alpha stops 30 fm from the centre, still far outside the ~7 fm gold nucleus — consistent with Rutherford scattering (pure Coulomb force) remaining valid at this energy.
• Mistake: Using Z = 2 or forgetting the MeV → J conversion shrinks or explodes the answer by orders of magnitude; always convert first.
• EXAMPLE 2 — Problem: For 5 MeV alphas on gold, find the impact parameter of particles scattered at exactly 90°.
• Given: KE = 5 MeV = 8.01 × 10⁻¹³ J; θ = 90° so cot(θ/2) = cot45° = 1; Z = 79
• Principle: b = (Ze²/(4πε₀ × KE)) × cot(θ/2), and note Ze²/(4πε₀ × KE) = r₀/2
• Steps: r₀ for 5 MeV = 4.55 × 10⁻¹⁴ m (scale Example 1 by 7.7/5), so b = r₀/2 × 1 = 2.28 × 10⁻¹⁴ m
• Answer: b ≈ 2.3 × 10⁻¹⁴ m ≈ 23 fm
• Reasoning: A 90° scatter needs a genuinely close pass — tens of femtometres, deep inside the atom — which is why large-angle events are rare: the target area πb² for such passes is minuscule.
• Mistake: Quoting b = r₀. The factor ½ matters: b(90°) = r₀/2 because cot45° = 1 multiplies Ze²/(4πε₀ KE), not the full r₀ expression.
• EXAMPLE 3 — Problem: For the electron in hydrogen's n = 2 orbit, find the orbit radius, speed, total energy and frequency of revolution.
• Given: n = 2, Z = 1; r_n = 0.53 n² Å; v_n = 2.19 × 10⁶/n m/s; E_n = −13.6/n² eV
• Principle: Direct scaling laws from Bohr's two equations
• Steps: r₂ = 0.53 × 4 = 2.12 Å; v₂ = 2.19 × 10⁶/2 = 1.09 × 10⁶ m/s; E₂ = −13.6/4 = −3.40 eV; f = v/(2πr) = 1.09 × 10⁶/(2π × 2.12 × 10⁻¹⁰) = 8.2 × 10¹⁴ Hz
• Answer: r = 2.12 Å, v = 1.09 × 10⁶ m/s, E = −3.40 eV, f ≈ 8.2 × 10¹⁴ Hz
• Reasoning: Cross-check with scaling: f ∝ 1/n³, and f₁ = 6.6 × 10¹⁵ Hz, so f₂ = 6.6 × 10¹⁵/8 = 8.2 × 10¹⁴ Hz — the two routes agree.
• Mistake: Using r = 0.53 × n instead of n² gives 1.06 Å; the radius grows quadratically, and the frequency check exposes the error instantly.
• EXAMPLE 4 — Problem: Calculate the wavelength and photon energy of the H-alpha line (3→2).
• Given: n_i = 3, n_f = 2; R = 1.097 × 10⁷ m⁻¹; hc = 1240 eV·nm
• Principle: Rydberg formula, or energy gap then λ = hc/E
• Steps: E = 13.6 × (1/4 − 1/9) = 13.6 × 5/36 = 1.89 eV; λ = 1240/1.89 = 656 nm. Check via Rydberg: 1/λ = 1.097 × 10⁷ × 5/36 = 1.524 × 10⁶ m⁻¹ → λ = 6.56 × 10⁻⁷ m
• Answer: λ = 656.3 nm (red), E = 1.89 eV
• Reasoning: 656 nm sits mid-visible — consistent with Balmer (n_f = 2) being the visible series.
• Mistake: Writing (1/9 − 1/4) gives a negative 1/λ; the final level's term always comes first and is larger.
• EXAMPLE 5 — Problem: Find the longest and shortest wavelengths of the Balmer series.
• Given: Balmer n_f = 2; R = 1.097 × 10⁷ m⁻¹
• Principle: Longest λ = smallest gap = first line (3→2); shortest λ = limit (∞→2)
• Steps: Longest: 1/λ = R(1/4 − 1/9) → λ = 656.3 nm (Example 4). Shortest: 1/λ = R(1/4 − 0) = R/4 → λ = 4/R = 364.6 nm
• Answer: Range 364.6 nm to 656.3 nm
• Reasoning: 364.6 nm is just past the violet edge of the visible — the Balmer series crowds and dies right at the UV border, exactly as photographed spectra show.
• Mistake: Assigning the limit to the longest wavelength. Limit = ∞ → n_f = LARGEST step = SHORTEST wavelength. Say it as a chant.
• EXAMPLE 6 — Problem: (a) What photon wavelength ionises hydrogen from n = 2? (b) What wavelength excites hydrogen from the ground state to n = 3?
• Given: Ionisation from n: 13.6/n² eV; excitation ground→n: 13.6(1 − 1/n²) eV; λ = 1240/E nm
• Principle: Convert required energy to wavelength with hc = 1240 eV·nm
• Steps: (a) E = 13.6/4 = 3.4 eV → λ = 1240/3.4 = 365 nm. (b) E = 13.6 × (1 − 1/9) = 12.09 eV → λ = 1240/12.09 = 102.6 nm
• Answer: (a) 365 nm or shorter ionises n = 2 atoms; (b) exactly 102.6 nm excites 1→3
• Reasoning: (a) equals the Balmer limit 364.6 nm — ionisation from n = 2 and the Balmer limit are the same threshold viewed from opposite sides. (b) is the Lyman-beta line.
• Mistake: For (a), answering 91.2 nm (the ground-state threshold). The electron's starting rung decides the bill: from n = 2 it is 3.4 eV, not 13.6 eV.
• EXAMPLE 7 — Problem: Find the de Broglie wavelength of the electron in hydrogen's n = 3 orbit, two ways.
• Given: r₃ = 0.53 × 9 = 4.77 Å; v₃ = 2.19 × 10⁶/3 = 7.3 × 10⁵ m/s; h = 6.63 × 10⁻³⁴ J·s; m = 9.11 × 10⁻³¹ kg
• Principle: Standing wave: λ = 2πr/n; definition: λ = h/(mv)
• Steps: Standing wave: λ = 2π × 4.77/3 = 9.99 Å. Definition: λ = 6.63 × 10⁻³⁴/(9.11 × 10⁻³¹ × 7.3 × 10⁵) = 9.97 × 10⁻¹⁰ m ≈ 9.97 Å
• Answer: λ₃ ≈ 10 Å ≈ 1.0 nm, exactly 3 of which wrap the third orbit
• Reasoning: The agreement is not a coincidence — the standing-wave condition IS Bohr's postulate rewritten; both calculations must always match, making this a built-in error detector.
• Mistake: Computing λ = 2πr₃ = 30 Å (that is the circumference, holding n = 3 wavelengths), or using diameter. Divide the circumference by n.
• EXAMPLE 8 — Problem: For He⁺ (Z = 2), find the ground-state energy, the ionisation energy, and the wavelength of the 2→1 line.
• Given: Z = 2; E_n = −13.6 Z²/n² eV; λ = 1240/E nm
• Principle: All Bohr energies scale by Z² = 4
• Steps: E₁ = −13.6 × 4 = −54.4 eV, so ionisation energy = 54.4 eV. The 2→1 gap: ΔE = 54.4 × (1 − 1/4) = 40.8 eV → λ = 1240/40.8 = 30.4 nm
• Answer: E₁ = −54.4 eV; ionisation energy 54.4 eV; λ(2→1) = 30.4 nm (far ultraviolet)
• Reasoning: Same pattern as hydrogen's Lyman-alpha (121.5 nm) but Z² = 4 times the energy and one quarter the wavelength — He⁺'s whole spectrum is hydrogen's, compressed by 4.
• Mistake: Scaling wavelengths by Z² in the same direction as energies. Energy ∝ Z², wavelength ∝ 1/Z² — He⁺ lines are SHORTER, not longer.

Practice Questions — Self-Test Set
• Q1 (single correct) — In the alpha-scattering experiment, the observation that about 1 in 8000 alphas rebounds by more than 90° directly implies: (A) the atom is mostly empty space (B) the positive charge is spread uniformly through the atom (C) a tiny, massive, highly charged centre exists (D) electrons revolve in quantised orbits
• Q2 (numerical) — An alpha particle of 10 MeV is fired head-on at a silver nucleus (Z = 47). The distance of closest approach is closest to: (A) 1.35 × 10⁻¹⁴ m (B) 2.7 × 10⁻¹⁴ m (C) 5.4 × 10⁻¹⁴ m (D) 1.35 × 10⁻¹³ m
• Q3 (multiple correct) — For the electron in hydrogen's n = 3 orbit (r = 4.77 Å, E = −1.51 eV), which statements are true? (A) its kinetic energy is +1.51 eV (B) its potential energy is −3.02 eV (C) its angular momentum is 3h/2π (D) its de Broglie wavelength is 4.77 Å
• Q4 (numerical) — The wavelength of the first Paschen line (4→3) of hydrogen is: (A) 656 nm (B) 121.5 nm (C) 1875 nm (D) 820 nm
• Q5 (assertion–reason) — Assertion: A 12.09 eV photon can excite ground-state hydrogen to n = 3, but a 12.5 eV photon cannot be absorbed by ground-state hydrogen at all. Reason: A photon is absorbed only when its energy exactly equals an allowed energy gap (or exceeds the ionisation energy). (A) Both true, reason explains assertion (B) Both true, reason does not explain (C) Assertion true, reason false (D) Assertion false, reason true
• Q6 (statement based) — Statement I: The Balmer series limit (364.6 nm) equals the minimum wavelength that can ionise hydrogen from n = 2. Statement II: Ionisation from n = 2 requires 3.4 eV, and 1240/3.4 ≈ 365 nm. (A) Both statements true (B) I true, II false (C) I false, II true (D) Both false
• Q7 (numerical) — The ratio of the radius of the n = 4 orbit to the n = 1 orbit in Li²⁺ (Z = 3) is: (A) 4 (B) 16 (C) 12 (D) 48
• Q8 (single correct) — The de Broglie wavelength of the electron in hydrogen's ground orbit (r = 0.53 Å) is: (A) 1.06 Å (B) 3.33 Å (C) 6.66 Å (D) 0.53 Å

▸ Answer Key and the Traps Behind the Options
• Q1 — Answer: C. Misconception watch: option A (empty space) is implied by the particles that pass STRAIGHT, not by the rare rebounds; rebounds need a concentrated massive charge. D imports Bohr into an experiment that predates him.
• Q2 — Answer: A. r₀ = 2 × 47 × 1.44 eV·nm / 10⁷ eV (using ke² = 1.44 eV·nm) = 135.4/10⁷ nm = 1.35 × 10⁻⁵ nm = 1.35 × 10⁻¹⁴ m. Misconception watch: B doubles it by using b = 0 confusion or Z = 94; D is a power-of-ten slip in the nm → m conversion.
• Q3 — Answer: A, B and C. KE = −E = +1.51 eV ✓; PE = 2E = −3.02 eV ✓; L = nh/2π with n = 3 ✓. D fails: λ = 2πr/n = 2π × 4.77/3 ≈ 10 Å, not 4.77 Å — the radius is not the wavelength.
• Q4 — Answer: C. 1/λ = R(1/9 − 1/16) gives λ = 1875 nm. Misconception watch: D (820 nm) is the Paschen LIMIT (∞→3) — the longest/shortest swap trap again; A is H-alpha, a different series entirely.
• Q5 — Answer: A. 12.09 eV is exactly the 1→3 gap; 12.5 eV matches no gap and is below the 13.6 eV ionisation threshold, so it passes through unabsorbed. The reason is precisely why.
• Q6 — Answer: A. Both statements are true, and II is the computation behind I. The same threshold wears two hats — spotting such identities is worth marks.
• Q7 — Answer: B. r ∝ n² (Z is the same for both orbits of the same ion and cancels): ratio = 16/1 = 16. Misconception watch: Z = 3 is bait for A (4 × ... ) and C; within one species, only n matters for ratios.
• Q8 — Answer: B. λ₁ = 2πr₁/1 = 2π × 0.53 = 3.33 Å. Misconception watch: A uses the diameter 2r; D just repeats the radius; C is the n = 2 value (2πr₂/2 = 6.65 Å) — know the λ ∝ n ladder.

Summary, Revision Checklist and Self-Assessment
• Summary: Geiger–Marsden scattering (most alphas straight, ~1 in 8000 rebounded) killed the plum pudding and established Rutherford's nucleus — tiny (≲10⁻¹⁴ m), massive, charged Ze, with electrons around it in a mostly empty atom described by b = (Ze²/(4πε₀ × ½mv²))cot(θ/2) and r₀ = 2Ze²/(4πε₀ × KE). Classical physics then broke the model (radiating electrons should collapse it in ~10⁻⁸ s, and it predicts continuous spectra), while real atoms emit discrete line spectra. Bohr's postulates — stationary orbits, mvr = nh/2π, hf = E_i − E_f — produced r_n = 0.53 n²/Z Å, v_n = 2.19 × 10⁶ Z/n m/s, E_n = −13.6 Z²/n² eV with KE = −E and PE = 2E. Transitions on the level staircase give the Rydberg formula 1/λ = RZ²(1/n_f² − 1/n_i²) and the five series (Lyman UV, Balmer visible, Paschen/Brackett/Pfund IR). Excitation costs 13.6(1 − 1/n²) eV from the ground state; ionisation from level n costs 13.6 Z²/n² eV. De Broglie's standing wave 2πr = nλ explains the quantisation rule that Bohr merely postulated.
• The six results to reproduce asleep: (1) r₀ with energy in joules and Z = nucleus; (2) radius/speed/energy scalings n², 1/n, 1/n² with Z, 1/Z placed correctly; (3) KE = −E, PE = 2E; (4) Rydberg with n_f = series level, longest = first line, shortest = limit; (5) series limits 91.2 and 364.6 nm; (6) 2πr = nλ turning into mvr = nh/2π.
• Revision checklist: □ I can state all three scattering observations and match each to its conclusion □ I convert MeV → J (or use ke² = 1.44 eV·nm) before computing r₀ □ I keep Bohr for hydrogen-like species only □ I state the six hydrogen level energies from memory □ I use the ratio method (scaling) instead of recomputing constants □ I identify any series from its n_f and quote both its extreme wavelengths □ I distinguish photon absorption (exact gap) from electron collisions (partial energy allowed) □ I derive Bohr's postulate from 2πr = nλ in three steps □ I check orbit answers with KE = −E, PE = 2E.
• Self-assessment — answer honestly: (1) Why does a 5 MeV alpha get closer to a gold nucleus than a 7.7 MeV one is FALSE — which is bigger, r₀ at 5 or 7.7 MeV? (2) The electron in hydrogen jumps 4→1 and 4→3; which photon is more energetic and which series does each belong to? (3) An atom absorbs a 10.2 eV photon from the ground state — where is the electron now, and what is the longest-wavelength photon it can emit coming home? (4) Why does Bohr's model, exact for He⁺, say nothing reliable about neutral helium? If any answer stalls, revisit: (1) the closest-approach section, (2) the level diagram and Rydberg sections, (3) the excitation section, (4) the postulates section. (Answers: (1) r₀ at 5 MeV — lower energy stops farther out, 45.5 fm vs 29.5 fm. (2) 4→1 is Lyman, 12.75 eV; 4→3 is Paschen, 0.66 eV — the Lyman photon wins by far. (3) n = 2; coming home directly it emits 10.2 eV (121.5 nm Lyman-alpha) — that is also the longest wavelength it can emit, since 2→1 is its only downward jump. (4) Neutral helium has TWO electrons; Bohr's derivation needs exactly one electron and a bare nuclear charge.)
<!-- END phys_ch_26 detailedStudyNotes -->
