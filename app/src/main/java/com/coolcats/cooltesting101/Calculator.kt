package com.coolcats.cooltesting101

class Calculator {

    //companion object{
        fun addition(a: Int, b: Int) = a.toDouble() + b.toDouble()
        fun subtraction(a: Int, b: Int) = a.toDouble() + b.toDouble()
        fun division(a:Int, b:Int) = a.toDouble() / b.toDouble()
        fun multiplication(a: Int, b: Int) = a.toDouble() * b.toDouble()
        fun taxCalulation(a : Double, b: Double, c: Double) = (a * b) * c
        fun modulus(a: Int, b: Int) = a.toDouble() % b.toDouble()
    //}
}