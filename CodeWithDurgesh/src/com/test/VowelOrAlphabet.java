package com.test;
import java.util.Scanner;
public class VowelOrAlphabet {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the char:");
		char p=sc.next().charAt(0);

		
		if(p=='a'||p=='e'||p=='i'||p=='o'||p=='u')
		{
			System.out.println("Char is Vowel");
		}
	
		else{
			System.out.println("Char is Alphabet");
		}
	}
	}
/*OUTPUT=
 * Enter the char:
z
Char is Alphabet*/


