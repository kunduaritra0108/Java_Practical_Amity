import java.util.Scanner;


interface Exam {
    void Percent_cal();
}


class Student {
    String name;
    int roll_no;
    int marks1, marks2;

    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        roll_no = sc.nextInt();

        System.out.print("Enter Marks1: ");
        marks1 = sc.nextInt();

        System.out.print("Enter Marks2: ");
        marks2 = sc.nextInt();
    }

    void show() {
        System.out.println("\nName: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Marks1: " + marks1);
        System.out.println("Marks2: " + marks2);
    }
}


class Result extends Student implements Exam {
    float per;

    
    public void Percent_cal() {
        per = (marks1 + marks2) / 2.0f;
    }

    void display() {
        System.out.println("Percentage: " + per + "%");
    }
}


public class Main {
    public static void main(String[] args) {
        Result r = new Result();

        r.getData();      
        r.show();         
        r.Percent_cal();  
        r.display();     
    }
}
