/*Task
Program to demonstrate the use of for loops.

Sample Input

2
0 2 10
5 3 5
Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
*/
import java.io.*;
import java.util.*;
import java.lang.*;
public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int noOfterms=sc.nextInt();
        for(int i=1;i<=noOfterms;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            for(int j=1;j<=n;j++){
                int c=(int)Math.pow(2,j-1);
                 a+=(c*b);
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}

