import java.util.Scanner;

public class assign2 {
    public static String assignTier(char size, double weight) {
        if (size == 'S' && weight <= 1.0) return "small";
        if (size == 'M' && weight <= 5.0) return "Medium";
        return "Large";
    }

    static double computeFee(String tier) {
        switch (tier) {
            case "Medium":
                return 35.0;
            case "Large":
                return 50.0;
            default:
                return 20.0;
        }
    }

    static void printReceipt(String tier, double fee) {
        System.out.println("Tier : " + tier);
        System.out.printf("Fee:  %.2f%n", fee);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size (S/M/L): ");
        char size = sc.next().charAt(0);

        System.out.print("Enter weight: ");
        double weight = sc.nextDouble();

        String tier = assignTier(size, weight);
        printReceipt(tier, computeFee(tier));

        sc.close();
    }
}
