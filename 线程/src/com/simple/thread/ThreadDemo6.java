package com.simple.thread;

/**
 * 中断线程
 */
public class ThreadDemo6 {
    public static void main(String[] args) throws InterruptedException {
        Thread t=new MyThread3();
        t.start();
        Thread.sleep(1); // 暂停1毫秒
        t.interrupt(); // 中断t线程
        t.join();  // 等待t线程结束再执行下面语句
        System.out.println("end");
    }
}

class MyThread3 extends Thread {
    @Override
    public void run() {
        int n = 0;
        while (!isInterrupted()) {
            n++;
            System.out.println(n + " hello!");
        }
    }
}
