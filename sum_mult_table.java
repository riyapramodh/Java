import java.util.Scanner;
public class sum_mult_table {
    public static void main(String[] args) {
        System.out.println("to print tme multiplication table of a number");
        System.out.println("ENTER THE NUMBER:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for(int i =1; i<11; i++){
            sum = sum + num*i;
        }
        System.out.println("THE SUM OF THE MULTIPLICATION TABLE IS:");
        System.out.println(sum);

    }
}
