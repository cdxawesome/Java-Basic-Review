package com.simple.stream.map;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        Arrays.asList("  Apple ", " pear ", " ORANGE", " Banana").stream()
                .map(String::trim)
                .map(String::toLowerCase)
                .forEach(System.out::println);
    }
}
