package com.example.fitapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.fitapp.R
import com.example.fitapp.databinding.ActivityInstractorScreenBinding

class InstractorScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instractor_screen)
        val binding: ActivityInstractorScreenBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_instractor_screen
        )

// click listener for layout
        binding.btnBook.setOnClickListener {
            val intent = Intent(this, PopUp::class.java)
            startActivity(intent)


        }
        binding.btnBook3.setOnClickListener {
            val intent = Intent(this, PopUp::class.java)
            startActivity(intent)


        }
        binding.btnBook1.setOnClickListener {
            val intent = Intent(this, PopUp::class.java)
            startActivity(intent)


        }
        binding.btnBook2.setOnClickListener {
            val intent = Intent(this, PopUp::class.java)
            startActivity(intent)


        }
        binding.imgBackButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)


        }
    }
}