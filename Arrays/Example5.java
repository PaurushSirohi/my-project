package Arrays;
public class Example5{
    public static void main(String[] args){
        String[] names=new String[5];
        names[0]="A";
        names[1]="B";
        names[2]="C";
        names[3]="D";
        names[4]="E";
        
        System.out.println("Student names:");

    for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
    } 
}