/*
 * Sieve of Eratosthenes 
Basic Accuracy: 48.8% Submissions: 693 Points: 1
Given a number N, calculate the prime numbers up to N using Sieve of Eratosthenes.  

Example 1:

Input:
N = 10

Output:
2 3 5 7

Explanation:
Prime numbers less than equal to N 
are 2 3 5 and 7.
Example 2:

Input:
N = 35

Output:
2 3 5 7 11 13 17 19 23 29 31

Explanation:
Prime numbers less than equal to 35 are
2 3 5 7 11 13 17 19 23 29 and 31.
Your Task:  
You don't need to read input or print anything. Your task is to complete the function 
sieveOfEratosthenes() which takes an integer N as an input parameter and return the 
list of prime numbers less than equal to N.

Expected Time Complexity: O(N(log(logN)))
Expected Auxiliary Space: O(N)

Constraints:
1<= N <= 10^4
 */

package mathematical;

import java.util.Scanner;
import java.util.ArrayList;

public class Sieve_of_Eratosthenes {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Integer> arr = sieveOfEratosthenes(n);
		
		for(int i = 0; i <= arr.size()-1; i++)
			System.out.print(arr.get(i)+" ");
	}
	
	static ArrayList<Integer> sieveOfEratosthenes(int N){
        // code here
        ArrayList<Integer> arr = new ArrayList<Integer>();
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
        
        for(int i = 1; i <= N; i++)
        {
            if(prime[i] == 1)
                arr.add(i);
        }
        
        return arr;
    }

}
