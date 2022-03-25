package com.example.kotlinone

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(), View.OnClickListener {

    var  Task_Five_a : Task_Five_a =  Task_Five_a (7, "Семь")
    var textFild: TextView? = null
    var button: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
button = findViewById(R.id.button1)
        if (button != null){
            button?.setOnClickListener(this)
        }
        textFild = findViewById(R.id.text)
        if (textFild != null){
            textFild?.setText("Первое поле:\n ${Task_Five_a.first} \n " +
                    " Второе поле:\n ${Task_Five_a.second} \n " )
        }


    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }


}


