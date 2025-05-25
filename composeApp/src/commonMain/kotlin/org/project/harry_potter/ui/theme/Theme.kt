package org.project.harry_potter.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import org.project.harry_potter.ui.theme.gryffindor.backgroundDark
import org.project.harry_potter.ui.theme.gryffindor.backgroundLight
import org.project.harry_potter.ui.theme.gryffindor.errorContainerDark
import org.project.harry_potter.ui.theme.gryffindor.errorContainerLight
import org.project.harry_potter.ui.theme.gryffindor.errorDark
import org.project.harry_potter.ui.theme.gryffindor.errorLight
import org.project.harry_potter.ui.theme.gryffindor.inverseOnSurfaceDark
import org.project.harry_potter.ui.theme.gryffindor.inverseOnSurfaceLight
import org.project.harry_potter.ui.theme.gryffindor.inversePrimaryDark
import org.project.harry_potter.ui.theme.gryffindor.inversePrimaryLight
import org.project.harry_potter.ui.theme.gryffindor.inverseSurfaceDark
import org.project.harry_potter.ui.theme.gryffindor.inverseSurfaceLight
import org.project.harry_potter.ui.theme.gryffindor.onBackgroundDark
import org.project.harry_potter.ui.theme.gryffindor.onBackgroundLight
import org.project.harry_potter.ui.theme.gryffindor.onErrorContainerDark
import org.project.harry_potter.ui.theme.gryffindor.onErrorContainerLight
import org.project.harry_potter.ui.theme.gryffindor.onErrorDark
import org.project.harry_potter.ui.theme.gryffindor.onErrorLight
import org.project.harry_potter.ui.theme.gryffindor.onPrimaryContainerDark
import org.project.harry_potter.ui.theme.gryffindor.onPrimaryContainerLight
import org.project.harry_potter.ui.theme.gryffindor.onPrimaryDark
import org.project.harry_potter.ui.theme.gryffindor.onPrimaryLight
import org.project.harry_potter.ui.theme.gryffindor.onSecondaryContainerDark
import org.project.harry_potter.ui.theme.gryffindor.onSecondaryContainerLight
import org.project.harry_potter.ui.theme.gryffindor.onSecondaryDark
import org.project.harry_potter.ui.theme.gryffindor.onSecondaryLight
import org.project.harry_potter.ui.theme.gryffindor.onSurfaceDark
import org.project.harry_potter.ui.theme.gryffindor.onSurfaceLight
import org.project.harry_potter.ui.theme.gryffindor.onSurfaceVariantDark
import org.project.harry_potter.ui.theme.gryffindor.onSurfaceVariantLight
import org.project.harry_potter.ui.theme.gryffindor.onTertiaryContainerDark
import org.project.harry_potter.ui.theme.gryffindor.onTertiaryContainerLight
import org.project.harry_potter.ui.theme.gryffindor.onTertiaryDark
import org.project.harry_potter.ui.theme.gryffindor.onTertiaryLight
import org.project.harry_potter.ui.theme.gryffindor.outlineDark
import org.project.harry_potter.ui.theme.gryffindor.outlineLight
import org.project.harry_potter.ui.theme.gryffindor.outlineVariantDark
import org.project.harry_potter.ui.theme.gryffindor.outlineVariantLight
import org.project.harry_potter.ui.theme.gryffindor.primaryContainerDark
import org.project.harry_potter.ui.theme.gryffindor.primaryContainerLight
import org.project.harry_potter.ui.theme.gryffindor.primaryDark
import org.project.harry_potter.ui.theme.gryffindor.primaryLight
import org.project.harry_potter.ui.theme.gryffindor.scrimDark
import org.project.harry_potter.ui.theme.gryffindor.scrimLight
import org.project.harry_potter.ui.theme.gryffindor.secondaryContainerDark
import org.project.harry_potter.ui.theme.gryffindor.secondaryContainerLight
import org.project.harry_potter.ui.theme.gryffindor.secondaryDark
import org.project.harry_potter.ui.theme.gryffindor.secondaryLight
import org.project.harry_potter.ui.theme.gryffindor.surfaceBrightDark
import org.project.harry_potter.ui.theme.gryffindor.surfaceBrightLight
import org.project.harry_potter.ui.theme.gryffindor.surfaceContainerDark
import org.project.harry_potter.ui.theme.gryffindor.surfaceContainerHighDark
import org.project.harry_potter.ui.theme.gryffindor.surfaceContainerHighLight
import org.project.harry_potter.ui.theme.gryffindor.surfaceContainerHighestDark
import org.project.harry_potter.ui.theme.gryffindor.surfaceContainerHighestLight
import org.project.harry_potter.ui.theme.gryffindor.surfaceContainerLight
import org.project.harry_potter.ui.theme.gryffindor.surfaceContainerLowDark
import org.project.harry_potter.ui.theme.gryffindor.surfaceContainerLowLight
import org.project.harry_potter.ui.theme.gryffindor.surfaceContainerLowestDark
import org.project.harry_potter.ui.theme.gryffindor.surfaceContainerLowestLight
import org.project.harry_potter.ui.theme.gryffindor.surfaceDark
import org.project.harry_potter.ui.theme.gryffindor.surfaceDimDark
import org.project.harry_potter.ui.theme.gryffindor.surfaceDimLight
import org.project.harry_potter.ui.theme.gryffindor.surfaceLight
import org.project.harry_potter.ui.theme.gryffindor.surfaceVariantDark
import org.project.harry_potter.ui.theme.gryffindor.surfaceVariantLight
import org.project.harry_potter.ui.theme.gryffindor.tertiaryContainerDark
import org.project.harry_potter.ui.theme.gryffindor.tertiaryContainerLight
import org.project.harry_potter.ui.theme.gryffindor.tertiaryDark
import org.project.harry_potter.ui.theme.gryffindor.tertiaryLight

private val lightSchemeGryffindor = lightColorScheme(
    primary = primaryLight,
    onPrimary = onPrimaryLight,
    primaryContainer = primaryContainerLight,
    onPrimaryContainer = onPrimaryContainerLight,
    secondary = secondaryLight,
    onSecondary = onSecondaryLight,
    secondaryContainer = secondaryContainerLight,
    onSecondaryContainer = onSecondaryContainerLight,
    tertiary = tertiaryLight,
    onTertiary = onTertiaryLight,
    tertiaryContainer = tertiaryContainerLight,
    onTertiaryContainer = onTertiaryContainerLight,
    error = errorLight,
    onError = onErrorLight,
    errorContainer = errorContainerLight,
    onErrorContainer = onErrorContainerLight,
    background = backgroundLight,
    onBackground = onBackgroundLight,
    surface = surfaceLight,
    onSurface = onSurfaceLight,
    surfaceVariant = surfaceVariantLight,
    onSurfaceVariant = onSurfaceVariantLight,
    outline = outlineLight,
    outlineVariant = outlineVariantLight,
    scrim = scrimLight,
    inverseSurface = inverseSurfaceLight,
    inverseOnSurface = inverseOnSurfaceLight,
    inversePrimary = inversePrimaryLight,
    surfaceDim = surfaceDimLight,
    surfaceBright = surfaceBrightLight,
    surfaceContainerLowest = surfaceContainerLowestLight,
    surfaceContainerLow = surfaceContainerLowLight,
    surfaceContainer = surfaceContainerLight,
    surfaceContainerHigh = surfaceContainerHighLight,
    surfaceContainerHighest = surfaceContainerHighestLight,
)

private val darkSchemeGryffindor = darkColorScheme(
    primary = primaryDark,
    onPrimary = onPrimaryDark,
    primaryContainer = primaryContainerDark,
    onPrimaryContainer = onPrimaryContainerDark,
    secondary = secondaryDark,
    onSecondary = onSecondaryDark,
    secondaryContainer = secondaryContainerDark,
    onSecondaryContainer = onSecondaryContainerDark,
    tertiary = tertiaryDark,
    onTertiary = onTertiaryDark,
    tertiaryContainer = tertiaryContainerDark,
    onTertiaryContainer = onTertiaryContainerDark,
    error = errorDark,
    onError = onErrorDark,
    errorContainer = errorContainerDark,
    onErrorContainer = onErrorContainerDark,
    background = backgroundDark,
    onBackground = onBackgroundDark,
    surface = surfaceDark,
    onSurface = onSurfaceDark,
    surfaceVariant = surfaceVariantDark,
    onSurfaceVariant = onSurfaceVariantDark,
    outline = outlineDark,
    outlineVariant = outlineVariantDark,
    scrim = scrimDark,
    inverseSurface = inverseSurfaceDark,
    inverseOnSurface = inverseOnSurfaceDark,
    inversePrimary = inversePrimaryDark,
    surfaceDim = surfaceDimDark,
    surfaceBright = surfaceBrightDark,
    surfaceContainerLowest = surfaceContainerLowestDark,
    surfaceContainerLow = surfaceContainerLowDark,
    surfaceContainer = surfaceContainerDark,
    surfaceContainerHigh = surfaceContainerHighDark,
    surfaceContainerHighest = surfaceContainerHighestDark,
)

private val lightSchemeSlytherin = lightColorScheme(
    primary = org.project.harry_potter.ui.theme.slytherin.primaryLight,
    onPrimary = org.project.harry_potter.ui.theme.slytherin.onPrimaryLight,
    primaryContainer = org.project.harry_potter.ui.theme.slytherin.primaryContainerLight,
    onPrimaryContainer = org.project.harry_potter.ui.theme.slytherin.onPrimaryContainerLight,
    secondary = org.project.harry_potter.ui.theme.slytherin.secondaryLight,
    onSecondary = org.project.harry_potter.ui.theme.slytherin.onSecondaryLight,
    secondaryContainer = org.project.harry_potter.ui.theme.slytherin.secondaryContainerLight,
    onSecondaryContainer = org.project.harry_potter.ui.theme.slytherin.onSecondaryContainerLight,
    tertiary = org.project.harry_potter.ui.theme.slytherin.tertiaryLight,
    onTertiary = org.project.harry_potter.ui.theme.slytherin.onTertiaryLight,
    tertiaryContainer = org.project.harry_potter.ui.theme.slytherin.tertiaryContainerLight,
    onTertiaryContainer = org.project.harry_potter.ui.theme.slytherin.onTertiaryContainerLight,
    error = org.project.harry_potter.ui.theme.slytherin.errorLight,
    onError = org.project.harry_potter.ui.theme.slytherin.onErrorLight,
    errorContainer = org.project.harry_potter.ui.theme.slytherin.errorContainerLight,
    onErrorContainer = org.project.harry_potter.ui.theme.slytherin.onErrorContainerLight,
    background = org.project.harry_potter.ui.theme.slytherin.backgroundLight,
    onBackground = org.project.harry_potter.ui.theme.slytherin.onBackgroundLight,
    surface = org.project.harry_potter.ui.theme.slytherin.surfaceLight,
    onSurface = org.project.harry_potter.ui.theme.slytherin.onSurfaceLight,
    surfaceVariant = org.project.harry_potter.ui.theme.slytherin.surfaceVariantLight,
    onSurfaceVariant = org.project.harry_potter.ui.theme.slytherin.onSurfaceVariantLight,
    outline = org.project.harry_potter.ui.theme.slytherin.outlineLight,
    outlineVariant = org.project.harry_potter.ui.theme.slytherin.outlineVariantLight,
    scrim = org.project.harry_potter.ui.theme.slytherin.scrimLight,
    inverseSurface = org.project.harry_potter.ui.theme.slytherin.inverseSurfaceLight,
    inverseOnSurface = org.project.harry_potter.ui.theme.slytherin.inverseOnSurfaceLight,
    inversePrimary = org.project.harry_potter.ui.theme.slytherin.inversePrimaryLight,
    surfaceDim = org.project.harry_potter.ui.theme.slytherin.surfaceDimLight,
    surfaceBright = org.project.harry_potter.ui.theme.slytherin.surfaceBrightLight,
    surfaceContainerLowest = org.project.harry_potter.ui.theme.slytherin.surfaceContainerLowestLight,
    surfaceContainerLow = org.project.harry_potter.ui.theme.slytherin.surfaceContainerLowLight,
    surfaceContainer = org.project.harry_potter.ui.theme.slytherin.surfaceContainerLight,
    surfaceContainerHigh = org.project.harry_potter.ui.theme.slytherin.surfaceContainerHighLight,
    surfaceContainerHighest = org.project.harry_potter.ui.theme.slytherin.surfaceContainerHighestLight
)

val darkSchemeSlytherin = darkColorScheme(
    primary = org.project.harry_potter.ui.theme.slytherin.primaryDark,
    onPrimary = org.project.harry_potter.ui.theme.slytherin.onPrimaryDark,
    primaryContainer = org.project.harry_potter.ui.theme.slytherin.primaryContainerDark,
    onPrimaryContainer = org.project.harry_potter.ui.theme.slytherin.onPrimaryContainerDark,
    secondary = org.project.harry_potter.ui.theme.slytherin.secondaryDark,
    onSecondary = org.project.harry_potter.ui.theme.slytherin.onSecondaryDark,
    secondaryContainer = org.project.harry_potter.ui.theme.slytherin.secondaryContainerDark,
    onSecondaryContainer = org.project.harry_potter.ui.theme.slytherin.onSecondaryContainerDark,
    tertiary = org.project.harry_potter.ui.theme.slytherin.tertiaryDark,
    onTertiary = org.project.harry_potter.ui.theme.slytherin.onTertiaryDark,
    tertiaryContainer = org.project.harry_potter.ui.theme.slytherin.tertiaryContainerDark,
    onTertiaryContainer = org.project.harry_potter.ui.theme.slytherin.onTertiaryContainerDark,
    error = org.project.harry_potter.ui.theme.slytherin.errorDark,
    onError = org.project.harry_potter.ui.theme.slytherin.onErrorDark,
    errorContainer = org.project.harry_potter.ui.theme.slytherin.errorContainerDark,
    onErrorContainer = org.project.harry_potter.ui.theme.slytherin.onErrorContainerDark,
    background = org.project.harry_potter.ui.theme.slytherin.backgroundDark,
    onBackground = org.project.harry_potter.ui.theme.slytherin.onBackgroundDark,
    surface = org.project.harry_potter.ui.theme.slytherin.surfaceDark,
    onSurface = org.project.harry_potter.ui.theme.slytherin.onSurfaceDark,
    surfaceVariant = org.project.harry_potter.ui.theme.slytherin.surfaceVariantDark,
    onSurfaceVariant = org.project.harry_potter.ui.theme.slytherin.onSurfaceVariantDark,
    outline = org.project.harry_potter.ui.theme.slytherin.outlineDark,
    outlineVariant = org.project.harry_potter.ui.theme.slytherin.outlineVariantDark,
    scrim = org.project.harry_potter.ui.theme.slytherin.scrimDark,
    inverseSurface = org.project.harry_potter.ui.theme.slytherin.inverseSurfaceDark,
    inverseOnSurface = org.project.harry_potter.ui.theme.slytherin.inverseOnSurfaceDark,
    inversePrimary = org.project.harry_potter.ui.theme.slytherin.inversePrimaryDark,
    surfaceDim = org.project.harry_potter.ui.theme.slytherin.surfaceDimDark,
    surfaceBright = org.project.harry_potter.ui.theme.slytherin.surfaceBrightDark,
    surfaceContainerLowest = org.project.harry_potter.ui.theme.slytherin.surfaceContainerLowestDark,
    surfaceContainerLow = org.project.harry_potter.ui.theme.slytherin.surfaceContainerLowDark,
    surfaceContainer = org.project.harry_potter.ui.theme.slytherin.surfaceContainerDark,
    surfaceContainerHigh = org.project.harry_potter.ui.theme.slytherin.surfaceContainerHighDark,
    surfaceContainerHighest = org.project.harry_potter.ui.theme.slytherin.surfaceContainerHighestDark
)

val lightSchemeHufflepuff = lightColorScheme(
    primary = org.project.harry_potter.ui.theme.hufflepuff.primaryLight,
    onPrimary = org.project.harry_potter.ui.theme.hufflepuff.onPrimaryLight,
    primaryContainer = org.project.harry_potter.ui.theme.hufflepuff.primaryContainerLight,
    onPrimaryContainer = org.project.harry_potter.ui.theme.hufflepuff.onPrimaryContainerLight,
    secondary = org.project.harry_potter.ui.theme.hufflepuff.secondaryLight,
    onSecondary = org.project.harry_potter.ui.theme.hufflepuff.onSecondaryLight,
    secondaryContainer = org.project.harry_potter.ui.theme.hufflepuff.secondaryContainerLight,
    onSecondaryContainer = org.project.harry_potter.ui.theme.hufflepuff.onSecondaryContainerLight,
    tertiary = org.project.harry_potter.ui.theme.hufflepuff.tertiaryLight,
    onTertiary = org.project.harry_potter.ui.theme.hufflepuff.onTertiaryLight,
    tertiaryContainer = org.project.harry_potter.ui.theme.hufflepuff.tertiaryContainerLight,
    onTertiaryContainer = org.project.harry_potter.ui.theme.hufflepuff.onTertiaryContainerLight,
    error = org.project.harry_potter.ui.theme.hufflepuff.errorLight,
    onError = org.project.harry_potter.ui.theme.hufflepuff.onErrorLight,
    errorContainer = org.project.harry_potter.ui.theme.hufflepuff.errorContainerLight,
    onErrorContainer = org.project.harry_potter.ui.theme.hufflepuff.onErrorContainerLight,
    background = org.project.harry_potter.ui.theme.hufflepuff.backgroundLight,
    onBackground = org.project.harry_potter.ui.theme.hufflepuff.onBackgroundLight,
    surface = org.project.harry_potter.ui.theme.hufflepuff.surfaceLight,
    onSurface = org.project.harry_potter.ui.theme.hufflepuff.onSurfaceLight,
    surfaceVariant = org.project.harry_potter.ui.theme.hufflepuff.surfaceVariantLight,
    onSurfaceVariant = org.project.harry_potter.ui.theme.hufflepuff.onSurfaceVariantLight,
    outline = org.project.harry_potter.ui.theme.hufflepuff.outlineLight,
    outlineVariant = org.project.harry_potter.ui.theme.hufflepuff.outlineVariantLight,
    scrim = org.project.harry_potter.ui.theme.hufflepuff.scrimLight,
    inverseSurface = org.project.harry_potter.ui.theme.hufflepuff.inverseSurfaceLight,
    inverseOnSurface = org.project.harry_potter.ui.theme.hufflepuff.inverseOnSurfaceLight,
    inversePrimary = org.project.harry_potter.ui.theme.hufflepuff.inversePrimaryLight,
    surfaceDim = org.project.harry_potter.ui.theme.hufflepuff.surfaceDimLight,
    surfaceBright = org.project.harry_potter.ui.theme.hufflepuff.surfaceBrightLight,
    surfaceContainerLowest = org.project.harry_potter.ui.theme.hufflepuff.surfaceContainerLowestLight,
    surfaceContainerLow = org.project.harry_potter.ui.theme.hufflepuff.surfaceContainerLowLight,
    surfaceContainer = org.project.harry_potter.ui.theme.hufflepuff.surfaceContainerLight,
    surfaceContainerHigh = org.project.harry_potter.ui.theme.hufflepuff.surfaceContainerHighLight,
    surfaceContainerHighest = org.project.harry_potter.ui.theme.hufflepuff.surfaceContainerHighestLight
)

val darkSchemeHufflepuff = darkColorScheme(
    primary = org.project.harry_potter.ui.theme.hufflepuff.primaryDark,
    onPrimary = org.project.harry_potter.ui.theme.hufflepuff.onPrimaryDark,
    primaryContainer = org.project.harry_potter.ui.theme.hufflepuff.primaryContainerDark,
    onPrimaryContainer = org.project.harry_potter.ui.theme.hufflepuff.onPrimaryContainerDark,
    secondary = org.project.harry_potter.ui.theme.hufflepuff.secondaryDark,
    onSecondary = org.project.harry_potter.ui.theme.hufflepuff.onSecondaryDark,
    secondaryContainer = org.project.harry_potter.ui.theme.hufflepuff.secondaryContainerDark,
    onSecondaryContainer = org.project.harry_potter.ui.theme.hufflepuff.onSecondaryContainerDark,
    tertiary = org.project.harry_potter.ui.theme.hufflepuff.tertiaryDark,
    onTertiary = org.project.harry_potter.ui.theme.hufflepuff.onTertiaryDark,
    tertiaryContainer = org.project.harry_potter.ui.theme.hufflepuff.tertiaryContainerDark,
    onTertiaryContainer = org.project.harry_potter.ui.theme.hufflepuff.onTertiaryContainerDark,
    error = org.project.harry_potter.ui.theme.hufflepuff.errorDark,
    onError = org.project.harry_potter.ui.theme.hufflepuff.onErrorDark,
    errorContainer = org.project.harry_potter.ui.theme.hufflepuff.errorContainerDark,
    onErrorContainer = org.project.harry_potter.ui.theme.hufflepuff.onErrorContainerDark,
    background = org.project.harry_potter.ui.theme.hufflepuff.backgroundDark,
    onBackground = org.project.harry_potter.ui.theme.hufflepuff.onBackgroundDark,
    surface = org.project.harry_potter.ui.theme.hufflepuff.surfaceDark,
    onSurface = org.project.harry_potter.ui.theme.hufflepuff.onSurfaceDark,
    surfaceVariant = org.project.harry_potter.ui.theme.hufflepuff.surfaceVariantDark,
    onSurfaceVariant = org.project.harry_potter.ui.theme.hufflepuff.onSurfaceVariantDark,
    outline = org.project.harry_potter.ui.theme.hufflepuff.outlineDark,
    outlineVariant = org.project.harry_potter.ui.theme.hufflepuff.outlineVariantDark,
    scrim = org.project.harry_potter.ui.theme.hufflepuff.scrimDark,
    inverseSurface = org.project.harry_potter.ui.theme.hufflepuff.inverseSurfaceDark,
    inverseOnSurface = org.project.harry_potter.ui.theme.hufflepuff.inverseOnSurfaceDark,
    inversePrimary = org.project.harry_potter.ui.theme.hufflepuff.inversePrimaryDark,
    surfaceDim = org.project.harry_potter.ui.theme.hufflepuff.surfaceDimDark,
    surfaceBright = org.project.harry_potter.ui.theme.hufflepuff.surfaceBrightDark,
    surfaceContainerLowest = org.project.harry_potter.ui.theme.hufflepuff.surfaceContainerLowestDark,
    surfaceContainerLow = org.project.harry_potter.ui.theme.hufflepuff.surfaceContainerLowDark,
    surfaceContainer = org.project.harry_potter.ui.theme.hufflepuff.surfaceContainerDark,
    surfaceContainerHigh = org.project.harry_potter.ui.theme.hufflepuff.surfaceContainerHighDark,
    surfaceContainerHighest = org.project.harry_potter.ui.theme.hufflepuff.surfaceContainerHighestDark
)

val lightSchemeRavenclaw = lightColorScheme(
    primary = org.project.harry_potter.ui.theme.ravenclaw.primaryLight,
    onPrimary = org.project.harry_potter.ui.theme.ravenclaw.onPrimaryLight,
    primaryContainer = org.project.harry_potter.ui.theme.ravenclaw.primaryContainerLight,
    onPrimaryContainer = org.project.harry_potter.ui.theme.ravenclaw.onPrimaryContainerLight,
    secondary = org.project.harry_potter.ui.theme.ravenclaw.secondaryLight,
    onSecondary = org.project.harry_potter.ui.theme.ravenclaw.onSecondaryLight,
    secondaryContainer = org.project.harry_potter.ui.theme.ravenclaw.secondaryContainerLight,
    onSecondaryContainer = org.project.harry_potter.ui.theme.ravenclaw.onSecondaryContainerLight,
    tertiary = org.project.harry_potter.ui.theme.ravenclaw.tertiaryLight,
    onTertiary = org.project.harry_potter.ui.theme.ravenclaw.onTertiaryLight,
    tertiaryContainer = org.project.harry_potter.ui.theme.ravenclaw.tertiaryContainerLight,
    onTertiaryContainer = org.project.harry_potter.ui.theme.ravenclaw.onTertiaryContainerLight,
    error = org.project.harry_potter.ui.theme.ravenclaw.errorLight,
    onError = org.project.harry_potter.ui.theme.ravenclaw.onErrorLight,
    errorContainer = org.project.harry_potter.ui.theme.ravenclaw.errorContainerLight,
    onErrorContainer = org.project.harry_potter.ui.theme.ravenclaw.onErrorContainerLight,
    background = org.project.harry_potter.ui.theme.ravenclaw.backgroundLight,
    onBackground = org.project.harry_potter.ui.theme.ravenclaw.onBackgroundLight,
    surface = org.project.harry_potter.ui.theme.ravenclaw.surfaceLight,
    onSurface = org.project.harry_potter.ui.theme.ravenclaw.onSurfaceLight,
    surfaceVariant = org.project.harry_potter.ui.theme.ravenclaw.surfaceVariantLight,
    onSurfaceVariant = org.project.harry_potter.ui.theme.ravenclaw.onSurfaceVariantLight,
    outline = org.project.harry_potter.ui.theme.ravenclaw.outlineLight,
    outlineVariant = org.project.harry_potter.ui.theme.ravenclaw.outlineVariantLight,
    scrim = org.project.harry_potter.ui.theme.ravenclaw.scrimLight,
    inverseSurface = org.project.harry_potter.ui.theme.ravenclaw.inverseSurfaceLight,
    inverseOnSurface = org.project.harry_potter.ui.theme.ravenclaw.inverseOnSurfaceLight,
    inversePrimary = org.project.harry_potter.ui.theme.ravenclaw.inversePrimaryLight,
    surfaceDim = org.project.harry_potter.ui.theme.ravenclaw.surfaceDimLight,
    surfaceBright = org.project.harry_potter.ui.theme.ravenclaw.surfaceBrightLight,
    surfaceContainerLowest = org.project.harry_potter.ui.theme.ravenclaw.surfaceContainerLowestLight,
    surfaceContainerLow = org.project.harry_potter.ui.theme.ravenclaw.surfaceContainerLowLight,
    surfaceContainer = org.project.harry_potter.ui.theme.ravenclaw.surfaceContainerLight,
    surfaceContainerHigh = org.project.harry_potter.ui.theme.ravenclaw.surfaceContainerHighLight,
    surfaceContainerHighest = org.project.harry_potter.ui.theme.ravenclaw.surfaceContainerHighestLight
)

val darkSchemeRavenclaw = darkColorScheme(
    primary = org.project.harry_potter.ui.theme.ravenclaw.primaryDark,
    onPrimary = org.project.harry_potter.ui.theme.ravenclaw.onPrimaryDark,
    primaryContainer = org.project.harry_potter.ui.theme.ravenclaw.primaryContainerDark,
    onPrimaryContainer = org.project.harry_potter.ui.theme.ravenclaw.onPrimaryContainerDark,
    secondary = org.project.harry_potter.ui.theme.ravenclaw.secondaryDark,
    onSecondary = org.project.harry_potter.ui.theme.ravenclaw.onSecondaryDark,
    secondaryContainer = org.project.harry_potter.ui.theme.ravenclaw.secondaryContainerDark,
    onSecondaryContainer = org.project.harry_potter.ui.theme.ravenclaw.onSecondaryContainerDark,
    tertiary = org.project.harry_potter.ui.theme.ravenclaw.tertiaryDark,
    onTertiary = org.project.harry_potter.ui.theme.ravenclaw.onTertiaryDark,
    tertiaryContainer = org.project.harry_potter.ui.theme.ravenclaw.tertiaryContainerDark,
    onTertiaryContainer = org.project.harry_potter.ui.theme.ravenclaw.onTertiaryContainerDark,
    error = org.project.harry_potter.ui.theme.ravenclaw.errorDark,
    onError = org.project.harry_potter.ui.theme.ravenclaw.onErrorDark,
    errorContainer = org.project.harry_potter.ui.theme.ravenclaw.errorContainerDark,
    onErrorContainer = org.project.harry_potter.ui.theme.ravenclaw.onErrorContainerDark,
    background = org.project.harry_potter.ui.theme.ravenclaw.backgroundDark,
    onBackground = org.project.harry_potter.ui.theme.ravenclaw.onBackgroundDark,
    surface = org.project.harry_potter.ui.theme.ravenclaw.surfaceDark,
    onSurface = org.project.harry_potter.ui.theme.ravenclaw.onSurfaceDark,
    surfaceVariant = org.project.harry_potter.ui.theme.ravenclaw.surfaceVariantDark,
    onSurfaceVariant = org.project.harry_potter.ui.theme.ravenclaw.onSurfaceVariantDark,
    outline = org.project.harry_potter.ui.theme.ravenclaw.outlineDark,
    outlineVariant = org.project.harry_potter.ui.theme.ravenclaw.outlineVariantDark,
    scrim = org.project.harry_potter.ui.theme.ravenclaw.scrimDark,
    inverseSurface = org.project.harry_potter.ui.theme.ravenclaw.inverseSurfaceDark,
    inverseOnSurface = org.project.harry_potter.ui.theme.ravenclaw.inverseOnSurfaceDark,
    inversePrimary = org.project.harry_potter.ui.theme.ravenclaw.inversePrimaryDark,
    surfaceDim = org.project.harry_potter.ui.theme.ravenclaw.surfaceDimDark,
    surfaceBright = org.project.harry_potter.ui.theme.ravenclaw.surfaceBrightDark,
    surfaceContainerLowest = org.project.harry_potter.ui.theme.ravenclaw.surfaceContainerLowestDark,
    surfaceContainerLow = org.project.harry_potter.ui.theme.ravenclaw.surfaceContainerLowDark,
    surfaceContainer = org.project.harry_potter.ui.theme.ravenclaw.surfaceContainerDark,
    surfaceContainerHigh = org.project.harry_potter.ui.theme.ravenclaw.surfaceContainerHighDark,
    surfaceContainerHighest = org.project.harry_potter.ui.theme.ravenclaw.surfaceContainerHighestDark
)

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    house: String = "gryffindor",
    content: @Composable () -> Unit
) {
  val colorScheme = when {
      house == "gryffindor" && !darkTheme -> lightSchemeGryffindor
      house == "gryffindor" && darkTheme -> darkSchemeGryffindor
      house == "slytherin" && !darkTheme -> lightSchemeSlytherin
      house == "slytherin" && darkTheme -> darkSchemeSlytherin
      house == "hufflepuff" && !darkTheme -> lightSchemeHufflepuff
      house == "hufflepuff" && darkTheme -> darkSchemeHufflepuff
      house == "ravenclaw" && !darkTheme -> lightSchemeRavenclaw
      house == "ravenclaw" && darkTheme -> darkSchemeRavenclaw
      else -> lightSchemeGryffindor
  }

  MaterialTheme(
    colorScheme = colorScheme,
    typography = AppTypography(),
    content = content
  )
}

