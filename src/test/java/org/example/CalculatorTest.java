package org.example;

import org.example.generator.SimpleDisplayNameGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;

@DisplayName("Calculator Test")
@DisplayNameGeneration(value = SimpleDisplayNameGenerator.class)
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
//    @DisplayName("Penjumlahan Scenario Berhasil")
    void testSuccessTest(){
        int result = calculator.sum(10, 10);
        Assertions.assertEquals(20, result);
    }

    @Test
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
