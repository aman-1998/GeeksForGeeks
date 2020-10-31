/*
 * 3 Divisors 
Medium Accuracy: 32.48% Submissions: 18113 Points: 4
Given a value N. The task is to find how many numbers less than or equal to N have numbers 
of divisors exactly equal to 3.

Input:
The first line contains integer T, denoting number of test cases. Then T test cases follow. 
The only line of each test case contains an integer N.

Output :
For each testcase, in a new line, print the answer of each test case.

Constraints :
1 <= T <= 10^3
1 <= N <= 10^12

Example:
Input :
3
6
10
30
Output :
1
2
3

Explanation:
Testcase 1: There is only one number 4 which has exactly three divisors 1, 2 and 4.
 */

package puzzles;

import java.util.Scanner;

class Three_Divisors {
	public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in);
		long t = in.nextLong();
		while(t-- > 0)
		{
			/*
			 * 2 * 2 = 4
			 * 3 * 3 = 9
			 * 5 * 5 = 25
			 * 7 * 7 = 49
			 * 11 * 11 = 121
			 * .... So on
			 * So, 4, 9, 25, 121, ... etc are the numbers with 3 divisors only
			 */
		    long n = in.nextLong();
		    int last = (int)Math.sqrt(n);
		    System.out.println(prime_numbers_less_than_or_equal_to(last));
		}
	}
	
	static int prime_numbers_less_than_or_equal_to(int N)
	{
		// Sieve of Eratosthenes
	    int[] prime = new int[N+1];
	    
	    for(int i = 1; i <= N; i++)
	        prime[i] = 1;
	        
	    prime[1] = 0;
	    
	    for(int i = 2; i <= (int)Math.sqrt(N); i++)
	    {
	        if(prime[i] == 1)
	        {
	            for(int j = i*2; j <= N; j = j + i)
	                prime[j] = 0;
	        }
	    }
	    
	    int count = 0;
	    for(int i = 1; i <= N; i++)
	    {
	        if(prime[i] == 1)
	            count++;
	    }
	    return count;
	}
}
