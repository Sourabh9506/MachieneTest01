package Assignment_2;

import java.util.Scanner;

//i. Accept a real constant value from user and typecast this value into 
//integer and print the result.

public class Q9 {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the real constant");
		float constant=scn.nextFloat();
		int integer=(int)constant;
		System.out.println(integer);
	}

}
