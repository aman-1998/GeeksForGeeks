/*
 * Angle between hour and minute hand 
Basic Accuracy: 10.25% Submissions: 1003 Points: 1
Calculate the angle between hour hand and minute hand.

Note: There can be two angles between hands, we need to print minimum of two. Also, we need to 
print floor of final result angle. For example, if the final angle is 10.61, we need to print 10.

 

Example 1:

Input:
H = 9 , M = 60
Output:
90
Explanation:
The minimum angle between hour and minute
hand when the time is 9 is 90 degress.
Example 2:

Input:
H = 3 , M = 30
Output:
75
Explanation:
The minimum angle between hour and minute
hand when the time is 3:30 is 75 degress.
 

Your Task:
You don't need to read input or print anything. Your task is to complete the function getAngle() 
which takes 2 Integers H and M as input and returns the answer.

 

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

 

Constraints:
1 <= H <= 12
1 <= M <= 60
H and M are Integers
 */

package puzzles;

import java.util.Scanner;

public class Angle_between_hour_and_minute_hand {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int H = in.nextInt();
		int M = in.nextInt();
		System.out.println(getAngle(H, M));
	}
	
	static int getAngle(int H , int M) {
        // code here
       int  Ori = M;
        
        if(M == 60)
            M = 0;
        
        if(H == 12)
            H = 0;
        
        double res = (double)6*Ori - (double)(60*H + M)/2;
        res = Math.abs(res);
        
        if(360 - res < res)
            res = 360 - res;
        
        if(res == 360)
            res = 0;
        
        return (int)res;
    }
}
