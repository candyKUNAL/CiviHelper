package com.example.rater

import android.content.Intent
import android.graphics.drawable.Animatable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val splashscreen=3000

    private lateinit var picanim: Animation
    private lateinit var bottomanim: Animation
    private lateinit var teaxtanim: Animation

    private lateinit var imageView: ImageView
    private lateinit var teaxtView: TextView
    private lateinit var bottomView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        picanim= AnimationUtils.loadAnimation(this , R.anim.picanim)
        picanim= AnimationUtils.loadAnimation(this , R.anim.bottomanim)
        picanim= AnimationUtils.loadAnimation(this , R.anim.teaxtanim)

        imageView.animation=picanim
        teaxtView.animation= teaxtanim
        bottomView.animation= bottomanim

        Handler().postDelayed({
            val intent = Intent(this, splash::class.java)
            startActivity(intent)
            finish()



        },splashscreen.toLong())
    }
}