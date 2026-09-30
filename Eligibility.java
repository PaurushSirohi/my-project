import java.util.Scanner;

public class Eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter attendance percentage: ");
        double attendance = sc.nextDouble();

        String result = (attendance >= 75) ? "Eligible for Exam" : "Not Eligible for Exam";
        System.out.println(name + ": " + result);
    }
} 
