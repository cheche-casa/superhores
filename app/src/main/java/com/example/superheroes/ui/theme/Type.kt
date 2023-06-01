package com.example.superheroes.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.superheroes.R

val Cabin = FontFamily(
    Font(R.font.cabin, FontWeight.Normal),
    Font(R.font.cabin_bold, FontWeight.Bold)
)

// Set of Material typography styles to start with
val Typography = Typography(
    headlineLarge = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 30.sp
    ),
    headlineMedium = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),
    headlineSmall = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),
    bodyLarge = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
)