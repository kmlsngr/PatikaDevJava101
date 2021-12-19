import java.util.Scanner;
public class Sort {

    public static void main(String[] args) {
        int a,b,c,temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first value: ");
        a=input.nextInt();
        System.out.print("Enter the second value: ");
        b=input.nextInt();
        System.out.print("Enter the third value: ");
        c=input.nextInt();
        if(b<a){
            temp=a;
            a=b;
            b=temp;
        }
        if(c<a){
            temp=a;
            a=c;
            c=temp;
        }
        if(c<b){
            temp = b;
            b=c;
            c=temp;
        }
        System.out.println(a+"<"+b+"<"+c);

    }
}
