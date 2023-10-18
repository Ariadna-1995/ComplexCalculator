package calculator.model;

public class ComplexNumber {
    double realPart;
    double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void print() {
        if (imaginaryPart > 0) {
            if (realPart == 0) {
                System.out.println(imaginaryPart + "i");
            } else {
                System.out.println(realPart + "+" + imaginaryPart + "i");
            }
        } else if (imaginaryPart < 0) {
            if (realPart == 0) {
                System.out.println(imaginaryPart + "i");
            } else {
                System.out.println(realPart + "" + imaginaryPart + "i");
            }
        } else {
            System.out.println(realPart);
        }
    }
}
