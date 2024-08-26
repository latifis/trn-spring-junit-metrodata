package org.example;

public class Calculator {

    public Integer sum (int a, int b){
        return a + b;
    }

    public Integer divide (int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("Cannot Divide by zero");
        }else {
            return a/b;
        }
    }

}
