package com.ycombinator.counter.di

import com.ycombinator.counter.utils.rx.ApplicationSchedulerProvider
import com.ycombinator.counter.utils.rx.SchedulerProvider
import org.koin.dsl.module.module

val rxModule = module {
    single { ApplicationSchedulerProvider() as SchedulerProvider }
}
