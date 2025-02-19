//here in this we have taken two string color and brand

class Pen{
    String color;
    String Brand;

    public void displayInfo(String color){
        System.out.println(color);
    }


    public void displayInfoBrand(String Brand){

        System.out.println(Brand);

    }

    public void displayInfo(String color,String Brand){
        System.out.println(color+" "+Brand);
    }
}
public class Main{

    public static void main(String[] args){

        Pen p1 =new Pen();
        p1.color="Red";
        p1.Brand="Rorito";

        p1.displayInfo(p1.color,p1.Brand);





    }
}
