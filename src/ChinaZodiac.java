import java.util.Scanner;
public class ChinaZodiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        int modBirth;
        System.out.print("Enter your birth year: ");
        year = scanner.nextInt();
        modBirth=year%12;
        if(year>=0){
            switch (modBirth) {
                case 0 -> System.out.println("Çin Zodyağı Burcunuz: Maymun");
                case 1 -> System.out.println("Çin Zodyağı Burcunuz: Horoz");
                case 2 -> System.out.println("Çin Zodyağı Burcunuz: Köpek");
                case 3 -> System.out.println("Çin Zodyağı Burcunuz: Domuz");
                case 4 -> System.out.println("Çin Zodyağı Burcunuz: Fare");
                case 5 -> System.out.println("Çin Zodyağı Burcunuz: Öküz");
                case 6 -> System.out.println("Çin Zodyağı Burcunuz: Kaplan");
                case 7 -> System.out.println("Çin Zodyağı Burcunuz: Tavşan");
                case 8 -> System.out.println("Çin Zodyağı Burcunuz: Ejderha");
                case 9 -> System.out.println("Çin Zodyağı Burcunuz: Yılan");
                case 10 -> System.out.println("Çin Zodyağı Burcunuz: At");
                case 11 -> System.out.println("Çin Zodyağı Burcunuz: Koyun");
                default -> System.out.println("Doğum yılı uygun değil!");
            }
        }
    }
}
