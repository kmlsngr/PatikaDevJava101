import java.util.Scanner;
public class MinMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min= Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.print("How many numbers you will enter: ");
        int n=scanner.nextInt();


        for(int i=1;i<=n;i++){
            System.out.print("Enter the "+i+". number:");
            int x = scanner.nextInt();

            if(x<min) min = x;
            if(max<x) max = x;

            }
        System.out.println("Minimum number: "+min+"\nMaximum number: "+max);
        }

}
