import java.util.Scanner;
public class ArtikYilHesaplayici {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.print("Enter a year: ");
        year=scanner.nextInt();
        if(year%4==0){
            if(year%100==0 &&year%400!=0){
                System.out.println(year+" artık bir yıl değildir!");
            }
            else {
                System.out.println(year+" artık bir yıldır!");
            }

        }
        else{
            System.out.println(year+" artık bir yıl değildir!");
        }
    }

}
