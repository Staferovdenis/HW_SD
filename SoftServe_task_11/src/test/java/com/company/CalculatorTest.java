package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

public class CalculatorTest {

    private Calc calc;

    @BeforeEach
    void newCalculator() {
        calc = new Calc();
        System.out.println("new Calculator");
    }

    @Test
    @DisplayName("Test 2+2+4")
    public void calculatorAdd() {

        int actualResult = calc.add(2, 2);
        assertEquals(4, actualResult, "Two plus Two should be 4");
    }
    @Test
    @DisplayName("Test 10/2=5")
    public void calculatorDiv(){
        int a = 10;
        int b = 2;
        assumeTrue(a>b);
        int actualResultDiv = calc.div(10,2);
        assertEquals(5,actualResultDiv);
    }

    @Test
    @DisplayName("Test division by 0")
    public void calculateDivisionZero(){
        assertThrows(ArithmeticException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
            calc.div(10,0);
            }
        });
    }
}
