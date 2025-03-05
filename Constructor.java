class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    //Non-parametrized constructor or Default constructor
    Student(){
        System.out.println("Constructor called");

    }
}
public class Main {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Atul";
        s1.age=24;
        s1.printInfo();

    }
}