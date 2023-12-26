package com.eric.okpo_java.lab4

class Task5 {

    fun main() {
        var sum = 0
        var count = 0

        for (i in 0..100 step 7) {
            sum += i
            count++
        }

        println("Sum: $sum, Count: $count")
    }
}