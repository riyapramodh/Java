public class float_sum_array {
    public static void main(String[] args) {
        System.out.println("to print the sum of an array of float ");

        int[][] age = new int [2][3];
        age[0][0] = 100;
        age[0][1] = 110;
        age[0][2] = 120;
        age[1][0] = 200;
        age[1][1] = 210;
        age[1][2] = 220;
        for(int i = 0; i<age.length; i++){
            for(int j = 0; j<age[i].length;j++ ){
                System.out.print(age[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }





    }
}
