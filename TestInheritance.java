import java.util.Scanner;

// Base class
class Shape {
    void area() {
        System.out.println("Calculating Area...");
    }
}

// Square class
class Square extends Shape {
    double side;

    Square(double s) {
        side = s;
    }

    void area() {
        System.out.println("Area of Square = " + (side * side));
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    void area() {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
}

// Circle class
class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void area() {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }
}

// Main class
class TestInheritance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of Square: ");
        Square s = new Square(sc.nextDouble());

        System.out.print("Enter length of Rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth of Rectangle: ");
        double b = sc.nextDouble();
        Rectangle r = new Rectangle(l, b);

        System.out.print("Enter radius of Circle: ");
        Circle c = new Circle(sc.nextDouble());

        s.area();
        r.area();
        c.area();

        sc.close();
    }
}