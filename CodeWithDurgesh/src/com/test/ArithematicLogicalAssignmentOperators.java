package com.test;
/*OPERATOR = PERFORM THE OPERATION...

 * ARITHEMATIC OPERATOR= (+,-,*,/,%)
 * (a+b)....a & b IS THE OPERAND....+ IS OPERATOR
 */
import java.util.Scanner;
public class ArithematicLogicalAssignmentOperators
{
public static void main(String[] args)
{
	/*int num1=4;
	int num2=2;
	int add=num1+num2;
	System.out.println("The addition is:"+add);*/
	
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value a:");
int a=sc.nextInt();
System.out.println("Enter the value b:");
int b=sc.nextInt();

int add=a+b;
System.out.println("The Addition is:"+add);

int sub=a-b;
System.out.println("The Subtraction is:"+sub);

float mul=a*b;
System.out.println("The Multiplication is:"+mul);

int div=a/b;
System.out.println("The Division is:"+div);

int mod=a%b;
System.out.println("The Mod is:"+mod);

	}

}
/*OUTPT-Enter the value a:
	12
	Enter the value b:
	2
	The Addition is:14
	The Subtraction is:10
	The Multiplication is:24.0
	The Division is:6
	The Mod is:0*/


/*LOGICAL OPERATOR = (&& , || )*/

public class LogicalOperator 
{
public static void main(String[] args) 
{
		
	boolean a=true;
	boolean b=false;
	
	System.out.println("a && b ="+(a&&b));
    System.out.println("a || b ="+(a||b));
    System.out.println("!(a&&b)="+!(a||b));
}
}
	
/*OUTPUT-
*a && b =false
a || b =true
!(a&&b)=false*/


/*ASSIGNMENT OPERATOR=(+=,-=,*=,/=)*/

public class AssignmentOperator
{
public static void main(String[] args)
	{
		int a=10;
		int b=5;
		int c=0;
		
c=a+b;
System.out.println("c=a+b:"+c);

c+=b;//
System.out.println("c+=b:"+c);
	}	

}
/*OUTPUT=
 * c=a+b:15
 c+=b:20*/