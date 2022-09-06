import java.util.Scanner;
public class pass_fail {
    public static void main(String[] args) {
        System.out.println("TO CHECK IF A STUDENT WILL PASS OR FAIL");
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER MARKS IN SUBJECT1:");
        float sub1 = sc.nextFloat();
        System.out.println("ENTER MARKS IN SUBJECT2:");
        float sub2 = sc.nextFloat();
        System.out.println("ENTER MARKS IN SUBJECT3:");
        float sub3 = sc.nextFloat();
        float total = ((sub1 + sub2 + sub3)*100f)/300f;
        System.out.println(total);
        boolean c1 = total>=40;
        boolean c2 = sub1>=33&&sub2>=33&&sub3>=33;
        if(c1&&c2){
            System.out.println("THE STUDENT HAS PASSED");
        }
        else{
            System.out.println("THE STUDENT HAS FAILED!");
        }


    }
}
