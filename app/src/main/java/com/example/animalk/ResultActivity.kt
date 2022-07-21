package com.example.animalk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.animalk.databinding.ActivityMainBinding
import com.example.animalk.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val result = intent.getStringExtra("key")
        binding.resultTv.text = result
    }
}