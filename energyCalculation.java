/*
AUTHOR NAME: KEERTHANA J
DATE: 17/09/2022

Problem Description :
Omkar the Professor of a Famous Technical Univers ity have decided to give a simple task to his students.
He asked his students to create a programming logic for automatically calculating the amount of energy neededlo healX amount of water from Y initial temperature to Z f inal
temperature.
But Professor Omkar's Students are Finding it diff icult to f ind the solution to the problem .
Can you help them with the correct logic?
Functional Description:
The formula to compute the energy is as follows
Q = M * (finaltemp - initialtemp) * 4184
Where,"
"M is the weight of water measured in kilograms,"
"Q is the energy measured in joules, and"
Temperatures are measured in degrees Celsius.
Constraints:
l<M<IOOO
O<initialtemp<25 O<f inaltemp<75
Input Formal:
"Only Line of input has three floating point values separated by a space representing M, initialtemp and f inaltemp respectively."
Output Formal:
In the only line of output print the required energy in joules.

TEST CASE 1:
Input: 567 12 56
Output: 1.04382e+08

TEST CASE 2:
Input: 734 0 37
Output: 1.13629e+08
*/
package competitiveProgramming;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		float M= obj.nextFloat();
	    float initialTemp= obj.nextFloat();
	    float finalTemp= obj.nextFloat();
	    System.out.println(M*(finalTemp - initialTemp)*4184);

	}

}


