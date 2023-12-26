package com.eric.okpo_java.lab5

class Task12 {

    fun main() {
        val array = DoubleArray(9)

        println("Введите 9 элементов массива array:")
        for (i in 0..8) {
            println("array[$i]: ")
            array[i] = readln().toDouble()
        }

        for (i in 0..8) {
            if (array[i] > 1) array[i] -= 0.5
            else array[i] += 0.5
        }

        println("Измененный массив array:")
        for (i in 0..8) {
            println("array[$i]: ${array[i]}")
        }
    }
}