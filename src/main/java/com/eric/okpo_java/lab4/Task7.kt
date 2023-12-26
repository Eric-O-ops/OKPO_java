package com.eric.okpo_java.lab4

class Task7 {

    fun main() {
        for (i in 10 until 100) {
            if (i % 4 == 0 && i % 6 != 0) println(i)
        }
    }
}