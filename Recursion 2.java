//Print number from 1 to 5
import java.util.Scanner;
public class Main {

    public static void printNumber(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        printNumber(n+1);

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=1;
        printNumber(n);


    }
}
