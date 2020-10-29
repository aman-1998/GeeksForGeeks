/*
 * Pair square count 
Basic Accuracy: 30.65% Submissions: 473 Points: 1
Given N, count all ‘a’(>=1) and ‘b’(>=0) that satisfy the condition a^2 + b^2 = N.

 

Example 1:

Input:
N = 100 
Output:
2
Explanation:
There are two solutions: (a=6, b=8)
and (a=8, b=6).

Example 2:

Input:
N = 25
Output:
1
Explanation:
There is only one solution: (a=5, b=0)
 

Your Task:
You don't need to read input or print anything. Your task is to complete the function 
pairSquareCount() which takes an Integer N as input and returns the answer.

 

Expected Time Complexity: O(sqrt(N))
Expected Auxiliary Space: O(1)

 

Constraints:
1 <= N <= 10^5
 */
package mathematical;

import java.util.Scanner;

public class Pair_square_count {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		System.out.println(pairSquareCount(N));
	}
	
	static int pairSquareCount(int N) {
        // code here
        int temp, count = 0;
        for(int i = 1; i <= (int)Math.sqrt(N); i++)
        {
            temp = N - i*i;
            
            if(isPerfectSquare(temp) == true)
                count ++;
        }
        return count;
    }
    
    static boolean isPerfectSquare(int n)
    {
    	/*
        if(Math.sqrt(n) == (double)(int)Math.sqrt(n))
            return true;
        else
            return false;
        */
    	
    	if((n & (n-1)) == 0)
    		return true;
    	else
    		return false;
    }

}
