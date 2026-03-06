//Write a java program to calculate area using method overloading
import java.util.Scanner;

public class Area_Overloading {
    
    // rea of rectangle
    public static double area(double length, double width) {
        return length * width;
    }
    
    // Area of circle
    public static double area(double radius) {
        return Math.PI * radius * radius;
    }
    
    // Area of triangle
    public static double area(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter length and width for rectangle:");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        System.out.println("Area of rectangle: " + area(length, width));
        
        System.out.println("Enter radius for circle:");
        double radius = scanner.nextDouble();
        System.out.println("Area of circle: " + area(radius));
        
        System.out.println("Enter base and height for triangle:");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        System.out.println("Area of triangle: " + area(base, height, true));
        
        scanner.close();
    }
}
