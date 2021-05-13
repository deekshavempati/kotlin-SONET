package com.example.kotlin

fun main(){
    var n = 11
    var res:String =if(n>9) "hello " else "world"

    res=when (n){
        1 ->("hello")
        in 2..10 ->("world")
        11,12,13 -> ("test")
        else -> (" no")
    }
    print(res)
}