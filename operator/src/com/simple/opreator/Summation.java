package com.simple.opreator;

import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数字，用空格分开: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("两个数的和是:" + (a + b));
        sc.close();
    }
}
