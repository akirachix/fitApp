package com.example.fitapp
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fitapp.activities.MainActivity
import com.example.fitapp.databinding.ActivitySigninBinding


class Signin : AppCompatActivity() {
    lateinit var binding:ActivitySigninBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySigninBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // this
        // click listener for layout
        binding.btnSignin.setOnClickListener {
            val intent = Intent(baseContext, MainActivity ::class.java)
            startActivity(intent)
        }
        binding.txtForgotPassword.setOnClickListener {
            val intent = Intent(this, ForgotPassword::class.java)
            startActivity(intent)
        }
        binding.imgBackButton.setOnClickListener {
            val intent = Intent(this, Slides::class.java)
            startActivity(intent)
        }
        }
    }
