package Assignment_2;

import java.util.Scanner;

//j. Create a small application that reads a month in number 
//and print it in words.

public class Q10 {

	public static void main(String[] args) {


		readMonthNumber();

	}

	private static void readMonthNumber() {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter month between 1-12");
		int month=scn.nextInt();
		switch(month){
		
		case 1:
			
			System.out.println("January");
			break;
		
		case 2:
			System.out.println("Februry");
			break;
		
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		
		default:
			System.out.println("Invalid input");
			break;
	}
	}
	

}
