//Write a Java program to demonstrate method overloading.
import java.util.Scanner;

public class Method_Overloading {
    
    // Add two integers
    public static int add(int a, int b) {
        return a + b;
    }
    
    // Add two doubles
    public static double add(double a, double b) {
        return a + b;
    }
    
    // Add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter two integers to add:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Sum of two ints: " + add(a, b));
        
        System.out.println("Enter two doubles to add:");
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        System.out.println("Sum of two doubles: " + add(c, d));
        
        System.out.println("Enter three integers to add:");
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        int g = scanner.nextInt();
        System.out.println("Sum of three ints: " + add(e, f, g));
        
        scanner.close();
    }
}
