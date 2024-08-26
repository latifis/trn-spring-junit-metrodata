package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.concurrent.TimeUnit;

@Execution(ExecutionMode.CONCURRENT)
//@Execution(ExecutionMode.SAME_THREAD)
public class TimeoutTest2 {

        @Test
        @Timeout(value = 5, unit = TimeUnit.SECONDS)
        void timeOutTest() throws InterruptedException {
            Thread.sleep(4_000);
        }

        @Test
        @Timeout(value = 5, unit = TimeUnit.SECONDS)
        void timeOutTest1() throws InterruptedException {
            Thread.sleep(4_000);
        }

        @Test
        @Timeout(value = 5, unit = TimeUnit.SECONDS)
        void timeOutTest2() throws InterruptedException {
            Thread.sleep(4_000);
        }

}
