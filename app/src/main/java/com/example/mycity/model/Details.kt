package com.example.mycity.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Details(
    val id: Int,
    @StringRes val titleResourceId: Int,
    @DrawableRes val logoResourceId: Int,
    @DrawableRes val bannerResourceId: Int,
    @StringRes val descriptionResourceId: Int
)
