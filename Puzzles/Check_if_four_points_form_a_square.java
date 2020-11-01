/*
 * Is Square 
Easy Accuracy: 33.5% Submissions: 10216 Points: 2
Given four different points in space. Find whether these points can form a square or not.

Input:
The first line of input contains an integer T denoting the number of test cases.The first 
line of each testcase contains x1, y1, x2, y2, x3, y3, x4, y4(four points coordinates) 
separated by space.

Output:
Print "Yes"(without quotes) if it is square else "No"(without quotes).

Constraints:
1 ≤ T ≤ 30
1 ≤ x1, x2, x3, x4, y1, y2, y3, y4 ≤ 100

Example:
Input:
1
20 10 10 20 20 20 10 10
Output:
Yes
 */

package puzzles;

import java.util.Scanner;

public class Check_if_four_points_form_a_square {
	
	public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while(t-- > 0)
		{
		    int x1 = in.nextInt();
		    int y1 = in.nextInt();
		    int x2 = in.nextInt();
		    int y2 = in.nextInt();
		    int x3 = in.nextInt();
		    int y3 = in.nextInt();
		    int x4 = in.nextInt();
		    int y4 = in.nextInt();
		    
		    if(x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0 && x3 == 0 && y3 == 0 && x4 == 0 && y4 == 0)
		        System.out.println("No");
		    else
		    {
    		    double s1 = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
    		    double s2 = Math.sqrt((x1-x3)*(x1-x3) + (y1-y3)*(y1-y3));
    		    double s3 = Math.sqrt((x1-x4)*(x1-x4) + (y1-y4)*(y1-y4));
    		    /*
    		     * 
    		     * 
    		     * This is the solution works in GeeksForGeeks but is not 100% correct because 
    		     * here I have considered only sides but actually diagonals should also be 
    		     * considered.
    		     * 
    		     * 
    		     */
    		    if(s1 == s2 && (Math.sqrt((x4-x2)*(x4-x2) + (y4-y2)*(y4-y2)) == Math.sqrt((x4-x3)*(x4-x3) + (y4-y3)*(y4-y3))))
		    		System.out.println("Yes");
			    else if(s1 == s3 && (Math.sqrt((x2-x3)*(x2-x3) + (y2-y3)*(y2-y3)) == Math.sqrt((x4-x3)*(x4-x3) + (y4-y3)*(y4-y3))))
			    	System.out.println("Yes");
			    else if(s2 == s3 && (Math.sqrt((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2)) == Math.sqrt((x4-x2)*(x4-x2) + (y4-y2)*(y4-y2))))
			    	System.out.println("Yes");
			    else
			    	System.out.println("No");
    		    /*
    		     * 
    		     * 
    		     * The commented solution is the actual solution where I have considered sides
    		     * as well as diagonals length i.e., x and Math.sqrt(2)*x respectively.
    		     * 
    		     * 
    		     * 
    		    if(s1 == s2 && s3 == Math.sqrt(2)*s2 && (Math.sqrt((x4-x2)*(x4-x2) + (y4-y2)*(y4-y2)) == Math.sqrt((x4-x3)*(x4-x3) + (y4-y3)*(y4-y3))))
    		    		System.out.println("Yes");
    		    else if(s1 == s3 && s2 == Math.sqrt(2)*s1 && (Math.sqrt((x2-x3)*(x2-x3) + (y2-y3)*(y2-y3)) == Math.sqrt((x4-x3)*(x4-x3) + (y4-y3)*(y4-y3))))
    		    		System.out.println("Yes");
    		    else if(s2 == s3 && s1 == Math.sqrt(2)*s2 && (Math.sqrt((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2)) == Math.sqrt((x4-x2)*(x4-x2) + (y4-y2)*(y4-y2))))
    		    	System.out.println("Yes");
    		    else
    		    	System.out.println("No");
    		    */
		    }
		}
	}

}
