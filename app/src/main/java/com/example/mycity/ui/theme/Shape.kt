package com.example.mycity.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

val shapes = Shapes(
    small = RoundedCornerShape(50),
    medium = RoundedCornerShape(topStart = 24.dp, bottomEnd = 24.dp),
    large = RoundedCornerShape(topStart = 36.dp, bottomEnd = 36.dp)
)