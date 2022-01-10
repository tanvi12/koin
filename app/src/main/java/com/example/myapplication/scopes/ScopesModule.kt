package com.example.myapplication.scopes

import android.util.Log
import com.example.myapplication.AnotherActivity
import org.koin.dsl.module
import org.koin.dsl.scoped

class ComponentA(){
    fun getA()
    {
        Log.d("main", "getA: ")
    }
}


val scopeModule = module {
    scope<AnotherActivity>{
        scoped<ComponentA>()
    }
}