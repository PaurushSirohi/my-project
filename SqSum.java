import java.util.Scanner;

public class SqSum {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int sum = n*n + x*x;
        System.out.println(sum);
    }
}
