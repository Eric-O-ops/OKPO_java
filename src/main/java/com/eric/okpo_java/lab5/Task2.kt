package com.eric.okpo_java.lab5

class Task2 {

    fun main() {
        val D = IntArray(15)
        var sum = 0

        println("Введите 15 элементов массива D:")
        for (i in 0 until 15) {
            print("D[$i]: ")
            D[i] = readln().toInt()
        }

        for (i in 1..15 step 2) {
            sum += D[i]
        }
        println("Сумма элементов с нечетными индексами в массиве D: $sum")
    }
}