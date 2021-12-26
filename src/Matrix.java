import java.util.Random;
import java.util.Scanner;
public class Matrix {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [][] array = new int[3][4];
        for(int i = 0;i<array.length;i++){
            for(int j = 0;j<array[i].length;j++){
                System.out.print("Enter the value of array["+i+"]["+j+"]: ");
                array[i][j]=scanner.nextInt();
            }
        }
        for(int i = 0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }





        int row;
        int column;
        System.out.print("Enter the row number of matrix: ");
        row =scanner.nextInt();
        System.out.print("Enter the column number of matrix: ");
        column =scanner.nextInt();
        int [][] array2 = new int[row][column];
        for(int i = 0;i<array2.length;i++){
            for(int j = 0;j<array2[i].length;j++){
                Random rand = new Random();
                int x = rand.nextInt(100);
                array2[i][j]=x;

            }
        }
        for(int i = 0;i<array2.length;i++){
            for(int j=0;j<array2[i].length;j++){
                System.out.print(array2[i][j]+" ");
            }
            System.out.println("");
        }

        int[][] arr = new int[3][];
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];
        int sum = 0;
        for (int i = 0; i < 3; ++i){
            for (int j = 0; j < i + 1; ++j){
                arr[i][j] = j + 1;
            }

        }


        for (int i = 0; i < 3; ++i)
        for (int j = 0; j < i + 1; ++j)
        sum += arr[i][j];
        System.out.print(sum);

        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        for (int[] u : matris) {
            for (int elem : u) {
                System.out.print(elem);
            }
            System.out.println(" ");

        }

        int[] scores = new int[10];
        scores = new int[3];
        scores = new int[]{215, 234, 218, 189, 221, 290};

        for (int score : scores) {
            System.out.print(score + "  ");
        }
    }







}
