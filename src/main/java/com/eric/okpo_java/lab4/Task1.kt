package com.eric.okpo_java.lab4

class Task1 {

    fun main () {
        var S = 0

        for (i in 0..50) {
            if (i % 3 == 0) {
                S += i
            }
        }

        println(S)
    }
}