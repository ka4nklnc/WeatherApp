package com.puasnow.spring.models

import androidx.annotation.DrawableRes

class CityModel(
    val cityName: String,
    @DrawableRes val backgroundUrl: Int,
    val dayModel: DayModel
)