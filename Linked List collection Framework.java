import java.util.*;
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> l1= new LinkedList<>();

        LinkedList<Integer> l2=new LinkedList<>();

        LinkedList<String> list = new LinkedList<String>();

        list.add("is");
        list.add("a");

        System.out.println(list);

        list.addLast("list");
        System.out.println(list);

        list.addFirst("this");
        System.out.println(list);
        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i)+"->");
        }
        System.out.println("null");

        l2.add(88);
        l2.add(77);
        l2.add(59);

        l1.add(7);
        l1.add(4);
        l1.addLast(9);
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.addFirst(12);
        l1.add(0,16);
        l1.add(0,3);

        l1.addAll(l2);
        l1.addAll(0,l2);//Isko karne se aage mn add ho gya

        // l1.clear();//yh sab hata dega

        System.out.println(l1.contains(6));
        System.out.println(l1.contains(99));

        l1.set(1,85);
        l1.remove(1);

        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));

        }


    }
}