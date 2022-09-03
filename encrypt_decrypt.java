import java.util.Scanner;
public class encrypt_decrypt{
    public static void main(String[] args) {
        System.out.println("TO ENCRYPT A GRADE BY ADDING 8");
        Scanner sc = new Scanner(System.in);
        System.out.println("THE GRADE IS : ");
        char grade = 'F';
        System.out.println(grade);
        grade = (char)(grade + 8);
        System.out.println("THE ENCRYPTED GRADE IS:");
        System.out.println(grade);

        System.out.println("TO DECRYPT TO THE ACTUAL GRADE");
        System.out.println("THE ENCRYPTED GRADE IS :");
        System.out.println(grade);
        System.out.println("THE DECRYPTED GRADE IS :");
        grade = (char)(grade - 8);
        System.out.println(grade);
    }
}