package com.example.fitapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fitapp.R
import com.example.fitapp.databinding.ActivityPaymentBinding

class PaymentActivity : AppCompatActivity() {
    lateinit var binding: ActivityPaymentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)
            binding = ActivityPaymentBinding.inflate(layoutInflater)
            setContentView(binding.root)

            binding.btnPay1.setOnClickListener {
                val intent = Intent(baseContext,CongratesActivity::class.java)
                startActivity(intent)
            }
            binding.tvCancel.setOnClickListener {
                val intent = Intent(baseContext, InstructorScreen::class.java)
                startActivity(intent)
            }


        }
}


