import java.util.Scanner;
public class basic_multiplication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER:");
        float a = sc.nextFloat();
        System.out.println("ENTER THE AMOUNT OF TIMES U WANT TO PRINT a:");
        float b;
        for(b = 0; b<10;b++) {
            System.out.println(b * a);


        }
    }
}
