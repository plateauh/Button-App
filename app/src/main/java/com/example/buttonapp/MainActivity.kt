package com.example.buttonapp

import android.graphics.Color
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
            updateNumber("-")
        }

        plus.setOnClickListener {
            updateNumber("+")
        }

    }

    fun updateNumber (operation: String) {

        var currentNum = number.text.toString().toInt()

        // got the moving operation from Nha T. Tran in Stackoverflow. URL: https://stackoverflow.com/a/46859822.
        when (operation){
            "-" -> {
                currentNum--
                number.y += 10
            }
            "+" -> {
                currentNum++
                number.y -= 10
            }
        }

        number.text = currentNum.toString()

        when {
            currentNum > 0 -> number.setTextColor(Color.GREEN)
            currentNum < 0 -> number.setTextColor(Color.RED)
            currentNum == 0 -> number.setTextColor(Color.BLACK)
        }

    }
}