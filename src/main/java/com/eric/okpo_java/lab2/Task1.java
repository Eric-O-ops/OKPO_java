package com.eric.okpo_java.lab2;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        int x, y;
        var input = new Scanner(System.in);
        System.out.println("Введите целое число х");
        x = input.nextInt();
        if (x <= 5) y = x + 5;
        else y = 2 * x;
        System.out.println(y);
    }
}
