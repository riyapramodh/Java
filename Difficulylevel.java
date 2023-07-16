import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class proc
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the umber of test cases:");
        int t = sc.nextInt();
        System.out.println("enter the difficulty levels:");
        for(int i = 0;i<t;i++){
            int n = sc.nextInt();
            int[]score = new int[n];
            for(int j = 0;j<n;j++){
                int s  = sc.nextInt();
                score[j] = s;
            }
            int count = 0;
            for(int k = 0;k<n;k++){
                if (score[k]>=1000){
                    count++;
                }

            }
            System.out.println("the number of questions that he had to remove such that difficulty level remains<1000 is:"+count);


        }
    }
}
