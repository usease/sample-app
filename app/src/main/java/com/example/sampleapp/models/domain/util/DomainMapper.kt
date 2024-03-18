package com.example.sampleapp.models.domain.util

interface DomainMapper <T, DomainModel> {
    fun mapToDomainModel(dto: T): DomainModel
}
