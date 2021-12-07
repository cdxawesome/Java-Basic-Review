package com.simple.array;

import java.util.Arrays;

/**
 * 首先定义一个5X8的二维数组，然后使用随机数填充满。
 * 借助Arrays的方法对二维数组进行排序。
 * <p>
 * 参考思路
 * 先把二维数组使用System.arraycopy进行数组复制到一个一维数组
 * 然后使用sort进行排序
 * 最后再复制回到二维数组。
 */
public class TwoDArraySort {
    public static void main(String[] args) {
        // 获取随机数组
        int[][] twoDArray = getTwoDArray(5, 8);
        System.out.println("随机多维数组如下: ");
        for (int[] arr : twoDArray) {
            System.out.println(Arrays.toString(arr));
        }

        doSort(twoDArray);
        System.out.println("排序后的二维数组如下: ");
        for (int[] arr : twoDArray) {
            System.out.println(Arrays.toString(arr));
        }

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

    /**
     * 给二维数组排序
     * @param arr /
     */
    private static void doSort(int[][] arr) {
        int[] temp = new int[arr.length * arr[0].length];
        int index = 0;
        // 将二维数组填充到一维数组中
        for (int[] ints : arr) {
            for (int anInt : ints) {
                temp[index] = anInt;
                index++;
            }
        }
        System.out.println("临时数组是: " + Arrays.toString(temp));
        bubbleSort(temp);

        // 将排序好的一维数组填充到二维数组中
        index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = temp[index];
                index++;
            }
        }
    }

    /**
     * 一维数组的冒泡排序
     * @param arr /
     */
    private static void bubbleSort(int[] arr) {
        int temp, i, j;
        boolean swapped;
        for (i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
