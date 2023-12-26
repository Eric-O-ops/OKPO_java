package com.eric.okpo_java.lab5

class Task8 {

    fun main() {
        val A = IntArray(10)

        println("Введите 10 элементов массива A:")
        for (i in 0 until 10) {
            print("A[$i]: ")
            A[i] = readln().toInt()
        }

        var i = 0
        while (i<10) {
            if (A[i] == 0) {
                while (i < 10) {
                    if (A[i] > 0) A[i] *= 2
                    i++
                }
            }
            i++
        }

        println("Измененный массив A: ")
        for (i in 0 until 10) {
            println("A[$i]: ${A[i]}")
        }
    }
}