import java.util.Scanner;
public class SwapNumber {
    int n1;
    int n2;
    SwapNumber(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    void swap()
    {
        int temp;
        temp = n1;
        n1= n2;
        n2 = temp;
    }
    void display()
    {
        System.out.println("After Swapping...");
        System.out.println("First number: "+n1);
        System.out.println("Second number: "+n2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter another number: ");
        int n2 = sc.nextInt();
        SwapNumber obj = new SwapNumber(n1,n2);
        obj.display();
        obj.swap();
        obj.display();
        sc.close();
    }
}

