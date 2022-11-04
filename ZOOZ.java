/* TASK
Problem
Kulyash believes in equality.
Given an integer NN, output a binary string of length NN such that:

The count of 0101 subsequences in the string is equal to the count of 1010 subsequences;
The string has at least one occurrence of 00 as well as 11.
If multiple such strings exist, print any. Also, it is guaranteed that corresponding to the given input, an answer always exists.

Input Format
First line will contain TT, number of test cases. Then the test cases follow.
Each test case contains of a single line of input, an integer NN - the length of the binary string.
Output Format
For each test case, output any binary string of length NN satisfying the given conditions.

Constraints
1 \leq T \leq 1001≤T≤100
3 \leq N \leq 10003≤N≤1000
Subtasks
Sample 1:
Input
Output
2
4
3
1001
010
Explanation:
Test case 1: A binary string satisfying both the conditions is 1001. The count of 01 as well as 10 subsequences in the string is 2.

Test case 2: A binary string satisfying both the conditions is 010. The count of 01 as well as 10 subsequences in the string is 1.  */
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc= new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0){
	        int n=sc.nextInt();
	        System.out.print("1");
	        for(int i=0;i<n-2;i++){
	            System.out.print("0");
	        }
	        System.out.print("1"+"\n");
	    }
	}
}

