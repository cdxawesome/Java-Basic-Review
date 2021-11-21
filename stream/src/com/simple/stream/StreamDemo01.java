package com.simple.stream;

import java.util.stream.Stream;

public class StreamDemo01 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("A", "B", "C", "D");
        stream.forEach(System.out::println);
    }
}
