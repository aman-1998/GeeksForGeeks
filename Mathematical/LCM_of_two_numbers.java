/*
 * LCM And GCD 
Basic Accuracy: 45.12% Submissions: 898 Points: 1
Given two numbers A and B. The task is to find out their LCM and GCD.

 

Example 1:

Input:
A = 5 , B = 10
Output:
10 5
Explanation:
LCM of 5 and 10 is 10, while
thier GCD is 5.
Example 1:

Input:
A = 14 , B = 8
Output:
56 2
Explanation:
LCM of 14 and 8 is 56, while
thier GCD is 2.
 

Your Task:
You don't need to read input or print anything. Your task is to complete the function 
lcmAndGcd() which takes an Integer N as input and returns a List of two Integers, the 
required LCM and GCD.

 

Expected Time Complexity: O(log(min(A, B))
Expected Auxiliary Space: O(1)

 

Constraints:
1 <= A,B <= 10^18
 */

package mathematical;

import java.util.Scanner;

public class LCM_of_two_numbers {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		long A = in.nextInt();
		long B = in.nextInt();
		Long[] arr = lcmAndGcd(A, B);
		System.out.println(arr[0]+" "+arr[1]);
	}
	
	static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        long r;
        long oriA = A;
        long oriB = B;
        do
        {
            r = A % B;
            A = B;
            B = r;
        }
        while(r != 0);
        long gcd = A;
       
        long lcm = (oriA * oriB) / gcd;
        
        Long[] arr = {lcm, gcd};
        return arr;
    }

}
