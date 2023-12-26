package com.eric.okpo_java.lab5

class Task11 {

    fun main() {
        val A = DoubleArray(16)

        println("Введите значения x, y, z:")
        print("x: ")
        val x = readln().toDouble()
        print("y: ")
        val y = readln().toDouble()
        print("z: ")
        val z = readln().toDouble()

        A[1] = x
        A[2] = y
        A[3] = z

        for (i in 4 until 16) {
            A[i] = (A[i - 1] + A[i - 2] + A[i - 3]) / 3.0
        }
        println("Массив A после заполнения: \n$A")
    }
}