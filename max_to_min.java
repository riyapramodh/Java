/* to take user inputs to filll an array, then find the min number in the array and convert the remaining elements into that number and while doing so, the count required to preform this operation to be printed */

import java.util.*;
import java.lang.*;
import java.io.*;


class maxMin
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0;i<t;i++){
		    int n = sc.nextInt();
		    int [] arr1 = new int[n];
		   
		    for(int a =0;a<arr1.length;a++){
		        int m = sc.nextInt();
		        arr1[a] = m;
		    }
		    Arrays.sort(arr1);
		    int c = arr1[0];
		    int count =0;
		    for(int b = 0;b<arr1.length;b++){
		        if(arr1[b] == c){
		            continue;
		        }
		        else{
		            arr1[b] = c;
		            count++;
		        }
		        
		    }
		    System.out.println(count);
		    
		    
		    
		    
		    
		}
	
	}
}
