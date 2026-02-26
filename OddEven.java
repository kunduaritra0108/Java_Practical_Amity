import java.util.Scanner;
class OddEven {
    int number;
    void check()
    {
        if(number%2 == 0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OddEven obj = new OddEven();
        System.out.print("Enter a number: ");
        obj.number = sc.nextInt();
        obj.check();
    }
}
