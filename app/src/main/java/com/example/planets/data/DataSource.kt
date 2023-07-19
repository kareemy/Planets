package com.example.planets.data

import com.example.planets.R
import com.example.planets.model.Planet

object DataSource {
    val planets = listOf(
        Planet(R.string.mercury, R.drawable.mercury),
        Planet(R.string.venus, R.drawable.venus),
        Planet(R.string.earth, R.drawable.earth),
        Planet(R.string.mars, R.drawable.mars),
        Planet(R.string.ceres, R.drawable.ceres),
        Planet(R.string.jupiter, R.drawable.jupiter),
        Planet(R.string.saturn, R.drawable.saturn),
        Planet(R.string.uranus, R.drawable.uranus),
        Planet(R.string.neptune, R.drawable.neptune),
        Planet(R.string.pluto, R.drawable.pluto)
    )
}