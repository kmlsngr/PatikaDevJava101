import java.util.Scanner;
public class PowerOf4and5 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int fourP =1;
        int fiveP= 1;
        System.out.print("Enter the number: ");
        number = scanner.nextInt();

        for(int i = 0;i<=number;i++){
            fourP *=4;
            fiveP *=5;
            if(fourP<=number && fiveP<=number) {
                System.out.println(fourP);
                System.out.println(fiveP);
            }
            else if(fourP <=number && fiveP>number){
                    System.out.println(fourP);
                }
            else{
                break;
                }

            }

        }
    }
