/* TASK
Chef is buying sweet things to prepare for Halloween!

The shop sells both chocolate and candy.

Each bar of chocolate has a tastiness of XX.
Each piece of candy has a tastiness of YY.
One packet of chocolate contains 22 bars, while one packet of candy contains 55 pieces.

Chef can only buy one packet of something sweet, and so has to make a decision: which one should he buy in order to maximize the total tastiness of his purchase?

Print Chocolate if the packet of chocolate is tastier, Candy if the packet of candy is tastier, and Either if they have the same tastiness.

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases.
Each test case consists of one line of input, containing two space-separated integers XX and YY — the tastiness of one bar of chocolate and one piece of candy, respectively.
Output Format
For each test case, output on a new line the answer:

Chocolate if the packet of chocolate is tastier.
Candy if the packet of candy is tastier.
Either if they have the same tastiness.
You may print each character of the output in either uppercase or lowercase, i.e, Candy, CANDY, CaNdY and cANDy will all be treated as equivalent.

Constraints
1 \leq T \leq 1001≤T≤100
1 \leq X, Y \leq 101≤X,Y≤10
Sample 1:
Input
Output
4
5 1
5 2
5 3
3 10
Chocolate
Either
Candy
Candy
Explanation:
Test case 1: The packet of chocolate has a tastiness of 2×5=10, while the packet of candy has a tastiness of 5×1=5. The chocolate is tastier.

Test case 2: The packet of chocolate has a tastiness of 2×5=10, while the packet of candy has a tastiness of 5×2=10. They have the same tastiness.

Test case 3: The packet of chocolate has a tastiness of 2×5=10, while the packet of candy has a tastiness of 5×3=15. The candy is tastier.

Test case 4: The packet of chocolate has a tastiness of 2×3=6, while the packet of candy has a tastiness of 5×10=50. The candy is tastier.  */

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
		int t=sc.nextInt();
		while(t-->0){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    if((x*2)>(y*5)){
		        System.out.println("Chocolate");
		    }
		    else if((x*2)<(y*5)){
		        System.out.println("Candy");
		    }
		    else{
		        System.out.println("Either");
		    }
		}
	}
}