package com.example.koinapp

import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module
val appModule:Module= module {
    single {Course()}
    factory {  Friend()}
    factory {Student(get(),get())}
    viewModel {
        MyViewModel(get(), get())
    }
}

