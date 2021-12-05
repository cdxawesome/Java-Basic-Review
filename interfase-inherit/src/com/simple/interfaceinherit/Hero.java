package com.simple.interfaceinherit;

public class Hero {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //public Hero() {
    //}

    public Hero(String name) {
        this.name = name;
    }

    public void kill(Mortal m) {
        m.die();
    }
}
