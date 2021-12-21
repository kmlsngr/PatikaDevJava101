import java.util.Scanner;
public class InvertedTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digit Number: ");
        int n = scanner.nextInt();
        int count =n;
        for(int i = 1;i<=n;i++){
            for(int j =1 ; j<=i;j++){
                System.out.print(" ");
            }
            for(int k=(2*count-1); k>=1;k--){
                System.out.print("*");

            }
            count--;

            System.out.println("");
        }
    }
}
