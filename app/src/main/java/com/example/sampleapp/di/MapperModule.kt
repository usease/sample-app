package com.example.sampleapp.di

import com.example.sampleapp.domain.exhibit_details.ExhibitDetailsMapper
import com.example.sampleapp.domain.exhibits.ExhibitMapper
import org.koin.dsl.module

val mapperModule = module {
    single { ExhibitMapper() }
    single { ExhibitDetailsMapper() }
}
