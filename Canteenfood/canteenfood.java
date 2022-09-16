/*   
AUTHOR NAME: KEERTHANA J
DATE: 16-09-2022

Problem Description :
Ramesh is working in an engineering college hostel as a Mess supervisor.
There are different messes available based on the years.
Every day students count is varying in all the hostels due to continuous holidays.
Since ramesh is in charge of the cooking team. He had trouble with calculating the quantity of food that needslo be prepared because of the varying student count.
"Even if a small quantity of food is prepared by the cooking team, iishould be divided equally among the number of Mess."
Ramesh needs an automated softwarelo identify the amount of food available (in number of packets ) and Mess count.
Problem
Can you help himlo divide the food equally and also calculating the remaining quantity of food that will be available after sharing the food equally ?
Constraints:
I< alvqntoffood <l0000
I< messcnl<20
Input Formal:
"Only line of input has two integers (alvqntoffood,messcnt) separated by space representing the available number of food packets and the available number of messes respectively"
Output Formal:
"In the only line of output print two values separated by a space representing the number of food packets that are equally shared by ""n"" number of messes and the remaining"
number of food packets available.

TEST CASE 1:
Input: 25575 5
Output: 5115 0

TEST CASE 2:
Input: 7567 11
Output: 687 10  
*/

package competitiveProgramming;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int noOfFood= obj.nextInt();
	    int noOfMess= obj.nextInt();
	    System.out.println(noOfFood/noOfMess+" "+noOfFood%noOfMess);

	}

}
