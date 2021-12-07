package com.simple.thread;

public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread t=new MyThread();
        t.start();// 启动新线程
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Start new thread!");
    }
}
