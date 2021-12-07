package com.simple.thread;

public class ThreadDemo4 {
    public static void main(String[] args) {
        System.out.println("main start...");
        Thread t = new Thread(()->{
            System.out.println("thread run...");
            System.out.println("thread end.");
        });
        t.start();
        System.out.println("main end.");
    }
}
