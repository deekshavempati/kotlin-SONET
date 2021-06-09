package com.example.kotlin

import android.icu.number.IntegerWidth

class bicycle{
    var brand:String=""
    var model:Int= 0

    fun display(){
        println(" the name of cycle's brand:$brand")
        println(" the value of cycle's brand:$model")

    }
}

fun main(){
    var honda = bicycle()
    honda.display()


}
