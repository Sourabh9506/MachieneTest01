package com.quiz.app;

import java.util.Formatter;
import java.util.HashMap;
import java.util.Scanner;

public class Quiz {
	

	static Formatter fmt=new Formatter();
	static Scanner scanner=new Scanner(System.in);
	static String userInput;
	static int correctstates=0;
	static String answers[]=new String[5];
	static String question[]=new String[5];
	static String capitals[][] = { { "AndhraPradesh", "Hyderabad" },
			{ "ArunachalPradesh", "Itanagar" }, { "Assam", "Dispur" },
			{ "Bihar", "Patna" }, { "Chhattisgarh", "Raipur" } };
	public static void main(String[] args) {

		
//		Quiz quiz=new Quiz();
		System.out.print("Enter your name");
		String name=scanner.nextLine();
	    System.out.println("starting your quiz...");

	    
	    getTestInput();
	   
		getResultOutput();
		
		
	
	}
	private static void getResultOutput() {
		 int j=1;
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
		System.out.println("                                                    name Quiz Report                                                         ");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(" QuestionNo "+"     Question                     "+"       correct answers           "+"          Your answer      "+"         Score");
//		System.out.println(String.format(
//				"%-20s %20s%45s%40s%20s"+QuestionNo+Question+correct);
		for(int i=0;i<5;i++){
			int score=0;
			if(capitals[i][1].equals(answers[i])){
				score=1;
			}else{
				score=0;
			}
//			System.out.println("   "+i+"   "+question[i]+"               "+ capitals[i][1] +"              "+answers[i]+"                    "+score);
			System.out.println(String.format(
				"%-20s%20s%50s%40s%20s",i,question[i],capitals[i][1],answers[i],score));
			j++;
			
		}
		System.out.println(fmt);
		System.out.println("------------------------------------------------------------------------------------------------------------------------------");
		
		
	}
	private static void getTestInput() {
		 int j=1;
			for(int i=0;i<5;i++){
				
				System.out.println("What is  the capitl of "+capitals[i][0]);
				question[i]="What is  the capitl of "+capitals[i][0];
				System.out.print("Enter answer for Q"+j);
				userInput=scanner.nextLine();
				answers[i]=userInput;
				if(userInput.equals(capitals[i][1])){
					correctstates++;
				}
				j++;
				
			}
		
	}
}



