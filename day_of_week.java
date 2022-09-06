import java.util.Scanner;

public class day_of_week{
    public static void main(String[] arg){
        System.out.println("TO FIND THE DAY IN A WEEK");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num == 1){
            System.out.println("MONDAY");
        }
        else if(num == 2){
            System.out.println("TUESDAY");
        }
        else if(num == 3){
            System.out.println("WEDNESDAY");
        }
        else if(num == 4){
            System.out.println("THURSDAY");
        }
        else if(num == 5){
            System.out.println("FRIDAY");
        }
        else if(num == 6){
            System.out.println("SATURDAY");
        }
        else if(num == 7){
            System.out.println("SUNDAY");
        }
        else{
            System.out.println("INVALID ENTRY");
        }



    }

}