package com.eric.okpo_java.lab3;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Введите целое число a: ");
        int a = input.nextInt();

        switch (a) {
            case 1:
                System.out.println("Планы на понедельник");
                break;
            case 2:
                System.out.println("Планы на вторник");
                break;
            case 3:
                System.out.println("Планы на среду");
                break;
            case 4:
                System.out.println("Планы на четверг");
                break;
            case 5:
                System.out.println("Планы на пятницу");
                break;
            case 6:
                System.out.println("Планы на субботу");
                break;
            case 7:
                System.out.println("Планы на воскресенье");
                break;
            default:
                System.out.println("Ошибка");
        }
    }
}
