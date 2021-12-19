import java.util.Scanner;
public class Combination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        int  n,r,c;

        while(!valid){

            System.out.print("Enter the number of element in set: ");
            n=scanner.nextInt();
            System.out.print("Enter the numbers of element in a group of set: ");
            r=scanner.nextInt();
            if(r>=0&&r<=n){
                c = factorial(n)/(factorial(r)*factorial(n-r));
                System.out.println("C("+n+","+r+") = "+c);
                valid=true;
            }
            else {
                System.out.println("Number of elements in group can not bigger than number of elements in set!");
            }
        }


    }
    private static int factorial(int f){
        int total = 1;
        for(int i=1;i<=f;i++){
            total *=i;
        }
        return total;
    }
}
