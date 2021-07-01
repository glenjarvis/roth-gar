package com.glenjarvis.rothgar

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


private const val LIMIT = 20


class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollNumber()}

    }

    private fun rollNumber() {
        val randomNum =  (1..LIMIT).random()

        // Links to the text view
        val textView: TextView = findViewById(R.id.number_output)

        //Sets the TextView to the random integer
        textView.text = randomNum.toString()
    }

}

