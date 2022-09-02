import java.util.Scanner;
public class km_to_miles{
    public static void main(String[] arg){
        System.out.println("CONVERT KILOMETRES TO MILES");
        Scanner sc = new Scanner(System.in);
        System.out.println("PLEASE ENTER THE KLOMETRES TRAVELLED:");
        double a = sc.nextDouble();
        System.out.println(a);
        double miles = a*0.621;
        System.out.println(miles);


    }
}