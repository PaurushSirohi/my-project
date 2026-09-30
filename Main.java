import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input");
            scanner.close();
            return;
        }
        double first = scanner.nextDouble();

        System.out.print("Enter second number: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input");
            scanner.close();
            return;
        }
        double second = scanner.nextDouble();
        scanner.close();

        double sum = first + second;
        System.out.println("Sum: " + sum);
    }
}

