package com.simple.opreator;

public class AutoIncrement {
    public static void main(String[] args) {
        int i = 1;
        int j = ++i + i++ + ++i + ++i + i++;
        System.out.println(j);
        System.out.println(i);
    }
}
