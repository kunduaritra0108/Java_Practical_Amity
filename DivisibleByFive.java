import java.util.Scanner;

class DivisibleByFive {
    int num;

    DivisibleByFive(int n) {
        num = n;
    }

    void checkDivisible() {
        if (num % 5 == 0)
            System.out.println("Divisible by 5");
        else
            System.out.println("Not Divisible by 5");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        DivisibleByFive obj = new DivisibleByFive(n);
        obj.checkDivisible();
    }
}