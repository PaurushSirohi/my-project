import java.util.Scanner;

public class Withdraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--WELCOME TO BANK--");
        System.out.println("Enter account number");
        int a = sc.nextInt();
        System.out.println("How much balance is in bank: ");
        int b = sc.nextInt();
        System.out.println("How much money to withdraw: ");
        int c = sc.nextInt();
        if (b >= c) {
            System.out.println("Withdraw successful");
        } else {
            System.out.println("No enough balance in account.");
            System.out.println("Current balance is " + b );
            System.out.println("Thanks for using our services");
        }
    }
}
