import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        System.out.println("Current balance: ₹" + balance);
        System.out.println("Enter amount to deposit: ");
        int deposit = sc.nextInt();
        
        balance += deposit;
        
        System.out.println("New balance: ₹" + balance);
    }
}
