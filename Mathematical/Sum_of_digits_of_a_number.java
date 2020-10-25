/*
 * Sum of Digit is Pallindrome or not 
School Accuracy: 51.45% Submissions: 729 Points: 0
Given a number N.Find if the digit sum(or sum of digits) of N is a Palindrome number or not.
Note:A Palindrome number is a number which stays the same when reversed.Example- 121,131,7 etc.

Example 1:

Input:
N=56
Output:
1
Explanation:
The digit sum of 56 is 5+6=11.
Since, 11 is a palindrome number.Thus,
answer is 1.
Example 2:

Input:
N=98
Output:
0
Explanation:
The digit sum of 98 is 9+8=17.
Since 17 is not a palindrome,thus, answer
is 0.

Your Task:
You don't need to read input or print aything.Your Task is to complete the function 
isDigitSumPalindrome() which takes a number N as input parameter and returns 1 if 
the Digit sum of N is a palindrome.Otherwise it returns 0.


Expected Time Complexity:O(LogN)
Expected Auxillary Space:O(1)

Constraints:
1<=N<=109
 */
package mathematical;

import java.util.Scanner;

public class Sum_of_digits_of_a_number {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(new Sum_of_digits_of_a_number().isDigitSumPalindrome(n));
	}
	
	int isDigitSumPalindrome(int N) {
        // code here
        int r, sum = 0;
        while(N != 0)
        {
            r = N % 10;
            N = N / 10;
            sum += r;
        }
        if(isPalindrome(sum) == true)
            return 1;
        else
            return 0;
    }
    
    boolean isPalindrome(int n)
    {
        int r, sum = 0, ori = n;
        while(n != 0)
        {
            r = n % 10;
            n = n / 10;
            sum = sum*10 + r;
        }
        if(sum == ori)
            return true;
        else
            return false;
    }

}
