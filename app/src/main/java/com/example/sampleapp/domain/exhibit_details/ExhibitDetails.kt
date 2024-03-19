package com.example.sampleapp.domain.exhibit_details

data class ExhibitDetails(
    val objectNumber: String,
    val title: String,
    val imageUrl: String,
    val desc: String,
    val makerLine: String,
    val materials: List<String>,
    val techniques: List<String>
)