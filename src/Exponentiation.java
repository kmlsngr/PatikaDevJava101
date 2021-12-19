import java.util.Scanner;
public class Exponentiation {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int base,exponent;
        int result = 1;
        System.out.print("Enter the base: ");
        base= scanner.nextInt();
        System.out.print("Enter the exponent: ");
        exponent=scanner.nextInt();

        for(int i = 1;i<=exponent;i++){
            result *=base;
        }
        System.out.println(base+"^"+exponent+" = "+result);
    }
}
