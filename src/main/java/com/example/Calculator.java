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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.println("\nScientific Calculator Menu:");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Logarithm (ln(x))");
            System.out.println("4. Power Function (x^b)");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            if (choice == 5) break;

            switch (choice) {
                case 1:
                    System.out.print("Enter number: ");
                    double num1 = scanner.nextDouble();
                    System.out.println("√" + num1 + " = " + calculator.squareRoot(num1));
                    break;
                case 2:
                    System.out.print("Enter an integer: ");
                    int num2 = scanner.nextInt();
                    System.out.println(num2 + "! = " + calculator.factorial(num2));
                    break;
                case 3:
                    System.out.print("Enter number: ");
                    double num3 = scanner.nextDouble();
                    System.out.println("ln(" + num3 + ") = " + calculator.naturalLog(num3));
                    break;
                case 4:
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
