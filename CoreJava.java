import java.util.Arrays;
public class CoreJava{
    public static void main(String[] args){
        System.out.println("k");
        int ae=30;
        System.out.println(ae);

        char yu='a';
        System.out.println(yu);

        String college="VIT BHOPAL";
        System.out.println(college);
        String MCA=college;

        System.out.println(MCA);
        float cc=8.9F;
        System.out.println(cc);
        long phone=9471289625L;//jab hume lamba value store karana hai tab yh use kyunki int small value hold karta hai
        System.out.println(phone);
 //String Length
        System.out.println(college.length());

//String concatenate
        String name1="Atul";
        String name2="Sandilya";
        String name3=name1 + name2;
        System.out.println(name3);
//String char
        System.out.println(name1.charAt(0));
        System.out.println(name2.charAt(4));
 //String replace
        String name4=name1.replace('A','H');
        System.out.println(name4);
 //String substring
        String Laptop="Hewlet Packard";
        System.out.println(Laptop.substring(0,9));
        //Array
        int[] marks=new int[3];
        marks[0]=98;
        marks[1]=91;
        marks[2]=93;

        System.out.println(marks[2]);
        Arrays.sort(marks);
        System.out.println(marks[2]);
        //Multidimensional Array
        int[][] finalmarks={{88,76,66},{96,91,93}};
        System.out.println(finalmarks[0][2]);

        //Add
        int iu=9;
        int qq=8;
        int ac=iu+qq;
        System.out.println(ac);

        //Math class
        System.out.println(Math.min(88,111));
        System.out.println(Math.max(77,55));

        //if-else
        int age=34;
        if(age>18)
            System.out.println("you can vote");
        else
            System.out.println("you cannot");
        //Else-if
        if(age>=4 && age<=18)
            System.out.println("you are in  school");
        else if(age>=18 && age<=26)
            System.out.println("you are in college");
        else
            System.out.println("you are in job ");
        //switch statement
        int no=3;
        switch (no){
            case 1:
                System.out.println("You are in bhopal");
                break;
            case 2:
                System.out.println("You are pune");
                break;
            case 3:
                System.out.println("You are in Mumbai");
                break;
            case 4:
                System.out.println("you are in Hyderabad");
                break;
            default:
                System.out.println("Invalid !");
                break;


        }

        //While loop
        int r=0;
        while(r<=20){

            System.out.println(r);
            r++;
        }

        //do while
        int u=20;
        do{
            System.out.println(u);
            u++;
        }while(u<=30);

        //for loop
        for(int q=30;q<=40;q++){
            System.out.println(q);
        }

        //try-Catch
        int[] yw={88,76,92};
        try{
            System.out.println(yw[5]);
        }catch(Exception exception ){

        }


        



    }
}