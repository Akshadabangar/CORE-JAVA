package whileloop;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args)
	{
	int temp,rem,result=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number:");
	int no=sc.nextInt();
	
	temp=no;
	while(no>0) {
		rem=no%10;
		result+=rem*rem*rem;
		no=no/10;
	}
	if(temp==result) {
		System.out.println("Number is armstrong");
	}
	else {
		System.out.println("Number is not armstrong");
	}
	}
}

/* OUTPUT=
 * Enter the Three Digit number:
153
Number is Armstrong*/
