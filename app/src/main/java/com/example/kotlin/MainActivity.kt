package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var input_result= findViewById<EditText>(R.id.input_radius);
        var btn= findViewById<Button>(R.id.btn);
        var txt= findViewById<TextView>(R.id.textView2);

        btn.setOnClickListener(View.OnClickListener {

            val pi:Double = 3.141
            var a:Editable= input_result.text
            var b:String = a.toString()
            var radius:Double=b.toDouble()
            var area = pi * radius * radius
            txt.setText("Result : $area")
        })
    }
}