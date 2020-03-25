package com.example.trackedraft3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickLeft(view: View){
        println("clicked left button")
    }

    fun clickRight(view: View){
        println("clicked right button")
    }

    fun clickMiddle(view: View){
        println("clicked middle button")
    }

    fun clickBottom(view: View){
        println("clicked bottom button")
    }
}
