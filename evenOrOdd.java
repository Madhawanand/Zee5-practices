package com.zee5Practices;

import java.util.Scanner;

public class evenOrOdd {

	public static void main(String[] args) 
	{
	Scanner sc= new Scanner(System.in);
	  System.out.println("Enter the number to check its Even or Odd");
	  int i=sc.nextInt();
	  if (i%2==0) 
	  {
		System.out.println("The entered num "+i+" is a even num");
	} else 
	{
		System.out.println("The entered num "+i+" is a odd num");
	}
	}

}
