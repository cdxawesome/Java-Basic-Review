package com.simple.controlFlow;

/**
 * 打印 1-100 之间的数，如果这个数，要么是3，要么5的倍数，就忽略掉
 */
public class IgnoreMultiple {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.println(i);
            }
        }
    }
}
