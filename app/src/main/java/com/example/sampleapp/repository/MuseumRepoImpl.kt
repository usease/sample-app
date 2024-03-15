package com.example.sampleapp.repository

import com.example.sampleapp.network.MuseumApi

class MuseumRepoImpl(private val api: MuseumApi): MuseumRepo {
    override suspend fun getExhibits(): String {
        return api.getExhibits().body()?.toString() ?: "AWE"
    }
}