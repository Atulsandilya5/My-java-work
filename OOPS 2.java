class Sonam{
    String relationship;
    String StatusOfRelation;

    public void Sis(){
        System.out.println("Best friend");
    }
}
public class Main {
    public static void main(String[] args) {
        Sonam mysonam=new Sonam();
        mysonam.relationship="Little Brother";
        mysonam.StatusOfRelation="Very Strong";

        System.out.println(mysonam.relationship + " and " + mysonam.StatusOfRelation);

        mysonam.Sis();


    }
}