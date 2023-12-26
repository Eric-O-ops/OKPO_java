package com.eric.okpo_java.lab1;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        double radA, sum;
        var input = new Scanner(System.in);
        radA = Math.toRadians(input.nextDouble());
        sum = Math.pow(Math.sin(radA), 2) + Math.pow(Math.cos(radA), 2);

        System.out.println(sum);
    }
}