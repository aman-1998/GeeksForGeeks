/*
 * Number Of Open Doors 
Easy Accuracy: 28.06% Submissions: 1185 Points: 2
Consider a long alley with a N number of doors on one side. All the doors are closed initially. You move to and fro in the alley changing the states of the doors as follows: you open a door that is already closed and you close a door that is already opened. You start at one end go on altering the state of the doors till you reach the other end and then you come back and start altering the states of the doors again.
In the first go, you alter the states of doors numbered 1, 2, 3, � , n.
In the second go, you alter the states of doors numbered 2, 4, 6�
In the third go, you alter the states of doors numbered 3, 6, 9 �
You continue this till the Nth go in which you alter the state of the door numbered N.
You have to find the number of open doors at the end of the procedure.

Look at the diagram below for better understanding:

1. Initial state =>  ----------door(CLOSED)----------door(CLOSED)---------door(CLOSED)----------door(CLOSED)-----------door(CLOSED)---------door(CLOSED)----------

 

Example 1:

Input:
N = 2
Output:
1
Explanation:
Initially all doors are closed.
After 1st go, all doors will be opened.
After 2nd go second door will be closed.
So, Only 1st door will remain Open.
Example 2:

Input:
N = 4
Output:
2
Explanation:
Following the sequence 4 times, we can
see that only 1st and 4th doors will
remain open.
 

Your Task:
You don't need to read input or print anything. Your task is to complete the function noOfOpenDoors() which takes an Integer N as input and returns the answer.

 

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

 

Constraints:
1 <= N <= 1012
 */

package puzzles;

import java.util.Scanner;

public class Number_Of_Open_Doors {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		long N = in.nextLong();
		System.out.println(noOfOpenDoors(N));
	}
	
	static int noOfOpenDoors(Long N) {
        // code here
        return (int)Math.sqrt(N);
    }

}
