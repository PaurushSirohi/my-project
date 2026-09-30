package Arrays;

public class SumRecursion {
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args){
        int number = 5;
        System.out.println("Number:"+number);
        System.out.println("Sum:"+sum(number));

    }
}

    

    

