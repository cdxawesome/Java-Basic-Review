package com.simple.variable;

public class test1 {
    public static void main(String[] args) {
        byte b = 5;
        int i1 = 10;
        int i2 = 300;

        b = (byte) i1;
        System.out.println(b);

        b = (byte) i2;
        System.out.println(b);

        System.out.println(Integer.toBinaryString(i2));
    }
}
