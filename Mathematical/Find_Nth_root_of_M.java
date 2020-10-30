/*
 * Find Nth root of M 
Easy Accuracy: 39.3% Submissions: 20380 Points: 2
You are given 2 numbers (N , M); the task is to find N√M (Nth root of M).

Input:
The first line of input contains an integer T denoting the number of test cases. Then T 
test cases follow. Each test case contains two space separated integers N and M.

Output:
For each test case, in a new line, print an integer denoting Nth root of M if the root 
is an integer else print -1.

Constraints:
1 <= T <= 200
2 <= N <= 20
1 <= M <= 10^9+5

Example:
Input:
2
2 9
3 9
Output:
3
-1
 */

package mathematical;

import java.util.Scanner;

public class Find_Nth_root_of_M {
	
	public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- > 0)
		{
		    long N = in.nextLong();
		    long M = in.nextLong();
		    double res = Math.pow(M, 1/(double)N);
		    if(res == (double)(int)res)
		        System.out.println((long)res);
		    else
		        System.out.println(-1);
		}
	}
}
