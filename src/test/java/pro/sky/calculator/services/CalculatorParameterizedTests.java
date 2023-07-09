package pro.sky.calculator.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorParameterizedTests {
    CalculatorServiceImpl calculatorParameterizedTests = new CalculatorServiceImpl();

    @ParameterizedTest
    @CsvSource({"2, 3, 5", "-2, 3, 1", "0, 0, 0", "-5, -5, -10"})
    public void testAdd(double num1, double num2, double expected) {
        double actual = Double.parseDouble(calculatorParameterizedTests.plus(num1, num2));
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"5, 3, 2", "0, 0, 0", "-5, -3, -2", "10, -5, 15"})
    public void testSubtract(double num1, double num2, double expected) {
        double actual = Double.parseDouble(calculatorParameterizedTests.minus(num1, num2));
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"2, 3, 6", "-2, 3, -6", "0, 0, 0", "-5, -5, 25"})
    public void testMultiply(double num1, double num2, double expected) {
        double actual = Double.parseDouble(calculatorParameterizedTests.multiply(num1, num2));
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"6, 3, 2", "0, 5, 0", "-10, -5, 2", "10, -5, -2"})
    public void testDivide(double num1, double num2, double expected) {
        double actual = Double.parseDouble(calculatorParameterizedTests.divide(num1, num2));
        assertEquals(expected, actual);
    }
}