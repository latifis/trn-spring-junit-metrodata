package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

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


    // REPEATED PARAMETER TEST

    @DisplayName("Test Calculator")
    @ParameterizedTest(name = "{displayName} dengan parameter {0}")
    @ValueSource(ints = {11, 22, 33, 44, 55})
    void testWithParameter(int value){
        Integer expected = value + value;
        Integer result = calculator.sum(value, value);
        assertEquals(expected, result);
    }

    public static List<Integer> parameterSource(){
        return List.of(1,2,3,4,5);
    }

    @DisplayName("Test Calculator")
    @ParameterizedTest(name = "{displayName} dengan parameter {0}")
    @MethodSource({"parameterSource"})
    void testWithMethodSource(int value){
        Integer expected = value + value;
        Integer result = calculator.sum(value, value);
        assertEquals(expected, result);
    }

}
