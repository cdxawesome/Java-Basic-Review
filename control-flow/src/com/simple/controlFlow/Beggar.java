package com.simple.controlFlow;

/**
 * 乞丐的问题
 */
public class Beggar {
    public static void main(String[] args) {
        int totalDays = 10;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("第" + i + "天,乞丐乞讨了" + Math.pow(2, i - 1) + "块钱");
            sum += Math.pow(2, i - 1);
        }
        System.out.println("10天后，乞丐一共乞讨了" + sum + "块钱");
    }
}
