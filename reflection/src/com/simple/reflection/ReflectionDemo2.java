package com.simple.reflection;

import java.lang.reflect.Field;

public class ReflectionDemo2 {
    public static void main(String[] args) throws Exception {
        Object p = new Person2("Xiao Ming");
        Class<?> pClass = p.getClass();
        Field f = pClass.getDeclaredField("name");
        f.setAccessible(true);
        Object value = f.get(p);
        System.out.println(value);
    }
}

class Person2 {
    private String name;
    public Person2(String name) {
        this.name = name;
    }
}
