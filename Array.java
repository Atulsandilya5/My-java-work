import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] marks=new int[4];
        marks[0]=91;
        marks[1]=98;
        marks[2]=88;
        marks[3]=79;
        for(int i=0;i<4;i++){
            System.out.println(marks[i]);
        }

        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int[] subject=new int[size];

        for(int u=0;u<size;u++){
            subject[u]=sc.nextInt();
        }
        for(int u=0;u<size;u++){
            System.out.println(subject[u]);
        }

    }
}