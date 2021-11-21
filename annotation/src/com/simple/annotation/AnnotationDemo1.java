package com.simple.annotation;

import javax.annotation.PostConstruct;
import java.lang.reflect.Field;

public class AnnotationDemo1 {
    public static void main(String[] args) throws IllegalAccessException {
        Person p = new Person("this is a name", "1234567890000");
        Person p1=new Person();
        System.out.println("yes");
    }
}

class Person {

    public Person() {
    }

    public Person(String name, String city) throws IllegalAccessException {
        this.name = name;
        this.city = city;
        check();
    }

    private void check() throws IllegalAccessException {
        // 遍历所有field
        for (Field field : this.getClass().getFields()) {
            // 获取field指定的Range
            Range range = field.getAnnotation(Range.class);
            // 如果@Range存在
            if (range != null) {
                // 获取field的值
                Object o = field.get(this);
                // 如果这个值是String的话
                if (o instanceof String) {
                    String value = (String) o;
                    // 判断值是否满足@Range中的min和max
                    if (value.length() < range.min() || value.length() > range.max()) {
                        throw new IllegalArgumentException("Invalid field " + field.getName());
                    }
                }
            }
        }
    }

    @Range(min = 1, max = 20)
    public String name;

    @Range(max = 10)
    public String city;

}
