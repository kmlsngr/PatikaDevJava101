import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to find prime numbers till it: ");
        int n = scanner.nextInt();
        int count = 0;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }


            }
            if(count==2)
            {
                System.out.print(i+" ");

            }
            count=0;
        }

    }}
