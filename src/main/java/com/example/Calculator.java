package com.example;

import java.util.Scanner;

public class Calculator {

    public double squareRoot(double x) {
        return Math.sqrt(x);
    }

    public long factorial(int x) {
        if (x < 0) throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        long result = 1;
        for (int i = 2; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    public double naturalLog(double x) {
        if (x <= 0) throw new IllegalArgumentException("Logarithm is only defined for positive numbers.");
        return Math.log(x);
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("Division by zero is not allowed.");
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.println("\nScientific Calculator Menu:");
            System.out.println("1. Addition (a + b)");
            System.out.println("2. Subtraction (a - b)");
            System.out.println("3. Multiplication (a * b)");
            System.out.println("4. Division (a / b)");
            System.out.println("5. Square Root (√x)");
            System.out.println("6. Factorial (x!)");
            System.out.println("7. Natural Logarithm (ln(x))");
            System.out.println("8. Power Function (x^b)");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            if (choice == 9) break;

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    double a1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double b1 = scanner.nextDouble();
                    System.out.println(a1 + " + " + b1 + " = " + calculator.add(a1, b1));
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    double a2 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double b2 = scanner.nextDouble();
                    System.out.println(a2 + " - " + b2 + " = " + calculator.subtract(a2, b2));
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    double a3 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double b3 = scanner.nextDouble();
                    System.out.println(a3 + " * " + b3 + " = " + calculator.multiply(a3, b3));
                    break;
                case 4:
                    System.out.print("Enter first number: ");
                    double a4 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double b4 = scanner.nextDouble();
                    try {
                        System.out.println(a4 + " / " + b4 + " = " + calculator.divide(a4, b4));
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.print("Enter number: ");
                    double num1 = scanner.nextDouble();
                    System.out.println("√" + num1 + " = " + calculator.squareRoot(num1));
                    break;
                case 6:
                    System.out.print("Enter an integer: ");
                    int num2 = scanner.nextInt();
                    System.out.println(num2 + "! = " + calculator.factorial(num2));
                    break;
                case 7:
                    System.out.print("Enter number: ");
                    double num3 = scanner.nextDouble();
                    System.out.println("ln(" + num3 + ") = " + calculator.naturalLog(num3));
                    break;
                case 8:
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exponent = scanner.nextDouble();
                    System.out.println(base + "^" + exponent + " = " + calculator.power(base, exponent));
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
