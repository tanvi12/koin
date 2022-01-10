package com.example.myapplication.container

import com.example.myapplication.Qualifier.Users
import com.example.myapplication.demo.Car
import com.example.myapplication.demo.Engine
import com.example.myapplication.demo.Wheel
import com.example.myapplication.demo.interfaces.Main
import com.example.myapplication.demo.viewmodel.MainViewModel
import com.example.myapplication.retrofit.RetrofitViewModel
import com.example.myapplication.room.User
import com.example.myapplication.scopes.ComponentA
import org.koin.core.component.inject
import org.koin.core.component.KoinComponent

class Component : KoinComponent {

    // lazy inject
    val car : Car by inject()

    val engine : Engine by inject()

    val wheel : Wheel by inject()
    // intialized first
  // private val car1 : Car =  get()

    val main :Main by inject()

    val users :Users by inject()

    val mainViewModel : MainViewModel by inject()

    val retrofitViewModel : RetrofitViewModel by inject()

}