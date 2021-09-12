package com.gevorgyan.javafour.lesson2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class MyLinkedListTest {


    @Test
    public void testLinkedList()  {
        MyLinkedList<String> list = new MyLinkedList<>();

        list.insert(0,"a");
        list.insert(1,"b");
        list.insert(2,"c");

        assertEquals("c",list.removeLast());

        list.insertFirst("d");

        assertEquals("d",list.removeFirst());

    }
}
