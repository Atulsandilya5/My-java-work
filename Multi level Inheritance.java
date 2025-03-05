class Shape{
    public void area(){
        System.out.println("Displays area");


    }
}
class Triangle extends Shape{
    public void area(int b,int h){
        System.out.println(1/2*b*h);
    }
}
class Equilateral extends Triangle{
    public void area(int b,int h){
        System.out.println(1/2*h*b);
    }
}
public class Main {
    public static void main(String[] args) {

    }
}