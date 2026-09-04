package com.example.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val HighDensityColorScheme =
  darkColorScheme(
    primary = HighDensityPrimary,
    onPrimary = HighDensityOnPrimary,
    secondary = HighDensitySecondary,
    background = HighDensityBackground,
    surface = HighDensitySurface,
    surfaceVariant = HighDensitySurface,
    onBackground = HighDensityText,
    onSurface = HighDensityText,
    outline = HighDensityBorder
  )

@Composable
fun MyApplicationTheme(
  darkTheme: Boolean = true,
  // Dynamic color disabled to enforce the High Density theme design
  dynamicColor: Boolean = false,
  content: @Composable () -> Unit,
) {
  MaterialTheme(
    colorScheme = HighDensityColorScheme,
    typography = Typography,
    content = content
  )
}
