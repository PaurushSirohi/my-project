package Arrays;

public class AreaOverloading {
    static int area(int side) {
        return side*side;
    
    }
    static int area(int length, int breadth){
        return length*breadth;
    }
    static double area(double radius){
        return 3.14*radius*radius;
    }
    public static void main(String[] args) {
        System.out.println("Area of square:" + area(5));
        System.out.println("Area of rectangle:" + area(6, 4));
        System.out.println("Area of circle:" + area(3.0));
    }
}