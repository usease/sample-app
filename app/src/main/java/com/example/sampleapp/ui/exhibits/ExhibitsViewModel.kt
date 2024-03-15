package com.example.sampleapp.ui.exhibits

import androidx.lifecycle.ViewModel
import com.example.sampleapp.repository.MuseumRepo
class ExhibitsViewModel (private val repo: MuseumRepo): ViewModel() {
    fun getExhibits(): String {
        return repo.getExhibits().toString()
    }
}