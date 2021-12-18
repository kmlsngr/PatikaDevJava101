import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double sayi1,sayi2;
        System.out.print("İlk sayiyi girininiz: ");
        sayi1 = scanner.nextDouble();
        System.out.print("İkinci sayiyi giriniz: ");
        sayi2=scanner.nextDouble();
        System.out.println("İşlem seçiniz:\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-bölme");
        System.out.print("Seçim: ");
        int secim = scanner.nextInt();
        switch (secim) {
            case 1 -> System.out.println(sayi1 + " + " + sayi2 + " = " + (sayi1 + sayi2));
            case 2 -> System.out.println(sayi1 + " - " + sayi2 + " = " + (sayi1 - sayi2));
            case 3 -> System.out.println(sayi1 + " x " + sayi2 + " = " + (sayi1 * sayi2));
            case 4 -> System.out.println(sayi1 + " / " + sayi2 + " = " + (sayi1 / sayi2));
            default -> System.out.println("Yanlış seçim girdiniz!");
        }
    }
}
