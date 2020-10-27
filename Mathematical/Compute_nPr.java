/*
 * nPr 
School Accuracy: 44.56% Submissions: 20981 Points: 0
Write a program to calculate nPr. nPr represents n permutation r and 
value of nPr is (n!) / (n-r)!.

Input: 
The first line of the input contains T denoting the number of testcases. 
T testcases follow. First line of the test case will be the value of n 
and r respectively.

Output:
For each test case, in a new line, output will be the value of nPr.

Constraints:
1 <= T <= 100
1 <= n,r <= 20
n >= r

Example:
Input:
2
2 1
10 4
Output:
2
5040
 */

package mathematical;

import java.util.Scanner;

public class Compute_nPr {
	
	public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- > 0)
		{
		    long n = in.nextLong();
		    long r = in.nextLong();
		    System.out.println(fac(n)/fac(n-r));
		}
	}
	
	public static long fac(long N){
        // code here
        long p = 1;
        for(long i = 1; i <= N; i++)
            p = p * i;
        return p;
    }

}
