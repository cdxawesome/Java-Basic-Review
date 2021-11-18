package com.simple.multidimensional;

import java.util.Arrays;

/**
 * 打印多维数组
 */
public class PrintArray2 {
    public static void main(String[] args) {
        int[][] ns = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        // 使用Arrays.deepToString()打印多维数组
        System.out.println(Arrays.deepToString(ns));
    }
}
