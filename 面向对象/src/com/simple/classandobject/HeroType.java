package com.simple.classandobject;

import java.util.Arrays;

/**
 * 英雄类型
 */
public enum HeroType {
    TANK("坦克"),
    WIZARD("法师"),
    ASSASSIN("刺客"),
    ASSIST("辅助"),
    WARRIOR("近战"),
    RANGED("远程"),
    PUSH("推进"),
    FARMING("打野");

    public final String typeStr;

    HeroType(String typeStr) {
        this.typeStr = typeStr;
    }
}

class Test {
    public static void main(String[] args) {
        HeroType[] values = HeroType.values();
        Arrays.stream(values).forEach((item) -> System.out.println(item.toString() + ": " + item.typeStr));
    }
}
