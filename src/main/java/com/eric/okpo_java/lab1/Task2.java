package com.eric.okpo_java.lab1;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        double x1 = 0;
        double x2 = 0;
        double y;
        var input = new Scanner(System.in);

        try {
            System.out.println("Введите х1");
            x1 = input.nextDouble();
        } catch (Exception e) {
            System.out.println("Вы ввели недопустимое значение для х1");
            return;
        }

        try {
            System.out.println("Введите х2");
            x2 = input.nextDouble();
        } catch (Exception e) {
            System.out.println("Вы ввели недопустимое значение для х2");
            return;
        }
        y = Math.pow(2, x1) + Math.pow(4, x2);
        System.out.println(y);
    }
}
