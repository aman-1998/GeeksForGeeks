/*
 * Nth Even Fibonacci Number 
Basic Accuracy: 9.94% Submissions: 324 Points: 1
Given a positive integer N, find the Nth Even Fibonacci number. Since the answer can be 
very large, return the answer modulo 1000000007.

Example 1:

Input: n = 1
Output: 2 
Explanation: 2 is the first even
number in the fibonacci series.
Example 2:

Input: n = 2
Output: 8
Explanation: 2 is the first even
number in the fibonacci series.

Your Task:  
You dont need to read input or print anything. Complete the function nthEvenFibonacci() 
which takes S as input parameter and returns the Nth even fibonacci number.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

Constraints:
1<= n <=1000
 */

package puzzles;

import java.util.Scanner;

public class Nth_Even_Fibonacci_Number {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		System.out.println(nthEvenFibonacci(n));
	}
	
	static long nthEvenFibonacci(long n) {
        // code here
		long a = 1, b = 1, c = 1;
		long N = n * 3;
		
		while(N > 2)
		{
			c = (a + b) % 1000000007;
			a = b;
			b = c;
			N--;
		}
		
		return c;
    }

}
