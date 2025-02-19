import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Atul");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(3));

        //set char at index 0
        sb.setCharAt(0,'B');
        System.out.println(sb);

        //adding element in
        sb.insert(0,'S');
        System.out.println(sb);

        sb.insert(2,'y');
        System.out.println(sb);

        //Delete element
        sb.delete(2,3);
        System.out.println(sb);

        //Append
        StringBuilder see=new StringBuilder("H");
        see.append("e");
        see.append("l");
        see.append("l");
        see.append("o");
        System.out.println(see);

        //length
        System.out.println(see.length());

        //Reversing string
        StringBuilder w=new StringBuilder("Ocean");
        for(int i=0;i<w.length()/2;i++){
            int front=i;
            int back=w.length()-1-i;

            char frontChar=w.charAt(front);
            char backChar=w.charAt(back);

            w.setCharAt(front,backChar);
            w.setCharAt(back,frontChar);
        }
        System.out.println(w);



    }
}