import java.util.Scanner;

public class LoginAttemptChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int attempts = 0;
        while (attempts < 3) {

            System.out.println("Enter your username:");
            String username = sc.nextLine();

        System.out.println("Enter your password:");
        String password = sc.nextLine();

        String admin = "admin";

        if (username.equals(admin) && password.equals("1234")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed ");
            
             attempts++;
            if (attempts >= 3) {
                System.out.println("Too many failed attempts.Access denied.");
                break;
            } else {
                System.out.println("Please try again.");
            }
        }
    }
    
    }
}
 