package com.example.trackne

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.trackedraft3.R
import kotlinx.android.synthetic.main.activity_2.*

class Activity2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        println(intent.getStringExtra("TestString"))
    }
}