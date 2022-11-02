package com.example.weatherapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.weatherapp.model.WeatherMapResponse
import com.example.weatherapp.network.APIClient
import com.example.weatherapp.network.APIInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        APIClient.getClient()?.create(APIInterface::class.java)?.fetchWeatherData()
            ?.enqueue(object :
                Callback<WeatherMapResponse> {
                override fun onResponse(
                    call: Call<WeatherMapResponse>,
                    response: Response<WeatherMapResponse>
                ) {
                    println(response.body())
                }

                override fun onFailure(call: Call<WeatherMapResponse>, t: Throwable) {
                    println(call.toString())
                }
            })
    }
}