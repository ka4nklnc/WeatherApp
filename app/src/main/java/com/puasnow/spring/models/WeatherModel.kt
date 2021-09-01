package com.puasnow.spring.models

import androidx.annotation.DrawableRes
import com.puasnow.spring.R

data class WeatherModel (
    val DayDegree: Int?,
    val NightDegree: Int?,
    val Type:WeatherTypes
    ) {

    val getDayDegree get() = "${DayDegree}°c"
    val getNigthDegree get() = "${NightDegree}°c"
    val getDegree get() = when{
        DayDegree != null && NightDegree != null -> "${DayDegree}°c / ${NightDegree}°c"
        DayDegree != null -> "${DayDegree}°c"
        NightDegree != null -> "${NightDegree}°c"
        else -> ""
    }
}


enum class WeatherTypes(
    val weatherName: String,
    @DrawableRes val imageResource: Int
){
    Cloudy(
        weatherName = "Cloudy",
        imageResource = R.drawable.ic_vector_cloudy
    ),
    Rainy(
        weatherName = "Rainy",
        imageResource = R.drawable.ic_vector_rainy
    ),
    Snowy(
        weatherName = "Snowy",
        imageResource = R.drawable.ic_vector_snowy
    ),
    Sunny(
        weatherName = "Sunny",
        imageResource = R.drawable.ic_vector_sunny
    )
}