package com.cemsarikaya.kotlinqrscannerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.cemsarikaya.kotlinqrscannerapp.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val inputText=intent.getStringExtra("QR_input")

        binding.textView.text = inputText

    }

    fun backButton(view: View){
        intent = Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)

    }
}