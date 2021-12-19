import java.util.Scanner;
public class EvenAndFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int total=0;
        do{
            System.out.print("Enter the number: ");
            number=scanner.nextInt();
            if(number%4==0){
                total+=number;
            }

        }while (number%2==0);
        System.out.println("Total: "+total);
    }
}
