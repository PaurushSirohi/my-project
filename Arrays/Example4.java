package Arrays;
import java.util.Scanner;

public class Example4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] employeeID= {101,102,103,104,105};
        
        System.out.print("Enter array index(0 to4):");
        int index = sc.nextInt();

        if(index>=0 && index<5){
            System.out.println("Employee ID: " + employeeID[index]);
        }else{
            System.out.println("Invalid index");
        }
        sc.close();
    }
}