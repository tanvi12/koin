package com.example.myapplication.demo.viewmodel

import android.util.Log

interface Test{

    fun getTest()
}

class TestImpl : Test{
    override fun getTest() {
        Log.d("Main","Hey viewmodel")
    }

}