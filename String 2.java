import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String name=sc.nextLine();
        System.out.println(" your name is " +name);
        //String concatenation
        String name1="ATUL";
        String name2="SANDILYA";
        String name3=name1+" "+name2;
        System.out.println(name3);

        //String length
        String city="BANGALORE Karnataka";
        System.out.println(city.length());
        //String charAt
        for(int i=0;i<city.length();i++){
            System.out.println(city.charAt(i));
        }
        //String compare
        String alpha1="Vishnu";
        String alpha2="Brahma";
        if(alpha1.compareTo(alpha2)==0){
            System.out.println("string are equal");
        }
        else{
            System.out.println("string are not equal");
        }
        //string substring
        String mountain="Mount Everest";
        System.out.println(mountain.substring(0,3));



    }
}