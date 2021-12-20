import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        int n = number;
        int total = 0;

        boolean valid =true;
        while(valid){
            int temp = number%10;
            total +=temp;
            number=number/10;
            if(number<1){
                valid=false;
            }

        }
        System.out.println("Sum of the digits of the number "+n+" : "+total);


    }
}
