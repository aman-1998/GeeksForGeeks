/*
 * Trailing zeroes in factorial 
Easy Accuracy: 49.69% Submissions: 15665 Points: 2
For an integer n find number of trailing zeroes in n! . 

Input:
The first line contains an integer 'T' denoting the total number of test cases. In each test cases, it contains an integer 'N'.

Output:
In each separate line output the answer to the problem.

Constraints:
1 <= T <= 100
1 <= N <= 1000

Example:
Input:
2
9
1
Output:
1
0
 */

package puzzles;

import java.util.Scanner;

public class Trailing_zeroes_in_factorial {
	
	public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while(t-- > 0)
		{
		    int n = in.nextInt();
		    int sum = 0;
		    if(n < 5)
		        System.out.println(0);
		    else
		    {
		        int den = 5;
		        while(n >= den)
		        {
		            sum = sum + n/den;
		            den = den * 5;
		        }
		        System.out.println(sum);
		    }
		}
	}

}
