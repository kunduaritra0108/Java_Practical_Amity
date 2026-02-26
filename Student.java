class Student {
    int rollNo;
    String name;

    // Parameterized Constructor
    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        // Creating object using parameterized constructor
        Student s1 = new Student(101, "Aritra");
        
        s1.display();
    }
}