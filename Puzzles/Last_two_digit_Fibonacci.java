/*
 * Last two digit Fibonacci 
Easy Accuracy: 12.67% Submissions: 253 Points: 2
Given a number N. Find the last two digits of the Nth fibonacci number.
Note: If the last two digits are 02, return 2.

Example 1:

Input:
N = 13
Output:
33
Explanation:
The 13th Fibonacci number is 233.
So last two digits are 3 and 3.
Example 2:

Input:
N = 255
Output:
70
Explanation:
The 255th fibonacci number is  875715953430-
18854458033386304178158174356588264390370.
Thus, last two digits are 7 and 0.

Your Task:
You don't need to read input or print anything.Your task is to complete the function 
fibonacciDigits() which takes a number N as input parameter and returns the last two 
digits of the Nth fibonacci number.


Expected Time Complexity:O(K)
Expected Auxiliary Space:O(K)
K is of the order 10^2.


Constraints:
1<=N<=10^18
 */

package puzzles;

import java.util.Scanner;

public class Last_two_digit_Fibonacci {
	
	public static void main(String[] args)
	{
		long N = new Scanner(System.in).nextLong();
		System.out.println(new Last_two_digit_Fibonacci().fibonacciDigits(N));
	}
	
	int fibonacciDigits(long N) {
        //code here
        long a = 1, b = 1, c = 1;
        
        N = N % 300;
        
        if(N == 0)
        	N = 300;
        
        while(N > 2)
        {
        	c = a + b;
        	c = c % 100;
        	a = b % 100;
        	b = c % 100;
        	//System.out.println(c+" ");
        	N--;
        }
        int res = (int)c % 100;
        return res;
    }

}
