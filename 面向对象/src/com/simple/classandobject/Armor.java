package com.simple.classandobject;

public class Armor extends Item{
    private int ac;

    public Armor() {
    }

    public Armor(String name, double price, int ac) {
        super(name, price);
        this.ac = ac;
    }

    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }
}
