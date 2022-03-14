package com.kulikode.btnlooping

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kulikode.btnlooping.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var isRun: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            if (binding.button.text == "Start"){
                isRun = true
                binding.button.text = "Stop"
            } else {
                isRun = false
                binding.button.text = "Start"
            }

            while (isRun) {
                println("is running.....")
            }
        }
    }
}