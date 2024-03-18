package com.example.sampleapp.models.domain.exhibits

data class Exhibit (
    val objectNumber: String,
    val title: String,
    val principalOrFirstMaker: String,
    val headerImageUrl: String
)