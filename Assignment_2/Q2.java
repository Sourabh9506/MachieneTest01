package Assignment_2;

import java.util.Scanner;

//b. You are a Software developer in XYZ Company and you are asked to create 
//a program to verify a user’s PIN code when a user visits an ATM. 
//To implement this concept, you must use decisional statements to make
//appropriate decisions when a use’s PIN code matches with the pin code
//assigned to that user. For that, you have created a class named Verify, 
//in which a user has to enter some numeric value as the PIN code during
//runtime. Apart from that, you have initialized a variable y with some 
//numeric value and compare the value stored in the variable y with the value 
//accepted from a user.

public class Q2 {

	public static void main(String[] args) {
	inputPinHere();		
	}

	private static void inputPinHere() {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter your 4 digit ATM PIN");
		int pin=scn.nextInt();
		int y=9780;
		
		if(pin==y){
			System.out.println("PIN Matched");
		}else{
			System.out.println("Incorrect PIN");
		}
	
		}
		
		
		
	}


