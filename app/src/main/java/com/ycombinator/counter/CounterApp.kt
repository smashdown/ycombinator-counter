package com.ycombinator.counter

import android.app.Application
import com.ycombinator.counter.di.*
import com.ycombinator.counter.utils.LineNumberDebugTree
import org.koin.android.ext.android.startKoin
import timber.log.Timber

class CounterApp : Application() {
    override fun onCreate() {
        super.onCreate()

        // Start Koin
        startKoin(this, listOf(rxModule, viewModelModules))

        // Set a logger
        if (BuildConfig.DEBUG) Timber.plant(LineNumberDebugTree())
    }
}