package mathematical;

import java.util.Scanner;

public class Series_GP {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int r = in.nextInt();
		int n = in.nextInt();
		Series_GP ob = new Series_GP();
		int res = ob.Nth_term(a, r, n);
		System.out.println(res);
	}
	
	public int Nth_term(int a, int r, int n)
    {
        // code here
        long x = r;
        long res = 1;
        long N = n - 1;
        
        while(N > 0)
        {
            if(N % 2 == 1)
                res = (res * x) % 1000000007;
            x = (x * x) % 1000000007;
            N = N / 2;
        }
        
        // res is equal to x^(n-1)
        res = (a * res) % 1000000007;
        return (int)res;
    }

}
