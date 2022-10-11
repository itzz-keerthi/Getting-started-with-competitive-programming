/* Printing the power of two number using Math.pow()

Hint: Math.pow() returns only a double value in java, If we want the result to be in int we want to explicitly convert it into Int datatype.

*/
package hackerrank;

import java.util.*;

public class practice{

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int a=5;
    	int b=3;
    	int x=(int)Math.pow(a,b);
    	System.out.println(x);
    		
    	
    }
}
