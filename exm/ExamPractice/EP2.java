package exm.ExamPractice;
import java.util.Scanner;
public class EP2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        System.out.println("1 - Open Locker");
        System.out.println("2 - Lock Locker");
        System.out.println("3 - Check Locker Status");
        System.out.println("4 - Exit");
        System.out.print("Enter your choice: ");

       
        switch (choice) {
            case 1:
                System.out.println("Locker opened.");
                break;
            case 2:
                System.out.println("Locker locked.");
                break;
            case 3:
                System.out.println("Locker status checked.");
                break;
            case 4:
                System.out.println("Exiting.");
                break;
            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
