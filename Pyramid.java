package com.zee5Practices;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the pyramid size num");
		int s=sc.nextInt();
		for (int i =s; i>=1; i--)
		{
			
			for (int j = 1; j <= i; j++) 
			{
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
