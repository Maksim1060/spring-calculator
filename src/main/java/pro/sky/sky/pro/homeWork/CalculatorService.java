package pro.sky.sky.pro.homeWork;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String greeting() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(int num1, int num2) {
        return formarResutl(num1, num2, "+", Integer.parseInt(Integer.toString(num1 + num2)));
    }

    public String minus(int num1, int num2) {
        return formarResutl(num1, num2, "-", Integer.parseInt(Integer.toString(num1 - num2)));
    }

    public String multyply(int num1, int num2) {
        return formarResutl(num1, num2, "*", Integer.parseInt(Integer.toString(num1 * num2)));
    }

    public String divide(int num1, int num2) {
        if (num2 == 0) {
            return "На ноль делить нельзя ";
        }
        double result = (double) num1 / num2;
        return formarResutl(num1, num2, "/",num1/num2 );
    } private String formarResutl ( int num1, int num2, String operation,int result){
            return String.format("%s %s %s =%s", num1, operation, num2, result);
        }
    }
