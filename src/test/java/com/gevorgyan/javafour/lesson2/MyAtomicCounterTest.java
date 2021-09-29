package com.gevorgyan.javafour.lesson2;

import com.gevorgyan.javafour.lesson3.MyAtomicCounter;
import org.junit.jupiter.api.Test;

public class MyAtomicCounterTest {

    @Test
    public void counterTest() throws InterruptedException {
        MyAtomicCounter counter = new MyAtomicCounter();
        for (int i = 0; i < 5; i ++) {
            new Thread(counter).start();
        }
        Thread.currentThread().join(1000);
        System.out.println(counter.getCount());
    }
}
