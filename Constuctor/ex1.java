package Constuctor;

public class ex1{
    public static void main(String[] args){
        Student s1 = new Student();
            s1.name = "Ravi";
            s1.display();
    }
}

class Student {
    String name;

    void display() {
        System.out.println(name);
    }
}