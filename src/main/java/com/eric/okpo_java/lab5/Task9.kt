package com.eric.okpo_java.lab5

class Task9 {

    fun main() {
        val A = IntArray(12)
        //val A = arrayOf(-1,2,3,-4,5,-6,1,-2,-3,4,5,-6)
        val B = IntArray(12)
        var lastP = 0
        var lastN = 6

        println("Введите 12 элементов массива A, кроме нуля:")
        for (i in 0 until 12) {
            print("A[$i]: ")
            A[i] = readln().toInt()
        }

        for (i in 0 until 12) {
            if (A[i] < 0) {
                B[lastN] = A[i]
                lastN++
            } else  if (A[i] > 0) {
                B[lastP] = A[i]
                lastP++
            }
        }
        println("Массив B с положительными и отрицательными числами из массива A: ")
        for (i in 0 until 12) {
            println("B$i]: ${B[i]}")
        }
    }
}