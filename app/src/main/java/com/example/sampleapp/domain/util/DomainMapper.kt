package com.example.sampleapp.domain.util

interface DomainMapper <T, DomainModel> {
    fun mapToDomainModel(dto: T): DomainModel
}
