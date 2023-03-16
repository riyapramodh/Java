import java.util.*;
class switch_case{
    public void age(int age){
        switch(age){
            case 18:
                System.out.println("you are an adult");
                break;
            case 21:
                System.out.println("ÿou are eligible to drink");
                break;
            case 45:
                System.out.println("you need to stop drinking if you want to remian healthuy");
                break;

        }
    }
}

public class agePrint {
    public static void main(String[] args) {
        switch_case S = new switch_case();
        System.out.println("please enter your age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        S.age(age);
    }

}
