package com.example.myapplication.retrofit

import retrofit2.http.GET

interface APIService {
    companion object{
        const val BASE_URL = "https://jsonplaceholder.typicode.com"
    }

    @GET("/post")
    suspend fun getPost() : List<Post>
}