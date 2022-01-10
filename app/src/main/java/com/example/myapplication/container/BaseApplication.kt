package com.example.myapplication.container

import android.app.Application
import com.example.myapplication.Qualifier.usersModule
import com.example.myapplication.di.demoModule
import com.example.myapplication.di.interfaceModule
import com.example.myapplication.di.viewModelModule
import com.example.myapplication.retrofit.di.retrofitBuilderModule
import com.example.myapplication.room.di.userDatabaseModule
import com.example.myapplication.scopes.scopeModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin{
            modules(demoModule, interfaceModule,viewModelModule,retrofitBuilderModule,
                retrofitBuilderModule,userDatabaseModule, usersModule, scopeModule)
            androidContext(this@BaseApplication)
        }
    }
}