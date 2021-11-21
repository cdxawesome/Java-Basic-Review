package com.simple.reflection;

import java.lang.reflect.Method;

// 使用反射获取方法并调用
public class ReflectionMethod2 {
    public static void main(String[] args) throws Exception {
        String s = "Hello World";
        // 获取String类中的substring方法
        Method m = String.class.getMethod("substring", int.class);
        // 在s对象上调用该方法并获取值
        Object value = m.invoke(s, 6);
        System.out.println(value);
    }
}
