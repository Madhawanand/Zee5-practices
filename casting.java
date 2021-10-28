package com.zee5Practices;

public class casting {

	public static void main(String[] args) {
		int a=10;
		
		double d= a;//widening int-->double
		System.out.println("casted number is "+d);
		
		float f= a;
		System.out.println("casted content is"+d);//int to float
		
		long l= a;
		System.out.println("casted content is "+l);//int to long
		
		char b = 1;
		int c=b;
		System.out.println("casted content is "+c);//char to int
		
		
		//narrowing
		float e=10.3f;
		int k=(int) e;
		System.out.println("Casted content is "+k);//from float to int data loss occurs
		
		double m=10.12d;
		int o= (int)m;
		System.out.println("Casted content is "+k);//from double to int data loss occues
		
		
	}

}
