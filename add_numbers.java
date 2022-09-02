//to sum three numbers
import java.util.Scanner;
public class add_numbers{
    public static void main(String[] arg){
        System.out.println("ADDING THREE NUMBERS");
        Scanner sc = new Scanner(System.in);
        System.out.println("THE FIRST NUMBER IS :");
        float a = sc.nextFloat();
        System.out.println(a);
        System.out.println("THE SECOND NUMBER IS:");
        float b = sc.nextFloat();
        System.out.println(b);
        System.out.println("THE THIRD NUMBER IS :");
        float c = sc.nextFloat();
        System.out.println(c);
         float sum = a + b + c;
        System.out.println(sum);


    }
}