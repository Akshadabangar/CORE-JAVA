package com.test;
/* Ternary operator= (? :)
variable = (condition) ? value of True : value of False ...
MEANS CONDIOIN JAR TRUE ASEL TAR True PRINT HONAR ANI CONDITION JAR FALSE ASEL TAR False PRONT HONAR...*/

public class TernaryOperator 
{

public static void main(String[] args) 
{
	int x = 20;  
	int y;
	y = (x == 1) ? 100: 200;  //FALSE (20==1)
	System.out.println("Value of y is: " +  y);  
	
	y = (x == 20) ? 100: 200;  //TRUE(20=20)
	System.out.println("Value of y is: " + y);  
}
}  

	/*OUTPUT=
	 * Value of y is: 200
Value of y is: 100*/

