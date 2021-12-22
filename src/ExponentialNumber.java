import java.util.Scanner;
public class ExponentialNumber {

    static int exponentialNum(int base,int exp){

        if(base==0 && exp==0){
            System.out.println("Tanımsız işlem!");
            return 0;
        }
        if(exp==0){
            return 1;
        }

        return base*exponentialNum(base,exp-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();
        System.out.println("Result: "+exponentialNum(base,exponent));


    }
}
