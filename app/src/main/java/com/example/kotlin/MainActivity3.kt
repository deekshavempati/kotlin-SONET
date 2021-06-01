package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var input=findViewById<EditText>(R.id.editText)
        var btn= findViewById<Button>(R.id.btn)
        var txt = findViewById<TextView>(R.id.txt)
        var txt3 = findViewById<TextView>(R.id.txt3)
        var t= findViewById<TextView>(R.id.txt4)

        btn.setOnClickListener (View.OnClickListener {
            var a: Editable = input.text
            var b:String = a.toString()
            var side = b.toDouble()
            var area = side * side
            t.text = "Result : $area"



        } )
    }
}