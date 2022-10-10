/*
Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
*/
package hackerrank;
import java.util.*;
/**
 * @author keerthana J
 *
 */
public class practice{
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	long[] list=new long[5];
    	for(int i=0;i<5;i++) {
    		list[i]=sc.nextLong();
    	}
    	Arrays.sort(list);
    	long min_sum=list[0]+list[1]+list[2]+list[3];
    	long max_sum=list[1]+list[2]+list[3]+list[4];
    	System.out.println(min_sum+" "+max_sum);
    }
}

