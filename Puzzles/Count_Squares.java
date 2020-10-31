/*
 * Count Squares 
Basic Accuracy: 27.29% Submissions: 1861 Points: 1
Consider a sample space S consisting of all perfect squares starting from 1, 4, 9 and so on. 
You are given a number N, you have to output the number of integers less than N in the sample 
space S.

 

Example 1:

Input :
N = 9
Output:
2
Explanation:
1 and 4 are the only Perfect Squares
less than 9. So, the Output is 2.
Example 2:

Input :
N = 3
Output:
1
Explanation:
1 is the only Perfect Square
less than 3. So, the Output is 1.
 

Your Task:
You don't need to read input or print anything. Your task is to complete the function 
countSquares() which takes an Integer N as input and returns the answer.

 

Expected Time Complexity: O(sqrt(N))
Expected Auxiliary Space: O(1)

 

Constraints:
1 <= N <= 108
 */

package puzzles;

import java.util.Scanner;

public class Count_Squares {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		System.out.println(countSquares(N));
	}
	
	static int countSquares(int N) {
        // code here
        if(Math.sqrt(N) == (double)(int)Math.sqrt(N))
            return (int)Math.sqrt(N) - 1;
        else
            return (int)Math.sqrt(N);
    }

}
