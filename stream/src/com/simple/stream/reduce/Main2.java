package com.simple.stream.reduce;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        // 按行读取配置
        List<String> props = Arrays.asList("profile=native", "debug=true", "logging=warn", "interval=500");
        Map<String, String> map = props.stream()
                // 把k=v转换成Map[k]=v
                .map(kv -> {
                    String[] ss = kv.split("=", 2);
                    Map<String, String> map1 = new HashMap<>();
                    map1.put(ss[0], ss[1]);
                    return map1;
                })
                // 将所有map聚合到一个map中
                .reduce(new HashMap<String, String>(), (m, kv) -> {
                    m.putAll(kv);
                    return m;
                });
        map.forEach((k, v) -> {
            System.out.println(k + " = " + v);
        });
    }
}
