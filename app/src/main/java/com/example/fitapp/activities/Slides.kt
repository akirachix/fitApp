package com.example.fitapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fitapp.databinding.ActivitySlidesBinding

class Slides : AppCompatActivity() {
   lateinit var binding: ActivitySlidesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySlidesBinding.inflate(layoutInflater)
        setContentView(binding.root)


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