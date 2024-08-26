package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorRepeatedTest {

    private Calculator calculator = new Calculator();

    @RepeatedTest(
            value = 10,
            name = "{displayName} ke {currentRepetition} dari {totalRepetitions}"
    )
    @DisplayName("RepeaatedTest")
    void repeatedAdd(RepetitionInfo info){
        Integer result = calculator.sum(10, 10);
        assertEquals(20, result);
        System.out.println(info.getCurrentRepetition() + " dari " + info.getTotalRepetitions());
    }

}
