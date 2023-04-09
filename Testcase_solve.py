//Chef is trying to solve a problem having T test cases, where, for each test case he is given a single integer Chef has an algorithm which takes exactly  iterations for a test case with value N.
//Given the values maxT,maxN, and sumN, determine the maximum number of iterations Chef's algorithm can take for any valid input file satisfying all the constraints.

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Testcase
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int maxT = sc.nextInt();
		    int maxN = sc.nextInt();
		    int sumN = sc.nextInt();
		    int r = 0;
		    int q = 0;
		    if(sumN/maxN >= maxT){
		        System.out.println(maxT*maxN*maxN);
		    } else if(sumN/maxN < maxT){
		        q = sumN/maxN;
		        r = sumN%maxN;
		        System.out.println(q*maxN*maxN + r*r);
		    }
		}
	}
}
