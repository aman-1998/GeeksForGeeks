/*
 * Day of the week 
Easy Accuracy: 30.24% Submissions: 278 Points: 2
Write a program that calculates the day of the week for any particular date in the past or future.

Example 1:

Input:
d = 28, m = 12, y = 1995
Output:
Thursday
Explanation:
28 December 1995 was a Thursday.
Example 2:

Input:
d = 30, m = 8, y = 2010
Output:
Monday
Explanation:
30 August 2010 was a Monday.
Your Task:
You don't need to read input or print anything. Your task is to complete the function 
getDayOfWeek() which takes 3 Integers d, m and y denoting day, month and year as input 
and return a String denoting the answer.

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

Constraints:
1 <= d <= 31
1 <= m <= 12
1990 <= y <= 2100
 */

package puzzles;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Day_of_the_week {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int d = in.nextInt();
		int m = in.nextInt();
		int y = in.nextInt();
		System.out.println(getDayOfWeek(d,m,y));
	}
	
	static String getDayOfWeek(int d, int m, int y) {
        // code here
        Map<Integer,Integer> monthCode = new HashMap<Integer,Integer>();
        monthCode.put(1,1);
        monthCode.put(2,4);
        monthCode.put(3,4);
        monthCode.put(4,0);
        monthCode.put(5,2);
        monthCode.put(6,5);
        monthCode.put(7,0);
        monthCode.put(8,3);
        monthCode.put(9,6);
        monthCode.put(10,1);
        monthCode.put(11,4);
        monthCode.put(12,6);
        Map<Integer,String> dayCode = new HashMap<Integer,String>();
        dayCode.put(0,"Saturday");
        dayCode.put(1,"Sunday");
        dayCode.put(2,"Monday");
        dayCode.put(3,"Tuesday");
        dayCode.put(4,"Wednesday");
        dayCode.put(5,"Thursday");
        dayCode.put(6,"Friday");
        int n = y;
        int count = 0;
        int sum = 0,r;
        while(count < 2)
        {
            r = n % 10;
            n = n / 10;
            sum = sum + (int)Math.pow(10,count)*r;
            count++;
        }
        int leap = sum / 4;
        sum = d + monthCode.get(m) + centuryCode(n) + sum + sum/4;
        int ans = sum % 7;
        return dayCode.get(ans);
    }
    static int centuryCode(int century)
    {
        int[] code = {6,4,2,0};
        int x = 0, res = 0;
        for(int i = 0; i <= century; i++)
        {
            res = code[x%4];
            x++;
        }
        return res;
    }

}
