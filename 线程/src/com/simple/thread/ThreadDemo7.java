package com.simple.thread;

/**
 * 使用一个标志位中断线程
 */
public class ThreadDemo7 {
    public static void main(String[] args) throws InterruptedException {
        HelloThread t = new HelloThread();
        t.start();
        Thread.sleep(1);
        t.running = false; // 标志位设置为false
    }
}

class HelloThread extends Thread {
    public volatile boolean running = true;

    @Override
    public void run() {
        int n = 0;
        while (running) {
            n++;
            System.out.println(n + " hello!");
        }
        System.out.println("end!");
    }
}
