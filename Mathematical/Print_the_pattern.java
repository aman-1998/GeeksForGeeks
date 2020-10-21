/*
 * Print the pattern | Set-1 
School Accuracy: 41.86% Submissions: 38208 Points: 0
You a given a number N. You need to print the pattern for the given value of N.
for N=2 the pattern will be 
2 2 1 1
2 1
for N=3 the pattern will be 
3 3 3 2 2 2 1 1 1
3 3 2 2 1 1
3 2 1

Input Format:
The first line of input is the number of testcases T. The T test 
cases follow. The first line of each test case is an integer N.

Output Format:
For each test case, in a new line, print the required pattern in a singleline. 
Note : Instead of printing new line print a "$" without quotes.

Your Task:
Since this is a function problem, you don't need to worry about the testcases. 
Your task is to complete the function printPat which takes one argument 'N'
 denoting the length of the pattern.

Constraints:
1 <= T <= 20
1 <= N <= 40

Example:
Input
2
2
3
Output
2 2 1 1 $2 1 $
3 3 3 2 2 2 1 1 1 $3 3 2 2 1 1 $3 2 1 $


Note:The Input/Ouput format and Example given are used for system's internal 
purpose, and should be used by a user for Expected Output only. As it is a 
function problem, hence a user should not read any input from stdin/console.
 The task is to complete the function specified, and not to write the full code.
 */

package mathematical;

import java.util.Scanner;

public class Print_the_pattern {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		Print_the_pattern ob = new Print_the_pattern();
		ob.printPat(n);
	}
	
	void printPat(int n)
    {
         // Your code here
         for(int i=n; i>=1; i--)
         {
            for(int j=n; j>=1; j--)
            {
                for(int k=1; k<=i; k++)
                    System.out.print(j+" ");
                
            }
            System.out.print("$");
         }
    }

}
