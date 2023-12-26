package com.eric.okpo_java.lab5

class Task15 {

    fun main() {
        val X = IntArray(30)
        var min = 0
        var minPosition = 0

        println("Введите 30 элементов массива X:")
        for (i in 0 until 30) {
            print("X[$i]: ")
            X[i] = readln().toInt()
        }

        for (i in 0 until 30) {
            if (X[i] < min) {
                min = X[i]
                minPosition = i + 1
            }
        }

        val N = IntArray(minPosition)
        var freePosition = 0

        for (i in 0 until minPosition) {
            if (X[i] < 0) {
                N[freePosition] = X[i]
                freePosition++
            }
        }

        println("Массив N с отрицательными значениями до минимального отрицательного элемента: \n$N")
    }
}