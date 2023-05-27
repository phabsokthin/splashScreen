package com.example.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class NewSplashScreenLoading : AppCompatActivity() {

    private  var SPLASH_TIME:Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_splash_screen_loading)

        Handler().postDelayed({
            startActivity(Intent(this, ScreenActivity::class.java))
            finish()

        }, SPLASH_TIME)

    }
}