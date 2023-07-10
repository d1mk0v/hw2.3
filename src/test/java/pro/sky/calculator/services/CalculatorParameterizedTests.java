package pro.sky.calculator.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorParameterizedTests {
    CalculatorServiceImpl calculatorParameterizedTests = new CalculatorServiceImpl();

    @ParameterizedTest
    @CsvSource({"2, 3, 5", "-2, 3, 1", "0, 0, 0", "-5, -5, -10"})
    public void plus(double num1, double num2, double sum) {
        double expected = num1 + num2;
        double actual = sum;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"5, 3, 2", "0, 0, 0", "-5, -3, -2", "10, -5, 15"})
    public void minus(double num1, double num2, double dif) {
        double expected = num1 - num2;
        double actual = dif;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"2, 3, 6", "-2, 3, -6", "0, 0, 0", "-5, -5, 25"})
    public void multiply(double num1, double num2, double prod) {
        double expected = num1 * num2;
        double actual = prod;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"6, 3, 2", "0, 5, 0", "-10, -5, 2", "10, -5, -2"})
    public void divide(double num1, double num2, double quot) {
        double expected = num1 / num2;
        double actual = quot;
        assertEquals(expected, actual);
    }
}