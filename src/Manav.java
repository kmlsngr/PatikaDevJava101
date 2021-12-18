import java.lang.invoke.VarHandle;
import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {
        double armut,elma,domates,muz,patlican;
        double arKg, elKg,doKg,muKg,paKg;
        double cost;
        armut=2.14;
        elma=3.67;
        domates=1.11;
        muz=0.95;
        patlican=5;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Armut Kaç Kilo? :");
        arKg = scanner.nextDouble();
        System.out.print("Elma Kaç Kilo? :");
        elKg = scanner.nextDouble();
        System.out.print("Domates Kaç Kilo? :");
        doKg = scanner.nextDouble();
        System.out.print("Muz Kaç Kilo? :");
        muKg = scanner.nextDouble();
        System.out.print("Patlıcan Kaç Kilo? :");
        paKg = scanner.nextDouble();
        cost =arKg*armut+elKg*elma+muKg*muz+doKg+domates+paKg*patlican;
        System.out.println("Toplam Tutar : "+cost+"TL");


    }

}
