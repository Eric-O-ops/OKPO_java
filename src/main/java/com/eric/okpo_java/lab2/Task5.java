package com.eric.okpo_java.lab2;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        double a, r;
        var input = new Scanner(System.in);
        System.out.println("Введите а");
        a = input.nextDouble();
        System.out.println("Введите r");
        r = input.nextDouble();
        if (a <= 0 || r <= 0) System.out.println("Сторона а или радиус не могут быть меньше ли равняться нулю");
        else if (0.5 * a >= r) System.out.println("Круг поместится в квадрат");
        else System.out.println("Круг не поместится в квадрат ");
    }
}
