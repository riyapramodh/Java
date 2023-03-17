public class reviiiii{
    public static void main(String[] args) {
        int [] i = new int[20];
        i[0] = 0;
        i[1] = 1;
        for(int j = 2;j<i.length;j++){
            i[j] = i[j-1] + i[j-2];
        }
        for(int k =0;k<i.length;k++){
            System.out.print(i[k]+" ");
        }
    }
}
