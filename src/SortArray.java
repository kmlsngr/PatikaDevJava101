import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lenght of array: ");
        int num = scanner.nextInt();
        int [] arr = new int[num];
        for(int i = 0;i<num;i++){
            System.out.print("Enter the "+(i+1)+". value: ");
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorting: "+Arrays.toString(arr));
    }
}
