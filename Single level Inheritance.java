import java.util.Scanner;
class Shape{
    public void area(){
        System.out.println("Displays area");


    }
}
class Triangle extends Shape{
    public void area(int b,int h){
        System.out.println(0.5 * b * h);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        int b = sc.nextInt();

        System.out.print("Enter the height of the triangle: ");
        int h = sc.nextInt();

        Triangle t1 = new Triangle();

        System.out.print("Triangle area: ");
        t1.area(b, h);


    }
}