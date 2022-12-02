package Assignment_2;

import java.util.Scanner;

public class Q13{

	public static void main(String[] args) {
	
		getInputFromUser();
	}
		//Step 1: getInputFromUser
		private static void getInputFromUser(){
			char inputYesNo='n';
			
			//MenuDriven
			do{
				Scanner input=new Scanner(System.in);
				System.out.println("Enter a month (1-12): ");
				int month=input.nextInt();
				
				System.out.println("Enter a year : ");
				int year=input.nextInt();
				
				//check condition
				getMonthName(month);
				
				String daysInMonth=getDaysInMonth(month);
				System.out.println(daysInMonth);
				
				boolean leapYear=findLeapYear(year);
				
			}while(inputYesNo=='Y' || inputYesNo=='y');
		}
		
		//Step 2: getMonthName
		private static void getMonthName(int month) {
			
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
		
		//Step 3: Find LeapYear
		private static boolean findLeapYear(int year) {
			boolean leap=false;
			if(year%4==0 && year %100==0 && year%400==0){
				leap=true;
				
			}else{
				leap=false;
			}
			return leap;
		}
		
		
		//Step 4: getDaysINMonth
		
		private static String getDaysInMonth(int month) {
			
			if(month%2==0){
				return "Month having 30 days";
			}
			else if(month==2){
				return "28 days";
			}
			else{
				return "31 days";
			}
		}
		
		//Step 5: Run App
		
	}


