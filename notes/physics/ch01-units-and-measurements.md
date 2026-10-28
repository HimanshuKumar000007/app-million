# Physics Ch 01 — Units and Measurements
# For: ChapterEntity id = "phys_ch_1", field detailedStudyNotes in SmartPrepSeedData.kt
# Syllabus: The international system of units; Significant figures; Dimensions of physical quantities; Dimensional formulae and dimensional equations; Dimensional analysis and its applications.
# Images for this chapter (PNG, delivered separately — add to app assets):
#   fig-1.1-vernier-calipers.png  (Section 3)
#   fig-1.2-screw-gauge.png       (Section 3)
#   fig-1.3-em-apparatus.png      (Section 7)
# ---- BEGIN detailedStudyNotes text (paste between the triple quotes) ----

1. The International System of Units (SI)

• A physical quantity is expressed as Q = n × u (number × unit). If the unit becomes smaller, the number becomes larger: n₁u₁ = n₂u₂.

• The 7 SI base quantities are: Length (metre, m), Mass (kilogram, kg), Time (second, s), Electric Current (ampere, A), Temperature (kelvin, K), Amount of Substance (mole, mol), Luminous Intensity (candela, cd).

• Plane angle (radian, rad) and solid angle (steradian, sr) are dimensionless supplementary quantities.

• Common derived units: Force — newton (N) = kg m s⁻²; Energy — joule (J) = kg m² s⁻²; Power — watt (W) = kg m² s⁻³; Pressure — pascal (Pa) = kg m⁻¹ s⁻²; Charge — coulomb (C) = A s.

• Prefixes: pico 10⁻¹², nano 10⁻⁹, micro 10⁻⁶, milli 10⁻³, centi 10⁻², kilo 10³, mega 10⁶, giga 10⁹, tera 10¹².

• Modern SI units are defined through fixed constants of nature — the metre from the speed of light c, the second from the caesium atom frequency, and the kilogram from the Planck constant h.


2. Significant Figures

• Significant figures are all reliably known digits plus one uncertain digit. They show the precision of a measurement.

• All non-zero digits are significant; zeros between non-zero digits are significant (2007 has 4 SF).

• Leading zeros are NOT significant (0.0042 has 2 SF); trailing zeros after a decimal point ARE significant (3.500 has 4 SF; 0.00120 has 4 SF).

• Rounding off: digit to be dropped < 5 → keep previous digit; > 5 → increase previous digit by 1; exactly 5 → keep even, raise odd (3.25 → 3.2; 3.35 → 3.4).

• Addition/Subtraction: round the result to the smallest number of DECIMAL PLACES. 12.587 + 3.2 = 15.8.

• Multiplication/Division: round the result to the smallest number of SIGNIFICANT FIGURES. 4.327 × 2.1 = 9.1.

• Never round at intermediate steps — calculate fully and round only the final answer.


3. Measuring Instruments, Least Count & Errors

• Least count (LC) is the smallest value an instrument can measure. Smaller LC means higher precision.

• Vernier Calipers [Fig. 1.1]: LC = 1 MSD − 1 VSD. If 10 VSD = 9 MSD and 1 MSD = 1 mm, LC = 0.1 mm = 0.01 cm. Lower jaws measure external size, upper jaws internal size, and the depth rod measures depth.

• Screw Gauge [Fig. 1.2]: LC = Pitch ÷ Number of Circular Scale Divisions. Pitch 1 mm with 100 divisions gives LC = 0.01 mm. Use the ratchet to avoid excess pressure.

• Reading = Main scale reading + (Coinciding division × LC) − Zero error (with sign). Zero error is found by closing the jaws fully.

• Absolute error = |measured − true| value. Relative error = mean absolute error ÷ mean value. Percentage error = relative error × 100.

• Error propagation — Sum/Difference (Z = A ± B): ΔZ = ΔA + ΔB. Product/Power (Z = Aᵃ Bᵇ / Cᶜ): ΔZ/Z = |a|(ΔA/A) + |b|(ΔB/B) + |c|(ΔC/C). Errors always add — never subtract.


4. Dimensions and Dimensional Formulae

• Dimensions show how a quantity is built from [M], [L], [T], [A], [K], [mol], [cd]. The dimensional equation equates the quantity with its formula, e.g. [Force] = [M L T⁻²].

• Velocity [L T⁻¹] • Acceleration [L T⁻²] • Force [M L T⁻²] • Work/Energy/Torque [M L² T⁻²] • Power [M L² T⁻³]

• Pressure/Stress [M L⁻¹ T⁻²] • Momentum/Impulse [M L T⁻¹] • Density [M L⁻³] • Frequency [T⁻¹] • Angular Momentum [M L² T⁻¹]

• Moment of Inertia [M L²] • Surface Tension [M T⁻²] • Viscosity [M L⁻¹ T⁻¹] • Gravitational Constant G [M⁻¹ L³ T⁻²] • Planck Constant h [M L² T⁻¹]

• Charge [A T] • Resistance [M L² T⁻³ A⁻²] • Specific Heat [L² T⁻² K⁻¹] • Gas Constant R [M L² T⁻² K⁻¹ mol⁻¹]

• Same dimensions do NOT mean the same quantity: work and torque share [M L² T⁻²]; momentum and impulse share [M L T⁻¹].

• Angle, strain, refractive index and relative density are dimensionless — but angle still has a unit (radian).


5. Dimensional Analysis — Principle of Homogeneity

• In a correct equation, every term on both sides must have the same dimensions. Only quantities of identical dimensions can be added, subtracted or equated.

• Arguments of sin, cos, eˣ and ln x are always dimensionless, and the functions themselves are dimensionless.


6. Applications of Dimensional Analysis

• Checking an equation: for s = ut + ½at², [ut] = [L] and [at²] = [L], matching [s] = [L]. Dimensionally correct — but the constant ½ cannot be verified this way, so a dimensionally correct equation may still be wrong.

• Deriving a relation: assuming the pendulum period T ∝ lᵃ gᵇ mᶜ and comparing powers of M, L, T gives c = 0, b = −½, a = ½, so T ∝ √(l/g). The mass drops out and the constant 2π is not obtained.

• Converting units: n₂ = n₁ [M₁/M₂]ᵃ [L₁/L₂]ᵇ [T₁/T₂]ᶜ. Example: 1 N = 1 × (kg/g)(m/cm)(s/s)⁻² = 10⁵ dyne.

• Limitations: (1) dimensionless constants like 2π, ½, e cannot be found; (2) fails for equations containing sin, log or exponential terms; (3) cannot distinguish quantities with identical dimensions; (4) fails when a quantity depends on more than 3 parameters.


7. Apparatus in Focus — Charge-to-Mass Ratio of Electron [Fig. 1.3]

• Since electrons are negatively charged, the charge on an electron is designated as −e.

• The apparatus consists of a cathode ray tube with cathode and anode, connected to a high voltage source, with a magnet placed around the tube.

• When only electric field is applied, electrons deviate to point A. When only magnetic field is applied, electrons hit point C. By balancing both fields, electrons travel straight to point B — the undeflected path.

• Balance condition: eE = evB, so v = E/B. Combined with eV = ½mv², this gives e/m = E² / (2VB²) ≈ 1.76 × 10¹¹ C/kg.

# ---- END detailedStudyNotes text ----
