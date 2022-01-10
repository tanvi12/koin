package com.example.myapplication.retrofit.di

import com.example.myapplication.retrofit.APIService
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


fun provideMoshi() : Moshi =  Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

fun provideApiService(moshi: Moshi):APIService =
    Retrofit
        .Builder()
        .run {
            baseUrl(APIService.BASE_URL)
            addConverterFactory(MoshiConverterFactory.create(moshi))
            build()
        }.create(APIService::class.java)


val retrofitBuilderModule = module {
    single {
        provideMoshi()
    }

    single {
        provideApiService(get())
    }
}