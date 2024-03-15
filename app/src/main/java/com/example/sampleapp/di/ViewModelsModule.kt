package com.example.sampleapp.di

import com.example.sampleapp.ui.exhibits.ExhibitsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelsModule = module {
    viewModel { ExhibitsViewModel(get()) }
}