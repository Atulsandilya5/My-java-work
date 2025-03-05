import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        //Add elements
        list.add(2);
        list.add(4);
        list.add(8);
        list.add(6);
        list.add(7);
        System.out.println(list);

        //To get an element
        int element=list.get(2);
        System.out.println(element);

        //Add element in between
        list.add(1,25);
        System.out.println(list);

        //Set an element
        list.set(3,0);
        System.out.println(list);

        //delete an element
        list.remove(3);
        System.out.println(list);

        //size of list
        int size=list.size();
        System.out.println(size);

        //loops on list
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i)+" ");
        }
        System.out.println();

        //Sorting the list

        list.add(0);
        Collections.sort(list);
        System.out.println(list);





    }
}
