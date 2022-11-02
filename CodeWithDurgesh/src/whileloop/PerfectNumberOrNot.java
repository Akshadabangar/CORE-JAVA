package whileloop;
import java.util.Scanner;

public class PerfectNumberOrNot
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int no=sc.nextInt();
	int i=1,sum=0;
	
	while(i<no) {
		if(no%i==0) {
			sum=sum+i;
		}
		i++;
	}
if(sum==no) {
	System.out.println("Number is perfect");
}
else {
	System.out.println("Number is not perfect");
}
	}

}
/* OUTPUT=
 * Enter the number:
6
Number is perfect*/