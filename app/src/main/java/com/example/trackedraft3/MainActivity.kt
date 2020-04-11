package com.example.trackedraft3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

const val EXTRA_MESSAGE = "com.example.trackedraft3.MESSAGE"

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        middleButton.setOnClickListener{
            val intent = Intent(this,Activity2::class.java)
            intent.putExtra("TestString", "Hello test this is good :)))")
            startActivity(intent)
        }
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
