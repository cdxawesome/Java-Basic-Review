package com.simple.list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 使用iterator遍历集合
 */
public class UseIterator {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "pear", "banana");
        for (Iterator<String> it = fruits.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
    }
}
