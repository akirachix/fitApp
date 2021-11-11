package com.example.fitapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fitapp.R
import com.example.fitapp.Signup
import com.example.fitapp.databinding.ActivityGoalsBinding
import com.example.fitapp.fragments.ProgressFragment

class Goals : AppCompatActivity() {
    lateinit var binding: ActivityGoalsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGoalsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // click listener for layout
        binding.btnsave.setOnClickListener {
            val intent = Intent(baseContext, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        }



    }
}