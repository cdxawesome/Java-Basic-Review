package com.simple.opreator;

public class BitwiseOperator {
    public static void main(String[] args) {
        int i = 3;
        int j = 2;
        int c = ((i | j) ^ (i & j)) << 2 >>> 1;
        System.out.println(c);
    }
}
