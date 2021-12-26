import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HarmonicSeriesArray {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the lenght of array: ");
        int lengt = scan.nextInt();
        int [] array = new int[lengt];
        for(int i = 0;i<array.length;i++){
            array[i] = random.nextInt(1,100);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Harmonic average of the array is: "+harmonicAverage(array));


    }


    static double harmonicAverage(int[] n) {
        double sum = 0;

        for(double i : n){
            sum +=1/i;
        }
        return n.length/sum;
    }
}