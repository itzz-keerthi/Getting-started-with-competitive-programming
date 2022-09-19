/*AUTHOR NAME: KEERTHANA J
DATE: 19/09/2022

Problem Description
In Congo the minors and senior citizens are not eligible to vote.
Only people aged between 18 to 60 (both inclusive) are eligible to vote.

So in order to provide clarity to their citizens regarding their eligibility for voting one of the popular NGO of Congo decided to create a software that provides the information

about voting eligibility of citizens of Congo
But they are stuck in development of the software.
Can you help them in completing the software?
Function Description:
oe If ageofcitizen >= 18 and ageofcitizen <= 60
Then Print as “Eligible for Voting”
Otherwise Print as “Not Eligible for Voting”
Constraints:
1 < ageofcitizen < 120
Input Format:

Only line of Input has a single integer representing the "ageotcitizen".

Output Format:
In the only line of output print the voting eligibility information according to the condition.

TEST CASES:
INPUT: 65
OUTPUT: Not Eligible To Vote

INPUT: 40
OUTPUT: Eligible To Vote
*/

package competitiveProgramming;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int age=obj.nextInt();
		if(age>=18 && age<=60) {
			System.out.println("Eligible for Voting");
		}
		else {
			System.out.println("Not Eligible for Voting");
		}
	}

}
