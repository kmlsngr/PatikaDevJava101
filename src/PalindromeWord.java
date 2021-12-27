import java.util.Scanner;

public class PalindromeWord {


    static boolean isPalindrome(String s){

            int half = s.length()/2;
            int reverse = s.length()-1;
            for(int i = 0;i<half;i++){
                if(s.charAt(i)==s.charAt(reverse)){
                    reverse--;

                }
                else {

                    return false;
                }
            }

        return true;


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sentence to see it whether Palindrome: ");
        String s = scanner.next();
        if(isPalindrome(s)){
            System.out.println(s+" is Palindrome!");
        }
        else {
            System.out.println(s+" is not Palindrome");
        }

    }
}
