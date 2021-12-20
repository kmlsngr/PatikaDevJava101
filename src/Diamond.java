import java.util.Scanner;
public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        for (int i = 1;i<=n;i++){
            for (int j = 1;j<=(n-i);j++){
                System.out.print(" ");
            }

            for(int k =1; k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println("");

        }
        for(int x = (n-1);x>=1;x--){
            for (int t=(n-x);t>=1;t--){
                System.out.print(" ");
            }
            for(int k = (2*x-1);k>=1;k--){
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}
