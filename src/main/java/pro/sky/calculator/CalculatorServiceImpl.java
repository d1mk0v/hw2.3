package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String hello() {
        return "hello," + " <b>world</b>";
    }

    public String answerHello(String userName) {
        return "<b>hello</b> " + userName;
    }
}
