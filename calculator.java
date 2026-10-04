// TODO: add your package line here, matching the folder where you place this file
// e.g. package com.yourcompany.calculator;

public class Calculator {
// add method
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }
// multiply method Rumyana
    public double multiply(double a, double b) {
        return a * b;
    }
// devide method
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    // Quick manual test
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("10 + 5 = " + calc.add(10, 5));
        System.out.println("10 - 5 = " + calc.subtract(10, 5));
        System.out.println("10 * 5 = " + calc.multiply(10, 5));
        System.out.println("10 / 5 = " + calc.divide(10, 5));

        try {
            calc.divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
