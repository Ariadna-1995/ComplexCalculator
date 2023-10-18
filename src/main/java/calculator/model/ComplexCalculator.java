package calculator.model;

public class ComplexCalculator implements Calculable<ComplexNumber> {
    public ComplexNumber addition(ComplexNumber first, ComplexNumber second) {
        double newRealPart = first.getRealPart() + second.getRealPart();
        double newImaginaryPart = first.getImaginaryPart() + second.getImaginaryPart();
        return (new ComplexNumber(newRealPart, newImaginaryPart));
    }

    public ComplexNumber subtraction(ComplexNumber first, ComplexNumber second) {
        double newRealPart = first.getRealPart() - second.getRealPart();
        double newImaginaryPart = first.getImaginaryPart() - second.getImaginaryPart();
        return (new ComplexNumber(newRealPart, newImaginaryPart));
    }

    public ComplexNumber multiplication(ComplexNumber first, ComplexNumber second) {
        double newRealPart = first.getRealPart() * second.getRealPart() - first.getImaginaryPart() * second.getImaginaryPart();
        double newImaginaryPart = first.getImaginaryPart() * second.getRealPart() + first.getRealPart() * second.getImaginaryPart();
        return (new ComplexNumber(newRealPart, newImaginaryPart));
    }

    public ComplexNumber division(ComplexNumber first, ComplexNumber second) {
        double newRealPart = (first.getRealPart() * second.getRealPart() + first.getImaginaryPart() * second.getImaginaryPart()) /
                (second.getRealPart() * second.getRealPart() + second.getImaginaryPart() * second.getImaginaryPart());
        double newImaginaryPart = (first.getImaginaryPart() * second.getRealPart() - first.getRealPart() * second.getImaginaryPart()) /
                (second.getRealPart() * second.getRealPart() + second.getImaginaryPart() * second.getImaginaryPart());
        return (new ComplexNumber(newRealPart, newImaginaryPart));
    }
}

