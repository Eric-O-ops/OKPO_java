package com.eric.okpo_java.lab2;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        int x, y;
        var input = new Scanner(System.in);
        try {
            System.out.print("Введите значение x: ");
            x = input.nextInt();
            System.out.print("Введите значение y: ");
            y = input.nextInt();

            if (x==0 && y ==0 ) {
                System.out.println("Координаты равны нулю");
                return;
            }

            if (x > 0 && y > 0) {
                System.out.println("Первая четверть.");
            } else if (y < 0) {
                System.out.println("Четвертая четверть.");
            } else if (x < 0 && y > 0) {
                System.out.println("Вторая четверть.");
            } else {
                System.out.println("Третья четверть.");
            }
        } catch (Exception e) {
            System.out.println("Вы ввели не соотвествующие данные");
        }
    }
}