import java.util.Scanner;

public class Takinginputfromuser {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        //calculate Area of Rectangle
        System.out.println("Enter length=");
        int l= sc.nextInt();

        System.out.println("Enter Breadth=");
        int b= sc.nextInt();
        int area=l*b;
        System.out.println("Area of rectangle="+area);
        //calculate Area of circle
        System.out.println("Enter radius=");
        int radius= sc.nextInt();

        float pi=3.14f;

        float Area=pi*radius*radius;

        System.out.println("Area of circle="+Area);






    }
}
