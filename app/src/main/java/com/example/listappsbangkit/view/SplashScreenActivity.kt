package com.example.listappsbangkit.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.listappsbangkit.MainActivity
import com.example.listappsbangkit.R

class SplashScreenActivity : AppCompatActivity() {
    private val delay:Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, delay)
    }
}