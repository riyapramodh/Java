import java.util.Scanner;
public class sumRec {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("sum of n natural numbers:");
        System.out.println(sum(4));
    }
    static int sum(int n){
        if(n==1){
            return 1;
        }
        return n + sum(n-1);
    }
}
