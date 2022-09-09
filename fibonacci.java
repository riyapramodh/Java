
public class fibonacci {
    public static void main(String[] args) {
        int x = 20;
        System.out.println(fibonacci(20));
    }
    static int fibonacci(int a){
        if(a==0){
            return 0;
        }
        else if(a==1){
            return 1;
        }
        else{
            return (a-1)+(a-2);
        }
    }
}
