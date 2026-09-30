import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student's name: ");
        String name = sc.nextLine();
        System.out.println("Enter Student's Marks");
        int marks = sc.nextInt();

        if(marks >= 75){
            System.out.println(name + " is eligible for scholarship");
        } else {
            System.out.println(name + " is not eligible for scholarship");
        }
    }
}
