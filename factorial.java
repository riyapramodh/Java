import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        System.out.println("ENTER THE NUMBER:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int mult = 1;
        for(int i =num; i!=0; i--){
            mult = mult*i;
        }
        System.out.println("THE FACTORIAL IS:");
        System.out.println(mult);

    }
}
