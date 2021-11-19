package com.simple.enumdemo;

public class EnumDemo1 {
    public static void main(String[] args) {
        WeekDay day = WeekDay.SUN;
        if (day.dayValue == 6 || day.dayValue == 0) {
            System.out.println("Work at home!");
        } else {
            System.out.println("Work at office!");
        }
    }
}

enum WeekDay {
    // 给每个枚举常量添加一个值，需要此枚举中有字段属性和构造方法
    MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6), SUN(0);

    public final int dayValue;

    private WeekDay(int dayValue) {
        this.dayValue = dayValue;
    }
}
