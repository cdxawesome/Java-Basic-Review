package com.simple.multidimensional;

/**
 * 打印多维数组
 */
public class PrintArray {
    public static void main(String[] args) {
        int[][] ns = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        // 二层循环打印二维数组
        for (int i = 0; i < ns.length; i++) {
            for (int j = 0; j < ns[i].length; j++) {
                System.out.print(ns[i][j] + " ");
            }
            System.out.println();
        }

    }
}
