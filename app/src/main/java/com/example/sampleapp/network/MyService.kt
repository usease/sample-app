package com.example.sampleapp.network

import com.example.sampleapp.constants.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MyService {

    val retrofit = Retrofit.Builder()
        .baseUrl(Constants.BASE_API_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(MuseumApi::class.java)
}