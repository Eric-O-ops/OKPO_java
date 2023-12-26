package com.eric.okpo_java.lab3;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Введите целое число n: ");
        int n = input.nextInt();

        int x2 = n * 2;
        int x3 = n * 3;
        int x4 = n * 4;
        int x5 = n * 5;
        int x6 = n * 6;
        int x7 = n * 7;
        int x8 = n * 8;
        int x9 = n * 9;
        int x10 = n * 10;

        System.out.println("x1: " + n);
        System.out.println("x2: " + x2);
        System.out.println("x3: " + x3);
        System.out.println("x4: " + x4);
        System.out.println("x5: " + x5);
        System.out.println("x6: " + x6);
        System.out.println("x7: " + x7);
        System.out.println("x8: " + x8);
        System.out.println("x9: " + x9);
        System.out.println("x10: " + x10);
    }
}
