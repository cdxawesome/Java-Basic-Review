package com.simple.opreator;

public class AssignmentOperator {
    public static void main(String[] args) {
        int i = 1;
        // 这里的等号右边的式子i+ ++i,是从左到右计算的。
        i = i + ++i;
        System.out.println(i);  // 3
    }
}
