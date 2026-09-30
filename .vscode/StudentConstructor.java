public class StudentConstructor {
    String name;
    int marks1, marks2, marks3;

   
    StudentConstructor(String name, int marks1, int marks2, int marks3) {
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

   
    int calculateTotal() {
        return marks1 + marks2 + marks3;
    }

  
    double calculatePercentage() {
        return calculateTotal() / 3.0;
    }

    
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks in Subject 1: " + marks1);
        System.out.println("Marks in Subject 2: " + marks2);
        System.out.println("Marks in Subject 3: " + marks3);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Percentage: " + calculatePercentage() + "%");
    }

    public static void main(String[] args) {
        StudentConstructor s1 = new StudentConstructor("Rahul", 85, 90, 80);
        s1.displayDetails();
    }
}
 
    

