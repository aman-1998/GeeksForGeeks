/*
 * Pairs of prime number 
Basic Accuracy: 45.51% Submissions: 9140 Points: 1
Print all pairs (sets) of prime numbers (p,q) such that p*q <= n, where n is given number.

Input:
The first line of input contains an integer T denoting the number of test cases. T testcases follow.
The first line of each test case is N.

Output:
For each testcase, in a new line, print the all pairs of prime numbers in increasing order.

Constraints:
1 ≤ T ≤ 50
4 ≤ N ≤ 400

Example:
Input:
2
4
8
Output:
2 2
2 2 2 3 3 2

Explanation:
Testcase 1: Pair (2, 2) which has both prime numbers as well as satisfying the condition 2*2 <= 4.
 */

package mathematical;

import java.util.Scanner;

public class Pairs_of_prime_numbers {
	
	public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while(t-- > 0)
		{
		    int N = in.nextInt();
		    
		    // Sieve of Eratosthenes
		    int[] prime = new int[N+1];
		    
		    for(int i = 1; i <= N; i++)
		        prime[i] = 1;
		        
		    prime[1] = 0;
		    
		    for(int i = 2; i*i <= N; i++)
		    {
		        if(prime[i] == 1)
		        {
		            for(int j = i*2; j <= N; j = j + i)
		                prime[j] = 0;
		        }
		    }
		    
		    // finding pairs
		    for(int p = 2; p <= N; p++)
		    {
		        if(prime[p] == 1)
		        {
		            for(int q = 2; p*q <= N; q++)
		            {
		                if(prime[q] == 1)
		                    System.out.print(p+" "+q+" ");
		            }
		        }
		    }
		    System.out.println();
		}
	}

}
