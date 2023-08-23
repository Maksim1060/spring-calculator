package pro.sky.sky.pro.homeWork;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String greeting() {
        return calculatorService.greeting();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.plus(num1, num2);


    }

    @GetMapping("/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.minus(num1, num2);

    }@GetMapping("/multyply")
    public String multyply(@RequestParam int num1, @RequestParam int num2){
        return calculatorService.multyply(num1,num2);
    }@GetMapping("/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2){
        return calculatorService.divide(num1,num2);
    }

}