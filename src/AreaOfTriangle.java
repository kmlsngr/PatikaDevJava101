import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c;
        System.out.print("Enter the lenght of a edge for triangle: ");
        a = input.nextDouble();
        System.out.print("Enter the lenght of b edge for triangle: ");
        b = input.nextDouble();
        System.out.print("Enter the lenght of c edge for triangle: ");
        c = input.nextDouble();
        double u = (a+b+c)/2;
        double area = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("The area of the triangle is: "+area);
    }

}
