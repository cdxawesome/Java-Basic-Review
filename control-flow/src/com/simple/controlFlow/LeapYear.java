package com.simple.controlFlow;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个年份: ");
        year = sc.nextInt();
        System.out.println(year + (isLeapYear(year) ? "是" : "不是") + "闰年");
    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
