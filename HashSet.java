import java.util.HashSet;
import java.util.Iterator;
public class Main{
    public static void main(String[] args){
        HashSet<Integer> s=new HashSet<>();

        //Insert

        s.add(294);
        s.add(54);
        s.add(649);
        s.add(786);
        s.add(54);
        s.add(496);


        System.out.println(s);

        System.out.println(s.size());

        //Search
        if (s.contains(294)) {
            System.out.println("294 is there");
        }

        if(!s.contains(7)){
            System.out.println("7 is not there");
        }


        //Delete
        s.remove(54);
        if(!s.contains(54)){
            System.out.println("does not contain 54");
        }

        //HashSet does not allow the same element
        System.out.println(s.add(9));
        System.out.println(s.add(9));


        //Iterator

        Iterator it=s.iterator();

        while(it.hasNext()){  //checks whether another element is available.It returns true or false.

            System.out.println(it.next()); // returns the next element
        }

    }
}