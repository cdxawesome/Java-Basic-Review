package com.simple.classandobject;

public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;

    public Hero() {
    }

    public Hero(String name, float hp) {
        this.name = name;
        this.hp = hp;
    }

    //复活
    public void revive(Hero h) {
        // 将传递进来的对象的引用指向了一个新的对象的地址
        h = new Hero("提莫", 383);
    }

    public static void main(String[] args) {
        Hero teemo = new Hero("提莫", 383);

        //受到400伤害，挂了
        teemo.hp = teemo.hp - 400;

        // 这里只是传递了对象的引用进去
        teemo.revive(teemo);

        System.out.println(teemo.hp);

    }
}
