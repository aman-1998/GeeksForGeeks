/*
 * nCr 
Medium Accuracy: 16.62% Submissions: 4158 Points: 4
Given two integers n and r, find nCr. Since the answer may be very large, calculate the 
answer modulo 109+7.

Example 1:

Input: n = 3, r = 2
Output: 3
Explaination: 3C2 = 3. 

Example 2:

Input: n = 2, r = 4
Output: 0
Explaination: r is greater than n.

Your Task:
You do not need to take input or print anything. Your task is to complete the function nCr() 
which takes n and r as input parameters and returns nCr modulo 109+7.


Expected Time Complexity: O(n*r)
Expected Auxiliary Space: O(r)


Constraints:
1 ≤ n ≤ 1000
1 ≤ r ≤ 800
 */

package mathematical;

import java.util.Scanner;

public class Compute_nCr_pascal_triangle {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int r = in.nextInt();
		int ans = nCr(n, r);
		System.out.println(ans);
	}
	
	static int nCr(int n, int r)
    {
        // code here
		int[][] pascal = new int[n+1][n+1];
		
		if(n < r)
		    return 0;
		
		for(int i = 0; i <= n; i++)
		{
			for(int j = 0; j <= i; j++)
			{
				if(j == 0)
					pascal[i][j] = 1;
				else if(i == j)
					pascal[i][j] = 1;
				else
					pascal[i][j] = (pascal[i-1][j-1] + pascal[i-1][j]) % 1000000007;
			}
		}
		
		return pascal[n][r] % 1000000007;
    }

}
