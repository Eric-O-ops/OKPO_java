package com.eric.okpo_java.lab2;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {
        int x;
        double y;
        var input = new Scanner(System.in);
        System.out.print("Введите значение целого числа x: ");
        x = input.nextInt();

        if (x >= 0) {
            if (x > 7) {
                y = 1 + Math.pow(x, 2);
            } else {
                y = Math.sqrt(Math.pow(x, 5));
            }
        } else {
            if (x < -7) {
                y = 10 - 2 * x;
            } else {
                y = 1 / (2.0 + x);
            }
        }

        System.out.println("Значение y: " + y);
    }
}
