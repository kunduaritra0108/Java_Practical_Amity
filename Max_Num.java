import java.util.Scanner;
class Maximum{
    private int num_1, num_2, num_3;
    public Maximum(int n1, int n2, int n3){
        num_1 = n1;
        num_2 = n2;
        num_3 = n3;
    }
    public void Checker(){
        if(num_1>num_2 && num_1>num_3)
        {
            System.out.println(num_1+" is maximum.");
        }
        else if(num_2> num_3)
        {
            System.out.println(num_2+" is maximum");
        }
        else
        {
            System.out.println(num_3+" is maximum");
        }
    }
}
public class Max_Num {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        n1 = sc.nextInt();
        System.out.println("Enter second number: ");
        n2 = sc.nextInt();
        System.out.println("Enter third number: ");
        n3 = sc.nextInt();
        Maximum checker = new Maximum(n1, n2, n3);
        checker.Checker();
        sc.close();
    }
}
