public class add_matrices {
    public static void main(String[] args) {
        System.out.println("TO ADD TWO 2X3 MATRICES:");
        int sum = 0;
        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[2][3];
        arr1[0][0] = 10;
        arr1[0][1] = 11;
        arr1[0][2] = 12;
        arr1[1][0] = 13;
        arr1[1][1] = 14;
        arr1[1][2] = 15;

        arr2[0][0] = 20;
        arr2[0][1] = 21;
        arr2[0][2] = 22;
        arr2[1][0] = 23;
        arr2[1][1] = 24;
        arr2[1][2] = 25;


        for(int a = 0; a<arr1.length; a++){
            for(int b = 0; b<arr2[a].length; b++){
                sum = arr1[a][b] + arr2[a][b];
                System.out.print(sum);
                System.out.print(" ");
            }
            System.out.println("");
        }




    }
}
