import java.util.Scanner;

class Student2 {
    int roll;
    String name;
    double marks;

    // Constructor 1
    Student2(int r) {
        roll = r;
        name = "Not Assigned";
        marks = 0.0;
    }

    // Constructor 2
    Student2(int r, String n) {
        roll = r;
        name = n;
        marks = 0.0;
    }

    // Constructor 3
    Student2(int r, String n, double m) {
        roll = r;
        name = n;
        marks = m;
    }

    void display() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll: ");
        int roll = sc.nextInt();
        sc.nextLine();  // clear buffer

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        Student2 s1 = new Student2(roll);
        Student2 s2 = new Student2(roll, name);
        Student2 s3 = new Student2(roll, name, marks);

        s1.display();
        s2.display();
        s3.display();

        sc.close();
    }
}