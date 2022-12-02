package Assignment_2;

import java.util.Scanner;

//Q4. Rewrite the above program using switch-case

public class Q4 {

	public static void main(String[] args) {

		inputMonthNumber();
		
	}

	private static void inputMonthNumber() {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the month's number");
		
		int num1=scn.nextInt();
		
		switch(num1){
			case 1:
				System.out.println("Winter Season");
				break;
		
		case 2:
			System.out.println("Winter Season");
			break;
			
		case 3:
			System.out.println("Spring Season");
			break;	
			
		case 4:
			System.out.println("Spring Season");
			break;
			
		case 5:
			System.out.println("Spring Season");
			break;
			
		case 6:
			System.out.println("Summer Season");
			break;
			
		case 7:
			System.out.println("Summer Season");
			break;
			
		case 8:
			System.out.println("Summer Season");
			break;
			
		case 9:
			System.out.println("Autumn Season");
			break;
			
		case 10:
			System.out.println("Autumn Season");
			break;
			
		case 11:
			System.out.println("Autumn Season");
			break;
			
		case 12:
			System.out.println("Winter Season");
			break;
			
			default:
				System.out.println("Enter valid number between 1-12");
				break;
	}
	}

}
