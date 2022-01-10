package com.example.myapplication.di

import com.example.myapplication.demo.Car
import com.example.myapplication.demo.Engine
import com.example.myapplication.demo.Wheel
import org.koin.dsl.module

val demoModule = module {

    factory { Engine() }
    factory { Wheel() }


    // this will create car object everytime
    factory { Car(get(),get()) }
    // if we want singleton
   // single { Car() }
}