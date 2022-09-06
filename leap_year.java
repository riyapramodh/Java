import java.util.Scanner;

public class leap_year{
    public static void main(String[] arg){
        System.out.println("to see if the year entered by the user is a leap year or not");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean leap = year%4 ==0;
        boolean not_leap = year%4 !=0;
        if(leap){
            System.out.println("it is a leap year");
        }
        else{
            System.out.println("it is not a leap year");
        }



    }

}