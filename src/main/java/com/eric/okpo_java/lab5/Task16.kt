package com.eric.okpo_java.lab5

class Task16 {

    fun main() {
        val Y = IntArray(30)
        var firstPP = -1
        var minP = 0

        println("Введите 30 элементов массива Y:")
        for (i in 0 until 30) {
            print("Y[$i]: ")
            Y[i] = readln().toInt()
        }

        for (i in 0 until 30) {
            if (Y[i] > 0 && firstPP < 0) firstPP = i
            if (Y[i] < Y[minP]) minP = i
        }

        val box: Int = Y[firstPP]
        Y[firstPP] = Y[minP]
        Y[minP] = box

        println("Массив Y после обмена: ")
        for (i in 0 until 30) {
            println("Y[$i]: ")
        }
    }
}