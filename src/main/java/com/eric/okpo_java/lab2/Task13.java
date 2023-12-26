package com.eric.okpo_java.lab2;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        int a1, a2, an, d;
        var input = new Scanner(System.in);
        System.out.print("Введите значения a1, a2, an: ");

        a1 = input.nextInt();
        a2 = input.nextInt();
        an = input.nextInt();

        d = a2 - a1;

        if (Math.abs(a2 - an) % d == 0) {
            System.out.println("Число принадлежит арифметической прогрессии.");
        } else {
            System.out.println("Число не принадлежит арифметической прогрессии.");
        }
    }
}
