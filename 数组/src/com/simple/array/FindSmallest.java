package com.simple.array;

import java.util.Arrays;
import java.util.Random;

/**
 * 首先创建一个长度是5的数组
 * 然后给数组的每一位赋予随机整数
 * 通过for循环，遍历数组，找出最小的一个值出来
 */
public class FindSmallest {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = (int) (Math.random() * 100);
        arr[1] = (int) (Math.random() * 100);
        arr[2] = (int) (Math.random() * 100);
        arr[3] = (int) (Math.random() * 100);
        arr[4] = (int) (Math.random() * 100);

        System.out.println("随机数组是: " + Arrays.toString(arr));

        System.out.println("最小的数是: " + findSmallestNum(arr));
    }

    private static int findSmallestNum(int[] arr) {
        int smallest = arr[0];
        for (int item : arr) {
            if (item < smallest) {
                smallest = item;
            }
        }
        return smallest;
    }
}
