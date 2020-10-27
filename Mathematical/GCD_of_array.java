/*
 * GCD of Array 
Basic Accuracy: 43.99% Submissions: 693 Points: 1
Given an array of N positive integers, find GCD of all the array elements.


Example 1:

Input: N = 3, arr[] = {2, 4, 6}
Output: 2
Explanation: GCD of 2,4,6 is 2.

Example 2:

Input: N = 1, arr[] = {1}
Output: 1
Explanation: Greatest common divisor of
all the numbers is 1.

Your Task:  
You don't need to read input or print anything. Complete the function gcd()which takes N 
and array as input parameters and returns the gcd.


Expected Time Complexity: O(N logN)
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ N, arr[i] ≤ 10^5
 */

package mathematical;

import java.util.Scanner;

public class GCD_of_array {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] arr = new int[N];
		for(int i = 0; i <= N-1; i++)
			arr[i] = in.nextInt();
		GCD_of_array ob = new GCD_of_array();
		int hcf = ob.gcd(N, arr);
		System.out.println(hcf);
	}

	public int gcd(int N , int arr[]) 
    { 
        //code here.
        if(N == 1)
            return arr[0];
        int a = arr[0];
        int b = arr[1];
        int res = hcf(a, b);
        for(int i = 2; i <= arr.length - 1; i++)
            res = hcf(res, arr[i]);
        return res;
    } 
    
    public int hcf(int a, int b)
    {
        int r;
        do
        {
            r = a % b;
            a = b;
            b = r;
        }
        while(r != 0);
        int hcf = a;
        return hcf;
    }
}
