package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*;




class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)


        var input = findViewById<EditText>(R.id.et_6)
        var input2 = findViewById<EditText>(R.id.et2_6)
        var btn = findViewById<Button>(R.id.b_6)
        var result = findViewById<TextView>(R.id.tv_6)


        btn.setOnClickListener(View.OnClickListener {
            var a:Int = input.text.toString().toInt()
            var b:Int = input2.text.toString().toInt()
            var res:String= FeedingManul(a,b)
            result.setText(res)

        })
    }
}
fun randomDay():String{
    var day:String=""

    var arr = arrayOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday")
    day = arr[Random().nextInt(arr.size)]
    return day
}

fun FeedingManul(input: Int,input2: Int): String {
    var day: String = randomDay()
    var food = consumption(day)
    var changeWater = ChangeWater(day, input, input2)
    var res="Today is $day you need to feed $food \n Change Water : ${if (changeWater) "is needed" else "not needed"}"

    return res
}










fun consumption(day:String):String{
    var food:String=""
    when (day) {
        "Monday" -> food = "flakes"
        "Tuesday" -> food ="pellets"
        "Wednesday" -> food ="redworms"
        "Thursday" -> food="granules"
        "Friday" -> food="mosquitoes"
        "Saturday" ->food ="lettuce"
        "Sunday" ->food ="plankton"


    }
    return food
}
fun ChangeWater(Day: String, Temp: Int = 29, DirtSensor: Int = 29): Boolean {
    return when {
        isHot(Temp) -> true
        isDirt(DirtSensor) -> true
        isSunday(Day) -> true
        else -> false
    }
}
fun isHot(input: Int) = input > 30
fun isDirt(input2: Int) = input2 > 30
fun isSunday(day: String) = day == "Sunday"
