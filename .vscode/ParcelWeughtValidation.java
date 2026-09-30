import java.util.Scanner;

public class ParcelWeughtValidation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter Parcel Weight");
            double weight = Double.parseDouble(sc.nextLine());
            System.out.println("Weight accepted:" + weight + "kg");
        } catch (NumberFormatException e) {
            System.out.println("Invalid parcel weight"+ "Enter a valid number");
        }
        finally {
            System.out.println("Weight checking completed");
        }
}
}
