package com.eric.okpo_java.lab4

class Task8 {

    fun main() {
        var count = 0
        var sum = 0
        var i = 3

        while (sum < 200) {
            count++
            sum += i
            i += 3
        }

        println("count: $count")
        println("sum: $sum")
    }
}