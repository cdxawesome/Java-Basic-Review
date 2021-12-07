package com.simple.array;

import java.util.Arrays;

/**
 * 首先创建一个长度是5的数组,并填充随机数。
 * <p>
 * 使用for循环或者while循环，对这个数组实现反转效果
 */
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = (int) (Math.random() * 100);
        arr[1] = (int) (Math.random() * 100);
        arr[2] = (int) (Math.random() * 100);
        arr[3] = (int) (Math.random() * 100);
        arr[4] = (int) (Math.random() * 100);

        System.out.println("随机数组是: " + Arrays.toString(arr));
        reverseArr(arr);
        System.out.println("数组反转后是: " + Arrays.toString(arr));
    }

    private static void reverseArr(int[] arr) {
        int temp = 0, i = 0, j = arr.length - 1;
        while (i != j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
}
