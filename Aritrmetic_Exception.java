//Write a Java program that takes two integers from the user, performs division, and handles the ArithmeticException if the second number(denominator) is zero

import java.util.Scanner;

public class Arithmetic_Exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer (numerator): ");
        int numerator = scanner.nextInt();

        System.out.print("Enter the second integer (denominator): ");
        int denominator = scanner.nextInt();

        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        scanner.close();
    }
}
