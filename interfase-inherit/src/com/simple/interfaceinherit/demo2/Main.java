package com.simple.interfaceinherit.demo2;

public class Main {
    public static void main(String[] args) {
        Item item=new Item() {
            @Override
            public boolean disposable() {
                return false;
            }
        };
        item.disposable();
    }
}
