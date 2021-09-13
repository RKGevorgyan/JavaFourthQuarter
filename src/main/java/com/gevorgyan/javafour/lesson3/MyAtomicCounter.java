package com.gevorgyan.javafour.lesson3;

import java.util.concurrent.locks.ReentrantLock;

public class MyAtomicCounter implements Runnable {
    int count;
    ReentrantLock lock = new ReentrantLock();

    public void run() {
        lock.lock();
        count++;
        System.out.println(Thread.currentThread().getName() + ":" + count);
        lock.unlock();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
