package exm.ExamPractice;

public class EP3 {
	public static int calculateTotal(int[] marks) {
		int total = 0;
		for (int mark : marks) {
			total += mark;
		}
		return total;
	}

	public static double calculatePercentage(int total, int numberOfSubjects) {
		return (double) total / (numberOfSubjects * 100) * 100;
	}

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.print("Enter student name: ");
		String name = scanner.nextLine();

		int[] marks = new int[3];
		for (int i = 0; i < marks.length; i++) {
			System.out.print("Enter marks for subject " + (i + 1) + ": ");
			marks[i] = scanner.nextInt();
		}

		int total = calculateTotal(marks);
		double percentage = calculatePercentage(total, marks.length);

		System.out.println("\nStudent Name: " + name);
		System.out.println("Total Marks: " + total);
		System.out.printf("Percentage: %.2f%%%n", percentage);

		scanner.close();
	}
}
