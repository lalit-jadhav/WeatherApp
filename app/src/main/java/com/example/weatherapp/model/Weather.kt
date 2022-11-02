package com.example.weatherapp.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Weather(

    @SerializedName("id") var id: Int? = null,
    @SerializedName("main") var main: Main? = null,
    @SerializedName("description") var description: String? = null,
    @SerializedName("icon") var icon: String? = null

) : Parcelable