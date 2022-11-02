package com.test;
// Topic Switch= MENU DRIVEN PROGRAM
/*SYNTAX=  switch(expression){
 *         case 1:
 *            statement;
 *            break; //USED TO BREAK THE LOOP
 *         case 2:
 *             statement;
 *             break;
 *          default:
 *              statement;
 *              }   
 */
import java.util.Scanner;
public class SwitchExample
{
public static void main(String[] args) 
{
	/*int day=3;
	switch(day) {
	case 1:      //IN CHAR USED ONLY '' 
		System.out.println("Monday");
		break;
		
	case 2:
		System.out.println("Tuesday");
		break;
		
	case 3:
		System.out.println("Wednesday");
		break;
		
	case 4:
		System.out.println("Thursday");
		break;
		
	case 5:
		System.out.println("Friday");
		break;
		
	case 6:
		System.out.println("Saturday");
		break;
		
	case 7:
		System.out.println("Sunday");
		break;*/
	
/*OUTPUT=	Wednesday*/
	

System.out.println("1:Add");
System.out.println("2.Sub");
System.out.println("3.Mul");
System.out.println("4.Div");
System.out.println("5.Mod");

 Scanner sc=new Scanner(System.in);
 System.out.println("Enter Fist Number:");
 int a=sc.nextInt();
 
 System.out.println("Enter Second Number:");
 int b=sc.nextInt();
 
 int res=0;
 
 System.out.println("Enter ur Choice:");
 int choice=sc.nextInt();
 
 switch(choice)
 {
 case 1:
	 res=a+b;
	 System.out.println(res);
	 break;
 case 2:
	 res=a-b;
	 System.out.println(res);
	 break;
 case 3:
	 res=a*b;
	 System.out.println(res);
	 break;
	 
 case 4:
	 res=a/b;
	 System.out.println(res);
	 break;
	 
 case 5:
	 res=a%b;
	 System.out.println(res);
	 break;
	 
 }
}
}
/*OUTPUT =
 1:Add
2.Sub
3.Mul
4.Div
5.Mod
Enter Fist Number:
12
Enter Second Number:
23
Enter ur Choice:
1
35
 */


