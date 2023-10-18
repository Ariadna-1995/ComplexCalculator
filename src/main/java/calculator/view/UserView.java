package calculator.view;
import calculator.model.ComplexNumber;
import calculator.controller.Controller;
import java.util.Scanner;

public class UserView {
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите реальную часть первого комплексного числа: ");
        double firstRealPart = sc.nextDouble();
        System.out.println("Введите мнимую часть первого комплексного числа: ");
        double firstImaginaryPart = sc.nextDouble();
        ComplexNumber first = new ComplexNumber(firstRealPart, firstImaginaryPart);
        System.out.println("Введите реальную часть второго комплексного числа: ");
        double secondRealPart = sc.nextDouble();
        System.out.println("Введите мнимую часть второго комплексного числа: ");
        double secondImaginaryPart = sc.nextDouble();
        ComplexNumber second = new ComplexNumber(secondRealPart, secondImaginaryPart);
        System.out.println("Выберите команду: ");
        while(true) {
            Command command = Command.valueOf(sc.nextLine());
            switch (command) {
                case ADD: {
                    Controller.add(first, second).print();
                    break;
                } case SUBTRACT: {
                    Controller.subtract(first, second).print();
                    break;
                } case MULTIPLY: {
                    Controller.multiply(first, second).print();
                } case DIVIDE: {
                    Controller.divide(first, second).print();
                    break;
                }
            }
        }



    }
}

