package pro.sky.calculator.services;

import exception.DivisionByZeroException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {

    @Test
    void hello() {
        CalculatorServiceImpl calculatorController = new CalculatorServiceImpl();
        String expected = "Добро пожаловать в калькулятор";
        String actual = calculatorController.hello();
        assertEquals(expected, actual);
    }

    @Test
    void plus() {
        int num1 = 5;
        int num2 = 5;
        int sum = num1 + num2;
        String expected = "5 + 5 = 10";
        String actual = num1 + " + " + num2 + " = " + sum;
        assertEquals(expected, actual);
    }

    @Test
    void minus() {
        int num1 = 5;
        int num2 = 5;
        int dif = num1 - num2;
        String expected = "5 - 5 = 0";
        String actual = num1 + " - " + num2 + " = " + dif;
        assertEquals(expected, actual);
    }

    @Test
    void multiply() {
        int num1 = 5;
        int num2 = 5;
        int prod = num1 * num2;
        String expected = "5 * 5 = 10";
        String actual = num1 + " * " + num2 + " = " + prod;
        assertEquals(expected, actual);
    }

    @Test
    void divide() {
        int num1 = 5;
        int num2 = 5;
        int quot = num1 / num2;
        String expected = "5 / 5 = 10";
        String actual = num1 + " / " + num2 + " = " + quot;
        assertEquals(expected, actual);
    }

    @Test
    void testDivideByZero() {
        CalculatorServiceImpl calculatorController = new CalculatorServiceImpl();
        assertThrows(DivisionByZeroException.class, () -> {
            calculatorController.divide(10.0, (double) 0);
        });
    }
}