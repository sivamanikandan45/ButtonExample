package com.example.buttonexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val addButton=findViewById<Button>(R.id.button_add)
        addButton.setOnClickListener {
            val operandA=findViewById<TextView>(R.id.number_one).text.toString().toInt()
            val operandB=findViewById<TextView>(R.id.number_two).text.toString().toInt()
            val result=operandA+operandB
            val resultTextView=findViewById<TextView>(R.id.result)
            resultTextView.text="Result: $result"
            //resultTextView.setText("Result: $result")
            resultTextView.visibility=View.VISIBLE

        }
    }
}