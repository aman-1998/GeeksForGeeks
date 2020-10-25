/*
 * Armstrong Numbers 
School Accuracy: 62.22% Submissions: 1405 Points: 0
For a given 3 digit number, find whether it is armstrong number or not. An Armstrong 
number of three digits is an integer such that the sum of the cubes of its digits is 
equal to the number itself. Return "Yes" if it is a armstrong number else return "No".
NOTE: 371 is an Armstrong number since 3^3 + 7^3 + 1^3 = 371

Example 1:

Input: N = 153
Output: "Yes"
Explanation: 153 is an Armstrong number
since 1^3 + 5^3 + 3^3 = 153.
Hence answer is "Yes".
Example 2:

Input: N = 370
Output: "Yes"
Explanation: 370 is an Armstrong number
since 3^3 + 7^3 + 0^3 = 370.
Hence answer is "Yes".

Your Task:  
You dont need to read input or print anything. Complete the function armstrongNumber() 
which takes n as input parameter and returns "Yes" if it is a armstrong number else 
returns "No"..

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

Constraints:
100 ≤ n <1000
 */
package mathematical;

import java.util.Scanner;

public class Armstrong_Numbers {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(armstrongNumber(n));
	}
	
	static String armstrongNumber(int n) {
        // code here
        int ori = n;
        int count = 0;
        // counting number of digits
        while(n != 0)
        {
            n = n / 10;
            count++;
        }
        //////////////
        n = ori;
        int count_temp;
        int r, res, sum = 0;
        while(n != 0)
        {
        	res = 1;
            count_temp = count;
            r = n % 10;
            n = n / 10;
            // finding power of each digit in logarithmic time 
            while(count_temp > 0)
            {
                if(count_temp % 2 == 1)
                    res = res * r;
                r = r * r;
                count_temp = count_temp / 2;
            }
            //////////////
            sum = sum + res;
        }
      
        if(ori == sum)
            return "Yes";
        else
            return "No";
    }
}
