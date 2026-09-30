package exm.ExamPractice;

import java.util.Scanner;

public class EP23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        System.out.println("1-Locker Availaible");
        System.out.println("2-Locker Occupied");
        System.out.println("3- Locker under maintainence");

        if (choice == 1) {
            System.out.println("Locker Availaible");
        } else if (choice == 2) {
            System.out.println("Locker Occupied");
        } else if (choice == 3) {
            System.out.println("Locker under maintainence");
        }

        sc.close();
    }
}
