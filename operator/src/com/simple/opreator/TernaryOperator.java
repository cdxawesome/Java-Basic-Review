package com.simple.opreator;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        // 用三元运算符判断输入的是否是工作日
        int dayOfWeek;
        Scanner sc = new Scanner(System.in);
        System.out.println("今天星期几? ");
        dayOfWeek = sc.nextInt();
        System.out.println((dayOfWeek == 6 || dayOfWeek == 7) ? "不是工作日" : "是工作日");
        sc.close();
    }
}
