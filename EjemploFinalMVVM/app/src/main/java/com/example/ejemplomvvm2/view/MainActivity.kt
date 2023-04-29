package com.example.ejemplomvvm2.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.ejemplomvvm2.databinding.ActivityMainBinding
import com.example.ejemplomvvm2.viewmodel.MyViewModel

class MainActivity : AppCompatActivity() {

    private val viewModel: MyViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.getText().observe(this, Observer {
            binding.textView.text = it
        })

        binding.button.setOnClickListener {
            viewModel.changeText()
        }

        binding.exitButton.setOnClickListener {
            finish()
        }
    }
}