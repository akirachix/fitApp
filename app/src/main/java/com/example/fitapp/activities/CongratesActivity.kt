package com.example.fitapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fitapp.R
import com.example.fitapp.Signin
import com.example.fitapp.databinding.ActivityCongratesBinding
import com.example.fitapp.databinding.ActivityCongrationBinding

class CongratesActivity : AppCompatActivity() {
    lateinit var binding:ActivityCongratesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCongratesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnhome.setOnClickListener {
            val intent = Intent(this, MainActivity ::class.java)
            startActivity(intent)
        }
    }
}