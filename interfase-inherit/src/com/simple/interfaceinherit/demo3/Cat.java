package com.simple.interfaceinherit.demo3;

public class Cat extends Animal implements Pet {

    public String name;

    public Cat(String name) {
        // 指定所有的猫都是4条腿
        super(4);
        this.name = name;
    }

    public Cat() {

    }


    @Override
    public void eat() {
        System.out.println("猫在吃东西");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("猫在玩耍");
    }
}
