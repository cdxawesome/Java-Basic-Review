package com.simple.controlFlow;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        double height;
        int weight;

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入您的身高(m): ");
        height = sc.nextDouble();
        System.out.println("请输入您的体重(kg): ");
        weight = sc.nextInt();
        System.out.println(calcBMI(height, weight));
        sc.close();

    }

    private static String calcBMI(double height, int weight) {
        double bmi = weight / (height * height);
        if (bmi < 18.5)
            return "体重过轻";
        else if (bmi >= 18.5 && bmi < 24)
            return "正常范围";
        else if (bmi >= 24 && bmi < 27)
            return "体重过重";
        else if (bmi >= 27 && bmi < 30)
            return "轻度肥胖";
        else if (bmi >= 30 && bmi < 35)
            return "中毒肥胖";
        else if (bmi >= 35)
            return "重度肥胖";
        else
            return "数据不合法，请联系管理员";
    }
}
