package com.example.weatherapp.network

import com.example.weatherapp.network.NetworkConstants.BASE_URL
import okhttp3.OkHttpClient
import okhttp3.Request
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object APIClient {
    private var retrofit: Retrofit? = null
    fun getClient(): Retrofit? {
        val client = OkHttpClient().newBuilder()
            .addInterceptor { chain ->
                val request: Request =
                    chain.request().newBuilder()
                        .addHeader("Content-Type", "application/json")
                        .build()
                chain.proceed(request)
            }
            .readTimeout(180, TimeUnit.SECONDS)
            .connectTimeout(180, TimeUnit.SECONDS)
            .writeTimeout(180, TimeUnit.SECONDS)
            /*.connectTimeout(100, TimeUnit.SECONDS)
            .readTimeout(100, TimeUnit.SECONDS)*/
            .build()
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit
    }
}