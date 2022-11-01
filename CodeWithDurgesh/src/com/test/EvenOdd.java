package com.test;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) 
	{
	/*int a=12;
	if(a%2==0)
	{
		System.out.println("Number is Even");
	}
	else {
		System.out.println("Number is Odd");
	}
	}*/

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number:");
	int a=sc.nextInt();
	
	if(a%2==0) {
		System.out.println("Number is even");
	}
	else {
		System.out.println("Number is Odd");
	}
}
}
/*OUTPUT=
Enter the Number:
3
Number is Odd*/