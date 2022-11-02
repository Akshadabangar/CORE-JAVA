package whileloop;
import java.util.Scanner;
public class fibonacci
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the range:");
	int range=sc.nextInt();
	
	int a=0,b=1,c,i=1;
while(i<=range)
{
	System.out.println(a+" ");
	c=a+b;
	a=b;
	b=c;
	i++;
}
}
}
/* OUTPUT=Enter the range:
7
0	
1	
1	
2	
3	
5	
8*/