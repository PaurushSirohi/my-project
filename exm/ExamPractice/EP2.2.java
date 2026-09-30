package exm.ExamPractice;
import java.util.Scanner;

class EP22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperature = sc.nextDouble();
        if (temperature > 40) {
            System.out.println("Warning:High Temperature");
        } else {
            System.out.println("Temperature Ok");
        }
        sc.close();
    }
}
