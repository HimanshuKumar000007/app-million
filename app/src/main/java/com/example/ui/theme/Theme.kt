package com.example.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorScheme = lightColorScheme(
    primary = PrimaryBlue,
    onPrimary = Color.White,
    primaryContainer = SoftLavender,
    onPrimaryContainer = DeepIndigo,
    secondary = ElectricPurple,
    onSecondary = Color.White,
    secondaryContainer = Color(0xFFEDE9FE),
    onSecondaryContainer = DeepIndigo,
    tertiary = SuccessGreen,
    onTertiary = Color.White,
    tertiaryContainer = Color(0xFFD1FAE5),
    onTertiaryContainer = Color(0xFF065F46),
    background = PageBackground,
    onBackground = PrimaryText,
    surface = CardBackground,
    onSurface = PrimaryText,
    surfaceVariant = SoftLavender,
    onSurfaceVariant = SecondaryText,
    outline = BorderColor,
    outlineVariant = Color(0xFFD5D9E8),
    error = WarningCoral,
    onError = Color.White
)

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF6B8FF7),
    onPrimary = Color(0xFF0B1536),
    primaryContainer = Color(0xFF23326A),
    onPrimaryContainer = Color(0xFFDCE4FF),
    secondary = Color(0xFF8B72FA),
    onSecondary = Color(0xFF170D45),
    secondaryContainer = Color(0xFF2E2268),
    onSecondaryContainer = Color(0xFFE5DEFF),
    tertiary = Color(0xFF34D399),
    onTertiary = Color(0xFF052E16),
    tertiaryContainer = Color(0xFF064E3B),
    onTertiaryContainer = Color(0xFFA7F3D0),
    background = DarkPageBackground,
    onBackground = DarkPrimaryText,
    surface = DarkCardBackground,
    onSurface = DarkPrimaryText,
    surfaceVariant = DarkSurfaceElevated,
    onSurfaceVariant = DarkSecondaryText,
    outline = DarkBorderColor,
    outlineVariant = Color(0xFF333D63),
    error = Color(0xFFF87171),
    onError = Color(0xFF450A0A)
)

@Composable
fun IISERSmartPrepTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}

@Composable
fun MyApplicationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    IISERSmartPrepTheme(darkTheme = darkTheme, content = content)
}
