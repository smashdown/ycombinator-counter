package com.ycombinator.counter.di

import com.ycombinator.counter.ui.base.DummyViewModel
import com.ycombinator.counter.ui.main.MainViewModel
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val viewModelModules = module {
    viewModel { DummyViewModel() }
    viewModel { MainViewModel() }
}
