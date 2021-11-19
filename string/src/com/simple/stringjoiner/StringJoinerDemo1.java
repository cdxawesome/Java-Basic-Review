package com.simple.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {
        String[] names = {"Bob", "Alice", "Grace"};
        // StringJoiner可以添加分隔符、前缀、后缀
        StringJoiner sj=new StringJoiner(", ","Hello ","!");
        for (String name:names){
            sj.add(name);
        }
        System.out.println(sj);
    }
}
