package com.example.fitapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.fitapp.databinding.ActivitySigninBinding
import com.example.fitapp.databinding.ActivitySlidesBinding
import com.example.fitapp.databinding.ActivitySplashBinding

class Slides : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_slides)

        val binding: ActivitySlidesBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_slides
        )
        // click listener for layout

        binding.btnaccount.setOnClickListener {
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }
        binding.btnlogin.setOnClickListener {
            val intent = Intent(this, Signin::class.java)
            startActivity(intent)

        }
    }
}