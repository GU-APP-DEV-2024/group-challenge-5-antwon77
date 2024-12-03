package com.zybooks.workingwithdata

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BASE_URL = "https://api.nasa.gov/mars-photos/api/v1/"

    val apiService: MarsRoverApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MarsRoverApiService::class.java)
    }
}
