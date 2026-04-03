//Write a program to implement the multiple inheritance kind of framework (Gross Interface, Employee and Salary classes) in Java.

interface Gross {
    double calculateGross();
}

class Employee {
    private String name;
    private int id;
    private double basicSalary;

    public Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', basicSalary=" + basicSalary + "}";
    }
}

class Salary extends Employee implements Gross {
    private double hra;
    private double da;

    public Salary(int id, String name, double basicSalary, double hra, double da) {
        super(id, name, basicSalary);
        this.hra = hra;
        this.da = da;
    }

    @Override
    public double calculateGross() {
        return getBasicSalary() + hra + da;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salary{hra=" + hra + ", da=" + da + ", gross=" + calculateGross() + "}";
    }
}

public class Employee_Details {
    public static void main(String[] args) {
        Salary s1 = new Salary(101, "Alice", 40000, 8000, 6000);
        Salary s2 = new Salary(102, "Bob", 35000, 7000, 5500);

        System.out.println(s1);
        System.out.println("Gross salary of " + s1.getName() + " is " + s1.calculateGross());

        System.out.println(s2);
        System.out.println("Gross salary of " + s2.getName() + " is " + s2.calculateGross());
    }
}

