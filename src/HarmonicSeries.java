import java.util.Scanner;
public class HarmonicSeries {

    public static void main(String[] args) {
        System.out.print("Enter the number to find it's harmonic series: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double total = 0;
        for(double i =n;i>=1;i--){
            total += i/n;

        }
        System.out.println("Result: "+total);

    }


}
