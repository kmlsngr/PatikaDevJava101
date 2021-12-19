import java.util.Scanner;
public class Average {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] lesson = {"Math","Physic","Chemistry","Music","Turkish"};
        double [] grade = new double[5];
        for(int i =0;i< lesson.length;i++){
            System.out.print("Enter the grade for "+lesson[i]+": ");
            double not = input.nextDouble();
            grade[i]=not;
        }
        double total=0;
        int count = 0;
        for (double v : grade)
            if (v >= 0 && v <= 100) {
                total += v;
                count += 1;

            }
        System.out.println("Average: "+(total/count));

    }
}
