package whileloop;

public class EvenOdd 
{

	public static void main(String[] args) 
	{
		/*for(int i=1;i<=5;i++) {
			if(i%2==0) 
			{
				System.out.println("Number is even \t"+i);
			}
			else 
			{
				System.out.println("Number is odd \t"+i);
			}}*/
	
		int i=1;
		while(i<=15)
		{
			if(i%2==0) 
			{
				System.out.println("Number is even \t" + i);
			}
			else 
			{
				System.out.println("Number is Odd \t" + i);
           }
			i++;
		}
	}

}

/*OUTPUT=
Number is Odd 	1
Number is even 	2
Number is Odd 	3
Number is even 	4
Number is Odd 	5
Number is even 	6
Number is Odd 	7
Number is even 	8
Number is Odd 	9
Number is even 	10
Number is Odd 	11
Number is even 	12
Number is Odd 	13
Number is even 	14
Number is Odd 	15*/