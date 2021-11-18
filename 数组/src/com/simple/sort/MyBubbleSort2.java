package com.simple.sort;

import java.util.Arrays;

/**
 * 冒泡排序练习2
 */
public class MyBubbleSort2 {
    public static void main(String[] args) {
        int[] ns = {66, 28, 23, 73, 28, 41, 14, 25, 28, 72, 80};
        // 排序前:
        System.out.println(Arrays.toString(ns));

        // 冒泡排序
        // 外层循环到数组倒数第二个数(包含),最后一个数不用再比较(因为前面已经比较过了)
        for (int i = 0; i < ns.length - 1; i++) {
            // 内层循环，让j从i的后面那个数开始比较
            for (int j = i+1; j < ns.length; j++) {
                if (ns[i] > ns[j]) {
                    // 借助第三个临时变量，互换两数
                    int temp = ns[j];
                    ns[j] = ns[i];
                    ns[i] = temp;
                }
            }
        }
        // 排序后
        System.out.println(Arrays.toString(ns));
    }
}
