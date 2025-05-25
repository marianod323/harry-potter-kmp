package org.project.harry_potter.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import harrypotterkmp.composeapp.generated.resources.Res
import harrypotterkmp.composeapp.generated.resources.Roboto_Black
import harrypotterkmp.composeapp.generated.resources.Roboto_BlackItalic
import harrypotterkmp.composeapp.generated.resources.Roboto_Bold
import harrypotterkmp.composeapp.generated.resources.Roboto_BoldItalic
import harrypotterkmp.composeapp.generated.resources.Roboto_ExtraBold
import harrypotterkmp.composeapp.generated.resources.Roboto_ExtraBoldItalic
import harrypotterkmp.composeapp.generated.resources.Roboto_ExtraLight
import harrypotterkmp.composeapp.generated.resources.Roboto_ExtraLightItalic
import harrypotterkmp.composeapp.generated.resources.Roboto_Italic
import harrypotterkmp.composeapp.generated.resources.Roboto_Light
import harrypotterkmp.composeapp.generated.resources.Roboto_LightItalic
import harrypotterkmp.composeapp.generated.resources.Roboto_Medium
import harrypotterkmp.composeapp.generated.resources.Roboto_MediumItalic
import harrypotterkmp.composeapp.generated.resources.Roboto_Regular
import harrypotterkmp.composeapp.generated.resources.Roboto_SemiBold
import harrypotterkmp.composeapp.generated.resources.Roboto_SemiBoldItalic
import harrypotterkmp.composeapp.generated.resources.Roboto_Thin
import harrypotterkmp.composeapp.generated.resources.Roboto_ThinItalic
import org.jetbrains.compose.resources.Font

@Composable
fun RobotoFontFamily() = FontFamily(
    Font(Res.font.Roboto_Thin, weight = FontWeight.Thin),
    Font(Res.font.Roboto_ThinItalic, weight = FontWeight.Thin, style = FontStyle.Italic),
    Font(Res.font.Roboto_ExtraLight, weight = FontWeight.ExtraLight),
    Font(Res.font.Roboto_ExtraLightItalic, weight = FontWeight.ExtraLight, style = FontStyle.Italic),
    Font(Res.font.Roboto_Light, weight = FontWeight.Light),
    Font(Res.font.Roboto_LightItalic, weight = FontWeight.Light, style = FontStyle.Italic),
    Font(Res.font.Roboto_Regular, weight = FontWeight.Normal),
    Font(Res.font.Roboto_Italic, weight = FontWeight.Normal, style = FontStyle.Italic),
    Font(Res.font.Roboto_Medium, weight = FontWeight.Medium),
    Font(Res.font.Roboto_MediumItalic, weight = FontWeight.Medium, style = FontStyle.Italic),
    Font(Res.font.Roboto_SemiBold, weight = FontWeight.SemiBold),
    Font(Res.font.Roboto_SemiBoldItalic, weight = FontWeight.SemiBold, style = FontStyle.Italic),
    Font(Res.font.Roboto_Bold, weight = FontWeight.Bold),
    Font(Res.font.Roboto_BoldItalic, weight = FontWeight.Bold, style = FontStyle.Italic),
    Font(Res.font.Roboto_ExtraBold, weight = FontWeight.ExtraBold),
    Font(Res.font.Roboto_ExtraBoldItalic, weight = FontWeight.ExtraBold, style = FontStyle.Italic),
    Font(Res.font.Roboto_Black, weight = FontWeight.Black),
    Font(Res.font.Roboto_BlackItalic, weight = FontWeight.Black, style = FontStyle.Italic)
)

// Default Material 3 typography values
val baseline = Typography()

@Composable
fun AppTypography() = Typography().run {
    val displayFontFamily = RobotoFontFamily()
    val bodyFontFamily = RobotoFontFamily()

    copy(
        displayLarge = baseline.displayLarge.copy(fontFamily = displayFontFamily),
        displayMedium = baseline.displayMedium.copy(fontFamily = displayFontFamily),
        displaySmall = baseline.displaySmall.copy(fontFamily = displayFontFamily),
        headlineLarge = baseline.headlineLarge.copy(fontFamily = displayFontFamily),
        headlineMedium = baseline.headlineMedium.copy(fontFamily = displayFontFamily),
        headlineSmall = baseline.headlineSmall.copy(fontFamily = displayFontFamily),
        titleLarge = baseline.titleLarge.copy(fontFamily = displayFontFamily),
        titleMedium = baseline.titleMedium.copy(fontFamily = displayFontFamily),
        titleSmall = baseline.titleSmall.copy(fontFamily = displayFontFamily),
        bodyLarge = baseline.bodyLarge.copy(fontFamily = bodyFontFamily),
        bodyMedium = baseline.bodyMedium.copy(fontFamily = bodyFontFamily),
        bodySmall = baseline.bodySmall.copy(fontFamily = bodyFontFamily),
        labelLarge = baseline.labelLarge.copy(fontFamily = bodyFontFamily),
        labelMedium = baseline.labelMedium.copy(fontFamily = bodyFontFamily),
        labelSmall = baseline.labelSmall.copy(fontFamily = bodyFontFamily),
    )
}
