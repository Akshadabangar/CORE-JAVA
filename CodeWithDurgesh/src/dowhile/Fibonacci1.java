package dowhile;
// DO WHILE CHECK THE CONDITION AFTER EXECUTION BLOCK...

import java.util.Scanner;
public class Fibonacci1 {

	public static void main(String[] args) 
	{
		int a=0,b=1,c,i=1;
		Scanner sc=new Scanner(System.in);
       System.out.println("Enter the range:");
       int range=sc.nextInt();
       
       do
       {
    	   System.out.println(a+" ");
    	   c=a+b;
    	   a=b;
    	   b=c;
    	   i++;
       }
       while(i<=range);
	}

}
/*OUTPUT=Enter the range:
6
0 
1 
1 
2 
3 
5 */
