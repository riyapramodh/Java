/*a person has to shift bw two programmimg languages based on if any of these two language have the feature that he is looking for, which is representsed as integers*/



import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class langShift
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0;i<t; i++){
		    //user input
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    //lang1 parameters
		    int a1 = sc.nextInt();
		    int b1 = sc.nextInt();
		    //lang2 parameters
		    int a2 = sc.nextInt();
		    int b2 = sc.nextInt();
		    if(a==a1|a==b1 && b==b1|b==a1){
		        System.out.println("1");
		    }
		    else if(a == a2|a == b2 && b ==b2|b == a2){
		        System.out.println("2");
		    }
		    else{
		        System.out.println("0");
		    }
		}
		
	}
}
