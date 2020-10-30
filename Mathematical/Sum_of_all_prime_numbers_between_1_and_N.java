/*
 * Sum of all prime numbers between 1 and N. 
Easy Accuracy: 28.12% Submissions: 167 Points: 2
Given a positive integer N, find the sum of all prime numbers between 1 and N(inclusive).
 

Example 1:

Input: N = 5
Output: 10
Explanation: 2, 3, and 5 are prime
numbers between 1 and 5(inclusive).
Example 2:

Input: N = 10
Output: 17
Explanation: 2, 3, 5 and 7 are prime
numbers between 1 and 10(inclusive).
 

Your Task:
You don't need to read or print anyhting. Your task is to complete the function prime_Sum() which takes N as input parameter and returns the sum of all primes between 1 and N(inclusive).
 

Expected Time Complexity: O(N*log(N))
Expected Space Complexity: O(N)

Constraints:
1 <= N <= 1000000
 */

package mathematical;

import java.util.Scanner;

public class Sum_of_all_prime_numbers_between_1_and_N {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		Sum_of_all_prime_numbers_between_1_and_N ob = new Sum_of_all_prime_numbers_between_1_and_N();
		System.out.println(ob.prime_Sum(N));
	}
	
	public long prime_Sum(int n)
    {
        // code here
        int[] prime = new int[n+1];
        
        for(int i = 1; i <= n; i++)
            prime[i] = 1;
        
        prime[1] = 0;
        
        for(int i = 2; i*i <= n; i++)
        {
            if(prime[i] == 1)
            {
                for(int j = i*2; j <= n; j = j + i)
                    prime[j] = 0;
            }
        }
        long sum = 0;
        for(int i = 1; i <= n; i++)
        {
            if(prime[i] == 1)
                sum += (long)i;
        }
        
        return sum;
    }

}
