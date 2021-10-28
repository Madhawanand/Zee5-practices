package com.zee5Practices;

import java.util.Scanner;

public class Cars {

	public static void main(String[] args) {
		String a= "TaTa";
		String b= "Suzuki";
		String c= "Hyundai";
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Choose your model");
		
		String str= sc.nextLine();
		
		switch (str)
		{
		case "a":System.out.println("You have selected TaTa");
			
			break;
		case "b":System.out.println("You have selected Suszuki");
		
		break;
		case "c":System.out.println("You have selected Hyundai");
		
		break;

		default:
			System.out.println("Enter valid option");
			break;
		}
		
	}

}
