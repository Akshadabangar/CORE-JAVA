package whileloop;
import java.util.Scanner;
public class Palindrome {
public static void main(String[] args) 
	{
	int rev=0,rem,temp;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number:");
	int no=sc.nextInt();
	
	temp=no;
	while(no>0)
	{
		rem=no%10;
		rev=rev*10+rem;
		no=no/10;
	}
	if(rev==temp)
	{
		System.out.println("Number is Palindrome");
	}
	else
	{
		System.out.println("Number is not Palindrome");
	}
	}
}
/*OUTPUT=
 *Enter the Number:
44
Number is Palindrome*/
