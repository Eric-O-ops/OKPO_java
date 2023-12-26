package com.eric.okpo_java.lab1;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        double a, b, c, d, l, S;

        var input = new Scanner(System.in);

        System.out.println("Введите число а");
        a = input.nextDouble();
        System.out.println("Введите число b");
        b = input.nextDouble();
        System.out.println("Введите число c");
        c = input.nextDouble();
        System.out.println("Введите число d");
        d = input.nextDouble();

        l = (a + b) / 2;
        S = l * Math.sqrt(c * c - (Math.pow((Math.pow(a - b, 2) + c * c - d * d) / 2 * (a - b), 2)));
        System.out.println(S);
    }
}
