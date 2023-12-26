package com.eric.okpo_java.lab2;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        double A, B;
        var input = new Scanner(System.in);
        System.out.println("Введите число А");
        A = input.nextDouble();
        System.out.println("Введите число В");
        B = input.nextDouble();

        if (B % A == 0) System.out.println("A является делителем B");
        else if (A % B == 0) System.out.println("B является делителем A");
        else System.out.println("A не является делителем B");
    }
}
