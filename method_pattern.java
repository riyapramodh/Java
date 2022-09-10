public class method_pattern {
    public static void main(String[] args) {
        int i = 5;
        pattern(i);
    }
    static void pattern( int i){
        for( i = 1; i<5; i++){
            for(int j = 0; j <i; j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
