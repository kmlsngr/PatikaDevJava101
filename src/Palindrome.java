import java.util.Scanner;
public class Palindrome {

    static boolean isPalindrome(int num){

        int temp = num;
        int reverseNumber=0;
        int lastNumber;
        while(temp !=0){
            lastNumber =temp%10;
            reverseNumber = (reverseNumber*10)+lastNumber;
            temp /=10;
        }
        if(reverseNumber==num){
            return true;
        }
        else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        if(isPalindrome(num)){
            System.out.println(num+" is palindrome!");
        }
        else {
            System.out.println(num+" is not palindrome!");
        }




    }
}
