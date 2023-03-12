/* package codechef; // don't place package name! */
//seeing out of store 1 and 2 which one would be cheaper witha discount offered

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int store1 = 100;
		int store2 = 200;
		for(int i = 0;i<t;i++){
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int C = store1 - ((store1*A)/100);
		    int D = store2 -((store2*B)/100);
		    if(C<D){
		        System.out.println("FIRST");
		    }
		    else if(C==D){
		        System.out.println("BOTH");
		    }
		    else{
		        System.out.println("SECOND");
		    }
		    
		}
	}
}
