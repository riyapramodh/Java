#ATM machine where the person is allowed to withdarw an amount when there is the specified amount or more in the account. and as soon as the user wthdraws the amount that much of the amount gets credited from the bank account of the user.
#1 if the ith person gets the amount else a 0
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ATM
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int a = 0;a<t;a++){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    String s = "";
		    int [] arr = new int[n];
		    for(int i = 0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		    for(int j = 0;j<n;j++){
		        if(arr[j]<=k){
		            k = k - arr[j];
		            s = s + '1';
		        }
		        else{
		            s = s +'0';
		        }
		    }
		    System.out.println(s);
		    
		}
	}
}
