import javax.swing.*;
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int total = 0;
        System.out.print("Enter a number: ");
        number=scanner.nextInt();



            for(int i =1;i<=number/2;i++){
                if(number%i==0){
                    total +=i;
                }

            }

            if (total==number){  System.out.println(number+" is a Perfect Number!");
        }else {
                System.out.println(number+" is not a Perfect Number!");
            }
}}
