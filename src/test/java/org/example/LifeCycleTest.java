package org.example;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
public class LifeCycleTest {

    private int count = 0;

    @Test
    @Order(2)
    void testDefault1(){
        count = 2;
    }

    @Test
    @Order(1)  // not work
    void testDefault2(){
        System.out.println(count);
    }

}
