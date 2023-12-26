package com.eric.okpo_java.lab4

class Task10 {

    fun main() {
        var a = 1
        var b = 1.0
        var product = 1.0

        while (a <= 11) {
            while (b <= 3) {
                product = a * b
                println(product)
                b += 0.2
            }
            a++
        }
    }
}