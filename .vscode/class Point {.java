class Point {
    int x, y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){
        return "Point(" + x + ", " + y +" )";
    }
}
class PointDemo{
    public static void main(String[] args){
        Point p = new Point(3, 4 );
        System.out.println(p);
        System.out.println(p.toString());
    }
}