package com.eric.okpo_java.lab5

class Task1 {

    fun main() {
        val array = IntArray(10)

        println("Введите 10 элементов массива array:")
        for (i in 0 until 10) {
            print("array[$i]: ")
            array[i] = readln().toInt()
        }

        var count = 0
        for (i in 0 until 10) {
            if (array[i] == 0) {
                count++
            }
        }

        println("Количество нулей в массиве array: $count")
    }
}