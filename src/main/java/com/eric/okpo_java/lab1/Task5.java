package com.eric.okpo_java.lab1;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        int year, nowYear, age;
        var input = new Scanner(System.in);
        System.out.println("Введите год рождения пользователея");
        year = input.nextInt();
        nowYear = Calendar.getInstance().getWeekYear();
        age = nowYear - year;

        System.out.println(age);
    }
}
