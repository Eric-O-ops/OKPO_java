package com.eric.okpo_java.lab2;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int n1, n2, n3;
        int a1, a2, a3, a4, a5, a6;

        System.out.print("Введите целое число n: ");
        int n = input.nextInt();

        n1 = (n / 100) % 10;
        n2 = (n / 10) % 10;
        n3 = n % 10;

        a1 = n1 * 100 + n2 * 10 + n3;
        a2 = n1 * 100 + n3 * 10 + n2;
        a3 = n2 * 100 + n1 * 10 + n3;
        a4 = n3 * 100 + n1 * 10 + n2;
        a5 = n2 * 100 + n3 * 10 + n1;
        a6 = n3 * 100 + n2 * 10 + n1;

        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
        System.out.println("a3: " + a3);
        System.out.println("a4: " + a4);
        System.out.println("a5: " + a5);
        System.out.println("a6: " + a6);
    }
}
