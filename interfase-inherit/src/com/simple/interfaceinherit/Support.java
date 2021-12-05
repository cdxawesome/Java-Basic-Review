package com.simple.interfaceinherit;

public class Support implements Healer{
    @Override
    public void heal() {
        System.out.println("我是个辅助");
    }
}
