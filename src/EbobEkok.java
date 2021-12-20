import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x,y,temp;
        int ebob;
        int ekok;
        System.out.print("Enter the first value: ");
        x=scanner.nextInt();
        System.out.print("Enter the second value: ");
        y=scanner.nextInt();


        if(x<y){
            temp=x;
            x=y;
            y=temp;
        }
        int k = x;
        while(k>=1){
            if(x%k==0 && y%k==0){
                ebob=k;
                System.out.println("Ebob: "+ebob);
                break;
            }
            else {
                k--;
            }
        }
        int l = 1;
        while(l<=x*y){
            if(l%x==0 && l%y==0){
                ekok=l;
                System.out.println("Ekok: "+ekok);
                break;
            }
            else {
                l++;
            }
        }

    }
}
