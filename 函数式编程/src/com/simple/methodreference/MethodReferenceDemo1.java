package com.simple.methodreference;

import java.util.Arrays;

/**
 * 方法引用
 */
public class MethodReferenceDemo1 {
    public static void main(String[] args) {
        String[] array = new String[]{"Apple", "Orange", "Banana", "Lemon"};
        Arrays.sort(array, MethodReferenceDemo1::cpm);
        System.out.println(String.join(", ", array));
    }

    static int cpm(String s1, String s2) {
        return s1.compareTo(s2);
    }
}
