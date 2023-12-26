package com.eric.okpo_java.lab4

class Task4 {

    fun main() {
        var sum = 0.0
        var x: Double

        while (sum < 100) {
            print("Введите x: ")
            x = readln().toDouble()

            if (x >= 0) sum += x
            else println("Вы ввели не положительное число")
        }

        println("Sum: $sum")
    }
}