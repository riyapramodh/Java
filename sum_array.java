public class sum_array {
    static float sum(float [] arr){
        float sum = 0;

        for(int a =0; a< arr.length; a++){
            sum = sum +arr[a];
        }
        System.out.println(sum);
        float avg = sum/arr.length;
        System.out.println(avg);
    return avg;}
    public static void main(String[] args) {
        float [] x ={10.5f, 20.5f, 30f};
        System.out.println(sum(x));

    }
}
