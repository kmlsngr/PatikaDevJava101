import java.util.Scanner;
public class PatternRecursive {

    static void pattern(int base,int temp,boolean decrease){

        System.out.print(" " + temp);
        if(temp <= 0) {
            decrease = false;
        }
        int next = decrease ? temp - 5 : temp + 5;
        if(next <= base) {
            pattern(base, next, decrease);
        }




    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base: ");
        int num = scanner.nextInt();

        System.out.print("Output is: ");
        pattern(num,num,true);

    }
}
