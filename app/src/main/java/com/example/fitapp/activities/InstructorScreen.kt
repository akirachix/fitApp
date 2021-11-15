package com.example.fitapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fitapp.R
import com.example.fitapp.databinding.ActivityInstructorScreenBinding
import com.example.fitapp.databinding.ActivitySlidesBinding

class InstructorScreen : AppCompatActivity() {
    lateinit var binding:ActivityInstructorScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInstructorScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

// click listener for layout
                binding.btnBook.setOnClickListener {
                    val intent = Intent(this, PopUpActivity::class.java)
                    startActivity(intent)
                }
                binding.btnBook3.setOnClickListener {
                    val intent = Intent(this, PopUpActivity::class.java)
                    startActivity(intent)
                }
                binding.btnBook1.setOnClickListener {
                    val intent = Intent(this, PopUpActivity::class.java)
                    startActivity(intent)
                }
                binding.btnBook2.setOnClickListener {
                    val intent = Intent(this, PopUpActivity::class.java)
                    startActivity(intent)
                }
                binding.imgBackButton.setOnClickListener {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }
            }
        }

