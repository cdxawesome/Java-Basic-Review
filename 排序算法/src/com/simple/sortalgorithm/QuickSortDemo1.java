package com.simple.sortalgorithm;

import java.util.Arrays;


/**
 * 快速排序
 */
public class QuickSortDemo1 {

    public static void main(String[] args) {
        int[] arr = {33, 12, 7, 45, 3, 90, 23, 11, 9, 4, 28, 76};
        // 排序前
        System.out.println("排序前: " + Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("排序后: " + Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int left, int right) {
        if (left > right) {
            return;
        }
        int base, i, j, temp;
        base = arr[left];
        i = left;
        j = right;
        while (i < j) {
            // 判断右边
            while (arr[j] >= base && j > i) {
                j--;
            }

            // 判断左边
            while (arr[i] <= base && j > i) {
                i++;
            }

            /*不满足上述条件说明我们找到了需要的元素
             *即，右边找到了小于基准数的数，左边找了大于基准数的数
             */
            if (i < j) {
                // 两数互换
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // 循环完成后，此时左边都是比base小的，右边都是比base大，此时base归为到中间
        arr[left] = arr[i];
        arr[i] = base;

        // 递归调用左半边数组
        quickSort(arr, left, i - 1);

        // 递归调用右半边数组
        quickSort(arr, i + 1, right);
    }
}
