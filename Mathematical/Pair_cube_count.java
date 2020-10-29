/*
 * Pair cube count 
Basic Accuracy: 30.65% Submissions: 473 Points: 1
Given N, count all ‘a’(>=1) and ‘b’(>=0) that satisfy the condition a^3 + b^3 = N.

 

Example 1:

Input:
N = 9 
Output:
2
Explanation:
There are two solutions: (a=1, b=2)
and (a=2, b=1).

Example 2:

Input:
N = 27
Output:
1
Explanation:
There is only one solution: (a=3, b=0)
 

Your Task:
You don't need to read input or print anything. Your task is to complete the function 
pairCubeCount() which takes an Integer N as input and returns the answer.

 

Expected Time Complexity: O(cbrt(N))
Expected Auxiliary Space: O(1)

 

Constraints:
1 <= N <= 10^5
 */

package mathematical;

import java.util.Scanner;

public class Pair_cube_count {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		System.out.println(pairCubeCount(N));
	}
	
	static int pairCubeCount(int N) {
        // code here
        int temp, count = 0;
        for(int i = 1; i <= (int)Math.cbrt(N); i++)
        {
            temp = N - i*i*i;
            
            if(isPerfectCube(temp) == true)
                count ++;
        }
        return count;
    }
    
    static boolean isPerfectCube(int n)
    {
        if(Math.cbrt(n) == (double)(int)Math.cbrt(n))
            return true;
        else
            return false;
    }

}
