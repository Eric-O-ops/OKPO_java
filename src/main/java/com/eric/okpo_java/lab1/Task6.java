package com.eric.okpo_java.lab1;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        double A;
        var input = new Scanner(System.in);
        System.out.println("Введите объем информации в байтах:");
        A = input.nextDouble();

        double kilobytes = A / 1024;
        double megabytes = kilobytes / 1024;
        double gigabytes = megabytes / 1024;
        double terabytes = gigabytes / 1024;

        System.out.println("kb = " + kilobytes);
        System.out.println("mb = " + megabytes);
        System.out.println("gb = " + gigabytes);
        System.out.println("tb = " + terabytes);
    }
}
