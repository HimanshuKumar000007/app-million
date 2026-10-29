<!-- BEGIN phys_ch_28 detailedStudyNotes -->
Introduction — the Material You Can Tune
• Here is the miracle of this chapter: take a crystal of pure silicon — nearly an insulator — add one impurity atom in a million, and it becomes a conductor whose behaviour YOU choose
• Every phone, laptop, LED bulb and solar panel on Earth is built on this one idea: a semiconductor is a material whose conductivity sits between a metal and an insulator, and can be engineered at will
• DEFINITION — A semiconductor is a material whose electrical conductivity lies between that of conductors and insulators, and which rises sharply with temperature, light or controlled impurity doping
• EXAMPLE — Copper conducts at about 6 × 10⁷ S/m, glass insulates at about 10⁻¹² S/m, and silicon sits in between near 4 × 10⁻⁴ S/m when pure — but doping can raise that by a factor of a million
• WHY this matters for IAT: this chapter is short, formula-light and logic-heavy — the marks come from band pictures, carrier counting, diode circuits and truth tables, all of which reward clear thinking over memorisation
• ★ HIGHLIGHT — The whole chapter hangs on three questions: who carries the current (electrons or holes), which way the junction lets it flow, and how gates turn voltages into logic
• YOUR TURN — A material's conductivity falls when heated. Is it more likely a metal or a semiconductor? Answer: a metal — semiconductors conduct BETTER when heated, because heat frees more carriers; metals conduct worse because lattice vibrations scatter the carriers they already have

Energy Bands — Valence, Conduction and the Gap
• In a single atom, electrons live at sharp energy levels. Pack 10²³ atoms into a crystal and each level smears into a BAND of closely spaced levels
• DEFINITION — The valence band is the highest band that is (nearly) filled with electrons at low temperature; the conduction band is the next band above it, where electrons are free to move through the crystal
• DEFINITION — The forbidden gap E_g is the energy interval between the top of the valence band and the bottom of the conduction band, in which no electron states exist
• An electron can carry current only if it sits in the conduction band — or if it leaves behind a hole in a nearly full valence band. The gap decides how many electrons can make the jump
• ✔ KEY FORMULA — An electron crosses the gap only by gaining energy of at least E_g, supplied by heat, light or an electric field
• EXAMPLE — Shine light of photon energy below E_g on silicon and nothing happens; above E_g each photon can lift one electron across, creating an electron–hole pair — this is exactly how a photodiode and a solar cell work
• WORKED PATTERN — Band questions are comparison questions: bigger gap means fewer thermally excited carriers, means lower conductivity, means the material behaves more like an insulator at room temperature
• ⚠ EXAM TRAP — The gap is a range of FORBIDDEN energies, not a physical space between bands. Electrons never sit inside the gap; they jump across it
• YOUR TURN — Diamond (carbon) has E_g ≈ 5.5 eV while silicon has 1.1 eV. At room temperature (kT ≈ 0.026 eV), which is the insulator? Answer: diamond — its gap is over 200 times kT, so essentially no electron ever gains enough thermal energy to cross

▸ Three Families Judged by the Gap
• DEFINITION — In a conductor the valence and conduction bands overlap, so electrons reach conducting states with no energy cost at all
• DEFINITION — In an insulator the forbidden gap is huge (about 5 eV or more), so at ordinary temperatures virtually no electron can cross it
• DEFINITION — In a semiconductor the gap is small (about 1 eV): germanium 0.67 eV, silicon 1.1 eV — small enough for heat or light to promote a useful number of electrons
• ★ HIGHLIGHT — Memorise the two exam numbers cold: E_g(Ge) ≈ 0.7 eV and E_g(Si) ≈ 1.1 eV. Band-gap ordering questions are free marks
• EXAMPLE — Why did silicon beat germanium in industry? Its larger gap means less unwanted thermal carrier generation at high temperature, and its oxide (SiO₂) forms a perfect natural insulator on its surface
• WORKED PATTERN — Given any material and its gap, classify instantly: overlap or zero gap = conductor; gap near 1 eV = semiconductor; gap 5 eV or more = insulator
• ⚠ EXAM TRAP — Do not call a semiconductor a bad conductor. Its defining feature is not weakness but CONTROL: conductivity tunable by doping, temperature and light over many orders of magnitude
• YOUR TURN — A crystal has a forbidden gap of 0.67 eV. Name it and its family. Answer: germanium, a semiconductor

Intrinsic Semiconductors — Pure and Perfectly Balanced
• DEFINITION — An intrinsic semiconductor is a semiconductor in its pure form, with no added impurity, where every conduction electron exists because a bond broke and left a hole behind
• At absolute zero a pure semiconductor is an insulator: the valence band is full, the conduction band empty. Warm it, and thermal energy snaps a few covalent bonds
• Each broken bond creates TWO carriers at once: one free electron in the conduction band and one hole in the valence band. This is called an electron–hole pair
• ✔ KEY FORMULA — In an intrinsic semiconductor, n_e = n_h = n_i, where n_i is the intrinsic carrier concentration, which grows extremely fast with temperature
• EXAMPLE — For pure silicon at 300 K, n_i ≈ 1.5 × 10¹⁶ carriers per m³ of each type — compare this with about 5 × 10²⁸ atoms per m³: only about one atom in three trillion contributes a carrier at any instant, which is why pure silicon conducts so feebly
• WHY the balance is exact: pairs are born together and die together (recombination), so in a pure crystal the two populations can never drift apart
• ⚠ EXAM TRAP — n_i depends ONLY on the material and temperature — never on the shape or size of the sample, and doping changes n_e and n_h individually but never their product at a fixed temperature
• YOUR TURN — If heating pure silicon doubles n_i, what happens to n_e and n_h separately? Answer: both double — the equality n_e = n_h = n_i survives at every temperature in a pure sample

▸ Electrons and Holes — the Two Carriers
• DEFINITION — A hole is the vacant state left in the valence band when an electron escapes; it behaves as a mobile carrier of charge +e, moving opposite to the electrons that shuffle into it
• Watch the hole move: a neighbouring valence electron hops into the vacancy, so the vacancy appears one atom further along. Thousands of hops look like one positive charge drifting smoothly
• ✔ KEY FORMULA — Total current in a semiconductor is the sum of electron current and hole current: I = I_e + I_h, and both carriers drift in the SAME direction of conventional current (electrons move against the field, holes along it)
• EXAMPLE — In intrinsic silicon at 300 K the conductivity works out to σ = n_i e (μ_e + μ_h) ≈ 4.4 × 10⁻⁴ S/m, with electrons contributing more than holes because they are more mobile: μ_e ≈ 0.135 m²/Vs against μ_h ≈ 0.048 m²/Vs
• ★ HIGHLIGHT — Electrons are roughly three times as mobile as holes in silicon. Whenever a question asks which carrier dominates the CURRENT (not the count), mobility is the tiebreaker
• WORKED PATTERN — Mobility μ = drift velocity per unit field. If a problem gives you n, e and μ, conductivity is one multiplication: σ = n e μ for one carrier type, summed over types when both exist
• ⚠ EXAM TRAP — A hole is not a real particle like a proton or positron; it is a bookkeeping object for the collective motion of valence electrons. But for every circuit calculation you may treat it exactly like a +e charge — the physics comes out right
• YOUR TURN — In a sample, n_e = 10²² /m³, n_h ≈ 0, μ_e = 0.1 m²/Vs. Estimate σ. Answer: σ ≈ n_e e μ_e = 10²² × 1.6 × 10⁻¹⁹ × 0.1 ≈ 160 S/m — doping has raised silicon's conductivity by nearly a million times over the pure value

Extrinsic Semiconductors — Doping on Purpose
• DEFINITION — Doping is the deliberate addition of a tiny, controlled amount of a suitable impurity to a pure semiconductor to engineer its carrier population; the result is an extrinsic semiconductor
• Silicon and germanium are group-14 elements: every atom bonds to four neighbours. The trick is to replace a rare host atom with a group-15 or group-13 guest
• A group-15 atom (phosphorus, arsenic) brings FIVE valence electrons: four complete the bonds, the fifth is loosely held and pops into the conduction band with a nudge of about 0.05 eV. It is a DONOR — it donates an electron
• A group-13 atom (boron, indium) brings only THREE valence electrons: one bond stays incomplete, and that vacancy is a hole ready to accept an electron. It is an ACCEPTOR — it accepts electrons, creating holes
• ✔ KEY FORMULA — The mass-action law: at a fixed temperature, n_e × n_h = n_i² holds for intrinsic AND doped samples alike — boosting one carrier crushes the other
• EXAMPLE — Dope silicon with donors at 10²² /m³ and electrons jump to about 10²² /m³; the hole population collapses to n_i² / n_e = (1.5 × 10¹⁶)² / 10²² ≈ 2.3 × 10¹⁰ /m³ — twelve orders of magnitude fewer holes than electrons
• WHY the product stays fixed: more electrons means each hole finds a recombination partner faster, so the hole population settles lower until generation and recombination balance again
• ⚠ EXAM TRAP — A doped crystal is still electrically NEUTRAL overall. The extra conduction electrons are balanced by the fixed positive donor ions in n-type (and holes by negative acceptor ions in p-type). Doping adds carriers, not net charge
• YOUR TURN — Donor concentration is 4.5 × 10²¹ /m³ in silicon with n_i = 1.5 × 10¹⁶ /m³. Find the hole concentration. Answer: n_h = n_i² / N_D = 2.25 × 10³² / 4.5 × 10²¹ = 5 × 10¹⁰ /m³, while n_e ≈ 4.5 × 10²¹ /m³

▸ n-Type and p-Type Side by Side
• DEFINITION — An n-type semiconductor is doped with donors: electrons are the majority carriers, holes the minority carriers, and fixed donor ions carry charge +e each
• DEFINITION — A p-type semiconductor is doped with acceptors: holes are the majority carriers, electrons the minority carriers, and fixed acceptor ions carry charge −e each
• ★ HIGHLIGHT — Read the name from the majority carrier's charge: n for negative (electrons), p for positive (holes). The letter never refers to the crystal's net charge, which is zero
• WORKED PATTERN — For any doped sample: majority concentration ≈ doping concentration (N_D or N_A); minority = n_i² / doping concentration. Two lines, every numerical in this topic solved
• EXAMPLE — Conductivity shows the payoff: n-type silicon with n_e = 5 × 10²¹ /m³ and μ_e = 0.14 m²/Vs has σ ≈ 5 × 10²¹ × 1.6 × 10⁻¹⁹ × 0.14 ≈ 112 S/m — a respectable conductor built from a near-insulator
• ⚠ EXAM TRAP — Minority carriers are few but not irrelevant: the reverse saturation current of a diode is carried almost entirely by minority carriers, and it roughly doubles for every 10 °C rise in temperature
• YOUR TURN — A p-type sample has N_A = 10²¹ /m³ and n_i = 10¹⁶ /m³. State both carrier concentrations. Answer: n_h ≈ 10²¹ /m³ (majority) and n_e = n_i² / N_A = 10³² / 10²¹ = 10¹¹ /m³ (minority)

The p–n Junction — Depletion Layer and Barrier
• Fuse one crystal so that half is p-type and half is n-type. At the boundary, majority carriers spill across: electrons diffuse from n to p, holes from p to n
• Each crossing carrier leaves an uncovered fixed ion behind and annihilates on the far side. A thin layer around the junction is stripped of mobile carriers — the DEPLETION REGION, about a micrometre wide
• DEFINITION — The depletion region is the carrier-free zone around a p–n junction containing only uncovered fixed ions: negative acceptor ions on the p-side, positive donor ions on the n-side
• Those fixed charges build an internal electric field pointing from n to p, and a corresponding potential step: the BARRIER POTENTIAL, about 0.7 V for silicon and 0.3 V for germanium at room temperature
• DEFINITION — The barrier potential is the potential difference across the depletion region at equilibrium that exactly stops further net diffusion of majority carriers
• WHY equilibrium is reached: diffusion pushes carriers across; the barrier's field drifts them back. When drift balances diffusion, net current is zero — a dynamic balance, not a frozen one
• ★ HIGHLIGHT — Diffusion current and drift current at an unbiased junction are equal and opposite. Every bias question in this chapter asks: which of the two did the battery just help?
• ⚠ EXAM TRAP — You cannot measure the barrier potential by touching a voltmeter across an unbiased junction — contact potentials at the probes cancel it exactly. It reveals itself only through the diode's behaviour
• YOUR TURN — Which way does the junction's internal field point, and which carriers does it push back? Answer: from the n-side to the p-side; it pushes majority carriers (electrons on the n-side, holes on the p-side) away from the junction, opposing diffusion

Biasing the Diode — Forward and Reverse
• DEFINITION — Forward bias: the p-side is connected to the positive terminal and the n-side to the negative. The battery opposes the barrier, the depletion layer narrows, and large current flows once the applied voltage nears the barrier height
• DEFINITION — Reverse bias: the p-side goes to the negative terminal and the n-side to the positive. The battery reinforces the barrier, the depletion layer widens, and only a tiny minority-carrier saturation current (microamperes) flows
• ✔ KEY FORMULA — Forward current rises exponentially with voltage after the knee; reverse current stays nearly constant at the saturation value until breakdown
• EXAMPLE — A silicon diode in a circuit behaves, for quick estimates, like a 0.7 V toll booth: subtract 0.7 V from the supply, and divide what remains by the resistance to get the current
• WHY reverse current is so small: it is fed only by the few thermally generated minority carriers, and the wide barrier sweeps every one of them across — raising the voltage widens the road but adds no new carriers
• ⚠ EXAM TRAP — Reverse breakdown is not automatically destruction. Within rated current (and with a series resistor to limit it), a diode survives breakdown — the Zener diode is designed to live there. What kills diodes is excess power, not the breakdown voltage alone
• YOUR TURN — A reverse-biased diode's temperature rises by 20 °C. What happens to its reverse current? Answer: it grows roughly fourfold — the minority-carrier population, which feeds this current, about doubles per 10 °C

▸ V–I Characteristics, Knee and Breakdown
• Plot the diode's current against its voltage and the whole personality of the device appears on one graph
• Forward side: below the KNEE voltage (≈ 0.7 V for Si, ≈ 0.3 V for Ge) current is negligible; past the knee it rockets upward — a few tenths of a volt multiply it many times over
• DEFINITION — The knee (or cut-in) voltage is the forward voltage at which diode current starts rising steeply; it is close to, but not identical to, the barrier potential
• Reverse side: a small, nearly flat saturation current flows until the BREAKDOWN voltage, where the current surges: Zener breakdown (field tearing electrons from bonds, in heavily doped thin junctions, below about 6 V) or avalanche breakdown (carriers multiplying by collision, in lightly doped junctions)
• ★ HIGHLIGHT — On the V–I graph, remember three landmarks: knee at +0.7 V (Si), saturation current hugging the negative axis, breakdown at −V_Z. Graph-reading questions test exactly these
• WORKED PATTERN — For circuit numericals use the practical model: diode = fixed drop (0.7 V Si or 0.3 V Ge) when conducting, open circuit when reverse-biased or below the knee. It solves nearly every IAT-style circuit in two steps
• ⚠ EXAM TRAP — The diode is NOT ohmic: its V–I graph is a curve, not a straight line through the origin, so statements like the resistance of the diode is constant are always false. Dynamic resistance r_d = dV/dI changes from point to point
• YOUR TURN — A silicon diode carries a large forward current. A student measures 3 V across a series resistor and 0.7 V across the diode. If the supply is 3.7 V, is the data consistent? Answer: yes — supply = resistor drop + diode drop, and 0.7 V is precisely the conducting silicon drop

The Diode as a Rectifier
• DEFINITION — Rectification is the conversion of alternating current into direct (pulsating) current, using the diode's one-way conduction
• A single diode in series with a load passes only the half-cycles that forward-bias it and blocks the rest: HALF-WAVE rectification. The output is a train of positive humps with gaps between them
• ✔ KEY FORMULA — For a half-wave rectifier with peak input V_m: average output V_dc = V_m / π ≈ 0.318 V_m, and the ripple frequency equals the supply frequency
• ✔ KEY FORMULA — For a full-wave rectifier: average output V_dc = 2V_m / π ≈ 0.637 V_m, and the ripple frequency is TWICE the supply frequency
• The full-wave circuit (two diodes with a centre-tapped transformer, or four in a bridge) flips the negative half-cycle upright instead of discarding it: no gaps, double the average, smoother output
• EXAMPLE — Mains at 50 Hz: a half-wave charger pulses at 50 Hz, a full-wave one at 100 Hz — and the 100 Hz ripple is easier for a filter capacitor to smooth, which is why real supplies always use full-wave
• ⚠ EXAM TRAP — During the blocked half-cycle the diode must withstand the full peak voltage in reverse (peak inverse voltage = V_m for half-wave). And the output is PULSATING DC, not pure DC — a filter is still needed before it resembles a battery
• YOUR TURN — A full-wave rectifier is fed a peak of 20 V. Find its average output and ripple frequency on 50 Hz mains. Answer: V_dc = 2 × 20 / π ≈ 12.7 V, ripple at 100 Hz

▸ Half-Wave and Full-Wave Output in Numbers
• WORKED PATTERN — Every rectifier numerical is a ratio question: identify half or full wave, write the matching average formula, and never plug in the rms value where the peak belongs
• EXAMPLE — Peak input 24 V into a half-wave rectifier: average output = 24 / π ≈ 7.64 V, and the output rms value is V_m / 2 = 12 V
• ★ HIGHLIGHT — Convert carefully: if a problem gives the transformer secondary as 12 V rms, the peak is 12 × √2 ≈ 17 V BEFORE any formula is touched. This single step is where most rectifier marks are lost
• COMPARE — Half-wave: one diode, V_dc = 0.318 V_m, ripple at f, half the input wasted. Full-wave: V_dc = 0.637 V_m, ripple at 2f, every half-cycle used
• ⚠ EXAM TRAP — In a bridge rectifier two diodes conduct in each half-cycle, so the output peak is reduced by TWO diode drops (about 1.4 V for silicon), not one
• YOUR TURN — Why is a full-wave output easier to filter than half-wave, even before any capacitor is added? Answer: its humps repeat twice as often with no dead gaps, so the voltage never falls as far between peaks

Zener Diode — Regulation by Breakdown
• DEFINITION — A Zener diode is a heavily doped p–n junction designed to operate continuously in the reverse breakdown region, where its voltage stays almost constant over a wide range of current
• Connect it in reverse across a load, with a series resistor to absorb the supply fluctuations and limit the current. Whatever the input or load does (within limits), the load voltage stays pinned at V_Z
• ✔ KEY FORMULA — In a Zener regulator: current through the series resistor = (V_in − V_Z) / R, and the Zener takes whatever current the load does not: I_Z = I_total − I_L
• EXAMPLE — Supply 15 V, Zener voltage 6 V, series resistor 100 Ω, load drawing 20 mA. Total current = (15 − 6) / 100 = 90 mA; the Zener carries 90 − 20 = 70 mA and dissipates 6 × 0.070 = 0.42 W — so choose a Zener rated at least 0.5 W
• WHY it works: in breakdown the V–I curve is nearly vertical — large current changes cost almost no voltage change. The Zener acts like a pressure-relief valve for voltage
• ⚠ EXAM TRAP — A Zener regulator protects only within its ratings: if the load draws so much that the Zener current falls to zero (or the input dips so I_total < I_L), regulation collapses and the output follows the input down
• YOUR TURN — In the same circuit the load is disconnected. What current must the Zener now survive? Answer: the full 90 mA, dissipating 6 × 0.09 = 0.54 W — the worst case for the Zener is NO load, a classic design trap

▸ LED and Photodiode — Light Out, Light In
• DEFINITION — A light-emitting diode (LED) is a forward-biased p–n junction made of a direct-band-gap material, which emits photons when conduction electrons recombine with holes across the gap
• ✔ KEY FORMULA — The colour is set by the gap alone: photon energy E = hc / λ ≈ E_g. Red light (620 nm) needs E_g ≈ 1240 / 620 ≈ 2.0 eV, and the LED's forward voltage is roughly E_g / e ≈ 2 V
• EXAMPLE — Gallium arsenide phosphide (GaAsP) emits red and yellow; gallium phosphide emits green. Ordinary silicon (indirect gap) is a hopeless light emitter — its recombinations waste their energy as heat, which is why LEDs are never made of plain Si or Ge
• DEFINITION — A photodiode is a junction operated in REVERSE bias, where incident light creates electron–hole pairs in or near the depletion region and the reverse current grows in proportion to the light intensity
• ★ HIGHLIGHT — LED and photodiode are the same junction run in opposite quadrants: LED — forward bias, electrical energy in, light out; photodiode — reverse bias, light in, electrical signal out (the solar cell is its big, unbiased cousin)
• ⚠ EXAM TRAP — Photodiode current increases with illumination even though the diode is reverse-biased: the light manufactures the minority carriers that carry this current. More light, more carriers, more current — the diode becomes a light meter
• YOUR TURN — An LED must emit 500 nm light. What band gap does its material need? Answer: E_g ≈ 1240 / 500 ≈ 2.48 eV

Logic Gates — the Alphabet of Digital Electronics
• A gate is a circuit with one output and one or more inputs, where every signal is a binary level: high (1, typically +5 V) or low (0, typically 0 V). The output is decided by Boolean algebra
• DEFINITION — OR gate: output Y = A + B. The output is 1 if A OR B (or both) is 1. Think of two switches in parallel feeding a lamp
• • OR truth table — inputs (A, B) then output Y: (0, 0) gives 0; (0, 1) gives 1; (1, 0) gives 1; (1, 1) gives 1
• DEFINITION — AND gate: output Y = A · B. The output is 1 only if A AND B are both 1. Think of two switches in series
• • AND truth table — inputs (A, B) then output Y: (0, 0) gives 0; (0, 1) gives 0; (1, 0) gives 0; (1, 1) gives 1
• DEFINITION — NOT gate (inverter): output Y = Ā, the complement of the single input. Input 0 gives 1; input 1 gives 0
• ★ HIGHLIGHT — Each gate has a standard symbol: OR has a curved back and pointed nose; AND is flat-backed with a rounded nose; NOT is a triangle with a tiny circle (bubble) at the tip, and the bubble always means complement
• ⚠ EXAM TRAP — In Boolean algebra + means OR and · means AND — never addition and multiplication. A + A = A (not 2A), and A + 1 = 1, which looks wrong until you read it as logic
• YOUR TURN — A = 1, B = 0. Evaluate OR, AND and NOT A. Answer: OR gives 1; AND gives 0; NOT A gives 0

▸ NAND, NOR and Gate Combinations
• DEFINITION — NAND gate = AND followed by NOT: Y = complement of (A · B). Its output is 0 only when both inputs are 1
• • NAND truth table — (0, 0) gives 1; (0, 1) gives 1; (1, 0) gives 1; (1, 1) gives 0
• DEFINITION — NOR gate = OR followed by NOT: Y = complement of (A + B). Its output is 1 only when both inputs are 0
• • NOR truth table — (0, 0) gives 1; (0, 1) gives 0; (1, 0) gives 0; (1, 1) gives 0
• ★ HIGHLIGHT — NAND and NOR are called UNIVERSAL gates: either one alone can build NOT, AND and OR, and therefore every possible logic circuit. Join both inputs of a NAND together and it becomes a NOT gate
• WORKED PATTERN — For combination circuits, label the output of every inner gate first, feed those values forward one gate at a time, and build the truth table column by column. Never try to evaluate a two-level network in one leap
• EXAMPLE — Y = complement of (A + B) · C with A = 1, B = 0, C = 1: the OR gives 1, its complement is 0, and 0 AND 1 gives Y = 0
• KEY LAWS — Identity: A + 0 = A and A · 1 = A. Domination: A + 1 = 1 and A · 0 = 0. Complement: A + Ā = 1 and A · Ā = 0. De Morgan: complement of (A · B) = Ā + B̄, and complement of (A + B) = Ā · B̄
• ⚠ EXAM TRAP — De Morgan is the most-tested identity in this chapter: breaking a complement bar CHANGES the operation — AND becomes OR and OR becomes AND — while each variable gets complemented
• YOUR TURN — Simplify Y = complement of (A · B) using De Morgan and evaluate at A = 0, B = 1. Answer: Y = Ā + B̄ = 1 + 0 = 1

High-Yield Formula Sheet
• ✔ Band gap: E_g(Ge) ≈ 0.67 eV; E_g(Si) ≈ 1.1 eV; insulators ≳ 5 eV; conductors have overlapping bands
• ✔ Intrinsic balance: n_e = n_h = n_i, and conductivity σ = n_i e (μ_e + μ_h)
• ✔ Mass-action law (any sample, fixed temperature): n_e × n_h = n_i²; majority ≈ doping density, minority = n_i² / doping density
• ✔ Barrier potential: ≈ 0.7 V (Si), ≈ 0.3 V (Ge); knee voltage ≈ barrier potential; forward conducting diode ≈ fixed drop of the same size
• ✔ Diode circuit rule: I = (V_supply − V_knee) / R when forward; reverse current ≈ saturation current, doubling roughly every 10 °C
• ✔ Rectifiers: half-wave V_dc = V_m / π ≈ 0.318 V_m, ripple f; full-wave V_dc = 2V_m / π ≈ 0.637 V_m, ripple 2f
• ✔ Zener regulator: I_total = (V_in − V_Z) / R_series and I_Z = I_total − I_L; worst Zener stress occurs at zero load
• ✔ LED photon: E = hc / λ and E(eV) ≈ 1240 / λ(nm); forward voltage of an LED ≈ E_g / e
• ✔ Gates: OR — Y = A + B; AND — Y = A · B; NOT — Y = Ā; NAND — complement of (A · B); NOR — complement of (A + B)
• ✔ De Morgan: complement of (A · B) = Ā + B̄; complement of (A + B) = Ā · B̄; NAND and NOR are universal gates

Common Mistakes and Exam Traps
• ⚠ Mistake 1 — Saying a doped semiconductor is charged. Why wrong: donor and acceptor ions left in the lattice exactly balance the extra carriers. Correct principle: doping changes carrier COUNTS, never the net charge, which stays zero
• ⚠ Mistake 2 — Believing n_e × n_h changes with doping. Why wrong: the product is set by the material and temperature alone. Correct principle: n_e n_h = n_i² always; raise one carrier and the other falls by the same factor
• ⚠ Mistake 3 — Treating the hole as a real positively charged particle inside the crystal. Why wrong: it is the vacancy in the valence band. Correct principle: use holes as +e carriers in every calculation, but remember their microscopic origin when a statement question probes the idea
• ⚠ Mistake 4 — Assuming the diode drop is zero in numericals. Why wrong: examiners include the 0.7 V (Si) knee precisely so that I = V/R alone fails. Correct principle: subtract the knee first, then divide by R — unless the problem explicitly says ideal diode
• ⚠ Mistake 5 — Feeding rms voltage into rectifier average formulas. Why wrong: V_m / π and 2V_m / π are written for the PEAK. Correct principle: convert rms to peak (multiply by √2) before touching a rectifier formula
• ⚠ Mistake 6 — Putting the Zener in forward bias for regulation. Why wrong: forward it is an ordinary 0.7 V diode. Correct principle: regulation lives in reverse breakdown — the Zener is always reverse-connected in a regulator circuit
• ⚠ Mistake 7 — Reading Boolean + as arithmetic addition. Why wrong: A + A = A and A + 1 = 1 in logic. Correct principle: translate every gate problem into truth values, not sums and products of numbers
• ⚠ Mistake 8 — Confusing which gate gives 1 only for (0, 0) or 0 only for (1, 1). Why wrong: these two patterns are mirror images and easy to swap under pressure. Correct principle: NOR is 1 only at (0, 0); NAND is 0 only at (1, 1). Anchor both before the exam

Worked Examples — Basic to Challenging
• EXAMPLE 1 — Problem: Silicon with n_i = 1.5 × 10¹⁶ /m³ is doped with 4.5 × 10²¹ donors per m³. Find both carrier concentrations
• • Given: N_D = 4.5 × 10²¹ /m³, n_i = 1.5 × 10¹⁶ /m³. Principle: majority ≈ N_D; minority from mass action
• • Steps: n_e ≈ 4.5 × 10²¹ /m³; n_h = n_i² / N_D = (1.5 × 10¹⁶)² / 4.5 × 10²¹ = 2.25 × 10³² / 4.5 × 10²¹ = 5 × 10¹⁰ /m³
• • Answer: n_e ≈ 4.5 × 10²¹ /m³ and n_h ≈ 5 × 10¹⁰ /m³. Reasoning: the electron-to-hole ratio is nearly 10¹¹ — that is what majority means. Mistake to avoid: reporting n_h = n_i, which forgets that doping suppresses the minority
• EXAMPLE 2 — Problem: A 12 V supply drives a silicon diode in series with a 2 kΩ resistor and a load. Find the current and the load voltage
• • Given: V = 12 V, knee 0.7 V, R = 2000 Ω. Principle: subtract the knee, then Ohm
• • Steps: I = (12 − 0.7) / 2000 = 11.3 / 2000 = 5.65 × 10⁻³ A; V_load = 12 − 0.7 = 11.3 V
• • Answer: I ≈ 5.65 mA, V_load = 11.3 V. Reasoning: the resistor and load share whatever the diode does not take. Mistake to avoid: I = 12 / 2000 = 6 mA, the answer for a fictitious zero-drop diode
• EXAMPLE 3 — Problem: A half-wave rectifier receives a peak voltage of 24 V. Find the average output and the output rms value
• • Given: V_m = 24 V, half-wave. Principle: V_dc = V_m / π; half-wave rms = V_m / 2
• • Steps: V_dc = 24 / 3.1416 ≈ 7.64 V; V_rms = 24 / 2 = 12 V
• • Answer: V_dc ≈ 7.64 V, V_rms = 12 V. Reasoning: the average counts the missing negative half as zeros, which is why it sits far below the rms. Mistake to avoid: using 2V_m / π — that factor of 2 belongs to full-wave only
• EXAMPLE 4 — Problem: Design check a Zener regulator: input 15 V, V_Z = 6 V, series R = 100 Ω, load current 20 mA. Find the Zener current and its power dissipation, and the rating you would buy
• • Given: as stated. Principle: I_total = (V_in − V_Z) / R; I_Z = I_total − I_L; P = V_Z I_Z
• • Steps: I_total = 9 / 100 = 90 mA; I_Z = 90 − 20 = 70 mA; P_Z = 6 × 0.070 = 0.42 W
• • Answer: I_Z = 70 mA, P_Z = 0.42 W, so buy at least a 0.5 W Zener. Reasoning: at no load the Zener would face the full 90 mA (0.54 W), so a 1 W part is the safer real-world choice. Mistake to avoid: assuming all 90 mA flows through the load — the load takes only its 20 mA share
• EXAMPLE 5 — Problem: What band gap must a semiconductor have to emit 620 nm red light in an LED, and about what forward voltage will the LED need?
• • Given: λ = 620 nm. Principle: E_g ≈ hc / λ, with hc ≈ 1240 eV·nm
• • Steps: E_g ≈ 1240 / 620 = 2.0 eV; forward voltage ≈ E_g / e ≈ 2.0 V
• • Answer: about 2.0 eV and about 2 V. Reasoning: each recombining pair surrenders roughly E_g, which leaves as one photon; the battery must supply that much energy per electron. Mistake to avoid: using silicon's 1.1 eV — its photons would be infrared (about 1130 nm), invisible

Practice Questions with Answer Key
• Q1 (single correct) — In an n-type semiconductor doped at 10²² donors per m³ with n_i = 10¹⁶ /m³, the hole concentration is about: (A) 10²² /m³ (B) 10¹⁶ /m³ (C) 10¹⁰ /m³ (D) 10⁶ /m³
• Q2 (single correct) — The depletion region of an unbiased p–n junction contains: (A) only electrons (B) only holes (C) fixed donor and acceptor ions, no mobile carriers (D) equal numbers of free electrons and holes
• Q3 (numerical) — A germanium diode (knee 0.3 V) is in series with a 500 Ω resistor across a 3 V supply. The current is: (A) 6 mA (B) 5.4 mA (C) 0.6 mA (D) 3 mA
• Q4 (single correct) — A Zener diode in a voltage regulator is operated: (A) in forward bias (B) in reverse bias below breakdown (C) in reverse breakdown (D) unbiased
• Q5 (numerical) — The average output of a half-wave rectifier with peak input 10 V is about: (A) 6.37 V (B) 3.18 V (C) 10 V (D) 1.59 V
• Q6 (statement) — Statement 1: a doped semiconductor crystal is electrically neutral. Statement 2: in an intrinsic semiconductor n_e = n_h at all temperatures. (A) both true (B) 1 true, 2 false (C) 1 false, 2 true (D) both false
• Q7 (assertion–reason) — Assertion: the reverse saturation current of a diode roughly doubles for every 10 °C rise. Reason: minority carrier concentration grows strongly with temperature. (A) both true, reason explains assertion (B) both true, reason does not explain (C) assertion true, reason false (D) assertion false, reason true
• Q8 (logic) — Both inputs of a NAND gate are tied together and fed a signal A. The combination works as: (A) an AND gate (B) an OR gate (C) a NOT gate (D) a NOR gate
• ✔ ANSWER KEY — Q1: C (mass action: 10³² / 10²² = 10¹⁰). Q2: C (mobile carriers are swept out; only uncovered fixed ions remain). Q3: B ((3 − 0.3) / 500 = 5.4 mA). Q4: C (regulation exists only in breakdown)
• ✔ ANSWER KEY — Q5: B (V_m / π = 10 / π ≈ 3.18 V; option A is the full-wave value). Q6: A (both statements are standard facts). Q7: A (the saturation current is minority-carried, so its temperature growth is the reason). Q8: C (output = complement of (A · A) = Ā)
• ⚠ MISCONCEPTION WATCH — Q1 tempts you with n_h = n_i (option B): doping never leaves the minority population untouched. Q5 tempts you with the full-wave formula (option A): read the circuit, not the formula list

Chapter Summary and Revision Checklist
• ★ SUMMARY — Conductivity is carrier counting: bands decide who CAN move, doping decides how MANY move, the junction decides WHICH WAY they may move, and gates decide what the moving charges MEAN
• • Essential definitions to be able to write cold: forbidden gap, intrinsic and extrinsic semiconductor, donor and acceptor, depletion region, barrier potential, knee voltage, Zener breakdown, rectifier averages, universal gate
• • Confused pairs to separate forever: electron vs hole mobility; barrier potential vs knee voltage; diffusion vs drift current; half-wave vs full-wave averages; LED (forward, light out) vs photodiode (reverse, light in); NAND (0 only at 1,1) vs NOR (1 only at 0,0)
• • Revision checklist item: can I compute a minority concentration from n_i² / N in under ten seconds
• • Revision checklist item: can I solve any single-diode circuit by subtracting the knee and dividing by R
• • Revision checklist item: can I state both rectifier averages and both ripple frequencies without hesitation
• • Revision checklist item: can I write all five truth tables and state De Morgan's laws from memory
• • Self-assessment: if you can explain WHY a Zener is stressed most at no load, WHY doped silicon stays neutral, and WHY breaking a complement bar flips AND to OR, this chapter is yours — the IAT questions are variations on exactly these three ideas
<!-- END phys_ch_28 detailedStudyNotes -->
