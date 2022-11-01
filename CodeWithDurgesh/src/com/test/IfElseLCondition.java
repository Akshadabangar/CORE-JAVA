package com.test;

/*IfElseLCondition= IF CONDITION IS TRUE THEN IF BLOCK IS EXECUTED...
 * IF CONDIOTION IS FALSE THEN ELSE BLOCK EXECUTED..
 * SYNTAX= IF(EXPRESSION){
 * STSTEMENT}
 * ELSE{
 * STSTEMENT}
 */
import java.util.Scanner;
public class IfElseLCondition
{
public static void main(String[] args)
{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		
		if(a>0) {
			System.out.println("Number is positive");
		}
		else {
			System.out.println("Number is negative");
		}
	}

}
/*OUTPUT=
 * Enter the number:
12
Number is positive*/


