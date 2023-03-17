import java.util.*;
public class reviiiii {
    public static void main(String[] args) {
        //371 = 3**3+7**3+1**3
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many digits your number would be:");
        int t = sc.nextInt();
        int [] num1 = new int[3];
        System.out.println("enter the digits of the number:");
        for(int i = 0;i<t;i++){
            int num = sc.nextInt();
            num1[i] = num;
        }
        System.out.println("enter the number now:");
        int N = sc.nextInt();
        System.out.println();
        try{
            for(int i = 0;i<=1;i++){
                if((num1[i])*(num1[i])*(num1[i])+ (num1[i+1])*(num1[i+1])*(num1[i+1])+(num1[i+2])*(num1[i+2])*(num1[i+2])==N){
                    System.out.println("this is an armstrong sereis");
                    System.out.println((num1[i])*(num1[i])*(num1[i])+ (num1[i+1])*(num1[i+1])*(num1[i+1])+(num1[i+2])*(num1[i+2])*(num1[i+2]));
                    System.out.println(N);
                }
                else{
                    System.out.println("This is not an armstrong series");
                    System.out.println((num1[i])*(num1[i])*(num1[i])+ (num1[i+1])*(num1[i+1])*(num1[i+1])+(num1[i+2])*(num1[i+2])*(num1[i+2]));
                    System.out.println(N);
                }
            }
        }catch(Exception e){
            System.out.println("woala your done! ");
        }

    }
}
