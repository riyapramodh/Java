import java.util.Scanner;
public class sum_n_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF N:");
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("THE SUM OF ODD N NUMBERS ARE:");
        for(int i = 0; i<n; i++){
            sum = sum + 2*i;

        }
        System.out.println("SUM OF EVEN NUMBERS ARE:");
        System.out.println(sum);
    }
}
