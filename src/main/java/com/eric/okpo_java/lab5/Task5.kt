package com.eric.okpo_java.lab5

class Task5 {

    fun main() {
        val A = IntArray(16)
        val N = IntArray(16)
        var negative = 1
        var positive = 0

        println("Введите 16 элементов массива A:")
        for (i in 0 until 16) {
            print("A[$i]: ")
            A[i] = readln().toInt()
        }

        for (i in 0 until 16) {
            if (A[i] >= 0) {
                N[positive] = A[i]
                positive += 2
            } else {
                N[negative] = A[i]
                negative += 2
            }
        }

        println("Массив N с положительными и отрицательными числами: ")
        for (i in 0 until 16) {
            println("A[$i]: ")
        }
    }
}