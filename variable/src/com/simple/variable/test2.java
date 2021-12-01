package com.simple.variable;

public class test2 {
    public static void main(String[] args) {
        short s1 = 3;
        short s2 = 2;
        System.out.println(getType(s1 + s2));
    }

    private static String getType(Object o) {
        return o.getClass().getName().toString();
    }
}
