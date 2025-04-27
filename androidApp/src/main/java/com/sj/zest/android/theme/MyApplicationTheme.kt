package com.sj.zest.android.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.compose.kohler.theme.WhiteColor


val ColorLightPrimaryBlue = Color(0xFF1E2742)
val ColorSecondaryBlue = Color(0xFF62CDFA)
val ColorGreyContainer = Color(0xFFF4F4F4)
val ColorBlueContainer = Color(0xFFF4FCFF)
val ColorBlueText = Color(0xFF0F80FD)
val ColorLightBlackText = Color(0xFF000000)
val ColorLightPrimaryText = Color(0x1E2742)
val ColorSecondaryText = Color(0xFF9E9EA4)
val ColorPrimaryBlueText = Color(0xFF5DCCFC)

@Composable
fun MyApplicationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        darkColorScheme(
            background = ColorLightBlackText,
            surface = ColorLightBlackText,
            primary = ColorLightPrimaryBlue,
            secondary = WhiteColor,
            primaryContainer = WhiteColor,
        )
    } else {
        lightColorScheme(
            background = WhiteColor,
            surface = WhiteColor,
            primary = ColorLightPrimaryBlue,
            secondary = ColorLightPrimaryText,
            primaryContainer = ColorLightBlackText
        )
    }

    MaterialTheme(
        colorScheme = colors,
        typography = Typography,
        content = content
    )
}
