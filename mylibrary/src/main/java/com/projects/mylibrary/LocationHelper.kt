package com.projects.mylibrary

import android.location.Location

class LocationHelper {
    companion object {

        fun distance(
            startLat: Double,
            startLang: Double,
            endLat: Double,
            endLang: Double
        ): Float {
            val result = FloatArray(0)
            Location.distanceBetween(startLat, startLang, endLat, endLang, result)
            return result[0] / 1000
        }
    }
}