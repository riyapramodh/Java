class NegativeRadiusException extends Exception{
    public String toString(){
        return super.toString() + "a negative radius has been entered";
    }
}
public class throws_in_java {

    public static int area(int r) throws NegativeRadiusException{
        if (r<0){
            throw new NegativeRadiusException();
        }
        int ans = 2*r;
        return ans;
    }
    public static int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }

    public static void main(String[] args) {
        try{
            int c = divide(9,0);
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("the exception 1 has occurred!!");
        }
        try{
            int d = area(-1);
            System.out.println(d);
        }
        catch(Exception e){
            System.out.println("the exception 2 has occurred!!");
        }

    }
}
