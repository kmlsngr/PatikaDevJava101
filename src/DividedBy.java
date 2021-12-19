import java.util.Scanner;
public class DividedBy {
    //program for finding the average of the numbers divided by 3 and 4 till the user entered number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int total=0;
        int count=0;
        double mean;
        System.out.print("Enter the number: ");
        number=scanner.nextInt();
        for(int i =1;i<=number;i++){
            if(i%12==0){
                total+=i;
                count+=1;
            }
        }
        mean=total/count;
        System.out.println("The mean of the numbers that divided by 3 and 4 in range of "+number+" is: "+mean);
    }
}
