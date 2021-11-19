package com.simple.stringbuilder;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        // 创建一个容量为1024个char的sb
        StringBuilder sb = new StringBuilder(1024);
        // 链式调用
        sb.append("Mr ")
                .append("Bob")
                .append("!")
                .insert(0, "Hello, ");
        System.out.println(sb);

    }
}
