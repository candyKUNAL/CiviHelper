package com.example.rater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val actionBar= supportActionBar
        actionBar!!.title= " "
    }
}