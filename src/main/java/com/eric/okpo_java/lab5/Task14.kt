package com.eric.okpo_java.lab5

class Task14 {

    fun main() {
        val X = IntArray(50)
        var min = 0
        var positionMin = 0
        var product = 1

        println("Введите 50 элементов массива X:")
        for (i in 0 until 50) {
            print("X[$i]: ")
            X[i] = readln().toInt()
        }

        for (i in 0 until 50) {
            print("X[$i]: ")
            X[i] = readln().toInt()

            if (X[i] < 0 && X[i] < min) {
                min = X[i]
                positionMin = i
            }
        }

        for (i in 0 until positionMin) {
            if (X[i] < 0)  product *= X[positionMin]
        }

        println("Минимальный отрицательный элемент массива X: $min")
        println("Произведение отрицательных элементов массива X: $")
    }
}