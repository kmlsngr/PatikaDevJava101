import java.util.Scanner;
public class CostOfFlight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distance;
        byte age;
        byte typeOfdistance;
        double normalCost;
        double finalCost;
        double ageDiscount;
        double typeDiscount;
        System.out.print("Enter the distance as KM: ");
        distance=scanner.nextDouble();
        System.out.print("Enter your age: ");
        age=scanner.nextByte();
        System.out.print("Enter the type of distance(1 => One Way 2=>Round-trip): ");
        typeOfdistance=scanner.nextByte();
        if(distance>0 && age>0 && (typeOfdistance==1 || typeOfdistance==2)){
            normalCost = distance*0.10;
            switch (typeOfdistance){
                case 1:
                    if(age< 12){
                        ageDiscount = normalCost*0.5;
                        finalCost = normalCost-ageDiscount;
                    }
                    else if(age>=12 && age<=24){
                        ageDiscount=normalCost*0.1;
                        finalCost = normalCost-ageDiscount;
                    }
                    else if (age>65){
                        ageDiscount=normalCost*0.3;
                        finalCost = normalCost-ageDiscount;
                    }
                    else {
                        finalCost=normalCost;
                    }
                    System.out.println("Total cost: "+finalCost+"TL");
                    break;
                case 2:
                    if(age< 12){
                        ageDiscount = normalCost*0.5;
                        finalCost = normalCost-ageDiscount;
                        finalCost = (finalCost-finalCost*0.2)*2;
                    }
                    else if(age>=12 && age<=24){
                        ageDiscount=normalCost*0.1;
                        finalCost = normalCost-ageDiscount;
                        finalCost = (finalCost-finalCost*0.2)*2;
                    }
                    else if (age>65){
                        ageDiscount=normalCost*0.3;
                        finalCost = normalCost-ageDiscount;
                        finalCost = (finalCost-finalCost*0.2)*2;
                    }
                    else {
                        finalCost=normalCost;
                        finalCost = (finalCost-finalCost*0.2)*2;
                    }
                    System.out.println("Total cost: "+finalCost+"TL");
                    break;


            }
        }
        else {
            System.out.println("Entered wrong value!");
        }

    }
}
