package com.example.sampleapp

import android.app.Application
import com.example.sampleapp.di.mappersModule
import com.example.sampleapp.di.networkModule
import com.example.sampleapp.di.repositoriesModule
import com.example.sampleapp.di.viewModelsModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import timber.log.Timber

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        startKoin{
            androidLogger(Level.ERROR)
            androidContext(this@MainApplication)
            modules(listOf(mappersModule, networkModule, repositoriesModule, viewModelsModule))
        }
    }
}