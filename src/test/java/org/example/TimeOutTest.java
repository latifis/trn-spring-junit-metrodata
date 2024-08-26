package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class TimeOutTest {

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS)
    void timeOutTest() throws InterruptedException {
        Thread.sleep(5_000);
//        System.out.println("aasdjhdasjd asklka lkjlksaj lkaj ");
    }

}
