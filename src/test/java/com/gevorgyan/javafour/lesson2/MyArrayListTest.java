package com.gevorgyan.javafour.lesson2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyArrayListTest {

    @Test
    public void testArrayList() {
        MyArrayList<Integer> list = new MyArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add((int) (Math.random()*100));
        }
        list.set(0, 100);
        assertEquals(100,list.get(0));

        list.remove(0);
        assertEquals(99,list.size());

    }
}
