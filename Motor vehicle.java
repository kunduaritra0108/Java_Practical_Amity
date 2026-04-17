// Abstract class
abstract class MotorVehicle {
    // Data Members
    String modelName;
    int modelNumber;
    double modelPrice;

    // Constructor
    MotorVehicle(String name, int number, double price) {
        modelName = name;
        modelNumber = number;
        modelPrice = price;
    }

    // Abstract method
    abstract void display();
}

// Subclass Car
class Car extends MotorVehicle {
    double discountRate;

    // Constructor
    Car(String name, int number, double price, double discountRate) {
        super(name, number, price);
        this.discountRate = discountRate;
    }

    // Method to calculate discount amount
    double discount() {
        return modelPrice * discountRate / 100;
    }

    // Overriding display() method
    void display() {
        System.out.println("Car Name: " + modelName);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Price: " + modelPrice);
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.println("Discount Amount: " + discount());
        System.out.println("Final Price: " + (modelPrice - discount()));
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating object
        Car c1 = new Car("Honda City", 2023, 1200000, 10);

        // Display details
        c1.display();
    }
}