package com.test;
import java.util.Scanner;
public class SquareAndCube {

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int no=sc.nextInt();
	
	int sq=no*no;
	System.out.println("The Square is:"+sq);
	
	int cube=no*no*no;
	{
		System.out.println("The Cube is:"+cube);
	}
	}
}
/*OUTPUT=
Enter the number:
2
The Square is:4
The Cube is:8*/