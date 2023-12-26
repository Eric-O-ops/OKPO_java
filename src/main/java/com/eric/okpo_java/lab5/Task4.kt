package com.eric.okpo_java.lab5

class Task4 {

    fun main() {
        val X = IntArray(20)
        var sum = 0
        var indexZero = 0

        println("Введите 20 элементов массива X:")
        for (i in 0 until 20) {
            print("X[$i]: ")
            X[i] = readln().toInt()
        }

        for (i in 0 until 20) {
            if (X[i] == 0) {
                indexZero = i
                break
            } else {
                sum += X[i]
            }
        }

        println("Сумма элементов массива X: $sum")
        println("Индекс первого вхождения нуля в массиве X: $indexZero")
    }
}