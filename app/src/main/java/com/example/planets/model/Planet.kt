package com.example.planets.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Planet(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int,
)
