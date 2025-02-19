class Student{
    String name;
    int age;

   public void printInfo(String name){
       System.out.println(name);
   }
   public void printInfo(int age){
       System.out.println(age);
   }
   public void printInfo(String name,int age){
       System.out.println(name+" " +age);
   }
   //so upar jo hai printInfo jo have method overloading ka example hai

    //Method overloading important things
    //1)returntype alag hona chaiye jaise String name agr dono mn lena hai toh ek jagah void toh dusri
    //jagah int ho.2)Agr return type same hai jaise dono jagah void lena hai toh parameter different
    //lena hai agr ek jagah string hai toh banki jagah int,float etc.3)Agr yh bhi same hai toh
    //number of argument alag hona chaiye jaise upar 1st and 3rd mn hai 1st mn
    // public void printInfo(String name) yh hai toh 3rd mn public void printInfo(String name,int age)
    //int age hai mtlb ek extra taaki differentiate ho sake .Agr yh sab nhi hua toh error aayega


}
public class Main {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.name="Atul";
        s1.age=22;

        s1.printInfo(s1.name,s1.age);




    }
}