import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},
                           {4,5,6}};

        int [][] transpose = new int[3][2];

        for(int i = 0; i<matrix.length;i++){
            for(int j =0;j<matrix[i].length;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        System.out.println("MATRIX:");
        for (int [] a:matrix) {
            System.out.println(Arrays.toString(a));
        }

        System.out.println("TRANSPOSE");
        for(int [] i: transpose){
            System.out.println(Arrays.toString(i));
        }
    }
}
