<!-- BEGIN phys_ch_21 detailedStudyNotes -->
Introduction — Why the World Chose Alternating Current
• The fan above you, the charger plugged into your phone, the streetlight outside — all of them run on a current that changes direction 100 times every second. Alternating current (AC) sounds like a complication. It is actually the reason electricity reaches your home at all.
• Here is the core problem AC solves. Power lost in a transmission wire is I²R — it explodes with current. To send power far with tiny loss, you want high voltage and low current. But homes need low, safe voltage. The bridge between the two is the TRANSFORMER, and a transformer works only on AC. That single device decided the war of the currents.
• In this chapter you will follow one sine wave through four circuits — a resistor, an inductor, a capacitor, and all three in series — and discover that each element treats the wave differently: one keeps it in step, one delays it, one rushes it ahead. The tool that makes all of this effortless is the phasor, a rotating vector that turns painful trigonometry into simple geometry.
• The chapter ends with the two great applications. RESONANCE — the effect that lets a radio pick one station out of thousands — and the transformer, the silent box on the electric pole that changes 11,000 V into the 220 V at your wall socket.
★ HIGHLIGHT — The whole chapter in one breath: AC voltage is a sine wave; a resistor keeps current in phase, an inductor makes current lag by 90°, a capacitor makes it lead by 90°; in a series LCR circuit the two reactances fight, and when they exactly cancel the circuit hits resonance and the current peaks.

The AC Waveform — Voltage with a Rhythm
• DEFINITION — Alternating voltage: a voltage whose magnitude changes continuously and whose direction reverses periodically. The standard form is V = V₀ sin(ωt), where V₀ is the peak value (amplitude).
• DEFINITION — Peak value (V₀ or I₀): the maximum value the voltage or current reaches in either direction during a cycle.
• DEFINITION — Time period (T) and frequency (ν): the time for one complete cycle, and the number of cycles per second — ν = 1/T, unit hertz (Hz).
• DEFINITION — Angular frequency (ω): ω = 2πν = 2π/T, in rad/s. It tells you how fast the phase of the wave advances.
• EXAMPLE — India's mains supply: ν = 50 Hz, so T = 1/50 = 0.02 s = 20 ms per cycle, and ω = 2π × 50 = 100π ≈ 314 rad/s. The current reverses direction twice per cycle — 100 reversals every second.
• EXAMPLE — Reading an equation is a favourite exam micro-skill. Given V = 311 sin(100πt) volts: the peak is V₀ = 311 V, ω = 100π gives ν = ω/(2π) = 50 Hz, and T = 20 ms. Three answers from one glance.
• WORKED PATTERN — Whenever you see V = V₀ sin(ωt + φ₀), harvest four things in order: peak V₀, angular frequency ω, frequency ν = ω/2π, and the starting phase φ₀. Examiners hide marks in exactly these slots.
• The current in a general AC circuit is written I = I₀ sin(ωt + φ). The angle φ is the PHASE DIFFERENCE between current and voltage — the single most important angle in this chapter. Whole sections below are just the story of φ for different elements.
• YOUR TURN — For V = 100 sin(314t) volts, state the peak voltage and frequency. Answer: V₀ = 100 V; ω = 314 = 100π, so ν = 50 Hz.
✔ KEY FORMULA — V = V₀ sin(ωt), with ω = 2πν = 2π/T. Everything in this chapter is bookkeeping built on this one wave.

▸ Average and RMS Values — the Numbers That Matter
• A sine wave symmetrically rises and falls, so its average over a FULL cycle is exactly zero. That number is true and useless: a current averaging zero still lights your bulb. We need averages that respect heating, and heating depends on I², not on I.
• DEFINITION — Average (half-cycle) value: the mean of the current over the positive half-cycle, I_av = 2I₀/π ≈ 0.637 I₀. This is what a moving-coil meter effectively responds to after rectification.
• EXAMPLE — If I₀ = 10 A, the half-cycle average is 2 × 10/π ≈ 6.37 A.
• DEFINITION — RMS value (root-mean-square): I_rms = I₀/√2 ≈ 0.707 I₀, and V_rms = V₀/√2. It is defined so that the heating produced by the AC in a resistor equals the heating produced by a DC of the same numerical value: P = I_rms² R.
• WHY rms works — Average power depends on the mean of sin² over a cycle, and the mean of sin²(ωt) is exactly ½. So mean I² = I₀²/2, and taking the square root gives I₀/√2. The √2 is not a fudge factor; it is the mean of sin² in disguise.
• EXAMPLE — The famous 220 V of your wall socket is an RMS value. The actual peak is 220 × √2 ≈ 311 V. Your appliances are insulated for 311 V peaks even though the label says 220 V.
• ★ HIGHLIGHT — Unless a question says otherwise, every AC voltage and current quoted anywhere — 220 V mains, a 5 A fuse rating — is an rms value.
• YOUR TURN — An AC source has a peak voltage of 100 V. What is its rms value? Answer: 100/√2 ≈ 70.7 V.
⚠ EXAM TRAP — Writing V_rms = V₀√2 instead of V₀/√2. Sanity check that saves you: the rms value must be SMALLER than the peak, because the wave spends most of its time below the peak.

Phasors — Rotating Vectors That Do the Algebra
• DEFINITION — Phasor: a vector whose length equals the peak value (or, consistently, the rms value) of an oscillating quantity, rotating anticlockwise with angular speed ω. The projection of the phasor on the vertical axis gives the instantaneous value at that moment.
• Think of it like this: a phasor is a freeze-frame of a spinning arrow. The whole diagram rotates rigidly at ω, so the ANGLE BETWEEN two phasors never changes — and that frozen angle is exactly the phase difference φ, visible at a glance.
• WHY phasors earn their keep — Adding two sine waves of the same frequency with raw trigonometry is slow and error-prone. Adding their phasors is plain vector addition: place them head-to-tail, use the parallelogram or triangle, read off the resultant's length and angle. Three lines of geometry replace a page of identities.
• phasor rules you must respect: (1) only quantities of the SAME frequency can share one phasor diagram; (2) use all peak lengths or all rms lengths — never mix; (3) the reference phasor is usually the one quantity common to all elements — in a series circuit, that is the current.
• EXAMPLE — For a pure resistor, the voltage and current phasors point in the same direction at every instant: two arrows glued together, spinning as one. Phase difference zero — you can SEE Kirchhoff's law become geometry.
• WORKED PATTERN — Exam recipe for any phasor problem: (1) choose the common quantity as reference along the horizontal; (2) draw each voltage phasor at its correct phase angle to the current; (3) add them as vectors; (4) read the resultant's length (that's the supply voltage) and its angle (that's φ).
• YOUR TURN — Two phasors of lengths 3 and 4 units are at 90° to each other. What is the length of their resultant? Answer: √(3² + 4²) = 5 units — the same 3-4-5 triangle you will meet again in the LCR phasor diagram.
★ HIGHLIGHT — A phasor diagram converts a question about time (who peaks first?) into a question about angle (who is rotated ahead?). Lead and lag become directions you can point at.

AC through a Resistor — Perfectly in Step
• Connect V = V₀ sin(ωt) across a resistor R. Ohm's law holds at every instant: I = V/R = (V₀/R) sin(ωt).
• DEFINITION — In a purely resistive AC circuit, current and voltage are IN PHASE: they rise, peak, cross zero and reverse together. I₀ = V₀/R, and the same relation holds for rms values: I_rms = V_rms/R.
• The phasor picture: V_R and I phasors overlap exactly, both along the reference direction. No angle, no drama.
• Power: since V and I always share the same sign, their product is never negative — the resistor converts electrical energy to heat during the entire cycle. Average power P = V_rms × I_rms = I_rms² R = V_rms²/R, exactly like DC with rms values.
• EXAMPLE — A 100 Ω resistor across 220 V mains: I_rms = 220/100 = 2.2 A, and P = 220 × 2.2 = 484 W. This is precisely how a room heater's rating is computed — a heater is just a proud resistor.
• YOUR TURN — A 440 Ω resistor is connected to 220 V AC. Find I_rms and the power. Answer: I_rms = 220/440 = 0.5 A; P = 220 × 0.5 = 110 W.
✔ KEY FORMULA — Pure resistor: φ = 0, I_rms = V_rms/R, P = V_rms I_rms. The resistor is the reference behaviour against which L and C show their strangeness.

AC through an Inductor — the 90° Lag
• Now connect the same source to a pure inductor L (a coil with negligible resistance). The changing current induces a back emf that fights every change — so the current can only build up after the voltage has done its pushing. The result is a fixed delay.
• DEFINITION — In a purely inductive circuit, the current LAGS the voltage by π/2 (90°): if V = V₀ sin(ωt), then I = I₀ sin(ωt − π/2). When voltage is at its peak, current is passing through zero; current peaks a quarter-cycle later.
• DEFINITION — Inductive reactance (X_L): the opposition offered by an inductor to AC, X_L = ωL = 2πνL, measured in ohms. It plays the same role for an inductor that R plays for a resistor: I_rms = V_rms/X_L.
• WHY X_L grows with frequency — A faster-changing current induces a proportionally larger back emf (emf ∝ rate of change of current). Double the frequency and the same coil fights twice as hard: X_L doubles. At DC (ν = 0), X_L = 0 — a steady current meets no opposition from an ideal inductor at all.
• EXAMPLE — L = 0.5 H at 50 Hz: X_L = 2π × 50 × 0.5 = 157 Ω. Raise the supply to 100 Hz and X_L = 314 Ω — exactly doubled.
• Memory hook used by generations of engineers: "ELI the ICE man." In an inductor (L), the EMF (E) comes before the current (I) — ELI. Voltage leads, current lags.
• Power: over a full cycle the average power consumed by a pure inductor is ZERO. It borrows energy to build its magnetic field for a quarter-cycle (½LI²), then returns every joule as the field collapses. An ideal inductor is a bank, not a customer.
• YOUR TURN — Find X_L for L = 1 H connected to 50 Hz mains. Answer: X_L = 2π × 50 × 1 = 314 Ω.
⚠ EXAM TRAP — Applying X_L = ωL with ν in place of ω, or forgetting that at DC an inductor behaves like a plain wire (after the initial transient). Frequency discipline is everything here: X_L needs ω = 2πν.

AC through a Capacitor — the 90° Lead
• Replace the inductor with a capacitor C. Current flows while the capacitor charges and discharges — and it flows most furiously exactly when the voltage is changing fastest, which is when voltage passes through zero. So the current peaks BEFORE the voltage does.
• DEFINITION — In a purely capacitive circuit, the current LEADS the voltage by π/2 (90°): if V = V₀ sin(ωt), then I = I₀ sin(ωt + π/2).
• DEFINITION — Capacitive reactance (X_C): the opposition offered by a capacitor to AC, X_C = 1/(ωC) = 1/(2πνC), measured in ohms. I_rms = V_rms/X_C.
• WHY X_C falls with frequency — At higher frequency the capacitor charges and discharges more times per second, so more charge flows per second — that IS more current. At DC, once charged, the capacitor blocks current completely: X_C = ∞ at ν = 0. A capacitor is a gate that opens wider as frequency rises.
• EXAMPLE — C = 10 μF at 50 Hz: X_C = 1/(2π × 50 × 10 × 10⁻⁶) = 318 Ω. At 100 Hz: X_C = 159 Ω — halved, the mirror image of the inductor's behaviour.
• Memory hook, second half: for a capacitor (C), "ICE" — the current (I) comes before the EMF (E). Current leads, voltage follows.
• Power: average power over a cycle is again ZERO — the capacitor stores energy in its electric field (½CV²) for a quarter-cycle and hands it all back. Comparing with the inductor: L and C are both banks; only the resistor spends.
• YOUR TURN — What capacitance gives X_C = 100 Ω at 50 Hz? Answer: C = 1/(2π × 50 × 100) = 31.8 μF.
• Figure 1 (in this section) shows both phasor diagrams side by side: for L, the current phasor sits 90° behind voltage; for C, 90° ahead. Learn to sketch these in ten seconds — they anchor every LCR diagram that follows.
⚠ EXAM TRAP — Saying a capacitor "passes AC but blocks DC" and then using X_C = 1/(ωC) at DC. The formula itself gives ∞ at ν = 0 — trust it. Also remember X_C DEcreases when frequency or capacitance increases; students routinely invert one of the two.


Series LCR Circuit — All Three in One Chain
• Now wire R, L and C in series across the AC source. One current I flows through all three — that shared current is why series circuits are analysed with I as the reference phasor.
• Each element claims its own voltage: V_R = IR (in phase with I), V_L = IX_L (90° ahead of I), V_C = IX_C (90° behind I). The supply voltage must equal the sum of these — but as PHASORS, not as plain numbers.
• Here is the drama: V_L and V_C point in exactly opposite directions. They partially cancel, like two teams in a tug of war. The net reactive voltage is (V_L − V_C), and whichever reactance is bigger decides the circuit's personality.
• DEFINITION — Impedance (Z): the total opposition of the series LCR circuit to AC, Z = V_rms/I_rms, in ohms. It generalises resistance: I_rms = V_rms/Z.
• The supply voltage and the component voltages obey V² = V_R² + (V_L − V_C)². Notice what this forbids: V is NOT V_R + V_L + V_C. Students who add voltages arithmetically invent energy that does not exist.
• ★ HIGHLIGHT — In a series LCR circuit, V_L or V_C individually can be LARGER than the supply voltage V, because they cancel each other. Only the combination √(V_R² + (V_L − V_C)²) is pinned to V. Keep this in mind — at resonance it stops being a curiosity and becomes a spectacle.
• WORKED PATTERN — Every series LCR problem follows one spine: compute X_L and X_C → compute Z → compute I = V/Z → get each voltage from the current → get the phase from the reactances. Five moves; master them and the whole family of questions collapses into routine.

▸ Impedance, the Phasor Diagram and Phase Angle
• From the phasor diagram — V_R along the current, V_L up, V_C down, supply V as the hypotenuse — Pythagoras gives the master relation of this chapter.
✔ KEY FORMULA — Z = √(R² + (X_L − X_C)²), and tan φ = (X_L − X_C)/R, where φ is the angle by which the supply voltage leads the current (equivalently, cos φ = R/Z).
• DEFINITION — Phase angle (φ): the phase difference between the total voltage and the current in the LCR circuit. Its sign tells you the circuit's nature.
• Case 1, X_L > X_C: tan φ > 0, the circuit is net INDUCTIVE — current lags the voltage, V_L exceeds V_C.
• Case 2, X_C > X_L: tan φ < 0, the circuit is net CAPACITIVE — current leads the voltage.
• Case 3, X_L = X_C: tan φ = 0, the circuit behaves like a pure resistor — this special case gets its own section next (resonance).
• The impedance triangle is the same diagram in disguise: horizontal side R, vertical side (X_L − X_C), hypotenuse Z, with φ at the base. Voltage triangle and impedance triangle are similar triangles — multiply one by I and you get the other.
• EXAMPLE — R = 30 Ω, X_L = 80 Ω, X_C = 40 Ω: Z = √(30² + 40²) = √(900 + 1600) = 50 Ω; tan φ = 40/30 = 1.33, so φ = 53.1°, and since X_L > X_C the current lags. Clean 3-4-5 geometry — examiners love these numbers, so learn to spot them.
• YOUR TURN — A series circuit has R = 60 Ω and net reactance (X_L − X_C) = 80 Ω. Find Z. Answer: Z = √(60² + 80²) = 100 Ω — another scaled 3-4-5 triangle.
• Figure 2 (in this section) shows the phasor diagram and impedance triangle for exactly this situation. Draw it once by hand and the formulas will never need memorising again.
⚠ EXAM TRAP — Using tan φ = X_L/R or X_C/R with a single reactance. The phase depends on the DIFFERENCE (X_L − X_C): the two reactances always enter as a team, never alone.

Resonance — When the Circuit Sings
• Tune the frequency (or adjust L or C) until X_L = X_C. The inductor's and capacitor's voltages become equal and exactly cancel; the entire supply voltage appears across R alone.
• DEFINITION — Series resonance: the condition X_L = X_C, at which (1) impedance is minimum, Z_min = R; (2) current is maximum, I_max = V_rms/R; (3) voltage and current are in phase, φ = 0 and power factor = 1.
• Setting ω₀L = 1/(ω₀C) gives the resonant angular frequency ω₀ = 1/√(LC), so the resonant frequency is ν₀ = 1/(2π√(LC)). Notice: R plays no role in ν₀ — resistance decides how STRONG the resonance is, not where it happens.
• WHY resonance feels like magic — At ν₀ the circuit needs no net reactive voltage at all: L and C trade energy directly with each other, sloshing it back and forth each cycle, while the source only replaces what R burns. The source sees a humble resistor; inside, L and C are having a festival.
• Voltage magnification: at resonance V_L = I_max × X_L = (V_rms/R) × ω₀L = Q × V_rms, where Q (coming next) can be 50 or more. A 10 V supply can place 500 V across the inductor. This is real, measurable, and the reason insulation matters in resonant circuits.
• EXAMPLE — L = 0.5 H, C = 2 μF: ν₀ = 1/(2π√(0.5 × 2 × 10⁻⁶)) = 1/(2π × 10⁻³) ≈ 159 Hz. File this L–C pair away; it returns in the worked examples with R and a supply attached.
• The killer application: radio tuning. A receiver's LCR circuit is tuned so its ν₀ matches one station's carrier frequency; that station's signal drives a large current, all others drive almost nothing. Turning the old tuning knob was turning a variable capacitor — you were hunting for resonance by hand.
★ HIGHLIGHT — Resonance is not a new phenomenon; it is LC oscillation (later section) being DRIVEN at its own natural frequency. Same ν₀ formula, same physics: push a swing at its natural rhythm and small pushes build a huge motion.
⚠ EXAM TRAP — Claiming resonance means zero impedance or infinite current. Z falls only to R, never below; with an ideal R = 0 the current would indeed blow up, which is why real resonant circuits always keep some resistance. Also: resonance frequency depends on L and C only — changing R or the supply voltage does NOT shift ν₀.

▸ Sharpness of Resonance — Q Factor and Bandwidth
• Two circuits can share the same ν₀ yet behave utterly differently: one responds only within a whisper of ν₀, the other responds sloppily across a wide band. The quality factor measures this sharpness.
• DEFINITION — Quality factor (Q): Q = ω₀L/R = 1/(ω₀CR) = (1/R)√(L/C). It is dimensionless. Physically, Q = 2π × (energy stored in the circuit)/(energy lost per cycle) — a high-Q circuit is a miser that loses little per cycle.
• DEFINITION — Bandwidth (Δν): the frequency range between the two points where the current falls to I_max/√2 (the half-power points). Bandwidth and Q obey ν₀/Δν = Q, with Δν = R/(2πL).
• Q wears three hats, and exams test all three: (1) voltage magnification at resonance, V_L = Q × V_supply; (2) sharpness, Q = ν₀/Δν; (3) the energy-storage ratio above. One letter, three identities — know which hat the question is asking about.
• EXAMPLE — Our returning pair L = 0.5 H, C = 2 μF with R = 10 Ω: Q = (1/R)√(L/C) = (1/10) × √(0.5/(2 × 10⁻⁶)) = (1/10) × 500 = 50. Bandwidth Δν = ν₀/Q = 159/50 ≈ 3.18 Hz. The circuit responds strongly only within about ±1.6 Hz of 159 Hz — a very selective listener.
• Figure 3 (in this section) plots current versus frequency for two resistances. Small R: tall, narrow spike — high Q, sharp tuning. Large R: low, broad hill — poor selectivity but gentler behaviour. Every feature of the formula Q = (1/R)√(L/C) is visible in those two curves.
• The engineering trade-off: a radio tuner wants high Q (select one station, reject neighbours); a circuit that must accept a band of frequencies wants moderate Q. Sharpness is a choice, not a virtue by itself.
• YOUR TURN — A resonant circuit has ν₀ = 1000 Hz and Q = 100. What is its bandwidth? Answer: Δν = ν₀/Q = 10 Hz.
⚠ EXAM TRAP — Mixing the two Q formulas across circuit types. Everything in this chapter is SERIES resonance, where Q = ω₀L/R. (Parallel resonance inverts the role of R — outside this syllabus, but a favourite distractor in statement questions.)


Power in AC Circuits — Who Pays the Bill
• Instantaneous power p = V × I swings up and down through the cycle. What your electricity meter records is its average, and that average has one of the most useful formulas in the chapter.
✔ KEY FORMULA — Average power P = V_rms × I_rms × cos φ, where cos φ is the POWER FACTOR. For a series LCR circuit, cos φ = R/Z.
• DEFINITION — Power factor (cos φ): the fraction that converts the volt-ampere product into actual watts. It ranges from 0 (pure L or C) to 1 (pure resistor or resonance).
• WHY only R consumes — The inductor and capacitor store energy for part of the cycle and return ALL of it later; averaged over a cycle their power is zero. Only the resistor irreversibly converts electrical energy to heat. That is why the same formula can be written P = I_rms² × R — current through R is the only place money is spent.
• EXAMPLE — A device draws 5 A from 220 V mains with power factor 0.6. Real power P = 220 × 5 × 0.6 = 660 W — NOT 220 × 5 = 1100 W. The product 1100 is the APPARENT power in volt-amperes (VA); the wattmeter reads 660 W.
• At resonance cos φ = 1, so for a fixed supply voltage the power delivered is maximum: P = V_rms²/R. Resonance is not only maximum current — it is maximum power transfer from a source that must drive this load.
• YOUR TURN — A circuit takes 4 A from a 200 V supply at power factor 0.8. Find the average power. Answer: P = 200 × 4 × 0.8 = 640 W.
⚠ EXAM TRAP — Forgetting cos φ entirely and writing P = VI for an LCR circuit. VI is the ceiling, reached only when φ = 0. Every mark-scheme penalises the missing cos φ; make writing it an automatic reflex.

▸ Wattless Current — the Component That Costs Nothing
• Resolve the circuit current into two components relative to the voltage phasor: I cos φ along V, and I sin φ perpendicular to V.
• DEFINITION — Wattless (idle/reactive) current: the component I_rms sin φ, which is 90° out of phase with the voltage and therefore consumes ZERO average power. The component I_rms cos φ, in phase with V, is the power-carrying (active) component.
• The name is literal: wattless current delivers no watts. But it is not harmless — it is real current sloshing back and forth between source and the L/C storage, heating the transmission wires (I²R losses in the lines) while doing no useful work at the load. Electricity boards dislike it intensely.
• EXAMPLE — The 5 A device of the last section (cos φ = 0.6, so sin φ = 0.8): power component = 5 × 0.6 = 3 A; wattless component = 5 × 0.8 = 4 A. Four of its five amperes are tourists — they travel, they occupy the wires, they pay nothing.
• For a pure inductor or pure capacitor, φ = ±90°, so the ENTIRE current is wattless and P = 0 — the extreme case you met earlier, now with its proper name.
• Fixing a bad power factor: most industrial loads are inductive (motors), so a capacitor bank is connected in parallel to supply the wattless component locally. The factory's internal currents stay large, but the supply lines are relieved. This is power-factor correction, and it exists purely because of this section's physics.
• YOUR TURN — A load draws 10 A at power factor 0.5. How much of the current is wattless? Answer: sin φ = √(1 − 0.25) = 0.866, so wattless current = 10 × 0.866 ≈ 8.66 A.
★ HIGHLIGHT — Whenever a problem gives you cos φ and asks about "useless" or "idle" current, reach for sin φ: active = I cos φ, wattless = I sin φ. The two components are the legs of a right triangle whose hypotenuse is the total current.

LC Oscillations — Energy Sloshing inside a Loop
• Connect a charged capacitor to an inductor (resistance negligible) and close the switch. The capacitor discharges through the coil; the growing current builds a magnetic field; that field then drives current back to charge the capacitor with opposite polarity — and the dance repeats. This is the electrical pendulum.
• DEFINITION — LC oscillation: the periodic exchange of energy between the capacitor's electric field (U = q²/2C) and the inductor's magnetic field (U = ½LI²), with total energy constant in the ideal case.
• The charge obeys q = q₀ cos(ωt) with ω = 1/√(LC), so the frequency is ν = 1/(2π√(LC)) — the same ν₀ as series resonance. No coincidence: resonance is what happens when you DRIVE an LC system at the frequency it already loves.
• Numbers on the pendulum: total energy U = q₀²/(2C) = ½LI_max², giving I_max = q₀/√(LC) = V₀√(C/L), where V₀ is the initial capacitor voltage.
• EXAMPLE — L = 0.5 H, C = 2 μF, capacitor initially charged to 50 V: ν = 159 Hz; I_max = 50 × √(2 × 10⁻⁶/0.5) = 50 × 0.002 = 0.1 A; stored energy U = ½ × 2 × 10⁻⁶ × 50² = 2.5 × 10⁻³ J, forever trading places between the two fields.
• A quarter-period timeline worth memorising: t = 0, all energy electric, I = 0 → t = T/4, all energy magnetic, I maximum → t = T/2, all electric again with reversed polarity. The parallel with the pendulum of the Oscillations chapter (potential ↔ kinetic) is exact — same mathematics, different costume.
• Reality check: any real loop has some R, which skims energy each cycle, so the oscillations decay (damped). Radio transmitters replenish the loss each cycle to keep a steady carrier wave.
• YOUR TURN — An LC circuit has L = 0.1 H and C = 1 μF. Find its oscillation frequency. Answer: ν = 1/(2π√(0.1 × 10⁻⁶)) = 1/(2π × 3.16 × 10⁻⁴) ≈ 503 Hz.
⚠ EXAM TRAP — In LC oscillations the CURRENT is maximum when the CHARGE is zero, and vice versa — they are a quarter-cycle out of step, exactly like velocity and displacement in SHM. Questions that put both maxima together are testing precisely this.

The Transformer — Voltage Changed with No Moving Parts
• You have met the hero of the introduction. A transformer changes AC voltage levels using nothing but two coils and an iron core — no moving parts, no contact between the circuits.
• Construction (see Figure 4 in this section): a PRIMARY coil of N_p turns and a SECONDARY coil of N_s turns wound on a common laminated soft-iron core. The coils are electrically insulated from each other; only the magnetic flux links them.
• Working principle: AC in the primary produces an alternating flux in the core; the same flux threads the secondary and induces an emf there by MUTUAL INDUCTION. Both emfs are proportional to their turns, so the turns ratio fixes the voltage ratio.
✔ KEY FORMULA — V_s/V_p = N_s/N_p. For an ideal (100% efficient) transformer, power is conserved: V_p × I_p = V_s × I_s, hence I_s/I_p = N_p/N_s.
• Step-up transformer: N_s > N_p, voltage rises, current falls — used at power stations before long-distance transmission. Step-down: N_s < N_p, voltage falls, current rises — used at your street pole and inside every charger.
• EXAMPLE — A transformer steps 220 V up to 11,000 V with N_p = 500 turns. Then N_s = 500 × 11000/220 = 25,000 turns. Voltage multiplied by 50; the secondary current is correspondingly divided by 50.
• WHY transformers refuse DC — DC produces constant flux, and induction needs CHANGING flux: the secondary emf would be zero. Worse, the primary is a low-resistance coil; steady DC would drive an enormous current and burn it out. This is also why the whole grid had to be AC — the transformer's appetite decided it.
• YOUR TURN — A step-down transformer must convert 220 V to 22 V, and its primary has 2000 turns. Find N_s. Answer: N_s = 2000 × 22/220 = 200 turns.
★ HIGHLIGHT — A transformer trades voltage against current at (nearly) constant power. It can no more create energy than a gear can; it only re-packages it. Any option claiming a transformer increases power violates conservation of energy — reject it instantly.

▸ Transformer Losses and Efficiency
• Real transformers are superb machines (efficiencies of 90–99%), but four losses keep them from ideal. Each loss has a named cure — learn them as pairs.
• Loss 1, COPPER LOSS: the windings have resistance, so I²R heating occurs in both coils. Cure: thick copper wire for low resistance (especially on the high-current side).
• Loss 2, EDDY CURRENT LOSS: the alternating flux induces circulating currents inside the solid iron core itself, wasting energy as heat. Cure: LAMINATION — the core is built of thin, mutually insulated iron sheets, which chop the eddy loops into harmless slivers. This is why Figure 4's core is drawn as stacked plates.
• Loss 3, HYSTERESIS LOSS: the core's magnetisation flips back and forth 100 times a second, and molecular friction in the iron wastes energy each flip. Cure: soft iron, whose magnetisation reverses easily (narrow hysteresis loop).
• Loss 4, FLUX LEAKAGE: not all of the primary's flux links the secondary. Cure: winding the coils on a closed core, often one over the other, so the flux path is shared.
• DEFINITION — Efficiency (η): η = (power output/power input) × 100% = (V_s I_s)/(V_p I_p) × 100%.
• EXAMPLE — A transformer delivers 180 W while taking 200 W from the supply: η = 180/200 × 100% = 90%. The missing 20 W leaves as heat through the four channels above.
• YOUR TURN — A transformer with 95% efficiency receives 1000 W. How much power is wasted as heat? Answer: 5% of 1000 W = 50 W.
⚠ EXAM TRAP — Pairing a loss with the wrong cure in match-the-following questions. Lock the pairs: eddy currents ↔ lamination; hysteresis ↔ soft iron; copper loss ↔ thick wire; flux leakage ↔ closed core design.


Formula Sheet — One-Glance Recap
✔ The wave — V = V₀ sin(ωt); ω = 2πν; I_rms = I₀/√2 ≈ 0.707 I₀; V_rms = V₀/√2; half-cycle average = 2I₀/π ≈ 0.637 I₀
✔ Resistor — φ = 0; I_rms = V_rms/R; P = V_rms I_rms
✔ Inductor — X_L = ωL = 2πνL; current LAGS voltage by 90°; average power = 0
✔ Capacitor — X_C = 1/(ωC) = 1/(2πνC); current LEADS voltage by 90°; average power = 0
✔ Series LCR — Z = √(R² + (X_L − X_C)²); I_rms = V_rms/Z; V² = V_R² + (V_L − V_C)²
✔ Phase — tan φ = (X_L − X_C)/R; power factor cos φ = R/Z
✔ Resonance — ν₀ = 1/(2π√(LC)); Z_min = R; I_max = V_rms/R; φ = 0
✔ Sharpness — Q = ω₀L/R = (1/R)√(L/C) = ν₀/Δν; bandwidth Δν = R/(2πL); V_L at resonance = Q × V_rms
✔ Power — P = V_rms I_rms cos φ = I_rms² R; active component I cos φ; wattless component I sin φ
✔ LC oscillations — ν = 1/(2π√(LC)); I_max = V₀√(C/L); U = ½CV₀² = ½LI_max²
✔ Transformer — V_s/V_p = N_s/N_p; ideal: I_s/I_p = N_p/N_s; η = (V_s I_s)/(V_p I_p) × 100%

Common Mistakes and Exam Traps
• MISTAKE 1 — Adding V_R + V_L + V_C arithmetically to get the supply voltage. Why wrong: the three voltages peak at different instants; they are phasors at angles, not numbers on a line. Correct principle: V = √(V_R² + (V_L − V_C)²) — first let V_L and V_C cancel, then combine with V_R by Pythagoras.
• MISTAKE 2 — Writing P = V × I for any AC circuit. Why wrong: that is only the apparent power; when φ ≠ 0 part of the current is wattless. Correct principle: P = V_rms I_rms cos φ, and cos φ = R/Z in a series circuit.
• MISTAKE 3 — Feeding peak values into power or heating formulas. Why wrong: heating is set by the mean of I², which is the rms value's job. Correct principle: convert first — I_rms = I₀/√2 — then use DC-style formulas.
• MISTAKE 4 — Claiming X_L falls and X_C rises with frequency. Why wrong: exactly backwards — the inductor fights faster changes harder, the capacitor passes them easier. Correct principle: X_L = 2πνL rises with ν; X_C = 1/(2πνC) falls with ν.
• MISTAKE 5 — Swapping lead and lag. Why wrong: it reverses the sign of φ and the nature (inductive/capacitive) of the circuit. Correct principle: ELI the ICE man — in L, E (voltage) leads I; in C, I leads E (voltage).
• MISTAKE 6 — Saying a bigger supply voltage or a smaller R shifts the resonant frequency. Why wrong: ν₀ = 1/(2π√(LC)) contains only L and C. Correct principle: R and V change the HEIGHT and sharpness of the resonance peak, never its position.
• MISTAKE 7 — Believing a transformer can step up power, or run on DC. Why wrong: an ideal transformer conserves power (V up means I down), and DC gives no changing flux to induce a secondary emf. Correct principle: V_s/V_p = N_s/N_p with V_p I_p = V_s I_s; AC only.
• MISTAKE 8 — Computing tan φ from X_L alone (or X_C alone). Why wrong: L and C voltages oppose each other, so the circuit responds only to their difference. Correct principle: tan φ = (X_L − X_C)/R — always the net reactance over R.

Worked Examples — Exam Patterns
• EXAMPLE 1 — Problem: Indian mains supply is quoted as 220 V at 50 Hz. Find the peak voltage, and write the voltage equation.
• Given: V_rms = 220 V, ν = 50 Hz.
• Principle: V₀ = √2 × V_rms; ω = 2πν; V = V₀ sin(ωt).
• Steps: V₀ = 1.414 × 220 ≈ 311 V; ω = 2π × 50 = 314 rad/s.
• Answer: V₀ ≈ 311 V; V = 311 sin(314t) volts. (Bonus: the half-cycle average voltage is 2 × 311/π ≈ 198 V.)
• Reasoning: The quoted 220 V is rms by convention; the insulation of every appliance must survive the 311 V peak.
• Mistake to avoid: Writing V₀ = 220/√2 = 155.5 V — that divides in the wrong direction; peak must exceed rms.
• EXAMPLE 2 — Problem: A pure inductor of 0.2 H is connected to a 220 V, 50 Hz source. Find the rms and peak current, the current equation, and the average power consumed.
• Given: L = 0.2 H, V_rms = 220 V, ν = 50 Hz.
• Principle: X_L = 2πνL; I_rms = V_rms/X_L; current lags by π/2; pure L consumes zero average power.
• Steps: X_L = 2π × 50 × 0.2 = 62.8 Ω; I_rms = 220/62.8 = 3.5 A; I₀ = 3.5 × √2 = 4.95 A.
• Answer: I_rms = 3.5 A; i = 4.95 sin(314t − π/2) A; P_average = 0 W.
• Reasoning: The inductor returns all borrowed energy each cycle, so the meter does not move even though 3.5 A flows.
• Mistake to avoid: Reporting P = 220 × 3.5 = 770 W — that is apparent power; with φ = 90°, cos φ = 0 kills it.
• EXAMPLE 3 — Problem: A capacitor of 10 μF is connected to a 200 V, 50 Hz source. Find the rms current and the average power.
• Given: C = 10 μF = 10 × 10⁻⁶ F, V_rms = 200 V, ν = 50 Hz.
• Principle: X_C = 1/(2πνC); I_rms = V_rms/X_C; pure C consumes zero average power; current leads by π/2.
• Steps: X_C = 1/(2π × 50 × 10 × 10⁻⁶) = 318 Ω; I_rms = 200/318 = 0.63 A; I₀ = 0.63 × √2 ≈ 0.89 A.
• Answer: I_rms ≈ 0.63 A with i = 0.89 sin(314t + π/2) A; P_average = 0 W.
• Reasoning: Same zero-power story as the inductor, but the phase sign flips: lead instead of lag.
• Mistake to avoid: Using X_C = 2πνC (the inductor's pattern). The capacitor's reactance has ωC in the DENOMINATOR.
• EXAMPLE 4 — Problem: A series LCR circuit has R = 30 Ω, X_L = 80 Ω and X_C = 40 Ω, connected to a 200 V rms source. Find Z, the current, each component voltage, the phase angle, the power factor and the average power.
• Given: R = 30 Ω, X_L = 80 Ω, X_C = 40 Ω, V_rms = 200 V.
• Principle: Z = √(R² + (X_L − X_C)²); one common current I = V/Z; component voltages from I; tan φ from net reactance; P = VI cos φ.
• Steps: Net reactance = 80 − 40 = 40 Ω; Z = √(30² + 40²) = 50 Ω; I = 200/50 = 4 A; V_R = 4 × 30 = 120 V; V_L = 4 × 80 = 320 V; V_C = 4 × 40 = 160 V; tan φ = 40/30, φ = 53.1°; cos φ = 30/50 = 0.6.
• Answer: Z = 50 Ω; I = 4 A; V_R = 120 V, V_L = 320 V, V_C = 160 V; φ = 53.1° with current lagging (net inductive); P = 200 × 4 × 0.6 = 480 W. Check: √(120² + (320 − 160)²) = √(14400 + 25600) = 200 V exactly, and I²R = 16 × 30 = 480 W agrees.
• Reasoning: Note V_L = 320 V exceeds the 200 V supply — legal, because V_C cancels most of it in the phasor sum.
• Mistake to avoid: Adding 120 + 320 + 160 = 600 V and panicking — phasors, not scalars.
• EXAMPLE 5 — Problem: A series LCR circuit with L = 0.5 H, C = 2 μF and R = 10 Ω is driven by a 10 V rms source of variable frequency. Find the resonant frequency, the maximum current, the voltage across the inductor at resonance, Q and the bandwidth.
• Given: L = 0.5 H, C = 2 × 10⁻⁶ F, R = 10 Ω, V_rms = 10 V.
• Principle: ν₀ = 1/(2π√(LC)); at resonance Z = R; V_L = Q × V with Q = (1/R)√(L/C); Δν = ν₀/Q.
• Steps: √(LC) = √(0.5 × 2 × 10⁻⁶) = 10⁻³ s; ν₀ = 1/(2π × 10⁻³) ≈ 159 Hz; I_max = 10/10 = 1 A; √(L/C) = √(0.5/(2 × 10⁻⁶)) = 500 Ω, so Q = 500/10 = 50; V_L = 50 × 10 = 500 V; Δν = 159/50 ≈ 3.18 Hz.
• Answer: ν₀ ≈ 159 Hz; I_max = 1 A; V_L = V_C = 500 V at resonance; Q = 50; bandwidth ≈ 3.18 Hz.
• Reasoning: A modest 10 V source produces 500 V across each reactive element — voltage magnification in action, and the two 500 V phasors cancel exactly.
• Mistake to avoid: Claiming the current becomes infinite at resonance — it is capped by R: I_max = V/R = 1 A here.
• EXAMPLE 6 — Problem: An appliance draws 5 A from a 220 V supply with power factor 0.6 (lagging). Find the average power consumed, the power component and the wattless component of the current.
• Given: I_rms = 5 A, V_rms = 220 V, cos φ = 0.6.
• Principle: P = V I cos φ; active component = I cos φ; wattless = I sin φ with sin φ = √(1 − cos²φ).
• Steps: P = 220 × 5 × 0.6 = 660 W; sin φ = √(1 − 0.36) = 0.8; active = 5 × 0.6 = 3 A; wattless = 5 × 0.8 = 4 A.
• Answer: P = 660 W; power component 3 A; wattless component 4 A.
• Reasoning: The supply must be rated for all 5 A (and the wires heat for 5 A), yet only the 3 A share does paid work.
• Mistake to avoid: Billing the appliance at 220 × 5 = 1100 W — that double-counts the wattless tourist current.
• EXAMPLE 7 — Problem: A step-up transformer raises 220 V to 11,000 V. Its primary has 500 turns and the secondary delivers 0.2 A. Find the secondary turns, the primary current (assume ideal) and the power transferred.
• Given: V_p = 220 V, V_s = 11,000 V, N_p = 500, I_s = 0.2 A.
• Principle: N_s/N_p = V_s/V_p; ideal transformer conserves power, V_p I_p = V_s I_s.
• Steps: N_s = 500 × 11000/220 = 25,000 turns; power out = 11,000 × 0.2 = 2200 W; I_p = 2200/220 = 10 A.
• Answer: N_s = 25,000 turns; I_p = 10 A; power = 2200 W on both sides.
• Reasoning: Voltage went up 50 times, current came down 50 times — the transformer's invariable bargain.
• Mistake to avoid: Inverting the current ratio (claiming I_p = 0.004 A). Current trades INVERSELY to turns; check with power balance every time.
• EXAMPLE 8 — Problem: A 2 μF capacitor charged to 50 V is connected across a 0.5 H inductor. Find the oscillation frequency, the maximum current, the total energy, and the time taken for the current to first reach its maximum.
• Given: C = 2 × 10⁻⁶ F, V₀ = 50 V, L = 0.5 H.
• Principle: ν = 1/(2π√(LC)); I_max = V₀√(C/L); U = ½CV₀²; current peaks a quarter-period after switch-on.
• Steps: ν = 159 Hz (same LC pair as Example 5); I_max = 50 × √(2 × 10⁻⁶/0.5) = 50 × 0.002 = 0.1 A; U = ½ × 2 × 10⁻⁶ × 2500 = 2.5 × 10⁻³ J; T = 1/159 ≈ 6.28 ms, so T/4 ≈ 1.57 ms.
• Answer: ν ≈ 159 Hz; I_max = 0.1 A; U = 2.5 mJ; first current maximum at t ≈ 1.57 ms.
• Reasoning: At t = 0 all 2.5 mJ sits in the capacitor's field and the current is zero; by T/4 it has migrated entirely into the inductor's field.
• Mistake to avoid: Putting I_max at t = 0. Charge and current are a quarter-cycle apart — when one is maximum, the other is zero.

Practice Questions — Self-Test Set
• Q1 (single-correct) — The rms value of an alternating current whose peak value is 14.1 A is: (a) 7.07 A (b) 10 A (c) 14.1 A (d) 19.9 A
• Q2 (single-correct) — A pure inductor of 0.2 H is connected to a 50 Hz AC source. Its inductive reactance is: (a) 31.4 Ω (b) 62.8 Ω (c) 628 Ω (d) 6.28 Ω
• Q3 (single-correct) — A 20 μF capacitor is connected to a 200 V, 50 Hz source. The rms current through it is: (a) 0.63 A (b) 1.26 A (c) 2.51 A (d) 0.32 A
• Q4 (single-correct) — In a series LCR circuit, R = 40 Ω, X_L = 90 Ω and X_C = 30 Ω. The impedance and the nature of the circuit are: (a) 50 Ω, capacitive (b) 72.1 Ω, inductive (c) 160 Ω, inductive (d) 72.1 Ω, capacitive
• Q5 (multiple-correct) — At series resonance, which of the following hold? (a) Impedance is minimum and equals R (b) Current is maximum (c) Power factor is unity (d) V_L and V_C are equal in magnitude and cancel each other
• Q6 (numerical) — A series resonant circuit has L = 0.5 H, C = 2 μF and R = 10 Ω. Calculate its quality factor Q.
• Q7 (single-correct) — A pure capacitor draws 2 A (rms) from a 200 V AC source. The average power consumed is: (a) 400 W (b) 200 W (c) 0 W (d) 100 W
• Q8 (single-correct) — An ideal step-down transformer converts 220 V to 22 V. If the secondary delivers 5 A, the primary current is: (a) 5 A (b) 50 A (c) 0.5 A (d) 0.05 A
• Q9 (assertion–reason) — Assertion: At series resonance, the voltage across the inductor can be much larger than the supply voltage. Reason: At resonance V_L = Q × V_supply, and Q can be much greater than 1. Choose: (a) both true, reason explains assertion (b) both true, reason does not explain (c) assertion true, reason false (d) assertion false, reason true

▸ Answer Key with Explanations
• Q1 — (b) 10 A. I_rms = I₀/√2 = 14.1/1.414 ≈ 10 A. Misconception targeted: option (c) treats peak as rms; option (d) multiplies by √2 instead of dividing.
• Q2 — (b) 62.8 Ω. X_L = 2πνL = 2π × 50 × 0.2 = 62.8 Ω. Misconception targeted: option (a) uses π instead of 2π; option (c) misplaces the decimal by a power of ten.
• Q3 — (b) 1.26 A. X_C = 1/(2π × 50 × 20 × 10⁻⁶) = 159 Ω; I = 200/159 = 1.26 A. Misconception targeted: option (a) is the current for a 10 μF capacitor — forgetting that doubling C halves X_C and doubles the current.
• Q4 — (b) 72.1 Ω, inductive. Net reactance = 90 − 30 = 60 Ω; Z = √(40² + 60²) = √5200 = 72.1 Ω; X_L > X_C means net inductive (current lags). Misconception targeted: option (d) gets the magnitude right but the nature wrong — always compare X_L and X_C; option (a) subtracts the reactances from R instead of combining by Pythagoras.
• Q5 — (a), (b), (c) and (d) — all four hold. At resonance Z = R (minimum), I = V/R (maximum), φ = 0 so cos φ = 1, and V_L = V_C in magnitude, pointing oppositely so they cancel. Misconception targeted: students often reject (d) because "equal voltages must add" — phasors pointing in opposite directions subtract.
• Q6 — Q = 50. Q = (1/R)√(L/C) = (1/10) × √(0.5/(2 × 10⁻⁶)) = (1/10) × 500 = 50. Misconception targeted: using Q = ω₀L/R with ν₀ in place of ω₀ gives a number 2π times too small — keep ω and ν strictly separated.
• Q7 — (c) 0 W. For a pure capacitor φ = 90°, so P = VI cos 90° = 0. Misconception targeted: option (a) is the apparent power VI — real current flows, yet no average power is consumed; the capacitor returns everything it borrows.
• Q8 — (c) 0.5 A. Power balance: V_p I_p = V_s I_s, so I_p = 22 × 5/220 = 0.5 A. Misconception targeted: option (b) applies the voltage ratio to current in the same direction — current transforms inversely to voltage.
• Q9 — (a). At resonance I is maximum and V_L = I_max X_L = (V/R)(ω₀L) = Q × V, so for Q >> 1 the inductor voltage dwarfs the supply; the reason is exactly the mechanism. Misconception targeted: choosing (b) by treating the magnification as a definition rather than the explanation — here the reason IS why the assertion holds.

Chapter Summary and Revision Checklist
• Summary: An AC source V = V₀ sin(ωt) drives each element differently. A resistor keeps current in phase and alone consumes power, P = V_rms I_rms. An inductor delays current by 90° behind a reactance X_L = ωL that grows with frequency; a capacitor advances current by 90° behind X_C = 1/(ωC) that shrinks with frequency; both average zero power. In series, the reactances fight: Z = √(R² + (X_L − X_C)²), tan φ = (X_L − X_C)/R. When they cancel, resonance strikes at ν₀ = 1/(2π√(LC)) — maximum current, unity power factor, voltages across L and C magnified Q times, with sharpness Q = (1/R)√(L/C) and bandwidth ν₀/Q. Average power is P = V I cos φ; the I sin φ part is wattless. A free LC loop oscillates at that same ν₀. And the transformer quietly trades voltage for current at fixed power via V_s/V_p = N_s/N_p — the device that made AC, and this chapter, necessary.
• Revision checklist — tick each only when you can do it without looking: write X_L and X_C from memory and state how each moves with frequency
• Revision checklist — state the lead/lag for R, L and C and reproduce the ELI–ICE mnemonic
• Revision checklist — draw the LCR phasor diagram and derive Z and tan φ from it
• Revision checklist — derive the resonance condition X_L = X_C and get ν₀ = 1/(2π√(LC))
• Revision checklist — state all three meanings of Q and compute one numerically
• Revision checklist — split a given current into active and wattless components
• Revision checklist — name the four transformer losses with their cures
• Self-assessment 1: What is φ for a pure capacitor, and what is its average power? Answer: φ = 90° (current leads), average power zero.
• Self-assessment 2: At resonance, what are Z, cos φ and I in terms of R and V? Answer: Z = R, cos φ = 1, I = V_rms/R (maximum).
• Self-assessment 3: Why is a transformer core laminated? Answer: to break up eddy currents in the core and cut the I²R heating they cause.
• Self-assessment 4: A circuit has X_L = X_C = 50 Ω and R = 30 Ω. What is Z, and what is special? Answer: Z = √(30² + 0²) = 30 Ω — the circuit is at resonance whatever the frequency that produced these reactances.
★ HIGHLIGHT — If you remember only five things: rms = peak/√2; ELI the ICE man; Z combines R with the DIFFERENCE of reactances; resonance lives at 1/(2π√(LC)) and magnifies voltage Q times; and power is VI cos φ — never just VI.
<!-- END phys_ch_21 detailedStudyNotes -->
