package com.simple.controlFlow;

import java.util.Scanner;

/**
 * 计算阶乘
 */
public class Factorial {
    public static void main(String[] args) {
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数，我将返回它的阶乘: ");
        input = sc.nextInt();
        System.out.println(input + "的阶乘是" + calcFactorial(input));
    }

    private static int calcFactorial(int baseNum) {
        int result = 1;
        while (baseNum > 0) {
            result *= baseNum;
            baseNum -= 1;
        }
        return result;
    }
}
