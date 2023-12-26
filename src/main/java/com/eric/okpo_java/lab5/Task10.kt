package com.eric.okpo_java.lab5

class Task10 {

    fun main() {
        val C = IntArray(15)
        var count0 = 0
        var count1 = 1
        var firstZero = -1
        var count0B = 0

        println("Введите 15 элементов массива C:")
        for (i in 0 until 15) {
            print("C[$i]: ")
            C[i] = readln().toInt()
        }

        for (i in 0 until 15) {
            if (C[i] == 1) {
                count1++
                if (i > 0 && firstZero < 0) {
                    firstZero = i - 1
                    count0B = count0
                }
            } else {
                count0++
            }
        }

        println("Количество элементов C, равных 0: $count0")
        println("Количество элементов C, равных 1: $count1")
        println("Количество элементов C, равных 0 перед первой единицей: $count0B")
    }
}