public class method_mult_table {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(mult_table(10));
    }
    static int mult_table(int num) {
        int z = 1;
        if (num == 0) {
            return 0;
        } else {
            for (int a = 1; a < 11; a++) {
                z =  num * a;
                System.out.println(z);
            }
            return z;
        }
    }
}
