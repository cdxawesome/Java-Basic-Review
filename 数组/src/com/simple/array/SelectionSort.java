package com.simple.array;

import java.util.Arrays;

/**
 * 选择排序
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] randomArray = getRandomArray(5);
        System.out.println("随机数组是: " + Arrays.toString(randomArray));
        doSelectionSort(randomArray);
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

    /**
     * 选择排序
     *
     * @param arr 传入一个int数组
     */
    private static void doSelectionSort(int[] arr) {
        int min, temp;
        for (int i = 0; i < arr.length; i++) {
            // 以i的位置为基准，开始向后找最小的数字
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                // 找到待排序元素中最小的那个数的下标
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // 如果找到了比min位置小的数，则交换两个数
            if (min != i) {
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
}
