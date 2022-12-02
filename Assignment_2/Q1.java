package Assignment_2;

import java.util.Scanner;

//Q1. Consider an electricity billing calculation. There are two types of customers. Domestic and Industry. If it is domestic, the slabs are like this,
//The reading in the range,0-100 then amt=units* Rs.1
//
//100-200amt=units*1.5
//
//200-500amt=units*2
//
//>500amt = units*5
//
//If it is industrial, the amt =units*10.

public class Q1 {

	public static void main(String[] args) {
	
		System.out.print(inputUserReading());
	}

	private static int inputUserReading() {

		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the user type I for industrial or D for domestic");
		String userType=scn.nextLine();
		
		System.out.println("Enter the number of units");
		
		int units=scn.nextInt();
		
		if(userType=="I"){
			return units*10;
		}
		else{
			if(units>0 && units<100){
				return 1*units;
			}
			else if(units>=100 && units<200){
				return (int)1.5*units;
			}
			else if(units>=200 && units<500){
				return 5*units;
			}
		}
		return units;
	}

}
