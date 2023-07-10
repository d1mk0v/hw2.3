package pro.sky.calculator.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorParameterizedTests {
    CalculatorServiceImpl calculatorServiceImpl;

        @ParameterizedTest
        @CsvSource({"2.0, 3.0, 2.0 + 3.0 = 5.0", "-2.0, 3.0, -2.0 + 3.0 = 1.0", "0.0, 0.0, 0.0 + 0.0 = 0.0", "-5.0, -5.0, -5.0 + -5.0 = -10.0"})
        void plus(double num1, double num2, String expected) {
            calculatorServiceImpl = new CalculatorServiceImpl();
            String actual = calculatorServiceImpl.plus(num1, num2);
            assertEquals(expected, actual);
        }

    @ParameterizedTest
    @CsvSource({"2.0, 3.0, 2.0 - 3.0 = -1.0", "-2.0, 3.0, -2.0 - 3.0 = -5.0", "0.0, 0.0, 0.0 - 0.0 = 0.0", "-5.0, -5.0, -5.0 - -5.0 = 0.0"})
    void minus(double num1, double num2, String expected) {
        calculatorServiceImpl = new CalculatorServiceImpl();
        String actual = calculatorServiceImpl.minus(num1, num2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"2.0, 3.0, 2.0 * 3.0 = 6.0", "-2.0, 3.0, -2.0 * 3.0 = -6.0", "0.0, 0.0, 0.0 * 0.0 = 0.0", "-5.0, -5.0, -5.0 * -5.0 = 25.0"})
    void multiply(double num1, double num2, String expected) {
        calculatorServiceImpl = new CalculatorServiceImpl();
        String actual = calculatorServiceImpl.multiply(num1, num2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"4.0, 2.0, 4.0 / 2.0 = 2.0", "-2.0, 2.0, -2.0 / 2.0 = -1.0", "-6.0, -3.0, -6.0 / -3.0 = 2.0",  "0.0, 0.0, 0.0 - 0.0 = 0.0"})
    void divide(double num1, double num2, String expected) {
        calculatorServiceImpl = new CalculatorServiceImpl();
        String actual = calculatorServiceImpl.divide(num1, num2);
        assertEquals(expected, actual);
    }
}