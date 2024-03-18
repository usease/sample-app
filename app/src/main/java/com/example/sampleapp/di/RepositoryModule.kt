package com.example.sampleapp.di

import com.example.sampleapp.repository.MuseumRepo
import com.example.sampleapp.repository.MuseumRepoImpl
import org.koin.dsl.module

val repositoriesModule = module {
    single<MuseumRepo> { MuseumRepoImpl(get(), get(), get()) }
}