package com.example.weatherapp.model

import android.os.Parcelable
import com.example.example.City
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class WeatherMapResponse(
    @SerializedName("cod") var cod: String? = "",
    @SerializedName("message") var message: String? = "",
    @SerializedName("cnt") var cnt: String? = "",
    @SerializedName("city") var city: City? = City(),
    @SerializedName("list") var list: ArrayList<Weather> = arrayListOf(),
):Parcelable