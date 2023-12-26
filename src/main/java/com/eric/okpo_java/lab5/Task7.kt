package com.eric.okpo_java.lab5

class Task7 {

    fun main() {
        val X = IntArray(15)
        var countP = 0
        var lastP = 0

        println("Введите 15 элементов массива X:")
        for (i in 0 until 15) {
            print("X[$i]: ")
            X[i] = readln().toInt()

        }

        for (i in 0 until 15) {
            print("X[$i]: ")
            X[i] = readln().toInt()

            if (X[i] > 0) {
                countP++
                lastP = i
            }
        }

        if (countP == 0) {
            println("Нет положительных чисел")

        } else {
            val N = IntArray(countP)
            countP--
            for (i in 0 until 15) {
                if (X[i] > 0 && i != lastP) {
                    N[countP] = X[i]
                    countP--
                }
            }
            println("Массив N с положительными числами (исключая последний положительный элемент): \n$N")
        }
    }
}