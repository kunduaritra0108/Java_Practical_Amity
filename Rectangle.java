import java.util.Scanner;
public class Rectangle {
    int length, width, area, perimeter;
    void Area_Calc()
    {
        area = length*width;
        System.out.println("Area of the rectangle is: "+area);
    }
    void Perimeter_Calc()
    {
        perimeter = 2*(length+width);
        System.out.println("Perimeter of the rectangle is: "+perimeter);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle obj = new Rectangle();
        System.out.print("Enter the length of the rectangle: ");
        obj.length = sc.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        obj.width = sc.nextInt();
        obj.Area_Calc();
        obj.Perimeter_Calc();
    }
}
