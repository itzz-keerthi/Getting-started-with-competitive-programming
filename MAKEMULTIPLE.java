/* TASK
Problem
Chef has two integers AA and BB (A \leq B)(A≤B).

Chef can choose any non-negative integer XX and add them to both AA and BB. Find whether it is possible to make AA a divisor of BB.

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases.
Each test case consists of two integers AA and BB.
Output Format
For each test case, output YES if it is possible to make AA a factor of BB, NO otherwise.

You can print each character of the string in uppercase or lowercase. For example, the strings Yes, YES, yes, and yEs, are all considered identical.

Constraints
1 \leq T \leq 10^51≤T≤10 
5
 
1 \leq A \leq B \leq 10^91≤A≤B≤10 
9
 
Sample 1:
Input
Output
3
3 6
4 14
9 10
YES
YES
NO
Explanation:
Test case 1: We can choose X = 0 and add them to 3 and 6. Thus, 3 is a factor of 6.

Test case 2: We can choose X = 1 and add them to 4 and 14. Thus, 4+1 = 5 is a factor of 14+1 = 15.

Test case 3: There is no possible value of X to add such that A becomes a factor of B.  */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=0;i<a;i++){
		    int A=sc.nextInt();
		    int B=sc.nextInt();
		    if(B%A==0)
		        System.out.println("Yes");
		    else if (B>2*A)
		        System.out.println("Yes");
		    else
		        System.out.println("No");
		}
	}
}
