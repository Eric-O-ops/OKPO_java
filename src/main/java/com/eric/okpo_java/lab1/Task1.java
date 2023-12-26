package com.eric.okpo_java.lab1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        var input = new Scanner(System.in);
        double degreesA;
        double radA = 0;
        double PI = Math.PI;

        System.out.println("Введите гарадусы целым значние");

        try {
            degreesA = input.nextDouble();
            radA = Math.toRadians(degreesA);
        } catch (Exception e) {
            System.out.println("Вы ввели недопустимое значение");
            System.exit(0);
        }

        double z1Sin = Math.pow(Math.sin(3 * PI - 2 * radA), 2);
        double z1Cos = Math.pow(Math.cos(5 * PI + 2 * radA), 2);

        double z1 = 2 * z1Sin * z1Cos;

        System.out.println(z1);
    }
}
