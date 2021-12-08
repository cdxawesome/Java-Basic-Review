package com.simple.interfaceinherit.demo3;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs){
        this.legs=legs;
    }

    public Animal(){};

    public abstract void eat();

    public void walk(){
        System.out.println("我用"+legs+"条腿走路.");
    }
}
