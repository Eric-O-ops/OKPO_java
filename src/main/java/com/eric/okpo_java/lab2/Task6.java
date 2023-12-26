package com.eric.okpo_java.lab2;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        double a, b, c;

        var input = new Scanner(System.in);
        System.out.print("Введите значение a: ");
        a = input.nextDouble();
        System.out.print("Введите значение b: ");
        b = input.nextDouble();

        c = a + b;

        if (c > 100) {
            c = c - 200 * 0.03;
        }

        System.out.println("Результат: " + c);
    }
}
