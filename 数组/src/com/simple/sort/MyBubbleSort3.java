package com.simple.sort;

import java.util.Arrays;

/**
 * 冒泡排序优化
 * 之前的写排序方法时间复杂度都是O(n²)
 * 现在这个排序方法的时间复杂度是O(n)
 */
public class MyBubbleSort3 {
    public static void main(String[] args) {
        int[] ns = {66, 28, 23, 73, 28, 41, 14, 25, 28, 72, 80};
        int i, j, temp;
        boolean swapped;
        // 排序前:
        System.out.println(Arrays.toString(ns));
        for (i = 0; i < ns.length - 1; i++) {
            swapped = false;
            for (j = 0; j < ns.length - i - 1; j++) {
                if (ns[j] > ns[j + 1]) {
                    // 交换ns[j]和ns[j+1]
                    temp = ns[j];
                    ns[j] = ns[j + 1];
                    ns[j + 1] = temp;
                    swapped = true;
                }
            }
            // 如果，结对比较没有发生交换动作，说明这一轮的都是顺序对的，没有必要再进行下一轮比较了，直接跳出循环
            if (swapped == false) break;
        }
        // 排序后
        System.out.println(Arrays.toString(ns));
    }
}
