package com.eric.okpo_java.lab4

class Task2 {

    fun main() {
        var sum = 0
        var count = 0

        print("Введите i: ")
        var i = readln().toInt()

        while (i % 5 != 0) i++

        while (count < 10) {
            sum += i
            i+=5
            count++
        }

        println("Sum: $sum")
    }
}