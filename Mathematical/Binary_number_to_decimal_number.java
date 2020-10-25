/*
 * Binary number to decimal number 
School Accuracy: 47.37% Submissions: 648 Points: 0
Given a Binary Number B, find its decimal equivalent.
 

Example 1:

Input: B = 10001000
Output: 136
Example 2:

Input: B = 101100
Output: 44
 

Your Task:
You don't need to read or print anything. Your task is to complete the function binary_to_decimal() which takes the binary number as string input parameter and returns its decimal equivalent.
 

Expected Time Complexity: O(K * Log(K)) where K is number of bits in binary number.
Expected Space Complexity: O(1)
 

Constraints:
1 <= number of bits in binary number  <= 16
 */

package mathematical;

import java.util.Scanner;

public class Binary_number_to_decimal_number {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String str = in.next();
		Binary_number_to_decimal_number ob = new Binary_number_to_decimal_number();
		System.out.println(ob.binary_to_decimal(str));
	}
	
	public int binary_to_decimal(String str)
    {
        // Code here
        long r, k=0;
        long B = Long.valueOf(str);
        int sum = 0;
        while(B != 0) // O(K)
        {
            r = B % 10;
            B = B / 10;
            sum += r * power(2,k++); // O(Log(K))
        }
        return sum;
    }
    public long power(long x, long n)
    {
        long res = 1;
        while(n > 0)
        {
            if(n % 2 == 1)
                res = res * x;
            x = x * x;
            n = n / 2;
        }
        return res;
    }

}
