package Assignment_2;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		inputMonthNumber();
	}

	private static void inputMonthNumber() {

		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the month number");
		int monNum=scn.nextInt();
		
		if(monNum==1 || monNum==2 || monNum==12 ){
			System.out.println("Winter Season");
		}
		else if(monNum==3 || monNum==4 || monNum==5){
			System.out.println("Spring season");
		}
		else if(monNum==6 || monNum==7 || monNum==8){
			System.out.println("Summer season");
		}
		else if(monNum==9 || monNum==10 || monNum==11){
			System.out.println("Autumn Season");
		}
		else{
			System.out.println("Please type number between 1-12");
			
		}
	}

}
