package com.eric.okpo_java.lab5

class Task3 {

    fun main() {
        val C = IntArray(10)
        var count = 0

        println("Введите 10 элементов массива C:")
        for (i in 0 until 10) {
            print("C[$i]: ")
            C[i] = readln().toInt()
        }

        print("Введите a: ")
        val a: Int = readln().toInt()

        print("Введите b: ")
        val b: Int = readln().toInt()

        for (i in 0 until 10) {
            if (C[i] in a..b) {
                count++
            }
        }

        println("Количество элементов в массиве C, которые находятся в диапазоне [$a, $b]: $count")
    }
}