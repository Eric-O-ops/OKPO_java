package com.eric.okpo_java.lab3;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Введите значение для a: ");
        double a = input.nextDouble();

        System.out.print("Введите значение для b: ");
        double b = input.nextDouble();

        System.out.print("Введите значение для c: ");
        double c = input.nextDouble();

        double D = b * b - 4 * a * c;
        double x1, x2;

        switch (Double.compare(D, 0)) {
            case 1:
                x1 = (-b + Math.sqrt(D)) / (2 * a);
                x2 = (-b - Math.sqrt(D)) / (2 * a);
                System.out.println("Два действительных корня: x1 = " + x1 + ", x2 = " + x2);
                break;
            case 0:
                x1 = -b / (2 * a);
                System.out.println("Один действительный корень: x1 = " + x1);
                break;
            default:
                System.out.println("Нет действительных корней.");
        }
    }
}
