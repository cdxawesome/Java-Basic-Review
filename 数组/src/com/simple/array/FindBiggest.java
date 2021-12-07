package com.simple.array;

import java.util.Arrays;

/**
 * 用增强型for循环找出最大的那个数
 */
public class FindBiggest {
    public static void main(String[] args) {
        int[] randomArray = getRandomArray(5);
        System.out.println("随机数组是: " + Arrays.toString(randomArray));
        System.out.println("数组中最大的值是: " + getBiggestNum(randomArray));

    }

    /**
     * 生成随机数组
     *
     * @param size 数组容量
     * @return 返回一个int数组
     */
    private static int[] getRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    private static int getBiggestNum(int[] arr) {
        int max = arr[0];
        for (int el : arr) {
            if (el > max) {
                max = el;
            }
        }
        return max;
    }
}
