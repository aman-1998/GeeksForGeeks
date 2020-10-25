/*
 * Print the Kth Digit 
Basic Accuracy: 31.0% Submissions: 993 Points: 1
Given two numbers A and B, find Kth digit from right of A^B.
 

Example 1:

Input:
A = 3
B = 3
K = 1
Output:
7
Explanation:
3^3 = 27 and 1st
digit from right is 
7
Example 2:

Input:
A = 5
B = 2
K = 2
Output:
2
Explanation:
5^2 = 25 and second
digit from right is
2.

Your Task:
You don't need to read input or print anything. Your task is to complete the function 
kthDigit() which takes integers A, B, K as input parameters and returns Kth Digit of 
A^B from right side.
 

Expected Time Complexity: O(log A^B)
Expected Space Complexity: O(1)
 

Constraints:
1 <= A,B <= 15
1 <=K<= digits in A^B
 */

package mathematical;

import java.util.Scanner;

public class Print_the_Kth_Digit {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int K = in.nextInt();
		System.out.println(Print_the_Kth_Digit.kthDigit(A,B,K));
	}
	
	static long kthDigit(int A,int B,int K){
        // code here
        long a = A;
        long b = B;
        long k = K;
        long res = 1;
        while(b > 0)
        {
            if(b % 2 == 1)
                res = res * a;
            a = a * a;
            b = b / 2;
        }
        long r = 0, count = 1;
        while(res != 0 && count <= K)
        {
            r = res % 10;
            res = res / 10;
            count++;
        }
        return r;
    }

}
