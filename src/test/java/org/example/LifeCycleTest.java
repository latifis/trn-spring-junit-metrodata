package org.example;

import org.junit.jupiter.api.*;

@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)   // untuk ordering
public class LifeCycleTest {

    private int count = 0;

    @Test
    @Order(2)
    void testDefault1(){
        count = 2;
    }

    @Test
    @Order(1)
    void testDefault2(){
        System.out.println(count);
    }

}
