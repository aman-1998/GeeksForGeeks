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
