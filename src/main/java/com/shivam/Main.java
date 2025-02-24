package com.shivam;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = 0.0, number1 = 0.0, number2 = 0.0;
        do {
            System.out.println("Welcome to the devops Calculator....\nPlease select the operation...\n\n");
            System.out.print("Press 1 to Square Root\nPress 2 to Factorial\nPress 3 to Logarithm\nPress 4 to Power\n" +
                    "Press any other key to exit\n\n\nEnter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }
            try {
                if (choice == 1 || choice == 2 || choice == 3) {
                    System.out.print("Enter the number : ");
                    number = scanner.nextDouble();
                } else if (choice == 4) {
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    number2 = scanner.nextDouble();
                }


            } catch (InputMismatchException error) {
                return;
            }
            switch (choice) {
                case 1:
                    // do Square Root
                    System.out.println("Square Root result is : " + root(number));
                    break;
                case 2:
                    // do Factorial
                    System.out.println("Factorial result is : " + fact(number));
                    break;
                case 3:
                    // do multiplication
                    System.out.println("Logarithmic result is : " + logar(number));
                    break;
                case 4:
                    // do division
                    System.out.println("Power result is : " + power(number1, number2));
                    break;
                default:
                    System.out.println("Exiting....");
                    return;
            }
        } while (true);
    }
    /*
    * Square root function - √x
    ● Factorial function - x!
    ● Natural logarithm (base е) - ln(x)
    ● Power function - x
    * */
    public static double root(double number1) {
        double result;
        if (number1 > 0) {
            result = Math.sqrt(number1);
        } else {
            result = 0;
        }
        
        return result;
    }
    public static double fact(double number1) {
        
        double result = 1;
        for (int i = 1; i <= number1; i++) {
            result *= i;
        }
        
        return result;
    }
    public static double power(double number1, double number2) {
        
        double result = Math.pow(number1, number2);
        
        return result;
    }
    public static double logar(double number1) {
        double result = Math.log(number1);
        return result;
    }
}