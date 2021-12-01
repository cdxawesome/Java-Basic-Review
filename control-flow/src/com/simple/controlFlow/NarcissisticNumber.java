package com.simple.controlFlow;

import java.util.ArrayList;
import java.util.List;

/**
 * 水仙花数定义：
 * 1. 一定是3位数
 * 2. 每一位的立方，加起来恰好是这个数本身，比如153=1*1*1+5*5*5+3*3*3
 * <p>
 * 寻找所有的水仙花数
 */
public class NarcissisticNumber {
    public static void main(String[] args) {
        List<Integer> targetNums = new ArrayList<>();
        int hundred, ten, single;// 百位、十位、个位
        for (int i = 100; i <= 999; i++) {
            // 获取i的百位数字，下面应该是直接去掉小数的
            hundred = i / 100;
            // 获取i的十位
            ten = (i - hundred * 100) / 10;
            // 获取i的个位
            single = i - hundred * 100 - ten * 10;
            if (i == (hundred * hundred * hundred + ten * ten * ten + single * single * single)) {
                targetNums.add(i);
            }
        }
        System.out.println("所有的水仙花数是: "+targetNums);
    }
}
