package com.example.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var imageAnimate = findViewById<ImageView>(R.id.imageAnimate)

        val Of = 0.0f
        imageAnimate.alpha = Of
        imageAnimate.animate().setDuration(2000).alpha(1f).withEndAction{
            startActivity(Intent(this,NewSplashScreenLoading::class.java))

            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
    }
}