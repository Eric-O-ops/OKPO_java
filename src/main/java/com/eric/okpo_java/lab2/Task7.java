package com.eric.okpo_java.lab2;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        double a, b, c;

        var input = new Scanner(System.in);
        System.out.print("Введите значение a: ");
        a = input.nextDouble();
        System.out.print("Введите значение b: ");
        b = input.nextDouble();

        c = a - 100;

        if (c == b) {
            System.out.println("Ваш вес соответствует норме.");
        } else {
            if (b < c) {
                System.out.println("Вам нужно набрать вес.");
            } else {
                System.out.println("Вам нужно сбросить вес.");
            }
        }

    }
}
