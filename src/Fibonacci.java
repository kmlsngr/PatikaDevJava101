import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for fibonacci: ");
        int n = scanner.nextInt();
        int f=1;
        int b=0;
        int temp ;
        for(int i=0;i<=n;i++){
            System.out.print(b+" ");
            temp = b;
            b=f;
            f=temp+f;

        }
    }
}
