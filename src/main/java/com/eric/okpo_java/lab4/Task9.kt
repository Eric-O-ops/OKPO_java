package com.eric.okpo_java.lab4

class Task9 {

    fun main() {
        var count = 0
        var countP = 0
        var countN = 0
        var sumP = 0
        var sumN = 0

        while (count < 10) {
            print("Введите N: ")
            val n = readln().toInt()

            when {
                n > 0 -> {
                    sumP += n
                    countP++
                }

                n < 0 -> {
                    sumN += n
                    countN++
                }
                else -> {
                    count--
                }
            }
            count++
        }

        println("countP: $countP")
        println("countN: $countN")
        println("sumP: $sumP")
        println("sumN: $sumN")
    }

}