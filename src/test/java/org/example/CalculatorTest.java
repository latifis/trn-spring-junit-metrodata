package org.example;

import org.example.generator.SimpleDisplayNameGenerator;
import org.junit.jupiter.api.*;

@DisplayName("Calculator Test")
@DisplayNameGeneration(value = SimpleDisplayNameGenerator.class)
public class CalculatorTest {

    @BeforeEach
    public void setUp(){
        System.out.println("Before Each Test");
    }

    @AfterEach
    public void tearDown(){
        System.out.println("After Each Test");
    }

    private Calculator calculator = new Calculator();

    @Test
//    @DisplayName("Penjumlahan Scenario Berhasil")
    void testSuccessTest(){
        int result = calculator.sum(10, 10);
        Assertions.assertEquals(20, result);
    }

    @Test
//    @Disabled  // to skip
    void divideSuccessTest(){
        int result = calculator.divide(10, 10);
        Assertions.assertEquals(1, result);
    }

    @Test
    void divideFailedTest(){
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> calculator.divide(10, 0));
    }

}
