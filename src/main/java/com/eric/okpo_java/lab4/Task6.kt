package com.eric.okpo_java.lab4

class Task6 {

    fun main () {
        var positive = 0
        var negative = 0
        var zero = 0

        print("Введите n: ")
        var n = readln().toInt()

        while (n != 0) {
            print("Введите x: ")
            val x = readln().toDouble()

            when {
                x == 0.0 -> zero++
                x > 0 -> positive++
                else -> negative++
            }
            n--
        }

        println("Positive: $positive")
        println("Negative: $negative")
        println("Zero: $zero")
    }
}