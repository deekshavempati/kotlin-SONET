package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity7 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

        var name = findViewById<EditText>(R.id.ed7)
        var gender = findViewById<EditText>(R.id.ed7_2)
        var age = findViewById<EditText>(R.id.ed7_3)
        var btn= findViewById<Button>(R.id.b7)


        btn.setOnClickListener(View.OnClickListener {
            val p = person()
            p.name= name.text.toString()
            p.gender= gender.text.toString()
            p.age=age.text.toString().toInt()
            var result=if(p.age!=0)"${p.name}" else "person is minor"

            Toast.makeText(this, result,Toast.LENGTH_LONG).show()
        })
    }
}