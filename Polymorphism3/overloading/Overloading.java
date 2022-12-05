package com.Polymorphism3.overloading;

import java.util.Scanner;

public class Overloading {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter two integers values");
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		System.out.println(sum(num1,num2));
		
		System.out.println("Enter two float values");
		float number1=scanner.nextFloat();
		float number2=scanner.nextFloat();
		
		System.out.println(sum(number1,number2));
		

	}

	private static float sum(int num1, int num2) {
		// TODO Auto-generated method stub
		System.out.println("Accepting 2 integers and given sum is float");
		float num3=num1+num2;
		return num3;
	}
	private static int sum(float num1, float num2) {
		// TODO Auto-generated method stub
		System.out.println("Accepting two float numbers and given sum is in integer");
		int num3=(int)(num1+num2);
		return num3;
	}

}
