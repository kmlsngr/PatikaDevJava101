import java.util.Scanner;
public class CalculateKDV {
    public static void main(String[] args) {
        double lessKDV = 0.18;
        double highKDV = 0.8;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of money: ");
        double money = input.nextDouble();
        boolean less1000 = money <1000 && money >0;
        double realKDV = less1000?lessKDV:highKDV;
        System.out.println("The KDV amount for "+money+"TL is "+realKDV);
    }
}
