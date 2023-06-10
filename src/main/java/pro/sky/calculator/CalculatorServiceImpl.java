package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(double num1, double num2) {
        double sum = new Double(num1 + num2);
        return num1 + " + " + num2 + " = " + sum;
    }

    public String minus(double num1, double num2) {
        double dif = new Double(num1 - num2);
        return num1 + " - " + num2 + " = " + dif;
    }

    public String multiply(double num1, double num2) {
        double prod = new Double(num1 * num2);
        return num1 + " * " + num2 + " = " + prod;
    }

}
