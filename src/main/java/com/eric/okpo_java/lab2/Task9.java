package com.eric.okpo_java.lab2;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        var input = new Scanner(System.in);

        try {
            System.out.print("Введите значение x1: ");
            int x1 = input.nextInt();

            System.out.print("Введите значение y1: ");
            int y1 = input.nextInt();

            System.out.print("Введите значение x2: ");
            int x2 = input.nextInt();

            System.out.print("Введите значение y2: ");
            int y2 = input.nextInt();

            if (x1 > 0 && x1 <= 8 && x2 > 0 && x2 <= 8) {
                if (x1 % 2 == x2 % 2 && y1 % 2 == y2 % 2) {
                    System.out.println("Одинаковый цвет.");
                } else {
                    System.out.println("Не одинаковый цвет.");
                }
            } else {
                System.out.println("Ошибка: x должен быть в пределах от 1 до 8.");
            }
        } catch (Exception e) {
            System.out.println("Ошибка ввода. Пожалуйста, введите целочисленные значения.");
        }
    }
}
