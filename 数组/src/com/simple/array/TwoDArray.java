package com.simple.array;

import java.util.Arrays;

/**
 * 定义一个5X5的二维数组。 然后使用随机数填充该二维数组。
 * 找出这个二维数组里，最大的那个值，并打印出其二维坐标
 */
public class TwoDArray {
    public static void main(String[] args) {
        int[][] twoDArray = getTwoDArray(5, 5);
        System.out.println("随机多维数组如下: ");
        for (int[] arr : twoDArray) {
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("数组中最大的元素的值是: " + findMax(twoDArray));
    }

    private static int[][] getTwoDArray(int row, int column) {
        int[][] arr = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        return arr;
    }

    private static int findMax(int[][] arr) {
        int max = arr[0][0];
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                if (ints[j] > max) {
                    max = ints[j];
                }
            }
        }
        return max;
    }
}
