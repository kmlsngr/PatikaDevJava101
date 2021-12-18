import java.util.Scanner;
public class calculateBMI {
    public static void main(String[] args) {
        double tall,mass,BMI;
        System.out.print("Enter the your tall(mether): ");
        Scanner scanner = new Scanner(System.in);
        tall=scanner.nextDouble();
        System.out.print("Enter the your weight(kg): ");
        mass= scanner.nextDouble();
        BMI = mass /(tall*tall);
        System.out.println("Your BMI is: "+BMI);
    }

}
