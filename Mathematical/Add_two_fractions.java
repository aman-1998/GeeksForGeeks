/*
 * Add two fractions 
Basic Accuracy: 45.01% Submissions: 14066 Points: 1
You are given four numbers num1, den1, num2, and den2. You need to find 
(num1/den1)+(num2/den2) and output the result in the form of (numx/denx).

Input Format:
The first line of input contains an integer T denoting the number of test cases . 
Then T test cases follow . Each test case contains four integers num1, den1, num2, den2 respectively .

Output Format:
For each test case, in a new line,  output will be the fraction in the form a/b where 
the fraction denotes the sum of the two given fractions in reduced form.

Your Task:
Since this is a function problem, you don't need to worry about the testcases. 
Your task is to complete the function addFraction  which adds the two fractions 
and prints the resulting fraction. The function takes four arguments num1, den1, 
num2, den2 where num1, num2 denotes the numerators of two fractions and den1, 
den2 denotes their denominators.

Constraints:
1 <= T <= 100
1 <= den1,den2,num1,num2 <= 1000

Example:
Input
1
1 500 2 500
Output
3/500

Explanation:
In above test case 1/500 + 2/500 = 3/500

 

Note:The Input/Ouput format and Example given are used for system's internal purpose, and 
should be used by a user for Expected Output only. As it is a function problem, hence a 
user should not read any input from stdin/console. The task is to complete the function 
specified, and not to write the full code.
 */

package mathematical;

import java.util.Scanner;

public class Add_two_fractions {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int den1 = in.nextInt();
		int num2 = in.nextInt();
		int den2 = in.nextInt();
		Add_two_fractions ob = new Add_two_fractions();
		ob.addFraction(num1, den1, num2, den2);
	}
	
	void addFraction(int num1, int den1, int num2, int den2)
    {
        // Your code here	
        int den_temp = (den1 * den2) / gcd(den1, den2); // lcm(den1, den2)
        int x = den_temp / den1;
        int y = den_temp / den2;
        int num_temp = num1*x + num2*y;
        int hcf = gcd(num_temp, den_temp);
        int numx = num_temp / hcf;
        int denx = den_temp / hcf;
        System.out.println(numx+"/"+denx);
    }
    
    int gcd(int a, int b)
    {
        int r;
        int oriA = a;
        int oriB = b;
        do
        {
            r = a % b;
            a = b;
            b = r;
        }
        while(r != 0);
        int gcd = a;
        return gcd;
    }

}
