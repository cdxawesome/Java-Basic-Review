package com.simple.reflection;

import java.lang.reflect.Method;

// 子类覆写父类的方法，父类通过反射获取的方法作用于子类时，调用是父类还是子类的方法？调用的是子类的
public class ReflectionMethod3 {
    public static void main(String[] args) throws Exception {
        // 获取Person的hello方法
        Method m = Person4.class.getMethod("hello");
        // 对Student实例调用hello方法
        m.invoke(new Student4());
    }
}

class Person4 {
    public void hello() {
        System.out.println("Person:hello");
    }
}

class Student4 extends Person4 {
    @Override
    public void hello() {
        System.out.println("Student:hello");
    }
}
