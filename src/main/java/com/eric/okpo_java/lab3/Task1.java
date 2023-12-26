package com.eric.okpo_java.lab3;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        double a, b, result;
        var input = new Scanner(System.in);

        System.out.print("Введите целое число a: ");
        a = input.nextInt();

        System.out.print("Введите целое число b: ");
        b = input.nextInt();

        System.out.print("Введите символ операции (+, -, *, /): ");
        char c = input.next().charAt(0);

        switch (c) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Ошибка: деление на ноль.");
                    return;
                }
                break;
            default:
                System.out.println("Ошибка: недопустимая операция.");
                return;
        }

        System.out.println("Результат: " + result);
    }
}