package com.zybooks.workingwithdata


import retrofit2.http.GET
import retrofit2.http.Query

interface MarsRoverApiService {
    @GET("rovers/curiosity/photos")
    suspend fun getMarsPhotos(
        @Query("sol") sol: Int,
        @Query("camera") camera: String,
        @Query("api_key") apiKey: String
    ): MarsPhotosResponse
}

data class MarsPhotosResponse(val photos: List<MarsPhoto>)