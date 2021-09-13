package com.gevorgyan.javafour.lesson3;


public class PingPong {

    synchronized public void ping() {
        for (int i = 0; i < 10; i++) {
            System.out.print("ping");
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
            notify();
        }
    }

    synchronized public void pong() {
        for (int i = 0; i < 10; i++) {
            System.out.println("-pong");
            notify();
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
