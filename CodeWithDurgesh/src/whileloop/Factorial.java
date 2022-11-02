package whileloop;
import java.util.Scanner;
public class Factorial 
{
public static void main(String args[])
{
	int fact=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no:");
	int no=sc.nextInt();
	
	while(no>=1)
	{
		fact=fact*no;
		no=no-1;
	}
	System.out.println("Factorial is:"+fact);
}
}
/*OUTPUT=Enter the no:
5
Factorial is:120*/