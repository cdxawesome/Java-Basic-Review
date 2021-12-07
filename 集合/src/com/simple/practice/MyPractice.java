package com.simple.practice;

import java.util.ArrayList;
import java.util.List;

public class MyPractice {
    public static void main(String[] args) {
        // 构造从start到end的序列：
        final int start = 10;
        final int end = 20;
        List<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(i);
        }
        // 随机删除List中的一个元素:
        int removed = list.remove((int) (Math.random() * list.size()));
        int found = findMissingNumber(start, end, list);
        System.out.println(list.toString());
        System.out.println("missing number: " + found);
        System.out.println(removed == found ? "测试成功" : "测试失败");
    }

    static int findMissingNumber(int start, int end, List<Integer> list) {
        int numCount = end - start + 1;
        int groups = 0, listSum = 0;
        for (Integer item : list) {
            listSum += item;
        }
        if (numCount % 2 == 0) {
            groups = numCount / 2;
            return (end + start) * groups - listSum;
        } else {
            groups = numCount / 2;
            return (end + start) * groups+(start+groups)-listSum;
        }
    }
}


