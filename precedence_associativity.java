import java.util.Scanner;
public class precedence_associativity {
    public static void main(String[] args) {
        System.out.println("SOLVING AN EQUATION");
        Scanner sc = new Scanner(System.in);
        System.out.print("v:");
        float v = sc.nextFloat();
        System.out.print("u:");
        float u = sc.nextFloat();
        System.out.print("a:");
        float a = sc.nextFloat();
        System.out.print("s:");
        float s = sc.nextFloat();
        float equation = v*v-u*u/2*a*s;
        System.out.println(equation);




    }
}
