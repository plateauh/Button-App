package com.example.buttonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.math.min

lateinit var number : TextView
lateinit var minus : Button
lateinit var plus : Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        number = findViewById(R.id.tvNumber)
        minus = findViewById(R.id.minusBtn)
        plus = findViewById(R.id.plusBtn)

        minus.setOnClickListener {
            var currentNum = number.text.toString().toInt()
            currentNum--
            number.text = currentNum.toString()
        }

        plus.setOnClickListener {
            var currentNum = number.text.toString().toInt()
            currentNum++
            number.text = currentNum.toString()
        }

    }
}