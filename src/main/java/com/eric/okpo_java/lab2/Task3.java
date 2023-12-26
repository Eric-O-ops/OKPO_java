package com.eric.okpo_java.lab2;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        double a, b, c;
        var input = new Scanner(System.in);
        System.out.println("Введите а");
        a = input.nextDouble();
        System.out.println("Введите b");
        b = input.nextDouble();
        System.out.println("Введите c");
        c = input.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Сторона триугольника не может быть отрицательной или равна нулю");
        } else if (a + b > c || a + c > b || c + b > a) {
            System.out.println("Существует");
        } else {
            System.out.println("Не существует");
        }
    }
}
