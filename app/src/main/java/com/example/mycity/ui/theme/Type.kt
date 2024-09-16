package com.example.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.mycity.R


val bodyFamily = FontFamily(
    Font(R.font.suse_bold, FontWeight.Bold),
    Font(R.font.suse_regular, FontWeight.Normal),
    Font(R.font.suse_light, FontWeight.Light),
    Font(R.font.suse_medium, FontWeight.Medium),
    Font(R.font.suse_semibold, FontWeight.SemiBold),
    Font(R.font.suse_thin, FontWeight.Thin),
)

val titleFamily = FontFamily(
    Font(R.font.sofadione_regular),
)


val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = titleFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 36.sp
    ),
    displayMedium = TextStyle(
        fontFamily = bodyFamily,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 20.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = bodyFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    bodySmall = TextStyle(
        fontFamily = bodyFamily,
        fontWeight = FontWeight.Light,
        fontSize = 12.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = bodyFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 24.sp
    )

)
