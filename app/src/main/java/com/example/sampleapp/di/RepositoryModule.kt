package com.example.sampleapp.di

import com.example.sampleapp.repository.MuseumRepo
import com.example.sampleapp.repository.MuseumRepoImpl
import org.koin.dsl.module

val repositoryModule = module {
    single<MuseumRepo> { MuseumRepoImpl(get(), get(), get()) }
}