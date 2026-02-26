import java.util.Scanner;
public class PositiveNegative {
    int num;

    public PositiveNegative(int n) {
        num = n;
    }
    void check() {
        if (num > 0) {
            System.out.println("The number is positive.");
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        PositiveNegative obj = new PositiveNegative(number);
        obj.check();
        scanner.close();
    }
}
