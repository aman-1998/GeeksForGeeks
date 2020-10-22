/*
 * Multiplication Table 
School Accuracy: 71.66% Submissions: 827 Points: 0
Print the multiplication table of a given number N. 


Example 1:

Input:
N = 9

Output:
9 18 27 36 45 54 63 72 81 90

Explanation:
The table of 9 is the output whose 1st 
term is 9 and the 10th term is 90.

Example 2:

Input:
N = 2

Output:
2 4 6 8 10 12 14 16 18 20


Your Task:  
You don't need to read input. Your task is to complete the function getTable() which 
takes an integer N as input parameter and returns a list of integers denoting the 
multiplication of table of N from 1 to 10. 

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)


Constraints: 
1 <= N <= 10000
 */
package mathematical;

import java.util.ArrayList;
import java.util.Scanner;

public class Print_table {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		ArrayList<Integer> table = getTable(N);
		for(Integer i : table)
			System.out.print(i+" ");
	}
	
	static ArrayList<Integer> getTable(int N){
        // code here
        ArrayList<Integer> table = new ArrayList<Integer>();
        int res = N;
        for(int i=1; i<=10; i++)
        {
            table.add(res);
            res = res + N;
        }
        return table;
    }

}
