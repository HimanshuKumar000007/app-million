# Physics Ch 01 — Units and Measurements (RICH VERSION, written from scratch 2026-10-28)
# For: ChapterEntity id = "phys_ch_1", field detailedStudyNotes in SmartPrepSeedData.kt
# Syllabus: The international system of units; Significant figures; Dimensions of physical quantities; Dimensional formulae and dimensional equations; Dimensional analysis and its applications.
# Images for this chapter (PNG, delivered separately — add to app assets):
#   fig-1.1-vernier-calipers.png  (Section 3)
#   fig-1.2-screw-gauge.png       (Section 3)
#   fig-1.3-em-apparatus.png      (Section 11)
# ---- BEGIN detailedStudyNotes text (paste between the triple quotes) ----

1. Physical Quantities and the International System of Units (SI)

• Physics is a quantitative science: every law is stated through measurable physical quantities — length, mass, time, force, energy, charge and so on. A measurement is incomplete until it is written as a number multiplied by a unit: Q = n × u.

• The value of a quantity does not change when the unit changes: n₁u₁ = n₂u₂. Choose a smaller unit and the number grows in the same ratio — 1 km = 1000 m and 1 inch = 2.54 cm are the same lengths written in different units.

• Fundamental (base) quantities are the 7 quantities chosen by international agreement as independent of one another. All other quantities are derived quantities, built by multiplying or dividing base quantities — speed is length divided by time, force is mass multiplied by length divided by time squared.

• Length — metre (m): defined through the speed of light in vacuum, c = 299,792,458 m/s exactly. One metre is the distance light travels in 1/299,792,458 of a second.

• Mass — kilogram (kg): defined through the Planck constant h = 6.62607015 × 10⁻³⁴ J s exactly, together with the metre and the second.

• Time — second (s): the duration of 9,192,631,770 periods of the radiation from the caesium-133 atom transition. This atomic definition is why atomic clocks are accurate to about one second in millions of years.

• Electric current — ampere (A): defined through the elementary charge e = 1.602176634 × 10⁻¹⁹ C exactly. Temperature — kelvin (K): defined through the Boltzmann constant k = 1.380649 × 10⁻²³ J/K exactly.

• Amount of substance — mole (mol): exactly 6.02214076 × 10²³ elementary entities (the Avogadro number). Luminous intensity — candela (cd): light intensity measured against a standard source of frequency 540 × 10¹² Hz.

• Because the SI units are now tied to constants of nature, they can never drift, wear out or be destroyed — any laboratory in the universe can reproduce them exactly. This replaced the old system of physical standard objects, such as the platinum-iridium kilogram cylinder kept in Paris.


2. Derived Units, Prefixes and the Rules for Writing Units

• Force — newton (N) = kg m s⁻² • Work and energy — joule (J) = kg m² s⁻² • Power — watt (W) = kg m² s⁻³ • Pressure — pascal (Pa) = kg m⁻¹ s⁻² • Frequency — hertz (Hz) = s⁻¹

• Electric charge — coulomb (C) = A s • Potential difference — volt (V) = kg m² s⁻³ A⁻¹ • Resistance — ohm (Ω) = kg m² s⁻³ A⁻² • Capacitance — farad (F) = kg⁻¹ m⁻² s⁴ A²

• Plane angle — radian (rad): angle subtended by an arc equal to the radius. Solid angle — steradian (sr): the 3D counterpart. Both are dimensionless, yet both carry units — dimensionless does not mean unitless.

• Prefixes multiply a unit by a power of ten: pico (p) 10⁻¹² • nano (n) 10⁻⁹ • micro (μ) 10⁻⁶ • milli (m) 10⁻³ • centi (c) 10⁻² • deci (d) 10⁻¹ • kilo (k) 10³ • mega (M) 10⁶ • giga (G) 10⁹ • tera (T) 10¹².

• Useful non-SI units still in daily use: 1 Å = 10⁻¹⁰ m (atoms) • 1 nm = 10⁻⁹ m • 1 μm = 10⁻⁶ m • 1 light year = 9.46 × 10¹⁵ m • 1 AU = 1.496 × 10¹¹ m • 1 parsec = 3.08 × 10¹⁶ m • 1 amu (u) = 1.66 × 10⁻²⁷ kg • 1 eV = 1.602 × 10⁻¹⁹ J.

• Writing rules that examiners love to test: symbols are never followed by a full stop (write 5 kg, not 5 kg.); symbols never take a plural (write 10 N, not 10 Ns); leave a space between the number and the unit; and a unit named after a scientist begins with a capital symbol (N, J, W, Pa, Hz) but a small letter in full (newton, joule, watt).


3. Measurement — Least Count, Vernier Calipers and Screw Gauge [Fig. 1.1 and Fig. 1.2]

• No instrument measures a quantity perfectly. The least count (LC) of an instrument is the smallest change it can detect, and it fixes the precision of every reading taken with it: a metre scale (LC 1 mm) can never honestly report 12.34 cm.

• Vernier calipers measure lengths to about 10⁻⁴ m. The object sits between the lower (external) jaws; the upper jaws measure internal diameters, and the thin depth rod at the back measures the depth of a vessel.

• Least count of a vernier: LC = 1 MSD − 1 VSD (one main scale division minus one vernier scale division). If 10 vernier divisions coincide with 9 main scale divisions and 1 MSD = 1 mm, then LC = 1 mm − 0.9 mm = 0.1 mm = 0.01 cm.

• Reading a vernier: Reading = Main scale reading (the last full division before the vernier zero) + (Number of the vernier division that coincides × LC) − Zero error.

• Worked example (Vernier): main scale reading = 12 mm, the 7th vernier division coincides, LC = 0.1 mm. Reading = 12 + 7 × 0.1 = 12.7 mm = 1.27 cm.

• A screw gauge measures lengths to about 10⁻⁵ m — the diameter of a wire or the thickness of a sheet. One full rotation of the cap advances the spindle by a fixed distance called the pitch.

• Least count of a screw gauge: LC = Pitch ÷ Number of circular scale divisions. For pitch 0.5 mm and 50 divisions, LC = 0.5/50 = 0.01 mm. For pitch 1 mm and 100 divisions, LC is also 0.01 mm.

• Worked example (Screw gauge): main scale reading = 3 mm, the 32nd circular division coincides, LC = 0.01 mm. Reading = 3 + 32 × 0.01 = 3.32 mm. Always turn the ratchet for the final tightening — squeezing the cap by hand crushes the wire and falsifies the reading.

• Zero error: close the jaws gently. If the zeros do not coincide, the instrument carries a zero error, and every reading must be corrected: Corrected value = Observed reading − Zero error (with its sign). A zero that sits below the reference line gives a positive zero error, which is subtracted.


4. Errors in Measurement — Types, Accuracy and Precision

• The difference between a measured value and the true value is its error. Repeated measurements of the same quantity rarely agree exactly, so results are reported as a mean value together with an uncertainty: a = a_mean ± Δa.

• Systematic errors push every reading in the same direction by roughly the same amount — a zero error, a miscalibrated scale, or heat lost to the surroundings in every trial. They are reduced by better instruments and better technique, not by repeating readings.

• Random errors scatter readings on both sides of the true value with no pattern — small fluctuations in conditions or judgement. They are reduced by taking many readings and averaging.

• Gross errors come from carelessness — reading the wrong scale or noting a value wrongly. The only cure is repeating the experiment with attention. Such readings are simply rejected.

• Least count error belongs to the instrument: no reading can be trusted to better than one least count. This is why the choice of instrument must match the precision a problem demands.

• Absolute error of a reading = |measured value − true value|. The reported uncertainty Δa is the mean of the absolute errors of all readings. Relative (fractional) error = Δa / a_mean. Percentage error = (Δa / a_mean) × 100.

• Accuracy tells how close the mean is to the true value (limited by systematic errors). Precision tells how closely repeated readings agree with each other (limited by random errors and least count). A measurement can be precise but inaccurate — tight readings from a faulty instrument.

• Every final result must be written so that its last digit is the first uncertain digit — this is exactly the idea of significant figures, developed in Section 6.


5. Propagation of Errors — With Worked Examples

• Errors never cancel by luck; in the worst-case estimate used at this level, errors always add. The rules below follow from that one principle.

• Sum and difference (Z = A ± B): ΔZ = ΔA + ΔB. Note carefully — even for a difference, the absolute errors add, never subtract.

• Product and quotient (Z = A × B or Z = A ÷ B): ΔZ/Z = ΔA/A + ΔB/B. Relative errors add.

• Power rule (Z = Aⁿ): ΔZ/Z = n × (ΔA/A). A squared quantity doubles its percentage error and a cubed quantity triples it — powers amplify errors, which is why T² in the pendulum formula is so sensitive.

• General rule (Z = Aᵃ Bᵇ / Cᶜ): ΔZ/Z = |a|(ΔA/A) + |b|(ΔB/B) + |c|(ΔC/C), multiplied by 100 for the percentage error.

• Worked example (Density of a cube): mass measured with 2% error, each side measured with 1.5% error. Density ρ = m/V = m/L³, so percentage error in ρ = 2 + 3 × 1.5 = 6.5%.

• Worked example (Pendulum, g = 4π²L/T²): L = 100.0 cm measured to 0.1 cm (0.1% error) and T measured with 0.5% error. Percentage error in g = 0.1 + 2 × 0.5 = 1.1%. The lesson: to improve g, measure T better — time many oscillations (say 50) and divide, which divides the timing error by 50 as well.

• Practical rule for experiments: identify the quantity measured with the largest power and the largest relative error first — improving that single measurement improves the whole result the most.


6. Significant Figures — Rules, Rounding and Arithmetic

• The significant figures of a measurement are all the digits that are known reliably, plus the first uncertain digit. 23.023 cm has 5 significant figures; a result claimed as 23.0230 cm from a millimetre scale would be dishonest — the last digits are invented.

• Rule 1: All non-zero digits are significant. 237 has 3 and 2371 has 4 significant figures.

• Rule 2: Zeros between non-zero digits are significant. 2007 has 4 and 4.002 has 4 significant figures.

• Rule 3: Leading zeros are never significant — they only fix the decimal point. 0.0042 has 2 significant figures, and 0.000105 has 3.

• Rule 4: Trailing zeros in a number containing a decimal point are significant. 3.500 has 4, 0.00120 has 4 and 12.000 has 5 significant figures.

• Rule 5: In a whole number without a decimal point, trailing zeros are doubtful. Write such numbers in scientific notation to remove the doubt: 2500 may mean 2.5 × 10³ (2 significant figures) or 2.500 × 10³ (4 significant figures). Powers of ten themselves never count as significant figures.

• Rounding off: digit to be dropped less than 5 — leave the last retained digit unchanged (3.24 → 3.2). More than 5 — raise it by one (3.27 → 3.3). Exactly 5 — leave an even last digit unchanged and raise an odd one (3.25 → 3.2, but 3.35 → 3.4). This even-odd rule stops rounding from biasing long calculations upward.

• Addition and subtraction — match DECIMAL PLACES, not significant figures: 436.32 + 227.2 + 0.301 = 663.821, reported as 663.8 because 227.2 is known only to one decimal place.

• Multiplication and division — match SIGNIFICANT FIGURES: 2.456 × 1.2 = 2.9472, reported as 2.9 because 1.2 carries only 2 significant figures. Never round intermediate steps; carry extra digits through the calculation and round once, at the end.

• Order of magnitude: a quantity's order of magnitude is the power of ten closest to its value when written in scientific form — the diameter of a hydrogen atom is about 10⁻¹⁰ m, of order −10. Orders of magnitude let you sanity-check any numerical answer in seconds.


7. Dimensions of Physical Quantities — the Master List

• The dimensions of a quantity state which base quantities it is made of and to what powers: mass [M], length [L], time [T], current [A], temperature [K], amount of substance [mol] and luminous intensity [cd]. Velocity has dimension [L T⁻¹] because it is length divided by time.

• The dimensional formula is this bracketed expression; a dimensional equation sets the quantity equal to its formula, for example [Force] = [M L T⁻²], read off from F = ma: mass × (length/time²).

• Mechanics: velocity [L T⁻¹] • acceleration [L T⁻²] • momentum [M L T⁻¹] • impulse [M L T⁻¹] • force [M L T⁻²] • work, energy, torque [M L² T⁻²] • power [M L² T⁻³] • pressure, stress, Young's modulus [M L⁻¹ T⁻²] • density [M L⁻³] • frequency [T⁻¹]

• Rotational and fluid mechanics: angular velocity [T⁻¹] • angular acceleration [T⁻²] • angular momentum [M L² T⁻¹] • moment of inertia [M L²] • surface tension and surface energy per unit area [M T⁻²] • coefficient of viscosity η [M L⁻¹ T⁻¹] • gravitational constant G [M⁻¹ L³ T⁻²] (from F = G m₁m₂/r²)

• Heat: specific heat capacity [L² T⁻² K⁻¹] • latent heat [L² T⁻²] • gas constant R and Boltzmann constant k [M L² T⁻² K⁻¹] (R also carries mol⁻¹) • coefficient of thermal expansion [K⁻¹] • Stefan constant σ [M T⁻³ K⁻⁴]

• Electricity and magnetism: charge [A T] • electric field [M L T⁻³ A⁻¹] • potential and EMF [M L² T⁻³ A⁻¹] • resistance [M L² T⁻³ A⁻²] • capacitance [M⁻¹ L⁻² T⁴ A²] • inductance [M L² T⁻² A⁻²] • magnetic field B [M T⁻² A⁻¹] • permittivity ε₀ [M⁻¹ L⁻³ T⁴ A²] • permeability μ₀ [M L T⁻² A⁻²] • Planck constant h [M L² T⁻¹]

• Quantities with NO dimensions: plane angle, solid angle, strain, refractive index, relative density (specific gravity), coefficient of restitution, efficiency, and all pure numbers. They arise as ratios of two quantities of the same kind.

• Memorise these pairs with identical dimensions — favourite exam traps: work and torque; momentum and impulse; pressure, stress and Young's modulus; frequency, angular velocity and velocity gradient; Planck constant and angular momentum; surface tension and spring constant.


8. Dimensional Equations and the Principle of Homogeneity

• Principle of homogeneity: a physical equation can be true only if every term on both sides has identical dimensions. You may equate, add or subtract only quantities of the same dimensions — adding a length to a time is meaningless, in physics exactly as in arithmetic.

• The arguments of trigonometric, exponential and logarithmic functions are always dimensionless, and so are the functions themselves: in x = A sin(ωt), [ωt] must be dimensionless, which forces [ω] = [T⁻¹].

• Checking an equation — kinematic: s = ut + ½at². [ut] = [L T⁻¹ × T] = [L]. [at²] = [L T⁻² × T²] = [L]. Both match [s] = [L], so the equation passes the dimensional test.

• Checking an equation — energy of a photon: E = hν. [hν] = [M L² T⁻¹ × T⁻¹] = [M L² T⁻²] = [E]. Correct dimensionally — and it also reveals that h must have the dimensions of angular momentum.

• A warning in both directions: a dimensionally WRONG equation is certainly wrong, but a dimensionally correct equation may still be false — the method cannot see dimensionless constants. s = ut + 2at² passes every dimensional test yet is physically wrong; the true constant is ½.


9. Dimensional Analysis — Deriving Relations

• Method: guess that the quantity depends on the relevant parameters raised to unknown powers, write the dimensional equation, equate the powers of M, L and T on both sides, and solve the three equations.

• Derivation 1 — Pendulum: suppose T depends on length l, gravity g and mass m: T = k lᵃ gᵇ mᶜ. Dimensions: [T] = [L]ᵃ [L T⁻²]ᵇ [M]ᶜ. Powers of M: c = 0 — the period cannot depend on mass. Powers of T: −2b = 1, so b = −½. Powers of L: a + b = 0, so a = ½. Result: T = k√(l/g). Experiment then fixes the constant k = 2π, which no dimensional argument can supply.

• Derivation 2 — Stokes' viscous force: suppose the drag on a slow sphere depends on viscosity η, radius r and speed v: F = k ηᵃ rᵇ vᶜ. From [F] = [M L T⁻²], [η] = [M L⁻¹ T⁻¹], [r] = [L], [v] = [L T⁻¹]: powers of M give a = 1; powers of T give −a − c = −2, so c = 1; powers of L give −a + b + c = 1, so b = 1. Result: F = kηrv, and experiment gives k = 6π — the famous Stokes' law F = 6πηrv.

• Derivation 3 — Centripetal force: suppose F depends on mass m, speed v and radius r: F = k mᵃ vᵇ rᶜ. Powers of M: a = 1. Powers of T: −b = −2, so b = 2. Powers of L: b + c = 1, so c = −1. Result: F = k mv²/r, with k = 1 found from theory or experiment.

• The same method correctly predicts the speed of sound up to a constant (v ∝ √(elastic modulus/density)), the frequency of a stretched string (ν ∝ (1/l)√(T/μ)) and the radius of an orbit's dependence in Kepler's third law (T² ∝ r³).


10. Dimensional Analysis — Unit Conversion and Limitations

• Converting the units of a derived quantity: if a quantity has dimensional formula [Mᵃ Lᵇ Tᶜ] and value n₁ in one system, its value n₂ in a second system is n₂ = n₁ × (M₁/M₂)ᵃ × (L₁/L₂)ᵇ × (T₁/T₂)ᶜ, where M₁, L₁, T₁ and M₂, L₂, T₂ are the base units of the two systems.

• Worked conversion 1: 1 newton into dynes. Force has a = 1, b = 1, c = −2. n₂ = 1 × (kg/g)¹ × (m/cm)¹ × (s/s)⁻² = 1000 × 100 = 10⁵. So 1 N = 10⁵ dyne.

• Worked conversion 2: 1 joule into ergs. Energy has a = 1, b = 2, c = −2. n₂ = 1 × (kg/g)¹ × (m/cm)² = 1000 × 10⁴ = 10⁷. So 1 J = 10⁷ erg.

• Worked conversion 3: the density of mercury, 13.6 g/cm³, in SI units. Density has a = 1, b = −3: n₂ = 13.6 × (g/kg)¹ × (cm/m)⁻³ = 13.6 × 10⁻³ × 10⁶ = 13,600 kg/m³. Equivalently, 1 g/cm³ = 1000 kg/m³.

• Limitation 1: dimensionless constants (2π, ½, 6π, e) are invisible to the method — it gives the form of a law, never its exact constant.

• Limitation 2: it fails for relations involving sums of terms, or exponential, logarithmic and trigonometric functions — the period of a pendulum at large amplitude and radioactive decay N = N₀e^(−λt) cannot be derived this way (only that [λ] = [T⁻¹]).

• Limitation 3: it cannot distinguish quantities sharing dimensions — it will happily "derive" torque where energy belongs. Limitation 4: with only three equations (M, L, T) it fails when a quantity depends on more than three parameters. Limitation 5: it says nothing about whether a quantity is a scalar or a vector.


11. Apparatus in Focus — Charge-to-Mass Ratio of the Electron [Fig. 1.3]

• Since electrons are negatively charged, the charge on an electron is designated as −e, and its mass is written mₑ. For decades neither e nor mₑ could be measured separately — but their ratio e/m could, and J. J. Thomson measured it in 1897 with the apparatus of Fig. 2.2.

• The apparatus to determine the charge to mass ratio of electron consists of a cathode ray tube with cathode and anode, connected to a high voltage source. A magnet is placed around the tube, and the electron beam falls on a fluorescent screen.

• When only electric field is applied, electrons deviate to point A — the negative electrons are pulled towards the positive plate. When only magnetic field is applied, electrons hit point C — the magnetic Lorentz force bends them the opposite way. By balancing both fields, electrons travel straight to point B — the undeflected path.

• Step 1 — Acceleration: an electron through voltage V gains kinetic energy eV = ½mₑv². Step 2 — Balance: with both fields adjusted until the beam is straight, electric force equals magnetic force, eE = evB, hence v = E/B. This balance arrangement is called a velocity selector — only electrons of exactly this speed pass undeflected.

• Step 3 — Combine: substituting v = E/B into eV = ½mₑv² gives e/mₑ = E²/(2VB²). Every quantity on the right is directly measurable, and the result is e/mₑ ≈ 1.76 × 10¹¹ C/kg — enormously larger than the same ratio for a hydrogen ion (about 1836 times, in fact), which first revealed that the electron is far lighter than any atom.


12. Solved Numericals and Rapid Revision

• Numerical 1 (Significant figures): the sides of a cuboid are 1.20 cm, 2.5 cm and 4.00 cm. Volume = 1.20 × 2.5 × 4.00 = 12.0 cm³ — reported to 2 significant figures as 12 cm³, because 2.5 (2 significant figures) limits the result, not the multiplication itself.

• Numerical 2 (Error): a resistance R = V/I with V = 100 ± 5 V and I = 10 ± 0.2 A. R = 10 Ω. Percentage error in R = 5% + 2% = 7%, so R = 10.0 ± 0.7 Ω.

• Numerical 3 (Dimensions): show that kinetic energy and work share dimensions. KE = ½mv²: [M] × [L T⁻¹]² = [M L² T⁻²]. Work = force × displacement: [M L T⁻²] × [L] = [M L² T⁻²]. Identical — as the work-energy theorem demands.

• Numerical 4 (Checking): is the equation v² = u² + 2as dimensionally sound? [v²] = [L² T⁻²]; [u²] = [L² T⁻²]; [as] = [L T⁻² × L] = [L² T⁻²]. All three terms match — sound.

• Rapid revision — the whole chapter on one screen: Q = n × u with n₁u₁ = n₂u₂ • 7 SI base units, defined by constants of nature • LC (Vernier) = 1 MSD − 1 VSD • LC (Screw gauge) = Pitch ÷ circular divisions • Errors always add • ΔZ/Z = Σ |power| × (Δquantity/quantity) • Significant figures: decimal places for + and −, significant figures for × and ÷ • [F] = [MLT⁻²], [E] = [ML²T⁻²], [P] = [ML²T⁻³], [G] = [M⁻¹L³T⁻²], [h] = [ML²T⁻¹] • Homogeneity: terms can be equated only if dimensions match • Dimensional analysis derives forms and converts units, but never finds constants like 2π • e/mₑ = E²/(2VB²) ≈ 1.76 × 10¹¹ C/kg.

# ---- END detailedStudyNotes text ----
