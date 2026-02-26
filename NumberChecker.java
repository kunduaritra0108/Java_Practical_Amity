import java.util.Scanner;
class Num_Check{
    private int number;
    public Num_Check(int num)
    {
        number = num;
    }
    public void CheckSign()
    {
        if(number>0)
        {
            System.out.println("The number is positive");
        }
        else if(number<0)
        {
            System.out.println("The number is negative");
        }
        else
        {
            System.out.println("The number is zero");
        }
    }
}
public class NumberChecker{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        Num_Check checker = new Num_Check(num);
        checker.CheckSign();
        sc.close();
    }
}