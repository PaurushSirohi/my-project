import java.util.Scanner;

public class MeterReading {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter current meter reading: ");
		
		double reading = sc.nextDouble();
		
		reading++;
		System.out.println("Updated meter reading: " + reading);
		sc.close();
        System.out.println("Meter reading updates succesfully");
	}
}
