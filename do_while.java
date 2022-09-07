import java.util.Scanner;
public class do_while {
    public static void main(String[] args) {

        System.out.println("ENTER THE VALUE OF n :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i<=n);
    }
}
