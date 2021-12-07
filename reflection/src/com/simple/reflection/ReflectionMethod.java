package com.simple.reflection;

import java.lang.reflect.Method;

public class ReflectionMethod {
    public static void main(String[] args) throws Exception {
        Class<Student3> student3Class = Student3.class;
        // 获取public的方法getScore，参数为String：
        System.out.println(student3Class.getMethod("getScore", String.class));
        // 获取继承的getName方法，没有参数
        System.out.println(student3Class.getMethod("getName"));
        // 获取private的getGrade方法，参数为int
        System.out.println(student3Class.getDeclaredMethod("getGrade", int.class));
    }
}

class Student3 extends Person3 {
    public int getScore(String type) {
        return 99;
    }

    private int getGrade(int year) {
        return 1;
    }
}

class Person3 {
    public String getName() {
        return "Person";
    }
}