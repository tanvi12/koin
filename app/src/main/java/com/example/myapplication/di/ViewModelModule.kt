package com.example.myapplication.di

import com.example.myapplication.demo.viewmodel.MainViewModel
import com.example.myapplication.demo.viewmodel.Test
import com.example.myapplication.demo.viewmodel.TestImpl
import com.example.myapplication.retrofit.RetrofitViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.bind
import org.koin.dsl.module

val viewModelModule = module {

    viewModel {
        MainViewModel(get())
    }

    viewModel {
        RetrofitViewModel(get(),get())
    }

    factory { TestImpl() } bind Test::class
}