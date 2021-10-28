package com.zee5Practices;

public class Primenum {

	public static void main(String[] args)
	{
		int i,j,count=0;

		//print prime no between 1 to 100
		System.out.println("prime number between 1 to 80");

		//loop for printing prime no between 1 to 80
		for(i=2;i<=80;i++)
		{
		for(j=1;j<=i;j++)
		{
		if(i%j==0)
		count++;
		}
		if(count==2)

		System.out.print(" "+i);
		count=0;
	}

}}
