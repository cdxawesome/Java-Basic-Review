package com.simple.waitandnotify;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 使用wait和notify
 */
public class WaitAndNotifyDemo1 {
    public static void main(String[] args) throws InterruptedException {
        TaskQueue taskQueue = new TaskQueue();
        ArrayList<Thread> threads = new ArrayList<>();
        // 开启五个线程来获取任务，每个线程获取不到就会进入等待状态
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread() {
                @Override
                public void run() {
                    while (true) {
                        // 执行task
                        try {
                            String task = taskQueue.getTask();
                            System.out.println("execute task: " + task);
                        } catch (InterruptedException e) {
                            return;
                        }
                    }
                }
            };
            t.start();
            threads.add(t);
        }
        // 创建一个线程添加任务
        Thread add = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                // 放入task
                String s = "t-" + Math.random();
                System.out.println("add task: " + s);
                taskQueue.addTask(s);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
            }
        });
        add.start();
        add.join();
        Thread.sleep(100);
        // 中断获取任务的线程
        for (Thread thread : threads) {
            thread.interrupt();
        }
    }
}

class TaskQueue {
    Queue<String> queue = new LinkedList<>();

    /**
     * 添加任务
     * @param s
     */
    public synchronized void addTask(String s) {
        this.queue.add(s);
        // 唤醒等待的线程
        this.notifyAll();
    }

    /**
     * 获取任务
     * @return
     * @throws InterruptedException
     */
    public synchronized String getTask() throws InterruptedException {
        while (this.queue.isEmpty()) {
            // 如果队列为空，则进入等待状态并释放锁
            this.wait();
        }
        return this.queue.remove();
    }

}
