package com.eric.okpo_java.lab2;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int n1, n2, n3, n4;

        System.out.print("Введите целое число n: ");
        int n = input.nextInt();

        n1 = n % 10;
        n2 = n / 1000;
        n3 = (n / 10) % 10;
        n4 = (n / 100) % 10;

        if (n1 == n2 && n3 == n4) {
            System.out.println("Число является палиндромом.");
        } else {
            System.out.println("Число не является палиндромом.");
        }
    }
}