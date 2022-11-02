package com.test;

import java.util.Scanner;

public class Swaping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number:");
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.err.println("a=" + a + "b=" + b);// before swapping
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a=" + a + "b=" + b);//after Swapping
	}

}
/*OUTPUT=
Enter two number:
12
2
a=12b=2
a=2b=12*/