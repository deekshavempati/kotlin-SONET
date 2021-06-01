package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)


        var input=findViewById<EditText>(R.id.editTextTextPersonName2)
        var btn=findViewById<Button>(R.id.bn)
        var result =findViewById<TextView>(R.id.tv)

        btn.setOnClickListener(View.OnClickListener {
            var a:Editable = input.text

            var num:Int = a.toString().toInt();

            var i:Int=1
            var s:String =""
            while (true) {
                if(i==num) {

                    break;
                }
                s += "@$i"
                ++i
            }
            result.setText(s)

        })


    }
}