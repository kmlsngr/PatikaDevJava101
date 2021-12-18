import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r,angle,perimeter,area;
        double pi = 3.14;
        System.out.print("Enter the radius of circle: ");
        r = scanner.nextDouble();
        System.out.print("Enter the center angel of circle for area: ");
        angle= scanner.nextDouble();
        perimeter = 2*pi*r;
        area=(pi*(Math.pow(r,2)*angle))/360;
        System.out.println("Perimeter of the circle: "+perimeter);
        System.out.println("Area of the circle: "+area);





    }
}
