package com.example.fitapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.fitapp.R
import com.example.fitapp.databinding.ActivityCardBinding
import com.example.fitapp.databinding.ActivityMainBinding

class Card : AppCompatActivity() {
    lateinit var binding: ActivityCardBinding
    lateinit var btnPay: Button

    override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                binding = ActivityCardBinding.inflate(layoutInflater)
                setContentView(binding.root)

                onClick()

            }
            fun onClick() {
                binding.btnCard.setOnClickListener {
                    val intent = Intent(baseContext, MainActivity::class.java)
                    startActivity(intent)

                }
                binding.btnMpesa.setOnClickListener {
                    val intent = Intent(baseContext, MpesaActivity::class.java)
                    startActivity(intent)
                }

                binding.btnAirtel.setOnClickListener {
                    val  intent = Intent(baseContext, airtelMoneyActivity::class.java)
                    startActivity(intent)
                }

                binding.btnMobile.setOnClickListener {
                    val   intent = Intent(baseContext, mobileMoneyActivity::class.java)
                    startActivity(intent)
                }

                binding.btnPay.setOnClickListener {
                    val  intent = Intent(baseContext, Congrates::class.java)
                    startActivity(intent)
                }
                binding.tvCancel.setOnClickListener {
                    val  intent = Intent(baseContext, InstractorScreen::class.java)
                    startActivity(intent)

                }
            }
        }
