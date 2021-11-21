package com.simple.reflection;

public class ReflectionDemo1 {
    public static void main(String[] args) throws Exception {
        Class<Student> studentClass = Student.class;
        // 获取public字段"score"
        System.out.println(studentClass.getField("score"));
        // 获取继承的public字段"name"
        System.out.println(studentClass.getField("name"));
        // 获取private字段"grade"
        System.out.println(studentClass.getDeclaredField("grade"));
    }
}

class Student extends Person {
    public int score;
    private int grade;
}

class Person {
    public String name;
}
