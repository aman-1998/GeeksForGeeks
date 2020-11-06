/*
 * Overlapping rectangles 
Easy Accuracy: 27.78% Submissions: 26623 Points: 2
Given two rectangles, find if the given two rectangles overlap or not. A rectangle is 
denoted by providing the x and y co-ordinates of two points: the left top corner and the 
right bottom corner of the rectangle. Two rectangles sharing a side are considered overlapping.

Note : It may be assumed that the rectangles are parallel to the coordinate axis.


Input:
The first integer T denotes the number of testcases. For every test case, there are 2 lines 
of input. The first line consists of 4 integers: denoting the co-ordinates of the 2 points 
of the first rectangle. The first integer denotes the x co-ordinate and the second integer 
denotes the y co-ordinate of the left topmost corner of the first rectangle. The next two 
integers are the x and y co-ordinates of right bottom corner. Similarly, the second line 
denotes the cordinates of the two points of the second rectangle in similar fashion.

Output:
For each testcase, output (either 1 or 0) denoting whether the 2 rectangles are overlapping. 
1 denotes the rectangles overlap whereas 0 denotes the rectangles do not overlap.

Constraints:
1 <= T <= 10
-104 <= x, y <= 104

Example:
Input:
2
0 10 10 0
5 5 15 0
0 2 1 1
-2 -3 0 2

Output:
1
0

Explanation:
Testcase 1: According to the coordinates given as input ,two rectangles formed overlap with 
each other and thus answer returns 1.
 */

package puzzles;

import java.util.Scanner;

public class Overlapping_rectangles {
	
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
		    
		    if(isOverLapping(x1,y1,x2,y2,x3,y3,x4,y4) == true)
		        System.out.println(1);
		    else
		        System.out.println(0);
		}
	}
	
	public static boolean isOverLapping(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4)
	{
	    if(x4 < x1 || x3 > x2)
	        return false;
	    else if(y3 < y2 || y4 > y1)
	        return false;
	    else
	        return true;
	}

}
