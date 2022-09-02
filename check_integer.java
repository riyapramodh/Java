import java.util.Scanner;
public class check_integer{
    public static void main(String[] arg){
        System.out.println("PLEASE ENTER YOUR NUMBER :");
        Scanner sc = new Scanner(System.in);


        boolean b = sc.hasNextInt();
        System.out.print("THE ENTERED NUMBER IS AN INTEGER:");
        System.out.println(b);


    }
}