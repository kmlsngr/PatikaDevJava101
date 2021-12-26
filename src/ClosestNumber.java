import java.util.Scanner;
import java.util.Arrays;

public class ClosestNumber {
    public static void main(String[] args) {

        int [] array = {7,7,7,7,7,7,7,56,87,-9,45,2,0,3,3,9,78,-5,12,1,23};
        Arrays.sort(array);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to find closest max and min value in array: ");
        int n = scanner.nextInt();
        System.out.println("Array: "+ Arrays.toString(array));
        System.out.println("Entered num: "+n);
        System.out.println("The closest min value for entered num: "+minMax(array,n)[0]);
        System.out.println("The closest max value for entered num: "+minMax(array,n)[1]);




    }
    static int[] minMax(int [] arr,int n){
        int min = arr[0];
        int max = arr[0];
        for(int i: arr){

                if(i<n){
                    min=i;
                }
                if(i>n){
                    max =i;
                    break;

                }
            }
        int [] a = {min,max};
        return a;
        }
    }

