import java.util.Scanner;
public class income_tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR INCOME IN NUMERICAL AMOUNTS:");
        double income = sc.nextDouble();
        boolean a = income>=250000&&income<= 500000;
        boolean b = income>= 500000&&income<=1000000;
        boolean c = income<=1000000;
        System.out.println("YOUR INCOME TAX WILL BE:");
        if(income<250000){
            System.out.println("no tax");

        }
        else if(income>250000&&income<500000){
            System.out.println("5%");
        }
        else if(income>500000&&income<1000000){
            System.out.println("20%");
        }
        else{
            System.out.println("30%");
        }

    }
}
