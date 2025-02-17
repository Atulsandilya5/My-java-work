import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] marks=new int[3];
        marks[0]=90;
        marks[1]=80;
        marks[2]=40;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  value");
        int a= sc.nextInt();
        try{
            System.out.println("welcome here");
            try{
                System.out.println(marks[a]);

            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry this index does not exist");
                System.out.println("Exception in level 2");
            }
        }catch(Exception e){
            System.out.println("Exception in level 1");
        }

    }
}