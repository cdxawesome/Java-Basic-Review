package com.simple.interfaceinherit.demo3;

public class Spider extends Animal{


    protected Spider() {
        // 调用父类的收保护的构造器，指明所有蜘蛛的腿都是8条
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("蜘蛛在吃东西.");
    }
}
