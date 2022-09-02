import java.util.Scanner;
public class greetings{
    public static void main(String[] arg){
        System.out.println("PLEASE ENTER YOUR NAME");
        Scanner sc = new Scanner(System.in);
        System.out.println(" NAME :");
        String a = sc.nextLine();
        System.out.print("MY NAME IS:");
        System.out.println(a);
    }
}