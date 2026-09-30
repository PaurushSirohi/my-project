package Arrays;

public class Example2 {
    public static void main(String[] args) {
        int[] price = new int[6];

        price[0]=10;
        price[1]=100;
        price[2]=200;
        price[3]=300;
        price[4]=400;
        price[5]=500;

        for(int i=0; i<price.length; i++){
            System.out.println("Product" + (i+1) + ": " + price[i]);
        }
    }
}