import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double a,b,c;
        System.out.print("Enter the lenght of a edge for triangle: ");
        a = input.nextDouble();
        System.out.print("Enter the lenght of b edge for triangle: ");
        b = input.nextDouble();

        c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("The lenght of the hipotenus is: "+c);
    }
}
