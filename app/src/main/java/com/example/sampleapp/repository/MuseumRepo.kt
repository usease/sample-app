package com.example.sampleapp.repository

interface MuseumRepo {
    suspend fun getExhibits(): String
}