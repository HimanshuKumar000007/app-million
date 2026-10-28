# Physics • Ch 01 — Units and Measurements (Read-tab structured version)

**Syllabus:** The international system of units; Significant figures; Dimensions of physical quantities; Dimensional formulae and dimensional equations; Dimensional analysis and its applications.

**Figures:** fig-1.1 Vernier calipers · fig-1.2 Screw gauge · fig-1.3 Thomson e/m apparatus · fig-1.4 Zero errors · fig-1.5 The 7 SI base units (in `ch01-units-and-measurements/images/`; see `READ-TAB-IMAGE-PATCH.md` to display them in the Read tab).

## Units, Measurement and the SI System

• Physics is a quantitative science: every law is stated through measurable physical quantities — length, mass, time, force, energy, charge. A measurement is complete only when written as a number multiplied by a unit: Q = n × u.

• The quantity itself never changes when the unit changes: n₁u₁ = n₂u₂. Choose a smaller unit and the number grows in the same ratio — 1 km = 1000 m and 1 inch = 2.54 cm are the same lengths in different clothes.

• Fundamental (base) quantities are the 7 quantities fixed by international agreement as independent of one another. Every other quantity is a derived quantity, built by multiplying or dividing base quantities: speed is length ÷ time, force is mass × length ÷ time².

★ HIGHLIGHT — A unit is a standard reference of the same kind as the quantity. A good standard must be well defined, easily reproducible anywhere, stable with time, and of a convenient size.

## ▸ The Seven SI Base Units — the 2019 Definitions

• Length — metre (m): defined through the speed of light in vacuum, c = 299,792,458 m/s exactly. One metre is the distance light travels in 1/299,792,458 of a second.

• Mass — kilogram (kg): defined through the Planck constant h = 6.62607015 × 10⁻³⁴ J s exactly, together with the metre and the second. The old platinum-iridium cylinder in Paris is retired.

• Time — second (s): the duration of 9,192,631,770 periods of the caesium-133 atom transition; the caesium frequency Δν_Cs = 9,192,631,770 Hz exactly. This is why atomic clocks err by about a second in millions of years.

• Electric current — ampere (A): defined through the elementary charge e = 1.602176634 × 10⁻¹⁹ C exactly. Temperature — kelvin (K): defined through the Boltzmann constant k_B = 1.380649 × 10⁻²³ J/K exactly.

• Amount of substance — mole (mol): exactly 6.02214076 × 10²³ elementary entities (the Avogadro constant N_A). Luminous intensity — candela (cd): defined through the luminous efficacy K_cd = 683 lm/W at frequency 540 × 10¹² Hz.

★ HIGHLIGHT — All 7 SI units now rest on 7 fixed constants of nature: c, h, e, k_B, N_A, Δν_Cs, K_cd. They can never drift or be destroyed — any laboratory in the universe can reproduce them exactly.

## ▸ Derived Units, Supplementary Units, Prefixes and Writing Rules

• Force — newton (N) = kg m s⁻² • Work and energy — joule (J) = kg m² s⁻² • Power — watt (W) = kg m² s⁻³ • Pressure — pascal (Pa) = kg m⁻¹ s⁻² • Frequency — hertz (Hz) = s⁻¹ • Charge — coulomb (C) = A s • Potential — volt (V) = kg m² s⁻³ A⁻¹ • Resistance — ohm (Ω) = kg m² s⁻³ A⁻² • Capacitance — farad (F) = kg⁻¹ m⁻² s⁴ A².

• Supplementary units: plane angle — radian (rad), the angle subtended by an arc equal to the radius; solid angle — steradian (sr), its 3D counterpart. Both are dimensionless ratios of lengths, yet both carry unit names.

⚠ EXAM TRAP — Dimensionless does NOT mean unitless: the radian and steradian are dimensionless but are genuine units. Conversely, strain and refractive index are dimensionless AND unitless.

• Prefixes scale a unit by powers of ten: pico (p) 10⁻¹² • nano (n) 10⁻⁹ • micro (μ) 10⁻⁶ • milli (m) 10⁻³ • centi (c) 10⁻² • deci (d) 10⁻¹ • kilo (k) 10³ • mega (M) 10⁶ • giga (G) 10⁹ • tera (T) 10¹².

• Practical and astronomical units: 1 fm = 10⁻¹⁵ m (nuclei) • 1 Å = 10⁻¹⁰ m (atoms) • 1 nm = 10⁻⁹ m • 1 μm = 10⁻⁶ m • 1 light year = 9.46 × 10¹⁵ m • 1 AU = 1.496 × 10¹¹ m • 1 parsec = 3.08 × 10¹⁶ m (the largest length unit here) • 1 amu (u) = 1.66 × 10⁻²⁷ kg • 1 eV = 1.602 × 10⁻¹⁹ J.

• Writing rules examiners test: never a full stop after a symbol (5 kg, not 5 kg.); never a plural (10 N, not 10 Ns); a space between number and unit; units named after scientists take capital symbols (N, J, W, Pa) but small letters in full (newton, joule, watt).

## Significant Figures — What They Mean

• The significant figures of a measurement are all the digits known reliably, plus the first uncertain digit. A length written 23.023 cm claims 5 significant figures — knowledge up to the last digit. Writing 23.0230 cm from a millimetre scale would be dishonest: the extra digits are invented.

• Significant figures are therefore a language of honesty: the number of significant figures tells the reader exactly how precise the measurement was, and the last significant digit is always the doubtful one.

• Order of magnitude: write the number in scientific form; its order of magnitude is the power of ten it is closest to. The diameter of a hydrogen atom ≈ 10⁻¹⁰ m is of order −10. Orders of magnitude let you sanity-check any numerical answer in seconds.

## ▸ Counting Significant Figures — the 6 Rules

• Rule 1: All non-zero digits are significant. 237 has 3; 2371 has 4 significant figures.

• Rule 2: Zeros between non-zero digits are significant. 2007 has 4; 4.002 has 4 significant figures.

• Rule 3: Leading zeros are never significant — they only fix the decimal point. 0.0042 has 2; 0.000105 has 3 significant figures.

• Rule 4: Trailing zeros in a number WITH a decimal point are significant. 3.500 has 4; 0.00120 has 4; 12.000 has 5 significant figures.

• Rule 5: In a whole number WITHOUT a decimal point, trailing zeros are doubtful. Use scientific notation to say what you mean: 2500 may be 2.5 × 10³ (2 significant figures) or 2.500 × 10³ (4 significant figures).

• Rule 6: Powers of ten never count, and exact numbers — counted objects and defined constants (12 in a dozen, c = 299,792,458 m/s) — have infinitely many significant figures and never limit a calculation.

## ▸ Rounding Off and Arithmetic with Significant Figures

• Rounding off: the digit to be dropped is less than 5 — leave the last retained digit unchanged (3.24 → 3.2). Greater than 5 — raise it by one (3.27 → 3.3).

• Exactly 5 — the unbiased even-odd rule: leave an even last digit unchanged (3.25 → 3.2) and raise an odd one (3.35 → 3.4). Over long calculations this stops rounding from biasing results upward.

• Addition and subtraction follow DECIMAL PLACES, not significant figures: 436.32 + 227.2 + 0.301 = 663.821, reported as 663.8, because 227.2 is known only to one decimal place.

• Multiplication and division follow SIGNIFICANT FIGURES: 2.456 × 1.2 = 2.9472, reported as 2.9, because 1.2 carries only 2 significant figures.

⚠ EXAM TRAP — Never round intermediate steps. Carry extra digits through the whole calculation and round once, at the very end.

## Measurement and Least Count

• No instrument measures perfectly. The least count (LC) of an instrument is the smallest change it can detect, and it fixes the precision of every reading: a metre scale (LC 1 mm) can never honestly report 12.34 cm.

✔ KEY FORMULA — Least count = smallest division the instrument can resolve. Finer instrument → smaller LC → more significant figures in every reading.

• Every experiment in this chapter is a fight for a smaller least count: metre scale 10⁻³ m, Vernier calipers 10⁻⁴ m, screw gauge 10⁻⁵ m, and travelling microscopes finer still.

## ▸ Vernier Calipers — Least Count, Reading and Zero Error [Fig. 1.1, Fig. 1.4]

• The object sits between the lower (external) jaws; the upper jaws measure internal diameters, and the thin depth rod at the back measures the depth of a vessel.

✔ KEY FORMULA — LC = 1 MSD − 1 VSD (one main scale division minus one vernier scale division). If 10 vernier divisions coincide with 9 main scale divisions and 1 MSD = 1 mm, then LC = 1 mm − 0.9 mm = 0.1 mm = 0.01 cm.

✔ KEY FORMULA — Reading = Main scale reading (last full division before the vernier zero) + (Coinciding vernier division × LC) − Zero error.

• Worked example: main scale reading = 12 mm, the 7th vernier division coincides, LC = 0.1 mm. Reading = 12 + 7 × 0.1 = 12.7 mm = 1.27 cm.

• Zero error: close the jaws gently. If the vernier zero sits to the RIGHT of the main-scale zero, the instrument over-reads — positive zero error, subtracted from every reading. If it sits to the LEFT, the zero error is negative and its magnitude is added. Corrected value = Observed reading − Zero error (with sign).

## ▸ Screw Gauge — Least Count, Reading and Zero Error [Fig. 1.2, Fig. 1.4]

• A screw gauge (micrometer) measures the diameter of a wire or thickness of a sheet to about 10⁻⁵ m. One full rotation of the cap advances the spindle by a fixed distance called the pitch.

✔ KEY FORMULA — LC = Pitch ÷ Number of circular scale divisions. Pitch 0.5 mm with 50 divisions gives LC = 0.01 mm; pitch 1 mm with 100 divisions also gives 0.01 mm.

✔ KEY FORMULA — Reading = Main scale reading + (Coinciding circular division × LC) − Zero error.

• Worked example: main scale reading = 3 mm, the 32nd circular division coincides, LC = 0.01 mm. Reading = 3 + 32 × 0.01 = 3.32 mm.

• Zero error: with the anvil and spindle in contact, if the instrument reads +0.05 mm (5 divisions), every reading is 0.05 mm too large — subtract it. A reading of −0.03 mm at contact means adding 0.03 mm to every measurement.

⚠ EXAM TRAP — Always use the ratchet for final tightening. Squeezing the cap by hand crushes the wire and falsifies the diameter.

## Errors in Measurement — Types and Measures

• The difference between a measured value and the true value is its error. Because repeated readings rarely agree exactly, results are reported as a mean with an uncertainty: a = a_mean ± Δa.

• Systematic errors push every reading the same way by roughly the same amount — zero error, a miscalibrated scale, heat lost to the surroundings in every trial. Cure: better instruments and technique, never mere repetition.

• Random errors scatter readings on both sides of the true value with no pattern — small fluctuations in conditions and judgement. Cure: many readings and averaging.

• Gross errors come from carelessness — reading the wrong scale, noting a value wrongly. The cure is attention; such readings are simply rejected.

• Least count error belongs to the instrument itself: no reading can be trusted beyond one least count.

• Absolute error of a reading = |measured value − true value|; the reported Δa is the mean of the absolute errors. Relative (fractional) error = Δa / a_mean. Percentage error = (Δa / a_mean) × 100.

## ▸ Accuracy versus Precision

• Accuracy = how close the mean is to the TRUE value; it is limited by systematic errors. Precision = how closely repeated readings agree WITH EACH OTHER; it is limited by random errors and least count.

• A faulty instrument can give tightly clustered readings that are all wrong together — precise but inaccurate. A coarse instrument can scatter readings around the true value — accurate on average but imprecise.

★ HIGHLIGHT — Every reported result must end at its first uncertain digit. That single sentence is the bridge between errors and significant figures.

## Propagation of Errors — the Rules

• Working principle: in the maximum-error estimate used at this level, errors always ADD — they are never assumed to cancel.

✔ KEY FORMULA — Sum and difference (Z = A ± B): ΔZ = ΔA + ΔB. Even for a difference, absolute errors add — never subtract.

✔ KEY FORMULA — Product and quotient (Z = A × B or Z = A ÷ B): ΔZ/Z = ΔA/A + ΔB/B. Relative errors add.

✔ KEY FORMULA — Power rule (Z = Aⁿ): ΔZ/Z = n × (ΔA/A). A squared quantity doubles its percentage error; a cubed quantity triples it — powers amplify errors.

✔ KEY FORMULA — General rule (Z = Aᵃ Bᵇ / Cᶜ): ΔZ/Z = |a|(ΔA/A) + |b|(ΔB/B) + |c|(ΔC/C), × 100 for percentage error. Denominator errors add too.

## ▸ Propagation — Worked Examples and Laboratory Strategy

• Example 1 (Density of a cube): mass has 2% error, each side 1.5%. ρ = m/L³, so error in ρ = 2 + 3 × 1.5 = 6.5%.

• Example 2 (Pendulum, g = 4π²L/T²): L measured to 0.1% and T to 0.5%. Error in g = 0.1 + 2 × 0.5 = 1.1%. To improve g, improve T: time 50 oscillations and divide — the timing error divides by 50 as well.

• Maximum permissible vs most probable error: the rules above give the worst-case (maximum permissible) error asked in exams. Research laboratories combine independent random errors in quadrature: ΔZ/Z = √[(p·ΔA/A)² + (q·ΔB/B)² + (r·ΔC/C)²] — always smaller than the maximum.

★ HIGHLIGHT — Laboratory strategy: find the quantity with the largest power × largest relative error. Improving that ONE measurement improves the whole result the most.

## Dimensions of Physical Quantities

• The dimensions of a quantity state which base quantities compose it, and to what powers: [M] mass, [L] length, [T] time, [A] current, [K] temperature, [mol] amount, [cd] luminous intensity. Velocity is [L T⁻¹] because it is length divided by time.

• The dimensional formula is this bracketed expression. A dimensional equation sets the quantity equal to its formula — [Force] = [M L T⁻²], read off from F = ma: mass × (length ÷ time²).

✔ KEY FORMULA — To find any dimensional formula: write the defining equation, replace each quantity by its dimensions, and simplify. Every entry in the master lists below is derived exactly this way.

## ▸ Master List — Mechanics and Fluids

• Velocity [L T⁻¹] • Acceleration [L T⁻²] • Momentum [M L T⁻¹] • Impulse [M L T⁻¹] • Force [M L T⁻²] • Work, energy, torque [M L² T⁻²] • Power [M L² T⁻³]

• Pressure, stress, Young's modulus [M L⁻¹ T⁻²] • Density [M L⁻³] • Frequency [T⁻¹] • Angular velocity [T⁻¹] • Angular acceleration [T⁻²] • Angular momentum [M L² T⁻¹] • Moment of inertia [M L²]

• Surface tension, surface energy per unit area [M T⁻²] • Coefficient of viscosity η [M L⁻¹ T⁻¹] • Gravitational constant G [M⁻¹ L³ T⁻²] (from F = G m₁m₂/r²)

## ▸ Master List — Heat, Electricity, Magnetism and Modern Physics

• Heat: specific heat capacity [L² T⁻² K⁻¹] • Latent heat [L² T⁻²] • Gas constant R [M L² T⁻² K⁻¹ mol⁻¹] • Boltzmann constant k_B [M L² T⁻² K⁻¹] • Molar heat capacity C_v [M L² T⁻² K⁻¹ mol⁻¹] • Coefficient of thermal expansion [K⁻¹] • Stefan constant σ [M T⁻³ K⁻⁴]

• Electricity and magnetism: charge [A T] • Electric field [M L T⁻³ A⁻¹] • Potential, EMF [M L² T⁻³ A⁻¹] • Resistance [M L² T⁻³ A⁻²] • Capacitance [M⁻¹ L⁻² T⁴ A²] • Inductance [M L² T⁻² A⁻²] • Magnetic field B [M T⁻² A⁻¹] • Magnetic flux Φ_B [M L² T⁻² A⁻¹] • Permittivity ε₀ [M⁻¹ L⁻³ T⁴ A²] • Permeability μ₀ [M L T⁻² A⁻²] • Planck constant h [M L² T⁻¹]

• Modern physics: Rydberg constant R_H [L⁻¹] (about 1.097 × 10⁷ m⁻¹ — a pure inverse length, because it appears in 1/λ) • Work function Φ [M L² T⁻²] (an energy)

## ▸ Identical Dimensions, Trap Pairs and Dimensionless Quantities

• Memorise the pairs with identical dimensions: work and torque • momentum and impulse • pressure, stress and Young's modulus • frequency, angular velocity and velocity gradient • Planck constant and angular momentum • surface tension and spring constant.

• Quantities with NO dimensions: plane angle, solid angle, strain, refractive index, relative density, coefficient of restitution, efficiency — and the Reynolds number Re = ρvL/η (check: [M L⁻³][L T⁻¹][L] ÷ [M L⁻¹ T⁻¹] = 1).

⚠ EXAM TRAP — Identical dimensions do NOT mean identical nature: torque is a vector, work a scalar; the method cannot tell them apart.

## Principle of Homogeneity — Checking Equations

• Principle of homogeneity: a physical equation can be true only if every term on both sides has identical dimensions. Only quantities of the same dimensions may be equated, added or subtracted — adding a length to a time is as meaningless in physics as in arithmetic.

• The arguments of sin, cos, e^x and ln are always dimensionless, and so are the functions themselves. In x = A sin(ωt), [ωt] must be dimensionless, forcing [ω] = [T⁻¹].

• Check 1 (Kinematics): s = ut + ½at². [ut] = [L T⁻¹ × T] = [L]. [at²] = [L T⁻² × T²] = [L]. Both match [s] = [L] — the equation passes.

• Check 2 (Photon energy): E = hν. [hν] = [M L² T⁻¹ × T⁻¹] = [M L² T⁻²] = [E] — and it reveals that h has the dimensions of angular momentum.

⚠ EXAM TRAP — Homogeneity is necessary, not sufficient: a dimensionally wrong equation is certainly wrong, but s = ut + 2at² passes every dimensional test and is still false — the true constant is ½, and constants are invisible to dimensions.

## Dimensional Analysis — Deriving Relations

• The method: guess that the quantity depends on the relevant parameters raised to unknown powers; write the dimensional equation; equate the powers of M, L and T; solve the three equations.

• Derivation 1 — Pendulum: T = k lᵃ gᵇ mᶜ. Powers of M: c = 0 (period cannot depend on mass). Powers of T: −2b = 1, so b = −½. Powers of L: a + b = 0, so a = ½. Result: T = k√(l/g); experiment fixes k = 2π.

• Derivation 2 — Stokes' viscous force: F = k ηᵃ rᵇ vᶜ. Powers of M: a = 1. Powers of T: −a − c = −2, so c = 1. Powers of L: −a + b + c = 1, so b = 1. Result: F = kηrv; experiment gives k = 6π — Stokes' law F = 6πηrv.

• Derivation 3 — Centripetal force: F = k mᵃ vᵇ rᶜ gives a = 1, b = 2, c = −1. Result: F = k mv²/r, with k = 1 from theory.

• Derivation 4 — Speed of sound in a fluid: v = k Bᵃ ρᵇ with [B] = [M L⁻¹ T⁻²], [ρ] = [M L⁻³] gives a = ½, b = −½. Result: v = k√(B/ρ) — the Newton–Laplace form v = √(γP/ρ), with dimensionless γ hidden in k.

## ▸ Dimensional Analysis — Converting Units Between Systems

✔ KEY FORMULA — If a quantity has dimensional formula [Mᵃ Lᵇ Tᶜ], then n₂ = n₁ × (M₁/M₂)ᵃ × (L₁/L₂)ᵇ × (T₁/T₂)ᶜ converts its value from system 1 to system 2.

• Conversion 1: 1 newton into dynes. a = 1, b = 1, c = −2: n₂ = (kg/g) × (m/cm) = 1000 × 100 = 10⁵. So 1 N = 10⁵ dyne.

• Conversion 2: 1 joule into ergs. a = 1, b = 2: n₂ = (kg/g) × (m/cm)² = 1000 × 10⁴ = 10⁷. So 1 J = 10⁷ erg.

• Conversion 3: density of mercury 13.6 g/cm³ into SI. n₂ = 13.6 × (g/kg) × (cm/m)⁻³ = 13.6 × 10⁻³ × 10⁶ = 13,600 kg/m³. Equivalently, 1 g/cm³ = 1000 kg/m³.

## ▸ Limitations of Dimensional Analysis

• Limit 1: dimensionless constants (2π, ½, 6π) are invisible — the method gives the form of a law, never its exact constant.

• Limit 2: it fails for relations built from sums of terms, or from exponential, logarithmic and trigonometric functions — only that [λ] = [T⁻¹] in N = N₀e^(−λt) can be found, not the law itself.

• Limit 3: it cannot distinguish quantities that share dimensions (work vs torque). Limit 4: with only three equations (M, L, T) it fails when a quantity depends on more than three parameters. Limit 5: it says nothing about scalar versus vector nature.

## Apparatus in Focus — Thomson's e/m Experiment [Fig. 1.3]

• Electrons are negatively charged, so an electron's charge is written −e and its mass mₑ. Neither could be measured separately for decades — but their ratio e/m could, and J. J. Thomson measured it in 1897 with the cathode ray tube of the apparatus figure.

• The apparatus consists of a cathode ray tube with cathode and anode connected to a high voltage source, a magnet placed around the tube, and a fluorescent screen on which the electron beam falls.

• Electric field alone: electrons deviate to point A, pulled towards the positive plate. Magnetic field alone: electrons hit point C, bent the opposite way by the Lorentz force. Both fields balanced: electrons travel straight to point B.

✔ KEY FORMULA — Step 1 (acceleration): eV = ½mₑv². Step 2 (balance — the velocity selector): eE = evB gives v = E/B. Step 3 (combine): e/mₑ = E²/(2VB²).

• Every quantity on the right is directly measurable, and the result is e/mₑ ≈ 1.76 × 10¹¹ C/kg — about 1836 times the same ratio for a hydrogen ion, the first evidence that the electron is far lighter than any atom.

## Solved Numericals

• Numerical 1 (Significant figures): a cuboid has sides 1.20 cm, 2.5 cm, 4.00 cm. Volume = 1.20 × 2.5 × 4.00 = 12.0 cm³, reported as 12 cm³ — 2 significant figures, because 2.5 limits the result.

• Numerical 2 (Error): R = V/I with V = 100 ± 5 V and I = 10 ± 0.2 A. R = 10 Ω; percentage error = 5% + 2% = 7%, so R = 10.0 ± 0.7 Ω.

• Numerical 3 (Dimensions): kinetic energy ½mv²: [M][L T⁻¹]² = [M L² T⁻²]; work = force × displacement: [M L T⁻²][L] = [M L² T⁻²]. Identical — as the work-energy theorem demands.

• Numerical 4 (Checking): v² = u² + 2as. [v²] = [u²] = [L² T⁻²]; [as] = [L T⁻² × L] = [L² T⁻²]. All terms match — dimensionally sound.

## ★ Rapid Revision — the Whole Chapter on One Screen

• Q = n × u, and n₁u₁ = n₂u₂ • 7 SI base units defined by 7 constants of nature • Vernier LC = 1 MSD − 1 VSD • Screw gauge LC = Pitch ÷ circular divisions • Corrected reading = Observed − Zero error (with sign)

• Errors always add • ΔZ/Z = Σ |power| × (Δquantity ÷ quantity) • Significant figures: decimal places for + and −, significant figures for × and ÷ • Even-odd rule for rounding a final 5

• [F] = [MLT⁻²] • [E] = [ML²T⁻²] • [P] = [ML²T⁻³] • [G] = [M⁻¹L³T⁻²] • [h] = [ML²T⁻¹] • Homogeneity: dimensions must match term by term • Arguments of sin, e^x, ln are dimensionless

• Dimensional analysis derives forms and converts units, but never finds 2π • Stokes F = 6πηrv • Pendulum T = 2π√(l/g) • Sound v = √(γP/ρ) • e/mₑ = E²/(2VB²) ≈ 1.76 × 10¹¹ C/kg
