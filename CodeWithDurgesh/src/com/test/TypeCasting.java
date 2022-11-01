package com.test;

/*TYPECASTING= IT IS A CONVERT ONE DATATYPE TO ANOTHER DATATYPE...
IMPLICIT - AUTOMATICALLY BY JVM....FOR EG INT CONVERT DOUBLE(10 CONVERT 10.0)
EXPLICIT-FORCEFULLY BY PROGRAMMER...FOR EG DOUBLE CONVERT INT(10.0 CONVERT 10..IN THIS OUR LOSS THE DATA SO IT IS EXPLICIT TYPECASTING)
*/
public class TypeCasting {
	public static void main(String[] args) {
		
		/*int a = 10;  // IMPLICIT TYPECASTING
		 *  CONVERT INT TO DOUBLE
		double b = a;*/
		
		double c=80.11;//EXPLICIT TYPECASTING
		//CONVERT DOUBLE TO INT/LONG
		int d=(int)c;
		long f=(long)d;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(f);
	}

}
