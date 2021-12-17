import java.util.Scanner;
public class NotOrtalamasi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the physic note: ");
        double psyNote = input.nextDouble();
        System.out.print("\nEnter the chemistry note: ");
        double chmNote = input.nextDouble();
        System.out.print("\nEnter the math note: ");
        double mathNote = input.nextDouble();
        System.out.print("\nEnter the Turkish note: ");
        double turNote = input.nextDouble();
        System.out.print("\nEnter the music note: ");
        double musNote = input.nextDouble();
        System.out.print("\nEnter the history note: ");
        double hisNote = input.nextDouble();

        double mean = (psyNote+chmNote+mathNote+turNote+musNote+hisNote)/6;
        System.out.println("Your mean is: "+mean);
        boolean result = mean >60;
        System.out.println(result?"Passed the Class":"Failed the Class");
    }
}
