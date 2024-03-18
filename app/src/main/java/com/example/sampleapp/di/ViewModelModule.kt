package com.example.sampleapp.di

import com.example.sampleapp.ui.exhibit_details.ExhibitDetailsViewModel
import com.example.sampleapp.ui.exhibits.ExhibitsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { ExhibitsViewModel(get()) }
    viewModel { ExhibitDetailsViewModel(get()) }
}