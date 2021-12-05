package com.simple.interfaceinherit.demo1;

public class Item {
    private String name;
    private double price;

    public Item() {
    }

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Item) {
            Item item = (Item) obj;
            return item.price == this.price;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.name + ":" + this.price;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("当前对象正在被回收...");
    }

}
