package pro.sky.calculator.services;

import pro.sky.calculator.exception.DivisionByZeroException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(Double num1, Double num2) {
        double sum = num1 + num2;
        if (num1 == null || num2 == null) {
            return "Введите корректные данные";
        } else {
            return num1 + " + " + num2 + " = " + sum;
        }
    }

    public String minus(Double num1, Double num2) {
        double dif = num1 - num2;
        if (num1 == null || num2 == null) {
            return "Введите корректные данные";
        } else {
            return num1 + " - " + num2 + " = " + dif;
        }
    }

    public String multiply(Double num1, Double num2) {
        double prod = num1 * num2;
        if (num1 == null || num2 == null) {
            return "Введите корректные данные";
        } else {
            return num1 + " * " + num2 + " = " + prod;
        }
    }

    public String divide(Double num1, Double num2) {
        double quot = num1 / num2;
        if (num1 == null || num2 == null) {
            return "Введите корректные данные";
        }
        if (num2 == 0) {
            throw new DivisionByZeroException("На ноль делить нельзя!!!");
        } else {
            return num1 + " / " + num2 + " = " + quot;
        }
    }
}
