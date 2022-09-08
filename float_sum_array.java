public class float_sum_array {
    public static void main(String[] args) {
        System.out.println("to print the sum of an array of float ");
        float sum = 0;
        float[] arr = {10.5f, 20.5f, 30.67f, 40f,50f};
        for(int i = 0; i< arr.length; i++){
            sum = sum+arr[i];
        }
        System.out.println(sum);
    }
}
