/*
 * Largest prime factor 
Medium Accuracy: 34.46% Submissions: 1027 Points: 4
Given a number N, the task is to find the largest prime factor of that number.
 

Example 1:

Input:
N = 5
Output:
5
Explanation:
5 has 1 prime factor 
i.e 5 only.
Example 2:

Input:
N = 24
Output:
3
Explanation:
24 has 2 prime factors 
3 and 2 in which 3 is 
greater

Your Task:
You don't need to read input or print anything. Your task is to complete the function 
largestPrimeFactor() which takes an integer N as input parameters and returns an integer, 
largest prime factor of N.
 

Expected Time Complexity: O(sqrt(N))
Expected Space Complexity: O(1)
 

Constraints:
1 <= N <= 10^5
 */

package mathematical;

import java.util.Scanner;

public class Largest_prime_factor {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		System.out.println(largestPrimeFactor(N));
	}
	
	static long largestPrimeFactor(int N) {
        // code here
        long n = N;
        long i;
        
        if(isPrime(n) == true)
            return n;
            
        for(i = n/2; i >= 2; i--)
        {
            if(isPrime(i) == true && n % i == 0)
                break;
        }
        return i;
    }
    
    static boolean isPrime(long x)
    {
        if(x == 1)
            return false;
            
        for(long i = 2; i*i <= x; i++)
        {
            if(x % i == 0)
                return false;
        }
        return true;
    }

}
