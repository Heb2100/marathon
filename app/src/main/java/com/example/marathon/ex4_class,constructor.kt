package com.example.marathon

fun main(){
    val Human = human()
//    인스턴스화를 꼭 한담에 써야한다!
    Human.eatingcake()
    println("this human name is ${Human.name}")

    val Human2 = human2("minsu")
    Human2.eatingcake()

}

class human{
    val name = "HB"
    fun eatingcake(){
        println("eating cake is so good~~")
    }
}

class human2 constructor(Str : String){
    val name = Str
    fun eatingcake(){
        println("$name love eating cake!")
    }
}

