package com.simple.controlFlow;


import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        int month;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入月份: ");
        month = sc.nextInt();
        System.out.println(judgeSeason(month));
    }

    private static String judgeSeason(int month) {
        switch (month) {
            case 2:
            case 3:
            case 4:
                return "春天";
            case 5:
            case 6:
            case 7:
                return "夏天";
            case 8:
            case 9:
            case 10:
                return "秋天";
            case 11:
            case 12:
            case 1:
                return "冬天";
            default:
                return "输入不合法，月份必须在1-12之间";
        }
    }
}
