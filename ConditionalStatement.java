import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        //if-else statement
        int a= sc.nextInt();
        if(a>18){
            System.out.println("you can vote");
        }
        else{
            System.out.println("you cannot");
        }

        //else-if Example
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F (Fail)");
        }



    }
}
