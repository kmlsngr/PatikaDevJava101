import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        double km;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the long of the way you will go in KM: ");
        km = scanner.nextDouble();
        int opening = 10;
        double perKm = 2.20;
        int minVal = 20;
        double tutar = km*perKm;
        double netTutar = tutar+opening;
        boolean distance = (netTutar)>=20;
        double cost = distance? netTutar:minVal;
        System.out.println("You will pay: "+cost+"TL");


    }
}
