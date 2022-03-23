package com.example.kotlinone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.text)
        val button: Button = findViewById(R.id.button1)

        button.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View?) {
                textView.text = "Hello"
            }
        })
    }
}