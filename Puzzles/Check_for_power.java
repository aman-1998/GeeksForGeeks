/*
 * Check if a number is power of another number 
Basic Accuracy: 25.66% Submissions: 621 Points: 1
Given two positive numbers X and Y, check if Y is a power of X or not.

 

Example 1:

Input:
X = 2, Y = 8
Output:
1
Explanation:
23 is equal to 8.
 

Example 2:

Input:
X = 1, Y = 3
Output:
0
Explanation:
Any power of 1 is not 
equal to 8.
 

Your Task:

You don't need to read input or print anything. Your task is to complete the function 
isPowerOfAnother() which takes an integer and returns 1 if y is the power of x, else 
return 0.

 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

 

Constraints: 
1 <= x <= 10^3
1 <= y <= 10^8
 */

package puzzles;

import java.util.Scanner;

public class Check_for_power {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		long X = in.nextLong();
		long Y = in.nextLong();
		System.out.println(isPowerOfAnother(X, Y));
	}
	
	static int isPowerOfAnother(Long X, Long Y){
        // code here
        if(Math.log(Y)/Math.log(X) == (double)(int)(Math.log(Y)/Math.log(X)))
        	return 1;
        else
        	return 0;
    }

}
