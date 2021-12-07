package com.simple.stringbuilder;

/**
 * 自定义链式调用
 */
public class MyChainCalls {
    public static void main(String[] args) {
        Addr addr = new Addr();
        addr.add(3)
                .add(5)
                .inc()
                .add(10);
        System.out.println(addr.value());
    }
}

class Addr {
    private int sum = 0;

    public Addr add(int n) {
        sum += n;
        return this;
    }

    public Addr inc() {
        sum++;
        return this;
    }

    public int value() {
        return sum;
    }
}
