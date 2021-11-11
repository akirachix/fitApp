package com.example.fitapp.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fitapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {


    private var _binding:FragmentHomeBinding ? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
  ): View?
    {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
//
//        binding.card.setOnClickListener {
//            val intent = Intent(context, InstractorScreen::class.java)
//            startActivity(intent)
//        }
//
//        binding.card1.setOnClickListener {
//            val intent = Intent(context, InstractorScreen::class.java)
//            startActivity(intent)
//        }
//        binding.card2.setOnClickListener {
//            val intent = Intent(context, InstractorScreen::class.java)
//            startActivity(intent)
//        }
//        binding.card3.setOnClickListener {
//            val intent = Intent(context, InstractorScreen::class.java)
//            startActivity(intent)
//        }
//        binding.card4.setOnClickListener {
//            val intent = Intent(context, InstractorScreen::class.java)
//            startActivity(intent)
//        }
//
//        binding.card.setOnClickListener {
//            val intent = Intent(context, InstractorScreen::class.java)
//            startActivity(intent)
//        }
        return binding.root
    }

}

