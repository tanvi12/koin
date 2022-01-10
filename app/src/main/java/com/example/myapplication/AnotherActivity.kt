package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.scopes.ComponentA
import org.koin.androidx.scope.activityScope
import org.koin.core.component.KoinScopeComponent
import org.koin.core.scope.Scope

class AnotherActivity : AppCompatActivity(), KoinScopeComponent{

    override val scope: Scope by activityScope()
    private val componentA :ComponentA by scope.inject()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_another)

        componentA.getA()
    }


}