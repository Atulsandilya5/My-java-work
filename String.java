
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name=");
        String name=sc.nextLine();
        System.out.println(name);
        //conactenation
        String name1="Atul";
        String name2="Sandilya";
        String name3=name1+name2;
        System.out.println(name3);

        String city="Singapore";
        System.out.println(city.length());

        for(int i=0;i<city.length();i++){
            System.out.println(city.charAt(i));
        }

        String mountain="Mount Everest";
        System.out.println(mountain.substring(1,5));

        String alpha1="Japan";
        String alpha2="Tokyo";
        if(alpha1.compareTo(alpha2)==0){
            System.out.println("String equal");
        }
        else{
            System.out.println("string are not equal");
        }

    }
}