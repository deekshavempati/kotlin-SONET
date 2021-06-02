package com.example.kotlin

import android.icu.number.IntegerWidth


fun add(n:Int ,n2:Int):Int{
    val sum=n+n2
    return sum.toInt()
}
fun main(){
    var j:Int = 2
    var k : Int =5
var i :Int = add(j,k)
print(i)
}