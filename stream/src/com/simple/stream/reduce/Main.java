package com.simple.stream.reduce;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // 计算1到9的乘积。
        // reduce是聚合函数，初始化为1，acc是计算结果。每次都让结果乘以下一个元素
        int s = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).reduce(1, (acc, n) -> acc * n);
        System.out.println(s);
    }
}
