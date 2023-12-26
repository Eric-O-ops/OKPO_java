package com.eric.okpo_java.lab5

class Task13 {

    fun main() {
        val X = IntArray(27)
        var min = 0

        println("Введите 27 элементов массива X:")
        for (i in 0 until 27) {
            print("X[$i]: ")
            X[i] = readln().toInt()
        }

        for (i in 0 until 27) {
            if (X[i] < min) min = X[i]
        }

        if (min > 0.1) {
            for (i in 0 until 27) {
                if (X[i] > 0) X[i] = 1
            }
            println("Измененный массив X: \n$X")
        } else {
            println("Минимальный элемент массива X меньше или равен 0.1, не производим изменения.")
        }
    }
}