package com.example.myapplication.demo

import android.util.Log

class Car(private val engine: Engine,private val wheel: Wheel) {

    fun getCar(){
        engine.getEngine()
        wheel.getWheel()
        Log.d("main","Car is running")
    }
}

class Engine(){

    fun getEngine(){
        Log.d("main","Engine started")
    }
}

class Wheel(){

    fun getWheel(){
        Log.d("main","Wheel started")
    }
}