package com.simple.classandobject;

public class Main {
    public static void main(String[] args) {
        Item item = new Armor("布甲", 300, 15);
        Armor armor = new Armor();
        armor.setName("锁子甲");
        armor.setPrice(500);
        armor.setAc(40);
    }
}
