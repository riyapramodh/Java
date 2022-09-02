import java.util.Scanner;
public class cgpa{
    public static void main(String[] arg){
        System.out.println("THE MARKS SECURED BY STUDENTS ARE:" );
        Scanner sc = new Scanner(System.in);
        System.out.println("MARKS IN SUBJECT1:");
        float a = sc.nextFloat();
        System.out.println(a);
        System.out.println("MARKS IN SUBJECT2 :");
        float b =sc.nextFloat();
        System.out.println(b);
        System.out.println("MARKS IN SUBJECT3:");
        float c = sc.nextFloat();
        System.out.println(c);
        float cgpa = (a + b + c)/30;
        System.out.print("THE CGPA OF THE STUDENT IS:");
        System.out.println(cgpa);

    }
}