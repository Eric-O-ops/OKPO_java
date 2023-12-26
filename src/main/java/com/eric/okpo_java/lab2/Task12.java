package com.eric.okpo_java.lab2;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Введите значения x1, y1, x2, y2: ");

        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        if (x1 == x2 || y1 == y2) {
            System.out.println("Ладья может побудить за один ход.");
        } else {
            System.out.println("Ладья не может победить за один ход.");
        }
    }
}