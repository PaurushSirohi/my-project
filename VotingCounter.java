import java.util.Scanner;

public class VotingCounter{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter voter token number: ");
        int token = sc.nextInt();

        if (token % 2 == 0) {
            System.out.println("Counter A");
        } else {
            System.out.println("Counter B");
        }

        sc.close();
        System.out.print("Thank you for voting");
    }
}
