import java.util.Scanner;
public class replace_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NAME:");
        String name1 = sc.nextLine();
        String letter = "Dear"+name1+",Thank you";
        System.out.println(letter);
        System.out.println("ENTER THE NEW NAME:");
        String name2 = sc.nextLine();
        System.out.println(letter.replace(name1,name2));




    }
}
