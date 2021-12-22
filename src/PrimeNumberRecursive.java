import java.util.Scanner;
public class PrimeNumberRecursive {

    static boolean isPrime(int num,int last){
        if(num<2){
            return false;
        }
        if(num== last){
            return true;
        }
        if(num % last ==0){
            return false;
        }
        return isPrime(num, last +1);


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=scanner.nextInt();
        if(isPrime(num, 2)){
            System.out.println(num+" is prime number!");

        }
        else {
            System.out.println(num+" is not a prime number!");
        }

    }
}
