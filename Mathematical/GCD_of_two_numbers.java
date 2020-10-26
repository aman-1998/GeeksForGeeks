/*
 * GCD of two numbers 
School Accuracy: 36.12% Submissions: 869 Points: 0
Given two positive integers A and B, find GCD of A and B.


Example 1:

Input: A = 3, B = 6
Output: 3
Explanation: GCD of 3 and 6 is 3

Example 2:

Input: A = 1, B = 1
Output: 1
Explanation: GCD of 1 and 1 is 1

Your Task:  
You don't need to read input or print anything. Complete the function gcd() which takes 
two positive integers as input parameters and returns an integer.


Expected Time Complexity: O(log(min(A, B)))
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ A, B ≤ 10^9
 */

package mathematical;

import java.util.Scanner;

public class GCD_of_two_numbers {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		GCD_of_two_numbers ob = new GCD_of_two_numbers();
		System.out.println(ob.gcd(A, B));
	}
	
	public int gcd(int A , int B) 
    { 
        //code here
        int r;
        do
        {
            r = A % B;
            A = B;
            B = r;
        }
        while(r != 0);
        return A;
    }

}
