package com.example.myapplication.di

import com.example.myapplication.demo.interfaces.DemoImpl
import com.example.myapplication.demo.interfaces.DemoOne
import com.example.myapplication.demo.interfaces.DemoTwo
import com.example.myapplication.demo.interfaces.Main
import com.example.myapplication.demo.viewmodel.Test
import com.example.myapplication.demo.viewmodel.TestImpl
import org.koin.dsl.bind
import org.koin.dsl.binds
import org.koin.dsl.module

val interfaceModule = module {

    // one way this is not recommended
//    factory {
//        DemoImpl() as DemoOne
//    }

    // second way
//    factory<DemoOne> { DemoImpl()}

    //third way

    // if multiple then use binds if single then use bind
    factory { DemoImpl() } binds arrayOf(DemoOne::class, DemoTwo::class)

    factory { Main(get(),get()) }

}