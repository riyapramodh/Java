//to check if the given number is greater than the number input bt the user or not by using comparators

import java.util.Scanner;
public class comparators {
    public static void main(String[] args) {
        System.out.print("LET THE GIVEN NUMBER BE:");
        int a = 49;
        System.out.println(a);

        System.out.println("PLEASE ENTER A NUMBER:");
        Scanner sc = new Scanner(System.in) ;
        float b = sc.nextFloat();


        System.out.println("IS THE GIVEN NUMBER GREATER THEN THE NUMBER INPUT BY THE USER?");
        System.out.println(a>b);

    }
}
