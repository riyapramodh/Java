import java.util.Scanner;
public class odd_numb_for {
    public static void main(String[] args) {

        System.out.println("PRINTING FIRST N ODD NATURAL NUMBERS:");
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE TOTAL NUMBER :");
        int n = sc.nextInt();
        for(int i =0; i<n; i++){
            System.out.println(2*i+1);
        }


    }
}
