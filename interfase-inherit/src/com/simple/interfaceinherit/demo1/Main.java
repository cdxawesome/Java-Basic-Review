package com.simple.interfaceinherit.demo1;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("红药", 20);
        Item item2 = new Item("药", 20);
        // 如果重写了equals方法，则按照equals方法里面的逻辑来比较，如果没有重写，则和==的效果是一样的，即比较两个对象的地址值
        System.out.println(item1.equals(item2));
        // 不管有没有重写equals方法，==比较的都是两个对象的地址值
        System.out.println(item1==item2);
    }


}
