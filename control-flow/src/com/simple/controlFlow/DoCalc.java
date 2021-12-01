package com.simple.controlFlow;

/**
 * x1+y1=8
 * x2-y2=6
 * x1+x2=14
 * y1+y2=10
 * 求出x1,x2,y1,y2的值
 */
public class DoCalc {
    public static void main(String[] args) {
        int x1 = 0, x2 = 0, y1 = 0, y2 = 0;

        for (x1 = 0; x1 < 20; x1++) {
            for (x2 = 0; x2 < 20; x2++) {
                for (y1 = 0; y1 < 20; y1++) {
                    for (y2 = 0; y2 < 20; y2++) {
                        // 这里将数字放在前面，放置如果==写成=的话会变成赋值操作，数字写在前面就不会了。
                        if (8 == x1 + y1 && 6 == x2 - y2 && 14 == x1 + x2 && 10 == y1 + y2) {
                            System.out.println("x1 = " + x1);
                            System.out.println("x2 = " + x2);
                            System.out.println("y1 = " + y1);
                            System.out.println("y2 = " + y2);
                        }
                    }
                }
            }
        }

    }
}
