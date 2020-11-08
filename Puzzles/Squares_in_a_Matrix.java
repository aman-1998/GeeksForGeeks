/*
 * Squares in a Matrix 
Basic Accuracy: 43.21% Submissions: 9793 Points: 1
Given a MxN matrix, count the number of squares in the matrix.squaresinREct

Input:

The first line of input contains an integer T denoting the no of test cases. Then T test cases 
follow. Each test case contains two space separated integers M and N, denoting the size of the 
Matrix.
Output:

For each test output a single integer denoting the total number of squares.
Constraints:

1 <= T <= 10^2
1 <= M,N <= 10^4

Example:

Input:

2
2 2
4 3

Output:

5
20
 */

package puzzles;

import java.util.Scanner;

public class Squares_in_a_Matrix {
	
	public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in);
		long t = in.nextLong();
		
		while(t-- > 0)
		{
		    long m = in.nextLong();
		    long n = in.nextLong();
		    System.out.println(squaresInMatrix(m,n));
		}
	}
	
	public static long squaresInMatrix(long m, long n)
	{
	    long k = m < n ? m : n;
	    long sum = 0;
	    /*
	    Total no. of squares with length x unit in a matrix of dimension m*n 
	    is equal to (m+1-x)*(n+1-x) .
	    */
	    while(k != 0)
	    {
	        sum = sum + (m+1-k)*(n+1-k);
	        k--;
	    }
	    
	    return sum;
	}

}
