package com.test;

public class Threevariablegreater {

	public static void main(String[] args)
	{
		int a=10;
		int b=3;
		int c=7;
		if(a>b && a>c)
		{
			System.out.println("a is Greater");
		}
		else if(b>a && b<c)
		{
			System.out.println("b is Greater");
		}
		else if(c>a &&c>b)
		{
			System.out.println("c is Freater");
		}

	}

}
/*OUTPUT=
 * a is Greater*/
