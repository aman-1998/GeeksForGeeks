/*
 * Series GP 
Basic Accuracy: 0.0% Submissions: 63 Points: 1
Given the A and R i,e first term and common ratio of a GP series. Find the Nth term
 of the series.
 

Example 1:

Input: A = 2, R = 2, N = 4
Output: 16
Explanation: The GP series is 
2, 4, 8, 16, 32,... in which 16 
is th 4th term.
Example 2:

Input: A = 4, R = 3, N = 3
Output: 36
Explanation: The GP series is
4, 12, 36, 72,.. in which 36 is
the 3rd term.
 

Your Task:
You don't need to read or print anything. Your task is to complete the function
 Nth_term() which takes A, R and N as input parameter ans returns Nth term of 
 the GP series modulo 109 + 7.
 

Expected Time Complexity: O(log2(N))
Expected Space Complexity: O(1)

Constraints:
1 <= A, R, N <= 1000000
 */

package mathematical;

import java.util.Scanner;

public class Series_GP {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int r = in.nextInt();
		int n = in.nextInt();
		Series_GP ob = new Series_GP();
		int res = ob.Nth_term(a, r, n);
		System.out.println(res);
	}
	
	public int Nth_term(int a, int r, int n)
    {
        // code here
        long x = r;
        long res = 1;
        long N = n - 1;
        
        while(N > 0)
        {
            if(N % 2 == 1)
                res = (res * x) % 1000000007;
            x = (x * x) % 1000000007;
            N = N / 2;
        }
        
        // res is equal to x^(n-1)
        res = (a * res) % 1000000007;
        return (int)res;
    }

}
