import java.util.Scanner;

class ReverseNumber {
    int num;

    ReverseNumber(int n) {
        num = n;
    }

    void reverse() {
        int rev = 0, temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }

        System.out.println("Reversed Number: " + rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        ReverseNumber obj = new ReverseNumber(n);
        obj.reverse();
    }
}