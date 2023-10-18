package calculator;

import calculator.controller.Controller;
import calculator.model.ComplexCalculator;
import calculator.view.UserView;

import calculator.logger.Log;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static final Logger log = Log.log(Main.class.getName());
    public static void main(String[] args) {
        log.log(Level.INFO, "Калькулятор комплексных чисел запущен");
        ComplexCalculator complexCalculator = new ComplexCalculator();
        Controller controller = new Controller(complexCalculator);
        UserView view = new UserView();
        view.run();
    }


}