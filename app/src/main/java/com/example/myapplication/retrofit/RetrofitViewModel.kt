package com.example.myapplication.retrofit

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.room.User
import com.example.myapplication.room.UserDao
import kotlinx.coroutines.launch


class RetrofitViewModel constructor(private val apiService: APIService,private val dao: UserDao
) : ViewModel(){

    fun getPost() = viewModelScope.launch {
        apiService.getPost()
    }

    fun insert(user: User) = viewModelScope.launch {
        dao.insert(user)
    }
}