package com.example.weatherapp.network

import com.example.weatherapp.model.WeatherMapResponse
import retrofit2.Call
import retrofit2.http.GET

interface APIInterface {
    @GET("forecast?lat=19.4135&lon=72.8618&appid=59c24479b3b339dbe3c5efe15ce36540")
    fun fetchWeatherData(): Call<WeatherMapResponse>
}