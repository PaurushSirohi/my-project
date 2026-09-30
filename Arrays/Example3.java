package Arrays;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[4];

        System.out.println("Enter marks for 4 students:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Student" + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        System.out.println("Stored marks.");
        for (int i = 0; i < 4; i++) {
            System.out.println("Student" + (i + 1) + ": " + marks[i]);
        }
        sc.close();
    }
}