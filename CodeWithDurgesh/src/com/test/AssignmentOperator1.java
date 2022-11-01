package com.test;

/*ASSIGNMENT OPERATOR=(+=,-=,*=,/=)*/

public class AssignmentOperator1
{
public static void main(String[] args)
	{
		int a=10;
		int b=5;
		
b=a;//(5=10)=10
System.out.println("= output:"+b);

b+=a;//(10+=10)=20
System.out.println("+= output:"+b);

b-=a;//(20-=10)=10
System.out.println("-= output:"+b);

b*=a;//(10*=10)=100
System.out.println("*= output:"+b);

b/=a;//(100/=10)=10
System.out.println("/= output:"+b);

}
}
/*OUTPUT-
= output:10
+= output:20
-= output:10
*= output:100
/= output:10*/