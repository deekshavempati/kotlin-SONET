package com.example.kotlin

import android.icu.number.IntegerWidth

fun main(){
    var input:String = readLine()!!
    var n:Int = input.toInt()
    var i:Int=0

    while (i<n) {
        for (i in 1..n-1) {
            print("$i"+ '@')


        }
        i++
        break;

    }

}