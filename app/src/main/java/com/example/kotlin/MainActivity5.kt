package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        var input = findViewById<EditText>(R.id.ed_5)
        var input2 = findViewById<EditText>(R.id.ed2_5)
        var sp = findViewById<Spinner>(R.id.sp5)
        var btn = findViewById<Button>(R.id.b_5)
        var result = findViewById<TextView>(R.id.tv_5)
        btn.setOnClickListener(View.OnClickListener {
            var a:Float=input.text.toString().toFloat()
            var b:Float=input2.text.toString().toFloat()
            var s=sp.selectedItem.toString()
            when(s){
                "+"-> result.setText("result: "+ add(a,b))
                "-"-> result.setText("result: "+ sub(a,b))
                "*"-> result.setText("result: "+ mul(a,b))
                "/"-> result.setText("result: "+ div(a,b))
                "%"-> result.setText("result: "+ mod(a,b))
            }
        })
    }
}
fun add(a:Float,b:Float):Float{
    return a+b
}
fun sub(a:Float,b:Float):Float{
    return a-b
}
fun mul(a:Float,b:Float):Float{
    return a*b
}
fun div(a:Float,b:Float):Float{
    return a/b
}
fun mod(a:Float,b:Float):Float{
    return a%b
}