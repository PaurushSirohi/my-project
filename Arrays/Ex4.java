package Arrays;

public class Ex4{
    public static void main(String[] args){
       int[][] matrix= {
        {0,2,3,0},
        {2,0,0,4},
        {3,0,0,5},
        {0,4,5,0}
       };
         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
       }
    }
}
