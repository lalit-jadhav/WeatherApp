package com.example.weatherapp.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Sys(

    @SerializedName("pod") var pod: String? = null

) : Parcelable