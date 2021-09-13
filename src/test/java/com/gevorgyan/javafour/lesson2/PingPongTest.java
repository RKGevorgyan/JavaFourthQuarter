package com.gevorgyan.javafour.lesson2;

import com.gevorgyan.javafour.lesson3.PingPong;
import org.junit.jupiter.api.Test;

public class PingPongTest {

    @Test
    public void testPingPong() throws InterruptedException {
        PingPong pingPong = new PingPong();
        new Thread(pingPong::ping).start();
        new Thread(pingPong::pong).start();
    }
}
