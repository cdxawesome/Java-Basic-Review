package com.simple.array;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] randomArray = getRandomArray(10);
        System.out.println("随机数组是: " + Arrays.toString(randomArray));
        doBubbleSort(randomArray);
        System.out.println("排序后的数组是: " + Arrays.toString(randomArray));
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

    private static void doBubbleSort(int[] arr) {
        boolean swapped;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
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
