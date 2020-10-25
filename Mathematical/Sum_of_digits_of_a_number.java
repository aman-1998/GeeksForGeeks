package mathematical;

import java.util.Scanner;

public class Sum_of_digits_of_a_number {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(new Sum_of_digits_of_a_number().isDigitSumPalindrome(n));
	}
	
	int isDigitSumPalindrome(int N) {
        // code here
        int r, sum = 0;
        while(N != 0)
        {
            r = N % 10;
            N = N / 10;
            sum += r;
        }
        if(isPalindrome(sum) == true)
            return 1;
        else
            return 0;
    }
    
    boolean isPalindrome(int n)
    {
        int r, sum = 0, ori = n;
        while(n != 0)
        {
            r = n % 10;
            n = n / 10;
            sum = sum*10 + r;
        }
        if(sum == ori)
            return true;
        else
            return false;
    }

}
