/*TASK
Chef is trying to solve a problem having TT test cases, where, for each test case he is given a single integer NN.

Chef has an algorithm which takes exactly N^2N 
2
  iterations for a test case with value NN.

The constraints of the problem are as follows:

1 \leq T \leq maxT1≤T≤maxT
1 \leq N \leq maxN1≤N≤maxN
Sum of NN over all test cases does not exceed sumNsumN.
Given the values maxT, maxN,maxT,maxN, and sumNsumN, determine the maximum number of iterations Chef's algorithm can take for any valid input file satisfying all the constraints.

Formally speaking, find the maximum value of N_1^2 + N_2^2 + \dots + N_T^2N 
1
2
​
 +N 
2
2
​
 +⋯+N 
T
2
​
  for:

1 \leq T \leq maxT1≤T≤maxT
1 \leq N_i \leq maxN1≤N 
i
​
 ≤maxN
N_1 + N_2 + N_3 +\dots +N_T \leq sumNN 
1
​
 +N 
2
​
 +N 
3
​
 +⋯+N 
T
​
 ≤sumN
Input Format
The first line of input will contain a single integer TT, denoting the number of test cases.
Each test case consists of single line consisting of three integers maxT, maxN,maxT,maxN, and sumNsumN.
Output Format
For each test case, output the the maximum number of iterations Chef's algorithm can take in any valid test file.

Constraints
1 \leq T \leq 10001≤T≤1000
1 \leq maxT \leq maxN \leq sumN \leq 10^41≤maxT≤maxN≤sumN≤10 
4
 
Sample 1:
Input
Output
4
10 100 200
3 10 100
1000 1000 2200
100 100 100
20000
300
2040000
10000   */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int maxT=sc.nextInt();
		    int maxN=sc.nextInt();
		    int sumN=sc.nextInt();
		    int ans=0;
		    while((sumN!=0)&&(maxT!=0)){
		        int n=Math.min(maxN,sumN);
		        ans+=n*n;
		        maxT-=1;
		        sumN-=n;
		    }System.out.println(ans);	
		    
		}
	}
}

 
