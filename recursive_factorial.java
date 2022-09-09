public class recursive_factorial {
    public static void main(String[] args) {
        int a = 5;
        factorial(5);
        System.out.println(factorial(a));
    }
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

