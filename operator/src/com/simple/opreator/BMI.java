package com.simple.opreator;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        double height;
        int weight;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的身高(m): ");
        height = sc.nextDouble();
        System.out.println("请输入你的体重(kg): ");
        weight = sc.nextInt();
        System.out.println("你的BMI指数是: " + (weight / (height * height)));
        sc.close();
    }
}
