package EXAM;
import java.util.Scanner;
public class CountDigits {
    static int countDigits(int n){
        if(n==0){
            return 0;
        }
        return 1 + countDigits(n/10);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Count of digits=" + countDigits(n));
    }
    
}
