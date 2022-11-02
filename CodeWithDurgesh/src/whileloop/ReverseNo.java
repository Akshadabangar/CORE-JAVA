package whileloop;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		int rem,rev=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int no=sc.nextInt();
        
		while(no>0)
		{
			rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
		}
		System.out.println("The reverse no is:"+rev);
	}

}
/*Output= Enter the Number:
123
The reverse no is:321*/