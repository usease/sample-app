package com.example.sampleapp.di

import com.example.sampleapp.models.domain.exhibit_details.ExhibitDetailsMapper
import com.example.sampleapp.models.domain.exhibits.ExhibitMapper
import org.koin.dsl.module

val mappersModule = module {
    single { ExhibitMapper() }
    single { ExhibitDetailsMapper() }
}
