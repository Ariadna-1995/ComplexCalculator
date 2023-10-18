package calculator.controller;

import calculator.model.ComplexCalculator;
import calculator.model.ComplexNumber;
import calculator.view.UserView;

public class Controller {
    private final ComplexCalculator complexCalculator;
    public Controller(ComplexCalculator complexCalculator) {

        this.complexCalculator = complexCalculator;
    }
    public static ComplexNumber add(ComplexNumber first, ComplexNumber second) {
        return complexCalculator.addition(first, second);

    }
    public static ComplexNumber subtract(ComplexNumber first, ComplexNumber second) {
        return complexCalculator.subtraction(first, second);
    }
    public static ComplexNumber multiply(ComplexNumber first, ComplexNumber second) {
        return complexCalculator.multiplication(first, second);
    }
    public static ComplexNumber divide(ComplexNumber first, ComplexNumber second){
        return complexCalculator.division(first, second);
    }
}
