package com.example.fitapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fitapp.databinding.ActivitySigninBinding
import com.example.fitapp.databinding.ActivitySplashBinding

class Signin : AppCompatActivity() {
val authen
    lateinit var binding: ActivitySigninBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySigninBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnsignin.setOnClickListener {
            var intent = Intent(baseContext, Slides ::class.java)
            startActivity(intent)
        }
    }
}