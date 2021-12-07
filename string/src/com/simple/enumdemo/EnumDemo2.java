package com.simple.enumdemo;

public class EnumDemo2 {
    public static void main(String[] args) {
        WeekDay2 day = WeekDay2.SUN;
        if (day.dayValue == 6 || day.dayValue == 0) {
            System.out.println("Today is " + day + ". Work at home!");
        } else {
            System.out.println("Today is " + day + ". Work at office!");
        }
    }
}

// 覆写toString方法
enum WeekDay2 {
    // 给每个枚举常量添加一个值，需要此枚举中有对应的字段属性和构造方法
    MON(1, "星期一"), TUE(2, "星期二"), WED(3, "星期三"),
    THU(4, "星期四"), FRI(5, "星期五"), SAT(6, "星期六"),
    SUN(0, "星期天");

    public final int dayValue;
    private final String chinese;

    private WeekDay2(int dayValue, String chinese) {
        this.dayValue = dayValue;
        this.chinese = chinese;
    }

    @Override
    public String toString() {
        return chinese;
    }
}
