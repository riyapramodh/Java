import java.util.Scanner;
public class exceptions {
    public static void main(String args[]){
        int[] marks = new int[5];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] =30;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the index of the array value required:");
        int a = sc.nextInt();
        System.out.println("enter the number by which to divide the array value by:");
        int b = sc.nextInt();
        try{
            System.out.println("the array number value is:" +marks[a]);
            System.out.println("the array number value when marks[a]/b is:" +marks[a]/b);
        }
        catch(ArithmeticException e){
            System.out.println("an arithmetic exception has occurred!");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("an array index out of bound exception has occurred!");
            System.out.println(e);
        }
    }
}
