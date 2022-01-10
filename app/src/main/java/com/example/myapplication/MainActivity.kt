package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.container.Component
import com.example.myapplication.demo.Car
import com.example.myapplication.room.User
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {
    private val component = Component()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // component.car.getCar()
       // component.main.getDemo()
//        component.mainViewModel.getTest()

//        component.retrofitViewModel.insert(User(1,"test"))
       // component.retrofitViewModel.getPost()

        component.users.getUser()

    }
}