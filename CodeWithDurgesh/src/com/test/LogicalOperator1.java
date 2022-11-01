package com.test;

/*LOGICAL OPERATOR = (&& , || )*/

public class LogicalOperator1 
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

