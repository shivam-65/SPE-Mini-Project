package com.shivam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        // Input first number
        System.out.print("Enter First Number: ");
        int a = scanner.nextInt();

        // Input second number
        System.out.print("Enter Second Number: ");
        int b = scanner.nextInt();

        // Input choice
        System.out.print("Enter the Choice (1-4): ");
        int ch = scanner.nextInt();

        int result = 0;
        boolean valid = true;

        // Perform operation based on choice
        switch (ch) {
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Division by zero is not allowed.");
                    valid = false;
                }
                break;
            default:
                System.out.println("Invalid Choice!");
                valid = false;
        }

        if (valid) {
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}



