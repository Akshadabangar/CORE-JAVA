
/*DATATYPE= THERE ARE PRIMITIVE OR NON-PRIMITIVE DATATYPE IN JAVA...
 * PRIMITIVE DATATYPE ARE PREDEDINED...THERE ARE 8 PRIMITIVE DATATYPE -INT(16 BITS),CHAR(8 BITS),FLOAT(32 BITS),
 * DOUBLE(64BITS),SHORT(16 BITS),LONG(32 BITS),BYTE(8 BITS),BOOLEAN(1 BIT)...
 * NON-PRIMITIVE DATATYPE ARE NON-PREDEDINED(REFERENCE,USER-DEFINED)...EG=CLASS,STRING,ARRAY,OBJECT...
 */

package com.test;

//import java.util.Scanner;
public class DatatypeDeclare {

	public static void main(String[] args) {
		;
		/*
		 * Scanner sc=new Scanner(System.in);
		 * System.out.println("Enter the float value:"); double b=sc.nextDouble();
		 * 
		 * System.out.println("Enter the Int value:"); int a=sc.nextInt();
		 */

		int d = 20;
		System.out.println("The int value:" + d);

		char s = 'p';
		System.out.println("\nThe Char value:" + s);

		double e = 20.5;// at a 9 decimal point....and float is at 7 decimal point
		System.out.println("\t The double value:" + e);

		String name = "Sonu";
		System.out.println("The String value:" + name);

		short q = 12;
		System.out.println("The short value:" + q);

		long m = 1000;
		System.out.println("The long value:" + m);

		boolean g = true;
		System.out.println("The Char value:" + g);

	}
}
