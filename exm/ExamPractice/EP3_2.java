package exm.ExamPractice;

public class EP3_2 {
    public static int calculateTotal(int marks1, int marks2, int marks3) {
        return marks1 + marks2 + marks3;
    }
    public static void main(String[] args){
        int total= calculateTotal(85,90,95);
        System.out.println("Total Marks:"+ total);

    }
}
