package pro.sky.sky.pro.homeWork.Service;

import org.junit.jupiter.api.Test;
import pro.sky.sky.pro.homeWork.TestUtils;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
    private final CalculatorService calculatorService=new CalculatorService();

    @Test
    void greeting_success() {
        String expetedMessge="Добро пожаловать в калькулятор";
        String actualMessage=calculatorService.greeting();
        assertEquals(expetedMessge,actualMessage);

    }

    @Test
    void plus_success() {
        int num1 = 3;
        int num2 = 6;
        String expextedResult = TestUtils.formarResutl(num1, num2, "+", num1 + num2);
        String actualResult = calculatorService.plus(num1, num2);
        assertEquals(expextedResult,actualResult);
    }
    @Test
    void plus_success2() {
        int num1 = 43;
        int num2 = 6;
        String expextedResult = TestUtils.formarResutl(num1, num2, "+", num1 + num2);
        String actualResult = calculatorService.plus(num1, num2);
        assertEquals(expextedResult, actualResult);
    }
    @Test
    void minus_success() {
        int num1 = 5;
        int num2 = 3;
        String expextedResult = TestUtils.formarResutl(num1, num2, "-", num1 - num2);
        String actualResult = calculatorService.minus(num1, num2);
        assertEquals(expextedResult,actualResult);
    }

    @Test
    void multyply_success() {
        int num1 = 33;
        int num2 = 3;
        String expextedResult = TestUtils.formarResutl(num1, num2, "*", num1 * num2);
        String actualResult = calculatorService.multyply(num1, num2);
        assertEquals(expextedResult,actualResult);
    }

    @Test
    void divide_success() {
        int num1 = 55;
        int num2 = 4;
        String expextedResult = TestUtils.formarResutl(num1, num2, "/", num1 / num2);
        String actualResult = calculatorService.divide(num1, num2);
        assertEquals(expextedResult,actualResult);
    }

    @Test
    void divide_withException() {
        int num1 = 45;
        int num2 = 0;
        String expextedMessage = "На ноль делить нельзя";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(num1, num2));
        assertEquals(expextedMessage, exception.getMessage());
    }
}