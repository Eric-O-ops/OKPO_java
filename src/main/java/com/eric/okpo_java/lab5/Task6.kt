package com.eric.okpo_java.lab5

class Task6 {

    fun main() {
        val A = IntArray(16)
        var product = 1
        var sum = 0

        println("Введите 16 элементов массива a:")
        for (i in 0 until 16) {
            print("A[$i]: ")
            A[i] = readln().toInt()
        }

        var i = 0
        while (i<16) {
            if (A[i] != 0) {
                product *= A[i]
            } else {
                while (i < 16) {
                    sum += A[i]
                    i++
                }
                break
            }
            i++
        }

        println("Произведение ненулевых элементов массива a: $product")
        println("Сумма оставшихся элементов массива a: $sum")
    }

}