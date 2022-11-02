package whileloop;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		int sum =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int no = sc.nextInt();

		while (no > 0)
		{
		sum = sum + no%10;
			no = no / 10;
		}
		System.out.println("Sum of Digit is:" + sum);
	}
}

/*
 * OUTPUT= Enter the Number: 12 Sum of Digit is:3
 */

/*(12>0)
 * sum = sum + no%10;....sum=0+(12%10)..sum=0+2...sum=2
 * no=no/10...no=12/10;...no=1
 * (1>0)
 * sum = sum + no%10;....sum=2+(1%10)..sum=2+1...sum=3
 * no=no/10...no=1/10;...no=0
 * (O>O)
 * */
