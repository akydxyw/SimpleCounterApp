package com.example.simplecounter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.simplecounter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        updateCounter()

        binding.btnIncrease.setOnClickListener {
            counter++
            updateCounter()
        }

        binding.btnDecrease.setOnClickListener {
            counter--
            updateCounter()
        }
    }

    private fun updateCounter() {
        binding.tvCounter.text = counter.toString()
    }
}
