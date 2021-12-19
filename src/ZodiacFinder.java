import javax.imageio.stream.ImageOutputStream;
import java.util.Scanner;
public class ZodiacFinder {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int day,month;
        System.out.print("Enter the day of your birth: ");
        day=scanner.nextInt();
        System.out.print("Enter the month of your birth: ");
        month=scanner.nextInt();
        if(month==1){
            if(day<=21){
                System.out.println("Your zodiac is Capricorn!");
            }
            else{
                System.out.println("Your zodiac is Aquarius!");
            }
        }
        if(month==2){
            if(day<=19){
                System.out.println("Your zodiac is Aquarius!");
            }
            else{
                System.out.println("Your zodiac is Pisces!");
            }

        }
        if(month==3){
            if(day<=20){
                System.out.println("Your zodiac is Pisces!");
            }
            else{
                System.out.println("Your zodiac is Aries!");
            }

        }
        if(month==4){
            if(day<=20){
                System.out.println("Your zodiac is Aries!");
            }
            else{
                System.out.println("Your zodiac is Taurus!");
            }

        }
        if(month==5){
            if(day<=21){
                System.out.println("Your zodiac is Taurus!");
            }
            else{
                System.out.println("Your zodiac is Gemini!");
            }

        }
        if(month==6){
            if(day<=22){
                System.out.println("Your zodiac is Gemini!");
            }
            else{
                System.out.println("Your zodiac is Cancer!");
            }

        }
        if(month==7){
            if(day<=22){
                System.out.println("Your zodiac is Cancer!");
            }
            else{
                System.out.println("Your zodiac is Leo!");
            }

        }
        if(month==8){
            if(day<=22){
                System.out.println("Your zodiac is Leo!");
            }
            else{
                System.out.println("Your zodiac is Virgo!");
            }

        }
        if(month==9){
            if(day<=22){
                System.out.println("Your zodiac is Virgo!");
            }
            else{
                System.out.println("Your zodiac is Libra!");
            }

        }
        if(month==10){
            if(day<=22){
                System.out.println("Your zodiac is Libra!");
            }
            else{
                System.out.println("Your zodiac is Scorpio!");
            }

        }
        if(month==11){
            if(day<=21){
                System.out.println("Your zodiac is Scorpio!");
            }
            else{
                System.out.println("Your zodiac is Sagittarius!");
            }

        }
        if(month==12){
            if(day<=21){
                System.out.println("Your zodiac is Sagittarius!");
            }
            else{
                System.out.println("Your zodiac is Capricorn!");
            }

        }


    }
}
