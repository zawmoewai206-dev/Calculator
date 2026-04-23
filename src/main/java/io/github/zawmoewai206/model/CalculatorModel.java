package io.github.zawmoewai206.model;


public class CalculatorModel {

    public double calculate(double a, double b, String op) {
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/":
                if (b == 0) throw new ArithmeticException("Divide by zero");
                return a / b;
            default: return 0;
        }
    }
}
