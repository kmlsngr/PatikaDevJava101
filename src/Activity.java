import com.sun.tools.javac.Main;

import java.util.Scanner;
public class Activity {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double heat;
        System.out.print("Enter the heat: ");
        heat=input.nextDouble();
        if(heat<5){
            System.out.println("You can go skying");
        }
        if(heat>=5 && heat <15){
            System.out.println("You can go cinema");
        }
        if(heat>=10 &&heat<25){
            System.out.println("You can go picnic");
        }
        if(heat>=25){
            System.out.println("You can go swimming");
        }
    }
}
