//Print number from 5 to 1
import java.util.Scanner;
public class Main {

    public static void printNumber(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumber(n-1);

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=5;
        printNumber(n);




    }
}
